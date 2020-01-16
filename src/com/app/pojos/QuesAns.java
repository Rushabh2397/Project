package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class QuesAns {
	private Integer qId;
	private int questionNo;
	private int answer;
	
	
	public QuesAns() {
		// TODO Auto-generated constructor stub
	}


	
	public QuesAns(Integer qId, int questionNo, int answer) {
		super();
		this.qId = qId;
		this.questionNo = questionNo;
		this.answer = answer;
	}

	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getqId() {
		return qId;
	}



	public void setqId(Integer qId) {
		this.qId = qId;
	}
	

	public int getQuestionNo() {
		return questionNo;
	}


	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}


	public int getAnswer() {
		return answer;
	}


	public void setAnswer(int answer) {
		this.answer = answer;
	}


	

	
	

}
