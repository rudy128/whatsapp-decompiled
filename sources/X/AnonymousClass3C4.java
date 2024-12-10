package X;

/* renamed from: X.3C4  reason: invalid class name */
public class AnonymousClass3C4 implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass3C4(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARNING: type inference failed for: r9v6, types: [X.2Mj, X.20i, X.2MH, X.206] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x036c, code lost:
        r6.A0J(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x036f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x062f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0633, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0636, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0637, code lost:
        X.CDX.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x063a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x08f1, code lost:
        if (r4.A0N() != false) goto L_0x08f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0932, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0935, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0c54, code lost:
        r4.notifyAllObservers(new X.AnonymousClass35N(r3, r2, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0c5c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0cee, code lost:
        r4.notifyAllObservers(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0cf1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0d96, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0e0f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0e13, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0e16, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0e17, code lost:
        X.CDX.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0e1a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0244, code lost:
        if (r1 != false) goto L_0x0246;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r33 = this;
            r6 = r33
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0d40;
                case 1: goto L_0x0304;
                case 2: goto L_0x0cf2;
                case 3: goto L_0x0cd1;
                case 4: goto L_0x0cac;
                case 5: goto L_0x0c7d;
                case 6: goto L_0x0c5d;
                case 7: goto L_0x0c4b;
                case 8: goto L_0x0c41;
                case 9: goto L_0x0c37;
                case 10: goto L_0x0c2d;
                case 11: goto L_0x0c23;
                case 12: goto L_0x0c19;
                case 13: goto L_0x02db;
                case 14: goto L_0x0bc3;
                case 15: goto L_0x08bd;
                case 16: goto L_0x0841;
                case 17: goto L_0x0822;
                case 18: goto L_0x028a;
                case 19: goto L_0x0205;
                case 20: goto L_0x07fb;
                case 21: goto L_0x07c3;
                case 22: goto L_0x079e;
                case 23: goto L_0x073e;
                case 24: goto L_0x0654;
                case 25: goto L_0x0642;
                case 26: goto L_0x01dd;
                case 27: goto L_0x05d4;
                case 28: goto L_0x0070;
                case 29: goto L_0x05b1;
                case 30: goto L_0x0d5c;
                case 31: goto L_0x056f;
                case 32: goto L_0x01b6;
                case 33: goto L_0x048a;
                case 34: goto L_0x018c;
                case 35: goto L_0x0426;
                case 36: goto L_0x03fc;
                case 37: goto L_0x03e8;
                case 38: goto L_0x0168;
                case 39: goto L_0x03c3;
                case 40: goto L_0x013d;
                case 41: goto L_0x03b1;
                case 42: goto L_0x039c;
                case 43: goto L_0x0007;
                case 44: goto L_0x0007;
                case 45: goto L_0x0382;
                case 46: goto L_0x0370;
                case 47: goto L_0x0051;
                case 48: goto L_0x00cf;
                case 49: goto L_0x0382;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r6.A01
            X.126 r4 = (X.AnonymousClass126) r4
            java.lang.Object r3 = r6.A02
            X.1E9 r3 = (X.AnonymousClass1E9) r3
            java.lang.Object r1 = r6.A03
            X.2tp r1 = (X.C63872tp) r1
            X.1MZ r0 = r4.A0O
            r0.A09(r1)
            boolean r1 = r0.A0I(r3)
            X.11S r0 = r4.A05
            if (r1 == 0) goto L_0x004b
            X.1yJ r0 = r0.A08()
        L_0x0024:
            X.C17960vV.A07(r0)
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            X.2nE r1 = X.C63962tz.A02(r0)
            java.lang.String r0 = r3.getRawString()
            X.2nC r2 = new X.2nC
            r2.<init>(r1, r0)
            X.1P3 r0 = r4.A0H
            r1 = 0
            X.1Oy r0 = r0.A08
            boolean r0 = r0.A05(r2, r1)
            if (r0 == 0) goto L_0x004a
            X.1PT r1 = r4.A0e
            java.lang.Integer r0 = X.C17880vN.A0h()
            r1.A0D(r3, r0)
        L_0x004a:
            return
        L_0x004b:
            r0.A0I()
            X.1E3 r0 = r0.A02
            goto L_0x0024
        L_0x0051:
            java.lang.Object r3 = r6.A01
            X.126 r3 = (X.AnonymousClass126) r3
            java.lang.Object r2 = r6.A02
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            java.lang.Object r1 = r6.A03
            java.util.Collection r1 = (java.util.Collection) r1
            X.AnonymousClass126.A0A(r3, r2)
            X.1MZ r0 = r3.A0O
            r0.A0D(r2, r1)
            X.1KB r6 = r3.A04
            r0 = 45
            X.7Qq r5 = new X.7Qq
            r5.<init>(r3, r2, r0)
            goto L_0x036c
        L_0x0070:
            java.lang.Object r2 = r6.A01
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r5 = r6.A02
            X.2gK r5 = (X.C55762gK) r5
            java.lang.Object r4 = r6.A03
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            r0 = 2
            X.C18070vi.A0d(r4, r0)
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = r2.getHost()
            boolean r0 = X.C32981i4.A0D(r1, r0)
            if (r0 == 0) goto L_0x00bf
            java.util.List r2 = r2.getPathSegments()
            int r1 = r2.size()
            r0 = 1
            if (r1 <= r0) goto L_0x00c4
            java.lang.String r1 = X.C17880vN.A0w(r2, r0)
        L_0x009d:
            if (r1 == 0) goto L_0x00c4
            X.1Dx r0 = com.whatsapp.jid.PhoneUserJid.Companion
            com.whatsapp.jid.PhoneUserJid r3 = r0.A03(r1)
            if (r3 == 0) goto L_0x00c4
            X.0ve r2 = r5.A04
            r1 = 8014(0x1f4e, float:1.123E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00c4
            X.1Ty r2 = r5.A01
            X.2xw r1 = new X.2xw
            r1.<init>(r5, r3, r4)
            r0 = 0
            r2.A0F(r1, r3, r0)
            return
        L_0x00bf:
            java.lang.String r1 = X.C32981i4.A07(r2)
            goto L_0x009d
        L_0x00c4:
            X.1KB r6 = r5.A00
            r0 = 14
            X.4rM r5 = new X.4rM
            r5.<init>(r4, r0)
            goto L_0x036c
        L_0x00cf:
            java.lang.Object r5 = r6.A01
            X.126 r5 = (X.AnonymousClass126) r5
            java.lang.Object r4 = r6.A02
            X.1EC r4 = (X.AnonymousClass1EC) r4
            java.lang.Object r3 = r6.A03
            java.util.Map r3 = (java.util.Map) r3
            X.1Ux r2 = r5.A0M
            X.11P r0 = r5.A0F
            long r0 = X.AnonymousClass11P.A00(r0)
            java.util.ArrayList r6 = r2.A00(r4, r0)
            java.util.HashSet r4 = X.C17880vN.A12()
            java.util.Iterator r3 = X.C17890vO.A0l(r3)
        L_0x00ef:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0116
            java.lang.Object r2 = r3.next()
            X.2nJ r2 = (X.C60052nJ) r2
            java.util.HashSet r1 = X.C17880vN.A12()
            com.whatsapp.jid.UserJid r0 = r2.A02
            r1.add(r0)
            com.whatsapp.jid.PhoneUserJid r0 = r2.A01
            if (r0 == 0) goto L_0x010b
            r1.add(r0)
        L_0x010b:
            X.1E2 r0 = r2.A00
            if (r0 == 0) goto L_0x0112
            r1.add(r0)
        L_0x0112:
            r4.addAll(r1)
            goto L_0x00ef
        L_0x0116:
            java.util.Iterator r3 = r6.iterator()
        L_0x011a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r2 = r3.next()
            X.23S r2 = (X.AnonymousClass23S) r2
            X.205 r0 = r2.A0v
            X.1BI r0 = r0.A00
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x011a
            r0 = 1
            r2.A07 = r0
            r0 = 0
            r2.A01 = r0
            X.122 r0 = r5.A0K
            r0.CQw(r2)
            goto L_0x011a
        L_0x013d:
            java.lang.Object r4 = r6.A01
            com.whatsapp.gallerypicker.GalleryPickerFragment r4 = (com.whatsapp.gallerypicker.GalleryPickerFragment) r4
            java.lang.Object r3 = r6.A02
            X.6yS r3 = (X.C139226yS) r3
            java.lang.Object r2 = r6.A03
            java.util.List r0 = X.C42011xT.A0I
            X.1M9 r1 = r4.A09
            if (r1 == 0) goto L_0x0d59
            X.1Dv r0 = X.AnonymousClass1BI.A00
            java.lang.String r0 = r3.A04
            X.1BI r0 = X.C22931Dv.A01(r0)
            X.1E7 r1 = r1.A0E(r0)
            if (r1 == 0) goto L_0x004a
            X.1KB r6 = r4.A05
            if (r6 == 0) goto L_0x0d56
            r0 = 39
            X.3C4 r5 = new X.3C4
            r5.<init>(r4, r1, r2, r0)
            goto L_0x036c
        L_0x0168:
            java.lang.Object r4 = r6.A01
            X.1bI r4 = (X.C28931bI) r4
            java.lang.Object r3 = r6.A02
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r6.A03
            r1 = 0
            r0 = 8
            r4.A04(r0)
            if (r3 == 0) goto L_0x004a
            r0 = 0
            r3.setAlpha(r0)
            r3.setVisibility(r1)
            r1 = 18
            X.7Qq r0 = new X.7Qq
            r0.<init>(r2, r3, r1)
            r3.post(r0)
            return
        L_0x018c:
            java.lang.Object r3 = r6.A01
            java.lang.Object r2 = r6.A02
            com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment r2 = (com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment) r2
            java.lang.Object r1 = r6.A03
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            X.5kV r0 = r2.A0F
            if (r0 == 0) goto L_0x01b4
            X.1uh r0 = r0.A00
            java.util.List r0 = r0.A02
        L_0x019e:
            boolean r0 = X.C18070vi.A18(r3, r0)
            if (r0 != 0) goto L_0x004a
            if (r1 == 0) goto L_0x004a
            androidx.recyclerview.widget.RecyclerView r0 = r2.A06
            if (r0 == 0) goto L_0x004a
            X.1qy r0 = r0.getLayoutManager()
            if (r0 == 0) goto L_0x004a
            r0.A19(r1)
            return
        L_0x01b4:
            r0 = 0
            goto L_0x019e
        L_0x01b6:
            java.lang.Object r1 = r6.A01
            X.6Ii r1 = (X.AnonymousClass6Ii) r1
            java.lang.Object r3 = r6.A02
            java.lang.Object r2 = r6.A03
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r2 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r2
            r0 = 0
            r1.A01 = r0
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = r2.A0F
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x004a
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = r3.toString()
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer.A01(r2, r0)
            return
        L_0x01dd:
            java.lang.Object r4 = r6.A01
            X.1ML r4 = (X.AnonymousClass1ML) r4
            java.lang.Object r1 = r6.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r3 = r6.A03
            java.util.Collection r3 = (java.util.Collection) r3
            X.1Ln r0 = r4.A03
            java.util.Set r0 = r0.A0M(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x01f3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004a
            com.whatsapp.jid.UserJid r1 = X.C17880vN.A0T(r2)
            X.10f r0 = X.C199410f.copyOf((java.util.Collection) r3)
            r4.A04(r0, r1)
            goto L_0x01f3
        L_0x0205:
            java.lang.Object r0 = r6.A01
            X.1hb r0 = (X.C32691hb) r0
            java.lang.Object r7 = r6.A02
            X.206 r7 = (X.AnonymousClass206) r7
            java.lang.Object r1 = r6.A03
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            X.00H r0 = r0.A0a
            java.lang.Object r6 = r0.get()
            X.2qs r6 = (X.C62152qs) r6
            X.23z r7 = (X.C445823z) r7
            boolean r3 = r1.booleanValue()
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.205 r2 = r7.A0v
            X.1BI r5 = r2.A00
            X.36c r0 = X.C60492o7.A00(r7)
            if (r0 == 0) goto L_0x0288
            long r0 = r0.A00
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L_0x0233:
            if (r5 == 0) goto L_0x004a
            if (r4 == 0) goto L_0x004a
            boolean r1 = r2.A02
            if (r1 == 0) goto L_0x0283
            X.11S r0 = r6.A00
            com.whatsapp.jid.PhoneUserJid r2 = X.AnonymousClass11S.A00(r0)
        L_0x0241:
            if (r3 == 0) goto L_0x0246
            r12 = 1
            if (r1 == 0) goto L_0x0247
        L_0x0246:
            r12 = 0
        L_0x0247:
            boolean r3 = r7.A08
            X.0vl r0 = r6.A07
            java.lang.Object r1 = r0.getValue()
            X.122 r1 = (X.AnonymousClass122) r1
            X.1PQ r0 = r6.A05
            long r8 = r4.longValue()
            long r10 = r7.A0x
            java.lang.String r6 = r7.A06
            X.1PP r0 = r0.A02
            X.205 r5 = X.C17880vN.A0Z(r5, r0)
            r0 = 4
            if (r3 == 0) goto L_0x0275
            X.C18070vi.A0d(r6, r0)
            r7 = 170(0xaa, float:2.38E-43)
            X.985 r4 = new X.985
            r4.<init>(r5, r6, r7, r8, r10, r12)
            r4.A0d(r2)
        L_0x0271:
            r1.BBM(r4)
            return
        L_0x0275:
            X.C18070vi.A0d(r6, r0)
            r7 = 169(0xa9, float:2.37E-43)
            X.2MQ r4 = new X.2MQ
            r4.<init>(r5, r6, r7, r8, r10, r12)
            r4.A0d(r2)
            goto L_0x0271
        L_0x0283:
            com.whatsapp.jid.UserJid r2 = r7.A0I()
            goto L_0x0241
        L_0x0288:
            r4 = 0
            goto L_0x0233
        L_0x028a:
            java.lang.Object r4 = r6.A01
            X.1hb r4 = (X.C32691hb) r4
            java.lang.Object r3 = r6.A02
            X.206 r3 = (X.AnonymousClass206) r3
            java.lang.Object r5 = r6.A03
            X.206 r5 = (X.AnonymousClass206) r5
            int r1 = X.C63892tr.A00(r3)
            r0 = 1
            if (r1 != r0) goto L_0x02a8
            X.1Lg r2 = r4.A0G
            r1 = 6
            X.35N r0 = new X.35N
            r0.<init>(r5, r3, r1)
            r2.notifyAllObservers(r0)
        L_0x02a8:
            X.1Lg r0 = r4.A0G
            r0.A03(r5, r3)
            X.00H r0 = r4.A0Z
            java.lang.Object r2 = r0.get()
            X.1Q1 r2 = (X.AnonymousClass1Q1) r2
            X.205 r0 = r5.A0v
            X.1BI r1 = r0.A00
            r0 = 0
            r2.A03(r1, r0)
            X.10I r2 = r4.A0U
            r1 = 26
            X.3Bx r0 = new X.3Bx
            r0.<init>(r4, r3, r1)
            r2.CGF(r0)
            X.36w r0 = X.C60502o8.A00(r3)
            if (r0 == 0) goto L_0x004a
            X.1ha r1 = r4.A0R
            boolean r0 = X.C32681ha.A02(r1, r3)
            if (r0 == 0) goto L_0x004a
            X.C32681ha.A00(r1, r3)
            return
        L_0x02db:
            java.lang.Object r2 = r6.A01
            X.1Nf r2 = (X.C25181Nf) r2
            java.lang.Object r1 = r6.A02
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            java.lang.Object r3 = r6.A03
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.Class<X.1EC> r0 = X.AnonymousClass1EC.class
            com.whatsapp.jid.Jid r1 = r1.A06(r0)
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            if (r1 == 0) goto L_0x004a
            X.1MZ r0 = r2.A03
            boolean r0 = r0.A0J(r1)
            if (r0 == 0) goto L_0x004a
            X.12M r2 = r2.A04
            X.1EC r3 = (X.AnonymousClass1EC) r3
            java.lang.String r1 = "group_sync"
            r0 = 3
            r2.A0H(r3, r1, r0)
            return
        L_0x0304:
            java.lang.Object r8 = r6.A01
            X.2g2 r8 = (X.C55582g2) r8
            java.lang.Object r5 = r6.A02
            X.206 r5 = (X.AnonymousClass206) r5
            java.lang.Object r7 = r6.A03
            r0 = 2
            X.C18070vi.A0d(r7, r0)
            X.1Cd r0 = r8.A03
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0e14 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0e14 }
            java.lang.String r3 = "SELECT business_owner_jid_row_id FROM business_message_forward_info WHERE message_row_id = ?"
            java.lang.String[] r2 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0e14 }
            long r0 = r5.A0x     // Catch:{ all -> 0x0e14 }
            X.C17890vO.A1J(r2, r0)     // Catch:{ all -> 0x0e14 }
            java.lang.String r0 = "GET_BUSINESS_MESSAGE_FORWARD_INFO_FOR_MSG_ROW_ID_SQL"
            android.database.Cursor r2 = r4.A0A(r3, r0, r2)     // Catch:{ all -> 0x0e14 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0e0d }
            if (r0 == 0) goto L_0x0e06
            java.lang.String r0 = "business_owner_jid_row_id"
            int r0 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x0e0d }
            long r3 = (long) r0     // Catch:{ all -> 0x0e0d }
            r2.close()     // Catch:{ all -> 0x0e14 }
            r6.close()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x004a
            X.1DL r1 = r8.A02
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r2 = r1.A0E(r0, r3)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            if (r2 == 0) goto L_0x0363
            X.1M9 r0 = r8.A01
            X.1E7 r0 = r0.A0E(r2)
            X.36g r1 = new X.36g
            r1.<init>(r0, r2)
            java.lang.Class<X.36g> r0 = X.C691936g.class
            X.AnonymousClass206.A05(r5, r1, r0)
        L_0x0363:
            X.1KB r6 = r8.A00
            r0 = 30
            X.3Bq r5 = new X.3Bq
            r5.<init>(r7, r0)
        L_0x036c:
            r6.A0J(r5)
            return
        L_0x0370:
            java.lang.Object r0 = r6.A01
            X.126 r0 = (X.AnonymousClass126) r0
            java.lang.Object r2 = r6.A02
            X.1E9 r2 = (X.AnonymousClass1E9) r2
            java.lang.Object r1 = r6.A03
            java.util.List r1 = (java.util.List) r1
            X.1MZ r0 = r0.A0O
            r0.A0E(r2, r1)
            return
        L_0x0382:
            java.lang.Object r0 = r6.A01
            X.126 r0 = (X.AnonymousClass126) r0
            java.lang.Object r2 = r6.A02
            java.lang.Object r1 = r6.A03
            X.00H r0 = r0.A11
            X.10T r4 = X.C17880vN.A0V(r0)
            X.C18070vi.A0h(r2, r1)
            r0 = 10
            X.35N r3 = new X.35N
            r3.<init>(r2, r1, r0)
            goto L_0x0cee
        L_0x039c:
            java.lang.Object r4 = r6.A01
            X.1Ma r4 = (X.C24881Ma) r4
            java.lang.Object r3 = r6.A02
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            java.lang.Object r2 = r6.A03
            X.2Rt r2 = (X.C49752Rt) r2
            r1 = 0
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            r4.A02(r2, r3, r1)
            return
        L_0x03b1:
            java.lang.Object r2 = r6.A01
            X.89n r2 = (X.C1606889n) r2
            java.lang.Object r1 = r6.A02
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.lang.Object r0 = r6.A03
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r2.C7F(r1, r0)
            return
        L_0x03c3:
            java.lang.Object r1 = r6.A01
            com.whatsapp.gallerypicker.GalleryPickerFragment r1 = (com.whatsapp.gallerypicker.GalleryPickerFragment) r1
            java.lang.Object r3 = r6.A02
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            java.lang.Object r2 = r6.A03
            X.5nP r2 = (X.C113635nP) r2
            java.util.List r0 = X.C42011xT.A0I
            X.0vl r0 = r1.A0X
            java.lang.Object r1 = r0.getValue()
            X.1pZ r1 = (X.C37451pZ) r1
            X.0vl r0 = r2.A06
            java.lang.Object r0 = r0.getValue()
            X.C18070vi.A0X(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.A07(r0, r3)
            return
        L_0x03e8:
            java.lang.Object r3 = r6.A01
            com.whatsapp.gallery.GalleryTabHostFragment r3 = (com.whatsapp.gallery.GalleryTabHostFragment) r3
            java.lang.Object r2 = r6.A02
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r6.A03
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r0 = 2
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.gallery.GalleryTabHostFragment.A0E(r1, r2, r3)
            return
        L_0x03fc:
            java.lang.Object r0 = r6.A01
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r3 = r6.A02
            X.1Qe r3 = (X.C25931Qe) r3
            java.lang.Object r2 = r6.A03
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.util.Iterator r1 = r0.iterator()
        L_0x040c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x041c
            java.lang.Object r0 = r1.next()
            X.25F r0 = (X.AnonymousClass25F) r0
            X.C25931Qe.A00(r3, r0)
            goto L_0x040c
        L_0x041c:
            X.00H r0 = r3.A01
            X.11A r0 = X.C17880vN.A0d(r0)
            r0.A00(r2)
            return
        L_0x0426:
            java.lang.Object r3 = r6.A01
            X.1gW r3 = (X.C32031gW) r3
            java.lang.Object r5 = r6.A02
            X.206 r5 = (X.AnonymousClass206) r5
            java.lang.Object r6 = r6.A03
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            int r0 = r5.A0u
            boolean r0 = X.AnonymousClass25A.A0K(r0)
            if (r0 == 0) goto L_0x0459
            X.1Vr r2 = r3.A01
            java.io.File r0 = X.C27331Vr.A00(r5)
            if (r0 == 0) goto L_0x0459
            X.36u r1 = r5.A0O()
            X.C17960vV.A07(r1)
            byte[] r0 = r2.A01(r5)
            r1.A00(r0)
            java.lang.Class<X.36u> r0 = X.C693336u.class
            X.25F r0 = X.C18070vi.A09(r5, r0)
            r0.A00()
        L_0x0459:
            X.1Qe r4 = r3.A00
            r0 = 1
            X.25F[] r2 = new X.AnonymousClass25F[r0]
            r1 = 0
            java.lang.Class<X.36u> r3 = X.C693336u.class
            X.25F r0 = X.C18070vi.A09(r5, r3)
            r2[r1] = r0
            r4.A0A(r2)
            r6.run()     // Catch:{ IllegalStateException -> 0x046e }
            return
        L_0x046e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FMessageThumbnailAsyncLoader/callback fail after load/messageId:"
            X.AnonymousClass206.A06(r5, r0, r1)
            java.lang.String r0 = " lazyFieldLoaded:"
            r1.append(r0)
            X.25F r0 = X.C18070vi.A09(r5, r3)
            boolean r0 = r0.A03
            r1.append(r0)
            X.C17890vO.A0w(r1)
            throw r2
        L_0x048a:
            java.lang.Object r2 = r6.A01
            X.3VY r2 = (X.AnonymousClass3VY) r2
            java.lang.Object r5 = r6.A02
            java.io.File r5 = (java.io.File) r5
            java.lang.Object r6 = r6.A03
            X.23z r6 = (X.C445823z) r6
            r3 = 0
            X.1kd r4 = r2.A02
            X.1BI r0 = r2.A0E
            java.util.List r17 = X.C18070vi.A0M(r0)
            r14 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SendMedia/sendImage jids:"
            r1.append(r0)
            java.lang.Object[] r0 = r17.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            X.C17890vO.A1A(r1, r0)
            android.net.Uri r12 = android.net.Uri.fromFile(r5)
            r21 = 19
            X.2rc r13 = new X.2rc
            r13.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x04c7
            r13.A0H = r14
        L_0x04c7:
            X.1Sb r11 = r4.A09
            r0 = 1
            r16 = r14
            r18 = r14
            r19 = r14
            r23 = r3
            r15 = r14
            r20 = r0
            r22 = r3
            X.2tS r5 = r11.A04(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r5.A00 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.A03
            java.util.Iterator r11 = X.C29431cG.A0o(r0)
        L_0x04e3:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0524
            X.206 r10 = X.C17880vN.A0Y(r11)
            X.C18070vi.A0d(r10, r3)
            boolean r0 = r10 instanceof X.C438421d
            if (r0 == 0) goto L_0x04e3
            X.2il r9 = r2.A0D
            boolean r0 = r9.A00()
            if (r0 == 0) goto L_0x04e3
            long r0 = r6.A0x
            X.6RT r8 = X.AnonymousClass6RT.EVENT_COVER_IMAGE
            X.36t r7 = new X.36t
            r7.<init>(r8, r14, r0)
            X.C60512o9.A01(r10, r7)
            r0 = 67108864(0x4000000, double:3.31561842E-316)
            r10.A0b(r0)
            java.lang.Integer r0 = X.C17880vN.A0l()
            r10.A0S = r0
            r0 = 4096(0x1000, float:5.74E-42)
            r6.A0V(r0)
            X.121 r0 = r9.A00
            r0.CQw(r6)
            X.25F r0 = r6.A09
            r0.A01()
            goto L_0x04e3
        L_0x0524:
            X.0ve r2 = r4.A07
            r1 = 10537(0x2929, float:1.4765E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x055a
            X.2bF r10 = new X.2bF
            r10.<init>()
            X.Af0 r6 = new X.Af0
            r6.<init>()
            X.10I r2 = r4.A0G
            r1 = 47
            X.DTg r0 = new X.DTg
            r0.<init>(r6, r4, r12, r1)
            r2.CGF(r0)
            X.3Ae r0 = new X.3Ae
            r12 = r14
            r13 = r14
            r16 = r3
            r17 = r3
            r7 = r0
            r8 = r4
            r9 = r14
            r11 = r5
            r15 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r6.A09(r0)
            return
        L_0x055a:
            byte[] r13 = X.C34531kd.A03(r12, r4)
            X.1iW r0 = r4.A03
            r8 = r14
            r10 = r14
            r11 = r14
            r12 = r14
            r15 = r3
            r16 = r3
            r6 = r0
            r7 = r14
            r9 = r5
            r14 = r3
            X.C33251iW.A04(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x056f:
            java.lang.Object r5 = r6.A01
            com.whatsapp.email.VerifyEmailActivity r5 = (com.whatsapp.email.VerifyEmailActivity) r5
            java.lang.Object r4 = r6.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r6 = r6.A03
            java.lang.Long r6 = (java.lang.Long) r6
            X.00H r0 = r5.A4b()
            java.lang.Object r7 = r0.get()
            X.9kJ r7 = (X.C190059kJ) r7
            java.lang.String r8 = r5.A0C
            int r10 = r5.A00
            r12 = 2
            java.lang.String r9 = java.lang.String.valueOf(r4)
            r11 = 8
            r13 = r12
            r7.A00(r8, r9, r10, r11, r12, r13)
            X.AnonymousClass4Yv.A00(r5, r12)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = X.C17900vP.A01(r6)
            long r2 = r2.toMillis(r0)
            X.11P r0 = r5.A05
            long r0 = X.AnonymousClass11P.A01(r0)
            long r2 = r2 + r0
            r5.A01 = r2
            com.whatsapp.email.VerifyEmailActivity.A0V(r5, r6)
            com.whatsapp.email.VerifyEmailActivity.A0Q(r5, r4, r6)
            return
        L_0x05b1:
            java.lang.Object r3 = r6.A01
            X.3hR r3 = (X.C75403hR) r3
            java.lang.Object r0 = r6.A02
            X.1FR r0 = (X.AnonymousClass1FR) r0
            java.lang.Object r2 = r6.A03
            X.5Zh r2 = (X.C107335Zh) r2
            r0.CEx()
            X.2Pc r1 = r3.A00
            if (r1 == 0) goto L_0x05d0
            r0 = 0
            r1.A01 = r0
            r1.A00 = r0
            r0 = 1
            r1.A0B(r0)
            r0 = 0
            r3.A00 = r0
        L_0x05d0:
            r2.Boi()
            return
        L_0x05d4:
            java.lang.Object r1 = r6.A01
            X.1TH r1 = (X.AnonymousClass1TH) r1
            java.lang.Object r7 = r6.A02
            X.1TI r7 = (X.AnonymousClass1TI) r7
            java.lang.Object r8 = r6.A03
            java.util.concurrent.Executor r8 = (java.util.concurrent.Executor) r8
            X.1TJ r6 = r1.A00
            java.lang.Object r0 = r6.A00()
            if (r0 != 0) goto L_0x063e
            X.C17960vV.A01()
            X.1Oq r0 = r1.A02
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0634 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0634 }
            java.lang.String r3 = "SELECT DISTINCT (device_id) FROM msg_history_sync WHERE status=?"
            r5 = 1
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ all -> 0x0634 }
            java.lang.String r1 = "1"
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0634 }
            java.lang.String r0 = "MessageHistorySyncTable.SELECT_ALL_DEVICE_ID_FOR_SYNC_STATUS"
            android.database.Cursor r3 = r9.A0A(r3, r0, r2)     // Catch:{ all -> 0x0634 }
            java.util.HashMap r2 = X.C17880vN.A11()     // Catch:{ all -> 0x062d }
        L_0x060a:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x062d }
            if (r0 == 0) goto L_0x0626
            X.1E0 r1 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ all -> 0x062d }
            java.lang.String r0 = "device_id"
            java.lang.String r0 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x062d }
            com.whatsapp.jid.DeviceJid r1 = r1.A06(r0)     // Catch:{ all -> 0x062d }
            if (r1 == 0) goto L_0x060a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x062d }
            r2.put(r1, r0)     // Catch:{ all -> 0x062d }
            goto L_0x060a
        L_0x0626:
            r6.A04(r2)     // Catch:{ all -> 0x062d }
            r3.close()     // Catch:{ all -> 0x0634 }
            goto L_0x063b
        L_0x062d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x062f }
        L_0x062f:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0634 }
            throw r0     // Catch:{ all -> 0x0634 }
        L_0x0634:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0636 }
        L_0x0636:
            r1 = move-exception
            X.CDX.A00(r4, r0)
            throw r1
        L_0x063b:
            r4.close()
        L_0x063e:
            r6.A03(r7, r8)
            return
        L_0x0642:
            java.lang.Object r0 = r6.A01
            X.2uU r0 = (X.C64262uU) r0
            java.lang.Object r2 = r6.A02
            X.4Zh r2 = (X.C88344Zh) r2
            java.lang.Object r1 = r6.A03
            android.location.Location r1 = (android.location.Location) r1
            X.1RK r0 = r0.A01
            X.AnonymousClass1RK.A02(r1, r2, r0)
            return
        L_0x0654:
            java.lang.Object r0 = r6.A01
            X.30x r0 = (X.C678030x) r0
            java.lang.Object r2 = r6.A02
            X.2m6 r2 = (X.C59312m6) r2
            java.lang.Object r7 = r6.A03
            X.1RK r6 = r0.A01
            java.lang.Object r5 = r6.A0M
            monitor-enter(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x073b }
            java.lang.String r0 = "companion-device-manager/critical sync successful. DeviceJid: "
            r1.append(r0)     // Catch:{ all -> 0x073b }
            X.4Zh r9 = r2.A02     // Catch:{ all -> 0x073b }
            com.whatsapp.jid.DeviceJid r8 = r9.A08     // Catch:{ all -> 0x073b }
            X.C17900vP.A0b(r8, r1)     // Catch:{ all -> 0x073b }
            r0 = 42
            X.AnonymousClass35V.A00(r6, r2, r0)     // Catch:{ all -> 0x073b }
            X.1RB r2 = r6.A08     // Catch:{ all -> 0x073b }
            r1 = 2
            java.lang.String r0 = "CompanionDevice"
            android.location.Location r3 = r2.A03(r0, r1)     // Catch:{ all -> 0x073b }
            if (r3 == 0) goto L_0x071a
            long r10 = r3.getTime()     // Catch:{ all -> 0x073b }
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            long r10 = r10 + r0
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x073b }
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x071a
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x073b }
            java.lang.String r0 = "CompanionDevice/location/last "
            r2.append(r0)     // Catch:{ all -> 0x073b }
            long r0 = r3.getTime()     // Catch:{ all -> 0x073b }
            X.C17890vO.A16(r2, r0)     // Catch:{ all -> 0x073b }
            X.AnonymousClass1RK.A02(r3, r9, r6)     // Catch:{ all -> 0x073b }
        L_0x06a6:
            X.0z4 r4 = r6.A0E     // Catch:{ all -> 0x073b }
            java.lang.String r3 = r8.getRawString()     // Catch:{ all -> 0x073b }
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x073b }
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r4)     // Catch:{ all -> 0x073b }
            r0 = 0
            java.lang.String r2 = "companion_device_verification_ids"
            java.lang.String r0 = r1.getString(r2, r0)     // Catch:{ all -> 0x073b }
            if (r0 == 0) goto L_0x06c6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)     // Catch:{ all -> 0x073b }
            java.lang.String r0 = ","
            java.lang.String r3 = X.AnonymousClass001.A1H(r0, r3, r1)     // Catch:{ all -> 0x073b }
        L_0x06c6:
            r4.A1u(r2, r3)     // Catch:{ all -> 0x073b }
            X.118 r0 = r6.A0D     // Catch:{ all -> 0x073b }
            android.content.Context r10 = r0.A00     // Catch:{ all -> 0x073b }
            java.lang.Class<com.whatsapp.companiondevice.CompanionDeviceVerificationReceiver> r9 = com.whatsapp.companiondevice.CompanionDeviceVerificationReceiver.class
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x073b }
            r1.<init>(r10, r9)     // Catch:{ all -> 0x073b }
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r8 = 0
            android.app.PendingIntent r0 = X.C1408573i.A01(r10, r8, r1, r0)     // Catch:{ all -> 0x073b }
            if (r0 != 0) goto L_0x070e
            java.util.Random r0 = new java.util.Random     // Catch:{ all -> 0x073b }
            r0.<init>()     // Catch:{ all -> 0x073b }
            double r0 = r0.nextDouble()     // Catch:{ all -> 0x073b }
            r2 = 4712059816451768320(0x4164997000000000, double:1.08E7)
            double r0 = r0 * r2
            long r3 = (long) r0     // Catch:{ all -> 0x073b }
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r3 = r3 + r0
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x073b }
            long r1 = r1 + r3
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x073b }
            r0.<init>(r10, r9)     // Catch:{ all -> 0x073b }
            android.app.PendingIntent r3 = X.C17880vN.A06(r10, r0, r8)     // Catch:{ all -> 0x073b }
            X.1R8 r0 = r6.A0B     // Catch:{ all -> 0x073b }
            X.1R9 r0 = r0.A00     // Catch:{ all -> 0x073b }
            boolean r0 = r0.A01(r3, r8, r1)     // Catch:{ all -> 0x073b }
            if (r0 != 0) goto L_0x070e
            java.lang.String r0 = "CompanionDevice/scheduleCompanionDeviceVerificationAlarm AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x073b }
        L_0x070e:
            r0 = 0
            r6.A00 = r0     // Catch:{ all -> 0x073b }
            X.1RE r0 = r6.A0G     // Catch:{ all -> 0x073b }
            X.1RD r0 = r0.A04     // Catch:{ all -> 0x073b }
            r0.unregisterObserver(r7)     // Catch:{ all -> 0x073b }
            monitor-exit(r5)     // Catch:{ all -> 0x073b }
            goto L_0x073a
        L_0x071a:
            X.2uU r4 = new X.2uU     // Catch:{ all -> 0x073b }
            r4.<init>(r9, r6)     // Catch:{ all -> 0x073b }
            android.os.Handler r3 = r6.A04     // Catch:{ all -> 0x073b }
            r1 = 15
            X.3Ch r0 = new X.3Ch     // Catch:{ all -> 0x073b }
            r0.<init>(r6, r4, r1)     // Catch:{ all -> 0x073b }
            r3.post(r0)     // Catch:{ all -> 0x073b }
            r0 = 16
            X.3Ch r2 = new X.3Ch     // Catch:{ all -> 0x073b }
            r2.<init>(r6, r4, r0)     // Catch:{ all -> 0x073b }
            r0 = 60000(0xea60, double:2.9644E-319)
            r3.postDelayed(r2, r0)     // Catch:{ all -> 0x073b }
            goto L_0x06a6
        L_0x073a:
            return
        L_0x073b:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x073b }
            throw r1
        L_0x073e:
            java.lang.Object r8 = r6.A01
            X.1MW r8 = (X.AnonymousClass1MW) r8
            java.lang.Object r7 = r6.A02
            X.2tp r7 = (X.C63872tp) r7
            java.lang.Object r2 = r6.A03
            java.util.Map r2 = (java.util.Map) r2
            X.1MS r1 = r8.A04
            X.1E9 r0 = r7.A06
            X.2tp r6 = r1.A0A(r0)
            X.1Cd r0 = r8.A06
            X.1au r5 = r0.A05()
            X.1xA r4 = r5.BD0()     // Catch:{ all -> 0x0794 }
            java.util.Iterator r3 = X.AnonymousClass000.A15(r2)     // Catch:{ all -> 0x078a }
        L_0x0760:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x078a }
            if (r0 == 0) goto L_0x0780
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r3)     // Catch:{ all -> 0x078a }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x078a }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x078a }
            r1 = r7
            if (r6 == 0) goto L_0x0774
            r1 = r6
        L_0x0774:
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x078a }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ all -> 0x078a }
            X.AnonymousClass1MW.A06(r1, r8, r2, r0)     // Catch:{ all -> 0x078a }
            goto L_0x0760
        L_0x0780:
            r4.A00()     // Catch:{ all -> 0x078a }
            r4.close()     // Catch:{ all -> 0x0794 }
            r5.close()
            return
        L_0x078a:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x078f }
            goto L_0x0793
        L_0x078f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0794 }
        L_0x0793:
            throw r1     // Catch:{ all -> 0x0794 }
        L_0x0794:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0799 }
            throw r1
        L_0x0799:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x079e:
            java.lang.Object r1 = r6.A01
            X.2jq r1 = (X.C57912jq) r1
            java.lang.Object r3 = r6.A02
            X.1EC r3 = (X.AnonymousClass1EC) r3
            java.lang.Object r2 = r6.A03
            java.util.List r2 = (java.util.List) r2
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            X.00H r1 = r1.A01
            java.lang.Object r0 = r1.get()
            X.9re r0 = (X.C194389re) r0
            r0.A00(r3)
            java.lang.Object r0 = r1.get()
            X.9re r0 = (X.C194389re) r0
            r0.A02(r2)
            return
        L_0x07c3:
            java.lang.Object r4 = r6.A01
            X.1MZ r4 = (X.AnonymousClass1MZ) r4
            java.lang.Object r1 = r6.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            java.lang.Object r2 = r6.A03
            X.1DS r2 = (X.AnonymousClass1DS) r2
            X.1Ln r0 = r4.A0B
            X.1E1 r1 = (X.AnonymousClass1E1) r1
            com.whatsapp.jid.PhoneUserJid r1 = r0.A0D(r1)
            if (r1 != 0) goto L_0x07ed
            r3 = 0
            X.1A3 r0 = X.AnonymousClass1A3.A01
            r2.A0F(r0)
            X.190 r2 = r4.A00
            java.lang.String r1 = "lid_group_chat/pn_unknown"
            r0 = 0
            r2.A0G(r1, r3, r0)
        L_0x07e7:
            X.1KB r0 = r4.A01
            r0.A04()
            return
        L_0x07ed:
            java.lang.String r0 = "[LidGroup]GroupParticipantsManager/selectJidFor1to1Chat found PN JID"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1A3 r0 = new X.1A3
            r0.<init>(r1)
            r2.A0E(r0)
            goto L_0x07e7
        L_0x07fb:
            java.lang.Object r4 = r6.A01
            X.1NI r4 = (X.AnonymousClass1NI) r4
            java.lang.Object r3 = r6.A02
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.Object r2 = r6.A03
            X.1cn r2 = (X.C29741cn) r2
            X.1CJ r0 = r4.A01
            X.1ci r1 = r0.A0A(r3)
            if (r1 != 0) goto L_0x081b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "groupchatstore/updateGroupChatInfoInBackgroundIfExists/chat does not exist: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)
            goto L_0x0932
        L_0x081b:
            r1.A0h = r2
            r0 = 0
            X.AnonymousClass1NI.A00(r1, r4, r3, r0)
            return
        L_0x0822:
            java.lang.Object r4 = r6.A01
            X.1hG r4 = (X.C32481hG) r4
            java.lang.Object r3 = r6.A02
            X.206 r3 = (X.AnonymousClass206) r3
            java.lang.Object r2 = r6.A03
            X.206 r2 = (X.AnonymousClass206) r2
            X.1Q6 r1 = r4.A07
            X.205 r0 = r3.A0v
            r1.A0C(r0)
            r1.A0B(r2)
            X.1CJ r0 = r4.A03
            r0.A0M(r2)
            r0 = 1
            r3.A0z = r0
            return
        L_0x0841:
            java.lang.Object r4 = r6.A01
            X.122 r4 = (X.AnonymousClass122) r4
            java.lang.Object r3 = r6.A02
            X.206 r3 = (X.AnonymousClass206) r3
            java.lang.Object r5 = r6.A03
            java.util.Collection r5 = (java.util.Collection) r5
            X.1RS r7 = r4.A0e
            X.36j r0 = X.C63672tV.A02(r3)
            if (r0 == 0) goto L_0x0894
            int r11 = r0.A00
        L_0x0857:
            java.util.HashSet r2 = X.C17880vN.A12()
            r0 = 3
            if (r11 == r0) goto L_0x08a7
            X.1Le r0 = r7.A07
            java.util.ArrayList r9 = r0.A0A()
            java.util.ArrayList r10 = r0.A0B()
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            X.0ve r6 = r7.A09
            r1 = 6791(0x1a87, float:9.516E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r12 = X.C18020vd.A05(r0, r6, r1)
            java.util.HashSet r1 = X.AnonymousClass1RS.A00(r7, r8, r9, r10, r11, r12)
            X.1MR r0 = r7.A08
            java.util.HashMap r0 = r0.A07(r1)
            java.util.Iterator r1 = X.C17890vO.A0j(r0)
        L_0x0884:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0896
            java.lang.Object r0 = r1.next()
            java.util.Collection r0 = (java.util.Collection) r0
            r2.addAll(r0)
            goto L_0x0884
        L_0x0894:
            r11 = 3
            goto L_0x0857
        L_0x0896:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StatusParticipantUserManager/generateTargetDevicesFromPeerStatusSetting device size="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; mode="
            X.C17900vP.A0j(r0, r1, r11)
        L_0x08a7:
            r2.removeAll(r5)
            X.1Qw r1 = r4.A0Z
            X.205 r0 = r3.A0v
            java.util.Set r0 = r1.A03(r0)
            r2.removeAll(r0)
            X.1Qt r0 = X.C26111Qw.A00(r1, r3)
            r0.A0B(r3, r2)
            return
        L_0x08bd:
            java.lang.Object r5 = r6.A01
            X.122 r5 = (X.AnonymousClass122) r5
            java.lang.Object r7 = r6.A02
            X.205 r7 = (X.AnonymousClass205) r7
            java.lang.Object r4 = r6.A03
            X.AW0 r4 = (X.AW0) r4
            X.00H r0 = r5.A1E
            X.206 r3 = X.AnonymousClass1W2.A01(r7, r0)
            if (r3 == 0) goto L_0x0952
            X.AW0 r2 = X.AnonymousClass25B.A00(r3)
        L_0x08d5:
            X.1QS r0 = r5.A0z
            X.AnonymousClass1QS.A00(r0)
            X.1QR r6 = r0.A04
            java.lang.String r18 = " ts: "
            if (r2 == 0) goto L_0x0b5e
            int r15 = r2.A02
            java.lang.String r0 = r2.A0J
            r17 = r0
            boolean r0 = r2.A0N()
            if (r0 == 0) goto L_0x08f3
            boolean r0 = r4.A0N()
            r10 = 1
            if (r0 == 0) goto L_0x08f4
        L_0x08f3:
            r10 = 0
        L_0x08f4:
            int r9 = r4.A03
            long r0 = r4.A06
            X.8pG r8 = r4.A0A
            boolean r0 = r2.A0O(r8, r9, r0)
            java.lang.String r9 = " new: "
            if (r0 != 0) goto L_0x0936
            if (r10 != 0) goto L_0x0936
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CoreMessageStore/updateMessagePaymentTransaction/PAY nochange: old status: "
            r3.append(r0)
            int r0 = r2.A02
            r3.append(r0)
            r3.append(r9)
            int r0 = r4.A02
            r3.append(r0)
            java.lang.String r0 = " old ts: "
            r3.append(r0)
            long r0 = r2.A06
            r3.append(r0)
            java.lang.String r0 = " new ts: "
            r3.append(r0)
            long r0 = r4.A06
            r3.append(r0)
        L_0x092e:
            java.lang.String r0 = r3.toString()
        L_0x0932:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0936:
            java.lang.String r8 = r2.A0K
            java.lang.String r1 = r4.A0K
            if (r8 != 0) goto L_0x0940
            r2.A0K = r1
        L_0x093e:
            monitor-enter(r4)
            goto L_0x0954
        L_0x0940:
            if (r1 == 0) goto L_0x093e
            boolean r0 = r8.equals(r1)
            if (r0 != 0) goto L_0x093e
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CoreMessageStore/updateMessagePaymentTransaction/PAY nochange: id's not equal, old trans id: "
            X.C17900vP.A0c(r0, r8, r9, r1, r3)
            goto L_0x092e
        L_0x0952:
            r2 = 0
            goto L_0x08d5
        L_0x0954:
            boolean r0 = r4.A0K()     // Catch:{ all -> 0x0b5b }
            if (r0 != 0) goto L_0x0960
            int r1 = r4.A00     // Catch:{ all -> 0x0b5b }
            r0 = 1
            if (r1 != r0) goto L_0x0960
            goto L_0x0961
        L_0x0960:
            r0 = 0
        L_0x0961:
            monitor-exit(r4)
            if (r0 == 0) goto L_0x0983
            int r1 = r4.A02
            r0 = 405(0x195, float:5.68E-43)
            if (r1 != r0) goto L_0x0983
            long r0 = r3.A0x
            X.205 r8 = r3.A0v
            java.lang.String r9 = r8.A01
            java.lang.String r8 = r2.A0K
            X.AW0 r0 = r6.A0N(r9, r8, r0)
            if (r0 == 0) goto L_0x0983
            X.8pG r1 = r0.A0A
            if (r1 == 0) goto L_0x0983
            X.AEo r0 = r1.A02
            if (r0 == 0) goto L_0x0983
            r4.A07(r0, r1)
        L_0x0983:
            int r12 = r4.A02
            long r0 = r4.A06
            java.lang.String r11 = r4.A0H
            java.lang.String r10 = r4.A0J
            java.lang.String r9 = r4.A0F
            X.8pG r8 = r4.A0A
            r14 = 16
            monitor-enter(r2)
            r19 = r2
            r20 = r0
            r22 = r11
            r23 = r12
            r24 = r10
            r25 = r9
            r19.A06(r20, r22, r23, r24, r25)     // Catch:{ all -> 0x09ae }
            if (r8 == 0) goto L_0x09b1
            X.8pG r0 = r2.A0A     // Catch:{ all -> 0x09ae }
            if (r0 == 0) goto L_0x09ab
            r0.A0R(r8)     // Catch:{ all -> 0x09ae }
            goto L_0x09b1
        L_0x09ab:
            r2.A0A = r8     // Catch:{ all -> 0x09ae }
            goto L_0x09b1
        L_0x09ae:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x09b1:
            monitor-exit(r2)
            int r1 = r2.A03
            r0 = 5
            if (r1 != r0) goto L_0x0b23
            java.lang.String r0 = r7.A01
            boolean r0 = r6.A0e(r4, r2, r0)
            X.AnonymousClass25B.A02(r4, r3)
            r2.A0A(r4)
        L_0x09c3:
            if (r0 == 0) goto L_0x0baa
            int r0 = r4.A02
            if (r0 == r15) goto L_0x09f0
            X.1R5 r9 = r5.A0y
            X.205 r7 = r3.A0v
            long r0 = r3.A0I
            r31 = r0
            X.1R3 r0 = r9.A07
            X.1BI r11 = r7.A00
            X.206 r0 = r0.A05(r11)
            X.C17960vV.A07(r0)
            X.205 r0 = r0.A0v
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r7.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a0f
            X.1QE r2 = r9.A0A
            java.lang.String r1 = "Do not insert system message if last message is the transaction message."
            r0 = 0
            X.AnonymousClass1QE.A02(r2, r0, r1)
        L_0x09f0:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CoreMessageStore/updateMessagePaymentTransaction/PAY updated transaction status to: "
            r2.append(r0)
            int r0 = r4.A02
            r2.append(r0)
            r0 = r18
            r2.append(r0)
            long r0 = r4.A06
            X.C17890vO.A16(r2, r0)
            X.1Q2 r0 = r5.A0O
            r0.A01(r3, r14)
            goto L_0x0baa
        L_0x0a0f:
            X.1R2 r1 = r9.A0B
            java.lang.String r10 = r1.A0V(r2)
            java.lang.String r8 = r1.A0Y(r2)
            java.lang.String r16 = r1.A0T(r2)
            boolean r0 = r7.A02
            r30 = r0
            int r0 = r2.A02
            r19 = r0
            long r12 = r2.A06
            X.1KN r0 = r2.A09
            if (r0 != 0) goto L_0x0b1f
            X.118 r0 = r9.A04
            android.content.Context r6 = r0.A00
            r0 = 2131897312(0x7f122be0, float:1.942951E38)
            java.lang.String r22 = r6.getString(r0)
        L_0x0a36:
            X.1KN r0 = r2.A09
            r6 = 1
            if (r0 != 0) goto L_0x0b17
            r25 = 1
        L_0x0a3d:
            r20 = r10
            r21 = r8
            r23 = r19
            r24 = r15
            r26 = r31
            r28 = r12
            r19 = r1
            java.lang.String r0 = r19.A0f(r20, r21, r22, r23, r24, r25, r26, r28, r30)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x09f0
            X.1QE r13 = r9.A0A
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()
            java.lang.String r0 = "generatePaymentStatusChangeMessageIfNeeded receiverName:"
            r12.append(r0)
            r12.append(r10)
            java.lang.String r0 = " senderName:"
            r12.append(r0)
            r12.append(r8)
            java.lang.String r0 = " newStatus:"
            r12.append(r0)
            int r0 = r2.A02
            r12.append(r0)
            java.lang.String r0 = " oldStatus:"
            r12.append(r0)
            r12.append(r15)
            java.lang.String r0 = " initTs:"
            r12.append(r0)
            r0 = r31
            r12.append(r0)
            java.lang.String r0 = " updateTs:"
            r12.append(r0)
            long r0 = r2.A06
            java.lang.String r0 = X.C17880vN.A0u(r12, r0)
            r13.A06(r0)
            X.1PP r0 = r9.A0C
            X.C17960vV.A07(r11)
            X.205 r12 = r0.A01(r11, r6)
            X.11P r0 = r9.A03
            long r0 = X.AnonymousClass11P.A01(r0)
            r11 = 37
            X.2Mj r9 = new X.2Mj
            r9.<init>(r12, r11, r0)
            java.lang.String r0 = r2.A0K
            r9.A03 = r0
            r0 = 5
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r0 = java.lang.String.valueOf(r15)
            r12 = 0
            r1[r12] = r0
            r1[r6] = r17
            int r0 = r2.A02
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11 = 2
            r1[r11] = r0
            r0 = 3
            r1[r0] = r10
            r0 = 4
            r1[r0] = r8
            java.util.List r0 = java.util.Arrays.asList(r1)
            java.lang.String r8 = ";"
            java.lang.String r0 = android.text.TextUtils.join(r8, r0)
            r9.A01 = r0
            java.lang.String r0 = java.lang.String.valueOf(r31)
            r9.A02 = r0
            long r0 = r2.A06
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.A04 = r0
            r9.A02 = r7
            java.lang.String[] r7 = new java.lang.String[r11]
            X.1KN r0 = r2.A09
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0b0c
            r0 = r1
        L_0x0aef:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7[r12] = r0
            X.1KN r0 = r2.A09
            if (r0 != 0) goto L_0x0afb
            r16 = r1
        L_0x0afb:
            r7[r6] = r16
            java.util.List r0 = java.util.Arrays.asList(r7)
            java.lang.String r0 = android.text.TextUtils.join(r8, r0)
            r9.A00 = r0
            r5.BBZ(r9, r14)
            goto L_0x09f0
        L_0x0b0c:
            java.math.BigDecimal r0 = r0.A00
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0aef
        L_0x0b17:
            java.math.BigDecimal r0 = r0.A00
            int r25 = r0.intValue()
            goto L_0x0a3d
        L_0x0b1f:
            r22 = r16
            goto L_0x0a36
        L_0x0b23:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x0b37
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r0.add(r4)
            X.AnonymousClass25B.A02(r4, r3)
            boolean r0 = r6.A0g(r0)
            goto L_0x09c3
        L_0x0b37:
            X.AW0 r0 = X.AnonymousClass25B.A00(r3)
            if (r0 == 0) goto L_0x0baa
            X.205 r1 = r3.A0v
            X.AW0 r7 = X.AnonymousClass25B.A00(r3)
            X.8pG r0 = r4.A0A
            if (r0 == 0) goto L_0x0b57
            long r11 = r0.A0A()
            int r10 = r0.A08()
        L_0x0b4f:
            r8 = r1
            r9 = r15
            boolean r0 = r6.A0f(r7, r8, r9, r10, r11)
            goto L_0x09c3
        L_0x0b57:
            r11 = 0
            r10 = 0
            goto L_0x0b4f
        L_0x0b5b:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        L_0x0b5e:
            java.lang.String r0 = r4.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0baa
            X.00H r0 = r5.A1G
            java.lang.Object r3 = r0.get()
            X.207 r3 = (X.AnonymousClass207) r3
            r0 = 0
            r8 = 16
            r2 = 0
            X.206 r3 = r3.A00(r7, r2, r0)
            java.lang.String r1 = r4.A0K
            X.25E r0 = new X.25E
            r0.<init>(r4, r1)
            X.AnonymousClass25B.A03(r3, r0)
            java.lang.String r1 = r6.A0P(r3, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CoreMessageStore/updateMessagePaymentTransaction/PAY added new transaction with trans id: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " status: "
            r2.append(r0)
            int r0 = r4.A02
            r2.append(r0)
            r0 = r18
            r2.append(r0)
            long r0 = r4.A06
            X.C17890vO.A16(r2, r0)
            X.1Q2 r0 = r5.A0O
            r0.A01(r3, r8)
        L_0x0baa:
            if (r3 == 0) goto L_0x0bb7
            X.1QB r1 = r5.A0M
            boolean r0 = r1.A0O()
            if (r0 == 0) goto L_0x0bb7
            r1.A0L(r3)
        L_0x0bb7:
            X.00H r0 = r5.A1J
            java.lang.Object r0 = r0.get()
            X.A0E r0 = (X.A0E) r0
            r0.A01(r3)
            return
        L_0x0bc3:
            java.lang.Object r0 = r6.A01
            X.1Nf r0 = (X.C25181Nf) r0
            java.lang.Object r7 = r6.A02
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r6.A03
            X.1BI r8 = (X.AnonymousClass1BI) r8
            X.1M9 r6 = r0.A02
            X.1M2 r0 = r6.A04
            java.util.ArrayList r1 = r0.A0N(r8)
            int r0 = r1.size()
            r5 = 0
            r4 = 1
            if (r0 != r4) goto L_0x0be7
            java.lang.Object r0 = r1.get(r5)
        L_0x0be3:
            r7.add(r0)
            return
        L_0x0be7:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r1.iterator()
        L_0x0bef:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0c01
            X.1E7 r1 = X.C17880vN.A0O(r2)
            int r0 = r1.A09
            if (r0 != r4) goto L_0x0bef
            r3.add(r1)
            goto L_0x0bef
        L_0x0c01:
            X.7Rk r0 = new X.7Rk
            r0.<init>((java.lang.Object) r6, (int) r4)
            java.util.Collections.sort(r3, r0)
            int r0 = r3.size()
            if (r0 != 0) goto L_0x0c14
            X.1E7 r0 = r6.A0H(r8)
            goto L_0x0be3
        L_0x0c14:
            java.lang.Object r0 = r3.get(r5)
            goto L_0x0be3
        L_0x0c19:
            java.lang.Object r4 = r6.A01
            X.10T r4 = (X.AnonymousClass10T) r4
            java.lang.Object r3 = r6.A02
            java.lang.Object r2 = r6.A03
            r1 = 3
            goto L_0x0c54
        L_0x0c23:
            java.lang.Object r4 = r6.A01
            X.10T r4 = (X.AnonymousClass10T) r4
            java.lang.Object r3 = r6.A02
            java.lang.Object r2 = r6.A03
            r1 = 2
            goto L_0x0c54
        L_0x0c2d:
            java.lang.Object r4 = r6.A01
            X.10T r4 = (X.AnonymousClass10T) r4
            java.lang.Object r3 = r6.A02
            java.lang.Object r2 = r6.A03
            r1 = 0
            goto L_0x0c54
        L_0x0c37:
            java.lang.Object r4 = r6.A01
            X.10T r4 = (X.AnonymousClass10T) r4
            java.lang.Object r3 = r6.A02
            java.lang.Object r2 = r6.A03
            r1 = 5
            goto L_0x0c54
        L_0x0c41:
            java.lang.Object r4 = r6.A01
            X.10T r4 = (X.AnonymousClass10T) r4
            java.lang.Object r3 = r6.A02
            java.lang.Object r2 = r6.A03
            r1 = 4
            goto L_0x0c54
        L_0x0c4b:
            java.lang.Object r4 = r6.A01
            X.10T r4 = (X.AnonymousClass10T) r4
            java.lang.Object r3 = r6.A02
            java.lang.Object r2 = r6.A03
            r1 = 1
        L_0x0c54:
            X.35N r0 = new X.35N
            r0.<init>(r3, r2, r1)
            r4.notifyAllObservers(r0)
            return
        L_0x0c5d:
            java.lang.Object r0 = r6.A01
            X.1Co r0 = (X.C22621Co) r0
            java.lang.Object r4 = r6.A02
            X.1BI r4 = (X.AnonymousClass1BI) r4
            java.lang.Object r3 = r6.A03
            java.util.Collection r3 = (java.util.Collection) r3
            X.00H r0 = r0.A01
            X.1as r0 = X.C17880vN.A0M(r0)
            X.00H r0 = r0.A0M
            java.lang.Object r2 = r0.get()
            X.A5M r2 = (X.A5M) r2
            r1 = 4
            r0 = 0
            r2.A04(r4, r3, r1, r0)
            return
        L_0x0c7d:
            java.lang.Object r0 = r6.A01
            X.1Co r0 = (X.C22621Co) r0
            java.lang.Object r2 = r6.A02
            X.1ci r2 = (X.C29691ci) r2
            java.lang.Object r4 = r6.A03
            X.00H r1 = r0.A01
            X.1as r0 = X.C17880vN.A0M(r1)
            X.1LW r0 = r0.A07
            r0.A0H(r2)
            X.1as r0 = X.C17880vN.A0M(r1)
            X.00H r0 = r0.A0N
            java.lang.Object r3 = r0.get()
            X.1Q1 r3 = (X.AnonymousClass1Q1) r3
            X.11A r2 = X.C18070vi.A0B(r3, r4)
            r1 = 5
            X.3Bx r0 = new X.3Bx
            r0.<init>(r3, r4, r1)
            r2.A00(r0)
            return
        L_0x0cac:
            java.lang.Object r3 = r6.A01
            X.1SG r3 = (X.AnonymousClass1SG) r3
            java.lang.Object r2 = r6.A02
            X.1ci r2 = (X.C29691ci) r2
            java.lang.Object r0 = r6.A03
            X.206 r0 = (X.AnonymousClass206) r0
            long r0 = r0.A0x
            r2.A0E = r0
            X.1LW r0 = r3.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0cc7, Error | RuntimeException -> 0x0cc2 }
            r0.A0F(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0cc7, Error | RuntimeException -> 0x0cc2 }
            return
        L_0x0cc2:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
            throw r1
        L_0x0cc7:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r3.A02
            r0.A03()
            return
        L_0x0cd1:
            java.lang.Object r4 = r6.A01
            X.1TD r4 = (X.AnonymousClass1TD) r4
            java.lang.Object r3 = r6.A02
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r6.A03
            X.1Lg r1 = r4.A09
            r0 = 0
            r1.A05(r3, r0)
            X.00H r0 = r4.A0F
            X.10T r4 = X.C17880vN.A0V(r0)
            r0 = 25
            X.7KY r3 = new X.7KY
            r3.<init>(r2, r0)
        L_0x0cee:
            r4.notifyAllObservers(r3)
            return
        L_0x0cf2:
            java.lang.Object r5 = r6.A01
            X.1TD r5 = (X.AnonymousClass1TD) r5
            java.lang.Object r7 = r6.A02
            X.1BI r7 = (X.AnonymousClass1BI) r7
            java.lang.Object r6 = r6.A03
            X.9Bw r6 = (X.C178119Bw) r6
            X.1NG r0 = r5.A0B
            X.1BI r2 = r0.A01(r7)
            X.4cT r0 = r6.A04
            boolean r1 = r0.A03
            java.lang.String r0 = r0.A02
            java.lang.String r0 = X.C40811vJ.A09(r0)
            X.205 r4 = X.AnonymousClass205.A01(r2, r0, r1)
            X.22M r3 = new X.22M
            r3.<init>((X.AnonymousClass205) r4, (X.C178119Bw) r6)
            X.0ve r2 = r5.A0C
            X.0vf r1 = X.C18040vf.A01
            r0 = 7515(0x1d5b, float:1.0531E-41)
            boolean r1 = X.C18020vd.A05(r1, r2, r0)
            X.1Q6 r0 = r5.A08
            if (r1 == 0) goto L_0x0d3c
            r0.A0C(r4)
        L_0x0d28:
            java.util.Map r0 = r5.A0H
            r0.put(r7, r3)
            X.1Q2 r0 = r5.A07
            android.os.Handler r2 = r0.A02
            r1 = 47
            X.3Bw r0 = new X.3Bw
            r0.<init>(r5, r6, r1)
            r2.post(r0)
            return
        L_0x0d3c:
            r0.A0B(r3)
            goto L_0x0d28
        L_0x0d40:
            java.lang.Object r1 = r6.A01
            X.1Qt r1 = (X.C26081Qt) r1
            java.lang.Object r0 = r6.A02
            X.206 r0 = (X.AnonymousClass206) r0
            java.lang.Object r3 = r6.A03
            X.00z r2 = r1.A00
            long r0 = r0.A0x
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A08(r0, r3)
            return
        L_0x0d56:
            java.lang.String r0 = "globalUI"
            goto L_0x0d92
        L_0x0d59:
            java.lang.String r0 = "contactManager"
            goto L_0x0d92
        L_0x0d5c:
            java.lang.Object r7 = r6.A01
            com.whatsapp.email.VerifyEmailActivity r7 = (com.whatsapp.email.VerifyEmailActivity) r7
            java.lang.Object r5 = r6.A02
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r4 = r6.A03
            java.lang.Long r4 = (java.lang.Long) r4
            X.00H r0 = r7.A4b()
            java.lang.Object r8 = r0.get()
            X.9kJ r8 = (X.C190059kJ) r8
            java.lang.String r9 = r7.A0C
            int r11 = r7.A00
            r14 = 2
            java.lang.String r10 = java.lang.String.valueOf(r5)
            r12 = 8
            r13 = 5
            r8.A00(r9, r10, r11, r12, r13, r14)
            r0 = 3
            X.AnonymousClass4Yv.A00(r7, r0)
            java.lang.String r0 = "VerifyEmailActivity/startRequestCodeTimer/timerLiveData"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r4 == 0) goto L_0x0dfb
            com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel r8 = r7.A05
            if (r8 != 0) goto L_0x0d97
            java.lang.String r0 = "retryCodeCountdownTimersViewModel"
        L_0x0d92:
            X.C18070vi.A11(r0)
        L_0x0d95:
            r1 = 0
            throw r1
        L_0x0d97:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r4.longValue()
            long r0 = r0.toMillis(r2)
            java.lang.String r6 = "email_capture"
            X.1DT r8 = r8.A0T(r6, r0)
            if (r8 == 0) goto L_0x0db8
            X.7SB r6 = new X.7SB
            r6.<init>((java.lang.Object) r7, (int) r12)
            r1 = 30
            X.4g1 r0 = new X.4g1
            r0.<init>(r6, r1)
            r8.A0A(r7, r0)
        L_0x0db8:
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0dfb
            com.whatsapp.WaTextView r6 = r7.A04
            java.lang.String r1 = "resendCodeText"
            if (r6 == 0) goto L_0x0e02
            r0 = 0
            r6.setClickable(r0)
            com.whatsapp.WaTextView r8 = r7.A04
            if (r8 == 0) goto L_0x0e02
            android.content.res.Resources r6 = r7.getResources()
            r1 = 2130968818(0x7f0400f2, float:1.75463E38)
            r0 = 2131099900(0x7f0600fc, float:1.7812166E38)
            int r0 = X.AnonymousClass1YL.A00(r7, r1, r0)
            int r0 = r6.getColor(r0)
            r8.setTextColor(r0)
            X.00H r0 = r7.A0A
            if (r0 == 0) goto L_0x0dff
            X.11A r8 = X.C17880vN.A0d(r0)
            r0 = 39
            X.4rM r6 = new X.4rM
            r6.<init>(r7, r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = r0.toMillis(r2)
            android.os.Handler r0 = r8.A00
            r0.postDelayed(r6, r1)
        L_0x0dfb:
            com.whatsapp.email.VerifyEmailActivity.A0Q(r7, r5, r4)
            return
        L_0x0dff:
            java.lang.String r0 = "mainThreadHandler"
            goto L_0x0d92
        L_0x0e02:
            X.C18070vi.A11(r1)
            goto L_0x0d95
        L_0x0e06:
            r2.close()     // Catch:{ all -> 0x0e14 }
            r6.close()
            return
        L_0x0e0d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0e0f }
        L_0x0e0f:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0e14 }
            throw r0     // Catch:{ all -> 0x0e14 }
        L_0x0e14:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0e16 }
        L_0x0e16:
            r1 = move-exception
            X.CDX.A00(r6, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3C4.run():void");
    }
}
