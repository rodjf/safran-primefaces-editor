package com.sullygroup.editor;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "editorBean")
public class EditorBean {

	private String value = "";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
