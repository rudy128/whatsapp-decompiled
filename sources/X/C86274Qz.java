package X;

/* renamed from: X.4Qz  reason: invalid class name and case insensitive filesystem */
public final class C86274Qz {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C18600wl A03;
    public final AnonymousClass00H A04;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fa, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C29681ch r14, java.util.List r15, java.util.List r16) {
        /*
            r13 = this;
            r3 = 1
            X.1CJ r0 = r13.A00
            X.1ci r4 = r0.A0A(r14)
            boolean r0 = r4 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x0145
            X.2Dk r4 = (X.C46162Dk) r4
            if (r4 == 0) goto L_0x0145
            java.util.Iterator r12 = r16.iterator()
        L_0x0013:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0073
            X.206 r9 = X.C17880vN.A0Y(r12)
            X.00H r0 = r13.A02
            java.lang.Object r8 = r0.get()
            X.2jX r8 = (X.C57722jX) r8
            r11 = 0
            X.C18070vi.A0d(r9, r11)
            X.1Cd r0 = r8.A02     // Catch:{ all -> 0x0061 }
            X.1au r10 = r0.A05()     // Catch:{ all -> 0x0061 }
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x005a }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x005a }
            java.lang.String r6 = "newsletter_message_enforcements"
            java.lang.String r5 = "message_row_id = ?"
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x005a }
            long r0 = r9.A0x     // Catch:{ all -> 0x005a }
            X.C17880vN.A1V(r2, r11, r0)     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/removeMessageEnforcement"
            r7.A04(r6, r5, r0, r2)     // Catch:{ all -> 0x005a }
            r10.close()     // Catch:{ all -> 0x0061 }
            X.1Q2 r0 = r8.A00     // Catch:{ all -> 0x0061 }
            android.os.Handler r2 = r0.A02     // Catch:{ all -> 0x0061 }
            r1 = 3
            X.3Bz r0 = new X.3Bz     // Catch:{ all -> 0x0061 }
            r0.<init>(r8, r9, r1)     // Catch:{ all -> 0x0061 }
            boolean r0 = r2.post(r0)     // Catch:{ all -> 0x0061 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0067
        L_0x005a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ all -> 0x0061 }
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            X.1IU r1 = new X.1IU
            r1.<init>(r0)
        L_0x0067:
            java.lang.Throwable r1 = X.C30671eK.A00(r1)
            if (r1 == 0) goto L_0x0013
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/failed to remove message enforcement"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0013
        L_0x0073:
            X.00H r5 = r13.A02
            java.lang.Object r0 = r5.get()
            X.2jX r0 = (X.C57722jX) r0
            java.util.ArrayList r0 = r0.A00(r4)
            java.util.ArrayList r3 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0087:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0091
            X.C72463Mc.A1L(r3, r1)
            goto L_0x0087
        L_0x0091:
            java.util.Iterator r11 = r15.iterator()
        L_0x0095:
            r10 = 0
        L_0x0096:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0110
            X.206 r7 = X.C17880vN.A0Y(r11)
            X.205 r2 = r7.A0v
            boolean r0 = r3.contains(r2)
            if (r0 == 0) goto L_0x00ba
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "NewsletterMessageEnforcementUpdater/skipping adding enforcement for msg: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " due to already existing"
            X.C17890vO.A1A(r1, r0)
            goto L_0x0096
        L_0x00ba:
            java.lang.Object r6 = r5.get()
            X.2jX r6 = (X.C57722jX) r6
            X.1Cd r0 = r6.A02     // Catch:{ all -> 0x00fb }
            X.1au r8 = r0.A05()     // Catch:{ all -> 0x00fb }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x00f4 }
            r9.<init>()     // Catch:{ all -> 0x00f4 }
            java.lang.String r2 = "message_row_id"
            long r0 = r7.A0x     // Catch:{ all -> 0x00f4 }
            X.C17880vN.A19(r9, r2, r0)     // Catch:{ all -> 0x00f4 }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00f4 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00f4 }
            java.lang.String r1 = "newsletter_message_enforcements"
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/insertMessageEnforcement"
            r2.A06(r1, r0, r9)     // Catch:{ all -> 0x00f4 }
            r8.close()     // Catch:{ all -> 0x00fb }
            X.1Q2 r0 = r6.A00     // Catch:{ all -> 0x00fb }
            android.os.Handler r2 = r0.A02     // Catch:{ all -> 0x00fb }
            r1 = 4
            X.3Bz r0 = new X.3Bz     // Catch:{ all -> 0x00fb }
            r0.<init>(r6, r7, r1)     // Catch:{ all -> 0x00fb }
            boolean r0 = r2.post(r0)     // Catch:{ all -> 0x00fb }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00fb }
            goto L_0x0101
        L_0x00f4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x00fb }
            throw r0     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r0 = move-exception
            X.1IU r1 = new X.1IU
            r1.<init>(r0)
        L_0x0101:
            java.lang.Throwable r1 = X.C30671eK.A00(r1)
            if (r1 == 0) goto L_0x010e
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/failed to insert message enforcement"
            com.whatsapp.util.Log.e(r0, r1)
            if (r10 == 0) goto L_0x0095
        L_0x010e:
            r10 = 1
            goto L_0x0096
        L_0x0110:
            if (r10 == 0) goto L_0x0120
            X.00H r0 = r13.A04
            java.lang.Object r1 = r0.get()
            X.4Rq r1 = (X.C86444Rq) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r1.A00(r4, r0)
            return
        L_0x0120:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x014a
            X.00H r0 = r13.A04
            java.lang.Object r3 = r0.get()
            X.4Rq r3 = (X.C86444Rq) r3
            r1 = 1
            int r0 = r4.A01
            int r1 = r1 << r1
            r2 = r1 ^ -1
            r2 = r2 & r0
            X.00H r0 = r3.A01
            java.lang.Object r1 = r0.get()
            X.1i5 r1 = (X.C32991i5) r1
            X.1ch r0 = r4.A0M()
            r1.A08(r0, r2)
            return
        L_0x0145:
            java.lang.String r0 = "NewsletterMessageEnforcementUpdater/Unexpectedly couldn't find newsletter to update"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86274Qz.A00(X.1ch, java.util.List, java.util.List):void");
    }

    public C86274Qz(AnonymousClass1CJ r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, C18600wl r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }
}
