package X;

/* renamed from: X.4Sy  reason: invalid class name and case insensitive filesystem */
public final class C86764Sy {
    public final C106535Wf A00;
    public final boolean A01;

    public C86764Sy(C106535Wf r2, boolean z) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86764Sy) {
                C86764Sy r5 = (C86764Sy) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CenteredItem(item=");
        A10.append(this.A00);
        A10.append(", shouldUpdateTrayPosition=");
        return C17900vP.A0F(A10, this.A01);
    }
}
