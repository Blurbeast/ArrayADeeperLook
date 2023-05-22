import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Mbti {
     static String[][] personalityTest = new String[20][2];
    public static void main(String[] args) {
        personalityTest[0][0] ="A. expend energy, enjoy groups";
        personalityTest[0][1] ="B. Conserve energy, enjoy one-on-one";
        personalityTest[1][0] ="A. Interpret literally";
        personalityTest[1][1] ="B. look for meaning and possibilities";
        personalityTest[2][0] ="A. logical, thinking and questioning";
        personalityTest[2][1] ="B. Empathetic, feeling, accommodating";
        personalityTest[3][0] ="A. organized, oderly";
        personalityTest[3][1] ="B. flexible, adaptable";
        personalityTest[4][0] ="A. more outgoing, think out loud";
        personalityTest[4][1] ="B. more reserved, think to yourself";
        personalityTest[5][0] ="A. practical, realistic, experiential";
        personalityTest[5][1] ="B. imaginative, innovative, theoretical";
        personalityTest[6][0] ="A. candid, straight forward, frank";
        personalityTest[6][1] ="B. tactful, kind, encouraging";
        personalityTest[7][0] ="A. plan, schedule";
        personalityTest[7][1] ="B. unplanned, spontaneous";
        personalityTest[8][0] ="A. seek many tasks, public activities, interaction with others";
        personalityTest[8][1] ="B. seek private, solitary activities with quiet to concentrate";
        personalityTest[9][0] ="A. standard, usual, conventional";
        personalityTest[9][1] ="B. different, novel, unique";
        personalityTest[10][0] ="A. firm, tend to criticize, hold the line";
        personalityTest[10][1] ="B. gentle, tend to appreciate, conciliate";
        personalityTest[11][0] ="A. regulated, structured";
        personalityTest[11][1] ="B. easy-going, live and let live";
        personalityTest[12][0] ="A. external, communicative, express yourself";
        personalityTest[12][1] ="B. internal, reticent, keep to yourself";
        personalityTest[13][0] ="A. focus on here-and-now";
        personalityTest[13][1] ="B. look to the future, global perspective, big picture";
        personalityTest[14][0] ="A. tough-minded, just";
        personalityTest[14][1] ="B. tender-hearted, merciful";
        personalityTest[15][0] ="A. preparation, plan ahead";
        personalityTest[15][1] ="B. go with the flow, adapt as you go";
        personalityTest[16][0] ="A. active, initiate";
        personalityTest[16][1] ="B. reflective, deliberate";
        personalityTest[17][0] ="A. facts, things, what is";
        personalityTest[17][1] ="B. ideas, what could be, philosophical";
        personalityTest[18][0] ="A. matter of fact, issue oriented";
        personalityTest[18][1] ="B. sensitive, people oriented, compassionate";
        personalityTest[19][0] ="A. control, govern";
        personalityTest[19][1] ="B. latitude, freedom";

        List<String>extrovertedIntroverted = new ArrayList<>();
        List<String>sensingIntuitive = new ArrayList<>();
        List<String>thinkingFeeling = new ArrayList<>();
        List<String>judgingPerceptive = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);
        String[] userOption = new String[test.length];
        for (int index = 0; index < test.length; ) {
            System.out.println(Arrays.deepToString(test[index]));
            System.out.print("Choose either 'A', or 'a' or 'B' or 'b "+(index+1)+" : ");
            String userChoice = userInput.next();
            if (userChoice.equalsIgnoreCase("a") || userChoice.equalsIgnoreCase("b")) {
                userOption[index] = userChoice;
                if (index%4==0) extrovertedIntroverted.add(userChoice);
                if (index%4==1) sensingIntuitive.add(userChoice);
                if (index%4==2) thinkingFeeling.add(userChoice);
                if (index%4==3) judgingPerceptive.add(userChoice);
                index++;
            } else System.out.println("Expected A or B as response\nI know this is a mistake");
        }
        int aEI=0, bEI=0;
        for (String a: extrovertedIntroverted){if (a.equalsIgnoreCase("a")) aEI++;
        else bEI++;
        }
        int aSI=0,bSI=0;
        for (String si : sensingIntuitive){if (si.equalsIgnoreCase("a")) aSI++;
        else bEI++;
        }
        int aTF=0,bTF=0;
        for (String tf:thinkingFeeling){if (tf.equalsIgnoreCase("a"))aTF++;
        else bTF++;
        }
        int aJF=0,bJF=0;
        for (String jf:judgingPerceptive){if (jf.equalsIgnoreCase("a"))aJF++;
        else bJF++;
        }
    }
    public void setPersonalityTest(String[][] test){
    }
}
