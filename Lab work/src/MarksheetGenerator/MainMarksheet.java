package MarksheetGenerator;

import java.util.Scanner;

class Student{
    String name;
    String ID;
    int Sem;
    String Programme;
    Student(String nm, String id, int sem, String prog){
        name = nm;
        ID = id;
        Sem = sem;
        Programme = prog;
    }
}
class Course{
    String Code;
    String Coursename;

    double CreditTh;
    double CreditPr;
    int GradepointTh;
    int GradepointPr;

    String GradeTh;
    String GradePr;

    Course(String code, String cournm, double th, double Pr,String grth, String grpr){
        Code = code;
        Coursename = cournm;
        CreditPr = Pr;
        CreditTh = th;
        GradeTh = grth;
        GradePr = grpr;
        GradepointTh = calcGradepoint(GradeTh);
        GradepointPr = calcGradepoint(GradePr);
    }
    int calcGradepoint(String gr){
        int Gradepoint;
        if(gr.equals("AA"))
            Gradepoint = 10;
        else if (gr.equals("AB")) {
            Gradepoint = 9;
        } else if (gr.equals("BB")) {
            Gradepoint = 8;
        }else if (gr.equals("BC")) {
            Gradepoint = 7;
        }else if (gr.equals("CC")) {
            Gradepoint = 6;
        }else if (gr.equals("CD")) {
            Gradepoint = 5;
        }else if (gr.equals("DD")) {
            Gradepoint = 4;
        }else
            Gradepoint = 0;
        return Gradepoint;
    }
    void putdetials(){
        System.out.print(Code+" ");
        System.out.print(Coursename+" ");
        if(CreditPr !=0) {
            System.out.print("\t\t\tPractical ");
            System.out.print(CreditPr + " ");
            System.out.print(GradePr + " ");
        }
        if(CreditTh!=0) {
            System.out.print("\t\t\tTheory ");
            System.out.print(CreditTh + " ");
            System.out.print(GradeTh + " ");
        }

        System.out.println("\n");
    }
}
public class MainMarksheet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student AJ = new Student("AAYUSH JANSARI", "21CE043", 2, "B. Tech CE");
        Course CE = new Course("CE144", "OOPC", 3.00, 2.00, "AA", "AA");
        Course EVS = new Course("CL144.02 A", "EVS", 0, 2.00, "", "AA");
        Course FS = new Course("FS102A", "FS", 0, 2.00, "", "AA");
        Course HS = new Course("HS202.02 A", "Phototgraphy", 0, 2.00, "", "AB");
        Course MA = new Course("MA144", "Engg Maths II", 4.00, 0, "BB", "");
        Course ME = new Course("ME145", "EOE", 3.00, 1.00, "AA", "AA");
        Course PY = new Course("PY143", "Engg Physics II", 0, 2.00, "", "AA");

        int[] Gradepints = {CE.GradepointPr, CE.GradepointTh, EVS.GradepointPr, FS.GradepointPr, HS.GradepointPr, MA.GradepointTh, ME.GradepointPr, ME.GradepointTh, PY.GradepointPr};
        double[] Credits = {CE.CreditPr, CE.CreditTh, EVS.CreditPr, FS.CreditPr, HS.CreditPr, MA.CreditTh, ME.CreditPr, ME.CreditTh, PY.CreditPr};

        double SGPA=0;
        double num=0;
        double denom=0;
        for(int i=0;i<9;i++){
            num += Gradepints[i]*Credits[i];
            denom += Credits[i];
        }
        SGPA = num/denom;
        System.out.println("NAME\t" + AJ.name);
        System.out.println("ID\t"+AJ.ID);
        System.out.println("Programmee\t" + AJ.Programme);
        System.out.println("Semester\t" + AJ.Sem);
        System.out.println("COURSE\t\t\t\t\tCredit\t\t\tGrade");
        CE.putdetials();
        EVS.putdetials();
        FS.putdetials();
        HS.putdetials();
        MA.putdetials();
        ME.putdetials();
        PY.putdetials();
        System.out.println("Total Credits\tCredits Earned\tSGPA");
        System.out.println("\t21\t\t\t\t" + denom +"\t\t"+ String.format("%.2f",SGPA));
    }
}


