package X;

import android.app.Activity;
import com.whatsapp.util.Log;

/* renamed from: X.7BC  reason: invalid class name */
public class AnonymousClass7BC implements C28606E9x {
    public final /* synthetic */ C122076Mr A00;

    public void C0j() {
    }

    public void C0z(int i) {
    }

    public void C8e() {
    }

    public AnonymousClass7BC(C122076Mr r1) {
        this.A00 = r1;
    }

    public void C0r(int i, boolean z) {
        this.A00.A0X.A0J(new C146837Qu(this, i, 9, z));
    }

    public void CAS(C0Q c0q, String str) {
        C122076Mr r4;
        String string;
        Integer A0k;
        String str2;
        if (C0Q.A0C == c0q) {
            Log.i("Heroplayer/unplayable video track");
            r4 = this.A00;
            Activity activity = r4.A02;
            if (activity != null) {
                string = activity.getString(2131890023);
                A0k = C17880vN.A0j();
                str2 = "unplayable_video_track";
            } else {
                return;
            }
        } else if (C0Q.A0B == c0q) {
            Log.i("Heroplayer/unplayable audio track");
            r4 = this.A00;
            Activity activity2 = r4.A02;
            if (activity2 != null) {
                string = activity2.getString(2131890023);
                A0k = C17880vN.A0k();
                str2 = "unplayable_audio_track";
            } else {
                return;
            }
        } else {
            return;
        }
        C122076Mr.A01(r4, A0k, string, str2, true);
    }

    public void C0p(C24399C1u c1u, C0Q c0q) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PlaybackException = ");
        A10.append(c1u);
        StringBuilder A11 = AnonymousClass000.A11(AnonymousClass000.A0y("\n", A10));
        StringBuilder A112 = AnonymousClass000.A11(AnonymousClass001.A1H(C108955ca.A10("PlaybackException message = ", A11, c1u), "\n", A11));
        A112.append("PlaybackException error code name = ");
        int i = c1u.errorCode;
        if (i == 5001) {
            str = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        } else if (i != 5002) {
            switch (i) {
                case 1000:
                    str = "ERROR_CODE_UNSPECIFIED";
                    break;
                case 1001:
                    str = "ERROR_CODE_REMOTE_ERROR";
                    break;
                case 1002:
                    str = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                    break;
                case 1003:
                    str = "ERROR_CODE_TIMEOUT";
                    break;
                case 1004:
                    str = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                    break;
                default:
                    switch (i) {
                        case 2000:
                            str = "ERROR_CODE_IO_UNSPECIFIED";
                            break;
                        case 2001:
                            str = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                            break;
                        case 2002:
                            str = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                            break;
                        case 2003:
                            str = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                            break;
                        case 2004:
                            str = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                            break;
                        case 2005:
                            str = "ERROR_CODE_IO_FILE_NOT_FOUND";
                            break;
                        case 2006:
                            str = "ERROR_CODE_IO_NO_PERMISSION";
                            break;
                        case 2007:
                            str = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                            break;
                        case 2008:
                            str = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                            break;
                        default:
                            switch (i) {
                                case 3001:
                                    str = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                    break;
                                case 3002:
                                    str = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                    break;
                                case 3003:
                                    str = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                    break;
                                case 3004:
                                    str = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                    break;
                                default:
                                    switch (i) {
                                        case 4001:
                                            str = "ERROR_CODE_DECODER_INIT_FAILED";
                                            break;
                                        case 4002:
                                            str = "ERROR_CODE_DECODER_QUERY_FAILED";
                                            break;
                                        case 4003:
                                            str = "ERROR_CODE_DECODING_FAILED";
                                            break;
                                        case 4004:
                                            str = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                            break;
                                        case 4005:
                                            str = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                            break;
                                        default:
                                            switch (i) {
                                                case 6000:
                                                    str = "ERROR_CODE_DRM_UNSPECIFIED";
                                                    break;
                                                case 6001:
                                                    str = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                    break;
                                                case 6002:
                                                    str = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                    break;
                                                case 6003:
                                                    str = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                    break;
                                                case 6004:
                                                    str = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                    break;
                                                case 6005:
                                                    str = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                    break;
                                                case 6006:
                                                    str = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                    break;
                                                case 6007:
                                                    str = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                    break;
                                                case 6008:
                                                    str = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                    break;
                                                default:
                                                    if (i < 1000000) {
                                                        str = "invalid error code";
                                                        break;
                                                    } else {
                                                        str = "custom error code";
                                                        break;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            str = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        StringBuilder A113 = AnonymousClass000.A11(AnonymousClass001.A1H(str, "\n", A112));
        A113.append("videoErrorDomain = ");
        A113.append(c0q);
        this.A00.A0W.A0G("WaHeroPlayer/onPlayerError", AnonymousClass000.A0y("\n", A113), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C93(X.C26539D3a r7) {
        /*
            r6 = this;
            r6.hashCode()
            X.6Mr r5 = r6.A00
            r0 = 0
            r5.A0G = r0
            if (r7 == 0) goto L_0x0034
            int r4 = r7.A01
            if (r4 == 0) goto L_0x0034
            r3 = 0
        L_0x000f:
            if (r3 >= r4) goto L_0x0034
            r2 = 0
        L_0x0012:
            X.1IX r1 = r7.A02
            r1.get(r3)
            r0 = 1
            if (r2 >= r0) goto L_0x0037
            java.lang.Object r0 = r1.get(r3)
            X.D3X r0 = (X.D3X) r0
            r1 = 0
            X.D48[] r0 = r0.A02
            r0 = r0[r1]
            java.lang.String r1 = r0.A0S
            if (r1 == 0) goto L_0x0035
            java.lang.String r0 = "audio"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0035
            r0 = 1
            r5.A0G = r0
        L_0x0034:
            return
        L_0x0035:
            r2 = 1
            goto L_0x0012
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7BC.C93(X.D3a):void");
    }
}
