import org.graalvm.polyglot.*;

public class Main {
    //  https://www.graalvm.org/docs/reference-manual/polyglot/
    public static void main(String[] args) {
        Context context = Context.newBuilder().allowIO(true).build();
        Value array = context.eval("js", "[1,2,42,4]");
        int result = array.getArrayElement(2).asInt(); // we extract the 3rd element from the js array
        System.out.println(result);
    }
}
