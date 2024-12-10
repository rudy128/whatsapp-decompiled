package X;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Bfv  reason: case insensitive filesystem */
public final class C23369Bfv extends DSA {
    public final int A00;
    public final C23346BfY A01;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        DSA dsa = (DSA) obj;
        int A012 = dsa.A01();
        int i = 5;
        if (5 == A012) {
            C23346BfY bfY = this.A01;
            int size = bfY.size();
            C23346BfY bfY2 = ((C23369Bfv) dsa).A01;
            if (size != bfY2.size()) {
                i = bfY.size();
                A012 = bfY2.size();
            } else {
                C27102DUg A07 = bfY.entrySet().A07();
                C27102DUg A072 = bfY2.entrySet().A07();
                do {
                    if (!A07.hasNext() && !A072.hasNext()) {
                        return 0;
                    }
                    Map.Entry A16 = AnonymousClass000.A16(A07);
                    Map.Entry A162 = AnonymousClass000.A16(A072);
                    int compareTo2 = ((DSA) A16.getKey()).compareTo(A162.getKey());
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                    compareTo = ((DSA) A16.getValue()).compareTo(A162.getValue());
                } while (compareTo == 0);
                return compareTo;
            }
        }
        return i - A012;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C23369Bfv) obj).A01);
    }

    public final String toString() {
        C23346BfY bfY = this.A01;
        if (bfY.isEmpty()) {
            return "{}";
        }
        LinkedHashMap A13 = C17880vN.A13();
        C27102DUg A07 = bfY.entrySet().A07();
        while (A07.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A07);
            A13.put(A16.getKey().toString().replace("\n", "\n  "), A16.getValue().toString().replace("\n", "\n  "));
        }
        StringBuilder A0u = BE6.A0u("{\n  ");
        Iterator A15 = AnonymousClass000.A15(A13);
        try {
            if (A15.hasNext()) {
                Map.Entry A162 = AnonymousClass000.A16(A15);
                CharSequence A0b = BEA.A0b(A162.getKey());
                while (true) {
                    A0u.append(A0b);
                    A0u.append(" : ");
                    A0u.append(BEA.A0b(A162.getValue()));
                    if (!A15.hasNext()) {
                        break;
                    }
                    A0u.append(",\n  ");
                    A162 = AnonymousClass000.A16(A15);
                    A0b = BEA.A0b(A162.getKey());
                }
            }
            return AnonymousClass000.A0y("\n}", A0u);
        } catch (IOException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public C23369Bfv(C23346BfY bfY) {
        this.A01 = bfY;
        C27102DUg A07 = bfY.entrySet().A07();
        int i = 0;
        while (A07.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A07);
            int A02 = ((DSA) A16.getKey()).A02();
            i = i < A02 ? A02 : i;
            int A022 = ((DSA) A16.getValue()).A02();
            if (i < A022) {
                i = A022;
            }
        }
        int i2 = i + 1;
        this.A00 = i2;
        if (i2 > 8) {
            throw new C24197Bx7("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, 5);
        return AnonymousClass000.A0P(this.A01, A1b, 1);
    }
}
