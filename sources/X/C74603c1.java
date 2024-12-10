package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.3c1  reason: invalid class name and case insensitive filesystem */
public class C74603c1 extends C90704eV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C74603c1(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(Animation animation, Object obj, Object obj2, int i) {
        animation.setAnimationListener(new C74603c1(obj, obj2, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0095, code lost:
        r3.Bvb();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00aa, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r3.setImageBitmap((android.graphics.Bitmap) r0);
        r2 = X.C72463Mc.A0Q();
        r2.setDuration(100);
        r3.startAnimation(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.view.animation.Animation r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x00ae;
                case 1: goto L_0x0005;
                case 2: goto L_0x00a5;
                case 3: goto L_0x0099;
                case 4: goto L_0x007e;
                case 5: goto L_0x0066;
                case 6: goto L_0x0009;
                case 7: goto L_0x004b;
                case 8: goto L_0x0032;
                case 9: goto L_0x0018;
                case 10: goto L_0x0011;
                case 11: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationEnd(r5)
            return
        L_0x0009:
            java.lang.Object r1 = r4.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            goto L_0x00aa
        L_0x0011:
            java.lang.Object r3 = r4.A02
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.Object r0 = r4.A01
            goto L_0x0020
        L_0x0018:
            java.lang.Object r0 = r4.A01
            X.4SZ r0 = (X.AnonymousClass4SZ) r0
            android.widget.ImageView r3 = r0.A06
            java.lang.Object r0 = r4.A02
        L_0x0020:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r3.setImageBitmap(r0)
            android.view.animation.AlphaAnimation r2 = X.C72463Mc.A0Q()
            r0 = 100
            r2.setDuration(r0)
            r3.startAnimation(r2)
            return
        L_0x0032:
            java.lang.Object r2 = r4.A01
            com.whatsapp.group.GroupParticipantsSearchFragment r2 = (com.whatsapp.group.GroupParticipantsSearchFragment) r2
            java.lang.Object r1 = r4.A02
            androidx.appcompat.widget.SearchView r1 = (androidx.appcompat.widget.SearchView) r1
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x0045
            r0 = 0
            r1.A0H()
            r2.A0A = r0
            return
        L_0x0045:
            X.1L4 r0 = r2.A08
            r0.A01(r1)
            return
        L_0x004b:
            java.lang.Object r2 = r4.A01
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = -2
            r1.width = r0
            r2.requestLayout()
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            r0 = 18
            X.C90584eJ.A00(r1, r4, r0)
            r2.clearAnimation()
            return
        L_0x0066:
            java.lang.Object r2 = r4.A02
            X.3rx r2 = (X.C78003rx) r2
            java.lang.Object r3 = r4.A01
            X.5Z8 r3 = (X.AnonymousClass5Z8) r3
            android.view.View r0 = r2.A01
            X.C72453Mb.A1D(r0)
            android.view.ViewGroup r1 = r2.A03
            android.view.View r0 = r2.A01
            r1.removeView(r0)
            r0 = 0
            r2.A01 = r0
            goto L_0x0095
        L_0x007e:
            java.lang.Object r2 = r4.A01
            X.3ry r2 = (X.C78013ry) r2
            java.lang.Object r3 = r4.A02
            X.5Z8 r3 = (X.AnonymousClass5Z8) r3
            android.view.View r0 = r2.A00
            X.C72453Mb.A1A(r0)
            android.view.ViewGroup r1 = r2.A04
            android.view.View r0 = r2.A00
            r1.removeView(r0)
            r0 = 0
            r2.A00 = r0
        L_0x0095:
            r3.Bvb()
            return
        L_0x0099:
            java.lang.Object r1 = r4.A02
            X.3rz r1 = (X.C78023rz) r1
            java.lang.Object r0 = r4.A01
            X.5Z8 r0 = (X.AnonymousClass5Z8) r0
            X.C78023rz.A02(r1, r0)
            return
        L_0x00a5:
            java.lang.Object r1 = r4.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 4
        L_0x00aa:
            r1.setVisibility(r0)
            return
        L_0x00ae:
            java.lang.Object r2 = r4.A01
            android.view.animation.Animation r2 = (android.view.animation.Animation) r2
            r0 = 1500(0x5dc, double:7.41E-321)
            r2.setStartOffset(r0)
            java.lang.Object r0 = r4.A02
            android.view.View r0 = (android.view.View) r0
            r0.startAnimation(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74603c1.onAnimationEnd(android.view.animation.Animation):void");
    }

    public void onAnimationStart(Animation animation) {
        if (1 - this.A00 != 0) {
            super.onAnimationStart(animation);
        } else {
            ((View) this.A02).setVisibility(0);
        }
    }
}
