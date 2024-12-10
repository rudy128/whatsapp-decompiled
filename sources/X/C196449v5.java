package X;

/* renamed from: X.9v5  reason: invalid class name and case insensitive filesystem */
public abstract class C196449v5 {
    public static final String A01(Integer num) {
        if (num == null) {
            return "UNKNOWN";
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return "DIGITAL_GOODS";
        }
        if (intValue == 2) {
            return "PHYSICAL_GOODS";
        }
        return "UNKNOWN";
    }

    public static final C20112A7u A00() {
        C20112A7u A02 = C20112A7u.A02();
        A02.A07("p2m_type", "p2m_lite");
        A02.A07("merchant_type", "api");
        return A02;
    }
}
