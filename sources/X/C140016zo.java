package X;

/* renamed from: X.6zo  reason: invalid class name and case insensitive filesystem */
public final class C140016zo {
    public final C134366qT A00;
    public final AnonymousClass6R6 A01;
    public final C134376qU A02;
    public final C134396qW A03;
    public final C136186tP A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C140016zo) {
                C140016zo r5 = (C140016zo) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AnonymousClass000.A0L(this.A01) + C17900vP.A00(this.A05)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + C17880vN.A02(this.A03);
    }

    public C140016zo(C134366qT r1, AnonymousClass6R6 r2, C134376qU r3, C134396qW r4, C136186tP r5, String str) {
        this.A01 = r2;
        this.A05 = str;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ResponseHolder(type=");
        A10.append(this.A01);
        A10.append(", otid=");
        A10.append(this.A05);
        A10.append(", textResponse=");
        A10.append(this.A02);
        A10.append(", imageResponse=");
        A10.append(this.A00);
        A10.append(", searchResponse=");
        A10.append(this.A04);
        A10.append(", reelsResponse=");
        return AnonymousClass001.A1F(this.A03, A10);
    }

    public C140016zo() {
        this((C134366qT) null, AnonymousClass6R6.UNKNOWN, (C134376qU) null, (C134396qW) null, (C136186tP) null, (String) null);
    }
}
