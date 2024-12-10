package X;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

/* renamed from: X.CfC  reason: case insensitive filesystem */
public abstract class C25409CfC {
    public static final int[] A00;

    static {
        int[] A1X = BE6.A1X();
        A1X[0] = 16843848;
        A00 = A1X;
    }

    public static void A00(View view, float f) {
        int integer = view.getResources().getInteger(2131492867);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842910, 2130971363, -2130971364}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
