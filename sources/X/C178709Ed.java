package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Ed  reason: invalid class name and case insensitive filesystem */
public class C178709Ed extends C20121A8g {
    public final Object A00;

    public static void A00(C29591cX r1, Iterator it) {
        r1.A05((C29621ca) ((C178709Ed) it.next()).A00);
    }

    public C178709Ed(int i) {
        String str;
        switch (i) {
            case 13:
                str = "allow_admin_reports";
                break;
            case 14:
                str = "allow_non_admin_sub_group_creation";
                break;
            case 15:
                str = "group_history";
                break;
            case 16:
                str = "no_group_history";
                break;
            case 17:
                str = "not_allow_admin_reports";
                break;
            case 18:
                str = "not_allow_non_admin_sub_group_creation";
                break;
            case 27:
                str = "hidden_group";
                break;
            default:
                str = "announcement";
                break;
        }
        this.A00 = C108945cZ.A0t(str).A03();
    }

    public C178709Ed(long j) {
        C29591cX A0t = C108945cZ.A0t("integrator");
        if (C29601cY.A03(Long.valueOf(j), 1, 999, false)) {
            C108965cb.A1I(A0t, PublicKeyCredentialControllerUtility.JSON_KEY_ID, j);
        }
        this.A00 = A0t.A03();
    }

    public C178709Ed(AnonymousClass1EC r3, int i) {
        String str;
        C18070vi.A0d(r3, 1);
        if (9 - i != 0) {
            str = "sub_group_suggestion";
        } else {
            str = "group";
        }
        C29591cX A0t = C108945cZ.A0t(str);
        AnonymousClass8BT.A1E(r3, A0t, "jid");
        this.A00 = A0t.A03();
    }

    public C178709Ed(AnonymousClass1EC r3, C178709Ed r4) {
        C18070vi.A0d(r3, 1);
        C29591cX A0t = C108945cZ.A0t("group");
        AnonymousClass8BT.A1E(r3, A0t, "jid");
        C20121A8g.A0B(A0t, r4);
        this.A00 = A0t.A03();
    }

    public C178709Ed(AnonymousClass1EC r4, UserJid userJid) {
        C29591cX A0t = C108945cZ.A0t("sub_group_suggestion");
        AnonymousClass8BT.A1E(userJid, A0t, "creator");
        AnonymousClass8BT.A1E(r4, A0t, "jid");
        this.A00 = A0t.A03();
    }

    public C178709Ed(C178759Ei r2) {
        this.A00 = C20121A8g.A04(r2, "context").A03();
    }

    public C178709Ed(C178769Ej r3) {
        C29591cX A0t = C108945cZ.A0t("linked_groups");
        A0t.A06((C29621ca) r3.A00);
        this.A00 = A0t.A03();
    }

    public C178709Ed(C178769Ej r2, C178759Ei r3, AnonymousClass4A4 r4, AnonymousClass4A4 r5) {
        C29591cX A0t = C108945cZ.A0t("picture");
        AnonymousClass8BW.A1E(A0t, r3);
        C20121A8g.A09(A0t, r4);
        C20121A8g.A09(A0t, r5);
        C20121A8g.A0A(A0t, r2);
        this.A00 = A0t.A03();
    }

    public C178709Ed(UserJid userJid) {
        C18070vi.A0d(userJid, 1);
        C29591cX A0t = C108945cZ.A0t("participant");
        AnonymousClass8BT.A1E(userJid, A0t, "jid");
        this.A00 = A0t.A03();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006f, code lost:
        r0 = r5.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (X.AnonymousClass8BS.A1O(r7, r2, r0) == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        r4.A07(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        r0 = X.C29591cX.A00(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        r6.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C178709Ed(java.lang.String r7, int r8) {
        /*
            r6 = this;
            switch(r8) {
                case 0: goto L_0x0056;
                case 1: goto L_0x003f;
                case 2: goto L_0x0003;
                case 3: goto L_0x0027;
                default: goto L_0x0003;
            }
        L_0x0003:
            r6.<init>()
            java.lang.String r0 = "description"
            X.1cX r5 = X.C108945cZ.A0t(r0)
            java.lang.String r0 = "body"
            X.1cX r4 = X.C108945cZ.A0t(r0)
            r2 = 1
            r0 = 65536(0x10000, double:3.2379E-319)
        L_0x0017:
            boolean r0 = X.AnonymousClass8BS.A1O(r7, r2, r0)
            if (r0 == 0) goto L_0x0020
            r4.A07(r7)
        L_0x0020:
            X.1ca r0 = X.C29591cX.A00(r4, r5)
        L_0x0024:
            r6.A00 = r0
            return
        L_0x0027:
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            r6.<init>()
            java.lang.String r0 = "product"
            X.1cX r5 = X.C108945cZ.A0t(r0)
            java.lang.String r0 = "id"
            X.1cX r4 = X.C108945cZ.A0t(r0)
            r2 = 1
            r0 = 200(0xc8, double:9.9E-322)
            goto L_0x0017
        L_0x003f:
            java.lang.String r4 = "dhash"
            r6.<init>()
            java.lang.String r0 = "item"
            X.1cX r5 = X.C108945cZ.A0t(r0)
            r2 = 0
            r0 = 100
            boolean r0 = X.AnonymousClass8BS.A1O(r7, r2, r0)
            X.AnonymousClass8BW.A1F(r5, r4, r7, r0)
            goto L_0x006f
        L_0x0056:
            r6.<init>()
            java.lang.String r0 = "id_token"
            X.1cX r5 = X.C108945cZ.A0t(r0)
            r2 = 0
            r0 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            boolean r0 = X.AnonymousClass8BS.A1O(r7, r2, r0)
            if (r0 == 0) goto L_0x006f
            r5.A07(r7)
        L_0x006f:
            X.1ca r0 = r5.A03()
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178709Ed.<init>(java.lang.String, int):void");
    }

    public C178709Ed(String str, long j) {
        C18070vi.A0d(str, 1);
        C29591cX A0t = C108945cZ.A0t(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        if (C29601cY.A04(str, 1, 100, false)) {
            C29591cX.A01(A0t, "external_id", str);
        }
        if (C29601cY.A03(Long.valueOf(j), 1, 999, false)) {
            C108965cb.A1I(A0t, "integrator_id", j);
        }
        this.A00 = A0t.A03();
    }

    public C178709Ed(String str, String str2) {
        C29591cX A0t = C108945cZ.A0t("metadata");
        AnonymousClass8BW.A1F(A0t, "key", str, C29601cY.A04(str, 1, 100, false) ? 1 : 0);
        AnonymousClass8BW.A1F(A0t, "value", str2, AnonymousClass8BV.A1Y(str2, 1, false) ? 1 : 0);
        this.A00 = A0t.A03();
    }

    public C178709Ed(List list, int i) {
        C29591cX r2;
        switch (i) {
            case 20:
                r2 = C108945cZ.A0t("approve");
                if (C20121A8g.A0C(list)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        A00(r2, it);
                    }
                    break;
                }
                break;
            case 22:
                r2 = C108945cZ.A0t("cancel");
                if (C20121A8g.A0C(list)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        A00(r2, it2);
                    }
                    break;
                }
                break;
            default:
                r2 = C108945cZ.A0t("reject");
                if (C20121A8g.A0C(list)) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        A00(r2, it3);
                    }
                    break;
                }
                break;
        }
        this.A00 = r2.A03();
    }
}
