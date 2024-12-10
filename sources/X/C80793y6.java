package X;

/* renamed from: X.3y6  reason: invalid class name and case insensitive filesystem */
public final class C80793y6 extends C84904Lh {
    public final C82944Ct A00;
    public final C445823z A01;
    public final C49552Qx A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80793y6(C82944Ct r2, C445823z r3, C49552Qx r4) {
        super(AnonymousClass00R.A01);
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80793y6) {
                C80793y6 r5 = (C80793y6) obj;
                if (!(C18070vi.A18(this.A01, r5.A01) && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A01)) + AnonymousClass001.A0k(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EventItem(message=");
        A10.append(this.A01);
        A10.append(", eventType=");
        A10.append(this.A00);
        A10.append(", responseStatus=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
