package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.3Z7  reason: invalid class name */
public final class AnonymousClass3Z7 extends C42011xT {
    public final Context A00;
    public final View A01;
    public final C203411t A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Z7(View view, C203411t r7, C18000vb r8, boolean z) {
        super(view);
        C18070vi.A0o(view, r7, r8);
        this.A02 = r7;
        this.A01 = AnonymousClass3MY.A0C(AnonymousClass3Ma.A05(view), 16908290);
        this.A00 = view.getContext();
        View view2 = this.A0H;
        ImageView A0G = AnonymousClass3MW.A0G(view2, 2131429091);
        Context context = A0G.getContext();
        C74743cP.A03(AnonymousClass4aX.A05(context, AnonymousClass3MX.A06(context, 2131233242), 2131101222), A0G, r8);
        if (!z) {
            view2.setBackground((Drawable) null);
            C72463Mc.A13(view2, 2131430073);
        }
    }
}
