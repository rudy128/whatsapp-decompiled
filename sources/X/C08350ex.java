package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0ex  reason: invalid class name and case insensitive filesystem */
public final class C08350ex extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ boolean $gainFocus;
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08350ex(AndroidComposeView androidComposeView, boolean z) {
        super(0);
        this.$gainFocus = z;
        this.this$0 = androidComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z = this.$gainFocus;
        AndroidComposeView androidComposeView = this.this$0;
        if (z) {
            androidComposeView.clearFocus();
        } else {
            androidComposeView.requestFocus();
        }
        return C27621Wu.A00;
    }
}
