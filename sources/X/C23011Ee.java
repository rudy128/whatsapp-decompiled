package X;

/* renamed from: X.1Ee  reason: invalid class name and case insensitive filesystem */
public class C23011Ee extends Thread {
    public C23011Ee() {
        super("DestructorThread");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|(3:3|(3:5|(2:7|19)(1:20)|8)|18)|9|(1:11)|12|(2:14|17)(1:16)|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:15:0x0000, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
        L_0x0000:
            X.1Ec r0 = X.AnonymousClass1Ea.A00     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.ref.ReferenceQueue r0 = X.AnonymousClass1Ea.A02     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.ref.Reference r4 = r0.remove()     // Catch:{ InterruptedException -> 0x0000 }
            X.1Am r4 = (X.C22521Am) r4     // Catch:{ InterruptedException -> 0x0000 }
            r4.destruct()     // Catch:{ InterruptedException -> 0x0000 }
            X.1Am r0 = r4.previous     // Catch:{ InterruptedException -> 0x0000 }
            if (r0 != 0) goto L_0x0034
            X.1Eb r0 = X.AnonymousClass1Ea.A01     // Catch:{ InterruptedException -> 0x0000 }
            java.util.concurrent.atomic.AtomicReference r1 = r0.A00     // Catch:{ InterruptedException -> 0x0000 }
            r0 = 0
            java.lang.Object r3 = r1.getAndSet(r0)     // Catch:{ InterruptedException -> 0x0000 }
            X.1Am r3 = (X.C22521Am) r3     // Catch:{ InterruptedException -> 0x0000 }
        L_0x001c:
            if (r3 == 0) goto L_0x0034
            X.1Am r2 = r3.next     // Catch:{ InterruptedException -> 0x0000 }
            X.1Ec r0 = X.AnonymousClass1Ea.A00     // Catch:{ InterruptedException -> 0x0000 }
            X.1Am r1 = r0.A00     // Catch:{ InterruptedException -> 0x0000 }
            X.1Am r0 = r1.next     // Catch:{ InterruptedException -> 0x0000 }
            r3.next = r0     // Catch:{ InterruptedException -> 0x0000 }
            r1.next = r3     // Catch:{ InterruptedException -> 0x0000 }
            X.1Am r0 = r3.next     // Catch:{ InterruptedException -> 0x0000 }
            if (r0 == 0) goto L_0x0030
            r0.previous = r3     // Catch:{ InterruptedException -> 0x0000 }
        L_0x0030:
            r3.previous = r1     // Catch:{ InterruptedException -> 0x0000 }
            r3 = r2
            goto L_0x001c
        L_0x0034:
            X.1Am r1 = r4.next     // Catch:{ InterruptedException -> 0x0000 }
            if (r1 == 0) goto L_0x003c
            X.1Am r0 = r4.previous     // Catch:{ InterruptedException -> 0x0000 }
            r1.previous = r0     // Catch:{ InterruptedException -> 0x0000 }
        L_0x003c:
            X.1Am r0 = r4.previous     // Catch:{ InterruptedException -> 0x0000 }
            if (r0 == 0) goto L_0x0000
            r0.next = r1     // Catch:{ InterruptedException -> 0x0000 }
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23011Ee.run():void");
    }
}
