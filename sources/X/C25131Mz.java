package X;

import android.graphics.Bitmap;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1Mz  reason: invalid class name and case insensitive filesystem */
public class C25131Mz extends C24741Lm {
    public AtomicLong A00 = new AtomicLong(-1);
    public AtomicInteger A01 = new AtomicInteger(SearchActionVerificationClientService.NOTIFICATION_ID);
    public final AnonymousClass1N0 A02;
    public final AnonymousClass11N A03;
    public final String A04;

    public Object A0A(Object obj) {
        C43001z5 r3 = (C43001z5) this.A02.A04(obj);
        if (r3 == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.A00.set(currentTimeMillis);
        r3.A00 = currentTimeMillis;
        A0B();
        return r3.A01;
    }

    public void A0B() {
        if (this instanceof C32071ga) {
            C32071ga r4 = (C32071ga) this;
            if (r4.A02.A02() > 0 && r4.A02 == null) {
                r4.A02 = r4.A00.CGv(r4.A01, 60000);
            }
        }
    }

    public void A0D(C32081gb r4) {
        C66462yD r1;
        AnonymousClass1N0 r2 = this.A02;
        if (r4 == null) {
            r1 = null;
        } else {
            r1 = new C66462yD(r4, 0);
        }
        synchronized (r2) {
            r2.A00 = r1;
        }
    }

    public void A0E(Object obj) {
        this.A02.A05(obj);
    }

    public String BZc() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A04);
        sb.append(":");
        AnonymousClass1N0 r1 = this.A02;
        sb.append(r1.A02());
        sb.append("/");
        sb.append(r1.A01());
        return sb.toString();
    }

    public void C9L(C122516Qr r2, boolean z) {
        int i;
        if (z) {
            i = this.A01.get();
        } else {
            i = 0;
        }
        A0C(i);
    }

    public C25131Mz(AnonymousClass11N r4, C24571Kv r5, String str, int i) {
        super(r5);
        this.A03 = r4;
        this.A04 = str;
        this.A02 = new AnonymousClass1N0(this, i);
    }

    public void A0C(int i) {
        long currentTimeMillis = System.currentTimeMillis() - ((long) i);
        for (Map.Entry entry : this.A02.A06().entrySet()) {
            if (((C43001z5) entry.getValue()).A00 < currentTimeMillis) {
                A0E(entry.getKey());
                entry.getKey();
                Object obj = ((C43001z5) entry.getValue()).A01;
                if (this instanceof C32071ga) {
                    ((Bitmap) obj).getByteCount();
                }
            } else {
                return;
            }
        }
    }

    public void A0F(Object obj, Object obj2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A00.set(currentTimeMillis);
        this.A02.A08(obj, new C43001z5(obj2, currentTimeMillis));
        A0B();
    }
}
