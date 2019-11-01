public class StringManipulations {


    public static void main(String[] args){
        String a = "xyz";
        StringBuffer sb = new StringBuffer();
        StringBuilder sBuilder = new StringBuilder();

        sb.append(a);
        sBuilder.append(a);
        System.out.println(sb);
        System.out.println(sBuilder);
    }
}
