package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;

public final class A8Z {
    public static final A8Z A00 = new Object();

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
        String str2 = (String) r11.A05(r12, cls, A0Z, A0j, "result", AnonymousClass8BS.A1a(1, 0), false);
        if (str2 == null) {
            return null;
        }
        return new AnonymousClass9DG(jid, r12, str, str2, 10);
    }

    public static final AnonymousClass9DD A01(C29621ca r15, C62672rm r16) {
        ArrayList A0u;
        C29621ca A0m;
        Class<String> cls = String.class;
        Long A0X = C108975cc.A0X();
        Long A0f = AnonymousClass8BV.A0f();
        C29621ca r7 = r15;
        C62672rm r6 = r16;
        String str = (String) r6.A05(r7, cls, A0X, A0f, (Object) null, new String[]{"money", "value"}, false);
        if (str == null) {
            return null;
        }
        String str2 = (String) r6.A05(r7, cls, A0X, A0f, (Object) null, new String[]{"money", "offset"}, false);
        if (str2 == null) {
            return null;
        }
        String str3 = (String) r6.A05(r7, cls, A0X, A0f, (Object) null, new String[]{"money", "currency"}, false);
        if (str3 == null || (A0u = AnonymousClass8BU.A0u(r15, r6, new C21280AhR(8), new String[]{"money"})) == null || (A0m = AnonymousClass8BR.A0m(A0u, 0)) == null) {
            return null;
        }
        return new AnonymousClass9DD(A0m, r15, str, str2, str3);
    }

    public static final C178359Cu A02(C29621ca r23, C29621ca r24, C62672rm r25) {
        ArrayList A08;
        C29621ca A0m;
        C29621ca r14 = r23;
        C62672rm r5 = r25;
        if (!r5.A09(r14, "iq")) {
            return null;
        }
        String[] A1Z = AnonymousClass8BS.A1Z(1, 0);
        Class<Jid> cls = Jid.class;
        String[] strArr = new String[1];
        Long A0Z = AnonymousClass8BW.A0Z("to", strArr, 0);
        Long A0j = AnonymousClass8BU.A0j();
        C29621ca r6 = r24;
        Object A05 = r5.A05(r6, cls, A0Z, A0j, (Object) null, strArr, false);
        if (A05 == null) {
            return null;
        }
        C62672rm r13 = r5;
        Long l = A0Z;
        Long l2 = A0j;
        Jid jid = (Jid) r13.A05(r14, cls, l, l2, A05, A1Z, true);
        if (jid == null) {
            return null;
        }
        String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls2 = String.class;
        Object A052 = r5.A05(r6, cls2, A0Z, A0j, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
        if (A052 == null) {
            return null;
        }
        Class<String> cls3 = cls2;
        if (r13.A05(r14, cls3, l, l2, A052, strArr2, true) == null) {
            return null;
        }
        Long A0X = C108975cc.A0X();
        String str = (String) r13.A05(r14, cls3, A0X, l2, (Object) null, new String[]{"error", "text"}, false);
        if (str == null) {
            return null;
        }
        Number number = (Number) r13.A05(r14, Long.TYPE, A0X, l2, (Object) null, new String[]{"error", "code"}, false);
        if (number != null) {
            long longValue = number.longValue();
            if (!(r5.A05(r14, cls2, A0Z, A0j, "error", AnonymousClass8BS.A1a(1, 0), false) == null || (A08 = r13.A08(r14, new C21280AhR(17), new String[]{"error"}, 1, 1)) == null || (A0m = AnonymousClass8BR.A0m(A08, 0)) == null)) {
                return new C178359Cu(jid, A0m, r14, str, longValue);
            }
        }
        return null;
    }

    public static final AnonymousClass9D9 A03(C29621ca r22, C62672rm r23) {
        AnonymousClass9DN r3;
        C29621ca r5 = r22;
        C62672rm r4 = r23;
        if (!r4.A09(r5, "custom_payment_method")) {
            return null;
        }
        String[] strArr = new String[2];
        strArr[0] = "pay_on_delivery";
        String A07 = r4.A07(r5, C18070vi.A0O("pix_key", strArr, 1), AnonymousClass8BS.A1a(1, 0));
        if (A07 == null) {
            return null;
        }
        String[] strArr2 = new String[2];
        strArr2[0] = "p2m";
        String A072 = r4.A07(r5, C18070vi.A0O("p2p", strArr2, 1), new String[]{"flow"});
        Class<String> cls = String.class;
        String str = (String) r4.A05(r5, cls, C108975cc.A0X(), AnonymousClass8BV.A0f(), (Object) null, new String[]{"created"}, false);
        String[] strArr3 = new String[1];
        String str2 = (String) r4.A05(r5, cls, AnonymousClass8BW.A0Z("country", strArr3, 0), AnonymousClass8BU.A0j(), "BR", strArr3, false);
        AnonymousClass9CZ A04 = A04(r5, r4);
        if (A04 == null) {
            return null;
        }
        String[] A1Y = C17880vN.A1Y();
        C29621ca A0Z = AnonymousClass8BT.A0Z(r5, "metadata_info", A1Y);
        if (A0Z == null) {
            AnonymousClass8BY.A11(r5, r4, A1Y, 0);
        } else {
            String[] A1Y2 = C17880vN.A1Y();
            A1Y2[0] = "metadata";
            ArrayList A08 = r4.A08(A0Z, new C21280AhR(18), A1Y2, 1, 5);
            if (A08 != null) {
                r3 = new AnonymousClass9DN(r5, new AnonymousClass9DN(A0Z, (List) A08, 9));
                return new AnonymousClass9D9(r5, r3, A04, A07, A072, str, str2);
            }
        }
        r3 = null;
        return new AnonymousClass9D9(r5, r3, A04, A07, A072, str, str2);
    }

    public static final AnonymousClass9CZ A04(C29621ca r15, C62672rm r16) {
        String[] strArr = new String[2];
        strArr[0] = "0";
        C29621ca r8 = r15;
        C62672rm r7 = r16;
        r7.A07(r15, C18070vi.A0O("1", strArr, 1), new String[]{"p2p-eligible"});
        r7.A07(r15, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"p2m-eligible"});
        Class<String> cls = String.class;
        Long A0X = C108975cc.A0X();
        String str = (String) r7.A05(r8, cls, A0X, AnonymousClass8BV.A0j(), (Object) null, new String[]{"credential-id"}, false);
        if (str == null) {
            return null;
        }
        r7.A05(r8, cls, A0X, AnonymousClass8BV.A0b(), (Object) null, new String[]{"country"}, false);
        r7.A05(r8, cls, A0X, AnonymousClass8BV.A0f(), (Object) null, new String[]{"created"}, false);
        return new AnonymousClass9CZ(r15, str);
    }

    public static final C178249Cj A06(C29621ca r17, C62672rm r18) {
        AnonymousClass9DA A05;
        ArrayList A0u;
        C29621ca A0m;
        C29621ca r12 = r17;
        C62672rm r11 = r18;
        if (!r11.A09(r12, "card")) {
            return null;
        }
        String[] strArr = new String[2];
        strArr[0] = "0";
        if (r11.A07(r12, C18070vi.A0O("1", strArr, 1), new String[]{"verified"}) == null) {
            return null;
        }
        String[] A1a = AnonymousClass8BS.A1a(1, 0);
        Class<String> cls = String.class;
        Long A0i = AnonymousClass8BU.A0i();
        Long A0j = AnonymousClass8BU.A0j();
        if (r11.A05(r12, cls, A0i, A0j, (Object) null, A1a, false) == null) {
            return null;
        }
        if (r11.A05(r12, cls, A0i, A0j, (Object) null, new String[]{"network-type"}, false) == null) {
            return null;
        }
        String[] strArr2 = new String[4];
        strArr2[0] = "ACTIVE";
        strArr2[1] = "EXPIRED";
        strArr2[2] = "SUSPENDED";
        r11.A07(r12, C18070vi.A0O("VOIDED", strArr2, 3), new String[]{"display-state"});
        if (r11.A05(r12, cls, 4L, 4, (Object) null, new String[]{"last4"}, false) == null) {
            return null;
        }
        if (!(r11.A05(r12, cls, C17890vO.A0L(), AnonymousClass8BV.A0j(), (Object) null, new String[]{"time-last-added"}, false) == null || (A05 = A05(r12, r11)) == null || !r11.A09(r12, "card"))) {
            if (r11.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"capabilities", "editable"}) != null) {
                if (r11.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"capabilities", "verifiable"}) != null) {
                    if (r11.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"capabilities", "default-eligible"}) != null) {
                        r11.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"capabilities", "default-eligible-p2p"});
                        r11.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"capabilities", "default-eligible-p2m"});
                        String[] A1b = AnonymousClass8BR.A1b();
                        A1b[0] = "DISABLED";
                        A1b[1] = "ENABLED";
                        if (r11.A07(r12, C18070vi.A0O("REQUIRES_VERIFICATION", A1b, 2), new String[]{"capabilities", "p2p-send"}) != null) {
                            String[] A1b2 = AnonymousClass8BR.A1b();
                            A1b2[0] = "DISABLED";
                            if (r11.A07(r12, C18070vi.A0N("ENABLED", "REQUIRES_VERIFICATION", A1b2, 1, 2), new String[]{"capabilities", "p2p-receive"}) != null) {
                                String[] A1b3 = AnonymousClass8BR.A1b();
                                A1b3[0] = "DISABLED";
                                if (r11.A07(r12, C18070vi.A0N("ENABLED", "REQUIRES_VERIFICATION", A1b3, 1, 2), new String[]{"capabilities", "p2m-send"}) != null) {
                                    String[] A1b4 = AnonymousClass8BR.A1b();
                                    A1b4[0] = "DISABLED";
                                    if (!(r11.A07(r12, C18070vi.A0N("ENABLED", "REQUIRES_VERIFICATION", A1b4, 1, 2), new String[]{"capabilities", "p2m-receive"}) == null || (A0u = AnonymousClass8BU.A0u(r12, r11, new C21280AhR(7), new String[]{"capabilities"})) == null || (A0m = AnonymousClass8BR.A0m(A0u, 0)) == null)) {
                                        return new C178249Cj(r12, A05, new C178159Ca(A0m, r12));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final AnonymousClass9DA A05(C29621ca r18, C62672rm r19) {
        String A07;
        String[] strArr = new String[2];
        strArr[0] = "0";
        C29621ca r9 = r18;
        C62672rm r3 = r19;
        String A072 = r3.A07(r9, C18070vi.A0O("1", strArr, 1), new String[]{"default-credit"});
        if (A072 == null || (A07 = r3.A07(r9, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"default-debit"})) == null) {
            return null;
        }
        String A073 = r3.A07(r9, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"default-credit-p2p"});
        String A074 = r3.A07(r9, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"default-credit-p2m"});
        String A075 = r3.A07(r9, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"default-debit-p2p"});
        String A076 = r3.A07(r9, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"default-debit-p2m"});
        AnonymousClass9CZ A04 = A04(r9, r3);
        if (A04 != null) {
            return new AnonymousClass9DA(r9, A04, A072, A07, A073, A074, A075, A076, 0);
        }
        return null;
    }
}
