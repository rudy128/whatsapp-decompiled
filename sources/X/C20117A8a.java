package X;

/* renamed from: X.A8a  reason: case insensitive filesystem */
public final class C20117A8a {
    public static final C20117A8a A00 = new Object();

    public static final C122306Ot A00(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (AnonymousClass8BR.A1R(r11, r12)) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            if (r3.A05(r4, String.class, A0i, A0j, "bad-request", A1U, false) != null) {
                Number number = (Number) r3.A05(r4, Long.TYPE, A0i, A0j, AnonymousClass8BV.A0h(), AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new C122306Ot(r11, number.longValue());
                }
            }
        }
        return null;
    }

    public static final C122306Ot A01(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (AnonymousClass8BR.A1R(r11, r12)) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            if (r3.A05(r4, String.class, A0i, A0j, "internal-server-error", A1U, false) != null) {
                Number number = (Number) r3.A05(r4, Long.TYPE, A0i, A0j, AnonymousClass8BV.A0i(), AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new C122306Ot(r11, number.longValue());
                }
            }
        }
        return null;
    }

    public static final C122306Ot A02(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (AnonymousClass8BR.A1R(r11, r12)) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            if (r3.A05(r4, String.class, A0i, A0j, "item-not-found", A1U, false) != null) {
                Number number = (Number) r3.A05(r4, Long.TYPE, A0i, A0j, 404L, AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new C122306Ot(r11, number.longValue());
                }
            }
        }
        return null;
    }

    public static final C122306Ot A03(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (AnonymousClass8BR.A1R(r11, r12)) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            if (r3.A05(r4, String.class, A0i, A0j, "not-authorized", A1U, false) != null) {
                Number number = (Number) r3.A05(r4, Long.TYPE, A0i, A0j, 401L, AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new C122306Ot(r11, number.longValue());
                }
            }
        }
        return null;
    }

    public static final C122306Ot A04(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (AnonymousClass8BR.A1R(r11, r12)) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            if (r3.A05(r4, String.class, A0i, A0j, "rate-overlimit", A1U, false) != null) {
                Number number = (Number) r3.A05(r4, Long.TYPE, A0i, A0j, 429L, AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new C122306Ot(r11, number.longValue());
                }
            }
        }
        return null;
    }

    public static final C122306Ot A05(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (AnonymousClass8BR.A1R(r11, r12)) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            if (r3.A05(r4, String.class, A0i, A0j, "request-timeout", A1U, false) != null) {
                Number number = (Number) r3.A05(r4, Long.TYPE, A0i, A0j, 408L, AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new C122306Ot(r11, number.longValue());
                }
            }
        }
        return null;
    }

    public static final C122306Ot A06(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        if (AnonymousClass8BR.A1R(r11, r12)) {
            String[] A1U = AnonymousClass8BS.A1U(1);
            Long A0i = AnonymousClass8BU.A0i();
            Long A0j = AnonymousClass8BU.A0j();
            if (r3.A05(r4, String.class, A0i, A0j, "sequencing-pending", A1U, false) != null) {
                Number number = (Number) r3.A05(r4, Long.TYPE, A0i, A0j, 16792L, AnonymousClass8BS.A1S(1), false);
                if (number != null) {
                    return new C122306Ot(r11, number.longValue());
                }
            }
        }
        return null;
    }
}
