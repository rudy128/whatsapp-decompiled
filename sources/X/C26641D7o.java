package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.D7o  reason: case insensitive filesystem */
public class C26641D7o implements E3k, C28646ECe, C28647ECf {
    public float A00;
    public C26049CrJ A01;
    public C26049CrJ A02;
    public C26638D7l A03;
    public C22732BMv A04;
    public final C001100p A05 = new C001100p();
    public final C001100p A06 = new C001100p();
    public final C26049CrJ A07;
    public final C26049CrJ A08;
    public final C26049CrJ A09;
    public final int A0A;
    public final Paint A0B;
    public final Path A0C;
    public final RectF A0D;
    public final C38631rd A0E;
    public final C26049CrJ A0F;
    public final C26642D7p A0G;
    public final Integer A0H;
    public final String A0I;
    public final List A0J;
    public final boolean A0K;

    public void CIY(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            Object obj = list2.get(i);
            if (obj instanceof C28645ECd) {
                this.A0J.add(obj);
            }
        }
    }

    private int A00() {
        float f = this.A09.A02;
        float f2 = (float) this.A0A;
        int A042 = BE6.A04(f, f2);
        int A043 = BE6.A04(this.A08.A02, f2);
        int A044 = BE6.A04(this.A07.A02, f2);
        int i = 17;
        if (A042 != 0) {
            i = 527 * A042;
        }
        if (A043 != 0) {
            i = i * 31 * A043;
        }
        if (A044 != 0) {
            return i * 31 * A044;
        }
        return i;
    }

    private int[] A01(int[] iArr) {
        C22732BMv bMv = this.A04;
        if (bMv != null) {
            Integer[] numArr = (Integer[]) bMv.A05();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length != length2) {
                iArr = new int[length2];
                while (i < length2) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                while (i < length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    public void BBs(C25723Ckt ckt, Object obj) {
        C26642D7p d7p;
        C26049CrJ crJ;
        C26638D7l d7l;
        C26049CrJ crJ2;
        C26638D7l d7l2;
        C26638D7l d7l3;
        C26638D7l d7l4;
        C26638D7l d7l5;
        if (obj == EBL.A0b) {
            crJ2 = this.A0F;
        } else {
            if (obj == EBL.A01) {
                C26049CrJ crJ3 = this.A02;
                if (crJ3 != null) {
                    this.A0G.A0M.remove(crJ3);
                }
                if (ckt == null) {
                    this.A02 = null;
                    return;
                }
                C22732BMv bMv = new C22732BMv(ckt, (Object) null);
                this.A02 = bMv;
                bMv.A0A(this);
                d7p = this.A0G;
                crJ = this.A02;
            } else if (obj == EBL.A0e) {
                C22732BMv bMv2 = this.A04;
                if (bMv2 != null) {
                    this.A0G.A0M.remove(bMv2);
                }
                if (ckt == null) {
                    this.A04 = null;
                    return;
                }
                this.A05.A07();
                this.A06.A07();
                C22732BMv bMv3 = new C22732BMv(ckt, (Object) null);
                this.A04 = bMv3;
                bMv3.A0A(this);
                d7p = this.A0G;
                crJ = this.A04;
            } else if (obj == EBL.A0A) {
                crJ2 = this.A01;
                if (crJ2 == null) {
                    C22732BMv bMv4 = new C22732BMv(ckt, (Object) null);
                    this.A01 = bMv4;
                    bMv4.A0A(this);
                    d7p = this.A0G;
                    crJ = this.A01;
                }
            } else if (obj == EBL.A0a && (d7l5 = this.A03) != null) {
                crJ2 = d7l5.A01;
            } else if (obj == EBL.A0E && (d7l4 = this.A03) != null) {
                d7l4.A01(ckt);
                return;
            } else if (obj == EBL.A0C && (d7l3 = this.A03) != null) {
                crJ2 = d7l3.A02;
            } else if (obj == EBL.A0D && (d7l2 = this.A03) != null) {
                crJ2 = d7l2.A03;
            } else if (obj == EBL.A0F && (d7l = this.A03) != null) {
                crJ2 = d7l.A04;
            } else {
                return;
            }
            d7p.A0C(crJ);
            return;
        }
        crJ2.A0B(ckt);
    }

    public void BJJ(Canvas canvas, Matrix matrix, int i) {
        Matrix matrix2;
        Shader shader;
        BlurMaskFilter blurMaskFilter;
        if (!this.A0K) {
            Path path = this.A0C;
            path.reset();
            int i2 = 0;
            while (true) {
                List list = this.A0J;
                matrix2 = matrix;
                if (i2 >= list.size()) {
                    break;
                }
                BEA.A11(matrix2, path, list, i2);
                i2++;
            }
            path.computeBounds(this.A0D, false);
            Integer num = this.A0H;
            Integer num2 = AnonymousClass00R.A00;
            int A002 = A00();
            if (num == num2) {
                C001100p r5 = this.A05;
                long j = (long) A002;
                shader = (Shader) r5.A05(j);
                if (shader == null) {
                    PointF A022 = C26049CrJ.A02(this.A09);
                    PointF A023 = C26049CrJ.A02(this.A08);
                    C40871vQ r4 = (C40871vQ) this.A07.A05();
                    int[] A012 = A01(r4.A01);
                    float[] fArr = r4.A00;
                    float f = A022.x;
                    float f2 = A022.y;
                    float f3 = A023.x;
                    float f4 = A023.y;
                    shader = new LinearGradient(f, f2, f3, f4, A012, fArr, Shader.TileMode.CLAMP);
                    r5.A0A(j, shader);
                }
            } else {
                C001100p r7 = this.A06;
                long j2 = (long) A002;
                shader = (Shader) r7.A05(j2);
                if (shader == null) {
                    PointF A024 = C26049CrJ.A02(this.A09);
                    PointF A025 = C26049CrJ.A02(this.A08);
                    C40871vQ r1 = (C40871vQ) this.A07.A05();
                    int[] A013 = A01(r1.A01);
                    float[] fArr2 = r1.A00;
                    float f5 = A024.x;
                    float f6 = A024.y;
                    float hypot = (float) Math.hypot((double) (A025.x - f5), (double) (A025.y - f6));
                    if (hypot <= 0.0f) {
                        hypot = 0.001f;
                    }
                    shader = new RadialGradient(f5, f6, hypot, A013, fArr2, Shader.TileMode.CLAMP);
                    r7.A0A(j2, shader);
                }
            }
            shader.setLocalMatrix(matrix2);
            Paint paint = this.A0B;
            paint.setShader(shader);
            BEA.A13(paint, this.A02);
            C26049CrJ crJ = this.A01;
            if (crJ != null) {
                float A014 = C26049CrJ.A01(crJ);
                if (A014 == 0.0f) {
                    blurMaskFilter = null;
                } else {
                    if (A014 != this.A00) {
                        blurMaskFilter = new BlurMaskFilter(A014, BlurMaskFilter.Blur.NORMAL);
                    }
                    this.A00 = A014;
                }
                paint.setMaskFilter(blurMaskFilter);
                this.A00 = A014;
            }
            C26638D7l d7l = this.A03;
            if (d7l != null) {
                d7l.A00(paint);
            }
            int A015 = (int) (BE7.A01(((float) i) / 255.0f, (float) AnonymousClass000.A0M(this.A0F.A05())) * 255.0f);
            PointF pointF = C40761vE.A00;
            paint.setAlpha(BE8.A07(255, A015, 0));
            canvas.drawPath(path, paint);
        }
    }

    public void BNg(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A0C;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.A0J;
            if (i < list.size()) {
                BEA.A11(matrix, path, list, i);
                i++;
            } else {
                path.computeBounds(rectF, false);
                BEA.A14(rectF, rectF.left, 1.0f);
                return;
            }
        }
    }

    public void C9s() {
        this.A0E.invalidateSelf();
    }

    public String getName() {
        return this.A0I;
    }

    public C26641D7o(C39801tf r4, C38631rd r5, C40921vV r6, C26642D7p d7p) {
        Path A0L = C108945cZ.A0L();
        this.A0C = A0L;
        this.A0B = new Paint(1);
        this.A0D = AnonymousClass3MW.A08();
        this.A0J = AnonymousClass000.A13();
        this.A00 = 0.0f;
        this.A0G = d7p;
        this.A0I = r6.A06;
        this.A0K = r6.A07;
        this.A0E = r5;
        this.A0H = r6.A05;
        A0L.setFillType(r6.A00);
        this.A0A = (int) (r4.A00() / 32.0f);
        C26049CrJ BHA = r6.A01.BHA();
        this.A07 = BHA;
        BHA.A0A(this);
        d7p.A0C(BHA);
        C26049CrJ BHA2 = r6.A02.BHA();
        this.A0F = BHA2;
        BHA2.A0A(this);
        d7p.A0C(BHA2);
        C26049CrJ BHA3 = r6.A04.BHA();
        this.A09 = BHA3;
        BHA3.A0A(this);
        d7p.A0C(BHA3);
        C26049CrJ BHA4 = r6.A03.BHA();
        this.A08 = BHA4;
        BHA4.A0A(this);
        d7p.A0C(BHA4);
        C24747CIj A082 = d7p.A08();
        if (A082 != null) {
            C26049CrJ BHA5 = A082.A00.BHA();
            this.A01 = BHA5;
            BHA5.A0A(this);
            d7p.A0C(this.A01);
        }
        CS8 A092 = d7p.A09();
        if (A092 != null) {
            this.A03 = new C26638D7l(this, d7p, A092);
        }
    }

    public void CFv(C26046CrD crD, C26046CrD crD2, List list, int i) {
        C40761vE.A01(this, crD, crD2, list, i);
    }
}
