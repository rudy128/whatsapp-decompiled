package X;

/* renamed from: X.7KY  reason: invalid class name */
public class AnonymousClass7KY implements C23691Hg {
    public final int A00;
    public final Object A01;

    public AnonymousClass7KY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass10T r1, Object obj, int i) {
        r1.notifyAllObservers(new AnonymousClass7KY(obj, i));
    }

    /* JADX WARNING: type inference failed for: r0v66, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0485, code lost:
        r2 = (X.C108495bn) r3.A01;
        r0 = new X.AnonymousClass6EP(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x048e, code lost:
        r2.CQ0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0491, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x05b5, code lost:
        X.C18070vi.A11(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x05b9, code lost:
        throw null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:450:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CGE(java.lang.Object r21) {
        /*
            r20 = this;
            r3 = r21
            r1 = r20
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x06fc;
                case 1: goto L_0x06ee;
                case 2: goto L_0x06e0;
                case 3: goto L_0x06d2;
                case 4: goto L_0x06c4;
                case 5: goto L_0x06b6;
                case 6: goto L_0x05e2;
                case 7: goto L_0x06aa;
                case 8: goto L_0x069e;
                case 9: goto L_0x0692;
                case 10: goto L_0x0686;
                case 11: goto L_0x067a;
                case 12: goto L_0x066e;
                case 13: goto L_0x0662;
                case 14: goto L_0x0656;
                case 15: goto L_0x0016;
                case 16: goto L_0x064c;
                case 17: goto L_0x063e;
                case 18: goto L_0x0620;
                case 19: goto L_0x0569;
                case 20: goto L_0x0467;
                case 21: goto L_0x03a8;
                case 22: goto L_0x0378;
                case 23: goto L_0x0612;
                case 24: goto L_0x0604;
                case 25: goto L_0x05fa;
                case 26: goto L_0x035c;
                case 27: goto L_0x0324;
                case 28: goto L_0x05ec;
                case 29: goto L_0x0017;
                case 30: goto L_0x05c0;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r1.A01
            java.util.List r1 = (java.util.List) r1
            X.88j r3 = (X.C1604188j) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r3.C6Y(r1)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r4 = r1.A01
            java.util.List r4 = (java.util.List) r4
            X.86C r3 = (X.AnonymousClass86C) r3
            r2 = 0
            boolean r5 = X.C18070vi.A17(r4, r3)
            X.7Ov r3 = (X.C146367Ov) r3
            int r0 = r3.A00
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r3 = r3.A01
            X.6uW r3 = (X.C136856uW) r3
            X.00H r0 = r3.A05
            java.util.ArrayList r4 = X.AnonymousClass7FM.A00(r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0089
            X.6Rr r7 = X.C122726Rr.HIDE
            r11 = r2
            r9 = r2
            X.6tC r6 = new X.6tC
            r8 = r7
            r10 = r2
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x0043:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0070
            X.6tC r1 = new X.6tC
            r10 = r7
            r12 = r2
            r13 = r2
            r8 = r1
            r9 = r7
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x0053:
            X.6tC r0 = r3.A01
            java.lang.String r8 = "currentShareViewState"
            if (r0 == 0) goto L_0x05b5
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0068
            r3.A01 = r6
            X.89a r0 = r3.A00
            if (r0 == 0) goto L_0x0068
            r0.C5S(r6)
        L_0x0068:
            X.6tC r0 = r3.A02
            if (r0 != 0) goto L_0x00a2
            java.lang.String r8 = "currentUpsellViewState"
            goto L_0x05b5
        L_0x0070:
            X.00H r0 = r3.A07
            java.lang.Object r1 = r0.get()
            X.6pT r1 = (X.C133776pT) r1
            r0 = 15
            boolean r11 = r1.A01(r0, r4)
            X.6tC r1 = new X.6tC
            r10 = r7
            r8 = r1
            r9 = r7
            r12 = r5
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0053
        L_0x0089:
            X.00H r0 = r3.A07
            java.lang.Object r1 = r0.get()
            X.6pT r1 = (X.C133776pT) r1
            r0 = 12
            boolean r9 = r1.A01(r0, r4)
            X.6Rr r7 = X.C122726Rr.HIDE
            X.6tC r6 = new X.6tC
            r8 = r7
            r11 = r2
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0043
        L_0x00a2:
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0016
            r3.A02 = r1
            X.89a r0 = r3.A00
            if (r0 == 0) goto L_0x0016
            r0.C9e(r1)
            return
        L_0x00b2:
            r9 = 0
            java.lang.Object r3 = r3.A01
            X.7PL r3 = (X.AnonymousClass7PL) r3
            X.6iY r7 = r3.A04
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x025c
            boolean r0 = X.C1402870s.A01(r4)
            if (r0 == 0) goto L_0x025c
            X.0vl r0 = r7.A04
            java.lang.Object r0 = r0.getValue()
            X.72B r0 = (X.AnonymousClass72B) r0
            X.6R1 r0 = r0.A02(r2)
            int r6 = r0.ordinal()
            if (r6 == r5) goto L_0x01fa
            r1 = 3
            if (r6 == r1) goto L_0x0134
            r0 = 2
            if (r6 != r0) goto L_0x025c
            X.00H r0 = r7.A03
            java.lang.Object r0 = r0.get()
            X.6pT r0 = (X.C133776pT) r0
            boolean r0 = r0.A01(r1, r4)
            if (r0 == 0) goto L_0x0131
            X.6Rr r5 = X.C122726Rr.SHOW_APP_EXIST
        L_0x00ed:
            X.1mM r1 = r7.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A0S
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x025c
            X.00H r0 = r7.A01
            java.lang.Object r2 = r0.get()
            X.6y9 r2 = (X.C139066y9) r2
            X.6Re r1 = X.C122646Re.INSTAGRAM
            r0 = 16
            boolean r0 = r2.A01(r1, r4, r0)
            if (r0 == 0) goto L_0x012e
            X.6Rr r1 = X.C122726Rr.SHOW_APP_EXIST
        L_0x010b:
            X.6Rr r0 = X.C122726Rr.SHOW_APP_EXIST
            if (r5 == r0) goto L_0x0111
            if (r1 != r0) goto L_0x0112
        L_0x0111:
            r9 = 1
        L_0x0112:
            r10 = 0
        L_0x0113:
            X.6tC r12 = new X.6tC
            r6 = r12
            r7 = r5
            r8 = r1
            r11 = r9
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x011c:
            X.6tC r0 = r3.A01
            boolean r0 = X.C18070vi.A18(r0, r12)
            if (r0 != 0) goto L_0x0016
            r3.A01 = r12
            X.89a r0 = r3.A00
            if (r0 == 0) goto L_0x0016
            r0.C5S(r12)
            return
        L_0x012e:
            X.6Rr r1 = X.C122726Rr.HIDE
            goto L_0x010b
        L_0x0131:
            X.6Rr r5 = X.C122726Rr.HIDE
            goto L_0x00ed
        L_0x0134:
            X.00H r0 = r7.A01
            java.lang.Object r7 = r0.get()
            X.6y9 r7 = (X.C139066y9) r7
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x025c
            boolean r0 = X.C1402870s.A01(r4)
            if (r0 == 0) goto L_0x025c
            boolean r0 = X.AnonymousClass74A.A07(r4)
            if (r0 != 0) goto L_0x025c
            X.6ho r6 = r7.A00
            X.6Re r8 = X.C122646Re.FACEBOOK
            X.00H r9 = r6.A03
            X.77e r0 = X.C108975cc.A0K(r8, r9)
            if (r0 != 0) goto L_0x01d7
            X.6Re r0 = X.C122646Re.INSTAGRAM
            X.77e r0 = X.C108975cc.A0K(r0, r9)
            if (r0 != 0) goto L_0x01d7
            X.118 r0 = r6.A01
            android.content.Context r13 = X.C108945cZ.A0E(r0)
            boolean r0 = X.AnonymousClass6YD.A00(r13)
            if (r0 != 0) goto L_0x0184
            java.lang.String r0 = "com.instagram.android"
            long r9 = X.C24211Jh.A00(r13, r0)
            r11 = -1
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0184
            java.lang.String r0 = "com.instagram.lite"
            long r9 = X.C24211Jh.A00(r13, r0)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x025c
        L_0x0184:
            X.Cir r10 = r6.A02
            X.0vl r14 = r10.A06
            java.lang.Object r0 = r14.getValue()
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.get()
            if (r0 >= r1) goto L_0x025c
            X.11P r11 = r6.A00
            long r15 = X.AnonymousClass11P.A01(r11)
            X.0vl r9 = r10.A05
            java.lang.Object r0 = r9.getValue()
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            long r12 = r0.get()
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r12 = r12 + r0
            int r0 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x025c
            android.content.SharedPreferences$Editor r6 = X.C108965cb.A02(r10)
            java.lang.Object r0 = r14.getValue()
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r1 = r0.incrementAndGet()
            java.lang.String r0 = "unlinked_banner_shown_count"
            X.C17880vN.A1C(r6, r0, r1)
            long r0 = X.AnonymousClass11P.A01(r11)
            java.lang.Object r6 = r9.getValue()
            java.util.concurrent.atomic.AtomicLong r6 = (java.util.concurrent.atomic.AtomicLong) r6
            r6.set(r0)
            android.content.SharedPreferences$Editor r9 = X.C108965cb.A02(r10)
            java.lang.String r6 = "unlinked_banner_last_seen_time_ms"
            X.C17880vN.A1D(r9, r6, r0)
        L_0x01d7:
            boolean r11 = X.C139066y9.A00(r8, r7)
            X.6Re r9 = X.C122646Re.INSTAGRAM
            boolean r10 = X.C139066y9.A00(r9, r7)
            if (r11 == 0) goto L_0x026b
            if (r10 == 0) goto L_0x026b
            boolean r0 = X.AnonymousClass74A.A08(r4)
            if (r0 != 0) goto L_0x021e
            X.6Rr r13 = X.C122726Rr.SHOW_APP_EXIST
            r17 = r5
            X.6tC r12 = new X.6tC
            r14 = r13
            r16 = r2
            r15 = r5
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x011c
        L_0x01fa:
            X.00H r2 = r7.A03
            java.lang.Object r1 = r2.get()
            X.6pT r1 = (X.C133776pT) r1
            r0 = 3
            boolean r9 = r1.A01(r0, r4)
            java.lang.Object r1 = r2.get()
            X.6pT r1 = (X.C133776pT) r1
            r0 = 12
            boolean r10 = r1.A01(r0, r4)
            if (r9 == 0) goto L_0x021b
            X.6Rr r5 = X.C122726Rr.SHOW_APP_EXIST
        L_0x0217:
            X.6Rr r1 = X.C122726Rr.HIDE
            goto L_0x0113
        L_0x021b:
            X.6Rr r5 = X.C122726Rr.HIDE
            goto L_0x0217
        L_0x021e:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x026b
            java.util.Iterator r6 = r4.iterator()
        L_0x0228:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x026b
            X.206 r0 = X.C17880vN.A0Y(r6)
            X.77K r0 = X.C63672tV.A00(r0)
            if (r0 == 0) goto L_0x0228
            boolean r1 = r0.A05
            r0 = 1
            if (r1 != r0) goto L_0x0228
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x026b
            java.util.Iterator r6 = r4.iterator()
        L_0x0247:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x026b
            X.206 r0 = X.C17880vN.A0Y(r6)
            X.77K r0 = X.C63672tV.A00(r0)
            if (r0 == 0) goto L_0x0247
            boolean r1 = r0.A06
            r0 = 1
            if (r1 != r0) goto L_0x0247
        L_0x025c:
            X.6Rr r13 = X.C122726Rr.HIDE
            r17 = r2
            r15 = r2
            X.6tC r12 = new X.6tC
            r14 = r13
            r16 = r2
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x011c
        L_0x026b:
            X.6Rr r13 = X.C122726Rr.HIDE
            X.6tC r12 = new X.6tC
            r17 = r5
            r14 = r13
            r16 = r2
            r15 = r5
            r12.<init>(r13, r14, r15, r16, r17)
            if (r11 != 0) goto L_0x0282
            X.00H r0 = r7.A01
            X.77e r0 = X.C108975cc.A0K(r8, r0)
            if (r0 == 0) goto L_0x029a
        L_0x0282:
            X.6Rr r15 = X.C122726Rr.SHOW_APP_EXIST
            boolean r5 = r12.A02
            boolean r2 = r12.A03
            boolean r1 = r12.A04
            X.6Rr r0 = r12.A01
            X.6tC r12 = new X.6tC
            r14 = r12
            r16 = r0
            r17 = r5
            r18 = r2
            r19 = r1
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x029a:
            if (r10 != 0) goto L_0x02a4
            X.00H r0 = r7.A01
            X.77e r0 = X.C108975cc.A0K(r9, r0)
            if (r0 == 0) goto L_0x02bb
        L_0x02a4:
            X.6Rr r16 = X.C122726Rr.SHOW_APP_EXIST
            boolean r5 = r12.A02
            boolean r2 = r12.A03
            boolean r1 = r12.A04
            X.6Rr r0 = r12.A00
            X.6tC r12 = new X.6tC
            r14 = r12
            r17 = r5
            r18 = r2
            r19 = r1
            r15 = r0
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x02bb:
            if (r11 == 0) goto L_0x02ee
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x02ee
            java.util.Iterator r2 = r4.iterator()
        L_0x02c7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02ee
            X.206 r0 = X.C17880vN.A0Y(r2)
            X.77K r0 = X.C63672tV.A00(r0)
            if (r0 == 0) goto L_0x02c7
            boolean r1 = r0.A05
            r0 = 1
            if (r1 != r0) goto L_0x02c7
            boolean r2 = r12.A02
            boolean r1 = r12.A03
            boolean r0 = r12.A04
            X.6Rr r14 = r12.A01
            X.6tC r12 = new X.6tC
            r16 = r1
            r17 = r0
            r15 = r2
            r12.<init>(r13, r14, r15, r16, r17)
        L_0x02ee:
            if (r10 == 0) goto L_0x011c
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x011c
            java.util.Iterator r2 = r4.iterator()
        L_0x02fa:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x011c
            X.206 r0 = X.C17880vN.A0Y(r2)
            X.77K r0 = X.C63672tV.A00(r0)
            if (r0 == 0) goto L_0x02fa
            boolean r1 = r0.A06
            r0 = 1
            if (r1 != r0) goto L_0x02fa
            boolean r4 = r12.A02
            boolean r2 = r12.A03
            boolean r1 = r12.A04
            X.6Rr r0 = r12.A00
            X.6tC r12 = new X.6tC
            r5 = r12
            r6 = r0
            r7 = r13
            r8 = r4
            r9 = r2
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x011c
        L_0x0324:
            java.lang.Object r1 = r1.A01
            X.2LJ r1 = (X.AnonymousClass2LJ) r1
            X.6cg r3 = (X.C126406cg) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.11S r0 = r1.A00
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "StatusPrivacyActivity/auto crosspost settings changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r4 = r3.A00
            X.00H r0 = r4.A0D
            if (r0 == 0) goto L_0x0358
            java.lang.Object r0 = r0.get()
            X.2mM r0 = (X.C59472mM) r0
            X.6zR r3 = r0.A00()
            X.1KB r2 = r4.A05
            r1 = 41
            X.7Pl r0 = new X.7Pl
            r0.<init>(r4, r3, r1)
            r2.CGP(r0)
            return
        L_0x0358:
            java.lang.String r8 = "autoCrosspostSettingsHelper"
            goto L_0x05b5
        L_0x035c:
            java.lang.Object r1 = r1.A01
            X.1la r1 = (X.C35061la) r1
            X.1lf r3 = (X.C35111lf) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.11S r0 = r1.A00
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0374
            X.1lh r0 = r3.A00
            boolean r0 = r0.isEnabledForCompanions
            if (r0 == 0) goto L_0x0016
        L_0x0374:
            r3.A00()
            return
        L_0x0378:
            java.lang.Object r7 = r1.A01
            X.725 r7 = (X.AnonymousClass725) r7
            X.6qF r3 = (X.C134226qF) r3
            r1 = 1
            X.C18070vi.A0d(r3, r1)
            boolean r0 = r3 instanceof X.AnonymousClass6H6
            if (r0 == 0) goto L_0x0394
            X.6H6 r3 = (X.AnonymousClass6H6) r3
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x038e;
                case 1: goto L_0x070a;
                default: goto L_0x038d;
            }
        L_0x038d:
            return
        L_0x038e:
            boolean r0 = r7.A0S
            if (r0 != r1) goto L_0x0016
            goto L_0x0485
        L_0x0394:
            X.6H5 r3 = (X.AnonymousClass6H5) r3
            int r0 = r3.A00
            switch(r0) {
                case 3: goto L_0x039c;
                case 4: goto L_0x039c;
                case 5: goto L_0x039c;
                default: goto L_0x039b;
            }
        L_0x039b:
            return
        L_0x039c:
            java.lang.Object r0 = r3.A01
            X.722 r0 = (X.AnonymousClass722) r0
            X.8AV r0 = r0.A03
            if (r0 == 0) goto L_0x0016
            r0.C6v(r7)
            return
        L_0x03a8:
            java.lang.Object r5 = r1.A01
            X.725 r5 = (X.AnonymousClass725) r5
            X.6qF r3 = (X.C134226qF) r3
            r4 = 1
            X.C18070vi.A0d(r3, r4)
            boolean r0 = r3 instanceof X.AnonymousClass6H6
            if (r0 == 0) goto L_0x03d1
            X.6H6 r3 = (X.AnonymousClass6H6) r3
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x03be;
                case 1: goto L_0x0742;
                default: goto L_0x03bd;
            }
        L_0x03bd:
            return
        L_0x03be:
            r1 = 0
            X.C18070vi.A0d(r5, r1)
            boolean r0 = r5.A0S
            if (r0 == 0) goto L_0x0016
            java.lang.Object r2 = r3.A01
            X.5bn r2 = (X.C108495bn) r2
            X.6EQ r0 = new X.6EQ
            r0.<init>(r1)
            goto L_0x048e
        L_0x03d1:
            X.6H5 r3 = (X.AnonymousClass6H5) r3
            int r0 = r3.A00
            switch(r0) {
                case 2: goto L_0x0762;
                case 3: goto L_0x0453;
                case 4: goto L_0x0453;
                case 5: goto L_0x0453;
                case 6: goto L_0x03e9;
                case 7: goto L_0x03d9;
                default: goto L_0x03d8;
            }
        L_0x03d8:
            return
        L_0x03d9:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            boolean r0 = r5.A0S
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r3.A01
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r0 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r0
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity.A0d(r0, r4)
            return
        L_0x03e9:
            java.lang.Object r6 = r3.A01
            com.whatsapp.stickers.store.StickerStoreTabFragment r6 = (com.whatsapp.stickers.store.StickerStoreTabFragment) r6
            boolean r0 = r6 instanceof com.whatsapp.stickers.store.StickerStoreMyTabFragment
            if (r0 == 0) goto L_0x0419
            java.util.List r0 = r6.A0J
            if (r0 == 0) goto L_0x0016
            r3 = 0
        L_0x03f6:
            java.util.List r0 = r6.A0J
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x0016
            X.725 r2 = X.C108965cb.A0b(r6, r3)
            java.lang.String r1 = r2.A0H
            java.lang.String r0 = r5.A0H
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0416
            r2.A09 = r4
            X.5lF r0 = r6.A0B
            if (r0 == 0) goto L_0x0016
            r0.A0G(r3)
            return
        L_0x0416:
            int r3 = r3 + 1
            goto L_0x03f6
        L_0x0419:
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r6 = (com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment) r6
            java.util.List r0 = r6.A0J
            if (r0 == 0) goto L_0x0016
            r3 = 0
        L_0x0420:
            java.util.List r0 = r6.A0J
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x044b
            X.725 r2 = X.C108965cb.A0b(r6, r3)
            java.lang.String r1 = r2.A0H
            java.lang.String r0 = r5.A0H
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0448
            r2.A09 = r4
            X.5lF r2 = r6.A0B
            if (r2 == 0) goto L_0x0448
            r1 = r3
            boolean r0 = com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment.A01(r6)
            if (r0 == 0) goto L_0x0445
            int r1 = r3 + 1
        L_0x0445:
            r2.A0G(r1)
        L_0x0448:
            int r3 = r3 + 1
            goto L_0x0420
        L_0x044b:
            boolean r0 = r5.A0S
            if (r0 == 0) goto L_0x0016
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment.A00(r6)
            return
        L_0x0453:
            java.lang.Object r2 = r3.A01
            X.722 r2 = (X.AnonymousClass722) r2
            java.util.HashMap r1 = r2.A0H
            java.lang.String r0 = r5.A0H
            r1.put(r0, r5)
            java.util.List r1 = r2.A04
            if (r1 == 0) goto L_0x0016
            r0 = 0
            X.AnonymousClass722.A01(r2, r0, r1)
            return
        L_0x0467:
            java.lang.Object r7 = r1.A01
            X.725 r7 = (X.AnonymousClass725) r7
            X.6qF r3 = (X.C134226qF) r3
            r2 = 1
            X.C18070vi.A0d(r3, r2)
            boolean r0 = r3 instanceof X.AnonymousClass6H6
            if (r0 == 0) goto L_0x0492
            X.6H6 r3 = (X.AnonymousClass6H6) r3
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x047d;
                case 1: goto L_0x0783;
                default: goto L_0x047c;
            }
        L_0x047c:
            return
        L_0x047d:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            boolean r0 = r7.A0S
            if (r0 == 0) goto L_0x0016
        L_0x0485:
            java.lang.Object r2 = r3.A01
            X.5bn r2 = (X.C108495bn) r2
            X.6EP r0 = new X.6EP
            r0.<init>(r7)
        L_0x048e:
            r2.CQ0(r0)
            return
        L_0x0492:
            X.6H5 r3 = (X.AnonymousClass6H5) r3
            int r0 = r3.A00
            switch(r0) {
                case 1: goto L_0x0812;
                case 2: goto L_0x0499;
                case 3: goto L_0x07c9;
                case 4: goto L_0x07c9;
                case 5: goto L_0x07c9;
                case 6: goto L_0x04ff;
                case 7: goto L_0x049a;
                default: goto L_0x0499;
            }
        L_0x0499:
            return
        L_0x049a:
            r4 = 0
            X.C18070vi.A0d(r7, r4)
            java.lang.Object r5 = r3.A01
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r5 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r5
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel r0 = r5.A0B
            java.lang.String r8 = "viewModel"
            if (r0 == 0) goto L_0x05b5
            X.725 r6 = r0.A0T()
            if (r6 != 0) goto L_0x04b6
            boolean r0 = r7.A0S
            if (r0 == 0) goto L_0x0016
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity.A0Q(r5)
            return
        L_0x04b6:
            java.lang.String r1 = r6.A0H
            java.lang.String r0 = r7.A0H
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0016
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel r0 = r5.A0B
            if (r0 == 0) goto L_0x05b5
            X.1DT r1 = r0.A00
            X.7Mh r0 = new X.7Mh
            r0.<init>(r7, r2)
            r1.A0F(r0)
            r5.setResult(r2)
            X.6RG r1 = r5.A03
            if (r1 != 0) goto L_0x04d9
            java.lang.String r8 = "stickerPackPreviewSource"
            goto L_0x05b5
        L_0x04d9:
            X.6RG r0 = X.AnonymousClass6RG.DEEPLINK
            if (r1 == r0) goto L_0x04e4
            boolean r0 = r7.A0S
            if (r0 != 0) goto L_0x04e4
            r5.finish()
        L_0x04e4:
            boolean r0 = r6.A0V
            if (r0 == 0) goto L_0x0016
            X.1KB r3 = r5.A05
            r0 = 41
            X.7RQ r2 = new X.7RQ
            r2.<init>(r5, r6, r0)
            r0 = 200(0xc8, double:9.9E-322)
            r3.A0K(r2, r0)
            X.1KB r1 = r5.A05
            r0 = 2131896439(0x7f122877, float:1.942774E38)
            r1.A08(r0, r4)
            return
        L_0x04ff:
            java.lang.Object r3 = r3.A01
            com.whatsapp.stickers.store.StickerStoreTabFragment r3 = (com.whatsapp.stickers.store.StickerStoreTabFragment) r3
            boolean r0 = r3 instanceof com.whatsapp.stickers.store.StickerStoreMyTabFragment
            if (r0 == 0) goto L_0x0534
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r3 = (com.whatsapp.stickers.store.StickerStoreMyTabFragment) r3
            X.5lF r0 = r3.A0B
            if (r0 == 0) goto L_0x0016
            r4 = 0
        L_0x050e:
            java.util.List r0 = r3.A0J
            int r0 = r0.size()
            if (r4 >= r0) goto L_0x085f
            X.725 r0 = X.C108965cb.A0b(r3, r4)
            java.lang.String r1 = r0.A0H
            java.lang.String r0 = r7.A0H
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0531
            java.util.List r0 = r3.A0J
            r0.set(r4, r7)
            X.5lF r0 = r3.A0B
            if (r0 == 0) goto L_0x0016
            r0.A0G(r4)
            return
        L_0x0531:
            int r4 = r4 + 1
            goto L_0x050e
        L_0x0534:
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r3 = (com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment) r3
            java.util.List r0 = r3.A0J
            if (r0 == 0) goto L_0x0016
            r2 = 0
        L_0x053b:
            java.util.List r0 = r3.A0J
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x0016
            X.725 r0 = X.C108965cb.A0b(r3, r2)
            java.lang.String r1 = r0.A0H
            java.lang.String r0 = r7.A0H
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0566
            java.util.List r0 = r3.A0J
            r0.set(r2, r7)
            X.5lF r1 = r3.A0B
            if (r1 == 0) goto L_0x0016
            boolean r0 = com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment.A01(r3)
            if (r0 == 0) goto L_0x0562
            int r2 = r2 + 1
        L_0x0562:
            r1.A0G(r2)
            return
        L_0x0566:
            int r2 = r2 + 1
            goto L_0x053b
        L_0x0569:
            java.lang.Object r4 = r1.A01
            java.util.List r4 = (java.util.List) r4
            X.85m r3 = (X.C1596885m) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.7M7 r3 = (X.AnonymousClass7M7) r3
            int r0 = r3.A00
            if (r0 == 0) goto L_0x05a0
            java.lang.Object r2 = r3.A01
            X.6z5 r2 = (X.C139586z5) r2
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0590
            X.6Up r0 = r2.A01()
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x0016
            r1 = 1
        L_0x0590:
            X.6Up r0 = r2.A01()
            r0.A04 = r1
            X.6Up r0 = r2.A01()
            r0.A03 = r1
            X.C139586z5.A00(r2)
            return
        L_0x05a0:
            boolean r0 = r4.isEmpty()
            java.lang.Object r1 = r3.A01
            com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel r1 = (com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel) r1
            if (r0 == 0) goto L_0x05af
            r0 = 0
        L_0x05ab:
            com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel.A00(r1, r0, r0)
            return
        L_0x05af:
            X.6Up r0 = r1.A00
            if (r0 != 0) goto L_0x05ba
            java.lang.String r8 = "crossPostingViewModelState"
        L_0x05b5:
            X.C18070vi.A11(r8)
            r0 = 0
            throw r0
        L_0x05ba:
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x05ab
        L_0x05c0:
            X.86D r3 = (X.AnonymousClass86D) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.7Ow r3 = (X.C146377Ow) r3
            int r0 = r3.A00
            if (r0 == 0) goto L_0x05da
            java.lang.Object r1 = r3.A01
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r1
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A08(r1)
            r0 = 0
            r1.A10 = r0
            r1.A27()
            return
        L_0x05da:
            java.lang.Object r0 = r3.A01
            com.whatsapp.status.playback.MyStatusesActivity r0 = (com.whatsapp.status.playback.MyStatusesActivity) r0
            com.whatsapp.status.playback.MyStatusesActivity.A0z(r0)
            return
        L_0x05e2:
            X.1k6 r3 = (X.C34201k6) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r3.A00()
            return
        L_0x05ec:
            java.lang.Object r1 = r1.A01
            java.util.List r1 = (java.util.List) r1
            X.88e r3 = (X.C1603688e) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r3.C9X(r1)
            return
        L_0x05fa:
            java.lang.Object r0 = r1.A01
            java.util.Collection r0 = (java.util.Collection) r0
            X.1k5 r3 = (X.C34191k5) r3
            r3.BnF(r0)
            return
        L_0x0604:
            java.lang.Object r1 = r1.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            X.1kh r3 = (X.C34561kh) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r3.C8T(r1)
            return
        L_0x0612:
            java.lang.Object r1 = r1.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            X.1kh r3 = (X.C34561kh) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r3.C8S(r1)
            return
        L_0x0620:
            java.lang.Object r2 = r1.A01
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            X.85l r3 = (X.C1596785l) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.7M3 r3 = (X.AnonymousClass7M3) r3
            int r1 = r3.A00
            java.lang.Object r0 = r3.A01
            if (r1 == 0) goto L_0x0638
            X.5jJ r0 = (X.C111255jJ) r0
            X.C111255jJ.A04(r2, r0)
            return
        L_0x0638:
            com.whatsapp.status.StatusesFragment r0 = (com.whatsapp.status.StatusesFragment) r0
            r0.A27()
            return
        L_0x063e:
            java.lang.Object r0 = r1.A01
            X.1LD r0 = (X.AnonymousClass1LD) r0
            X.87s r3 = (X.C1602487s) r3
            boolean r0 = r0.A01()
            r3.C4S(r0)
            return
        L_0x064c:
            java.lang.Object r0 = r1.A01
            X.2mw r0 = (X.C59822mw) r0
            X.1vc r3 = (X.C40981vc) r3
            r3.C4R(r0)
            return
        L_0x0656:
            java.lang.Object r1 = r1.A01
            X.2rk r1 = (X.C62652rk) r1
            X.8Ar r0 = X.C108965cb.A0R(r3)
            r0.C5u(r1)
            return
        L_0x0662:
            java.lang.Object r1 = r1.A01
            X.2rk r1 = (X.C62652rk) r1
            X.8Ar r0 = X.C108965cb.A0R(r3)
            r0.C5t(r1)
            return
        L_0x066e:
            java.lang.Object r1 = r1.A01
            X.2rk r1 = (X.C62652rk) r1
            X.8Ar r0 = X.C108965cb.A0R(r3)
            r0.Bs0(r1)
            return
        L_0x067a:
            java.lang.Object r1 = r1.A01
            X.2rk r1 = (X.C62652rk) r1
            X.8Ar r0 = X.C108965cb.A0R(r3)
            r0.BxS(r1)
            return
        L_0x0686:
            java.lang.Object r1 = r1.A01
            X.2rk r1 = (X.C62652rk) r1
            X.8Ar r0 = X.C108965cb.A0R(r3)
            r0.BxP(r1)
            return
        L_0x0692:
            java.lang.Object r1 = r1.A01
            X.2rk r1 = (X.C62652rk) r1
            X.8Ar r0 = X.C108965cb.A0R(r3)
            r0.Bpn(r1)
            return
        L_0x069e:
            java.lang.Object r1 = r1.A01
            X.2rk r1 = (X.C62652rk) r1
            X.8Ar r0 = X.C108965cb.A0R(r3)
            r0.BvY(r1)
            return
        L_0x06aa:
            java.lang.Object r1 = r1.A01
            X.2rk r1 = (X.C62652rk) r1
            X.8Ar r0 = X.C108965cb.A0R(r3)
            r0.BvW(r1)
            return
        L_0x06b6:
            java.lang.Object r1 = r1.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            X.1k6 r3 = (X.C34201k6) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r3.A03(r1)
            return
        L_0x06c4:
            java.lang.Object r1 = r1.A01
            X.1EC r1 = (X.AnonymousClass1EC) r1
            X.1Nj r3 = (X.C25221Nj) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r3.Bxh(r1)
            return
        L_0x06d2:
            java.lang.Object r1 = r1.A01
            X.1EC r1 = (X.AnonymousClass1EC) r1
            X.1Nj r3 = (X.C25221Nj) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r3.Bxd(r1)
            return
        L_0x06e0:
            java.lang.Object r1 = r1.A01
            X.1EC r1 = (X.AnonymousClass1EC) r1
            X.1Nj r3 = (X.C25221Nj) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r3.Bxe(r1)
            return
        L_0x06ee:
            java.lang.Object r1 = r1.A01
            X.1EC r1 = (X.AnonymousClass1EC) r1
            X.1Nj r3 = (X.C25221Nj) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r3.Bxg(r1)
            return
        L_0x06fc:
            java.lang.Object r1 = r1.A01
            X.1EC r1 = (X.AnonymousClass1EC) r1
            X.1Nj r3 = (X.C25221Nj) r3
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r3.Bxf(r1)
            return
        L_0x070a:
            java.lang.Object r6 = r3.A02
            com.whatsapp.stickers.flow.StickerPackFlow r6 = (com.whatsapp.stickers.flow.StickerPackFlow) r6
            X.6HC r0 = r6.A00
            java.util.List r0 = r0.A00
            java.util.ArrayList r5 = X.C29351c6.A0D(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x071a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x073e
            java.lang.Object r2 = r4.next()
            X.6ok r2 = (X.C133436ok) r2
            java.lang.String r0 = r2.A01()
            java.lang.String r1 = r7.A0H
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x073a
            X.C18070vi.A0X(r1)
            X.6HF r2 = new X.6HF
            r2.<init>(r7, r1)
        L_0x073a:
            r5.add(r2)
            goto L_0x071a
        L_0x073e:
            X.C134226qF.A00(r3, r6, r5)
            return
        L_0x0742:
            r6 = 0
            X.C18070vi.A0d(r5, r6)
            java.lang.Object r4 = r3.A02
            com.whatsapp.stickers.flow.StickerPackFlow r4 = (com.whatsapp.stickers.flow.StickerPackFlow) r4
            X.6HC r0 = r4.A00
            java.util.List r2 = r0.A00
            java.lang.String r1 = X.AnonymousClass725.A00(r5)
            X.6HH r0 = new X.6HH
            r0.<init>(r5, r1, r6)
            java.util.ArrayList r0 = X.C29431cG.A0l(r0, r2)
            X.C18070vi.A0d(r0, r6)
            X.C134226qF.A00(r3, r4, r0)
            return
        L_0x0762:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.String r4 = r5.A0H
            java.lang.Object r0 = r3.A01
            X.6j2 r0 = (X.C130196j2) r0
            X.1G4 r2 = r0.A04
        L_0x076e:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            java.util.Set r0 = (java.util.Set) r0
            X.C18070vi.A0X(r4)
            java.util.LinkedHashSet r0 = X.C41841x9.A05(r4, r0)
            boolean r0 = r2.BFK(r1, r0)
            if (r0 == 0) goto L_0x076e
            return
        L_0x0783:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            r7.A0B = r2
            java.lang.Object r6 = r3.A02
            com.whatsapp.stickers.flow.StickerPackFlow r6 = (com.whatsapp.stickers.flow.StickerPackFlow) r6
            X.6HC r0 = r6.A00
            java.util.List r0 = r0.A00
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r0.iterator()
        L_0x0799:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x07b4
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.6ok r0 = (X.C133436ok) r0
            java.lang.String r1 = r0.A01()
            java.lang.String r0 = r7.A0H
            boolean r0 = X.C18070vi.A18(r1, r0)
            X.AnonymousClass3MZ.A1V(r2, r5, r0)
            goto L_0x0799
        L_0x07b4:
            java.lang.String r1 = X.AnonymousClass725.A00(r7)
            X.6HF r0 = new X.6HF
            r0.<init>(r7, r1)
            java.util.ArrayList r1 = X.C29431cG.A0l(r0, r5)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.C134226qF.A00(r3, r6, r1)
            return
        L_0x07c9:
            java.lang.Object r4 = r3.A01
            X.722 r4 = (X.AnonymousClass722) r4
            java.util.HashMap r0 = r4.A0G
            java.lang.String r3 = r7.A0H
            r0.remove(r3)
            java.util.HashMap r0 = r4.A0H
            r0.remove(r3)
            java.util.List r0 = r4.A04
            if (r0 == 0) goto L_0x080e
            r2 = 0
        L_0x07de:
            java.util.List r0 = r4.A04
            int r1 = r0.size()
            java.util.List r0 = r4.A04
            if (r2 >= r1) goto L_0x0800
            boolean r0 = X.AnonymousClass725.A01(r3, r0, r2)
            if (r0 == 0) goto L_0x07fd
            java.util.List r0 = r4.A04
            r0.set(r2, r7)
        L_0x07f3:
            java.util.List r1 = r4.A04
            r0 = 0
            X.AnonymousClass722.A01(r4, r0, r1)
        L_0x07f9:
            X.AnonymousClass722.A00(r4)
            return
        L_0x07fd:
            int r2 = r2 + 1
            goto L_0x07de
        L_0x0800:
            r0.add(r7)
            java.util.List r1 = r4.A04
            X.7RY r0 = new X.7RY
            r0.<init>()
            java.util.Collections.sort(r1, r0)
            goto L_0x07f3
        L_0x080e:
            r4.A03()
            goto L_0x07f9
        L_0x0812:
            java.lang.Object r2 = r3.A01
            X.72m r2 = (X.AnonymousClass72m) r2
            java.util.ArrayList r1 = X.AnonymousClass72m.A00(r2, r7)
            java.util.Map r0 = r2.A0Z
            java.lang.String r4 = r7.A0H
            r0.put(r4, r7)
            X.7IT r0 = r2.A0G
            r0.A01(r1)
            java.util.Map r0 = r2.A0a
            r0.put(r4, r1)
            X.AnonymousClass72m.A02(r2, r1)
            X.5lP r3 = r2.A0I
            java.util.LinkedHashMap r2 = r3.A02
            java.util.LinkedHashMap r1 = X.C17880vN.A13()
            r3.A02 = r1
            java.util.ArrayList r0 = X.C112395lP.A01(r3, r7)
            r1.put(r4, r0)
            java.util.LinkedHashMap r0 = r3.A02
            r0.putAll(r2)
            X.C112395lP.A03(r3)
            java.util.List r0 = r3.A03
            int r2 = r0.size()
            int r1 = r3.A0Q()
            java.util.List r0 = r3.A03
            int r0 = r0.size()
            int r1 = r1 - r0
            r3.A0J(r2, r1)
            X.C112395lP.A04(r3)
            return
        L_0x085f:
            X.5lF r4 = r3.A0B
            boolean r0 = r4 instanceof X.AnonymousClass6IG
            if (r0 == 0) goto L_0x0890
            X.6IG r4 = (X.AnonymousClass6IG) r4
            java.util.List r0 = r4.A00
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x087a
            java.util.List r0 = r4.A00
            java.lang.Object r0 = r0.get(r1)
            X.725 r0 = (X.AnonymousClass725) r0
            boolean r1 = r0.A0S
        L_0x087a:
            java.util.List r0 = r4.A00
            r0.add(r1, r7)
            java.util.List r0 = r4.A00
            int r0 = r0.indexOf(r7)
            r4.A0H(r0)
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r0 = r4.A00
        L_0x088a:
            r0.A27()
            r3.A04 = r2
            return
        L_0x0890:
            java.util.List r0 = r4.A00
            r0.add(r7)
            java.util.List r0 = r4.A00
            int r0 = r0.indexOf(r7)
            r4.A0H(r0)
            com.whatsapp.stickers.store.StickerStoreTabFragment r0 = r4.A01
            goto L_0x088a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KY.CGE(java.lang.Object):void");
    }
}
