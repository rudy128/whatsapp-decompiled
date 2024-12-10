package X;

/* renamed from: X.2CC  reason: invalid class name */
public class AnonymousClass2CC extends C65802x8 {
    public C55472fp A00;

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0262, code lost:
        r4.notifyAllObservers(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0265, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x024f, code lost:
        r4.notifyAllObservers(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0252, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x025d, code lost:
        r3 = new X.AnonymousClass7KX(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object BKe(X.C199029zJ r29, X.C25681CkC r30, java.lang.String r31) {
        /*
            r28 = this;
            r1 = r30
            X.Boh r1 = (X.C23736Boh) r1
            r3 = r31
            int r0 = r3.hashCode()
            r7 = 0
            r2 = -1
            r5 = r28
            switch(r0) {
                case -1787095995: goto L_0x006c;
                case -962275587: goto L_0x00b4;
                case -178586604: goto L_0x00bf;
                case 140223582: goto L_0x00ca;
                case 526513618: goto L_0x00d5;
                case 963920255: goto L_0x00e0;
                case 1577655195: goto L_0x00eb;
                case 1731322695: goto L_0x00f6;
                case 1925160680: goto L_0x0101;
                case 1931469461: goto L_0x010d;
                case 2071347818: goto L_0x0119;
                default: goto L_0x0011;
            }
        L_0x0011:
            r12 = 0
            r3 = r29
            switch(r2) {
                case 1: goto L_0x0125;
                case 2: goto L_0x0040;
                case 3: goto L_0x0018;
                case 4: goto L_0x022e;
                case 5: goto L_0x0239;
                case 6: goto L_0x0156;
                case 7: goto L_0x0253;
                case 8: goto L_0x01ff;
                case 9: goto L_0x0054;
                case 10: goto L_0x0219;
                default: goto L_0x0017;
            }
        L_0x0017:
            return r12
        L_0x0018:
            java.util.List r0 = r3.A00
            java.lang.Object r2 = r0.get(r7)
            java.util.Map r2 = (java.util.Map) r2
            X.2fp r1 = r5.A00
            if (r2 == 0) goto L_0x0017
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0017
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x0030:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r1.next()
            X.3LX r0 = (X.AnonymousClass3LX) r0
            r0.Bmi(r2)
            goto L_0x0030
        L_0x0040:
            X.2fp r0 = r5.A00
            X.Cku r0 = r0.A00
            X.E4O r0 = r0.A00
            if (r0 == 0) goto L_0x0017
            X.DBR r0 = (X.DBR) r0
            X.EAU r0 = r0.A00
            if (r0 != 0) goto L_0x0266
            java.lang.String r0 = "aleBridge"
            X.C18070vi.A11(r0)
            throw r12
        L_0x0054:
            X.2fp r0 = r5.A00
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x005c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r1.next()
            X.3LX r0 = (X.AnonymousClass3LX) r0
            r0.Bmj()
            goto L_0x005c
        L_0x006c:
            java.lang.String r0 = "bk.action.foa.avatareditor.getprofilephotopath"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            X.2fp r0 = r5.A00
            X.00H r0 = r0.A01
            java.lang.Object r3 = r0.get()
            X.2dd r3 = (X.C54122dd) r3
            X.00H r0 = r3.A02
            X.11S r0 = X.C17880vN.A0H(r0)
            r0.A0I()
            X.1E8 r1 = r0.A0D
            if (r1 == 0) goto L_0x026a
            X.00H r0 = r3.A01
            java.lang.Object r0 = r0.get()
            X.1Lr r0 = (X.C24791Lr) r0
            java.io.File r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x026a
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x026a
            android.net.Uri r2 = android.net.Uri.fromFile(r1)
            X.00H r0 = r3.A00
            java.lang.Object r1 = r0.get()
            X.A4s r1 = (X.C20049A4s) r1
            java.lang.String r0 = X.C18070vi.A0H(r2)
            java.lang.String r12 = r1.A01(r0)
            return r12
        L_0x00b4:
            java.lang.String r0 = "bk.action.UpdatedAvatarV2"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 1
            goto L_0x0011
        L_0x00bf:
            java.lang.String r0 = "bk.action.avatar.live.editor.ClearALECache"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 2
            goto L_0x0011
        L_0x00ca:
            java.lang.String r0 = "bk.action.avatar.live.editor.SendPlatformEvent"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 3
            goto L_0x0011
        L_0x00d5:
            java.lang.String r0 = "bk.action.foa.avatareditor.notifycoinflipoptin"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 4
            goto L_0x0011
        L_0x00e0:
            java.lang.String r0 = "bk.action.DeletedAvatar"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 5
            goto L_0x0011
        L_0x00eb:
            java.lang.String r0 = "bk.action.avatar.live.editor.PrefetchAssets"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 6
            goto L_0x0011
        L_0x00f6:
            java.lang.String r0 = "bk.action.avatars.AsyncAvatarEditorLauncherClosed"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 7
            goto L_0x0011
        L_0x0101:
            java.lang.String r0 = "bk.action.avatar.AvatarEditorWANoticeEventSubmit"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 8
            goto L_0x0011
        L_0x010d:
            java.lang.String r0 = "bk.action.avatar.live.editor.BloksTimeout"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 9
            goto L_0x0011
        L_0x0119:
            java.lang.String r0 = "bk.action.avatar.AvatarEditorEventSubmit"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 10
            goto L_0x0011
        L_0x0125:
            r0 = 1
            java.util.List r2 = r3.A00
            java.lang.Object r3 = r2.get(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r0 = 2
            java.lang.Object r2 = r2.get(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            X.2fp r0 = r5.A00
            X.ALS.A05(r1)
            X.00H r0 = r0.A02
            X.10T r4 = X.C17880vN.A0V(r0)
            r1 = 0
            if (r3 == 0) goto L_0x0154
            boolean r0 = r3.booleanValue()
        L_0x0147:
            if (r2 == 0) goto L_0x014d
            boolean r1 = r2.booleanValue()
        L_0x014d:
            X.7KQ r2 = new X.7KQ
            r2.<init>(r0, r1)
            goto L_0x024f
        L_0x0154:
            r0 = 0
            goto L_0x0147
        L_0x0156:
            java.util.List r10 = r3.A00
            java.lang.Object r4 = r10.get(r7)
            java.util.List r4 = (java.util.List) r4
            r0 = 1
            java.lang.String r15 = X.C17880vN.A0w(r10, r0)
            r0 = 2
            java.lang.Object r3 = r10.get(r0)
            java.util.Map r3 = (java.util.Map) r3
            r0 = 3
            java.lang.Object r8 = r10.get(r0)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r0 = 4
            java.lang.String r19 = X.C17880vN.A0w(r10, r0)
            r0 = 5
            java.lang.String r20 = X.C17880vN.A0w(r10, r0)
            r0 = 6
            java.lang.Object r6 = r10.get(r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r0 = 7
            java.lang.String r16 = X.C17880vN.A0w(r10, r0)
            r0 = 8
            java.lang.Object r2 = r10.get(r0)
            java.util.Map r2 = (java.util.Map) r2
            r0 = 9
            java.lang.String r18 = X.C17880vN.A0w(r10, r0)
            r0 = 10
            java.lang.Object r1 = r10.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            r0 = 11
            java.lang.Object r0 = r10.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            r9 = 12
            java.lang.Object r9 = r10.get(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r11 = 13
            java.lang.String r17 = X.C17880vN.A0w(r10, r11)
            java.lang.String r10 = ""
            if (r15 != 0) goto L_0x01b8
            r15 = r10
        L_0x01b8:
            if (r16 != 0) goto L_0x01bc
            r16 = r10
        L_0x01bc:
            if (r17 != 0) goto L_0x01c0
            r17 = r10
        L_0x01c0:
            if (r9 == 0) goto L_0x01fc
            boolean r26 = r9.booleanValue()
        L_0x01c6:
            if (r8 == 0) goto L_0x01f9
            boolean r27 = r8.booleanValue()
        L_0x01cc:
            if (r3 != 0) goto L_0x01d2
            java.util.HashMap r3 = X.C17880vN.A11()
        L_0x01d2:
            if (r6 == 0) goto L_0x01d8
            boolean r7 = r6.booleanValue()
        L_0x01d8:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r7)
            if (r4 != 0) goto L_0x01e2
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
        L_0x01e2:
            X.CbX r13 = new X.CbX
            r21 = r4
            r22 = r3
            r23 = r0
            r24 = r2
            r25 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.2fp r0 = r5.A00
            X.1G3 r0 = r0.A04
            r0.CPw(r13)
            return r12
        L_0x01f9:
            r27 = 0
            goto L_0x01cc
        L_0x01fc:
            r26 = 0
            goto L_0x01c6
        L_0x01ff:
            java.util.List r1 = r3.A00
            java.lang.String r2 = X.C17880vN.A0w(r1, r7)
            r0 = 1
            java.lang.Object r1 = r1.get(r0)
            X.2fp r0 = r5.A00
            X.00H r0 = r0.A02
            X.10T r4 = X.C17880vN.A0V(r0)
            r0 = 2
            X.35P r3 = new X.35P
            r3.<init>(r0, r2, r1)
            goto L_0x0262
        L_0x0219:
            java.util.List r0 = r3.A00
            java.lang.String r1 = X.C17880vN.A0w(r0, r7)
            X.2fp r0 = r5.A00
            X.00H r0 = r0.A02
            X.10T r4 = X.C17880vN.A0V(r0)
            r0 = 5
            X.7KZ r3 = new X.7KZ
            r3.<init>(r1, r0)
            goto L_0x0262
        L_0x022e:
            X.2fp r0 = r5.A00
            X.00H r0 = r0.A02
            X.10T r4 = X.C17880vN.A0V(r0)
            r0 = 28
            goto L_0x025d
        L_0x0239:
            X.2fp r0 = r5.A00
            X.ALS.A05(r1)
            X.00H r0 = r0.A02
            java.lang.Object r4 = X.C18070vi.A0E(r0)
            X.10T r4 = (X.AnonymousClass10T) r4
            java.lang.String r1 = "user"
            r0 = 4
            X.7KZ r2 = new X.7KZ
            r2.<init>(r1, r0)
        L_0x024f:
            r4.notifyAllObservers(r2)
            return r12
        L_0x0253:
            X.2fp r0 = r5.A00
            X.00H r0 = r0.A02
            X.10T r4 = X.C17880vN.A0V(r0)
            r0 = 27
        L_0x025d:
            X.7KX r3 = new X.7KX
            r3.<init>(r0)
        L_0x0262:
            r4.notifyAllObservers(r3)
            return r12
        L_0x0266:
            r0.BEr()
            return r12
        L_0x026a:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2CC.BKe(X.9zJ, X.CkC, java.lang.String):java.lang.Object");
    }
}
