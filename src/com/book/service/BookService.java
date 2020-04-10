package com.book.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.book.dao.BookInfoMapper;
import com.book.dao.CategoryMapper;
import com.book.pojo.Category;
import com.book.tools.MyBatisUtil;
import com.book.pojo.BookInfo;

public class BookService {
	/**
	 * 添加新的分类
	 * @param category
	 * @return 1-成功 0-失败
	 */
	public int addNewCategory(String category) {
		// 保存返回结果
		int result = 0;
		// 去除两端空格
		String name = category.trim();
		SqlSession sqlSession = MyBatisUtil.open();
		// 查询此分类是否存在
		Category res = sqlSession.getMapper(CategoryMapper.class).findCategoryByName(name);
		// 不存在此分类
		if(res == null) {
			// 添加分类到数据库
			result = sqlSession.getMapper(CategoryMapper.class).addNewCategory(name);
		}
		// 提交事务（增删改）
		sqlSession.commit();
		MyBatisUtil.close(sqlSession);
		// 返回结果
		return result;
	}
	/**
	 * 获取所有的分类信息
	 * @return
	 */
	public List<Category> listCategories(){
		SqlSession sqlSession = MyBatisUtil.open();
		List<Category> categories = sqlSession
				.getMapper(CategoryMapper.class).listCategories();
		MyBatisUtil.close(sqlSession);
		return categories;
	}
	
	public int deleteCategoryById(Integer id) {
		int re=0;
		
		SqlSession session=MyBatisUtil.open();
		
		re=session.getMapper(CategoryMapper.class).del(id);
		session.commit();
		MyBatisUtil.close(session);
		return re;
	}
	
	
	public int addBookInfo(BookInfo book) {
	int result=0;
		SqlSession session=MyBatisUtil.open();
try {
	

		result=session.getMapper(BookInfoMapper.class).
				ins(book.getBookName(),book.getAuthor(), book.getCategory().getId(),
						book.getPublisher(), book.getPrice(), book.getBphoto());
				
				session.commit();
		MyBatisUtil.close(session);
		return result;
} catch (Exception e) {
	// TODO: handle exception
}
return result;
		
	}
}






















