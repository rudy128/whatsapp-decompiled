package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.AfQ  reason: case insensitive filesystem */
public class C21155AfQ implements BCH {
    public final BCH A00;
    public final /* synthetic */ C19995A2i A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public void C3d(CQF cqf) {
        C18070vi.A0d(cqf, 0);
        this.A00.C3d(cqf);
    }

    public void C3l(String str) {
        C18070vi.A0d(str, 0);
        this.A00.C3l(str);
    }

    public C21155AfQ(C19995A2i a2i, BCH bch, String str, String str2, boolean z) {
        this.A01 = a2i;
        this.A03 = str;
        this.A04 = z;
        this.A02 = str2;
        this.A00 = bch;
    }

    public void C3j(C187029f9 r6) {
        String str;
        C19943A0a a0a;
        String str2;
        String str3;
        C19943A0a a0a2;
        String str4;
        String str5;
        String str6 = null;
        if (r6.A03) {
            a0a2 = this.A01.A05;
            str4 = this.A03;
            str5 = "CACHE_HIT";
        } else if (r6.A00 == 5) {
            boolean z = this.A04;
            a0a2 = this.A01.A05;
            str4 = this.A03;
            if (z) {
                str5 = "REQUEST_SUCCESS";
            } else {
                str5 = "PREFETCH_REQUEST_SUCCESS";
            }
        } else {
            Exception exc = r6.A02;
            if (exc != null) {
                str6 = exc.getMessage();
            }
            HashMap A11 = C17880vN.A11();
            switch (r6.A00) {
                case 1:
                    str = "REQUEST_FAILED";
                    break;
                case 2:
                    str = "INVALID_TOS_VERSION";
                    break;
                case 3:
                    str = "NULL_LAYOUT";
                    break;
                case 4:
                    str = "UNEXPECTED_ERROR";
                    break;
                case 5:
                    str = "SUCCESS";
                    break;
                case 6:
                    str = "UNKNOWN";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "EXPIRED_TOKEN";
                    break;
                case 9:
                    str = "PING_NEEDED";
                    break;
                default:
                    str = "RETRY_WITH_BACKOFF";
                    break;
            }
            A11.put("EVENT_PARAM_ERROR_CODE", str);
            A11.put("EVENT_PARAM_ERROR_MESSAGE", str6);
            if (this.A04) {
                a0a = this.A01.A05;
                str2 = this.A03;
                str3 = "REQUEST_FAILURE";
            } else {
                A11.put("EVENT_PARAM_BLOKS_PARAMS", this.A02);
                a0a = this.A01.A05;
                str2 = this.A03;
                str3 = "PREFETCH_REQUEST_FAILURE";
            }
            a0a.A02(str2, str3, A11);
            this.A00.C3j(r6);
        }
        a0a2.A02(str4, str5, (Map) null);
        this.A00.C3j(r6);
    }
}
