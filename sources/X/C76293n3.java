package X;

/* renamed from: X.3n3  reason: invalid class name and case insensitive filesystem */
public final class C76293n3 extends C76323n6 {
    public final AnonymousClass4UW A00;
    public final AnonymousClass1E7 A01;
    public final AnonymousClass4ZN A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76293n3) {
                C76293n3 r5 = (C76293n3) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A00, ((AnonymousClass001.A0k(this.A01) * 31) + C17880vN.A02(this.A02)) * 31), this.A03);
    }

    public C76293n3(AnonymousClass4UW r1, AnonymousClass1E7 r2, AnonymousClass4ZN r3, boolean z) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LGCOrOneToOne(titleContact=");
        A10.append(this.A01);
        A10.append(", titleContentDescription=");
        A10.append(this.A02);
        A10.append(", subtitleState=");
        A10.append(this.A00);
        A10.append(", showPhoto=");
        return C17900vP.A0F(A10, this.A03);
    }
}
