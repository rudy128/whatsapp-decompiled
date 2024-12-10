package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9FU  reason: invalid class name */
public final class AnonymousClass9FU extends AnonymousClass9CP implements B6K {
    public final String A00;
    public final List A01;
    public final C29621ca A02;
    public final AnonymousClass9DG A03;

    public AnonymousClass9FU(C29621ca r27, AnonymousClass9F6 r28) {
        String A0u;
        StringBuilder A10;
        AnonymousClass9F6 r0 = r28;
        C18070vi.A0d(r0, 2);
        C29621ca r10 = r27;
        C29621ca A002 = AnonymousClass9F6.A00(r10, r0);
        C62672rm A0s = AnonymousClass8BR.A0s();
        String[] strArr = new String[2];
        strArr[0] = "false";
        String A07 = A0s.A07(r10, C18070vi.A0O("true", strArr, 1), new String[]{"reachability_settings", "enabled"});
        if (A07 != null) {
            this.A00 = A07;
            C18070vi.A0d(A8H.A00, 0);
            C18070vi.A0d(A002, 1);
            AnonymousClass9DG A012 = A8H.A01(r10, A002, A0s);
            if (A012 != null) {
                this.A03 = A012;
                String[] strArr2 = {"reachability_settings", "integrator"};
                C29621ca A0Q = AnonymousClass8BS.A0Q(r10, strArr2, 0);
                if (A0Q == null) {
                    A10 = AnonymousClass000.A10();
                    AnonymousClass8BY.A12(r10, A10, strArr2, 0);
                } else {
                    String str = strArr2[1];
                    List A0R = A0Q.A0R(str);
                    ArrayList A0t = C108965cb.A0t(A0R);
                    Iterator it = A0R.iterator();
                    while (it.hasNext()) {
                        C29621ca A0R2 = AnonymousClass8BW.A0R(it, 1);
                        if (A0s.A09(A0R2, "integrator")) {
                            C62672rm r18 = A0s;
                            C29621ca r19 = A0R2;
                            Number number = (Number) r18.A05(r19, Long.TYPE, C108975cc.A0X(), 999L, (Object) null, AnonymousClass8BS.A1W(1, 0), false);
                            if (number != null) {
                                A0t.add(new AnonymousClass9CX(A0R2, number.longValue()));
                            }
                        }
                    }
                    if (AnonymousClass8BR.A06(A0t) < 0) {
                        A10 = AnonymousClass000.A10();
                        AnonymousClass8BY.A1K(str, A10, A0t);
                        A10.append(0);
                        A10.append('.');
                    } else if (AnonymousClass8BR.A06(A0t) > 999) {
                        StringBuilder A102 = AnonymousClass000.A10();
                        AnonymousClass8BY.A1J(str, A102, A0t);
                        A0u = AnonymousClass8BV.A0u(A102, '.', 999);
                        throw AnonymousClass1UI.A01(A0u);
                    } else {
                        this.A01 = A0t;
                        this.A00 = r10;
                        String str2 = new String[]{"reachability_settings"}[0];
                        List A0R3 = r10.A0R(str2);
                        ArrayList A0t2 = C108965cb.A0t(A0R3);
                        Iterator it2 = A0R3.iterator();
                        while (it2.hasNext()) {
                            AnonymousClass8BX.A1M(A0t2, it2);
                        }
                        if (AnonymousClass8BR.A06(A0t2) < 1) {
                            StringBuilder A103 = AnonymousClass000.A10();
                            AnonymousClass8BY.A1K(str2, A103, A0t2);
                            throw C198999zG.A01(A103);
                        } else if (AnonymousClass8BR.A06(A0t2) <= 1) {
                            this.A02 = AnonymousClass8BR.A0m(A0t2, 0);
                            return;
                        } else {
                            StringBuilder A104 = AnonymousClass000.A10();
                            AnonymousClass8BY.A1J(str2, A104, A0t2);
                            throw C198999zG.A01(A104);
                        }
                    }
                }
                A0u = A10.toString();
                throw AnonymousClass1UI.A01(A0u);
            }
            throw AnonymousClass1O9.A00(A0s);
        }
        throw AnonymousClass1O9.A00(A0s);
    }
}
