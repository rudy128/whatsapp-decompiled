package X;

import android.accounts.Account;
import java.util.ArrayList;

/* renamed from: X.9R1  reason: invalid class name */
public abstract class AnonymousClass9R1 {
    public static final String A00(AnonymousClass118 r5) {
        Account[] A01 = C41371wF.A01(r5.A00);
        C18070vi.A0X(A01);
        int length = A01.length;
        if (length == 0) {
            return null;
        }
        ArrayList A13 = AnonymousClass000.A13();
        int i = 0;
        do {
            String A05 = C17970vW.A05(A01[i].name);
            if (A05 != null) {
                A13.add(C29361c9.A0Z(A05, 5));
            }
            i++;
        } while (i < length);
        C29391cC.A0G(A13);
        return A13.toString();
    }
}
