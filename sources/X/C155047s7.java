package X;

import android.widget.TextView;
import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity;

/* renamed from: X.7s7  reason: invalid class name and case insensitive filesystem */
public final class C155047s7 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AccountLinkingNativeAuthActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155047s7(AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity) {
        super(0);
        this.this$0 = accountLinkingNativeAuthActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        TextView textView = (TextView) C110885hR.A0A(this.this$0, 2131430821);
        AnonymousClass779 r0 = this.this$0.A03;
        if (r0 == null) {
            C18070vi.A11("fb4aUserEntityForNativeAuth");
            throw null;
        }
        textView.setText((CharSequence) r0.A01.A00("XFAM_CROSSPOSTING_NATIVE_AUTH_UI"));
        return C27621Wu.A00;
    }
}
