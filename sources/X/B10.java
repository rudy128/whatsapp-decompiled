package X;

import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.payments.ui.BrazilAddPixFragment;

public final class B10 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ TextInputLayout $pixKeyValueInputLayout;
    public final /* synthetic */ BrazilAddPixFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B10(TextInputLayout textInputLayout, BrazilAddPixFragment brazilAddPixFragment) {
        super(1);
        this.this$0 = brazilAddPixFragment;
        this.$pixKeyValueInputLayout = textInputLayout;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String A1H;
        Number number = (Number) obj;
        BrazilAddPixFragment brazilAddPixFragment = this.this$0;
        TextInputLayout textInputLayout = this.$pixKeyValueInputLayout;
        if (number == null) {
            A1H = null;
        } else {
            A1H = brazilAddPixFragment.A1H(number.intValue());
        }
        textInputLayout.setError(A1H);
        return C27621Wu.A00;
    }
}
