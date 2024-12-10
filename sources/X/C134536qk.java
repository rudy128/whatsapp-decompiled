package X;

import android.graphics.Bitmap;

/* renamed from: X.6qk  reason: invalid class name and case insensitive filesystem */
public final class C134536qk {
    public final int A00;
    public final Bitmap A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134536qk) {
                C134536qk r5 = (C134536qk) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass001.A0k(this.A01);
    }

    public C134536qk(int i, Bitmap bitmap) {
        this.A00 = i;
        this.A01 = bitmap;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallFailedBackgroundState(visibility=");
        A10.append(this.A00);
        A10.append(", bitmap=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
