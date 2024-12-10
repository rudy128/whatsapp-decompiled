package X;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.28i  reason: invalid class name and case insensitive filesystem */
public final class C452828i extends C42011xT {
    public final FrameLayout A00;
    public final /* synthetic */ AnonymousClass28H A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C452828i(View view, AnonymousClass28H r5) {
        super(view);
        this.A01 = r5;
        View findViewById = view.findViewById(2131435439);
        C18070vi.A0X(findViewById);
        FrameLayout frameLayout = (FrameLayout) findViewById;
        this.A00 = frameLayout;
        frameLayout.setContentDescription(view.getResources().getString(2131890201));
    }
}
