package X;

import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.Dsh  reason: case insensitive filesystem */
public final class C28172Dsh extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $onStateUpdate;
    public final /* synthetic */ TextInputView $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28172Dsh(TextInputView textInputView, C22821Di r3) {
        super(2);
        this.$view = textInputView;
        this.$onStateUpdate = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int A0M = AnonymousClass000.A0M(obj);
        int A0M2 = AnonymousClass000.A0M(obj2);
        int maxLines = this.$view.getMaxLines();
        if (maxLines == -1 || A0M2 <= maxLines || A0M < maxLines) {
            this.$onStateUpdate.invoke(this.$view.getText().subSequence(0, this.$view.getText().length()));
        }
        return C27621Wu.A00;
    }
}
