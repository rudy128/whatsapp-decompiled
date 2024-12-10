package X;

import android.net.Uri;

public final class AI4 implements C22404B6h {
    public final String A00;
    public final String A01;
    public final Uri A02;

    public String toString() {
        return C18070vi.A0H(this.A02);
    }

    public AI4(Uri uri) {
        this.A02 = uri;
        this.A00 = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        C18070vi.A0X(schemeSpecificPart);
        this.A01 = schemeSpecificPart;
        uri.getPath();
    }

    public String BYd() {
        return this.A00;
    }
}
