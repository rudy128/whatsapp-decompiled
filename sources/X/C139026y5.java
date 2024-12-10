package X;

/* renamed from: X.6y5  reason: invalid class name and case insensitive filesystem */
public final class C139026y5 {
    public final C24661Le A00;
    public final AnonymousClass18K A01;
    public final AnonymousClass00H A02;

    public static final Integer A00(AnonymousClass206 r2) {
        int i;
        if (r2 instanceof AnonymousClass210) {
            i = 39;
        } else {
            int i2 = r2.A0u;
            if (i2 == 1) {
                return 2;
            }
            i = 3;
            if (i2 != 3) {
                if (i2 == 13) {
                    i = 11;
                } else if (i2 != 2) {
                    return null;
                } else {
                    i = 4;
                }
            }
        }
        return Integer.valueOf(i);
    }

    public C139026y5(C24661Le r1, AnonymousClass18K r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0175, code lost:
        if (r3 != 2) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0181, code lost:
        if (r3 != 2) goto L_0x0183;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00f7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.Boolean r8, java.lang.Integer r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.String r12, java.util.List r13, int r14, boolean r15) {
        /*
            r7 = this;
            java.util.ArrayList r2 = X.C29351c6.A0D(r13)
            java.util.Iterator r3 = r13.iterator()
        L_0x0008:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0042
            X.206 r0 = X.C17880vN.A0Y(r3)
            java.lang.Integer r0 = A00(r0)
            if (r0 == 0) goto L_0x003f
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x0025
            java.lang.String r0 = "photo"
        L_0x0021:
            r2.add(r0)
            goto L_0x0008
        L_0x0025:
            r0 = 3
            if (r1 != r0) goto L_0x002b
            java.lang.String r0 = "video"
            goto L_0x0021
        L_0x002b:
            r0 = 4
            if (r1 != r0) goto L_0x0031
            java.lang.String r0 = "audio"
            goto L_0x0021
        L_0x0031:
            r0 = 11
            if (r1 != r0) goto L_0x0038
            java.lang.String r0 = "gif"
            goto L_0x0021
        L_0x0038:
            r0 = 39
            if (r1 != r0) goto L_0x003f
            java.lang.String r0 = "text"
            goto L_0x0021
        L_0x003f:
            java.lang.String r0 = "other"
            goto L_0x0021
        L_0x0042:
            r1 = 0
            java.lang.String r0 = ", "
            java.lang.String r2 = X.C29431cG.A0h(r0, r2, r1)
            X.00H r0 = r7.A02
            X.1dR r1 = X.C108945cZ.A13(r0)
            java.lang.String r0 = "media_type"
            r1.A02(r2, r0)
            java.util.Iterator r6 = r13.iterator()
        L_0x0058:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x018c
            X.206 r1 = X.C17880vN.A0Y(r6)
            r4 = 2
            boolean r5 = X.AnonymousClass000.A1T(r14, r4)
            X.640 r2 = new X.640
            r2.<init>()
            java.lang.Integer r0 = A00(r1)
            r2.A03 = r0
            X.1Le r0 = r7.A00
            int r3 = r0.A05()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L_0x0183
            r0 = 3
            if (r3 == 0) goto L_0x0186
            r0 = 1
            if (r3 != r0) goto L_0x0180
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L_0x0088:
            r2.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r2.A00 = r0
            X.77K r0 = X.C63672tV.A00(r1)
            if (r0 == 0) goto L_0x00aa
            int r3 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L_0x0177
            r0 = 3
            if (r3 == 0) goto L_0x017a
            r0 = 1
            if (r3 != r0) goto L_0x0174
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L_0x00a8:
            r2.A05 = r0
        L_0x00aa:
            r2.A04 = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r2.A06 = r0
            r2.A07 = r12
            X.205 r0 = r1.A0v
            java.lang.String r0 = r0.A01
            r2.A09 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A01 = r0
            if (r10 == 0) goto L_0x00f7
            int r4 = r10.intValue()
            r3 = 125(0x7d, float:1.75E-43)
            switch(r4) {
                case -25: goto L_0x0170;
                case -24: goto L_0x016c;
                case -23: goto L_0x0168;
                case -22: goto L_0x0164;
                case -21: goto L_0x0161;
                case -20: goto L_0x015e;
                case -19: goto L_0x014d;
                case -18: goto L_0x014a;
                case -17: goto L_0x0147;
                case -16: goto L_0x0144;
                case -15: goto L_0x0141;
                case -14: goto L_0x013e;
                case -13: goto L_0x00cb;
                case -12: goto L_0x013b;
                case -11: goto L_0x012a;
                case -10: goto L_0x0127;
                case -9: goto L_0x0124;
                case -8: goto L_0x0121;
                case -7: goto L_0x011e;
                case -6: goto L_0x011b;
                case -5: goto L_0x0118;
                case -4: goto L_0x00cb;
                case -3: goto L_0x0115;
                case -2: goto L_0x0112;
                case -1: goto L_0x0101;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unclassified error code: {"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "} subCode: {"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r3 = X.C17890vO.A0c(r1, r3)
        L_0x00e3:
            if (r8 == 0) goto L_0x00f5
            boolean r0 = r8.booleanValue()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r0 == 0) goto L_0x00fe
            java.lang.String r0 = "previous_session_"
        L_0x00f1:
            java.lang.String r3 = X.AnonymousClass001.A1H(r0, r3, r1)
        L_0x00f5:
            r2.A08 = r3
        L_0x00f7:
            X.18K r0 = r7.A01
            r0.CC7(r2)
            goto L_0x0058
        L_0x00fe:
            java.lang.String r0 = "current_session_"
            goto L_0x00f1
        L_0x0101:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "delivery_failure with subCode: {"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r3 = X.C17890vO.A0c(r1, r3)
            goto L_0x00e3
        L_0x0112:
            java.lang.String r3 = "crosspost_already_sharing"
            goto L_0x00e3
        L_0x0115:
            java.lang.String r3 = "crosspost_shared"
            goto L_0x00e3
        L_0x0118:
            java.lang.String r3 = "account not linked"
            goto L_0x00e3
        L_0x011b:
            java.lang.String r3 = "media_upload_invalid_status_type"
            goto L_0x00e3
        L_0x011e:
            java.lang.String r3 = "media_upload_invalid_text_status_file_path"
            goto L_0x00e3
        L_0x0121:
            java.lang.String r3 = "media_upload_invalid_non_text_status_media_data"
            goto L_0x00e3
        L_0x0124:
            java.lang.String r3 = "media_upload_media_file_not_exist"
            goto L_0x00e3
        L_0x0127:
            java.lang.String r3 = "media_upload_empty_direct_url"
            goto L_0x00e3
        L_0x012a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "media_upload_result_error: {"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r3 = X.C17890vO.A0c(r1, r3)
            goto L_0x00e3
        L_0x013b:
            java.lang.String r3 = "media_upload_cached_db_map_empty"
            goto L_0x00e3
        L_0x013e:
            java.lang.String r3 = "eligibility_purpose_encryption_key_validation_failed"
            goto L_0x00e3
        L_0x0141:
            java.lang.String r3 = "eligibility_session_data_validation_failed"
            goto L_0x00e3
        L_0x0144:
            java.lang.String r3 = "text_status_burning_failed"
            goto L_0x00e3
        L_0x0147:
            java.lang.String r3 = "eligibility_db_map_empty"
            goto L_0x00e3
        L_0x014a:
            java.lang.String r3 = "eligibility_entry_not_found_in_session_data"
            goto L_0x00e3
        L_0x014d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "eligibility_entry_state_invalid, actual state: {"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r3 = X.C17890vO.A0c(r1, r3)
            goto L_0x00e3
        L_0x015e:
            java.lang.String r3 = "eligibility_invalid_non_text_direct_url"
            goto L_0x00e3
        L_0x0161:
            java.lang.String r3 = "eligibility_invalid_text_media_path"
            goto L_0x00e3
        L_0x0164:
            java.lang.String r3 = "eligibility_empty_unique_id"
            goto L_0x00e3
        L_0x0168:
            java.lang.String r3 = "crosspost_entry_not_found_in_session_data"
            goto L_0x00e3
        L_0x016c:
            java.lang.String r3 = "crosspost_empty_unique_id"
            goto L_0x00e3
        L_0x0170:
            java.lang.String r3 = "crosspost_empty_media_path"
            goto L_0x00e3
        L_0x0174:
            r0 = 4
            if (r3 == r4) goto L_0x017a
        L_0x0177:
            r0 = 0
            goto L_0x00a8
        L_0x017a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00a8
        L_0x0180:
            r0 = 4
            if (r3 == r4) goto L_0x0186
        L_0x0183:
            r0 = 0
            goto L_0x0088
        L_0x0186:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0088
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139026y5.A01(java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List, int, boolean):void");
    }
}
