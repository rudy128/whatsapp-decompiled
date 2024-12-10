package X;

/* renamed from: X.9Bj  reason: invalid class name and case insensitive filesystem */
public class C177989Bj extends C201010v {
    public final /* synthetic */ A2k A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177989Bj(A2k a2k, String str) {
        super(AnonymousClass001.A1H("PhotosDisk-", str, AnonymousClass000.A10()));
        this.A00 = a2k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x005f A[Catch:{ InterruptedException -> 0x0105 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0075 A[Catch:{ InterruptedException -> 0x0105 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0083 A[Catch:{ InterruptedException -> 0x0105 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ea A[SYNTHETIC, Splitter:B:69:0x00ea] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L_0x0005:
            X.A2k r6 = r11.A00     // Catch:{ InterruptedException -> 0x0105 }
            java.util.Stack r1 = r6.A0A     // Catch:{ InterruptedException -> 0x0105 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x0105 }
            int r0 = r1.size()     // Catch:{ all -> 0x0100 }
            if (r0 != 0) goto L_0x0013
            r1.wait()     // Catch:{ all -> 0x0100 }
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x0100 }
            int r0 = r1.size()     // Catch:{ InterruptedException -> 0x0105 }
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r4 = r6.A05     // Catch:{ InterruptedException -> 0x0105 }
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x0105 }
            int r0 = r1.size()     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x002b
            java.lang.Object r5 = r1.pop()     // Catch:{ all -> 0x00f8 }
            X.9h4 r5 = (X.C188219h4) r5     // Catch:{ all -> 0x00f8 }
        L_0x0029:
            monitor-exit(r4)     // Catch:{ all -> 0x00f8 }
            goto L_0x002d
        L_0x002b:
            r5 = 0
            goto L_0x0029
        L_0x002d:
            if (r5 == 0) goto L_0x00fb
            java.util.concurrent.ConcurrentMap r7 = r5.A05     // Catch:{ InterruptedException -> 0x0105 }
            int r0 = r7.size()     // Catch:{ InterruptedException -> 0x0105 }
            if (r0 == 0) goto L_0x00fb
            java.lang.String r1 = r5.A04     // Catch:{ InterruptedException -> 0x0105 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ InterruptedException -> 0x0105 }
            r9 = 0
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = "^data:image/([a-zA-Z0-9]{2,7});base64,([A-Za-z0-9+/=]+)$"
            java.util.regex.Matcher r1 = X.AnonymousClass8BU.A0z(r1, r0)     // Catch:{ InterruptedException -> 0x0105 }
            boolean r0 = r1.find()     // Catch:{ InterruptedException -> 0x0105 }
            if (r0 == 0) goto L_0x005b
            r0 = 2
            java.lang.String r0 = r1.group(r0)     // Catch:{ InterruptedException -> 0x0105 }
        L_0x0051:
            java.lang.String r8 = r5.A03     // Catch:{ InterruptedException -> 0x0105 }
            java.lang.String r10 = X.C17970vW.A04(r8)     // Catch:{ InterruptedException -> 0x0105 }
            X.C17960vV.A07(r10)     // Catch:{ InterruptedException -> 0x0105 }
            goto L_0x005d
        L_0x005b:
            r0 = r9
            goto L_0x0051
        L_0x005d:
            if (r0 == 0) goto L_0x0075
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r0, r2)     // Catch:{ InterruptedException -> 0x0105 }
            boolean r0 = X.AnonymousClass112.A02()     // Catch:{ InterruptedException -> 0x0105 }
            if (r0 != 0) goto L_0x006f
            android.graphics.Bitmap r1 = X.C72473Md.A0E(r1)     // Catch:{ InterruptedException -> 0x0105 }
            goto L_0x0081
        L_0x006f:
            int r0 = r1.length     // Catch:{ InterruptedException -> 0x0105 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r0)     // Catch:{ InterruptedException -> 0x0105 }
            goto L_0x0081
        L_0x0075:
            X.A5O r3 = r6.A03     // Catch:{ InterruptedException -> 0x0105 }
            int r2 = r5.A02     // Catch:{ InterruptedException -> 0x0105 }
            int r1 = r5.A01     // Catch:{ InterruptedException -> 0x0105 }
            boolean r0 = r5.A07     // Catch:{ InterruptedException -> 0x0105 }
            android.graphics.Bitmap r1 = r3.A02(r10, r2, r1, r0)     // Catch:{ InterruptedException -> 0x0105 }
        L_0x0081:
            if (r1 != 0) goto L_0x00ea
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x0105 }
            java.util.Iterator r10 = X.C17890vO.A0l(r7)     // Catch:{ all -> 0x00e7 }
        L_0x0088:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x00e7 }
            X.BCx r1 = (X.BCx) r1     // Catch:{ all -> 0x00e7 }
            boolean r0 = r1.BKx()     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = r1.getId()     // Catch:{ all -> 0x00e7 }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00a7
            r7.remove(r1)     // Catch:{ all -> 0x00e7 }
        L_0x00a7:
            X.1KB r3 = r6.A02     // Catch:{ all -> 0x00e7 }
            java.util.List r2 = java.util.Collections.singletonList(r1)     // Catch:{ all -> 0x00e7 }
            r1 = 16
            X.AkM r0 = new X.AkM     // Catch:{ all -> 0x00e7 }
            r0.<init>(r9, r2, r6, r1)     // Catch:{ all -> 0x00e7 }
            r3.A0J(r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x0088
        L_0x00b8:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A06     // Catch:{ all -> 0x00e7 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x00e7 }
            if (r0 != 0) goto L_0x00e5
            int r0 = r7.size()     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00e5
            java.util.Stack r3 = r6.A0B     // Catch:{ all -> 0x00e7 }
            r3.remove(r5)     // Catch:{ all -> 0x00e7 }
            r3.push(r5)     // Catch:{ all -> 0x00e7 }
            X.1So r2 = X.C26551So.A0E     // Catch:{ all -> 0x00e7 }
            r0 = 1
            X.C18070vi.A0d(r2, r0)     // Catch:{ all -> 0x00e7 }
            r1 = 0
            X.70W r0 = new X.70W     // Catch:{ all -> 0x00e7 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00e7 }
            r5.A00 = r0     // Catch:{ all -> 0x00e7 }
            monitor-enter(r3)     // Catch:{ all -> 0x00e7 }
            r3.notify()     // Catch:{ all -> 0x00e2 }
            monitor-exit(r3)     // Catch:{ all -> 0x00e2 }
            goto L_0x00e5
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00e2 }
            throw r0     // Catch:{ all -> 0x00e7 }
        L_0x00e5:
            monitor-exit(r4)     // Catch:{ all -> 0x00e7 }
            goto L_0x00fb
        L_0x00e7:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e7 }
            goto L_0x0102
        L_0x00ea:
            X.A5O r0 = r6.A03     // Catch:{ InterruptedException -> 0x0105 }
            r0.A03(r1, r8)     // Catch:{ InterruptedException -> 0x0105 }
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x0105 }
            X.A2k.A00(r6, r8, r1, r7)     // Catch:{ all -> 0x00f5 }
            monitor-exit(r4)     // Catch:{ all -> 0x00f5 }
            goto L_0x00fb
        L_0x00f5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00f5 }
            goto L_0x0102
        L_0x00f8:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00f8 }
            goto L_0x0102
        L_0x00fb:
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ InterruptedException -> 0x0105 }
            goto L_0x0103
        L_0x0100:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0100 }
        L_0x0102:
            throw r0     // Catch:{ InterruptedException -> 0x0105 }
        L_0x0103:
            if (r0 == 0) goto L_0x0005
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177989Bj.run():void");
    }
}
