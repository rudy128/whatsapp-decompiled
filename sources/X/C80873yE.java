package X;

/* renamed from: X.3yE  reason: invalid class name and case insensitive filesystem */
public final class C80873yE extends C84914Li {
    public final C445823z A00;
    public final C82984Cx A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80873yE(C445823z r2, C82984Cx r3) {
        super(AnonymousClass00R.A0N);
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80873yE) {
                C80873yE r5 = (C80873yE) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EventNameAndDescription(message=");
        A10.append(this.A00);
        A10.append(", source=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
