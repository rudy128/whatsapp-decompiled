package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.AiL  reason: case insensitive filesystem */
public class C21335AiL implements FilenameFilter {
    public final int A00;

    public C21335AiL(int i) {
        this.A00 = i;
    }

    public final boolean accept(File file, String str) {
        switch (this.A00) {
            case 0:
                C18070vi.A0d(str, 1);
                if (!AnonymousClass1YE.A0A(str, "os_stacktrace_", false) || !str.endsWith(".stacktrace")) {
                    return false;
                }
                return true;
            case 1:
                C18070vi.A0d(str, 1);
                return str.endsWith(".stacktrace");
            case 4:
                C18070vi.A0d(str, 1);
                C26551So r0 = C26551So.A05;
                if (AnonymousClass1YE.A0A(str, "HIST_SYNC", false)) {
                    return true;
                }
                return false;
            case 5:
                return AnonymousClass8BS.A0n(str).endsWith(".dmp");
            case 6:
                return AnonymousClass8BU.A1V(str, C197749xC.A01);
            default:
                C18070vi.A0d(str, 1);
                return AnonymousClass1YE.A0A(str, "msgstore", false);
        }
    }
}
