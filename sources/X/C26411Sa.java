package X;

import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.1Sa  reason: invalid class name and case insensitive filesystem */
public final class C26411Sa {
    public final C18030ve A00;
    public final AnonymousClass18K A01;
    public final C200710s A02;
    public final HashMap A03 = new HashMap();
    public final AnonymousClass19Y A04;
    public final AnonymousClass10I A05;

    public C26411Sa(C18030ve r3, AnonymousClass18K r4, AnonymousClass19Y r5, AnonymousClass10I r6) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        this.A00 = r3;
        this.A05 = r6;
        this.A01 = r4;
        this.A04 = r5;
        this.A02 = new C200710s(r6, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C55932gb r8, X.C26411Sa r9, int r10) {
        /*
            X.19Y r2 = r9.A04
            java.lang.String r5 = "media_id"
            long r6 = r8.A04
            r3 = 822149121(0x31010001, float:1.8771973E-9)
            r4 = r10
            r2.markerAnnotate((int) r3, (int) r4, (java.lang.String) r5, (long) r6)
            java.lang.String r1 = "retry_attempt"
            int r0 = r8.A02
            r2.markerAnnotate((int) r3, (int) r10, (java.lang.String) r1, (int) r0)
            java.lang.Integer r0 = r8.A07
            if (r0 == 0) goto L_0x0200
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x00fd
            java.lang.String r1 = "ok"
        L_0x0021:
            java.lang.String r0 = "upload_result"
            r2.markerAnnotate((int) r3, (int) r10, (java.lang.String) r0, (java.lang.String) r1)
            int r1 = r8.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x00f8
            r0 = 2
            if (r1 != r0) goto L_0x00a5
            java.lang.String r1 = "chat_personal"
        L_0x0034:
            java.lang.String r0 = "upload_origin"
            r2.markerAnnotate((int) r3, (int) r10, (java.lang.String) r0, (java.lang.String) r1)
            java.lang.Integer r0 = r8.A06
            if (r0 == 0) goto L_0x00a2
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x0074
            java.lang.String r1 = "regular"
        L_0x0047:
            java.lang.String r0 = "upload_mode"
            r2.markerAnnotate((int) r3, (int) r10, (java.lang.String) r0, (java.lang.String) r1)
            java.lang.Integer r0 = r8.A05
            java.lang.String r1 = X.C181439Qm.A00(r0)
            java.lang.String r0 = "media_type"
            r2.markerAnnotate((int) r3, (int) r10, (java.lang.String) r0, (java.lang.String) r1)
            java.lang.String r1 = "auto_retry_count"
            int r0 = r8.A00
            r2.markerAnnotate((int) r3, (int) r10, (java.lang.String) r1, (int) r0)
            java.lang.String r1 = "resume_auto_retry_count"
            int r0 = r8.A01
            r2.markerAnnotate((int) r3, (int) r10, (java.lang.String) r1, (int) r0)
            r0 = 2
            r2.markerEnd(r3, r10, r0)
            java.util.HashMap r1 = r9.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1.remove(r0)
            return
        L_0x0074:
            r0 = 2
            if (r1 != r0) goto L_0x007a
            java.lang.String r1 = "fast_forward_exist_check"
            goto L_0x0047
        L_0x007a:
            r0 = 3
            if (r1 != r0) goto L_0x0081
            java.lang.String r1 = "video_exist_check"
            goto L_0x0047
        L_0x0081:
            r0 = 4
            if (r1 != r0) goto L_0x0087
            java.lang.String r1 = "product"
            goto L_0x0047
        L_0x0087:
            r0 = 5
            if (r1 != r0) goto L_0x008d
            java.lang.String r1 = "media_retry"
            goto L_0x0047
        L_0x008d:
            r0 = 6
            if (r1 != r0) goto L_0x0094
            java.lang.String r1 = "web_reupload"
            goto L_0x0047
        L_0x0094:
            r0 = 7
            if (r1 != r0) goto L_0x009b
            java.lang.String r1 = "thumbnail"
            goto L_0x0047
        L_0x009b:
            r0 = 8
            if (r1 != r0) goto L_0x00a2
            java.lang.String r1 = "express_path_upload"
            goto L_0x0047
        L_0x00a2:
            java.lang.String r1 = "no_upload_mode"
            goto L_0x0047
        L_0x00a5:
            r0 = 3
            if (r1 != r0) goto L_0x00ab
            java.lang.String r1 = "chat_group"
            goto L_0x0034
        L_0x00ab:
            r0 = 4
            if (r1 != r0) goto L_0x00b2
            java.lang.String r1 = "status_user"
            goto L_0x0034
        L_0x00b2:
            r0 = 5
            if (r1 != r0) goto L_0x00b9
            java.lang.String r1 = "product_catalog"
            goto L_0x0034
        L_0x00b9:
            r0 = 6
            if (r1 != r0) goto L_0x00c1
            java.lang.String r1 = "sticker_web"
            goto L_0x0034
        L_0x00c1:
            r0 = 7
            if (r1 != r0) goto L_0x00c8
            java.lang.String r1 = "payments_kyc"
            goto L_0x0034
        L_0x00c8:
            r0 = 8
            if (r1 != r0) goto L_0x00d0
            java.lang.String r1 = "message_history_sync"
            goto L_0x0034
        L_0x00d0:
            r0 = 9
            if (r1 != r0) goto L_0x00d8
            java.lang.String r1 = "community"
            goto L_0x0034
        L_0x00d8:
            r0 = 10
            if (r1 != r0) goto L_0x00e0
            java.lang.String r1 = "channel"
            goto L_0x0034
        L_0x00e0:
            r0 = 11
            if (r1 != r0) goto L_0x00e8
            java.lang.String r1 = "broadcast"
            goto L_0x0034
        L_0x00e8:
            r0 = 12
            if (r1 != r0) goto L_0x00f0
            java.lang.String r1 = "multi_chat"
            goto L_0x0034
        L_0x00f0:
            r0 = 13
            if (r1 != r0) goto L_0x00f8
            java.lang.String r1 = "interop"
            goto L_0x0034
        L_0x00f8:
            java.lang.String r1 = "unknown"
            goto L_0x0034
        L_0x00fd:
            r0 = 3
            if (r1 != r0) goto L_0x0104
            java.lang.String r1 = "duplicate"
            goto L_0x0021
        L_0x0104:
            r0 = 2
            if (r1 != r0) goto L_0x010b
            java.lang.String r1 = "error_unknown"
            goto L_0x0021
        L_0x010b:
            r0 = 4
            if (r1 != r0) goto L_0x0112
            java.lang.String r1 = "error_request"
            goto L_0x0021
        L_0x0112:
            r0 = 5
            if (r1 != r0) goto L_0x0119
            java.lang.String r1 = "error_upload"
            goto L_0x0021
        L_0x0119:
            r0 = 6
            if (r1 != r0) goto L_0x0120
            java.lang.String r1 = "error_oom"
            goto L_0x0021
        L_0x0120:
            r0 = 7
            if (r1 != r0) goto L_0x0127
            java.lang.String r1 = "error_io"
            goto L_0x0021
        L_0x0127:
            r0 = 8
            if (r1 != r0) goto L_0x012f
            java.lang.String r1 = "error_no_permissions"
            goto L_0x0021
        L_0x012f:
            r0 = 9
            if (r1 != r0) goto L_0x0137
            java.lang.String r1 = "error_bad_media"
            goto L_0x0021
        L_0x0137:
            r0 = 10
            if (r1 != r0) goto L_0x013f
            java.lang.String r1 = "error_insufficient_space"
            goto L_0x0021
        L_0x013f:
            r0 = 11
            if (r1 != r0) goto L_0x0147
            java.lang.String r1 = "error_fnf"
            goto L_0x0021
        L_0x0147:
            r0 = 12
            if (r1 != r0) goto L_0x0150
            java.lang.String r1 = "user_cancel"
            goto L_0x0021
        L_0x0150:
            r0 = 13
            if (r1 != r0) goto L_0x0158
            java.lang.String r1 = "error_server"
            goto L_0x0021
        L_0x0158:
            r0 = 14
            if (r1 != r0) goto L_0x0160
            java.lang.String r1 = "error_request_timeout"
            goto L_0x0021
        L_0x0160:
            r0 = 15
            if (r1 != r0) goto L_0x0168
            java.lang.String r1 = "error_not_finalized"
            goto L_0x0021
        L_0x0168:
            r0 = 16
            if (r1 != r0) goto L_0x0170
            java.lang.String r1 = "error_optimistic_hash"
            goto L_0x0021
        L_0x0170:
            r0 = 17
            if (r1 != r0) goto L_0x0178
            java.lang.String r1 = "error_media_conn"
            goto L_0x0021
        L_0x0178:
            r0 = 18
            if (r1 != r0) goto L_0x0180
            java.lang.String r1 = "error_dns"
            goto L_0x0021
        L_0x0180:
            r0 = 19
            if (r1 != r0) goto L_0x0188
            java.lang.String r1 = "error_throttle"
            goto L_0x0021
        L_0x0188:
            r0 = 20
            if (r1 != r0) goto L_0x0190
            java.lang.String r1 = "error_ssl"
            goto L_0x0021
        L_0x0190:
            r0 = 21
            if (r1 != r0) goto L_0x0198
            java.lang.String r1 = "error_no_client_network"
            goto L_0x0021
        L_0x0198:
            r0 = 28
            if (r1 != r0) goto L_0x01a0
            java.lang.String r1 = "error_incomplete_server_response"
            goto L_0x0021
        L_0x01a0:
            r0 = 29
            if (r1 != r0) goto L_0x01a8
            java.lang.String r1 = "error_transcoding"
            goto L_0x0021
        L_0x01a8:
            r0 = 30
            if (r1 != r0) goto L_0x01b0
            java.lang.String r1 = "auto_cancel"
            goto L_0x0021
        L_0x01b0:
            r0 = 31
            if (r1 != r0) goto L_0x01b8
            java.lang.String r1 = "error_no_route"
            goto L_0x0021
        L_0x01b8:
            r0 = 32
            if (r1 != r0) goto L_0x01c0
            java.lang.String r1 = "error_too_large"
            goto L_0x0021
        L_0x01c0:
            r0 = 33
            if (r1 != r0) goto L_0x01c8
            java.lang.String r1 = "error_cannot_transcode"
            goto L_0x0021
        L_0x01c8:
            r0 = 34
            if (r1 != r0) goto L_0x01d0
            java.lang.String r1 = "error_unknown_mimetype"
            goto L_0x0021
        L_0x01d0:
            r0 = 35
            if (r1 != r0) goto L_0x01d8
            java.lang.String r1 = "error_unsupported_mimetype"
            goto L_0x0021
        L_0x01d8:
            r0 = 36
            if (r1 != r0) goto L_0x01e0
            java.lang.String r1 = "error_server_rejected_media"
            goto L_0x0021
        L_0x01e0:
            r0 = 37
            if (r1 != r0) goto L_0x01e8
            java.lang.String r1 = "error_io_encryption"
            goto L_0x0021
        L_0x01e8:
            r0 = 38
            if (r1 != r0) goto L_0x01f0
            java.lang.String r1 = "error_no_encryption_algorithm"
            goto L_0x0021
        L_0x01f0:
            r0 = 39
            if (r1 != r0) goto L_0x01f8
            java.lang.String r1 = "error_host_switch_required"
            goto L_0x0021
        L_0x01f8:
            r0 = 41
            if (r1 != r0) goto L_0x0200
            java.lang.String r1 = "error_invalid_url"
            goto L_0x0021
        L_0x0200:
            java.lang.String r1 = "no_upload_result"
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26411Sa.A00(X.2gb, X.1Sa, int):void");
    }

    public static final void A01(C26411Sa r2, int i) {
        C55932gb r0 = (C55932gb) r2.A03.get(Integer.valueOf(i));
        if (r0 != null) {
            A00(r0, r2, i);
        }
        r2.A04.markerStart(822149121, i);
    }

    public final void A02(String str, Integer num) {
        String str2;
        if (str != null) {
            if (C18020vd.A05(C18040vf.A02, this.A00, 9144)) {
                int hashCode = str.hashCode();
                AnonymousClass19Y r2 = this.A04;
                switch (num.intValue()) {
                    case 0:
                        str2 = "TRANSCODE_Q_START";
                        break;
                    case 1:
                        str2 = "TRANSCODE_Q_END";
                        break;
                    case 2:
                        str2 = "TRANSCODE_START";
                        break;
                    case 3:
                        str2 = "TRANSCODE_END";
                        break;
                    case 4:
                        str2 = "UPLOAD_Q_START";
                        break;
                    case 5:
                        str2 = "UPLOAD_Q_END";
                        break;
                    case 6:
                        str2 = "KEY_GEN_START";
                        break;
                    case 7:
                        str2 = "KEY_GEN_END";
                        break;
                    case 8:
                        str2 = "NETWORK_START";
                        break;
                    case 9:
                        str2 = "MEDIA_CONN_START";
                        break;
                    case 10:
                        str2 = "MEDIA_CONN_END";
                        break;
                    case 11:
                        str2 = "CONNECTION_START";
                        break;
                    case 12:
                        str2 = "CONNECTION_END";
                        break;
                    case 13:
                        str2 = "REM_CONNECTION_START";
                        break;
                    case 14:
                        str2 = "REM_CONNECTION_END";
                        break;
                    case 15:
                        str2 = "REM_START";
                        break;
                    case 16:
                        str2 = "REM_END";
                        break;
                    case 17:
                        str2 = "NETWORK_END";
                        break;
                    case 18:
                        str2 = "SIDECAR_GEN_START";
                        break;
                    case 19:
                        str2 = "SIDECAR_GEN_END";
                        break;
                    case 20:
                        str2 = "POSTPROCESS_START";
                        break;
                    default:
                        str2 = "POSTPROCESS_END";
                        break;
                }
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                C18070vi.A0X(lowerCase);
                r2.markerPoint(822149121, hashCode, lowerCase);
            }
        }
    }
}
