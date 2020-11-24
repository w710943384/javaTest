package day_09;

public class DemoMain {

    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.powerOn();

        //使用一个鼠标
        Mouse mouse = new Mouse();
        //首先进行向上转型
        USB usbMouse = mouse;//多态写法
        computer.useDevice(usbMouse);

        //使用一个键盘
        KeyBoard keyBoard = new KeyBoard();
        computer.useDevice(keyBoard);

        computer.powerOff();
    }
}
