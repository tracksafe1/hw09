package inheritance;

public class Codebuster {

    public void groupname(String name){
        System.out.println("Groupname : "+name);
    }

    public static void main(String[] args) {
        Codebuster t=new Codebuster();
        t.groupname("Agile");
        System.out.println(t.groupstudy("Team members are Shikha,Kinjal,Khushbu,Avani,Ripti,Nayan"));
    }
public String groupstudy(String teammembers){

        return teammembers ;
}}

