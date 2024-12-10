package X;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6y6  reason: invalid class name and case insensitive filesystem */
public final class C139036y6 {
    public static final long A03 = TimeUnit.DAYS.toMillis(5);
    public final Context A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass11P A02;

    public final File[] A00() {
        File[] listFiles;
        File A0e = C17880vN.A0e(this.A00.getCacheDir(), "wds_metrics2");
        if (!A0e.exists() || (listFiles = A0e.listFiles(new AnonymousClass3BU(2))) == null) {
            return new File[0];
        }
        return listFiles;
    }

    public C139036y6(Context context, AnonymousClass11P r2, AnonymousClass00H r3) {
        C18070vi.A0k(r3, r2);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r2;
    }
}
