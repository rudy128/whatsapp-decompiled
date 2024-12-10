package com.whatsapp.group;

import X.AnonymousClass11E;
import X.AnonymousClass126;
import X.AnonymousClass12M;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1EC;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MX;
import X.AnonymousClass1MZ;
import X.AnonymousClass1NN;
import X.AnonymousClass1Nb;
import X.C136876uY;
import X.C18070vi;
import X.C19830z4;
import X.C22621Co;
import X.C24921Me;

public final class ExitGroupsDialogFragment extends Hilt_ExitGroupsDialogFragment {
    public AnonymousClass1KB A00;
    public AnonymousClass11E A01;
    public AnonymousClass1M9 A02;
    public C24921Me A03;
    public C136876uY A04;
    public C19830z4 A05;
    public C22621Co A06;
    public AnonymousClass1CJ A07;
    public AnonymousClass1NN A08;
    public AnonymousClass1MZ A09;
    public AnonymousClass1MX A0A;
    public AnonymousClass1KW A0B;
    public AnonymousClass126 A0C;
    public AnonymousClass12M A0D;
    public AnonymousClass1LU A0E;
    public AnonymousClass1Nb A0F;

    private final boolean A01(AnonymousClass1BI r5) {
        AnonymousClass1EC A022;
        String str;
        if (r5 == null || (A022 = AnonymousClass1EC.A01.A02(r5.getRawString())) == null) {
            return false;
        }
        AnonymousClass1CJ r0 = this.A07;
        if (r0 == null) {
            str = "chatsCache";
        } else if (r0.A06(A022) != 3) {
            return false;
        } else {
            AnonymousClass1MZ r02 = this.A09;
            if (r02 != null) {
                return r02.A0K(A022);
            }
            str = "groupParticipantsManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        if (r6 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0067, code lost:
        if (r6 == null) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A27(android.os.Bundle r20) {
        /*
            r19 = this;
            r14 = r19
            android.os.Bundle r1 = r14.A15()
            java.lang.String r0 = "unsent_count"
            r2 = 0
            int r9 = r1.getInt(r0, r2)
            java.lang.String r0 = "jid"
            java.lang.String r5 = r1.getString(r0)
            java.lang.String r0 = "report_upsell"
            boolean r12 = r1.getBoolean(r0, r2)
            java.lang.String r0 = "block_spam_flow"
            java.lang.String r16 = r1.getString(r0)
            java.lang.String r0 = "show_neutral_button"
            r7 = 1
            boolean r11 = r1.getBoolean(r0, r7)
            java.lang.String r0 = "leave_group_action"
            int r17 = r1.getInt(r0, r7)
            X.1yz r3 = X.AnonymousClass1EC.A01
            java.lang.String r0 = "parent_of_last_subgroup_jid"
            java.lang.String r0 = r1.getString(r0)
            X.1EC r2 = r3.A02(r0)
            if (r5 != 0) goto L_0x01bb
            java.lang.String r0 = "selection_jids"
            java.util.ArrayList r1 = r1.getStringArrayList(r0)
        L_0x0040:
            java.lang.Class<X.1EC> r0 = X.AnonymousClass1EC.class
            java.util.ArrayList r15 = X.C22971Dz.A0A(r0, r1)
            X.1EC r4 = r3.A02(r5)
            X.1BI r6 = X.AnonymousClass3MX.A0l(r5)
            int r8 = r15.size()
            boolean r10 = r14.A01(r6)
            X.1MX r0 = r14.A0A
            if (r0 == 0) goto L_0x0289
            X.0ve r0 = r0.A02
            r1 = 1597(0x63d, float:2.238E-42)
            X.0vf r5 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r5, r0, r1)
            if (r2 == 0) goto L_0x0069
            r0 = 1
            if (r6 != 0) goto L_0x006a
        L_0x0069:
            r0 = 0
        L_0x006a:
            if (r10 != 0) goto L_0x01b8
            if (r12 != 0) goto L_0x0072
            if (r3 != 0) goto L_0x0072
            if (r0 == 0) goto L_0x01b8
        L_0x0072:
            java.lang.String r8 = r14.A00(r6, r2, r9, r8)
        L_0x0076:
            int r3 = r15.size()
            boolean r10 = r14.A01(r6)
            X.1MX r0 = r14.A0A
            if (r0 == 0) goto L_0x0289
            X.0ve r0 = r0.A02
            boolean r0 = X.C18020vd.A05(r5, r0, r1)
            if (r2 == 0) goto L_0x008d
            r1 = 1
            if (r6 != 0) goto L_0x008e
        L_0x008d:
            r1 = 0
        L_0x008e:
            if (r10 != 0) goto L_0x01b2
            if (r12 != 0) goto L_0x0096
            if (r0 != 0) goto L_0x0096
            if (r1 == 0) goto L_0x01b2
        L_0x0096:
            X.1CJ r0 = r14.A07
            if (r0 == 0) goto L_0x0286
            boolean r0 = r0.A0R(r6)
            if (r0 == 0) goto L_0x0166
            r0 = 2131888616(0x7f1209e8, float:1.9411872E38)
        L_0x00a3:
            java.lang.String r2 = r14.A1H(r0)
            X.C18070vi.A0b(r2)
        L_0x00aa:
            X.3Rj r3 = X.AnonymousClass4a6.A04(r14)
            if (r8 == 0) goto L_0x00bf
            android.content.Context r1 = r14.A14()
            X.1KW r0 = r14.A0B
            if (r0 == 0) goto L_0x027d
            java.lang.CharSequence r0 = X.C43251zV.A05(r1, r0, r8)
            r3.setTitle(r0)
        L_0x00bf:
            android.content.Context r1 = r14.A14()
            X.1KW r0 = r14.A0B
            if (r0 == 0) goto L_0x027d
            java.lang.CharSequence r8 = X.C43251zV.A05(r1, r0, r2)
            r13 = 0
            if (r12 == 0) goto L_0x0162
            X.1CJ r0 = r14.A07
            if (r0 == 0) goto L_0x0279
            boolean r0 = r0.A0R(r6)
            if (r0 != 0) goto L_0x0162
            boolean r0 = r14.A01(r6)
            if (r0 != 0) goto L_0x0162
            android.content.Context r0 = r14.A1n()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131625496(0x7f0e0618, float:1.8878202E38)
            android.view.View r2 = r1.inflate(r0, r13)
            r3.setView(r2)
            r0 = 2131429980(0x7f0b0a5c, float:1.8481648E38)
            android.widget.TextView r0 = X.C72453Mb.A0W(r2, r0)
            r0.setText(r8)
            r0 = 2131429078(0x7f0b06d6, float:1.8479819E38)
            android.view.View r13 = r2.findViewById(r0)
            android.widget.CompoundButton r13 = (android.widget.CompoundButton) r13
            X.0ve r1 = r14.A02
            r0 = 9098(0x238a, float:1.2749E-41)
            boolean r0 = X.C18020vd.A05(r5, r1, r0)
            if (r0 == 0) goto L_0x0110
            r13.setChecked(r7)
        L_0x0110:
            r0 = 2131429082(0x7f0b06da, float:1.8479827E38)
            android.widget.TextView r1 = X.C72453Mb.A0W(r2, r0)
            r0 = 2131895201(0x7f1223a1, float:1.9425228E38)
            r1.setText(r0)
            r0 = 2131429083(0x7f0b06db, float:1.8479829E38)
            android.widget.TextView r1 = X.C72453Mb.A0W(r2, r0)
            r0 = 2131895253(0x7f1223d5, float:1.9425334E38)
            r1.setText(r0)
            r0 = 2131429079(0x7f0b06d7, float:1.847982E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 42
            X.C89944dH.A00(r1, r13, r0)
        L_0x0136:
            r3.A0T(r7)
            if (r11 == 0) goto L_0x0225
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r6 = r15.iterator()
        L_0x0143:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01c1
            java.lang.Object r2 = r6.next()
            r1 = r2
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1Nb r0 = r14.A0F
            if (r0 == 0) goto L_0x028c
            X.1yM r0 = r0.A0a(r1)
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0143
            r5.add(r2)
            goto L_0x0143
        L_0x0162:
            r3.A0S(r8)
            goto L_0x0136
        L_0x0166:
            if (r12 == 0) goto L_0x016d
            r0 = 2131890197(0x7f121015, float:1.941508E38)
            goto L_0x00a3
        L_0x016d:
            if (r1 == 0) goto L_0x01a5
            if (r6 == 0) goto L_0x01a5
            if (r2 == 0) goto L_0x01a5
            X.1M9 r0 = r14.A02
            if (r0 == 0) goto L_0x0283
            X.1E7 r1 = r0.A0H(r6)
            X.1M9 r0 = r14.A02
            if (r0 == 0) goto L_0x0283
            X.1E7 r9 = r0.A0H(r2)
            r3 = 2131890192(0x7f121010, float:1.9415069E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()
            X.1Me r0 = r14.A03
            if (r0 == 0) goto L_0x0280
            java.lang.String r1 = r0.A0I(r1)
            r0 = 0
            r2[r0] = r1
            X.1Me r0 = r14.A03
            if (r0 == 0) goto L_0x0280
            X.AnonymousClass3MX.A1N(r0, r9, r2, r7)
            java.lang.String r2 = r14.A1I(r3, r2)
        L_0x01a0:
            X.C18070vi.A0X(r2)
            goto L_0x00aa
        L_0x01a5:
            r0 = 2131890199(0x7f121017, float:1.9415083E38)
            if (r3 != r7) goto L_0x01ad
            r0 = 2131890198(0x7f121016, float:1.9415081E38)
        L_0x01ad:
            java.lang.String r2 = r14.A1H(r0)
            goto L_0x01a0
        L_0x01b2:
            java.lang.String r2 = r14.A00(r6, r2, r9, r3)
            goto L_0x00aa
        L_0x01b8:
            r8 = 0
            goto L_0x0076
        L_0x01bb:
            java.util.List r1 = X.C18070vi.A0M(r5)
            goto L_0x0040
        L_0x01c1:
            boolean r0 = r5.isEmpty()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r0, r5)
            java.lang.Object r0 = r1.first
            X.C18070vi.A0W(r0)
            boolean r2 = X.AnonymousClass000.A1Y(r0)
            java.lang.Object r5 = r1.second
            X.C18070vi.A0W(r5)
            java.util.List r5 = (java.util.List) r5
            X.0z4 r1 = r14.A05
            if (r1 == 0) goto L_0x0276
            boolean r0 = r1.A2Q()
            if (r0 == 0) goto L_0x026e
            boolean r0 = r1.A2R()
            if (r0 != 0) goto L_0x026e
            X.1CJ r0 = r14.A07
            if (r0 == 0) goto L_0x0286
            android.util.Pair r1 = X.AnonymousClass1Q0.A00(r0, r15)
            java.lang.Object r0 = r1.first
            X.C18070vi.A0W(r0)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            java.lang.Object r5 = r1.second
            X.C18070vi.A0W(r5)
            java.util.List r5 = (java.util.List) r5
            if (r0 != 0) goto L_0x0225
            boolean r0 = r14.A01(r4)
            if (r0 != 0) goto L_0x0260
            X.1CJ r0 = r14.A07
            if (r0 == 0) goto L_0x0286
            boolean r0 = r0.A0R(r4)
            if (r0 != 0) goto L_0x0260
            r2 = 2131886727(0x7f120287, float:1.940804E38)
            r1 = 22
        L_0x021d:
            X.4bC r0 = new X.4bC
            r0.<init>((com.whatsapp.group.ExitGroupsDialogFragment) r14, (java.util.List) r5, (int) r1)
            r3.A0Y(r0, r2)
        L_0x0225:
            boolean r0 = r14.A01(r4)
            if (r0 == 0) goto L_0x0237
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 2
        L_0x022f:
            X.AnonymousClass4bB.A00(r3, r14, r0, r1)
        L_0x0232:
            X.05w r0 = X.AnonymousClass3MY.A0L(r3)
            return r0
        L_0x0237:
            X.1CJ r0 = r14.A07
            if (r0 == 0) goto L_0x0286
            boolean r0 = r0.A0R(r4)
            if (r0 == 0) goto L_0x0246
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 3
            goto L_0x022f
        L_0x0246:
            r2 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 4
            X.4bB r0 = new X.4bB
            r0.<init>(r14, r1)
            r3.setNegativeButton(r2, r0)
            r0 = 2131890172(0x7f120ffc, float:1.9415028E38)
            r18 = 1
            X.4b3 r12 = new X.4b3
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r3.setPositiveButton(r0, r12)
            goto L_0x0232
        L_0x0260:
            r2 = 2131886727(0x7f120287, float:1.940804E38)
            r1 = 22
            X.4bC r0 = new X.4bC
            r0.<init>((com.whatsapp.group.ExitGroupsDialogFragment) r14, (java.util.List) r5, (int) r1)
            r3.setNegativeButton(r2, r0)
            goto L_0x0225
        L_0x026e:
            if (r2 != 0) goto L_0x0225
            r2 = 2131892366(0x7f12188e, float:1.9419478E38)
            r1 = 21
            goto L_0x021d
        L_0x0276:
            java.lang.String r0 = "waSharedPreferences"
            goto L_0x028e
        L_0x0279:
            X.AnonymousClass3MW.A1I()
            throw r13
        L_0x027d:
            java.lang.String r0 = "emojiLoader"
            goto L_0x028e
        L_0x0280:
            java.lang.String r0 = "waContactNames"
            goto L_0x028e
        L_0x0283:
            java.lang.String r0 = "contactManager"
            goto L_0x028e
        L_0x0286:
            java.lang.String r0 = "chatsCache"
            goto L_0x028e
        L_0x0289:
            java.lang.String r0 = "pastParticipantUserStore"
            goto L_0x028e
        L_0x028c:
            java.lang.String r0 = "chatSettingsStore"
        L_0x028e:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.ExitGroupsDialogFragment.A27(android.os.Bundle):android.app.Dialog");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r8 == null) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String A00(X.AnonymousClass1BI r8, X.AnonymousClass1EC r9, int r10, int r11) {
        /*
            r7 = this;
            boolean r0 = r7.A01(r8)
            if (r0 == 0) goto L_0x000e
            r0 = 2131888616(0x7f1209e8, float:1.9411872E38)
            java.lang.String r0 = X.AnonymousClass3MY.A0n(r7, r0)
        L_0x000d:
            return r0
        L_0x000e:
            if (r9 == 0) goto L_0x0039
            r0 = 1
            if (r8 != 0) goto L_0x003a
        L_0x0013:
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r7)
            r0 = 2131755033(0x7f100019, float:1.9140934E38)
            java.lang.String r0 = X.C72473Md.A0k(r1, r11, r0)
            if (r10 <= 0) goto L_0x000d
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r0)
            r0 = 10
            r2.append(r0)
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r7)
            r0 = 2131755474(0x7f1001d2, float:1.9141828E38)
            java.lang.String r0 = X.C72473Md.A0k(r1, r10, r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            return r0
        L_0x0039:
            r0 = 0
        L_0x003a:
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0052
            X.1CJ r0 = r7.A07
            if (r0 == 0) goto L_0x007b
            boolean r0 = r0.A0R(r8)
            if (r0 != 0) goto L_0x0052
            if (r10 != 0) goto L_0x006f
            r0 = 2131890193(0x7f121011, float:1.941507E38)
            java.lang.String r0 = r7.A1H(r0)
            return r0
        L_0x0052:
            if (r8 == 0) goto L_0x0013
            X.1M9 r0 = r7.A02
            if (r0 == 0) goto L_0x0098
            X.1E7 r4 = r0.A0H(r8)
            if (r10 != 0) goto L_0x007e
            r2 = 2131890200(0x7f121018, float:1.9415085E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.1Me r0 = r7.A03
            if (r0 == 0) goto L_0x009b
            X.AnonymousClass3MX.A1N(r0, r4, r1, r5)
            java.lang.String r0 = r7.A1I(r2, r1)
            return r0
        L_0x006f:
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r7)
            r0 = 2131755138(0x7f100082, float:1.9141147E38)
            java.lang.String r0 = X.C72473Md.A0k(r1, r10, r0)
            return r0
        L_0x007b:
            java.lang.String r0 = "chatsCache"
            goto L_0x009d
        L_0x007e:
            android.content.res.Resources r3 = X.AnonymousClass3MZ.A09(r7)
            r2 = 2131755139(0x7f100083, float:1.9141149E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            X.1Me r0 = r7.A03
            if (r0 == 0) goto L_0x009b
            X.AnonymousClass3MX.A1N(r0, r4, r1, r5)
            X.C17880vN.A1T(r1, r10, r6)
            java.lang.String r0 = r3.getQuantityString(r2, r10, r1)
            return r0
        L_0x0098:
            java.lang.String r0 = "contactManager"
            goto L_0x009d
        L_0x009b:
            java.lang.String r0 = "waContactNames"
        L_0x009d:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.ExitGroupsDialogFragment.A00(X.1BI, X.1EC, int, int):java.lang.String");
    }
}
