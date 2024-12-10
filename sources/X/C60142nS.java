package X;

/* renamed from: X.2nS  reason: invalid class name and case insensitive filesystem */
public final class C60142nS {
    public final C25311Ns A00;
    public final AnonymousClass122 A01;
    public final C33581j3 A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass00H A04;
    public final C32951i1 A05;
    public final C27131Uv A06;
    public final C32431hB A07;
    public final C31041ev A08;
    public final AnonymousClass1R0 A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    public final void A03(AnonymousClass206 r10) {
        C18070vi.A0d(r10, 0);
        C31041ev r3 = this.A08;
        AW0 A002 = AnonymousClass25B.A00(r10);
        if (!r10.A0v.A02 && A002 != null && A002.A0D == AnonymousClass11S.A00(r3.A00)) {
            AnonymousClass206 A0K = r10.A0K();
            if (!(A0K instanceof C441322g)) {
                A0K = null;
            }
            C31011es r7 = r3.A02;
            boolean z = true;
            boolean A1W = AnonymousClass000.A1W(A002.A04());
            if (A0K == null) {
                z = false;
            }
            synchronized (r7) {
                C31001er r5 = r7.A01;
                C63522tF A003 = r5.A00();
                A003.A04++;
                if (A1W) {
                    A003.A07++;
                }
                if (z) {
                    A003.A08++;
                    if (A1W) {
                        A003.A06++;
                    }
                }
                r5.A01(A003);
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A04(X.AnonymousClass219 r20) {
        /*
            r19 = this;
            r13 = 0
            r10 = r20
            X.C18070vi.A0d(r10, r13)
            long r4 = r10.A0I
            int r0 = r10.A00
            long r0 = X.C17890vO.A03(r0)
            long r4 = r4 + r0
            r0 = r19
            X.1Uv r9 = r0.A06
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LocationSharingManager/onReceiveSharing; message.key.remote_jid="
            r2.append(r0)
            X.205 r11 = r10.A0v
            X.1BI r8 = r11.A00
            r2.append(r8)
            java.lang.String r0 = "; message.remote_resource="
            r2.append(r0)
            X.1BI r0 = r10.A0H()
            r2.append(r0)
            java.lang.String r0 = "; expiration="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = "; message.sequenceNumber="
            r2.append(r0)
            long r0 = r10.A01
            X.C17890vO.A16(r2, r0)
            X.1BI r0 = r10.A0H()
            if (r0 != 0) goto L_0x0089
            com.whatsapp.jid.UserJid r7 = X.C22941Dw.A00(r8)
        L_0x004b:
            X.00H r0 = r9.A0Q
            java.lang.Object r1 = r0.get()
            X.2qa r1 = (X.C61972qa) r1
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            boolean r0 = r10.A0n
            if (r0 == 0) goto L_0x0067
            boolean r0 = X.C22971Dz.A0Y(r7)
            if (r0 != 0) goto L_0x006d
        L_0x0061:
            r0 = r7
        L_0x0062:
            r7 = r0
        L_0x0063:
            java.lang.Object r6 = r9.A0T
            monitor-enter(r6)
            goto L_0x008e
        L_0x0067:
            boolean r0 = X.C22971Dz.A0T(r7)
            if (r0 == 0) goto L_0x0061
        L_0x006d:
            X.1Ln r0 = r1.A00
            com.whatsapp.jid.UserJid r0 = r0.A0F(r7)
            if (r0 != 0) goto L_0x0062
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LiveLocationManager/getRemoteResource/msgId="
            r1.append(r0)
            java.lang.String r0 = r11.A01
            r1.append(r0)
            java.lang.String r0 = " counterpart not found for "
            X.C17900vP.A0Z(r7, r0, r1)
            goto L_0x0063
        L_0x0089:
            com.whatsapp.jid.UserJid r7 = X.C22941Dw.A00(r0)
            goto L_0x004b
        L_0x008e:
            java.util.Map r12 = X.C27131Uv.A05(r9)     // Catch:{ all -> 0x015f }
            android.util.Pair r14 = android.util.Pair.create(r8, r7)     // Catch:{ all -> 0x015f }
            java.util.Map r3 = r9.A0a     // Catch:{ all -> 0x015f }
            java.lang.Object r0 = r3.get(r14)     // Catch:{ all -> 0x015f }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x00b1
            long r15 = r0.longValue()     // Catch:{ all -> 0x015f }
            long r0 = r10.A01     // Catch:{ all -> 0x015f }
            int r2 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x00b1
            java.lang.String r0 = "LocationSharingManager/onReceiveSharing; received message with old sequence number; not set receiving"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015f }
            monitor-exit(r6)     // Catch:{ all -> 0x015f }
            return
        L_0x00b1:
            r3.remove(r14)     // Catch:{ all -> 0x015f }
            boolean r0 = r12.containsKey(r8)     // Catch:{ all -> 0x015f }
            if (r0 != 0) goto L_0x00c1
            java.util.HashMap r0 = X.C17880vN.A11()     // Catch:{ all -> 0x015f }
            r12.put(r8, r0)     // Catch:{ all -> 0x015f }
        L_0x00c1:
            java.lang.Object r1 = r12.get(r8)     // Catch:{ all -> 0x015f }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x015f }
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x015f }
            java.lang.Object r0 = r1.get(r7)     // Catch:{ all -> 0x015f }
            X.2e4 r0 = (X.C54392e4) r0     // Catch:{ all -> 0x015f }
            X.C27131Uv.A0D(r9, r0)     // Catch:{ all -> 0x015f }
            X.C17960vV.A07(r7)     // Catch:{ all -> 0x015f }
            X.2e4 r0 = new X.2e4     // Catch:{ all -> 0x015f }
            r0.<init>(r7, r11, r4)     // Catch:{ all -> 0x015f }
            r1.put(r7, r0)     // Catch:{ all -> 0x015f }
            java.util.Map r1 = r9.A0c     // Catch:{ all -> 0x015f }
            boolean r0 = r1.containsKey(r7)     // Catch:{ all -> 0x015f }
            if (r0 != 0) goto L_0x00f1
            X.C17960vV.A07(r7)     // Catch:{ all -> 0x015f }
            X.2nL r0 = new X.2nL     // Catch:{ all -> 0x015f }
            r0.<init>(r7)     // Catch:{ all -> 0x015f }
            r1.put(r7, r0)     // Catch:{ all -> 0x015f }
        L_0x00f1:
            java.lang.Object r12 = r1.get(r7)     // Catch:{ all -> 0x015f }
            X.2nL r12 = (X.C60072nL) r12     // Catch:{ all -> 0x015f }
            X.C17960vV.A07(r12)     // Catch:{ all -> 0x015f }
            long r0 = r12.A05     // Catch:{ all -> 0x015f }
            long r2 = r10.A0I     // Catch:{ all -> 0x015f }
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 > 0) goto L_0x0118
            double r0 = r10.A00     // Catch:{ all -> 0x015f }
            r12.A00 = r0     // Catch:{ all -> 0x015f }
            double r0 = r10.A01     // Catch:{ all -> 0x015f }
            r12.A01 = r0     // Catch:{ all -> 0x015f }
            r12.A05 = r2     // Catch:{ all -> 0x015f }
            X.1Uu r0 = r9.A0K     // Catch:{ SQLiteConstraintException -> 0x0112 }
            r0.A05(r12)     // Catch:{ SQLiteConstraintException -> 0x0112 }
            goto L_0x0118
        L_0x0112:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingManager/onReceiveSharing error in saving user location"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x015f }
        L_0x0118:
            X.1Uu r1 = r9.A0K     // Catch:{ all -> 0x015f }
            X.C17960vV.A07(r8)     // Catch:{ all -> 0x015f }
            X.C17960vV.A07(r7)     // Catch:{ all -> 0x015f }
            java.lang.String r0 = r11.A01     // Catch:{ all -> 0x015f }
            X.205 r16 = X.AnonymousClass205.A01(r8, r0, r13)     // Catch:{ all -> 0x015f }
            X.2pv r13 = new X.2pv     // Catch:{ all -> 0x015f }
            r17 = r4
            r15 = r7
            r14 = r8
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x015f }
            java.util.List r0 = java.util.Collections.singletonList(r13)     // Catch:{ all -> 0x015f }
            r1.A08(r0)     // Catch:{ all -> 0x015f }
            r9.A0Z(r12, r10)     // Catch:{ all -> 0x015f }
            monitor-exit(r6)     // Catch:{ all -> 0x015f }
            java.util.List r0 = r9.A0X
            java.util.Iterator r1 = r0.iterator()
        L_0x0140:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0150
            java.lang.Object r0 = r1.next()
            X.3Lt r0 = (X.C72393Lt) r0
            r0.C2f(r8)
            goto L_0x0140
        L_0x0150:
            X.C27131Uv.A0B(r9)
            android.os.Handler r2 = r9.A06
            r1 = 7
            X.7Qr r0 = new X.7Qr
            r0.<init>(r9, r8, r1)
            r2.post(r0)
            return
        L_0x015f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x015f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60142nS.A04(X.219):void");
    }

    public final AnonymousClass206 A00(AnonymousClass205 r2) {
        return AnonymousClass1W2.A01(r2, this.A04);
    }

    public final void A02(AnonymousClass206 r8) {
        AnonymousClass206 A012;
        C179479Ic r1;
        int i;
        if (r8 != null) {
            AnonymousClass1BI r3 = r8.A0v.A00;
            if (C42701yb.A01(r3) || C42701yb.A01(r8.A0H())) {
                Class<C692036h> cls = C692036h.class;
                if (AnonymousClass206.A01(r8, cls) != null) {
                    AnonymousClass229 A013 = AnonymousClass206.A01(r8, cls);
                    C17960vV.A07(A013);
                    String str = ((C692036h) A013).A02;
                    if (C22781De.A03()) {
                        A012 = A00(AnonymousClass205.A01(r3, str, true));
                    } else {
                        A012 = AnonymousClass1W2.A01(AnonymousClass205.A01(r3, str, true), this.A04);
                    }
                    if (!(A012 == null || A012.A0G != 0 || A012.A13 != null || (i = A012.A0u) == 87 || i == 88 || i == 102)) {
                        ((AnonymousClass34Z) this.A0B.get()).A01(A012, r8, (Integer) null);
                    }
                    C692136i A002 = AnonymousClass2UX.A00(r8);
                    if (A002 != null) {
                        C138656xT r5 = (C138656xT) this.A0C.get();
                        String str2 = A002.A07;
                        String str3 = A002.A04;
                        if (str2 != null) {
                            C138656xT.A00(r5, r8, r5.A00.A0R(str2), str2);
                        }
                        if (str3 != null) {
                            C138656xT.A00(r5, r8, r5.A00.A0Q(str3), str3);
                        }
                        if (C18020vd.A05(C18040vf.A01, ((AnonymousClass1UD) this.A0A.get()).A00, 10706) && (r1 = A002.A01) != null && r1 == C179479Ic.GOOGLE && A002.A00 == null && r3 != null) {
                            this.A05.A0E(r3, AnonymousClass00R.A00);
                        }
                    }
                }
            }
        }
    }

    public C60142nS(C25311Ns r1, C32951i1 r2, AnonymousClass122 r3, C27131Uv r4, C33581j3 r5, C32431hB r6, C31041ev r7, AnonymousClass1R0 r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0w(r9, r3, r10, r5, r6);
        C18070vi.A0x(r8, r4, r1, r11, r12);
        C18070vi.A0r(r13, r2, r7);
        this.A03 = r9;
        this.A01 = r3;
        this.A04 = r10;
        this.A02 = r5;
        this.A07 = r6;
        this.A09 = r8;
        this.A06 = r4;
        this.A00 = r1;
        this.A0A = r11;
        this.A0C = r12;
        this.A0B = r13;
        this.A05 = r2;
        this.A08 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r3 == null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass206 r8) {
        /*
            r7 = this;
            X.206 r4 = r8.A0K()
            boolean r0 = r4 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0047
            X.21V r4 = (X.AnonymousClass21V) r4
            if (r4 == 0) goto L_0x0047
            X.2rc r6 = r4.A02
            boolean r5 = r8 instanceof X.AnonymousClass224
            boolean r0 = X.C22781De.A03()
            X.205 r1 = r4.A0v
            if (r0 == 0) goto L_0x006e
            X.206 r3 = r7.A00(r1)
        L_0x001c:
            if (r5 == 0) goto L_0x0039
            if (r3 == 0) goto L_0x003b
            boolean r0 = X.C20120A8f.A07(r3)
            if (r0 == 0) goto L_0x0048
            r0 = r8
            X.210 r0 = (X.AnonymousClass210) r0
            java.lang.Integer r0 = r0.A03
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            int r0 = r0.intValue()
            X.206 r3 = X.C20120A8f.A01(r3, r0)
        L_0x0039:
            if (r3 != 0) goto L_0x0048
        L_0x003b:
            X.1j3 r3 = r7.A02
            r2 = 1
            X.7Is r1 = new X.7Is
            r1.<init>(r7, r8, r2)
            r0 = 0
            r3.A04(r1, r4, r2, r0)
        L_0x0047:
            return
        L_0x0048:
            boolean r0 = r3 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x007f
            r2 = r3
            X.21V r2 = (X.AnonymousClass21V) r2
            X.2rc r1 = r2.A02
            X.1hB r0 = r7.A07
            X.5ti r2 = r0.A0A(r2)
            if (r2 != 0) goto L_0x0075
            if (r5 == 0) goto L_0x0047
            if (r6 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            java.io.File r0 = r1.A0G
            if (r0 == 0) goto L_0x003b
            X.1R0 r0 = r7.A09
            r0.A00(r8, r3)
            X.122 r0 = r7.A01
            r0.A0R(r8)
            return
        L_0x006e:
            X.00H r0 = r7.A04
            X.206 r3 = X.AnonymousClass1W2.A01(r1, r0)
            goto L_0x001c
        L_0x0075:
            r1 = 0
            X.348 r0 = new X.348
            r0.<init>(r7, r8, r4, r1)
            r2.BB6(r0)
            return
        L_0x007f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MainMessageObserverHelper/downloadMediaForQuotedMessage originalMessage not media: "
            r1.append(r0)
            java.lang.String r0 = X.C17890vO.A0U(r3)
            X.C17890vO.A19(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60142nS.A01(X.206):void");
    }
}
