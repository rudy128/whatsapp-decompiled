package X;

import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.Dml  reason: case insensitive filesystem */
public final class C27850Dml extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ C22811Dh $isExplicitKeyListenerSet;
    public final /* synthetic */ C26574D4o $multiplexingFocusChangeListener;
    public final /* synthetic */ C98494rF $suppressKeyboardFocusChangeListener;
    public final /* synthetic */ TextInputView $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27850Dml(CTH cth, C26574D4o d4o, TextInputView textInputView, C22811Dh r5, C98494rF r6) {
        super(0);
        this.$isExplicitKeyListenerSet = r5;
        this.$view = textInputView;
        this.$controller = cth;
        this.$suppressKeyboardFocusChangeListener = r6;
        this.$multiplexingFocusChangeListener = d4o;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C26574D4o d4o;
        if (this.$isExplicitKeyListenerSet.element) {
            TextInputView textInputView = this.$view;
            CUS cus = this.$controller.A03;
            if (cus != null) {
                textInputView.setKeyListener(cus.A0H);
            } else {
                throw C17880vN.A0g();
            }
        }
        Object obj = this.$suppressKeyboardFocusChangeListener.element;
        if (!(obj == null || (d4o = this.$multiplexingFocusChangeListener) == null)) {
            d4o.A00.remove(obj);
        }
        return C27621Wu.A00;
    }
}
