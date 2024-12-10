package X;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/* renamed from: X.Akp  reason: case insensitive filesystem */
public final class C21484Akp implements Comparator {
    public final String A00;
    public final String A01;
    public final SimpleDateFormat A02;

    public C21484Akp(String str, SimpleDateFormat simpleDateFormat) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A02 = simpleDateFormat;
        String pattern = simpleDateFormat.toPattern();
        C18070vi.A0X(pattern);
        this.A00 = pattern;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        C18070vi.A0h(file, file2);
        Date A002 = A00(file);
        Date A003 = A00(file2);
        if (A002 != null) {
            if (A003 != null) {
                return A002.compareTo(A003);
            }
            return -1;
        } else if (A003 != null) {
            return 1;
        } else {
            return C18070vi.A01(file.lastModified(), file2.lastModified());
        }
    }

    private final Date A00(File file) {
        String name = file.getName();
        int length = this.A01.length();
        int length2 = length + this.A00.length();
        if (length2 > name.length()) {
            return null;
        }
        try {
            return this.A02.parse(C108955ca.A0q(length, length2, name));
        } catch (ParseException unused) {
            return null;
        }
    }
}
