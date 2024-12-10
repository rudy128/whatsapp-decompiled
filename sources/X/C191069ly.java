package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9ly  reason: invalid class name and case insensitive filesystem */
public class C191069ly {
    public final BB8 A00;
    public final AtomicBoolean A01 = C108965cb.A0w();
    public final AtomicInteger A02 = new AtomicInteger(2);
    public final String[] A03 = new String[2];

    public C191069ly(BB8 bb8) {
        this.A00 = bb8;
    }

    public void A00(int i, String str) {
        String[] strArr = this.A03;
        strArr[i] = str;
        if (this.A02.decrementAndGet() == 0 && AnonymousClass8BV.A1Z(this.A01)) {
            this.A00.C7Y(strArr);
        }
    }
}
