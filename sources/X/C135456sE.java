package X;

import android.graphics.Bitmap;

/* renamed from: X.6sE  reason: invalid class name and case insensitive filesystem */
public final class C135456sE {
    public final Bitmap A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135456sE) {
                C135456sE r5 = (C135456sE) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A02, (AnonymousClass000.A0L(this.A00) + C17900vP.A00(this.A01)) * 31);
    }

    public C135456sE(Bitmap bitmap, String str, String str2) {
        this.A00 = bitmap;
        this.A01 = str;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarCoinFlipBackgroundPoseData(bitmap=");
        A10.append(this.A00);
        A10.append(", accessibilityLabel=");
        A10.append(this.A01);
        A10.append(", backgroundId=");
        return C17900vP.A0B(this.A02, A10);
    }
}
