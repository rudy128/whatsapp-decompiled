package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0ep  reason: invalid class name and case insensitive filesystem */
public final class C08270ep extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08270ep(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int actionMasked;
        MotionEvent A04 = this.this$0.A09;
        if (A04 != null && ((actionMasked = A04.getActionMasked()) == 7 || actionMasked == 9)) {
            AndroidComposeView androidComposeView = this.this$0;
            androidComposeView.A08 = SystemClock.uptimeMillis();
            androidComposeView.post(androidComposeView.A0t);
        }
        return C27621Wu.A00;
    }
}
