package X;

/* renamed from: X.9OT  reason: invalid class name */
public abstract class AnonymousClass9OT {
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        if (r5.equals("full") != false) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015 A[SYNTHETIC, Splitter:B:8:0x0015] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8) {
        /*
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            java.lang.String r1 = "DatetimeTextProviderUtils"
            if (r5 == 0) goto L_0x0012
            int r3 = X.A90.A05(r5)     // Catch:{ 9HX -> 0x000d }
            goto L_0x0013
        L_0x000d:
            java.lang.String r0 = "Error while parsing DateTime format"
            X.C25913CoX.A01(r1, r0)
        L_0x0012:
            r3 = 2
        L_0x0013:
            if (r6 == 0) goto L_0x001f
            int r2 = X.A90.A05(r6)     // Catch:{ 9HX -> 0x001a }
            goto L_0x0020
        L_0x001a:
            java.lang.String r0 = "Error while parsing Time format"
            X.C25913CoX.A01(r1, r0)
        L_0x001f:
            r2 = r3
        L_0x0020:
            if (r5 != 0) goto L_0x0024
            java.lang.String r5 = "medium"
        L_0x0024:
            int r1 = r4.hashCode()
            r0 = 3076014(0x2eefae, float:4.310414E-39)
            if (r1 == r0) goto L_0x007a
            r0 = 3560141(0x3652cd, float:4.98882E-39)
            if (r1 == r0) goto L_0x006d
            r0 = 1793702779(0x6ae9bb7b, float:1.4128253E26)
            if (r1 != r0) goto L_0x00c0
            java.lang.String r0 = "datetime"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00c0
            java.text.DateFormat r2 = java.text.DateFormat.getDateTimeInstance(r3, r2)
        L_0x0043:
            X.C18070vi.A0X(r2)
        L_0x0046:
            if (r7 != 0) goto L_0x0054
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.TimeZone r0 = r0.getTimeZone()
            java.lang.String r7 = r0.getID()
        L_0x0054:
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r7)
            X.C18070vi.A0X(r0)
            r2.setTimeZone(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            java.lang.String r0 = r2.format(r0)
            X.C18070vi.A0X(r0)
            return r0
        L_0x006d:
            java.lang.String r0 = "time"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00c0
            java.text.DateFormat r2 = java.text.DateFormat.getTimeInstance(r2)
            goto L_0x0043
        L_0x007a:
            java.lang.String r0 = "date"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = "short"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "medium"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "long"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "full"
            boolean r1 = r5.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00a4
        L_0x00a3:
            r0 = 1
        L_0x00a4:
            if (r0 == 0) goto L_0x00bb
            int r0 = X.A90.A05(r5)     // Catch:{ 9HX -> 0x00b2 }
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r0)     // Catch:{ 9HX -> 0x00b2 }
            X.C18070vi.A0b(r2)     // Catch:{ 9HX -> 0x00b2 }
            goto L_0x0046
        L_0x00b2:
            r0 = 2
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r0)
            X.C18070vi.A0b(r2)
            goto L_0x0046
        L_0x00bb:
            java.text.SimpleDateFormat r2 = X.AnonymousClass8BS.A0q(r5)
            goto L_0x0046
        L_0x00c0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown dateformat type: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9OT.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):java.lang.String");
    }
}
