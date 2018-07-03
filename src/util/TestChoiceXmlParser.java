package util;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import entity.Choice;

public class TestChoiceXmlParser extends DefaultHandler {
	private Stack stack;
	private boolean isStackReadyForTest;
	private List<Choice> list;

	public TestChoiceXmlParser() {
		stack = new Stack();
		list = new ArrayList<Choice>();
		isStackReadyForTest = false;
	}

	public Stack getStack() {
		return stack;
	}

	public void setStack(Stack stack) {
		this.stack = stack;
	}

	public boolean isStackReadyForTest() {
		return isStackReadyForTest;
	}

	public void setStackReadyForTest(boolean isStackReadyForTest) {
		this.isStackReadyForTest = isStackReadyForTest;
	}

	public List<Choice> getList() {
		return list;
	}

	public void setList(List<Choice> list) {
		this.list = list;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		isStackReadyForTest = false;
		if (qName.equals("document")) {
			stack.push(list);
		} else if (qName.equals("problem")) {
			stack.push(new Choice());
		} else if (qName.equals("title") || qName.equals("img") || qName.equals("A") || qName.equals("B")
				|| qName.equals("C") || qName.equals("D") || qName.equals("answer") || qName.equals("explanation")) {
			stack.push(new StringBuffer());
			isStackReadyForTest = true;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		isStackReadyForTest = false;
		Object temp = stack.pop();
		if (qName.equals("document")) {
			list = (List) temp;
		} else if (qName.equals("problem")) {
			((List) stack.peek()).add((Choice) temp);
		} else if (qName.equals("title")) {
			((Choice) stack.peek()).setTitle(temp.toString());
		} else if (qName.equals("img")) {
			((Choice) stack.peek()).setImg(temp.toString());
		} else if (qName.equals("A")) {
			((Choice) stack.peek()).setA(temp.toString());
		} else if (qName.equals("B")) {
			((Choice) stack.peek()).setB(temp.toString());
		} else if (qName.equals("C")) {
			((Choice) stack.peek()).setC(temp.toString());
		} else if (qName.equals("D")) {
			((Choice) stack.peek()).setD(temp.toString());
		} else if (qName.equals("answer")) {
			((Choice) stack.peek()).setAnswer(temp.toString());
		} else if (qName.equals("explanation")) {
			((Choice) stack.peek()).setExplanation(temp.toString());
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (isStackReadyForTest == true) {
			((StringBuffer) stack.peek()).append(ch, start, length);
		} else {

		}
	}

//	public static void main(String[] args) {
//		try {
//			SAXParserFactory spf = SAXParserFactory.newInstance();
//			SAXParser sp = spf.newSAXParser();
//			XMLReader xr = sp.getXMLReader();
//			TestChoiceXmlParser tcxp = new TestChoiceXmlParser();
//			xr.setContentHandler(tcxp);
//			String mXMLFilePath = "H:\\eclipse(EE)编程代码\\驾校培训管理系统\\WebContent\\test\\subject1\\singleElection.xml";//
//			FileInputStream fis = new FileInputStream(new File(mXMLFilePath));
//			if (fis != null) {
//				xr.parse(new InputSource(fis));
//			}
//			List<Choice> list = tcxp.getList();
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).getImg());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

}
