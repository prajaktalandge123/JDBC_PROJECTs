package com.jsp.controller;

import com.jsp.dao.CarDao;

public class Controller {
public static void main(String[] args) {
	CarDao carDao=new CarDao();
	//carDao.saveCar();
	//int a=carDao.updateCar();
	//if (a>0) {
	//	System.out.println("data updated");
	//}
	//else {
	//	System.out.println("data not updated");
	//}
	
	//carDao.getAllcars();
	
	carDao.getByid();
}
}
