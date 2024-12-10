package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;

/* renamed from: X.4aR  reason: invalid class name */
public abstract class AnonymousClass4aR {
    public static int A01(Context context, int i, boolean z) {
        Resources resources;
        int i2;
        Resources resources2;
        int i3;
        if (i == -1) {
            resources2 = context.getResources();
            i3 = 2131103448;
        } else if (i == -2) {
            resources2 = context.getResources();
            i3 = 2131103225;
        } else {
            if (z) {
                resources = context.getResources();
                i2 = 2130903081;
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(2130970023, typedValue, true);
                resources = context.getResources();
                i2 = typedValue.resourceId;
            }
            int[] intArray = resources.getIntArray(i2);
            return intArray[i % intArray.length];
        }
        return resources2.getColor(i3);
    }

    public static void A07(View view, CharSequence charSequence, CharSequence charSequence2) {
        A08(view, charSequence, charSequence2, false);
    }

    public static int A02(C178119Bw r4) {
        int i = r4.A06;
        if (r4.A0B == null && r4.A04.A03) {
            return 2131102891;
        }
        if (i == 5) {
            return 2131102888;
        }
        return 2131102890;
    }

    public static int A03(C178119Bw r2) {
        if (r2.A06 == 5) {
            return 2131101314;
        }
        if (!r2.A04.A03 || r2.A0B != null) {
            return 2131102890;
        }
        return 2131101314;
    }

    public static C89404cP A05(Context context, String str, boolean z) {
        if (str == null) {
            return null;
        }
        int i = 2131887686;
        if (z) {
            i = 2131887685;
        }
        return new C89404cP(C17880vN.A0q(context, AnonymousClass74H.A07(str, z), AnonymousClass3MW.A1a(), 0, i), context.getString(2131887683), z);
    }

    public static void A08(View view, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        AnonymousClass1HF.A0f(view, new AnonymousClass3SR(view, charSequence, charSequence2, z));
    }

    public static int A00(Activity activity) {
        return C72483Me.A02(activity);
    }

    public static AnimationSet A04(View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), 2130772063);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(view.getContext(), 2130772010);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(view.getContext(), 2130772052);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(loadAnimation);
        animationSet.addAnimation(loadAnimation3);
        animationSet.addAnimation(loadAnimation2);
        animationSet.setRepeatMode(1);
        animationSet.setRepeatCount(-1);
        animationSet.setStartOffset(750);
        animationSet.setAnimationListener(new C74603c1(animationSet, view, 0));
        return animationSet;
    }

    public static void A06(Context context, View view) {
        ShapeDrawable A0P = C72453Mb.A0P();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130971747, typedValue, true);
        A0P.getPaint().setColor(typedValue.data);
        view.setBackground(A0P);
    }

    public static void A09(View view, boolean z) {
        view.setEnabled(z);
        float f = 0.4f;
        if (z) {
            f = 1.0f;
        }
        view.setAlpha(f);
    }
}
