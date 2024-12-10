package X;

/* renamed from: X.22p  reason: invalid class name and case insensitive filesystem */
public class C442222p extends AnonymousClass206 {
    public String A00;
    public String A01;
    public C54032dU A02;

    public void A0i(String str) {
        synchronized (this.A0w) {
            super.A0i(str);
            this.A01 = str;
        }
    }

    public String A17() {
        String str;
        synchronized (this.A0w) {
            str = this.A01;
        }
        return str;
    }

    public void A18(String str) {
        synchronized (this.A0w) {
            this.A01 = str;
            this.A02 = null;
            super.A0i(str);
        }
    }
}
