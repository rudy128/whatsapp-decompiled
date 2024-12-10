package X;

import android.graphics.Bitmap;

/* renamed from: X.6tU  reason: invalid class name and case insensitive filesystem */
public final class C136236tU {
    public final Bitmap A00;
    public final C1418377d A01;
    public final C1418377d A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136236tU) {
                C136236tU r5 = (C136236tU) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A00);
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A02, C17890vO.A02(this.A05, (C17890vO.A02(this.A04, A0L) + C108955ca.A06(this.A03)) * 31)));
    }

    public C136236tU(Bitmap bitmap, C1418377d r2, C1418377d r3, String str, String str2, String str3) {
        this.A00 = bitmap;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A02 = r2;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarCoinFlipPoseData(bitmap=");
        A10.append(this.A00);
        A10.append(", emojis=");
        C108965cb.A1U(A10, this.A04);
        A10.append(this.A03);
        A10.append(", poseId=");
        A10.append(this.A05);
        A10.append(", passiveAnimation=");
        A10.append(this.A02);
        A10.append(", activeAnimation=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
