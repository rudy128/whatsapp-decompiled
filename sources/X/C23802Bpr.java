package X;

import android.transition.Transition;
import android.view.View;
import android.view.Window;

/* renamed from: X.Bpr  reason: case insensitive filesystem */
public final class C23802Bpr extends C1419277m {
    public final /* synthetic */ Window A00;
    public final /* synthetic */ AnonymousClass1FU A01;
    public final /* synthetic */ CZW A02;

    public void onTransitionEnd(Transition transition) {
        C18070vi.A0d(transition, 0);
        AnonymousClass1FU r1 = this.A01;
        View findViewById = r1.findViewById(2131433831);
        View findViewById2 = r1.findViewById(2131433835);
        findViewById.setVisibility(0);
        findViewById2.setVisibility(4);
        this.A00.setStatusBarColor(-16777216);
    }

    public C23802Bpr(Window window, AnonymousClass1FU r2, CZW czw) {
        this.A01 = r2;
        this.A02 = czw;
        this.A00 = window;
    }
}
