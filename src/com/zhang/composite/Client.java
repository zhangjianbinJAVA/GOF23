package com.zhang.composite;

public class Client {

	public static void main(String[] args) {	
		AbstractFile f1,f2,f3;		
		FolderFile file = new FolderFile("我的文件夹");
		
		f1 = new ImageFile("图片.jpg");
		f2 = new ImageFile("hello.jpg");
		
		file.add(f1);
		file.add(f2);
			
		file.killVirus();		
	}
	
}
