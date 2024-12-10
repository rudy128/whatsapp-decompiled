package X;

import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.189  reason: invalid class name */
public class AnonymousClass189 implements AnonymousClass188 {
    public final AnonymousClass18A A00 = new AnonymousClass18A();
    public final AnonymousClass18A A01 = new AnonymousClass18A();
    public final AnonymousClass183 A02;
    public final CountDownLatch A03 = new CountDownLatch(1);

    public void A00(int i) {
        C200710s r0;
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        AnonymousClass183 r02 = this.A02;
        if (z) {
            r0 = r02.A01;
        } else {
            r0 = r02.A02;
        }
        r0.A02();
        try {
            this.A03.await();
        } catch (InterruptedException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("wamruntime: unexpected thread interrupt (");
            sb.append(e);
            sb.append(")");
            Log.a(sb.toString());
            Thread.currentThread().interrupt();
        }
    }

    public void A01(Object obj, int i, int i2) {
        AnonymousClass18A r0;
        if (i2 == 1 || i2 == 0) {
            r0 = this.A00;
        } else {
            r0 = this.A01;
        }
        r0.A00(i, obj);
    }

    public void CHx(Object obj, int i, int i2) {
        C70823Cq r2;
        C200710s r1;
        AnonymousClass183 r12 = this.A02;
        Object obj2 = obj;
        int i3 = i;
        int i4 = i2;
        if (r12.A00.A06()) {
            A01(obj, i, i2);
            return;
        }
        if (i2 == 0 || i2 == 1) {
            r1 = r12.A01;
            r2 = new C70823Cq((Object) this, i4, obj2, i3, 7);
        } else {
            r1 = r12.A02;
            if (r1.A06()) {
                A00(i2);
                A01(obj, i, i2);
                return;
            }
            r2 = new C70823Cq((Object) this, i4, obj2, i3, 8);
        }
        r1.execute(r2);
    }

    public AnonymousClass189(AnonymousClass183 r3) {
        this.A02 = r3;
    }
}
