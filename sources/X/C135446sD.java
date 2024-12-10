package X;

import android.graphics.Bitmap;

/* renamed from: X.6sD  reason: invalid class name and case insensitive filesystem */
public final class C135446sD {
    public final Bitmap A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135446sD) {
                C135446sD r5 = (C135446sD) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A00) + C17900vP.A00(this.A02)) * 31) + C108955ca.A06(this.A01);
    }

    public C135446sD(Bitmap bitmap, String str, String str2) {
        this.A00 = bitmap;
        this.A02 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarAssetData(bitmap=");
        A10.append(this.A00);
        A10.append(", emojis=");
        C108965cb.A1U(A10, this.A02);
        return C17900vP.A0B(this.A01, A10);
    }
}
