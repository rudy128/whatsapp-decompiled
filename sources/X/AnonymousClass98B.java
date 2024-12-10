package X;

import java.util.Set;

/* renamed from: X.98B  reason: invalid class name */
public class AnonymousClass98B extends C48392Mh {
    public int A00;
    public AnonymousClass1EC A01;
    public String A02 = "";
    public final Set A03 = C17880vN.A14();

    public void A0i(String str) {
        synchronized (this.A0w) {
            this.A02 = str;
        }
    }

    public String A18() {
        String str;
        synchronized (this.A0w) {
            str = this.A02;
        }
        return str;
    }

    public AnonymousClass98B(AnonymousClass205 r2, int i, long j) {
        super(r2, i, j);
    }

    public String A0P() {
        return A18();
    }
}
