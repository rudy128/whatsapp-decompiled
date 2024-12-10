package X;

import android.os.Bundle;
import com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeFullScreenFragment;

/* renamed from: X.9Rp  reason: invalid class name and case insensitive filesystem */
public abstract class C181729Rp {
    public static final RequestServerDrivenOtpCodeFullScreenFragment A00(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, boolean z) {
        RequestServerDrivenOtpCodeFullScreenFragment requestServerDrivenOtpCodeFullScreenFragment = new RequestServerDrivenOtpCodeFullScreenFragment();
        Bundle A0D = C17880vN.A0D();
        if (l != null) {
            A0D.putLong("EXTRA_SMS_RETRY_TIME", l.longValue());
        }
        if (l2 != null) {
            A0D.putLong("EXTRA_FLASH_RETRY_TIME", l2.longValue());
        }
        if (l3 != null) {
            A0D.putLong("EXTRA_VOICE_RETRY_TIME", l3.longValue());
        }
        if (l4 != null) {
            A0D.putLong("EXTRA_WA_OLD_RETRY_TIME", l4.longValue());
        }
        if (l5 != null) {
            A0D.putLong("EXTRA_EMAIL_OTP_RETRY_TIME", l5.longValue());
        }
        if (l6 != null) {
            A0D.putLong("EXTRA_SEND_SMS_RETRY_TIME", l6.longValue());
        }
        if (str != null) {
            A0D.putString("EXTRA_WA_OLD_DEVICE_NAME", str);
        }
        A0D.putBoolean("EXTRA_IS_FIRST_DBS", z);
        requestServerDrivenOtpCodeFullScreenFragment.A1R(A0D);
        return requestServerDrivenOtpCodeFullScreenFragment;
    }
}
