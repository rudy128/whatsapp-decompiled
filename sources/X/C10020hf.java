package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0hf  reason: invalid class name and case insensitive filesystem */
public final class C10020hf extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10020hf(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i = ((AnonymousClass0JJ) obj).A00;
        boolean isInTouchMode = this.this$0.isInTouchMode();
        if (i != 1) {
            if (isInTouchMode) {
                isInTouchMode = this.this$0.requestFocusFromTouch();
            } else {
                isInTouchMode = true;
            }
        }
        return Boolean.valueOf(isInTouchMode);
    }
}
