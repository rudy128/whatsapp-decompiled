package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.A8c  reason: case insensitive filesystem */
public final class C20119A8c {
    public int A00;
    public C20130A8q A01;
    public final AnonymousClass1KB A02;
    public final C26911Ty A03;
    public final AnonymousClass1M9 A04;
    public final AnonymousClass1PM A05;
    public final C27191Vc A06;
    public final AnonymousClass11P A07;
    public final AnonymousClass118 A08;
    public final C196109uT A09;
    public final C18000vb A0A;
    public final C18030ve A0B;
    public final AnonymousClass10I A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E = C217517g.A00(32870);
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N = C217517g.A00(49488);
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AtomicBoolean A0R = C108965cb.A0w();
    public final C56582hh A0S;
    public final AnonymousClass11E A0T;
    public final C30801eX A0U;
    public final AnonymousClass122 A0V;
    public final C170638qQ A0W;
    public final AnonymousClass00H A0X;
    public final AnonymousClass00H A0Y;

    public static final void A03(C20119A8c a8c, A2N a2n, B9G b9g, C22521BBe bBe, C193199ph r16, String str, Map map, boolean z) {
        ADL adl;
        Bitmap bitmap;
        String str2;
        C20119A8c a8c2 = a8c;
        a8c.A01 = a8c.A0S.A00(r16);
        A2N a2n2 = a2n;
        UserJid userJid = a2n.A02;
        HashMap A11 = C17880vN.A11();
        C42741yf A012 = a8c.A05.A01(userJid);
        if (!(A012 == null || (str2 = A012.A08) == null)) {
            A11.put("business_name", str2);
        }
        if (C18020vd.A05(C18040vf.A02, a8c.A0B, 4078)) {
            AnonymousClass1E7 A0E2 = a8c.A04.A0E(userJid);
            Context context = a8c.A08.A00;
            float dimension = context.getResources().getDimension(2131168737);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166219);
            if (A0E2 != null) {
                bitmap = a8c2.A06.BX4(context, A0E2, "PhoenixFlowsManager.getBusinessProfileLogo", dimension, dimensionPixelSize);
            } else {
                bitmap = null;
            }
            ByteArrayOutputStream A15 = C108945cZ.A15();
            if (bitmap != null) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, A15);
            }
            String encodeToString = Base64.encodeToString(A15.toByteArray(), 0);
            if (encodeToString != null) {
                A11.put("business_profile_logo", encodeToString);
            }
        }
        C20130A8q a8q = a8c2.A01;
        if (a8q == null) {
            C18070vi.A11("fdsManager");
            throw null;
        }
        a8q.A0F(A11);
        A00(a8c2, a2n2, 0, !A07(a2n2.A06, a2n2.A04));
        AnonymousClass8BR.A0V(a8c2.A0L).A0B(Integer.valueOf(a8c2.A00), "startFlow");
        boolean z2 = z;
        if (z) {
            adl = new ADL(1000, "PHOENIX", false);
        } else {
            adl = null;
        }
        C20130A8q a8q2 = a8c2.A01;
        if (a8q2 == null) {
            C18070vi.A11("fdsManager");
            throw null;
        }
        a8q2.A0C(new C20901AbH(a8c2, b9g, 0), new C20905AbL(bBe, a2n2, a8c2, 1), adl, a2n2.A05, str, a2n2.A03, map, z2);
    }

    public static final boolean A07(String str, String str2) {
        try {
            if (Long.parseLong(str) >= 3) {
                if (str2 == null || str2.length() == 0 || "navigate".equals(str2)) {
                    return true;
                }
                return false;
            }
        } catch (NumberFormatException e) {
            Log.w(C17900vP.A0C("SFlowsLogger/PhoenixFlowsManager/isFlowInitWithoutDataChannel()/Error - ", AnonymousClass000.A10(), e));
        }
        return false;
    }

    public static final void A00(C20119A8c a8c, A2N a2n, int i, boolean z) {
        int A002;
        String str;
        A2N a2n2 = a2n;
        UserJid userJid = a2n.A02;
        String str2 = a2n.A08;
        C20119A8c a8c2 = a8c;
        AnonymousClass206 A022 = AnonymousClass8BR.A0N(a8c.A0Y).A02(AnonymousClass205.A01(userJid, str2, false));
        JSONObject A15 = C17880vN.A15();
        String A012 = A4O.A00.A01(a8c.A09, str2, false);
        String A0Y2 = AnonymousClass8BY.A0Y(a2n2.A09);
        C18070vi.A0X(A0Y2);
        try {
            A15.put("cta", "galaxy_message");
            A15.put("flow_id", a2n2.A05);
            A15.put("extensions_message_id", A012);
            A15.put("session_id", A0Y2);
            A15.put("data_channel_navigation", z);
            A15.put("extension_restored_from_cache", a2n2.A0C ? 1 : 0);
        } catch (JSONException e) {
            Log.w(C17900vP.A0C("SFlowsLogger/PhoenixFlowsManager/reportWamFlowsStructuredMessageInteraction()/Error - ", AnonymousClass000.A10(), e));
        }
        int A003 = AnonymousClass9Q5.A00(a8c.A05.A01(userJid));
        C60082nM A032 = a8c.A0U.A03(userJid);
        if (A022 == null) {
            A002 = 1;
        } else {
            A002 = C62242r5.A00(A022, a8c.A0J);
        }
        A0M a0m = (A0M) a8c.A0Q.get();
        String A0H2 = C18070vi.A0H(A15);
        Integer valueOf = Integer.valueOf(A003);
        String str3 = null;
        if (A032 != null) {
            str3 = A032.A08;
            str = A032.A05;
        } else {
            str = null;
        }
        a0m.A01(userJid, A022, valueOf, A0H2, str3, str, str2, i);
        HashMap A11 = C17880vN.A11();
        A11.put("business_jid", userJid.user);
        A11.put("ext_session_id", A0Y2);
        A11.put("ext_message_id", A012);
        A11.put("biz_platform", valueOf);
        A11.put("message_media_type", Integer.valueOf(A002));
        C20130A8q a8q = a8c2.A01;
        if (a8q == null) {
            C18070vi.A11("fdsManager");
            throw null;
        } else {
            a8q.A0F(A11);
        }
    }

    public static final void A01(C20119A8c a8c, A2N a2n, C195709tm r10, C22521BBe bBe) {
        C170638qQ r2 = a8c.A0W;
        String str = a2n.A05;
        String str2 = r10.A07;
        if (str2 != null) {
            r2.A0C(new C20608ARs(a8c, a2n, r10, bBe), str, str2, r10.A08, C18070vi.A18(r10.A00, "DRAFT"), false);
            return;
        }
        throw C17890vO.A0K();
    }

    public static final void A02(C20119A8c a8c, A2N a2n, C195709tm r12, C22521BBe bBe) {
        A2N a2n2 = a2n;
        String str = a2n.A05;
        int hashCode = str.hashCode();
        Integer num = AnonymousClass00R.A0C;
        String str2 = a2n.A08;
        String str3 = a2n.A09;
        ((C172038sg) a8c.A0M.get()).A0F(a2n.A02, Boolean.valueOf(a2n.A0B), num, str, str2, str3, hashCode);
        C195709tm r11 = r12;
        boolean A18 = C18070vi.A18(r12.A00, "DRAFT");
        C22521BBe bBe2 = bBe;
        if (!A18) {
            ((C192239o2) a8c.A0H.get()).A00(str, hashCode).A0A(new C21120Aeo(a2n2, a8c, r11, bBe2, 3), a8c.A02.A05);
            return;
        }
        AnonymousClass8BR.A0V(a8c.A0I).A07(hashCode, "psl_cache_hit", false);
        A01(a8c, a2n2, r11, bBe);
    }

    public static final void A04(C20119A8c a8c, A2N a2n, boolean z) {
        AnonymousClass21K r0;
        C20285AEt BPK;
        C20277AEk aEk;
        AnonymousClass206 A022 = AnonymousClass8BR.A0N(a8c.A0Y).A02(AnonymousClass205.A01(a2n.A02, a2n.A08, false));
        Object obj = null;
        if ((A022 instanceof AnonymousClass21K) && (r0 = (AnonymousClass21K) A022) != null && (BPK = r0.BPK()) != null && BPK.A00 == 5 && (aEk = BPK.A06) != null) {
            Iterator it = aEk.A03.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AnonymousClass8BW.A1U(next, "galaxy_message")) {
                    obj = next;
                    break;
                }
            }
            C20253ADl aDl = (C20253ADl) obj;
            if (aDl != null) {
                aDl.A00 = z;
            }
            a8c.A0V.CQw(A022);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C20119A8c r7, X.C22521BBe r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "extensions-features-disabled"
            boolean r6 = r9.equals(r0)
            X.00H r3 = r7.A0L
            if (r6 == 0) goto L_0x0073
            X.A6h r1 = X.AnonymousClass8BR.A0V(r3)
            int r0 = r7.A00
            X.C20081A6h.A01(r1, r0)
            X.00H r4 = r7.A0I
            X.A6h r1 = X.AnonymousClass8BR.A0V(r4)
            int r0 = r10.hashCode()
            X.C20081A6h.A01(r1, r0)
        L_0x0020:
            X.118 r1 = r7.A08
            r0 = 2131890448(0x7f121110, float:1.9415588E38)
            java.lang.String r5 = X.C18070vi.A0G(r1, r0)
            X.11E r0 = r7.A0T
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x005d
            r0 = 2131890447(0x7f12110f, float:1.9415586E38)
        L_0x0034:
            java.lang.String r5 = X.C18070vi.A0G(r1, r0)
        L_0x0038:
            if (r8 == 0) goto L_0x0053
            java.lang.String r1 = "error"
            X.A1m r0 = X.C19976A1m.A00(r5)
            java.util.Map r3 = X.C108975cc.A0h(r1, r0)
            r0 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "ExtensionError"
            X.A1q r0 = new X.A1q
            r0.<init>(r2, r1, r5)
            r8.Btu(r0, r3)
        L_0x0053:
            X.A6h r0 = X.AnonymousClass8BR.A0V(r4)
            X.19T r0 = r0.A04
            r0.CGw()
            return
        L_0x005d:
            java.lang.String r0 = "extensions-banned-id-error"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x006f
            if (r6 != 0) goto L_0x006f
            java.lang.String r0 = "extensions-integrity-check-failed"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0038
        L_0x006f:
            r0 = 2131890453(0x7f121115, float:1.9415598E38)
            goto L_0x0034
        L_0x0073:
            X.A6h r2 = X.AnonymousClass8BR.A0V(r3)
            int r1 = r7.A00
            java.lang.String r0 = "error_message"
            r2.A06(r1, r0, r9)
            X.A6h r1 = X.AnonymousClass8BR.A0V(r3)
            int r0 = r7.A00
            r3 = 3
            r1.A08(r0, r3)
            X.00H r4 = r7.A0I
            X.8si r2 = X.AnonymousClass8BR.A0T(r4)
            int r1 = r10.hashCode()
            r0 = 0
            r2.A0E(r1, r9, r0)
            X.8si r0 = X.AnonymousClass8BR.A0T(r4)
            r0.A0F(r1, r3)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20119A8c.A05(X.A8c, X.BBe, java.lang.String, java.lang.String):void");
    }

    public static final boolean A06(C20119A8c a8c, A2N a2n, C195709tm r14, C185899dK r15, C22521BBe bBe) {
        String str;
        Integer A012 = ((C198939zA) a8c.A0X.get()).A01(r14, r15.A01, a2n.A06);
        if (A012.intValue() == 0) {
            return false;
        }
        if (A012 == AnonymousClass00R.A0C) {
            str = "extensions-metadata-unknown-version";
        } else {
            str = "extensions-metadata-not-compatible";
        }
        String str2 = a2n.A05;
        A05(a8c, bBe, str, str2);
        ((A25) a8c.A0F.get()).A03(a8c.A05, (A0M) C18070vi.A0E(a8c.A0Q), a2n.A02, Boolean.valueOf(a2n.A0C), "galaxy_message", str2, a2n.A08, a2n.A09, str, (String) null);
        return true;
    }

    public final void A08(UserJid userJid, C193199ph r10, String str, String str2, boolean z) {
        this.A01 = this.A0S.A00(r10);
        String str3 = str;
        if (z) {
            int hashCode = str.hashCode();
            UserJid userJid2 = userJid;
            ((C172038sg) this.A0M.get()).A0F(userJid2, AnonymousClass000.A0h(), AnonymousClass00R.A01, str3, str2, r10.A00, hashCode);
        }
        ((C192239o2) this.A0H.get()).A00(str, str.hashCode()).A0A(new C21114Aei(1, str, this), this.A02.A05);
    }

    public C20119A8c(C56582hh r32, AnonymousClass1KB r33, C26911Ty r34, AnonymousClass11E r35, AnonymousClass1M9 r36, AnonymousClass1PM r37, C27191Vc r38, AnonymousClass11P r39, AnonymousClass118 r40, C196109uT r41, C18000vb r42, C30801eX r43, AnonymousClass122 r44, C18030ve r45, C170638qQ r46, AnonymousClass10I r47, AnonymousClass00H r48, AnonymousClass00H r49, AnonymousClass00H r50, AnonymousClass00H r51, AnonymousClass00H r52, AnonymousClass00H r53, AnonymousClass00H r54, AnonymousClass00H r55, AnonymousClass00H r56, AnonymousClass00H r57, AnonymousClass00H r58, AnonymousClass00H r59, AnonymousClass00H r60, AnonymousClass00H r61) {
        AnonymousClass10I r16 = r47;
        C18030ve r18 = r45;
        AnonymousClass1KB r29 = r33;
        AnonymousClass11P r0 = r39;
        AnonymousClass118 r23 = r40;
        C18070vi.A0w(r0, r18, r29, r23, r16);
        AnonymousClass00H r15 = r48;
        AnonymousClass00H r14 = r49;
        AnonymousClass00H r13 = r50;
        C56582hh r30 = r32;
        AnonymousClass122 r19 = r44;
        C18070vi.A0x(r30, r15, r19, r14, r13);
        AnonymousClass00H r12 = r51;
        AnonymousClass00H r11 = r52;
        C26911Ty r28 = r34;
        AnonymousClass11E r27 = r35;
        AnonymousClass1PM r25 = r37;
        C18070vi.A0y(r12, r25, r28, r11, r27);
        AnonymousClass00H r9 = r54;
        C170638qQ r17 = r46;
        AnonymousClass00H r10 = r53;
        C196109uT r22 = r41;
        C18070vi.A0t(r10, r9, r17, r22);
        AnonymousClass00H r6 = r57;
        AnonymousClass00H r7 = r56;
        AnonymousClass00H r8 = r55;
        C18000vb r21 = r42;
        C18070vi.A0u(r8, r21, r7, r6);
        AnonymousClass00H r4 = r59;
        AnonymousClass00H r5 = r58;
        AnonymousClass1M9 r26 = r36;
        C27191Vc r24 = r38;
        C18070vi.A0v(r24, r26, r5, r4);
        C30801eX r20 = r43;
        C18070vi.A0d(r20, 28);
        AnonymousClass00H r3 = r60;
        C18070vi.A0d(r3, 29);
        AnonymousClass00H r2 = r61;
        C18070vi.A0d(r2, 30);
        this.A07 = r0;
        this.A0B = r18;
        this.A02 = r29;
        this.A08 = r23;
        this.A0C = r16;
        this.A0S = r30;
        this.A0P = r15;
        this.A0V = r19;
        this.A0F = r14;
        this.A0O = r13;
        this.A0Y = r12;
        this.A05 = r25;
        this.A03 = r28;
        this.A0G = r11;
        this.A0T = r27;
        this.A0H = r10;
        this.A0L = r9;
        this.A0W = r17;
        this.A09 = r22;
        this.A0Q = r8;
        this.A0A = r21;
        this.A0K = r7;
        this.A0I = r6;
        this.A06 = r24;
        this.A04 = r26;
        this.A0M = r5;
        this.A0X = r4;
        this.A0U = r20;
        this.A0D = r3;
        this.A0J = r2;
    }
}
