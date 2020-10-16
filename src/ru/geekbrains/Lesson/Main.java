package ru.geekbrains.Lesson;

public class Main {

    public static void main(String[] args) {
	Cat[] cat = new Cat[5];
	cat[0] = new Cat ("Barsic", 15);
	cat[1] = new Cat ("Murzic", 20);
	cat[2] = new Cat("Pushoc", 20);
	cat[3] = new Cat("Mashka", 10);
	cat[4] = new Cat("MurMur", 5);
	Plate plate = new Plate(60);

	plate.plateInfo();
	for (int i = 0; i < cat.length; i++) {
	    cat[i].eat(plate);
		if (!cat[i].full) {  //Если котику не хватает еды,
			do {
				plate.addFood();  //добавляем еду (вводим число в консоли),
				cat[i].eat(plate);  //просим его поесть еще раз.
			} while (!cat[i].full);  // Добавляем до тех пор, пока котик не будет сыт.

		}
    }
	plate.plateInfo();

    }
}
