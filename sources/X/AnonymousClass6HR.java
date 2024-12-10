package X;

import android.net.Uri;

/* renamed from: X.6HR  reason: invalid class name */
public final class AnonymousClass6HR extends C123226Tp {
    public final int A00;
    public final Uri A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6HR) {
                AnonymousClass6HR r5 = (AnonymousClass6HR) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public AnonymousClass6HR(Uri uri, int i) {
        this.A01 = uri;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EditSticker(uri=");
        A10.append(this.A01);
        A10.append(", origin=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
