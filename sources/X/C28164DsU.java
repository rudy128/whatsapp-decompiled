package X;

import android.text.Editable;
import android.text.TextUtils;
import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.DsU  reason: case insensitive filesystem */
public final class C28164DsU extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28164DsU(CTH cth) {
        super(2);
        this.$controller = cth;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        TextInputView textInputView = (TextInputView) obj2;
        C18070vi.A0d(textInputView, 1);
        this.$controller.A00 = textInputView.getKeyListener();
        AnonymousClass1D6 r2 = this.$controller.A06;
        Editable text = textInputView.getText();
        if (r2 != null) {
            if (text != null) {
                int min = Math.min(C108955ca.A09(r2), text.length());
                textInputView.setSelection(Math.min(AnonymousClass3MZ.A04(r2), min), min);
            }
        } else if (text != null) {
            textInputView.setSelection(text.length());
        }
        CTH cth = this.$controller;
        if (!textInputView.isFocused() && C24674CEo.A00.A04(textInputView) && C26188CuE.A03(textInputView)) {
            C26188CuE.A00(TextUtils.TruncateAt.END, cth, textInputView);
        }
        return new AnonymousClass0I3(new C27806Dli(this.$controller, textInputView));
    }
}
