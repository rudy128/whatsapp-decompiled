package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.1wA  reason: invalid class name and case insensitive filesystem */
public abstract class C41321wA {
    public static final C39731tY A00 = new Object();

    public static final void A01(View view, ViewGroup viewGroup, Integer num) {
        ViewGroup viewGroup2;
        int i = 0;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                if (AnonymousClass1GP.A0G(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: Setting view ");
                    sb.append(view);
                    sb.append(" to VISIBLE");
                    Log.v("FragmentManager", sb.toString());
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof ViewGroup) || parent == null) {
                    if (AnonymousClass1GP.A0G(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: Adding view ");
                        sb2.append(view);
                        sb2.append(" to Container ");
                        sb2.append(viewGroup);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    viewGroup.addView(view);
                }
            } else if (intValue != 2) {
                i = 4;
                if (AnonymousClass1GP.A0G(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: Setting view ");
                    sb3.append(view);
                    sb3.append(" to INVISIBLE");
                    Log.v("FragmentManager", sb3.toString());
                }
            } else {
                if (AnonymousClass1GP.A0G(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("SpecialEffectsController: Setting view ");
                    sb4.append(view);
                    sb4.append(" to GONE");
                    Log.v("FragmentManager", sb4.toString());
                }
                i = 8;
            }
            view.setVisibility(i);
            return;
        }
        ViewParent parent2 = view.getParent();
        if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
            if (AnonymousClass1GP.A0G(2)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("SpecialEffectsController: Removing view ");
                sb5.append(view);
                sb5.append(" from container ");
                sb5.append(viewGroup2);
                Log.v("FragmentManager", sb5.toString());
            }
            viewGroup2.removeView(view);
        }
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "REMOVED";
            case 1:
                return "VISIBLE";
            case 2:
                return "GONE";
            default:
                return "INVISIBLE";
        }
    }
}
