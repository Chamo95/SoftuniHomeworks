package StackIterator3;

public class Main {
	public static void main(String[] args) {
		CommandDispatcher dispatcher=new CommandDispatcher();
		Core core=new Core(dispatcher);
		core.run();
	}
}
