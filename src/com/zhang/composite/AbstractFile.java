package com.zhang.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式 1.优点：统一处理
 * 
 * 抽象组件： 1.提取叶子和容器的共同部分
 * 
 * @author zhangjianbin
 * 
 */
public interface AbstractFile {
	// 杀毒
	void killVirus();
}


/**
 * 叶子组件
 * 		下面没有孩子了
 * @author zhangjianbin
 *
 */
class ImageFile implements AbstractFile {

	private String name;

	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.err.println("查杀图片文件,名子："+this.name);
	}

}

/**
 * 容器节点
 * 		下面还有孩子
 * @author zhangjianbin
 *
 */
class FolderFile implements AbstractFile {
	private String name;

	//定义容器，用于 存放孩子节点
	private List<AbstractFile> list = new ArrayList<AbstractFile>();
	
	public FolderFile(String name) {
		super();
		this.name = name;
	}

	//添加子节点
	public void add(AbstractFile file){
		this.list.add(file);
	}
	
	//移除子节点
	public void remove(AbstractFile file){
		this.list.remove(file);
	}
	
	//获取子节点
	public AbstractFile getChidFile(int index){
		return this.list.get(index);
	}
	
	
	@Override
	public void killVirus() {
		System.err.println("查杀文件夹,名子:"+this.name);
	
		//遍历子文件夹，杀毒
		for(AbstractFile file:list){
			file.killVirus();
		}
	}

}