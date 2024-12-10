package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9FG  reason: invalid class name */
public final class AnonymousClass9FG extends AnonymousClass9CP {
    public final C178319Cq A00;
    public final C29621ca A01;
    public final AnonymousClass9DG A02;

    public AnonymousClass9FG(C29621ca r19, AnonymousClass9F7 r20) {
        C29621ca r11 = r19;
        C108945cZ.A1N(r11);
        C29621ca r2 = (C29621ca) r20.A00;
        C62672rm A0s = AnonymousClass8BR.A0s();
        A0s.A05(r11, Long.TYPE, C108975cc.A0X(), AnonymousClass8BU.A0j(), (Object) null, new String[]{"error", "backoff"}, false);
        C20021A3n a3n = C20021A3n.A00;
        C18070vi.A0d(a3n, 0);
        C18070vi.A0d(r2, 1);
        AnonymousClass9DG A002 = C20021A3n.A00(r11, r2, A0s);
        if (A002 != null) {
            this.A02 = A002;
            C22470B9c[] b9cArr = new C22470B9c[3];
            C21284AhV.A00(b9cArr, 21, 0, a3n);
            C21284AhV.A00(b9cArr, 22, 1, a3n);
            Object A06 = A0s.A06(r11, "IQErrorRateOverlimit|IQErrorInternalServerError|IQErrorServiceUnavailable", C18070vi.A0O(new C21284AhV(a3n, 23), b9cArr, 2), new String[]{"error"});
            if (A06 != null) {
                this.A00 = (C178319Cq) A06;
                this.A00 = r11;
                String str = new String[]{"error"}[0];
                List A0R = r11.A0R(str);
                ArrayList A0t = C108965cb.A0t(A0R);
                Iterator it = A0R.iterator();
                while (it.hasNext()) {
                    AnonymousClass8BX.A1M(A0t, it);
                }
                if (AnonymousClass8BR.A06(A0t) < 1) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    AnonymousClass8BY.A1K(str, A10, A0t);
                    throw C198999zG.A01(A10);
                } else if (AnonymousClass8BR.A06(A0t) <= 1) {
                    this.A01 = AnonymousClass8BR.A0m(A0t, 0);
                } else {
                    StringBuilder A102 = AnonymousClass000.A10();
                    AnonymousClass8BY.A1J(str, A102, A0t);
                    throw C198999zG.A01(A102);
                }
            } else {
                throw AnonymousClass1O9.A00(A0s);
            }
        } else {
            throw AnonymousClass1O9.A00(A0s);
        }
    }
}
