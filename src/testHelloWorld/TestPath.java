package testHelloWorld;

/**
 *
 * @版权 : Copyright (c) 2021-2121 鱼鱼工作室
 * @author: Geniuschen
 * @E-mail: 1021753237@qq.com
 * @版本: 1.0
 * @创建日期: 2021年7月18日 下午9:39:37
 * @ClassName TestPath
 * @类描述-Description:  TODO(这里用一句话描述这个方法的作用)
 * @修改记录:
 * @版本: 1.0
 */
public class TestPath {
	public static void main(String[] args) {
		new TestPath().testPath();
	}

	public void testPath() {
		System.out.println(this.getClass().getResource("").getPath());
		System.out.print(this.getClass().getResource("/").getPath());
	}
}
