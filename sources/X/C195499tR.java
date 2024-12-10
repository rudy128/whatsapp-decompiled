package X;

/* renamed from: X.9tR  reason: invalid class name and case insensitive filesystem */
public final class C195499tR {
    public long A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final C18090vk A05;
    public final boolean A06;

    public C195499tR(String str, String str2, String str3, C18090vk r7, int i, long j) {
        C18070vi.A0d(str3, 3);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = i;
        this.A00 = j;
        this.A05 = r7;
        this.A06 = AnonymousClass000.A1O((j > 0 ? 1 : (j == 0 ? 0 : -1)));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195499tR) {
                C195499tR r8 = (C195499tR) obj;
                if (!C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A04, r8.A04) || this.A01 != r8.A01 || this.A00 != r8.A00 || !C18070vi.A18(this.A05, r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A03, C17880vN.A03(this.A02));
        return AnonymousClass000.A0O(this.A05, AnonymousClass001.A0K(this.A00, (C17890vO.A02(this.A04, A022) + this.A01) * 31));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RegMethodItem(id=");
        A10.append(this.A02);
        A10.append(", primaryText=");
        A10.append(this.A03);
        A10.append(", secondaryTextWithoutTime=");
        A10.append(this.A04);
        A10.append(", iconRes=");
        A10.append(this.A01);
        A10.append(", time=");
        A10.append(this.A00);
        A10.append(", onClickHandler=");
        return AnonymousClass001.A1F(this.A05, A10);
    }
}
