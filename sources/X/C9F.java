package X;

import android.os.Build;
import java.nio.ByteBuffer;

public abstract class C9F {
    /* JADX WARNING: type inference failed for: r4v2, types: [X.BSH, X.DBG] */
    public static final C26134Csx A00(CZI czi, C9G c9g) {
        C18070vi.A0d(czi, 0);
        int i = Build.VERSION.SDK_INT;
        BSH bsh = czi.A00;
        BSH bsh2 = bsh;
        if (bsh == null) {
            CTW ctw = czi.A07;
            ? dbg = new DBG(ctw.A00, ctw.A01, ctw.A05);
            czi.A00 = dbg;
            bsh2 = dbg;
        }
        int i2 = czi.A07.A02.A00;
        C29031bT r2 = new C29031bT(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer allocate = ByteBuffer.allocate(16384);
            C18070vi.A0X(allocate);
            r2.CEF(allocate);
        }
        if (i >= 26) {
            return new BSM(r2, bsh2, c9g);
        }
        return new C26134Csx(r2, bsh2);
    }
}
