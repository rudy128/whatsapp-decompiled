package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public final class BEG extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ BLV A02;
    public final /* synthetic */ C39481t9 A03;
    public final /* synthetic */ boolean A04;

    public BEG(View view, ViewGroup viewGroup, BLV blv, C39481t9 r4, boolean z) {
        this.A01 = viewGroup;
        this.A00 = view;
        this.A04 = z;
        this.A03 = r4;
        this.A02 = blv;
    }

    public void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.A01;
        View view = this.A00;
        viewGroup.endViewTransition(view);
        if (this.A04) {
            Integer num = this.A03.A00;
            C18070vi.A0W(view);
            C41321wA.A01(view, viewGroup, num);
        }
        BLV blv = this.A02;
        blv.A01.A00.A03(blv);
        if (AnonymousClass1GP.A0G(2)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Animator from operation ");
            A10.append(this.A03);
            Log.v("FragmentManager", AnonymousClass000.A0y(" has ended.", A10));
        }
    }
}
