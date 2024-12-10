package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;

/* renamed from: X.908  reason: invalid class name */
public final class AnonymousClass908 extends C195919u9 {
    public long A00;
    public String A01;
    public boolean A02 = true;
    public boolean A03;
    public final C189289iq A04;
    public final AnonymousClass1KB A05;
    public final AnonymousClass118 A06;
    public final C18030ve A07;
    public final C20051A4x A08;
    public final AnonymousClass10I A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final List A0G = AnonymousClass000.A13();
    public final List A0H = AnonymousClass000.A13();
    public final Set A0I;
    public final AnonymousClass11E A0J;
    public final AnonymousClass00H A0K;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass908(X.C189289iq r19, X.AnonymousClass1KB r20, X.AnonymousClass11E r21, X.AnonymousClass118 r22, X.C18030ve r23, X.C20051A4x r24, X.C176198zw r25, X.AnonymousClass10I r26, X.AnonymousClass00H r27, X.AnonymousClass00H r28, X.AnonymousClass00H r29, X.AnonymousClass00H r30, X.AnonymousClass00H r31, X.AnonymousClass00H r32, X.AnonymousClass00H r33, java.util.Set r34) {
        /*
            r18 = this;
            r2 = 1
            r15 = r23
            X.C18070vi.A0d(r15, r2)
            r13 = r22
            r16 = r20
            r14 = r21
            r0 = r16
            X.C18070vi.A0p(r0, r13, r14)
            r0 = 5
            r10 = r27
            X.C18070vi.A0d(r10, r0)
            r9 = r28
            r0 = r25
            r11 = r26
            r12 = r24
            r17 = r19
            r1 = r17
            X.C18070vi.A0x(r1, r0, r9, r12, r11)
            r6 = r31
            r5 = r32
            r3 = r34
            r8 = r29
            r7 = r30
            X.C18070vi.A0y(r8, r7, r6, r5, r3)
            r1 = 16
            r4 = r33
            X.C18070vi.A0d(r4, r1)
            r1 = r18
            r1.<init>(r0)
            r1.A07 = r15
            r0 = r16
            r1.A05 = r0
            r1.A06 = r13
            r1.A0J = r14
            r1.A0C = r10
            r0 = r17
            r1.A04 = r0
            r1.A0D = r9
            r1.A08 = r12
            r1.A09 = r11
            r1.A0E = r8
            r1.A0K = r7
            r1.A0F = r6
            r1.A0B = r5
            r1.A0I = r3
            r1.A0A = r4
            r1.A02 = r2
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r1.A0H = r0
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r1.A0G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass908.<init>(X.9iq, X.1KB, X.11E, X.118, X.0ve, X.A4x, X.8zw, X.10I, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, java.util.Set):void");
    }

    public static final void A00(C195639tf r26, BBM bbm, AnonymousClass908 r28, Map map) {
        String str;
        int i;
        String str2;
        Number number;
        AnonymousClass908 r7 = r28;
        r7.A0K.get();
        SecretKey A0q = AnonymousClass8BX.A0q();
        byte[] bArr = new byte[16];
        C22691Cv.A00().nextBytes(bArr);
        C72453Mb.A1S(A0q);
        C195639tf r11 = r26;
        Map map2 = r11.A05;
        Object obj = map2.get("extension_id");
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) obj;
        Object obj2 = map2.get("message_id");
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        String A0f = AnonymousClass8BW.A0f("session_id", map2);
        String A0f2 = AnonymousClass8BW.A0f("business_jid", map2);
        Object obj3 = map2.get("flow_json_version");
        if (!(obj3 instanceof Integer) || (number = (Number) obj3) == null) {
            i = 0;
        } else {
            i = number.intValue();
        }
        int hashCode = str3.hashCode();
        String A0f3 = AnonymousClass8BW.A0f("extension_status", map2);
        AnonymousClass00H r13 = r7.A0E;
        AnonymousClass8BR.A0V(r13).A0C(A0f3, hashCode);
        Map map3 = map;
        BBM bbm2 = bbm;
        AU5 au5 = new AU5(r11, bbm2, r7, str, A0f, AnonymousClass8BW.A0f("current_screen", map3), str3, A0f2, map2, map3, A0q, bArr, hashCode, i);
        Object obj4 = map3.get("action_payload");
        C18070vi.A0z(obj4, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Object obj5 = ((Map) obj4).get("business_payload");
        C18070vi.A0z(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        Map map4 = (Map) obj5;
        C20081A6h A0V = AnonymousClass8BR.A0V(r13);
        Object obj6 = map4.get("screen");
        if (!(obj6 instanceof String) || (str2 = (String) obj6) == null) {
            str2 = "UNKNOWN";
        }
        A0V.A06(hashCode, "source_screen_id", str2);
        String A0p = AnonymousClass8BU.A0p("flow_message_version", map2);
        String A0p2 = AnonymousClass8BU.A0p("extension_id", map2);
        String A0p3 = AnonymousClass8BU.A0p("business_jid", map2);
        Object A0X = AnonymousClass8BS.A0X("user_locale", "null cannot be cast to non-null type kotlin.String", map2);
        Object A0X2 = AnonymousClass8BS.A0X("flow_token", "null cannot be cast to non-null type kotlin.String", map2);
        String A0e = AnonymousClass8BX.A0e("version", map2);
        AS4 A002 = r7.A04.A00(au5, A0p, A0p2, new B1W(bbm2, r7, map2));
        UserJid A0X3 = AnonymousClass8BR.A0X(A0p3);
        LinkedHashMap A13 = C17880vN.A13();
        A13.putAll(map4);
        if (!C18020vd.A05(C18040vf.A02, r7.A07, 5374) || "100".equalsIgnoreCase(A0e)) {
            A13.put("user_locale", A0X);
        }
        A13.put("flow_token", A0X2);
        A13.put("version", C181319Qa.A00(A0e));
        if (!"100".equalsIgnoreCase(A0e)) {
            byte[] bArr2 = new byte[16];
            int i2 = 0;
            do {
                bArr2[i2] = (byte) (bArr[i2] ^ -1);
                i2++;
            } while (i2 < 16);
            bArr = bArr2;
        }
        r7.A01 = AnonymousClass8BX.A0e("screen", map4);
        ((C192049ng) r7.A0C.get()).A01(A002, A0X3, AnonymousClass8BW.A0m(A13), A0p, A0p2, A0q, bArr, r7.A03, true, !r7.A02);
    }

    public static final void A02(BBM bbm, AnonymousClass908 r7, String str, String str2, Map map, Map map2, boolean z) {
        Object obj;
        Map map3;
        Object obj2;
        String str3;
        Object obj3;
        String str4;
        Map map4;
        AnonymousClass118 r1 = r7.A06;
        String A0G2 = C18070vi.A0G(r1, 2131890448);
        if (!r7.A0J.A09()) {
            A0G2 = C18070vi.A0G(r1, 2131890447);
            str = "extensions-data-exchange-no-network";
        }
        String str5 = null;
        if (z || !((str3 = r7.A01) == null || str3.length() == 0)) {
            Object obj4 = map.get("data");
            if (!(obj4 instanceof Map) || (map3 = (Map) obj4) == null) {
                obj = null;
            } else {
                obj = map3.get("error_message");
            }
            if ((obj instanceof String) && obj != null) {
                str = "extensions-error-from-layout";
            }
            r7.A05.CGP(new AnonymousClass7RO(bbm, r7, map, 39));
        } else {
            if (!(map.get("error") instanceof C19976A1m)) {
                Object obj5 = map.get("error");
                if (!(obj5 instanceof Map) || (map4 = (Map) obj5) == null) {
                    obj3 = null;
                } else {
                    obj3 = map4.get("message");
                }
                if ((obj3 instanceof String) && (str4 = (String) obj3) != null) {
                    A0G2 = str4;
                }
                map = C108975cc.A0h("error", C19976A1m.A00(A0G2));
            }
            r7.A05.CGP(new AnonymousClass7RN(bbm, map, 19));
        }
        if (map2 != null) {
            obj2 = map2.get("extension_id");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof String) && (str5 = (String) obj2) != null) {
            AnonymousClass00H r6 = r7.A0E;
            C20081A6h A0V = AnonymousClass8BR.A0V(r6);
            int hashCode = str5.hashCode();
            List list = r7.A0H;
            List list2 = r7.A0G;
            C18070vi.A0j(list, list2);
            if (AnonymousClass000.A1a(list)) {
                A0V.A0D(list, hashCode, "bypassed_error_types");
            }
            if (AnonymousClass000.A1a(list2)) {
                A0V.A0D(list2, hashCode, "bypassed_error_messages");
            }
            AnonymousClass8BR.A0V(r6).A05(hashCode, "forward_network_request_count", r7.A00);
        }
        if (str != null) {
            if (str5 != null) {
                AnonymousClass00H r12 = r7.A0E;
                C172058si A0T = AnonymousClass8BR.A0T(r12);
                int hashCode2 = str5.hashCode();
                A0T.A0E(hashCode2, str, str2);
                AnonymousClass8BR.A0T(r12).A0F(hashCode2, 3);
            }
            ((C20052A4y) r7.A0A.get()).A03(str, str2, map2);
        }
    }

    public static final void A01(BBM bbm, AnonymousClass908 r8, String str, String str2, Map map, Map map2) {
        Object obj;
        String str3;
        LinkedHashMap A082 = AnonymousClass1D7.A08(map);
        Object obj2 = A082.get("action_payload");
        C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        LinkedHashMap A083 = AnonymousClass1D7.A08((Map) obj2);
        Object obj3 = A083.get("business_payload");
        C18070vi.A0z(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        LinkedHashMap A084 = AnonymousClass1D7.A08((Map) obj3);
        AnonymousClass1D6[] r1 = new AnonymousClass1D6[2];
        C72463Mc.A1H("error", str, r1);
        C108985cd.A1G("error_message", str2, r1);
        A084.put("data", AnonymousClass1D7.A0B(r1));
        A083.put("business_payload", A084);
        A082.put("action_payload", A083);
        Iterator it = r8.A0I.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C180639Ni r2 = (C180639Ni) obj;
            if (r2 instanceof AnonymousClass9C3) {
                str3 = "navigate";
            } else if (r2 instanceof AnonymousClass9C2) {
                str3 = "error_propagation_action";
            } else if (r2 instanceof AnonymousClass9C0) {
                str3 = "data_exchange_DUMMY";
            } else {
                str3 = "complete";
            }
            if (str3.equals("error_propagation_action")) {
                break;
            }
        }
        C180639Ni r3 = (C180639Ni) obj;
        if (r3 != null) {
            r8.A0A.get();
            r3.A00(new C21144AfF(bbm, r8, map2), C20052A4y.A01(A082, map2));
        }
    }
}
