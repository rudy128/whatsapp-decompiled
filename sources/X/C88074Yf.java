package X;

/* renamed from: X.4Yf  reason: invalid class name and case insensitive filesystem */
public final class C88074Yf {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C88074Yf() {
        this((String) null, (String) null, 443, 587, true);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88074Yf) {
                C88074Yf r5 = (C88074Yf) obj;
                if (!(C18070vi.A18(this.A02, r5.A02) && C18070vi.A18(this.A05, r5.A05) && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A002 = C17900vP.A00(this.A02) * 31;
        String str = this.A05;
        if (str != null) {
            i = str.hashCode();
        }
        return C17880vN.A01((((((A002 + i) * 31) + this.A00) * 31) + this.A01) * 31, this.A06);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProxySetting(domain=");
        A10.append(this.A02);
        A10.append(", ip=");
        A10.append(this.A05);
        A10.append(", chatPort=");
        A10.append(this.A00);
        A10.append(", mediaPort=");
        A10.append(this.A01);
        A10.append(", useChatTls=");
        return C17900vP.A0F(A10, this.A06);
    }

    public C88074Yf(String str, String str2, int i, int i2, boolean z) {
        this.A02 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = z;
        if (str == null) {
            if (str2 == null) {
                str = "";
            } else {
                str = str2;
            }
        }
        this.A03 = str;
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append(':');
        this.A04 = C17880vN.A0t(A11, i);
    }
}
