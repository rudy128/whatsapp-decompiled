package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ac5  reason: case insensitive filesystem */
public final class C20951Ac5 implements AnonymousClass25D {
    public final List A00;
    public final List A01;

    public C20951Ac5(C164698Zv r3) {
        C18070vi.A0d(r3, 1);
        EE9 ee9 = r3.addedFacts_;
        C18070vi.A0X(ee9);
        List A002 = A00(ee9);
        EE9 ee92 = r3.removedFacts_;
        C18070vi.A0X(ee92);
        List A003 = A00(ee92);
        this.A00 = A002;
        this.A01 = A003;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20951Ac5) {
                C20951Ac5 ac5 = (C20951Ac5) obj;
                if (!C18070vi.A18(this.A00, ac5.A00) || !C18070vi.A18(this.A01, ac5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static final List A00(List list) {
        List A0v = C29431cG.A0v(list, 30);
        ArrayList<C164328Yk> A13 = AnonymousClass000.A13();
        for (Object next : A0v) {
            C164328Yk r1 = (C164328Yk) next;
            String str = r1.fact_;
            if (str != null && !AnonymousClass1YF.A0T(str) && r1.fact_.length() <= 500) {
                A13.add(next);
            }
        }
        ArrayList A0D = C29351c6.A0D(A13);
        for (C164328Yk r0 : A13) {
            AnonymousClass1D6.A02(r0.fact_, r0.factId_, A0D);
        }
        return A0D;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A00) * 31) + C17880vN.A02(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotMemoryMetadata(addedFacts=");
        A10.append(this.A00);
        A10.append(", removedFacts=");
        return AnonymousClass001.A1F(this.A01, A10);
    }

    public C20951Ac5() {
        this.A00 = null;
        this.A01 = null;
    }
}
