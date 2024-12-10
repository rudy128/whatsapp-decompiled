package X;

import java.util.Arrays;

public abstract class CB9 {
    public static String A00(CQA cqa, String str) {
        StringBuilder A0t = BE6.A0t(32);
        A0t.append(str);
        A0t.append('{');
        CQA cqa2 = cqa.A00;
        String str2 = "";
        while (cqa2 != null) {
            Object obj = cqa2.A01;
            A0t.append(str2);
            String str3 = cqa2.A02;
            if (str3 != null) {
                BE8.A1E(A0t, str3);
            }
            if (obj == null || !obj.getClass().isArray()) {
                A0t.append(obj);
            } else {
                String deepToString = Arrays.deepToString(AnonymousClass000.A1b(obj, 1));
                A0t.append(deepToString, 1, deepToString.length() - 1);
            }
            cqa2 = cqa2.A00;
            str2 = ", ";
        }
        return C17890vO.A0b(A0t);
    }
}
