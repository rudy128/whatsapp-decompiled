package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import java.util.ArrayList;

/* renamed from: X.2tP  reason: invalid class name and case insensitive filesystem */
public class C63612tP {
    public static final Matrix A0G = new Matrix();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public Paint A05;
    public Paint A06;
    public PathMeasure A07;
    public Boolean A08;
    public String A09;
    public int A0A;
    public final Matrix A0B;
    public final Path A0C;
    public final Path A0D;
    public final AnonymousClass00P A0E;
    public final C454428z A0F;

    public static void A00(Canvas canvas, Matrix matrix, C454428z r20, C63612tP r21, int i, int i2) {
        Path.FillType fillType;
        Path.FillType fillType2;
        C454428z r14 = r20;
        Matrix matrix2 = r14.A0B;
        matrix2.set(matrix);
        matrix2.preConcat(r14.A0A);
        Canvas canvas2 = canvas;
        canvas2.save();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = r14.A0C;
            if (i3 < arrayList.size()) {
                AnonymousClass2S6 r5 = (AnonymousClass2S6) arrayList.get(i3);
                C63612tP r9 = r21;
                int i4 = i;
                int i5 = i2;
                if (r5 instanceof C454428z) {
                    Matrix matrix3 = matrix2;
                    A00(canvas2, matrix3, (C454428z) r5, r9, i4, i5);
                } else if (r5 instanceof C454328y) {
                    C454328y r52 = (C454328y) r5;
                    float f = ((float) i4) / r9.A03;
                    float f2 = ((float) i5) / r9.A02;
                    float min = Math.min(f, f2);
                    Matrix matrix4 = r9.A0B;
                    matrix4.set(matrix2);
                    matrix4.postScale(f, f2);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f3 = fArr[0];
                    float f4 = fArr[1];
                    float hypot = (float) Math.hypot((double) f3, (double) f4);
                    float f5 = fArr[2];
                    float f6 = fArr[3];
                    float f7 = (f3 * f6) - (f4 * f5);
                    float max = Math.max(hypot, (float) Math.hypot((double) f5, (double) f6));
                    if (max > 0.0f) {
                        float abs = Math.abs(f7) / max;
                        if (abs != 0.0f) {
                            Path path = r9.A0C;
                            path.reset();
                            C63012sM[] r0 = r52.A03;
                            if (r0 != null) {
                                C63382sy.A01(path, r0);
                            }
                            Path path2 = r9.A0D;
                            path2.reset();
                            if (r52 instanceof C454128w) {
                                if (r52.A01 == 0) {
                                    fillType2 = Path.FillType.WINDING;
                                } else {
                                    fillType2 = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType2);
                                path2.addPath(path, matrix4);
                                canvas2.clipPath(path2);
                            } else {
                                C454228x r53 = (C454228x) r52;
                                float f8 = r53.A06;
                                if (!(f8 == 0.0f && r53.A04 == 1.0f)) {
                                    float f9 = r53.A05;
                                    float f10 = (f8 + f9) % 1.0f;
                                    float f11 = (r53.A04 + f9) % 1.0f;
                                    PathMeasure pathMeasure = r9.A07;
                                    if (pathMeasure == null) {
                                        pathMeasure = new PathMeasure();
                                        r9.A07 = pathMeasure;
                                    }
                                    pathMeasure.setPath(path, false);
                                    float length = r9.A07.getLength();
                                    float f12 = f10 * length;
                                    float f13 = f11 * length;
                                    path.reset();
                                    int i6 = (f12 > f13 ? 1 : (f12 == f13 ? 0 : -1));
                                    PathMeasure pathMeasure2 = r9.A07;
                                    if (i6 > 0) {
                                        pathMeasure2.getSegment(f12, length, path, true);
                                        r9.A07.getSegment(0.0f, f13, path, true);
                                    } else {
                                        pathMeasure2.getSegment(f12, f13, path, true);
                                    }
                                    path.rLineTo(0.0f, 0.0f);
                                }
                                path2.addPath(path, matrix4);
                                C59202lv r12 = r53.A09;
                                if (r12.A02()) {
                                    if (r9.A05 == null) {
                                        Paint paint = new Paint(1);
                                        r9.A05 = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = r9.A05;
                                    Shader shader = r12.A02;
                                    if (shader != null) {
                                        shader.setLocalMatrix(matrix4);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(r53.A00 * 255.0f));
                                    } else {
                                        paint2.setShader((Shader) null);
                                        paint2.setAlpha(255);
                                        int i7 = r12.A00;
                                        paint2.setColor((i7 & 16777215) | (((int) (((float) Color.alpha(i7)) * r53.A00)) << 24));
                                    }
                                    paint2.setColorFilter((ColorFilter) null);
                                    if (r53.A01 == 0) {
                                        fillType = Path.FillType.WINDING;
                                    } else {
                                        fillType = Path.FillType.EVEN_ODD;
                                    }
                                    path2.setFillType(fillType);
                                    canvas2.drawPath(path2, paint2);
                                }
                                C59202lv r1 = r53.A0A;
                                if (r1.A02()) {
                                    if (r9.A06 == null) {
                                        Paint paint3 = new Paint(1);
                                        r9.A06 = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = r9.A06;
                                    Paint.Join join = r53.A08;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = r53.A07;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(r53.A02);
                                    Shader shader2 = r1.A02;
                                    if (shader2 != null) {
                                        shader2.setLocalMatrix(matrix4);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(r53.A01 * 255.0f));
                                    } else {
                                        paint4.setShader((Shader) null);
                                        paint4.setAlpha(255);
                                        int i8 = r1.A00;
                                        paint4.setColor((i8 & 16777215) | (((int) (((float) Color.alpha(i8)) * r53.A01)) << 24));
                                    }
                                    paint4.setColorFilter((ColorFilter) null);
                                    paint4.setStrokeWidth(r53.A03 * min * abs);
                                    canvas2.drawPath(path2, paint4);
                                }
                            }
                        }
                    }
                }
                i3++;
            } else {
                canvas2.restore();
                return;
            }
        }
    }

    public float getAlpha() {
        return ((float) this.A04) / 255.0f;
    }

    public void setAlpha(float f) {
        this.A04 = (int) (f * 255.0f);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.00O, X.00P] */
    public C63612tP(C63612tP r4) {
        this.A0B = new Matrix();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A04 = 255;
        this.A09 = null;
        this.A08 = null;
        ? r2 = new AnonymousClass00O(0);
        this.A0E = r2;
        this.A0F = new C454428z(r2, r4.A0F);
        this.A0C = new Path(r4.A0C);
        this.A0D = new Path(r4.A0D);
        this.A01 = r4.A01;
        this.A00 = r4.A00;
        this.A03 = r4.A03;
        this.A02 = r4.A02;
        this.A0A = r4.A0A;
        this.A04 = r4.A04;
        this.A09 = r4.A09;
        String str = r4.A09;
        if (str != null) {
            r2.put(str, this);
        }
        this.A08 = r4.A08;
    }

    public int getRootAlpha() {
        return this.A04;
    }

    public void setRootAlpha(int i) {
        this.A04 = i;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.00O, X.00P] */
    public C63612tP() {
        this.A0B = new Matrix();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A04 = 255;
        this.A09 = null;
        this.A08 = null;
        this.A0E = new AnonymousClass00O(0);
        this.A0F = new C454428z();
        this.A0C = new Path();
        this.A0D = new Path();
    }
}
