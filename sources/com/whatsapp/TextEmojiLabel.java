package com.whatsapp;

import X.AnonymousClass11C;
import X.AnonymousClass1EG;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass1Z2;
import X.AnonymousClass3KK;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C24261Jm;
import X.C26302CxJ;
import X.C39361sw;
import X.C39441t5;
import X.C43251zV;
import X.C43351zf;
import X.C43361zg;
import X.C43431zn;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.List;

public class TextEmojiLabel extends C39361sw {
    public AnonymousClass3KK A00;
    public AnonymousClass1L2 A01;
    public AnonymousClass1KW A02;
    public C18010vc A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Paint A08;
    public TextView.BufferType A09;
    public C39441t5 A0A;
    public CharSequence A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextEmojiLabel(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A0I();
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }

    public final CharSequence A0M(C43351zf r10, CharSequence charSequence, List list, float f, int i, boolean z, boolean z2) {
        CharSequence charSequence2;
        int i2;
        C43351zf r5 = r10;
        CharSequence charSequence3 = null;
        if (charSequence == null) {
            return null;
        }
        if (z) {
            AnonymousClass11C systemServices = getSystemServices();
            C18010vc sharedPreferencesFactory = getSharedPreferencesFactory();
            if (z2) {
                charSequence2 = C26302CxJ.A0B(systemServices, getAbProps(), sharedPreferencesFactory, charSequence);
            } else {
                charSequence2 = C26302CxJ.A0C(systemServices, sharedPreferencesFactory, charSequence);
            }
        } else {
            charSequence2 = charSequence;
        }
        if (i != 0) {
            if (charSequence2 != null) {
                i2 = charSequence2.length();
            } else {
                i2 = 0;
            }
            if (i2 > i) {
                int A002 = AnonymousClass1EG.A00(charSequence, i);
                if (charSequence2 instanceof Editable) {
                    charSequence3 = ((Editable) charSequence2).delete(A002, charSequence2.length());
                } else if (charSequence2 != null) {
                    charSequence3 = charSequence2.subSequence(0, A002);
                }
                charSequence2 = charSequence3;
            }
        }
        getEmojiRichFormatterStaticCaller();
        Context context = getContext();
        C18070vi.A0X(context);
        TextPaint paint = getPaint();
        C18070vi.A0X(paint);
        CharSequence A042 = C43251zV.A04(context, paint, getEmojiLoader(), charSequence2, f);
        if (r10 == null) {
            r5 = C43351zf.A03;
        }
        C43361zg A003 = C43351zf.A00(getContext(), getWhatsAppLocale(), r5, A042, list, false);
        if (A003 != null) {
            return (CharSequence) A003.A00;
        }
        return null;
    }

    public final void A0N() {
        setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void A0Q(C43351zf r10, CharSequence charSequence, List list, int i, boolean z) {
        setText(A0M(r10, charSequence, list, 1.0f, i, z, false));
    }

    public final void A0R(CharSequence charSequence) {
        A0S(charSequence, (List) null, 0, false);
    }

    public void A0S(CharSequence charSequence, List list, int i, boolean z) {
        A0Q((C43351zf) null, charSequence, list, i, z);
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C18070vi.A0d(canvas, 0);
        Paint paint = this.A08;
        if (this.A07 <= 0 || paint == null) {
            try {
                super.onDraw(canvas);
            } catch (IndexOutOfBoundsException unused) {
                setText(getText());
            } catch (Exception e) {
                Log.e((Throwable) e);
                throw new RuntimeException(e);
            }
        } else {
            canvas2.drawRect((float) (getScrollX() + getPaddingLeft()), (float) (((getHeight() - getPaddingBottom()) - this.A05) - this.A06), (float) ((getScrollX() + getWidth()) - getPaddingRight()), (float) ((getHeight() - getPaddingBottom()) - this.A05), paint);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, getAbProps(), 6882) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            boolean r3 = super.onTouchEvent(r5)
            X.0ve r0 = r4.A04
            if (r0 == 0) goto L_0x001a
            X.0ve r2 = r4.getAbProps()
            X.0vf r1 = X.C18040vf.A01
            r0 = 6882(0x1ae2, float:9.644E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x0034
        L_0x001a:
            X.1t5 r2 = r4.A0A
            if (r2 == 0) goto L_0x0034
            java.lang.CharSequence r1 = r4.getText()
            boolean r0 = r1 instanceof android.text.Spannable
            if (r0 == 0) goto L_0x0034
            android.text.Layout r0 = r4.getLayout()
            if (r0 == 0) goto L_0x0034
            android.text.Spannable r1 = (android.text.Spannable) r1
            boolean r0 = r2.onTouchEvent(r4, r1, r5)
            r0 = r0 | r3
            return r0
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TextEmojiLabel.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setEmojiLoader(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setEmojiRichFormatterStaticCaller(AnonymousClass1L2 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setSharedPreferencesFactory(C18010vc r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final AnonymousClass1KW getEmojiLoader() {
        AnonymousClass1KW r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final AnonymousClass1L2 getEmojiRichFormatterStaticCaller() {
        AnonymousClass1L2 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiRichFormatterStaticCaller");
        throw null;
    }

    public final C18010vc getSharedPreferencesFactory() {
        C18010vc r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("sharedPreferencesFactory");
        throw null;
    }

    public void onMeasure(int i, int i2) {
        int size;
        int measuredWidth;
        if (this.A07 > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size2 = View.MeasureSpec.getSize(i);
            super.onMeasure(i, i2);
            if (mode != 1073741824) {
                measuredWidth = (size2 * this.A07) / 100;
            } else {
                measuredWidth = getMeasuredWidth();
            }
            setMeasuredDimension(measuredWidth, getMeasuredHeight());
            return;
        }
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 0 && (size = (View.MeasureSpec.getSize(i) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) > 0 && this.A04 != size) {
            TransformationMethod transformationMethod = getTransformationMethod();
            if ((this.A0B instanceof Spanned) && getEllipsize() != null && (transformationMethod instanceof SingleLineTransformationMethod)) {
                this.A04 = size;
                CharSequence transformation = transformationMethod.getTransformation(this.A0B, this);
                CharSequence ellipsize = TextUtils.ellipsize(transformation, getPaint(), (float) size, getEllipsize());
                if (ellipsize != null && !ellipsize.equals(transformation)) {
                    super.setText(ellipsize, this.A09);
                }
            }
        }
    }

    public final void setLinkHandler(C39441t5 r4) {
        this.A0A = r4;
        if (this.A04 != null) {
            if (C18020vd.A05(C18040vf.A01, getAbProps(), 6882)) {
                boolean isFocusable = isFocusable();
                boolean isClickable = isClickable();
                boolean isLongClickable = isLongClickable();
                setMovementMethod(r4);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    public final void setPlaceholder(int i) {
        if (this.A07 != i) {
            this.A07 = i;
            if (i > 0) {
                Paint.FontMetricsInt A002 = C43431zn.A00(getPaint());
                C18070vi.A0X(A002);
                this.A06 = ((-A002.ascent) * 6) / 10;
                this.A05 = A002.bottom;
                Paint paint = this.A08;
                if (paint == null) {
                    paint = new Paint();
                    this.A08 = paint;
                }
                paint.setColor(AnonymousClass1Z2.A06(getPaint().getColor(), (Color.alpha(getPaint().getColor()) * 12) / 255));
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Object obj;
        this.A0B = charSequence;
        this.A09 = bufferType;
        this.A04 = 0;
        if (this.A04 != null) {
            if (C18020vd.A05(C18040vf.A01, getAbProps(), 6882)) {
                obj = getMovementMethod();
                if (obj != null && (charSequence instanceof Spanned)) {
                    bufferType = TextView.BufferType.SPANNABLE;
                }
                super.setText(charSequence, bufferType);
            }
        }
        obj = this.A0A;
        bufferType = TextView.BufferType.SPANNABLE;
        super.setText(charSequence, bufferType);
    }

    public final void A0O(int i, int i2) {
        Drawable A002 = C24261Jm.A00(getContext(), i);
        if (C18000vb.A00(getWhatsAppLocale()).A06) {
            setCompoundDrawablesWithIntrinsicBounds(A002, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A002, (Drawable) null);
        }
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(i2));
    }

    public final void A0P(Drawable drawable, int i) {
        if (C18000vb.A00(getWhatsAppLocale()).A06) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            super.onLayout(r11, r12, r13, r14, r15)
            X.3KK r0 = r10.A00
            if (r0 == 0) goto L_0x003e
            int r14 = r14 - r12
            X.2xB r0 = (X.C65832xB) r0
            X.1xh r8 = r0.A01
            android.text.Spannable r7 = r0.A00
            java.lang.CharSequence r9 = r0.A02
            java.lang.String r6 = r0.A03
            com.whatsapp.TextEmojiLabel r5 = r8.A01
            java.lang.CharSequence r4 = r5.getText()
            boolean r0 = r4 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x008b
            r3 = r4
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r1 = r3.length()
            java.lang.Class<X.2pK> r0 = X.C61222pK.class
            r2 = 0
            java.lang.Object[] r1 = r3.getSpans(r2, r1, r0)
            X.2pK[] r1 = (X.C61222pK[]) r1
            if (r1 == 0) goto L_0x008b
            int r0 = r1.length
            if (r0 <= 0) goto L_0x008b
            r0 = r1[r2]
            java.lang.CharSequence r0 = r0.A00
        L_0x0035:
            boolean r0 = android.text.TextUtils.equals(r7, r0)
            if (r0 != 0) goto L_0x003f
            r0 = 0
            r5.A00 = r0
        L_0x003e:
            return
        L_0x003f:
            android.text.TextPaint r3 = r5.getPaint()
            android.text.SpannableStringBuilder r2 = X.C42141xh.A00(r8, r9, r6)
            float r1 = android.text.Layout.getDesiredWidth(r2, r3)
            float r0 = (float) r14
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x007a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            float r0 = r3.measureText(r0)
            double r0 = (double) r0
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            int r14 = r14 - r0
            if (r14 <= 0) goto L_0x0079
            float r1 = (float) r14
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r9, r3, r1, r0)
            android.text.SpannableStringBuilder r9 = X.C42141xh.A00(r8, r0, r6)
        L_0x0079:
            r2 = r9
        L_0x007a:
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r2)
            X.C61222pK.A00(r1, r7)
            boolean r0 = android.text.TextUtils.equals(r4, r1)
            if (r0 != 0) goto L_0x003e
            r5.setText(r1)
            return
        L_0x008b:
            r0 = 0
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TextEmojiLabel.onLayout(boolean, int, int, int, int):void");
    }

    public final void setOnPostLayoutListener(AnonymousClass3KK r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextEmojiLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A0I();
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextEmojiLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }
}
