package d_lambdaswithreturnedtype;

import java.util.Arrays;

interface StringToReturn {
    String letsReturnString();
}

interface StringToReturnWithParam {
    String letsReturnString(String param);
}


class ReturnSmth {
    String justReturnSmth(StringToReturnWithParam stringToReturn) {
        return stringToReturn.letsReturnString("world");
    }
}


public class Test {
    public static void main(String[] args) {

        String s1 = new ReturnSmth().justReturnSmth((s) -> "hello " + s);
    }
}
