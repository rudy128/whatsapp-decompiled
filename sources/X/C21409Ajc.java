package X;

import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ajc  reason: case insensitive filesystem */
public final /* synthetic */ class C21409Ajc implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C191969nU A03;
    public final /* synthetic */ File A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ CountDownLatch A08;
    public final /* synthetic */ AtomicReference A09;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0089, code lost:
        if (r17 >= r4) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (r19 > ((long) r11)) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r1 = r30
            X.9nU r13 = r1.A03
            java.io.File r9 = r1.A04
            int r12 = r1.A00
            int r11 = r1.A01
            long r4 = r1.A02
            java.lang.String r0 = r1.A05
            r24 = r0
            java.util.List r0 = r1.A06
            r29 = r0
            java.util.List r15 = r1.A07
            java.util.concurrent.atomic.AtomicReference r14 = r1.A09
            java.util.concurrent.CountDownLatch r0 = r1.A08
            r28 = r0
            r8 = 0
            r0 = 7
            X.C108965cb.A1P(r15, r0, r14)
            r1 = 9
            r0 = r28
            X.C18070vi.A0d(r0, r1)
            X.1L7 r10 = r13.A0A     // Catch:{ all -> 0x0148 }
            java.lang.String r7 = X.C41361wE.A06(r10, r9)     // Catch:{ all -> 0x0148 }
            if (r7 != 0) goto L_0x003a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = "gdrive/encrypted-re-upload/collect-files-to-be-uploaded/file-upload-path-is-null/ "
            X.C17900vP.A0X(r9, r0, r1)     // Catch:{ all -> 0x0148 }
            goto L_0x0092
        L_0x003a:
            java.util.Map r6 = r13.A0K     // Catch:{ all -> 0x0148 }
            java.lang.Object r3 = r6.get(r7)     // Catch:{ all -> 0x0148 }
            X.A2d r3 = (X.C19990A2d) r3     // Catch:{ all -> 0x0148 }
            if (r3 == 0) goto L_0x0092
            X.1oW r0 = r13.A07     // Catch:{ all -> 0x0148 }
            r27 = r0
            boolean r0 = r27.A01()     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x0092
            java.util.concurrent.atomic.AtomicLong r0 = r13.A0Q     // Catch:{ 8gm -> 0x0136 }
            r0.incrementAndGet()     // Catch:{ 8gm -> 0x0136 }
            boolean r0 = X.C20127A8m.A0A(r3)     // Catch:{ 8gm -> 0x0136 }
            if (r0 == 0) goto L_0x0068
            java.util.concurrent.atomic.AtomicLong r0 = r13.A0O     // Catch:{ 8gm -> 0x0136 }
            r0.incrementAndGet()     // Catch:{ 8gm -> 0x0136 }
            java.util.concurrent.atomic.AtomicLong r2 = r13.A0N     // Catch:{ 8gm -> 0x0136 }
            long r0 = r9.length()     // Catch:{ 8gm -> 0x0136 }
            r2.addAndGet(r0)     // Catch:{ 8gm -> 0x0136 }
            goto L_0x0092
        L_0x0068:
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.A0L     // Catch:{ 8gm -> 0x0136 }
            r26 = r0
            boolean r0 = r26.get()     // Catch:{ 8gm -> 0x0136 }
            if (r0 != 0) goto L_0x0096
            java.util.concurrent.atomic.AtomicLong r0 = r13.A0P     // Catch:{ 8gm -> 0x0136 }
            long r19 = r0.get()     // Catch:{ 8gm -> 0x0136 }
            java.util.concurrent.atomic.AtomicLong r0 = r13.A0M     // Catch:{ 8gm -> 0x0136 }
            long r17 = r0.get()     // Catch:{ 8gm -> 0x0136 }
            boolean r16 = X.C108975cc.A1D(r11, r12)
            long r0 = (long) r12
            int r2 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x008b
            int r0 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
        L_0x008b:
            if (r16 == 0) goto L_0x0096
            long r0 = (long) r11
            int r2 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0096
        L_0x0092:
            r28.countDown()
            return
        L_0x0096:
            boolean r0 = X.C20127A8m.A0A(r3)     // Catch:{ 8gm -> 0x0136 }
            r16 = 1
            r1 = r0 ^ 1
            java.lang.String r0 = "should not pass encrypted file to the method"
            X.C17960vV.A0F(r1, r0)     // Catch:{ 8gm -> 0x0136 }
            java.lang.String r1 = r9.getAbsolutePath()     // Catch:{ 8gm -> 0x0136 }
            X.C18070vi.A0X(r1)     // Catch:{ 8gm -> 0x0136 }
            X.1NW r0 = r13.A01     // Catch:{ 8gm -> 0x0136 }
            r18 = r0
            int r1 = X.C20127A8m.A00(r0, r3, r10, r1)     // Catch:{ 8gm -> 0x0136 }
            r0 = 3
            if (r1 != r0) goto L_0x0131
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ 8gm -> 0x0136 }
            java.lang.Object[] r1 = X.AnonymousClass3MX.A1b(r7, r8)     // Catch:{ 8gm -> 0x0136 }
            java.lang.String r0 = "remote-file-same-as-local"
            r1[r16] = r0     // Catch:{ 8gm -> 0x0136 }
            r0 = 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ 8gm -> 0x0136 }
            java.lang.String r0 = "gdrive/encrypted-re-upload/get-files-to-be-uploaded fileUploadPath is %s, fileStatus is %s."
            X.C108955ca.A1W(r0, r2, r1)     // Catch:{ 8gm -> 0x0136 }
            X.17r r0 = r13.A00     // Catch:{ 8gm -> 0x0136 }
            r17 = r0
            X.1NT r0 = r13.A03     // Catch:{ 8gm -> 0x0136 }
            r19 = r0
            X.AMX r1 = r13.A05     // Catch:{ 8gm -> 0x0136 }
            X.1NM r0 = r13.A0B     // Catch:{ 8gm -> 0x0136 }
            X.A2r r2 = new X.A2r     // Catch:{ 8gm -> 0x0136 }
            r16 = r2
            r20 = r1
            r21 = r10
            r22 = r0
            r23 = r9
            r25 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ 8gm -> 0x0136 }
            java.util.concurrent.atomic.AtomicLong r10 = r13.A0P     // Catch:{ 8gm -> 0x0136 }
            long r18 = r10.get()     // Catch:{ 8gm -> 0x0136 }
            java.util.concurrent.atomic.AtomicLong r7 = r13.A0M     // Catch:{ 8gm -> 0x0136 }
            long r16 = r7.get()     // Catch:{ 8gm -> 0x0136 }
            boolean r13 = X.C108975cc.A1D(r11, r12)
            long r0 = (long) r12
            int r12 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r12 < 0) goto L_0x00ff
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x012b
        L_0x00ff:
            if (r13 == 0) goto L_0x0107
            long r0 = (long) r11
            int r4 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0107
            goto L_0x012b
        L_0x0107:
            r0 = r29
            r0.add(r2)     // Catch:{ 8gm -> 0x0136 }
            java.lang.String r1 = r3.A06     // Catch:{ 8gm -> 0x0136 }
            java.lang.String r0 = r2.A05     // Catch:{ 8gm -> 0x0136 }
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ 8gm -> 0x0136 }
            if (r0 != 0) goto L_0x0120
            r15.add(r3)     // Catch:{ 8gm -> 0x0136 }
            java.lang.String r0 = r3.A01()     // Catch:{ 8gm -> 0x0136 }
            r6.remove(r0)     // Catch:{ 8gm -> 0x0136 }
        L_0x0120:
            r10.incrementAndGet()     // Catch:{ 8gm -> 0x0136 }
            long r0 = r2.A00()     // Catch:{ 8gm -> 0x0136 }
            r7.addAndGet(r0)     // Catch:{ 8gm -> 0x0136 }
            goto L_0x0143
        L_0x012b:
            r0 = r26
            r0.set(r8)     // Catch:{ 8gm -> 0x0136 }
            goto L_0x0143
        L_0x0131:
            r27.A01()     // Catch:{ 8gm -> 0x0136 }
            goto L_0x0092
        L_0x0136:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = "gdrive/encrypted-re-upload/get-files-to-be-uploaded problem with a file "
            X.C108995ce.A1J(r9, r0, r1, r2)     // Catch:{ all -> 0x0148 }
            r14.set(r2)     // Catch:{ all -> 0x0148 }
        L_0x0143:
            r27.A01()     // Catch:{ all -> 0x0148 }
            goto L_0x0092
        L_0x0148:
            r0 = move-exception
            r28.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21409Ajc.run():void");
    }

    public /* synthetic */ C21409Ajc(C191969nU r1, File file, String str, List list, List list2, CountDownLatch countDownLatch, AtomicReference atomicReference, int i, int i2, long j) {
        this.A03 = r1;
        this.A04 = file;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A05 = str;
        this.A06 = list;
        this.A07 = list2;
        this.A09 = atomicReference;
        this.A08 = countDownLatch;
    }
}
