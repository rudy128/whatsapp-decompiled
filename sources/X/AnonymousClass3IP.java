package X;

import com.whatsapp.registration.email.VerifyEmail;
import com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel;

/* renamed from: X.3IP  reason: invalid class name */
public final class AnonymousClass3IP extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ VerifyEmail this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3IP(VerifyEmail verifyEmail) {
        super(1);
        this.this$0 = verifyEmail;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        if (str.equals("complete")) {
            RetryCodeCountdownTimersViewModel retryCodeCountdownTimersViewModel = this.this$0.A0C;
            if (retryCodeCountdownTimersViewModel == null) {
                C18070vi.A11("retryCodeCountdownTimersViewModel");
                throw null;
            }
            retryCodeCountdownTimersViewModel.A0V("email_capture");
        }
        return C27621Wu.A00;
    }
}
