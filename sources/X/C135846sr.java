package X;

/* renamed from: X.6sr  reason: invalid class name and case insensitive filesystem */
public final class C135846sr {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135846sr) {
                C135846sr r5 = (C135846sr) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((C17900vP.A00(this.A01) * 31) + C17900vP.A00(this.A00)) * 31) + C17900vP.A00(this.A02)) * 31) + C108955ca.A06(this.A03);
    }

    public C135846sr(String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarURLs(staticPhoto=");
        A10.append(this.A01);
        A10.append(", backgroundPhoto=");
        A10.append(this.A00);
        A10.append(", activeAnimation=");
        A10.append(this.A02);
        A10.append(", passiveAnimation=");
        return C17900vP.A0B(this.A03, A10);
    }
}
