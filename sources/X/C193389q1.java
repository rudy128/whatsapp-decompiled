package X;

/* renamed from: X.9q1  reason: invalid class name and case insensitive filesystem */
public final class C193389q1 {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193389q1) {
                C193389q1 r5 = (C193389q1) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A00, C17880vN.A03(this.A01));
    }

    public C193389q1(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EffectInstruction(token=");
        A10.append(this.A01);
        A10.append(", text=");
        return C17900vP.A0B(this.A00, A10);
    }
}
