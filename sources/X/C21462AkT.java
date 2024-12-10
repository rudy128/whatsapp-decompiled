package X;

import android.view.View;

/* renamed from: X.AkT  reason: case insensitive filesystem */
public class C21462AkT implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public C21462AkT(C191129m4 r2, B9G b9g, C22521BBe bBe, C194579rx r5, String str) {
        this.A00 = 9;
        this.A01 = r2;
        this.A02 = r5;
        this.A05 = str;
        this.A04 = b9g;
        this.A03 = bBe;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x030f, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r9.A01, 10132) != false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0a06, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0a07, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0a0a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x019a, code lost:
        if (r0.equals(r10) != false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        X.CDX.A00(r11, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02d9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00c8, code lost:
        r11 = (X.AnonymousClass01E) r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:381:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r55 = this;
            r0 = r55
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x04d7;
                case 1: goto L_0x002c;
                case 2: goto L_0x069b;
                case 3: goto L_0x00b2;
                case 4: goto L_0x0175;
                case 5: goto L_0x06f5;
                case 6: goto L_0x0709;
                case 7: goto L_0x073e;
                case 8: goto L_0x08c3;
                case 9: goto L_0x08d9;
                case 10: goto L_0x0007;
                case 11: goto L_0x0007;
                case 12: goto L_0x0245;
                case 13: goto L_0x090e;
                case 14: goto L_0x03e9;
                case 15: goto L_0x0459;
                case 16: goto L_0x092e;
                case 17: goto L_0x0497;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r0.A02
            X.A8q r3 = (X.C20130A8q) r3
            java.lang.Object r1 = r0.A03
            java.lang.Object r5 = r0.A04
            X.BBN r5 = (X.BBN) r5
            int r2 = r1.hashCode()
            X.8zt r0 = r3.A08
            r1 = 105(0x69, float:1.47E-43)
            X.19a r0 = r0.A01
            r0.A04(r2, r1)
            r4 = 0
            java.lang.String r3 = "XMPP not connected"
            r1 = 1
            X.A1m r0 = new X.A1m
            r0.<init>(r3, r4, r1)
            r5.Bu4(r0)
        L_0x002b:
            return
        L_0x002c:
            java.lang.Object r1 = r0.A01
            X.1F9 r1 = (X.AnonymousClass1F9) r1
            java.lang.Object r3 = r0.A02
            X.1nB r3 = (X.C36001nB) r3
            java.lang.Object r2 = r0.A03
            X.2mz r2 = (X.C59852mz) r2
            java.lang.String r6 = r0.A05
            java.lang.Object r7 = r0.A04
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            r5 = 0
            r4 = 1
            r0 = 4
            X.C18070vi.A0d(r7, r0)
            X.1Fv r0 = r1.getLifecycle()
            X.1Fw r0 = (X.C23391Fw) r0
            X.1Fx r1 = r0.A02
            X.1Fx r0 = X.C23401Fx.DESTROYED
            if (r1 == r0) goto L_0x002b
            X.118 r0 = r2.A03
            android.content.res.Resources r2 = X.AnonymousClass3MW.A05(r0)
            r1 = 2131886376(0x7f120128, float:1.940733E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = X.AnonymousClass3MW.A0x(r2, r6, r0, r5, r1)
            X.C18070vi.A0X(r2)
            r0 = 2000(0x7d0, float:2.803E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r4 = r3.invoke(r2, r1, r0)
            X.4eK r4 = (X.C90594eK) r4
            X.Bik r0 = r4.A01
            X.BIE r6 = r0.A0J
            X.C18070vi.A0X(r6)
            r0 = 2131435508(0x7f0b1ff4, float:1.849286E38)
            android.widget.TextView r3 = X.C17880vN.A0E(r6, r0)
            r0 = 0
            r3.setCompoundDrawablesWithIntrinsicBounds(r7, r0, r0, r0)
            r2 = 16
            r1 = 1098907648(0x41800000, float:16.0)
            android.util.DisplayMetrics r0 = X.C108965cb.A07()
            float r0 = r0.density
            float r1 = r1 * r0
            int r0 = (int) r1
            r3.setCompoundDrawablePadding(r0)
            r1 = 1098907648(0x41800000, float:16.0)
            android.util.DisplayMetrics r0 = X.C108965cb.A07()
            float r0 = r0.density
            float r1 = r1 * r0
            int r1 = (int) r1
            int r0 = r6.getPaddingTop()
            X.C72463Mc.A14(r6, r1, r0)
            int r0 = r3.getPaddingTop()
            X.C72463Mc.A14(r3, r5, r0)
            r3.setGravity(r2)
            r4.A03()
            return
        L_0x00b2:
            java.lang.Object r9 = r0.A01
            X.1IW r9 = (X.AnonymousClass1IW) r9
            java.lang.Object r2 = r0.A02
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r5 = r0.A05
            java.lang.Object r12 = r0.A03
            java.lang.Object r10 = r0.A04
            r3 = 3
            X.C18070vi.A0f(r12, r3, r10)
            boolean r0 = r2 instanceof X.AnonymousClass01E
            if (r0 == 0) goto L_0x002b
            r11 = r2
            X.01E r11 = (X.AnonymousClass01E) r11
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r7 = r11.findViewById(r0)
            if (r7 == 0) goto L_0x002b
            if (r5 == 0) goto L_0x00ea
            android.content.res.Resources r4 = r7.getResources()
            X.0vl r0 = r9.A0H
            int r1 = X.C72453Mb.A0I(r0)
            java.lang.Object[] r0 = X.AnonymousClass8BV.A1b(r5)
            java.lang.String r8 = r4.getString(r1, r0)
            if (r8 != 0) goto L_0x00f8
        L_0x00ea:
            android.content.res.Resources r1 = r7.getResources()
            X.0vl r0 = r9.A0I
            int r0 = X.C72453Mb.A0I(r0)
            java.lang.String r8 = X.AnonymousClass3MY.A0m(r1, r0)
        L_0x00f8:
            X.00H r6 = r9.A06
            X.0vd r0 = X.C17880vN.A0P(r6)
            r5 = 12828(0x321c, float:1.7976E-41)
            X.0vf r4 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r4, r0, r5)
            r0 = 0
            if (r1 == 0) goto L_0x010b
            r0 = 4000(0xfa0, float:5.605E-42)
        L_0x010b:
            X.Bik r15 = X.C23520Bik.A02(r7, r8, r0)
            X.0vl r0 = r9.A0G
            int r0 = X.C72453Mb.A0I(r0)
            java.lang.String r2 = X.C18070vi.A0F(r2, r0)
            boolean r0 = r11 instanceof X.C23341Fq
            if (r0 == 0) goto L_0x016c
            r0 = r11
            X.1Fq r0 = (X.C23341Fq) r0
            if (r0 == 0) goto L_0x016c
            X.4YG r0 = r0.Bb1()
        L_0x0126:
            android.view.View r1 = r0.A00
            if (r1 == 0) goto L_0x012d
            r15.A0B(r1)
        L_0x012d:
            X.0vd r1 = X.C17880vN.A0P(r6)
            boolean r1 = X.C18020vd.A05(r4, r1, r5)
            if (r1 == 0) goto L_0x0142
            X.BIE r1 = r15.A0J
            r13 = 2
            X.78E r8 = new X.78E
            r8.<init>(r9, r10, r11, r12, r13)
            r1.setOnClickListener(r8)
        L_0x0142:
            java.util.List r1 = r0.A01
            X.00H r0 = r9.A0C
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.11C r0 = (X.AnonymousClass11C) r0
            r18 = 0
            X.4eK r13 = new X.4eK
            r14 = r11
            r17 = r1
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            X.78E r1 = new X.78E
            r4 = r1
            r5 = r9
            r6 = r10
            r7 = r11
            r8 = r12
            r9 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            X.Bik r0 = r13.A01
            r0.A0G(r2, r1)
            r13.A03()
            return
        L_0x016c:
            X.0vl r0 = X.AnonymousClass4YG.A02
            java.lang.Object r0 = r0.getValue()
            X.4YG r0 = (X.AnonymousClass4YG) r0
            goto L_0x0126
        L_0x0175:
            java.lang.Object r7 = r0.A01
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r7 = (com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel) r7
            java.lang.Object r3 = r0.A02
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.String r1 = r0.A05
            java.lang.Object r10 = r0.A03
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r2 = r0.A04
            X.206 r5 = com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel.A00(r7, r3, r1)
            if (r5 == 0) goto L_0x002b
            X.9j9 r3 = r7.A04
            long r0 = r5.A0x
            java.lang.Integer r0 = r3.A00(r0)
            if (r0 == 0) goto L_0x019c
            boolean r0 = r0.equals(r10)
            r13 = 1
            if (r0 == 0) goto L_0x019d
        L_0x019c:
            r13 = 0
        L_0x019d:
            long r0 = r5.A0x
            X.1Cd r4 = r3.A00
            X.1au r12 = r4.A05()
            android.content.ContentValues r11 = X.C17880vN.A08()     // Catch:{ all -> 0x0a4e }
            java.lang.String r4 = "message_row_id"
            X.C17880vN.A19(r11, r4, r0)     // Catch:{ all -> 0x0a4e }
            java.lang.String r4 = "rating"
            r11.put(r4, r10)     // Catch:{ all -> 0x0a4e }
            r4 = r12
            X.1av r4 = (X.C28801av) r4     // Catch:{ all -> 0x0a4e }
            X.1Ev r9 = r4.A02     // Catch:{ all -> 0x0a4e }
            java.lang.String r8 = "message_rating"
            java.lang.String r6 = "INSERT_MESSAGE_RATING_SQL"
            r4 = 5
            long r8 = r9.A09(r8, r6, r11, r4)     // Catch:{ all -> 0x0a4e }
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r4)
            java.lang.String r0 = "MessageRatingStore/insertOrUpdateMessageRating/inserted row should have same messageRowId"
            X.C17960vV.A0H(r1, r0)     // Catch:{ all -> 0x0a4e }
            r12.close()
            com.whatsapp.jid.UserJid r0 = r5.A0I()
            java.lang.String r11 = X.C22971Dz.A06(r0)
            X.9XF r9 = r7.A02
            boolean r6 = r5 instanceof X.C439421n
            if (r6 == 0) goto L_0x0243
            r0 = r5
            X.21n r0 = (X.C439421n) r0
            X.2k6 r0 = r0.BaE()
            java.lang.String r8 = r0.A05
        L_0x01e6:
            long r0 = r5.A0x
            java.lang.Integer r0 = r3.A00(r0)
            boolean r4 = X.AnonymousClass000.A1W(r0)
            r1 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            X.3wE r0 = X.C79903wE.A00
            if (r2 != r0) goto L_0x01fa
            r1 = 1
        L_0x01fa:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            X.8rM r1 = new X.8rM
            r1.<init>()
            r1.A05 = r11
            r1.A02 = r3
            r1.A03 = r0
            if (r10 == 0) goto L_0x0215
            java.lang.Long r0 = X.AnonymousClass8BT.A0o(r10)
            r1.A04 = r0
        L_0x0215:
            r1.A01 = r2
            r1.A06 = r8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.A00 = r0
            X.18K r0 = r9.A00
            r0.CC4(r1)
            X.122 r7 = r7.A03
            if (r6 == 0) goto L_0x002b
            X.1Qc r6 = r7.A0i
            long r1 = r5.A0x
            r3 = 0
            r8 = 0
            r9 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1R(r0)
            java.lang.String r0 = "TemplateMessageStore/removeCsatTrigger/parent message row must be set"
            X.C17960vV.A0G(r3, r0)
            X.1Cd r0 = r6.A00
            X.1au r4 = r0.A05()
            goto L_0x0a0b
        L_0x0243:
            r8 = 0
            goto L_0x01e6
        L_0x0245:
            java.lang.Object r9 = r0.A01
            X.9f7 r9 = (X.C187009f7) r9
            java.lang.Object r4 = r0.A02
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r0.A03
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.String r1 = r0.A05
            java.lang.Object r5 = r0.A04
            X.0z4 r5 = (X.C19830z4) r5
            r7 = 0
            r2 = 2
            X.C18070vi.A0d(r3, r2)
            r6 = 3
            X.2j1 r8 = r9.A03     // Catch:{ SecurityException -> 0x036a }
            java.lang.Integer r10 = X.AnonymousClass00R.A01     // Catch:{ SecurityException -> 0x036a }
            if (r3 != r10) goto L_0x0273
            java.lang.String r0 = "content://com.instagram.foabackuptoken.FoaBackupTokenProvider"
        L_0x0265:
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ SecurityException -> 0x036a }
            X.C18070vi.A0X(r0)     // Catch:{ SecurityException -> 0x036a }
            android.content.ContentProviderClient r13 = r8.A00(r4, r0)     // Catch:{ SecurityException -> 0x036a }
            if (r13 == 0) goto L_0x0390
            goto L_0x0276
        L_0x0273:
            java.lang.String r0 = "content://com.facebook.katana.foabackuptoken.FoaBackupTokenProvider/"
            goto L_0x0265
        L_0x0276:
            java.lang.String r0 = "com.facebook.GET_FOA_BACKUP_TOKEN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02f3
            java.lang.String r8 = "FoaBackupTokenProviderManager/failure querying/"
            java.lang.String r12 = "FoaBackupTokenProviderManager/Failed to query FOA token, source: "
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            if (r3 != r10) goto L_0x0289
            goto L_0x028c
        L_0x0289:
            java.lang.String r0 = "content://com.facebook.katana.foabackuptoken.FoaBackupTokenProvider/"
            goto L_0x028e
        L_0x028c:
            java.lang.String r0 = "content://com.instagram.foabackuptoken.FoaBackupTokenProvider"
        L_0x028e:
            android.net.Uri r14 = android.net.Uri.parse(r0)     // Catch:{ RemoteException -> 0x02da, SecurityException -> 0x0397 }
            X.C18070vi.A0X(r14)     // Catch:{ RemoteException -> 0x02da, SecurityException -> 0x0397 }
            java.lang.String[] r15 = X.C17880vN.A1Y()     // Catch:{ RemoteException -> 0x02da, SecurityException -> 0x0397 }
            java.lang.String r16 = "value"
            r15[r7] = r16     // Catch:{ RemoteException -> 0x02da, SecurityException -> 0x0397 }
            r17 = 0
            r18 = r17
            android.database.Cursor r11 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ RemoteException -> 0x02da, SecurityException -> 0x0397 }
            if (r11 == 0) goto L_0x03b5
        L_0x02a7:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x02d3 }
            if (r0 == 0) goto L_0x02ce
            java.lang.String r10 = r11.getString(r7)     // Catch:{ all -> 0x02d3 }
            if (r10 == 0) goto L_0x02bd
            int r0 = r10.length()     // Catch:{ all -> 0x02d3 }
            if (r0 == 0) goto L_0x02bd
            r1.add(r10)     // Catch:{ all -> 0x02d3 }
            goto L_0x02a7
        L_0x02bd:
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02d3 }
            java.lang.String r0 = "FoaBackupTokenProviderManagerFOA token is null or empty, source: "
            r10.append(r0)     // Catch:{ all -> 0x02d3 }
            int r0 = r3.intValue()     // Catch:{ all -> 0x02d3 }
            X.C17900vP.A0o(r10, r0)     // Catch:{ all -> 0x02d3 }
            goto L_0x02a7
        L_0x02ce:
            r11.close()     // Catch:{ RemoteException -> 0x02da, SecurityException -> 0x0397 }
            goto L_0x03b5
        L_0x02d3:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x02d5 }
        L_0x02d5:
            r0 = move-exception
            X.CDX.A00(r11, r10)     // Catch:{ RemoteException -> 0x02da, SecurityException -> 0x0397 }
            throw r0     // Catch:{ RemoteException -> 0x02da, SecurityException -> 0x0397 }
        L_0x02da:
            r11 = move-exception
            java.lang.StringBuilder r10 = X.AnonymousClass000.A11(r12)
            int r0 = r3.intValue()
            r10.append(r0)
            X.C17880vN.A1M(r10, r11)
            X.190 r10 = r9.A00
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RemoteException + "
            goto L_0x03ae
        L_0x02f3:
            java.lang.String r0 = "com.facebook.SET_FOA_BACKUP_TOKEN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03e5
            byte[] r4 = X.C20138A8z.A07(r4, r2)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r3 == r0) goto L_0x0311
            if (r3 != r10) goto L_0x03e5
            X.0ve r2 = r9.A01
            r1 = 10132(0x2794, float:1.4198E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x03e5
        L_0x0311:
            java.lang.String r0 = android.util.Base64.encodeToString(r4, r6)
            X.C18070vi.A0X(r0)
            java.lang.String r5 = "FoaBackupTokenProviderManager/failure updating/"
            java.lang.String r6 = "FoaBackupTokenProviderManager/Failed to update FOA token"
            android.content.ContentValues r4 = X.C17880vN.A08()
            java.lang.String r2 = "value"
            r4.put(r2, r0)
            if (r3 != r10) goto L_0x0328
            goto L_0x032b
        L_0x0328:
            java.lang.String r0 = "content://com.facebook.katana.foabackuptoken.FoaBackupTokenProvider/"
            goto L_0x032d
        L_0x032b:
            java.lang.String r0 = "content://com.instagram.foabackuptoken.FoaBackupTokenProvider"
        L_0x032d:
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ RemoteException -> 0x0343, SecurityException -> 0x0350 }
            X.C18070vi.A0X(r1)     // Catch:{ RemoteException -> 0x0343, SecurityException -> 0x0350 }
            r0 = 0
            int r2 = r13.update(r1, r4, r2, r0)     // Catch:{ RemoteException -> 0x0343, SecurityException -> 0x0350 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ RemoteException -> 0x0343, SecurityException -> 0x0350 }
            java.lang.String r0 = "FoaBackupTokenProviderManagerFOA token updated result: "
            X.C17900vP.A0j(r0, r1, r2)     // Catch:{ RemoteException -> 0x0343, SecurityException -> 0x0350 }
            goto L_0x0363
        L_0x0343:
            r4 = move-exception
            com.whatsapp.util.Log.e(r6, r4)
            X.190 r2 = r9.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RemoteException + "
            goto L_0x035c
        L_0x0350:
            r4 = move-exception
            com.whatsapp.util.Log.e(r6, r4)
            X.190 r2 = r9.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SecurityException + "
        L_0x035c:
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r4)
            r2.A0E(r5, r0, r4)
        L_0x0363:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FoaBackupTokenProviderManagerFOA token updated, source: "
            goto L_0x03d9
        L_0x036a:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FoaBackupTokenProviderManager/Failed to get provider client, source: "
            r1.append(r0)
            int r0 = r3.intValue()
            r1.append(r0)
            X.C17880vN.A1M(r1, r4)
            X.190 r2 = r9.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SecurityException + "
            java.lang.String r1 = X.C17900vP.A0C(r0, r1, r4)
            java.lang.String r0 = "FoaBackupTokenProviderManager/failure retrieving cp/"
            r2.A0E(r0, r1, r4)
            r13 = 0
        L_0x0390:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FoaBackupTokenProviderManagerFailed to get provider client, source: "
            goto L_0x03d9
        L_0x0397:
            r11 = move-exception
            java.lang.StringBuilder r10 = X.AnonymousClass000.A11(r12)
            int r0 = r3.intValue()
            r10.append(r0)
            X.C17880vN.A1M(r10, r11)
            X.190 r10 = r9.A00
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SecurityException + "
        L_0x03ae:
            java.lang.String r0 = X.C17900vP.A0C(r0, r9, r11)
            r10.A0E(r8, r0, r11)
        L_0x03b5:
            boolean r0 = X.C17880vN.A1X(r1)
            if (r0 == 0) goto L_0x03e5
            java.lang.Object r0 = r1.get(r7)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x03e5
            java.lang.String r0 = X.C108945cZ.A1H(r1, r7)
            byte[] r1 = android.util.Base64.decode(r0, r6)
            r0 = 0
            X.C20138A8z.A05(r4, r5, r0, r1, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FoaBackupTokenProviderManagerFOA token saved, source: "
        L_0x03d9:
            r1.append(r0)
            int r0 = r3.intValue()
            X.C17900vP.A0o(r1, r0)
            if (r13 == 0) goto L_0x002b
        L_0x03e5:
            r13.release()
            return
        L_0x03e9:
            java.lang.Object r6 = r0.A01
            X.A6L r6 = (X.A6L) r6
            java.lang.String r2 = r0.A05
            java.lang.Object r1 = r0.A02
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r4 = r0.A03
            java.lang.Object r5 = r0.A04
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0406
            java.lang.String r0 = "payment_dev_cycle"
            X.AnonymousClass3Ma.A1P(r0, r2, r3)
        L_0x0406:
            java.util.Iterator r2 = X.AnonymousClass000.A15(r1)
        L_0x040a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0420
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.AnonymousClass3Ma.A1P(r1, r0, r3)
            goto L_0x040a
        L_0x0420:
            X.A7B r1 = X.A7B.A00()
            X.00H r0 = r6.A0V
            java.lang.Object r0 = r0.get()
            X.1ex r0 = (X.C31061ex) r0
            java.lang.String r3 = r0.A07(r1, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0449
            if (r4 == 0) goto L_0x002b
            X.00H r0 = r6.A0R
            X.1KB r2 = X.C108945cZ.A0a(r0)
            r0 = 33
            X.7RS r1 = new X.7RS
            r1.<init>(r0, r3, r4)
        L_0x0445:
            r2.A0J(r1)
            return
        L_0x0449:
            if (r5 == 0) goto L_0x002b
            X.00H r0 = r6.A0R
            X.1KB r2 = X.C108945cZ.A0a(r0)
            r0 = 30
            X.7Qp r1 = new X.7Qp
            r1.<init>(r5, r0)
            goto L_0x0445
        L_0x0459:
            java.lang.Object r3 = r0.A01
            X.6yG r3 = (X.C139126yG) r3
            java.lang.String r1 = "status_fragment"
            java.lang.Object r2 = r0.A02
            X.88f r2 = (X.C1603788f) r2
            java.lang.Object r4 = r0.A03
            X.1rL r4 = (X.C38471rL) r4
            java.lang.Object r5 = r0.A04
            X.5qh r5 = (X.C114375qh) r5
            X.C18070vi.A0k(r2, r4)
            X.00H r0 = r3.A04
            java.lang.Object r0 = r0.get()
            X.178 r0 = (X.AnonymousClass178) r0
            java.lang.ref.WeakReference r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r3 = r0.get()
            X.1Fl r3 = (X.C23291Fl) r3
            if (r3 == 0) goto L_0x002b
            X.1Fx r1 = r3.BPx()
            X.1Fx r0 = X.C23401Fx.STARTED
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x002b
            X.3At r2 = (X.C70363At) r2
            X.1x0 r1 = r2.A02
            android.content.Context r0 = r2.A00
            goto L_0x04d3
        L_0x0497:
            java.lang.Object r3 = r0.A01
            X.730 r3 = (X.AnonymousClass730) r3
            java.lang.String r1 = "status_fragment"
            java.lang.Object r2 = r0.A02
            X.6hU r2 = (X.C129246hU) r2
            java.lang.Object r4 = r0.A03
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            java.lang.Object r5 = r0.A04
            X.5qh r5 = (X.C114375qh) r5
            r0 = 3
            X.C18070vi.A0d(r4, r0)
            X.00H r0 = r3.A07
            java.lang.Object r0 = r0.get()
            X.178 r0 = (X.AnonymousClass178) r0
            java.lang.ref.WeakReference r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x002b
            java.lang.Object r3 = r0.get()
            X.1Fl r3 = (X.C23291Fl) r3
            if (r3 == 0) goto L_0x002b
            X.1Fx r1 = r3.BPx()
            X.1Fx r0 = X.C23401Fx.STARTED
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x002b
            X.1x0 r1 = r2.A02
            android.content.Context r0 = r2.A00
        L_0x04d3:
            X.C41751x0.A00(r0, r4, r5, r3, r1)
            return
        L_0x04d7:
            java.lang.Object r14 = r0.A01
            X.A7W r14 = (X.A7W) r14
            java.lang.String r6 = r0.A05
            java.lang.Object r11 = r0.A02
            X.AHc r11 = (X.C20346AHc) r11
            java.lang.Object r4 = r0.A03
            X.0vk r4 = (X.C18090vk) r4
            java.lang.Object r13 = r0.A04
            X.9cO r13 = (X.C185319cO) r13
            r2 = 1
            X.C18070vi.A0p(r11, r4, r13)
            androidx.work.impl.WorkDatabase r0 = r14.A04
            r54 = r0
            X.BD8 r5 = r54.A0E()
            java.util.ArrayList r1 = r5.Bbt(r6)
            int r0 = r1.size()
            if (r0 <= r2) goto L_0x050f
            java.lang.String r0 = "Can't apply UPDATE policy to the chains of work."
        L_0x0501:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
        L_0x0506:
            X.8Js r0 = new X.8Js
            r0.<init>(r1)
            r11.A00(r0)
            return
        L_0x050f:
            java.lang.Object r3 = X.C29431cG.A0c(r1)
            X.9O0 r3 = (X.AnonymousClass9O0) r3
            if (r3 == 0) goto L_0x054b
            java.lang.String r12 = r3.A01
            X.A2t r0 = r5.Bbs(r12)
            if (r0 != 0) goto L_0x053a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WorkSpec with "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ", that matches a name \""
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "\", wasn't found"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0o(r0, r1)
            goto L_0x0506
        L_0x053a:
            long r1 = r0.A06
            r16 = 0
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x054f
            java.lang.Integer r1 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            if (r1 != r0) goto L_0x0552
            r5.BIB(r12)
        L_0x054b:
            r4.invoke()
            return
        L_0x054f:
            java.lang.String r0 = "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type."
            goto L_0x0501
        L_0x0552:
            X.A2t r15 = r13.A00
            java.lang.Integer r0 = r15.A0G
            r53 = r0
            java.lang.String r0 = r15.A0I
            r26 = r0
            java.lang.String r0 = r15.A0H
            r27 = r0
            X.A6Y r0 = r15.A0C
            r52 = r0
            X.A6Y r0 = r15.A0D
            r51 = r0
            long r0 = r15.A05
            r35 = r0
            long r0 = r15.A06
            r37 = r0
            long r0 = r15.A04
            r39 = r0
            X.A6e r0 = r15.A0B
            r50 = r0
            int r0 = r15.A02
            r22 = r0
            java.lang.Integer r0 = r15.A0E
            r23 = r0
            long r7 = r15.A03
            long r5 = r15.A07
            long r3 = r15.A08
            long r1 = r15.A0A
            boolean r0 = r15.A0J
            r21 = r0
            java.lang.Integer r0 = r15.A0F
            r24 = r0
            int r0 = r15.A01
            r20 = r0
            int r0 = r15.A0K
            r19 = r0
            long r9 = r15.A09
            int r0 = r15.A00
            r18 = r0
            int r0 = r15.A0L
            r15 = r0
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            X.A2t r0 = new X.A2t
            r25 = r12
            r28 = r22
            r29 = r20
            r30 = r19
            r31 = r18
            r32 = r15
            r33 = r35
            r35 = r37
            r37 = r39
            r39 = r7
            r41 = r5
            r43 = r3
            r45 = r1
            r47 = r9
            r49 = r21
            r18 = r0
            r19 = r50
            r20 = r52
            r21 = r51
            r22 = r53
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r37, r39, r41, r43, r45, r47, r49)
            X.AHp r9 = r14.A03     // Catch:{ all -> 0x0691 }
            X.C18070vi.A0X(r9)     // Catch:{ all -> 0x0691 }
            X.00I r5 = r14.A02     // Catch:{ all -> 0x0691 }
            X.C18070vi.A0X(r5)     // Catch:{ all -> 0x0691 }
            java.util.List r6 = r14.A07     // Catch:{ all -> 0x0691 }
            X.C18070vi.A0X(r6)     // Catch:{ all -> 0x0691 }
            java.util.Set r7 = r13.A01     // Catch:{ all -> 0x0691 }
            java.lang.String r3 = r0.A0M     // Catch:{ all -> 0x0691 }
            X.BD8 r1 = r54.A0E()     // Catch:{ all -> 0x0691 }
            X.A2t r4 = r1.Bbs(r3)     // Catch:{ all -> 0x0691 }
            if (r4 == 0) goto L_0x0679
            java.lang.Integer r1 = r4.A0G     // Catch:{ all -> 0x0691 }
            boolean r1 = X.C196349ut.A01(r1)     // Catch:{ all -> 0x0691 }
            if (r1 != 0) goto L_0x0673
            long r1 = r4.A06     // Catch:{ all -> 0x0691 }
            int r8 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            boolean r10 = X.AnonymousClass000.A1O(r8)
            long r1 = r0.A06     // Catch:{ all -> 0x0691 }
            int r8 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r8)
            r10 = r10 ^ r1
            if (r10 != 0) goto L_0x0642
            boolean r19 = r9.A05(r3)     // Catch:{ all -> 0x0691 }
            if (r19 != 0) goto L_0x0624
            java.util.Iterator r2 = r6.iterator()     // Catch:{ all -> 0x0691 }
        L_0x0614:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x0691 }
            if (r1 == 0) goto L_0x0624
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0691 }
            X.BBo r1 = (X.C22531BBo) r1     // Catch:{ all -> 0x0691 }
            r1.BEL(r3)     // Catch:{ all -> 0x0691 }
            goto L_0x0614
        L_0x0624:
            X.Aj7 r12 = new X.Aj7     // Catch:{ all -> 0x0691 }
            r13 = r54
            r14 = r4
            r15 = r0
            r16 = r3
            r17 = r6
            r18 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0691 }
            r54.A07()     // Catch:{ all -> 0x0691 }
            r12.run()     // Catch:{ all -> 0x068c }
            r54.A08()     // Catch:{ all -> 0x068c }
            X.C20076A6c.A02(r54)     // Catch:{ all -> 0x0691 }
            if (r19 != 0) goto L_0x0673
            goto L_0x0670
        L_0x0642:
            X.B1r r3 = X.C22289B1r.A00     // Catch:{ all -> 0x0691 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0691 }
            java.lang.String r1 = "Can't update "
            r2.append(r1)     // Catch:{ all -> 0x0691 }
            java.lang.Object r1 = r3.invoke(r4)     // Catch:{ all -> 0x0691 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0691 }
            r2.append(r1)     // Catch:{ all -> 0x0691 }
            java.lang.String r1 = " Worker to "
            r2.append(r1)     // Catch:{ all -> 0x0691 }
            java.lang.Object r0 = r3.invoke(r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0691 }
            r2.append(r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = " Worker. Update operation must preserve worker's type."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ all -> 0x0691 }
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0691 }
            r1.<init>(r0)     // Catch:{ all -> 0x0691 }
            goto L_0x0690
        L_0x0670:
            X.C20066A5p.A01(r5, r13, r6)     // Catch:{ all -> 0x0691 }
        L_0x0673:
            X.8Jr r0 = X.BDL.A01     // Catch:{ all -> 0x0691 }
            r11.A00(r0)     // Catch:{ all -> 0x0691 }
            return
        L_0x0679:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = "Worker with "
            r1.append(r0)     // Catch:{ all -> 0x0691 }
            r1.append(r3)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = " doesn't exist"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A12(r0, r1)     // Catch:{ all -> 0x0691 }
            goto L_0x0690
        L_0x068c:
            r1 = move-exception
            X.C20076A6c.A02(r54)     // Catch:{ all -> 0x0691 }
        L_0x0690:
            throw r1     // Catch:{ all -> 0x0691 }
        L_0x0691:
            r1 = move-exception
            X.8Js r0 = new X.8Js
            r0.<init>(r1)
            r11.A00(r0)
            return
        L_0x069b:
            java.lang.Object r6 = r0.A01
            X.1NT r6 = (X.AnonymousClass1NT) r6
            java.lang.Object r5 = r0.A02
            byte[] r5 = (byte[]) r5
            java.lang.Object r4 = r0.A03
            X.2Qv r4 = (X.C49532Qv) r4
            java.lang.String r2 = r0.A05
            java.lang.Object r3 = r0.A04
            X.B71 r3 = (X.B71) r3
            X.1NO r1 = r6.A02     // Catch:{ IOException -> 0x06ef }
            X.9pc r0 = new X.9pc     // Catch:{ IOException -> 0x06ef }
            r0.<init>(r5)     // Catch:{ IOException -> 0x06ef }
            r1.A02(r0)     // Catch:{ IOException -> 0x06ef }
            X.1NP r0 = r6.A01     // Catch:{ IOException -> 0x06ef }
            r0.A0J(r4)     // Catch:{ IOException -> 0x06ef }
            X.2Qv r0 = X.C49532Qv.PASSWORD_ENCRYPTED     // Catch:{ IOException -> 0x06ef }
            if (r4 != r0) goto L_0x06c5
            if (r2 == 0) goto L_0x06c5
            r6.A03(r2)     // Catch:{ IOException -> 0x06ef }
        L_0x06c5:
            r1 = r3
            X.AMQ r1 = (X.AMQ) r1     // Catch:{ IOException -> 0x06ef }
            int r0 = r1.A00     // Catch:{ IOException -> 0x06ef }
            if (r0 == 0) goto L_0x06dc
            java.lang.Object r1 = r1.A01     // Catch:{ IOException -> 0x06ef }
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r1     // Catch:{ IOException -> 0x06ef }
            java.lang.String r0 = "encb/EncBackupViewModel/successfully saved encryption key"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x06ef }
            X.1DT r1 = r1.A07     // Catch:{ IOException -> 0x06ef }
        L_0x06d7:
            r0 = -1
            X.AnonymousClass3MX.A1K(r1, r0)     // Catch:{ IOException -> 0x06ef }
            goto L_0x06ee
        L_0x06dc:
            java.lang.Object r2 = r1.A01     // Catch:{ IOException -> 0x06ef }
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r2 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r2     // Catch:{ IOException -> 0x06ef }
            r1 = 3
            java.lang.String r0 = "encb/EncBackupViewModel/successfully retrieved and saved backup key"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x06ef }
            X.1DT r0 = r2.A04     // Catch:{ IOException -> 0x06ef }
            X.AnonymousClass3MX.A1K(r0, r1)     // Catch:{ IOException -> 0x06ef }
            X.1DT r1 = r2.A07     // Catch:{ IOException -> 0x06ef }
            goto L_0x06d7
        L_0x06ee:
            return
        L_0x06ef:
            r1 = -1
            r0 = 6
            r3.BtE(r0, r1, r1)
            return
        L_0x06f5:
            java.lang.Object r4 = r0.A01
            X.5cS r4 = (X.C108885cS) r4
            java.lang.String r3 = r0.A05
            java.lang.Object r2 = r0.A03
            java.lang.Object r1 = r0.A04
            X.206 r1 = (X.AnonymousClass206) r1
            java.lang.String r0 = r2.toString()
            r4.CHY(r1, r3, r0)
            return
        L_0x0709:
            java.lang.String r4 = r0.A05
            java.lang.Object r3 = r0.A02
            X.1FU r3 = (X.AnonymousClass1FU) r3
            java.lang.Object r2 = r0.A03
            X.3w5 r2 = (X.C79823w5) r2
            java.lang.Object r1 = r0.A04
            X.1BI r1 = (X.AnonymousClass1BI) r1
            if (r4 == 0) goto L_0x0732
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0732
            r0 = 2131898968(0x7f123258, float:1.9432869E38)
        L_0x0722:
            java.lang.String r1 = X.C18070vi.A0F(r3, r0)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r1, r0)
            r0.show()
        L_0x072e:
            r3.CEx()
            return
        L_0x0732:
            X.1CJ r0 = r2.A05
            boolean r0 = r0.A0P(r1)
            if (r0 == 0) goto L_0x072e
            r0 = 2131899074(0x7f1232c2, float:1.9433084E38)
            goto L_0x0722
        L_0x073e:
            java.lang.Object r2 = r0.A01
            X.3gf r2 = (X.AnonymousClass3gf) r2
            java.lang.Object r3 = r0.A02
            java.util.AbstractMap r3 = (java.util.AbstractMap) r3
            java.lang.Object r9 = r0.A03
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r12 = r0.A04
            java.util.List r12 = (java.util.List) r12
            java.lang.String r7 = r0.A05
            r8 = 0
            boolean r5 = X.C18070vi.A17(r2, r3)
            X.C18070vi.A0p(r9, r12, r7)
            java.util.List r0 = r2.A0T
            X.C18070vi.A0W(r0)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r0.iterator()
        L_0x0765:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x077e
            java.lang.Object r1 = r4.next()
            r0 = r1
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1BI r0 = r0.A0J
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x0765
            r6.add(r1)
            goto L_0x0765
        L_0x077e:
            java.util.Iterator r1 = r6.iterator()
        L_0x0782:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0793
            X.1E7 r0 = X.C17880vN.A0O(r1)
            X.C18070vi.A0b(r0)
            r2.BEb(r0)
            goto L_0x0782
        L_0x0793:
            android.content.Intent r4 = X.C17880vN.A0A()
            int r0 = r3.size()
            long r0 = (long) r0
            java.lang.String r3 = "extra_invitees_count"
            android.content.Intent r1 = r4.putExtra(r3, r0)
            r0 = -1
            r2.setResult(r0, r1)
            java.util.ArrayList r6 = X.C29351c6.A0D(r9)
            java.util.Iterator r1 = r9.iterator()
        L_0x07ae:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x07c0
            java.lang.Object r0 = r1.next()
            X.43o r0 = (X.C821743o) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            r6.add(r0)
            goto L_0x07ae
        L_0x07c0:
            X.0vb r11 = r2.A0F
            r10 = 2131755014(0x7f100006, float:1.9140895E38)
            int r0 = r12.size()
            long r3 = (long) r0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r0 = r12.size()
            long r0 = (long) r0
            X.AnonymousClass3MX.A1S(r5, r8, r0)
            java.lang.String r0 = r11.A0K(r5, r10, r3)
            X.C18070vi.A0X(r0)
            X.1GP r5 = r2.getSupportFragmentManager()
            java.lang.StringBuilder r4 = X.AnonymousClass000.A11(r0)
            java.util.List r0 = r2.A0T
            X.C18070vi.A0W(r0)
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.Iterator r13 = r0.iterator()
        L_0x07f0:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0823
            java.lang.Object r11 = r13.next()
            r12 = r11
            X.1E7 r12 = (X.AnonymousClass1E7) r12
            java.util.ArrayList r3 = X.C29351c6.A0D(r9)
            java.util.Iterator r1 = r9.iterator()
        L_0x0805:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0817
            java.lang.Object r0 = r1.next()
            X.43o r0 = (X.C821743o) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            r3.add(r0)
            goto L_0x0805
        L_0x0817:
            X.1BI r0 = r12.A0J
            boolean r0 = X.C29431cG.A18(r3, r0)
            if (r0 == 0) goto L_0x07f0
            r10.add(r11)
            goto L_0x07f0
        L_0x0823:
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r10.iterator()
        L_0x082b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0841
            X.1E7 r1 = X.C17880vN.A0O(r3)
            X.1Me r0 = r2.A08
            java.lang.String r0 = X.AnonymousClass3MY.A0q(r0, r1)
            if (r0 == 0) goto L_0x082b
            r11.add(r0)
            goto L_0x082b
        L_0x0841:
            int r1 = r11.size()
            r9 = 1
            if (r1 == r9) goto L_0x089b
            r10 = 2
            if (r1 == r10) goto L_0x0889
            r0 = 3
            if (r1 == r0) goto L_0x08a7
            X.0vb r13 = r2.A0F
            r12 = 2131755015(0x7f100007, float:1.9140897E38)
            int r1 = r11.size()
            long r2 = (long) r1
            r14 = 3
            long r2 = r2 - r14
            java.lang.Object[] r14 = new java.lang.Object[r10]
            java.util.List r1 = r11.subList(r8, r0)
            java.lang.String r0 = ", "
            java.lang.String r0 = X.C108995ce.A0X(r0, r1)
            r14[r8] = r0
            int r0 = r11.size()
            long r0 = (long) r0
            r10 = 3
            long r0 = r0 - r10
            X.AnonymousClass3MX.A1S(r14, r9, r0)
            java.lang.String r0 = r13.A0K(r14, r12, r2)
        L_0x0878:
            X.C18070vi.A0X(r0)
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r4)
            X.9IF r0 = X.AnonymousClass9IF.INVITE
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r0 = X.C181519Qu.A00(r0, r1, r7, r6)
            X.C20098A7b.A02(r0, r5)
            return
        L_0x0889:
            r3 = 2131886547(0x7f1201d3, float:1.9407676E38)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Object r0 = r11.get(r8)
            r1[r8] = r0
            java.lang.Object r0 = r11.get(r9)
            r1[r9] = r0
            goto L_0x08be
        L_0x089b:
            r3 = 2131886548(0x7f1201d4, float:1.9407678E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Object r0 = r11.get(r8)
            r1[r8] = r0
            goto L_0x08be
        L_0x08a7:
            r3 = 2131886546(0x7f1201d2, float:1.9407674E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object r0 = r11.get(r8)
            r1[r8] = r0
            java.lang.Object r0 = r11.get(r9)
            r1[r9] = r0
            java.lang.Object r0 = r11.get(r10)
            r1[r10] = r0
        L_0x08be:
            java.lang.String r0 = r2.getString(r3, r1)
            goto L_0x0878
        L_0x08c3:
            java.lang.Object r4 = r0.A01
            com.whatsapp.notification.DirectReplyService r4 = (com.whatsapp.notification.DirectReplyService) r4
            java.lang.Object r3 = r0.A02
            X.30h r3 = (X.C676430h) r3
            java.lang.String r2 = r0.A05
            java.lang.Object r1 = r0.A03
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            java.lang.Object r0 = r0.A04
            android.content.Intent r0 = (android.content.Intent) r0
            r4.A0A(r0, r1, r3, r2)
            return
        L_0x08d9:
            java.lang.Object r3 = r0.A01
            X.9m4 r3 = (X.C191129m4) r3
            java.lang.Object r6 = r0.A02
            X.9rx r6 = (X.C194579rx) r6
            r8 = 0
            java.lang.String r7 = r0.A05
            java.lang.Object r4 = r0.A04
            X.B9G r4 = (X.B9G) r4
            java.lang.Object r5 = r0.A03
            X.BBe r5 = (X.C22521BBe) r5
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            X.1OZ r2 = r3.A00     // Catch:{ 1oV -> 0x08fb }
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.A0E(r0)     // Catch:{ 1oV -> 0x08fb }
            r3.A00(r4, r5, r6, r7, r8)     // Catch:{ 1oV -> 0x08fb }
            return
        L_0x08fb:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            java.lang.String r2 = "MessageHandlerDisconnectedException"
            java.lang.String r1 = r0.getMessage()
            X.A1q r0 = new X.A1q
            r0.<init>(r8, r2, r1)
            r5.Btu(r0, r8)
            return
        L_0x090e:
            java.lang.Object r5 = r0.A01
            X.B9S r5 = (X.B9S) r5
            java.lang.Object r4 = r0.A02
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r0.A03
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r1 = r0.A05
            java.lang.Object r2 = r0.A04
            X.1wv r2 = (X.C41701wv) r2
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.6gX r1 = r5.BZ9(r3, r1, r4)
            X.1wy r0 = r2.A03
            r0.A0E(r1)
            return
        L_0x092e:
            java.lang.Object r10 = r0.A01
            X.1x7 r10 = (X.C41821x7) r10
            java.lang.Object r9 = r0.A02
            android.content.Context r9 = (android.content.Context) r9
            java.lang.Object r14 = r0.A03
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r11 = r0.A04
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.String r13 = r0.A05
            java.lang.String r12 = X.AnonymousClass74B.A02()
            X.6QH r8 = new X.6QH
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.00H r0 = r10.A0F
            java.lang.Object r10 = r0.get()
            X.73A r10 = (X.AnonymousClass73A) r10
            r7 = 1
            X.00H r0 = r10.A06
            java.lang.Object r0 = r0.get()
            X.716 r0 = (X.AnonymousClass716) r0
            android.content.SharedPreferences r0 = X.AnonymousClass716.A00(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_debug_session_id"
            X.C17880vN.A1E(r1, r0, r12)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/handleNewStatusEligibilityRequest called for session: "
            r3.append(r0)
            r3.append(r12)
            java.lang.String r0 = " with message "
            r3.append(r0)
            java.util.ArrayList r2 = X.C29351c6.A0E(r14)
            java.util.Iterator r1 = r14.iterator()
        L_0x0980:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x098a
            X.C108995ce.A1Q(r2, r1)
            goto L_0x0980
        L_0x098a:
            java.lang.String r0 = X.C17890vO.A0V(r2, r3)
            r5 = 0
            X.C18070vi.A0d(r0, r5)
            boolean r0 = X.AnonymousClass74B.A08(r14)
            if (r0 == 0) goto L_0x09a3
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/handleNewStatusEligibilityRequest skip for audio status"
            X.C18070vi.A0d(r0, r5)
            r1 = -4
            r0 = 0
            r8.A01(r0, r12, r1, r7)
            return
        L_0x09a3:
            X.00H r0 = r10.A0A
            java.lang.Object r0 = r0.get()
            X.6p6 r0 = (X.AnonymousClass6p6) r0
            r0.A00(r12)
            X.00H r0 = r10.A09
            java.lang.Object r6 = r0.get()
            X.72Q r6 = (X.AnonymousClass72Q) r6
            java.util.ArrayList r2 = X.C29351c6.A0E(r14)
            java.util.Iterator r1 = r14.iterator()
        L_0x09be:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x09c8
            X.C108995ce.A1Q(r2, r1)
            goto L_0x09be
        L_0x09c8:
            X.1Cd r0 = r6.A00
            X.1au r4 = r0.A05()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0a04 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x0a04 }
            android.database.sqlite.SQLiteDatabase r3 = r0.A00     // Catch:{ all -> 0x0a04 }
            r3.beginTransaction()     // Catch:{ all -> 0x0a04 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0a04 }
        L_0x09dc:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0a04 }
            if (r0 == 0) goto L_0x09ea
            long r0 = X.C17890vO.A07(r2)     // Catch:{ all -> 0x0a04 }
            r6.A05(r12, r7, r0)     // Catch:{ all -> 0x0a04 }
            goto L_0x09dc
        L_0x09ea:
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x0a04 }
            r3.endTransaction()     // Catch:{ all -> 0x0a04 }
            r4.close()
            X.7PM r1 = new X.7PM
            r1.<init>(r8, r12)
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/handleNewStatusEligibilityRequest start text status burning and eligibility"
            X.C18070vi.A0d(r0, r5)
            r11 = r1
            r13 = r14
            r14 = r5
            X.AnonymousClass73A.A00(r9, r10, r11, r12, r13, r14)
            return
        L_0x0a04:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0a06 }
        L_0x0a06:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0a0b:
            X.1xA r3 = r4.BD0()     // Catch:{ all -> 0x0a49 }
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0a3f }
            r10.<init>(r9)     // Catch:{ all -> 0x0a3f }
            java.lang.String r0 = "csat_trigger_expiration_ts"
            r10.putNull(r0)     // Catch:{ all -> 0x0a3f }
            java.lang.String r12 = "message_row_id = ?"
            java.lang.String[] r14 = new java.lang.String[r9]     // Catch:{ all -> 0x0a3f }
            X.C17880vN.A1V(r14, r8, r1)     // Catch:{ all -> 0x0a3f }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0a3f }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0a3f }
            java.lang.String r11 = "message_template"
            java.lang.String r13 = "UPDATE_TEMPLATE_CSAT_TRIGGER_SQL"
            r9.A02(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0a3f }
            r3.A00()     // Catch:{ all -> 0x0a3f }
            r3.close()     // Catch:{ all -> 0x0a49 }
            r4.close()
            r6.A01(r5)
            X.1Q2 r1 = r7.A0O
            r0 = -1
            r1.A01(r5, r0)
            return
        L_0x0a3f:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0a44 }
            goto L_0x0a48
        L_0x0a44:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0a49 }
        L_0x0a48:
            throw r1     // Catch:{ all -> 0x0a49 }
        L_0x0a49:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0a53 }
            throw r1
        L_0x0a4e:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0a53 }
            throw r1
        L_0x0a53:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21462AkT.run():void");
    }

    public C21462AkT(C114375qh r2, C38471rL r3, C1603788f r4, C139126yG r5) {
        this.A00 = 15;
        this.A01 = r5;
        this.A05 = "status_fragment";
        this.A02 = r4;
        this.A03 = r3;
        this.A04 = r2;
    }

    public C21462AkT(View.OnClickListener onClickListener, C114375qh r3, C129246hU r4, AnonymousClass730 r5) {
        this.A00 = 17;
        this.A01 = r5;
        this.A05 = "status_fragment";
        this.A02 = r4;
        this.A03 = onClickListener;
        this.A04 = r3;
    }

    public C21462AkT(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A05 = str;
        this.A04 = obj4;
    }
}
