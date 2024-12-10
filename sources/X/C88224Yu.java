package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4Yu  reason: invalid class name and case insensitive filesystem */
public abstract class C88224Yu {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1.A0w() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(android.content.Context r7, X.AnonymousClass1M9 r8, X.C24921Me r9, X.AnonymousClass1BI r10, java.util.Collection r11) {
        /*
            r4 = 0
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0008
            return r4
        L_0x0008:
            if (r10 == 0) goto L_0x002b
            X.1E7 r3 = r8.A0H(r10)
        L_0x000e:
            java.util.Iterator r0 = r11.iterator()
            X.206 r1 = X.C17880vN.A0Y(r0)
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x0021
            boolean r0 = r1.A0w()
            r2 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            int r0 = r11.size()
            if (r0 != r6) goto L_0x006d
            if (r1 != 0) goto L_0x002d
            return r4
        L_0x002b:
            r3 = r4
            goto L_0x000e
        L_0x002d:
            X.205 r0 = r1.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0060
            if (r3 == 0) goto L_0x0060
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x0052
            X.1BI r0 = r1.A0H()
            if (r0 == 0) goto L_0x005d
            java.lang.String r1 = X.AnonymousClass3MY.A0p(r8, r9, r0)
        L_0x0045:
            r0 = 2131889296(0x7f120c90, float:1.9413252E38)
            if (r2 == 0) goto L_0x004d
            r0 = 2131889297(0x7f120c91, float:1.9413254E38)
        L_0x004d:
            java.lang.String r0 = X.C17890vO.A0R(r7, r1, r6, r5, r0)
            return r0
        L_0x0052:
            java.lang.String r0 = r9.A0I(r3)
            if (r0 == 0) goto L_0x005d
            java.lang.String r1 = r9.A0I(r3)
            goto L_0x0045
        L_0x005d:
            java.lang.String r1 = ""
            goto L_0x0045
        L_0x0060:
            r0 = 2131889298(0x7f120c92, float:1.9413256E38)
            if (r2 == 0) goto L_0x0068
            r0 = 2131889299(0x7f120c93, float:1.9413258E38)
        L_0x0068:
            java.lang.String r0 = r7.getString(r0)
            return r0
        L_0x006d:
            r4 = 2131755085(0x7f10004d, float:1.914104E38)
            if (r2 == 0) goto L_0x0075
            r4 = 2131755086(0x7f10004e, float:1.9141041E38)
        L_0x0075:
            android.content.res.Resources r3 = r7.getResources()
            int r2 = r11.size()
            java.lang.Object[] r1 = new java.lang.Object[r6]
            int r0 = r11.size()
            X.C17880vN.A1T(r1, r0, r5)
            java.lang.String r0 = r3.getQuantityString(r4, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88224Yu.A01(android.content.Context, X.1M9, X.1Me, X.1BI, java.util.Collection):java.lang.String");
    }

    public static void A02(AnonymousClass18K r6, C25241Nl r7, C62242r5 r8, Set set, int i) {
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            AnonymousClass206 r3 = null;
            AnonymousClass206 r5 = null;
            int i2 = -1;
            while (true) {
                if (!it.hasNext()) {
                    r3 = r5;
                    break;
                }
                AnonymousClass206 A0Y = C17880vN.A0Y(it);
                if (i2 == -1) {
                    i2 = A0Y.A0u;
                    r5 = A0Y;
                }
                if (i2 != A0Y.A0u) {
                    break;
                }
            }
            Iterator it2 = set.iterator();
            AnonymousClass1BI r2 = null;
            while (it2.hasNext()) {
                AnonymousClass206 A0Y2 = C17880vN.A0Y(it2);
                if (r2 == null) {
                    r2 = A0Y2.A0v.A00;
                } else if (!AnonymousClass3Ma.A1X(A0Y2, r2)) {
                    return;
                }
            }
            if (r2 != null) {
                C81563zR r1 = new C81563zR();
                r1.A01 = Integer.valueOf(i);
                r1.A00 = Boolean.valueOf(C22971Dz.A0e(r2));
                r1.A03 = C17880vN.A0n(set.size());
                r1.A04 = AnonymousClass3Ma.A14(r7, r2);
                if (r3 != null) {
                    r1.A02 = Integer.valueOf(r8.A01(r3));
                }
                r6.CC7(r1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01aa, code lost:
        if (r2.longValue() < r13) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0110, code lost:
        if (r2.A0P() == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0134, code lost:
        if (r3.A0v.A02 == false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0150, code lost:
        if (((X.C32171gl) r47.A03()).Bey(r5) == false) goto L_0x0152;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02a8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C010105w A00(android.content.Context r45, X.C19880zA r46, X.C19880zA r47, X.C107825ag r48, X.AnonymousClass5YU r49, X.C107835ah r50, X.AnonymousClass1KB r51, X.C33251iW r52, X.AnonymousClass1M9 r53, X.AnonymousClass1PM r54, X.C24921Me r55, X.C25491Ok r56, X.AnonymousClass11P r57, X.C19830z4 r58, X.C18000vb r59, X.AnonymousClass1CJ r60, X.AnonymousClass1MZ r61, X.AnonymousClass1KW r62, X.C18030ve r63, X.AnonymousClass18K r64, X.C25241Nl r65, X.C42211xo r66, X.AnonymousClass1MB r67, X.C62242r5 r68, X.C87794Wz r69, X.AnonymousClass10I r70, java.lang.String r71, java.util.Set r72, boolean r73) {
        /*
            r38 = r72
            boolean r0 = r38.isEmpty()
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "dialog/delete no messages"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x000f:
            java.util.Iterator r0 = r38.iterator()
            X.206 r0 = X.C17880vN.A0Y(r0)
            boolean r0 = r0.A0w()
            r24 = 1
            if (r0 == 0) goto L_0x0021
            r24 = 0
        L_0x0021:
            if (r73 == 0) goto L_0x0039
            java.util.Iterator r1 = r38.iterator()
        L_0x0027:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01e1
            X.206 r0 = X.C17880vN.A0Y(r1)
            if (r0 == 0) goto L_0x0027
            X.AW0 r0 = X.AnonymousClass25B.A00(r0)
            if (r0 == 0) goto L_0x0027
        L_0x0039:
            r23 = 0
        L_0x003b:
            r11 = r57
            long r20 = X.AnonymousClass11P.A01(r11)
            java.util.HashSet r9 = X.C17880vN.A12()
            java.util.Iterator r22 = r38.iterator()
            r0 = r20
            r10 = 0
            r33 = 0
            r8 = 0
            r7 = 0
            r37 = 0
            r19 = 0
            r18 = 0
        L_0x0056:
            boolean r2 = r22.hasNext()
            if (r2 == 0) goto L_0x01fd
            X.206 r6 = X.C17880vN.A0Y(r22)
            X.205 r3 = r6.A0v
            X.1BI r5 = r3.A00
            if (r33 != 0) goto L_0x0068
            r33 = r5
        L_0x0068:
            r9.add(r5)
            if (r19 != 0) goto L_0x008e
            int r4 = r6.A0u
            boolean r2 = X.AnonymousClass25A.A0I(r4)
            if (r2 != 0) goto L_0x007b
            boolean r2 = X.AnonymousClass25A.A0H(r4)
            if (r2 == 0) goto L_0x008e
        L_0x007b:
            r2 = r6
            X.21V r2 = (X.AnonymousClass21V) r2
            X.2rc r2 = X.AnonymousClass206.A00(r2)
            java.io.File r2 = r2.A0G
            if (r2 == 0) goto L_0x008e
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x008e
            r19 = 1
        L_0x008e:
            if (r18 != 0) goto L_0x009f
            boolean r2 = r6 instanceof X.AnonymousClass21V
            if (r2 == 0) goto L_0x009f
            r2 = r6
            X.21V r2 = (X.AnonymousClass21V) r2
            boolean r2 = X.AnonymousClass25A.A10(r2)
            if (r2 != 0) goto L_0x009f
            r18 = 1
        L_0x009f:
            boolean r2 = r6 instanceof X.AnonymousClass247
            if (r2 == 0) goto L_0x00a7
            r19 = 1
            r18 = 1
        L_0x00a7:
            if (r5 == 0) goto L_0x01de
            r2 = r53
            X.1E7 r4 = r2.A0H(r5)
        L_0x00af:
            boolean r12 = r3.A02
            if (r12 != 0) goto L_0x00b5
            int r10 = r10 + 1
        L_0x00b5:
            boolean r2 = X.C22971Dz.A0e(r5)
            r3 = r61
            if (r2 == 0) goto L_0x01da
            X.1EC r2 = X.AnonymousClass3MY.A0b(r5)
            boolean r2 = r3.A0K(r2)
            if (r2 == 0) goto L_0x01da
            r2 = 1
            if (r10 != r2) goto L_0x01da
            r17 = 1
            r10 = 1
            com.whatsapp.jid.UserJid[] r13 = new com.whatsapp.jid.UserJid[r2]
            com.whatsapp.jid.UserJid r8 = r6.A0I()
            r2 = 0
            r13[r2] = r8
            java.util.ArrayList r8 = X.C220618l.newArrayList((java.lang.Object[]) r13)
            r2 = -1
            r13 = r55
            java.lang.String r37 = r13.A0a(r8, r2)
            r8 = 1
        L_0x00e2:
            if (r12 == 0) goto L_0x01d6
            boolean r2 = X.C22971Dz.A0e(r5)
            if (r2 == 0) goto L_0x00f4
            X.1EC r2 = X.AnonymousClass3MY.A0b(r5)
            boolean r2 = r3.A0J(r2)
            if (r2 == 0) goto L_0x01d6
        L_0x00f4:
            r16 = 1
            int r7 = r7 + 1
        L_0x00f8:
            boolean r12 = r6.A0w()
            if (r16 != 0) goto L_0x0116
            if (r12 == 0) goto L_0x0116
            r2 = r60
            X.1ci r2 = r2.A0A(r5)
            X.2Dk r2 = (X.C46162Dk) r2
            if (r2 == 0) goto L_0x0112
            boolean r2 = r2.A0P()
            r16 = 1
            if (r2 != 0) goto L_0x0114
        L_0x0112:
            r16 = 0
        L_0x0114:
            int r7 = r7 + 1
        L_0x0116:
            boolean r2 = r46.A07()
            if (r2 == 0) goto L_0x0136
            r46.A03()
            X.206 r3 = r6.A0K()
            X.1BI r2 = r6.A0H()
            boolean r2 = X.C42701yb.A01(r2)
            if (r2 == 0) goto L_0x0136
            if (r3 == 0) goto L_0x0136
            X.205 r2 = r3.A0v
            boolean r2 = r2.A02
            r14 = 1
            if (r2 != 0) goto L_0x0137
        L_0x0136:
            r14 = 0
        L_0x0137:
            if (r12 == 0) goto L_0x01c8
            boolean r12 = X.AnonymousClass4aS.A07(r11, r6)
        L_0x013d:
            if (r47 == 0) goto L_0x0152
            boolean r2 = r47.A07()
            if (r2 == 0) goto L_0x0152
            java.lang.Object r2 = r47.A03()
            X.1gl r2 = (X.C32171gl) r2
            boolean r2 = r2.Bey(r5)
            r15 = 1
            if (r2 != 0) goto L_0x0153
        L_0x0152:
            r15 = 0
        L_0x0153:
            long r2 = r6.A0I
            long r0 = java.lang.Math.min(r2, r0)
            if (r23 == 0) goto L_0x01ac
            if (r16 != 0) goto L_0x0161
            if (r17 != 0) goto L_0x0161
            if (r14 == 0) goto L_0x01ac
        L_0x0161:
            boolean r2 = X.AnonymousClass25A.A0p(r6)
            if (r2 != 0) goto L_0x01ac
            if (r12 == 0) goto L_0x01ac
            X.1BI r2 = r6.A0H()
            boolean r2 = X.C22971Dz.A0N(r2)
            if (r2 != 0) goto L_0x01ac
            if (r4 == 0) goto L_0x017d
            r2 = r66
            boolean r2 = r2.A02(r4)
            if (r2 != 0) goto L_0x01ac
        L_0x017d:
            r2 = r67
            boolean r2 = r2.A03(r5)
            if (r2 != 0) goto L_0x01ac
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A00(r5)
            r12 = r54
            boolean r2 = r12.A04(r4)
            if (r2 == 0) goto L_0x0197
            boolean r2 = X.C42701yb.A01(r5)
            if (r2 == 0) goto L_0x01ac
        L_0x0197:
            long r13 = X.AnonymousClass11P.A01(r11)
            int r2 = r6.A05
            if (r2 <= 0) goto L_0x01b0
            java.lang.Long r2 = r6.A0U
            X.C17960vV.A07(r2)
            long r5 = r2.longValue()
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x01b0
        L_0x01ac:
            r23 = 0
            goto L_0x0056
        L_0x01b0:
            X.2tn r3 = new X.2tn
            r2 = r56
            r3.<init>((X.AnonymousClass1PM) r12, (X.C25491Ok) r2, (com.whatsapp.jid.UserJid) r4)
            boolean r2 = r3.A04()
            if (r2 != 0) goto L_0x01ac
            boolean r2 = r3.A06()
            if (r2 != 0) goto L_0x01ac
            r23 = 1
            if (r15 == 0) goto L_0x0056
            goto L_0x01ac
        L_0x01c8:
            long r2 = r6.A0I
            r12 = 216000000(0xcdfe600, double:1.067181795E-315)
            long r2 = r2 + r12
            int r12 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            boolean r12 = X.AnonymousClass000.A1R(r12)
            goto L_0x013d
        L_0x01d6:
            r16 = 0
            goto L_0x00f8
        L_0x01da:
            r17 = 0
            goto L_0x00e2
        L_0x01de:
            r4 = 0
            goto L_0x00af
        L_0x01e1:
            java.util.Iterator r2 = r38.iterator()
        L_0x01e5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01f9
            X.206 r0 = X.C17880vN.A0Y(r2)
            if (r0 == 0) goto L_0x01e5
            int r1 = r0.A0u
            r0 = 90
            if (r1 != r0) goto L_0x01e5
            goto L_0x0039
        L_0x01f9:
            r23 = 1
            goto L_0x003b
        L_0x01fd:
            r36 = 0
            r30 = r58
            if (r23 == 0) goto L_0x021a
            r2 = 1
            if (r8 < r2) goto L_0x0304
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r30)
            java.lang.String r0 = "pref_revoke_admin_nux"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r7 < r2) goto L_0x02fe
            if (r0 == 0) goto L_0x021a
            r0 = 24
        L_0x0216:
            java.lang.Integer r36 = java.lang.Integer.valueOf(r0)
        L_0x021a:
            r11 = r45
            X.3Rj r2 = X.AnonymousClass4a6.A00(r11)
            if (r19 == 0) goto L_0x02fa
            if (r18 == 0) goto L_0x02fa
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r30)
            java.lang.String r0 = "pref_delete_media"
            r4 = 1
            boolean r10 = r1.getBoolean(r0, r4)
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r11)
            r1 = 2131625066(0x7f0e046a, float:1.887733E38)
            r0 = 0
            android.view.View r3 = X.AnonymousClass3MX.A09(r3, r0, r1)
            r0 = 2131429889(0x7f0b0a01, float:1.8481463E38)
            android.view.View r6 = r3.findViewById(r0)
            android.widget.CheckBox r6 = (android.widget.CheckBox) r6
            int r1 = r9.size()
            r0 = 2131889320(0x7f120ca8, float:1.94133E38)
            if (r1 != r4) goto L_0x0250
            r0 = 2131889321(0x7f120ca9, float:1.9413302E38)
        L_0x0250:
            r6.setText(r0)
            r6.setChecked(r10)
            r2.setView(r3)
        L_0x0259:
            r0 = r71
            r1 = r62
            java.lang.CharSequence r0 = X.C43251zV.A05(r11, r1, r0)
            r2.A0S(r0)
            r3 = 1703(0x6a7, float:2.386E-42)
            X.0vf r0 = X.C18040vf.A02
            r1 = r63
            boolean r55 = X.C18020vd.A05(r0, r1, r3)
            r0 = 0
            X.4b8 r5 = new X.4b8
            r47 = r59
            r29 = r52
            r44 = r51
            r9 = r50
            r42 = r49
            r3 = r48
            r52 = r70
            r34 = r68
            r32 = r65
            r31 = r64
            r39 = r5
            r40 = r6
            r41 = r3
            r43 = r9
            r45 = r29
            r46 = r30
            r48 = r1
            r49 = r31
            r50 = r32
            r51 = r34
            r53 = r38
            r54 = r10
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r4 = 0
            X.4bC r1 = new X.4bC
            r1.<init>((java.lang.Object) r9, (java.lang.Object) r3, (int) r0)
            if (r23 == 0) goto L_0x02ed
            if (r6 == 0) goto L_0x02b1
            boolean r6 = r6.isChecked()
            if (r6 == 0) goto L_0x02b1
            r0 = 1
        L_0x02b1:
            X.4b9 r6 = new X.4b9
            r35 = r69
            r25 = r6
            r26 = r11
            r27 = r3
            r28 = r9
            r39 = r8
            r40 = r7
            r41 = r0
            r42 = r10
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r0 = 2131895344(0x7f122430, float:1.9425518E38)
            r2.setPositiveButton(r0, r6)
            if (r24 == 0) goto L_0x02d6
            r0 = 2131895345(0x7f122431, float:1.942552E38)
            r2.setNegativeButton(r0, r5)
        L_0x02d6:
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            r2.A0Y(r1, r0)
        L_0x02dc:
            r0 = 1
            r2.A0T(r0)
            X.4an r0 = new X.4an
            r0.<init>(r3, r4)
            r2.A0G(r0)
            X.05w r0 = r2.create()
            return r0
        L_0x02ed:
            r0 = 2131895345(0x7f122431, float:1.942552E38)
            r2.setPositiveButton(r0, r5)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            r2.setNegativeButton(r0, r1)
            goto L_0x02dc
        L_0x02fa:
            r10 = 0
            r6 = 0
            goto L_0x0259
        L_0x02fe:
            if (r0 == 0) goto L_0x021a
            r0 = 23
            goto L_0x0216
        L_0x0304:
            long r5 = X.AnonymousClass11P.A01(r11)
            long r5 = r5 - r0
            r3 = 4096000(0x3e8000, double:2.023693E-317)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x031e
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r30)
            java.lang.String r0 = "pref_revoke_sender_nux"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x031e
            goto L_0x021a
        L_0x031e:
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r30)
            java.lang.String r0 = "pref_revoke_sender_nux_v2"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x021a
            r0 = 19
            if (r7 != r2) goto L_0x0216
            r0 = 25
            goto L_0x0216
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88224Yu.A00(android.content.Context, X.0zA, X.0zA, X.5ag, X.5YU, X.5ah, X.1KB, X.1iW, X.1M9, X.1PM, X.1Me, X.1Ok, X.11P, X.0z4, X.0vb, X.1CJ, X.1MZ, X.1KW, X.0ve, X.18K, X.1Nl, X.1xo, X.1MB, X.2r5, X.4Wz, X.10I, java.lang.String, java.util.Set, boolean):X.05w");
    }
}
