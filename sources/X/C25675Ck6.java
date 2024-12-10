package X;

import android.content.Context;
import android.opengl.EGL14;
import android.os.Looper;
import java.util.Map;

/* renamed from: X.Ck6  reason: case insensitive filesystem */
public class C25675Ck6 {
    public static final Object A05 = C17880vN.A0p();
    public C26140Ct3 A00;
    public final C25517ChF A01;
    public final Context A02;
    public final CJN A03;
    public final C9Y A04;

    public C26045Cr9 A00(Looper looper) {
        Context context = this.A02;
        C25517ChF chF = this.A01;
        C9Y c9y = this.A04;
        CJN cjn = this.A03;
        C9S c9s = C25517ChF.A0B;
        Map map = chF.A00;
        C26140Ct3 ct3 = (C26140Ct3) map.get(c9s);
        if (ct3 == null) {
            if (!AnonymousClass000.A1Y(C26159CtX.A00(C25517ChF.A04, map))) {
                ct3 = null;
            } else {
                if (this.A00 == null) {
                    C26140Ct3 A012 = C26076Crq.A01(BE8.A0e(C25517ChF.A02, A05, map), AnonymousClass000.A0M(C26159CtX.A00(C25517ChF.A07, map)));
                    this.A00 = A012;
                    A012.A04(EGL14.EGL_NO_CONTEXT, 1);
                }
                ct3 = this.A00;
            }
        }
        return new C26045Cr9(context, looper, cjn, ct3, chF, c9y);
    }

    public C25675Ck6(Context context, CJN cjn, C25517ChF chF, C9Y c9y) {
        this.A02 = context.getApplicationContext();
        this.A01 = chF;
        this.A03 = cjn;
        this.A04 = c9y;
    }
}
