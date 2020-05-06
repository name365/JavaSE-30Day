package githubjava8;
/*
 * 练习：接口冲突的解决方式
 */
interface Filial {// 孝顺的
	default void help() {
		System.out.println("老妈，我来救你了");
	}
}

interface Spoony {// 痴情的
	default void help() {
		System.out.println("媳妇，别怕，我来了");
	}
}

class Father{
	public void help(){
		System.out.println("儿子，救我媳妇！");
	}
}

class Man extends Father implements Filial, Spoony {

	@Override
	public void help() {
		System.out.println("我该就谁呢？");
		Filial.super.help();
		Spoony.super.help();
	}
	
}
