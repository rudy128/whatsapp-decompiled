package X;

/* renamed from: X.1eR  reason: invalid class name and case insensitive filesystem */
public abstract class C30741eR {
    public void A00(C20942Abw abw) {
        if (this instanceof C30751eS) {
            C30751eS r3 = (C30751eS) this;
            ((AnonymousClass10I) r3.A07.get()).CGF(new C70633Bw(r3, abw, 36));
        } else if (this instanceof C30761eT) {
            AnonymousClass8oT r5 = (AnonymousClass8oT) abw;
            C18070vi.A0d(r5, 0);
            ((A5T) ((C30761eT) this).A00.get()).A05(r5.A00);
        } else if (!(this instanceof C30791eW)) {
            AnonymousClass8oT r52 = (AnonymousClass8oT) abw;
            C18070vi.A0d(r52, 0);
            ((A5S) ((C30771eU) this).A00.get()).A06(r52.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0078, code lost:
        if (r7.equals("all,all") == false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C20942Abw r9, X.AnonymousClass8SY r10) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C30751eS
            if (r0 == 0) goto L_0x010d
            r6 = r8
            X.1eS r6 = (X.C30751eS) r6
            X.8oR r9 = (X.AnonymousClass8oR) r9
            r0 = 1
            X.C18070vi.A0d(r9, r0)
            X.00H r0 = r6.A03
            java.lang.Object r0 = r0.get()
            X.2id r0 = (X.C57162id) r0
            boolean r0 = r0.A00(r9)
            if (r0 == 0) goto L_0x010d
            X.00H r0 = r6.A01
            java.lang.Object r0 = r0.get()
            X.4R8 r0 = (X.AnonymousClass4R8) r0
            boolean r0 = r0.A00(r9)
            if (r0 == 0) goto L_0x00e2
            long r1 = java.lang.System.currentTimeMillis()
            X.0ve r4 = r6.A00
            r0 = 11035(0x2b1b, float:1.5463E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r7 = X.C18020vd.A05(r3, r4, r0)
            java.lang.String r5 = r9.A05     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r4 = X.C19620yd.A0A     // Catch:{ Exception -> 0x00b6 }
            X.DSQ r0 = X.DSQ.A00     // Catch:{ Exception -> 0x00b6 }
            byte[] r0 = r5.getBytes(r4)     // Catch:{ Exception -> 0x00b6 }
            X.BmB r5 = new X.BmB     // Catch:{ Exception -> 0x00b6 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00b6 }
            if (r7 == 0) goto L_0x007a
            r10.A0E()     // Catch:{ Exception -> 0x00b6 }
            X.Bm6 r4 = r10.A00     // Catch:{ Exception -> 0x00b6 }
            X.8bY r4 = (X.C165658bY) r4     // Catch:{ Exception -> 0x00b6 }
            int r0 = X.C165658bY.CALL_KEY_FIELD_NUMBER     // Catch:{ Exception -> 0x00b6 }
            int r0 = r4.bitField0_     // Catch:{ Exception -> 0x00b6 }
            r0 = r0 | 32
            r4.bitField0_ = r0     // Catch:{ Exception -> 0x00b6 }
            r4.ctwaPayload_ = r5     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r7 = r9.A07     // Catch:{ Exception -> 0x00b6 }
            if (r7 == 0) goto L_0x007a
            r10.A0E()     // Catch:{ Exception -> 0x00b6 }
            X.Bm6 r4 = r10.A00     // Catch:{ Exception -> 0x00b6 }
            X.8bY r4 = (X.C165658bY) r4     // Catch:{ Exception -> 0x00b6 }
            int r0 = r4.bitField0_     // Catch:{ Exception -> 0x00b6 }
            r0 = r0 | 16
            r4.bitField0_ = r0     // Catch:{ Exception -> 0x00b6 }
            r4.ctwaSignals_ = r7     // Catch:{ Exception -> 0x00b6 }
            boolean r0 = X.AnonymousClass1YF.A0T(r7)     // Catch:{ Exception -> 0x00b6 }
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = "all,all"
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x00b6 }
            if (r0 == 0) goto L_0x008b
        L_0x007a:
            r10.A0E()     // Catch:{ Exception -> 0x00b6 }
            X.Bm6 r4 = r10.A00     // Catch:{ Exception -> 0x00b6 }
            X.8bY r4 = (X.C165658bY) r4     // Catch:{ Exception -> 0x00b6 }
            int r0 = X.C165658bY.CALL_KEY_FIELD_NUMBER     // Catch:{ Exception -> 0x00b6 }
            int r0 = r4.bitField0_     // Catch:{ Exception -> 0x00b6 }
            r0 = r0 | 4
            r4.bitField0_ = r0     // Catch:{ Exception -> 0x00b6 }
            r4.conversionData_ = r5     // Catch:{ Exception -> 0x00b6 }
        L_0x008b:
            java.lang.String r5 = r9.A06     // Catch:{ Exception -> 0x00b6 }
            r10.A0E()     // Catch:{ Exception -> 0x00b6 }
            X.Bm6 r4 = r10.A00     // Catch:{ Exception -> 0x00b6 }
            X.8bY r4 = (X.C165658bY) r4     // Catch:{ Exception -> 0x00b6 }
            int r0 = r4.bitField0_     // Catch:{ Exception -> 0x00b6 }
            r0 = r0 | 2
            r4.bitField0_ = r0     // Catch:{ Exception -> 0x00b6 }
            r4.conversionSource_ = r5     // Catch:{ Exception -> 0x00b6 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x00b6 }
            long r4 = r9.A01     // Catch:{ Exception -> 0x00b6 }
            long r1 = r1 - r4
            long r0 = r0.toSeconds(r1)     // Catch:{ Exception -> 0x00b6 }
            int r2 = (int) r0     // Catch:{ Exception -> 0x00b6 }
            r10.A0E()     // Catch:{ Exception -> 0x00b6 }
            X.Bm6 r1 = r10.A00     // Catch:{ Exception -> 0x00b6 }
            X.8bY r1 = (X.C165658bY) r1     // Catch:{ Exception -> 0x00b6 }
            int r0 = r1.bitField0_     // Catch:{ Exception -> 0x00b6 }
            r0 = r0 | 8
            r1.bitField0_ = r0     // Catch:{ Exception -> 0x00b6 }
            r1.conversionDelaySeconds_ = r2     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00bc
        L_0x00b6:
            r1 = move-exception
            java.lang.String r0 = "CtwaAdsEntryPoint/fillE2ECallInfo/failed to fill E2E context info/exception="
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00bc:
            com.whatsapp.jid.UserJid r4 = r9.A00
            X.00H r0 = r6.A06
            java.lang.Object r1 = r0.get()
            X.4Qj r1 = (X.C86144Qj) r1
            r0 = 0
            r1.A00(r4, r0)
            X.00H r0 = r6.A05
            java.lang.Object r5 = r0.get()
            X.4aI r5 = (X.C88654aI) r5
            X.2a8 r0 = r5.A02
            X.0ve r1 = r0.A00
            r0 = 9064(0x2368, float:1.2701E-41)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x010d
            r2 = 0
            r1 = 38
            goto L_0x0109
        L_0x00e2:
            com.whatsapp.jid.UserJid r4 = r9.A00
            X.00H r0 = r6.A06
            java.lang.Object r1 = r0.get()
            X.4Qj r1 = (X.C86144Qj) r1
            r0 = 1
            r1.A00(r4, r0)
            X.00H r0 = r6.A05
            java.lang.Object r5 = r0.get()
            X.4aI r5 = (X.C88654aI) r5
            X.2a8 r0 = r5.A02
            X.0ve r2 = r0.A00
            r1 = 9064(0x2368, float:1.2701E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x010d
            r2 = 0
            r1 = 37
        L_0x0109:
            r0 = 1
            X.C88654aI.A03(r5, r4, r2, r1, r0)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30741eR.A01(X.Abw, X.8SY):void");
    }
}
