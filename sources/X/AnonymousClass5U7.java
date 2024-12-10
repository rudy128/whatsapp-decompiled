package X;

import android.widget.TextView;
import com.whatsapp.registration.email.VerifyEmail;

/* renamed from: X.5U7  reason: invalid class name */
public final class AnonymousClass5U7 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ VerifyEmail this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5U7(VerifyEmail verifyEmail) {
        super(1);
        this.this$0 = verifyEmail;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A05 = C17880vN.A05(obj);
        if (A05 == Long.MAX_VALUE || A05 <= 0) {
            C28931bI r0 = this.this$0.A0D;
            if (r0 != null) {
                r0.A04(8);
            }
            C18070vi.A11("shortestWaitTimeTextViewStubHolder");
            throw null;
        }
        C28931bI r1 = this.this$0.A0D;
        if (r1 != null) {
            r1.A04(0);
            C28931bI r02 = this.this$0.A0D;
            if (r02 != null) {
                TextView A0M = AnonymousClass3MX.A0M(r02);
                VerifyEmail verifyEmail = this.this$0;
                A0M.setText(A9B.A0C(verifyEmail, verifyEmail.A00, verifyEmail.getString(2131895279), 2131755361, A05, false));
            }
        }
        C18070vi.A11("shortestWaitTimeTextViewStubHolder");
        throw null;
        return C27621Wu.A00;
    }
}
