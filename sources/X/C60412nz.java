package X;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.2nz  reason: invalid class name and case insensitive filesystem */
public abstract class C60412nz {
    public static String A01(String str, Date date) {
        StringBuilder A11 = AnonymousClass000.A11(str.substring(0, str.indexOf(46)));
        A11.append("-");
        return AnonymousClass000.A0y(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(date), A11);
    }

    public static String A00(File file, String str, Date date) {
        String A01 = A01(file.getName(), date);
        String name = file.getName();
        String A0A = C17900vP.A0A(name.substring(name.indexOf(46)), str);
        File[] listFiles = file.getParentFile().listFiles();
        File file2 = null;
        if (listFiles != null) {
            int i = 0;
            for (File file3 : listFiles) {
                String name2 = file3.getName();
                if (name2.startsWith(A01) && name2.endsWith(A0A)) {
                    int length = A01.length() + 1;
                    int length2 = name2.length();
                    int length3 = length2 - A0A.length();
                    if (length3 < length2 && length < length3) {
                        try {
                            int parseInt = Integer.parseInt(name2.substring(length, length3));
                            if (parseInt > i) {
                                file2 = file3;
                                i = parseInt;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        if (file2 != null) {
            return file2.getName();
        }
        return AnonymousClass001.A1H(".1", A0A, AnonymousClass000.A11(A01));
    }
}
