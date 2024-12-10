package X;

/* renamed from: X.4Yx  reason: invalid class name and case insensitive filesystem */
public abstract class C88244Yx {
    public static final int A00(String str) {
        String str2;
        switch (str.hashCode()) {
            case -449631153:
                if (str.equals("otp_did_not_request")) {
                    return 5;
                }
                break;
            case -119378578:
                if (str.equals("offensive_messages")) {
                    return 4;
                }
                break;
            case 3536713:
                if (str.equals("spam")) {
                    return 3;
                }
                break;
            case 291932813:
                str2 = "no_longer_needed";
                break;
            case 1245889503:
                if (str.equals("no_sign_up")) {
                    return 2;
                }
                break;
            case 1633167393:
                str2 = "no_longer_interested";
                break;
        }
        return str.equals(str2) ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r0 = r4.equals(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r4.equals(r0) == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        return 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r4.equals(r0) == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A01(java.lang.String r4) {
        /*
            if (r4 == 0) goto L_0x000c
            int r0 = r4.hashCode()
            r3 = 1
            r2 = 4
            r1 = 0
            switch(r0) {
                case -2046991529: goto L_0x000e;
                case -1882719533: goto L_0x0011;
                case -1421455676: goto L_0x0019;
                case -401299234: goto L_0x001c;
                case -184936212: goto L_0x001f;
                case 3052376: goto L_0x0022;
                case 779161541: goto L_0x002b;
                case 1622880667: goto L_0x0034;
                default: goto L_0x000c;
            }
        L_0x000c:
            r1 = 3
        L_0x000d:
            return r1
        L_0x000e:
            java.lang.String r0 = "overflow_menu_report"
            goto L_0x002d
        L_0x0011:
            java.lang.String r0 = "account_info_report"
            boolean r0 = r4.equals(r0)
            r1 = 2
            goto L_0x0028
        L_0x0019:
            java.lang.String r0 = "biz_spam_banner_block"
            goto L_0x0036
        L_0x001c:
            java.lang.String r0 = "biz_overflow_menu_block"
            goto L_0x0024
        L_0x001f:
            java.lang.String r0 = "biz_block_header_chat"
            goto L_0x0024
        L_0x0022:
            java.lang.String r0 = "chat"
        L_0x0024:
            boolean r0 = r4.equals(r0)
        L_0x0028:
            if (r0 != 0) goto L_0x000d
            goto L_0x000c
        L_0x002b:
            java.lang.String r0 = "ongoing_call_link_block"
        L_0x002d:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000c
            return r2
        L_0x0034:
            java.lang.String r0 = "psa_banner_block"
        L_0x0036:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000c
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88244Yx.A01(java.lang.String):int");
    }

    public static final Long A02(AnonymousClass1E7 r1) {
        AnonymousClass1BI r0 = r1.A0J;
        if (r0 == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(r0.user));
    }
}
