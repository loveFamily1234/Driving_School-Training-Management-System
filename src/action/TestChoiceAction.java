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

import entity.Choice;
import util.TestChoiceXmlParser;

public class TestChoiceAction extends ActionSupport {
	
	private int currPosition = 1;//当前做到第几题
	
	public int getCurrPosition() {
		return currPosition;
	}
	public void setCurrPosition(int currPosition) {
		this.currPosition = currPosition;
	}

	
	private List<Choice> list = new ArrayList<Choice>();
	//科目一单选题题库
	public String subject1SingleElection() {
		try {
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser sp = spf.newSAXParser();
			XMLReader xr = sp.getXMLReader();
			TestChoiceXmlParser tcxp = new TestChoiceXmlParser();
			xr.setContentHandler(tcxp);
			String mXMLFilePath = "H:\\eclipse(EE)编程代码\\驾校培训管理系统\\WebContent\\test\\subject1\\singleElection.xml";
			//String mXMLFilePath = "C:\\Program Files (x86)\\Apache Software Foundation\\Tomcat 8.0\\webapps\\driving_school\\test\\subject1\\singleElection.xml";
			FileInputStream fis = new FileInputStream(new File(mXMLFilePath));
			if (fis != null) {
				xr.parse(new InputSource(fis));
			}
			list = tcxp.getList();
			//ActionContext.getContext().getValueStack().set("list", list);
			ActionContext.getContext().getApplication().put("s1se", list);
			ActionContext.getContext().getApplication().put("currPosition", currPosition);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "s1se";
	}
	
	//科目四单选题题库
	public String subject4SingleElection() {
		try {
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser sp = spf.newSAXParser();
			XMLReader xr = sp.getXMLReader();
			TestChoiceXmlParser tcxp = new TestChoiceXmlParser();
			xr.setContentHandler(tcxp);
			String mXMLFilePath = "H:\\eclipse(EE)编程代码\\驾校培训管理系统\\WebContent\\test\\subject4\\singleElection.xml";
			//String mXMLFilePath = "C:\\Program Files (x86)\\Apache Software Foundation\\Tomcat 8.0\\webapps\\driving_school\\test\\subject4\\singleElection.xml";
			FileInputStream fis = new FileInputStream(new File(mXMLFilePath));
			if (fis != null) {
				xr.parse(new InputSource(fis));
			}
			list = tcxp.getList();
			//ActionContext.getContext().getValueStack().set("list", list);
			ActionContext.getContext().getApplication().put("s4se", list);
			ActionContext.getContext().getApplication().put("currPosition", currPosition);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "s4se";
	}
	
	//科目四多选题题库
	public String subject4MultipleChoice() {
		try {
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser sp = spf.newSAXParser();
			XMLReader xr = sp.getXMLReader();
			TestChoiceXmlParser tcxp = new TestChoiceXmlParser();
			xr.setContentHandler(tcxp);
			String mXMLFilePath = "H:\\eclipse(EE)编程代码\\驾校培训管理系统\\WebContent\\test\\subject4\\multipleChoice.xml";
			//String mXMLFilePath = "C:\\Program Files (x86)\\Apache Software Foundation\\Tomcat 8.0\\webapps\\driving_school\\test\\subject4\\multipleChoice.xml";
			FileInputStream fis = new FileInputStream(new File(mXMLFilePath));
			if (fis != null) {
				xr.parse(new InputSource(fis));
			}
			list = tcxp.getList();
			//ActionContext.getContext().getValueStack().set("list", list);
			ActionContext.getContext().getApplication().put("s4mc", list);
			ActionContext.getContext().getApplication().put("currPosition", currPosition);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "s4mc";
	}

}
