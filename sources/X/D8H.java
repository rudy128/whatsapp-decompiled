package X;

import java.net.URI;

public final class D8H implements C22404B6h {
    public final String A00;
    public final URI A01;

    public String BYd() {
        return this.A00;
    }

    public String toString() {
        return C18070vi.A0H(this.A01);
    }

    public D8H(URI uri) {
        this.A01 = uri;
        this.A00 = uri.getScheme();
        C18070vi.A0X(uri.getSchemeSpecificPart());
        uri.getPath();
    }
}
