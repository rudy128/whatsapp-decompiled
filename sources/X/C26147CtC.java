package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CtC  reason: case insensitive filesystem */
public final class C26147CtC {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Animator A05;
    public ColorStateList A06;
    public ColorStateList A07;
    public Typeface A08;
    public LinearLayout A09;
    public TextView A0A;
    public TextView A0B;
    public CharSequence A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public boolean A0F;
    public boolean A0G;
    public int A0H;
    public FrameLayout A0I;
    public final float A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final TimeInterpolator A0N;
    public final TimeInterpolator A0O;
    public final TimeInterpolator A0P;
    public final Context A0Q;
    public final TextInputLayout A0R;

    public static void A01(C26147CtC ctC, int i, int i2, boolean z) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        int i3 = i;
        int i4 = i2;
        if (i != i2) {
            C26147CtC ctC2 = ctC;
            if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                ctC.A05 = animatorSet;
                ArrayList A13 = AnonymousClass000.A13();
                ctC2.A00(ctC.A0B, A13, 2, i3, i4, ctC.A0G);
                ctC2.A00(ctC.A0A, A13, 1, i3, i4, ctC.A0F);
                AnonymousClass2SX.A00(animatorSet, A13);
                if (i == 1) {
                    textView3 = ctC.A0A;
                } else if (i != 2) {
                    textView3 = null;
                } else {
                    textView3 = ctC.A0B;
                }
                if (i2 == 1) {
                    textView4 = ctC.A0A;
                } else if (i2 != 2) {
                    textView4 = null;
                } else {
                    textView4 = ctC.A0B;
                }
                animatorSet.addListener(new BEM(textView3, textView4, ctC, i2, i3));
                animatorSet.start();
            } else {
                if (i2 != 0) {
                    if (i2 != 1) {
                        textView2 = ctC.A0B;
                    } else {
                        textView2 = ctC.A0A;
                    }
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                        textView2.setAlpha(1.0f);
                    }
                }
                if (i != 0) {
                    if (i != 1) {
                        textView = ctC.A0B;
                    } else {
                        textView = ctC.A0A;
                    }
                    if (textView != null) {
                        textView.setVisibility(4);
                        if (i == 1) {
                            textView.setText((CharSequence) null);
                        }
                    }
                }
                ctC.A00 = i2;
            }
            TextInputLayout textInputLayout = ctC.A0R;
            textInputLayout.A0D();
            TextInputLayout.A0A(textInputLayout, z, false);
            textInputLayout.A0F();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (android.text.TextUtils.isEmpty(r4.A0E) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r4 = this;
            r0 = 0
            r4.A0C = r0
            android.animation.Animator r0 = r4.A05
            if (r0 == 0) goto L_0x000a
            r0.cancel()
        L_0x000a:
            int r1 = r4.A00
            r0 = 1
            if (r1 != r0) goto L_0x001f
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x001c
            java.lang.CharSequence r0 = r4.A0E
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 2
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r4.A01 = r0
        L_0x001f:
            int r3 = r4.A00
            int r2 = r4.A01
            android.widget.TextView r1 = r4.A0A
            java.lang.String r0 = ""
            boolean r0 = A02(r1, r4, r0)
            A01(r4, r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26147CtC.A04():void");
    }

    private void A00(TextView textView, List list, int i, int i2, int i3, boolean z) {
        int i4;
        TimeInterpolator timeInterpolator;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                boolean z2 = false;
                float f = 0.0f;
                if (i3 == i) {
                    z2 = true;
                    f = 1.0f;
                }
                ObjectAnimator A0C2 = C108945cZ.A0C(View.ALPHA, textView, new float[1], f, 0);
                if (z2) {
                    i4 = this.A0K;
                } else {
                    i4 = this.A0L;
                }
                A0C2.setDuration((long) i4);
                if (z2) {
                    timeInterpolator = this.A0N;
                } else {
                    timeInterpolator = this.A0O;
                }
                A0C2.setInterpolator(timeInterpolator);
                if (i == i3 && i2 != 0) {
                    A0C2.setStartDelay((long) this.A0L);
                }
                list.add(A0C2);
                if (i3 == i && i2 != 0) {
                    Property property = View.TRANSLATION_Y;
                    float[] A1V = C108945cZ.A1V();
                    A1V[0] = -this.A0J;
                    ObjectAnimator A0C3 = C108945cZ.A0C(property, textView, A1V, 0.0f, 1);
                    A0C3.setDuration((long) this.A0M);
                    A0C3.setInterpolator(this.A0P);
                    A0C3.setStartDelay((long) this.A0L);
                    list.add(A0C3);
                }
            }
        }
    }

    public static boolean A02(TextView textView, C26147CtC ctC, CharSequence charSequence) {
        TextInputLayout textInputLayout = ctC.A0R;
        if (!textInputLayout.isLaidOut() || !textInputLayout.isEnabled()) {
            return false;
        }
        if (ctC.A01 != ctC.A00 || textView == null || !TextUtils.equals(textView.getText(), charSequence)) {
            return true;
        }
        return false;
    }

    public void A03() {
        EditText editText;
        if (this.A09 != null && (editText = this.A0R.A0B) != null) {
            Context context = this.A0Q;
            boolean A042 = AnonymousClass1YT.A04(context);
            LinearLayout linearLayout = this.A09;
            int paddingStart = editText.getPaddingStart();
            if (A042) {
                paddingStart = context.getResources().getDimensionPixelSize(2131167665);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167664);
            if (A042) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167666);
            }
            int paddingEnd = editText.getPaddingEnd();
            if (A042) {
                paddingEnd = context.getResources().getDimensionPixelSize(2131167665);
            }
            linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
        }
    }

    public void A05(TextView textView, int i) {
        if (this.A09 == null && this.A0I == null) {
            Context context = this.A0Q;
            LinearLayout linearLayout = new LinearLayout(context);
            this.A09 = linearLayout;
            linearLayout.setOrientation(0);
            TextInputLayout textInputLayout = this.A0R;
            textInputLayout.addView(this.A09, -1, -2);
            this.A0I = new FrameLayout(context);
            this.A09.addView(this.A0I, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.A0B != null) {
                A03();
            }
        }
        if (i == 0 || i == 1) {
            this.A0I.setVisibility(0);
            this.A0I.addView(textView);
        } else {
            this.A09.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.A09.setVisibility(0);
        this.A0H++;
    }

    public void A06(TextView textView, int i) {
        ViewGroup viewGroup;
        LinearLayout linearLayout = this.A09;
        if (linearLayout != null) {
            if (!(i == 0 || i == 1) || (viewGroup = this.A0I) == null) {
                viewGroup = linearLayout;
            }
            viewGroup.removeView(textView);
            int i2 = this.A0H - 1;
            this.A0H = i2;
            LinearLayout linearLayout2 = this.A09;
            if (i2 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public boolean A07() {
        if (this.A01 != 1 || this.A0A == null || TextUtils.isEmpty(this.A0C)) {
            return false;
        }
        return true;
    }

    public C26147CtC(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.A0Q = context;
        this.A0R = textInputLayout;
        this.A0J = AnonymousClass3MW.A00(context.getResources(), 2131166446);
        this.A0M = AnonymousClass1Z9.A00(context, 2130970542, 217);
        this.A0K = AnonymousClass1Z9.A00(context, 2130970538, 167);
        this.A0L = AnonymousClass1Z9.A00(context, 2130970542, 167);
        this.A0P = C29101bc.A01(AnonymousClass1YW.A04, context, 2130970547);
        TimeInterpolator timeInterpolator = AnonymousClass1YW.A03;
        this.A0N = C29101bc.A01(timeInterpolator, context, 2130970547);
        this.A0O = C29101bc.A01(timeInterpolator, context, 2130970550);
    }
}
