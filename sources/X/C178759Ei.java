package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Ei  reason: invalid class name and case insensitive filesystem */
public class C178759Ei extends C178869Et {
    public final Object A00;

    public C29621ca BVP() {
        return (C29621ca) this.A00;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        r4.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        X.C29591cX.A01(r2, r1, r0);
        r0 = r2.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0057, code lost:
        r0 = X.C29591cX.A00(X.C108945cZ.A0t(r0), r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C178759Ei(int r5) {
        /*
            r4 = this;
            switch(r5) {
                case 3: goto L_0x004e;
                case 4: goto L_0x0044;
                case 24: goto L_0x0031;
                case 25: goto L_0x0060;
                case 28: goto L_0x0025;
                default: goto L_0x0003;
            }
        L_0x0003:
            r4.<init>()
            X.1cX r3 = X.AnonymousClass8BS.A0S()
            java.lang.String r1 = "type"
            java.lang.String r0 = "poll"
            X.C29591cX.A01(r3, r1, r0)
            java.lang.String r0 = "meta"
            X.1cX r2 = X.C108945cZ.A0t(r0)
            java.lang.String r1 = "polltype"
            java.lang.String r0 = "creation"
            X.C29591cX.A01(r2, r1, r0)
            X.1ca r0 = X.C29591cX.A00(r2, r3)
        L_0x0022:
            r4.A00 = r0
            return
        L_0x0025:
            r4.<init>()
            X.1cX r2 = X.AnonymousClass8BS.A0S()
            java.lang.String r1 = "type"
            java.lang.String r0 = "pay"
            goto L_0x003c
        L_0x0031:
            r4.<init>()
            X.1cX r2 = X.AnonymousClass8BS.A0S()
            java.lang.String r1 = "edit"
            java.lang.String r0 = "8"
        L_0x003c:
            X.C29591cX.A01(r2, r1, r0)
            X.1ca r0 = r2.A03()
            goto L_0x0022
        L_0x0044:
            r4.<init>()
            X.1cX r1 = X.AnonymousClass8BS.A0R()
            java.lang.String r0 = "merchant_status"
            goto L_0x0057
        L_0x004e:
            r4.<init>()
            X.1cX r1 = X.AnonymousClass8BS.A0R()
            java.lang.String r0 = "merchant_account_settings"
        L_0x0057:
            X.1cX r0 = X.C108945cZ.A0t(r0)
            X.1ca r0 = X.C29591cX.A00(r0, r1)
            goto L_0x0022
        L_0x0060:
            r0 = 0
            r4.<init>((X.C178689Eb) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178759Ei.<init>(int):void");
    }

    public C178759Ei(long j) {
        C29591cX A0t = C108945cZ.A0t("clean");
        C29591cX.A01(A0t, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "syncd_app_state");
        if (C29601cY.A03(Long.valueOf(j), 0, 9007199254740991L, false)) {
            C108965cb.A1I(A0t, "timestamp", j);
        }
        this.A00 = A0t.A03();
    }

    public C178759Ei(long j, long j2) {
        C29591cX A01 = C178869Et.A01();
        C29591cX A0t = C108945cZ.A0t("variant_thumbnail_width");
        C20121A8g.A08(A0t, C29601cY.A03(Long.valueOf(j), 1, 2048, false) ? 1 : 0, j);
        C108955ca.A1P(A0t, A01);
        C29591cX A0t2 = C108945cZ.A0t("variant_thumbnail_height");
        C20121A8g.A08(A0t2, C29601cY.A03(Long.valueOf(j2), 1, 2048, false) ? 1 : 0, j2);
        this.A00 = C29591cX.A00(A0t2, A01);
    }

    public C178759Ei(AnonymousClass1EC r3) {
        C29591cX A01 = C178869Et.A01();
        AnonymousClass8BT.A1E(r3, A01, "linked_groups_membership_hint");
        this.A00 = A01.A03();
    }

    public C178759Ei(AnonymousClass1EC r5, C178759Ei r6) {
        C18070vi.A0d(r5, 1);
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX.A01(A0Y, "xmlns", "w:g2");
        AnonymousClass8BT.A1E(r5, A0Y, "to");
        A0Y.A06((C29621ca) r6.A00);
        this.A00 = A0Y.A03();
    }

    public C178759Ei(AnonymousClass4A4 r2) {
        C29591cX A0t = C108945cZ.A0t("query");
        C20121A8g.A09(A0t, r2);
        this.A00 = A0t.A03();
    }

    public C178759Ei(C178689Eb r3) {
        C29591cX A0t = C108945cZ.A0t("spam_list");
        if (r3 != null) {
            A0t.A05(r3.A00);
        }
        this.A00 = A0t.A03();
    }

    public C178759Ei(C178759Ei r3) {
        this.A00 = C29591cX.A00(C20121A8g.A04(r3, "metadata_info"), C178869Et.A01());
    }

    public C178759Ei(C178759Ei r10, long j) {
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX A0t = C108945cZ.A0t("installment");
        if (C29601cY.A03(Long.valueOf(j), 1, 50, false)) {
            C108965cb.A1I(A0t, "max_count", j);
        }
        AnonymousClass8BX.A1I(C20121A8g.A04(r10, "amount"), A0t, A0R);
        this.A00 = A0R.A03();
    }

    public C178759Ei(C178829Ep r3) {
        C29591cX A01 = C178869Et.A01();
        C29591cX A0t = C108945cZ.A0t("member_add_mode");
        C20121A8g.A0A(A0t, r3);
        this.A00 = C29591cX.A00(A0t, A01);
    }

    public C178759Ei(C178839Eq r3) {
        C29591cX A0t = C108945cZ.A0t("membership_approval_mode");
        C29591cX A0t2 = C108945cZ.A0t("group_join");
        C20121A8g.A0A(A0t2, r3);
        this.A00 = C29591cX.A00(A0t2, A0t);
    }

    public C178759Ei(Long l, byte[] bArr) {
        C18070vi.A0d(bArr, 2);
        C29591cX A01 = C178869Et.A01();
        C29591cX A0t = C108945cZ.A0t("reporting");
        C29591cX A0t2 = C108945cZ.A0t("reporting_token");
        Long l2 = l;
        if (l != null && C29601cY.A03(l2, -9007199254740991L, 9007199254740991L, true)) {
            C108965cb.A1I(A0t2, "v", l.longValue());
        }
        C29601cY.A02(bArr, 16, 128);
        A0t2.A01 = bArr;
        AnonymousClass8BX.A1I(A0t2, A0t, A01);
        this.A00 = A01.A03();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        X.AnonymousClass8BW.A1F(r4, r5, r7, X.AnonymousClass8BS.A1O(r7, r2, r0) ? 1 : 0);
        r0 = r4.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007b, code lost:
        r4 = X.C108945cZ.A0t(r0);
        r2 = 1;
        r0 = 2000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (X.AnonymousClass8BS.A1O(r7, r2, r0) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r4.A07(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        r0 = X.C29591cX.A00(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r6.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C178759Ei(java.lang.String r7, int r8) {
        /*
            r6 = this;
            switch(r8) {
                case 7: goto L_0x0072;
                case 8: goto L_0x0068;
                case 10: goto L_0x004d;
                case 13: goto L_0x0034;
                case 18: goto L_0x0024;
                case 21: goto L_0x0072;
                case 22: goto L_0x0068;
                default: goto L_0x0003;
            }
        L_0x0003:
            r6.<init>()
            X.1cX r5 = X.C178869Et.A01()
            java.lang.String r0 = "catalog_session_id"
            X.1cX r4 = X.C108945cZ.A0t(r0)
            r2 = 1
            r0 = 40
        L_0x0014:
            boolean r0 = X.AnonymousClass8BS.A1O(r7, r2, r0)
            if (r0 == 0) goto L_0x001d
            r4.A07(r7)
        L_0x001d:
            X.1ca r0 = X.C29591cX.A00(r4, r5)
        L_0x0021:
            r6.A00 = r0
            return
        L_0x0024:
            java.lang.String r5 = "id"
            r6.<init>()
            java.lang.String r0 = "picture"
            X.1cX r4 = X.C108945cZ.A0t(r0)
            r2 = 0
            r0 = 50
            goto L_0x005c
        L_0x0034:
            java.lang.String r3 = "id"
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            r6.<init>()
            X.1cX r2 = X.C108955ca.A0Y()
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.AnonymousClass8BY.A1A(r2, r1, r0, r7, r3)
            X.1ca r0 = r2.A03()
            goto L_0x0021
        L_0x004d:
            java.lang.String r5 = "parameters"
            r6.<init>()
            java.lang.String r0 = "context"
            X.1cX r4 = X.C108945cZ.A0t(r0)
            r2 = 0
            r0 = 10000(0x2710, double:4.9407E-320)
        L_0x005c:
            boolean r0 = X.AnonymousClass8BS.A1O(r7, r2, r0)
            X.AnonymousClass8BW.A1F(r4, r5, r7, r0)
            X.1ca r0 = r4.A03()
            goto L_0x0021
        L_0x0068:
            r6.<init>()
            X.1cX r5 = X.C178869Et.A01()
            java.lang.String r0 = "variant_info_fields"
            goto L_0x007b
        L_0x0072:
            r6.<init>()
            X.1cX r5 = X.C178869Et.A01()
            java.lang.String r0 = "direct_connection_encrypted_info"
        L_0x007b:
            X.1cX r4 = X.C108945cZ.A0t(r0)
            r2 = 1
            r0 = 2000(0x7d0, double:9.88E-321)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178759Ei.<init>(java.lang.String, int):void");
    }

    public C178759Ei(String str, String str2, String str3) {
        C29591cX A01 = C178869Et.A01();
        C29591cX A0t = C108945cZ.A0t("money");
        String str4 = str;
        if (C29601cY.A04(str4, 1, 100, false)) {
            C29591cX.A01(A0t, "value", str4);
        }
        String str5 = str2;
        if (C29601cY.A04(str5, 1, 100, false)) {
            C29591cX.A01(A0t, "offset", str5);
        }
        String str6 = str3;
        if (C29601cY.A04(str6, 1, 100, false)) {
            C29591cX.A01(A0t, "currency", str6);
        }
        this.A00 = C29591cX.A00(A0t, A01);
    }

    public C178759Ei(String str, String str2, byte[] bArr, long j) {
        C18070vi.A0j(str, str2);
        C18070vi.A0d(bArr, 4);
        C29591cX A0t = C108945cZ.A0t("pin");
        AnonymousClass8BW.A1F(A0t, "provider", str, C29601cY.A04(str, 1, 200, false) ? 1 : 0);
        if (AnonymousClass8BV.A1W(str2, 1, false)) {
            C29591cX.A01(A0t, "key-type", str2);
        }
        if (C29601cY.A03(Long.valueOf(j), 0, 9007199254740991L, false)) {
            C108965cb.A1I(A0t, "key-version", j);
        }
        C29601cY.A02(bArr, 0, 9007199254740991L);
        A0t.A01 = bArr;
        this.A00 = A0t.A03();
    }

    public C178759Ei(List list, int i) {
        C29621ca r0;
        if (1 - i != 0) {
            C29591cX A01 = C178869Et.A01();
            C29591cX A0t = C108945cZ.A0t("reporting");
            if (C29601cY.A05(list, 0, 1000)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C178719Ee.A01(A0t, it);
                }
            }
            r0 = C29591cX.A00(A0t, A01);
        } else {
            C29591cX A012 = C178869Et.A01();
            if (C29601cY.A05(list, 1, 5)) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C178709Ed.A00(A012, it2);
                }
            }
            r0 = A012.A03();
        }
        this.A00 = r0;
    }

    public C178759Ei(List list, List list2) {
        C18070vi.A0d(list, 1);
        C29591cX A0t = C108945cZ.A0t("leave");
        if (C29601cY.A05(list, 0, 1024)) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0s("getNode");
            }
        }
        if (C29601cY.A05(list2, 1, 1024)) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C178709Ed.A00(A0t, it2);
            }
        }
        this.A00 = A0t.A03();
    }
}
