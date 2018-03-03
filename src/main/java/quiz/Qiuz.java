package quiz;

import java.util.Scanner;    

import quiz.lib.Question;

public class Qiuz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);   //Инициализируем класс ввода данных
		Question q = new Question();  // Инициализируем класс вопрос
		q.ask();                      // Вызываем метод спросить
		int index = scan.nextInt();  //С клавиатуры считываем вариант ответа
		if (q.getAnswerCount() < index)  //Вариант ответа не входит в число допустимых    
		{
			System.out.println("Нет варианта");
		}
		else
		{
			if ( q.answer(index) == true)          //Правильный ответ
			{
				System.out.println("Правильно");
				System.out.println("Пoздравляем");
			}
			else
			{
				System.out.println("Ошибка");
			}
		}
		scan.close();         //Закрываем поток ввода
	}

}
