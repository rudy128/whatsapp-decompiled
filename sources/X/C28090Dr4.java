package X;

/* renamed from: X.Dr4  reason: case insensitive filesystem */
public final class C28090Dr4 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $formatString;
    public final /* synthetic */ boolean $isTranscriptionManuallyRequestedSinceChatOpen;
    public final /* synthetic */ C441822l $message;
    public final /* synthetic */ C25802CmF $sharedTranscriptionState;
    public final /* synthetic */ C26186CuA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28090Dr4(C26186CuA cuA, C441822l r3, C25802CmF cmF, String str, boolean z) {
        super(1);
        this.$message = r3;
        this.this$0 = cuA;
        this.$sharedTranscriptionState = cmF;
        this.$formatString = str;
        this.$isTranscriptionManuallyRequestedSinceChatOpen = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b4, code lost:
        if (X.C18070vi.A18(r1, r0) == false) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r40) {
        /*
            r39 = this;
            r4 = r40
            X.CmV r4 = (X.C25818CmV) r4
            r6 = 0
            X.C18070vi.A0d(r4, r6)
            r7 = r39
            X.22l r0 = r7.$message
            r11 = 0
            if (r0 == 0) goto L_0x009e
            X.25F r0 = r0.A00
            X.229 r2 = r0.A02
            X.7LG r2 = (X.AnonymousClass7LG) r2
        L_0x0015:
            X.22l r0 = r7.$message
            if (r0 == 0) goto L_0x009b
            X.205 r10 = r0.A0v
        L_0x001b:
            X.205 r0 = r4.A03
            if (r2 == 0) goto L_0x0098
            X.CM2 r5 = r2.A04
        L_0x0021:
            X.CM2 r1 = r4.A06
            boolean r0 = X.C18070vi.A18(r10, r0)
            r3 = 1
            if (r0 == 0) goto L_0x0096
            boolean r0 = X.C18070vi.A18(r5, r1)
            if (r0 == 0) goto L_0x0096
            int r9 = r4.A00
        L_0x0032:
            X.22l r1 = r7.$message
            if (r1 == 0) goto L_0x0093
            X.CuA r0 = r7.this$0
            X.00H r0 = r0.A05
            X.4a3 r0 = X.AnonymousClass3MX.A0y(r0)
            boolean r32 = r0.A0C(r1, r3)
        L_0x0042:
            X.22l r1 = r7.$message
            if (r1 == 0) goto L_0x0091
            X.2rc r0 = r1.A02
            if (r0 == 0) goto L_0x0091
            java.lang.String r15 = r0.A0P
        L_0x004c:
            if (r2 == 0) goto L_0x008f
            X.Cho r14 = r2.A02
        L_0x0050:
            if (r1 == 0) goto L_0x008d
            boolean r4 = r1.A02
        L_0x0054:
            X.22l r0 = r7.$message
            if (r0 == 0) goto L_0x008a
            java.util.List r26 = r0.A1G()
        L_0x005c:
            if (r2 == 0) goto L_0x0087
            boolean r0 = r2.A07
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r0)
        L_0x0064:
            X.Bvr r0 = X.C24125Bvr.A00
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 == 0) goto L_0x00b6
            X.22l r0 = r7.$message
            if (r0 == 0) goto L_0x00b6
            X.CuA r0 = r7.this$0
            X.00H r0 = r0.A04
            java.lang.Object r2 = r0.get()
            X.ClJ r2 = (X.C25749ClJ) r2
            X.22l r1 = r7.$message
            X.BuE r0 = new X.BuE
            r0.<init>(r1, r6, r6)
            java.lang.Object r1 = r0.A02()
            monitor-enter(r2)
            goto L_0x00a1
        L_0x0087:
            r23 = r11
            goto L_0x0064
        L_0x008a:
            r26 = r11
            goto L_0x005c
        L_0x008d:
            r4 = 0
            goto L_0x0054
        L_0x008f:
            r14 = r11
            goto L_0x0050
        L_0x0091:
            r15 = r11
            goto L_0x004c
        L_0x0093:
            r32 = 0
            goto L_0x0042
        L_0x0096:
            r9 = 1
            goto L_0x0032
        L_0x0098:
            X.Bvt r5 = X.C24127Bvt.A00
            goto L_0x0021
        L_0x009b:
            r10 = r11
            goto L_0x001b
        L_0x009e:
            r2 = r11
            goto L_0x0015
        L_0x00a1:
            X.C6h r0 = r2.A00     // Catch:{ all -> 0x00a4 }
            goto L_0x00a7
        L_0x00a4:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00a7:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x010d
            java.lang.Object r0 = r0.A02()
        L_0x00ae:
            boolean r0 = X.C18070vi.A18(r1, r0)
            r30 = 1
            if (r0 != 0) goto L_0x00b8
        L_0x00b6:
            r30 = 0
        L_0x00b8:
            X.22l r0 = r7.$message
            if (r0 == 0) goto L_0x010a
            int r0 = r0.A0D
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r28 = r2.toMillis(r0)
        L_0x00c5:
            X.CmF r0 = r7.$sharedTranscriptionState
            if (r0 == 0) goto L_0x0103
            X.6TT r8 = r0.A00
            boolean r3 = r0.A02
            boolean r6 = r0.A03
            boolean r2 = r0.A06
            boolean r1 = r0.A04
            X.205 r11 = r0.A01
            boolean r0 = r0.A05
        L_0x00d7:
            X.22l r13 = r7.$message
            java.lang.String r12 = r7.$formatString
            boolean r7 = r7.$isTranscriptionManuallyRequestedSinceChatOpen
            X.CmV r16 = new X.CmV
            r31 = r2
            r33 = r3
            r34 = r6
            r35 = r1
            r36 = r4
            r37 = r7
            r38 = r0
            r25 = r12
            r27 = r9
            r24 = r15
            r22 = r13
            r21 = r5
            r20 = r14
            r19 = r11
            r18 = r10
            r17 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r16
        L_0x0103:
            X.6Al r8 = X.C119926Al.A00
            r3 = 0
            r2 = 0
            r1 = 0
            r0 = 0
            goto L_0x00d7
        L_0x010a:
            r28 = -1
            goto L_0x00c5
        L_0x010d:
            r0 = 0
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28090Dr4.invoke(java.lang.Object):java.lang.Object");
    }
}
