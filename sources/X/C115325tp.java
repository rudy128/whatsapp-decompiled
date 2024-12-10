package X;

import android.graphics.Bitmap;

/* renamed from: X.5tp  reason: invalid class name and case insensitive filesystem */
public final class C115325tp extends C123006St {
    public final Bitmap A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C115325tp) && C18070vi.A18(this.A00, ((C115325tp) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C115325tp(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DisplayBitmap(bitmap=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
