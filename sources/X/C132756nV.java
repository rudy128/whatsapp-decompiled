package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6nV  reason: invalid class name and case insensitive filesystem */
public final class C132756nV {
    public final C130716jt A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final AnonymousClass6ZB A04;

    public C132756nV(AnonymousClass6ZB r2, C130716jt r3, String str, String str2, List list) {
        C18070vi.A0d(str2, 3);
        this.A03 = list;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = r3;
        this.A04 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("itemHash: ");
        String str = this.A01;
        A102.append(str.hashCode());
        A102.append(", sessionId: ");
        C108985cd.A1L(this.A02, A102, A10);
        A10.append(10);
        List<Object> list = this.A03;
        ArrayList A0E = C29351c6.A0E(list);
        for (Object A1U : list) {
            C108955ca.A1U(A1U, A0E);
        }
        A10.append(C108995ce.A0X("\n", A0E));
        A10.append(10);
        A10.append(AnonymousClass001.A1H("itemId: ", str, AnonymousClass000.A10()));
        A10.append(10);
        return C18070vi.A0H(A10);
    }
}
