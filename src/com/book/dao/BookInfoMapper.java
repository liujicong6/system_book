package com.book.dao;

import org.apache.ibatis.annotations.Param;


import com.book.pojo.Category;

public interface BookInfoMapper {

	int  ins(@Param("bookName") String bookName,@Param("author") String  author,@Param("categoryId")
	
	Integer integer,@Param ("publisher") String publisher
			,@Param("price") Double price,
			@Param("photo") String photo);


	
	
}
