package X;

import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class BLT extends C25842Cmw {
    public void A09(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                A09(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!A00(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i < size) {
                    transition.addTarget(BE6.A0R(arrayList2, i));
                    i++;
                }
            }
            int size2 = arrayList.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    transition.removeTarget(BE6.A0R(arrayList, size2));
                } else {
                    return;
                }
            }
        }
    }

    public static boolean A00(Transition transition) {
        List<Integer> targetIds = transition.getTargetIds();
        if (targetIds != null && !targetIds.isEmpty()) {
            return true;
        }
        List<String> targetNames = transition.getTargetNames();
        if (targetNames != null && !targetNames.isEmpty()) {
            return true;
        }
        List<Class> targetTypes = transition.getTargetTypes();
        if (targetTypes == null || targetTypes.isEmpty()) {
            return false;
        }
        return true;
    }
}
