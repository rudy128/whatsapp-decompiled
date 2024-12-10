package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9z3  reason: invalid class name and case insensitive filesystem */
public final class C198869z3 {
    public static final C198869z3 A00 = new Object();

    public final C192929pG A00(Context context, WindowLayoutInfo windowLayoutInfo) {
        C28211Zi BFR;
        C199069zN r4;
        C199059zM r2;
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            BFR = AnonymousClass1ZS.A00.A04(context);
        } else if (i2 < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        } else {
            BFR = AnonymousClass1ZS.A00.BFR((Activity) context);
        }
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList A0t = C108965cb.A0t(displayFeatures);
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                C18070vi.A0V(foldingFeature);
                FoldingFeature foldingFeature2 = foldingFeature;
                C18070vi.A0d(foldingFeature2, 1);
                int type = foldingFeature2.getType();
                if (type == 1) {
                    r4 = C199069zN.A01;
                } else if (type == 2) {
                    r4 = C199069zN.A02;
                }
                int state = foldingFeature2.getState();
                if (state == 1) {
                    r2 = C199059zM.A01;
                } else if (state == 2) {
                    r2 = C199059zM.A02;
                }
                Rect bounds = foldingFeature2.getBounds();
                C18070vi.A0X(bounds);
                AnonymousClass1Zh r8 = new AnonymousClass1Zh(bounds);
                Rect A002 = BFR.A00();
                int i3 = r8.A00 - r8.A03;
                if (!(i3 == 0 && r8.A02 - r8.A01 == 0) && (((i = r8.A02 - r8.A01) == A002.width() || i3 == A002.height()) && ((i >= A002.width() || i3 >= A002.height()) && !(i == A002.width() && i3 == A002.height())))) {
                    Rect bounds2 = foldingFeature2.getBounds();
                    C18070vi.A0X(bounds2);
                    A0t.add(new C20344AHa(new AnonymousClass1Zh(bounds2), r2, r4));
                }
            }
        }
        return new C192929pG(A0t);
    }
}
