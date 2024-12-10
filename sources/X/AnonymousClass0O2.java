package X;

import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0O2  reason: invalid class name */
public abstract class AnonymousClass0O2 {
    public static final ViewGroup.LayoutParams A00 = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r2 != null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass0VS A00(X.AnonymousClass0D1 r3, X.AnonymousClass05G r4, X.AnonymousClass1OS r5) {
        /*
            X.AnonymousClass0O6.A00()
            int r0 = r4.getChildCount()
            if (r0 <= 0) goto L_0x002d
            r0 = 0
            android.view.View r2 = r4.getChildAt(r0)
            boolean r0 = r2 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r0 == 0) goto L_0x0016
            androidx.compose.ui.platform.AndroidComposeView r2 = (androidx.compose.ui.platform.AndroidComposeView) r2
            if (r2 != 0) goto L_0x0028
        L_0x0016:
            android.content.Context r1 = r4.getContext()
            X.0wh r0 = r3.A0Y()
            androidx.compose.ui.platform.AndroidComposeView r2 = new androidx.compose.ui.platform.AndroidComposeView
            r2.<init>(r1, r0)
            android.view.ViewGroup$LayoutParams r0 = A00
            r4.addView((android.view.View) r2, (android.view.ViewGroup.LayoutParams) r0)
        L_0x0028:
            X.0VS r0 = A01(r3, r2, r5)
            return r0
        L_0x002d:
            r4.removeAllViews()
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0O2.A00(X.0D1, X.05G, X.1OS):X.0VS");
    }

    public static final AnonymousClass0VS A01(AnonymousClass0D1 r4, AndroidComposeView androidComposeView, AnonymousClass1OS r6) {
        AnonymousClass0VS r1;
        AnonymousClass0VT r3 = new AnonymousClass0VT(new AnonymousClass0VP(androidComposeView.getRoot()), r4);
        Object tag = androidComposeView.getTag(2131437091);
        if (!(tag instanceof AnonymousClass0VS) || (r1 = (AnonymousClass0VS) tag) == null) {
            r1 = new AnonymousClass0VS(r3, androidComposeView);
            androidComposeView.setTag(2131437091, r1);
        }
        r1.CIT(r6);
        return r1;
    }
}
