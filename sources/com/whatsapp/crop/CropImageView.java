package com.whatsapp.crop;

import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass3SY;
import X.C106815Xh;
import X.C39401t1;
import X.C70633Bw;
import X.C80563xO;
import X.C88154Yn;
import X.C98654rV;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public class CropImageView extends C80563xO implements C106815Xh {
    public boolean A00;
    public boolean A01;
    public float A02;
    public float A03;
    public int A04;
    public C88154Yn A05;
    public final ArrayList A06;
    public final AnonymousClass3SY A07;

    public void clearFocus() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A06;
            if (i < arrayList.size()) {
                C88154Yn r1 = (C88154Yn) arrayList.get(i);
                r1.A09 = false;
                r1.A04 = C88154Yn.A00(r1);
                i++;
            } else {
                return;
            }
        }
    }

    public static void A00(CropImageView cropImageView, int i, int i2, int i3, int i4) {
        AnonymousClass3SY r2 = cropImageView.A07;
        Rect rect = r2.A02;
        int i5 = r2.A0P;
        rect.set(i4 - i5, i, i4, i3);
        r2.A03.set(i4, i, i5 + i4, i3);
        r2.A04.set(i2 - i5, i, i2, i3);
        r2.A05.set(i2, i, i5 + i2, i3);
        r2.A07.set(i4, i - i5, i2, i);
        r2.A06.set(i4, i, i2, i5 + i);
        r2.A01.set(i4, i3 - i5, i2, i3);
        r2.A00.set(i4, i3, i2, i5 + i3);
        r2.A0G = true;
        r2.A1d();
    }

    private void A01(C88154Yn r14) {
        Rect rect = r14.A04;
        float width = (float) rect.width();
        float height = (float) rect.height();
        float max = Math.max(1.0f, Math.min((((float) getWidth()) / width) * 0.6f, (((float) getHeight()) / height) * 0.6f) * getScale());
        if (((double) (Math.abs(max - getScale()) / max)) > 0.1d) {
            float[] fArr = {r14.A05.centerX(), r14.A05.centerY()};
            getImageMatrix().mapPoints(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
            this.A06.post(new C98654rV(this, new C70633Bw(this, r14, 30), getScale(), (max - getScale()) / 300.0f, f, f2, System.currentTimeMillis()));
        }
    }

    public void A08(C88154Yn r8) {
        Rect rect = r8.A04;
        int max = Math.max(0, -rect.left);
        int min = Math.min(0, getWidth() - rect.right);
        int max2 = Math.max(0, -rect.top);
        int min2 = Math.min(0, getHeight() - rect.bottom);
        if (max == 0 && rect.width() <= getWidth()) {
            max = min;
        }
        if (max2 == 0 && rect.height() <= getHeight()) {
            max2 = min2;
        }
        if (max != 0 || max2 != 0) {
            float f = (float) max;
            float f2 = (float) max2;
            if (f != 0.0f || f2 != 0.0f) {
                A05(f, f2);
                setImageMatrix(getImageViewMatrix());
            }
        }
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A07.A1o(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void onDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Canvas canvas2 = canvas;
        if (!this.A01) {
            super.onDraw(canvas2);
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A06;
            if (i < arrayList.size()) {
                C88154Yn r7 = (C88154Yn) arrayList.get(i);
                Path path = new Path();
                View view = r7.A07;
                float f = AnonymousClass3Ma.A09(view).density;
                Paint paint5 = r7.A0D;
                paint5.setStrokeWidth(0.5f + f);
                Rect A072 = AnonymousClass3MW.A07();
                view.getDrawingRect(A072);
                boolean z = r7.A08;
                Rect rect = r7.A04;
                if (z) {
                    float width = (float) rect.width();
                    float height = (float) r7.A04.height();
                    Rect rect2 = r7.A04;
                    float f2 = width / 2.0f;
                    path.addCircle(((float) rect2.left) + f2, ((float) rect2.top) + (height / 2.0f), f2, Path.Direction.CW);
                    paint5.setColor(-1112874);
                } else {
                    path.addRect(new RectF(rect), Path.Direction.CW);
                    paint5.setColor(1728053247);
                    Rect A073 = AnonymousClass3MW.A07();
                    A073.set(A072);
                    A073.right = r7.A04.left;
                    if (r7.A09) {
                        paint = r7.A0B;
                    } else {
                        paint = r7.A0C;
                    }
                    canvas2.drawRect(A073, paint);
                    A073.set(A072);
                    Rect rect3 = r7.A04;
                    A073.right = rect3.right;
                    A073.left = rect3.left;
                    A073.bottom = rect3.top;
                    if (r7.A09) {
                        paint2 = r7.A0B;
                    } else {
                        paint2 = r7.A0C;
                    }
                    canvas2.drawRect(A073, paint2);
                    A073.set(A072);
                    Rect rect4 = r7.A04;
                    A073.right = rect4.right;
                    A073.left = rect4.left;
                    A073.top = rect4.bottom;
                    if (r7.A09) {
                        paint3 = r7.A0B;
                    } else {
                        paint3 = r7.A0C;
                    }
                    canvas2.drawRect(A073, paint3);
                    A073.set(A072);
                    A073.left = r7.A04.right;
                    if (r7.A09) {
                        paint4 = r7.A0B;
                    } else {
                        paint4 = r7.A0C;
                    }
                    canvas2.drawRect(A073, paint4);
                    int round = Math.round(f);
                    Rect rect5 = r7.A04;
                    int i2 = rect5.left + round;
                    int i3 = rect5.right - round;
                    int i4 = rect5.top;
                    int i5 = i4 + round;
                    int i6 = rect5.bottom;
                    int i7 = i6 - round;
                    float f3 = (float) (i4 + ((i6 - i4) / 3));
                    Canvas canvas3 = canvas2;
                    Paint paint6 = paint5;
                    canvas3.drawLine((float) i2, f3, (float) i3, f3, paint6);
                    Rect rect6 = r7.A04;
                    int i8 = rect6.bottom;
                    float f4 = (float) (i8 - ((i8 - rect6.top) / 3));
                    canvas3.drawLine((float) i2, f4, (float) i3, f4, paint6);
                    Rect rect7 = r7.A04;
                    int i9 = rect7.left;
                    float f5 = (float) (i9 + ((rect7.right - i9) / 3));
                    float f6 = (float) i5;
                    float f7 = (float) i7;
                    canvas3.drawLine(f5, f6, f5, f7, paint6);
                    Rect rect8 = r7.A04;
                    int i10 = rect8.right;
                    float f8 = (float) (i10 - ((i10 - rect8.left) / 3));
                    canvas3.drawLine(f8, f6, f8, f7, paint6);
                }
                canvas2.drawPath(path, paint5);
                float f9 = f * 2.0f;
                int round2 = Math.round(f9);
                Rect rect9 = r7.A04;
                int i11 = rect9.left + round2;
                int i12 = rect9.right - round2;
                int i13 = rect9.top + round2;
                int i14 = rect9.bottom - round2;
                int i15 = (int) (f * 24.0f);
                int min = Math.min(i15, rect9.width() / 4);
                int min2 = Math.min(i15, r7.A04.height() / 4);
                Rect rect10 = r7.A04;
                int i16 = rect10.left;
                int i17 = i16 + ((rect10.right - i16) / 2);
                int i18 = rect10.top;
                int i19 = i18 + ((rect10.bottom - i18) / 2);
                paint5.setStrokeWidth(f9);
                paint5.setColor(-1);
                paint5.setStrokeCap(Paint.Cap.SQUARE);
                int i20 = min / 2;
                float f10 = (float) i13;
                float f11 = (float) (i17 + i20);
                Paint paint7 = paint5;
                float f12 = (float) (i17 - i20);
                Canvas canvas4 = canvas2;
                canvas4.drawLine(f12, f10, f11, f10, paint7);
                float f13 = (float) i14;
                canvas4.drawLine(f12, f13, f11, f13, paint7);
                float f14 = (float) i11;
                int i21 = min2 / 2;
                float f15 = (float) (i19 - i21);
                float f16 = (float) (i19 + i21);
                canvas4.drawLine(f14, f15, f14, f16, paint7);
                float f17 = (float) i12;
                canvas4.drawLine(f17, f15, f17, f16, paint7);
                float f18 = (float) (i11 + min);
                float f19 = f10;
                float f20 = f14;
                canvas4.drawLine(f20, f19, f18, f10, paint7);
                float f21 = (float) (i13 + min2);
                canvas4.drawLine(f20, f19, f14, f21, paint7);
                float f22 = (float) (i12 - min);
                Canvas canvas5 = canvas2;
                float f23 = f17;
                float f24 = f10;
                Paint paint8 = paint5;
                canvas5.drawLine(f23, f24, f22, f10, paint8);
                canvas5.drawLine(f23, f24, f17, f21, paint8);
                canvas5.drawLine(f23, f13, f22, f13, paint8);
                float f25 = (float) (i14 - min2);
                float f26 = f13;
                Paint paint9 = paint5;
                canvas2.drawLine(f17, f26, f17, f25, paint9);
                float f27 = f14;
                canvas2.drawLine(f27, f26, f18, f13, paint9);
                canvas2.drawLine(f27, f26, f14, f25, paint9);
                i++;
            } else {
                return;
            }
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A00) {
            this.A00 = true;
            generatedComponent();
        }
        this.A06 = AnonymousClass000.A13();
        this.A05 = null;
        Rect rect = C39401t1.A0A;
        AnonymousClass3SY r0 = new AnonymousClass3SY(this, this, AnonymousClass000.A0Y(this).getDimensionPixelSize(2131168774));
        this.A07 = r0;
        AnonymousClass1HF.A0f(this, r0);
    }

    public void A05(float f, float f2) {
        super.A05(f, f2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A06;
            if (i < arrayList.size()) {
                C88154Yn r1 = (C88154Yn) arrayList.get(i);
                r1.A03.postTranslate(f, f2);
                r1.A04 = C88154Yn.A00(r1);
                i++;
            } else {
                return;
            }
        }
    }

    public void A06(float f, float f2, float f3) {
        super.A06(f, f2, f3);
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            C88154Yn r2 = (C88154Yn) it.next();
            r2.A03.set(getImageMatrix());
            r2.A04 = C88154Yn.A00(r2);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A07.A00 != null) {
            Iterator it = this.A06.iterator();
            while (it.hasNext()) {
                C88154Yn r2 = (C88154Yn) it.next();
                r2.A03.set(getImageMatrix());
                r2.A04 = C88154Yn.A00(r2);
                if (r2.A09) {
                    A01(r2);
                }
            }
        }
        ArrayList arrayList = this.A06;
        if (arrayList.size() > 0) {
            ((C88154Yn) arrayList.get(0)).A03();
            Rect A032 = ((C88154Yn) arrayList.get(0)).A03();
            A00(this, A032.top, A032.right, A032.bottom, A032.left);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C88154Yn r6;
        int i = 0;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            while (true) {
                ArrayList arrayList = this.A06;
                if (i >= arrayList.size()) {
                    break;
                }
                C88154Yn r2 = (C88154Yn) arrayList.get(i);
                int A012 = r2.A01(motionEvent.getX(), motionEvent.getY());
                if (A012 != 1) {
                    this.A04 = A012;
                    this.A05 = r2;
                    this.A02 = motionEvent.getX();
                    this.A03 = motionEvent.getY();
                    C88154Yn r22 = this.A05;
                    int i2 = 2;
                    if (A012 == 32) {
                        i2 = 1;
                    }
                    if (i2 != r22.A02) {
                        r22.A02 = i2;
                        r22.A07.invalidate();
                    }
                    clearFocus();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            break;
                        }
                        C88154Yn r23 = (C88154Yn) arrayList.get(i3);
                        if (r23.A01(motionEvent.getX(), motionEvent.getY()) == 1) {
                            i3++;
                        } else if (!r23.A09) {
                            r23.A09 = true;
                            r23.A04 = C88154Yn.A00(r23);
                        }
                    }
                    invalidate();
                } else {
                    i++;
                }
            }
        } else if (action == 1) {
            C88154Yn r1 = this.A05;
            if (r1 != null) {
                if (r1.A09) {
                    r1.A09 = false;
                    r1.A04 = C88154Yn.A00(r1);
                    invalidate();
                }
                A01(this.A05);
                C88154Yn r12 = this.A05;
                if (0 != r12.A02) {
                    r12.A02 = 0;
                    r12.A07.invalidate();
                }
            }
            this.A05 = null;
        } else if (action == 2 && (r6 = this.A05) != null) {
            r6.A04(this.A04, motionEvent.getX() - this.A02, motionEvent.getY() - this.A03);
            this.A02 = motionEvent.getX();
            this.A03 = motionEvent.getY();
            A08(this.A05);
        }
        int action2 = motionEvent.getAction();
        if (action2 != 1 && (action2 == 2 ? getScale() != 1.0f : action2 != 3)) {
            return true;
        }
        A04();
        return true;
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A00) {
            this.A00 = true;
            generatedComponent();
        }
    }
}
