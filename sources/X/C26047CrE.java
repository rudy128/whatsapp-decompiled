package X;

import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.CrE  reason: case insensitive filesystem */
public final class C26047CrE {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public final int A01() {
        return this.A01;
    }

    public final int A02() {
        return this.A00;
    }

    public final Object A03() {
        return this.A02;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26047CrE) {
                C26047CrE crE = (C26047CrE) obj;
                if (!C18070vi.A18(this.A02, crE.A02) || this.A01 != crE.A01 || this.A00 != crE.A00 || !C18070vi.A18(this.A03, crE.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C26047CrE(Object obj, int i, int i2) {
        this(obj, "", i, i2);
    }

    public final Object A04() {
        return this.A02;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A03, ((((AnonymousClass001.A0k(this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public static void A00(AbstractCollection abstractCollection, List list, int i, int i2, int i3) {
        Object obj = list.get(i);
        C26047CrE crE = (C26047CrE) obj;
        if (C26069Crj.A02(i2, i3, crE.A01, crE.A00)) {
            abstractCollection.add(obj);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Range(item=");
        A10.append(this.A02);
        A10.append(", start=");
        A10.append(this.A01);
        A10.append(", end=");
        A10.append(this.A00);
        A10.append(", tag=");
        return C17900vP.A0B(this.A03, A10);
    }

    public C26047CrE(Object obj, String str, int i, int i2) {
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
        if (i > i2) {
            throw AnonymousClass000.A0k("Reversed range is not supported");
        }
    }
}
