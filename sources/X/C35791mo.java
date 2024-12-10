package X;

/* renamed from: X.1mo  reason: invalid class name and case insensitive filesystem */
public class C35791mo implements AnonymousClass1RJ {
    public final C26811To A00;
    public final C34341kK A01;
    public final C19830z4 A02;
    public final AnonymousClass1Cd A03;
    public final C18030ve A04;
    public final AnonymousClass126 A05;
    public final C25011Mn A06;
    public final C35681md A07;
    public final C201611b A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;

    public int[] BSG() {
        return new int[]{8};
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0160, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
        r13.A06.A02(r1, (java.lang.Long) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BcT(android.os.Message r14, int r15) {
        /*
            r13 = this;
            r0 = 8
            if (r0 == r15) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.lang.Object r4 = r14.obj
            X.2eC r4 = (X.C54472eC) r4
            java.lang.String r1 = r4.A01
            X.00H r0 = r13.A09
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r6 = r0.get(r1)
            X.4Oo r6 = (X.C85744Oo) r6
            if (r6 == 0) goto L_0x002b
            X.1OX r5 = r6.A05
            X.0wl r3 = r6.A04
            r0 = 0
            com.whatsapp.newsletterenforcements.dirtybit.NewsletterEnforcementsDirtyBitProcessor$onDirtyBit$1 r2 = new com.whatsapp.newsletterenforcements.dirtybit.NewsletterEnforcementsDirtyBitProcessor$onDirtyBit$1
            r2.<init>(r6, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.C30451dy.A02(r0, r3, r2, r5)
        L_0x002b:
            int r0 = r1.hashCode()
            java.lang.String r6 = "syncd_app_state"
            r10 = 0
            r2 = 1
            switch(r0) {
                case -1897786041: goto L_0x0165;
                case -1237460524: goto L_0x0130;
                case -961419275: goto L_0x00fa;
                case -741451427: goto L_0x00b0;
                case 1091411309: goto L_0x0053;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "OnDirtyMessageHandler/onDirty received unknown dirty bit category: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x004b:
            X.1Mn r2 = r13.A06
            r0 = 0
            r2.A02(r1, r0)
        L_0x0051:
            r0 = 1
            return r0
        L_0x0053:
            java.lang.String r0 = "account_sync"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.1Cd r0 = r13.A03
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x00ac
            X.11b r1 = r13.A08
            java.util.Set r3 = r4.A02
            X.0ve r4 = r13.A04
            r12 = 0
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0086
            r3 = 11241(0x2be9, float:1.5752E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r12 = X.C18020vd.A05(r0, r4, r3)
            r4 = 1
            r5 = 1
            r6 = 1
            r7 = 1
            r8 = 1
            r9 = 1
        L_0x007c:
            X.2gi r3 = new X.2gi
            r11 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.A01(r3, r2, r10, r2)
            goto L_0x0051
        L_0x0086:
            java.lang.String r0 = "device"
            boolean r7 = r3.contains(r0)
            java.lang.String r0 = "status"
            boolean r4 = r3.contains(r0)
            java.lang.String r0 = "picture"
            boolean r5 = r3.contains(r0)
            java.lang.String r0 = "privacy"
            boolean r6 = r3.contains(r0)
            java.lang.String r0 = "blocklist"
            boolean r8 = r3.contains(r0)
            java.lang.String r0 = "notice"
            boolean r9 = r3.contains(r0)
            goto L_0x007c
        L_0x00ac:
            java.lang.String r0 = "DirtyBitHandler/onAccountDirty/no-db-access/skip"
            goto L_0x0160
        L_0x00b0:
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "OnDirtyMessageHandler/onSyncDDirty"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1To r7 = r13.A00
            boolean r0 = r7.A0T()
            if (r0 == 0) goto L_0x00f1
            java.util.Set r0 = X.C20126A8l.A08
            java.util.Iterator r5 = r0.iterator()
        L_0x00c9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r3 = r5.next()
            java.lang.String r3 = (java.lang.String) r3
            X.1TS r2 = r7.A0R
            r0 = 0
            r2.A04(r3, r0)
            goto L_0x00c9
        L_0x00dd:
            X.1TS r0 = r7.A0R
            java.util.HashMap r3 = r0.A02()
            X.1Ta r2 = r7.A09
            r1 = 1
            X.2ya r0 = new X.2ya
            r0.<init>(r3, r7, r1)
            r2.registerObserver(r0)
            r7.A0J()
        L_0x00f1:
            X.1Mn r1 = r13.A06
            java.lang.Long r0 = r4.A00
            r1.A02(r6, r0)
            goto L_0x0051
        L_0x00fa:
            java.lang.String r0 = "newsletter_metadata"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "OnDirtyMessageHandler/onNewsletterMetadataDirty"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r13.A0A
            java.lang.Object r0 = r0.get()
            X.1i5 r0 = (X.C32991i5) r0
            java.util.List r0 = r0.A05()
            java.util.Iterator r3 = r0.iterator()
        L_0x0117:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.Object r1 = r3.next()
            X.1ch r1 = (X.C29681ch) r1
            X.1md r0 = r13.A07
            r0.A07(r1)
            goto L_0x0117
        L_0x0129:
            X.1md r0 = r13.A07
            r0.A0F(r2)
            goto L_0x0051
        L_0x0130:
            java.lang.String r0 = "groups"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.1Cd r0 = r13.A03
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x015e
            java.lang.String r0 = "DirtyBitHandler/onGroupsDirty call refetchGroups"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.126 r1 = r13.A05
            X.00H r0 = r1.A12
            java.lang.Object r0 = r0.get()
            X.127 r0 = (X.AnonymousClass127) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A00
            r0.set(r2)
            boolean r0 = r1.A0l()
            if (r0 != 0) goto L_0x0051
            r0 = 3
            r1.A0P(r0, r2)
            goto L_0x0051
        L_0x015e:
            java.lang.String r0 = "DirtyBitHandler/onGroupsDirty/no-db-access/skip"
        L_0x0160:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0051
        L_0x0165:
            java.lang.String r0 = "native_contact_restore"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "OnDirtyMessageHandler/onNativeContactRestore"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r0 = r13.A02
            int r0 = r0.A0D()
            if (r0 == r2) goto L_0x004b
            X.1kK r0 = r13.A01
            r0.A00()
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35791mo.BcT(android.os.Message, int):boolean");
    }

    public C35791mo(C26811To r1, C34341kK r2, C19830z4 r3, AnonymousClass1Cd r4, C18030ve r5, AnonymousClass126 r6, C25011Mn r7, C35681md r8, C201611b r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        this.A04 = r5;
        this.A06 = r7;
        this.A00 = r1;
        this.A0A = r10;
        this.A05 = r6;
        this.A07 = r8;
        this.A08 = r9;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A09 = r11;
    }
}
