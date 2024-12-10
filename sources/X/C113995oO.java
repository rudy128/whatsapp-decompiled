package X;

import android.graphics.Bitmap;

/* renamed from: X.5oO  reason: invalid class name and case insensitive filesystem */
public final class C113995oO extends C122976Sq {
    public final Bitmap A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C113995oO) {
                C113995oO r5 = (C113995oO) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public C113995oO(Bitmap bitmap, String str) {
        this.A01 = str;
        this.A00 = bitmap;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AiOutputBitmap(type=");
        A10.append(this.A01);
        A10.append(", bitmap=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
