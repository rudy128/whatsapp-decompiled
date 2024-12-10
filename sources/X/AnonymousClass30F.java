package X;

/* renamed from: X.30F  reason: invalid class name */
public final class AnonymousClass30F implements C72113Kr {
    public final C19830z4 A00;
    public final AnonymousClass1Nb A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass1M9 A05;
    public final AnonymousClass121 A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ba, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01bb, code lost:
        X.CDX.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01be, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c2, code lost:
        X.CDX.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c5, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqf() {
        /*
            r9 = this;
            X.00H r3 = r9.A04
            java.lang.Object r7 = r3.get()
            X.1i5 r7 = (X.C32991i5) r7
            X.00H r0 = r7.A05
            java.lang.Object r0 = r0.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x006f
            java.lang.String[] r8 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0069 }
            X.9Ig r0 = X.C179509Ig.GUEST     // Catch:{ all -> 0x0069 }
            int r0 = r0.value     // Catch:{ all -> 0x0069 }
            X.C17890vO.A1F(r8, r0)     // Catch:{ all -> 0x0069 }
            X.1Cd r0 = r7.A04     // Catch:{ all -> 0x0069 }
            X.1at r4 = r0.get()     // Catch:{ all -> 0x0069 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0062 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0062 }
            r1 = 1
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "SELECT chat_row_id FROM newsletter WHERE membership IN ("
            r5.append(r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "?"
            java.util.List r2 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x0062 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = ","
            r0 = 0
            java.lang.String r0 = X.C29431cG.A0h(r1, r2, r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = X.C17900vP.A0B(r0, r5)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "NewsletterStore/GET_NEWSLETTER_JID_WITH_MEMBERSHIP_SQL"
            android.database.Cursor r2 = X.C18070vi.A04(r6, r1, r0, r8)     // Catch:{ all -> 0x0062 }
            java.util.ArrayList r0 = X.C32991i5.A00(r2, r7)     // Catch:{ all -> 0x005b }
            r2.close()     // Catch:{ all -> 0x0062 }
            r4.close()     // Catch:{ all -> 0x0069 }
            goto L_0x0071
        L_0x005b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005d }
        L_0x005d:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0062 }
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r1 = move-exception
            java.lang.String r0 = "NewsletterStore/failed to read newsletter"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x006f:
            X.0wS r0 = X.C18460wS.A00
        L_0x0071:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r5 = r0.iterator()
        L_0x0079:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x009e
            X.1BI r4 = X.C17880vN.A0Q(r5)
            X.121 r1 = r9.A06
            r0 = 1
            r1.BIE(r4, r0)
            X.1M9 r0 = r9.A05
            X.1E7 r2 = r0.A0E(r4)
            if (r2 == 0) goto L_0x0079
            X.1Nb r1 = r9.A01
            boolean r0 = r2.A0F()
            r1.A0r(r4, r0)
            r6.add(r2)
            goto L_0x0079
        L_0x009e:
            X.1M9 r1 = r9.A05
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            X.AnonymousClass1M9.A00(r1, r0, r6)
            X.0z4 r7 = r9.A00
            java.lang.String r6 = "nl_cleaned_pinned"
            boolean r0 = r7.A2Y(r6)
            if (r0 != 0) goto L_0x0161
            java.lang.Object r0 = r3.get()
            X.1i5 r0 = (X.C32991i5) r0
            java.util.List r0 = r0.A04()
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x00c7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1ci r0 = (X.C29691ci) r0
            X.1BI r0 = r0.A08()
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x00e2
            r3.add(r1)
            goto L_0x00c7
        L_0x00e2:
            r4.add(r1)
            goto L_0x00c7
        L_0x00e6:
            java.util.ArrayList r2 = X.C29351c6.A0D(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x00ee:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0102
            java.lang.Object r0 = r1.next()
            X.2Dk r0 = (X.C46162Dk) r0
            X.1ch r0 = r0.A0M()
            r2.add(r0)
            goto L_0x00ee
        L_0x0102:
            java.util.Set r8 = X.C29431cG.A12(r2)
            X.1Nb r0 = r9.A01
            java.util.LinkedHashSet r0 = r0.A0e()
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0114:
            boolean r0 = r2.hasNext()
            r3 = 1
            if (r0 == 0) goto L_0x012a
            java.lang.Object r1 = r2.next()
            boolean r0 = X.C29431cG.A18(r8, r1)
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0114
            r5.add(r1)
            goto L_0x0114
        L_0x012a:
            java.util.Iterator r2 = r5.iterator()
        L_0x012e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0147
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.00H r0 = r9.A02
            java.lang.Object r0 = r0.get()
            X.1Co r0 = (X.C22621Co) r0
            X.C18070vi.A0b(r1)
            r0.A03(r1)
            goto L_0x012e
        L_0x0147:
            r7.A1w(r6, r3)
            boolean r0 = X.C17880vN.A1X(r4)
            if (r0 == 0) goto L_0x0161
            X.00H r0 = r9.A03
            java.lang.Object r2 = r0.get()
            X.190 r2 = (X.AnonymousClass190) r2
            java.lang.String r1 = "newsletter-store-returning-non-newsletter-jid"
            java.lang.String r0 = r4.toString()
            r2.A0G(r1, r0, r3)
        L_0x0161:
            X.00H r0 = r9.A07
            java.lang.Object r0 = r0.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            X.0ve r2 = r0.A02
            r1 = 10585(0x2959, float:1.4833E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01c9
            X.00H r0 = r9.A09
            java.lang.Object r0 = r0.get()
            X.11P r0 = (X.AnonymousClass11P) r0
            long r1 = X.AnonymousClass11P.A01(r0)
            r3 = 172800000(0xa4cb800, double:8.53745436E-316)
            long r1 = r1 - r3
            X.00H r0 = r9.A08
            java.lang.Object r0 = r0.get()
            X.1hF r0 = (X.C32471hF) r0
            X.1Cd r0 = r0.A03
            X.1at r4 = r0.get()
            java.lang.String[] r3 = X.C17880vN.A1Z()     // Catch:{ all -> 0x01bf }
            X.9Ig r0 = X.C179509Ig.SUBSCRIBED     // Catch:{ all -> 0x01bf }
            int r0 = r0.value     // Catch:{ all -> 0x01bf }
            X.C17890vO.A1F(r3, r0)     // Catch:{ all -> 0x01bf }
            X.C17890vO.A1K(r3, r1)     // Catch:{ all -> 0x01bf }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01bf }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x01bf }
            java.lang.String r1 = X.C50742Vp.A00     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = "GET_RECENT_VIDEO_MESSAGES_FROM_FOLLOWED_NEWSLETTERS"
            android.database.Cursor r2 = X.C18070vi.A04(r2, r1, r0, r3)     // Catch:{ all -> 0x01bf }
            r4.close()
            X.121 r1 = r9.A06     // Catch:{ all -> 0x01b8 }
            r0 = 0
            r1.Br7(r2, r0)     // Catch:{ all -> 0x01b8 }
            goto L_0x01c6
        L_0x01b8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r1 = move-exception
            X.CDX.A00(r2, r0)
            throw r1
        L_0x01bf:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01c1 }
        L_0x01c1:
            r1 = move-exception
            X.CDX.A00(r4, r0)
            throw r1
        L_0x01c6:
            r2.close()
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30F.Bqf():void");
    }

    public AnonymousClass30F(AnonymousClass1M9 r1, C19830z4 r2, AnonymousClass121 r3, AnonymousClass1Nb r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r5, r1, r6, r7, r8);
        C18070vi.A0x(r4, r2, r9, r3, r10);
        this.A09 = r5;
        this.A05 = r1;
        this.A03 = r6;
        this.A04 = r7;
        this.A07 = r8;
        this.A01 = r4;
        this.A00 = r2;
        this.A02 = r9;
        this.A06 = r3;
        this.A08 = r10;
    }
}
