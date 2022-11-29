package com.hollyland.principle.inversion.improve;

public class DependencyPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangHong changHong = new ChangHong();
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.open(changHong);
		
		//ͨ��������������������
//		OpenAndClose openAndClose = new OpenAndClose(changHong);
//		openAndClose.open();
		//ͨ��setter����������������
		OpenAndClose openAndClose = new OpenAndClose();
		openAndClose.setTv(changHong);
		openAndClose.open();

	}

}

// 方式1：通过接口传递实现依赖
// 开关的几口
// interface IOpenAndClose {
// public void open(ITV tv); //���󷽷�,���սӿ�
// }
//
// interface ITV { //ITV接口
// public void play();
// }
// 
// class ChangHong implements ITV {
//
//	@Override
//	public void play() {
//		// TODO Auto-generated method stub
//		System.out.println("长虹电视机打开");
//	}
//	 
// }
//
// class OpenAndClose implements IOpenAndClose{
// public void open(ITV tv){
// tv.play();
// }
// }

// 方式2：通过构造方法依赖传递
// interface IOpenAndClose {
// public void open(); //���󷽷�
// }
// interface ITV { //ITV�ӿ�
// public void play();
// }
// class OpenAndClose implements IOpenAndClose{
// public ITV tv; //��Ա
// public OpenAndClose(ITV tv){ //������
// this.tv = tv;
// }
// public void open(){
// this.tv.play();
// }
// }


// 方式3：通过setter传递依赖
interface IOpenAndClose {
	public void open(); // ���󷽷�

	public void setTv(ITV tv);
}

interface ITV { // ITV�ӿ�
	public void play();
}

class OpenAndClose implements IOpenAndClose {
	private ITV tv;
	@Override
	public void setTv(ITV tv) {
		this.tv = tv;
	}
	@Override
	public void open() {
		this.tv.play();
	}
}

class ChangHong implements ITV {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("������ӻ�����");
	}
	 
}