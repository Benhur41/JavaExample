package com.yedam.homework;

public class PortableNoteBook implements Notebook, Tablet {
	int mode;
	String fileProgram;
	String internetBrowser;
	String videoKind;
	String appKind;
	
	public PortableNoteBook(String fileProgram, String internetBrowser, String videoKind, String appKind ) {
		this.fileProgram = fileProgram;
		this.internetBrowser = internetBrowser;
		this.videoKind = videoKind;
		this.appKind = appKind;
		this.mode =1;
		if(this.mode == NOTEBOOK_MODE) {
			System.out.println("NOTEBOOK_MODE");
		}
	}
	@Override
	public void watchVideo() {
		System.out.println(videoKind + " 를 시청");
	}

	@Override
	public void useApp() {
		if(this.mode == NOTEBOOK_MODE) {
			changeMode();
			System.out.println(appKind + " 를 실행.");
		}else {
			System.out.println(appKind +" 를 실행.");
		}
	}

	@Override
	public void writeDocumentaion() {
		System.out.println(fileProgram + "을 통해 문서를 작성");
	}

	@Override
	public void searchInternet() {
		System.out.println(internetBrowser + "를 통해 인터넷을 검색");
	}
	
	public void changeMode() {
		String str = null;
		if (mode == NOTEBOOK_MODE) {
			mode = TABLET_MODE;
			str = "TABLET MODE";
		}else {
			mode = NOTEBOOK_MODE;
			str = "NOTEBOOK MODE";
		}
		System.out.println("현재 모드는 " + str + " 입니다.");
	}

}
