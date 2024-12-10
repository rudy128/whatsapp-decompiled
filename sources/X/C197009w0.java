package X;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.9w0  reason: invalid class name and case insensitive filesystem */
public abstract class C197009w0 {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(java.util.Collection r6, X.C30391dr r7) {
        /*
            boolean r0 = r7 instanceof X.C21639AnU
            if (r0 == 0) goto L_0x0043
            r5 = r7
            X.AnU r5 = (X.C21639AnU) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0043
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L_0x003b
            if (r0 != r2) goto L_0x004c
            java.lang.Object r1 = r5.L$0
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.C30691eM.A01(r4)
        L_0x0024:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r0 = r1.next()
            X.1OB r0 = (X.AnonymousClass1OB) r0
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r0 = r0.BhB(r5)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x003b:
            X.C30691eM.A01(r4)
            java.util.Iterator r1 = r6.iterator()
            goto L_0x0024
        L_0x0043:
            X.AnU r5 = new X.AnU
            r5.<init>(r7)
            goto L_0x0012
        L_0x0049:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x004c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197009w0.A01(java.util.Collection, X.1dr):java.lang.Object");
    }

    public static final Object A00(Collection collection, C30391dr r2) {
        if (collection.isEmpty()) {
            return C18460wS.A00;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C199209zc.A01;
        return new C199209zc((EEF[]) collection.toArray(new EEF[0])).A00(r2);
    }
}
