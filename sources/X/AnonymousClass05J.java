package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.05J  reason: invalid class name */
public final class AnonymousClass05J extends ViewOutlineProvider {
    public void getOutline(View view, Outline outline) {
        C18070vi.A0z(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
        boolean z = AnonymousClass05A.A0H;
        Outline A05 = ((AnonymousClass05A) view).A09.A05();
        C18070vi.A0b(A05);
        outline.set(A05);
    }
}
