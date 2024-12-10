package X;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

public class D4V implements Transition.TransitionListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ BLT A01;
    public final /* synthetic */ ArrayList A02;

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public D4V(View view, BLT blt, ArrayList arrayList) {
        this.A01 = blt;
        this.A00 = view;
        this.A02 = arrayList;
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.A00.setVisibility(8);
        ArrayList arrayList = this.A02;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            BE6.A0R(arrayList, i).setVisibility(0);
        }
    }

    public void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
