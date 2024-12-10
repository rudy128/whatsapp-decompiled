package X;

/* renamed from: X.3Ea  reason: invalid class name */
public class AnonymousClass3Ea extends Thread {
    public final /* synthetic */ C54052dW A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Ea(C54052dW r2) {
        super("PhantomDestructor");
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r3.A02.isEmpty() == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        r3.A00 = false;
        r3.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x001a A[EDGE_INSN: B:31:0x001a->B:9:0x001a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            X.2dW r3 = r5.A00
        L_0x0002:
            r4 = 0
        L_0x0003:
            java.lang.ref.ReferenceQueue r0 = r3.A01     // Catch:{ InterruptedException -> 0x000c }
            java.lang.ref.Reference r1 = r0.remove()     // Catch:{ InterruptedException -> 0x000c }
            X.3Eh r1 = (X.C71193Eh) r1     // Catch:{ InterruptedException -> 0x000c }
            goto L_0x0018
        L_0x000c:
            if (r4 == 0) goto L_0x0003
            java.lang.ref.ReferenceQueue r2 = r3.A01     // Catch:{ InterruptedException -> 0x000c }
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.ref.Reference r1 = r2.remove(r0)     // Catch:{ InterruptedException -> 0x000c }
            X.3Eh r1 = (X.C71193Eh) r1     // Catch:{ InterruptedException -> 0x000c }
        L_0x0018:
            if (r1 != 0) goto L_0x001c
            monitor-enter(r3)
            goto L_0x0031
        L_0x001c:
            com.facebook.wamediajni.WamediaStreamsMP4Muxer$NativeWrapper r0 = r1.A00
            r0.targetDestructed()
            monitor-enter(r3)
            java.util.HashSet r2 = r3.A02     // Catch:{ all -> 0x0049 }
            boolean r1 = r2.remove(r1)     // Catch:{ all -> 0x0049 }
            r0 = 0
            if (r1 == 0) goto L_0x0044
            boolean r4 = r2.isEmpty()     // Catch:{ all -> 0x0049 }
            monitor-exit(r3)
            goto L_0x000c
        L_0x0031:
            java.util.HashSet r0 = r3.A02     // Catch:{ all -> 0x0049 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0049 }
            r0 = 0
            if (r1 == 0) goto L_0x0040
            r3.A00 = r0     // Catch:{ all -> 0x0049 }
            r3.notifyAll()     // Catch:{ all -> 0x0049 }
            goto L_0x0042
        L_0x0040:
            monitor-exit(r3)
            goto L_0x0002
        L_0x0042:
            monitor-exit(r3)
            return
        L_0x0044:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0049 }
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Ea.run():void");
    }
}
