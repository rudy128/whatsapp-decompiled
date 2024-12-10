package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.Acg  reason: case insensitive filesystem */
public final class C20988Acg implements AnonymousClass1O5 {
    public final AnonymousClass11S A00;
    public final C25111Mx A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1PS A03;
    public final C18030ve A04;
    public final BC1 A05;
    public final C188679ho A06;
    public final AnonymousClass1OZ A07;
    public final String A08;
    public final AnonymousClass190 A09;
    public final AnonymousClass126 A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x022a, code lost:
        if (r9.isEmpty() != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
        if (r4.A09 == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r10, 5385) == false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r25 = this;
            r2 = r25
            X.1OZ r0 = r2.A07
            r24 = r0
            java.lang.String r21 = r24.A0B()
            X.9ho r4 = r2.A06
            java.lang.String r0 = r4.A04
            r23 = r0
            java.util.List r9 = r4.A05
            int r0 = r4.A00
            r22 = r0
            boolean r11 = r4.A0A
            com.whatsapp.jid.GroupJid r8 = r4.A01
            java.lang.String r12 = r4.A03
            X.0ve r10 = r2.A04
            X.0vf r1 = X.C18040vf.A01
            r0 = 3864(0xf18, float:5.415E-42)
            boolean r0 = X.C18020vd.A05(r1, r10, r0)
            if (r0 == 0) goto L_0x002e
            boolean r0 = r4.A09
            r20 = 1
            if (r0 != 0) goto L_0x0030
        L_0x002e:
            r20 = 0
        L_0x0030:
            boolean r19 = X.AnonymousClass000.A1R(r22)
            boolean r18 = X.AnonymousClass000.A1W(r8)
            boolean r17 = X.AnonymousClass8BR.A1S(r12)
            if (r11 == 0) goto L_0x004a
            r1 = 5385(0x1509, float:7.546E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r10, r1)
            r16 = 1
            if (r0 != 0) goto L_0x004c
        L_0x004a:
            r16 = 0
        L_0x004c:
            if (r9 == 0) goto L_0x00a4
            r1 = 11261(0x2bfd, float:1.578E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r10, r1)
            if (r0 == 0) goto L_0x00a4
            X.1Mx r0 = r2.A01
            java.util.LinkedHashMap r14 = r0.A09(r9)
        L_0x005e:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.lang.String r7 = "jid"
            if (r9 == 0) goto L_0x00a6
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x00a6
            r13 = 0
        L_0x006d:
            int r0 = r9.size()
            if (r13 >= r0) goto L_0x00a6
            java.lang.Object r15 = r9.get(r13)
            com.whatsapp.jid.Jid r15 = (com.whatsapp.jid.Jid) r15
            if (r14 == 0) goto L_0x00a2
            boolean r0 = r14.containsKey(r15)
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r5 = r14.get(r15)
            byte[] r5 = (byte[]) r5
            java.lang.String r1 = "privacy"
            r0 = 0
            X.1ca r6 = new X.1ca
            r6.<init>((java.lang.String) r1, (byte[]) r5, (X.AnonymousClass1MD[]) r0)
        L_0x008f:
            r0 = 1
            X.1MD[] r5 = new X.AnonymousClass1MD[r0]
            X.1MD r1 = new X.1MD
            r1.<init>((com.whatsapp.jid.Jid) r15, (java.lang.String) r7)
            r0 = 0
            r5[r0] = r1
            java.lang.String r0 = "participant"
            X.AnonymousClass8BT.A1J(r6, r0, r3, r5)
            int r13 = r13 + 1
            goto L_0x006d
        L_0x00a2:
            r6 = 0
            goto L_0x008f
        L_0x00a4:
            r14 = 0
            goto L_0x005e
        L_0x00a6:
            if (r19 == 0) goto L_0x00d9
            r1 = 7141(0x1be5, float:1.0007E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r10, r1)
            java.lang.String r6 = "expiration"
            if (r0 == 0) goto L_0x0231
            X.1PS r0 = r2.A03
            int r5 = r0.A00()
            r1 = 2
            r13 = 1
            r0 = r22
            if (r0 != r5) goto L_0x00c1
            r13 = 2
        L_0x00c1:
            X.1MD[] r5 = new X.AnonymousClass1MD[r1]
            java.lang.String r0 = java.lang.String.valueOf(r22)
            X.AnonymousClass8BV.A1M(r6, r0, r5)
            java.lang.String r0 = "trigger"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r0, (int) r13)
            r0 = 1
            r5[r0] = r1
        L_0x00d4:
            java.lang.String r0 = "ephemeral"
            X.C29621ca.A05(r0, r3, r5)
        L_0x00d9:
            r6 = 1
            if (r18 == 0) goto L_0x00eb
            X.1MD[] r5 = new X.AnonymousClass1MD[r6]
            X.1MD r1 = new X.1MD
            r1.<init>((com.whatsapp.jid.Jid) r8, (java.lang.String) r7)
            r0 = 0
            r5[r0] = r1
            java.lang.String r0 = "linked_parent"
            X.C29621ca.A05(r0, r3, r5)
        L_0x00eb:
            if (r11 == 0) goto L_0x011c
            X.1MD[] r5 = new X.AnonymousClass1MD[r6]
            java.lang.String r1 = "default_membership_approval_mode"
            java.lang.String r0 = "request_required"
            X.AnonymousClass8BV.A1M(r1, r0, r5)
            java.lang.String r0 = "parent"
            X.C29621ca.A05(r0, r3, r5)
            r0 = 3829(0xef5, float:5.366E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r10, r0)
            if (r0 == 0) goto L_0x022e
            r0 = 4530(0x11b2, float:6.348E-42)
            boolean r0 = X.C18020vd.A05(r1, r10, r0)
            if (r0 == 0) goto L_0x022e
            java.lang.String r0 = "allow_non_admin_sub_group_creation"
            r1 = 0
            X.C29621ca.A05(r0, r3, r1)
        L_0x0113:
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = "create_general_chat"
            X.C29621ca.A05(r0, r3, r1)
        L_0x011c:
            java.lang.String r8 = "membership_approval_mode"
            java.lang.String r7 = "off"
            java.lang.String r6 = "state"
            java.lang.String r5 = "group_join"
            if (r20 == 0) goto L_0x0139
            java.lang.String r0 = "breakout"
            r1 = 0
            X.C29621ca.A05(r0, r3, r1)
            r0 = 1
            X.1MD[] r0 = new X.AnonymousClass1MD[r0]
            X.AnonymousClass8BV.A1M(r6, r7, r0)
            X.1ca r0 = X.AnonymousClass8BR.A0k(r5, r0)
            X.AnonymousClass8BT.A1J(r0, r8, r3, r1)
        L_0x0139:
            if (r17 == 0) goto L_0x0159
            X.11P r1 = r2.A02
            X.11S r0 = r2.A00
            r13 = 0
            java.lang.String r1 = X.AnonymousClass1PP.A00(r0, r1, r13)
            r0 = 1
            X.1MD[] r14 = new X.AnonymousClass1MD[r0]
            java.lang.String r0 = "id"
            X.C17880vN.A1Q(r0, r1, r14, r13)
            java.lang.String r13 = "body"
            r0 = 0
            X.1ca r1 = new X.1ca
            r1.<init>((java.lang.String) r13, (java.lang.String) r12, (X.AnonymousClass1MD[]) r0)
            java.lang.String r0 = "description"
            X.AnonymousClass8BT.A1J(r1, r0, r3, r14)
        L_0x0159:
            java.lang.String r12 = "all_member_add"
            java.lang.String r1 = "member_add_mode"
            if (r11 != 0) goto L_0x021d
            if (r20 != 0) goto L_0x021d
            if (r18 == 0) goto L_0x016d
            r13 = 7180(0x1c0c, float:1.0061E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r10, r13)
            if (r0 == 0) goto L_0x021d
        L_0x016d:
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0173
            java.lang.String r12 = "admin_add"
        L_0x0173:
            r10 = 0
            X.AnonymousClass8BU.A1J(r1, r12, r3)
            r0 = 1
            X.1MD[] r1 = new X.AnonymousClass1MD[r0]
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x0180
            java.lang.String r7 = "on"
        L_0x0180:
            X.AnonymousClass8BV.A1M(r6, r7, r1)
            X.1ca r0 = X.AnonymousClass8BR.A0k(r5, r1)
            X.AnonymousClass8BT.A1J(r0, r8, r3, r10)
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0193
            java.lang.String r0 = "announcement"
            X.C29621ca.A05(r0, r3, r10)
        L_0x0193:
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x019c
            java.lang.String r0 = "locked"
            X.C29621ca.A05(r0, r3, r10)
        L_0x019c:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x01a5
            java.lang.String r0 = "hidden_group"
            X.C29621ca.A05(r0, r3, r10)
        L_0x01a5:
            r1 = 1
        L_0x01a6:
            java.lang.String r0 = "CreateGroupApiHandler/getNodeChildren request cannot have both <parent/> and <participant/> tags."
            X.C17960vV.A0F(r1, r0)
            int r0 = r3.size()
            if (r0 == 0) goto L_0x01b6
            r0 = 0
            X.1ca[] r10 = X.C17890vO.A1Y(r3, r0)
        L_0x01b6:
            java.lang.String r9 = r2.A08
            boolean r8 = android.text.TextUtils.isEmpty(r9)
            boolean r1 = android.text.TextUtils.isEmpty(r23)
            r7 = r1 ^ 1
            r0 = r8 ^ 1
            int r7 = r7 + r0
            X.1MD[] r4 = new X.AnonymousClass1MD[r7]
            java.lang.String r3 = "key"
            r6 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0210
            if (r8 != 0) goto L_0x01d2
            X.C17880vN.A1Q(r3, r9, r4, r6)
        L_0x01d2:
            r1 = 0
            java.lang.String r0 = "create"
            if (r10 != 0) goto L_0x0208
            if (r7 > 0) goto L_0x01da
            r4 = r1
        L_0x01da:
            X.1ca r4 = X.AnonymousClass8BR.A0k(r0, r4)
        L_0x01de:
            r0 = 4
            X.1MD[] r3 = new X.AnonymousClass1MD[r0]
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:g2"
            X.C17880vN.A1Q(r1, r0, r3, r6)
            java.lang.String r1 = "id"
            r0 = r21
            X.C17880vN.A1Q(r1, r0, r3, r5)
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
            X.C17890vO.A12(r1, r0, r3)
            X.8v3 r0 = X.C173428v3.A00
            X.1ca r3 = X.C29621ca.A00(r0, r4, r3)
            r5 = 14
            r6 = 20000(0x4e20, double:9.8813E-320)
            r1 = r24
            r4 = r21
            r1.A0N(r2, r3, r4, r5, r6)
            return
        L_0x0208:
            if (r7 > 0) goto L_0x020b
            r4 = r1
        L_0x020b:
            X.1ca r4 = X.AnonymousClass8BR.A0l(r0, r4, r10)
            goto L_0x01de
        L_0x0210:
            java.lang.String r1 = "subject"
            r0 = r23
            X.C17880vN.A1Q(r1, r0, r4, r6)
            if (r8 != 0) goto L_0x01d2
            X.C17880vN.A1Q(r3, r9, r4, r5)
            goto L_0x01d2
        L_0x021d:
            r10 = 0
            if (r16 == 0) goto L_0x0223
            X.AnonymousClass8BU.A1J(r1, r12, r3)
        L_0x0223:
            if (r11 == 0) goto L_0x01a5
            boolean r0 = r9.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x01a6
            goto L_0x01a5
        L_0x022e:
            r1 = 0
            goto L_0x0113
        L_0x0231:
            r0 = 1
            r1 = 0
            X.1MD[] r5 = new X.AnonymousClass1MD[r0]
            java.lang.String r0 = java.lang.String.valueOf(r22)
            X.C17880vN.A1Q(r6, r0, r5, r1)
            goto L_0x00d4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20988Acg.A00():void");
    }

    public void BrD(String str) {
        this.A05.C8g();
    }

    public C20988Acg(AnonymousClass190 r2, AnonymousClass11S r3, C25111Mx r4, AnonymousClass11P r5, AnonymousClass1PS r6, C18030ve r7, AnonymousClass126 r8, BC1 bc1, C188679ho r10, AnonymousClass1OZ r11) {
        this.A02 = r5;
        this.A04 = r7;
        this.A09 = r2;
        this.A00 = r3;
        this.A07 = r11;
        this.A0A = r8;
        this.A01 = r4;
        this.A05 = bc1;
        this.A03 = r6;
        this.A08 = r10.A02.getRawString();
        this.A06 = r10;
    }

    public void Bt9(C29621ca r4, String str) {
        Pair A012 = C60482o6.A01(r4);
        if (A012 != null) {
            int A013 = C108965cb.A01(A012);
            String str2 = (String) A012.second;
            if (A013 == 500 && str2 != null && str2.equals("internal-server-error")) {
                A013 = -500;
            }
            this.A05.onError(A013);
        }
    }

    public void C7Z(C29621ca r9, String str) {
        C29621ca A0I = r9.A0I();
        C29621ca.A04(A0I, "group");
        try {
            AnonymousClass1EC A022 = C22971Dz.A02(AnonymousClass8BT.A0u(A0I, PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null));
            Class<UserJid> cls = UserJid.class;
            A0I.A0F(cls, "creator");
            C20099A7c.A04(A0I.A0Q("creation", (String) null), 0);
            A0I.A0Q("subject", (String) null);
            C20099A7c.A04(A0I.A0Q("s_t", (String) null), 0);
            A0I.A0F(cls, "s_o");
            AnonymousClass4OX r3 = new AnonymousClass4OX(A022);
            C20060A5j.A00(r3, r9, "group");
            AnonymousClass126 r2 = this.A0A;
            Log.i("groupmgr/onGroupCreated/");
            r3.A04.keySet();
            Map map = r3.A02;
            if (!map.isEmpty()) {
                r2.A0O(3001, map);
            }
            this.A05.C7e(r3, A022);
        } catch (AnonymousClass11T unused) {
            this.A05.onError(800);
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
