package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class freemark {
	public static void main(String[] args) throws IOException, TemplateException  {
		//1.创建一个配置对象
		Configuration configuration = new Configuration(Configuration.getVersion());
		//2.设置模板所在目录
		configuration.setDirectoryForTemplateLoading(new File("G:\\project\\Freemark\\src\\test"));;
		//3.设置字符集
		configuration.setDefaultEncoding("utf-8");
		//4.获取模板对象
		Template template = configuration.getTemplate("test.ftl");
		//5.创建数据类型（可以是对象，也可以是Map）
		Map map = new HashMap();
		map.put("name", "韦宇杰");
		map.put("project", "蝉知");
		//6.创建一个输出流对象
		Writer out = new FileWriter("G:\\project\\Freemark\\test.html");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^html文件创建成功 !");
		//7.输出
		template.process(map, out);
		//8.关闭
		out.close();
	}
}
