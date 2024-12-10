package X;

import android.os.Handler;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* renamed from: X.Cms  reason: case insensitive filesystem */
public final class C25838Cms {
    public int A00;
    public int A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final AnonymousClass19Y A04;

    public C25838Cms(C18030ve r5, AnonymousClass19Y r6) {
        int A0G = C72453Mb.A0G(r6, r5, 1);
        this.A04 = r6;
        this.A03 = AnonymousClass1DF.A00(AnonymousClass00R.A01, new DWX(r5, 13));
        this.A02 = AnonymousClass1DF.A01(new C21527Ala(A0G));
    }

    public void A04(String str, String str2) {
        Integer A002;
        C18070vi.A0d(str2, 1);
        if (!C72453Mb.A1a(this.A03) && A05() && (A002 = A00(this.A01)) != null) {
            this.A04.markerAnnotate(A002.intValue(), str, str2);
        }
    }

    public static final Integer A00(int i) {
        int i2;
        if (i != 0) {
            i2 = 325401997;
            if (i != 1) {
                i2 = 325387467;
            }
        } else {
            i2 = 325397055;
        }
        return Integer.valueOf(i2);
    }

    public void A01(int i) {
        if (!C72453Mb.A1a(this.A03) && A05()) {
            Integer A002 = A00(this.A01);
            if (A002 != null) {
                this.A04.markerEnd(A002.intValue(), (short) i);
            }
            if (this.A01 == 1 && (i == 4 || i == 3)) {
                synchronized (C25822CmZ.A0B) {
                    C25822CmZ.A09 = null;
                }
            }
            ((Handler) this.A02.getValue()).removeCallbacksAndMessages((Object) null);
        }
    }

    public void A02(int i) {
        Integer A002;
        if (!C72453Mb.A1a(this.A03) && (A002 = A00(i)) != null) {
            if (A05()) {
                A04(UserFlowLoggerImpl.CANCEL_REASON_ANNOTATION, "cancelled_by_new_event");
                A01(4);
            }
            this.A01 = i;
            this.A00 = 0;
            this.A04.Bj2(A002.intValue(), false);
            ((Handler) this.A02.getValue()).postDelayed(new C21355Aik(this, 5), 10000);
        }
    }

    public void A03(String str) {
        Integer A002;
        if (!C72453Mb.A1a(this.A03) && A05() && (A002 = A00(this.A01)) != null) {
            this.A04.markerPoint(A002.intValue(), str);
        }
    }

    public boolean A05() {
        Integer A002 = A00(this.A01);
        if (A002 == null) {
            return false;
        }
        return this.A04.BfT(A002.intValue());
    }
}
