package X;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0Rp  reason: invalid class name and case insensitive filesystem */
public final class C05290Rp implements ViewTranslationCallback {
    public boolean onClearTranslation(View view) {
        C18070vi.A0z(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).A0u.A1e();
        return true;
    }

    public boolean onHideTranslation(View view) {
        C18070vi.A0z(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).A0u.A1f();
        return true;
    }

    public boolean onShowTranslation(View view) {
        C18070vi.A0z(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).A0u.A1h();
        return true;
    }
}
