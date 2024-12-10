package X;

import java.net.HttpURLConnection;

public class AUZ implements AnonymousClass8BJ {
    public final Boolean A00;
    public final HttpURLConnection A01;

    public C179229Hb BMO(AnonymousClass181 r3, Integer num, Integer num2) {
        return new C179229Hb(r3, this.A01.getErrorStream(), num, num2);
    }

    public C179229Hb BMP(AnonymousClass181 r3, Integer num, Integer num2) {
        return new C179229Hb(r3, this.A01.getInputStream(), num, num2);
    }

    public void close() {
        this.A01.disconnect();
    }

    public AUZ(Boolean bool, HttpURLConnection httpURLConnection) {
        this.A01 = httpURLConnection;
        this.A00 = bool;
    }
}
