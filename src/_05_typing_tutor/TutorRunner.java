package _05_typing_tutor;

import java.util.Random;

public class TutorRunner {
public static void main(String[] args) {
	TypingTutor t = new TypingTutor();
	t.setup();
}


public static char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}

}
