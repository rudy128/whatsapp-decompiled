package X;

import android.os.StrictMode;
import java.util.List;
import java.util.UUID;

public class A4D {
    public static final List A05 = AnonymousClass8BR.A15("test_lint", C17880vN.A1Y(), 0);
    public String A00;
    public String A01;
    public boolean A02;
    public final String A03;
    public final String A04;

    public A4D(C191249mG r2) {
        String str = r2.A01;
        C26159CtX.A01(str);
        this.A01 = str;
        String str2 = r2.A00;
        C26159CtX.A01(str2);
        this.A00 = str2;
        this.A02 = r2.A04;
        this.A03 = r2.A02;
        this.A04 = r2.A03;
    }

    /* JADX INFO: finally extract failed */
    public static String A00() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID randomUUID = UUID.randomUUID();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return randomUUID.toString();
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
