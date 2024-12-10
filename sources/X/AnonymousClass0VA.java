package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.0VA  reason: invalid class name */
public final class AnonymousClass0VA implements C16190rr {
    public final /* synthetic */ C17560ur A00;

    public AnonymousClass0VA(C17560ur r1) {
        this.A00 = r1;
    }

    public final Object BDK(C16910tQ r7, C30391dr r8, C18090vk r9) {
        View view = (View) C02690Ez.A00(AnonymousClass0PK.A04, this.A00);
        long Bhu = r7.Bhu(AnonymousClass0QY.A03);
        AnonymousClass0NU r0 = (AnonymousClass0NU) r9.invoke();
        if (r0 != null) {
            AnonymousClass0NU A02 = r0.A02(Bhu);
            view.requestRectangleOnScreen(new Rect((int) A02.A01, (int) A02.A03, (int) A02.A02, (int) A02.A00), false);
        }
        return C27621Wu.A00;
    }
}
