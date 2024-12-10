package X;

import java.util.ArrayList;

public final class A6V {
    public final AnonymousClass11S A00;
    public final AnonymousClass1CJ A01;
    public final A2O A02;
    public final C34441kU A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass190 A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;

    public void A03(C46162Dk r3) {
        ArrayList A052 = AnonymousClass1ZU.A05(r3);
        AnonymousClass8BR.A0M(this.A08).A0A(A052);
        ((C20131A8r) this.A07.get()).A0I(A052);
    }

    public A6V(AnonymousClass190 r14, AnonymousClass11S r15, AnonymousClass1CJ r16, A2O a2o, C34441kU r18, AnonymousClass00H r19, AnonymousClass00H r20, AnonymousClass00H r21, AnonymousClass00H r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30) {
        AnonymousClass1CJ r10 = r16;
        C18070vi.A0o(r14, r15, r10);
        AnonymousClass00H r9 = r19;
        C18070vi.A0d(r9, 5);
        AnonymousClass00H r7 = r22;
        AnonymousClass00H r11 = r20;
        AnonymousClass00H r8 = r21;
        C18070vi.A0q(r11, r8, r7);
        AnonymousClass00H r6 = r23;
        C18070vi.A0d(r6, 9);
        AnonymousClass00H r2 = r28;
        AnonymousClass00H r4 = r26;
        AnonymousClass00H r3 = r27;
        AnonymousClass00H r12 = r24;
        AnonymousClass00H r5 = r25;
        C18070vi.A0y(r12, r5, r4, r3, r2);
        AnonymousClass00H r1 = r29;
        AnonymousClass00H r0 = r30;
        C18070vi.A0m(r1, r0);
        this.A09 = r14;
        this.A00 = r15;
        this.A01 = r10;
        this.A03 = r18;
        this.A08 = r9;
        this.A0A = r11;
        this.A0B = r8;
        this.A0F = r7;
        this.A07 = r6;
        this.A02 = a2o;
        this.A0E = r12;
        this.A06 = r5;
        this.A04 = r4;
        this.A05 = r3;
        this.A0C = r2;
        this.A0G = r1;
        this.A0D = r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C179509Ig r6, X.C29681ch r7, com.whatsapp.jid.PhoneUserJid r8, com.whatsapp.jid.PhoneUserJid r9, X.A6V r10, boolean r11) {
        /*
            if (r6 == 0) goto L_0x0037
            X.9Ig r0 = X.C179509Ig.ADMIN
            if (r6 != r0) goto L_0x0037
        L_0x0006:
            X.11S r1 = r10.A00
            boolean r0 = r1.A0O(r8)
            if (r0 == 0) goto L_0x008f
            X.00H r0 = r10.A0C
            java.lang.Object r4 = r0.get()
            X.9lI r4 = (X.C190649lI) r4
            X.00H r0 = r4.A02
            java.lang.Object r3 = r0.get()
            X.2jF r3 = (X.C57542jF) r3
            r2 = 0
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.String[] r6 = X.C17880vN.A1Y()
            X.1DL r0 = r3.A01
            long r0 = r0.A09(r7)
            X.C17880vN.A1V(r6, r2, r0)
            X.1Cd r0 = r3.A02
            X.1at r3 = r0.get()
            goto L_0x003a
        L_0x0037:
            if (r11 != 0) goto L_0x0006
            return
        L_0x003a:
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0088 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0088 }
            java.lang.String r1 = "SELECT message_row_id FROM message_newsletter_admin_invite WHERE newsletter_jid_row_id = ? AND expiration != 0 "
            java.lang.String r0 = "GET_NEWSLETTER_ADMIN_INVITE_MESSAGES_BY_NEWSLETTER_SQL"
            android.database.Cursor r2 = r2.A0A(r1, r0, r6)     // Catch:{ all -> 0x0088 }
        L_0x0047:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = "message_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0081 }
            X.C17900vP.A0K(r2, r5, r0)     // Catch:{ all -> 0x0081 }
            goto L_0x0047
        L_0x0057:
            r2.close()     // Catch:{ all -> 0x0088 }
            r3.close()
            java.util.Iterator r3 = r5.iterator()
        L_0x0061:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a2
            long r1 = X.C17890vO.A07(r3)
            X.00H r0 = r4.A01
            X.206 r2 = X.AnonymousClass1W2.A02(r0, r1)
            X.24N r2 = (X.AnonymousClass24N) r2
            if (r2 == 0) goto L_0x0061
            r0 = 0
            r2.A00 = r0
            X.121 r1 = r4.A00
            r0 = 21
            r1.CQx(r2, r0)
            goto L_0x0061
        L_0x0081:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0088 }
            throw r0     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x008f:
            boolean r0 = r1.A0O(r9)
            if (r0 != 0) goto L_0x0097
            if (r11 == 0) goto L_0x00a2
        L_0x0097:
            X.00H r0 = r10.A0C
            java.lang.Object r0 = r0.get()
            X.9lI r0 = (X.C190649lI) r0
            r0.A00(r7, r8)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6V.A00(X.9Ig, X.1ch, com.whatsapp.jid.PhoneUserJid, com.whatsapp.jid.PhoneUserJid, X.A6V, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0097, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C179509Ig r11, X.C29681ch r12, com.whatsapp.jid.PhoneUserJid r13, X.A6V r14) {
        /*
            X.11S r0 = r14.A00
            boolean r0 = r0.A0O(r13)
            if (r0 == 0) goto L_0x0039
            X.00H r0 = r14.A08
            X.1i5 r0 = X.AnonymousClass8BR.A0M(r0)
            r0.A07(r11, r12)
            X.00H r0 = r14.A0F
            java.lang.Object r3 = r0.get()
            X.9mi r3 = (X.C191509mi) r3
            r1 = 0
            X.00H r0 = r3.A05
            java.lang.Object r0 = r0.get()
            X.1Q1 r0 = (X.AnonymousClass1Q1) r0
            r0.A03(r12, r1)
            X.1KB r2 = r3.A00
            r1 = 16
            X.AkP r0 = new X.AkP
            r0.<init>(r3, r12, r1)
            r2.A0J(r0)
            X.9Ig r0 = X.C179509Ig.GUEST
            if (r11 != r0) goto L_0x0038
            A02(r12, r14)
        L_0x0038:
            return
        L_0x0039:
            X.00H r0 = r14.A0E
            java.lang.Object r9 = r0.get()
            X.9p0 r9 = (X.C192799p0) r9
            r7 = 0
            r6 = 1
            r8 = 2
            X.1LW r0 = r9.A00
            long r2 = r0.A09(r12)
            X.1Ln r0 = r9.A03
            X.1E1 r1 = r0.A0A(r13)
            if (r1 == 0) goto L_0x0038
            X.1DL r0 = r9.A01
            long r0 = r0.A09(r1)
            android.content.ContentValues r10 = X.C17880vN.A08()
            int r4 = r11.value
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "role"
            r10.put(r4, r5)
            java.lang.String r12 = "chat_row_id = ? AND jid_row_id = ?"
            X.1Cd r4 = r9.A02
            X.1au r5 = r4.A05()
            X.1xA r4 = r5.BD0()     // Catch:{ all -> 0x0098 }
            r9 = r5
            X.1av r9 = (X.C28801av) r9     // Catch:{ all -> 0x0091 }
            X.1Ev r9 = r9.A02     // Catch:{ all -> 0x0091 }
            java.lang.String r11 = "newsletter_subscribers"
            java.lang.String[] r14 = new java.lang.String[r8]     // Catch:{ all -> 0x0091 }
            X.C17880vN.A1V(r14, r7, r2)     // Catch:{ all -> 0x0091 }
            X.C17880vN.A1V(r14, r6, r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r13 = "UPDATE_NEWSLETTER_FOLLOWERS_MEMBERSHIP"
            r9.A02(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0091 }
            r4.A00()     // Catch:{ all -> 0x0091 }
            r4.close()     // Catch:{ all -> 0x0098 }
            r5.close()
            return
        L_0x0091:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0098 }
            throw r0     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009a }
        L_0x009a:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6V.A01(X.9Ig, X.1ch, com.whatsapp.jid.PhoneUserJid, X.A6V):void");
    }

    public static final void A02(C29681ch r1, A6V a6v) {
        if (((AnonymousClass1Nb) a6v.A0B.get()).A0e().contains(r1)) {
            ((C22621Co) a6v.A0A.get()).A03(r1);
        }
    }

    public void A04(C29681ch r2, Integer num, Throwable th) {
        ((C175308yV) this.A04.get()).A01(r2, num, th);
    }

    public void A05(C29681ch r5, boolean z) {
        Integer num;
        String obj;
        AnonymousClass8BR.A0M(this.A08).A09(r5, z);
        ((C20131A8r) this.A07.get()).A0H(r5);
        if (z) {
            num = AnonymousClass00R.A00;
        } else {
            num = AnonymousClass00R.A01;
        }
        ((C175308yV) this.A04.get()).A00(r5, num);
        if (!AnonymousClass1c4.A02((AnonymousClass1c4) this.A0D.get(), 0)) {
            C193109pY r2 = ((C191039lv) this.A0G.get()).A03;
            ArrayList A0m = C29431cG.A0m(r2.A00());
            if (!C29431cG.A12(A0m).contains(r5.user)) {
                A0m.add(r5.user);
            }
            C193919qs r22 = r2.A00;
            if (A0m.isEmpty()) {
                obj = "";
            } else {
                obj = A0m.toString();
            }
            r22.A01("newsletter_never_nudge_to_unmute_list_key", obj);
        }
    }

    public void A06(String str) {
        AnonymousClass190 r2 = this.A09;
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0a(this, A10);
        r2.A0G(AnonymousClass000.A0y("/NewsletterUnexpectedError", A10), str, true);
    }
}
