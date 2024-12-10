package X;

import android.transition.Transition;
import android.view.View;

/* renamed from: X.Bpq  reason: case insensitive filesystem */
public final class C23801Bpq extends C1419277m {
    public final /* synthetic */ AnonymousClass1FU A00;
    public final /* synthetic */ CZW A01;

    public void onTransitionStart(Transition transition) {
        C18070vi.A0d(transition, 0);
        AnonymousClass1FU r1 = this.A00;
        View findViewById = r1.findViewById(2131433831);
        View findViewById2 = r1.findViewById(2131433835);
        findViewById.setVisibility(4);
        findViewById2.setVisibility(0);
    }

    public C23801Bpq(AnonymousClass1FU r1, CZW czw) {
        this.A00 = r1;
        this.A01 = czw;
    }
}
