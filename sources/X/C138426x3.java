package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6x3  reason: invalid class name and case insensitive filesystem */
public class C138426x3 {
    public Set A00;
    public final C19830z4 A01;
    public final AnonymousClass1NN A02;
    public final C200710s A03;
    public final AnonymousClass1TA A04;

    public static void A00(C138426x3 r6) {
        HashSet A12;
        synchronized (r6) {
            if (r6.A00 == null) {
                long j = C17890vO.A0B(r6.A01).getLong("first_unseen_joinable_call", 0);
                if (j > 0) {
                    A12 = new HashSet(r6.A04.A05());
                } else {
                    A12 = C17880vN.A12();
                }
                r6.A00 = A12;
                StringBuilder A10 = AnonymousClass000.A10();
                C17890vO.A14("UnseenJoinableCallsBadge/init count:", A10, A12);
                C17900vP.A0m(" timestamp:", A10, j);
            }
        }
    }

    public C138426x3(C19830z4 r2, AnonymousClass1NN r3, AnonymousClass1TA r4, AnonymousClass10I r5) {
        this.A01 = r2;
        this.A04 = r4;
        this.A02 = r3;
        this.A03 = C200710s.A00(r5);
    }
}
