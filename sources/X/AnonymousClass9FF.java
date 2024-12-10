package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9FF  reason: invalid class name */
public final class AnonymousClass9FF extends AnonymousClass9CP {
    public final AnonymousClass9CY A00;
    public final List A01;
    public final AnonymousClass9DG A02;

    /* JADX WARNING: type inference failed for: r8v0, types: [boolean, int] */
    public AnonymousClass9FF(C29621ca r27, AnonymousClass9F6 r28) {
        String A0u;
        StringBuilder A10;
        AnonymousClass9F6 r0 = r28;
        C18070vi.A0d(r0, 2);
        C29621ca r11 = r27;
        C29621ca A002 = AnonymousClass9F6.A00(r11, r0);
        C62672rm A0s = AnonymousClass8BR.A0s();
        ? A1T = AnonymousClass8BV.A1T(A97.A00, A002, 1);
        AnonymousClass9DG A05 = A97.A05(r11, A002, A0s);
        if (A05 != null) {
            this.A02 = A05;
            this.A00 = A97.A03(r11, A0s);
            String[] strArr = new String[2];
            strArr[A1T] = "reports";
            strArr[1] = "report";
            C29621ca A0Q = AnonymousClass8BS.A0Q(r11, strArr, A1T);
            if (A0Q == null) {
                A10 = AnonymousClass000.A10();
                AnonymousClass8BY.A12(r11, A10, strArr, A1T);
            } else {
                String str = strArr[1];
                List A0R = A0Q.A0R(str);
                ArrayList A0t = C108965cb.A0t(A0R);
                Iterator it = A0R.iterator();
                while (it.hasNext()) {
                    C29621ca A0R2 = AnonymousClass8BW.A0R(it, 1);
                    if (A0s.A09(A0R2, "report")) {
                        String[] strArr2 = new String[1];
                        strArr2[A1T] = "message_id";
                        String str2 = (String) AnonymousClass8BY.A0W(A0R2, A0s, (Object) null, strArr2, A1T);
                        if (str2 != null) {
                            String[] strArr3 = new String[1];
                            strArr3[A1T] = "reporter";
                            ArrayList A08 = A0s.A08(A0R2, new C21287AhY(33), strArr3, 1, 19999);
                            if (A08 != null) {
                                A0t.add(new AnonymousClass9DH(A0R2, str2, (List) A08));
                            }
                        }
                    }
                }
                if (AnonymousClass8BR.A06(A0t) < 0) {
                    A10 = AnonymousClass000.A10();
                    AnonymousClass8BY.A1K(str, A10, A0t);
                    A10.append(0);
                    A10.append('.');
                } else if (AnonymousClass8BR.A06(A0t) > 10000) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    AnonymousClass8BY.A1J(str, A102, A0t);
                    A0u = AnonymousClass8BV.A0u(A102, '.', 10000);
                    A0s.A00 = A0u;
                    throw AnonymousClass1UI.A01(A0u);
                } else {
                    this.A01 = A0t;
                    this.A00 = r11;
                    return;
                }
            }
            A0u = A10.toString();
            A0s.A00 = A0u;
            throw AnonymousClass1UI.A01(A0u);
        }
        throw AnonymousClass1O9.A00(A0s);
    }
}
