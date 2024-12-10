package com.facebook.rendercore.text;

import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass1XU;
import X.AnonymousClass3MW;
import X.BL9;
import X.C108945cZ;
import X.C108975cc;
import X.C24703CGp;
import X.C25320CdR;
import X.C26839DFv;
import X.C26840DFw;
import X.C28507E4r;
import X.E1K;
import X.E1L;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;

public class RCTextView extends View {
    public float A00;
    public float A01;
    public Layout A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05 = false;
    public ClickableSpan[] A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public ColorStateList A0C;
    public Paint A0D;
    public Path A0E;
    public Integer A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public ImageSpan[] A0J;
    public final AccessibilityManager A0K;
    public final BL9 A0L;

    public static int A00(RCTextView rCTextView, int i, int i2) {
        float paragraphLeft;
        float lineMax;
        int i3 = (int) (((float) i2) - rCTextView.A01);
        int i4 = (int) (((float) i) - rCTextView.A00);
        int lineForVertical = rCTextView.A02.getLineForVertical(i3);
        Layout.Alignment alignment = rCTextView.A02.getAlignment();
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        Layout layout = rCTextView.A02;
        if (alignment == alignment2) {
            paragraphLeft = layout.getLineLeft(lineForVertical);
            lineMax = rCTextView.A02.getLineRight(lineForVertical);
        } else {
            boolean A1T = AnonymousClass000.A1T(layout.getParagraphDirection(lineForVertical), -1);
            Layout layout2 = rCTextView.A02;
            if (A1T) {
                paragraphLeft = ((float) layout2.getWidth()) - rCTextView.A02.getLineMax(lineForVertical);
                lineMax = (float) rCTextView.A02.getParagraphRight(lineForVertical);
            } else {
                paragraphLeft = (float) layout2.getParagraphLeft(lineForVertical);
                lineMax = rCTextView.A02.getLineMax(lineForVertical);
            }
        }
        float f = (float) i4;
        if (f >= paragraphLeft && f <= lineMax) {
            try {
                return rCTextView.A02.getOffsetForHorizontal(lineForVertical, f);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    private void A02(int i, int i2) {
        CornerPathEffect cornerPathEffect;
        if (Color.alpha(this.A07) == 0) {
            return;
        }
        if (this.A0B != i || this.A0A != i2) {
            this.A0B = i;
            this.A0A = i2;
            Paint paint = this.A0D;
            if (paint == null) {
                paint = AnonymousClass3MW.A06();
                this.A0D = paint;
            }
            paint.setColor(this.A07);
            int i3 = this.A08;
            Paint paint2 = this.A0D;
            if (i3 != 0) {
                cornerPathEffect = new CornerPathEffect((float) i3);
            } else {
                cornerPathEffect = null;
            }
            paint2.setPathEffect(cornerPathEffect);
            this.A0G = true;
            invalidate();
        }
    }

    public static void A03(Canvas canvas, RCTextView rCTextView) {
        int i = Build.VERSION.SDK_INT;
        Layout layout = rCTextView.A02;
        Path selectionPath = rCTextView.getSelectionPath();
        Paint paint = rCTextView.A0D;
        if (i >= 34) {
            C24703CGp.A00(canvas, paint, selectionPath, layout);
        } else {
            layout.draw(canvas, selectionPath, paint, 0);
        }
    }

    private E1K[] getMountableSpans() {
        CharSequence charSequence = this.A03;
        if (!(charSequence instanceof Spanned)) {
            return new E1K[0];
        }
        return (E1K[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), E1K.class);
    }

    private E1L[] getOnPrePostDrawSpans() {
        CharSequence charSequence = this.A03;
        if (!(charSequence instanceof Spanned)) {
            return new E1L[0];
        }
        return (E1L[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), E1L.class);
    }

    private int getSelectedSpanIndex() {
        ClickableSpan[] clickableSpanArr = this.A06;
        if (clickableSpanArr != null && clickableSpanArr.length != 0 && (this.A0B != 0 || this.A0A != 0)) {
            CharSequence charSequence = this.A03;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                int i = 0;
                while (true) {
                    ClickableSpan[] clickableSpanArr2 = this.A06;
                    if (i >= clickableSpanArr2.length) {
                        break;
                    }
                    ClickableSpan clickableSpan = clickableSpanArr2[i];
                    int spanStart = spanned.getSpanStart(clickableSpan);
                    int spanEnd = spanned.getSpanEnd(clickableSpan);
                    if (spanStart == this.A0B && spanEnd == this.A0A) {
                        return i;
                    }
                    i++;
                }
            }
        }
        return -1;
    }

    private Path getSelectionPath() {
        if (this.A0B == this.A0A || Color.alpha(this.A07) == 0) {
            return null;
        }
        if (this.A0G) {
            Path path = this.A0E;
            if (path == null) {
                path = C108945cZ.A0L();
                this.A0E = path;
            }
            this.A02.getSelectionPath(this.A0B, this.A0A, path);
            this.A0G = false;
        }
        return this.A0E;
    }

    /* access modifiers changed from: private */
    public CharSequence getTextForAccessibility() {
        CharSequence charSequence = this.A03;
        if (charSequence == null || charSequence.length() < 1000000) {
            return this.A03;
        }
        if (!Character.isHighSurrogate(this.A03.charAt(999999)) || !Character.isLowSurrogate(this.A03.charAt(1000000))) {
            return this.A03.subSequence(0, 1000000);
        }
        return this.A03.subSequence(0, 999999);
    }

    private void setSelection(ClickableSpan clickableSpan) {
        Spanned spanned = (Spanned) this.A03;
        A02(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0071, code lost:
        if (r3.length <= 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (android.graphics.Color.alpha(r5.A07) == 0) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.CTX r6) {
        /*
            r5 = this;
            X.DS3 r1 = r6.A03
            android.content.res.ColorStateList r2 = r1.A0Q
            java.lang.CharSequence r0 = r6.A04
            r5.A03 = r0
            android.text.Layout r0 = r6.A02
            r5.A02 = r0
            float r0 = r6.A00
            r5.A00 = r0
            float r0 = r6.A01
            r5.A01 = r0
            int r0 = r1.A09
            r5.A07 = r0
            int r0 = r1.A0A
            r5.A08 = r0
            boolean r0 = r6.A05
            r5.A04 = r0
            int r1 = r1.A0N
            if (r1 == 0) goto L_0x0049
            r0 = 0
            r5.A0C = r0
            r5.A09 = r1
        L_0x0029:
            r2 = 0
            r5.A02(r2, r2)
            android.text.style.ImageSpan[] r0 = r6.A07
            r4 = 1
            if (r0 == 0) goto L_0x0069
            r5.A0J = r0
            int r3 = r0.length
            r1 = 0
        L_0x0036:
            if (r1 >= r3) goto L_0x0069
            android.text.style.ImageSpan[] r0 = r5.A0J
            r0 = r0[r1]
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r0.setCallback(r5)
            r0.setVisible(r4, r2)
            int r1 = r1 + 1
            goto L_0x0036
        L_0x0049:
            r5.A0C = r2
            int r0 = r2.getDefaultColor()
            r5.A09 = r0
            android.text.Layout r0 = r5.A02
            if (r0 == 0) goto L_0x0029
            android.text.TextPaint r3 = r0.getPaint()
            android.content.res.ColorStateList r2 = r5.A0C
            int[] r1 = r5.getDrawableState()
            int r0 = r5.A09
            int r0 = r2.getColorForState(r1, r0)
            r3.setColor(r0)
            goto L_0x0029
        L_0x0069:
            android.text.style.ClickableSpan[] r3 = r6.A06
            r5.A06 = r3
            if (r3 == 0) goto L_0x0073
            int r1 = r3.length
            r0 = 1
            if (r1 > 0) goto L_0x0074
        L_0x0073:
            r0 = 0
        L_0x0074:
            r5.A0I = r0
            if (r3 == 0) goto L_0x0084
            int r0 = r3.length
            if (r0 <= 0) goto L_0x0084
            int r0 = r5.A07
            int r1 = android.graphics.Color.alpha(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            r5.A0H = r0
            if (r0 == 0) goto L_0x009c
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00b3
            int r0 = X.C25320CdR.A00(r5)
        L_0x0093:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0F = r0
            r5.setFocusable(r4)
        L_0x009c:
            X.DS3 r0 = r6.A03
            java.lang.String r0 = r0.A0Y
            if (r0 == 0) goto L_0x00a5
            r5.setContentDescription(r0)
        L_0x00a5:
            X.E1K[] r0 = r5.getMountableSpans()
            int r0 = r0.length
            if (r2 >= r0) goto L_0x00b8
            java.lang.String r0 = "onMount"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00b3:
            boolean r0 = r5.isFocusable()
            goto L_0x0093
        L_0x00b8:
            r5.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rendercore.text.RCTextView.A05(X.CTX):void");
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        BL9 bl9 = this.A0L;
        if ((bl9 == null || !bl9.A1o(motionEvent)) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AccessibilityManager accessibilityManager;
        BL9 bl9 = this.A0L;
        if ((bl9 == null || this.A06.length <= 0 || ((!Boolean.getBoolean("is_accessibility_enabled") && ((accessibilityManager = this.A0K) == null || !accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled())) || !bl9.A1n(keyEvent))) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public Layout getLayout() {
        return this.A02;
    }

    public float getLayoutTranslationX() {
        return this.A00;
    }

    public float getLayoutTranslationY() {
        return this.A01;
    }

    public CharSequence getText() {
        return this.A03;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (this.A0H && !z) {
            A02(0, 0);
        }
        super.onFocusChanged(z, i, rect);
        BL9 bl9 = this.A0L;
        if (bl9 != null && this.A06.length > 0) {
            bl9.A1j(z, i, rect);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        if (r6 != 160) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r6, android.view.KeyEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.A0H
            if (r0 == 0) goto L_0x0077
            r0 = 21
            if (r6 == r0) goto L_0x0053
            r0 = 22
            if (r6 == r0) goto L_0x0053
            r0 = 19
            if (r6 == r0) goto L_0x0053
            r0 = 20
            if (r6 == r0) goto L_0x0053
            r1 = 0
            r0 = 23
            if (r6 == r0) goto L_0x0025
            r0 = 66
            if (r6 == r0) goto L_0x0025
            r0 = 62
            if (r6 == r0) goto L_0x0025
            r0 = 160(0xa0, float:2.24E-43)
            if (r6 != r0) goto L_0x0077
        L_0x0025:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L_0x0077
            int r2 = r5.getSelectedSpanIndex()
            r4 = -1
            if (r2 == r4) goto L_0x0077
            r3 = 1
            if (r1 == 0) goto L_0x0055
            r0 = 22
            if (r6 == r0) goto L_0x003d
            r0 = 20
            if (r6 != r0) goto L_0x003e
        L_0x003d:
            r4 = 1
        L_0x003e:
            int r0 = r7.getRepeatCount()
            int r0 = r0 + 1
            int r4 = r4 * r0
            int r4 = r4 + r2
            if (r4 < 0) goto L_0x0055
            android.text.style.ClickableSpan[] r1 = r5.A06
            int r0 = r1.length
            if (r4 >= r0) goto L_0x0055
            r0 = r1[r4]
            r5.setSelection(r0)
            return r3
        L_0x0053:
            r1 = 1
            goto L_0x0025
        L_0x0055:
            r0 = 23
            if (r6 == r0) goto L_0x0065
            r0 = 66
            if (r6 == r0) goto L_0x0065
            r0 = 62
            if (r6 == r0) goto L_0x0065
            r0 = 160(0xa0, float:2.24E-43)
            if (r6 != r0) goto L_0x0077
        L_0x0065:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0077
            r0 = 0
            r5.A02(r0, r0)
            android.text.style.ClickableSpan[] r0 = r5.A06
            r0 = r0[r2]
            r0.onClick(r5)
            return r3
        L_0x0077:
            boolean r0 = super.onKeyDown(r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rendercore.text.RCTextView.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r5 == 20) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003c, code lost:
        if (r5 != 19) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0056, code lost:
        if (r6.hasModifiers(1) != false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyUp(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.A0H
            if (r0 == 0) goto L_0x005e
            int r0 = r4.A0B
            if (r0 != 0) goto L_0x005e
            int r0 = r4.A0A
            if (r0 != 0) goto L_0x005e
            r0 = 21
            if (r5 == r0) goto L_0x001d
            r0 = 22
            if (r5 == r0) goto L_0x001d
            r0 = 19
            if (r5 == r0) goto L_0x001d
            r1 = 20
            r0 = 0
            if (r5 != r1) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            r3 = 61
            if (r0 != 0) goto L_0x0024
            if (r5 != r3) goto L_0x005e
        L_0x0024:
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x004a
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x004a
            r0 = 22
            if (r5 == r0) goto L_0x0059
            r0 = 20
            if (r5 == r0) goto L_0x0059
            r0 = 21
            if (r5 == r0) goto L_0x003e
            r0 = 19
            if (r5 != r0) goto L_0x004a
        L_0x003e:
            android.text.style.ClickableSpan[] r1 = r4.A06
            int r0 = r1.length
            int r0 = r0 - r2
            r0 = r1[r0]
        L_0x0044:
            if (r0 == 0) goto L_0x005e
            r4.setSelection(r0)
            return r2
        L_0x004a:
            if (r5 != r3) goto L_0x005e
            boolean r0 = r6.hasNoModifiers()
            if (r0 != 0) goto L_0x0059
            boolean r0 = r6.hasModifiers(r2)
            if (r0 == 0) goto L_0x005e
            goto L_0x003e
        L_0x0059:
            android.text.style.ClickableSpan[] r0 = r4.A06
            r0 = r0[r1]
            goto L_0x0044
        L_0x005e:
            boolean r0 = super.onKeyUp(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rendercore.text.RCTextView.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan[] clickableSpanArr;
        ClickableSpan clickableSpan;
        if (this.A0I) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 3) {
                A02(0, 0);
                return false;
            }
            int A002 = A00(this, (int) motionEvent.getX(), (int) motionEvent.getY());
            CharSequence charSequence = this.A03;
            if (!(charSequence instanceof Spanned) || A002 < 0 || (clickableSpanArr = (ClickableSpan[]) ((Spanned) charSequence).getSpans(A002, A002, ClickableSpan.class)) == null || clickableSpanArr.length <= 0 || (clickableSpan = clickableSpanArr[0]) == null) {
                A02(0, 0);
            } else if (actionMasked == 1) {
                A02(0, 0);
                clickableSpan.onClick(this);
                return true;
            } else if (actionMasked != 0) {
                return true;
            } else {
                setSelection(clickableSpan);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public RCTextView(Context context) {
        super(context);
        AccessibilityManager accessibilityManager;
        if (getImportantForAccessibility() == 0) {
            BL9 bl9 = new BL9(this);
            this.A0L = bl9;
            this.A05 = true;
            AnonymousClass1HF.A0f(this, bl9);
            this.A05 = false;
            accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            accessibilityManager = null;
            this.A0L = null;
        }
        this.A0K = accessibilityManager;
    }

    public void A04() {
        if (0 < getMountableSpans().length) {
            throw AnonymousClass000.A0s("onUnmount");
        }
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A07 = 0;
        this.A08 = 0;
        this.A0C = null;
        this.A09 = 0;
        ImageSpan[] imageSpanArr = this.A0J;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i = 0; i < length; i++) {
                Drawable drawable = this.A0J[i].getDrawable();
                drawable.setCallback((Drawable.Callback) null);
                drawable.setVisible(false, false);
            }
            this.A0J = null;
        }
        this.A06 = null;
        this.A0I = false;
        this.A0H = false;
        Integer num = this.A0F;
        if (num != null) {
            int i2 = Build.VERSION.SDK_INT;
            int intValue = num.intValue();
            if (i2 >= 26) {
                C25320CdR.A01(this, intValue);
            } else {
                setFocusable(C108975cc.A1B(intValue));
            }
            this.A0F = null;
        }
        setContentDescription("");
        BL9 bl9 = this.A0L;
        if (bl9 != null) {
            bl9.A1d();
        }
    }

    public void draw(Canvas canvas) {
        int save;
        boolean z;
        super.draw(canvas);
        if (this.A02 != null) {
            if (this.A00 == 0.0f && this.A01 == 0.0f && getPaddingTop() == 0 && getPaddingLeft() == 0) {
                z = false;
                save = 0;
            } else {
                save = canvas.save();
                canvas.translate(this.A00, this.A01);
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
                z = true;
            }
            E1L[] onPrePostDrawSpans = getOnPrePostDrawSpans();
            int length = onPrePostDrawSpans.length;
            if (length == 0) {
                A03(canvas, this);
            } else {
                C28507E4r dFv = new C26839DFv(this);
                Spanned spanned = (Spanned) this.A03;
                while (true) {
                    length--;
                    C28507E4r e4r = dFv;
                    if (length < 0) {
                        break;
                    }
                    E1L e1l = onPrePostDrawSpans[length];
                    spanned.getSpanStart(e1l);
                    spanned.getSpanEnd(e1l);
                    dFv = new C26840DFw(e4r, e1l, this);
                }
                dFv.BJI(canvas);
            }
            if (z) {
                canvas.restoreToCount(save);
            }
        }
    }

    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        AnonymousClass1XU A092;
        super.setAccessibilityDelegate(accessibilityDelegate);
        BL9 bl9 = this.A0L;
        if (bl9 != null && !this.A05 && (A092 = AnonymousClass1HF.A09(this)) != bl9) {
            bl9.A00 = A092;
            this.A05 = true;
            AnonymousClass1HF.A0f(this, bl9);
            this.A05 = false;
        }
    }
}
