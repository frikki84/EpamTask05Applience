package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.source;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//источник информации - текстовый файл
public class TextFileInfoSource extends InfoSourse {

	private String fileName;

	public TextFileInfoSource() {
		super();
	}

	public TextFileInfoSource(String fileName) {
		super();
		this.fileName = fileName;
		setInfoContaiter(this.giveInfo(fileName));

	}

	public TextFileInfoSource(String fileName, List<String> infoContaiter) {
		super();
		this.fileName = fileName;
		setInfoContaiter(infoContaiter);
	}

	@Override
	public List<String> giveInfo(String string) {

		ArrayList<String> resultList = new ArrayList<>();

		BufferedReader fileReader = null;

		try {
			fileReader = new BufferedReader(new FileReader(string));

			while (fileReader.ready()) {
				String point = fileReader.readLine();
				resultList.add(point);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultList;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "TextFileInfoSource [fileName=" + fileName + "]";
	}

}
