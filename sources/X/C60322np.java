package X;

import java.io.File;

/* renamed from: X.2np  reason: invalid class name and case insensitive filesystem */
public abstract class C60322np {
    public static final String A00(A8T a8t) {
        File[] listFiles = ((File) a8t.A0A.getValue()).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return "stagingAccountFolders null or empty";
        }
        C99014s7 r5 = new C99014s7(listFiles);
        String str = "";
        while (r5.hasNext()) {
            File file = (File) r5.next();
            StringBuilder A10 = AnonymousClass000.A10();
            String name = file.getName();
            C18070vi.A0X(name);
            A10.append(A01(name));
            String A0y = AnonymousClass000.A0y(" ->", A10);
            File[] listFiles2 = file.listFiles();
            if (listFiles2 == null || listFiles2.length == 0) {
                A0y = AnonymousClass000.A0y("stagingAccountFiles null or empty", AnonymousClass000.A11(A0y));
            } else {
                C99014s7 r3 = new C99014s7(listFiles2);
                while (r3.hasNext()) {
                    StringBuilder A11 = AnonymousClass000.A11(A0y);
                    A11.append(' ');
                    A0y = AnonymousClass000.A0y(((File) r3.next()).getName(), A11);
                }
            }
            StringBuilder A112 = AnonymousClass000.A11(str);
            A112.append(A0y);
            str = C17890vO.A0c(A112, 10);
        }
        return str;
    }

    public static final String A01(String str) {
        String A0B = AnonymousClass1EG.A0B(str, 8);
        if (A0B != null) {
            return A0B;
        }
        return str;
    }
}
