package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8GZ  reason: invalid class name */
public class AnonymousClass8GZ extends AnonymousClass1J2 implements C108655c5 {
    public int A00 = 0;
    public int A01 = 0;
    public AnonymousClass1E7 A02;
    public AnonymousClass1EC A03;
    public AnonymousClass1EC A04;
    public boolean A05 = false;
    public final AnonymousClass1DT A06 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A07 = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A08 = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A09 = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A0A = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A0B = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A0C = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A0D = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A0E = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A0F = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A0G = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A0H = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A0I = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A0J = AnonymousClass3MW.A0M(false);
    public final AnonymousClass11S A0K;
    public final AnonymousClass1M9 A0L;
    public final C24921Me A0M;
    public final AnonymousClass1CJ A0N;
    public final AnonymousClass1NN A0O;
    public final C195899u7 A0P;
    public final AnonymousClass1MZ A0Q;
    public final C18030ve A0R;
    public final AnonymousClass3TB A0S;
    public final AnonymousClass126 A0T;
    public final AnonymousClass12M A0U;
    public final C20991Acj A0V;
    public final C58322kV A0W;
    public final C22393B5w A0X;
    public final RtaXmppClient A0Y;
    public final AnonymousClass1PU A0Z;
    public final C41731wy A0a = new C41731wy(false);
    public final C41731wy A0b = new C41731wy(false);
    public final AnonymousClass10I A0c;
    public final C56552he A0d;
    public final AnonymousClass1KB A0e;
    public final C34511kb A0f;
    public final AnonymousClass11E A0g;
    public final AnonymousClass11P A0h;
    public final AnonymousClass18K A0i;
    public final AnonymousClass9XX A0j;
    public final AnonymousClass3L6 A0k;
    public final C27141Uw A0l;
    public final AnonymousClass1OZ A0m;
    public final C41731wy A0n = AnonymousClass3MW.A0o();

    public void CRL(int i, boolean z) {
        String str;
        StringBuilder sb;
        String str2;
        boolean z2;
        String str3;
        String str4;
        AnonymousClass1DS r0;
        String str5;
        String str6;
        String str7;
        int i2 = i;
        boolean z3 = z;
        if (i2 == 1) {
            z2 = !z;
            AnonymousClass1E7 r1 = this.A02;
            if (r1 == null || r1.A13 == z2) {
                str = "EditGroupInfoDialogFragment/onPositiveButtonClick: skip request, values are equal";
                Log.i(str);
            }
            this.A05 = true;
            AnonymousClass12M r8 = this.A0U;
            AnonymousClass1EC r4 = this.A03;
            C75033dN r12 = new C75033dN(this.A0O, this.A0T, r4, (String) null, (List) null, 159);
            if (z2) {
                str3 = "locked";
            } else {
                str3 = "unlocked";
            }
            AnonymousClass12M.A03(r8, r4, r12, r12, str3, (AnonymousClass1MD[]) null, 159);
            sb = AnonymousClass000.A10();
            str2 = "GroupXmppMethods/set-restrict-mode; restrictModeEnabled=";
        } else if (i2 != 2) {
            if (i2 != 3) {
                AnonymousClass1E7 r02 = this.A02;
                if (i2 != 4) {
                    if (r02 != null && r02.A0r != z3) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("GroupPermissionsActivity report to admin toggled ");
                        if (z) {
                            str7 = "On";
                        } else {
                            str7 = "Off";
                        }
                        C17890vO.A1A(A10, str7);
                        this.A05 = true;
                        if (z) {
                            AnonymousClass3MY.A1M(this.A0F, true);
                            this.A0Y.A03(this.A03, this.A0X, true);
                            return;
                        }
                        r0 = this.A0b;
                    } else {
                        return;
                    }
                } else if (r02 != null && C62822s3.A02(r02) != z3) {
                    this.A05 = true;
                    C20966AcK acK = new C20966AcK(this.A0m);
                    AnonymousClass1EC r7 = this.A03;
                    if (z) {
                        str6 = "all_member_add";
                    } else {
                        str6 = "admin_add";
                    }
                    C189419jD r03 = new C189419jD(this);
                    C18070vi.A0d(r7, 0);
                    acK.A00 = r03;
                    AnonymousClass1OZ r10 = acK.A01;
                    String A0B2 = r10.A0B();
                    C29621ca r5 = new C29621ca("member_add_mode", str6, (AnonymousClass1MD[]) null);
                    AnonymousClass1MD[] r42 = new AnonymousClass1MD[4];
                    C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2, r42, 0);
                    C17880vN.A1Q("xmlns", "w:g2", r42, 1);
                    C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r42, 2);
                    r10.A0I(acK, C29621ca.A00(r7, r5, r42), A0B2, 336, 0);
                    C170788qf r13 = new C170788qf();
                    r13.A00 = Boolean.valueOf(z3);
                    this.A0i.CC7(r13);
                    return;
                } else {
                    return;
                }
            } else {
                AnonymousClass1E7 r04 = this.A02;
                if (r04 != null && r04.A12 != z3) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("GroupPermissionsActivity require membership approval toggled ");
                    if (z) {
                        str5 = "On";
                    } else {
                        str5 = "Off";
                    }
                    C17890vO.A1A(A102, str5);
                    this.A05 = true;
                    if (z) {
                        this.A0V.A01(this.A03, true);
                        r0 = this.A0D;
                    } else {
                        r0 = this.A0a;
                    }
                } else {
                    return;
                }
            }
            AnonymousClass3MY.A1M(r0, true);
            return;
        } else {
            z2 = !z;
            AnonymousClass1E7 r14 = this.A02;
            if (r14 == null || r14.A0f == z2) {
                str = "SendMessagesDialogFragment/onPositiveButtonClick: skip request, values are equal";
                Log.i(str);
            }
            this.A05 = true;
            AnonymousClass12M r82 = this.A0U;
            AnonymousClass1EC r43 = this.A03;
            C75033dN r15 = new C75033dN(this.A0O, this.A0T, r43, (String) null, (List) null, 161);
            if (z2) {
                str4 = "announcement";
            } else {
                str4 = "not_announcement";
            }
            AnonymousClass12M.A03(r82, r43, r15, r15, str4, (AnonymousClass1MD[]) null, 161);
            sb = AnonymousClass000.A10();
            str2 = "GroupXmppMethods/set-announcements-only; announcementsEnabled=";
        }
        str = C17900vP.A0D(str2, sb, z2);
        Log.i(str);
    }

    public void A0S() {
        this.A0l.A01(this.A0k);
    }

    public void BJp(AnonymousClass1FU r19, List list) {
        int A022;
        AnonymousClass126 r1;
        int i;
        Object obj;
        int i2;
        AnonymousClass1MZ r6 = this.A0Q;
        AnonymousClass1EC r15 = this.A03;
        AnonymousClass1MW r7 = r6.A08;
        C199410f A082 = r7.A0C(r15).A08();
        HashSet A12 = C17880vN.A12();
        AnonymousClass1IZ it = A082.iterator();
        while (it.hasNext()) {
            C63312sr r12 = (C63312sr) it.next();
            UserJid userJid = r12.A04;
            if (!(this.A0K.A0O(userJid) || (i2 = r12.A01) == 0 || i2 == 2)) {
                A12.add(userJid);
            }
        }
        List list2 = list;
        ArrayList A10 = C17880vN.A10(list2);
        A10.removeAll(A12);
        ArrayList A102 = C17880vN.A10(A12);
        A102.removeAll(list2);
        if (A10.size() != 0 || A102.size() != 0) {
            AnonymousClass1FU r8 = r19;
            if (!this.A0g.A09()) {
                int i3 = 2131892439;
                if (AnonymousClass11E.A02(r8)) {
                    i3 = 2131892440;
                }
                this.A0e.A08(i3, 0);
                return;
            }
            if (r6.A05.A06(r15) == 1) {
                A022 = C18020vd.A00(C18040vf.A02, r6.A0D, 1655);
            } else {
                A022 = r6.A02(r15) - 1;
            }
            if (A022 < (r7.A0C(r15).A0K().size() + A10.size()) - A102.size()) {
                if (this.A0Z.A03(r15)) {
                    r1 = this.A0T;
                    i = 3019;
                    obj = Integer.valueOf(A022);
                } else {
                    HashMap A11 = C17880vN.A11();
                    Iterator it2 = A10.iterator();
                    while (it2.hasNext()) {
                        C17890vO.A0z(it2.next(), A11, 419);
                    }
                    r1 = this.A0T;
                    i = 3003;
                    obj = A11;
                }
                r1.A0O(i, obj);
                return;
            }
            AnonymousClass3MW.A1T(new AnonymousClass9BN(r8, this.A0e, this.A0L, this.A0M, this.A0h, this.A0T, this.A0U, r15, A10, A102), this.A0c, 0);
        }
    }

    public void BpY() {
        int i;
        int i2 = this.A00;
        if (i2 <= 0 || i2 <= (i = this.A01)) {
            this.A0V.A01(this.A03, false);
            AnonymousClass3MY.A1M(this.A0D, false);
            return;
        }
        this.A0n.A0E(new C184509b4(i, i2));
    }

    public void Bpa() {
        this.A0V.A01(this.A03, false);
        AnonymousClass3MY.A1M(this.A0D, false);
    }

    public void C2q() {
        C72463Mc.A1B(this.A0D);
    }

    public void C2s() {
        C72463Mc.A1B(this.A0D);
    }

    public ArrayList BMd() {
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass1MZ r0 = this.A0Q;
        AnonymousClass1IZ it = r0.A08.A0C(this.A03).A08().iterator();
        while (it.hasNext()) {
            C63312sr r2 = (C63312sr) it.next();
            int i = r2.A01;
            if (!(i == 0 || i == 2)) {
                AnonymousClass11S r02 = this.A0K;
                UserJid userJid = r2.A04;
                if (!r02.A0O(userJid)) {
                    A13.add(userJid);
                }
            }
        }
        return A13;
    }

    public AnonymousClass1DS BMe() {
        return this.A06;
    }

    public AnonymousClass3TB BP4() {
        return this.A0S;
    }

    public AnonymousClass1DS BTF() {
        return this.A07;
    }

    public AnonymousClass1DT BTG() {
        return this.A08;
    }

    public AnonymousClass1DS BTH() {
        return this.A09;
    }

    public AnonymousClass1DS BTI() {
        return this.A0A;
    }

    public AnonymousClass1DS BTJ() {
        return this.A0B;
    }

    public AnonymousClass1DS BTK() {
        return this.A0C;
    }

    public AnonymousClass1DT BTL() {
        return this.A0D;
    }

    public AnonymousClass1DT BTM() {
        return this.A0E;
    }

    public AnonymousClass1DS BTP() {
        return this.A0G;
    }

    public AnonymousClass1DS BTQ() {
        return this.A0H;
    }

    public AnonymousClass1DT BTR() {
        return this.A0I;
    }

    public AnonymousClass1DS BTS() {
        return this.A0J;
    }

    public AnonymousClass1DS BYB() {
        return this.A0F;
    }

    public C41731wy BZE() {
        return this.A0a;
    }

    public AnonymousClass1DS BZF() {
        return this.A0b;
    }

    public C41731wy BZG() {
        return this.A0n;
    }

    public void C3I(boolean z) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupPermissionsActivity report to admin dialog result ");
        if (z) {
            str = "off";
        } else {
            str = "On";
        }
        C17890vO.A1A(A10, str);
        AnonymousClass3MY.A1M(this.A0F, !z);
        if (z) {
            this.A0Y.A03(this.A03, this.A0X, false);
        }
    }

    public AnonymousClass8GZ(AnonymousClass2X0 r14, C56552he r15, AnonymousClass1KB r16, AnonymousClass11S r17, C34511kb r18, AnonymousClass11E r19, AnonymousClass1M9 r20, C24921Me r21, AnonymousClass11P r22, AnonymousClass1CJ r23, AnonymousClass1NN r24, C195899u7 r25, AnonymousClass1MZ r26, C18030ve r27, AnonymousClass18K r28, AnonymousClass126 r29, C27141Uw r30, AnonymousClass12M r31, AnonymousClass1EC r32, AnonymousClass1EC r33, AnonymousClass1OZ r34, C58322kV r35, RtaXmppClient rtaXmppClient, AnonymousClass1PU r37, AnonymousClass10I r38) {
        AnonymousClass9XX r11 = new AnonymousClass9XX(this);
        this.A0j = r11;
        this.A0X = new C21047Add(this);
        this.A03 = r32;
        AnonymousClass1EC r3 = r33;
        this.A04 = r3;
        this.A0h = r22;
        this.A0R = r27;
        this.A0e = r16;
        this.A0K = r17;
        AnonymousClass10I r1 = r38;
        this.A0c = r1;
        this.A0N = r23;
        this.A0i = r28;
        this.A0m = r34;
        this.A0Z = r37;
        this.A0M = r21;
        AnonymousClass1M9 r4 = r20;
        this.A0L = r4;
        this.A0T = r29;
        this.A0U = r31;
        this.A0W = r35;
        C34511kb r5 = r18;
        this.A0f = r5;
        this.A0O = r24;
        this.A0Y = rtaXmppClient;
        C27141Uw r6 = r30;
        this.A0l = r6;
        this.A0Q = r26;
        this.A0g = r19;
        this.A0d = r15;
        this.A0P = r25;
        AnonymousClass10E r0 = r14.A00.A01;
        this.A0V = new C20991Acj(AnonymousClass10E.A6O(r0), AnonymousClass10E.A8r(r0), AnonymousClass3Ma.A0g(r0), r11, AnonymousClass8BU.A0K(r0));
        C96304nd r02 = new C96304nd(r5, this, r3, 1);
        this.A0k = r02;
        r6.A00(r02);
        this.A0S = new AnonymousClass3TB(r15, r5, r4, r1);
        AnonymousClass3MY.A1U(this.A0c, this, 12);
        this.A05 = false;
    }
}
