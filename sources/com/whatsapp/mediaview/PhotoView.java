package com.whatsapp.mediaview;

import X.AnonymousClass000;
import X.AnonymousClass6AA;
import X.AnonymousClass780;
import X.AnonymousClass7NG;
import X.AnonymousClass7R4;
import X.AnonymousClass85S;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108985cd;
import X.C108995ce;
import X.C109815e3;
import X.C110775h4;
import X.C1406872o;
import X.C144927Jf;
import X.C146577Ps;
import X.C146717Qi;
import X.C72473Md;
import X.CIZ;
import X.DTY;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.InteractiveAnnotation;

public class PhotoView extends C110775h4 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public Matrix A0A;
    public Matrix A0B;
    public Paint A0C;
    public PointF A0D;
    public Rect A0E;
    public RectF A0F;
    public RectF A0G;
    public RectF A0H;
    public BitmapDrawable A0I;
    public Drawable A0J;
    public View.OnClickListener A0K;
    public AnonymousClass85S A0L;
    public C146717Qi A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public Matrix A0Q;
    public ScaleGestureDetector A0R;
    public CIZ A0S;
    public DTY A0T;
    public AnonymousClass7R4 A0U;
    public AnonymousClass7R4 A0V;
    public C146577Ps A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final Runnable A0a;

    public static void A04(PhotoView photoView, float f, float f2, float f3) {
        float min = Math.min(Math.max(f, photoView.A04 * photoView.A08), photoView.A03);
        float f4 = min / photoView.A00;
        Matrix matrix = photoView.A0A;
        matrix.postRotate(-photoView.A07, C108955ca.A00(photoView), (float) C108945cZ.A06(photoView));
        matrix.postScale(f4, f4, f2, f3);
        photoView.A00 = min;
        matrix.postRotate(photoView.A07, C108955ca.A00(photoView), (float) C108945cZ.A06(photoView));
        A06(photoView, true);
        photoView.setImageMatrix(matrix);
    }

    public void A09() {
        this.A0S = null;
        this.A0R = null;
        this.A0I = null;
        setImageDrawable((Drawable) null);
        C146717Qi r1 = this.A0M;
        if (r1 != null) {
            r1.A00 = false;
            r1.A01 = true;
        }
        this.A0M = null;
        AnonymousClass7R4 r0 = this.A0V;
        if (r0 != null) {
            AnonymousClass7R4.A00(r0);
        }
        this.A0V = null;
        AnonymousClass7R4 r02 = this.A0U;
        if (r02 != null) {
            AnonymousClass7R4.A00(r02);
        }
        this.A0U = null;
        C146577Ps r03 = this.A0W;
        if (r03 != null) {
            r03.A00 = true;
            PhotoView photoView = r03.A03;
            photoView.A07 = (float) Math.round(photoView.A07);
            A05(photoView, true);
            photoView.requestLayout();
            photoView.invalidate();
        }
        this.A0W = null;
        DTY dty = this.A0T;
        if (dty != null) {
            dty.A01 = true;
        }
        this.A0T = null;
        this.A0K = null;
        this.A0K = null;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public static void A02(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                A02(viewGroup.getChildAt(i));
            }
        } else if (view instanceof PhotoView) {
            ((PhotoView) view).A09();
        }
    }

    public static void A03(PhotoView photoView, float f, float f2) {
        View.OnClickListener onClickListener = photoView.A0K;
        if (onClickListener == null) {
            return;
        }
        if (onClickListener instanceof AnonymousClass780) {
            AnonymousClass6AA r8 = (AnonymousClass6AA) ((AnonymousClass780) onClickListener);
            AnonymousClass7NG r7 = r8.A00;
            PhotoView photoView2 = (PhotoView) r7.A02;
            Bitmap photo = photoView2.getPhoto();
            if (photo != null) {
                Matrix A0J2 = C108945cZ.A0J();
                photoView2.getImageMatrix().invert(A0J2);
                float[] fArr = {f, f2};
                float[] fArr2 = {(float) photo.getWidth(), (float) photo.getHeight()};
                A0J2.mapPoints(fArr);
                MediaViewFragment mediaViewFragment = (MediaViewFragment) r7.A01;
                InteractiveAnnotation A002 = C1406872o.A00(mediaViewFragment.A0e, r8.A01, fArr, fArr2, false);
                if (A002 != null) {
                    MediaViewFragment.A0A(A002, mediaViewFragment, photoView2);
                    return;
                }
            }
            MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) r7.A01;
            mediaViewBaseFragment.A2L(!mediaViewBaseFragment.A0I, true);
            return;
        }
        onClickListener.onClick(photoView);
    }

    public static void A05(PhotoView photoView, boolean z) {
        float f;
        float f2;
        float min;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        BitmapDrawable bitmapDrawable = photoView.A0I;
        if (bitmapDrawable != null && photoView.A0Y) {
            photoView.A0I.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), photoView.A0I.getIntrinsicHeight());
            if (z || (photoView.A04 == 0.0f && photoView.A0I != null && photoView.A0Y)) {
                float intrinsicWidth = (float) photoView.A0I.getIntrinsicWidth();
                float intrinsicHeight = (float) photoView.A0I.getIntrinsicHeight();
                float A032 = (float) C108995ce.A03(photoView);
                float A042 = (float) C72473Md.A04(photoView);
                photoView.A05 = 0.0f;
                Matrix matrix = photoView.A0A;
                matrix.reset();
                photoView.A0G.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                photoView.A0F.set(0.0f, 0.0f, A032, A042);
                float f9 = intrinsicWidth / 2.0f;
                float f10 = intrinsicHeight / 2.0f;
                matrix.setTranslate((A032 / 2.0f) - f9, (A042 / 2.0f) - f10);
                boolean z2 = photoView.A0N;
                float abs = Math.abs(photoView.A07 % 180.0f);
                int i = (abs > 90.0f ? 1 : (abs == 90.0f ? 0 : -1));
                if (z2) {
                    if (i == 0) {
                        f7 = A032 / intrinsicHeight;
                        f8 = A042 / intrinsicWidth;
                    } else {
                        f7 = A032 / intrinsicWidth;
                        f8 = A042 / intrinsicHeight;
                    }
                    min = Math.max(f7, f8);
                } else {
                    if (i == 0) {
                        f = A032 / intrinsicHeight;
                        f2 = A042 / intrinsicWidth;
                    } else {
                        f = A032 / intrinsicWidth;
                        f2 = A042 / intrinsicHeight;
                    }
                    min = Math.min(f, f2);
                }
                photoView.A04 = min;
                float f11 = photoView.A02;
                float min2 = Math.min(min, f11);
                photoView.A04 = min2;
                int i2 = photoView.A09;
                if (i2 == 3) {
                    if (abs == 90.0f) {
                        f5 = A032 / intrinsicHeight;
                        f6 = A042 / intrinsicWidth;
                    } else {
                        f5 = A032 / intrinsicWidth;
                        f6 = A042 / intrinsicHeight;
                    }
                    min2 = Math.max(f5, f6);
                } else if (i2 == 1) {
                    if (abs == 90.0f) {
                        min2 = A032 / intrinsicHeight;
                    } else {
                        min2 = A032 / intrinsicWidth;
                    }
                } else if (i2 == 2) {
                    if (abs == 90.0f) {
                        min2 = A042 / intrinsicWidth;
                    } else {
                        min2 = A042 / intrinsicHeight;
                    }
                }
                if (abs == 90.0f) {
                    f3 = A032 / intrinsicHeight;
                    f4 = A042 / intrinsicWidth;
                } else {
                    f3 = A032 / intrinsicWidth;
                    f4 = A042 / intrinsicHeight;
                }
                if (C108945cZ.A00(f3 / f4, 1.0f) < photoView.A01) {
                    min2 = Math.max(f3, f4);
                    photoView.A05 = min2;
                }
                float min3 = Math.min(min2, f11);
                photoView.A00 = min3;
                photoView.A05 = Math.min(photoView.A05, f11);
                matrix.preScale(min3, min3, f9, f10);
                photoView.A03 = Math.max(photoView.A04 * 8.0f, 8.0f);
                matrix.postRotate(photoView.A07, (float) (photoView.getWidth() / 2), (float) (photoView.getHeight() / 2));
                photoView.A06 = photoView.A00;
                photoView.A0B.set(matrix);
            }
            Matrix matrix2 = photoView.A0A;
            photoView.A0Q = matrix2;
            photoView.setImageMatrix(matrix2);
        }
    }

    public static void A06(PhotoView photoView, boolean z) {
        float f;
        RectF rectF = photoView.A0H;
        rectF.set(photoView.A0G);
        Matrix matrix = photoView.A0A;
        matrix.mapRect(rectF);
        float A032 = C108945cZ.A03(photoView);
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
        float A042 = C108945cZ.A04(photoView);
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
            AnonymousClass7R4 r3 = photoView.A0U;
            if (r3 != null && !r3.A03) {
                r3.A02 = -1;
                r3.A00 = f;
                r3.A01 = f4;
                r3.A04 = false;
                r3.A03 = true;
                ((View) r3.A06).postDelayed(r3, 250);
                return;
            }
            return;
        }
        matrix.postTranslate(f, f4);
        photoView.setImageMatrix(matrix);
    }

    public static boolean A07(PhotoView photoView, float f, float f2) {
        float max;
        float max2;
        RectF rectF = photoView.A0H;
        rectF.set(photoView.A0G);
        Matrix matrix = photoView.A0A;
        matrix.mapRect(rectF);
        float A032 = C108945cZ.A03(photoView);
        float f3 = rectF.left;
        float f4 = rectF.right;
        float f5 = A032 - 0.0f;
        if (f4 - f3 < f5) {
            max = ((f5 - (f4 + f3)) / 2.0f) + 0.0f;
        } else {
            max = Math.max(A032 - f4, Math.min(0.0f - f3, f));
        }
        float A042 = C108945cZ.A04(photoView);
        float f6 = rectF.top;
        float f7 = rectF.bottom;
        float f8 = A042 - 0.0f;
        if (f7 - f6 < f8) {
            max2 = ((f8 - (f7 + f6)) / 2.0f) + 0.0f;
        } else {
            max2 = Math.max(A042 - f7, Math.min(0.0f - f6, f2));
        }
        matrix.postTranslate(max, max2);
        photoView.setImageMatrix(matrix);
        if (max == f && max2 == f2) {
            return true;
        }
        return false;
    }

    public Bitmap A08(Drawable drawable) {
        if (!this.A0N) {
            return null;
        }
        BitmapDrawable bitmapDrawable = this.A0I;
        if (!(bitmapDrawable == null || drawable == null || drawable == bitmapDrawable)) {
            drawable.setBounds(bitmapDrawable.getBounds());
        }
        Bitmap A0H2 = C108995ce.A0H(this);
        Canvas A0I2 = C108945cZ.A0I(A0H2);
        Matrix matrix = new Matrix(this.A0Q);
        if (drawable != null) {
            A0I2.concat(matrix);
            drawable.draw(A0I2);
        }
        return A0H2;
    }

    public void A0A(Bitmap bitmap) {
        BitmapDrawable A052;
        if (bitmap == null) {
            A052 = null;
        } else {
            A052 = C108965cb.A05(bitmap, this);
        }
        A0B(A052);
    }

    public void A0B(BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2 = this.A0I;
        if (bitmapDrawable != bitmapDrawable2) {
            boolean z = false;
            if (bitmapDrawable2 != null) {
                if (!(bitmapDrawable != null && bitmapDrawable2.getIntrinsicWidth() == bitmapDrawable.getIntrinsicWidth() && this.A0I.getIntrinsicHeight() == bitmapDrawable.getIntrinsicHeight())) {
                    z = true;
                }
                this.A04 = 0.0f;
            }
            this.A0I = bitmapDrawable;
            setImageDrawable(bitmapDrawable);
            A05(this, z);
            invalidate();
        }
    }

    public void A0C(boolean z) {
        this.A0P = z;
        if (!z) {
            Matrix matrix = this.A0A;
            matrix.set(this.A0B);
            this.A00 = this.A06;
            setImageMatrix(matrix);
        }
    }

    public boolean A0D() {
        if (this.A0P) {
            AnonymousClass7R4 r0 = this.A0V;
            if (r0 != null && r0.A03) {
                return true;
            }
            float f = this.A05;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            float f2 = this.A00;
            if (i == 0) {
                if (f2 != this.A04) {
                    return true;
                }
            } else if (f2 > f) {
                return true;
            }
        }
        return false;
    }

    public Bitmap getFullViewCroppedBitmap() {
        return A08(this.A0I);
    }

    public Bitmap getPhoto() {
        BitmapDrawable bitmapDrawable = this.A0I;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getBitmap();
        }
        return null;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        float x;
        float y;
        if (!this.A0O || !this.A0P) {
            return false;
        }
        if (!this.A0X) {
            float f = this.A00;
            float f2 = this.A04;
            float f3 = f2 * 2.0f;
            if (f == f3) {
                f3 = f2;
            }
            float min = Math.min(this.A03, Math.max(f2, f3));
            C146717Qi r4 = this.A0M;
            if (r4 != null) {
                if (min == f2) {
                    x = C108955ca.A00(this);
                    y = (float) C108945cZ.A06(this);
                } else {
                    x = motionEvent.getX();
                    y = motionEvent.getY();
                }
                r4.A00(f, min, x, y, 200);
            }
        }
        this.A0X = false;
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (!this.A0P) {
            return true;
        }
        AnonymousClass7R4 r0 = this.A0V;
        if (r0 != null) {
            AnonymousClass7R4.A00(r0);
        }
        AnonymousClass7R4 r02 = this.A0U;
        if (r02 == null) {
            return true;
        }
        AnonymousClass7R4.A00(r02);
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass7R4 r2;
        if (!this.A0P || (r2 = this.A0V) == null || r2.A03) {
            return true;
        }
        r2.A02 = -1;
        r2.A00 = f;
        r2.A01 = f2;
        r2.A04 = false;
        r2.A03 = true;
        ((View) r2.A06).post(r2);
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        AnonymousClass85S r1 = this.A0L;
        if (r1 != null) {
            C144927Jf r12 = (C144927Jf) r1;
            MediaViewFragment.A09(r12.A02, r12.A01, r12.A00.A01, (int) motionEvent.getY());
        }
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0P) {
            this.A0Z = false;
            A04(this, this.A00 * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.A0P) {
            return false;
        }
        C146717Qi r1 = this.A0M;
        if (r1 != null) {
            r1.A00 = false;
            r1.A01 = true;
        }
        this.A0Z = true;
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C146717Qi r1;
        if (this.A0P && this.A0Z) {
            this.A0X = true;
            Matrix matrix = this.A0A;
            matrix.set(this.A0B);
            this.A00 = this.A06;
            setImageMatrix(matrix);
        }
        float f = this.A00;
        float f2 = this.A04;
        if (f < f2 && (r1 = this.A0M) != null) {
            r1.A00(f, f2, C108955ca.A00(this), (float) C108945cZ.A06(this), 100);
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A0P) {
            return true;
        }
        A07(this, -f, -f2);
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A0K != null && !this.A0Z && this.A0O) {
            A03(this, motionEvent.getX(), motionEvent.getY());
        }
        this.A0Z = false;
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!(this.A0R == null || this.A0S == null)) {
            if (!isEnabled()) {
                return false;
            }
            this.A0R.onTouchEvent(motionEvent);
            this.A0S.A00.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked != 1) {
                if (actionMasked != 3) {
                    return true;
                }
            } else if (this.A0K != null && !this.A0Z && pointerCount == 1 && !this.A0O) {
                C108985cd.A0x(this.A0D, motionEvent);
                post(this.A0a);
            }
            AnonymousClass7R4 r0 = this.A0V;
            if (r0 != null && !r0.A03) {
                A06(this, false);
            }
        }
        return true;
    }

    public void setAllowFullViewCrop(boolean z) {
        if (z != this.A0N) {
            this.A0N = z;
            requestLayout();
            invalidate();
        }
    }

    public void setIsLongpressEnabled(boolean z) {
        CIZ ciz = this.A0S;
        if (ciz != null) {
            ciz.A00.setIsLongpressEnabled(z);
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        C110775h4.A00(this);
        this.A0a = C108945cZ.A0X(this, 24);
        A01();
    }

    private void A01() {
        Context context = getContext();
        this.A0S = C108965cb.A0C(context, this);
        C109815e3 r1 = new C109815e3(context, this, this, getScaledMinScalingSpan());
        this.A0R = r1;
        r1.setQuickScaleEnabled(false);
        this.A0M = new C146717Qi(this);
        this.A0V = new AnonymousClass7R4(this, 1);
        this.A0U = new AnonymousClass7R4(this, 0);
        this.A0W = new C146577Ps(this);
        this.A0T = new DTY(this);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private int getScaledMinScalingSpan() {
        Resources A0Y2 = AnonymousClass000.A0Y(this);
        try {
            return A0Y2.getDimensionPixelSize(A0Y2.getIdentifier("config_minScalingSpan", "dimen", "android"));
        } catch (Resources.NotFoundException unused) {
            return (int) TypedValue.applyDimension(5, 27.0f, A0Y2.getDisplayMetrics());
        }
    }

    public float getMinScale() {
        return this.A04;
    }

    public float getOriginalScale() {
        return this.A06;
    }

    public float getScale() {
        return this.A00;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0I != null && this.A0J != null) {
            int width = (getWidth() - this.A0J.getIntrinsicWidth()) / 2;
            int height = (getHeight() - this.A0J.getIntrinsicHeight()) / 2;
            Drawable drawable = this.A0J;
            drawable.setBounds(width, height, drawable.getIntrinsicWidth() + width, this.A0J.getIntrinsicHeight() + height);
            this.A0J.draw(canvas);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A0Y = true;
        Matrix matrix = this.A0Q;
        if (matrix == null || matrix.equals(getImageMatrix())) {
            A05(this, z);
        }
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.A0O = z;
    }

    public void setInitialFitTolerance(float f) {
        this.A01 = f;
    }

    public void setInitialScaleType(int i) {
        this.A09 = i;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A0K = onClickListener;
    }

    public void setOnLongPressListener(AnonymousClass85S r1) {
        this.A0L = r1;
    }

    public void setOverlay(Drawable drawable) {
        this.A0J = drawable;
    }

    public void setUnderscaleAmount(float f) {
        this.A08 = f;
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C110775h4.A00(this);
        this.A0a = C108945cZ.A0X(this, 24);
        A01();
    }

    public PhotoView(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        C110775h4.A00(this);
        this.A0a = C108945cZ.A0X(this, 24);
        A01();
    }
}
