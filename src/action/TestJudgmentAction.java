package action;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Judgment;
import util.TestJudgmentXmlParser;

public class TestJudgmentAction extends ActionSupport {

	private int currPosition = 1;// 当前做到第几题

	public int getCurrPosition() {
		return currPosition;
	}

	public void setCurrPosition(int currPosition) {
		this.currPosition = currPosition;
	}

	private List<Judgment> list = new ArrayList<Judgment>();

	// 科目一判断题题库
	public String subject1Judgment() {
		try {
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser sp = spf.newSAXParser();
			XMLReader xr = sp.getXMLReader();
			TestJudgmentXmlParser tcxp = new TestJudgmentXmlParser();
			xr.setContentHandler(tcxp);
			String mXMLFilePath = "H:\\eclipse(EE)编程代码\\驾校培训管理系统\\WebContent\\test\\subject1\\judgment.xml";
			//String mXMLFilePath = "C:\\Program Files (x86)\\Apache Software Foundation\\Tomcat 8.0\\webapps\\driving_school\\test\\subject1\\judgment.xml";
			FileInputStream fis = new FileInputStream(new File(mXMLFilePath));
			if (fis != null) {
				xr.parse(new InputSource(fis));
			}
			list = tcxp.getList();
			// ActionContext.getContext().getValueStack().set("list", list);
			ActionContext.getContext().getApplication().put("s1j", list);
			ActionContext.getContext().getApplication().put("currPosition", currPosition);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "s1j";
	}

	// 科目四判断题题库
	public String subject4Judgment() {
		try {
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser sp = spf.newSAXParser();
			XMLReader xr = sp.getXMLReader();
			TestJudgmentXmlParser tcxp = new TestJudgmentXmlParser();
			xr.setContentHandler(tcxp);
			String mXMLFilePath = "H:\\eclipse(EE)编程代码\\驾校培训管理系统\\WebContent\\test\\subject4\\judgment.xml";
			//String mXMLFilePath = "C:\\Program Files (x86)\\Apache Software Foundation\\Tomcat 8.0\\webapps\\driving_school\\test\\subject4\\judgment.xml";
			FileInputStream fis = new FileInputStream(new File(mXMLFilePath));
			if (fis != null) {
				xr.parse(new InputSource(fis));
			}
			list = tcxp.getList();
			// ActionContext.getContext().getValueStack().set("list", list);
			ActionContext.getContext().getApplication().put("s4j", list);
			ActionContext.getContext().getApplication().put("currPosition", currPosition);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "s4j";
	}

}
