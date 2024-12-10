package X;

import java.util.ArrayList;

public final class A6w {
    public static final A6w A00 = new Object();

    public static final AnonymousClass9CZ A00(C29621ca r15, C62672rm r16) {
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

    public static final C178249Cj A01(C29621ca r22, C62672rm r23) {
        String A07;
        String A072;
        ArrayList A0u;
        C29621ca A0m;
        C29621ca r12 = r22;
        C62672rm r2 = r23;
        if (!r2.A09(r12, "card")) {
            return null;
        }
        String[] strArr = new String[2];
        strArr[0] = "0";
        if (r2.A07(r12, C18070vi.A0O("1", strArr, 1), new String[]{"verified"}) == null) {
            return null;
        }
        String[] A1a = AnonymousClass8BS.A1a(1, 0);
        Class<String> cls = String.class;
        Long A0i = AnonymousClass8BU.A0i();
        Long A0j = AnonymousClass8BU.A0j();
        C62672rm r16 = r2;
        C29621ca r17 = r12;
        if (r16.A05(r17, cls, A0i, A0j, (Object) null, A1a, false) == null) {
            return null;
        }
        if (r16.A05(r17, cls, A0i, A0j, (Object) null, new String[]{"network-type"}, false) == null) {
            return null;
        }
        String[] strArr2 = new String[4];
        strArr2[0] = "ACTIVE";
        strArr2[1] = "EXPIRED";
        strArr2[2] = "SUSPENDED";
        r2.A07(r12, C18070vi.A0O("VOIDED", strArr2, 3), new String[]{"display-state"});
        if (r16.A05(r17, cls, 4L, 4, (Object) null, new String[]{"last4"}, false) == null) {
            return null;
        }
        if (!(r16.A05(r17, cls, C17890vO.A0L(), AnonymousClass8BV.A0j(), (Object) null, new String[]{"time-last-added"}, false) == null || (A07 = r2.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"default-credit"})) == null || (A072 = r2.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"default-debit"})) == null)) {
            String A073 = r2.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"default-credit-p2p"});
            String A074 = r2.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"default-credit-p2m"});
            String A075 = r2.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"default-debit-p2p"});
            String A076 = r2.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"default-debit-p2m"});
            AnonymousClass9CZ A002 = A00(r12, r2);
            if (A002 != null) {
                AnonymousClass9DA r11 = new AnonymousClass9DA(r12, A002, A07, A072, A073, A074, A075, A076, 1);
                if (r2.A09(r12, "card")) {
                    if (r2.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"capabilities", "editable"}) != null) {
                        if (r2.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"capabilities", "verifiable"}) != null) {
                            if (r2.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"capabilities", "default-eligible"}) != null) {
                                r2.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"capabilities", "default-eligible-p2p"});
                                r2.A07(r12, AnonymousClass8BX.A0o("0", "1", 2, 1), new String[]{"capabilities", "default-eligible-p2m"});
                                String[] A1b = AnonymousClass8BR.A1b();
                                A1b[0] = "DISABLED";
                                A1b[1] = "ENABLED";
                                if (r2.A07(r12, C18070vi.A0O("REQUIRES_VERIFICATION", A1b, 2), new String[]{"capabilities", "p2p-send"}) != null) {
                                    String[] A1b2 = AnonymousClass8BR.A1b();
                                    A1b2[0] = "DISABLED";
                                    if (r2.A07(r12, C18070vi.A0N("ENABLED", "REQUIRES_VERIFICATION", A1b2, 1, 2), new String[]{"capabilities", "p2p-receive"}) != null) {
                                        String[] A1b3 = AnonymousClass8BR.A1b();
                                        A1b3[0] = "DISABLED";
                                        if (r2.A07(r12, C18070vi.A0N("ENABLED", "REQUIRES_VERIFICATION", A1b3, 1, 2), new String[]{"capabilities", "p2m-send"}) != null) {
                                            String[] A1b4 = AnonymousClass8BR.A1b();
                                            A1b4[0] = "DISABLED";
                                            if (!(r2.A07(r12, C18070vi.A0N("ENABLED", "REQUIRES_VERIFICATION", A1b4, 1, 2), new String[]{"capabilities", "p2m-receive"}) == null || (A0u = AnonymousClass8BU.A0u(r12, r2, new C21287AhY(1), new String[]{"capabilities"})) == null || (A0m = AnonymousClass8BR.A0m(A0u, 0)) == null)) {
                                                return new C178249Cj(r12, r11, new C178159Ca(A0m, r12));
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
        }
        return null;
    }

    public static final C178399Cy A02(C29621ca r13, C62672rm r14) {
        C29621ca r3 = r13;
        C62672rm r2 = r14;
        if (!r14.A09(r13, "state")) {
            return null;
        }
        String[] A1T = AnonymousClass8BS.A1T(1);
        Class<String> cls = String.class;
        Long A0i = AnonymousClass8BU.A0i();
        Long A0j = AnonymousClass8BU.A0j();
        String str = (String) r2.A05(r3, cls, A0i, A0j, (Object) null, A1T, false);
        if (str == null) {
            return null;
        }
        r2.A05(r3, cls, A0i, A0j, (Object) null, new String[]{"input_path"}, false);
        return new C178399Cy(r3, str, (String) r2.A05(r3, cls, A0i, A0j, (Object) null, new String[]{"input_selector"}, false), (String) r2.A05(r3, cls, A0i, A0j, (Object) null, new String[]{"next"}, false), (String) r2.A05(r3, cls, A0i, A0j, (Object) null, new String[]{"result_selector"}, false), (String) r2.A05(r3, cls, A0i, A0j, (Object) null, new String[]{"result_path"}, false));
    }
}
