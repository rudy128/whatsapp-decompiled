package X;

/* renamed from: X.6tT  reason: invalid class name and case insensitive filesystem */
public final class C136226tT {
    public final C1418377d A00;
    public final C1418377d A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136226tT) {
                C136226tT r5 = (C136226tT) obj;
                if (!C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A032 = C17880vN.A03(this.A05);
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A01, C17890vO.A02(this.A04, (C17890vO.A02(this.A03, A032) + C108955ca.A06(this.A02)) * 31)));
    }

    public C136226tT(C1418377d r1, C1418377d r2, String str, String str2, String str3, String str4) {
        this.A05 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A01 = r1;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarCoinFlipPoseAsset(url=");
        A10.append(this.A05);
        A10.append(", emojis=");
        C108965cb.A1U(A10, this.A03);
        A10.append(this.A02);
        A10.append(", poseId=");
        A10.append(this.A04);
        A10.append(", passiveAnimation=");
        A10.append(this.A01);
        A10.append(", activeAnimation=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
