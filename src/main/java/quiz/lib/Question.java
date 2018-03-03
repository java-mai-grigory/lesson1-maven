package quiz.lib;

import java.util.ArrayList;



public class Question {
	private String question = "Целочисленный тип?";
	
	private ArrayList<String> AnswerList = new ArrayList<String>();
	
	public Question()
	{
		AnswerList.add("float");
		AnswerList.add("String");
		AnswerList.add("int");
	}
	
	
	/**
	 * @return Колличество вариантов ответа
	 */
	public int getAnswerCount()
	{
		return AnswerList.size();
	}
	
	private int RightAnswer = 3;
	
	
	/**
	 * Спросить (вывод вопроса и вариантов ответа)
	 */
	public void ask()
	{
		System.out.println(question);
	
	/*	for(int i = 0; i < AnswerList.size(); i++)
			System.out.println(AnswerList.get(i));*/
		
    	for(String str: AnswerList)
		{
			System.out.println(str);
		}
	}

	
	/**
	 * @param index  Индекс правильного ответа
	 * @return  Признак правильного ответа
	 */
	public boolean answer(int index)
	{
		/*if (index == RightAnswer)
			return true;
		else
			return false;*/

		return (index == RightAnswer);
	}
}
