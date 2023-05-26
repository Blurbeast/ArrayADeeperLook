import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Mbti1 {
    public static void askQuestion(String [][]array){
        Scanner user = new Scanner(System.in);
        ArrayList<String> extrovertedIntroverted = new ArrayList<>();
        ArrayList<String> sensingIntuitive= new ArrayList<>();
        ArrayList<String> thinkingFeeling= new ArrayList<>();
        ArrayList<String> judgingPerceptive=new ArrayList<>();
        for (int index = 0; index < array.length;) {
            System.out.println(Arrays.deepToString(array));
            System.out.print("Enter an option: ");
            String userOption=user.next();
            if (userOption.equalsIgnoreCase("a")||userOption.equalsIgnoreCase("b")){
                checkingForEI(extrovertedIntroverted, index, userOption);
                checkingForSI(sensingIntuitive, index, userOption);
                checkingForTF(thinkingFeeling, index, userOption);
                checkingForJP(judgingPerceptive, index, userOption);
                index++;
            }
            else {
                System.out.println("Expected 'A' or 'B'\nI know this is a mistake.");
            }
        }
        int aEI=0, bEI=0;
        eiAOrB(extrovertedIntroverted, aEI, bEI);
        int aSI=0, bSI=0;
        siAOrB(sensingIntuitive, aSI, bSI);
        int aTF=0, bTF=0;
        tfAOrB(thinkingFeeling, aTF, bTF);
        int aJP=0, bJP=0;
        JpAORB(judgingPerceptive, aJP, bJP);
        String personality="";
        checkIfExtrovertOrIntrovert(aEI, bEI, personality);
        checkIfSensingOrIntuitive(aSI, bSI, personality);
        checkIfThinkingOrFeeling(aTF, bTF, personality);
        checkIfJudgingOrPerceptive(aJP, bJP, personality);
        personalityTestResult(personality);

    }

    private static void personalityTestResult(String personality) {
        switch (personality){
            case "ISTJ":
                System.out.println(" (Introverted - Sensing - Thinking - Judging):" +
                        " Responsible, organized, and practical individuals who value stability and tradition.");
                break;
            case "ISFJ":
                System.out.println("(Introverted - Sensing - Feeling - Judging): Caring, loyal," +
                        " and detail-oriented individuals who are committed to supporting and nurturing others.");
                break;
            case "INFJ":
                System.out.println("((Introverted - Intuition - Feeling - Judging): Insightful, empathetic," +
                        " and idealistic individuals who are driven by their values and have a deep understanding of others.");
                break;
            case "INTJ":
                System.out.println("(Introverted - Intuition - Thinking - Judging): Strategic, independent," +
                        " and analytical individuals who excel in long-term planning and problem-solving.");
                break;
            case "ISTP":
                System.out.println("(Introverted - Sensing - Thinking - Perceiving): Adaptable, practical, and action-oriented" +
                        " individuals who thrive in hands-on problem-solving and enjoy exploring how things work.");
                break;
            case "ISFP":
                System.out.println("(Introverted - Sensing - Feeling - Perceiving): Gentle, artistic, and" +
                        " compassionate individuals who appreciate beauty and seek harmony in their surroundings.");
                break;
            case "INFP":
                System.out.println("(Introverted - Intuition - Feeling - Perceiving): Creative, empathetic, and authentic individuals who" +
                        " are driven by their values and have a strong desire to make a positive impact on the world.");
                break;
        }
    }

    private static void checkIfJudgingOrPerceptive(int aJP, int bJP, String personality) {
        if (aJP > bJP) personality +="J";
        else personality +="P";
    }

    private static void checkIfThinkingOrFeeling(int aTF, int bTF, String personality) {
        if (aTF > bTF) personality +="T";
        else personality +="F";
    }

    private static void checkIfSensingOrIntuitive(int aSI, int bSI, String personality) {
        if (aSI > bSI) personality +="S";
        else personality +="I";
    }

    private static void checkIfExtrovertOrIntrovert(int aEI, int bEI, String personality) {
        if (aEI > bEI) personality +="E";
        else personality +="I";
    }

    private static void eiAOrB(ArrayList<String> extrovertedIntroverted, int aEI, int bEI) {
        for (String ei: extrovertedIntroverted){
            if (ei.contains("a")) aEI++;
            else bEI++;
        }
    }
    private static void siAOrB(ArrayList<String> sensingIntuitive, int aSI, int bSI) {
        for (String si: sensingIntuitive){
            if (si.contains("b")) aSI++;
            else bSI++;
        }
    }
    private static void tfAOrB(ArrayList<String> thinkingFeeling, int aTI, int bTI) {
        for (String ti: thinkingFeeling){
            if (ti.contains("a")) aTI++;
            else bTI++;
        }
    }
    private static void JpAORB(ArrayList<String> judgingPerceptive, int aJP, int bJP) {
        for (String jp: judgingPerceptive){
            if (jp.contains("a")) aJP++;
            else bJP++;
        }
    }
    private static void checkingForJP(ArrayList<String> judgingPerceptive, int index, String userOption) {
        if (index %4==3) judgingPerceptive.add(userOption);
    }
    private static void checkingForTF(ArrayList<String> thinkingFeeling, int index, String userOption) {
        if (index %4==2) thinkingFeeling.add(userOption);
    }
    private static void checkingForSI(ArrayList<String> sensingIntuitive, int index, String userOption) {
        if (index %4==1) sensingIntuitive.add(userOption);
    }
    private static void checkingForEI(ArrayList<String> extrovertedIntroverted, int index, String userOption) {
        if (index %4==0) extrovertedIntroverted.add(userOption);
    }
}
