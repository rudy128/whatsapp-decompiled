package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9vB  reason: invalid class name and case insensitive filesystem */
public final class C196509vB {
    public static final List A00(C20287AEv aEv, List list) {
        AE6 ae6;
        List<ADA> list2;
        if (aEv == null || (ae6 = aEv.A05) == null || (list2 = ae6.A03) == null) {
            return C18460wS.A00;
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (ADA A00 : list2) {
            String A002 = A00.A00();
            if (!list.contains(A002)) {
                A13.add(A002);
            }
        }
        return A13;
    }
}
