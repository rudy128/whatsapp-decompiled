package X;

/* renamed from: X.2tW  reason: invalid class name and case insensitive filesystem */
public abstract class C63682tW {
    public static final int[] A00 = {2131894759, 2131894757, 2131894760};

    public static final int A00(String str) {
        C18070vi.A0d(str, 0);
        if ("all".equals(str)) {
            return 0;
        }
        if ("contacts".equals(str)) {
            return 1;
        }
        if ("none".equals(str)) {
            return 2;
        }
        if ("contact_blacklist".equals(str)) {
            return 3;
        }
        if ("match_last_seen".equals(str)) {
            return 4;
        }
        if ("known".equals(str)) {
            return 5;
        }
        if ("contact_allowlist".equals(str)) {
            return 6;
        }
        return -1;
    }

    public static final String A02(String str, int i) {
        switch (i) {
            case 1:
                return "contacts";
            case 2:
                return "none";
            case 3:
                return "contact_blacklist";
            case 4:
                if ("online".equals(str)) {
                    return "match_last_seen";
                }
                break;
            case 5:
                return "known";
            case 6:
                return "contact_allowlist";
        }
        return "all";
    }

    public static final String A01(String str) {
        switch (str.hashCode()) {
            case -1012222381:
                if (str.equals("online")) {
                    return "privacy_online";
                }
                break;
            case -892481550:
                if (str.equals("status")) {
                    return "privacy_status";
                }
                break;
            case -462094004:
                if (str.equals("messages")) {
                    return "privacy_setting_messages_brigading";
                }
                break;
            case -309425751:
                if (str.equals("profile")) {
                    return "privacy_profile_photo";
                }
                break;
            case 111007:
                if (str.equals("pix")) {
                    return "privacy_pix";
                }
                break;
            case 3314326:
                if (str.equals("last")) {
                    return "privacy_last_seen";
                }
                break;
            case 506363330:
                if (str.equals("groupadd")) {
                    return "privacy_groupadd";
                }
                break;
            case 548632963:
                if (str.equals("calladd")) {
                    return "privacy_calladd";
                }
                break;
            case 1531715286:
                if (str.equals("stickers")) {
                    return "privacy_stickers";
                }
                break;
            case 1974548689:
                if (str.equals("readreceipts")) {
                    return "read_receipts_enabled";
                }
                break;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Unrecognized category: ");
        throw AnonymousClass001.A12(str, A10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(java.lang.String r4, int r5) {
        /*
            java.lang.String r0 = "stickers"
            boolean r0 = r0.equals(r4)
            r3 = 6
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0015
            if (r5 == r3) goto L_0x0013
            if (r5 == r1) goto L_0x0013
            r0 = 2
            if (r5 != r0) goto L_0x0014
        L_0x0013:
            r2 = 1
        L_0x0014:
            return r2
        L_0x0015:
            java.lang.String r0 = "messages"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "online"
            boolean r0 = r0.equals(r4)
            r1 = 4
            if (r0 != 0) goto L_0x0058
            r0 = 3
            if (r5 != r0) goto L_0x0053
            java.lang.String r0 = "status"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "groupadd"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "last"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "profile"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "pix"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0014
            goto L_0x0013
        L_0x0053:
            if (r5 == r3) goto L_0x0014
            if (r5 == r1) goto L_0x0014
            goto L_0x0013
        L_0x0058:
            if (r5 == 0) goto L_0x0013
            if (r5 != r1) goto L_0x0014
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63682tW.A03(java.lang.String, int):boolean");
    }
}
