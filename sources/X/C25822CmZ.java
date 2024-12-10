package X;

/* renamed from: X.CmZ  reason: case insensitive filesystem */
public final class C25822CmZ {
    public static int A00 = 1;
    public static Boolean A01;
    public static Boolean A02;
    public static Boolean A03;
    public static Integer A04;
    public static Long A05;
    public static Long A06;
    public static String A07;
    public static String A08;
    public static String A09;
    public static String A0A;
    public static final C25822CmZ A0B = new Object();

    public final synchronized String A00() {
        return A07;
    }

    public final synchronized String A01() {
        String str;
        synchronized (this) {
            str = A08;
            if (str == null) {
                str = C108985cd.A0f();
                A08 = str;
                A06 = C108955ca.A0m();
                A03 = AnonymousClass000.A0i();
            }
        }
        return str;
    }

    public final synchronized String A02() {
        return A09;
    }

    public final synchronized void A03(boolean z) {
        A02 = Boolean.valueOf(z);
    }
}
