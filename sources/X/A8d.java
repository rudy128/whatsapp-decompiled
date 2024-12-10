package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class A8d {
    public static final A8d A00 = new Object();

    public static final int A00(C29621ca r4) {
        try {
            C29621ca A0K = r4.A0K("ephemeral");
            if (A0K != null) {
                return A0K.A0A("expiration", 0);
            }
        } catch (Exception e) {
            Log.e(C17900vP.A0C("GroupProtocolTreeNodeHelper/getEphemeralDuration ", AnonymousClass000.A10(), e), e);
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        if (r3 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        if (r5 != null) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C42661yX A04(X.C29621ca r7, X.C29621ca r8) {
        /*
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.String r0 = "description"
            X.1ca r4 = r7.A0K(r0)
            if (r4 == 0) goto L_0x004b
            java.lang.String r0 = "body"
            X.1ca r3 = r4.A0K(r0)
            java.lang.String r0 = "delete"
            X.1ca r2 = r4.A0K(r0)
            if (r3 == 0) goto L_0x003b
            if (r2 == 0) goto L_0x003b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Node: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " contains both a body and delete child: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x003b:
            X.1MD[] r0 = r4.A0S()
            if (r0 == 0) goto L_0x0049
            int r0 = r0.length
            if (r0 == 0) goto L_0x0049
            if (r3 != 0) goto L_0x0051
            java.lang.String r5 = ""
            goto L_0x005d
        L_0x0049:
            if (r3 != 0) goto L_0x0051
        L_0x004b:
            X.1yX r0 = X.C42661yX.A05
            X.C18070vi.A0Z(r0)
            return r0
        L_0x0051:
            java.lang.String r0 = r3.A0M()
            if (r0 == 0) goto L_0x0096
            java.lang.String r5 = r3.A0M()
            if (r5 == 0) goto L_0x0094
        L_0x005d:
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = "id"
            java.lang.String r4 = X.C29621ca.A02(r4, r0)
        L_0x0069:
            X.C17960vV.A07(r8)
            java.lang.String r2 = "t"
            r0 = 0
            long r6 = r8.A0D(r2, r0)
            X.C17960vV.A07(r8)
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r3 = r8.A0F(r1, r0)
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.C17960vV.A07(r8)
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r1 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "participant_pn"
            com.whatsapp.jid.Jid r2 = r8.A0F(r1, r0)
            com.whatsapp.jid.PhoneUserJid r2 = (com.whatsapp.jid.PhoneUserJid) r2
            X.1yX r1 = new X.1yX
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L_0x0094:
            r4 = 0
            goto L_0x0069
        L_0x0096:
            java.lang.String r0 = "Non-empty description tag with no body"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8d.A04(X.1ca, X.1ca):X.1yX");
    }

    public static final LinkedHashMap A05(C29621ca r10, C22821Di r11) {
        C18070vi.A0d(r10, 0);
        LinkedHashMap A13 = C17880vN.A13();
        Iterator A0r = AnonymousClass8BW.A0r(r10, "participant");
        while (A0r.hasNext()) {
            C29621ca A0a = C17880vN.A0a(A0r);
            Class<UserJid> cls = UserJid.class;
            UserJid userJid = (UserJid) A0a.A0F(cls, "jid");
            if (userJid != null) {
                String str = null;
                UserJid userJid2 = null;
                UserJid userJid3 = null;
                String A0u = AnonymousClass8BT.A0u(A0a, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "");
                C18070vi.A0X(A0u);
                UserJid userJid4 = (UserJid) A0a.A0F(cls, "lid");
                if (userJid4 != null) {
                    userJid2 = userJid4;
                }
                String A0Q = A0a.A0Q("display_name", (String) null);
                if (A0Q != null && !AnonymousClass1EG.A0H(A0Q)) {
                    str = A0Q;
                }
                UserJid userJid5 = (UserJid) A0a.A0F(cls, "phone_number");
                if (userJid5 != null) {
                    if (C22971Dz.A0Y(userJid)) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("phone number attribute with pn jid. Mismatch: ");
                        r11.invoke(new C193059pT(AnonymousClass3MY.A0r(A10, !userJid.equals(userJid5))));
                    }
                    userJid3 = userJid5;
                }
                A13.put(userJid, C61202pI.A00(userJid, userJid2, userJid3, str, A0u));
            }
        }
        return A13;
    }

    public static final boolean A06(C29621ca r4) {
        C29621ca A0K;
        C29621ca A0K2 = r4.A0K("membership_approval_mode");
        if (A0K2 == null || (A0K = A0K2.A0K("group_join")) == null) {
            return false;
        }
        return "on".equals(A0K.A0Q("state", ""));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r5.A0K("parent");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A07(X.C29621ca r5) {
        /*
            r4 = this;
            r3 = 0
            int r0 = A02(r5)
            r2 = 1
            if (r0 != r2) goto L_0x001f
            java.lang.String r0 = "parent"
            X.1ca r1 = r5.A0K(r0)
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = "default_membership_approval_mode"
            java.lang.String r1 = X.C29621ca.A02(r1, r0)
            java.lang.String r0 = "request_required"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8d.A07(X.1ca):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0090, code lost:
        if (r5.equals("false") == false) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C19983A1t A08(X.C29621ca r44, X.C22821Di r45, X.C22821Di r46, int r47) {
        /*
            r43 = this;
            r1 = 1
            r0 = r44
            X.C18070vi.A0d(r0, r1)
            java.lang.String r2 = "id"
            r1 = 0
            java.lang.String r2 = X.AnonymousClass8BT.A0u(r0, r2, r1)
            X.1EC r6 = X.C22971Dz.A02(r2)
            X.C18070vi.A0X(r6)
            java.lang.String r2 = "truncated"
            java.lang.String r2 = r0.A0Q(r2, r1)
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = "size"
            java.lang.String r1 = r0.A0Q(r2, r1)
            r0 = 0
            int r0 = X.C20099A7c.A01(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.A1t r0 = new X.A1t
            r0.<init>(r6, r1)
        L_0x0034:
            r1 = r45
            r1.invoke(r0)
            return r0
        L_0x003a:
            java.lang.Class<com.whatsapp.jid.UserJid> r7 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "creator"
            com.whatsapp.jid.Jid r12 = r0.A0F(r7, r2)
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r5 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r2 = "creator_pn"
            com.whatsapp.jid.Jid r10 = r0.A0F(r5, r2)
            com.whatsapp.jid.PhoneUserJid r10 = (com.whatsapp.jid.PhoneUserJid) r10
            java.lang.String r2 = "creation"
            java.lang.String r4 = r0.A0Q(r2, r1)
            r2 = 0
            long r24 = X.C20099A7c.A04(r4, r2)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 * r8
            java.lang.String r4 = "subject"
            java.lang.String r16 = r0.A0Q(r4, r1)
            java.lang.String r4 = "s_o"
            com.whatsapp.jid.Jid r13 = r0.A0F(r7, r4)
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13
            java.lang.String r4 = "s_o_pn"
            com.whatsapp.jid.Jid r11 = r0.A0F(r5, r4)
            com.whatsapp.jid.PhoneUserJid r11 = (com.whatsapp.jid.PhoneUserJid) r11
            java.lang.String r4 = "s_t"
            java.lang.String r4 = r0.A0Q(r4, r1)
            long r26 = X.C20099A7c.A04(r4, r2)
            long r26 = r26 * r8
            java.lang.String r4 = "ack"
            java.lang.String r5 = r0.A0Q(r4, r1)
            if (r5 == 0) goto L_0x0092
            java.lang.String r4 = "false"
            boolean r4 = r5.equals(r4)
            r37 = 0
            if (r4 != 0) goto L_0x0094
        L_0x0092:
            r37 = 1
        L_0x0094:
            java.lang.String r4 = "locked"
            boolean r31 = X.AnonymousClass8BX.A1S(r0, r4)
            java.lang.String r4 = "announcement"
            boolean r32 = X.AnonymousClass8BX.A1S(r0, r4)
            java.lang.String r4 = "incognito"
            boolean r35 = X.AnonymousClass8BX.A1S(r0, r4)
            java.lang.String r4 = "no_frequently_forwarded"
            boolean r33 = X.AnonymousClass8BX.A1S(r0, r4)
            java.lang.String r4 = "suspended"
            boolean r34 = X.AnonymousClass8BX.A1S(r0, r4)
            java.lang.String r4 = "support"
            boolean r30 = X.AnonymousClass8BX.A1S(r0, r4)
            java.lang.String r4 = "a_v_id"
            long r28 = r0.A0D(r4, r2)
            java.lang.String r2 = "addressing_mode"
            r3 = 0
            java.lang.String r5 = r0.A0Q(r2, r1)
            java.lang.String r2 = "allow_admin_reports"
            boolean r38 = X.AnonymousClass8BX.A1S(r0, r2)
            java.lang.String r2 = "allow_non_admin_sub_group_creation"
            boolean r39 = X.AnonymousClass8BX.A1S(r0, r2)
            r2 = r47 & 1
            if (r2 == 0) goto L_0x00e3
            r1 = r46
            java.util.LinkedHashMap r1 = A05(r0, r1)
            int r2 = X.C20099A7c.A00(r0, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
        L_0x00e3:
            X.1yX r14 = X.C42661yX.A05
            r2 = r47 & 2
            if (r2 == 0) goto L_0x00ed
            X.1yX r14 = X.AnonymousClass8BW.A0P(r0)
        L_0x00ed:
            int r19 = A00(r0)
            r4 = r43
            X.1cn r15 = r4.A09(r0)
            java.lang.String r2 = "group_history"
            boolean r40 = X.AnonymousClass8BX.A1S(r0, r2)
            java.lang.String r2 = "auto_add_disabled"
            boolean r41 = X.AnonymousClass8BX.A1S(r0, r2)
            java.lang.String r2 = "hidden_group"
            boolean r42 = X.AnonymousClass8BX.A1S(r0, r2)
            java.lang.String r2 = "capi"
            boolean r23 = X.AnonymousClass8BX.A1S(r0, r2)
            X.C18070vi.A0b(r14)
            X.2sm r8 = X.AnonymousClass8BV.A0E()
            int r20 = A02(r0)
            X.1EC r9 = A03(r0)
            boolean r36 = A06(r0)
            int r21 = r4.A07(r0)
            java.lang.String r17 = X.C42671yY.A00(r5)
            int r22 = A01(r0)
            X.A2S r7 = new X.A2S
            r18 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            X.A1t r0 = new X.A1t
            r0.<init>(r7, r6, r3)
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8d.A08(X.1ca, X.1Di, X.1Di, int):X.A1t");
    }

    public final C29741cn A09(C29621ca r8) {
        if (A02(r8) == 1) {
            return null;
        }
        C29621ca A0K = r8.A0K("growth_locked");
        if (A0K == null) {
            return new C29741cn(0, 0);
        }
        String A0Q = A0K.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "");
        if ("invite".equals(A0Q)) {
            return new C29741cn(1, A0K.A0C("expiration"));
        }
        C17900vP.A0f("GroupProtocolTreeNodeHelper/getGrowthLock unexpected type: ", A0Q, AnonymousClass000.A10());
        return null;
    }

    public static final int A01(C29621ca r1) {
        C29621ca A0K = r1.A0K("member_add_mode");
        if (A0K != null) {
            return "all_member_add".equals(A0K.A0M()) ? 1 : 0;
        }
        return 0;
    }

    public static final int A02(C29621ca r5) {
        boolean A1W = AnonymousClass000.A1W(r5.A0K("default_sub_group"));
        boolean A1S = AnonymousClass8BX.A1S(r5, "linked_parent");
        boolean A1S2 = AnonymousClass8BX.A1S(r5, "parent");
        boolean A1W2 = AnonymousClass000.A1W(r5.A0K("general_chat"));
        if (A1S2) {
            return 1;
        }
        if (A1W) {
            return 3;
        }
        if (A1W2) {
            return 6;
        }
        if (A1S) {
            return 2;
        }
        return 0;
    }

    public static final AnonymousClass1EC A03(C29621ca r2) {
        C29621ca A0K = r2.A0K("linked_parent");
        if (A0K == null) {
            return null;
        }
        return (AnonymousClass1EC) A0K.A0F(AnonymousClass1EC.class, "jid");
    }
}
