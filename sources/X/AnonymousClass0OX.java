package X;

import java.util.Map;

/* renamed from: X.0OX  reason: invalid class name */
public final class AnonymousClass0OX {
    public final AnonymousClass0JC A00;
    public final AnonymousClass0JX A01;
    public final Map A02;
    public final boolean A03;

    public AnonymousClass0OX() {
        this((AnonymousClass0JC) null, (AnonymousClass0JX) null, (Map) null, 63, false);
    }

    public /* synthetic */ AnonymousClass0OX(AnonymousClass0JC r4, AnonymousClass0JX r5, Map map, int i, boolean z) {
        AnonymousClass0JX r1 = null;
        AnonymousClass0JC r2 = (i & 1) == 0 ? r4 : null;
        r1 = (i & 8) == 0 ? r5 : r1;
        z = (i & 16) != 0 ? false : z;
        map = (i & 32) != 0 ? AnonymousClass1D7.A0I() : map;
        this.A00 = r2;
        this.A01 = r1;
        this.A03 = z;
        this.A02 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0OX) {
                AnonymousClass0OX r5 = (AnonymousClass0OX) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || this.A03 != r5.A03 || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0k = AnonymousClass001.A0k(this.A00) * 31 * 31 * 31;
        AnonymousClass0JX r0 = this.A01;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return AnonymousClass000.A0O(this.A02, AnonymousClass0DV.A00((A0k + i) * 31, this.A03));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TransitionData(fade=");
        A10.append(this.A00);
        AnonymousClass000.A1G(A10, ", slide=");
        AnonymousClass000.A1G(A10, ", changeSize=");
        A10.append(", scale=");
        A10.append(this.A01);
        A10.append(", hold=");
        A10.append(this.A03);
        A10.append(", effectsMap=");
        return AnonymousClass001.A1F(this.A02, A10);
    }

    public AnonymousClass0OX(AnonymousClass0JC r1, AnonymousClass0JX r2, Map map, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = z;
        this.A02 = map;
    }
}
