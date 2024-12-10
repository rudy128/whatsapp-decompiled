package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.6zb  reason: invalid class name and case insensitive filesystem */
public final class C139886zb {
    public final C122646Re A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139886zb) {
                C139886zb r5 = (C139886zb) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A00, C17880vN.A03(this.A01)) + 79233237;
    }

    public C139886zb(C122646Re r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C139886zb) it.next()).A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostDestination(destinationIdentity=");
        A10.append(this.A01);
        A10.append(", destinationApp=");
        A10.append(this.A00);
        A10.append(", destinationSurface=");
        return C17900vP.A0B("STORY", A10);
    }
}
