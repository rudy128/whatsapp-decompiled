package X;

/* renamed from: X.Aib  reason: case insensitive filesystem */
public class C21347Aib implements Comparable {
    public int A00;
    public int A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AnonymousClass1XO.A00(A00(this.A02), A00(((C21347Aib) obj).A02));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21347Aib(X.C29621ca r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r3 = r5.A00
            java.lang.String r1 = "otp"
            boolean r0 = r3.equals(r1)
            java.lang.String r2 = "value"
            if (r0 == 0) goto L_0x008a
            r4.A0B = r1
            java.lang.String r0 = "type"
            r3 = 0
            java.lang.String r1 = r5.A0Q(r0, r3)
            r4.A05 = r1
            int r0 = r1.hashCode()
            switch(r0) {
                case 82233: goto L_0x007f;
                case 2467610: goto L_0x0074;
                case 66081660: goto L_0x0069;
                case 81425707: goto L_0x005e;
                default: goto L_0x0021;
            }
        L_0x0021:
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
        L_0x0023:
            r4.A02 = r0
            java.lang.String r0 = r5.A0Q(r2, r3)
            r4.A04 = r0
            java.lang.String r0 = "length"
            java.lang.String r1 = r5.A0Q(r0, r3)
            r0 = 6
            int r0 = X.C20099A7c.A01(r1, r0)
            r4.A00 = r0
            java.lang.String r0 = "resend-interval-sec"
            java.lang.String r1 = r5.A0Q(r0, r3)
            r0 = 60
            int r0 = X.C20099A7c.A01(r1, r0)
            r4.A01 = r0
        L_0x0046:
            java.lang.String r0 = "disabled"
            r2 = 0
            java.lang.String r1 = r5.A0Q(r0, r2)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)
            r4.A0C = r0
            java.lang.String r0 = "identifier"
            java.lang.String r0 = r5.A0Q(r0, r2)
            r4.A03 = r0
            return
        L_0x005e:
            java.lang.String r0 = "VACAT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            goto L_0x0023
        L_0x0069:
            java.lang.String r0 = "EMAIL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x0023
        L_0x0074:
            java.lang.String r0 = "PUSH"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x0023
        L_0x007f:
            java.lang.String r0 = "SMS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x0023
        L_0x008a:
            java.lang.String r1 = "app-to-app"
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x00b8
            r4.A0B = r1
            r1 = 0
            java.lang.String r0 = r5.A0Q(r2, r1)
            r4.A06 = r0
            java.lang.String r0 = "request-payload"
            java.lang.String r0 = r5.A0Q(r0, r1)
            r4.A09 = r0
            java.lang.String r0 = "source"
            java.lang.String r0 = r5.A0Q(r0, r1)
            r4.A07 = r0
            java.lang.String r0 = "intent-action"
            java.lang.String r0 = r5.A0Q(r0, r1)
            r4.A08 = r0
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
        L_0x00b5:
            r4.A02 = r0
            goto L_0x0046
        L_0x00b8:
            java.lang.String r1 = "customer-service"
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x0046
            r4.A0B = r1
            java.lang.String r0 = X.C29621ca.A02(r5, r2)
            r4.A0A = r0
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21347Aib.<init>(X.1ca):void");
    }

    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 1;
        }
    }

    public C21347Aib() {
    }
}
