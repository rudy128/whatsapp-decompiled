package X;

/* renamed from: X.3Cs  reason: invalid class name and case insensitive filesystem */
public class C70843Cs implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public C70843Cs(AnonymousClass1E7 r2, AnonymousClass1BI r3, C27071Up r4, int i) {
        this.A00 = 9;
        this.A02 = r2;
        this.A01 = i;
        this.A03 = r4;
        this.A05 = true;
        this.A04 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0203, code lost:
        if (r1.A08 == r3) goto L_0x0205;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0256;
                case 1: goto L_0x0043;
                case 2: goto L_0x008a;
                case 3: goto L_0x00f9;
                case 4: goto L_0x0127;
                case 5: goto L_0x0284;
                case 6: goto L_0x029d;
                case 7: goto L_0x02ce;
                case 8: goto L_0x01e3;
                case 9: goto L_0x03b0;
                case 10: goto L_0x03f6;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r11 = r0.A02
            X.0vb r11 = (X.C18000vb) r11
            int r2 = r0.A01
            java.lang.Object r9 = r0.A03
            android.content.Context r9 = (android.content.Context) r9
            boolean r8 = r0.A05
            java.lang.Object r7 = r0.A04
            X.1KB r7 = (X.AnonymousClass1KB) r7
            java.util.Locale r10 = r11.A0N()
            long r3 = (long) r2
            r6 = 1
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "%d"
            java.lang.String r0 = java.lang.String.format(r10, r0, r1)
            r5[r2] = r0
            r0 = 283(0x11b, float:3.97E-43)
            java.lang.String r1 = r11.A0J(r5, r0, r3)
            r0 = 2131890389(0x7f1210d5, float:1.9415468E38)
            java.lang.String r0 = X.C17890vO.A0R(r9, r1, r6, r2, r0)
            if (r8 == 0) goto L_0x0252
            r7.A0G(r0, r6)
        L_0x0042:
            return
        L_0x0043:
            java.lang.Object r5 = r0.A02
            X.2sn r5 = (X.C63272sn) r5
            java.lang.Object r4 = r0.A03
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            boolean r3 = r0.A05
            int r1 = r0.A01
            java.lang.Object r2 = r0.A04
            X.206 r2 = (X.AnonymousClass206) r2
            if (r4 == 0) goto L_0x0058
            r4.run()
        L_0x0058:
            if (r3 == 0) goto L_0x0042
            r0 = 56
            if (r1 != r0) goto L_0x0066
            X.1Lg r1 = r5.A00
            r0 = 28
        L_0x0062:
            r1.A02(r2, r0)
            return
        L_0x0066:
            r0 = 67
            if (r1 != r0) goto L_0x006f
            X.1Lg r1 = r5.A00
            r0 = 31
            goto L_0x0062
        L_0x006f:
            r0 = 68
            if (r1 != r0) goto L_0x0078
            X.1Lg r1 = r5.A00
            r0 = 30
            goto L_0x0062
        L_0x0078:
            r0 = 79
            if (r1 != r0) goto L_0x0081
            X.1Lg r1 = r5.A00
            r0 = 36
            goto L_0x0062
        L_0x0081:
            r0 = 93
            if (r1 != r0) goto L_0x0042
            X.1Lg r1 = r5.A00
            r0 = 42
            goto L_0x0062
        L_0x008a:
            java.lang.Object r4 = r0.A02
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r3 = r0.A03
            X.A5M r3 = (X.A5M) r3
            java.lang.Object r7 = r0.A04
            X.1BI r7 = (X.AnonymousClass1BI) r7
            int r9 = r0.A01
            boolean r12 = r0.A05
            if (r4 == 0) goto L_0x0042
            X.00H r5 = r3.A0H
            java.lang.Object r6 = r5.get()
            X.A8x r6 = (X.C20136A8x) r6
            boolean r0 = r6.A0O(r7)
            if (r0 == 0) goto L_0x0042
            X.0ve r1 = r6.A07
            r0 = 7115(0x1bcb, float:9.97E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x00f2
            X.0z4 r0 = r6.A03
            boolean r0 = r0.A2U()
        L_0x00bc:
            if (r0 == 0) goto L_0x0042
            X.1M9 r0 = r3.A02
            X.1E7 r0 = r0.A0E(r7)
            if (r0 == 0) goto L_0x0042
            r5.get()
            int r1 = X.C20136A8x.A00(r0)
            r5.get()
            r0 = 1
            if (r1 == r0) goto L_0x0042
            r5.get()
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r4.iterator()
        L_0x00de:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0412
            X.206 r0 = X.C17880vN.A0Y(r4)
            X.205 r1 = r0.A0v
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x00de
            r8.add(r1)
            goto L_0x00de
        L_0x00f2:
            X.1N5 r0 = r6.A0B
            boolean r0 = r0.A04(r7)
            goto L_0x00bc
        L_0x00f9:
            java.lang.Object r4 = r0.A02
            X.1ml r4 = (X.C35761ml) r4
            java.lang.Object r3 = r0.A03
            X.63p r3 = (X.C1184763p) r3
            boolean r2 = r0.A05
            java.lang.Object r5 = r0.A04
            X.1BI r5 = (X.AnonymousClass1BI) r5
            int r1 = r0.A01
            r11 = 0
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.C35761ml.A00(r4, r3)
            if (r2 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x0042
            X.A5M r4 = r4.A02
            r10 = 19
            if (r1 != 0) goto L_0x011d
            r10 = 18
        L_0x011d:
            r9 = 10
            r6 = 0
            r8 = r6
            r7 = r6
            r12 = r11
            r4.A03(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0127:
            java.lang.Object r3 = r0.A02
            X.1aq r3 = (X.C28751aq) r3
            java.lang.Object r4 = r0.A03
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r6 = r0.A04
            X.1BI r6 = (X.AnonymousClass1BI) r6
            int r5 = r0.A01
            boolean r7 = r0.A05
            if (r4 == 0) goto L_0x0169
            X.00H r0 = r3.A0C
            java.lang.Object r8 = r0.get()
            X.72y r8 = (X.C1407672y) r8
            X.10I r2 = r8.A04
            r1 = 23
            X.3Bz r0 = new X.3Bz
            r0.<init>(r4, r8, r1)
            r2.CGF(r0)
            X.1N5 r0 = r3.A08
            boolean r0 = r0.A03(r6)
            if (r0 == 0) goto L_0x015a
            X.1N9 r0 = r3.A09
            r0.A0G(r4)
        L_0x015a:
            X.00H r0 = r3.A01
            java.lang.Object r1 = r0.get()
            X.1i1 r1 = (X.C32951i1) r1
            int r0 = r4.size()
            r1.A0B(r6, r0)
        L_0x0169:
            X.0ve r2 = r3.A00
            r1 = 7115(0x1bcb, float:9.97E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0180
            X.00H r0 = r3.A0A
            java.lang.Object r0 = r0.get()
            X.A5M r0 = (X.A5M) r0
            r0.A04(r6, r4, r5, r7)
        L_0x0180:
            X.00H r0 = r3.A02
            java.lang.Object r0 = r0.get()
            X.1iV r0 = (X.C33241iV) r0
            r0.A04(r4)
            X.00H r0 = r3.A0B
            java.lang.Object r3 = r0.get()
            X.73F r3 = (X.AnonymousClass73F) r3
            if (r4 == 0) goto L_0x0042
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r4.iterator()
        L_0x019d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.206 r0 = (X.AnonymousClass206) r0
            X.AcA r0 = X.AnonymousClass9RV.A00(r0)
            if (r0 == 0) goto L_0x019d
            boolean r1 = r0.A02
            r0 = 1
            if (r1 != r0) goto L_0x019d
            r5.add(r2)
            goto L_0x019d
        L_0x01b9:
            java.util.Iterator r2 = r5.iterator()
        L_0x01bd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0042
            X.206 r1 = X.C17880vN.A0Y(r2)
            X.00H r0 = r3.A07
            java.lang.Object r5 = r0.get()
            X.706 r5 = (X.AnonymousClass706) r5
            X.205 r0 = r1.A0v
            X.1BI r4 = r0.A00
            if (r4 == 0) goto L_0x01bd
            r6 = 0
            r15 = 6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r7 = r6
            X.AnonymousClass706.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01bd
        L_0x01e3:
            java.lang.Object r4 = r0.A02
            X.1Up r4 = (X.C27071Up) r4
            java.lang.Object r1 = r0.A03
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            int r3 = r0.A01
            java.lang.Object r8 = r0.A04
            X.1BI r8 = (X.AnonymousClass1BI) r8
            r11 = 2
            X.1Lr r0 = r4.A03
            boolean r0 = r0.A06(r1)
            if (r0 != 0) goto L_0x0200
            boolean r0 = r1.A0F()
            if (r0 == 0) goto L_0x0205
        L_0x0200:
            int r0 = r1.A08
            r2 = 1
            if (r0 != r3) goto L_0x0206
        L_0x0205:
            r2 = 0
        L_0x0206:
            X.1Tv r0 = r4.A04
            r0.A00(r1)
            X.1Lf r0 = r4.A02
            r0.A01(r8)
            r0.A00(r8)
            if (r2 == 0) goto L_0x0042
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r5 = X.C42941yz.A00(r8)
            if (r5 == 0) goto L_0x0479
            X.1MG r0 = r4.A05
            r0.A04()
            java.util.Map r0 = r0.A02
            java.lang.Object r3 = r0.get(r5)
            X.1EC r3 = (X.AnonymousClass1EC) r3
            if (r3 == 0) goto L_0x0479
            X.00H r7 = r4.A08
            java.lang.Object r0 = r7.get()
            X.1kb r0 = (X.C34511kb) r0
            java.util.HashSet r0 = r0.A07(r3)
            java.util.ArrayList r6 = X.C29351c6.A0D(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0240:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0444
            java.lang.Object r0 = r2.next()
            X.A2B r0 = (X.A2B) r0
            com.whatsapp.jid.GroupJid r0 = r0.A02
            r6.add(r0)
            goto L_0x0240
        L_0x0252:
            r7.A0L(r0, r6)
            return
        L_0x0256:
            java.lang.Object r5 = r0.A02
            X.2qm r5 = (X.C62092qm) r5
            java.lang.Object r4 = r0.A03
            X.1nB r4 = (X.C36001nB) r4
            java.lang.Object r3 = r0.A04
            int r1 = r0.A01
            boolean r2 = r0.A05
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.C62092qm.A0A = r0
            X.1KB r0 = r5.A00
            if (r0 == 0) goto L_0x027d
            r0.A04()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.invoke(r3, r1, r0)
            return
        L_0x027d:
            java.lang.String r0 = "globalUI"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0284:
            java.lang.Object r5 = r0.A02
            X.10T r5 = (X.AnonymousClass10T) r5
            java.lang.Object r4 = r0.A03
            X.1BI r4 = (X.AnonymousClass1BI) r4
            java.lang.Object r3 = r0.A04
            java.util.Collection r3 = (java.util.Collection) r3
            int r2 = r0.A01
            boolean r1 = r0.A05
            X.35U r0 = new X.35U
            r0.<init>(r4, r3, r2, r1)
            r5.notifyAllObservers(r0)
            return
        L_0x029d:
            java.lang.Object r8 = r0.A02
            X.1hs r8 = (X.C32861hs) r8
            java.lang.Object r7 = r0.A03
            X.206 r7 = (X.AnonymousClass206) r7
            int r6 = r0.A01
            boolean r5 = r0.A05
            java.lang.Object r4 = r0.A04
            java.lang.Integer r4 = (java.lang.Integer) r4
            X.1Qw r1 = r8.A05
            X.205 r0 = r7.A0v
            java.util.Set r3 = r1.A03(r0)
            X.1PT r2 = r8.A0L
            X.2qt r1 = new X.2qt
            r1.<init>(r7)
            r1.A04 = r6
            r0 = 1
            r1.A03 = r0
            X.190 r0 = r8.A00
            X.C22971Dz.A0E(r0, r1, r3)
            r1.A0B = r5
            r1.A07 = r4
            X.C62162qt.A00(r1, r2, r3)
            return
        L_0x02ce:
            boolean r1 = r0.A05
            java.lang.Object r10 = r0.A02
            X.6xL r10 = (X.C138596xL) r10
            int r13 = r0.A01
            java.lang.Object r11 = r0.A03
            X.1Di r11 = (X.C22821Di) r11
            java.lang.Object r12 = r0.A04
            X.1Di r12 = (X.C22821Di) r12
            if (r1 != 0) goto L_0x037b
            X.00H r0 = r10.A04
            java.lang.Object r0 = r0.get()
            X.1Ul r0 = (X.C27031Ul) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r0)
            java.lang.String r0 = "pref_avatar_profile_photo_poses"
            r8 = 0
            java.lang.String r0 = r1.getString(r0, r8)
            if (r0 == 0) goto L_0x036e
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>(r0)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            int r6 = r7.length()
            r5 = 0
        L_0x0305:
            if (r5 >= r6) goto L_0x033c
            org.json.JSONObject r9 = r7.getJSONObject(r5)
            java.lang.String r0 = "url"
            java.lang.String r3 = r9.getString(r0)
            java.lang.String r1 = "accessibility_label"
            boolean r0 = r9.has(r1)
            if (r0 == 0) goto L_0x033a
            java.lang.String r2 = r9.getString(r1)
        L_0x031e:
            java.lang.String r1 = "emojis"
            boolean r0 = r9.has(r1)
            if (r0 == 0) goto L_0x0338
            java.lang.String r1 = r9.getString(r1)
        L_0x032a:
            X.C18070vi.A0b(r3)
            X.777 r0 = new X.777
            r0.<init>(r3, r1, r2)
            r4.add(r0)
            int r5 = r5 + 1
            goto L_0x0305
        L_0x0338:
            r1 = r8
            goto L_0x032a
        L_0x033a:
            r2 = r8
            goto L_0x031e
        L_0x033c:
            r3 = 1
            X.00H r2 = r10.A03
            java.lang.Object r1 = r2.get()
            X.70I r1 = (X.AnonymousClass70I) r1
            java.lang.String r0 = "urls_read_from_cache"
            r1.A03(r13, r0)
            r0 = 0
            java.util.List r3 = X.C138596xL.A00(r10, r4, r0, r3)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x036e
            java.lang.Object r1 = r2.get()
            X.70I r1 = (X.AnonymousClass70I) r1
            java.lang.String r0 = "bitmaps_read_from_cache"
            r1.A03(r13, r0)
            X.1KB r2 = r10.A00
            r1 = 38
            X.Ak0 r0 = new X.Ak0
            r0.<init>(r11, r3, r1)
            r2.A0J(r0)
            return
        L_0x036e:
            r15 = 1
            X.10I r0 = r10.A01
            r14 = 7
            X.3Cs r9 = new X.3Cs
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (int) r13, (int) r14, (boolean) r15)
            r0.CGN(r9)
            return
        L_0x037b:
            X.0vp r0 = r10.A05
            java.lang.Object r3 = r0.get()
            X.2d3 r3 = (X.C53762d3) r3
            X.87k r2 = r3.A01
            r1 = 3
            X.7L2 r0 = new X.7L2
            r0.<init>(r3, r1)
            X.7I9 r4 = r2.BGe(r0)
            X.836 r3 = new X.836
            r3.<init>(r10, r11, r12, r13)
            X.82W r1 = new X.82W
            r1.<init>(r10, r12)
            r0 = 2
            X.7Hz r2 = new X.7Hz
            r2.<init>(r3, r1, r0)
            X.00H r0 = r10.A03
            java.lang.Object r1 = r0.get()
            X.70I r1 = (X.AnonymousClass70I) r1
            java.lang.String r0 = "graphql_request_posted"
            r1.A03(r13, r0)
            r4.CBv(r2)
            return
        L_0x03b0:
            java.lang.Object r3 = r0.A02
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            int r6 = r0.A01
            java.lang.Object r5 = r0.A03
            X.1Up r5 = (X.C27071Up) r5
            java.lang.Object r4 = r0.A04
            X.1BI r4 = (X.AnonymousClass1BI) r4
            r8 = 1
            int r2 = r3.A07
            r1 = 0
            if (r2 == r6) goto L_0x03c5
            r2 = 0
        L_0x03c5:
            int r0 = r3.A08
            if (r0 != r6) goto L_0x03ca
            r1 = r0
        L_0x03ca:
            X.1Tv r0 = r5.A04
            r0.A01(r3, r2, r1)
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r2 = r3.A06(r0)
            if (r2 == 0) goto L_0x03e9
            X.00H r0 = r5.A0A
            java.lang.Object r1 = r0.get()
            X.2eL r1 = (X.C54562eL) r1
            X.2lS r0 = r1.A01
            r0.A01(r2)
            X.2lS r0 = r1.A02
            r0.A01(r2)
        L_0x03e9:
            X.1KB r0 = r5.A02
            r7 = 8
            X.3Cs r2 = new X.3Cs
            r2.<init>((X.AnonymousClass1E7) r3, (X.AnonymousClass1BI) r4, (X.C27071Up) r5, (int) r6, (int) r7, (boolean) r8)
            r0.A0J(r2)
            return
        L_0x03f6:
            java.lang.Object r3 = r0.A02
            X.1q1 r3 = (X.C37721q1) r3
            java.lang.Object r2 = r0.A03
            X.Bqy r2 = (X.C23841Bqy) r2
            boolean r1 = r0.A05
            r5 = 0
            r10 = 4
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r7 = r5
            r8 = r5
            r9 = r5
            r6 = r5
            X.C37721q1.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0412:
            X.11P r0 = r3.A03
            long r10 = X.AnonymousClass11P.A01(r0)
            X.9sv r6 = new X.9sv
            r6.<init>(r7, r8, r9, r10, r12)
            java.lang.Object r0 = r5.get()
            X.A8x r0 = (X.C20136A8x) r0
            X.0ve r1 = r0.A07
            r0 = 8977(0x2311, float:1.258E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x0438
            int r1 = r6.A00
            r0 = 1
            if (r1 != r0) goto L_0x0438
            X.96s r0 = r3.A01
            r0.A07(r6)
            return
        L_0x0438:
            r2 = 0
            r1 = 35
            X.AkM r0 = new X.AkM
            r0.<init>(r6, r3, r2, r1)
            X.A5M.A01(r3, r0)
            return
        L_0x0444:
            java.util.Set r0 = X.C29431cG.A12(r6)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0479
            java.lang.Object r0 = r7.get()
            X.1kb r0 = (X.C34511kb) r0
            com.whatsapp.jid.GroupJid r0 = r0.A02(r3)
            X.1EC r2 = X.C42941yz.A00(r0)
            int r0 = r1.A08
            if (r0 <= 0) goto L_0x0477
            java.lang.String r0 = java.lang.Integer.toString(r0)
        L_0x0464:
            java.util.HashMap r1 = X.C17880vN.A11()
            r1.put(r5, r0)
            X.00H r0 = r4.A0B
            java.lang.Object r0 = r0.get()
            com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper r0 = (com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper) r0
            r0.A02(r3, r2, r1)
            return
        L_0x0477:
            r0 = 0
            goto L_0x0464
        L_0x0479:
            X.1Ui r7 = r4.A06
            int r10 = r1.A08
            java.lang.String r9 = "ProfilePhotoUpdater.handleProfilePhotoIdReceived"
            r12 = 0
            r7.A03(r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70843Cs.run():void");
    }

    public C70843Cs(AnonymousClass1E7 r2, AnonymousClass1BI r3, C27071Up r4, int i, int i2, boolean z) {
        this.A00 = 8;
        this.A05 = true;
        this.A02 = r4;
        this.A03 = r2;
        this.A01 = i;
        this.A04 = r3;
    }

    public C70843Cs(Object obj, Object obj2, Object obj3, int i, int i2, boolean z) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A01 = i;
        this.A05 = z;
    }

    public C70843Cs(C23841Bqy bqy, AnonymousClass1BI r3, C37721q1 r4, boolean z) {
        this.A00 = 10;
        this.A02 = r4;
        this.A03 = bqy;
        this.A01 = 4;
        this.A05 = z;
        this.A04 = r3;
    }
}
