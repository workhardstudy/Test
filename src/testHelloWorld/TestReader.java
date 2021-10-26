package testHelloWorld;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @版权 : Copyright (c) 2021-2121 鱼鱼工作室
 * @author: Geniuschen
 * @E-mail: 1021753237@qq.com
 * @版本: 1.0
 * @创建日期: 2021年7月18日 下午7:44:05
 * @ClassName TestReader
 * @类描述-Description:  TODO(这里用一句话描述这个方法的作用)
 * @修改记录:
 * @版本: 1.0
 */
public class TestReader {
	public static void main(String[] args) throws IOException {
		// FileInputStream in = new
		// FileInputStream("C:\\Users\\BAS\\Desktop\\test.txt");
		FileInputStream in = new FileInputStream("C:/Users/BAS/Desktop/test.txt");
		InputStreamReader reader = new InputStreamReader(in, "UTF-8");
		StringBuffer cache = new StringBuffer();
		while (reader.ready()) {
			cache.append((char) reader.read());
		}
		System.out.println(cache.toString());
		reader.close();
		in.close();
	}
}
