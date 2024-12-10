package X;

/* renamed from: X.6sp  reason: invalid class name and case insensitive filesystem */
public final class C135826sp {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135826sp) {
                C135826sp r5 = (C135826sp) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A00, C17890vO.A02(this.A01, C17890vO.A02(this.A02, C17880vN.A03(this.A03))));
    }

    public C135826sp(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ReelsItem(url=");
        A10.append(this.A03);
        A10.append(", thumbnailUrl=");
        A10.append(this.A02);
        A10.append(", avatarUrl=");
        A10.append(this.A01);
        A10.append(", author=");
        return C17900vP.A0B(this.A00, A10);
    }
}
