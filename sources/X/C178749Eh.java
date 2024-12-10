package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Eh  reason: invalid class name and case insensitive filesystem */
public class C178749Eh extends C178869Et {
    public final Object A00;

    public static C29591cX A00(C178749Eh r2, String str) {
        C29591cX r1 = new C29591cX(str);
        r1.A06((C29621ca) r2.A00);
        return r1;
    }

    public C29621ca BVP() {
        return (C29621ca) this.A00;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        X.C29591cX.A01(r2, r1, r0);
        r0 = r2.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0061, code lost:
        r4.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        r0 = X.C29591cX.A00(X.C108945cZ.A0t(r0), r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C178749Eh(int r5) {
        /*
            r4 = this;
            switch(r5) {
                case 3: goto L_0x004f;
                case 4: goto L_0x0003;
                case 5: goto L_0x0003;
                case 6: goto L_0x003d;
                case 7: goto L_0x0033;
                case 8: goto L_0x0029;
                case 9: goto L_0x0003;
                case 10: goto L_0x0014;
                case 11: goto L_0x0008;
                default: goto L_0x0003;
            }
        L_0x0003:
            r0 = 0
            r4.<init>(r0, r0, r0)
            return
        L_0x0008:
            r4.<init>()
            X.1cX r2 = X.AnonymousClass8BS.A0S()
            java.lang.String r1 = "edit"
            java.lang.String r0 = "7"
            goto L_0x005a
        L_0x0014:
            r4.<init>()
            java.lang.String r0 = "raw"
            X.1cX r3 = X.C108945cZ.A0t(r0)
            java.lang.String r2 = "v"
            r0 = 2
            X.C108965cb.A1I(r3, r2, r0)
            X.1ca r0 = r3.A03()
            goto L_0x0061
        L_0x0029:
            r4.<init>()
            X.1cX r1 = X.AnonymousClass8BS.A0S()
            java.lang.String r0 = "url_text"
            goto L_0x0046
        L_0x0033:
            r4.<init>()
            X.1cX r1 = X.AnonymousClass8BS.A0S()
            java.lang.String r0 = "url_number"
            goto L_0x0046
        L_0x003d:
            r4.<init>()
            X.1cX r1 = X.AnonymousClass8BS.A0S()
            java.lang.String r0 = "multicast"
        L_0x0046:
            X.1cX r0 = X.C108945cZ.A0t(r0)
            X.1ca r0 = X.C29591cX.A00(r0, r1)
            goto L_0x0061
        L_0x004f:
            r4.<init>()
            X.1cX r2 = X.AnonymousClass8BS.A0S()
            java.lang.String r1 = "edit"
            java.lang.String r0 = "1"
        L_0x005a:
            X.C29591cX.A01(r2, r1, r0)
            X.1ca r0 = r2.A03()
        L_0x0061:
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178749Eh.<init>(int):void");
    }

    public C178749Eh(C178749Eh r12, Long l) {
        C29591cX A01 = C178869Et.A01();
        C29591cX A0t = C108945cZ.A0t("tctoken");
        Long l2 = l;
        if (l != null && C29601cY.A03(l2, 0, 9007199254740991L, true)) {
            C108965cb.A1I(A0t, "t", l.longValue());
        }
        A0t.A06((C29621ca) r12.A00);
        this.A00 = C29591cX.A00(A0t, A01);
    }

    public C178749Eh(C178759Ei r2, C178759Ei r3, C178749Eh r4) {
        C29591cX A0S = AnonymousClass8BS.A0S();
        AnonymousClass8BW.A1E(A0S, r2);
        AnonymousClass8BW.A1E(A0S, r3);
        AnonymousClass8BV.A1G(A0S, r4);
        this.A00 = A0S.A03();
    }

    public C178749Eh(UserJid userJid) {
        C18070vi.A0d(userJid, 1);
        C29591cX A0S = AnonymousClass8BS.A0S();
        AnonymousClass8BT.A1E(userJid, A0S, "participant");
        this.A00 = A0S.A03();
    }

    public C178749Eh(String str, int i) {
        C29591cX A0t;
        String str2;
        C29591cX A0S = AnonymousClass8BS.A0S();
        if (2 - i != 0) {
            A0t = C108945cZ.A0t("hsm");
            str2 = AnonymousClass8BS.A1O(str, 0, 9007199254740991L) ? "tid" : str2;
            this.A00 = C29591cX.A00(A0t, A0S);
        }
        A0t = C108945cZ.A0t("iab");
        if (AnonymousClass8BS.A1O(str, 0, 9007199254740991L)) {
            str2 = "reported_link";
        }
        this.A00 = C29591cX.A00(A0t, A0S);
        C29591cX.A01(A0t, str2, str);
        this.A00 = C29591cX.A00(A0t, A0S);
    }

    public C178749Eh(String str, String str2) {
        C29591cX A01 = C178869Et.A01();
        if (C29601cY.A04(str, 1, 100, false)) {
            C29591cX.A01(A01, "aadhaar-otp-txn-id", str);
        }
        String str3 = str2;
        if (C29601cY.A04(str3, 1, 100, false)) {
            C29591cX.A01(A01, "aadhaar-otp-txn-ts", str3);
        }
        this.A00 = A01.A03();
    }

    public C178749Eh(String str, String str2, String str3, int i) {
        C29591cX A01;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (16 - i != 0) {
            C18070vi.A0j(str4, str5);
            A01 = C178869Et.A01();
            C29591cX A0t = C108945cZ.A0t("money");
            if (C29601cY.A04(str4, 1, 100, false)) {
                C29591cX.A01(A0t, "value", str4);
            }
            if (C29601cY.A04(str5, 1, 100, false)) {
                C29591cX.A01(A0t, "offset", str5);
            }
            if (C29601cY.A04(str6, 1, 100, false)) {
                C29591cX.A01(A0t, "currency", str6);
            }
            C108955ca.A1P(A0t, A01);
        } else {
            C18070vi.A0o(str4, str5, str6);
            A01 = C178869Et.A01();
            if (C29601cY.A04(str4, 6, 6, false)) {
                C29591cX.A01(A01, "debit-last-6", str4);
            }
            if (C29601cY.A04(str5, 1, 2, false)) {
                C29591cX.A01(A01, "debit-exp-month", str5);
            }
            if (C29601cY.A04(str6, 2, 2, false)) {
                C29591cX.A01(A01, "debit-exp-year", str6);
            }
        }
        this.A00 = A01.A03();
    }

    public C178749Eh(String str, String str2, String str3, String str4, long j) {
        C29591cX A0t = C108945cZ.A0t("extension_screen");
        String str5 = str;
        if (C29601cY.A04(str5, 0, 9007199254740991L, false)) {
            C29591cX.A01(A0t, "extension_id", str5);
        }
        String str6 = str2;
        if (C29601cY.A04(str6, 0, 9007199254740991L, false)) {
            C29591cX.A01(A0t, "session_id", str6);
        }
        long j2 = j;
        if (C29601cY.A03(Long.valueOf(j2), 0, 9007199254740991L, false)) {
            C108965cb.A1I(A0t, "t", j2);
        }
        String str7 = str3;
        AnonymousClass8BW.A1F(A0t, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str7, C29601cY.A04(str7, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t2 = C108945cZ.A0t("data");
        String str8 = str4;
        if (C29601cY.A04(str8, 0, 9007199254740991L, false)) {
            A0t2.A07(str8);
        }
        this.A00 = C29591cX.A00(A0t2, A0t);
    }

    public C178749Eh(List list) {
        C29591cX A0S = AnonymousClass8BS.A0S();
        if (C29601cY.A05(list, 1, 100)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C178719Ee.A01(A0S, it);
            }
        }
        this.A00 = A0S.A03();
    }

    public C178749Eh(byte[] bArr, int i) {
        C29621ca A03;
        if (9 - i != 0) {
            C29591cX A01 = C178869Et.A01();
            C29591cX A0t = C108945cZ.A0t("reporting");
            C29591cX A0t2 = C108945cZ.A0t("reporting_tag");
            C29601cY.A02(bArr, 9, 128);
            A0t2.A01 = bArr;
            AnonymousClass8BX.A1I(A0t2, A0t, A01);
            A03 = A01.A03();
        } else {
            C29591cX A012 = C178869Et.A01();
            C29601cY.A02(bArr, 1, 120);
            A012.A01 = bArr;
            A03 = A012.A03();
        }
        this.A00 = A03;
    }
}
