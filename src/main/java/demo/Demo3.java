package demo;

import com.google.zxing.WriterException;
import org.oriboy.qrcode.common.QRCodeUtils;

import java.io.IOException;

public class Demo3 {

    public static void main(String[] args) {
        String filePath = "/Users/pm/Downloads/temp/qrcodecore/img/demo3-2.png";
        String logoPath = "/Users/pm/Downloads/temp/qrcodecore/img/logo2.jpg";
        try {
            QRCodeUtils.createWithLogo("http://www.baidu.com", filePath, logoPath);
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
