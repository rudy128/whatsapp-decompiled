package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import androidx.fragment.app.Fragment;
import com.whatsapp.ConversationFragment;

/* renamed from: X.4Zo  reason: invalid class name and case insensitive filesystem */
public abstract class C88404Zo {
    public static AnimationSet A00(boolean z, boolean z2, boolean z3) {
        AlphaAnimation alphaAnimation;
        AnimationSet animationSet = new AnimationSet(true);
        float f = 1.0f;
        if (z3) {
            if (!z2) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            }
            alphaAnimation.setDuration(100);
            animationSet.addAnimation(alphaAnimation);
        }
        if (!z) {
            f = -1.0f;
        }
        float f2 = 0.0f;
        if (z2) {
            f2 = f;
            f = 0.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, f2, 1, f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(100);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(100);
        return animationSet;
    }

    @Deprecated
    public static C108885cS A01(Context context) {
        Activity A00 = C18050vg.A00(context);
        if (A00 != null) {
            if (A00 instanceof C108885cS) {
                return (C108885cS) A00;
            }
            if (A00 instanceof AnonymousClass1FY) {
                Fragment A0Q = ((AnonymousClass1FL) A00).getSupportFragmentManager().A0Q("com.whatsapp.HomeActivity.ConversationFragment");
                if (A0Q instanceof ConversationFragment) {
                    return ((ConversationFragment) A0Q).A02;
                }
            }
        }
        return null;
    }

    public static C108885cS A02(View view) {
        return A01(view.getContext());
    }

    public static Object A03(Context context, Class cls) {
        Activity A00 = C18050vg.A00(context);
        if (A00 != null) {
            if (cls.isAssignableFrom(A00.getClass())) {
                return cls.cast(A00);
            }
            if (A00 instanceof AnonymousClass1FY) {
                Fragment A0Q = ((AnonymousClass1FL) A00).getSupportFragmentManager().A0Q("com.whatsapp.HomeActivity.ConversationFragment");
                if (A0Q instanceof ConversationFragment) {
                    ConversationFragment conversationFragment = (ConversationFragment) A0Q;
                    if (cls.isAssignableFrom(conversationFragment.A02.getClass())) {
                        return cls.cast(conversationFragment.A02);
                    }
                    return null;
                }
            }
        }
        return null;
    }
}
