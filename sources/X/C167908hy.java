package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8hy  reason: invalid class name and case insensitive filesystem */
public class C167908hy extends C20997Acp {
    public final C187189fP A00;
    public final C190449kx A01;
    public final C19949A0g A02;
    public final AnonymousClass1OZ A03;
    public final C20004A2u A04;
    public final C26981Ug A05 = new C26981Ug();
    public final AnonymousClass10I A06;
    public final C182979Wl A07;
    public final C37131p1 A08;

    public void BrD(String str) {
        this.A04.A02("order_view_tag");
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GetOrderProtocol/delivery-error with iqId ");
        A10.append(str);
        C17890vO.A1B(A10, ">");
        this.A05.BrC(new AnonymousClass9L7(str));
    }

    public void Brd(UserJid userJid) {
        C197779xF.A00(C108945cZ.A0N(421, "Failed to generate direct connection info"), this.A05, (Object) null);
        C17900vP.A0Y(userJid, "GetOrderProtocol/onDirectConnectionError/jid= ", AnonymousClass000.A10());
    }

    public void Bre(UserJid userJid) {
        this.A06.CGN(new C21459AkQ(this, userJid, this.A03.A0B(), 34));
    }

    public void Bt9(C29621ca r5, String str) {
        this.A04.A02("order_view_tag");
        Pair A012 = C60482o6.A01(r5);
        if (A012 == null) {
            C197779xF.A00(C108945cZ.A0N(C17880vN.A0h(), "error code is null"), this.A05, (Object) null);
        } else if (!A02(this.A00.A02, C108965cb.A01(A012))) {
            C197779xF.A00(A012, this.A05, (Object) null);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GetOrderProtocol/response-error with iqId <");
            A10.append(str);
            C17900vP.A0Z(A012, "> and error ", A10);
        }
    }

    public void C7Z(C29621ca r36, String str) {
        C195679tj r19;
        long j;
        String str2;
        AEI aei;
        String A0M;
        String A0M2;
        String A0M3;
        String A0M4;
        A6S a6s;
        String A0M5;
        AE6 ae6;
        C29621ca A0K;
        String A0M6;
        String A0M7;
        this.A04.A02("order_view_tag");
        C37131p1 r9 = this.A08;
        C29621ca r1 = r36;
        C18070vi.A0d(r1, 0);
        C29621ca A0K2 = r1.A0K("order");
        C195169su r0 = null;
        if (A0K2 != null) {
            String A0Q = A0K2.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
            String A0Q2 = A0K2.A0Q("creation_ts", (String) null);
            List A0R = A0K2.A0R("product");
            C18070vi.A0X(A0R);
            AnonymousClass00H r13 = r9.A01;
            ArrayList A0t = C108965cb.A0t(r13.get());
            Iterator it = A0R.iterator();
            while (it.hasNext()) {
                C29621ca A0a = C17880vN.A0a(it);
                C29621ca A0K3 = A0a.A0K(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                C29621ca A0K4 = A0a.A0K(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                C29621ca A0K5 = A0a.A0K("price");
                C29621ca A0K6 = A0a.A0K("currency");
                C29621ca A0K7 = A0a.A0K("image");
                C29621ca A0K8 = A0a.A0K("quantity");
                C29621ca A0K9 = A0a.A0K("status");
                C29621ca A0K10 = A0a.A0K("variant_info");
                if (A0K3 == null) {
                    A0M2 = null;
                } else {
                    A0M2 = A0K3.A0M();
                }
                if (A0K4 == null) {
                    A0M3 = null;
                } else {
                    A0M3 = A0K4.A0M();
                }
                if (A0K8 == null) {
                    A0M4 = null;
                } else {
                    A0M4 = A0K8.A0M();
                }
                if (A0K6 == null || AnonymousClass1EG.A0H(A0K6.A0M())) {
                    a6s = null;
                } else {
                    a6s = new A6S(A0K6.A0M());
                }
                BigDecimal A0Z = AnonymousClass8BY.A0Z(a6s, A0K5);
                if (A0K9 == null) {
                    A0M5 = null;
                } else {
                    A0M5 = A0K9.A0M();
                }
                boolean A1O = AnonymousClass000.A1O("deleted".equalsIgnoreCase(A0M5) ? 1 : 0);
                C20246ADe aDe = null;
                if (A0K7 != null) {
                    C29621ca A0K11 = A0K7.A0K(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    C29621ca A0K12 = A0K7.A0K("url");
                    if (A0K11 == null) {
                        A0M6 = null;
                    } else {
                        A0M6 = A0K11.A0M();
                    }
                    if (A0K12 == null) {
                        A0M7 = null;
                    } else {
                        A0M7 = A0K12.A0M();
                    }
                    if (!(A0M6 == null || A0M7 == null)) {
                        aDe = new C20246ADe(A0M6, A0M7);
                    }
                }
                if (!(A0K10 == null || (A0K = A0K10.A0K("properties")) == null)) {
                    List A0R2 = A0K.A0R("property");
                    ArrayList A13 = AnonymousClass000.A13();
                    Iterator it2 = A0R2.iterator();
                    while (it2.hasNext()) {
                        C29621ca A0a2 = C17880vN.A0a(it2);
                        AnonymousClass8BT.A1Q(A0a2.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null), A0a2.A0Q("value", (String) null), A13);
                    }
                    if (!A13.isEmpty()) {
                        ae6 = new AE6((ADW) null, (C20257ADp) null, (List) null, A13);
                        if (!(A0M2 == null || A0M3 == null || A0M4 == null)) {
                            A0t.add(new ADV(ae6, aDe, a6s, A0M2, A0M3, A0Z, Integer.parseInt(A0M4), A1O ? 1 : 0));
                        }
                    }
                }
                ae6 = null;
                A0t.add(new ADV(ae6, aDe, a6s, A0M2, A0M3, A0Z, Integer.parseInt(A0M4), A1O ? 1 : 0));
            }
            C29621ca A0K13 = A0K2.A0K("applied_promotion");
            if (A0K13 != null) {
                C183919a7 r4 = (C183919a7) C18070vi.A0E(r9.A00);
                String A0M8 = A0K13.A0L("discount").A0M();
                if (A0M8 != null) {
                    AnonymousClass1D6 A002 = ((C189039iP) C18070vi.A0E(r4.A00)).A00(A0M8);
                    String str3 = (String) A002.first;
                    int A09 = C108955ca.A09(A002);
                    String A0P = A0K13.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    String A0e = AnonymousClass8BW.A0e(A0K13, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    String str4 = "";
                    if (A0e == null) {
                        A0e = str4;
                    }
                    C29621ca A0K14 = A0K13.A0K("description");
                    if (A0K14 == null || (str2 = A0K14.A0M()) == null) {
                        str2 = str4;
                    }
                    C29621ca A0K15 = A0K13.A0K("more_info");
                    if (!(A0K15 == null || (A0M = A0K15.A0M()) == null)) {
                        str4 = A0M;
                    }
                    C29621ca A0K16 = A0K13.A0K("image");
                    if (A0K16 != null) {
                        C18070vi.A0X(r4.A01.get());
                        aei = C196519vC.A00(A0K16);
                    } else {
                        aei = null;
                    }
                    r19 = new C195679tj(aei, A0P, A0e, str3, str2, str4, (Date) null, (Date) null, A09, 0);
                } else {
                    throw C17880vN.A0g();
                }
            } else {
                r19 = null;
            }
            if (A0Q2 == null || AnonymousClass1YF.A0T(A0Q2)) {
                j = 0;
            } else {
                j = Long.parseLong(A0Q2);
            }
            C185649cv A003 = ((C189049iQ) r13.get()).A00(A0K2.A0K("price"));
            if (A0Q != null) {
                r0 = new C195169su(r19, A003, A0Q, A0t, j);
            }
        }
        if (r0 != null) {
            C197779xF.A00((Pair) null, this.A05, r0);
            return;
        }
        C197779xF.A00(C108945cZ.A0N(C17880vN.A0h(), "order is null"), this.A05, (Object) null);
    }

    public C167908hy(C26911Ty r2, C182979Wl r3, C187189fP r4, C37131p1 r5, C190449kx r6, C19949A0g a0g, AnonymousClass1OZ r8, C20004A2u a2u, AnonymousClass10I r10) {
        super(r2);
        this.A04 = a2u;
        this.A03 = r8;
        this.A08 = r5;
        this.A00 = r4;
        this.A02 = a0g;
        this.A07 = r3;
        this.A06 = r10;
        this.A01 = r6;
    }

    public static C29621ca A00(C167908hy r10, UserJid userJid, String str) {
        AnonymousClass1MD[] r2;
        ArrayList A13 = AnonymousClass000.A13();
        C187189fP r22 = r10.A00;
        AnonymousClass8BU.A1J("width", Integer.toString(r22.A01), A13);
        AnonymousClass8BU.A1J("height", Integer.toString(r22.A00), A13);
        C29621ca A0l = AnonymousClass8BR.A0l("image_dimensions", (AnonymousClass1MD[]) null, C17890vO.A1Y(A13, 0));
        C29621ca r0 = new C29621ca("token", r22.A04, (AnonymousClass1MD[]) null);
        ArrayList A0s = C108965cb.A0s(A0l);
        A0s.add(r0);
        String A0A = r10.A01.A0A(r22.A02);
        if (A0A != null) {
            AnonymousClass8BU.A1J("direct_connection_encrypted_info", A0A, A0s);
        }
        C182979Wl r1 = r10.A07;
        AnonymousClass1MD A0h = AnonymousClass8BR.A0h("op", "get");
        AnonymousClass1MD A0h2 = AnonymousClass8BR.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r22.A03);
        if (C18020vd.A05(C18040vf.A02, r1.A00, 3215)) {
            r2 = new AnonymousClass1MD[3];
            r2[0] = A0h;
            r2[1] = A0h2;
            C17880vN.A1Q("biz_jid", userJid.getRawString(), r2, 2);
        } else {
            r2 = new AnonymousClass1MD[]{A0h, A0h2};
        }
        C29621ca A0l2 = AnonymousClass8BR.A0l("order", r2, C17890vO.A1Y(A0s, 0));
        AnonymousClass1MD[] r3 = new AnonymousClass1MD[5];
        C17880vN.A1Q("smax_id", "5", r3, 0);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r3, 1);
        C17880vN.A1Q("xmlns", "fb:thrift_iq", r3, 2);
        AnonymousClass8BV.A1O(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r3);
        return AnonymousClass8BW.A0Q(A0l2, new AnonymousClass1MD((Jid) C173438v4.A00, "to"), r3);
    }
}
