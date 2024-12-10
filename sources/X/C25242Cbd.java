package X;

import android.content.Context;
import android.media.MediaFormat;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cbd  reason: case insensitive filesystem */
public class C25242Cbd {
    public CAP A00;
    public Map A01 = C17880vN.A11();
    public Map A02 = C17880vN.A11();
    public boolean A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final Context A07;
    public final MediaFormat A08;
    public final C25092CXd A09;
    public final E7q A0A;
    public final C25820CmX A0B;
    public final E54 A0C;
    public final C28609EAd A0D;
    public final C28564E7r A0E;
    public final CUT A0F;
    public final E7t A0G;
    public final EAT A0H;
    public final List A0I = AnonymousClass000.A13();
    public final C25325CdW A0J;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Cjg, java.lang.Object] */
    public synchronized void A00() {
        ? obj = new Object();
        int i = 0;
        while (true) {
            C26159CtX.A01(this.A00);
            if (i < 1) {
                BVu.A00(obj, (EAX) AnonymousClass000.A0w(this.A01, i), 0);
                BVu.A00(obj, (DHA) AnonymousClass000.A0w(this.A02, i), 1);
                i = 1;
            } else {
                this.A02.clear();
                this.A01.clear();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Cjg, java.lang.Object] */
    public synchronized void A01() {
        ? obj = new Object();
        int i = 0;
        while (true) {
            C26159CtX.A01(this.A00);
            if (i >= 1) {
                break;
            }
            DHA dha = (DHA) AnonymousClass000.A0w(this.A02, i);
            if (dha != null && dha.A05) {
                this.A0B.A0V = true;
                BVu.A00(obj, dha, 8);
            }
            C25635CjM.A01(obj, (EAX) AnonymousClass000.A0w(this.A01, i), 2);
            i = 1;
        }
        this.A02.clear();
        this.A01.clear();
        Throwable th = obj.A01;
        if (th != null) {
            throw th;
        }
    }

    public void A02(long j) {
        Map map = this.A01;
        Integer A0f = AnonymousClass3MY.A0f();
        if (map.get(A0f) != null) {
            ((EAX) map.get(A0f)).CFD(j);
            C26159CtX.A01(this.A00);
            int i = 0;
            while (true) {
                CAP cap = this.A00;
                if (i < 1) {
                    C26159CtX.A01(cap);
                    Object A0w = AnonymousClass000.A0w(map, i);
                    C26159CtX.A01(A0w);
                    ((EAX) A0w).BJ1(j);
                    i = 1;
                } else {
                    return;
                }
            }
        }
    }

    public C25242Cbd(Context context, MediaFormat mediaFormat, C25325CdW cdW, C25092CXd cXd, E7q e7q, C25820CmX cmX, E54 e54, C28609EAd eAd, C28564E7r e7r, CUT cut, E7t e7t, EAT eat, int i, long j, long j2) {
        this.A0C = e54;
        this.A0E = e7r;
        this.A0F = cut;
        this.A0B = cmX;
        this.A0A = e7q;
        this.A07 = context;
        this.A04 = i;
        this.A08 = mediaFormat;
        this.A0H = eat;
        this.A0D = eAd;
        this.A0J = cdW;
        this.A0G = e7t;
        this.A06 = j;
        this.A05 = j2;
        this.A09 = cXd;
    }
}
