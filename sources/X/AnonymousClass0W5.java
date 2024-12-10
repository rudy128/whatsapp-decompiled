package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0W5  reason: invalid class name */
public abstract class AnonymousClass0W5 implements AnonymousClass0t4 {
    public final C07300ai A00 = new AtomicInteger(0);

    public static String A01(Object obj, StringBuilder sb) {
        sb.append(")@");
        sb.append(obj.hashCode());
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(int r4) {
        /*
            r3 = this;
        L_0x0000:
            X.0ai r2 = r3.A00
            int r1 = r2.get()
            r0 = r1 & r4
            if (r0 != 0) goto L_0x0012
            r0 = r1 | r4
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0000
        L_0x0012:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0W5.A02(int):void");
    }

    public /* synthetic */ C03460Ig Bjn(C03460Ig r2, C03460Ig r3, C03460Ig r4) {
        return null;
    }
}
