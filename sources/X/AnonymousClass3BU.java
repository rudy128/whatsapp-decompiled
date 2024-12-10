package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.3BU  reason: invalid class name */
public class AnonymousClass3BU implements FilenameFilter {
    public final int A00;

    public AnonymousClass3BU(int i) {
        this.A00 = i;
    }

    public final boolean accept(File file, String str) {
        String str2;
        int i;
        switch (this.A00) {
            case 0:
                return str.endsWith(".pack");
            case 1:
                C18070vi.A0b(str);
                str2 = ".json";
                i = 0;
                break;
            default:
                str2 = ".json";
                i = 2;
                break;
        }
        C18070vi.A0d(str, i);
        return str.endsWith(str2);
    }
}
