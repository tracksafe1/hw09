package inheritance;

public class CodebusterGroups extends Codebuster  {
    public static void main(String[] args) {
        CodebusterGroups t=new CodebusterGroups();
        t.groupname("Code");
        System.out.println(t.groupstudy("Ayan,Miten,Zarna,Sonal"));
        t.groupname("Restassured");
        System.out.println(t.groupstudy("kinarri,kulvinder,sumit"));
       t.groupname("code2");
        System.out.println(t.groupstudy("Hiten,Divya,jwalant"));
    }

    @Override
    public void groupname(String name) {
        System.out.println("groupname :"+name);

    }

    @Override
    public String groupstudy(String teammembers) {
        return super.groupstudy(teammembers);
    }
}

