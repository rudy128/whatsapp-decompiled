package X;

import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.6wm  reason: invalid class name and case insensitive filesystem */
public final class C138256wm {
    public int A00;
    public int A01;
    public boolean A02;
    public final C18100vl A03;

    public C138256wm(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 1);
        this.A03 = AnonymousClass1DF.A01(new C148807i2(r2));
    }

    public static final void A00(C138256wm r2, ThreadPoolExecutor threadPoolExecutor) {
        int i;
        if (r2.A02) {
            i = -128;
        } else {
            i = r2.A00;
        }
        if (threadPoolExecutor == null) {
            Voip.adjustAudioLevel(i);
        } else {
            threadPoolExecutor.execute(new C21354Aij(i, 0));
        }
    }
}
