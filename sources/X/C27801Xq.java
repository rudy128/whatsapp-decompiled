package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* renamed from: X.1Xq  reason: invalid class name and case insensitive filesystem */
public class C27801Xq extends Drawable implements AnonymousClass1Xp, C24271Jn {
    public static final Paint A0N;
    public int A00;
    public C28131Yz A01;
    public C28011Ym A02;
    public boolean A03;
    public boolean A04;
    public PorterDuffColorFilter A05;
    public PorterDuffColorFilter A06;
    public final Paint A07;
    public final Paint A08;
    public final Path A09;
    public final Path A0A;
    public final RectF A0B;
    public final RectF A0C;
    public final RectF A0D;
    public final AnonymousClass1Z6 A0E;
    public final AnonymousClass1Z4 A0F;
    public final BitSet A0G;
    public final AnonymousClass1Z0[] A0H;
    public final AnonymousClass1Z0[] A0I;
    public final Matrix A0J;
    public final Region A0K;
    public final Region A0L;
    public final AnonymousClass1Z1 A0M;

    static {
        Paint paint = new Paint(1);
        A0N = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public void A0B() {
        C28131Yz r1 = this.A01;
        if (r1.A07 != 2) {
            r1.A07 = 2;
            super.invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void invalidateSelf() {
        this.A03 = true;
        super.invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        this.A03 = true;
        super.onBoundsChange(rect);
    }

    private float A00() {
        Paint.Style style = this.A01.A0G;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.STROKE) {
            return 0.0f;
        }
        Paint paint = this.A08;
        if (paint.getStrokeWidth() > 0.0f) {
            return paint.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void A01(Canvas canvas) {
        if (this.A0G.cardinality() > 0) {
            Log.w("MaterialShapeDrawable", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.A01.A08 != 0) {
            canvas.drawPath(this.A09, this.A0M.A05);
        }
        int i = 0;
        do {
            AnonymousClass1Z0 r1 = this.A0H[i];
            AnonymousClass1Z1 r3 = this.A0M;
            int i2 = this.A01.A09;
            Matrix matrix = AnonymousClass1Z0.A01;
            r1.A00(canvas, matrix, r3, i2);
            this.A0I[i].A00(canvas, matrix, r3, this.A01.A09);
            i++;
        } while (i < 4);
        if (this.A04) {
            C28131Yz r12 = this.A01;
            double d = (double) r12.A08;
            double radians = Math.toRadians((double) r12.A0A);
            int sin = (int) (d * Math.sin(radians));
            int cos = (int) (d * Math.cos(radians));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(this.A09, A0N);
            canvas.translate((float) sin, (float) cos);
        }
    }

    private void A02(Path path, RectF rectF) {
        AnonymousClass1Z4 r4 = this.A0F;
        C28131Yz r0 = this.A01;
        Path path2 = path;
        RectF rectF2 = rectF;
        r4.A01(path2, rectF2, r0.A0K, this.A0E, r0.A01);
        if (this.A01.A03 != 1.0f) {
            Matrix matrix = this.A0J;
            matrix.reset();
            float f = this.A01.A03;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.A0C, true);
    }

    public static void A03(C27801Xq r5) {
        C28131Yz r4 = r5.A01;
        float f = r4.A00 + r4.A05;
        r4.A09 = (int) Math.ceil((double) (0.75f * f));
        r4.A08 = (int) Math.ceil((double) (f * 0.25f));
        r5.A04();
        super.invalidateSelf();
    }

    private boolean A04() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2;
        PorterDuffColorFilter porterDuffColorFilter3 = this.A06;
        PorterDuffColorFilter porterDuffColorFilter4 = this.A05;
        C28131Yz r0 = this.A01;
        ColorStateList colorStateList = r0.A0E;
        PorterDuff.Mode mode = r0.A0H;
        Paint paint = this.A07;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int A092 = A09(color);
            this.A00 = A092;
            if (A092 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(A092, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        } else {
            int A093 = A09(colorStateList.getColorForState(getState(), 0));
            this.A00 = A093;
            porterDuffColorFilter = new PorterDuffColorFilter(A093, mode);
        }
        this.A06 = porterDuffColorFilter;
        C28131Yz r02 = this.A01;
        ColorStateList colorStateList2 = r02.A0D;
        PorterDuff.Mode mode2 = r02.A0H;
        if (colorStateList2 == null || mode2 == null) {
            porterDuffColorFilter2 = null;
        } else {
            int colorForState = colorStateList2.getColorForState(getState(), 0);
            this.A00 = colorForState;
            porterDuffColorFilter2 = new PorterDuffColorFilter(colorForState, mode2);
        }
        this.A05 = porterDuffColorFilter2;
        C28131Yz r1 = this.A01;
        if (r1.A0L) {
            this.A0M.A00(r1.A0E.getColorForState(getState(), 0));
        }
        if (!AnonymousClass026.A00(porterDuffColorFilter3, this.A06) || !AnonymousClass026.A00(porterDuffColorFilter4, this.A05)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r2 = r5.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r2 = r5.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A05(int[] r6) {
        /*
            r5 = this;
            X.1Yz r0 = r5.A01
            android.content.res.ColorStateList r0 = r0.A0B
            r4 = 1
            if (r0 == 0) goto L_0x0035
            android.graphics.Paint r2 = r5.A07
            int r1 = r2.getColor()
            X.1Yz r0 = r5.A01
            android.content.res.ColorStateList r0 = r0.A0B
            int r0 = r0.getColorForState(r6, r1)
            if (r1 == r0) goto L_0x0035
            r2.setColor(r0)
            r3 = 1
        L_0x001b:
            X.1Yz r0 = r5.A01
            android.content.res.ColorStateList r0 = r0.A0C
            if (r0 == 0) goto L_0x0037
            android.graphics.Paint r2 = r5.A08
            int r1 = r2.getColor()
            X.1Yz r0 = r5.A01
            android.content.res.ColorStateList r0 = r0.A0C
            int r0 = r0.getColorForState(r6, r1)
            if (r1 == r0) goto L_0x0037
            r2.setColor(r0)
            return r4
        L_0x0035:
            r3 = 0
            goto L_0x001b
        L_0x0037:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27801Xq.A05(int[]):boolean");
    }

    public float A08() {
        C28021Yn r2 = this.A01.A0K.A02;
        RectF rectF = this.A0D;
        rectF.set(getBounds());
        return r2.BPT(rectF);
    }

    public int A09(int i) {
        C28131Yz r2 = this.A01;
        float f = r2.A00 + r2.A05 + r2.A02;
        AnonymousClass1Z8 r0 = r2.A0J;
        if (r0 != null) {
            return r0.A00(i, f);
        }
        return i;
    }

    public void A0C(float f) {
        C28131Yz r1 = this.A01;
        if (r1.A00 != f) {
            r1.A00 = f;
            A03(this);
        }
    }

    public void A0D(float f) {
        C28131Yz r1 = this.A01;
        if (r1.A01 != f) {
            r1.A01 = f;
            this.A03 = true;
            invalidateSelf();
        }
    }

    public void A0E(Context context) {
        this.A01.A0J = new AnonymousClass1Z8(context);
        A03(this);
    }

    public void A0F(ColorStateList colorStateList) {
        C28131Yz r1 = this.A01;
        if (r1.A0B != colorStateList) {
            r1.A0B = colorStateList;
            onStateChange(getState());
        }
    }

    public void A0G(ColorStateList colorStateList) {
        C28131Yz r1 = this.A01;
        if (r1.A0C != colorStateList) {
            r1.A0C = colorStateList;
            onStateChange(getState());
        }
    }

    public void A0H(ColorStateList colorStateList, float f) {
        this.A01.A04 = f;
        invalidateSelf();
        A0G(colorStateList);
    }

    public void A0I(Canvas canvas) {
        Paint paint = this.A08;
        Path path = this.A0A;
        C28011Ym r3 = this.A02;
        RectF rectF = this.A0B;
        RectF rectF2 = this.A0D;
        rectF2.set(getBounds());
        rectF.set(rectF2);
        float A002 = A00();
        rectF.inset(A002, A002);
        if (r3.A04(rectF)) {
            float BPT = r3.A03.BPT(rectF) * this.A01.A01;
            canvas.drawRoundRect(rectF, BPT, BPT, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public boolean A0J() {
        C28011Ym r2 = this.A01.A0K;
        RectF rectF = this.A0D;
        rectF.set(getBounds());
        return r2.A04(rectF);
    }

    public void draw(Canvas canvas) {
        Paint paint = this.A07;
        paint.setColorFilter(this.A06);
        int alpha = paint.getAlpha();
        int i = this.A01.A06;
        paint.setAlpha((alpha * (i + (i >>> 7))) >>> 8);
        Paint paint2 = this.A08;
        paint2.setColorFilter(this.A05);
        paint2.setStrokeWidth(this.A01.A04);
        int alpha2 = paint2.getAlpha();
        int i2 = this.A01.A06;
        paint2.setAlpha((alpha2 * (i2 + (i2 >>> 7))) >>> 8);
        if (this.A03) {
            float f = -A00();
            C28131Yz r2 = this.A01;
            C28011Ym r9 = r2.A0K;
            C28041Yp r3 = new C28041Yp(r9);
            C28021Yn r1 = r9.A02;
            if (!(r1 instanceof C28031Yo)) {
                r1 = new AnonymousClass25U(r1, f);
            }
            r3.A02 = r1;
            C28021Yn r12 = r9.A03;
            if (!(r12 instanceof C28031Yo)) {
                r12 = new AnonymousClass25U(r12, f);
            }
            r3.A03 = r12;
            C28021Yn r13 = r9.A00;
            if (!(r13 instanceof C28031Yo)) {
                r13 = new AnonymousClass25U(r13, f);
            }
            r3.A00 = r13;
            C28021Yn r14 = r9.A01;
            if (!(r14 instanceof C28031Yo)) {
                r14 = new AnonymousClass25U(r14, f);
            }
            r3.A01 = r14;
            C28011Ym r11 = new C28011Ym(r3);
            this.A02 = r11;
            AnonymousClass1Z4 r8 = this.A0F;
            float f2 = r2.A01;
            RectF rectF = this.A0B;
            RectF rectF2 = this.A0D;
            rectF2.set(getBounds());
            rectF.set(rectF2);
            float A002 = A00();
            rectF.inset(A002, A002);
            r8.A01(this.A0A, rectF, r11, (AnonymousClass1Z6) null, f2);
            rectF2.set(getBounds());
            A02(this.A09, rectF2);
            this.A03 = false;
        }
        C28131Yz r22 = this.A01;
        int i3 = r22.A07;
        if (i3 != 1 && r22.A09 > 0 && (i3 == 2 || (!A0J() && !this.A09.isConvex() && Build.VERSION.SDK_INT < 29))) {
            canvas.save();
            C28131Yz r15 = this.A01;
            double d = (double) r15.A08;
            double radians = Math.toRadians((double) r15.A0A);
            canvas.translate((float) ((int) (d * Math.sin(radians))), (float) ((int) (d * Math.cos(radians))));
            if (!this.A04) {
                A01(canvas);
            } else {
                RectF rectF3 = this.A0C;
                int width = (int) (rectF3.width() - ((float) getBounds().width()));
                int height = (int) (rectF3.height() - ((float) getBounds().height()));
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap createBitmap = Bitmap.createBitmap(((int) rectF3.width()) + (this.A01.A09 * 2) + width, ((int) rectF3.height()) + (this.A01.A09 * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f3 = (float) ((getBounds().left - this.A01.A09) - width);
                float f4 = (float) ((getBounds().top - this.A01.A09) - height);
                canvas2.translate(-f3, -f4);
                A01(canvas2);
                canvas.drawBitmap(createBitmap, f3, f4, (Paint) null);
                createBitmap.recycle();
            }
            canvas.restore();
        }
        C28131Yz r23 = this.A01;
        Paint.Style style = r23.A0G;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            Path path = this.A09;
            C28011Ym r16 = r23.A0K;
            RectF rectF4 = this.A0D;
            rectF4.set(getBounds());
            if (r16.A04(rectF4)) {
                float BPT = r16.A03.BPT(rectF4) * this.A01.A01;
                canvas.drawRoundRect(rectF4, BPT, BPT, paint);
            } else {
                canvas.drawPath(path, paint);
            }
        }
        Paint.Style style2 = this.A01.A0G;
        if ((style2 == Paint.Style.FILL_AND_STROKE || style2 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
            A0I(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public int getAlpha() {
        return this.A01.A06;
    }

    public void getOutline(Outline outline) {
        if (this.A01.A07 == 2) {
            return;
        }
        if (A0J()) {
            outline.setRoundRect(getBounds(), A08() * this.A01.A01);
            return;
        }
        RectF rectF = this.A0D;
        rectF.set(getBounds());
        Path path = this.A09;
        A02(path, rectF);
        AnonymousClass2SY.A00(outline, path);
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.A01.A0I;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1Yz, android.graphics.drawable.Drawable$ConstantState] */
    public Drawable mutate() {
        C28131Yz r1 = this.A01;
        ? constantState = new Drawable.ConstantState();
        constantState.A0B = null;
        constantState.A0C = null;
        constantState.A0D = null;
        constantState.A0E = null;
        constantState.A0H = PorterDuff.Mode.SRC_IN;
        constantState.A0I = null;
        constantState.A03 = 1.0f;
        constantState.A01 = 1.0f;
        constantState.A06 = 255;
        constantState.A02 = 0.0f;
        constantState.A00 = 0.0f;
        constantState.A05 = 0.0f;
        constantState.A07 = 0;
        constantState.A09 = 0;
        constantState.A08 = 0;
        constantState.A0A = 0;
        constantState.A0L = false;
        constantState.A0G = Paint.Style.FILL_AND_STROKE;
        constantState.A0K = r1.A0K;
        constantState.A0J = r1.A0J;
        constantState.A04 = r1.A04;
        constantState.A0F = r1.A0F;
        constantState.A0B = r1.A0B;
        constantState.A0C = r1.A0C;
        constantState.A0H = r1.A0H;
        constantState.A0E = r1.A0E;
        constantState.A06 = r1.A06;
        constantState.A03 = r1.A03;
        constantState.A08 = r1.A08;
        constantState.A07 = r1.A07;
        constantState.A0L = r1.A0L;
        constantState.A01 = r1.A01;
        constantState.A02 = r1.A02;
        constantState.A00 = r1.A00;
        constantState.A05 = r1.A05;
        constantState.A09 = r1.A09;
        constantState.A0A = r1.A0A;
        constantState.A0D = r1.A0D;
        constantState.A0G = r1.A0G;
        Rect rect = r1.A0I;
        if (rect != null) {
            constantState.A0I = new Rect(rect);
        }
        this.A01 = constantState;
        return this;
    }

    public void setAlpha(int i) {
        C28131Yz r1 = this.A01;
        if (r1.A06 != i) {
            r1.A06 = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.A0F = colorFilter;
        super.invalidateSelf();
    }

    public void setShapeAppearanceModel(C28011Ym r2) {
        this.A01.A0K = r2;
        invalidateSelf();
    }

    public void setTintList(ColorStateList colorStateList) {
        this.A01.A0E = colorStateList;
        A04();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C28131Yz r1 = this.A01;
        if (r1.A0H != mode) {
            r1.A0H = mode;
            A04();
            super.invalidateSelf();
        }
    }

    public C27801Xq(C28131Yz r6) {
        AnonymousClass1Z4 r0;
        this.A0H = new AnonymousClass1Z0[4];
        this.A0I = new AnonymousClass1Z0[4];
        this.A0G = new BitSet(8);
        this.A0J = new Matrix();
        this.A09 = new Path();
        this.A0A = new Path();
        this.A0D = new RectF();
        this.A0B = new RectF();
        this.A0L = new Region();
        this.A0K = new Region();
        Paint paint = new Paint(1);
        this.A07 = paint;
        Paint paint2 = new Paint(1);
        this.A08 = paint2;
        this.A0M = new AnonymousClass1Z1();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            r0 = AnonymousClass1Z3.A00;
        } else {
            r0 = new AnonymousClass1Z4();
        }
        this.A0F = r0;
        this.A0C = new RectF();
        this.A04 = true;
        this.A01 = r6;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        A04();
        A05(getState());
        this.A0E = new AnonymousClass1Z7(this);
    }

    public void A0A() {
        this.A0M.A00(-12303292);
        this.A01.A0L = false;
        super.invalidateSelf();
    }

    public Drawable.ConstantState getConstantState() {
        return this.A01;
    }

    public Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.A0L;
        region.set(bounds);
        RectF rectF = this.A0D;
        rectF.set(getBounds());
        Path path = this.A09;
        A02(path, rectF);
        Region region2 = this.A0K;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.A01.A0E;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.A01.A0D;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.A01.A0C;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.A01.A0B;
        if (colorStateList4 == null || !colorStateList4.isStateful()) {
            return false;
        }
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        boolean A052 = A05(iArr);
        boolean A042 = A04();
        if (!A052 && !A042) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1Yz, android.graphics.drawable.Drawable$ConstantState] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27801Xq(X.C28011Ym r4) {
        /*
            r3 = this;
            r2 = 0
            X.1Yz r1 = new X.1Yz
            r1.<init>()
            r1.A0B = r2
            r1.A0C = r2
            r1.A0D = r2
            r1.A0E = r2
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.A0H = r0
            r1.A0I = r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A03 = r0
            r1.A01 = r0
            r0 = 255(0xff, float:3.57E-43)
            r1.A06 = r0
            r0 = 0
            r1.A02 = r0
            r1.A00 = r0
            r1.A05 = r0
            r0 = 0
            r1.A07 = r0
            r1.A09 = r0
            r1.A08 = r0
            r1.A0A = r0
            r1.A0L = r0
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r1.A0G = r0
            r1.A0K = r4
            r1.A0J = r2
            r3.<init>((X.C28131Yz) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27801Xq.<init>(X.1Ym):void");
    }

    public C27801Xq(Context context, AttributeSet attributeSet, int i, int i2) {
        this(new C28011Ym(C28011Ym.A01(context, attributeSet, i, i2)));
    }

    public C27801Xq() {
        this(new C28011Ym());
    }
}
