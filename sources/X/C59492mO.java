package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.2mO  reason: invalid class name and case insensitive filesystem */
public final class C59492mO {
    public C454028v A00;
    public C59272m2 A01 = new C59272m2(0, false, false);
    public WeakReference A02;
    public final C22716BMd A03 = new C22716BMd(this, 3);

    public final C454028v A00(Context context, int i, boolean z) {
        C454028v r2;
        C18070vi.A0d(context, 0);
        if (this.A01.A00 != i || (r2 = this.A00) == null) {
            C59272m2 r1 = new C59272m2(i, z, true);
            this.A01 = r1;
            A01();
            r2 = C454028v.A03(context, r1.A00);
            if (r2 == null) {
                r2 = null;
            } else {
                r2.A08(this.A03);
                if (r1.A02) {
                    r2.start();
                }
            }
            this.A00 = r2;
        }
        return r2;
    }

    public final void A02() {
        this.A01 = new C59272m2(0, false, false);
        WeakReference weakReference = this.A02;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A02 = null;
        A01();
    }

    public final void A01() {
        C454028v r2 = this.A00;
        if (r2 != null) {
            Drawable drawable = r2.A00;
            if (drawable != null) {
                C62722rr.A00(drawable);
            } else {
                Animator.AnimatorListener animatorListener = r2.A00;
                if (animatorListener != null) {
                    r2.A05.A00.removeListener(animatorListener);
                    r2.A00 = null;
                }
                ArrayList arrayList = r2.A02;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
        }
        C454028v r0 = this.A00;
        if (r0 != null) {
            r0.stop();
        }
        this.A00 = null;
    }
}
