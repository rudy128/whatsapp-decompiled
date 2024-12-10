package X;

import android.transition.Transition;
import java.util.ArrayList;

public class D4W implements Transition.TransitionListener {
    public final /* synthetic */ BLT A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public D4W(BLT blt, Object obj, Object obj2, ArrayList arrayList, ArrayList arrayList2) {
        this.A00 = blt;
        this.A01 = obj;
        this.A03 = arrayList;
        this.A02 = obj2;
        this.A04 = arrayList2;
    }

    public void onTransitionStart(Transition transition) {
        Object obj = this.A01;
        if (obj != null) {
            this.A00.A09(obj, this.A03, (ArrayList) null);
        }
        Object obj2 = this.A02;
        if (obj2 != null) {
            this.A00.A09(obj2, this.A04, (ArrayList) null);
        }
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }
}
