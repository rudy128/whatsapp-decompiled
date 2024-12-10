package X;

import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.Dli  reason: case insensitive filesystem */
public final class C27806Dli extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ TextInputView $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27806Dli(CTH cth, TextInputView textInputView) {
        super(0);
        this.$controller = cth;
        this.$view = textInputView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.$controller.A06 = AnonymousClass1D6.A00(Integer.valueOf(this.$view.getSelectionStart()), this.$view.getSelectionEnd());
        CTH cth = this.$controller;
        CUS cus = cth.A03;
        if (cus != null) {
            cth.A00 = cus.A0H;
            return C27621Wu.A00;
        }
        throw C17880vN.A0g();
    }
}
