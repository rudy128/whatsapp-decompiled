package X;

/* renamed from: X.2mf  reason: invalid class name and case insensitive filesystem */
public final class C59652mf {
    public final long A00;
    public final AnonymousClass205 A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59652mf) {
                C59652mf r8 = (C59652mf) obj;
                if (!(C18070vi.A18(this.A01, r8.A01) && this.A00 == r8.A00 && C18070vi.A18(this.A02, r8.A02) && this.A04 == r8.A04 && this.A03 == r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00((AnonymousClass001.A0K(this.A00, AnonymousClass000.A0L(this.A01)) + C17900vP.A00(this.A02)) * 31, this.A04), this.A03);
    }

    public C59652mf(AnonymousClass205 r1, String str, long j, boolean z, boolean z2) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = str;
        this.A04 = z;
        this.A03 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ForwardingFMessageParams(key=");
        A10.append(this.A01);
        A10.append(", timestamp=");
        A10.append(this.A00);
        A10.append(", multicastId=");
        A10.append(this.A02);
        A10.append(", mediaForwardWithoutUpload=");
        A10.append(this.A04);
        A10.append(", includeCaption=");
        return C17900vP.A0F(A10, this.A03);
    }
}
