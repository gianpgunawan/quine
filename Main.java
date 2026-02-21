import java.lang.*;

public class Main {
    static String src = "import java.lang.*;\n\npublic class Main {\n    static String src = \"?\";\n    public static void main(String args[]) {\n        for (int i = 0; i < src.length(); ++i) {\n            if ((int)src.charAt(i) == 63) {\n                for (int j = 0; j < src.length(); ++j) {\n                    if ((int)src.charAt(j) == 10) {\n                        System.out.print((char)92);\n                        System.out.print((char)110);\n                    } else if ((int)src.charAt(j) == 34) {\n                        System.out.print((char)92);\n                        System.out.print((char)34);\n                    }else {\n                        System.out.print(src.charAt(j));\n                    }\n                }\n            } else {\n                System.out.print(src.charAt(i));\n            }\n        }\n    }\n}\n";
    public static void main(String args[]) {
        for (int i = 0; i < src.length(); ++i) {
            if ((int)src.charAt(i) == 63) {
                for (int j = 0; j < src.length(); ++j) {
                    if ((int)src.charAt(j) == 10) {
                        System.out.print((char)92);
                        System.out.print((char)110);
                    } else if ((int)src.charAt(j) == 34) {
                        System.out.print((char)92);
                        System.out.print((char)34);
                    }else {
                        System.out.print(src.charAt(j));
                    }
                }
            } else {
                System.out.print(src.charAt(i));
            }
        }
    }
}
