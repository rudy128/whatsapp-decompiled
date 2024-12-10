package X;

import java.util.Set;

/* renamed from: X.4YH  reason: invalid class name */
public final class AnonymousClass4YH {
    public static final AnonymousClass4YH A02 = new AnonymousClass4YH(C200410p.A0S(new String[]{"imagine", "/imagine"}), 0);
    public static final AnonymousClass4YH A03 = new AnonymousClass4YH(C200410p.A0S(new String[]{"imagine me", "/imagine me"}), 1);
    public final int A00;
    public final Set A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YH) {
                AnonymousClass4YH r5 = (AnonymousClass4YH) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, this.A00 * 31);
    }

    public AnonymousClass4YH(Set set, int i) {
        this.A00 = i;
        this.A01 = set;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MetaAiTypeaheadFeature(priority=");
        A10.append(this.A00);
        A10.append(", triggers=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
