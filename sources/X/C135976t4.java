package X;

/* renamed from: X.6t4  reason: invalid class name and case insensitive filesystem */
public final class C135976t4 {
    public final AnonymousClass6RX A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135976t4) {
                C135976t4 r5 = (C135976t4) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((AnonymousClass001.A0k(this.A00) * 31) + C17900vP.A00(this.A04)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17900vP.A00(this.A02)) * 31) + C108955ca.A06(this.A03);
    }

    public C135976t4(AnonymousClass6RX r1, Integer num, String str, String str2, String str3) {
        this.A00 = r1;
        this.A04 = str;
        this.A01 = num;
        this.A02 = str2;
        this.A03 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("QrHandlerExternalEntryPointData(type=");
        A10.append(this.A00);
        A10.append(", token=");
        A10.append(this.A04);
        A10.append(", source=");
        A10.append(this.A01);
        A10.append(", referer=");
        A10.append(this.A02);
        A10.append(", textHash=");
        return C17900vP.A0B(this.A03, A10);
    }
}
