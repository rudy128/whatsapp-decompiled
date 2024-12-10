package X;

import android.net.Uri;

/* renamed from: X.Chx  reason: case insensitive filesystem */
public final class C25559Chx {
    public final Uri A00;
    public final boolean A01;
    public final boolean A02;

    public C25559Chx(Uri uri) {
        this.A00 = uri;
        this.A01 = false;
        this.A02 = false;
    }

    public C25559Chx(boolean z, Uri uri) {
        this.A00 = uri;
        this.A01 = true;
        this.A02 = z;
    }
}
