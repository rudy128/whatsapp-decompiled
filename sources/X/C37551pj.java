package X;

import android.app.Activity;
import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1pj  reason: invalid class name and case insensitive filesystem */
public final class C37551pj {
    public final AnonymousClass1KB A00;
    public final C37531ph A01;
    public final C37501pe A02;
    public final AnonymousClass1M9 A03;
    public final C24671Lf A04;
    public final C24921Me A05;
    public final AnonymousClass11P A06;
    public final C19830z4 A07;
    public final C18000vb A08;
    public final AnonymousClass1M4 A09;
    public final AnonymousClass1TB A0A;
    public final AnonymousClass1R3 A0B;
    public final AnonymousClass1NK A0C;
    public final C18030ve A0D;
    public final AnonymousClass18K A0E;
    public final C24901Mc A0F;
    public final AnonymousClass10I A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final Set A0K = new LinkedHashSet();
    public final AtomicBoolean A0L = new AtomicBoolean(false);
    public final AtomicBoolean A0M = new AtomicBoolean(false);
    public final C37491pd A0N;
    public final AnonymousClass190 A0O;
    public final AnonymousClass18O A0P;
    public final C23651Hc A0Q;
    public final C37511pf A0R;
    public final AnonymousClass1PM A0S;
    public final AnonymousClass121 A0T;
    public final C37541pi A0U;
    public final AnonymousClass1Cd A0V;
    public final C24751Ln A0W;
    public final AnonymousClass12L A0X;
    public final AnonymousClass1PQ A0Y;
    public final AnonymousClass00H A0Z;
    public final AnonymousClass00H A0a;
    public final AnonymousClass00H A0b;
    public final AnonymousClass00H A0c;
    public final AnonymousClass00H A0d;
    public final AnonymousClass00H A0e;
    public final AnonymousClass00H A0f;
    public final AnonymousClass00H A0g;

    public static final UserJid A00(C37551pj r3) {
        Object obj;
        UserJid userJid;
        synchronized (r3) {
            Iterator it = r3.A0K.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C22971Dz.A0Z((UserJid) obj)) {
                    break;
                }
            }
            userJid = (UserJid) obj;
        }
        return userJid;
    }

    private final void A05(Activity activity, C72073Kn r12, C188509hX r13) {
        int i;
        C37491pd r4 = this.A0N;
        C188509hX r5 = r13;
        boolean z = r13.A0A;
        AnonymousClass11E r1 = r4.A01;
        if (!r1.A09()) {
            if (AnonymousClass11E.A02(r1.A01.A00)) {
                i = 2131892945;
                if (z) {
                    i = 2131892939;
                }
            } else {
                i = 2131892944;
                if (z) {
                    i = 2131892938;
                }
            }
            r4.A00.A08(i, 0);
            return;
        }
        Activity activity2 = activity;
        r4.A00.A0D((AnonymousClass1FR) activity2);
        this.A0G.CGF(new C21368Aix(r5, activity2, this, r12, 38));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.9rQ] */
    public final ArrayList A08(AnonymousClass1BI r11) {
        String A002;
        C18070vi.A0d(r11, 0);
        ArrayList arrayList = new ArrayList();
        AnonymousClass1R3 r3 = this.A0B;
        Iterator it = r3.A08(r11, 5).iterator();
        while (it.hasNext()) {
            AnonymousClass206 r7 = (AnonymousClass206) it.next();
            ? obj = new Object();
            obj.A01 = null;
            obj.A02 = false;
            obj.A00 = null;
            if (r7 instanceof C439421n) {
                A002 = ((C439421n) r7).BaE().A05;
            } else {
                if (r7 instanceof AnonymousClass21L) {
                    A002 = this.A0U.A00(r7);
                    if (A002 == null) {
                    }
                }
                obj.A02 = r3.A0A(r11, r7.A0I);
                obj.A00 = Long.valueOf(TimeUnit.MILLISECONDS.toHours(r7.A0I) * TimeUnit.HOURS.toSeconds(1));
                arrayList.add(obj);
            }
            obj.A01 = A002;
            obj.A02 = r3.A0A(r11, r7.A0I);
            obj.A00 = Long.valueOf(TimeUnit.MILLISECONDS.toHours(r7.A0I) * TimeUnit.HOURS.toSeconds(1));
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final synchronized Set A0A() {
        return C29431cG.A12(this.A0K);
    }

    public final synchronized Set A0B() {
        Set A11;
        Set<UserJid> set = this.A0K;
        A11 = C29431cG.A11(set);
        for (UserJid userJid : set) {
            if (C22971Dz.A0Y(userJid)) {
                C24751Ln r1 = this.A0W;
                C18070vi.A0z(userJid, "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid");
                for (AnonymousClass1E1 remove : r1.A0I((PhoneUserJid) userJid)) {
                    A11.remove(remove);
                }
            }
        }
        return A11;
    }

    public final void A0C() {
        Set A12;
        synchronized (this) {
            Set set = this.A0K;
            A12 = C29431cG.A12(set);
            set.clear();
            A0D();
            ((C58362kZ) this.A0d.get()).A01(new C21445AkC(this, 27));
        }
        A07(this, A12);
    }

    public final void A0F(Activity activity, C72073Kn r13, UserJid userJid) {
        C18070vi.A0d(activity, 0);
        C18070vi.A0d(userJid, 2);
        A05(activity, r13, new C188509hX((AnonymousClass1E7) null, userJid, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, false));
    }

    public final void A0G(Activity activity, AnonymousClass1E7 r16, UserJid userJid, Integer num, Integer num2, String str, String str2, String str3) {
        Boolean bool;
        ArrayList arrayList;
        UserJid userJid2 = userJid;
        C18070vi.A0d(userJid2, 1);
        String str4 = str3;
        C18070vi.A0d(str4, 6);
        AnonymousClass1E7 r4 = r16;
        C18070vi.A0d(r4, 7);
        String str5 = str;
        if (str == null) {
            bool = null;
        } else if (this.A0B.A05(userJid2) != null) {
            bool = Boolean.valueOf(!this.A0C.A08(userJid2));
        } else {
            bool = null;
        }
        if (A0O(r4, true)) {
            arrayList = A08(userJid2);
        } else {
            arrayList = null;
        }
        A03(activity, (C72073Kn) null, this, new C188509hX(r4, userJid2, bool, num, num2, str4, str5, str2, arrayList, true), false);
    }

    public final void A0H(Activity activity, AnonymousClass1E7 r14, String str, boolean z) {
        C18070vi.A0d(activity, 0);
        C18070vi.A0d(r14, 1);
        A04(activity, (C72073Kn) null, this, r14, (Integer) null, (Integer) null, (String) null, (String) null, str, false, z);
    }

    public final void A0I(Activity activity, UserJid userJid) {
        C18070vi.A0d(activity, 0);
        C18070vi.A0d(userJid, 1);
        A0F(activity, (C72073Kn) null, userJid);
    }

    public final void A0J(UserJid userJid, String str) {
        synchronized (this) {
            if (this.A0K.add(userJid)) {
                A06(this, userJid, str, true);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.2MI, X.20i, X.206] */
    public final void A0K(UserJid userJid, boolean z) {
        C18070vi.A0d(userJid, 0);
        AnonymousClass1PQ r2 = this.A0Y;
        ? r22 = new C436420i(r2.A02.A01(userJid, true), 58, AnonymousClass11P.A01(this.A06));
        r22.A00 = z;
        this.A0T.BBZ(r22, -1);
    }

    public static final HashSet A02(C37551pj r3, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            UserJid A012 = A01(r3, (UserJid) it.next());
            if (A012 != null) {
                hashSet.add(A012);
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x027a, code lost:
        if (r5.equals("chat") == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0284, code lost:
        if (r5.equals("biz_overflow_menu_block") == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0288, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0295, code lost:
        if (r5.equals("biz_account_info_block") == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x029f, code lost:
        if (r5.equals("account_info_block") != false) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02a1, code lost:
        r3 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.app.Activity r21, X.C72073Kn r22, X.C37551pj r23, X.C188509hX r24, boolean r25) {
        /*
            r2 = r24
            r8 = r22
            boolean r7 = r2.A0A
            java.lang.String r0 = r2.A08
            r3 = 0
            if (r0 == 0) goto L_0x0530
            int r1 = X.C88244Yx.A00(r0)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
        L_0x0013:
            r4 = r23
            X.00H r1 = r4.A0b
            java.lang.Object r10 = r1.get()
            X.1Q1 r10 = (X.AnonymousClass1Q1) r10
            com.whatsapp.jid.UserJid r1 = r2.A03
            r24 = r1
            X.00H r1 = r10.A00
            java.lang.Object r9 = r1.get()
            X.11A r9 = (X.AnonymousClass11A) r9
            if (r7 == 0) goto L_0x0522
            r6 = 12
            X.3C4 r5 = new X.3C4
            r1 = r24
            r5.<init>(r10, r1, r11, r6)
            r9.A00(r5)
        L_0x0037:
            X.1Hc r1 = r4.A0Q
            boolean r1 = r1.A07
            if (r1 == 0) goto L_0x00ae
            r13 = r21
            if (r22 != 0) goto L_0x0046
            X.2xz r8 = new X.2xz
            r8.<init>(r13, r4, r7)
        L_0x0046:
            X.1pf r5 = r4.A0R
            r1 = r24
            X.2pq r17 = r5.A00(r1)
            X.00H r1 = r4.A0Z
            java.lang.Object r5 = r1.get()
            X.2bt r5 = (X.C53042bt) r5
            boolean r1 = X.C22971Dz.A0S(r24)
            r23 = r25
            if (r1 == 0) goto L_0x02a7
            X.2YW r1 = r5.A01
            X.10F r1 = r1.A00
            X.10E r5 = r1.A00
            X.00S r1 = r5.A4b
            java.lang.Object r11 = r1.get()
            X.1KB r11 = (X.AnonymousClass1KB) r11
            X.00S r1 = r5.A0x
            java.lang.Object r10 = r1.get()
            X.1pj r10 = (X.C37551pj) r10
            X.00S r1 = r5.A2g
            java.lang.Object r9 = r1.get()
            X.1Lf r9 = (X.C24671Lf) r9
            X.00S r1 = r5.A5T
            java.lang.Object r6 = r1.get()
            X.6na r6 = (X.C132786na) r6
            X.00S r1 = r5.A9C
            java.lang.Object r5 = r1.get()
            X.1OX r5 = (X.AnonymousClass1OX) r5
            X.6jo r1 = new X.6jo
            r16 = r10
            r17 = r2
            r18 = r9
            r19 = r6
            r20 = r5
            r21 = r23
            r12 = r1
            r14 = r11
            r15 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.1OX r8 = r1.A07
            com.whatsapp.blocklist.InteropBlockListResponseHandler$send$1 r6 = new com.whatsapp.blocklist.InteropBlockListResponseHandler$send$1
            r6.<init>(r1, r3)
            X.1OR r5 = X.AnonymousClass1OR.A00
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            X.C30451dy.A02(r1, r5, r6, r8)
        L_0x00ae:
            if (r7 == 0) goto L_0x0596
            X.12L r5 = r4.A0X
            r1 = r24
            boolean r1 = X.C42761yh.A01(r5, r1)
            if (r1 == 0) goto L_0x00e2
            java.lang.String r5 = r2.A07
            if (r5 == 0) goto L_0x00c6
            int r1 = r5.hashCode()
            r6 = 1
            switch(r1) {
                case -1801846342: goto L_0x028f;
                case -401299234: goto L_0x027e;
                case 3052376: goto L_0x0274;
                case 894529294: goto L_0x0299;
                case 1622880667: goto L_0x0254;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            r5 = 0
            if (r0 == 0) goto L_0x00d0
            int r1 = r0.hashCode()
            switch(r1) {
                case -612071747: goto L_0x0249;
                case -174614655: goto L_0x023d;
                case 133626717: goto L_0x0231;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            X.00H r1 = r4.A0c
            java.lang.Object r7 = r1.get()
            X.A74 r7 = (X.A74) r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r5 = 1
            r1 = r24
            X.A74.A01(r7, r1, r3, r6, r5)
        L_0x00e2:
            X.10I r5 = r4.A0G
            r3 = 4
            X.AkI r1 = new X.AkI
            r1.<init>(r2, r4, r3)
            r5.CGF(r1)
            java.lang.String r11 = r2.A07
            com.whatsapp.jid.PhoneUserJid r6 = r2.A00
            X.00H r12 = r4.A0H
            java.lang.Object r3 = r12.get()
            X.A5M r3 = (X.A5M) r3
            int r18 = X.C88244Yx.A01(r11)
            java.lang.String r2 = r2.A09
            int r1 = X.C83554Fo.A00(r11)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            r10 = 0
            r19 = 6
            r21 = r10
            r13 = r3
            r14 = r24
            r16 = r0
            r17 = r2
            r20 = r10
            r13.A03(r14, r15, r16, r17, r18, r19, r20, r21)
            X.00H r0 = r4.A0a
            java.lang.Object r9 = r0.get()
            X.2qh r9 = (X.C62042qh) r9
            r2 = r14
            if (r6 == 0) goto L_0x0124
            r2 = r6
        L_0x0124:
            X.0ve r1 = r9.A03
            r0 = 5245(0x147d, float:7.35E-42)
            X.0vf r8 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x019f
            X.1CJ r0 = r9.A01
            X.1ci r15 = r0.A0A(r2)
            if (r15 == 0) goto L_0x019f
            X.2Fj r7 = new X.2Fj
            r7.<init>()
            java.lang.String r0 = r2.getRawString()
            r7.A03 = r0
            java.lang.Long r0 = r15.A09()
            long r0 = r0.longValue()
            X.11P r2 = r9.A00
            long r2 = X.AnonymousClass11P.A01(r2)
            X.121 r5 = r9.A02
            long r0 = r5.BVc(r0)
            long r2 = r2 - r0
            double r0 = X.C62042qh.A00(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r7.A02 = r0
            java.lang.Long r0 = r15.A09()
            long r2 = r0.longValue()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r13 = r5.BVU(r2, r0)
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x022a
            double r0 = X.C62042qh.A00(r13)
        L_0x0178:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r7.A00 = r0
            java.lang.Long r0 = r15.A09()
            long r2 = r0.longValue()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r13 = r5.BVV(r2, r0)
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0223
            double r0 = X.C62042qh.A00(r13)
        L_0x0194:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r7.A01 = r0
            X.18K r0 = r9.A04
            r0.CC7(r7)
        L_0x019f:
            X.00H r0 = r4.A0g
            java.lang.Object r2 = r0.get()
            X.8od r2 = (X.C170038od) r2
            if (r6 != 0) goto L_0x01ab
            r6 = r24
        L_0x01ab:
            X.00H r0 = r2.A00
            java.lang.Object r1 = r0.get()
            X.9zh r1 = (X.C199259zh) r1
            X.00H r0 = r2.A01
            java.lang.Object r0 = r0.get()
            X.C18070vi.A0X(r0)
            X.BCT r0 = (X.BCT) r0
            X.9MJ r1 = r1.A01(r0, r6)
            boolean r0 = r1 instanceof X.C170088oi
            if (r0 == 0) goto L_0x0207
            X.00H r0 = r2.A02
            java.lang.Object r2 = r0.get()
            X.8ob r2 = (X.AnonymousClass8ob) r2
            X.8oi r1 = (X.C170088oi) r1
            X.2Da r3 = r1.A00
            X.00H r1 = r2.A00
            java.lang.Object r0 = r1.get()
            X.9rZ r0 = (X.C194339rZ) r0
            boolean r0 = r0.A02(r3, r10)
            if (r0 == 0) goto L_0x0207
            X.00H r0 = r2.A01
            java.lang.Object r0 = r0.get()
            X.9z9 r0 = (X.C198929z9) r0
            boolean r0 = r0.A01(r11)
            if (r0 == 0) goto L_0x0207
            java.lang.Object r0 = r1.get()
            X.9rZ r0 = (X.C194339rZ) r0
            X.1D6 r0 = r0.A00(r3)
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            X.AnonymousClass8ob.A00(r2, r1, r10, r0)
        L_0x0207:
            X.0ve r0 = r4.A0D
            r2 = 12526(0x30ee, float:1.7553E-41)
            boolean r0 = X.C18020vd.A05(r8, r0, r2)
            if (r0 == 0) goto L_0x0596
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A01(r24)
            if (r6 == 0) goto L_0x0596
            X.00H r0 = r4.A0J
            java.lang.Object r0 = r0.get()
            X.2dn r0 = (X.C54222dn) r0
            goto L_0x0533
        L_0x0223:
            r0 = 4656510908468559872(0x409f400000000000, double:2000.0)
            goto L_0x0194
        L_0x022a:
            r0 = 4656510908468559872(0x409f400000000000, double:2000.0)
            goto L_0x0178
        L_0x0231:
            java.lang.String r1 = "suspicious"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d0
            r5 = 3
            goto L_0x00d0
        L_0x023d:
            java.lang.String r1 = "too_many_messages"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d0
            r5 = 2
            goto L_0x00d0
        L_0x0249:
            java.lang.String r1 = "messages_not_helpful"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d0
            r5 = 1
            goto L_0x00d0
        L_0x0254:
            java.lang.String r1 = "psa_banner_block"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x00c6
            r1 = 15
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            X.0z4 r1 = r4.A07
            android.content.SharedPreferences$Editor r5 = X.C19830z4.A00(r1)
            java.lang.String r1 = "wac_consent_shown"
            android.content.SharedPreferences$Editor r1 = r5.putBoolean(r1, r6)
            r1.apply()
            goto L_0x00c6
        L_0x0274:
            java.lang.String r1 = "chat"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0288
            goto L_0x00c6
        L_0x027e:
            java.lang.String r1 = "biz_overflow_menu_block"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0288
            goto L_0x00c6
        L_0x0288:
            r1 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            goto L_0x00c6
        L_0x028f:
            java.lang.String r1 = "biz_account_info_block"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x02a1
            goto L_0x00c6
        L_0x0299:
            java.lang.String r1 = "account_info_block"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x00c6
        L_0x02a1:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            goto L_0x00c6
        L_0x02a7:
            X.2YV r1 = r5.A00
            X.10F r1 = r1.A00
            X.10E r6 = r1.A00
            X.00S r1 = r6.A4b
            java.lang.Object r14 = r1.get()
            X.1KB r14 = (X.AnonymousClass1KB) r14
            X.00S r1 = r6.A90
            java.lang.Object r12 = r1.get()
            X.12L r12 = (X.AnonymousClass12L) r12
            X.00S r1 = r6.A6N
            java.lang.Object r11 = r1.get()
            X.1OZ r11 = (X.AnonymousClass1OZ) r11
            X.00S r1 = r6.A0x
            java.lang.Object r10 = r1.get()
            X.1pj r10 = (X.C37551pj) r10
            X.00S r1 = r6.A2g
            java.lang.Object r9 = r1.get()
            X.1Lf r9 = (X.C24671Lf) r9
            X.00S r1 = r6.ABe
            java.lang.Object r5 = r1.get()
            X.1Ln r5 = (X.C24751Ln) r5
            X.00S r1 = r6.ABl
            java.lang.Object r1 = r1.get()
            X.0z4 r1 = (X.C19830z4) r1
            X.9u0 r6 = new X.9u0
            r15 = r10
            r16 = r2
            r18 = r9
            r19 = r1
            r20 = r5
            r21 = r12
            r22 = r11
            r11 = r6
            r12 = r13
            r13 = r14
            r14 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.1OZ r9 = r6.A0B
            java.lang.String r16 = r9.A0B()
            X.12L r5 = r6.A0A
            X.9hX r10 = r6.A05
            X.1E7 r1 = r10.A02
            boolean r1 = X.C42761yh.A00(r1, r5)
            if (r1 == 0) goto L_0x039d
            r5 = 1
            X.AOS r1 = new X.AOS
            r1.<init>(r6, r5)
            X.AcH r8 = new X.AcH
            r8.<init>(r1, r9)
            boolean r13 = r10.A0A
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "SetChatPsaBlockingStatusHelper/setChatPsaBlockingStatus to "
            r5.append(r1)
            r5.append(r13)
            java.lang.String r1 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1OZ r10 = r8.A00
            java.lang.String r9 = r10.A0B()
            java.lang.String r1 = "iq"
            X.1cX r12 = new X.1cX
            r12.<init>((java.lang.String) r1)
            X.8v4 r6 = X.C173438v4.A00
            java.lang.String r5 = "to"
            X.1MD r1 = new X.1MD
            r1.<init>((com.whatsapp.jid.Jid) r6, (java.lang.String) r5)
            r12.A04(r1)
            java.lang.String r6 = "xmlns"
            java.lang.String r5 = "w:comms:chat"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r6, (java.lang.String) r5)
            r12.A04(r1)
            java.lang.String r5 = "id"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r5, (java.lang.String) r9)
            r12.A04(r1)
            java.lang.String r6 = "type"
            java.lang.String r5 = "set"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r6, (java.lang.String) r5)
            r12.A04(r1)
            java.lang.String r1 = "blocking"
            X.1cX r11 = new X.1cX
            r11.<init>((java.lang.String) r1)
            if (r13 == 0) goto L_0x0399
            java.lang.String r6 = "block"
        L_0x0379:
            java.lang.String r5 = "action"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r5, (java.lang.String) r6)
            r11.A04(r1)
            X.1ca r1 = r11.A03()
            r12.A05(r1)
            X.1ca r12 = r12.A03()
            r15 = 0
            r14 = 339(0x153, float:4.75E-43)
            r11 = r8
            r13 = r9
            r10.A0I(r11, r12, r13, r14, r15)
            goto L_0x00ae
        L_0x0399:
            java.lang.String r6 = "unblock"
            goto L_0x0379
        L_0x039d:
            com.whatsapp.jid.UserJid r15 = r10.A03
            boolean r1 = X.C22971Dz.A0T(r15)
            if (r1 == 0) goto L_0x03b5
            X.1Ln r5 = r6.A09
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid"
            X.C18070vi.A0z(r15, r1)
            r1 = r15
            X.1E1 r1 = (X.AnonymousClass1E1) r1
            com.whatsapp.jid.PhoneUserJid r1 = r5.A0D(r1)
            r10.A00 = r1
        L_0x03b5:
            X.0z4 r5 = r6.A08
            X.9ix r1 = new X.9ix
            r1.<init>(r6)
            X.AcS r8 = new X.AcS
            r8.<init>(r1, r5, r9)
            X.2pq r12 = r6.A06
            java.lang.String r1 = "BlocklistV2SetProtocolHelper/sendSetBlocklistRequest"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1OZ r1 = r8.A01
            r17 = r1
            X.0z4 r1 = r8.A00
            java.lang.String r13 = r1.A0b()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            boolean r11 = r10.A0A
            if (r11 == 0) goto L_0x051d
            java.lang.String r14 = "block"
        L_0x03e2:
            java.lang.String r5 = "action"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r5, (java.lang.String) r14)
            r6.add(r1)
            com.whatsapp.jid.PhoneUserJid r14 = r10.A00
            java.lang.String r5 = "jid"
            if (r14 != 0) goto L_0x03f3
            r14 = r15
        L_0x03f3:
            X.1MD r1 = new X.1MD
            r1.<init>((com.whatsapp.jid.Jid) r14, (java.lang.String) r5)
            r6.add(r1)
            if (r13 == 0) goto L_0x040d
            boolean r1 = X.AnonymousClass1YF.A0T(r13)
            if (r1 != 0) goto L_0x040d
            java.lang.String r5 = "dhash"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r5, (java.lang.String) r13)
            r6.add(r1)
        L_0x040d:
            r1 = 0
            X.1MD[] r1 = new X.AnonymousClass1MD[r1]
            java.lang.Object[] r13 = r6.toArray(r1)
            X.1MD[] r13 = (X.AnonymousClass1MD[]) r13
            if (r11 != 0) goto L_0x0493
            r6 = 0
        L_0x0419:
            java.lang.String r5 = "item"
            X.1ca r1 = new X.1ca
            r1.<init>((X.C29621ca) r6, (java.lang.String) r5, (X.AnonymousClass1MD[]) r13)
            r9.add(r1)
            r13 = 1
            r12 = 0
            if (r11 == 0) goto L_0x0441
            java.lang.String r10 = r10.A07
            if (r10 == 0) goto L_0x0441
            X.1MD[] r6 = new X.AnonymousClass1MD[r13]
            java.lang.String r5 = "source"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r5, (java.lang.String) r10)
            r6[r12] = r1
            java.lang.String r5 = "entry_point"
            X.1ca r1 = new X.1ca
            r1.<init>(r5, r6)
            r9.add(r1)
        L_0x0441:
            r1 = 4
            X.1MD[] r10 = new X.AnonymousClass1MD[r1]
            X.8v4 r6 = X.C173438v4.A00
            java.lang.String r5 = "to"
            X.1MD r1 = new X.1MD
            r1.<init>((com.whatsapp.jid.Jid) r6, (java.lang.String) r5)
            r10[r12] = r1
            java.lang.String r6 = "id"
            X.1MD r5 = new X.1MD
            r1 = r16
            r5.<init>((java.lang.String) r6, (java.lang.String) r1)
            r10[r13] = r5
            java.lang.String r6 = "type"
            java.lang.String r1 = "set"
            X.1MD r5 = new X.1MD
            r5.<init>((java.lang.String) r6, (java.lang.String) r1)
            r1 = 2
            r10[r1] = r5
            java.lang.String r6 = "xmlns"
            java.lang.String r1 = "blocklist"
            X.1MD r5 = new X.1MD
            r5.<init>((java.lang.String) r6, (java.lang.String) r1)
            r1 = 3
            r10[r1] = r5
            X.1ca[] r1 = new X.C29621ca[r12]
            java.lang.Object[] r6 = r9.toArray(r1)
            X.1ca[] r6 = (X.C29621ca[]) r6
            java.lang.String r5 = "iq"
            X.1ca r1 = new X.1ca
            r1.<init>((java.lang.String) r5, (X.AnonymousClass1MD[]) r10, (X.C29621ca[]) r6)
            r14 = 20000(0x4e20, double:9.8813E-320)
            r13 = 2
            r9 = r17
            r10 = r8
            r11 = r1
            r12 = r16
            r9.A0N(r10, r11, r12, r13, r14)
            goto L_0x00ae
        L_0x0493:
            java.lang.Boolean r1 = r10.A04
            if (r1 != 0) goto L_0x050f
            java.lang.String r6 = "none"
        L_0x0499:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.String r5 = "first_message"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r5, (java.lang.String) r6)
            r14.add(r1)
            java.lang.String r6 = r10.A08
            if (r6 == 0) goto L_0x04c4
            java.lang.String r5 = "reason"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r5, (java.lang.String) r6)
            r14.add(r1)
            java.lang.String r6 = r10.A09
            if (r6 == 0) goto L_0x04c4
            java.lang.String r5 = "reason_description"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r5, (java.lang.String) r6)
            r14.add(r1)
        L_0x04c4:
            java.lang.String r6 = r10.A07
            if (r6 == 0) goto L_0x04d2
            java.lang.String r5 = "entry_point"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r5, (java.lang.String) r6)
            r14.add(r1)
        L_0x04d2:
            if (r12 == 0) goto L_0x04fd
            java.lang.String r6 = r12.A03
            X.C18070vi.A0W(r6)
            java.lang.String r5 = "business_discovery_entry_point"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r5, (java.lang.String) r6)
            r14.add(r1)
            java.lang.String r15 = "business_discovery_timestamp"
            long r5 = r12.A00
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r15, (long) r5)
            r14.add(r1)
            java.lang.String r6 = r12.A02
            if (r6 == 0) goto L_0x04fd
            java.lang.String r5 = "business_discovery_id"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r5, (java.lang.String) r6)
            r14.add(r1)
        L_0x04fd:
            r1 = 0
            X.1MD[] r1 = new X.AnonymousClass1MD[r1]
            java.lang.Object[] r5 = r14.toArray(r1)
            X.1MD[] r5 = (X.AnonymousClass1MD[]) r5
            java.lang.String r1 = "biz_opt_out"
            X.1ca r6 = new X.1ca
            r6.<init>(r1, r5)
            goto L_0x0419
        L_0x050f:
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0519
            java.lang.String r6 = "true"
            goto L_0x0499
        L_0x0519:
            java.lang.String r6 = "false"
            goto L_0x0499
        L_0x051d:
            java.lang.String r14 = "unblock"
            goto L_0x03e2
        L_0x0522:
            r6 = 10
            X.3C4 r5 = new X.3C4
            r1 = r24
            r5.<init>(r10, r1, r11, r6)
            r9.A00(r5)
            goto L_0x0037
        L_0x0530:
            r11 = r3
            goto L_0x0013
        L_0x0533:
            X.00H r0 = r0.A00     // Catch:{ Exception -> 0x054a }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x054a }
            X.2Lf r0 = (X.C48112Lf) r0     // Catch:{ Exception -> 0x054a }
            java.lang.Object r0 = r0.A04(r6)     // Catch:{ Exception -> 0x054a }
            X.A1A r0 = (X.A1A) r0     // Catch:{ Exception -> 0x054a }
            if (r0 == 0) goto L_0x0550
            X.2Qf r0 = r0.A01
            java.lang.String r5 = r0.toString()
            goto L_0x0551
        L_0x054a:
            r1 = move-exception
            java.lang.String r0 = "IntegrityDiscoveryEntryPointController/getEntryPoint"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0550:
            r5 = 0
        L_0x0551:
            java.lang.Object r4 = r12.get()
            X.A5M r4 = (X.A5M) r4
            X.00H r0 = r4.A0D
            java.lang.Object r1 = r0.get()
            X.2dg r1 = (X.C54152dg) r1
            X.0ve r0 = r1.A02
            boolean r0 = X.C18020vd.A05(r8, r0, r2)
            r3 = 0
            if (r0 == 0) goto L_0x0574
            X.2Li r0 = r1.A00
            java.lang.Object r0 = r0.A02(r6)
            X.2rP r0 = (X.C62442rP) r0
            if (r0 == 0) goto L_0x0574
            java.lang.String r3 = r0.A02
        L_0x0574:
            X.2Hb r2 = new X.2Hb
            r2.<init>()
            java.lang.String r0 = r6.user
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00 = r0
            r2.A02 = r5
            r2.A01 = r3
            X.00H r0 = r4.A0H
            java.lang.Object r0 = r0.get()
            X.A8x r0 = (X.C20136A8x) r0
            X.18K r0 = r0.A08
            r0.CC7(r2)
        L_0x0596:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37551pj.A03(android.app.Activity, X.3Kn, X.1pj, X.9hX, boolean):void");
    }

    public static final void A04(Activity activity, C72073Kn r15, C37551pj r16, AnonymousClass1E7 r17, Integer num, Integer num2, String str, String str2, String str3, boolean z, boolean z2) {
        C72073Kn r11;
        Boolean bool;
        AnonymousClass1E7 r1 = r17;
        UserJid userJid = (UserJid) r1.A06(UserJid.class);
        C72073Kn r13 = r15;
        if (userJid != null) {
            boolean z3 = z;
            Activity activity2 = activity;
            C37551pj r14 = r16;
            if (z2) {
                r11 = new C66332y0(activity2, r13, r14, r1, z3);
            } else {
                r11 = new C92914i7(r15, 2);
            }
            C72073Kn r112 = r11;
            String str4 = str;
            if (!z || str == null || r14.A0B.A05(userJid) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(!r14.A0C.A08(userJid));
            }
            r14.A05(activity2, r112, new C188509hX(r1, userJid, bool, num, num2, str3, str4, str2, (List) null, z3));
        } else if (r15 != null) {
            r15.C3p(false);
        }
    }

    public final LinkedHashMap A09() {
        String string = C37531ph.A00(this.A01).getString("biz_block_reasons", (String) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(string == null || string.length() == 0)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                C18070vi.A0X(keys);
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put(next, obj);
                }
            } catch (JSONException unused) {
            }
        }
        return linkedHashMap;
    }

    public final void A0D() {
        C19830z4 r3 = this.A07;
        C19830z4.A00(r3).putString("block_list_v2_dhash", (String) null).apply();
        C19830z4.A00(r3).remove("block_list_receive_time").apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r4.equals(r1) != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r1.equals(r2) == false) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E() {
        /*
            r16 = this;
            r3 = r16
            X.1ph r5 = r3.A01
            android.content.SharedPreferences r1 = X.C37531ph.A00(r5)
            java.lang.String r6 = "biz_block_reasons_language"
            r0 = 0
            java.lang.String r2 = r1.getString(r6, r0)
            X.0vb r7 = r3.A08
            java.lang.String r1 = r7.A05()
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0022
            boolean r1 = r1.equals(r2)
            r0 = 1
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r2 = 0
            if (r0 == 0) goto L_0x0084
            android.content.SharedPreferences r4 = X.C37531ph.A00(r5)
            java.lang.String r1 = "biz_block_reasons_country"
            r0 = 0
            java.lang.String r4 = r4.getString(r1, r0)
            if (r4 == 0) goto L_0x0049
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0049
            java.lang.String r1 = r7.A04()
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0084
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x0084
        L_0x0049:
            r10 = 1
        L_0x004a:
            android.content.SharedPreferences r1 = X.C37531ph.A00(r5)
            java.lang.String r0 = "biz_block_reasons_api_back_off_days"
            int r0 = r1.getInt(r0, r2)
            if (r0 < 0) goto L_0x0129
            X.11P r0 = r3.A06
            long r8 = X.AnonymousClass11P.A01(r0)
            android.content.SharedPreferences r6 = X.C37531ph.A00(r5)
            java.lang.String r4 = "biz_block_reasons_api_cooling_timestamp"
            r0 = 0
            long r6 = r6.getLong(r4, r0)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0129
            if (r10 == 0) goto L_0x0082
            X.18O r1 = r3.A0P
            X.18Q r0 = X.AnonymousClass18O.A1C
            int r4 = r1.A04(r0)
            android.content.SharedPreferences r1 = X.C37531ph.A00(r5)
            java.lang.String r0 = "biz_block_reasons_version"
            int r0 = r1.getInt(r0, r2)
            if (r4 <= r0) goto L_0x0129
        L_0x0082:
            monitor-enter(r3)
            goto L_0x00aa
        L_0x0084:
            r10 = 0
            android.content.SharedPreferences r0 = X.C37531ph.A00(r5)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "biz_block_reasons"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "biz_block_reasons_version"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            android.content.SharedPreferences$Editor r1 = r0.remove(r6)
            java.lang.String r0 = "biz_block_reasons_country"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            r5.A01(r2)
            goto L_0x004a
        L_0x00aa:
            X.00H r0 = r3.A0I     // Catch:{ all -> 0x0125 }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x0125 }
            X.370 r10 = (X.AnonymousClass370) r10     // Catch:{ all -> 0x0125 }
            X.00H r6 = r10.A00     // Catch:{ all -> 0x0125 }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0125 }
            X.1OZ r0 = (X.AnonymousClass1OZ) r0     // Catch:{ all -> 0x0125 }
            java.lang.String r12 = r0.A0B()     // Catch:{ all -> 0x0125 }
            r7 = 2
            X.1MD[] r9 = new X.AnonymousClass1MD[r7]     // Catch:{ all -> 0x0125 }
            java.lang.String r4 = "name"
            java.lang.String r1 = "biz_block_reasons"
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x0125 }
            r0.<init>((java.lang.String) r4, (java.lang.String) r1)     // Catch:{ all -> 0x0125 }
            r9[r2] = r0     // Catch:{ all -> 0x0125 }
            java.lang.String r1 = "v"
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x0125 }
            r0.<init>((java.lang.String) r1, (int) r7)     // Catch:{ all -> 0x0125 }
            r8 = 1
            r9[r8] = r0     // Catch:{ all -> 0x0125 }
            java.lang.String r0 = "mobile_config"
            X.1ca r5 = new X.1ca     // Catch:{ all -> 0x0125 }
            r5.<init>(r0, r9)     // Catch:{ all -> 0x0125 }
            r0 = 4
            X.1MD[] r4 = new X.AnonymousClass1MD[r0]     // Catch:{ all -> 0x0125 }
            java.lang.String r1 = "id"
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x0125 }
            r0.<init>((java.lang.String) r1, (java.lang.String) r12)     // Catch:{ all -> 0x0125 }
            r4[r2] = r0     // Catch:{ all -> 0x0125 }
            X.8v4 r2 = X.C173438v4.A00     // Catch:{ all -> 0x0125 }
            java.lang.String r1 = "to"
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x0125 }
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r1)     // Catch:{ all -> 0x0125 }
            r4[r8] = r0     // Catch:{ all -> 0x0125 }
            java.lang.String r2 = "type"
            java.lang.String r1 = "get"
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x0125 }
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ all -> 0x0125 }
            r4[r7] = r0     // Catch:{ all -> 0x0125 }
            java.lang.String r2 = "xmlns"
            java.lang.String r0 = "w:biz"
            X.1MD r1 = new X.1MD     // Catch:{ all -> 0x0125 }
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ all -> 0x0125 }
            r0 = 3
            r4[r0] = r1     // Catch:{ all -> 0x0125 }
            java.lang.String r0 = "iq"
            X.1ca r11 = new X.1ca     // Catch:{ all -> 0x0125 }
            r11.<init>((X.C29621ca) r5, (java.lang.String) r0, (X.AnonymousClass1MD[]) r4)     // Catch:{ all -> 0x0125 }
            java.lang.Object r9 = r6.get()     // Catch:{ all -> 0x0125 }
            X.1OZ r9 = (X.AnonymousClass1OZ) r9     // Catch:{ all -> 0x0125 }
            r14 = 20000(0x4e20, double:9.8813E-320)
            r13 = 234(0xea, float:3.28E-43)
            r9.A0N(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0125 }
            goto L_0x0128
        L_0x0125:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0128:
            monitor-exit(r3)
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37551pj.A0E():void");
    }

    public final void A0L(C57732jY r23) {
        C29621ca r11;
        AnonymousClass11P r15 = this.A06;
        AnonymousClass00H r8 = this.A0f;
        Object obj = r8.get();
        C18070vi.A0X(obj);
        AnonymousClass377 r13 = new AnonymousClass377(this, r15, this.A07, (AnonymousClass1OZ) obj, r23);
        Log.i("BlocklistGetProtocolHelper/sendGetBlocklistRequest");
        AnonymousClass1OZ r9 = r13.A03;
        String A0B2 = r9.A0B();
        String A0b2 = r13.A02.A0b();
        if (A0b2 == null || A0b2.length() == 0) {
            r11 = null;
        } else {
            r11 = new C29621ca("item", new AnonymousClass1MD[]{new AnonymousClass1MD("dhash", A0b2)});
        }
        C173438v4 r6 = C173438v4.A00;
        r9.A0I(r13, new C29621ca(r11, "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) r6, "to"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1MD("xmlns", "blocklist")}), A0B2, 198, 0);
        if (C18020vd.A05(C18040vf.A02, this.A0X.A00, 1844)) {
            Object obj2 = r8.get();
            C18070vi.A0X(obj2);
            C20962AcG acG = new C20962AcG(new AOS(this, 0), (AnonymousClass1OZ) obj2);
            Log.i("GetChatPsaBlockingStatusHelper/sendGetChatPsaBlockStatusRequest");
            AnonymousClass1OZ r92 = acG.A00;
            String A0B3 = r92.A0B();
            C29591cX r7 = new C29591cX("iq");
            r7.A04(new AnonymousClass1MD((Jid) r6, "to"));
            r7.A04(new AnonymousClass1MD("xmlns", "w:comms:chat"));
            r7.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B3));
            r7.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
            C29591cX r2 = new C29591cX("query");
            r2.A05(new C29591cX("blocking_status").A03());
            r7.A05(r2.A03());
            r92.A0I(acG, r7.A03(), A0B3, 340, 0);
        }
    }

    public final synchronized void A0M(String str, Map map, Set set) {
        String str2;
        UserJid A002;
        synchronized (this) {
            AnonymousClass1Cd r0 = this.A0V;
            r0.A06();
            Set set2 = set;
            if (r0.A08) {
                set2.addAll(A02(this, set2));
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Set A11 = C29431cG.A11(set2);
            Set set3 = this.A0K;
            A11.removeAll(set3);
            Set A112 = C29431cG.A11(set3);
            A112.removeAll(set2);
            if (C18020vd.A05(C18040vf.A02, this.A0X.A00, 1844) && (A002 = A00(this)) != null) {
                A112.remove(A002);
                set2.add(A002);
            }
            linkedHashSet.addAll(A11);
            linkedHashSet.addAll(A112);
            AtomicBoolean atomicBoolean = this.A0M;
            boolean z = atomicBoolean.get();
            boolean A0N2 = A0N();
            atomicBoolean.set(true);
            AnonymousClass00H r3 = this.A0d;
            ((C58362kZ) r3.get()).A01(new C21451AkI(this, map, 5));
            if (!linkedHashSet.isEmpty()) {
                if (A0N2 && z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("old block list: ");
                    String arrays = Arrays.toString(set3.toArray(new UserJid[0]));
                    C18070vi.A0X(arrays);
                    sb.append(arrays);
                    Log.e(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("new block list: ");
                    String arrays2 = Arrays.toString(set2.toArray(new UserJid[0]));
                    C18070vi.A0X(arrays2);
                    sb2.append(arrays2);
                    Log.e(sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("added: ");
                    String arrays3 = Arrays.toString(A11.toArray(new UserJid[0]));
                    C18070vi.A0X(arrays3);
                    sb3.append(arrays3);
                    Log.e(sb3.toString());
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("removed: ");
                    String arrays4 = Arrays.toString(A112.toArray(new UserJid[0]));
                    C18070vi.A0X(arrays4);
                    sb4.append(arrays4);
                    Log.e(sb4.toString());
                    if ((!A11.isEmpty()) && (!A112.isEmpty())) {
                        str2 = "Added/Removed";
                    } else if (!A11.isEmpty()) {
                        str2 = "Added";
                    } else {
                        str2 = "Removed";
                    }
                    this.A0O.A0G("block list de-synchronization", str2, true);
                }
                ((C58362kZ) r3.get()).A01(new C21456AkN(this, set2, linkedHashSet, str, 8));
            } else {
                C19830z4 r1 = this.A07;
                C19830z4.A00(r1).putLong("block_list_receive_time", AnonymousClass11P.A01(this.A06)).apply();
                if (!A0N2) {
                    this.A00.A0J(new C21445AkC(this, 26));
                }
            }
        }
    }

    public final boolean A0N() {
        if (((SharedPreferences) this.A07.A00.get()).getLong("block_list_receive_time", 0) != 0) {
            return true;
        }
        return false;
    }

    public final boolean A0O(AnonymousClass1E7 r5, boolean z) {
        UserJid userJid;
        if (r5 != null) {
            C22941Dw r0 = UserJid.Companion;
            userJid = C22941Dw.A01(r5.A0J);
        } else {
            userJid = null;
        }
        if (C18020vd.A05(C18040vf.A02, this.A0D, 978) || !z || r5 == null || userJid == null || !r5.A0C() || !this.A0S.A04(userJid)) {
            return false;
        }
        return true;
    }

    public final boolean A0P(UserJid userJid) {
        Set set;
        if (userJid == null) {
            return false;
        }
        if (C22971Dz.A0S(userJid)) {
            set = ((C132786na) this.A0e.get()).A02;
        } else {
            set = this.A0K;
        }
        return set.contains(userJid);
    }

    public static final UserJid A01(C37551pj r1, UserJid userJid) {
        UserJid A0D2;
        if (C22971Dz.A0Y(userJid)) {
            C24751Ln r12 = r1.A0W;
            C18070vi.A0z(userJid, "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid");
            A0D2 = r12.A0A((PhoneUserJid) userJid);
        } else if (!C22971Dz.A0T(userJid)) {
            return null;
        } else {
            C24751Ln r13 = r1.A0W;
            C18070vi.A0z(userJid, "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid");
            A0D2 = r13.A0D((AnonymousClass1E1) userJid);
        }
        return A0D2;
    }

    public static final void A06(C37551pj r3, UserJid userJid, String str, boolean z) {
        r3.A0K(userJid, z);
        if (r3.A02.A0K(userJid, z)) {
            C19830z4.A00(r3.A07).putString("block_list_v2_dhash", str).apply();
        }
        r3.A00.A0J(new C21451AkI(r3, userJid, 8));
    }

    public static final void A07(C37551pj r2, Collection collection) {
        if (!collection.isEmpty()) {
            r2.A04.notifyAllObservers(new AnonymousClass35V(collection, 12));
        }
    }

    public C37551pj(C37491pd r43, AnonymousClass190 r44, AnonymousClass1KB r45, AnonymousClass18O r46, C23651Hc r47, C37531ph r48, C37501pe r49, AnonymousClass1M9 r50, C24671Lf r51, C37511pf r52, AnonymousClass1PM r53, C24921Me r54, AnonymousClass11P r55, C19830z4 r56, C18000vb r57, AnonymousClass1M4 r58, AnonymousClass1TB r59, AnonymousClass121 r60, C37541pi r61, AnonymousClass1R3 r62, AnonymousClass1Cd r63, AnonymousClass1NK r64, C24751Ln r65, C18030ve r66, AnonymousClass12L r67, AnonymousClass18K r68, AnonymousClass1PQ r69, C24901Mc r70, AnonymousClass10I r71, AnonymousClass00H r72, AnonymousClass00H r73, AnonymousClass00H r74, AnonymousClass00H r75, AnonymousClass00H r76, AnonymousClass00H r77, AnonymousClass00H r78, AnonymousClass00H r79, AnonymousClass00H r80, AnonymousClass00H r81, AnonymousClass00H r82) {
        AnonymousClass11P r30 = r55;
        C18070vi.A0d(r30, 1);
        C18030ve r22 = r66;
        C18070vi.A0d(r22, 2);
        C37491pd r41 = r43;
        C18070vi.A0d(r41, 3);
        AnonymousClass1KB r39 = r45;
        C18070vi.A0d(r39, 4);
        AnonymousClass190 r40 = r44;
        C18070vi.A0d(r40, 5);
        AnonymousClass10I r18 = r71;
        C18070vi.A0d(r18, 6);
        AnonymousClass1NK r24 = r64;
        C18070vi.A0d(r24, 7);
        AnonymousClass18K r20 = r68;
        C18070vi.A0d(r20, 8);
        AnonymousClass18O r38 = r46;
        C18070vi.A0d(r38, 9);
        C24901Mc r19 = r70;
        C18070vi.A0d(r19, 10);
        AnonymousClass1TB r27 = r59;
        C18070vi.A0d(r27, 11);
        AnonymousClass12L r21 = r67;
        C18070vi.A0d(r21, 12);
        AnonymousClass00H r17 = r72;
        C18070vi.A0d(r17, 13);
        AnonymousClass00H r16 = r73;
        C18070vi.A0d(r16, 14);
        C24921Me r15 = r54;
        C18070vi.A0d(r15, 15);
        AnonymousClass1M9 r34 = r50;
        C18070vi.A0d(r34, 16);
        C18000vb r28 = r57;
        C18070vi.A0d(r28, 17);
        C37501pe r35 = r49;
        C18070vi.A0d(r35, 18);
        AnonymousClass00H r14 = r74;
        C18070vi.A0d(r14, 19);
        AnonymousClass00H r13 = r75;
        C18070vi.A0d(r13, 20);
        C24671Lf r33 = r51;
        C18070vi.A0d(r33, 21);
        C24751Ln r23 = r65;
        C18070vi.A0d(r23, 22);
        AnonymousClass1R3 r25 = r62;
        C18070vi.A0d(r25, 23);
        C23651Hc r37 = r47;
        C18070vi.A0d(r37, 24);
        AnonymousClass00H r11 = r76;
        C18070vi.A0d(r11, 25);
        AnonymousClass00H r10 = r77;
        C18070vi.A0d(r10, 26);
        AnonymousClass1Cd r12 = r63;
        C18070vi.A0d(r12, 27);
        C19830z4 r29 = r56;
        C18070vi.A0d(r29, 28);
        AnonymousClass1PM r31 = r53;
        C18070vi.A0d(r31, 29);
        AnonymousClass121 r26 = r60;
        C18070vi.A0d(r26, 30);
        AnonymousClass1PQ r9 = r69;
        C18070vi.A0d(r9, 31);
        AnonymousClass00H r6 = r78;
        C18070vi.A0d(r6, 32);
        AnonymousClass00H r5 = r79;
        C18070vi.A0d(r5, 33);
        AnonymousClass00H r4 = r80;
        C18070vi.A0d(r4, 34);
        C37511pf r32 = r52;
        C18070vi.A0d(r32, 35);
        AnonymousClass1M4 r8 = r58;
        C18070vi.A0d(r8, 36);
        C37531ph r36 = r48;
        C18070vi.A0d(r36, 37);
        C37541pi r7 = r61;
        C18070vi.A0d(r7, 38);
        AnonymousClass00H r3 = r81;
        C18070vi.A0d(r3, 39);
        AnonymousClass00H r2 = r82;
        C18070vi.A0d(r2, 40);
        this.A06 = r30;
        this.A0D = r22;
        this.A0N = r41;
        this.A00 = r39;
        this.A0O = r40;
        this.A0G = r18;
        this.A0C = r24;
        this.A0E = r20;
        this.A0P = r38;
        this.A0F = r19;
        this.A0A = r27;
        this.A0X = r21;
        this.A0b = r17;
        this.A0f = r16;
        this.A05 = r15;
        this.A03 = r34;
        this.A08 = r28;
        this.A02 = r35;
        this.A0c = r14;
        this.A0d = r13;
        this.A04 = r33;
        this.A0W = r23;
        this.A0B = r25;
        this.A0Q = r37;
        this.A0H = r11;
        this.A0a = r10;
        this.A0V = r12;
        this.A07 = r29;
        this.A0S = r31;
        this.A0T = r26;
        this.A0Y = r9;
        this.A0I = r6;
        this.A0Z = r5;
        this.A0e = r4;
        this.A0R = r32;
        this.A09 = r8;
        this.A01 = r36;
        this.A0U = r7;
        this.A0g = r3;
        this.A0J = r2;
    }
}
