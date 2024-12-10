package X;

/* renamed from: X.6sB  reason: invalid class name and case insensitive filesystem */
public final class C135426sB {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135426sB) {
                C135426sB r5 = (C135426sB) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, (C17880vN.A03(this.A02) + C17900vP.A00(this.A00)) * 31);
    }

    public C135426sB(String str, String str2, String str3) {
        C72473Md.A1I(str, str3);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarCoinFlipPoseBackgroundAsset(url=");
        C108965cb.A1U(A10, this.A02);
        A10.append(this.A00);
        A10.append(", backgroundId=");
        return C17900vP.A0B(this.A01, A10);
    }
}
