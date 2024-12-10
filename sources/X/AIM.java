package X;

public class AIM implements C22407B6l {
    public final C192849p5 A00;
    public final /* synthetic */ C20123A8i A01;

    public AIM(C20123A8i a8i, C192849p5 r2) {
        this.A01 = a8i;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0131, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x013e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0017, code lost:
        if (r5.A01 != r5.A04) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x004e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f9 A[Catch:{ all -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010a A[Catch:{ all -> 0x0140 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel() {
        /*
            r14 = this;
            X.A8i r4 = r14.A01
            java.lang.Object r2 = r4.A05
            monitor-enter(r2)
            X.9p5 r5 = r14.A00     // Catch:{ all -> 0x0143 }
            monitor-enter(r5)     // Catch:{ all -> 0x0143 }
            boolean r0 = r5.A03     // Catch:{ all -> 0x0140 }
            monitor-exit(r5)     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x013d
            monitor-enter(r5)     // Catch:{ all -> 0x0143 }
            boolean r0 = r5.A03     // Catch:{ all -> 0x0140 }
            if (r0 != 0) goto L_0x0019
            int r3 = r5.A01     // Catch:{ all -> 0x0140 }
            int r1 = r5.A04     // Catch:{ all -> 0x0140 }
            r0 = 1
            if (r3 == r1) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            monitor-exit(r5)     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x013d
            X.A7A r8 = r4.A01     // Catch:{ all -> 0x0143 }
            monitor-enter(r5)     // Catch:{ all -> 0x0143 }
            boolean r0 = r5.A03     // Catch:{ all -> 0x0140 }
            monitor-exit(r5)     // Catch:{ all -> 0x0143 }
            if (r0 == 0) goto L_0x0028
            r0 = 0
            goto L_0x0130
        L_0x0028:
            monitor-enter(r5)     // Catch:{ all -> 0x0143 }
            boolean r1 = r5.A03     // Catch:{ all -> 0x0140 }
            r0 = 1
            if (r1 == 0) goto L_0x003f
            java.lang.String r6 = "ExternalLoadRequest"
            java.lang.String r4 = "Already finished: %s"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x0140 }
            X.A4D r0 = r5.A07     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x0140 }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x0140 }
            X.C26294Cx6.A0H(r6, r4, r3)     // Catch:{ all -> 0x0140 }
            goto L_0x0041
        L_0x003f:
            r5.A03 = r0     // Catch:{ all -> 0x0140 }
        L_0x0041:
            monitor-exit(r5)     // Catch:{ all -> 0x0143 }
            java.util.Map r0 = r8.A04     // Catch:{ all -> 0x0143 }
            java.util.List r0 = X.AnonymousClass8BS.A0t(r5, r0)     // Catch:{ all -> 0x0143 }
            if (r0 == 0) goto L_0x0132
            java.util.Iterator r13 = X.AnonymousClass8BV.A0y(r0)     // Catch:{ all -> 0x0143 }
        L_0x004e:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0143 }
            if (r0 == 0) goto L_0x012c
            java.lang.Object r7 = r13.next()     // Catch:{ all -> 0x0143 }
            X.9lh r7 = (X.C190899lh) r7     // Catch:{ all -> 0x0143 }
            boolean r0 = r5.A00()     // Catch:{ all -> 0x0143 }
            if (r0 == 0) goto L_0x006d
            int r0 = r7.A01     // Catch:{ all -> 0x0143 }
            int r1 = r0 + -1
            r7.A01 = r1     // Catch:{ all -> 0x0143 }
            int r0 = r7.A00     // Catch:{ all -> 0x0143 }
            if (r0 > 0) goto L_0x004e
            if (r1 <= 0) goto L_0x008e
            goto L_0x004e
        L_0x006d:
            int r0 = r7.A00     // Catch:{ all -> 0x0143 }
            int r0 = r0 + -1
            r7.A00 = r0     // Catch:{ all -> 0x0143 }
            if (r0 > 0) goto L_0x004e
            int r0 = r7.A01     // Catch:{ all -> 0x0143 }
            if (r0 <= 0) goto L_0x008e
            java.util.Map r1 = r8.A02     // Catch:{ all -> 0x0143 }
            X.AEq r0 = r7.A03     // Catch:{ all -> 0x0143 }
            X.A6K r0 = r0.A01     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x0143 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0143 }
            X.9zP r1 = (X.C199089zP) r1     // Catch:{ all -> 0x0143 }
            if (r1 == 0) goto L_0x004e
            r0 = 1
            r1.A01(r0)     // Catch:{ all -> 0x0143 }
            goto L_0x004e
        L_0x008e:
            X.AEq r0 = r7.A03     // Catch:{ all -> 0x0143 }
            X.A6K r0 = r0.A01     // Catch:{ all -> 0x0143 }
            java.lang.String r6 = r0.A0A     // Catch:{ all -> 0x0143 }
            java.util.Map r1 = r8.A02     // Catch:{ all -> 0x0143 }
            java.lang.Object r0 = r1.get(r6)     // Catch:{ all -> 0x0143 }
            X.9zP r0 = (X.C199089zP) r0     // Catch:{ all -> 0x0143 }
            r12 = 1
            if (r0 != 0) goto L_0x00a7
            boolean r0 = r7.A02     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x0105
            X.A7A.A03(r7, r8)     // Catch:{ all -> 0x0143 }
            goto L_0x0102
        L_0x00a7:
            X.A65 r9 = r0.A01     // Catch:{ all -> 0x0143 }
            java.lang.Object r4 = r9.A03     // Catch:{ all -> 0x0143 }
            monitor-enter(r4)     // Catch:{ all -> 0x0143 }
            X.A05 r3 = r0.A00     // Catch:{ all -> 0x0129 }
            java.lang.Integer r11 = r3.A00     // Catch:{ all -> 0x0129 }
            java.lang.Integer r0 = X.AnonymousClass00R.A0N     // Catch:{ all -> 0x0129 }
            if (r11 == r0) goto L_0x0104
            java.lang.Integer r10 = X.AnonymousClass00R.A0Y     // Catch:{ all -> 0x0129 }
            if (r11 == r10) goto L_0x0104
            X.A05 r0 = r9.A00     // Catch:{ all -> 0x0129 }
            if (r0 != r3) goto L_0x00ea
            java.util.Map r0 = r9.A05     // Catch:{ all -> 0x0129 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0129 }
            com.facebook.cameracore.ardelivery.listener.CancelableToken r0 = (com.facebook.cameracore.ardelivery.listener.CancelableToken) r0     // Catch:{ all -> 0x0129 }
            boolean r11 = r0.cancel()     // Catch:{ all -> 0x0129 }
            if (r11 == 0) goto L_0x00e1
            r0 = 0
            r9.A00 = r0     // Catch:{ all -> 0x0129 }
        L_0x00cd:
            r3.A00(r10)     // Catch:{ all -> 0x0129 }
            java.util.Map r10 = r9.A06     // Catch:{ all -> 0x0129 }
            X.AEq r0 = r3.A04     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = r0.A08     // Catch:{ all -> 0x0129 }
            java.lang.Object r0 = r10.remove(r0)     // Catch:{ all -> 0x0129 }
            if (r0 != r3) goto L_0x010f
            java.util.Map r0 = r9.A05     // Catch:{ all -> 0x0129 }
            r0.remove(r3)     // Catch:{ all -> 0x0129 }
        L_0x00e1:
            X.A65.A01(r9)     // Catch:{ all -> 0x0129 }
            java.util.ArrayList r0 = X.A65.A00(r9)     // Catch:{ all -> 0x0129 }
            monitor-exit(r4)     // Catch:{ all -> 0x0129 }
            goto L_0x00f4
        L_0x00ea:
            java.util.Queue r0 = r9.A07     // Catch:{ all -> 0x0129 }
            boolean r0 = r0.remove(r3)     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x0115
            r11 = 1
            goto L_0x00cd
        L_0x00f4:
            X.A65.A02(r9, r0)     // Catch:{ all -> 0x0143 }
            if (r11 == 0) goto L_0x0105
            r0 = 0
            r7.A02 = r0     // Catch:{ all -> 0x0143 }
            X.A7A.A03(r7, r8)     // Catch:{ all -> 0x0143 }
            r1.remove(r6)     // Catch:{ all -> 0x0143 }
        L_0x0102:
            r12 = 0
            goto L_0x0105
        L_0x0104:
            monitor-exit(r4)     // Catch:{ all -> 0x0129 }
        L_0x0105:
            X.A7A.A00(r7, r8)     // Catch:{ all -> 0x0143 }
            if (r12 == 0) goto L_0x004e
            X.A7A.A02(r7, r8)     // Catch:{ all -> 0x0143 }
            goto L_0x004e
        L_0x010f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0129 }
            r0.<init>()     // Catch:{ all -> 0x0129 }
            goto L_0x0128
        L_0x0115:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = "Cancelling download which is not current or queued: state="
            r1.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.Integer r0 = r3.A00     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = X.AnonymousClass9OW.A00(r0)     // Catch:{ all -> 0x0129 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)     // Catch:{ all -> 0x0129 }
        L_0x0128:
            throw r0     // Catch:{ all -> 0x0129 }
        L_0x0129:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0129 }
            goto L_0x0142
        L_0x012c:
            r8.A04(r5)     // Catch:{ all -> 0x0143 }
            r0 = 1
        L_0x0130:
            monitor-exit(r2)     // Catch:{ all -> 0x0143 }
            return r0
        L_0x0132:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "ExternalLoadRequest not present in mExternalToInternalMap: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass8BX.A0V(r5, r0, r1)     // Catch:{ all -> 0x0143 }
            goto L_0x0142
        L_0x013d:
            monitor-exit(r2)     // Catch:{ all -> 0x0143 }
            r0 = 0
            return r0
        L_0x0140:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0143 }
        L_0x0142:
            throw r0     // Catch:{ all -> 0x0143 }
        L_0x0143:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0143 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIM.cancel():boolean");
    }
}
