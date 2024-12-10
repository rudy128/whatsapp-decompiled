package X;

/* renamed from: X.70L  reason: invalid class name */
public class AnonymousClass70L {
    public C19830z4 A00;
    public String A01;
    public boolean A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public final AnonymousClass190 A05;
    public final AnonymousClass1KB A06;
    public final AnonymousClass11E A07;
    public final C30191dX A08;
    public final AnonymousClass1M9 A09;
    public final C26781Tl A0A;
    public final C139486yv A0B;
    public final AnonymousClass7EL A0C;
    public final C133996pq A0D;
    public final C133246oP A0E;
    public final C1404471l A0F;
    public final C116505xr A0G;
    public final C160908Am A0H;
    public final C139626zB A0I;
    public final C136756uL A0J;
    public final C219217x A0K;
    public final AnonymousClass1UN A0L;
    public final C18030ve A0M;
    public final AnonymousClass1BI A0N;
    public final AnonymousClass10I A0O;
    public final Long A0P;
    public final Long A0Q;
    public final Long A0R;
    public final C37721q1 A0S;

    public void A03() {
        this.A04 = true;
        if (!AnonymousClass743.A07(this.A08, this.A0K)) {
            this.A0H.requestPermission();
        } else {
            this.A0O.CGS(new C146437Pc(this, 40), "Save to Phone");
        }
    }

    public static void A00(AnonymousClass70L r6, boolean z) {
        AnonymousClass1BI r3;
        C59042lf r2;
        Long l;
        String A042 = r6.A0G.A04();
        StringBuilder A11 = AnonymousClass000.A11(A042);
        A11.append("@");
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(AnonymousClass000.A0y("s.whatsapp.net", A11));
        AnonymousClass1E7 r0 = r6.A0D.A00;
        if (r0 == null || (r3 = r0.A0J) == null) {
            r3 = A0l;
        } else if (A0l != null) {
            A042 = A0l.user;
        }
        if (!z || (l = r6.A0Q) == null) {
            r2 = null;
        } else {
            r2 = new C59042lf(l.longValue(), A042);
        }
        r6.A0I.A01(r2, r3, r6.A0P, A042, r6.A01, false);
    }

    public void A01() {
        if (AnonymousClass743.A07(this.A08, this.A0K)) {
            if (this.A0Q == null) {
                C136756uL r1 = this.A0J;
                if (r1.A00.A01() == 0) {
                    r1.A02(true);
                    return;
                }
            }
            if (this.A03) {
                this.A03 = false;
            } else if (this.A04) {
                A03();
            } else {
                A02();
            }
        } else {
            this.A04 = false;
            this.A0J.A02(false);
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Integer] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cc, code lost:
        if (r0 == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        if (r1 == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d5, code lost:
        if (r9.A0D.A02 != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d7, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        r1 = X.AnonymousClass743.A07(r9.A08, r9.A0K);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e0, code lost:
        if (r2 == false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
        r0 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e3, code lost:
        if (r1 == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e5, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
        if (r5 == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ec, code lost:
        r0 = r9.A0D.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (r0 == null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f2, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f3, code lost:
        r0 = 8;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f5, code lost:
        if (r1 == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f7, code lost:
        r0 = 4;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fa, code lost:
        if (r6 != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fc, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r9 = this;
            X.1UN r0 = r9.A0L
            boolean r0 = r0.A05()
            r9.A02 = r0
            X.0z4 r0 = r9.A00
            boolean r7 = r0.A2J()
            X.7EL r0 = r9.A0C
            X.1E7 r0 = r0.A01
            r3 = 0
            if (r0 == 0) goto L_0x00a3
            r0 = 2
        L_0x0016:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r3 = X.C108945cZ.A0N(r0, r3)
        L_0x001e:
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            X.8Am r2 = r9.A0H
            int r1 = X.C108965cb.A01(r3)
            java.lang.Object r0 = r3.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.C4H(r1, r0)
        L_0x0031:
            return
        L_0x0032:
            X.5xr r5 = r9.A0G
            boolean r0 = r5.A0A()
            if (r0 != 0) goto L_0x0031
            boolean r0 = r9.A02
            r6 = 0
            if (r0 == 0) goto L_0x0146
            if (r7 == 0) goto L_0x0146
            X.6uL r2 = r9.A0J
            boolean r0 = r2.A03()
            if (r0 != 0) goto L_0x0146
            java.lang.Long r0 = r9.A0Q
            r4 = 0
            if (r0 == 0) goto L_0x0142
            r4 = 1
            java.lang.Long r1 = r9.A0R
            boolean r0 = r2.A03()
            r3 = r0 ^ 1
            long r7 = r1.longValue()
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0142
            if (r3 != r4) goto L_0x0142
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L_0x007f
            java.lang.String r0 = r5.A04()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007f
            X.10I r2 = r9.A0O
            r0 = 39
            X.7Pc r1 = new X.7Pc
            r1.<init>(r9, r0)
            java.lang.String r0 = "editing_wa_only_contact_with_new_number"
            r2.CGL(r1, r0)
        L_0x007f:
            X.1M9 r2 = r9.A09
            java.lang.Long r0 = r9.A0P
            long r0 = r0.longValue()
            X.1E7 r3 = r2.A0A(r0)
            if (r3 != 0) goto L_0x0101
            X.190 r2 = r9.A05
            java.lang.String r1 = "ContactFormSaveContactController: unable to save contact, contactManager.getContactById returned null "
            java.lang.String r0 = "Failed to save contact to phone: "
            r2.A0G(r1, r0, r6)
            X.1KB r2 = r9.A06
            r1 = 41
            X.7Pc r0 = new X.7Pc
            r0.<init>(r9, r1)
            r2.A0J(r0)
            return
        L_0x00a3:
            X.5xr r1 = r9.A0G
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x00ae
            r0 = 5
            goto L_0x0016
        L_0x00ae:
            X.11E r0 = r9.A07
            boolean r6 = r0.A09()
            r5 = 0
            r4 = 1
            if (r6 == 0) goto L_0x00c2
            java.lang.String r0 = r1.A03()
            boolean r0 = r1.A0D(r0)
            if (r0 != 0) goto L_0x00e8
        L_0x00c2:
            X.6pq r2 = r9.A0D
            X.1E7 r0 = r2.A00
            if (r0 != 0) goto L_0x00e8
            r1 = 0
            boolean r0 = r2.A02
            r2 = 1
            if (r0 != 0) goto L_0x00d1
        L_0x00ce:
            r2 = 0
            if (r1 != 0) goto L_0x00d8
        L_0x00d1:
            X.6pq r0 = r9.A0D
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00d8
            r5 = 1
        L_0x00d8:
            X.17x r1 = r9.A0K
            X.1dX r0 = r9.A08
            boolean r1 = X.AnonymousClass743.A07(r0, r1)
            if (r2 == 0) goto L_0x00ea
            r0 = 7
            if (r1 == 0) goto L_0x0016
            r0 = 3
            goto L_0x0016
        L_0x00e8:
            r1 = 1
            goto L_0x00ce
        L_0x00ea:
            if (r5 == 0) goto L_0x001e
            X.6pq r0 = r9.A0D
            java.lang.Integer r0 = r0.A01
            if (r0 == 0) goto L_0x00fa
            r3 = r0
        L_0x00f3:
            r0 = 8
            if (r1 == 0) goto L_0x0016
            r0 = 4
            goto L_0x0016
        L_0x00fa:
            if (r6 != 0) goto L_0x00f3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            goto L_0x00f3
        L_0x0101:
            r3.A09 = r4
            r4 = -5
            java.lang.String r1 = r9.A01
            X.2lf r0 = new X.2lf
            r0.<init>(r4, r1)
            r3.A0H = r0
            X.71l r1 = r9.A0F
            java.lang.String r0 = r1.A02()
            r3.A0R = r0
            android.widget.EditText r0 = r1.A04
            java.lang.String r0 = X.C1404471l.A00(r0)
            r3.A0T = r0
            android.widget.EditText r0 = r1.A05
            java.lang.String r0 = X.C1404471l.A00(r0)
            r3.A0S = r0
            android.widget.EditText r0 = r1.A00
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = X.C1404471l.A00(r0)
        L_0x012e:
            r3.A0Q = r0
            X.10I r2 = r9.A0O
            r0 = 38
            X.3Bv r1 = new X.3Bv
            r1.<init>(r9, r3, r0)
            java.lang.String r0 = "convert_synced_contact_to_unsynced"
            r2.CGL(r1, r0)
            return
        L_0x013f:
            java.lang.String r0 = ""
            goto L_0x012e
        L_0x0142:
            A00(r9, r4)
            return
        L_0x0146:
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x016c
            if (r7 == 0) goto L_0x016c
            java.lang.Long r0 = r9.A0Q
            if (r0 == 0) goto L_0x016c
            java.lang.Long r1 = r9.A0R
            if (r1 == 0) goto L_0x016c
            X.6uL r0 = r9.A0J
            boolean r0 = r0.A03()
            r5 = r0 ^ 1
            long r3 = r1.longValue()
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x016c
            if (r5 != 0) goto L_0x016c
            r9.A03()
            return
        L_0x016c:
            r9.A07(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70L.A02():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r5.A0R.longValue() != 1) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(int r6) {
        /*
            r5 = this;
            java.lang.Long r0 = r5.A0Q
            if (r0 == 0) goto L_0x0011
            java.lang.Long r0 = r5.A0R
            long r3 = r0.longValue()
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            r0 = 2
            if (r6 == r0) goto L_0x0049
            r0 = 3
            if (r6 == r0) goto L_0x003f
            r0 = 4
            if (r6 == r0) goto L_0x0035
            r0 = 5
            if (r6 == r0) goto L_0x002a
            r0 = 7
            if (r6 == r0) goto L_0x002f
            r1 = 8
            X.8Am r0 = r5.A0H
            if (r6 == r1) goto L_0x002b
            r0.CMh()
        L_0x002a:
            return
        L_0x002b:
            r0.CMq()
            return
        L_0x002f:
            X.8Am r0 = r5.A0H
            r0.CMo()
            return
        L_0x0035:
            X.8Am r1 = r5.A0H
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.CMr(r0)
            return
        L_0x003f:
            X.8Am r1 = r5.A0H
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.CMp(r0)
            return
        L_0x0049:
            X.8Am r1 = r5.A0H
            X.7EL r0 = r5.A0C
            X.1E7 r0 = r0.A01
            r1.CMn(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70L.A04(int):void");
    }

    public void A05(Integer num, int i, boolean z) {
        int i2;
        C37721q1 r2 = this.A0S;
        C116505xr r1 = this.A0G;
        if (!r1.A0D(r1.A03())) {
            C133996pq r12 = this.A0D;
            if (r12.A00 == null) {
                boolean z2 = r12.A02;
                i2 = 3;
                if (z2) {
                    i2 = 2;
                }
                Integer valueOf = Integer.valueOf(i2);
                r2.A04(this.A0N, Boolean.valueOf(z), Boolean.valueOf(this.A00.A2J()), Boolean.valueOf(this.A0J.A03()), num, valueOf, i);
            }
        }
        i2 = 1;
        Integer valueOf2 = Integer.valueOf(i2);
        r2.A04(this.A0N, Boolean.valueOf(z), Boolean.valueOf(this.A00.A2J()), Boolean.valueOf(this.A0J.A03()), num, valueOf2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if (r1.A0D.A00 != null) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(java.lang.Integer r20, java.lang.Long r21, int r22) {
        /*
            r19 = this;
            r1 = r19
            X.6uL r0 = r1.A0J
            boolean r7 = r0.A03()
            boolean r0 = r0.A03()
            r6 = 1
            r0 = r0 ^ 1
            long r4 = r21.longValue()
            long r2 = (long) r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0019
            r6 = 0
        L_0x0019:
            X.1q1 r8 = r1.A0S
            X.0z4 r0 = r1.A00
            boolean r15 = r0.A2J()
            X.5xr r2 = r1.A0G
            java.lang.String r0 = r2.A03()
            boolean r0 = r2.A0D(r0)
            if (r0 != 0) goto L_0x0034
            X.6pq r0 = r1.A0D
            X.1E7 r0 = r0.A00
            r14 = 0
            if (r0 == 0) goto L_0x0035
        L_0x0034:
            r14 = 1
        L_0x0035:
            X.71l r4 = r1.A0F
            java.lang.String r3 = r4.A01
            android.widget.EditText r0 = r4.A04
            java.lang.String r0 = X.C1404471l.A00(r0)
            boolean r0 = X.C18070vi.A18(r3, r0)
            r16 = r0 ^ 1
            java.lang.String r3 = r4.A02
            android.widget.EditText r0 = r4.A05
            java.lang.String r0 = X.C1404471l.A00(r0)
            boolean r0 = X.C18070vi.A18(r3, r0)
            r17 = r0 ^ 1
            java.lang.String r0 = r2.A03()
            boolean r0 = r2.A0D(r0)
            r18 = r0 ^ 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = r2.A03()
            boolean r0 = r2.A0D(r0)
            if (r0 != 0) goto L_0x00a5
            X.6pq r1 = r1.A0D
            X.1E7 r0 = r1.A00
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r1.A02
            r1 = 3
            if (r0 == 0) goto L_0x007b
            r1 = 2
        L_0x007b:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = r8.A0A
            if (r0 == 0) goto L_0x00a4
            X.11S r0 = r8.A00
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x00a4
            X.Bqy r7 = new X.Bqy
            r7.<init>()
            X.00H r0 = r8.A03
            X.10I r1 = X.AnonymousClass3MX.A0x(r0)
            X.DTO r6 = new X.DTO
            r11 = r20
            r13 = r22
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = "AddContactLog"
            r1.CGS(r6, r0)
        L_0x00a4:
            return
        L_0x00a5:
            r1 = 1
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70L.A06(java.lang.Integer, java.lang.Long, int):void");
    }

    public void A07(boolean z) {
        this.A0O.CGO(new AnonymousClass7RK(28, (Object) this, z), "Saving Contact");
    }

    public AnonymousClass70L(AnonymousClass190 r4, AnonymousClass1KB r5, AnonymousClass11E r6, C30191dX r7, AnonymousClass1M9 r8, C26781Tl r9, C139486yv r10, AnonymousClass7EL r11, C133996pq r12, C133246oP r13, C1404471l r14, C116505xr r15, C133496or r16, C160908Am r17, C139626zB r18, C136756uL r19, C219217x r20, C19830z4 r21, AnonymousClass1UN r22, C18030ve r23, AnonymousClass1BI r24, C37721q1 r25, AnonymousClass10I r26, Long l, Long l2, Long l3, String str) {
        this.A0M = r23;
        this.A06 = r5;
        this.A0O = r26;
        this.A05 = r4;
        this.A0S = r25;
        this.A08 = r7;
        this.A0K = r20;
        this.A0B = r10;
        this.A0H = r17;
        this.A0F = r14;
        this.A0G = r15;
        this.A0J = r19;
        this.A0E = r13;
        this.A0I = r18;
        this.A0D = r12;
        this.A0Q = l;
        this.A0P = l2;
        this.A01 = str;
        this.A0R = l3;
        this.A0C = r11;
        this.A09 = r8;
        this.A0N = r24;
        this.A00 = r21;
        this.A0L = r22;
        this.A0A = r9;
        AnonymousClass783 r2 = new AnonymousClass783(this, 24);
        C133496or r1 = r16;
        r1.A00.setOnClickListener(r2);
        C28931bI r110 = r1.A01;
        if (r110.A00 != null && r110.A01() == 0) {
            r110.A02().setOnClickListener(r2);
        }
        this.A07 = r6;
    }
}
