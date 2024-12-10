package X;

/* renamed from: X.9tL  reason: invalid class name and case insensitive filesystem */
public final class C195439tL {
    public final int A00;
    public final long A01;
    public final C198819yx A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195439tL) {
                C195439tL r8 = (C195439tL) obj;
                if (this.A00 != r8.A00 || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A04, r8.A04) || this.A01 != r8.A01 || this.A05 != r8.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass001.A0K(this.A01, C17890vO.A02(this.A04, C17890vO.A02(this.A03, ((this.A00 * 31) + AnonymousClass001.A0k(this.A02)) * 31))), this.A05);
    }

    public C195439tL(C198819yx r1, String str, String str2, int i, long j, boolean z) {
        this.A00 = i;
        this.A02 = r1;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j;
        this.A05 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ExistResponse(status=");
        A10.append(this.A00);
        A10.append(", result=");
        A10.append(this.A02);
        A10.append(", countryCode=");
        A10.append(this.A03);
        A10.append(", phoneNumber=");
        A10.append(this.A04);
        A10.append(", retryAfter=");
        A10.append(this.A01);
        A10.append(", isRetry=");
        return C17900vP.A0F(A10, this.A05);
    }
}
