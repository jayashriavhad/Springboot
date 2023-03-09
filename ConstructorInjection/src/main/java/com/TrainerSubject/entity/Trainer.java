package com.TrainerSubject.entity;

public class Trainer {
	private static Subject subject;
    //create a constructor using field
	public Trainer(Subject subject) {
		super();
		this.subject = subject;
	}
	//creating a static teach method
	public static void teach ()
	{
		System.out.println("Trainer is teaching "+ subject.getSubjectName());
	}
	

}
