package com.whatsapp;

import X.AnonymousClass112;
import X.AnonymousClass11C;
import X.AnonymousClass1EG;
import X.AnonymousClass1HF;
import X.AnonymousClass1Y5;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C19620yd;
import X.C29471cL;
import X.C38211qs;
import X.C39401t1;
import X.C43421zm;
import X.C60312no;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import com.whatsapp.util.Log;

public class WaTextView extends C38211qs {
    public int A00;
    public C39401t1 A01;
    public AnonymousClass11C A02;
    public C18000vb A03;
    public C18030ve A04;
    public boolean A05;

    public final class Api28Utils {
        public static final Api28Utils INSTANCE = new Object();

        public final boolean isAllCaps(WaTextView waTextView) {
            C18070vi.A0d(waTextView, 0);
            return waTextView.isAllCaps();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaTextView(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
        A0I();
        A0F();
    }

    public final void A0L() {
        getContext();
        setTypeface(C43421zm.A01(), 0);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 0);
        C39401t1 r0 = this.A01;
        if ((r0 == null || !r0.A1o(motionEvent)) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C18070vi.A0d(keyEvent, 0);
        C39401t1 r0 = this.A01;
        if ((r0 == null || !r0.A1n(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setTextAsError(CharSequence charSequence, C18000vb r5) {
        C18070vi.A0d(r5, 1);
        super.setContentDescription(r5.A0C(2131896769, charSequence));
        super.setText(charSequence);
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    /* JADX INFO: finally extract failed */
    private final void A0H(Context context, AttributeSet attributeSet) {
        if (attributeSet == null || isInEditMode()) {
            A0F();
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29471cL.A05);
        C18070vi.A0X(obtainStyledAttributes);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(7, 0);
            if (resourceId != 0) {
                setContentDescription(getWhatsAppLocale().A09(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId2 != 0) {
                setHint(getWhatsAppLocale().A09(resourceId2));
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(6, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(getWhatsAppLocale().A09(resourceId3), getImeActionId());
            }
            this.A05 = obtainStyledAttributes.getBoolean(9, false);
            int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId4 != 0) {
                setText(getWhatsAppLocale().A09(resourceId4));
            }
            boolean z = obtainStyledAttributes.getBoolean(8, false);
            if (z) {
                AnonymousClass1Y5.A0A(this, z);
            }
            obtainStyledAttributes.recycle();
            A0F();
            if (AnonymousClass112.A06()) {
                if (C18020vd.A05(C18040vf.A01, getAbProps(), 11726)) {
                    setBreakStrategy(0);
                }
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("abProps");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("systemServices");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("whatsAppLocale");
        throw null;
    }

    public final void setAccessibilityHelper(C39401t1 r1) {
        this.A01 = r1;
        AnonymousClass1HF.A0f(this, r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r2.A05 == false) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAllCaps(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0007
            boolean r1 = r2.A05
            r0 = 1
            if (r1 != 0) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            super.setAllCaps(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.WaTextView.setAllCaps(boolean):void");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence != null && charSequence.length() >= 3000) {
            StringBuilder sb = new StringBuilder();
            sb.append("WaTextView/maybePrintDebugInfoForLongText length=");
            sb.append(charSequence.length() / 1000);
            sb.append('k');
            Log.i(sb.toString());
            C60312no.A01(this, "WaTextView/maybePrintDebugInfoForLongText/");
        }
        super.setText(AnonymousClass1EG.A02(charSequence), bufferType);
        A0G();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0F() {
        /*
            r2 = this;
            boolean r0 = X.AnonymousClass112.A05()
            if (r0 == 0) goto L_0x0017
            com.whatsapp.WaTextView$Api28Utils r0 = com.whatsapp.WaTextView.Api28Utils.INSTANCE
            boolean r0 = r0.isAllCaps(r2)
        L_0x000c:
            if (r0 == 0) goto L_0x0016
        L_0x000e:
            boolean r0 = r2.A05
            if (r0 != 0) goto L_0x0016
            r0 = 0
            r2.setAllCaps(r0)
        L_0x0016:
            return
        L_0x0017:
            android.text.method.TransformationMethod r0 = r2.getTransformationMethod()
            if (r0 == 0) goto L_0x0016
            android.text.method.TransformationMethod r0 = r2.getTransformationMethod()
            boolean r0 = r0 instanceof X.AnonymousClass0RR
            if (r0 != 0) goto L_0x000e
            android.text.method.TransformationMethod r0 = r2.getTransformationMethod()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "android.text.method.AllCapsTransformationMethod"
            boolean r0 = X.C18070vi.A18(r1, r0)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.WaTextView.A0F():void");
    }

    private final void A0G() {
        boolean z;
        int desiredWidth;
        if (getText() != null && (getText() instanceof Spanned)) {
            CharSequence text = getText();
            C18070vi.A0z(text, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) text;
            C18070vi.A0d(spanned, 0);
            Class<StyleSpan> cls = StyleSpan.class;
            StyleSpan[] styleSpanArr = (StyleSpan[]) spanned.getSpans(0, 1, cls);
            StyleSpan[] styleSpanArr2 = (StyleSpan[]) spanned.getSpans(spanned.length() - 1, spanned.length(), cls);
            if (styleSpanArr != null) {
                int length = styleSpanArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StyleSpan styleSpan = styleSpanArr[i];
                    if (styleSpan.getStyle() == 2 || styleSpan.getStyle() == 3) {
                        break;
                    }
                    i++;
                }
                z = true;
                if ((getTypeface() == null || !getTypeface().isItalic()) && !z) {
                    desiredWidth = 0;
                } else {
                    desiredWidth = (int) Layout.getDesiredWidth(C19620yd.A08, getPaint());
                }
                this.A00 = desiredWidth;
                invalidate();
            }
            if (styleSpanArr2 != null) {
                int length2 = styleSpanArr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    StyleSpan styleSpan2 = styleSpanArr2[i2];
                    if (styleSpan2.getStyle() == 2 || styleSpan2.getStyle() == 3) {
                        break;
                    }
                    i2++;
                }
                z = true;
                if (getTypeface() == null || !getTypeface().isItalic()) {
                    desiredWidth = 0;
                    this.A00 = desiredWidth;
                    invalidate();
                }
                desiredWidth = (int) Layout.getDesiredWidth(C19620yd.A08, getPaint());
                this.A00 = desiredWidth;
                invalidate();
            }
        }
        z = false;
        desiredWidth = 0;
        this.A00 = desiredWidth;
        invalidate();
    }

    public final void A0J() {
        getContext();
        setTypeface(C43421zm.A00());
    }

    public final void A0K() {
        getContext();
        setTypeface(C43421zm.A01(), 2);
    }

    public final int getItalicPadding() {
        return this.A00;
    }

    public final boolean getOverrideTextAllCaps() {
        return this.A05;
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C39401t1 r0 = this.A01;
        if (r0 != null) {
            r0.A1j(z, i, rect);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth() + this.A00, getMeasuredHeight());
    }

    public final void setItalicPadding(int i) {
        this.A00 = i;
    }

    public final void setOverrideTextAllCaps(boolean z) {
        this.A05 = z;
    }

    public void setTypeface(Typeface typeface, int i) {
        super.setTypeface(typeface, i);
        A0G();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A0I();
        A0H(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A0H(context, attributeSet);
    }
}
