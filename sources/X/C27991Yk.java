package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Yk  reason: invalid class name and case insensitive filesystem */
public class C27991Yk {
    public final AnonymousClass00O A00 = new AnonymousClass00O(0);
    public final AnonymousClass00O A01 = new AnonymousClass00O(0);

    public static C27991Yk A00(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return A02(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return A02(arrayList);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            Log.w("MotionSpec", sb.toString(), e);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.1Yl, java.lang.Object] */
    public static C27991Yk A02(List list) {
        C27991Yk r9 = new C27991Yk();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                r9.A00.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = AnonymousClass1YW.A02;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = AnonymousClass1YW.A01;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = AnonymousClass1YW.A04;
                }
                ? obj = new Object();
                obj.A00 = 0;
                obj.A01 = 1;
                obj.A02 = startDelay;
                obj.A03 = duration;
                obj.A04 = interpolator;
                obj.A00 = objectAnimator.getRepeatCount();
                obj.A01 = objectAnimator.getRepeatMode();
                r9.A01.put(propertyName, obj);
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator must be an ObjectAnimator: ");
                sb.append(animator);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return r9;
    }

    public C28001Yl A03(String str) {
        AnonymousClass00O r1 = this.A01;
        if (r1.get(str) != null) {
            return (C28001Yl) r1.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27991Yk)) {
            return false;
        }
        return this.A01.equals(((C27991Yk) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.A01);
        sb.append("}\n");
        return sb.toString();
    }

    public static C27991Yk A01(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return A00(context, resourceId);
    }
}
