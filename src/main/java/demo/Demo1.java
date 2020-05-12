package demo;

import com.google.zxing.WriterException;
import org.oriboy.qrcode.common.QRCodeUtils;

import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        /* 生成二维码图片 */
        String filePath = "/Users/pm/Downloads/temp/qrcodecore/img/demo1.png";
        try {
            QRCodeUtils.create("https://www.ant-loiter.com", filePath);
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
