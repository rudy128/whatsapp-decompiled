package X;

import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import androidx.transition.FragmentTransitionSupport;

/* renamed from: X.DmX  reason: case insensitive filesystem */
public final class C27836DmX extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ViewGroup $container;
    public final /* synthetic */ Object $mergedTransition;
    public final /* synthetic */ BLW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27836DmX(ViewGroup viewGroup, BLW blw, Object obj) {
        super(0);
        this.this$0 = blw;
        this.$container = viewGroup;
        this.$mergedTransition = obj;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C25842Cmw cmw = this.this$0.A03;
        ViewGroup viewGroup = this.$container;
        Object obj = this.$mergedTransition;
        if (cmw instanceof FragmentTransitionSupport) {
            C29191bl.A02(viewGroup, (AnonymousClass1LG) obj);
        } else {
            TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
        }
        return C27621Wu.A00;
    }
}
