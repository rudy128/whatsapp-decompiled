package com.google.android.material.timepicker;

import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass1XU;
import X.AnonymousClass1YT;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BV;
import X.BE6;
import X.BE7;
import X.C17880vN;
import X.C17890vO;
import X.C19740yt;
import X.C22667BJi;
import X.C25475CgU;
import X.C25966CpY;
import X.C26228CvK;
import X.C26264Cw9;
import X.C27080DTf;
import X.C27781Xn;
import X.C27801Xq;
import X.C28011Ym;
import X.C28031Yo;
import X.C28041Yp;
import X.D5F;
import X.E2V;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ClockFaceView extends ConstraintLayout implements E2V {
    public float A00;
    public int A01;
    public C27801Xq A02;
    public String[] A03;
    public final int A04;
    public final ColorStateList A05;
    public final Rect A06;
    public final Rect A07;
    public final RectF A08;
    public final SparseArray A09;
    public final AnonymousClass1XU A0A;
    public final ClockHandView A0B;
    public final Runnable A0C;
    public final float[] A0D;
    public final int[] A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(2131625937, this);
        C27801Xq r3 = new C27801Xq();
        this.A02 = r3;
        C28031Yo r2 = new C28031Yo(0.5f);
        C28041Yp r1 = new C28041Yp(r3.A01.A0K);
        r1.A02 = r2;
        r1.A03 = r2;
        r1.A01 = r2;
        r1.A00 = r2;
        r3.setShapeAppearanceModel(new C28011Ym(r1));
        BE7.A1C(this.A02, -1);
        setBackground(this.A02);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27781Xn.A0a, i, 0);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A0C = new C27080DTf((Object) this, 28);
        obtainStyledAttributes.recycle();
        this.A07 = AnonymousClass3MW.A07();
        this.A08 = AnonymousClass3MW.A08();
        this.A06 = AnonymousClass3MW.A07();
        this.A09 = BE6.A0Q();
        this.A0D = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C27781Xn.A0A, i, 2132084824);
        Resources resources = getResources();
        ColorStateList A012 = AnonymousClass1YT.A01(context, obtainStyledAttributes2, 1);
        this.A05 = A012;
        LayoutInflater.from(context).inflate(2131625936, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(2131432323);
        this.A0B = clockHandView;
        this.A04 = resources.getDimensionPixelSize(2131167643);
        int colorForState = A012.getColorForState(new int[]{16842913}, A012.getDefaultColor());
        this.A0E = new int[]{colorForState, colorForState, A012.getDefaultColor()};
        clockHandView.A0B.add(this);
        int defaultColor = C19740yt.A03(context, 2131101830).getDefaultColor();
        ColorStateList A013 = AnonymousClass1YT.A01(context, obtainStyledAttributes2, 0);
        setBackgroundColor(A013 != null ? A013.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new D5F(this, 2));
        setFocusable(true);
        obtainStyledAttributes2.recycle();
        this.A0A = new C22667BJi(this, 7);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.A03 = strArr;
        LayoutInflater A0D2 = AnonymousClass3MZ.A0D(this);
        SparseArray sparseArray = this.A09;
        int size = sparseArray.size();
        int i2 = 0;
        boolean z = false;
        while (true) {
            int length = this.A03.length;
            if (i2 >= Math.max(length, size)) {
                break;
            }
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) A0D2.inflate(2131625935, this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.A03[i2]);
                textView.setTag(2131432339, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(2131432324, Integer.valueOf(i3));
                z = i3 > 1 ? true : z;
                AnonymousClass1HF.A0f(textView, this.A0A);
                textView.setTextColor(this.A05);
            }
            i2++;
        }
        ClockHandView clockHandView2 = this.A0B;
        if (clockHandView2.A04 && !z) {
            clockHandView2.A03 = 1;
        }
        clockHandView2.A04 = z;
        clockHandView2.invalidate();
        this.A0G = resources.getDimensionPixelSize(2131167671);
        this.A0H = resources.getDimensionPixelSize(2131167672);
        this.A0F = resources.getDimensionPixelSize(2131167650);
    }

    public static void A00(ClockFaceView clockFaceView) {
        SparseArray sparseArray;
        RadialGradient radialGradient;
        RectF rectF = clockFaceView.A0B.A0A;
        float f = Float.MAX_VALUE;
        View view = null;
        int i = 0;
        while (true) {
            sparseArray = clockFaceView.A09;
            if (i >= sparseArray.size()) {
                break;
            }
            View view2 = (View) sparseArray.get(i);
            if (view2 != null) {
                Rect rect = clockFaceView.A07;
                view2.getHitRect(rect);
                RectF rectF2 = clockFaceView.A08;
                rectF2.set(rect);
                rectF2.union(rectF);
                float width = rectF2.width() * rectF2.height();
                if (width < f) {
                    view = view2;
                    f = width;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (textView != null) {
                textView.setSelected(AnonymousClass000.A1Z(textView, view));
                Rect rect2 = clockFaceView.A07;
                textView.getHitRect(rect2);
                RectF rectF3 = clockFaceView.A08;
                rectF3.set(rect2);
                Rect rect3 = clockFaceView.A06;
                textView.getLineBounds(0, rect3);
                rectF3.inset((float) rect3.left, (float) rect3.top);
                if (!RectF.intersects(rectF, rectF3)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF.centerX() - rectF3.left, rectF.centerY() - rectF3.top, rectF.width() * 0.5f, clockFaceView.A0E, clockFaceView.A0D, Shader.TileMode.CLAMP);
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
        }
    }

    public void A07() {
        C26264Cw9 cw9 = new C26264Cw9();
        cw9.A0C(this);
        HashMap A11 = C17880vN.A11();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != 2131429110 && !"skip".equals(childAt.getTag())) {
                Object tag = childAt.getTag(2131432324);
                if (tag == null) {
                    tag = C17880vN.A0h();
                }
                if (!A11.containsKey(tag)) {
                    A11.put(tag, AnonymousClass000.A13());
                }
                ((List) A11.get(tag)).add(childAt);
            }
        }
        Iterator A0i = C17890vO.A0i(A11);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            List<View> list = (List) A16.getValue();
            int A042 = AnonymousClass8BV.A04(A16);
            int i2 = this.A01;
            if (A042 == 2) {
                i2 = BE6.A04((float) i2, 0.66f);
            }
            float f = 0.0f;
            for (View id : list) {
                C25966CpY cpY = C26264Cw9.A03(cw9, id.getId()).A02;
                cpY.A0C = 2131429110;
                cpY.A0D = i2;
                cpY.A00 = f;
                f += 360.0f / ((float) list.size());
            }
        }
        cw9.A0A(this);
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.A09;
            if (i3 < sparseArray.size()) {
                ((View) sparseArray.get(i3)).setVisibility(0);
                i3++;
            } else {
                return;
            }
        }
    }

    public void setBackgroundColor(int i) {
        BE7.A1C(this.A02, i);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.A0C;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        A07();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C26228CvK(accessibilityNodeInfo).A0Z(C25475CgU.A00(1, this.A03.length, 1, false));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this);
    }

    public void onMeasure(int i, int i2) {
        DisplayMetrics A092 = AnonymousClass3Ma.A09(this);
        int max = (int) (((float) this.A0F) / Math.max(Math.max(((float) this.A0G) / ((float) A092.heightPixels), ((float) this.A0H) / ((float) A092.widthPixels)), 1.0f));
        int A062 = BE7.A06(max);
        setMeasuredDimension(max, max);
        super.onMeasure(A062, A062);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.A0C;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public ClockFaceView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970442);
    }
}
