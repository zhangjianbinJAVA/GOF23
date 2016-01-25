package com.zhang.factory.abstact;

public interface CarFactory {
	Engine CreateEngine();
	Seat CreateSeat();
	Typre CreateTypre();
}
