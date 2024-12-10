package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9kA  reason: invalid class name and case insensitive filesystem */
public final class C189979kA {
    public boolean A00 = true;
    public final AnonymousClass19T A01;

    public C189979kA(AnonymousClass19T r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public final void A00(String str) {
        AnonymousClass19T r1;
        String str2;
        switch (str.hashCode()) {
            case -1313911455:
                if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT)) {
                    r1 = this.A01;
                    str2 = "fetch_auth_timeout";
                    break;
                } else {
                    return;
                }
            case 3260:
                if (str.equals("fb")) {
                    r1 = this.A01;
                    str2 = "fetch_auth_fb_error";
                    break;
                } else {
                    return;
                }
            case 3358:
                if (str.equals("ig")) {
                    r1 = this.A01;
                    str2 = "fetch_auth_ig_error";
                    break;
                } else {
                    return;
                }
            case 97213313:
                if (str.equals("fb_ig")) {
                    r1 = this.A01;
                    str2 = "fetch_auth_fb_ig_error";
                    break;
                } else {
                    return;
                }
            case 100133181:
                if (str.equals("ig_v2")) {
                    r1 = this.A01;
                    str2 = "fetch_auth_ig_v2_error";
                    break;
                } else {
                    return;
                }
            case 1273945082:
                if (str.equals("fb_ig_v2")) {
                    r1 = this.A01;
                    str2 = "fetch_auth_fb_ig_v2_error";
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        r1.markerPoint(551497305, str2);
    }
}
