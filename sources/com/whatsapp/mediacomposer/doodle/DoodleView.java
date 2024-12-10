package com.whatsapp.mediacomposer.doodle;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass112;
import X.AnonymousClass11P;
import X.AnonymousClass1HF;
import X.AnonymousClass1KW;
import X.AnonymousClass1T1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass69K;
import X.AnonymousClass69c;
import X.AnonymousClass6p8;
import X.AnonymousClass70N;
import X.AnonymousClass87Q;
import X.AnonymousClass8BC;
import X.C000200d;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108995ce;
import X.C109875eA;
import X.C110955hY;
import X.C123936Wk;
import X.C137316vG;
import X.C139256yX;
import X.C1405671z;
import X.C1409573s;
import X.C1409773u;
import X.C1410073x;
import X.C1419677q;
import X.C1591383j;
import X.C17890vO;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C25291Nq;
import X.C26631Sw;
import X.C29401cD;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;

public class DoodleView extends View implements AnonymousClass009, AnonymousClass87Q {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public AnonymousClass1T1 A04;
    public AnonymousClass11P A05;
    public C18000vb A06;
    public AnonymousClass1KW A07;
    public C18030ve A08;
    public C25291Nq A09;
    public AnonymousClass8BC A0A;
    public C139256yX A0B;
    public C26631Sw A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass031 A0E;
    public C110955hY A0F;
    public C1419677q A0G;
    public boolean A0H;
    public final Handler A0I;
    public final C1410073x A0J;
    public final C1405671z A0K;
    public final AnonymousClass6p8 A0L;
    public final AnonymousClass70N A0M;
    public final Runnable A0N;
    public final RectF A0O;

    public void setMainImage(AnonymousClass69K r12) {
        C1405671z r2;
        RectF rectF;
        float f;
        float height;
        float height2;
        AnonymousClass69K r5 = r12;
        Bitmap bitmap = r12.A01;
        if (bitmap != null && (rectF = r2.A08) != null) {
            RectF A012 = C137316vG.A01(C137316vG.A00(bitmap), rectF);
            r5.A0O(rectF, A012.left, A012.top, A012.right, A012.bottom);
            float width = A012.width() / A012.height();
            if (width <= 0.76f && width >= 0.42857143f) {
                if (C18020vd.A05(C18040vf.A02, C108955ca.A0R(this.A0D), 10357)) {
                    if (A012.width() < rectF.width()) {
                        height = rectF.width();
                        height2 = A012.width();
                    } else {
                        height = rectF.height();
                        height2 = A012.height();
                    }
                    f = height / height2;
                    r12.A0I(f / (r2 = this.A0K).A01);
                    r12.A02 += (float) (-r2.A02);
                    List list = this.A0M.A04;
                    C29401cD.A0N(list, C1591383j.A00);
                    list.add(0, r12);
                }
            }
            f = 1.0f;
            r12.A0I(f / (r2 = this.A0K).A01);
            r12.A02 += (float) (-r2.A02);
            List list2 = this.A0M.A04;
            C29401cD.A0N(list2, C1591383j.A00);
            list2.add(0, r12);
        }
    }

    private PointF getCenterPoint() {
        float f;
        float f2;
        C1405671z r1 = this.A0K;
        if (r1.A06 != null) {
            return this.A0L.A01((AnonymousClass69K) null, getX() + ((float) (getMeasuredWidth() / 2)), getY() + ((float) (getMeasuredHeight() / 2)));
        }
        RectF rectF = r1.A08;
        if (rectF != null) {
            f = rectF.centerX();
            f2 = rectF.centerY();
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new PointF(f, f2);
    }

    public void A03() {
        if (!this.A0H) {
            this.A0H = true;
            AnonymousClass10E A0O2 = AnonymousClass3MW.A0O(generatedComponent());
            this.A05 = AnonymousClass10E.A6O(A0O2);
            this.A07 = AnonymousClass3Ma.A0f(A0O2);
            this.A06 = AnonymousClass10E.A6Q(A0O2);
            this.A0D = C000200d.A00(A0O2.AAB);
            this.A0C = C108965cb.A0a(A0O2);
            this.A08 = AnonymousClass10E.A8r(A0O2);
            this.A09 = (C25291Nq) A0O2.A6E.get();
            this.A04 = (AnonymousClass1T1) A0O2.A43.get();
        }
    }

    public void A04(C1409773u r15, int i) {
        float f;
        float f2;
        C1405671z r3 = this.A0K;
        RectF rectF = r3.A08;
        C1409773u r8 = r15;
        if (rectF != null) {
            float width = rectF.width();
            float height = rectF.height();
            boolean z = r15 instanceof AnonymousClass69c;
            if (z) {
                f = (width * 7.0f) / 8.0f;
                f2 = height / 10.0f;
                if (C18020vd.A05(C18040vf.A02, C108955ca.A0R(this.A0D), 8414)) {
                    int i2 = i;
                    if (i > 0) {
                        AnonymousClass69c r5 = (AnonymousClass69c) r8;
                        float f3 = (float) i2;
                        if (f3 >= 0.0f && f >= 0.0f) {
                            float f4 = f / f3;
                            r5.A06 = f4;
                            float f5 = r5.A07;
                            if (f4 * f5 < 12.0f) {
                                r5.A06 = 12.0f / f5;
                            }
                        }
                    }
                }
            } else {
                f = width / 2.0f;
                f2 = height / 2.0f;
            }
            PointF centerPoint = getCenterPoint();
            float f6 = centerPoint.x;
            float f7 = f / 2.0f;
            float f8 = centerPoint.y;
            float f9 = f2 / 2.0f;
            r8.A0O(rectF, f6 - f7, f8 - f9, f7 + f6, f8 + f9);
            if (r15.A0S() && !z) {
                r15.A0K(this.A03);
            }
            if (r15.A0T()) {
                r15.A0J(C1409773u.A08 / this.A00);
            }
            r15.A0I(1.0f / r3.A01);
            r15.A02 += (float) (-r3.A02);
        }
        AnonymousClass70N r1 = this.A0M;
        r1.A06(r15);
        if (r15.A0U() && !r1.A09()) {
            this.A0I.postDelayed(this.A0N, 1000);
        }
        this.A0B.A02 = false;
        AnonymousClass8BC r0 = this.A0A;
        if (r0 != null) {
            r0.C5P(r15);
        }
        invalidate();
    }

    public boolean A05() {
        C1405671z r1 = this.A0K;
        if (r1.A07 == null || r1.A08 == null) {
            return false;
        }
        return true;
    }

    public void CKu(int i, float f) {
        int i2;
        AnonymousClass70N r2 = this.A0M;
        C1409773u r3 = r2.A01;
        if (!(r3 == null || r3 == r2.A02 || (!r3.A0T() && !r3.A0S()))) {
            r2.A00 = r3.A0C();
            r3 = r2.A01;
            r2.A02 = r3;
        }
        this.A02 = f;
        float f2 = this.A00;
        if (f2 == 0.0f) {
            this.A01 = f;
        } else {
            this.A01 = f / f2;
        }
        this.A03 = i;
        C139256yX r0 = this.A0B;
        if (r0 != null && !r0.A02 && r3 != null) {
            if (r3.A0T() || r3.A0S()) {
                if (r3.A0S()) {
                    r3.A0K(i);
                }
                C1409773u r1 = r2.A01;
                if (r1.A0T()) {
                    r1.A0J(this.A01);
                }
                C1409773u r4 = r2.A01;
                if (r4 instanceof AnonymousClass69c) {
                    AnonymousClass69c r42 = (AnonymousClass69c) r4;
                    float f3 = C1409773u.A0A;
                    float f4 = C1409773u.A08;
                    float f5 = (f3 - f4) / 4.0f;
                    if (f < f4 + f5) {
                        i2 = 0;
                    } else if (f < (2.0f * f5) + f4) {
                        i2 = 1;
                    } else {
                        int i3 = (f > (f4 + (f5 * 3.0f)) ? 1 : (f == (f4 + (f5 * 3.0f)) ? 0 : -1));
                        i2 = 4;
                        if (i3 < 0) {
                            i2 = 2;
                        }
                    }
                    if (r42.A09 != i2) {
                        r42.A09 = i2;
                        TextPaint textPaint = r42.A0E;
                        textPaint.setTypeface(C123936Wk.A00(r42.A0D, i2));
                        textPaint.setFakeBoldText(C17890vO.A1R(i2));
                        if (r42.A01 != 0.0f) {
                            RectF rectF = r42.A06;
                            float width = rectF.width() / r42.A01;
                            rectF.set(rectF.centerX() - (r42.A03 / 2.0f), rectF.centerY() - (r42.A02 / 2.0f), rectF.centerX() + (r42.A03 / 2.0f), rectF.centerY() + (r42.A02 / 2.0f));
                            AnonymousClass69c.A03(r42);
                            rectF.set(rectF.centerX() - ((rectF.width() * width) / 2.0f), rectF.centerY() - ((rectF.height() * width) / 2.0f), rectF.centerX() + ((rectF.width() * width) / 2.0f), rectF.centerY() + ((width * rectF.height()) / 2.0f));
                        }
                    }
                }
                invalidate();
            }
        }
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A0F.A1o(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.A0F.A1n(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0E;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0E = r0;
        }
        return r0.generatedComponent();
    }

    public void onDetachedFromWindow() {
        this.A0I.removeCallbacks(this.A0N);
        super.onDetachedFromWindow();
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        this.A0F.A1j(z, i, rect);
        super.onFocusChanged(z, i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C109875eA r10 = (C109875eA) parcelable;
        String str = r10.A01;
        if (!TextUtils.isEmpty(str)) {
            Context context = getContext();
            AnonymousClass1KW r4 = this.A07;
            C18000vb r3 = this.A06;
            C26631Sw r7 = this.A0C;
            C18030ve r5 = this.A08;
            C25291Nq r6 = this.A09;
            C1409573s A022 = C1409573s.A06.A02(context, this.A04, r3, r4, r5, r6, r7, str);
            if (A022 != null) {
                C1405671z r2 = this.A0K;
                r2.A02(A022);
                AnonymousClass70N r0 = this.A0M;
                r0.A05();
                r0.A04.addAll(A022.A04);
                r2.A09 = AnonymousClass3Ma.A09(this);
                this.A0J.A07();
            }
            this.A0M.A08(r10.A02);
        }
        this.A0B.A02 = r10.A03;
        this.A02 = r10.A00;
        requestLayout();
        this.A0J.A06();
        super.onRestoreInstanceState(r10.getSuperState());
    }

    public void setControllers(C1419677q r1, C139256yX r2) {
        this.A0G = r1;
        this.A0B = r2;
    }

    public void setDoodle(C1409573s r4) {
        C1405671z r2 = this.A0K;
        r2.A02(r4);
        AnonymousClass70N r0 = this.A0M;
        r0.A05();
        r0.A04.addAll(r4.A04);
        r2.A09 = AnonymousClass3Ma.A09(this);
        C1410073x r02 = this.A0J;
        r02.A07();
        requestLayout();
        r02.A06();
        invalidate();
    }

    public void setDoodleViewListener(AnonymousClass8BC r3) {
        this.A0A = r3;
        C139256yX r1 = this.A0B;
        C18070vi.A0d(r3, 0);
        r1.A00 = r3;
        this.A0F.A00 = r3;
    }

    public DoodleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0I = C108995ce.A0J(this);
        this.A0N = C108945cZ.A0X(this, 6);
        AnonymousClass70N r2 = new AnonymousClass70N();
        this.A0M = r2;
        C1405671z r1 = new C1405671z();
        this.A0K = r1;
        this.A0L = new AnonymousClass6p8(r1);
        this.A0J = C1410073x.A00(this, r1, r2);
        this.A0O = AnonymousClass3MW.A08();
        A00();
    }

    private void A00() {
        if (AnonymousClass112.A01()) {
            setLayerType(2, (Paint) null);
        }
        AnonymousClass3MY.A0w(getContext(), this, 2131886128);
        AnonymousClass70N r3 = this.A0M;
        C110955hY r0 = new C110955hY(this, this.A0K, this.A0L, r3);
        this.A0F = r0;
        AnonymousClass1HF.A0f(this, r0);
    }

    public C1409773u A01(MotionEvent motionEvent) {
        if (!A05() || motionEvent.getPointerCount() != 1) {
            return null;
        }
        return this.A0M.A02(this.A0L.A01((AnonymousClass69K) null, motionEvent.getX(), motionEvent.getY()), true);
    }

    public C1409773u A02(MotionEvent motionEvent) {
        if (!A05() || motionEvent.getPointerCount() != 2) {
            return null;
        }
        AnonymousClass6p8 r3 = this.A0L;
        PointF A012 = r3.A01((AnonymousClass69K) null, motionEvent.getX(0), motionEvent.getY(0));
        PointF A013 = r3.A01((AnonymousClass69K) null, motionEvent.getX(1), motionEvent.getY(1));
        AnonymousClass70N r5 = this.A0M;
        boolean A15 = C18070vi.A15(A012, A013);
        C1409773u A022 = r5.A02(A012, A15);
        if (A022 != null) {
            return A022;
        }
        C1409773u A023 = r5.A02(A013, A15);
        if (A023 == null) {
            return r5.A02(new PointF((A012.x + A013.x) / 2.0f, (A012.y + A013.y) / 2.0f), A15);
        }
        return A023;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017d, code lost:
        if (r2.A03 == ((int) r3.height())) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            super.draw(r12)
            X.73x r2 = r11.A0J
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            X.71z r6 = r2.A0F
            android.graphics.Matrix r0 = r6.A05
            r12.setMatrix(r0)
            android.graphics.RectF r0 = r6.A08
            if (r0 == 0) goto L_0x0291
            X.70N r4 = r2.A0G
            java.util.List r0 = r4.A03()
            int r1 = r0.size()
            java.util.List r0 = r4.A04()
            int r0 = r0.size()
            int r1 = r1 - r0
            r0 = 3
            r5 = 0
            if (r1 < r0) goto L_0x0043
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x015d
            java.util.List r0 = r4.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x0035:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x015d
            X.73u r0 = X.C108945cZ.A0k(r1)
            boolean r0 = r0 instanceof X.AnonymousClass69N
            if (r0 == 0) goto L_0x0035
        L_0x0043:
            r2.A01 = r5
            r2.A02 = r5
            android.graphics.Bitmap r0 = r2.A07
            if (r0 == 0) goto L_0x004e
            r0.recycle()
        L_0x004e:
            r1 = 0
            r2.A07 = r1
            android.graphics.Bitmap r0 = r2.A08
            if (r0 == 0) goto L_0x0058
            r0.recycle()
        L_0x0058:
            r2.A08 = r1
        L_0x005a:
            r12.save()
            android.graphics.RectF r5 = r6.A0B
            float r1 = r5.left
            float r0 = r5.top
            r12.translate(r1, r0)
            X.69K r8 = r4.A01()
            if (r8 == 0) goto L_0x008e
            r12.save()
            android.graphics.RectF r7 = X.C1405671z.A00(r12, r6)
            r3 = 0
            if (r7 == 0) goto L_0x015a
            float r0 = r7.left
        L_0x0078:
            float r1 = -r0
            if (r7 == 0) goto L_0x007d
            float r3 = r7.top
        L_0x007d:
            float r0 = -r3
            r12.translate(r1, r0)
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x0088
            android.os.SystemClock.elapsedRealtime()
        L_0x0088:
            r8.A0M(r12)
            r12.restore()
        L_0x008e:
            java.util.List r3 = r4.A04
            boolean r0 = X.C1410073x.A03(r2, r3)
            if (r0 == 0) goto L_0x00fe
            r12.save()
            X.69K r0 = r4.A01()
            if (r0 == 0) goto L_0x00ba
            r12.save()
            android.graphics.RectF r8 = X.C1405671z.A00(r12, r6)
            r7 = 0
            if (r8 == 0) goto L_0x0157
            float r0 = r8.left
        L_0x00ab:
            float r1 = -r0
            if (r8 == 0) goto L_0x00b0
            float r7 = r8.top
        L_0x00b0:
            float r0 = -r7
            r12.translate(r1, r0)
            X.C1410073x.A01(r12, r2)
            r12.restore()
        L_0x00ba:
            android.graphics.Bitmap r1 = r2.A06
            r8 = 0
            r7 = 0
            if (r1 == 0) goto L_0x0147
            int r0 = r6.A02
            float r9 = (float) r0
            int r0 = r1.getWidth()
            float r10 = (float) r0
            android.graphics.Bitmap r0 = r2.A06
        L_0x00ca:
            if (r0 == 0) goto L_0x0145
            int r0 = r0.getHeight()
            float r1 = (float) r0
        L_0x00d1:
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r7, r7, r10, r1)
            android.graphics.Matrix r7 = X.C123926Wj.A00(r8, r0, r9)
            float r1 = r6.A00
            int r0 = r2.A00
            float r0 = (float) r0
            float r1 = r1 / r0
            r7.postScale(r1, r1)
            X.69K r0 = r4.A01()
            if (r0 != 0) goto L_0x00f2
            android.graphics.Bitmap r1 = r2.A05
            if (r1 == 0) goto L_0x00f2
            android.graphics.Paint r0 = r2.A0C
            r12.drawBitmap(r1, r7, r0)
        L_0x00f2:
            android.graphics.Bitmap r1 = r2.A06
            if (r1 == 0) goto L_0x00fb
            android.graphics.Paint r0 = r2.A0C
            r12.drawBitmap(r1, r7, r0)
        L_0x00fb:
            r12.restore()
        L_0x00fe:
            int r0 = r2.A01
            r7 = 0
            if (r0 <= 0) goto L_0x010c
            android.graphics.Bitmap r1 = r2.A07
            if (r1 == 0) goto L_0x010c
            android.graphics.Paint r0 = r2.A0C
            r12.drawBitmap(r1, r7, r7, r0)
        L_0x010c:
            java.util.List r9 = r4.A03()
            r12.save()
            android.graphics.RectF r8 = X.C1405671z.A00(r12, r6)
            r6 = 0
            if (r8 == 0) goto L_0x0143
            float r0 = r8.left
        L_0x011c:
            float r1 = -r0
            if (r8 == 0) goto L_0x0121
            float r6 = r8.top
        L_0x0121:
            float r0 = -r6
            r12.translate(r1, r0)
            int r8 = r2.A01
            int r6 = r9.size()
            int r0 = r2.A02
            int r6 = r6 - r0
        L_0x012e:
            if (r8 >= r6) goto L_0x0227
            java.lang.Object r1 = r9.get(r8)
            X.73u r1 = (X.C1409773u) r1
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x013d
            android.os.SystemClock.elapsedRealtime()
        L_0x013d:
            r1.A0M(r12)
            int r8 = r8 + 1
            goto L_0x012e
        L_0x0143:
            r0 = 0
            goto L_0x011c
        L_0x0145:
            r1 = 0
            goto L_0x00d1
        L_0x0147:
            android.graphics.Bitmap r1 = r2.A05
            if (r1 == 0) goto L_0x00fb
            int r0 = r6.A02
            float r9 = (float) r0
            int r0 = r1.getWidth()
            float r10 = (float) r0
            android.graphics.Bitmap r0 = r2.A05
            goto L_0x00ca
        L_0x0157:
            r0 = 0
            goto L_0x00ab
        L_0x015a:
            r0 = 0
            goto L_0x0078
        L_0x015d:
            java.util.List r9 = r4.A03()
            X.73u r1 = r4.A01
            X.73u r0 = r2.A09
            if (r1 != r0) goto L_0x017f
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x017f
            int r1 = r2.A04
            android.graphics.RectF r3 = r6.A0B
            float r0 = r3.width()
            int r0 = (int) r0
            if (r1 != r0) goto L_0x017f
            int r1 = r2.A03
            float r0 = r3.height()
            int r0 = (int) r0
            if (r1 == r0) goto L_0x005a
        L_0x017f:
            r2.A01 = r5
            r2.A02 = r5
            X.73u r0 = r4.A01
            r2.A09 = r0
            android.graphics.RectF r1 = r6.A0B
            float r0 = r1.width()
            int r0 = (int) r0
            r2.A04 = r0
            float r0 = r1.height()
            int r3 = (int) r0
            r2.A03 = r3
            r0 = 1
            r2.A0B = r0
            android.graphics.Bitmap r1 = r2.A07
            int r0 = r2.A04
            android.graphics.Bitmap r0 = X.C123916Wi.A00(r1, r0, r3)
            r2.A07 = r0
            r8 = 0
            if (r0 == 0) goto L_0x01df
            r0.eraseColor(r5)
            android.graphics.Canvas r7 = X.C108945cZ.A0I(r0)
            android.graphics.RectF r3 = X.C1405671z.A00(r7, r6)
            if (r3 == 0) goto L_0x01dd
            float r0 = r3.left
        L_0x01b6:
            float r1 = -r0
            if (r3 == 0) goto L_0x01db
            float r0 = r3.top
        L_0x01bb:
            float r0 = -r0
            r7.translate(r1, r0)
            java.util.Iterator r3 = r9.iterator()
        L_0x01c3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01df
            X.73u r1 = X.C108945cZ.A0k(r3)
            X.73u r0 = r2.A09
            if (r1 == r0) goto L_0x01df
            int r0 = r2.A01
            int r0 = r0 + 1
            r2.A01 = r0
            r1.A0M(r7)
            goto L_0x01c3
        L_0x01db:
            r0 = 0
            goto L_0x01bb
        L_0x01dd:
            r0 = 0
            goto L_0x01b6
        L_0x01df:
            android.graphics.Bitmap r3 = r2.A08
            int r1 = r2.A04
            int r0 = r2.A03
            android.graphics.Bitmap r0 = X.C123916Wi.A00(r3, r1, r0)
            r2.A08 = r0
            if (r0 == 0) goto L_0x005a
            r0.eraseColor(r5)
            android.graphics.Canvas r7 = X.C108945cZ.A0I(r0)
            android.graphics.RectF r3 = X.C1405671z.A00(r7, r6)
            if (r3 == 0) goto L_0x0225
            float r0 = r3.left
        L_0x01fc:
            float r1 = -r0
            if (r3 == 0) goto L_0x0201
            float r8 = r3.top
        L_0x0201:
            float r0 = -r8
            r7.translate(r1, r0)
            java.util.Iterator r3 = r9.iterator()
        L_0x0209:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005a
            X.73u r1 = X.C108945cZ.A0k(r3)
            X.73u r0 = r2.A09
            if (r1 != r0) goto L_0x0219
            r5 = 1
            goto L_0x0209
        L_0x0219:
            if (r5 == 0) goto L_0x0209
            int r0 = r2.A02
            int r0 = r0 + 1
            r2.A02 = r0
            r1.A0M(r7)
            goto L_0x0209
        L_0x0225:
            r0 = 0
            goto L_0x01fc
        L_0x0227:
            r12.restore()
            int r0 = r2.A02
            if (r0 <= 0) goto L_0x0237
            android.graphics.Bitmap r1 = r2.A08
            if (r1 == 0) goto L_0x0237
            android.graphics.Paint r0 = r2.A0C
            r12.drawBitmap(r1, r7, r7, r0)
        L_0x0237:
            r12.restore()
            X.73u r0 = r4.A02
            boolean r1 = X.AnonymousClass000.A1W(r0)
            float r0 = r5.left
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x024c
            float r0 = r5.top
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0260
        L_0x024c:
            r12.save()
            android.graphics.Region$Op r0 = android.graphics.Region.Op.DIFFERENCE
            r12.clipRect(r5, r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r1 == 0) goto L_0x025a
            r0 = -1157627904(0xffffffffbb000000, float:-0.001953125)
        L_0x025a:
            r12.drawColor(r0)
            r12.restore()
        L_0x0260:
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x027c
            java.util.Iterator r1 = r3.iterator()
        L_0x0268:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x027c
            X.73u r0 = X.C108945cZ.A0k(r1)
            boolean r0 = r0 instanceof X.AnonymousClass69N
            if (r0 == 0) goto L_0x0268
        L_0x0276:
            X.87P r0 = r2.A0E
            r0.CFU()
            return
        L_0x027c:
            java.util.Iterator r1 = r3.iterator()
        L_0x0280:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0291
            X.73u r0 = X.C108945cZ.A0k(r1)
            boolean r0 = r0.A0V()
            if (r0 == 0) goto L_0x0280
            goto L_0x0276
        L_0x0291:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.DoodleView.draw(android.graphics.Canvas):void");
    }

    public C1410073x getDoodleRender() {
        return this.A0J;
    }

    public AnonymousClass6p8 getPointsUtil() {
        return this.A0L;
    }

    public AnonymousClass70N getShapeRepository() {
        return this.A0M;
    }

    public C1405671z getState() {
        return this.A0K;
    }

    public float getStrokeScale() {
        return this.A00;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0M.A09()) {
            this.A0I.postDelayed(this.A0N, 1000);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C1405671z r6 = this.A0K;
        RectF rectF = r6.A08;
        if (rectF != null) {
            RectF rectF2 = this.A0O;
            rectF2.set(rectF);
            r6.A0A.mapRect(rectF2);
            float measuredWidth = (float) getMeasuredWidth();
            float measuredHeight = (float) getMeasuredHeight();
            float width = rectF2.width() / rectF2.height();
            if (measuredWidth / measuredHeight < width) {
                measuredHeight = measuredWidth / width;
            } else {
                measuredWidth = measuredHeight * width;
            }
            r6.A00 = measuredWidth / rectF2.width();
            if (this.A00 == 0.0f || !AnonymousClass000.A1a(this.A0M.A04)) {
                float f = r6.A00;
                this.A00 = f;
                this.A01 = this.A02 / f;
            }
            r6.A0B.set((((float) getMeasuredWidth()) - measuredWidth) / 2.0f, (((float) getMeasuredHeight()) - measuredHeight) / 2.0f, (((float) getMeasuredWidth()) + measuredWidth) / 2.0f, (((float) getMeasuredHeight()) + measuredHeight) / 2.0f);
            r6.A09 = AnonymousClass3Ma.A09(this);
            r6.A03 = getMeasuredHeight();
            r6.A04 = getMeasuredWidth();
            C1410073x r2 = this.A0J;
            if (C1410073x.A05(r2, false) || C1410073x.A04(r2, false)) {
                r2.A07();
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        String str;
        String str2;
        RectF rectF;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        C1405671z r0 = this.A0K;
        RectF rectF2 = r0.A07;
        if (rectF2 == null || (rectF = r0.A08) == null) {
            str = null;
        } else {
            str = this.A04.A00(rectF2, rectF, this.A0M.A04, r0.A02).A05();
        }
        AnonymousClass70N r02 = this.A0M;
        try {
            str2 = r02.A03.A01(r02.A04);
        } catch (JSONException e) {
            Log.e("ShapeRepository/getUndoJson", e);
            str2 = null;
        }
        return new C109875eA(onSaveInstanceState, str, str2, this.A02, this.A0B.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r3 != 6) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
        if (r1 != 6) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b6, code lost:
        if (r2.getStrokeWidth() == r5.A01) goto L_0x01b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02b2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            boolean r0 = r13.isEnabled()
            r8 = 0
            if (r0 == 0) goto L_0x02b2
            r13.invalidate()
            X.6yX r2 = r13.A0B
            int r1 = r13.A03
            float r0 = r13.A01
            boolean r1 = r2.A01(r14, r0, r1, r8)
            r0 = 1
            if (r1 == 0) goto L_0x0018
            return r0
        L_0x0018:
            X.77q r7 = r13.A0G
            if (r7 == 0) goto L_0x02b2
            int r3 = r14.getActionMasked()
            r2 = 2
            r1 = 1
            if (r3 == 0) goto L_0x0237
            if (r3 == r0) goto L_0x017e
            if (r3 == r2) goto L_0x0164
            r0 = 3
            if (r3 == r0) goto L_0x017e
            r0 = 5
            if (r3 == r0) goto L_0x0237
            r0 = 6
            if (r3 == r0) goto L_0x017e
        L_0x0031:
            X.CIZ r0 = r7.A01
            android.view.GestureDetector r0 = r0.A00
            boolean r12 = r0.onTouchEvent(r14)
            X.5e2 r0 = r7.A07
            boolean r0 = r0.onTouchEvent(r14)
            r12 = r12 | r0
            X.6hF r6 = r7.A06
            int r0 = r14.getPointerCount()
            r10 = 0
            r1 = 2
            if (r0 != r1) goto L_0x015b
            int r0 = r14.getActionMasked()
            if (r0 != r1) goto L_0x015b
            r9 = 1
            float r5 = r14.getX(r9)
            float r0 = r14.getX(r8)
            float r5 = r5 - r0
            float r4 = r14.getY(r9)
            float r0 = r14.getY(r8)
            float r4 = r4 - r0
            double r2 = (double) r4
            double r0 = (double) r5
            double r0 = java.lang.Math.atan2(r2, r0)
            float r2 = (float) r0
            float r0 = r6.A01
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x008d
            float r0 = r6.A02
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x008d
            float r1 = r6.A00
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x008d
            X.77q r3 = r6.A03
            float r0 = r2 - r1
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r9 = (float) r0
            X.6xJ r10 = r3.A04
            X.73u r0 = r10.A00
            if (r0 != 0) goto L_0x012f
            r9 = 0
        L_0x008d:
            r6.A01 = r5
            r6.A02 = r4
            r6.A00 = r2
        L_0x0093:
            r12 = r12 | r9
            X.6xK r4 = r7.A05
            int r1 = r14.getActionMasked()
            r5 = 1
            if (r1 == 0) goto L_0x011f
            if (r1 == r5) goto L_0x011c
            r0 = 2
            if (r1 == r0) goto L_0x00bc
            r0 = 3
            if (r1 == r0) goto L_0x011c
            r0 = 5
            if (r1 == r0) goto L_0x00b2
            r0 = 6
            if (r1 == r0) goto L_0x011c
        L_0x00ab:
            boolean r0 = r4.A02
            r0 = r0 | r12
            if (r0 == 0) goto L_0x02b2
            r8 = 1
            return r8
        L_0x00b2:
            android.graphics.PointF r0 = r4.A04
            X.C138586xK.A00(r0, r14)
            r4.A02 = r5
            r4.A01 = r5
            goto L_0x00ab
        L_0x00bc:
            android.graphics.PointF r6 = r4.A06
            X.C138586xK.A00(r6, r14)
            boolean r1 = r4.A02
            if (r1 == 0) goto L_0x00ff
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x00ff
            float r9 = r6.x
            android.graphics.PointF r2 = r4.A05
            float r0 = r2.x
            float r1 = r9 - r0
            float r7 = r6.y
            float r0 = r2.y
            float r0 = r7 - r0
            float r1 = r1 * r1
            float r0 = r0 * r0
            float r1 = r1 + r0
            double r2 = (double) r1
            int r0 = r4.A03
            int r0 = r0 * r0
            double r0 = (double) r0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x00f7
            r4.A01 = r5
            X.77q r2 = r4.A00
            android.graphics.PointF r1 = r4.A04
            float r0 = r1.x
            float r9 = r9 - r0
            float r0 = r1.y
            float r7 = r7 - r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r9, r7)
            r2.A01(r0, r1)
        L_0x00f7:
            android.graphics.PointF r0 = r4.A04
            r0.set(r6)
            r4.A02 = r5
            goto L_0x00ab
        L_0x00ff:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x00f7
            if (r1 == 0) goto L_0x00f7
            X.77q r7 = r4.A00
            float r3 = r6.x
            android.graphics.PointF r2 = r4.A04
            float r0 = r2.x
            float r3 = r3 - r0
            float r1 = r6.y
            float r0 = r2.y
            float r1 = r1 - r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r3, r1)
            r7.A01(r0, r2)
            goto L_0x00f7
        L_0x011c:
            r4.A02 = r8
            goto L_0x00ab
        L_0x011f:
            android.graphics.PointF r1 = r4.A04
            X.C138586xK.A00(r1, r14)
            r4.A02 = r5
            r4.A01 = r8
            android.graphics.PointF r0 = r4.A05
            r0.set(r1)
            goto L_0x00ab
        L_0x012f:
            X.C138576xJ.A00(r10)
            X.6p8 r11 = r10.A04
            X.73u r0 = r10.A00
            android.graphics.RectF r0 = r0.A06
            float r3 = r0.centerX()
            float r1 = r0.centerY()
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r3, r1)
            android.graphics.PointF r3 = r11.A00(r0)
            X.6yh r1 = r10.A05
            X.73u r0 = r10.A00
            float r3 = r1.A01(r3, r0, r9)
            X.73u r1 = r10.A00
            float r0 = r1.A02
            float r0 = r0 + r3
            r1.A02 = r0
            r9 = 1
            goto L_0x008d
        L_0x015b:
            r6.A00 = r10
            r6.A02 = r10
            r6.A01 = r10
            r9 = 0
            goto L_0x0093
        L_0x0164:
            X.70N r2 = r7.A09
            X.73u r1 = r2.A01
            if (r1 == 0) goto L_0x0031
            X.73u r0 = r2.A02
            if (r1 == r0) goto L_0x0031
            boolean r0 = r1.A0W()
            if (r0 == 0) goto L_0x0031
            X.6hH r0 = r1.A0C()
            r2.A00 = r0
            r2.A02 = r1
            goto L_0x0031
        L_0x017e:
            X.70N r3 = r7.A09
            X.73u r4 = r3.A01
            if (r4 == 0) goto L_0x01c0
            X.73u r0 = r3.A02
            if (r0 != r4) goto L_0x01b8
            boolean r0 = r4.A0W()
            if (r0 == 0) goto L_0x01b8
            X.6hH r5 = r3.A00
            if (r5 == 0) goto L_0x01b8
            android.graphics.RectF r1 = r5.A03
            android.graphics.RectF r0 = r4.A06
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0229
            float r1 = r4.A02
            float r0 = r5.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0229
            android.graphics.Paint r2 = r4.A05
            int r1 = r2.getColor()
            int r0 = r5.A02
            if (r1 != r0) goto L_0x0229
            float r1 = r2.getStrokeWidth()
            float r0 = r5.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0229
        L_0x01b8:
            r4.A0G()
            r0 = 0
            r3.A02 = r0
            r3.A00 = r0
        L_0x01c0:
            X.8BC r0 = r7.A02
            r0.Bs7()
            X.6xJ r3 = r7.A04
            X.73u r0 = r3.A00
            if (r0 == 0) goto L_0x0031
            float r5 = r14.getX()
            float r4 = r14.getY()
            X.73u r0 = r3.A00
            if (r0 == 0) goto L_0x0211
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x0211
            X.71K r2 = r3.A06
            android.os.Handler r1 = r2.A01
            java.lang.Runnable r0 = r2.A06
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r2.A05
            r1.post(r0)
            X.AnonymousClass71K.A00(r2)
            r2.A00 = r8
            boolean r0 = X.AnonymousClass71K.A01(r2, r5, r4)
            if (r0 == 0) goto L_0x0211
            X.6cD r0 = r3.A02
            X.73u r2 = r3.A00
            X.C18070vi.A0d(r2, r8)
            X.7JF r1 = r0.A00
            X.70N r0 = r1.A0V
            r0.A07(r2)
            X.73x r0 = r1.A0O
            r0.A06()
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r1.A0P
            r0.invalidate()
            X.AnonymousClass7JF.A05(r1)
        L_0x0211:
            X.6yh r2 = r3.A05
            java.util.Map r0 = r2.A05
            java.util.Iterator r1 = X.C17890vO.A0l(r0)
        L_0x0219:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x022f
            java.lang.Object r0 = r1.next()
            X.6q1 r0 = (X.AnonymousClass6q1) r0
            r0.A01()
            goto L_0x0219
        L_0x0229:
            X.6hH r0 = r3.A00
            X.AnonymousClass70N.A00(r0, r4, r3)
            goto L_0x01b8
        L_0x022f:
            X.C139356yh.A00(r2)
            r0 = 0
            r3.A00 = r0
            goto L_0x0031
        L_0x0237:
            int r0 = r14.getPointerCount()
            if (r0 != r1) goto L_0x02a3
            X.70N r1 = r7.A09
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r7.A03
            X.73u r0 = r0.A01(r14)
        L_0x0245:
            r1.A01 = r0
        L_0x0247:
            X.70N r0 = r7.A09
            X.73u r4 = r0.A01
            if (r4 == 0) goto L_0x0031
            X.6xJ r1 = r7.A04
            X.6cD r0 = r1.A02
            X.7JF r0 = r0.A00
            X.6ud r0 = r0.A0J
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r0.A00
            boolean r0 = r0.A0i
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0275
            r1.A00 = r4
            boolean r0 = r4.A0X()
            if (r0 == 0) goto L_0x0275
            X.71K r1 = r1.A06
            android.os.Handler r3 = r1.A01
            java.lang.Runnable r0 = r1.A05
            r3.removeCallbacks(r0)
            java.lang.Runnable r2 = r1.A06
            r0 = 700(0x2bc, double:3.46E-321)
            r3.postDelayed(r2, r0)
        L_0x0275:
            X.8BC r0 = r7.A02
            r0.C5P(r4)
            r0.Bs6()
            boolean r0 = r4.A0T()
            if (r0 == 0) goto L_0x028b
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r7.A03
            float r0 = r4.A0B()
            r1.A01 = r0
        L_0x028b:
            boolean r0 = r4.A0S()
            if (r0 == 0) goto L_0x0031
            android.graphics.Paint r2 = r4.A05
            int r0 = r2.getColor()
            if (r0 == 0) goto L_0x0031
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r7.A03
            int r0 = r2.getColor()
            r1.A03 = r0
            goto L_0x0031
        L_0x02a3:
            int r0 = r14.getPointerCount()
            if (r0 != r2) goto L_0x0247
            X.70N r1 = r7.A09
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r7.A03
            X.73u r0 = r0.A02(r14)
            goto L_0x0245
        L_0x02b2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.DoodleView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setStrokeColor(int i) {
        this.A03 = i;
    }

    public void setStrokeScale(float f) {
        this.A00 = f;
    }

    public void setStrokeWidth(float f) {
        this.A01 = f;
    }

    public DoodleView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A0I = C108995ce.A0J(this);
        this.A0N = C108945cZ.A0X(this, 6);
        AnonymousClass70N r2 = new AnonymousClass70N();
        this.A0M = r2;
        C1405671z r1 = new C1405671z();
        this.A0K = r1;
        this.A0L = new AnonymousClass6p8(r1);
        this.A0J = C1410073x.A00(this, r1, r2);
        this.A0O = AnonymousClass3MW.A08();
        A00();
    }

    public DoodleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0I = C108995ce.A0J(this);
        this.A0N = C108945cZ.A0X(this, 6);
        AnonymousClass70N r2 = new AnonymousClass70N();
        this.A0M = r2;
        C1405671z r1 = new C1405671z();
        this.A0K = r1;
        this.A0L = new AnonymousClass6p8(r1);
        this.A0J = C1410073x.A00(this, r1, r2);
        this.A0O = AnonymousClass3MW.A08();
        A00();
    }

    public DoodleView(Context context) {
        super(context);
        this.A0I = C108995ce.A0J(this);
        this.A0N = C108945cZ.A0X(this, 6);
        AnonymousClass70N r2 = new AnonymousClass70N();
        this.A0M = r2;
        C1405671z r1 = new C1405671z();
        this.A0K = r1;
        this.A0L = new AnonymousClass6p8(r1);
        this.A0J = C1410073x.A00(this, r1, r2);
        this.A0O = AnonymousClass3MW.A08();
        A00();
    }

    public DoodleView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A03();
    }
}
