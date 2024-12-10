package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.Cv5  reason: case insensitive filesystem */
public class C26218Cv5 {
    public static C26218Cv5 A04;
    public CQC A00;
    public CQC A01;
    public final Handler A02 = new Handler(Looper.getMainLooper(), new C26370CyW(this, 4));
    public final Object A03 = C17880vN.A0p();

    public static C26218Cv5 A00() {
        C26218Cv5 cv5 = A04;
        if (cv5 != null) {
            return cv5;
        }
        C26218Cv5 cv52 = new C26218Cv5();
        A04 = cv52;
        return cv52;
    }

    public static void A01(CQC cqc, C26218Cv5 cv5) {
        int i = cqc.A00;
        if (i != -2) {
            if (i <= 0) {
                int i2 = i;
                i = 2750;
                if (i2 == -1) {
                    i = 1500;
                }
            }
            Handler handler = cv5.A02;
            handler.removeCallbacksAndMessages(cqc);
            handler.sendMessageDelayed(Message.obtain(handler, 0, cqc), (long) i);
        }
    }

    public static void A02(C26218Cv5 cv5) {
        CQC cqc = cv5.A01;
        if (cqc != null) {
            cv5.A00 = cqc;
            cv5.A01 = null;
            E2U e2u = (E2U) cqc.A02.get();
            if (e2u != null) {
                C108955ca.A1F(C26155CtN.A0M, ((DLD) e2u).A00, 0);
            } else {
                cv5.A00 = null;
            }
        }
    }

    public static boolean A03(E2U e2u, C26218Cv5 cv5) {
        CQC cqc = cv5.A00;
        if (cqc == null || e2u == null || cqc.A02.get() != e2u) {
            return false;
        }
        return true;
    }

    public static boolean A04(CQC cqc, C26218Cv5 cv5, int i) {
        E2U e2u = (E2U) cqc.A02.get();
        if (e2u == null) {
            return false;
        }
        cv5.A02.removeCallbacksAndMessages(cqc);
        Handler handler = C26155CtN.A0M;
        handler.sendMessage(handler.obtainMessage(1, i, 0, ((DLD) e2u).A00));
        return true;
    }

    public void A05(E2U e2u) {
        synchronized (this.A03) {
            if (A03(e2u, this)) {
                CQC cqc = this.A00;
                if (!cqc.A01) {
                    cqc.A01 = true;
                    this.A02.removeCallbacksAndMessages(cqc);
                }
            }
        }
    }

    public void A06(E2U e2u) {
        synchronized (this.A03) {
            if (A03(e2u, this)) {
                CQC cqc = this.A00;
                if (cqc.A01) {
                    cqc.A01 = false;
                    A01(cqc, this);
                }
            }
        }
    }
}
