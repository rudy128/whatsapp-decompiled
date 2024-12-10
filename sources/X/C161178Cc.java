package X;

import android.os.CountDownTimer;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.registration.entercode.EnterCodeViewModel;

/* renamed from: X.8Cc  reason: invalid class name and case insensitive filesystem */
public class C161178Cc extends CountDownTimer {
    public final int A00;
    public final long A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161178Cc(EnterCodeViewModel enterCodeViewModel, long j) {
        super(j, 1000);
        this.A00 = 2;
        this.A01 = j;
        this.A02 = enterCodeViewModel;
    }

    public void onFinish() {
        switch (this.A00) {
            case 0:
                FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) this.A02;
                fingerprintBottomSheet.A08 = null;
                if (this.A01 <= AnonymousClass11P.A01(fingerprintBottomSheet.A2E())) {
                    FingerprintBottomSheet.A06(fingerprintBottomSheet);
                    return;
                }
                return;
            case 1:
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) this.A02;
                CountDownTimer countDownTimer = verifyTwoFactorAuth.A06;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                    verifyTwoFactorAuth.A06 = null;
                }
                verifyTwoFactorAuth.CIM(true);
                verifyTwoFactorAuth.A08.setVisibility(4);
                TextView textView = verifyTwoFactorAuth.A08;
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, 6);
                AnonymousClass3MY.A0y(verifyTwoFactorAuth, textView, objArr, 2131897182);
                C17880vN.A1B(verifyTwoFactorAuth.getPreferences(0).edit(), "code_retry_time");
                return;
            default:
                EnterCodeViewModel enterCodeViewModel = (EnterCodeViewModel) this.A02;
                enterCodeViewModel.A00 = null;
                enterCodeViewModel.A04.A0E("complete");
                C72463Mc.A1B(enterCodeViewModel.A02);
                A5R a5r = enterCodeViewModel.A01;
                if (a5r == null) {
                    C18070vi.A11("verifyPhoneNumberPrefs");
                    throw null;
                } else {
                    a5r.A04();
                    return;
                }
        }
    }

    public void onTick(long j) {
        switch (this.A00) {
            case 0:
                FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) this.A02;
                C161418Dd A002 = fingerprintBottomSheet.A03;
                if (A002 != null) {
                    String A16 = AnonymousClass3MX.A16(fingerprintBottomSheet, C64052u8.A0D(fingerprintBottomSheet.A2F(), (String) null, C17880vN.A04(j)), AnonymousClass3MW.A1a(), 0, 2131893688);
                    C18070vi.A0X(A16);
                    A002.A01(A16);
                    return;
                }
                return;
            case 1:
                ProgressBar progressBar = ((VerifyTwoFactorAuth) this.A02).A07;
                long j2 = this.A01;
                progressBar.setProgress((int) ((((double) (j2 - j)) * 100.0d) / ((double) j2)));
                return;
            default:
                AnonymousClass1DT r6 = ((EnterCodeViewModel) this.A02).A03;
                long j3 = this.A01;
                r6.A0E(Double.valueOf((((double) (j3 - j)) * 100.0d) / ((double) j3)));
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161178Cc(Object obj, int i, long j, long j2) {
        super(j2, 1000);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
    }
}
