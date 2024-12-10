package X;

import android.view.View;

/* renamed from: X.5nC  reason: invalid class name and case insensitive filesystem */
public abstract class C113505nC extends C42011xT {
    public final View A00;
    public final /* synthetic */ C112165l2 A01;

    public final void A0B(C133706pM r7) {
        View view = this.A00;
        C133706pM r1 = r7;
        view.setOnClickListener(new AnonymousClass78E(r1, this.A01, this, view, 19));
        view.setSelected(r7.A01);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113505nC(View view, C112165l2 r2) {
        super(view);
        this.A01 = r2;
        this.A00 = view;
    }
}
