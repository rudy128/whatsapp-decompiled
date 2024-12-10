package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.CcZ  reason: case insensitive filesystem */
public abstract class C25277CcZ {
    public final Context A00;
    public final CheckableImageButton A01;
    public final BIm A02;
    public final TextInputLayout A03;

    public void A06() {
    }

    public int A02() {
        if (this instanceof Bio) {
            return 2131899024;
        }
        if (this instanceof Bin) {
            return 2131898782;
        }
        return 0;
    }

    public int A03() {
        if (this instanceof Bio) {
            return 2131232681;
        }
        if (this instanceof Bin) {
            return 2131232684;
        }
        return 0;
    }

    public View.OnClickListener A04() {
        if (this instanceof Bio) {
            return ((Bio) this).A0B;
        }
        if (this instanceof Bin) {
            return ((Bin) this).A07;
        }
        return null;
    }

    public View.OnFocusChangeListener A05() {
        if (this instanceof Bio) {
            return ((Bio) this).A0C;
        }
        if (this instanceof Bin) {
            return ((Bin) this).A08;
        }
        return null;
    }

    public void A07() {
        if (this instanceof Bio) {
            Bio bio = (Bio) this;
            int i = bio.A08;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            TimeInterpolator timeInterpolator = bio.A0A;
            ofFloat.setInterpolator(timeInterpolator);
            ofFloat.setDuration((long) i);
            C26323Cxg.A00(ofFloat, bio, 16);
            bio.A01 = ofFloat;
            int i2 = bio.A09;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat2.setInterpolator(timeInterpolator);
            ofFloat2.setDuration((long) i2);
            C26323Cxg.A00(ofFloat2, bio, 16);
            bio.A02 = ofFloat2;
            BEQ.A00(ofFloat2, bio, 18);
            bio.A03 = (AccessibilityManager) bio.A00.getSystemService("accessibility");
        } else if (this instanceof C23521Bil) {
            BIm bIm = this.A02;
            bIm.A06 = null;
            CheckableImageButton checkableImageButton = bIm.A0G;
            checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
            C26165Cte.A03((View.OnLongClickListener) null, checkableImageButton);
        } else if (this instanceof Bin) {
            Bin bin = (Bin) this;
            float[] A1V = C108945cZ.A1V();
            // fill-array-data instruction
            A1V[0] = 1061997773;
            A1V[1] = 1065353216;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(A1V);
            ofFloat3.setInterpolator(bin.A06);
            ofFloat3.setDuration((long) bin.A04);
            C26323Cxg.A00(ofFloat3, bin, 15);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            TimeInterpolator timeInterpolator2 = bin.A05;
            ofFloat4.setInterpolator(timeInterpolator2);
            long j = (long) bin.A03;
            ofFloat4.setDuration(j);
            C26323Cxg.A00(ofFloat4, bin, 14);
            AnimatorSet animatorSet = new AnimatorSet();
            bin.A00 = animatorSet;
            Animator[] animatorArr = new Animator[2];
            AnonymousClass001.A1Q(ofFloat3, ofFloat4, animatorArr);
            animatorSet.playTogether(animatorArr);
            BEQ.A00(bin.A00, bin, 16);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat5.setInterpolator(timeInterpolator2);
            ofFloat5.setDuration(j);
            C26323Cxg.A00(ofFloat5, bin, 14);
            bin.A01 = ofFloat5;
            BEQ.A00(ofFloat5, bin, 17);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r3 = (X.Bin) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.Bio
            if (r0 == 0) goto L_0x0015
            r2 = r4
            X.Bio r2 = (X.Bio) r2
            android.widget.AutoCompleteTextView r0 = r2.A04
            if (r0 == 0) goto L_0x0014
            r1 = 0
            r0.setOnTouchListener(r1)
            android.widget.AutoCompleteTextView r0 = r2.A04
            r0.setOnDismissListener(r1)
        L_0x0014:
            return
        L_0x0015:
            boolean r0 = r4 instanceof X.Bin
            if (r0 == 0) goto L_0x0014
            r3 = r4
            X.Bin r3 = (X.Bin) r3
            android.widget.EditText r2 = r3.A02
            if (r2 == 0) goto L_0x0014
            r1 = 24
            X.DTf r0 = new X.DTf
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25277CcZ.A08():void");
    }

    public void A09(EditText editText) {
        TextInputLayout textInputLayout;
        boolean A012;
        if (this instanceof Bio) {
            Bio bio = (Bio) this;
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                bio.A04 = autoCompleteTextView;
                autoCompleteTextView.setOnTouchListener(new D55(bio, 2));
                bio.A04.setOnDismissListener(new D5R(bio));
                bio.A04.setThreshold(0);
                textInputLayout = bio.A03;
                textInputLayout.setErrorIconDrawable((Drawable) null);
                if (editText.getInputType() == 0 && bio.A03.isTouchExplorationEnabled()) {
                    bio.A01.setImportantForAccessibility(2);
                }
                A012 = true;
            } else {
                throw AnonymousClass8BR.A0w("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            }
        } else if (this instanceof Bin) {
            Bin bin = (Bin) this;
            bin.A02 = editText;
            textInputLayout = bin.A03;
            A012 = Bin.A01(bin);
        } else {
            return;
        }
        textInputLayout.setEndIconVisible(A012);
    }

    public boolean A0A() {
        if (this instanceof Bio) {
            return true;
        }
        return false;
    }

    public boolean A0B() {
        if (this instanceof Bio) {
            return ((Bio) this).A07;
        }
        return false;
    }

    public C25277CcZ(BIm bIm) {
        this.A03 = bIm.A0J;
        this.A02 = bIm;
        this.A00 = bIm.getContext();
        this.A01 = bIm.A0G;
    }
}
