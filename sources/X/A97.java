package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

public final class A97 {
    public static final A97 A00 = new Object();

    public static final AnonymousClass9DP A00(C29621ca r7, C29621ca r8, C62672rm r9) {
        AnonymousClass9DG A04;
        if (AnonymousClass8BR.A1Q(r7, r9) && (A04 = A04(r7, r8, r9)) != null) {
            C22470B9c[] b9cArr = new C22470B9c[4];
            b9cArr[0] = C21193Ag2.A00;
            b9cArr[1] = C21194Ag3.A00;
            b9cArr[2] = C21195Ag4.A00;
            Object A06 = r9.A06(r7, "IQErrorInternalServerError|IQErrorServiceUnavailable|IQErrorPartialServerError|IQErrorFallbackServer", C18070vi.A0O(C21196Ag5.A00, b9cArr, 3), AnonymousClass8BS.A1b(1, 0));
            if (A06 != null) {
                return new AnonymousClass9DP(r7, A04, (C178309Cp) A06);
            }
        }
        return null;
    }

    public static final AnonymousClass9DP A01(C29621ca r4, C62672rm r5) {
        UserJid A0L;
        AnonymousClass9DO A0B;
        if (!r5.A09(r4, "sub_group_suggestion") || (A0L = AnonymousClass8BY.A0L(r4, r5, new String[]{"creator"})) == null || (A0B = A0B(r4, r5)) == null) {
            return null;
        }
        return new AnonymousClass9DP(A0L, r4, A0B);
    }

    public static final AnonymousClass9CY A02(C29621ca r9, C62672rm r10) {
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "display_name";
        C62672rm r1 = r10;
        String str = (String) r1.A05(r9, String.class, C108975cc.A0X(), 128L, (Object) null, A1Y, false);
        if (str == null) {
            return null;
        }
        return new AnonymousClass9CY(r9, str);
    }

    public static final AnonymousClass9CY A03(C29621ca r5, C62672rm r6) {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "lid";
        String A07 = r6.A07(r5, C18070vi.A0O("pn", A1Z, 1), new String[]{"addressing_mode"});
        if (A07 == null) {
            return null;
        }
        return new AnonymousClass9CY(r5, A07);
    }

    public static final AnonymousClass9DG A04(C29621ca r18, C29621ca r19, C62672rm r20) {
        String str;
        C29621ca r13 = r18;
        C62672rm r4 = r20;
        if (!r4.A09(r13, "iq")) {
            return null;
        }
        String[] A1Z = AnonymousClass8BS.A1Z(1, 0);
        Class<Jid> cls = Jid.class;
        String[] strArr = new String[1];
        Long A0Z = AnonymousClass8BW.A0Z("to", strArr, 0);
        Long A0j = AnonymousClass8BU.A0j();
        C29621ca r5 = r19;
        Object A05 = r4.A05(r5, cls, A0Z, A0j, (Object) null, strArr, false);
        if (A05 == null) {
            return null;
        }
        C62672rm r12 = r4;
        Long l = A0Z;
        Long l2 = A0j;
        Jid jid = (Jid) r12.A05(r13, cls, l, l2, A05, A1Z, true);
        if (jid == null) {
            return null;
        }
        String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls2 = String.class;
        Object A052 = r4.A05(r5, cls2, A0Z, A0j, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        if (A052 == null) {
            return null;
        }
        Class<String> cls3 = cls2;
        String str2 = (String) r12.A05(r13, cls3, l, l2, A052, strArr2, true);
        if (str2 == null || (str = (String) r12.A05(r13, cls3, l, l2, "error", AnonymousClass8BS.A1a(1, 0), false)) == null) {
            return null;
        }
        return new AnonymousClass9DG(jid, r13, str2, str);
    }

    public static final AnonymousClass9DG A05(C29621ca r18, C29621ca r19, C62672rm r20) {
        String str;
        C29621ca r13 = r18;
        C62672rm r4 = r20;
        if (!r4.A09(r13, "iq")) {
            return null;
        }
        String[] A1Z = AnonymousClass8BS.A1Z(1, 0);
        Class<Jid> cls = Jid.class;
        String[] strArr = new String[1];
        Long A0Z = AnonymousClass8BW.A0Z("to", strArr, 0);
        Long A0j = AnonymousClass8BU.A0j();
        C29621ca r5 = r19;
        Object A05 = r4.A05(r5, cls, A0Z, A0j, (Object) null, strArr, false);
        if (A05 == null) {
            return null;
        }
        C62672rm r12 = r4;
        Long l = A0Z;
        Long l2 = A0j;
        Jid jid = (Jid) r12.A05(r13, cls, l, l2, A05, A1Z, true);
        if (jid == null) {
            return null;
        }
        String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls2 = String.class;
        Object A052 = r4.A05(r5, cls2, A0Z, A0j, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        if (A052 == null) {
            return null;
        }
        Class<String> cls3 = cls2;
        String str2 = (String) r12.A05(r13, cls3, l, l2, A052, strArr2, true);
        if (str2 == null || (str = (String) r12.A05(r13, cls3, l, l2, "result", AnonymousClass8BS.A1a(1, 0), false)) == null) {
            return null;
        }
        return new AnonymousClass9DG(jid, r13, str2, str);
    }

    public static final AnonymousClass9DJ A06(C29621ca r25, C62672rm r26) {
        C29621ca r7 = r25;
        C62672rm r6 = r26;
        if (!r6.A09(r7, "notification")) {
            return null;
        }
        String[] A1Z = AnonymousClass8BS.A1Z(1, 0);
        Long A0i = AnonymousClass8BU.A0i();
        Long A0j = AnonymousClass8BU.A0j();
        AnonymousClass1EC r2 = (AnonymousClass1EC) r6.A05(r7, AnonymousClass1EC.class, A0i, A0j, (Object) null, A1Z, false);
        if (r2 == null) {
            return null;
        }
        Class<String> cls = String.class;
        Long A0X = C108975cc.A0X();
        Long A0k = AnonymousClass8BV.A0k();
        String str = (String) r6.A05(r7, cls, A0X, A0k, (Object) null, new String[]{"notify"}, false);
        C62672rm r19 = r6;
        C29621ca r20 = r7;
        Long l = A0j;
        String str2 = (String) r19.A05(r20, cls, A0i, l, "w:gp2", AnonymousClass8BS.A1a(1, 0), false);
        if (str2 != null && r6.A09(r7, "notification")) {
            Class cls2 = Long.TYPE;
            Long A0L = C17890vO.A0L();
            Number number = (Number) r19.A05(r20, cls2, A0L, l, (Object) null, new String[]{"t"}, false);
            if (number != null) {
                long longValue = number.longValue();
                String str3 = (String) r6.A05(r7, cls, A0i, A0j, (Object) null, AnonymousClass8BS.A1W(1, 0), false);
                if (str3 != null) {
                    return new AnonymousClass9DJ(r2, r7, new AnonymousClass9DC(r7, (Long) r19.A05(r20, cls2, A0L, A0k, (Object) null, new String[]{"offline"}, false), str3, longValue), str, str2);
                }
            }
        }
        return null;
    }

    public static final AnonymousClass9E0 A07(C29621ca r15, C62672rm r16) {
        C29621ca r4 = r15;
        C62672rm r3 = r16;
        if (r3.A09(r15, "error")) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            String str = (String) r3.A05(r4, String.class, A0i, A0j, "bad-request", A1U, false);
            if (str != null) {
                Number number = (Number) r3.A05(r4, Long.TYPE, A0i, A0j, AnonymousClass8BV.A0h(), AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new AnonymousClass9E0(r4, str, 0, number.longValue());
                }
            }
        }
        return null;
    }

    public static final AnonymousClass9EA A08(C29621ca r12, C62672rm r13) {
        C29621ca r5 = r12;
        C62672rm r4 = r13;
        if (!AnonymousClass8BR.A1R(r12, r13)) {
            return null;
        }
        String str = (String) r4.A05(r5, String.class, C108975cc.A0X(), 40L, (Object) null, AnonymousClass8BS.A1U(1), false);
        if (str == null) {
            return null;
        }
        Number number = (Number) r4.A05(r5, Long.TYPE, AnonymousClass8BV.A0h(), 499L, (Object) null, AnonymousClass8BS.A1S(1), false);
        if (number != null) {
            return new AnonymousClass9EA(r12, str, number.longValue());
        }
        return null;
    }

    public static final AnonymousClass9EA A09(C29621ca r12, C62672rm r13) {
        C29621ca r5 = r12;
        C62672rm r4 = r13;
        if (AnonymousClass8BR.A1R(r12, r13)) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            String str = (String) r4.A05(r5, String.class, A0i, A0j, "forbidden", A1U, false);
            if (str != null) {
                Number number = (Number) r4.A05(r5, Long.TYPE, A0i, A0j, 403L, AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new AnonymousClass9EA(r12, str, number.longValue());
                }
            }
        }
        return null;
    }

    public static final AnonymousClass9DO A0A(C29621ca r10, C62672rm r11) {
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "phone_number";
        C62672rm r2 = r11;
        UserJid userJid = (UserJid) r2.A05(r10, UserJid.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), (Object) null, A1Y, false);
        if (userJid == null) {
            return null;
        }
        return new AnonymousClass9DO(userJid, r10, 23);
    }

    public static final AnonymousClass9DO A0B(C29621ca r10, C62672rm r11) {
        C29621ca r3 = r10;
        C62672rm r2 = r11;
        if (!r11.A09(r10, "sub_group_suggestion")) {
            return null;
        }
        AnonymousClass1EC r1 = (AnonymousClass1EC) r2.A05(r3, AnonymousClass1EC.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), (Object) null, AnonymousClass8BS.A1Y(1, 0), false);
        if (r1 == null) {
            return null;
        }
        return new AnonymousClass9DO(r1, r10);
    }

    public static final C178299Co A0D(C29621ca r9, C62672rm r10) {
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "parent_group_jid";
        C62672rm r1 = r10;
        AnonymousClass1EC r12 = (AnonymousClass1EC) r1.A05(r9, AnonymousClass1EC.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), (Object) null, A1Y, false);
        if (r12 == null) {
            return null;
        }
        return new C178299Co(r12, r9, 0);
    }

    public static final AnonymousClass9CS A0E(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (r12.A09(r11, "sub_group_suggestion")) {
            if (r3.A05(r4, String.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "404", AnonymousClass8BS.A1b(1, 0), false) != null) {
                return new AnonymousClass9CS(r11);
            }
        }
        return null;
    }

    public static final AnonymousClass9E9 A0F(C29621ca r12, C62672rm r13) {
        C29621ca r5 = r12;
        C62672rm r4 = r13;
        if (AnonymousClass8BR.A1R(r12, r13)) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            String str = (String) r4.A05(r5, String.class, A0i, A0j, "item-not-found", A1U, false);
            if (str != null) {
                Number number = (Number) r4.A05(r5, Long.TYPE, A0i, A0j, 404L, AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new AnonymousClass9E9(r12, str, number.longValue());
                }
            }
        }
        return null;
    }

    public static final AnonymousClass9EC A0G(C29621ca r12, C62672rm r13) {
        C29621ca r5 = r12;
        C62672rm r4 = r13;
        if (AnonymousClass8BR.A1R(r12, r13)) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            String str = (String) r4.A05(r5, String.class, A0i, A0j, "locked", A1U, false);
            if (str != null) {
                Number number = (Number) r4.A05(r5, Long.TYPE, A0i, A0j, 423L, AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new AnonymousClass9EC(r12, str, number.longValue());
                }
            }
        }
        return null;
    }

    public static final AnonymousClass9EB A0H(C29621ca r12, C62672rm r13) {
        C29621ca r5 = r12;
        C62672rm r4 = r13;
        if (AnonymousClass8BR.A1R(r12, r13)) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            String str = (String) r4.A05(r5, String.class, A0i, A0j, "not-authorized", A1U, false);
            if (str != null) {
                Number number = (Number) r4.A05(r5, Long.TYPE, A0i, A0j, 401L, AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new AnonymousClass9EB(r12, str, number.longValue());
                }
            }
        }
        return null;
    }

    public static final AnonymousClass9E1 A0I(C29621ca r4, C62672rm r5) {
        UserJid A0L;
        if (!r5.A09(r4, "participant") || (A0L = AnonymousClass8BY.A0L(r4, r5, AnonymousClass8BS.A1Y(1, 0))) == null) {
            return null;
        }
        return new AnonymousClass9E1(A0L, r4);
    }

    public static final AnonymousClass9E2 A0C(C29621ca r6, C62672rm r7) {
        AnonymousClass9E1 A0I;
        UserJid A0L;
        if (!r7.A09(r6, "participant") || (A0I = A0I(r6, r7)) == null || !r7.A09(r6, "participant") || (A0L = AnonymousClass8BY.A0L(r6, r7, new String[]{"lid"})) == null) {
            return null;
        }
        return new AnonymousClass9E2(r6, new AnonymousClass9DO(A0L, r6, 22), A0I);
    }
}
