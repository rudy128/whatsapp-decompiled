package X;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.CmM  reason: case insensitive filesystem */
public final class C25809CmM {
    public ValueAnimator A00;
    public ColorFilter A01;
    public Rect A02;
    public C3F A03;
    public C22821Di A04;
    public C18090vk A05;
    public C18090vk A06;
    public final ValueAnimator.AnimatorUpdateListener A07;
    public final Paint A08;
    public final C25554Chs A09;

    public final void A00(int i) {
        this.A08.setAlpha(i);
        C18090vk r0 = this.A06;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public final void A01(ColorFilter colorFilter, Rect rect, CNE cne, C3F c3f) {
        int i;
        int i2;
        int i3;
        C22821Di dqx;
        int i4;
        C28092Dr6 dr6;
        int i5;
        float f;
        float f2;
        float height;
        float f3;
        float max;
        Drawable.Callback callback;
        C3F c3f2 = c3f;
        RectF rectF = null;
        if (!C18070vi.A18(c3f2, this.A03)) {
            C3F c3f3 = this.A03;
            if (c3f3 != null) {
                if (c3f3 instanceof C22826BRe) {
                    C22826BRe bRe = (C22826BRe) c3f3;
                    if (bRe.A01) {
                        bRe.A00.stop();
                    }
                }
                if (c3f3 instanceof C22829BRh) {
                    ((C22829BRh) c3f3).A02.setCallback((Drawable.Callback) null);
                }
            }
            if (c3f != null) {
                C18090vk r0 = this.A05;
                if (r0 != null) {
                    callback = (Drawable.Callback) r0.invoke();
                } else {
                    callback = null;
                }
                if (c3f2 instanceof C22829BRh) {
                    ((C22829BRh) c3f2).A02.setCallback(callback);
                }
                if (c3f2 instanceof C22826BRe) {
                    C22826BRe bRe2 = (C22826BRe) c3f2;
                    if (bRe2.A01) {
                        bRe2.A00.start();
                    }
                }
            } else {
                c3f2 = null;
            }
            this.A03 = c3f2;
        }
        Rect rect2 = rect;
        this.A02 = rect2;
        this.A01 = colorFilter;
        C25554Chs chs = this.A09;
        CNE cne2 = cne;
        chs.A01 = cne2;
        this.A04 = null;
        if (rect != null) {
            C3F c3f4 = this.A03;
            if (c3f4 == null) {
                dr6 = null;
            } else {
                this.A02 = rect2;
                if (c3f4 instanceof C22829BRh) {
                    C22829BRh bRh = (C22829BRh) c3f4;
                    i = bRh.A01;
                    i2 = bRh.A00;
                } else {
                    boolean z = c3f4 instanceof C22828BRg;
                    if (z) {
                        i = ((C22828BRg) c3f4).A01;
                    } else {
                        i = -1;
                    }
                    if (z) {
                        i2 = ((C22828BRg) c3f4).A00;
                    } else {
                        i2 = -1;
                    }
                }
                Matrix matrix = null;
                if (i > 0 && i2 > 0 && cne != null) {
                    matrix = chs.A02;
                    C18070vi.A0d(matrix, 0);
                    EBA eba = cne2.A01;
                    PointF pointF = cne2.A00;
                    if (pointF != null) {
                        f = pointF.x;
                        f2 = pointF.y;
                    } else {
                        f = 0.5f;
                        f2 = 0.5f;
                    }
                    DBY dby = (DBY) eba;
                    float f4 = (float) i;
                    float A022 = BE6.A02(rect2) / f4;
                    float f5 = (float) i2;
                    float height2 = ((float) rect2.height()) / f5;
                    if (dby instanceof BRY) {
                        if (height2 > A022) {
                            float f6 = f4 * height2;
                            f3 = ((float) rect2.left) + Math.max(Math.min((BE6.A02(rect2) * 0.5f) - (f6 * f), 0.0f), BE6.A02(rect2) - f6);
                            max = (float) rect2.top;
                            A022 = height2;
                        } else {
                            f3 = (float) rect2.left;
                            float f7 = f5 * A022;
                            max = Math.max(Math.min((((float) rect2.height()) * 0.5f) - (f2 * f7), 0.0f), ((float) rect2.height()) - f7) + ((float) rect2.top);
                        }
                        matrix.setScale(A022, A022);
                        DBY.A00(matrix, f3, max);
                    } else if (dby instanceof BRX) {
                        matrix.setScale(height2, height2);
                        DBY.A00(matrix, ((float) rect2.left) + ((BE6.A02(rect2) - (f4 * height2)) * 0.5f), (float) rect2.top);
                    } else if (dby instanceof BRW) {
                        matrix.setScale(A022, height2);
                        DBY.A00(matrix, (float) rect2.left, (float) rect2.top);
                    } else if (dby instanceof BRV) {
                        matrix.setScale(A022, A022);
                        DBY.A00(matrix, (float) rect2.left, ((float) rect2.top) + ((((float) rect2.height()) - (f5 * A022)) * 0.5f));
                    } else if (dby instanceof BRU) {
                        float min = Math.min(A022, height2);
                        matrix.setScale(min, min);
                        DBY.A00(matrix, (float) rect2.left, (float) rect2.top);
                    } else if (dby instanceof BRT) {
                        float min2 = Math.min(A022, height2);
                        matrix.setScale(min2, min2);
                        DBY.A00(matrix, ((float) rect2.left) + (BE6.A02(rect2) - (f4 * min2)), ((float) rect2.top) + (((float) rect2.height()) - (f5 * min2)));
                    } else if (dby instanceof BRS) {
                        float min3 = Math.min(A022, height2);
                        matrix.setScale(min3, min3);
                        DBY.A00(matrix, ((float) rect2.left) + ((BE6.A02(rect2) - (f4 * min3)) * 0.5f), ((float) rect2.top) + ((((float) rect2.height()) - (f5 * min3)) * 0.5f));
                    } else if (dby instanceof BRR) {
                        float min4 = Math.min(A022, height2);
                        matrix.setScale(min4, min4);
                        DBY.A00(matrix, (float) rect2.left, ((float) rect2.top) + (((float) rect2.height()) - (f5 * min4)));
                    } else if (dby instanceof BRQ) {
                        float min5 = Math.min(Math.min(A022, height2), 1.0f);
                        matrix.setScale(min5, min5);
                        DBY.A00(matrix, ((float) rect2.left) + ((BE6.A02(rect2) - (f4 * min5)) * 0.5f), ((float) rect2.top) + ((((float) rect2.height()) - (f5 * min5)) * 0.5f));
                    } else if (dby instanceof BRP) {
                        int i6 = (height2 > A022 ? 1 : (height2 == A022 ? 0 : -1));
                        float f8 = (float) rect2.left;
                        if (i6 > 0) {
                            f8 += (BE6.A02(rect2) - (f4 * height2)) * 0.5f;
                            height = (float) rect2.top;
                            A022 = height2;
                        } else {
                            height = ((((float) rect2.height()) - (f5 * A022)) * 0.5f) + ((float) rect2.top);
                        }
                        matrix.setScale(A022, A022);
                        DBY.A00(matrix, f8, height);
                    } else {
                        matrix.setTranslate((float) ((int) (((float) rect2.left) + (((float) (rect2.width() - i)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect2.top) + (((float) (rect2.height() - i2)) * 0.5f) + 0.5f)));
                    }
                }
                chs.A00 = matrix;
                Paint paint = this.A08;
                paint.setColorFilter(this.A01);
                boolean z2 = c3f4 instanceof C22828BRg;
                if (z2) {
                    i3 = 6;
                } else {
                    i3 = 1;
                }
                paint.setFlags(i3);
                Matrix matrix2 = chs.A00;
                C22830BRi bRi = new C22830BRi(new RectF(rect2));
                if (z2) {
                    dqx = new C28069Dqj(((C22828BRg) c3f4).A02, matrix2, paint);
                } else if (c3f4 instanceof C22827BRf) {
                    int i7 = ((C22827BRf) c3f4).A00;
                    int alpha = paint.getAlpha();
                    if (alpha == 0) {
                        i7 &= 16777215;
                    } else if (alpha != 255) {
                        i7 = (i7 & 16777215) | ((((i7 >>> 24) * (alpha + (alpha >> 7))) >> 8) << 24);
                    }
                    paint.setColor(i7);
                    dqx = new C28045DqK(paint, bRi);
                } else if (c3f4 instanceof C22829BRh) {
                    dqx = new C28083Dqx(matrix2, paint, (C22829BRh) c3f4, bRi);
                } else {
                    throw AnonymousClass3MW.A14();
                }
                C22821Di r10 = dqx;
                boolean z3 = c3f4 instanceof C22829BRh;
                if (z3) {
                    i4 = ((C22829BRh) c3f4).A01;
                } else {
                    if (z2) {
                        i4 = ((C22828BRg) c3f4).A01;
                    }
                    dr6 = new C28092Dr6(rect2, rectF, r10);
                }
                if (i4 > 0) {
                    if (z3) {
                        i5 = ((C22829BRh) c3f4).A00;
                    } else if (z2) {
                        i5 = ((C22828BRg) c3f4).A00;
                    }
                    if (i5 > 0) {
                        rectF = new RectF(0.0f, 0.0f, (float) i4, (float) i5);
                        if (matrix2 != null) {
                            matrix2.mapRect(rectF);
                        }
                    }
                }
                dr6 = new C28092Dr6(rect2, rectF, r10);
            }
            this.A04 = dr6;
        }
    }

    public final void A02(boolean z) {
        ValueAnimator valueAnimator;
        this.A09.A01 = null;
        C3F c3f = this.A03;
        if (c3f != null) {
            if (c3f instanceof C22826BRe) {
                C22826BRe bRe = (C22826BRe) c3f;
                if (bRe.A01) {
                    bRe.A00.stop();
                }
            }
            if (c3f instanceof C22829BRh) {
                ((C22829BRh) c3f).A02.setCallback((Drawable.Callback) null);
            }
        }
        this.A03 = null;
        this.A04 = null;
        this.A02 = null;
        this.A08.reset();
        this.A01 = null;
        if (z && (valueAnimator = this.A00) != null) {
            valueAnimator.end();
        }
        this.A00 = null;
    }

    public C25809CmM(C18090vk r3, C18090vk r4) {
        this.A05 = r3;
        this.A06 = r4;
        this.A09 = new C25554Chs((CNE) null);
        this.A08 = AnonymousClass3MW.A06();
        this.A07 = new C26323Cxg(this, 4);
    }

    public C25809CmM() {
        this((C18090vk) null, (C18090vk) null);
    }
}
