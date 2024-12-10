package X;

import android.text.Editable;
import com.whatsapp.WaEditText;
import com.whatsapp.registration.email.RegisterEmail;

/* renamed from: X.5U6  reason: invalid class name */
public final class AnonymousClass5U6 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ RegisterEmail this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5U6(RegisterEmail registerEmail) {
        super(1);
        this.this$0 = registerEmail;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0M = AnonymousClass000.A0M(obj);
        if (A0M > -1 && A0M < this.this$0.A0H.size()) {
            RegisterEmail registerEmail = this.this$0;
            WaEditText waEditText = registerEmail.A02;
            if (waEditText != null) {
                waEditText.setText((CharSequence) registerEmail.A0H.get(A0M));
                WaEditText waEditText2 = this.this$0.A02;
                if (waEditText2 != null) {
                    Editable text = waEditText2.getText();
                    if (text != null) {
                        WaEditText waEditText3 = this.this$0.A02;
                        if (waEditText3 != null) {
                            waEditText3.setSelection(text.length());
                        }
                    }
                }
            }
            C18070vi.A11("emailInput");
            throw null;
        }
        return C27621Wu.A00;
    }
}
