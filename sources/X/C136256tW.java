package X;

/* renamed from: X.6tW  reason: invalid class name and case insensitive filesystem */
public final class C136256tW {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136256tW) {
                C136256tW r5 = (C136256tW) obj;
                if (!(this.A00 == r5.A00 && C18070vi.A18(this.A02, r5.A02) && this.A05 == r5.A05 && this.A04 == r5.A04 && C18070vi.A18(this.A03, r5.A03) && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0DV.A00(AnonymousClass0DV.A00(((this.A00 * 31) + C17900vP.A00(this.A02)) * 31, this.A05), this.A04) + C108955ca.A06(this.A03)) * 31) + this.A01;
    }

    public C136256tW(String str, String str2, int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = str;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = str2;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DeviceConfirmationResult(status=");
        A10.append(this.A00);
        A10.append(", login=");
        A10.append(this.A02);
        A10.append(", newJid=");
        A10.append(this.A05);
        A10.append(", netNewJid=");
        A10.append(this.A04);
        A10.append(", retryAfter=");
        A10.append(this.A03);
        A10.append(", wamsysFailureReason=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
