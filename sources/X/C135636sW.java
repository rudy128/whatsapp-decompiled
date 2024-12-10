package X;

/* renamed from: X.6sW  reason: invalid class name and case insensitive filesystem */
public final class C135636sW {
    public final AnonymousClass4ZN A00;
    public final AnonymousClass4ZN A01;
    public final AnonymousClass4ZN A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135636sW) {
                C135636sW r5 = (C135636sW) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(((((AnonymousClass001.A0k(this.A02) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A00)) * 31, this.A03);
    }

    public C135636sW(AnonymousClass4ZN r1, AnonymousClass4ZN r2, AnonymousClass4ZN r3, boolean z) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallHeaderViewState(title=");
        A10.append(this.A02);
        A10.append(", status=");
        A10.append(this.A01);
        A10.append(", groupsInCommon=");
        A10.append(this.A00);
        A10.append(", showIfCallFailed=");
        return C17900vP.A0F(A10, this.A03);
    }
}
