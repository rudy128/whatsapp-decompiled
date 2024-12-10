package X;

/* renamed from: X.4ih  reason: invalid class name and case insensitive filesystem */
public final class C93264ih implements C106705Ww {
    public final int A00;
    public final AnonymousClass4ZN A01;
    public final boolean A02;

    public C93264ih(AnonymousClass4ZN r2, int i, boolean z) {
        C18070vi.A0d(r2, 2);
        this.A02 = z;
        this.A01 = r2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93264ih) {
                C93264ih r5 = (C93264ih) obj;
                if (!(this.A02 == r5.A02 && C18070vi.A18(this.A01, r5.A01) && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A01, AnonymousClass3MX.A03(this.A02)) + 2131101882) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DisplayName(pulse=");
        A10.append(this.A02);
        A10.append(", title=");
        A10.append(this.A01);
        A10.append(", textColor=");
        A10.append(2131101882);
        A10.append(", avIconRes=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
