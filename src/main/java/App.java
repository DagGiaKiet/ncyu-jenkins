public class App {
    public static void main(String[] args){
        GradeConverter converter = new GraeConverter();
        for(int i=0; i< 105; i++){
            System.out.println(i+";"+converter.convert(i));
        }
    }
}
