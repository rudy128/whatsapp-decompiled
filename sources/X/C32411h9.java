package X;

import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.1h9  reason: invalid class name and case insensitive filesystem */
public final class C32411h9 {
    public final C18030ve A00;
    public final C32381h6 A01;
    public final C32361h4 A02;
    public final C200710s A03;
    public final HashMap A04 = new HashMap();
    public final AnonymousClass19Y A05;
    public final AnonymousClass10I A06;

    public C32411h9(C18030ve r3, C32381h6 r4, C32361h4 r5, AnonymousClass19Y r6, AnonymousClass10I r7) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r7, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r5, 5);
        this.A00 = r3;
        this.A06 = r7;
        this.A01 = r4;
        this.A05 = r6;
        this.A02 = r5;
        this.A03 = new C200710s(r7, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C55772gL r8, X.C32411h9 r9, int r10) {
        /*
            X.19Y r2 = r9.A05
            java.lang.String r5 = "media_id"
            long r6 = r8.A03
            r3 = 822149122(0x31010002, float:1.8771975E-9)
            r4 = r10
            r2.markerAnnotate((int) r3, (int) r4, (java.lang.String) r5, (long) r6)
            java.lang.String r1 = "user_retry_attempt"
            int r0 = r8.A02
            r2.markerAnnotate((int) r3, (int) r10, (java.lang.String) r1, (int) r0)
            java.lang.Integer r0 = r8.A05
            if (r0 == 0) goto L_0x0205
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x0103
            java.lang.String r1 = "ok"
        L_0x0022:
            java.lang.String r0 = "download_result"
            r2.markerAnnotate((int) r3, (int) r10, (java.lang.String) r0, (java.lang.String) r1)
            int r1 = r8.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 != 0) goto L_0x0097
            java.lang.String r1 = "no_download_origin"
        L_0x0031:
            java.lang.String r0 = "download_origin"
            r2.markerAnnotate((int) r3, (int) r10, (java.lang.String) r0, (java.lang.String) r1)
            java.lang.Integer r0 = r8.A04
            if (r0 == 0) goto L_0x0094
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x0068
            java.lang.String r1 = "manual"
        L_0x0043:
            java.lang.String r0 = "download_mode"
            r2.markerAnnotate((int) r3, (int) r10, (java.lang.String) r0, (java.lang.String) r1)
            java.lang.Integer r0 = r8.A06
            java.lang.String r1 = X.C181439Qm.A00(r0)
            java.lang.String r0 = "media_type"
            r2.markerAnnotate((int) r3, (int) r10, (java.lang.String) r0, (java.lang.String) r1)
            java.lang.String r1 = "auto_retry_count"
            int r0 = r8.A00
            r2.markerAnnotate((int) r3, (int) r10, (java.lang.String) r1, (int) r0)
            r0 = 2
            r2.markerEnd(r3, r10, r0)
            java.util.HashMap r1 = r9.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1.remove(r0)
            return
        L_0x0068:
            r0 = 2
            if (r1 != r0) goto L_0x006e
            java.lang.String r1 = "full"
            goto L_0x0043
        L_0x006e:
            r0 = 3
            if (r1 != r0) goto L_0x0074
            java.lang.String r1 = "prefetch"
            goto L_0x0043
        L_0x0074:
            r0 = 4
            if (r1 != r0) goto L_0x007a
            java.lang.String r1 = "header"
            goto L_0x0043
        L_0x007a:
            r0 = 5
            if (r1 != r0) goto L_0x0081
            java.lang.String r1 = "thumbnail"
            goto L_0x0043
        L_0x0081:
            r0 = 6
            if (r1 != r0) goto L_0x0087
            java.lang.String r1 = "express_path_download"
            goto L_0x0043
        L_0x0087:
            r0 = 7
            if (r1 != r0) goto L_0x008d
            java.lang.String r1 = "prefetch_for_thumb_preview"
            goto L_0x0043
        L_0x008d:
            r0 = 8
            if (r1 != r0) goto L_0x0094
            java.lang.String r1 = "full_for_thumb_preview"
            goto L_0x0043
        L_0x0094:
            java.lang.String r1 = "no_download_mode"
            goto L_0x0043
        L_0x0097:
            r0 = 1
            if (r1 != r0) goto L_0x009d
            java.lang.String r1 = "chat_personal"
            goto L_0x0031
        L_0x009d:
            r0 = 2
            if (r1 != r0) goto L_0x00a3
            java.lang.String r1 = "chat_group"
            goto L_0x0031
        L_0x00a3:
            r0 = 3
            if (r1 != r0) goto L_0x00aa
            java.lang.String r1 = "status_user"
            goto L_0x0031
        L_0x00aa:
            r0 = 4
            if (r1 != r0) goto L_0x00b1
            java.lang.String r1 = "status_ads"
            goto L_0x0031
        L_0x00b1:
            r0 = 5
            if (r1 != r0) goto L_0x00b8
            java.lang.String r1 = "product_catalog"
            goto L_0x0031
        L_0x00b8:
            r0 = 6
            if (r1 != r0) goto L_0x00bf
            java.lang.String r1 = "gdpr"
            goto L_0x0031
        L_0x00bf:
            r0 = 7
            if (r1 != r0) goto L_0x00c7
            java.lang.String r1 = "sticker_picker"
            goto L_0x0031
        L_0x00c7:
            r0 = 8
            if (r1 != r0) goto L_0x00cf
            java.lang.String r1 = "profile_picture"
            goto L_0x0031
        L_0x00cf:
            r0 = 9
            if (r1 != r0) goto L_0x00d7
            java.lang.String r1 = "bloks"
            goto L_0x0031
        L_0x00d7:
            r0 = 10
            if (r1 != r0) goto L_0x00df
            java.lang.String r1 = "p2b"
            goto L_0x0031
        L_0x00df:
            r0 = 11
            if (r1 != r0) goto L_0x00e7
            java.lang.String r1 = "message_history_sync"
            goto L_0x0031
        L_0x00e7:
            r0 = 12
            if (r1 != r0) goto L_0x00ef
            java.lang.String r1 = "community"
            goto L_0x0031
        L_0x00ef:
            r0 = 13
            if (r1 != r0) goto L_0x00f7
            java.lang.String r1 = "channel"
            goto L_0x0031
        L_0x00f7:
            r0 = 14
            if (r1 != r0) goto L_0x00ff
            java.lang.String r1 = "broadcast"
            goto L_0x0031
        L_0x00ff:
            java.lang.String r1 = "interop"
            goto L_0x0031
        L_0x0103:
            r0 = 2
            if (r1 != r0) goto L_0x010a
            java.lang.String r1 = "error_unknown"
            goto L_0x0022
        L_0x010a:
            r0 = 3
            if (r1 != r0) goto L_0x0111
            java.lang.String r1 = "error_timeout"
            goto L_0x0022
        L_0x0111:
            r0 = 4
            if (r1 != r0) goto L_0x0118
            java.lang.String r1 = "error_dns"
            goto L_0x0022
        L_0x0118:
            r0 = 5
            if (r1 != r0) goto L_0x011f
            java.lang.String r1 = "error_insufficient_space"
            goto L_0x0022
        L_0x011f:
            r0 = 6
            if (r1 != r0) goto L_0x0126
            java.lang.String r1 = "error_too_old"
            goto L_0x0022
        L_0x0126:
            r0 = 7
            if (r1 != r0) goto L_0x012d
            java.lang.String r1 = "error_cannot_resume"
            goto L_0x0022
        L_0x012d:
            r0 = 8
            if (r1 != r0) goto L_0x0135
            java.lang.String r1 = "error_hash_mismatch"
            goto L_0x0022
        L_0x0135:
            r0 = 9
            if (r1 != r0) goto L_0x013d
            java.lang.String r1 = "error_invalid_url"
            goto L_0x0022
        L_0x013d:
            r0 = 10
            if (r1 != r0) goto L_0x0145
            java.lang.String r1 = "error_output_stream"
            goto L_0x0022
        L_0x0145:
            r0 = 11
            if (r1 != r0) goto L_0x014d
            java.lang.String r1 = "error_cancel"
            goto L_0x0022
        L_0x014d:
            r0 = 12
            if (r1 != r0) goto L_0x0155
            java.lang.String r1 = "deduped"
            goto L_0x0022
        L_0x0155:
            r0 = 14
            if (r1 != r0) goto L_0x015d
            java.lang.String r1 = "error_enc_hash_mismatch"
            goto L_0x0022
        L_0x015d:
            r0 = 15
            if (r1 != r0) goto L_0x0165
            java.lang.String r1 = "prefetch_end"
            goto L_0x0022
        L_0x0165:
            r0 = 16
            if (r1 != r0) goto L_0x016d
            java.lang.String r1 = "error_cancel_programmatic"
            goto L_0x0022
        L_0x016d:
            r0 = 17
            if (r1 != r0) goto L_0x0175
            java.lang.String r1 = "error_media_conn"
            goto L_0x0022
        L_0x0175:
            r0 = 18
            if (r1 != r0) goto L_0x017d
            java.lang.String r1 = "error_throttle"
            goto L_0x0022
        L_0x017d:
            r0 = 19
            if (r1 != r0) goto L_0x0185
            java.lang.String r1 = "error_ssl"
            goto L_0x0022
        L_0x0185:
            r0 = 20
            if (r1 != r0) goto L_0x018d
            java.lang.String r1 = "error_network"
            goto L_0x0022
        L_0x018d:
            r0 = 21
            if (r1 != r0) goto L_0x0195
            java.lang.String r1 = "error_connect"
            goto L_0x0022
        L_0x0195:
            r0 = 22
            if (r1 != r0) goto L_0x019d
            java.lang.String r1 = "error_ep_notify_decryption_failure"
            goto L_0x0022
        L_0x019d:
            r0 = 25
            if (r1 != r0) goto L_0x01a5
            java.lang.String r1 = "error_server"
            goto L_0x0022
        L_0x01a5:
            r0 = 26
            if (r1 != r0) goto L_0x01ad
            java.lang.String r1 = "error_watls"
            goto L_0x0022
        L_0x01ad:
            r0 = 27
            if (r1 != r0) goto L_0x01b5
            java.lang.String r1 = "error_invalid_code"
            goto L_0x0022
        L_0x01b5:
            r0 = 29
            if (r1 != r0) goto L_0x01bd
            java.lang.String r1 = "error_generic"
            goto L_0x0022
        L_0x01bd:
            r0 = 31
            if (r1 != r0) goto L_0x01c5
            java.lang.String r1 = "error_no_client_network"
            goto L_0x0022
        L_0x01c5:
            r0 = 32
            if (r1 != r0) goto L_0x01cd
            java.lang.String r1 = "error_host_switch_required"
            goto L_0x0022
        L_0x01cd:
            r0 = 33
            if (r1 != r0) goto L_0x01d5
            java.lang.String r1 = "error_suspicious_content"
            goto L_0x0022
        L_0x01d5:
            r0 = 34
            if (r1 != r0) goto L_0x01dd
            java.lang.String r1 = "error_no_encryption_algorithm"
            goto L_0x0022
        L_0x01dd:
            r0 = 35
            if (r1 != r0) goto L_0x01e5
            java.lang.String r1 = "error_no_encrypted_hash"
            goto L_0x0022
        L_0x01e5:
            r0 = 36
            if (r1 != r0) goto L_0x01ed
            java.lang.String r1 = "error_no_media_hash"
            goto L_0x0022
        L_0x01ed:
            r0 = 37
            if (r1 != r0) goto L_0x01f5
            java.lang.String r1 = "error_no_media_key"
            goto L_0x0022
        L_0x01f5:
            r0 = 38
            if (r1 != r0) goto L_0x01fd
            java.lang.String r1 = "error_no_sidecar"
            goto L_0x0022
        L_0x01fd:
            r0 = 39
            if (r1 != r0) goto L_0x0205
            java.lang.String r1 = "error_hash_verification_failure"
            goto L_0x0022
        L_0x0205:
            java.lang.String r1 = "no_download_result"
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32411h9.A00(X.2gL, X.1h9, int):void");
    }

    public static final void A01(C32411h9 r2, int i, boolean z) {
        Integer num;
        C55772gL r0 = (C55772gL) r2.A04.get(Integer.valueOf(i));
        if (r0 != null) {
            A00(r0, r2, i);
        }
        AnonymousClass19Y r1 = r2.A05;
        r1.markerStart(822149122, i);
        if (z) {
            num = AnonymousClass00R.A01;
        } else {
            num = AnonymousClass00R.A00;
        }
        A02(r1, num, i);
    }

    public final void A03(int i, Integer num) {
        if (C18020vd.A05(C18040vf.A02, this.A00, 9143)) {
            A02(this.A05, num, i);
        }
    }

    public final void A04(AnonymousClass1BI r6, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        C18030ve r2 = this.A00;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 9143) || C18020vd.A05(r1, r2, 9145)) {
            synchronized (this) {
                if (C18020vd.A05(r1, r2, 9143)) {
                    if (C22781De.A03()) {
                        this.A03.execute(new C146837Qu(this, i, 2, z));
                    } else {
                        A01(this, i, z);
                    }
                }
                if (r6 != null) {
                    i4 = A8F.A00(r6);
                } else {
                    i4 = 1;
                }
                Integer valueOf = Integer.valueOf(i);
                HashMap hashMap = this.A04;
                C55772gL r12 = new C55772gL();
                r12.A06 = Integer.valueOf(i3);
                r12.A01 = i4;
                r12.A04 = Integer.valueOf(C1409973w.A02(i2, z2));
                hashMap.put(valueOf, r12);
            }
        }
    }

    public static final void A02(AnonymousClass19Y r2, Integer num, int i) {
        String str;
        switch (num.intValue()) {
            case 0:
                str = "AUTO_START";
                break;
            case 1:
                str = "MANUAL_START";
                break;
            case 2:
                str = "ENQ_START";
                break;
            case 3:
                str = "ENQ_END";
                break;
            case 4:
                str = "PRE_DOWNLOAD_START";
                break;
            case 5:
                str = "PRE_DOWNLOAD_END";
                break;
            case 6:
                str = "NETWORK_START";
                break;
            case 7:
                str = "CONNECTION_START";
                break;
            case 8:
                str = "CONNECTION_END";
                break;
            case 9:
                str = "NETWORK_END";
                break;
            case 10:
                str = "POST_START";
                break;
            default:
                str = "POST_END";
                break;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C18070vi.A0X(lowerCase);
        r2.markerPoint(822149122, i, lowerCase);
    }
}
