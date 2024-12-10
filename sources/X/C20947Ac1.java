package X;

/* renamed from: X.Ac1  reason: case insensitive filesystem */
public final class C20947Ac1 implements AnonymousClass25D {
    public final int A00;
    public final C29681ch A01;
    public final AnonymousClass9Id A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20947Ac1) {
                C20947Ac1 ac1 = (C20947Ac1) obj;
                if (!C18070vi.A18(this.A01, ac1.A01) || this.A00 != ac1.A00 || !C18070vi.A18(this.A04, ac1.A04) || this.A02 != ac1.A02 || !C18070vi.A18(this.A03, ac1.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C17890vO.A02(this.A04, (AnonymousClass000.A0L(this.A01) + this.A00) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C108955ca.A06(this.A03);
    }

    public C20947Ac1(C29681ch r1, AnonymousClass9Id r2, String str, String str2, int i) {
        C72473Md.A1I(r1, str);
        this.A01 = r1;
        this.A00 = i;
        this.A04 = str;
        this.A02 = r2;
        this.A03 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ForwardedNewsletterMessageInfo(newsletterJid=");
        A10.append(this.A01);
        A10.append(", serverMessageId=");
        A10.append(this.A00);
        A10.append(", newsletterName=");
        A10.append(this.A04);
        A10.append(", contentType=");
        A10.append(this.A02);
        A10.append(", accessibilityText=");
        return C17900vP.A0B(this.A03, A10);
    }
}
