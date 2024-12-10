package X;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0Rm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C05270Rm implements ViewTreeObserver.OnTouchModeChangeListener {
    public final /* synthetic */ AndroidComposeView A00;

    public final void onTouchModeChanged(boolean z) {
        AndroidComposeView.A0Q(this.A00, z);
    }

    public /* synthetic */ C05270Rm(AndroidComposeView androidComposeView) {
        this.A00 = androidComposeView;
    }
}
