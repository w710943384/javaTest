package day_09;

public class Computer {

    public void powerOn() {

        System.out.println("笔记本开机");
    }

    public void powerOff() {

        System.out.println("笔记本关机");
    }

    public void useDevice(USB usb){
        usb.open();
        //一定要先判断
        if (usb instanceof Mouse){

            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if (usb instanceof KeyBoard){

            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.type();
        }
        usb.close();
    }
}
