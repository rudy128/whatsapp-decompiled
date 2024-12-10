package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;

/* renamed from: X.77s  reason: invalid class name and case insensitive filesystem */
public final class C1419877s implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, AnonymousClass87R {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05 = 1;
    public Matrix A06;
    public View.OnClickListener A07;
    public C70743Ci A08;
    public C146727Qj A09;
    public AnonymousClass7QI A0A;
    public AnonymousClass7QJ A0B;
    public boolean A0C;
    public boolean A0D = true;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Matrix A0I = C108945cZ.A0J();
    public final Matrix A0J = C108945cZ.A0J();
    public final RectF A0K = AnonymousClass3MW.A08();
    public final RectF A0L = AnonymousClass3MW.A08();
    public final View A0M;
    public final C133386of A0N;
    public final RectF A0O = AnonymousClass3MW.A08();

    public C1419877s(View view, C133386of r4) {
        this.A0M = view;
        this.A0N = r4;
        View view2 = this.A0M;
        this.A09 = new C146727Qj(view2, this);
        this.A0B = new AnonymousClass7QJ(view2, this);
        this.A0A = new AnonymousClass7QI(view2, this);
        this.A08 = new C70743Ci(view2, this);
    }

    public static void A00(ImagePreviewContentLayout imagePreviewContentLayout) {
        C1419877s r0 = new C1419877s(imagePreviewContentLayout, new C133386of(imagePreviewContentLayout));
        r0.A0F = true;
        imagePreviewContentLayout.A02 = r0;
        LayoutInflater.from(imagePreviewContentLayout.getContext()).inflate(2131625575, imagePreviewContentLayout, true);
        imagePreviewContentLayout.setWillNotDraw(false);
    }

    public static final void A02(C1419877s r5, float f, float f2, float f3) {
        float A042 = AnonymousClass000.A04(C28851b7.A06(Float.valueOf(f), new C71123Dw(r5.A01 * 0.8f, r5.A00)));
        float f4 = A042 / r5.A04;
        Matrix matrix = r5.A0I;
        matrix.postScale(f4, f4, f2, f3);
        r5.A04 = A042;
        A03(r5, true);
        C133386of r2 = r5.A0N;
        r2.A00(matrix);
        r2.A01(C108975cc.A1A((r5.A04 > r5.A01 ? 1 : (r5.A04 == r5.A01 ? 0 : -1))));
    }

    public boolean Boz() {
        return true;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        float x;
        float y;
        boolean z = false;
        C18070vi.A0d(motionEvent, 0);
        boolean z2 = false;
        if (this.A0F) {
            if (!this.A0G) {
                float f = this.A04;
                float f2 = this.A01;
                float f3 = f2;
                if (f == f2) {
                    f3 = 2.0f * f2;
                }
                float f4 = f2;
                if (f2 < f3) {
                    f4 = f3;
                }
                float f5 = this.A00;
                if (f5 > f4) {
                    f5 = f4;
                }
                int i = (f5 > f2 ? 1 : (f5 == f2 ? 0 : -1));
                C146727Qj r6 = this.A09;
                if (i == 0) {
                    if (r6 != null) {
                        View view = this.A0M;
                        x = C108955ca.A00(view);
                        y = (float) C108945cZ.A06(view);
                    }
                } else if (r6 != null) {
                    x = motionEvent.getX();
                    y = motionEvent.getY();
                }
                r6.A00(f, f5, x, y, 200);
            }
            this.A0G = false;
            C133386of r2 = this.A0N;
            z = true;
            if (this.A04 == this.A01) {
                z2 = true;
            }
            r2.A01(!z2);
        }
        return z;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C18070vi.A0d(scaleGestureDetector, 0);
        if (this.A0F) {
            this.A0H = false;
            A02(this, this.A04 * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C18070vi.A0d(motionEvent2, 1);
        if (this.A0F && motionEvent2.getPointerCount() >= this.A05) {
            A04(this, -f, -f2);
        }
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public static final void A01(C1419877s r13) {
        if (r13.A0C) {
            RectF rectF = r13.A0K;
            float width = rectF.width();
            float height = rectF.height();
            View view = r13.A0M;
            float A032 = (float) C108995ce.A03(view);
            float A042 = (float) C72473Md.A04(view);
            r13.A02 = 0.0f;
            Matrix matrix = r13.A0I;
            matrix.reset();
            r13.A0L.set(0.0f, 0.0f, A032, A042);
            float f = r13.A01;
            if (f == 0.0f) {
                f = A032 / width;
                float f2 = A042 / height;
                if (f > f2) {
                    f = f2;
                }
                r13.A01 = f;
            }
            if (f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            r13.A01 = f;
            float f3 = f;
            float f4 = A032 / width;
            float f5 = A042 / height;
            if (C108945cZ.A00(f4 / f5, 1.0f) < 0.0f) {
                float f6 = f4;
                if (f4 < f5) {
                    f6 = f5;
                }
                r13.A02 = f;
            }
            r13.A04 = Math.min(f, Float.MAX_VALUE);
            float f7 = r13.A02;
            if (f7 > Float.MAX_VALUE) {
                f7 = Float.MAX_VALUE;
            }
            r13.A02 = f7;
            float f8 = f3 * 8.0f;
            if (f8 < 8.0f) {
                f8 = 8.0f;
            }
            r13.A00 = f8;
            float f9 = width / 2.0f;
            float f10 = height / 2.0f;
            matrix.setTranslate((A032 / 2.0f) - f9, (A042 / 2.0f) - f10);
            float f11 = r13.A04;
            matrix.preScale(f11, f11, f9, f10);
            r13.A03 = r13.A04;
            r13.A0J.set(matrix);
            r13.A06 = matrix;
            r13.A0N.A00(matrix);
        }
    }

    public static final void A03(C1419877s r9, boolean z) {
        float f;
        RectF rectF = r9.A0O;
        rectF.set(r9.A0K);
        Matrix matrix = r9.A0I;
        matrix.mapRect(rectF);
        View view = r9.A0M;
        float A032 = C108945cZ.A03(view);
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = 0.0f;
        float f5 = A032 - 0.0f;
        if (f3 - f2 < f5) {
            f = ((f5 - (f3 + f2)) / 2.0f) + 0.0f;
        } else if (f2 > 0.0f) {
            f = 0.0f - f2;
        } else if (f3 < A032) {
            f = A032 - f3;
        } else {
            f = 0.0f;
        }
        float A042 = C108945cZ.A04(view);
        float f6 = rectF.top;
        float f7 = rectF.bottom;
        float f8 = A042 - 0.0f;
        if (f7 - f6 < f8) {
            f4 = 0.0f + ((f8 - (f7 + f6)) / 2.0f);
        } else if (f6 > 0.0f) {
            f4 = 0.0f - f6;
        } else if (f7 < A042) {
            f4 = A042 - f7;
        }
        if ((Math.abs(f) > 20.0f || Math.abs(f4) > 20.0f) && !z) {
            AnonymousClass7QI r3 = r9.A0A;
            if (r3 != null && !r3.A03) {
                r3.A02 = -1;
                r3.A00 = f;
                r3.A01 = f4;
                r3.A04 = false;
                r3.A03 = true;
                r3.A05.postDelayed(r3, 250);
                return;
            }
            return;
        }
        matrix.postTranslate(f, f4);
        r9.A0N.A00(matrix);
    }

    public static final boolean A04(C1419877s r9, float f, float f2) {
        float f3;
        float f4;
        RectF rectF = r9.A0O;
        rectF.set(r9.A0K);
        Matrix matrix = r9.A0I;
        matrix.mapRect(rectF);
        View view = r9.A0M;
        float A032 = C108945cZ.A03(view);
        float f5 = rectF.left;
        float f6 = rectF.right;
        float f7 = A032 - 0.0f;
        if (f6 - f5 < f7) {
            f3 = ((f7 - (f6 + f5)) / 2.0f) + 0.0f;
        } else {
            float f8 = A032 - f6;
            float f9 = 0.0f - f5;
            if (f9 > f) {
                f9 = f;
            }
            if (f8 < f9) {
                f8 = f9;
            }
            f3 = f8;
        }
        float A042 = C108945cZ.A04(view);
        float f10 = rectF.top;
        float f11 = rectF.bottom;
        float f12 = A042 - 0.0f;
        if (f11 - f10 < f12) {
            f4 = ((f12 - (f11 + f10)) / 2.0f) + 0.0f;
        } else {
            float f13 = A042 - f11;
            float f14 = 0.0f - f10;
            if (f14 > f2) {
                f14 = f2;
            }
            if (f13 < f14) {
                f13 = f14;
            }
            f4 = f13;
        }
        matrix.postTranslate(f3, f4);
        r9.A0N.A00(matrix);
        if (f3 == f && f4 == f2) {
            return true;
        }
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (!this.A0F) {
            return true;
        }
        AnonymousClass7QJ r1 = this.A0B;
        if (r1 != null) {
            r1.A03 = false;
            r1.A04 = true;
        }
        AnonymousClass7QI r12 = this.A0A;
        if (r12 == null) {
            return true;
        }
        r12.A03 = false;
        r12.A04 = true;
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass7QJ r3;
        if (!this.A0F || !this.A0D || (r3 = this.A0B) == null || r3.A03) {
            return true;
        }
        r3.A02 = -1;
        r3.A00 = f;
        r3.A01 = f2;
        r3.A04 = false;
        r3.A03 = true;
        r3.A05.post(r3);
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.A0F) {
            return false;
        }
        C146727Qj r1 = this.A09;
        if (r1 != null) {
            r1.A00 = false;
            r1.A01 = true;
        }
        this.A0H = true;
        this.A0N.A01(C108975cc.A1A((this.A04 > this.A01 ? 1 : (this.A04 == this.A01 ? 0 : -1))));
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C146727Qj r2;
        if (this.A0F && this.A0H) {
            this.A0G = true;
            Matrix matrix = this.A0I;
            matrix.set(this.A0J);
            this.A04 = this.A03;
            this.A0N.A00(matrix);
        }
        float f = this.A04;
        float f2 = this.A01;
        if ((f < f2 || (this.A0E && f > f2)) && (r2 = this.A09) != null) {
            View view = this.A0M;
            r2.A00(f, f2, C108945cZ.A03(view) / 2.0f, C108945cZ.A04(view) / 2.0f, 100);
        }
        this.A0N.A01(C108975cc.A1A((this.A04 > this.A01 ? 1 : (this.A04 == this.A01 ? 0 : -1))));
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        View.OnClickListener onClickListener = this.A07;
        if (onClickListener != null && !this.A0H) {
            onClickListener.onClick(this.A0M);
        }
        this.A0H = false;
        return true;
    }
}
