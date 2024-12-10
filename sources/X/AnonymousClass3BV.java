package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.3BV  reason: invalid class name */
public class AnonymousClass3BV implements FilenameFilter {
    public final int A00;
    public final String A01;

    public AnonymousClass3BV(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public final boolean accept(File file, String str) {
        int i = this.A00;
        String str2 = this.A01;
        if (2 - i != 0) {
            return str.startsWith(str2);
        }
        return str.endsWith(str2);
    }
}
