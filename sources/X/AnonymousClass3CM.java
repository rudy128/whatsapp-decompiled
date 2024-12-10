package X;

/* renamed from: X.3CM  reason: invalid class name */
public class AnonymousClass3CM implements Runnable {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public AnonymousClass3CM(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A06 = obj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x011f, code lost:
        if (X.C63652tT.A00(r11.A0F, (X.C139506yx) r11.A2W.get(), r2) == false) goto L_0x0121;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x007d */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r7 = r26
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0186;
                case 1: goto L_0x00a4;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r7.A02
            X.9h9 r2 = (X.C188269h9) r2
            java.lang.Object r4 = r7.A03
            java.io.File r4 = (java.io.File) r4
            java.lang.Object r5 = r7.A04
            javax.crypto.Cipher r5 = (javax.crypto.Cipher) r5
            java.lang.Object r3 = r7.A05
            android.os.ParcelFileDescriptor r3 = (android.os.ParcelFileDescriptor) r3
            java.lang.Object r1 = r7.A06
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0098 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ OperationCanceledException -> 0x0084, IOException -> 0x007d }
            r6.<init>(r4)     // Catch:{ OperationCanceledException -> 0x0084, IOException -> 0x007d }
            if (r5 != 0) goto L_0x0029
            r8 = r6
            goto L_0x002e
        L_0x0029:
            javax.crypto.CipherInputStream r8 = new javax.crypto.CipherInputStream     // Catch:{ all -> 0x0073 }
            r8.<init>(r6, r5)     // Catch:{ all -> 0x0073 }
        L_0x002e:
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r9 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ all -> 0x0069 }
            r9.<init>(r3)     // Catch:{ all -> 0x0069 }
            X.C20048A4r.A01(r1, r8, r9, r0)     // Catch:{ IOException -> 0x0037 }
            goto L_0x0055
        L_0x0037:
            r7 = move-exception
            java.lang.String r0 = "ExportMigrationApi/Failed while writing to a remote stream "
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x005f }
            X.190 r5 = r2.A00     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "xpm-export-api-remote-write"
            java.lang.String r0 = r7.getMessage()     // Catch:{ all -> 0x005f }
            r5.A0E(r1, r0, r7)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "Failed to write data."
            r3.closeWithError(r0)     // Catch:{ IOException -> 0x004f }
            goto L_0x0055
        L_0x004f:
            r1 = move-exception
            java.lang.String r0 = "ExportMigrationApi/Failed to close the pipe after an error."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x005f }
        L_0x0055:
            r9.close()     // Catch:{ all -> 0x0069 }
            r8.close()     // Catch:{ all -> 0x0073 }
            r6.close()     // Catch:{ OperationCanceledException -> 0x0084, IOException -> 0x007d }
            goto L_0x008d
        L_0x005f:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0064 }
            goto L_0x0068
        L_0x0064:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0069 }
        L_0x0068:
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0073 }
        L_0x0072:
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0078 }
            goto L_0x007c
        L_0x0078:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ OperationCanceledException -> 0x0084, IOException -> 0x007d }
        L_0x007c:
            throw r1     // Catch:{ OperationCanceledException -> 0x0084, IOException -> 0x007d }
        L_0x007d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "ExportMigrationApi/Failed to close stream for "
            goto L_0x008a
        L_0x0084:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "ExportMigrationApi/Cancelled by remote peer while streaming "
        L_0x008a:
            X.C17900vP.A0Z(r4, r0, r1)     // Catch:{ all -> 0x0098 }
        L_0x008d:
            monitor-enter(r2)
            java.util.Set r0 = r2.A04     // Catch:{ all -> 0x0095 }
            r0.remove(r3)     // Catch:{ all -> 0x0095 }
            monitor-exit(r2)     // Catch:{ all -> 0x0095 }
            return
        L_0x0095:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0095 }
            throw r0
        L_0x0098:
            r1 = move-exception
            monitor-enter(r2)
            java.util.Set r0 = r2.A04     // Catch:{ all -> 0x00a1 }
            r0.remove(r3)     // Catch:{ all -> 0x00a1 }
            monitor-exit(r2)     // Catch:{ all -> 0x00a1 }
            throw r1
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a1 }
            throw r0
        L_0x00a4:
            java.lang.Object r11 = r7.A02
            X.3uP r11 = (X.AnonymousClass3uP) r11
            java.lang.Object r10 = r7.A03
            java.util.List r10 = (java.util.List) r10
            long r15 = r7.A01
            java.lang.Object r9 = r7.A04
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.Object r8 = r7.A05
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r12 = r7.A06
            java.util.Iterator r19 = r10.iterator()
            r17 = 0
            r14 = 0
            r20 = 0
            r7 = 0
        L_0x00c2:
            boolean r0 = r19.hasNext()
            r6 = 1
            if (r0 == 0) goto L_0x0105
            X.21V r1 = X.C17880vN.A0b(r19)
            X.2rc r13 = X.AnonymousClass206.A00(r1)
            X.1Sb r5 = r11.A1E
            X.1h3 r0 = r11.A1F
            X.9gX r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x0102
            long r3 = r0.A01
        L_0x00dd:
            boolean r0 = r13.A0c
            if (r0 == 0) goto L_0x00f3
            r1 = 0
        L_0x00e3:
            long r3 = r3 - r1
            long r20 = r20 + r3
            X.1Sb r1 = r11.A1E
            java.lang.String r0 = r13.A0L
            X.2h4 r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0105
            int r7 = r7 + 1
            goto L_0x00c2
        L_0x00f3:
            java.lang.String r0 = r13.A0L
            r1 = 0
            if (r0 == 0) goto L_0x00e3
            X.2h4 r0 = r5.A00(r0)
            if (r0 == 0) goto L_0x00e3
            long r1 = r0.A0A
            goto L_0x00e3
        L_0x0102:
            long r3 = r1.A01
            goto L_0x00dd
        L_0x0105:
            int r0 = r10.size()
            if (r0 != r6) goto L_0x0121
            X.206 r2 = r11.getFMessage()
            X.00H r0 = r11.A2W
            java.lang.Object r1 = r0.get()
            X.6yx r1 = (X.C139506yx) r1
            X.0ve r0 = r11.A0F
            boolean r0 = X.C63652tT.A00(r0, r1, r2)
            r25 = 1
            if (r0 != 0) goto L_0x0123
        L_0x0121:
            r25 = 0
        L_0x0123:
            int r0 = r10.size()
            if (r7 != r0) goto L_0x0145
            int r0 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x012f
            r20 = r15
        L_0x012f:
            X.1KB r1 = r11.A0S
            X.7R2 r0 = new X.7R2
            r15 = r0
            r16 = r11
            r17 = r9
            r18 = r8
            r19 = r14
            r22 = r25
            r15.<init>(r16, r17, r18, r19, r20, r22)
            r1.A0J(r0)
            return
        L_0x0145:
            java.lang.Object r0 = r9.getTag()
            if (r0 != r12) goto L_0x01a8
            X.1KB r1 = r11.A0S
            X.7R2 r0 = new X.7R2
            r17 = r0
            r18 = r11
            r19 = r9
            r20 = r8
            r21 = r6
            r22 = r15
            r24 = r25
            r17.<init>(r18, r19, r20, r21, r22, r24)
            r1.A0J(r0)
            X.1Sb r1 = r11.A1E
            X.0vb r0 = r11.A0D
            android.content.Context r17 = r11.getContext()
            X.2Pd r2 = new X.2Pd
            r22 = r10
            r23 = r15
            r16 = r2
            r18 = r9
            r19 = r0
            r20 = r1
            r21 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25)
            X.10I r1 = r11.A1X
            java.lang.Void[] r0 = new java.lang.Void[r14]
            r1.CGD(r2, r0)
            return
        L_0x0186:
            java.lang.Object r0 = r7.A02
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            long r4 = r7.A01
            java.lang.Object r6 = r7.A03
            X.1hG r6 = (X.C32481hG) r6
            java.lang.Object r3 = r7.A04
            X.23j r3 = (X.C444223j) r3
            java.lang.Object r1 = r7.A05
            X.2mw r1 = (X.C59822mw) r1
            java.lang.Object r2 = r7.A06
            X.121 r2 = (X.AnonymousClass121) r2
            X.1W2 r0 = r0.A01
            X.206 r0 = r0.A03(r4)
            if (r0 == 0) goto L_0x01a9
            r0 = 0
            r6.A03(r3, r0)
        L_0x01a8:
            return
        L_0x01a9:
            java.lang.String r0 = r1.A06
            r3.A02 = r0
            int r0 = r1.A00
            r3.A00 = r0
            long r0 = r1.A03
            r3.A01 = r0
            r2.BBM(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CM.run():void");
    }
}
