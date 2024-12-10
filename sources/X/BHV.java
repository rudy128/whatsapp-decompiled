package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Region;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import java.util.LinkedList;

public abstract class BHV extends View {
    public static final float[] A0Y = {0.0f, 0.7f, 0.7f, 0.85f, 1.0f};
    public static final float[] A0Z = {0.03f, 0.31f, 0.36f, 0.41f, 0.57f, 0.64f, 0.66f, 0.7f, 0.84f, 0.95f};
    public static final float[] A0a = {0.0f, 0.7f, 0.85f, 1.0f};
    public static final int[] A0b = {0, 0, Color.argb(100, 255, 255, 255), 0, Color.argb(100, 255, 255, 255)};
    public static final int[] A0c = {Color.rgb(1, 126, 221), Color.rgb(95, 250, 193), Color.rgb(95, 250, 193), Color.rgb(8, 167, 242), Color.rgb(0, 95, 227), Color.rgb(236, 125, 217), Color.rgb(252, 145, 217), Color.rgb(228, 120, 216), Color.rgb(68, 109, 223), Color.rgb(1, 85, 221)};
    public static final int[] A0d = {0, 0, Color.argb(65, 0, 97, 229), 0};
    public float A00;
    public float A01;
    public float A02 = 1.0f;
    public float A03;
    public float A04;
    public float A05;
    public LinearGradient A06;
    public RadialGradient A07;
    public RadialGradient A08;
    public C25808CmL A09 = new C25808CmL(0.5f, 1.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
    public boolean A0A;
    public float A0B;
    public float A0C = 1.0f;
    public float A0D;
    public float A0E = 1.0f;
    public float A0F;
    public float A0G;
    public float A0H = 1.0f;
    public float A0I = 1.0f;
    public float A0J;
    public long A0K;
    public C25808CmL A0L = new C25808CmL(0.5f, 1.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
    public C24299Byw A0M = C24299Byw.None;
    public final float A0N = 0.1f;
    public final Matrix A0O = C108945cZ.A0J();
    public final Paint A0P;
    public final D4Y A0Q = new D4Y(this);
    public final float[] A0R = {1.0f, 1.0f, 1.0f};
    public final int A0S = 10;
    public final Matrix A0T = C108945cZ.A0J();
    public final Path A0U = C108945cZ.A0L();
    public final Path A0V = C108945cZ.A0L();
    public final LinkedList A0W = AnonymousClass8BR.A14();
    public final float[] A0X = {1.0f, 1.0f, 1.0f};

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BHV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        Paint A062 = AnonymousClass3MW.A06();
        C108945cZ.A1L(A062);
        A062.setAntiAlias(true);
        this.A0P = A062;
        A02();
    }

    public static final void A03(BHV bhv, long j) {
        float A002;
        BHV bhv2 = bhv;
        long j2 = bhv.A0K;
        if (j2 == 0) {
            bhv.A0K = j;
            j2 = j;
        }
        long j3 = j - j2;
        bhv.A0K = j;
        C25808CmL cmL = bhv.A09;
        C25808CmL cmL2 = bhv.A0L;
        cmL.A05 = A00(cmL2.A05, cmL.A05, 0.01f, j3);
        cmL.A00 = A00(cmL2.A00, cmL.A00, 0.01f, j3);
        cmL.A02 = A00(cmL2.A02, cmL.A02, 0.1f, j3);
        cmL.A03 = A00(cmL2.A03, cmL.A03, 0.01f, j3);
        cmL.A08 = A00(cmL2.A08, cmL.A08, 0.1f, j3);
        cmL.A01 = A00(cmL2.A01, cmL.A01, 0.1f, j3);
        cmL.A04 = A00(cmL2.A04, cmL.A04, 0.04f, j3);
        float A003 = A00(cmL2.A06, cmL.A06, 0.01f, j3);
        cmL.A06 = A003;
        float A004 = A00(cmL2.A07, cmL.A07, 0.1f, j3);
        cmL.A07 = A004;
        float f = bhv.A04;
        if (f >= 12.0f) {
            bhv.A0I = -1.0f;
        } else if (f <= 0.01f) {
            bhv.A0I = 1.0f;
        }
        float f2 = (float) j3;
        bhv.A04 = BE8.A00((((f + (bhv.A0I * A003)) * A004) * f2) / 1.6666667E7f, 0.01f, 12.0f);
        bhv.A0E = A00(Math.min((bhv.A0F * 0.18f) + 0.82f + bhv.A03, 1.0f), bhv.A0E, 0.002f, j3);
        bhv.A0B = (bhv.A0E * ((C108945cZ.A03(bhv) / 2.0f) * 0.82f)) / 50.0f;
        bhv.A05 += ((cmL.A08 + bhv.A04) * f2) / 1.6666667E7f;
        bhv.A00 += (cmL.A01 * f2) / 1.6666667E7f;
        float f3 = bhv.A01;
        if (f3 >= 75.0f) {
            bhv.A0H = -1.0f;
        } else if (f3 <= -75.0f) {
            bhv.A0H = 1.0f;
        }
        float f4 = cmL.A02;
        if (bhv.A0M == C24299Byw.Thinking || f4 == 0.0f) {
            A002 = A00(0.0f, f3, Math.max(f4, 1.0f), j3);
        } else {
            A002 = Math.max(Math.min(f3 + (((bhv2.A0H * f4) * f2) / 1.6666667E7f), 75.0f), -75.0f);
        }
        bhv2.A01 = A002;
        Path path = bhv2.A0V;
        path.reset();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(0.0f, 0.0f, 35.0f, direction);
        Path path2 = bhv2.A0U;
        path2.reset();
        path2.addCircle(0.0f, 0.0f, 50.0f, direction);
        float f5 = (bhv2.A0F * 0.22000003f * 0.4f) + (bhv2.A0J * 0.22000003f * 16.0f);
        float f6 = cmL.A04;
        float min = Math.min((f5 * f6) + 1.0f, 1.22f);
        float f7 = (f6 * 0.14999998f) + 1.0f;
        float f8 = bhv2.A0D;
        if (f8 >= 2.0f) {
            bhv2.A0C = -1.0f;
        } else if (f8 <= 0.0f) {
            bhv2.A0C = 1.0f;
        }
        float f9 = f8 + (bhv2.A0C * 0.01f);
        bhv2.A0D = f9;
        int rint = (int) ((float) Math.rint((double) f9));
        float[] fArr = bhv2.A0X;
        if (rint != 0) {
            fArr[0] = f7;
            if (rint != 1) {
                fArr[1] = f7;
                fArr[2] = min;
            } else {
                fArr[1] = min;
                fArr[2] = f7;
            }
        } else {
            fArr[0] = min;
            fArr[1] = f7;
            fArr[2] = f7;
        }
        float[] fArr2 = bhv2.A0R;
        fArr2[0] = A00(fArr[0], fArr2[0], 0.01f, j3);
        fArr2[1] = A00(fArr[1], fArr2[1], 0.01f, j3);
        fArr2[2] = A00(fArr[2], fArr2[2], 0.01f, j3);
        float f10 = bhv2.A03;
        float f11 = -1.0f;
        if (f10 <= bhv2.A0N) {
            if (f10 <= 0.001f) {
                f11 = 1.0f;
            }
            bhv2.A03 = f10 + (bhv2.A02 * cmL.A03);
        }
        bhv2.A02 = f11;
        bhv2.A03 = f10 + (bhv2.A02 * cmL.A03);
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        super.onDraw(canvas);
        C27156DWr dWr = new C27156DWr(canvas, this, C108945cZ.A03(this) / 2.0f, C108945cZ.A04(this) / 2.0f, (this.A09.A04 * 0.05f) + 1.0f);
        canvas.save();
        dWr.invoke();
        canvas.restore();
        this.A0O.reset();
        this.A0T.reset();
    }

    public void onVisibilityChanged(View view, int i) {
        C18070vi.A0d(view, 0);
        super.onVisibilityChanged(view, i);
        if (i == 4 || i == 8) {
            if (this.A0A) {
                Choreographer.getInstance().removeFrameCallback(this.A0Q);
                this.A0A = false;
            }
        } else if (!this.A0A) {
            Choreographer.getInstance().postFrameCallback(this.A0Q);
            this.A0A = true;
        }
    }

    public final void setSpeechIndicatorState(C24299Byw byw) {
        C18070vi.A0d(byw, 0);
        setState(byw);
    }

    public static final float A00(float f, float f2, float f3, long j) {
        float f4 = f - f2;
        if (Math.abs(f4) < 0.001f) {
            return f;
        }
        float f5 = (f3 * ((float) j)) / 1.6666667E7f;
        return f2 + Math.max(Math.min(f4, f5), -f5);
    }

    private final void A02() {
        int[] iArr = A0c;
        float[] fArr = A0Z;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A06 = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, iArr, fArr, tileMode);
        Shader.TileMode tileMode2 = tileMode;
        this.A07 = new RadialGradient(0.0f, 0.0f, 50.0f, A0b, A0Y, tileMode2);
        this.A08 = new RadialGradient(0.0f, 0.0f, 50.0f, A0d, A0a, tileMode2);
    }

    private final void setState(C24299Byw byw) {
        C25808CmL cmL;
        if (this.A0M != byw) {
            this.A0M = byw;
            switch (byw.ordinal()) {
                case 0:
                    cmL = new C25808CmL(0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                    break;
                case 1:
                case 5:
                    cmL = new C25808CmL(0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
                    break;
                case 2:
                    cmL = new C25808CmL(1.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0013f, 0.0f, 1.0f);
                    break;
                case 3:
                    cmL = new C25808CmL(1.0f, 0.3f, 2.0f, 0.0f, 0.0f, 3.0f, 0.001f, 1.0f, 1.0f);
                    break;
                case 4:
                    cmL = new C25808CmL(1.0f, 0.0f, 4.0f, 0.3f, 1.0f, 0.0f, 0.001f, 0.0f, 1.0f);
                    break;
                default:
                    throw AnonymousClass3MW.A14();
            }
            this.A0L = cmL;
        }
    }

    public static final C27621Wu A01(Canvas canvas, BHV bhv, float f, float f2, float f3) {
        canvas.translate(f, f2);
        float f4 = bhv.A0B;
        canvas.scale(f4, f4, 0.0f, 0.0f);
        Path path = bhv.A0V;
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        Matrix matrix = bhv.A0T;
        matrix.setScale(2.3f, 2.3f, 0.0f, 0.0f);
        matrix.preTranslate(-50.0f, -50.0f);
        LinearGradient linearGradient = bhv.A06;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
        bhv.A0P.setShader(bhv.A06);
        DWY dwy = new DWY(canvas, bhv, f3, 0);
        canvas.save();
        dwy.invoke();
        canvas.restore();
        DWY dwy2 = new DWY(canvas, bhv, f3, 1);
        canvas.save();
        dwy2.invoke();
        canvas.restore();
        DWY dwy3 = new DWY(canvas, bhv, f3, 2);
        canvas.save();
        dwy3.invoke();
        canvas.restore();
        DWW dww = new DWW(canvas, bhv, 0);
        canvas.save();
        dww.invoke();
        canvas.restore();
        DWW dww2 = new DWW(canvas, bhv, 1);
        canvas.save();
        dww2.invoke();
        canvas.restore();
        return C27621Wu.A00;
    }

    public final void A04(float f) {
        float min = Math.min(Math.max((f - 0.17f) / 0.83f, 0.0f), 1.0f);
        LinkedList linkedList = this.A0W;
        if (linkedList.size() >= this.A0S) {
            this.A0G -= AnonymousClass000.A04(C29431cG.A0d(linkedList));
            linkedList.removeLast();
        }
        linkedList.addFirst(Float.valueOf(min));
        float f2 = this.A0G + min;
        this.A0G = f2;
        this.A0J = Math.max(min - BE8.A00(f2 / ((float) linkedList.size()), 0.0f, 1.0f), 0.0f);
        this.A0F = min;
        invalidate();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A0A) {
            Choreographer.getInstance().removeFrameCallback(this.A0Q);
            this.A0A = false;
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A03(this, this.A0K);
        A02();
        invalidate();
    }
}
