package com.yc.biz.impl;

import com.yc.biz.StudentBiz;

public class StudentBizRedisImpl implements StudentBiz {

	public void addStudent() {
		System.out.println("这是redis的addstudent");
	}

	public void findStudent() {
		System.out.println("这是redis的findstudent");
	}

}
