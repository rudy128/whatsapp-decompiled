package X;

import android.widget.TextView;

/* renamed from: X.4sU  reason: invalid class name and case insensitive filesystem */
public class C99234sU implements C18080vj, C22821Di {
    public final int A00;

    public C99234sU(int i) {
        this.A00 = i;
    }

    public static void A00(TextView textView, Object obj, int i) {
        C99234sU r2 = new C99234sU(i);
        if (textView != null) {
            textView.addTextChangedListener(new AnonymousClass48B(obj, r2, 2));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (android.util.Patterns.EMAIL_ADDRESS.matcher(r4).matches() != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (X.AnonymousClass3MW.A0g((X.AnonymousClass1E7) r4) != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (((X.A2B) r4).A04 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        if (((X.C41761x1) r4).A02 == 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009a, code lost:
        if (r4.length() == 0) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a3, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b9, code lost:
        return java.lang.Long.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ba, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x00a4;
                case 1: goto L_0x00ad;
                case 2: goto L_0x008a;
                case 3: goto L_0x0085;
                case 4: goto L_0x0082;
                case 5: goto L_0x007b;
                case 6: goto L_0x006a;
                case 7: goto L_0x0063;
                case 8: goto L_0x005a;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0051;
                case 13: goto L_0x0046;
                case 14: goto L_0x0036;
                case 15: goto L_0x0071;
                case 16: goto L_0x0031;
                case 17: goto L_0x002c;
                case 18: goto L_0x0027;
                case 19: goto L_0x0005;
                case 20: goto L_0x0091;
                case 21: goto L_0x0010;
                case 22: goto L_0x0091;
                case 23: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            r2 = 0
            return r2
        L_0x0007:
            X.2Qu r4 = (X.C49522Qu) r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            java.lang.String r2 = r4.value
            return r2
        L_0x0010:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x0079
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0079
            java.util.regex.Pattern r0 = android.util.Patterns.EMAIL_ADDRESS
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x0079
            goto L_0x0077
        L_0x0027:
            X.4YZ r4 = (X.AnonymousClass4YZ) r4
            X.4Cu r2 = r4.A01
            return r2
        L_0x002c:
            X.4YY r4 = (X.AnonymousClass4YY) r4
            boolean r0 = r4.A04
            goto L_0x009f
        L_0x0031:
            X.4YY r4 = (X.AnonymousClass4YY) r4
            X.23z r2 = r4.A01
            return r2
        L_0x0036:
            X.4YX r4 = (X.AnonymousClass4YX) r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            boolean r1 = r4.A04
            int r0 = r4.A00
            X.4TW r2 = new X.4TW
            r2.<init>(r1, r0)
            return r2
        L_0x0046:
            X.4Yl r4 = (X.C88134Yl) r4
            int r0 = r4.A00()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x0051:
            X.4Yl r4 = (X.C88134Yl) r4
            int r0 = r4.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x005a:
            X.1E7 r4 = (X.AnonymousClass1E7) r4
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3MW.A0g(r4)
            if (r0 == 0) goto L_0x0079
            goto L_0x0077
        L_0x0063:
            X.1ci r4 = (X.C29691ci) r4
            boolean r0 = r4.A0m
            r0 = r0 ^ 1
            goto L_0x009f
        L_0x006a:
            X.A2B r4 = (X.A2B) r4
            java.lang.Integer r0 = r4.A04
            if (r0 != 0) goto L_0x0079
            goto L_0x0077
        L_0x0071:
            X.1x1 r4 = (X.C41761x1) r4
            int r0 = r4.A02
            if (r0 != 0) goto L_0x0079
        L_0x0077:
            r0 = 1
            goto L_0x009f
        L_0x0079:
            r0 = 0
            goto L_0x009f
        L_0x007b:
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            boolean r0 = r4 instanceof X.C77003oy
            goto L_0x009f
        L_0x0082:
            X.1Wu r2 = X.C27621Wu.A00
            return r2
        L_0x0085:
            X.4h2 r4 = (X.C92274h2) r4
            boolean r0 = r4.A01
            goto L_0x009f
        L_0x008a:
            X.4h2 r4 = (X.C92274h2) r4
            boolean r0 = r4.A01
            r0 = r0 ^ 1
            goto L_0x009f
        L_0x0091:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x009c
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x009d
        L_0x009c:
            r0 = 1
        L_0x009d:
            r0 = r0 ^ 1
        L_0x009f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x00a4:
            boolean r0 = X.AnonymousClass000.A1Y(r4)
            if (r0 == 0) goto L_0x00ba
            r0 = 400(0x190, double:1.976E-321)
            goto L_0x00b5
        L_0x00ad:
            boolean r0 = X.AnonymousClass000.A1Y(r4)
            if (r0 == 0) goto L_0x00ba
            r0 = 300(0x12c, double:1.48E-321)
        L_0x00b5:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L_0x00ba:
            r0 = 0
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99234sU.invoke(java.lang.Object):java.lang.Object");
    }
}
