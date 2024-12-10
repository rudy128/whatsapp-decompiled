package X;

/* renamed from: X.6tf  reason: invalid class name and case insensitive filesystem */
public final class C136346tf {
    public final int A00;
    public final long A01;
    public final C122646Re A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136346tf) {
                C136346tf r8 = (C136346tf) obj;
                if (this.A01 != r8.A01 || !C18070vi.A18(this.A06, r8.A06) || !C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A03, r8.A03) || this.A00 != r8.A00 || this.A02 != r8.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, ((((((((((AnonymousClass000.A0I(this.A01) * 31) + C17900vP.A00(this.A06)) * 31) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A04)) * 31) + C108955ca.A06(this.A03)) * 31) + this.A00) * 31);
    }

    public C136346tf(C122646Re r1, String str, String str2, String str3, String str4, int i, long j) {
        this.A01 = j;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A00 = i;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StatusCrosspostingInfo(messageRowId=");
        A10.append(this.A01);
        A10.append(", crosspostingSessionId=");
        A10.append(this.A06);
        A10.append(", uniqueId=");
        A10.append(this.A05);
        A10.append(", mediaFilePath=");
        A10.append(this.A04);
        A10.append(", directUrlPath=");
        A10.append(this.A03);
        A10.append(", state=");
        A10.append(this.A00);
        A10.append(", destination=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
