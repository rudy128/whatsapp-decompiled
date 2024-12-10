package X;

import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0FO  reason: invalid class name */
public abstract class AnonymousClass0FO {
    public static final void A00(AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
