package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.profile.ProfileInfoActivity;
import com.whatsapp.util.FloatingChildLayout;

/* renamed from: X.3Mn  reason: invalid class name and case insensitive filesystem */
public class C72553Mn extends AnimatorListenerAdapter {
    public boolean A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C72553Mn(ProfileInfoActivity profileInfoActivity, Runnable runnable) {
        this.A01 = 2;
        this.A02 = profileInfoActivity;
        this.A03 = runnable;
        this.A00 = true;
    }

    public void onAnimationEnd(Animator animator) {
        Runnable runnable;
        int i;
        switch (this.A01) {
            case 0:
                if (!this.A00) {
                    ((View) this.A03).setVisibility(4);
                    return;
                }
                return;
            case 1:
                if (!this.A00) {
                    AnonymousClass3RI.A05((AnonymousClass3RI) this.A03, false);
                }
                C18090vk r0 = (C18090vk) this.A02;
                if (r0 != null) {
                    r0.invoke();
                }
                AnonymousClass3RI r2 = (AnonymousClass3RI) this.A03;
                ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                    r2.setLayoutParams(layoutParams);
                    runnable = r2.A04;
                    if (runnable == null) {
                        return;
                    }
                } else {
                    throw AnonymousClass3MY.A0k();
                }
                break;
            case 2:
                if (this.A00) {
                    this.A00 = false;
                    if (!((AnonymousClass1FU) this.A02).A0H) {
                        return;
                    }
                } else {
                    return;
                }
                break;
            default:
                FloatingChildLayout floatingChildLayout = (FloatingChildLayout) this.A02;
                floatingChildLayout.A07.setLayerType(0, (Paint) null);
                boolean z = this.A00;
                int i2 = floatingChildLayout.A02;
                if (z) {
                    if (i2 == 3) {
                        i = 4;
                    } else {
                        return;
                    }
                } else if (i2 == 1) {
                    i = 2;
                } else {
                    return;
                }
                floatingChildLayout.A02 = i;
                break;
        }
        runnable = (Runnable) this.A03;
        runnable.run();
    }

    public void onAnimationStart(Animator animator) {
        if (this.A01 != 0) {
            super.onAnimationStart(animator);
        } else if (this.A00) {
            ((View) this.A03).setVisibility(0);
        }
    }

    public C72553Mn(Object obj, Object obj2, int i, boolean z) {
        this.A01 = i;
        this.A02 = obj2;
        this.A00 = z;
        this.A03 = obj;
    }
}
