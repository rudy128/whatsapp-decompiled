package X;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.0Xd  reason: invalid class name and case insensitive filesystem */
public final class C06150Xd implements C15850rJ {
    public final AccessibilityManager A00;

    public C06150Xd(Context context) {
        Object systemService = context.getSystemService("accessibility");
        C18070vi.A0z(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.A00 = (AccessibilityManager) systemService;
    }
}
