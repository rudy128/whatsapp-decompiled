package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

public final class A8H {
    public static final A8H A00 = new Object();

    public static final AnonymousClass9DG A00(C29621ca r21, C29621ca r22, C62672rm r23) {
        C29621ca r12 = r21;
        C62672rm r3 = r23;
        if (!r3.A09(r12, "iq")) {
            return null;
        }
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls = String.class;
        String[] strArr2 = new String[1];
        Long A0Z = AnonymousClass8BW.A0Z(PublicKeyCredentialControllerUtility.JSON_KEY_ID, strArr2, 0);
        Long A0j = AnonymousClass8BU.A0j();
        C29621ca r4 = r22;
        Object A05 = r3.A05(r4, cls, A0Z, A0j, (Object) null, strArr2, false);
        if (A05 == null) {
            return null;
        }
        C62672rm r11 = r3;
        String str = (String) r11.A05(r12, cls, A0Z, A0j, A05, strArr, true);
        if (str == null) {
            return null;
        }
        String[] A1Z = AnonymousClass8BS.A1Z(1, 0);
        Class<Jid> cls2 = Jid.class;
        Object A052 = r3.A05(r4, cls2, A0Z, A0j, (Object) null, AnonymousClass8BS.A1X(1, 0), false);
        if (A052 == null) {
            return null;
        }
        Jid jid = (Jid) r3.A05(r12, cls2, A0Z, A0j, A052, A1Z, true);
        if (jid == null) {
            return null;
        }
        String str2 = (String) r11.A05(r12, cls, A0Z, A0j, "error", AnonymousClass8BS.A1a(1, 0), false);
        if (str2 == null) {
            return null;
        }
        return new AnonymousClass9DG(jid, r12, str, str2, 19);
    }

    public static final AnonymousClass9DG A01(C29621ca r21, C29621ca r22, C62672rm r23) {
        C29621ca r12 = r21;
        C62672rm r3 = r23;
        if (!r3.A09(r12, "iq")) {
            return null;
        }
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls = String.class;
        String[] strArr2 = new String[1];
        Long A0Z = AnonymousClass8BW.A0Z(PublicKeyCredentialControllerUtility.JSON_KEY_ID, strArr2, 0);
        Long A0j = AnonymousClass8BU.A0j();
        C29621ca r4 = r22;
        Object A05 = r3.A05(r4, cls, A0Z, A0j, (Object) null, strArr2, false);
        if (A05 == null) {
            return null;
        }
        C62672rm r11 = r3;
        String str = (String) r11.A05(r12, cls, A0Z, A0j, A05, strArr, true);
        if (str == null) {
            return null;
        }
        String[] A1Z = AnonymousClass8BS.A1Z(1, 0);
        Class<Jid> cls2 = Jid.class;
        Object A052 = r3.A05(r4, cls2, A0Z, A0j, (Object) null, AnonymousClass8BS.A1X(1, 0), false);
        if (A052 == null) {
            return null;
        }
        Jid jid = (Jid) r3.A05(r12, cls2, A0Z, A0j, A052, A1Z, true);
        if (jid == null) {
            return null;
        }
        String str2 = (String) r11.A05(r12, cls, A0Z, A0j, "result", AnonymousClass8BS.A1a(1, 0), false);
        if (str2 == null) {
            return null;
        }
        return new AnonymousClass9DG(jid, r12, str, str2, 20);
    }

    public static final AnonymousClass4A0 A02(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (AnonymousClass8BR.A1R(r11, r12)) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            if (r3.A05(r4, String.class, A0i, A0j, "bad-request", A1U, false) != null) {
                Number number = (Number) r3.A05(r4, Long.TYPE, A0i, A0j, AnonymousClass8BV.A0h(), AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new AnonymousClass4A0(r11, number.longValue());
                }
            }
        }
        return null;
    }

    public static final AnonymousClass4A2 A03(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (AnonymousClass8BR.A1R(r11, r12)) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            if (r3.A05(r4, String.class, A0i, A0j, "forbidden", A1U, false) != null) {
                Number number = (Number) r3.A05(r4, Long.TYPE, A0i, A0j, 403L, AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new AnonymousClass4A2(r11, number.longValue());
                }
            }
        }
        return null;
    }

    public static final AnonymousClass4A1 A04(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (AnonymousClass8BR.A1R(r11, r12)) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            if (r3.A05(r4, String.class, A0i, A0j, "internal-server-error", A1U, false) != null) {
                Number number = (Number) r3.A05(r4, Long.TYPE, A0i, A0j, AnonymousClass8BV.A0i(), AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new AnonymousClass4A1(r11, number.longValue());
                }
            }
        }
        return null;
    }

    public static final C178629Dv A05(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (AnonymousClass8BR.A1R(r11, r12)) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            if (r3.A05(r4, String.class, A0i, A0j, "item-not-found", A1U, false) != null) {
                Number number = (Number) r3.A05(r4, Long.TYPE, A0i, A0j, 404L, AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new C178629Dv(r11, number.longValue());
                }
            }
        }
        return null;
    }
}
