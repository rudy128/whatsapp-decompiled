package X;

/* renamed from: X.3C3  reason: invalid class name */
public class AnonymousClass3C3 implements Runnable {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass3C3(Object obj, Object obj2, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
    }

    /* JADX WARNING: type inference failed for: r1v54, types: [java.lang.Object, X.CAE] */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0324, code lost:
        if ((X.C18020vd.A00(r7, r12, 2250) & 1) == 1) goto L_0x0326;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x033d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r6 = r18
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x00b3;
                case 1: goto L_0x00cc;
                case 2: goto L_0x00ea;
                case 3: goto L_0x0102;
                case 4: goto L_0x0110;
                case 5: goto L_0x0015;
                case 6: goto L_0x0133;
                case 7: goto L_0x0007;
                case 8: goto L_0x0007;
                case 9: goto L_0x0007;
                case 10: goto L_0x0007;
                case 11: goto L_0x015a;
                case 12: goto L_0x0065;
                case 13: goto L_0x008e;
                case 14: goto L_0x01c3;
                case 15: goto L_0x01fd;
                case 16: goto L_0x020b;
                case 17: goto L_0x048a;
                case 18: goto L_0x04c4;
                case 19: goto L_0x04ef;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r6.A02
            X.1DL r3 = (X.AnonymousClass1DL) r3
            long r1 = r6.A01
            java.lang.Object r0 = r6.A03
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            X.AnonymousClass1DL.A07(r3, r0, r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r0 = r6.A02
            X.2jf r0 = (X.C57802jf) r0
            java.lang.Object r8 = r6.A03
            X.206 r8 = (X.AnonymousClass206) r8
            long r1 = r6.A01
            X.00H r0 = r0.A02
            java.lang.Object r7 = r0.get()
            X.1iV r7 = (X.C33241iV) r7
            if (r8 == 0) goto L_0x0014
            boolean r0 = X.C33241iV.A03(r8)
            if (r0 == 0) goto L_0x0014
            X.00H r6 = r7.A01
            java.lang.Object r0 = r6.get()
            X.16w r0 = (X.C216516w) r0
            java.util.concurrent.ConcurrentHashMap r0 = r0.A02
            X.205 r5 = r8.A0v
            java.lang.Object r0 = r0.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x004b
            long r3 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
        L_0x004b:
            java.lang.Object r0 = r6.get()
            X.16w r0 = (X.C216516w) r0
            java.util.concurrent.ConcurrentHashMap r0 = r0.A02
            X.C18070vi.A0W(r5)
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            r0.put(r5, r10)
            r9 = 0
            r11 = 0
            r13 = r11
            r12 = r11
            X.C33241iV.A01(r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0065:
            java.lang.Object r5 = r6.A02
            X.1RK r5 = (X.AnonymousClass1RK) r5
            java.lang.Object r2 = r6.A03
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            long r0 = r6.A01
            X.4Zh r6 = X.AnonymousClass1RK.A00(r5, r2)
            if (r6 == 0) goto L_0x0014
            r6.A00 = r0
            X.1MQ r2 = r5.A0H
            com.whatsapp.jid.DeviceJid r7 = r6.A08
            X.1MO r4 = r2.A04
            android.content.ContentValues r10 = X.C17880vN.A08()
            java.lang.String r2 = "last_active"
            X.C17880vN.A19(r10, r2, r0)
            X.1MP r2 = r4.A02
            X.1au r8 = r2.A06()
            goto L_0x0563
        L_0x008e:
            java.lang.Object r0 = r6.A02
            X.4ml r0 = (X.C95764ml) r0
            java.lang.Object r2 = r6.A03
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            long r4 = r6.A01
            X.4n1 r0 = r0.A03
            com.whatsapp.group.KeyboardControllerViewModel r3 = r0.A08
            if (r3 == 0) goto L_0x0014
            if (r2 == 0) goto L_0x00a5
            r1 = 0
        L_0x00a1:
            r3.A0T(r2, r1)
            return
        L_0x00a5:
            r1 = -1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r2 = 0
            r1 = 2
            if (r0 != 0) goto L_0x00a1
            r1 = 1
            goto L_0x00a1
        L_0x00b3:
            java.lang.Object r4 = r6.A02
            X.Cyg r4 = (X.C26380Cyg) r4
            java.lang.Object r0 = r6.A03
            X.CLu r0 = (X.C24826CLu) r0
            r4.A0L = r0
            long r2 = r6.A01
            X.CAE r1 = new X.CAE
            r1.<init>()
            X.BVx r0 = new X.BVx
            r0.<init>(r6, r1, r2)
            r4.A0F = r0
            return
        L_0x00cc:
            java.lang.Object r5 = r6.A02
            X.1iW r5 = (X.C33251iW) r5
            long r3 = r6.A01
            java.lang.Object r2 = r6.A03
            X.206 r2 = (X.AnonymousClass206) r2
            X.00H r0 = r5.A1L
            X.206 r1 = X.AnonymousClass1W2.A02(r0, r3)
            X.1R0 r0 = r5.A10
            r0.A00(r2, r1)
            r5.A0b(r2)
            X.122 r0 = r5.A0U
            r0.BBY(r2)
            return
        L_0x00ea:
            java.lang.Object r0 = r6.A02
            X.8Cj r0 = (X.C161238Cj) r0
            java.lang.Object r3 = r6.A03
            com.whatsapp.voipcalling.CallInfo r3 = (com.whatsapp.voipcalling.CallInfo) r3
            long r1 = r6.A01
            X.A99 r0 = r0.A01
            X.A99.A0F(r0, r3, r1)
            android.os.Handler r3 = r0.A0I
            r2 = 0
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.sendEmptyMessageDelayed(r2, r0)
            return
        L_0x0102:
            java.lang.Object r3 = r6.A02
            com.whatsapp.calling.service.VoiceServiceEventCallback r3 = (com.whatsapp.calling.service.VoiceServiceEventCallback) r3
            long r1 = r6.A01
            java.lang.Object r0 = r6.A03
            X.2mw r0 = (X.C59822mw) r0
            r3.m44lambda$setScheduledCallJoinTimeDiffMs$6$comwhatsappcallingserviceVoiceServiceEventCallback(r1, r0)
            return
        L_0x0110:
            java.lang.Object r4 = r6.A02
            X.3uP r4 = (X.AnonymousClass3uP) r4
            java.lang.Object r3 = r6.A03
            X.1ch r3 = (X.C29681ch) r3
            long r1 = r6.A01
            X.00H r0 = r4.A2D
            java.lang.Object r0 = r0.get()
            X.1hF r0 = (X.C32471hF) r0
            X.206 r3 = r0.A02(r3, r1)
            X.1KB r2 = r4.A0S
            r1 = 44
            X.7Pi r0 = new X.7Pi
            r0.<init>(r4, r3, r1)
            r2.A0J(r0)
            return
        L_0x0133:
            java.lang.Object r0 = r6.A02
            X.1NA r0 = (X.AnonymousClass1NA) r0
            long r7 = r6.A01
            java.lang.Object r2 = r6.A03
            X.1x1 r2 = (X.C41761x1) r2
            X.1NC r0 = r0.A01
            java.util.Map r1 = r0.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            int r4 = r2.A02
            java.lang.String r3 = r2.A06
            long r9 = r2.A04
            int r5 = r2.A01
            boolean r13 = r2.A07
            r6 = 0
            X.1x1 r2 = new X.1x1
            r11 = r7
            r2.<init>(r3, r4, r5, r6, r7, r9, r11, r13)
            r1.put(r0, r2)
            return
        L_0x015a:
            java.lang.Object r4 = r6.A02
            X.1iU r4 = (X.C33231iU) r4
            java.lang.Object r5 = r6.A03
            X.212 r5 = (X.AnonymousClass212) r5
            long r1 = r6.A01
            X.1WM r0 = r4.A0A
            r0.A0J(r5, r1)
            X.00H r0 = r4.A0H
            X.1W6 r0 = X.C17880vN.A0c(r0)
            X.205 r1 = r5.A18()
            X.1W2 r0 = r0.A01
            X.206 r1 = r0.A05(r1)
            boolean r0 = r5 instanceof X.AnonymousClass227
            if (r0 == 0) goto L_0x01ad
            if (r1 == 0) goto L_0x01ad
            X.8BG r0 = X.C63892tr.A01(r1)
            if (r0 == 0) goto L_0x01ad
            X.8BG r0 = X.C63892tr.A01(r1)
            r0.BBg(r5)
        L_0x018c:
            X.1Qw r1 = r4.A09
            X.205 r0 = r5.A0v
            java.util.Set r3 = r1.A03(r0)
            X.1PT r2 = r4.A0E
            X.2qt r1 = new X.2qt
            r1.<init>(r5)
            r0 = 1
            r1.A04 = r0
            int r0 = r5.A0B
            int r0 = r0 + 1
            r1.A03 = r0
            X.190 r0 = r4.A00
            X.C22971Dz.A0E(r0, r1, r3)
            X.C62162qt.A00(r1, r2, r3)
            return
        L_0x01ad:
            boolean r0 = r5 instanceof X.AnonymousClass22A
            if (r0 == 0) goto L_0x018c
            boolean r0 = r5.A18
            if (r0 == 0) goto L_0x018c
            java.util.HashSet r2 = X.C17880vN.A12()
            r2.add(r1)
            X.122 r1 = r4.A05
            r0 = 0
            r1.BIL(r2, r0)
            goto L_0x018c
        L_0x01c3:
            java.lang.Object r0 = r6.A02
            X.2fj r0 = (X.C55412fj) r0
            java.lang.Object r1 = r6.A03
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            long r4 = r6.A01
            X.2cJ r0 = r0.A01
            X.1Lt r0 = r0.A01
            X.1au r6 = r0.A06()
            android.content.ContentValues r3 = X.C17890vO.A08()     // Catch:{ all -> 0x01f8 }
            java.lang.String r1 = r1.getRawString()     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = "chat_jid"
            r3.put(r0, r1)     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = "timestamp"
            X.C17880vN.A19(r3, r0, r4)     // Catch:{ all -> 0x01f8 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01f8 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x01f8 }
            java.lang.String r1 = "dismissed_chat"
            java.lang.String r0 = "INSERT_DISMISSED_CHAT"
            r2.A07(r1, r0, r3)     // Catch:{ all -> 0x01f8 }
            r6.close()
            return
        L_0x01f8:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x059e }
            throw r1
        L_0x01fd:
            java.lang.Object r3 = r6.A02
            X.1iy r3 = (X.C33531iy) r3
            java.lang.Object r2 = r6.A03
            X.2rB r2 = (X.C62302rB) r2
            long r0 = r6.A01
            r3.A02(r2, r0)
            return
        L_0x020b:
            java.lang.Object r10 = r6.A02
            X.2gr r10 = (X.C56072gr) r10
            java.lang.Object r9 = r6.A03
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            long r1 = r6.A01
            r11 = 0
            X.C18070vi.A0d(r10, r11)
            X.0ve r8 = r10.A03
            r0 = 12664(0x3178, float:1.7746E-41)
            X.0vf r7 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r7, r8, r0)
            if (r0 == 0) goto L_0x02f3
            r12 = 0
            r4 = 0
            r0 = 9668(0x25c4, float:1.3548E-41)
            boolean r0 = X.C18020vd.A05(r7, r8, r0)
            if (r0 == 0) goto L_0x02f0
            X.1Mx r0 = r10.A01
            X.2lX r5 = r0.A05(r9)
            if (r5 == 0) goto L_0x02f0
            X.9ju r12 = com.facebook.graphql.calls.GraphQlCallInput.A02
            byte[] r3 = r5.A01
            r0 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)
            X.C18070vi.A0X(r3)
            java.lang.String r0 = "tctoken"
            X.8Kx r4 = r12.A00()
            X.C162478Kx.A01(r4, r3, r0)
            long r5 = r5.A00
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "timestamp"
            X.C162478Kx.A01(r4, r3, r0)
            r6 = 1
        L_0x025a:
            X.9ju r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            long r0 = X.C17880vN.A04(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "dhash"
            X.8Kx r3 = r5.A00()
            X.C162478Kx.A01(r3, r1, r0)
            com.whatsapp.infra.graphql.generated.usync.calls.XWA2WAUserQueryInput r2 = new com.whatsapp.infra.graphql.generated.usync.calls.XWA2WAUserQueryInput
            r2.<init>()
            java.lang.String r1 = "jid"
            X.C18070vi.A0d(r9, r11)
            java.lang.String r0 = r9.getRawString()
            r2.A05(r1, r0)
            if (r6 == 0) goto L_0x028f
            java.lang.String r1 = "privacy_token"
            X.8Kx r0 = r2.A02()
            if (r4 != 0) goto L_0x028c
            X.8Kx r4 = r12.A00()
        L_0x028c:
            r0.A06(r4, r1)
        L_0x028f:
            java.lang.String r1 = "about_status"
            X.8Kx r0 = r2.A02()
            r0.A06(r3, r1)
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            r1.add(r2)
            com.whatsapp.infra.graphql.generated.usync.calls.XWA2WAUsersInput r4 = new com.whatsapp.infra.graphql.generated.usync.calls.XWA2WAUsersInput
            r4.<init>()
            java.lang.String r0 = "query_input"
            r4.A06(r0, r1)
            java.lang.String r1 = "INTERACTIVE"
            java.lang.String r0 = "context"
            X.8Kx r2 = r5.A00()
            X.C162478Kx.A01(r2, r1, r0)
            java.lang.String r1 = "telemetry"
            X.8Kx r0 = r4.A02()
            r0.A06(r2, r1)
            X.A7K r3 = new X.A7K
            r3.<init>()
            java.lang.String r0 = "input"
            r3.A04(r4, r0)
            java.lang.Boolean r1 = X.AnonymousClass000.A0i()
            java.lang.String r0 = "include_about_status"
            r3.A06(r0, r1)
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.UsyncQueryResponseImpl> r2 = com.whatsapp.infra.graphql.generated.usync.UsyncQueryResponseImpl.class
            java.lang.String r0 = "UsyncQuery"
            X.AIj r1 = new X.AIj
            r1.<init>(r3, r2, r0)
            X.97T r3 = new X.97T
            r3.<init>(r9, r10)
            X.1PY r0 = r10.A04
            X.A2g r2 = r0.A01(r1)
            r1 = 36
            X.Ali r0 = new X.Ali
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A04(r0)
            return
        L_0x02f0:
            r6 = 0
            goto L_0x025a
        L_0x02f3:
            X.1OZ r6 = r10.A07
            java.lang.String r5 = r6.A0B()
            X.1PX r0 = r10.A06
            java.lang.String r4 = "UpdateUserStatus"
            java.lang.String r3 = r0.A00(r4)
            if (r3 == 0) goto L_0x0482
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0482
            X.9lt r12 = r10.A05
            boolean r0 = X.C22971Dz.A0Y(r9)
            if (r0 == 0) goto L_0x0482
            X.0ve r12 = r12.A01
            r0 = 2249(0x8c9, float:3.152E-42)
            boolean r0 = X.C18020vd.A05(r7, r12, r0)
            if (r0 == 0) goto L_0x0482
            r13 = 1
            r0 = 2250(0x8ca, float:3.153E-42)
            int r0 = X.C18020vd.A00(r7, r12, r0)
            r0 = r0 & 1
            if (r0 != r13) goto L_0x0482
        L_0x0326:
            r0 = 9668(0x25c4, float:1.3548E-41)
            boolean r0 = X.C18020vd.A05(r7, r8, r0)
            if (r0 == 0) goto L_0x047f
            X.1Mx r0 = r10.A01
            X.C18070vi.A0d(r9, r11)
            X.2lX r0 = r0.A05(r9)
            if (r0 == 0) goto L_0x047f
            byte[] r15 = r0.A01
        L_0x033b:
            if (r13 == 0) goto L_0x0409
            if (r3 == 0) goto L_0x0485
            r13 = 0
            r12 = 0
            if (r15 == 0) goto L_0x0406
            X.9ju r13 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r1 = android.util.Base64.encodeToString(r15, r11)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "tctoken"
            X.8Kx r12 = r13.A00()
            X.C162478Kx.A01(r12, r1, r0)
            r8 = 1
        L_0x0357:
            com.whatsapp.infra.graphql.generated.mex.calls.XWA2UserUpdateVersions r2 = new com.whatsapp.infra.graphql.generated.mex.calls.XWA2UserUpdateVersions
            r2.<init>()
            java.lang.String r1 = r9.user
            X.C18070vi.A0d(r1, r11)
            java.lang.String r0 = "user_id"
            r2.A05(r0, r1)
            java.lang.String r1 = "privacy_token"
            if (r8 == 0) goto L_0x0378
            X.8Kx r0 = r2.A02()
            if (r12 != 0) goto L_0x0375
            X.8Kx r12 = r13.A00()
        L_0x0375:
            r0.A06(r12, r1)
        L_0x0378:
            X.1IX r12 = X.AnonymousClass1IX.of(r2)
            java.lang.String r0 = "STATUS"
            X.1IX r8 = X.AnonymousClass1IX.of(r0)
            X.A7K r2 = new X.A7K
            r2.<init>()
            X.C18070vi.A0b(r12)
            X.C18070vi.A0d(r12, r11)
            java.lang.String r0 = "users"
            X.29S r1 = r2.A00
            r1.A06(r0, r12)
            X.C18070vi.A0b(r8)
            X.C18070vi.A0d(r8, r11)
            java.lang.String r0 = "updates"
            r1.A06(r0, r8)
            java.lang.Class<com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl> r1 = com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl.class
            r8 = 0
            X.AIj r0 = new X.AIj
            r0.<init>(r2, r1, r4)
            X.A7K r0 = r0.A00
            X.29S r2 = r0.A00
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            X.8Kx r0 = r2.A00
            com.facebook.graphql.calls.GraphQlCallInput.A01(r0, r2, r1)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r1)
            org.json.JSONObject r1 = X.C17880vN.A15()
            java.lang.String r0 = "queryId"
            r1.put(r0, r3)
            java.lang.String r0 = "variables"
            r1.put(r0, r2)
            java.lang.String r1 = X.C18070vi.A0H(r1)
            X.9F7 r0 = new X.9F7
            r0.<init>((X.C178719Ee) r8, (java.lang.String) r5, (java.lang.String) r3, (java.lang.String) r1)
            java.lang.Object r4 = r0.A00
            X.1ca r4 = (X.C29621ca) r4
            X.97V r3 = new X.97V
            r3.<init>(r9, r10, r0)
        L_0x03dd:
            X.9lt r8 = r10.A05
            r0 = 35
            X.Ali r2 = new X.Ali
            r2.<init>((java.lang.Object) r3, (int) r0)
            boolean r0 = X.C22971Dz.A0Y(r9)
            if (r0 == 0) goto L_0x03fb
            X.0ve r1 = r8.A01
            r0 = 2249(0x8c9, float:3.152E-42)
            boolean r0 = X.C18020vd.A05(r7, r1, r0)
            if (r0 == 0) goto L_0x03fb
            X.11P r0 = r8.A00
            r2.invoke(r0)
        L_0x03fb:
            r11 = 0
            r10 = 41
            r7 = r3
            r8 = r4
            r9 = r5
            r6.A0N(r7, r8, r9, r10, r11)
            return
        L_0x0406:
            r8 = 0
            goto L_0x0357
        L_0x0409:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            long r16 = X.C17880vN.A04(r1)
            r12 = 0
            if (r15 == 0) goto L_0x047d
            java.lang.String r0 = "tctoken"
            X.1ca r14 = new X.1ca
            r14.<init>((java.lang.String) r0, (byte[]) r15, (X.AnonymousClass1MD[]) r12)
        L_0x041c:
            r1 = 0
            java.lang.String r15 = "jid"
            r3 = 2
            java.lang.String r13 = "user"
            r4 = 1
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0465
            X.1MD[] r1 = new X.AnonymousClass1MD[r4]
            X.C17880vN.A1I(r9, r15, r1, r11)
            X.1ca r0 = new X.1ca
            r0.<init>((X.C29621ca) r14, (java.lang.String) r13, (X.AnonymousClass1MD[]) r1)
            r8.add(r0)
        L_0x0436:
            X.1ca[] r0 = X.C17890vO.A1Y(r8, r11)
            java.lang.String r1 = "status"
            X.1ca r8 = new X.1ca
            r8.<init>((java.lang.String) r1, (X.AnonymousClass1MD[]) r12, (X.C29621ca[]) r0)
            r0 = 4
            X.1MD[] r2 = new X.AnonymousClass1MD[r0]
            java.lang.String r0 = "id"
            X.C17880vN.A1Q(r0, r5, r2, r11)
            java.lang.String r0 = "xmlns"
            X.C17880vN.A1Q(r0, r1, r2, r4)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C17880vN.A1Q(r1, r0, r2, r3)
            X.8v4 r0 = X.C173438v4.A00
            X.1ca r4 = X.C29621ca.A00(r0, r8, r2)
            X.97U r3 = new X.97U
            r3.<init>(r9, r10)
            goto L_0x03dd
        L_0x0465:
            X.1MD[] r2 = new X.AnonymousClass1MD[r3]
            X.C17880vN.A1I(r9, r15, r2, r11)
            java.lang.String r1 = "t"
            java.lang.String r0 = java.lang.String.valueOf(r16)
            X.C17880vN.A1Q(r1, r0, r2, r4)
            X.1ca r0 = new X.1ca
            r0.<init>((X.C29621ca) r14, (java.lang.String) r13, (X.AnonymousClass1MD[]) r2)
            r8.add(r0)
            goto L_0x0436
        L_0x047d:
            r14 = r12
            goto L_0x041c
        L_0x047f:
            r15 = 0
            goto L_0x033b
        L_0x0482:
            r13 = 0
            goto L_0x0326
        L_0x0485:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x048a:
            java.lang.Object r8 = r6.A03
            com.whatsapp.ptv.PushToVideoRecordingCountdown r8 = (com.whatsapp.ptv.PushToVideoRecordingCountdown) r8
            int r7 = r8.A00
            r0 = 1
            int r7 = r7 - r0
            if (r7 <= 0) goto L_0x04b0
            android.content.Context r5 = r8.getContext()
            X.11C r4 = r8.getSystemServices()
            android.content.Context r3 = r8.getContext()
            r2 = 2131886121(0x7f120029, float:1.9406812E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            X.C17880vN.A1T(r1, r7, r0)
            java.lang.String r0 = r3.getString(r2, r1)
            X.AnonymousClass1Y5.A00(r5, r4, r0)
        L_0x04b0:
            com.whatsapp.ptv.PushToVideoRecordingCountdown.A02(r8, r7)
            android.os.Handler r2 = r8.A08
            if (r7 != 0) goto L_0x04c1
            java.lang.Object r6 = r6.A02
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            long r0 = r8.A01
        L_0x04bd:
            r2.postDelayed(r6, r0)
            return
        L_0x04c1:
            long r0 = r6.A01
            goto L_0x04bd
        L_0x04c4:
            java.lang.Object r2 = r6.A02
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            long r12 = r6.A01
            java.lang.Object r10 = r6.A03
            com.whatsapp.jid.GroupJid r10 = (com.whatsapp.jid.GroupJid) r10
            X.11P r6 = r2.A05
            X.1KB r3 = r2.A05
            X.1VP r4 = r2.A0l
            X.1TD r7 = r2.A1D
            X.1Uq r9 = r2.A1G
            X.1TA r8 = r2.A1F
            r11 = 1
            X.00H r0 = r2.A1m
            java.lang.Object r1 = r0.get()
            X.17w r1 = (X.C219117w) r1
            java.lang.Class<X.12O> r0 = X.AnonymousClass12O.class
            X.11a r5 = r1.A01(r0)
            X.12O r5 = (X.AnonymousClass12O) r5
            X.C63982u1.A05(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x04ef:
            java.lang.Object r1 = r6.A02
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            java.lang.Object r7 = r6.A03
            com.whatsapp.workmanager.ObservableWorkerFactory$LogExceptionsWorker r7 = (com.whatsapp.workmanager.ObservableWorkerFactory$LogExceptionsWorker) r7
            long r5 = r6.A01
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.get()     // Catch:{ all -> 0x0501 }
            goto L_0x053a
        L_0x0501:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x054e }
            java.lang.String r0 = "ObservableWorkerFactory/Worker "
            r1.append(r0)     // Catch:{ all -> 0x054e }
            androidx.work.WorkerParameters r0 = r7.A01     // Catch:{ all -> 0x054e }
            java.util.UUID r0 = r0.A08     // Catch:{ all -> 0x054e }
            r1.append(r0)     // Catch:{ all -> 0x054e }
            java.lang.String r0 = " had exception"
            r1.append(r0)     // Catch:{ all -> 0x054e }
            X.C17880vN.A1M(r1, r3)     // Catch:{ all -> 0x054e }
            boolean r0 = r3 instanceof java.util.concurrent.ExecutionException     // Catch:{ all -> 0x054e }
            if (r0 == 0) goto L_0x053a
            X.3LU r1 = r7.A01     // Catch:{ all -> 0x054e }
            X.A2q r0 = r7.A00     // Catch:{ all -> 0x054e }
            java.lang.String r2 = X.C17890vO.A0U(r0)     // Catch:{ all -> 0x054e }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x054e }
            java.lang.Throwable r0 = r3.getCause()     // Catch:{ all -> 0x054e }
            if (r0 == 0) goto L_0x0530
            r3 = r0
        L_0x0530:
            X.Ai7 r1 = (X.C21322Ai7) r1     // Catch:{ all -> 0x054e }
            X.190 r1 = r1.A00     // Catch:{ all -> 0x054e }
            java.lang.String r0 = "workmanager-worker-exception"
            r1.A0E(r0, r2, r3)     // Catch:{ all -> 0x054e }
        L_0x053a:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r5
            X.3LU r1 = r7.A01
            X.A2q r0 = r7.A00
            java.lang.String r0 = X.C17890vO.A0U(r0)
            X.C18070vi.A0X(r0)
            r1.CAd(r0, r2)
            return
        L_0x054e:
            r4 = move-exception
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r5
            X.3LU r1 = r7.A01
            X.A2q r0 = r7.A00
            java.lang.String r0 = X.C17890vO.A0U(r0)
            X.C18070vi.A0X(r0)
            r1.CAd(r0, r2)
            throw r4
        L_0x0563:
            r2 = r8
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0599 }
            X.1Ev r9 = r2.A02     // Catch:{ all -> 0x0599 }
            java.lang.String r11 = "devices"
            java.lang.String r12 = "device_id = ?"
            java.lang.String[] r14 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0599 }
            java.lang.String r3 = r7.getRawString()     // Catch:{ all -> 0x0599 }
            r2 = 0
            r14[r2] = r3     // Catch:{ all -> 0x0599 }
            java.lang.String r13 = "setLastActiveTime/UPDATE_DEVICES"
            r9.A02(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0599 }
            monitor-enter(r4)     // Catch:{ all -> 0x0599 }
            X.10w r2 = r4.A00     // Catch:{ all -> 0x0596 }
            if (r2 == 0) goto L_0x058c
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x0596 }
            X.4Zh r2 = (X.C88344Zh) r2     // Catch:{ all -> 0x0596 }
            if (r2 == 0) goto L_0x058c
            r2.A00 = r0     // Catch:{ all -> 0x0596 }
        L_0x058c:
            monitor-exit(r4)     // Catch:{ all -> 0x0596 }
            r8.close()
            r0 = 37
            X.AnonymousClass35V.A00(r5, r6, r0)
            return
        L_0x0596:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0596 }
            throw r0     // Catch:{ all -> 0x0599 }
        L_0x0599:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x059e }
            throw r1
        L_0x059e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3C3.run():void");
    }
}
