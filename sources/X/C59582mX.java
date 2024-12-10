package X;

/* renamed from: X.2mX  reason: invalid class name and case insensitive filesystem */
public final class C59582mX {
    public final long A00;
    public final AnonymousClass205 A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59582mX) {
                C59582mX r8 = (C59582mX) obj;
                if (!(C18070vi.A18(this.A01, r8.A01) && this.A03 == r8.A03 && this.A02 == r8.A02 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A01), this.A03), this.A02));
    }

    public C59582mX(AnonymousClass205 r1, long j, boolean z, boolean z2) {
        this.A01 = r1;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LatestDeferredMessageDetails(messageKey=");
        A10.append(this.A01);
        A10.append(", noPopup=");
        A10.append(this.A03);
        A10.append(", isAndroidWearRefresh=");
        A10.append(this.A02);
        A10.append(", timestamp=");
        return C17900vP.A0E(A10, this.A00);
    }
}
