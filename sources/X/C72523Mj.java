package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.whatsapp.contact.FacepileView;
import java.util.List;

/* renamed from: X.3Mj  reason: invalid class name and case insensitive filesystem */
public class C72523Mj extends AnimatorListenerAdapter {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C72523Mj(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A00 = i2;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
        this.A01 = i;
    }

    public void onAnimationEnd(Animator animator) {
        C28931bI r0;
        FacepileView facepileView;
        if (this.A00 != 0) {
            C73133Pz r1 = (C73133Pz) this.A04;
            int i = this.A01;
            r1.setVisibility(i);
            if (!(i == 0 || (r0 = r1.A0L) == null || (facepileView = (FacepileView) r0.A02()) == null)) {
                facepileView.setContactsSize(0);
            }
            C18090vk r02 = (C18090vk) this.A02;
            if (r02 != null) {
                r02.invoke();
                return;
            }
            return;
        }
        C73133Pz r4 = (C73133Pz) this.A04;
        r4.A04 = null;
        C73133Pz.A03((C63312sr) this.A02, r4, (List) this.A03, this.A01, true);
    }

    public void onAnimationStart(Animator animator) {
        if (1 - this.A00 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        C18070vi.A0d(animator, 0);
        super.onAnimationStart(animator);
        if (this.A01 == 0) {
            ((View) this.A04).setVisibility(0);
        }
        C18090vk r0 = (C18090vk) this.A03;
        if (r0 != null) {
            r0.invoke();
        }
    }
}
