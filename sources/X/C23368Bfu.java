package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Bfu  reason: case insensitive filesystem */
public final class C23368Bfu extends DSA {
    public final int A00;
    public final C23345BfX A01;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        DSA dsa = (DSA) obj;
        int A012 = dsa.A01();
        int i = 4;
        if (4 == A012) {
            C23345BfX bfX = this.A01;
            int size = bfX.size();
            C23345BfX bfX2 = ((C23368Bfu) dsa).A01;
            if (size != bfX2.size()) {
                i = bfX.size();
                A012 = bfX2.size();
            } else {
                for (int i2 = 0; i2 < bfX.size(); i2++) {
                    int compareTo = ((DSA) bfX.get(i2)).compareTo(bfX2.get(i2));
                    if (compareTo != 0) {
                        return compareTo;
                    }
                }
                return 0;
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
        return this.A01.equals(((C23368Bfu) obj).A01);
    }

    public final String toString() {
        C23345BfX bfX = this.A01;
        if (bfX.isEmpty()) {
            return "[]";
        }
        ArrayList A13 = AnonymousClass000.A13();
        int size = bfX.size();
        for (int i = 0; i < size; i++) {
            A13.add(bfX.get(i).toString().replace("\n", "\n  "));
        }
        StringBuilder A0u = BE6.A0u("[\n  ");
        Iterator it = A13.iterator();
        try {
            if (it.hasNext()) {
                CharSequence A0b = BEA.A0b(it.next());
                while (true) {
                    A0u.append(A0b);
                    if (!it.hasNext()) {
                        break;
                    }
                    A0u.append(",\n  ");
                    A0b = BEA.A0b(it.next());
                }
            }
            return AnonymousClass000.A0y("\n]", A0u);
        } catch (IOException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public C23368Bfu(C23345BfX bfX) {
        this.A01 = bfX;
        int i = 0;
        int i2 = 0;
        while (true) {
            C23345BfX bfX2 = this.A01;
            if (i >= bfX2.size()) {
                break;
            }
            int A02 = ((DSA) bfX2.get(i)).A02();
            if (i2 < A02) {
                i2 = A02;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.A00 = i3;
        if (i3 > 8) {
            throw new C24197Bx7("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, 4);
        return AnonymousClass000.A0P(this.A01, A1b, 1);
    }
}
