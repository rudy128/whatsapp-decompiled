package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5nN  reason: invalid class name and case insensitive filesystem */
public abstract class C113615nN extends C42011xT {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03 = 0;
    public CallGridViewModel A04;
    public AnonymousClass70A A05;
    public boolean A06;
    public boolean A07;
    public AnimatorSet A08;
    public C22851Dl A09;
    public final AnonymousClass6bT A0A;
    public final AnonymousClass7E6 A0B;
    public final C24921Me A0C;

    public abstract void A0B();

    public abstract void A0E(int i);

    public abstract void A0J(AnonymousClass70A r1);

    private void A00(View view, boolean z) {
        AnimatorSet animatorSet = this.A08;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View view2 = this.A0H;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        float[] fArr = new float[1];
        float f = 0.95f;
        float f2 = 1.0f;
        float f3 = 1.0f;
        if (z) {
            f3 = 0.95f;
        }
        fArr[0] = f3;
        C108945cZ.A1R("scaleX", fArr, propertyValuesHolderArr, 0);
        float[] fArr2 = new float[1];
        if (!z) {
            f = 1.0f;
        }
        fArr2[0] = f;
        C108945cZ.A1R("scaleY", fArr2, propertyValuesHolderArr, 1);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[1];
        float[] fArr3 = new float[1];
        if (!z) {
            f2 = 0.0f;
        }
        fArr3[0] = f2;
        C108945cZ.A1R("alpha", fArr3, propertyValuesHolderArr2, 0);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr2);
        AnimatorSet A0B2 = C108945cZ.A0B();
        A0B2.playTogether(C108945cZ.A1Z(ofPropertyValuesHolder, ofPropertyValuesHolder2, 2, 0));
        A0B2.setDuration(200);
        C108955ca.A19(A0B2);
        this.A08 = A0B2;
        A0B2.setStartDelay(100);
        this.A08.start();
    }

    public void A0C(float f, float f2) {
        View view;
        if (this instanceof C116185wX) {
            C116185wX r3 = (C116185wX) this;
            Iterator A15 = AnonymousClass000.A15(r3.A0Z);
            while (true) {
                if (!A15.hasNext()) {
                    view = r3.A0H;
                    break;
                }
                Map.Entry A16 = AnonymousClass000.A16(A15);
                if (C116185wX.A03(r3, A16, f, f2)) {
                    view = ((C28931bI) A16.getKey()).A02();
                    break;
                }
            }
        } else {
            view = this.A0H;
        }
        view.performClick();
    }

    public void A0D(int i) {
        if (!(this instanceof C116165wV)) {
            if (this instanceof C116185wX) {
                C116185wX r2 = (C116185wX) this;
                r2.A0H.setVisibility(i);
                View view = r2.A0G;
                if (view instanceof SurfaceView) {
                    if (r2.A05 == null) {
                        i = 8;
                    }
                    view.setVisibility(i);
                    return;
                }
                return;
            } else if (!(this instanceof C116125wR) && !(this instanceof C116115wQ)) {
                return;
            }
        }
        this.A0H.setVisibility(i);
    }

    public void A0F(MotionEvent motionEvent, View view) {
        if (view == null) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            A00(view, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            A00(view, false);
        }
    }

    public void A0G(ViewGroup viewGroup, TextView textView) {
        if (this.A02 == 3 && textView != null && viewGroup != null) {
            C29261bv.A09(textView, textView.getResources().getDimensionPixelSize(2131166971), textView.getResources().getDimensionPixelSize(2131166970), 1, 0);
            viewGroup.setBackground(C40501uo.A00((Resources.Theme) null, viewGroup.getResources(), 2131231568));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r5.A07 != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(android.widget.ImageView r6, X.AnonymousClass1E7 r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            X.6bT r2 = r5.A0A
            if (r2 == 0) goto L_0x0032
            r4 = 0
            if (r8 != 0) goto L_0x000c
            boolean r0 = r5.A07
            r1 = 0
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            java.util.Map r0 = r2.A00
            java.lang.Object r3 = X.AnonymousClass000.A0w(r0, r1)
            X.1pZ r3 = (X.C37451pZ) r3
            if (r3 == 0) goto L_0x0032
            X.7E6 r2 = r5.A0B
            r2.A00 = r9
            java.util.HashSet r1 = r2.A03
            int r0 = r6.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r8 == 0) goto L_0x0033
            r1.add(r0)
        L_0x002a:
            X.1BI r0 = r7.A0J
            r2.CIg(r0)
            r3.A05(r6, r2, r7, r4)
        L_0x0032:
            return
        L_0x0033:
            r1.remove(r0)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113615nN.A0H(android.widget.ImageView, X.1E7, boolean, boolean):void");
    }

    public void A0I(C108525bq r2) {
        if (this instanceof C116165wV) {
            ((C116165wV) this).A03 = r2;
        } else if (this instanceof C116185wX) {
            ((C116185wX) this).A03 = r2;
        } else if (this instanceof C116125wR) {
            ((C116125wR) this).A00 = r2;
        } else if (this instanceof C116115wQ) {
            ((C116115wQ) this).A00 = r2;
        }
    }

    public C113615nN(View view, C24771Lp r6, AnonymousClass6bT r7, CallGridViewModel callGridViewModel, AnonymousClass1VW r9, C24921Me r10) {
        super(view);
        this.A0C = r10;
        this.A0A = r7;
        this.A04 = callGridViewModel;
        if (r6.A0A == null) {
            synchronized (r6.A01) {
                if (r6.A0A == null) {
                    r6.A0A = r6.A00.A00("blurredContactsThumbCache", C24771Lp.A0J);
                }
            }
        }
        this.A0B = new AnonymousClass7E6(r6.A0A, r9);
    }
}
