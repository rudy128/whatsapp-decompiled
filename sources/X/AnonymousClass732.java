package X;

/* renamed from: X.732  reason: invalid class name */
public class AnonymousClass732 {
    public final long A00;
    public final C35021lW A01;
    public final C1418477e A02;
    public final C1418477e A03;
    public final C1418477e A04;
    public final C1418477e A05;
    public final C1418477e A06;
    public final Long A07;
    public final String A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass732) {
                AnonymousClass732 r6 = (AnonymousClass732) obj;
                if (C42171xk.A00(A00(this), A00(r6))) {
                    Object obj2 = this.A05.A00;
                    C17960vV.A07(obj2);
                    Object obj3 = r6.A05.A00;
                    C17960vV.A07(obj3);
                    if (C42171xk.A00(obj2, obj3)) {
                        Object obj4 = this.A02.A00;
                        C17960vV.A07(obj4);
                        Object obj5 = r6.A02.A00;
                        C17960vV.A07(obj5);
                        if (!C42171xk.A00(obj4, obj5) || !C42171xk.A00(Long.valueOf(this.A00), Long.valueOf(r6.A00)) || !C42171xk.A00(this.A07, r6.A07) || !C42171xk.A00(this.A01, r6.A01) || !C42171xk.A00(this.A03, r6.A03) || !C42171xk.A00(this.A06, r6.A06)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static Object A00(AnonymousClass732 r0) {
        Object obj = r0.A04.A00;
        C17960vV.A07(obj);
        return obj;
    }

    public static String A01(AnonymousClass732 r0) {
        Object obj = r0.A05.A00;
        C17960vV.A07(obj);
        return (String) obj;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = A00(this);
        Object obj = this.A05.A00;
        C17960vV.A07(obj);
        objArr[1] = obj;
        objArr[2] = this.A02;
        C17890vO.A1O(objArr, this.A00);
        objArr[4] = this.A07;
        objArr[5] = this.A01;
        objArr[6] = this.A03;
        return AnonymousClass000.A0P(this.A06, objArr, 7);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, X.87L] */
    public AnonymousClass732(AnonymousClass77T r6, AnonymousClass77T r7, C35021lW r8, Long l, String str, String str2, String str3, long j, long j2) {
        Class<Long> cls = Long.class;
        this.A04 = new C1418477e(new Object(), cls, Long.valueOf(j), "WaFbid");
        this.A05 = new C1418477e(new Object(), String.class, str, "WaFbPassword");
        this.A02 = new C1418477e(new Object(), cls, str2, "WaFbAccessToken");
        this.A00 = j2;
        this.A07 = l;
        this.A01 = r8;
        this.A08 = str3;
        C1418477e r3 = null;
        if (r6 != null) {
            this.A03 = new C1418477e(new Object(), AnonymousClass77T.class, r6, "WaFbCurrentUserSessionCookie");
        } else {
            this.A03 = null;
        }
        this.A06 = r7 != null ? new C1418477e(new Object(), AnonymousClass77T.class, r7, "WaFbCurrentUserSessionCookie") : r3;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.87L] */
    public AnonymousClass732(C35021lW r6, Long l, String str, String str2, String str3, long j, long j2) {
        Class<Long> cls = Long.class;
        this.A04 = new C1418477e(new Object(), cls, Long.valueOf(j), "WaFbid");
        this.A05 = new C1418477e(new Object(), String.class, str, "WaFbPassword");
        this.A02 = new C1418477e(new Object(), cls, str2, "WaFbAccessToken");
        this.A00 = j2;
        this.A07 = l;
        this.A01 = r6;
        this.A08 = str3;
        this.A03 = null;
        this.A06 = null;
    }
}
