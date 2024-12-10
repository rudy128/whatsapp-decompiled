package X;

import android.net.Uri;

/* renamed from: X.45a  reason: invalid class name and case insensitive filesystem */
public final class C822545a extends C83374Ew {
    public final Uri A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C822545a) && C18070vi.A18(this.A00, ((C822545a) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C822545a(Uri uri) {
        this.A00 = uri;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Response(redirectUrl=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
