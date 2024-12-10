package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9k4  reason: invalid class name and case insensitive filesystem */
public final class C189919k4 {
    public final C18100vl A00;
    public final C18100vl A01;

    public final List A00(AE6 ae6) {
        List<C20245ADd> list;
        StringBuilder A11;
        if (ae6 == null || (list = ae6.A02) == null) {
            return C18460wS.A00;
        }
        ArrayList A0D = C29351c6.A0D(list);
        for (C20245ADd aDd : list) {
            String str = aDd.A00;
            String str2 = aDd.A01;
            if (AnonymousClass3MY.A1b((C18000vb) AnonymousClass3MX.A14(this.A01))) {
                A11 = AnonymousClass000.A11(str);
                A11.append(": ");
                A11.append(str2);
            } else {
                A11 = AnonymousClass000.A11(str2);
                A11.append(" :");
                A11.append(str);
            }
            C108955ca.A1U(A11, A0D);
        }
        return A0D;
    }

    public C189919k4(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0j(r2, r3);
        this.A00 = AnonymousClass8BU.A10(r2, 20);
        this.A01 = AnonymousClass8BU.A10(r3, 21);
    }
}
