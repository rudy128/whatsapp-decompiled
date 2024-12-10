package X;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0Wh  reason: invalid class name and case insensitive filesystem */
public final class C05930Wh implements C16390sB {
    public C16990tY A00 = AnonymousClass0MT.A00;
    public final /* synthetic */ AndroidComposeView A01;

    public C05930Wh(AndroidComposeView androidComposeView) {
        this.A01 = androidComposeView;
    }

    public void CJ8(C16990tY r3) {
        if (r3 == null) {
            r3 = AnonymousClass0MT.A00;
        }
        this.A00 = r3;
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass0FE.A00(this.A01, r3);
        }
    }
}
