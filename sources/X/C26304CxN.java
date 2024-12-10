package X;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: X.CxN  reason: case insensitive filesystem */
public class C26304CxN {
    public static HashSet A06;
    public Canvas A00;
    public C26262Cw7 A01;
    public C25614Ciu A02;
    public Stack A03;
    public Stack A04;
    public Stack A05;

    public static float A02(C22756BNt bNt, C26304CxN cxN) {
        List list = bNt.A01;
        if (list == null || list.size() == 0) {
            return 0.0f;
        }
        return ((DS0) bNt.A01.get(0)).A03(cxN);
    }

    private C25668Cjy A0D(DS0 ds0, DS0 ds02, DS0 ds03, DS0 ds04) {
        float f;
        float f2;
        float f3 = 0.0f;
        float A012 = A01(ds0, this);
        if (ds02 != null) {
            f3 = ds02.A03(this);
        }
        C25614Ciu ciu = this.A02;
        C25668Cjy cjy = ciu.A02;
        if (cjy == null) {
            cjy = ciu.A03;
        }
        if (ds03 != null) {
            f = ds03.A02(this);
        } else {
            f = cjy.A03;
        }
        if (ds04 != null) {
            f2 = ds04.A03(this);
        } else {
            f2 = cjy.A00;
        }
        return new C25668Cjy(A012, f3, f, f2);
    }

    private void A0H(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        C5W c5w = this.A02.A04.A01;
        if (c5w != null) {
            f += c5w.A01.A02(this);
            f2 += this.A02.A04.A01.A03.A03(this);
            f5 -= this.A02.A04.A01.A02.A02(this);
            f6 -= this.A02.A04.A01.A00.A03(this);
        }
        this.A00.clipRect(f, f2, f5, f6);
    }

    private void A0S(C22737BNa bNa, C22741BNe bNe) {
        float f;
        float f2;
        float f3;
        Boolean bool = bNa.A05;
        if (bool == null || !bool.booleanValue()) {
            DS0 ds0 = bNa.A01;
            float f4 = 1.2f;
            if (ds0 != null) {
                f = ds0.A04(this, 1.0f);
            } else {
                f = 1.2f;
            }
            DS0 ds02 = bNa.A00;
            if (ds02 != null) {
                f4 = ds02.A04(this, 1.0f);
            }
            C25668Cjy cjy = bNe.A00;
            f2 = f * cjy.A03;
            f3 = f4 * cjy.A00;
        } else {
            DS0 ds03 = bNa.A01;
            if (ds03 != null) {
                f2 = ds03.A02(this);
            } else {
                f2 = bNe.A00.A03;
            }
            DS0 ds04 = bNa.A00;
            if (ds04 != null) {
                f3 = ds04.A03(this);
            } else {
                f3 = bNe.A00.A00;
            }
        }
        if (f2 != 0.0f && f3 != 0.0f) {
            A0j(this);
            C25614Ciu ciu = new C25614Ciu(this);
            A0V(DS2.A00(), ciu, this);
            A0c(bNa, ciu);
            this.A02 = ciu;
            ciu.A04.A0F = Float.valueOf(1.0f);
            Boolean bool2 = bNa.A04;
            if (bool2 != null && !bool2.booleanValue()) {
                Canvas canvas = this.A00;
                C25668Cjy cjy2 = bNe.A00;
                canvas.translate(cjy2.A01, cjy2.A02);
                C25668Cjy cjy3 = bNe.A00;
                canvas.scale(cjy3.A03, cjy3.A00);
            }
            A0W(bNa, false);
            A0i(this);
        }
    }

    public static float A00(DS0 ds0, C26304CxN cxN) {
        if (ds0 != null) {
            return ds0.A03(cxN);
        }
        return 0.0f;
    }

    public static float A01(DS0 ds0, C26304CxN cxN) {
        if (ds0 != null) {
            return ds0.A02(cxN);
        }
        return 0.0f;
    }

    public static int A03(int i, float f) {
        int i2 = 255;
        int A042 = BE6.A04((float) ((i >> 24) & 255), f);
        if (A042 < 0) {
            i2 = 0;
        } else if (A042 <= 255) {
            i2 = A042;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static Matrix A05(C25668Cjy cjy, boolean z) {
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(cjy.A01, cjy.A02);
            matrix.preScale(cjy.A03, cjy.A00);
        }
        return matrix;
    }

    private Path A06(C25668Cjy cjy, C22741BNe bNe) {
        Path A0B;
        C22761BNy A0A = bNe.A01.A0A(this.A02.A04.A0W);
        boolean z = false;
        if (A0A == null) {
            A0k("ClipPath reference '%s' not found", this.A02.A04.A0W);
            return null;
        }
        BNU bnu = (BNU) A0A;
        this.A05.push(this.A02);
        A0d(bnu, this);
        Boolean bool = bnu.A00;
        if (bool == null || bool.booleanValue()) {
            z = true;
        }
        Matrix A052 = A05(cjy, z);
        Matrix matrix = bnu.A00;
        if (matrix != null) {
            A052.preConcat(matrix);
        }
        Path A0L = C108945cZ.A0L();
        for (C24482C5y c5y : bnu.A01) {
            if ((c5y instanceof C22741BNe) && (A0B = A0B((C22741BNe) c5y, true)) != null) {
                A0L.op(A0B, Path.Op.UNION);
            }
        }
        if (this.A02.A04.A0W != null) {
            C25668Cjy cjy2 = bnu.A00;
            if (cjy2 == null) {
                cjy2 = A0C(A0L);
                bnu.A00 = cjy2;
            }
            Path A062 = A06(cjy2, bnu);
            if (A062 != null) {
                A0L.op(A062, Path.Op.INTERSECT);
            }
        }
        A0L.transform(A052);
        this.A02 = (C25614Ciu) this.A05.pop();
        return A0L;
    }

    private Path A07(BNN bnn) {
        BNN bnn2 = bnn;
        float f = 0.0f;
        float A012 = A01(bnn2.A00, this);
        DS0 ds0 = bnn2.A01;
        if (ds0 != null) {
            f = ds0.A03(this);
        }
        float A013 = bnn2.A02.A01(this);
        float f2 = A012 - A013;
        float f3 = f - A013;
        float f4 = A012 + A013;
        float f5 = f + A013;
        if (bnn2.A00 == null) {
            float f6 = A013 * 2.0f;
            bnn2.A00 = new C25668Cjy(f2, f3, f6, f6);
        }
        float f7 = 0.5522848f * A013;
        Path A0L = C108945cZ.A0L();
        A0L.moveTo(A012, f3);
        float f8 = A012 + f7;
        float f9 = f - f7;
        A0L.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        A0L.cubicTo(f4, f10, f8, f5, A012, f5);
        float f11 = A012 - f7;
        A0L.cubicTo(f11, f5, f2, f10, f2, f);
        A0L.cubicTo(f2, f9, f11, f3, A012, f3);
        A0L.close();
        return A0L;
    }

    private Path A08(BNO bno) {
        BNO bno2 = bno;
        float f = 0.0f;
        float A012 = A01(bno2.A00, this);
        DS0 ds0 = bno2.A01;
        if (ds0 != null) {
            f = ds0.A03(this);
        }
        float A022 = bno2.A02.A02(this);
        float A032 = bno2.A03.A03(this);
        float f2 = A012 - A022;
        float f3 = f - A032;
        float f4 = A012 + A022;
        float f5 = f + A032;
        if (bno2.A00 == null) {
            bno2.A00 = new C25668Cjy(f2, f3, A022 * 2.0f, 2.0f * A032);
        }
        float f6 = A022 * 0.5522848f;
        float f7 = 0.5522848f * A032;
        Path A0L = C108945cZ.A0L();
        A0L.moveTo(A012, f3);
        float f8 = A012 + f6;
        float f9 = f - f7;
        A0L.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        A0L.cubicTo(f4, f10, f8, f5, A012, f5);
        float f11 = A012 - f6;
        A0L.cubicTo(f11, f5, f2, f10, f2, f);
        A0L.cubicTo(f2, f9, f11, f3, A012, f3);
        A0L.close();
        return A0L;
    }

    private Path A0A(BNQ bnq) {
        float A022;
        float A032;
        BNQ bnq2 = bnq;
        DS0 ds0 = bnq2.A01;
        if (ds0 == null && bnq2.A02 == null) {
            A022 = 0.0f;
            A032 = 0.0f;
        } else {
            DS0 ds02 = bnq2.A02;
            if (ds0 == null) {
                A022 = ds02.A03(this);
            } else {
                A022 = ds0.A02(this);
                if (ds02 != null) {
                    A032 = bnq2.A02.A03(this);
                }
            }
            A032 = A022;
        }
        float min = Math.min(A022, bnq2.A03.A02(this) / 2.0f);
        float min2 = Math.min(A032, bnq2.A00.A03(this) / 2.0f);
        float A012 = A01(bnq2.A04, this);
        float A002 = A00(bnq2.A05, this);
        float A023 = bnq2.A03.A02(this);
        float A033 = bnq2.A00.A03(this);
        if (bnq2.A00 == null) {
            bnq2.A00 = new C25668Cjy(A012, A002, A023, A033);
        }
        float f = A012 + A023;
        float f2 = A002 + A033;
        Path A0L = C108945cZ.A0L();
        if (min == 0.0f || min2 == 0.0f) {
            A0L.moveTo(A012, A002);
            A0L.lineTo(f, A002);
            A0L.lineTo(f, f2);
            A0L.lineTo(A012, f2);
            A0L.lineTo(A012, A002);
        } else {
            float f3 = min * 0.5522848f;
            float f4 = 0.5522848f * min2;
            float f5 = A002 + min2;
            A0L.moveTo(A012, f5);
            float f6 = f5 - f4;
            float f7 = A012 + min;
            float f8 = f7 - f3;
            A0L.cubicTo(A012, f6, f8, A002, f7, A002);
            float f9 = f - min;
            A0L.lineTo(f9, A002);
            float f10 = f9 + f3;
            float f11 = f;
            A0L.cubicTo(f10, A002, f11, f6, f, f5);
            float f12 = f2 - min2;
            A0L.lineTo(f, f12);
            float f13 = f12 + f4;
            A0L.cubicTo(f11, f13, f10, f2, f9, f2);
            A0L.lineTo(f7, f2);
            A0L.cubicTo(f8, f2, A012, f13, A012, f12);
            A0L.lineTo(A012, f5);
        }
        A0L.close();
        return A0L;
    }

    private Path A0B(C22741BNe bNe, boolean z) {
        boolean z2;
        Path path;
        Path A062;
        float f;
        float f2;
        float f3;
        Matrix matrix;
        Path.FillType fillType;
        this.A05.push(this.A02);
        C25614Ciu ciu = new C25614Ciu(this.A02, this);
        this.A02 = ciu;
        A0a(bNe, ciu);
        Boolean bool = this.A02.A04.A0B;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        if (z2 && A0p(this)) {
            if (bNe instanceof BNS) {
                if (!z) {
                    A0k("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
                BNS bns = (BNS) bNe;
                C22761BNy A0A = bNe.A01.A0A(bns.A04);
                if (A0A == null) {
                    A0k("Use reference '%s' not found", bns.A04);
                } else if (A0A instanceof C22741BNe) {
                    path = A0B((C22741BNe) A0A, false);
                    if (path != null) {
                        if (bns.A00 == null) {
                            bns.A00 = A0C(path);
                        }
                        Matrix matrix2 = bns.A00;
                        if (matrix2 != null) {
                            path.transform(matrix2);
                        }
                    }
                    return null;
                }
            } else {
                if (bNe instanceof C22738BNb) {
                    C22738BNb bNb = (C22738BNb) bNe;
                    if (bNe instanceof BNM) {
                        path = new D8V(((BNM) bNe).A00, this).A02;
                        if (bNe.A00 == null) {
                            bNe.A00 = A0C(path);
                        }
                    } else if (bNe instanceof BNQ) {
                        path = A0A((BNQ) bNe);
                    } else if (bNe instanceof BNN) {
                        path = A07((BNN) bNe);
                    } else if (bNe instanceof BNO) {
                        path = A08((BNO) bNe);
                    } else {
                        if (bNe instanceof BNW) {
                            path = A09((BNW) bNe);
                        }
                        return null;
                    }
                    if (bNb.A00 == null) {
                        bNb.A00 = A0C(path);
                    }
                    matrix = bNb.A00;
                } else if (bNe instanceof C22759BNw) {
                    C22759BNw bNw = (C22759BNw) bNe;
                    List list = bNw.A02;
                    if (list == null || list.size() == 0) {
                        f = 0.0f;
                    } else {
                        f = ((DS0) bNw.A02.get(0)).A02(this);
                    }
                    List list2 = bNw.A03;
                    if (list2 == null || list2.size() == 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = ((DS0) bNw.A03.get(0)).A03(this);
                    }
                    List list3 = bNw.A00;
                    if (list3 == null || list3.size() == 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = ((DS0) bNw.A00.get(0)).A02(this);
                    }
                    float A022 = A02(bNw, this);
                    if (this.A02.A04.A0T != AnonymousClass00R.A00) {
                        BO0 bo0 = new BO0(this);
                        A0f(bNw, bo0);
                        float f4 = bo0.A00;
                        if (this.A02.A04.A0T == AnonymousClass00R.A01) {
                            f4 /= 2.0f;
                        }
                        f -= f4;
                    }
                    A0g(bNw, this, f, f2);
                    path = C108945cZ.A0L();
                    A0f(bNw, new BO2(path, this, f + f3, f2 + A022));
                    matrix = bNw.A00;
                } else {
                    A0k("Invalid %s element found in clipPath definition", bNe.A00());
                    return null;
                }
                if (matrix != null) {
                    path.transform(matrix);
                }
                Integer num = this.A02.A04.A0L;
                if (num == null || num != AnonymousClass00R.A01) {
                    fillType = Path.FillType.WINDING;
                } else {
                    fillType = Path.FillType.EVEN_ODD;
                }
                path.setFillType(fillType);
            }
            if (!(this.A02.A04.A0W == null || (A062 = A06(bNe.A00, bNe)) == null)) {
                path.op(A062, Path.Op.INTERSECT);
            }
            this.A02 = (C25614Ciu) this.A05.pop();
            return path;
        }
        this.A02 = (C25614Ciu) this.A05.pop();
        return null;
    }

    private Integer A0E() {
        Integer num;
        DS2 ds2 = this.A02.A04;
        Integer num2 = ds2.A0M;
        Integer num3 = AnonymousClass00R.A00;
        if (num2 == num3 || (num = ds2.A0T) == AnonymousClass00R.A01) {
            return ds2.A0T;
        }
        if (num == num3) {
            return AnonymousClass00R.A0C;
        }
        return num3;
    }

    private String A0F(String str, boolean z, boolean z2) {
        String str2;
        if (this.A02.A07) {
            str2 = "[\\n\\t]";
        } else {
            str = str.replaceAll("\\n", "").replaceAll("\\t", " ");
            if (z) {
                str = str.replaceAll("^\\s+", "");
            }
            if (z2) {
                str = str.replaceAll("\\s+$", "");
            }
            str2 = "\\s{2,}";
        }
        return str.replaceAll(str2, " ");
    }

    private void A0G() {
        C22747BNk bNk;
        DS2 ds2 = this.A02.A04;
        C27070DRv dRv = ds2.A0A;
        if (dRv instanceof C22747BNk) {
            bNk = (C22747BNk) dRv;
        } else if (dRv instanceof C22748BNl) {
            bNk = ds2.A02;
        } else {
            return;
        }
        int i = bNk.A00;
        Float f = ds2.A0K;
        if (f != null) {
            i = A03(i, f.floatValue());
        }
        this.A00.drawColor(i);
    }

    public static void A0I(Matrix matrix, C26304CxN cxN) {
        if (matrix != null) {
            cxN.A00.concat(matrix);
        }
    }

    private void A0J(Path path) {
        C25614Ciu ciu = this.A02;
        Integer num = ciu.A04.A0V;
        Integer num2 = AnonymousClass00R.A01;
        Canvas canvas = this.A00;
        if (num == num2) {
            Matrix matrix = canvas.getMatrix();
            Path A0L = C108945cZ.A0L();
            path.transform(matrix, A0L);
            canvas.setMatrix(C108945cZ.A0J());
            Shader shader = this.A02.A01.getShader();
            Matrix A0J = C108945cZ.A0J();
            if (shader != null) {
                shader.getLocalMatrix(A0J);
                Matrix matrix2 = new Matrix(A0J);
                matrix2.postConcat(matrix);
                shader.setLocalMatrix(matrix2);
            }
            canvas.drawPath(A0L, this.A02.A01);
            canvas.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(A0J);
                return;
            }
            return;
        }
        canvas.drawPath(path, ciu.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017d, code lost:
        if (r4 != false) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r0.booleanValue() == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0K(android.graphics.Path r21, X.C22741BNe r22) {
        /*
            r20 = this;
            r11 = r20
            X.Ciu r0 = r11.A02
            X.DS2 r0 = r0.A04
            X.DRv r2 = r0.A06
            boolean r0 = r2 instanceof X.C22746BNj
            r6 = r21
            if (r0 == 0) goto L_0x01db
            X.Cw7 r1 = r11.A01
            X.BNj r2 = (X.C22746BNj) r2
            java.lang.String r0 = r2.A01
            X.BNy r10 = r1.A0A(r0)
            boolean r0 = r10 instanceof X.C22751BNo
            if (r0 == 0) goto L_0x01db
            X.BNo r10 = (X.C22751BNo) r10
            java.lang.Boolean r0 = r10.A06
            r18 = 0
            r13 = 1
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            java.lang.String r0 = r10.A07
            if (r0 == 0) goto L_0x0034
            r11.A0U(r10, r0)
        L_0x0034:
            r9 = 0
            X.DS0 r0 = r10.A03
            r19 = r22
            if (r1 == 0) goto L_0x0193
            float r16 = A01(r0, r11)
            X.DS0 r0 = r10.A04
            float r2 = A00(r0, r11)
            X.DS0 r0 = r10.A02
            float r1 = A01(r0, r11)
            X.DS0 r0 = r10.A01
            float r0 = A00(r0, r11)
        L_0x0051:
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x01e4
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x01e4
            X.CYV r8 = r10.A00
            if (r8 != 0) goto L_0x005f
            X.CYV r8 = X.CYV.A02
        L_0x005f:
            A0j(r11)
            android.graphics.Canvas r7 = r11.A00
            r7.clipPath(r6)
            X.Ciu r5 = new X.Ciu
            r5.<init>(r11)
            X.DS2 r3 = X.DS2.A00()
            A0V(r3, r5, r11)
            X.DS2 r4 = r5.A04
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r18)
            r4.A0C = r3
            r11.A0c(r10, r5)
            r11.A02 = r5
            r3 = r19
            X.Cjy r6 = r3.A00
            android.graphics.Matrix r3 = r10.A00
            if (r3 == 0) goto L_0x010e
            r7.concat(r3)
            android.graphics.Matrix r4 = X.C108945cZ.A0J()
            android.graphics.Matrix r3 = r10.A00
            boolean r3 = r3.invert(r4)
            if (r3 == 0) goto L_0x010e
            r3 = 8
            float[] r14 = new float[r3]
            r3 = r19
            X.Cjy r12 = r3.A00
            float r6 = r12.A01
            r14[r18] = r6
            float r5 = r12.A02
            r14[r13] = r5
            float r3 = r12.A03
            float r3 = r3 + r6
            r15 = 2
            r14[r15] = r3
            X.BE9.A1N(r14, r5, r3)
            float r3 = r12.A00
            float r5 = r5 + r3
            r3 = 5
            r14[r3] = r5
            r17 = 6
            r14[r17] = r6
            r3 = 7
            r14[r3] = r5
            r4.mapPoints(r14)
            r4 = r14[r18]
            r3 = r14[r13]
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r4, r3, r4, r3)
        L_0x00c9:
            r3 = r14[r15]
            float r13 = r6.left
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x00d5
            r13 = r14[r15]
            r6.left = r13
        L_0x00d5:
            r3 = r14[r15]
            float r12 = r6.right
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x00e1
            r12 = r14[r15]
            r6.right = r12
        L_0x00e1:
            int r3 = r15 + 1
            r3 = r14[r3]
            float r5 = r6.top
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x00f1
            int r3 = r15 + 1
            r5 = r14[r3]
            r6.top = r5
        L_0x00f1:
            int r3 = r15 + 1
            r3 = r14[r3]
            float r4 = r6.bottom
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0101
            int r3 = r15 + 1
            r4 = r14[r3]
            r6.bottom = r4
        L_0x0101:
            int r15 = r15 + 2
            r3 = r17
            if (r15 <= r3) goto L_0x00c9
            float r12 = r12 - r13
            float r4 = r4 - r5
            X.Cjy r6 = new X.Cjy
            r6.<init>(r13, r5, r12, r4)
        L_0x010e:
            float r5 = r6.A01
            float r3 = r5 - r16
            float r3 = r3 / r1
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            float r12 = (float) r3
            float r12 = r12 * r1
            float r16 = r16 + r12
            float r12 = r6.A02
            float r3 = r12 - r2
            float r3 = r3 / r0
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            float r13 = (float) r3
            float r13 = r13 * r0
            float r2 = r2 + r13
            float r3 = r6.A03
            float r5 = r5 + r3
            float r3 = r6.A00
            float r12 = r12 + r3
            X.Cjy r6 = new X.Cjy
            r6.<init>(r9, r9, r1, r0)
            boolean r13 = r11.A0l()
        L_0x0138:
            int r3 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x01d2
            r9 = r16
        L_0x013e:
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0191
            r6.A01 = r9
            r6.A02 = r2
            A0j(r11)
            X.Ciu r3 = r11.A02
            A0O(r6, r3, r11)
            X.Cjy r3 = r10.A00
            if (r3 == 0) goto L_0x0174
            android.graphics.Matrix r3 = A04(r8, r6, r3)
            r7.concat(r3)
        L_0x0159:
            java.util.List r3 = r10.A01
            java.util.Iterator r4 = r3.iterator()
        L_0x015f:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x016f
            java.lang.Object r3 = r4.next()
            X.C5y r3 = (X.C24482C5y) r3
            r11.A0b(r3)
            goto L_0x015f
        L_0x016f:
            A0i(r11)
            float r9 = r9 + r1
            goto L_0x013e
        L_0x0174:
            java.lang.Boolean r3 = r10.A05
            if (r3 == 0) goto L_0x017f
            boolean r4 = r3.booleanValue()
            r3 = 0
            if (r4 == 0) goto L_0x0180
        L_0x017f:
            r3 = 1
        L_0x0180:
            r7.translate(r9, r2)
            if (r3 != 0) goto L_0x0159
            r3 = r19
            X.Cjy r3 = r3.A00
            float r4 = r3.A03
            float r3 = r3.A00
            r7.scale(r4, r3)
            goto L_0x0159
        L_0x0191:
            float r2 = r2 + r0
            goto L_0x0138
        L_0x0193:
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x01cf
            float r16 = r0.A04(r11, r3)
        L_0x019b:
            X.DS0 r0 = r10.A04
            if (r0 == 0) goto L_0x01cd
            float r2 = r0.A04(r11, r3)
        L_0x01a3:
            X.DS0 r0 = r10.A02
            if (r0 == 0) goto L_0x01cb
            float r1 = r0.A04(r11, r3)
        L_0x01ab:
            X.DS0 r0 = r10.A01
            if (r0 == 0) goto L_0x01c9
            float r0 = r0.A04(r11, r3)
        L_0x01b3:
            r3 = r19
            X.Cjy r7 = r3.A00
            float r3 = r7.A01
            float r5 = r7.A03
            float r16 = r16 * r5
            float r16 = r16 + r3
            float r4 = r7.A02
            float r3 = r7.A00
            float r2 = r2 * r3
            float r2 = r2 + r4
            float r1 = r1 * r5
            float r0 = r0 * r3
            goto L_0x0051
        L_0x01c9:
            r0 = 0
            goto L_0x01b3
        L_0x01cb:
            r1 = 0
            goto L_0x01ab
        L_0x01cd:
            r2 = 0
            goto L_0x01a3
        L_0x01cf:
            r16 = 0
            goto L_0x019b
        L_0x01d2:
            if (r13 == 0) goto L_0x01d7
            r11.A0Y(r10)
        L_0x01d7:
            A0i(r11)
            return
        L_0x01db:
            android.graphics.Canvas r1 = r11.A00
            X.Ciu r0 = r11.A02
            android.graphics.Paint r0 = r0.A00
            r1.drawPath(r6, r0)
        L_0x01e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26304CxN.A0K(android.graphics.Path, X.BNe):void");
    }

    public static void A0L(CYV cyv, C25668Cjy cjy, C25668Cjy cjy2, C22749BNm bNm, C26304CxN cxN) {
        if (cjy.A03 != 0.0f && cjy.A00 != 0.0f) {
            if (cyv == null && (cyv = bNm.A00) == null) {
                cyv = CYV.A02;
            }
            if (A0o(bNm, cxN)) {
                C25614Ciu ciu = cxN.A02;
                ciu.A03 = cjy;
                A0O(cjy, ciu, cxN);
                cxN.A0N(cxN.A02.A03, bNm);
                Canvas canvas = cxN.A00;
                C25668Cjy cjy3 = cxN.A02.A03;
                if (cjy2 != null) {
                    canvas.concat(A04(cyv, cjy3, cjy2));
                    cxN.A02.A02 = bNm.A00;
                } else {
                    canvas.translate(cjy3.A01, cjy3.A02);
                }
                boolean A0l = cxN.A0l();
                cxN.A0G();
                cxN.A0W(bNm, true);
                if (A0l) {
                    cxN.A0Y(bNm);
                }
                cxN.A0Z(bNm);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r0.booleanValue() == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e3, code lost:
        if (r0.booleanValue() == false) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0M(X.C25668Cjy r23, X.C22746BNj r24, boolean r25) {
        /*
            r22 = this;
            r2 = r22
            X.Cw7 r0 = r2.A01
            r6 = r24
            java.lang.String r4 = r6.A01
            X.BNy r5 = r0.A0A(r4)
            r8 = r25
            if (r5 != 0) goto L_0x002e
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            if (r25 == 0) goto L_0x002b
            java.lang.String r0 = "Fill"
        L_0x0018:
            r3 = 0
            X.AnonymousClass8BS.A1B(r0, r4, r1)
            java.lang.String r0 = "%s reference '%s' not found"
            A0k(r0, r1)
            X.DRv r1 = r6.A00
            X.Ciu r0 = r2.A02
            if (r1 == 0) goto L_0x01d7
            A0e(r1, r0, r8)
        L_0x002a:
            return
        L_0x002b:
            java.lang.String r0 = "Stroke"
            goto L_0x0018
        L_0x002e:
            boolean r0 = r5 instanceof X.BNK
            r4 = r23
            if (r0 == 0) goto L_0x00cc
            X.BNK r5 = (X.BNK) r5
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x003d
            r2.A0P(r5, r0)
        L_0x003d:
            java.lang.Boolean r0 = r5.A01
            r3 = 1
            r10 = 0
            if (r0 == 0) goto L_0x004a
            boolean r0 = r0.booleanValue()
            r9 = 1
            if (r0 != 0) goto L_0x004b
        L_0x004a:
            r9 = 0
        L_0x004b:
            X.Ciu r1 = r2.A02
            if (r25 == 0) goto L_0x00c9
            android.graphics.Paint r0 = r1.A00
        L_0x0051:
            if (r9 == 0) goto L_0x009b
            X.Cjy r6 = r1.A02
            if (r6 != 0) goto L_0x0059
            X.Cjy r6 = r1.A03
        L_0x0059:
            X.DS0 r1 = r5.A00
            float r15 = A01(r1, r2)
            X.DS0 r1 = r5.A02
            float r16 = A00(r1, r2)
            X.DS0 r1 = r5.A01
            if (r1 == 0) goto L_0x0098
            float r6 = r1.A02(r2)
        L_0x006d:
            X.DS0 r1 = r5.A03
            if (r1 == 0) goto L_0x00c6
            float r18 = r1.A03(r2)
        L_0x0075:
            A0j(r2)
            A0d(r5, r2)
            android.graphics.Matrix r7 = A05(r4, r9)
            android.graphics.Matrix r1 = r5.A00
            if (r1 == 0) goto L_0x0086
            r7.preConcat(r1)
        L_0x0086:
            java.util.List r1 = r5.A04
            int r9 = r1.size()
            if (r9 != 0) goto L_0x01e2
            A0i(r2)
            X.Ciu r0 = r2.A02
            if (r25 == 0) goto L_0x01df
            r0.A05 = r10
            return
        L_0x0098:
            float r6 = r6.A03
            goto L_0x006d
        L_0x009b:
            X.DS0 r1 = r5.A00
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x00c4
            float r15 = r1.A04(r2, r7)
        L_0x00a5:
            X.DS0 r1 = r5.A02
            if (r1 == 0) goto L_0x00c1
            float r16 = r1.A04(r2, r7)
        L_0x00ad:
            X.DS0 r1 = r5.A01
            if (r1 == 0) goto L_0x00be
            float r6 = r1.A04(r2, r7)
        L_0x00b5:
            X.DS0 r1 = r5.A03
            if (r1 == 0) goto L_0x00c6
            float r18 = r1.A04(r2, r7)
            goto L_0x0075
        L_0x00be:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b5
        L_0x00c1:
            r16 = 0
            goto L_0x00ad
        L_0x00c4:
            r15 = 0
            goto L_0x00a5
        L_0x00c6:
            r18 = 0
            goto L_0x0075
        L_0x00c9:
            android.graphics.Paint r0 = r1.A01
            goto L_0x0051
        L_0x00cc:
            boolean r0 = r5 instanceof X.BNL
            if (r0 == 0) goto L_0x0164
            X.BNL r5 = (X.BNL) r5
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x00d9
            r2.A0P(r5, r0)
        L_0x00d9:
            java.lang.Boolean r0 = r5.A01
            r7 = 0
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r0.booleanValue()
            r6 = 1
            if (r0 != 0) goto L_0x00e6
        L_0x00e5:
            r6 = 0
        L_0x00e6:
            X.Ciu r0 = r2.A02
            if (r25 == 0) goto L_0x0161
            android.graphics.Paint r0 = r0.A00
        L_0x00ec:
            if (r6 == 0) goto L_0x013d
            r9 = 1112014848(0x42480000, float:50.0)
            java.lang.Integer r1 = X.AnonymousClass00R.A18
            X.DS0 r3 = new X.DS0
            r3.<init>(r1, r9)
            X.DS0 r1 = r5.A00
            if (r1 == 0) goto L_0x0138
            float r11 = r1.A02(r2)
        L_0x00ff:
            X.DS0 r1 = r5.A01
            if (r1 == 0) goto L_0x0133
            float r12 = r1.A03(r2)
        L_0x0107:
            X.DS0 r1 = r5.A04
            if (r1 == 0) goto L_0x010c
            r3 = r1
        L_0x010c:
            float r13 = r3.A01(r2)
        L_0x0110:
            A0j(r2)
            A0d(r5, r2)
            android.graphics.Matrix r4 = A05(r4, r6)
            android.graphics.Matrix r1 = r5.A00
            if (r1 == 0) goto L_0x0121
            r4.preConcat(r1)
        L_0x0121:
            java.util.List r1 = r5.A04
            int r3 = r1.size()
            if (r3 != 0) goto L_0x023d
            A0i(r2)
            X.Ciu r0 = r2.A02
            if (r25 == 0) goto L_0x023a
            r0.A05 = r7
            return
        L_0x0133:
            float r12 = r3.A03(r2)
            goto L_0x0107
        L_0x0138:
            float r11 = r3.A02(r2)
            goto L_0x00ff
        L_0x013d:
            X.DS0 r1 = r5.A00
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x015b
            float r11 = r1.A04(r2, r3)
        L_0x0147:
            X.DS0 r1 = r5.A01
            if (r1 == 0) goto L_0x0158
            float r12 = r1.A04(r2, r3)
        L_0x014f:
            X.DS0 r1 = r5.A04
            if (r1 == 0) goto L_0x015e
            float r13 = r1.A04(r2, r3)
            goto L_0x0110
        L_0x0158:
            r12 = 1056964608(0x3f000000, float:0.5)
            goto L_0x014f
        L_0x015b:
            r11 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0147
        L_0x015e:
            r13 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0110
        L_0x0161:
            android.graphics.Paint r0 = r0.A01
            goto L_0x00ec
        L_0x0164:
            boolean r0 = r5 instanceof X.C22742BNf
            if (r0 == 0) goto L_0x002a
            r10 = 1
            r6 = 6442450944(0x180000000, double:3.1829936864E-314)
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            r0 = 2147483648(0x80000000, double:1.0609978955E-314)
            X.DS2 r9 = r5.A00
            boolean r0 = A0m(r9, r0)
            if (r25 == 0) goto L_0x01ad
            if (r0 == 0) goto L_0x018f
            X.Ciu r5 = r2.A02
            X.DS2 r1 = r5.A04
            X.DRv r0 = r9.A07
            r1.A06 = r0
            if (r0 != 0) goto L_0x018d
            r10 = 0
        L_0x018d:
            r5.A05 = r10
        L_0x018f:
            boolean r0 = A0m(r9, r3)
            if (r0 == 0) goto L_0x019d
            X.Ciu r0 = r2.A02
            X.DS2 r1 = r0.A04
            java.lang.Float r0 = r9.A0G
            r1.A0E = r0
        L_0x019d:
            boolean r0 = A0m(r9, r6)
            if (r0 == 0) goto L_0x002a
            X.Ciu r1 = r2.A02
            X.DS2 r0 = r1.A04
            X.DRv r0 = r0.A06
        L_0x01a9:
            A0e(r0, r1, r8)
            return
        L_0x01ad:
            if (r0 == 0) goto L_0x01bc
            X.Ciu r5 = r2.A02
            X.DS2 r1 = r5.A04
            X.DRv r0 = r9.A07
            r1.A09 = r0
            if (r0 != 0) goto L_0x01ba
            r10 = 0
        L_0x01ba:
            r5.A06 = r10
        L_0x01bc:
            boolean r0 = A0m(r9, r3)
            if (r0 == 0) goto L_0x01ca
            X.Ciu r0 = r2.A02
            X.DS2 r1 = r0.A04
            java.lang.Float r0 = r9.A0G
            r1.A0J = r0
        L_0x01ca:
            boolean r0 = A0m(r9, r6)
            if (r0 == 0) goto L_0x002a
            X.Ciu r1 = r2.A02
            X.DS2 r0 = r1.A04
            X.DRv r0 = r0.A09
            goto L_0x01a9
        L_0x01d7:
            if (r25 == 0) goto L_0x01dc
            r0.A05 = r3
            return
        L_0x01dc:
            r0.A06 = r3
            return
        L_0x01df:
            r0.A06 = r10
            return
        L_0x01e2:
            int[] r8 = new int[r9]
            float[] r4 = new float[r9]
            java.util.List r1 = r5.A04
            java.util.Iterator r14 = r1.iterator()
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x01ee:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x02bd
            java.lang.Object r11 = r14.next()
            X.C5y r11 = (X.C24482C5y) r11
            X.BNg r11 = (X.C22743BNg) r11
            java.lang.Float r1 = r11.A00
            if (r1 == 0) goto L_0x0238
            float r12 = r1.floatValue()
        L_0x0204:
            if (r10 == 0) goto L_0x0234
            int r1 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x0234
            r4[r10] = r13
        L_0x020c:
            A0j(r2)
            X.Ciu r1 = r2.A02
            r2.A0a(r11, r1)
            X.Ciu r1 = r2.A02
            X.DS2 r12 = r1.A04
            X.DRv r1 = r12.A08
            X.BNk r1 = (X.C22747BNk) r1
            if (r1 != 0) goto L_0x0220
            X.BNk r1 = X.C22747BNk.A01
        L_0x0220:
            int r11 = r1.A00
            java.lang.Float r1 = r12.A0H
            float r1 = r1.floatValue()
            int r1 = A03(r11, r1)
            r8[r10] = r1
            int r10 = r10 + 1
            A0i(r2)
            goto L_0x01ee
        L_0x0234:
            r4[r10] = r12
            r13 = r12
            goto L_0x020c
        L_0x0238:
            r12 = 0
            goto L_0x0204
        L_0x023a:
            r0.A06 = r7
            return
        L_0x023d:
            int[] r14 = new int[r3]
            float[] r15 = new float[r3]
            java.util.List r1 = r5.A04
            java.util.Iterator r10 = r1.iterator()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0249:
            boolean r1 = r10.hasNext()
            r8 = 0
            if (r1 == 0) goto L_0x0294
            java.lang.Object r6 = r10.next()
            X.C5y r6 = (X.C24482C5y) r6
            X.BNg r6 = (X.C22743BNg) r6
            java.lang.Float r1 = r6.A00
            if (r1 == 0) goto L_0x0260
            float r8 = r1.floatValue()
        L_0x0260:
            if (r7 == 0) goto L_0x0290
            int r1 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x0290
            r15[r7] = r9
        L_0x0268:
            A0j(r2)
            X.Ciu r1 = r2.A02
            r2.A0a(r6, r1)
            X.Ciu r1 = r2.A02
            X.DS2 r8 = r1.A04
            X.DRv r1 = r8.A08
            X.BNk r1 = (X.C22747BNk) r1
            if (r1 != 0) goto L_0x027c
            X.BNk r1 = X.C22747BNk.A01
        L_0x027c:
            int r6 = r1.A00
            java.lang.Float r1 = r8.A0H
            float r1 = r1.floatValue()
            int r1 = A03(r6, r1)
            r14[r7] = r1
            int r7 = r7 + 1
            A0i(r2)
            goto L_0x0249
        L_0x0290:
            r15[r7] = r8
            r9 = r8
            goto L_0x0268
        L_0x0294:
            int r1 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0314
            r1 = 1
            if (r3 == r1) goto L_0x0314
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.CLAMP
            java.lang.Integer r3 = r5.A02
            if (r3 == 0) goto L_0x02a7
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            if (r3 != r1) goto L_0x02b6
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.MIRROR
        L_0x02a7:
            A0i(r2)
            android.graphics.RadialGradient r10 = new android.graphics.RadialGradient
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r10.setLocalMatrix(r4)
            r0.setShader(r10)
            goto L_0x02e7
        L_0x02b6:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            if (r3 != r1) goto L_0x02a7
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x02a7
        L_0x02bd:
            int r1 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x02c5
            int r1 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r1 == 0) goto L_0x030a
        L_0x02c5:
            if (r9 == r3) goto L_0x030a
            android.graphics.Shader$TileMode r21 = android.graphics.Shader.TileMode.CLAMP
            java.lang.Integer r3 = r5.A02
            if (r3 == 0) goto L_0x02d3
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            if (r3 != r1) goto L_0x0303
            android.graphics.Shader$TileMode r21 = android.graphics.Shader.TileMode.MIRROR
        L_0x02d3:
            A0i(r2)
            android.graphics.LinearGradient r14 = new android.graphics.LinearGradient
            r19 = r8
            r20 = r4
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r14.setLocalMatrix(r7)
            r0.setShader(r14)
        L_0x02e7:
            X.Ciu r1 = r2.A02
            X.DS2 r1 = r1.A04
            java.lang.Float r1 = r1.A0E
            float r2 = r1.floatValue()
            r1 = 1132462080(0x43800000, float:256.0)
            float r2 = r2 * r1
            int r2 = (int) r2
            if (r2 >= 0) goto L_0x02fc
            r2 = 0
        L_0x02f8:
            r0.setAlpha(r2)
            return
        L_0x02fc:
            r1 = 255(0xff, float:3.57E-43)
            if (r2 <= r1) goto L_0x02f8
            r2 = 255(0xff, float:3.57E-43)
            goto L_0x02f8
        L_0x0303:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            if (r3 != r1) goto L_0x02d3
            android.graphics.Shader$TileMode r21 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x02d3
        L_0x030a:
            A0i(r2)
            int r9 = r9 - r3
            r1 = r8[r9]
            r0.setColor(r1)
            return
        L_0x0314:
            A0i(r2)
            r1 = 1
            int r3 = r3 - r1
            r1 = r14[r3]
            r0.setColor(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26304CxN.A0M(X.Cjy, X.BNj, boolean):void");
    }

    private void A0N(C25668Cjy cjy, C22741BNe bNe) {
        Path A062;
        if (this.A02.A04.A0W != null && (A062 = A06(cjy, bNe)) != null) {
            this.A00.clipPath(A062);
        }
    }

    public static void A0O(C25668Cjy cjy, C25614Ciu ciu, C26304CxN cxN) {
        if (!ciu.A04.A0C.booleanValue()) {
            cxN.A0H(cjy.A01, cjy.A02, cjy.A03, cjy.A00);
        }
    }

    private void A0P(C22744BNh bNh, String str) {
        C22761BNy A0A = bNh.A01.A0A(str);
        if (A0A == null) {
            BE7.A1M("Gradient reference '%s' not found", "SVGAndroidRenderer", new Object[]{str});
        } else if (!(A0A instanceof C22744BNh)) {
            A0k("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (A0A == bNh) {
            A0k("Circular reference in gradient href attribute '%s'", str);
        } else {
            C22744BNh bNh2 = (C22744BNh) A0A;
            if (bNh.A01 == null) {
                bNh.A01 = bNh2.A01;
            }
            if (bNh.A00 == null) {
                bNh.A00 = bNh2.A00;
            }
            if (bNh.A02 == null) {
                bNh.A02 = bNh2.A02;
            }
            if (bNh.A04.isEmpty()) {
                bNh.A04 = bNh2.A04;
            }
            try {
                if (bNh instanceof BNK) {
                    BNK bnk = (BNK) bNh;
                    BNK bnk2 = (BNK) A0A;
                    if (bnk.A00 == null) {
                        bnk.A00 = bnk2.A00;
                    }
                    if (bnk.A02 == null) {
                        bnk.A02 = bnk2.A02;
                    }
                    if (bnk.A01 == null) {
                        bnk.A01 = bnk2.A01;
                    }
                    if (bnk.A03 == null) {
                        bnk.A03 = bnk2.A03;
                    }
                } else {
                    BNL bnl = (BNL) bNh;
                    BNL bnl2 = (BNL) A0A;
                    if (bnl.A00 == null) {
                        bnl.A00 = bnl2.A00;
                    }
                    if (bnl.A01 == null) {
                        bnl.A01 = bnl2.A01;
                    }
                    if (bnl.A04 == null) {
                        bnl.A04 = bnl2.A04;
                    }
                    if (bnl.A02 == null) {
                        bnl.A02 = bnl2.A02;
                    }
                    if (bnl.A03 == null) {
                        bnl.A03 = bnl2.A03;
                    }
                }
            } catch (ClassCastException unused) {
            }
            String str2 = bNh2.A03;
            if (str2 != null) {
                A0P(bNh, str2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0Q(X.C22738BNb r25) {
        /*
            r24 = this;
            r9 = r25
            r3 = r24
            X.Ciu r0 = r3.A02
            X.DS2 r1 = r0.A04
            java.lang.String r4 = r1.A0Z
            if (r4 != 0) goto L_0x0015
            java.lang.String r0 = r1.A0Y
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = r1.A0X
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            return
        L_0x0015:
            java.lang.String r7 = "Marker reference '%s' not found"
            r16 = 0
            r2 = 0
            r1 = 1
            if (r4 == 0) goto L_0x01d6
            X.Cw7 r0 = r9.A01
            X.BNy r6 = r0.A0A(r4)
            if (r6 == 0) goto L_0x01c9
            X.BNn r6 = (X.C22750BNn) r6
        L_0x0027:
            X.Ciu r0 = r3.A02
            X.DS2 r0 = r0.A04
            java.lang.String r4 = r0.A0Y
            if (r4 == 0) goto L_0x01c5
            X.Cw7 r0 = r9.A01
            X.BNy r5 = r0.A0A(r4)
            if (r5 == 0) goto L_0x01b8
            X.BNn r5 = (X.C22750BNn) r5
        L_0x0039:
            X.Ciu r0 = r3.A02
            X.DS2 r0 = r0.A04
            java.lang.String r4 = r0.A0X
            if (r4 == 0) goto L_0x01b4
            X.Cw7 r0 = r9.A01
            X.BNy r4 = r0.A0A(r4)
            if (r4 == 0) goto L_0x01a7
            X.BNn r4 = (X.C22750BNn) r4
        L_0x004b:
            boolean r0 = r9 instanceof X.BNM
            if (r0 == 0) goto L_0x00df
            X.BNM r9 = (X.BNM) r9
            X.D8X r7 = r9.A00
            X.D8W r0 = new X.D8W
            r0.<init>(r7, r3)
            java.util.List r0 = r0.A04
        L_0x005a:
            int r8 = r0.size()
            if (r8 == 0) goto L_0x0014
            X.Ciu r7 = r3.A02
            X.DS2 r9 = r7.A04
            r7 = r16
            r9.A0X = r7
            r9.A0Y = r7
            r9.A0Z = r7
            if (r6 == 0) goto L_0x0077
            java.lang.Object r7 = r0.get(r2)
            X.CbJ r7 = (X.C25223CbJ) r7
            r3.A0R(r6, r7)
        L_0x0077:
            if (r5 == 0) goto L_0x01da
            int r7 = r0.size()
            r6 = 2
            if (r7 <= r6) goto L_0x01da
            java.lang.Object r13 = r0.get(r2)
            X.CbJ r13 = (X.C25223CbJ) r13
            java.lang.Object r9 = r0.get(r1)
            X.CbJ r9 = (X.C25223CbJ) r9
            r7 = 1
        L_0x008d:
            int r2 = r8 + -1
            if (r7 >= r2) goto L_0x01da
            int r2 = r7 + 1
            java.lang.Object r6 = r0.get(r2)
            X.CbJ r6 = (X.C25223CbJ) r6
            boolean r2 = r9.A04
            if (r2 == 0) goto L_0x00d0
            float r11 = r9.A00
            float r10 = r9.A01
            float r15 = r9.A02
            float r2 = r13.A02
            float r12 = r15 - r2
            float r14 = r9.A03
            float r2 = r13.A03
            float r2 = r14 - r2
            float r12 = X.AnonymousClass000.A00(r11, r12, r10, r2)
            r13 = 0
            int r2 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00c0
            float r12 = r6.A02
            float r12 = r12 - r15
            float r2 = r6.A03
            float r2 = r2 - r14
            float r12 = X.AnonymousClass000.A00(r11, r12, r10, r2)
        L_0x00c0:
            int r2 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x00d0
            int r2 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00d8
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x00d0
            int r2 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x00d8
        L_0x00d0:
            r13 = r9
            r3.A0R(r5, r9)
            int r7 = r7 + 1
            r9 = r6
            goto L_0x008d
        L_0x00d8:
            float r2 = -r11
            r9.A00 = r2
            float r2 = -r10
            r9.A01 = r2
            goto L_0x00d0
        L_0x00df:
            boolean r0 = r9 instanceof X.BNP
            if (r0 == 0) goto L_0x0121
            X.BNP r9 = (X.BNP) r9
            X.DS0 r0 = r9.A00
            float r10 = A01(r0, r3)
            X.DS0 r0 = r9.A02
            float r11 = A00(r0, r3)
            X.DS0 r0 = r9.A01
            float r19 = A01(r0, r3)
            X.DS0 r0 = r9.A03
            float r20 = A00(r0, r3)
            r0 = 2
            java.util.ArrayList r0 = X.C17880vN.A0z(r0)
            float r12 = r19 - r10
            float r13 = r20 - r11
            X.CbJ r8 = new X.CbJ
            r9 = r3
            r8.<init>(r9, r10, r11, r12, r13)
            r0.add(r8)
            X.CbJ r7 = new X.CbJ
            r17 = r7
            r18 = r3
            r21 = r12
            r22 = r13
            r17.<init>(r18, r19, r20, r21, r22)
            r0.add(r7)
            goto L_0x005a
        L_0x0121:
            X.BNW r9 = (X.BNW) r9
            float[] r12 = r9.A00
            int r0 = r12.length
            r23 = r0
            r11 = 2
            if (r0 < r11) goto L_0x0014
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r14 = r12[r2]
            r10 = r12[r1]
            r21 = 0
            X.CbJ r8 = new X.CbJ
            r19 = r14
            r20 = r10
            r22 = r21
            r17 = r8
            r18 = r3
            r17.<init>(r18, r19, r20, r21, r22)
            r13 = 0
            r7 = 0
        L_0x0146:
            r15 = r23
            if (r11 >= r15) goto L_0x016c
            r13 = r12[r11]
            int r7 = r11 + 1
            r7 = r12[r7]
            r8.A00(r13, r7)
            r0.add(r8)
            float r15 = r8.A02
            float r21 = r13 - r15
            float r8 = r8.A03
            float r22 = r7 - r8
            X.CbJ r8 = new X.CbJ
            r19 = r13
            r20 = r7
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22)
            int r11 = r11 + 2
            goto L_0x0146
        L_0x016c:
            boolean r9 = r9 instanceof X.BNV
            if (r9 == 0) goto L_0x01a2
            int r9 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x005a
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x005a
            r8.A00(r14, r10)
            r0.add(r8)
            float r7 = r8.A02
            float r21 = r14 - r7
            float r7 = r8.A03
            float r22 = r10 - r7
            X.CbJ r8 = new X.CbJ
            r19 = r14
            r20 = r10
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22)
            java.lang.Object r7 = r0.get(r2)
            X.CbJ r7 = (X.C25223CbJ) r7
            r8.A01(r7)
            r0.add(r8)
            r0.set(r2, r8)
            goto L_0x005a
        L_0x01a2:
            r0.add(r8)
            goto L_0x005a
        L_0x01a7:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            X.Ciu r0 = r3.A02
            X.DS2 r0 = r0.A04
            java.lang.String r0 = r0.A0X
            r4[r2] = r0
            A0k(r7, r4)
        L_0x01b4:
            r4 = r16
            goto L_0x004b
        L_0x01b8:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            X.Ciu r0 = r3.A02
            X.DS2 r0 = r0.A04
            java.lang.String r0 = r0.A0Y
            r4[r2] = r0
            A0k(r7, r4)
        L_0x01c5:
            r5 = r16
            goto L_0x0039
        L_0x01c9:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            X.Ciu r0 = r3.A02
            X.DS2 r0 = r0.A04
            java.lang.String r0 = r0.A0Z
            r4[r2] = r0
            A0k(r7, r4)
        L_0x01d6:
            r6 = r16
            goto L_0x0027
        L_0x01da:
            if (r4 == 0) goto L_0x0014
            int r8 = r8 - r1
            java.lang.Object r0 = r0.get(r8)
            X.CbJ r0 = (X.C25223CbJ) r0
            r3.A0R(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26304CxN.A0Q(X.BNb):void");
    }

    private void A0U(C22751BNo bNo, String str) {
        C22761BNy A0A = bNo.A01.A0A(str);
        if (A0A == null) {
            BE7.A1M("Pattern reference '%s' not found", "SVGAndroidRenderer", new Object[]{str});
        } else if (!(A0A instanceof C22751BNo)) {
            A0k("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (A0A == bNo) {
            A0k("Circular reference in pattern href attribute '%s'", str);
        } else {
            C22751BNo bNo2 = (C22751BNo) A0A;
            if (bNo.A06 == null) {
                bNo.A06 = bNo2.A06;
            }
            if (bNo.A05 == null) {
                bNo.A05 = bNo2.A05;
            }
            if (bNo.A00 == null) {
                bNo.A00 = bNo2.A00;
            }
            if (bNo.A03 == null) {
                bNo.A03 = bNo2.A03;
            }
            if (bNo.A04 == null) {
                bNo.A04 = bNo2.A04;
            }
            if (bNo.A02 == null) {
                bNo.A02 = bNo2.A02;
            }
            if (bNo.A01 == null) {
                bNo.A01 = bNo2.A01;
            }
            if (bNo.A01.isEmpty()) {
                bNo.A01 = bNo2.A01;
            }
            if (bNo.A00 == null) {
                bNo.A00 = bNo2.A00;
            }
            if (bNo.A00 == null) {
                bNo.A00 = bNo2.A00;
            }
            String str2 = bNo2.A07;
            if (str2 != null) {
                A0U(bNo, str2);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r4 == X.C22747BNk.A02) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x028e, code lost:
        if (r6.equals(r0) == false) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0290, code lost:
        r0 = android.graphics.Typeface.SANS_SERIF;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0292, code lost:
        r1 = android.graphics.Typeface.create(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0296, code lost:
        if (r1 == null) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x021d, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (r4 == X.C22747BNk.A02) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0V(X.DS2 r12, X.C25614Ciu r13, X.C26304CxN r14) {
        /*
            r0 = 4096(0x1000, double:2.0237E-320)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x000e
            X.DS2 r1 = r13.A04
            X.BNk r0 = r12.A02
            r1.A02 = r0
        L_0x000e:
            r0 = 2048(0x800, double:1.0118E-320)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x001c
            X.DS2 r1 = r13.A04
            java.lang.Float r0 = r12.A0F
            r1.A0F = r0
        L_0x001c:
            r0 = 1
            boolean r0 = A0m(r12, r0)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0038
            X.DS2 r1 = r13.A04
            X.DRv r0 = r12.A06
            r1.A06 = r0
            X.DRv r4 = r12.A06
            if (r4 == 0) goto L_0x0035
            X.BNk r1 = X.C22747BNk.A02
            r0 = 1
            if (r4 != r1) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            r13.A05 = r0
        L_0x0038:
            r0 = 4
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0046
            X.DS2 r1 = r13.A04
            java.lang.Float r0 = r12.A0E
            r1.A0E = r0
        L_0x0046:
            r0 = 6149(0x1805, double:3.038E-320)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0055
            X.DS2 r0 = r13.A04
            X.DRv r0 = r0.A06
            A0e(r0, r13, r3)
        L_0x0055:
            r0 = 2
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0063
            X.DS2 r1 = r13.A04
            java.lang.Integer r0 = r12.A0N
            r1.A0N = r0
        L_0x0063:
            r0 = 8
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x007d
            X.DS2 r1 = r13.A04
            X.DRv r0 = r12.A09
            r1.A09 = r0
            X.DRv r4 = r12.A09
            if (r4 == 0) goto L_0x007a
            X.BNk r1 = X.C22747BNk.A02
            r0 = 1
            if (r4 != r1) goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            r13.A06 = r0
        L_0x007d:
            r0 = 16
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x008b
            X.DS2 r1 = r13.A04
            java.lang.Float r0 = r12.A0J
            r1.A0J = r0
        L_0x008b:
            r0 = 6168(0x1818, double:3.0474E-320)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x009a
            X.DS2 r0 = r13.A04
            X.DRv r0 = r0.A09
            A0e(r0, r13, r2)
        L_0x009a:
            r0 = 34359738368(0x800000000, double:1.69759663277E-313)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x00ab
            X.DS2 r1 = r13.A04
            java.lang.Integer r0 = r12.A0V
            r1.A0V = r0
        L_0x00ab:
            r0 = 32
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x00c2
            X.DS2 r1 = r13.A04
            X.DS0 r0 = r12.A05
            r1.A05 = r0
            android.graphics.Paint r1 = r13.A01
            float r0 = r0.A01(r14)
            r1.setStrokeWidth(r0)
        L_0x00c2:
            r0 = 64
            boolean r0 = A0m(r12, r0)
            r4 = 2
            if (r0 == 0) goto L_0x00e4
            X.DS2 r1 = r13.A04
            java.lang.Integer r0 = r12.A0R
            r1.A0R = r0
            java.lang.Integer r0 = r12.A0R
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x0178
            if (r0 == r3) goto L_0x0172
            if (r0 != r4) goto L_0x00e4
            android.graphics.Paint r1 = r13.A01
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
        L_0x00e1:
            r1.setStrokeCap(r0)
        L_0x00e4:
            r0 = 128(0x80, double:6.32E-322)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0105
            X.DS2 r1 = r13.A04
            java.lang.Integer r0 = r12.A0S
            r1.A0S = r0
            java.lang.Integer r0 = r12.A0S
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x016d
            if (r0 == r3) goto L_0x0168
            if (r0 != r4) goto L_0x0105
            android.graphics.Paint r1 = r13.A01
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
        L_0x0102:
            r1.setStrokeJoin(r0)
        L_0x0105:
            r0 = 256(0x100, double:1.265E-321)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x011e
            X.DS2 r1 = r13.A04
            java.lang.Float r0 = r12.A0I
            r1.A0I = r0
            android.graphics.Paint r1 = r13.A01
            java.lang.Float r0 = r12.A0I
            float r0 = r0.floatValue()
            r1.setStrokeMiter(r0)
        L_0x011e:
            r0 = 512(0x200, double:2.53E-321)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x012c
            X.DS2 r1 = r13.A04
            X.DS0[] r0 = r12.A0c
            r1.A0c = r0
        L_0x012c:
            r0 = 1024(0x400, double:5.06E-321)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x013a
            X.DS2 r1 = r13.A04
            X.DS0 r0 = r12.A04
            r1.A04 = r0
        L_0x013a:
            r0 = 1536(0x600, double:7.59E-321)
            boolean r0 = A0m(r12, r0)
            r9 = 0
            if (r0 == 0) goto L_0x0198
            X.DS2 r8 = r13.A04
            X.DS0[] r0 = r8.A0c
            if (r0 == 0) goto L_0x0402
            int r10 = r0.length
            int r0 = r10 % 2
            int r7 = r10 * 2
            if (r0 != 0) goto L_0x0151
            r7 = r10
        L_0x0151:
            float[] r5 = new float[r7]
            r11 = 0
            r4 = 0
            r6 = 0
        L_0x0156:
            if (r4 >= r7) goto L_0x017e
            X.DS0[] r1 = r8.A0c
            int r0 = r4 % r10
            r0 = r1[r0]
            float r0 = r0.A01(r14)
            r5[r4] = r0
            float r6 = r6 + r0
            int r4 = r4 + 1
            goto L_0x0156
        L_0x0168:
            android.graphics.Paint r1 = r13.A01
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L_0x0102
        L_0x016d:
            android.graphics.Paint r1 = r13.A01
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
            goto L_0x0102
        L_0x0172:
            android.graphics.Paint r1 = r13.A01
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L_0x00e1
        L_0x0178:
            android.graphics.Paint r1 = r13.A01
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            goto L_0x00e1
        L_0x017e:
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0402
            X.DS0 r0 = r8.A04
            float r4 = r0.A01(r14)
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x018e
            float r4 = r4 % r6
            float r4 = r4 + r6
        L_0x018e:
            android.graphics.Paint r1 = r13.A01
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r0.<init>(r5, r4)
            r1.setPathEffect(r0)
        L_0x0198:
            r0 = 16384(0x4000, double:8.0948E-320)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x01c4
            X.Ciu r0 = r14.A02
            android.graphics.Paint r0 = r0.A00
            float r4 = r0.getTextSize()
            X.DS2 r1 = r13.A04
            X.DS0 r0 = r12.A03
            r1.A03 = r0
            android.graphics.Paint r1 = r13.A00
            X.DS0 r0 = r12.A03
            float r0 = r0.A04(r14, r4)
            r1.setTextSize(r0)
            android.graphics.Paint r1 = r13.A01
            X.DS0 r0 = r12.A03
            float r0 = r0.A04(r14, r4)
            r1.setTextSize(r0)
        L_0x01c4:
            r0 = 8192(0x2000, double:4.0474E-320)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x01d2
            X.DS2 r1 = r13.A04
            java.util.List r0 = r12.A0b
            r1.A0b = r0
        L_0x01d2:
            r0 = 32768(0x8000, double:1.61895E-319)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x01f7
            java.lang.Integer r5 = r12.A0P
            int r1 = r5.intValue()
            r0 = -1
            r4 = 100
            if (r1 != r0) goto L_0x03e4
            X.DS2 r1 = r13.A04
            java.lang.Integer r0 = r1.A0P
            int r0 = r0.intValue()
            if (r0 <= r4) goto L_0x03fc
            int r0 = r0 - r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0P = r0
        L_0x01f7:
            r0 = 65536(0x10000, double:3.2379E-319)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0206
            X.DS2 r1 = r13.A04
            java.lang.Integer r0 = r12.A0O
            r1.A0O = r0
        L_0x0206:
            r0 = 106496(0x1a000, double:5.2616E-319)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x02a2
            X.DS2 r3 = r13.A04
            java.util.List r1 = r3.A0b
            if (r1 == 0) goto L_0x0266
            X.Cw7 r0 = r14.A01
            if (r0 == 0) goto L_0x0266
            java.util.Iterator r7 = r1.iterator()
        L_0x021d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0266
            java.lang.String r6 = X.C17880vN.A0v(r7)
            java.lang.Integer r5 = r3.A0P
            java.lang.Integer r1 = r3.A0O
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            boolean r4 = X.AnonymousClass000.A1Z(r1, r0)
            int r1 = r5.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 <= r0) goto L_0x0261
            r1 = 1
            if (r4 == 0) goto L_0x023d
            r1 = 3
        L_0x023d:
            int r0 = r6.hashCode()
            switch(r0) {
                case -1536685117: goto L_0x0288;
                case -1431958525: goto L_0x0256;
                case -1081737434: goto L_0x0253;
                case 109326717: goto L_0x0248;
                case 1126973893: goto L_0x0245;
                default: goto L_0x0244;
            }
        L_0x0244:
            goto L_0x021d
        L_0x0245:
            java.lang.String r0 = "cursive"
            goto L_0x028a
        L_0x0248:
            java.lang.String r0 = "serif"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x021d
            android.graphics.Typeface r0 = android.graphics.Typeface.SERIF
            goto L_0x0292
        L_0x0253:
            java.lang.String r0 = "fantasy"
            goto L_0x028a
        L_0x0256:
            java.lang.String r0 = "monospace"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x021d
            android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE
            goto L_0x0292
        L_0x0261:
            r1 = 0
            if (r4 == 0) goto L_0x023d
            r1 = 2
            goto L_0x023d
        L_0x0266:
            java.lang.Integer r4 = r3.A0P
            java.lang.Integer r1 = r3.A0O
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            boolean r3 = X.AnonymousClass000.A1Z(r1, r0)
            int r1 = r4.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 <= r0) goto L_0x0283
            r1 = 1
            if (r3 == 0) goto L_0x027c
            r1 = 3
        L_0x027c:
            android.graphics.Typeface r0 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r0, r1)
            goto L_0x0298
        L_0x0283:
            r1 = 0
            if (r3 == 0) goto L_0x027c
            r1 = 2
            goto L_0x027c
        L_0x0288:
            java.lang.String r0 = "sans-serif"
        L_0x028a:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x021d
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
        L_0x0292:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r0, r1)
            if (r1 == 0) goto L_0x021d
        L_0x0298:
            android.graphics.Paint r0 = r13.A00
            r0.setTypeface(r1)
            android.graphics.Paint r0 = r13.A01
            r0.setTypeface(r1)
        L_0x02a2:
            r0 = 131072(0x20000, double:6.47582E-319)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x02dc
            X.DS2 r1 = r13.A04
            java.lang.Integer r0 = r12.A0U
            r1.A0U = r0
            android.graphics.Paint r1 = r13.A00
            java.lang.Integer r0 = r12.A0U
            java.lang.Integer r4 = X.AnonymousClass00R.A0N
            boolean r0 = X.AnonymousClass000.A1Z(r0, r4)
            r1.setStrikeThruText(r0)
            java.lang.Integer r0 = r12.A0U
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            boolean r0 = X.AnonymousClass000.A1Z(r0, r3)
            r1.setUnderlineText(r0)
            android.graphics.Paint r1 = r13.A01
            java.lang.Integer r0 = r12.A0U
            boolean r0 = X.AnonymousClass000.A1Z(r0, r4)
            r1.setStrikeThruText(r0)
            java.lang.Integer r0 = r12.A0U
            if (r0 != r3) goto L_0x02d9
            r2 = 1
        L_0x02d9:
            r1.setUnderlineText(r2)
        L_0x02dc:
            r0 = 68719476736(0x1000000000, double:3.39519326554E-313)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x02ed
            X.DS2 r1 = r13.A04
            java.lang.Integer r0 = r12.A0M
            r1.A0M = r0
        L_0x02ed:
            r0 = 262144(0x40000, double:1.295163E-318)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x02fc
            X.DS2 r1 = r13.A04
            java.lang.Integer r0 = r12.A0T
            r1.A0T = r0
        L_0x02fc:
            r0 = 524288(0x80000, double:2.590327E-318)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x030b
            X.DS2 r1 = r13.A04
            java.lang.Boolean r0 = r12.A0C
            r1.A0C = r0
        L_0x030b:
            r0 = 2097152(0x200000, double:1.0361308E-317)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x031a
            X.DS2 r1 = r13.A04
            java.lang.String r0 = r12.A0Z
            r1.A0Z = r0
        L_0x031a:
            r0 = 4194304(0x400000, double:2.0722615E-317)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0329
            X.DS2 r1 = r13.A04
            java.lang.String r0 = r12.A0Y
            r1.A0Y = r0
        L_0x0329:
            r0 = 8388608(0x800000, double:4.144523E-317)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0338
            X.DS2 r1 = r13.A04
            java.lang.String r0 = r12.A0X
            r1.A0X = r0
        L_0x0338:
            r0 = 16777216(0x1000000, double:8.289046E-317)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0347
            X.DS2 r1 = r13.A04
            java.lang.Boolean r0 = r12.A0B
            r1.A0B = r0
        L_0x0347:
            r0 = 33554432(0x2000000, double:1.6578092E-316)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0356
            X.DS2 r1 = r13.A04
            java.lang.Boolean r0 = r12.A0D
            r1.A0D = r0
        L_0x0356:
            r0 = 1048576(0x100000, double:5.180654E-318)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0365
            X.DS2 r1 = r13.A04
            X.C5W r0 = r12.A01
            r1.A01 = r0
        L_0x0365:
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0374
            X.DS2 r1 = r13.A04
            java.lang.String r0 = r12.A0W
            r1.A0W = r0
        L_0x0374:
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0383
            X.DS2 r1 = r13.A04
            java.lang.Integer r0 = r12.A0L
            r1.A0L = r0
        L_0x0383:
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x0392
            X.DS2 r1 = r13.A04
            java.lang.String r0 = r12.A0a
            r1.A0a = r0
        L_0x0392:
            r0 = 67108864(0x4000000, double:3.31561842E-316)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x03a1
            X.DS2 r1 = r13.A04
            X.DRv r0 = r12.A08
            r1.A08 = r0
        L_0x03a1:
            r0 = 134217728(0x8000000, double:6.63123685E-316)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x03b0
            X.DS2 r1 = r13.A04
            java.lang.Float r0 = r12.A0H
            r1.A0H = r0
        L_0x03b0:
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x03c1
            X.DS2 r1 = r13.A04
            X.DRv r0 = r12.A0A
            r1.A0A = r0
        L_0x03c1:
            r0 = 17179869184(0x400000000, double:8.4879831639E-314)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x03d2
            X.DS2 r1 = r13.A04
            java.lang.Float r0 = r12.A0K
            r1.A0K = r0
        L_0x03d2:
            r0 = 137438953472(0x2000000000, double:6.7903865311E-313)
            boolean r0 = A0m(r12, r0)
            if (r0 == 0) goto L_0x03e3
            X.DS2 r1 = r13.A04
            java.lang.Integer r0 = r12.A0Q
            r1.A0Q = r0
        L_0x03e3:
            return
        L_0x03e4:
            if (r1 != r3) goto L_0x03fc
            X.DS2 r3 = r13.A04
            java.lang.Integer r0 = r3.A0P
            int r1 = r0.intValue()
            r0 = 900(0x384, float:1.261E-42)
            if (r1 >= r0) goto L_0x03fc
            int r0 = r1 + 100
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0P = r0
            goto L_0x01f7
        L_0x03fc:
            X.DS2 r0 = r13.A04
            r0.A0P = r5
            goto L_0x01f7
        L_0x0402:
            android.graphics.Paint r0 = r13.A01
            r0.setPathEffect(r9)
            goto L_0x0198
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26304CxN.A0V(X.DS2, X.Ciu, X.CxN):void");
    }

    private void A0W(E7L e7l, boolean z) {
        if (z) {
            this.A04.push(e7l);
            this.A03.push(this.A00.getMatrix());
        }
        for (C24482C5y A0b : e7l.BOi()) {
            A0b(A0b);
        }
        if (z) {
            this.A04.pop();
            this.A03.pop();
        }
    }

    private void A0X(C22741BNe bNe) {
        C27070DRv dRv = this.A02.A04.A06;
        if (dRv instanceof C22746BNj) {
            A0M(bNe.A00, (C22746BNj) dRv, true);
        }
        C27070DRv dRv2 = this.A02.A04.A09;
        if (dRv2 instanceof C22746BNj) {
            A0M(bNe.A00, (C22746BNj) dRv2, false);
        }
    }

    private void A0Y(C22741BNe bNe) {
        if (this.A02.A04.A0a != null) {
            Paint A062 = AnonymousClass3MW.A06();
            C108965cb.A11(A062, PorterDuff.Mode.DST_IN);
            Canvas canvas = this.A00;
            canvas.saveLayer((RectF) null, A062, 31);
            Paint A063 = AnonymousClass3MW.A06();
            A063.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer((RectF) null, A063, 31);
            C22737BNa bNa = (C22737BNa) this.A01.A0A(this.A02.A04.A0a);
            A0S(bNa, bNe);
            canvas.restore();
            Paint A064 = AnonymousClass3MW.A06();
            C108965cb.A11(A064, PorterDuff.Mode.DST_IN);
            canvas.saveLayer((RectF) null, A064, 31);
            A0S(bNa, bNe);
            canvas.restore();
            canvas.restore();
        }
        A0i(this);
    }

    private void A0Z(C22741BNe bNe) {
        if (bNe.A00 != null && bNe.A00 != null) {
            Matrix A0J = C108945cZ.A0J();
            if (((Matrix) this.A03.peek()).invert(A0J)) {
                float[] fArr = new float[8];
                C25668Cjy cjy = bNe.A00;
                float f = cjy.A01;
                fArr[0] = f;
                float f2 = cjy.A02;
                fArr[1] = f2;
                float f3 = cjy.A03 + f;
                int i = 2;
                fArr[2] = f3;
                BE9.A1N(fArr, f2, f3);
                float f4 = f2 + cjy.A00;
                fArr[5] = f4;
                fArr[6] = f;
                fArr[7] = f4;
                A0J.preConcat(this.A00.getMatrix());
                A0J.mapPoints(fArr);
                float f5 = fArr[0];
                float f6 = fArr[1];
                RectF rectF = new RectF(f5, f6, f5, f6);
                do {
                    if (fArr[i] < rectF.left) {
                        rectF.left = fArr[i];
                    }
                    if (fArr[i] > rectF.right) {
                        rectF.right = fArr[i];
                    }
                    if (fArr[i + 1] < rectF.top) {
                        rectF.top = fArr[i + 1];
                    }
                    if (fArr[i + 1] > rectF.bottom) {
                        rectF.bottom = fArr[i + 1];
                    }
                    i += 2;
                } while (i <= 6);
                C22741BNe bNe2 = (C22741BNe) this.A04.peek();
                C25668Cjy cjy2 = bNe2.A00;
                float f7 = rectF.left;
                float f8 = rectF.top;
                C25668Cjy cjy3 = new C25668Cjy(f7, f8, rectF.right - f7, rectF.bottom - f8);
                if (cjy2 == null) {
                    bNe2.A00 = cjy3;
                    return;
                }
                float f9 = cjy3.A01;
                float f10 = cjy2.A01;
                if (f9 < f10) {
                    cjy2.A01 = f9;
                    f10 = f9;
                }
                float f11 = cjy3.A02;
                float f12 = cjy2.A02;
                if (f11 < f12) {
                    cjy2.A02 = f11;
                    f12 = f11;
                }
                float f13 = cjy3.A01 + cjy3.A03;
                if (f13 > cjy2.A03 + f10) {
                    cjy2.A03 = f13 - f10;
                }
                float f14 = cjy3.A02 + cjy3.A00;
                if (f14 > cjy2.A00 + f12) {
                    cjy2.A00 = f14 - f12;
                }
            }
        }
    }

    private void A0a(C22761BNy bNy, C25614Ciu ciu) {
        boolean A1X = AnonymousClass000.A1X(bNy.A00);
        DS2 ds2 = ciu.A04;
        Boolean bool = Boolean.TRUE;
        ds2.A0B = bool;
        if (!A1X) {
            bool = Boolean.FALSE;
        }
        ds2.A0C = bool;
        ds2.A01 = null;
        ds2.A0W = null;
        Float valueOf = Float.valueOf(1.0f);
        ds2.A0F = valueOf;
        ds2.A08 = C22747BNk.A01;
        ds2.A0H = valueOf;
        ds2.A0a = null;
        ds2.A07 = null;
        ds2.A0G = valueOf;
        ds2.A0A = null;
        ds2.A0K = valueOf;
        ds2.A0V = AnonymousClass00R.A00;
        DS2 ds22 = bNy.A00;
        if (ds22 != null) {
            A0V(ds22, ciu, this);
        }
        List list = this.A01.A00.A00;
        if (list != null && !list.isEmpty()) {
            for (C63 c63 : this.A01.A00.A00) {
                if (C26255Cvz.A03((C24424C2z) null, c63.A00, bNy)) {
                    A0V(c63.A01, ciu, this);
                }
            }
        }
        DS2 ds23 = bNy.A01;
        if (ds23 != null) {
            A0V(ds23, ciu, this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.BNw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: X.BNP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: X.BNO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: X.BNN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: X.BNW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: X.BNW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: X.BNQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: X.BNM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: X.BNW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: X.BNq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: X.BNW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: X.BNW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: X.BNW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: X.BNW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: X.BNW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: X.BNW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: X.BNW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: X.BNW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: X.BNW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: X.BNW} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0265, code lost:
        if (r8 != false) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x034e, code lost:
        if (r3 != false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03bd, code lost:
        if (r2 != false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x040f, code lost:
        if (r1 != false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04d5, code lost:
        if (r0 != false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c7, code lost:
        if (r6 == false) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0253, code lost:
        if (r1 != false) goto L_0x0267;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0b(X.C24482C5y r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.E0V
            if (r0 != 0) goto L_0x0036
            A0j(r11)
            boolean r0 = r12 instanceof X.C22761BNy
            if (r0 == 0) goto L_0x001a
            r0 = r12
            X.BNy r0 = (X.C22761BNy) r0
            java.lang.Boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001a
            X.Ciu r1 = r11.A02
            boolean r0 = r0.booleanValue()
            r1.A07 = r0
        L_0x001a:
            boolean r0 = r12 instanceof X.C22749BNm
            if (r0 == 0) goto L_0x0037
            X.BNm r12 = (X.C22749BNm) r12
            X.DS0 r3 = r12.A02
            X.DS0 r2 = r12.A03
            X.DS0 r1 = r12.A01
            X.DS0 r0 = r12.A00
            X.Cjy r2 = r11.A0D(r3, r2, r1, r0)
            X.Cjy r1 = r12.A00
            X.CYV r0 = r12.A00
            A0L(r0, r2, r1, r12, r11)
        L_0x0033:
            A0i(r11)
        L_0x0036:
            return
        L_0x0037:
            boolean r0 = r12 instanceof X.BNS
            if (r0 == 0) goto L_0x0144
            X.BNS r12 = (X.BNS) r12
            r2 = 0
            X.DS0 r0 = r12.A01
            if (r0 == 0) goto L_0x004a
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x004a
            goto L_0x0033
        L_0x004a:
            X.DS0 r0 = r12.A00
            if (r0 == 0) goto L_0x0056
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0056
            goto L_0x0033
        L_0x0056:
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            X.Cw7 r1 = r12.A01
            java.lang.String r0 = r12.A04
            X.BNy r3 = r1.A0A(r0)
            if (r3 != 0) goto L_0x0074
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            java.lang.String r0 = r12.A04
            r1[r2] = r0
            java.lang.String r0 = "Use reference '%s' not found"
            A0k(r0, r1)
            goto L_0x0033
        L_0x0074:
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            X.DS0 r0 = r12.A02
            r2 = 0
            float r1 = A01(r0, r11)
            X.DS0 r0 = r12.A03
            if (r0 == 0) goto L_0x0088
            float r2 = r0.A03(r11)
        L_0x0088:
            android.graphics.Canvas r0 = r11.A00
            r0.translate(r1, r2)
            boolean r6 = A0n(r12, r11)
            java.util.Stack r0 = r11.A04
            r0.push(r12)
            java.util.Stack r1 = r11.A03
            android.graphics.Canvas r0 = r11.A00
            android.graphics.Matrix r0 = r0.getMatrix()
            r1.push(r0)
            boolean r0 = r3 instanceof X.C22749BNm
            r5 = 0
            if (r0 == 0) goto L_0x00cb
            X.BNm r3 = (X.C22749BNm) r3
            X.DS0 r1 = r12.A01
            X.DS0 r0 = r12.A00
            X.Cjy r2 = r11.A0D(r5, r5, r1, r0)
            A0j(r11)
            X.Cjy r1 = r3.A00
            X.CYV r0 = r3.A00
            A0L(r0, r2, r1, r3, r11)
        L_0x00ba:
            A0i(r11)
        L_0x00bd:
            java.util.Stack r0 = r11.A04
            r0.pop()
            java.util.Stack r0 = r11.A03
            r0.pop()
            if (r6 == 0) goto L_0x026a
            goto L_0x0267
        L_0x00cb:
            boolean r0 = r3 instanceof X.C22754BNr
            if (r0 == 0) goto L_0x013f
            X.DS0 r4 = r12.A01
            r2 = 1120403456(0x42c80000, float:100.0)
            if (r4 != 0) goto L_0x00dc
            java.lang.Integer r0 = X.AnonymousClass00R.A18
            X.DS0 r4 = new X.DS0
            r4.<init>(r0, r2)
        L_0x00dc:
            X.DS0 r1 = r12.A00
            if (r1 != 0) goto L_0x00e7
            java.lang.Integer r0 = X.AnonymousClass00R.A18
            X.DS0 r1 = new X.DS0
            r1.<init>(r0, r2)
        L_0x00e7:
            X.Cjy r2 = r11.A0D(r5, r5, r4, r1)
            A0j(r11)
            X.BNp r3 = (X.C22752BNp) r3
            float r0 = r2.A03
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ba
            float r0 = r2.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ba
            X.CYV r4 = r3.A00
            if (r4 != 0) goto L_0x0103
            X.CYV r4 = X.CYV.A02
        L_0x0103:
            X.Ciu r0 = r11.A02
            r11.A0a(r3, r0)
            X.Ciu r0 = r11.A02
            r0.A03 = r2
            A0O(r2, r0, r11)
            X.Cjy r1 = r3.A00
            android.graphics.Canvas r2 = r11.A00
            X.Ciu r0 = r11.A02
            X.Cjy r0 = r0.A03
            if (r1 == 0) goto L_0x0137
            android.graphics.Matrix r0 = A04(r4, r0, r1)
            r2.concat(r0)
            X.Ciu r1 = r11.A02
            X.Cjy r0 = r3.A00
            r1.A02 = r0
        L_0x0126:
            boolean r1 = r11.A0l()
            r0 = 1
            r11.A0W(r3, r0)
            if (r1 == 0) goto L_0x0133
            r11.A0Y(r3)
        L_0x0133:
            r11.A0Z(r3)
            goto L_0x00ba
        L_0x0137:
            float r1 = r0.A01
            float r0 = r0.A02
            r2.translate(r1, r0)
            goto L_0x0126
        L_0x013f:
            r11.A0b(r3)
            goto L_0x00bd
        L_0x0144:
            boolean r0 = r12 instanceof X.BNR
            if (r0 == 0) goto L_0x023a
            X.BNZ r12 = (X.BNZ) r12
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            boolean r8 = A0n(r12, r11)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r4 = r0.getLanguage()
            java.util.List r0 = r12.A01
            java.util.Iterator r7 = r0.iterator()
        L_0x0167:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0265
            java.lang.Object r3 = r7.next()
            X.C5y r3 = (X.C24482C5y) r3
            boolean r0 = r3 instanceof X.EAF
            if (r0 == 0) goto L_0x0167
            r2 = r3
            X.EAF r2 = (X.EAF) r2
            java.lang.String r0 = r2.BYC()
            if (r0 != 0) goto L_0x0167
            java.util.Set r1 = r2.Ba4()
            if (r1 == 0) goto L_0x0193
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0167
            boolean r0 = r1.contains(r4)
            if (r0 != 0) goto L_0x0193
            goto L_0x0167
        L_0x0193:
            java.util.Set r5 = r2.BYD()
            if (r5 == 0) goto L_0x0256
            java.util.HashSet r0 = A06
            if (r0 != 0) goto L_0x022a
            java.lang.Class<X.CxN> r6 = X.C26304CxN.class
            monitor-enter(r6)
            java.util.HashSet r1 = X.C17880vN.A12()     // Catch:{ all -> 0x060c }
            A06 = r1     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "Structure"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "BasicStructure"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "ConditionalProcessing"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "Image"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "Style"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "ViewportAttribute"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "Shape"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "BasicText"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "PaintAttribute"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "BasicPaintAttribute"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "OpacityAttribute"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "BasicGraphicsAttribute"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "Marker"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "Gradient"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "Pattern"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "Clip"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "BasicClip"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "Mask"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            java.util.HashSet r1 = A06     // Catch:{ all -> 0x060c }
            java.lang.String r0 = "View"
            r1.add(r0)     // Catch:{ all -> 0x060c }
            monitor-exit(r6)
        L_0x022a:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0167
            java.util.HashSet r0 = A06
            boolean r0 = r0.containsAll(r5)
            if (r0 != 0) goto L_0x0256
            goto L_0x0167
        L_0x023a:
            boolean r0 = r12 instanceof X.BNZ
            if (r0 == 0) goto L_0x0274
            X.BNZ r12 = (X.BNZ) r12
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            boolean r1 = A0n(r12, r11)
            r0 = 1
            r11.A0W(r12, r0)
            if (r1 == 0) goto L_0x026a
            goto L_0x0267
        L_0x0256:
            java.util.Set r0 = r2.BYF()
            if (r0 != 0) goto L_0x026f
            java.util.Set r0 = r2.BYE()
            if (r0 != 0) goto L_0x026f
            r11.A0b(r3)
        L_0x0265:
            if (r8 == 0) goto L_0x026a
        L_0x0267:
            r11.A0Y(r12)
        L_0x026a:
            r11.A0Z(r12)
            goto L_0x0033
        L_0x026f:
            r0.isEmpty()
            goto L_0x0167
        L_0x0274:
            boolean r0 = r12 instanceof X.C22753BNq
            if (r0 == 0) goto L_0x0355
            X.BNq r12 = (X.C22753BNq) r12
            r6 = 0
            X.DS0 r0 = r12.A02
            if (r0 == 0) goto L_0x0033
            float r0 = r0.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            X.DS0 r0 = r12.A01
            if (r0 == 0) goto L_0x0033
            float r0 = r0.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            java.lang.String r3 = r12.A05
            if (r3 == 0) goto L_0x0033
            X.CYV r8 = r12.A00
            if (r8 != 0) goto L_0x029a
            X.CYV r8 = X.CYV.A02
        L_0x029a:
            java.lang.String r0 = "data:"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0033
            int r1 = r3.length()
            r0 = 14
            if (r1 < r0) goto L_0x0033
            r0 = 44
            int r2 = r3.indexOf(r0)
            r0 = -1
            if (r2 == r0) goto L_0x0033
            r0 = 12
            if (r2 < r0) goto L_0x0033
            int r0 = r2 + -7
            java.lang.String r1 = r3.substring(r0, r2)
            java.lang.String r0 = ";base64"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = X.BE6.A0p(r2, r3)
            byte[] r1 = android.util.Base64.decode(r0, r6)
            int r0 = r1.length
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r1, r6, r0)
            if (r5 == 0) goto L_0x0033
            int r0 = r5.getWidth()
            float r1 = (float) r0
            int r0 = r5.getHeight()
            float r0 = (float) r0
            r4 = 0
            X.Cjy r7 = new X.Cjy
            r7.<init>(r4, r4, r1, r0)
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            X.DS0 r0 = r12.A03
            float r10 = A01(r0, r11)
            X.DS0 r0 = r12.A04
            float r9 = A00(r0, r11)
            X.DS0 r0 = r12.A02
            float r3 = r0.A02(r11)
            X.DS0 r0 = r12.A01
            float r2 = r0.A02(r11)
            X.Ciu r1 = r11.A02
            X.Cjy r0 = new X.Cjy
            r0.<init>(r10, r9, r3, r2)
            r1.A03 = r0
            A0O(r0, r1, r11)
            X.Ciu r0 = r11.A02
            X.Cjy r0 = r0.A03
            r12.A00 = r0
            r11.A0Z(r12)
            boolean r3 = A0n(r12, r11)
            r11.A0G()
            android.graphics.Canvas r2 = r11.A00
            r2.save()
            X.Ciu r0 = r11.A02
            X.Cjy r0 = r0.A03
            android.graphics.Matrix r0 = A04(r8, r0, r7)
            r2.concat(r0)
            X.Ciu r0 = r11.A02
            X.DS2 r0 = r0.A04
            java.lang.Integer r1 = r0.A0Q
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x0344
            r6 = 2
        L_0x0344:
            android.graphics.Paint r0 = X.C108945cZ.A0K(r6)
            r2.drawBitmap(r5, r4, r4, r0)
            r2.restore()
            if (r3 == 0) goto L_0x0033
        L_0x0350:
            r11.A0Y(r12)
            goto L_0x0033
        L_0x0355:
            boolean r0 = r12 instanceof X.BNM
            if (r0 == 0) goto L_0x03c3
            X.BNM r12 = (X.BNM) r12
            X.D8X r0 = r12.A00
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            X.Ciu r1 = r11.A02
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0377
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x0377
            goto L_0x0033
        L_0x0377:
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            X.D8X r1 = r12.A00
            X.D8V r0 = new X.D8V
            r0.<init>(r1, r11)
            android.graphics.Path r3 = r0.A02
            X.Cjy r0 = r12.A00
            if (r0 != 0) goto L_0x038f
            X.Cjy r0 = A0C(r3)
            r12.A00 = r0
        L_0x038f:
            r11.A0Z(r12)
            r11.A0X(r12)
            boolean r2 = A0n(r12, r11)
            X.Ciu r1 = r11.A02
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x03b1
            X.DS2 r0 = r1.A04
            java.lang.Integer r1 = r0.A0N
            if (r1 == 0) goto L_0x03c0
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x03c0
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x03ab:
            r3.setFillType(r0)
            r11.A0K(r3, r12)
        L_0x03b1:
            X.Ciu r0 = r11.A02
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x03ba
            r11.A0J(r3)
        L_0x03ba:
            r11.A0Q(r12)
            if (r2 == 0) goto L_0x0033
            goto L_0x0350
        L_0x03c0:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x03ab
        L_0x03c3:
            boolean r0 = r12 instanceof X.BNQ
            if (r0 == 0) goto L_0x0413
            X.BNQ r12 = (X.BNQ) r12
            X.DS0 r0 = r12.A03
            if (r0 == 0) goto L_0x0033
            X.DS0 r2 = r12.A00
            if (r2 == 0) goto L_0x0033
            float r0 = r0.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            float r0 = r2.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            android.graphics.Path r2 = r11.A0A(r12)
        L_0x03f3:
            r11.A0Z(r12)
            r11.A0X(r12)
            boolean r1 = A0n(r12, r11)
            X.Ciu r0 = r11.A02
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0406
            r11.A0K(r2, r12)
        L_0x0406:
            X.Ciu r0 = r11.A02
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x040f
            r11.A0J(r2)
        L_0x040f:
            if (r1 == 0) goto L_0x0033
            goto L_0x0350
        L_0x0413:
            boolean r0 = r12 instanceof X.BNN
            if (r0 == 0) goto L_0x043a
            X.BNN r12 = (X.BNN) r12
            X.DS0 r0 = r12.A02
            if (r0 == 0) goto L_0x0033
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            android.graphics.Path r2 = r11.A07(r12)
            goto L_0x03f3
        L_0x043a:
            boolean r0 = r12 instanceof X.BNO
            if (r0 == 0) goto L_0x046b
            X.BNO r12 = (X.BNO) r12
            X.DS0 r0 = r12.A02
            if (r0 == 0) goto L_0x0033
            X.DS0 r2 = r12.A03
            if (r2 == 0) goto L_0x0033
            float r0 = r0.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            float r0 = r2.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            android.graphics.Path r2 = r11.A08(r12)
            goto L_0x03f3
        L_0x046b:
            boolean r0 = r12 instanceof X.BNP
            if (r0 == 0) goto L_0x04e8
            X.BNP r12 = (X.BNP) r12
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            X.Ciu r0 = r11.A02
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            X.DS0 r0 = r12.A00
            r8 = 0
            if (r0 != 0) goto L_0x04e3
            r7 = 0
        L_0x048e:
            X.DS0 r0 = r12.A02
            if (r0 != 0) goto L_0x04de
            r6 = 0
        L_0x0493:
            X.DS0 r0 = r12.A01
            if (r0 != 0) goto L_0x04d9
            r5 = 0
        L_0x0498:
            X.DS0 r0 = r12.A03
            if (r0 == 0) goto L_0x04a0
            float r8 = r0.A03(r11)
        L_0x04a0:
            X.Cjy r0 = r12.A00
            if (r0 != 0) goto L_0x04bb
            float r4 = java.lang.Math.min(r7, r5)
            float r3 = java.lang.Math.min(r6, r8)
            float r2 = X.C108945cZ.A00(r5, r7)
            float r1 = X.C108945cZ.A00(r8, r6)
            X.Cjy r0 = new X.Cjy
            r0.<init>(r4, r3, r2, r1)
            r12.A00 = r0
        L_0x04bb:
            android.graphics.Path r1 = X.C108945cZ.A0L()
            r1.moveTo(r7, r6)
            r1.lineTo(r5, r8)
            r11.A0Z(r12)
            r11.A0X(r12)
            boolean r0 = A0n(r12, r11)
            r11.A0J(r1)
            r11.A0Q(r12)
            if (r0 == 0) goto L_0x0033
            goto L_0x0350
        L_0x04d9:
            float r5 = r0.A02(r11)
            goto L_0x0498
        L_0x04de:
            float r6 = r0.A03(r11)
            goto L_0x0493
        L_0x04e3:
            float r7 = r0.A02(r11)
            goto L_0x048e
        L_0x04e8:
            boolean r0 = r12 instanceof X.BNV
            if (r0 == 0) goto L_0x0506
            X.BNW r12 = (X.BNW) r12
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            X.Ciu r1 = r11.A02
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x054b
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x054b
            goto L_0x0033
        L_0x0506:
            boolean r0 = r12 instanceof X.BNW
            if (r0 == 0) goto L_0x057b
            X.BNW r12 = (X.BNW) r12
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x0033
            X.Ciu r1 = r11.A02
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0524
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x0524
            goto L_0x0033
        L_0x0524:
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            float[] r0 = r12.A00
            int r1 = r0.length
            r0 = 2
            if (r1 < r0) goto L_0x0033
            android.graphics.Path r2 = r11.A09(r12)
            r11.A0Z(r12)
            X.Ciu r0 = r11.A02
            X.DS2 r0 = r0.A04
            java.lang.Integer r1 = r0.A0N
            if (r1 == 0) goto L_0x0548
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x0548
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x0544:
            r2.setFillType(r0)
            goto L_0x055d
        L_0x0548:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x0544
        L_0x054b:
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            float[] r0 = r12.A00
            int r1 = r0.length
            r0 = 2
            if (r1 < r0) goto L_0x0033
            android.graphics.Path r2 = r11.A09(r12)
            r11.A0Z(r12)
        L_0x055d:
            r11.A0X(r12)
            boolean r1 = A0n(r12, r11)
            X.Ciu r0 = r11.A02
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x056d
            r11.A0K(r2, r12)
        L_0x056d:
            X.Ciu r0 = r11.A02
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0576
            r11.A0J(r2)
        L_0x0576:
            r11.A0Q(r12)
            goto L_0x040f
        L_0x057b:
            boolean r0 = r12 instanceof X.C22759BNw
            if (r0 == 0) goto L_0x0033
            X.BNw r12 = (X.C22759BNw) r12
            r1 = 0
            boolean r0 = A0o(r12, r11)
            if (r0 == 0) goto L_0x0033
            android.graphics.Matrix r0 = r12.A00
            A0I(r0, r11)
            java.util.List r0 = r12.A02
            if (r0 == 0) goto L_0x060a
            int r0 = r0.size()
            if (r0 == 0) goto L_0x060a
            java.util.List r0 = r12.A02
            java.lang.Object r0 = r0.get(r1)
            X.DS0 r0 = (X.DS0) r0
            float r5 = r0.A02(r11)
        L_0x05a3:
            java.util.List r0 = r12.A03
            if (r0 == 0) goto L_0x0608
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0608
            java.util.List r0 = r12.A03
            java.lang.Object r0 = r0.get(r1)
            X.DS0 r0 = (X.DS0) r0
            float r6 = r0.A03(r11)
        L_0x05b9:
            java.util.List r0 = r12.A00
            if (r0 == 0) goto L_0x0606
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0606
            java.util.List r0 = r12.A00
            java.lang.Object r0 = r0.get(r1)
            X.DS0 r0 = (X.DS0) r0
            float r4 = r0.A02(r11)
        L_0x05cf:
            float r3 = A02(r12, r11)
            java.lang.Integer r2 = r11.A0E()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r2 == r0) goto L_0x05ed
            X.BO0 r0 = new X.BO0
            r0.<init>(r11)
            r11.A0f(r12, r0)
            float r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r2 != r0) goto L_0x05ec
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
        L_0x05ec:
            float r5 = r5 - r1
        L_0x05ed:
            A0g(r12, r11, r5, r6)
            r11.A0Z(r12)
            r11.A0X(r12)
            boolean r1 = A0n(r12, r11)
            float r5 = r5 + r4
            float r6 = r6 + r3
            X.BO1 r0 = new X.BO1
            r0.<init>(r11, r5, r6)
            r11.A0f(r12, r0)
            goto L_0x040f
        L_0x0606:
            r4 = 0
            goto L_0x05cf
        L_0x0608:
            r6 = 0
            goto L_0x05b9
        L_0x060a:
            r5 = 0
            goto L_0x05a3
        L_0x060c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26304CxN.A0b(X.C5y):void");
    }

    public static void A0d(C24482C5y c5y, C26304CxN cxN) {
        C25614Ciu ciu = new C25614Ciu(cxN);
        A0V(DS2.A00(), ciu, cxN);
        cxN.A0c(c5y, ciu);
        cxN.A02 = ciu;
    }

    public static void A0e(C27070DRv dRv, C25614Ciu ciu, boolean z) {
        Float f;
        C22747BNk bNk;
        Paint paint;
        DS2 ds2 = ciu.A04;
        if (z) {
            f = ds2.A0E;
        } else {
            f = ds2.A0J;
        }
        float floatValue = f.floatValue();
        if (dRv instanceof C22747BNk) {
            bNk = (C22747BNk) dRv;
        } else if (dRv instanceof C22748BNl) {
            bNk = ds2.A02;
        } else {
            return;
        }
        int A032 = A03(bNk.A00, floatValue);
        if (z) {
            paint = ciu.A00;
        } else {
            paint = ciu.A01;
        }
        paint.setColor(A032);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.BNx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.BNv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.BNx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: X.BNx} */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0152, code lost:
        if (r0 != false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01bf, code lost:
        if (r2 != false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c1, code lost:
        A0Y(r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0f(X.BNX r12, X.C25043CUx r13) {
        /*
            r11 = this;
            X.Ciu r0 = r11.A02
            X.DS2 r0 = r0.A04
            java.lang.Boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x000f
        L_0x000e:
            return
        L_0x000f:
            java.util.List r0 = r12.A01
            java.util.Iterator r10 = r0.iterator()
            r2 = 1
        L_0x0016:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r1 = r10.next()
            X.C5y r1 = (X.C24482C5y) r1
            boolean r0 = r1 instanceof X.C22745BNi
            if (r0 == 0) goto L_0x0039
            X.BNi r1 = (X.C22745BNi) r1
            java.lang.String r1 = r1.A00
            boolean r0 = r10.hasNext()
            r0 = r0 ^ 1
            java.lang.String r0 = r11.A0F(r1, r2, r0)
            r13.A00(r0)
        L_0x0037:
            r2 = 0
            goto L_0x0016
        L_0x0039:
            r2 = r1
            X.BNX r2 = (X.BNX) r2
            boolean r0 = r13 instanceof X.BO3
            if (r0 == 0) goto L_0x0083
            r6 = r13
            X.BO3 r6 = (X.BO3) r6
            boolean r0 = r2 instanceof X.C22758BNv
            r5 = 1
            if (r0 == 0) goto L_0x0096
            r4 = r2
            X.BNv r4 = (X.C22758BNv) r4
            X.Cw7 r1 = r2.A01
            java.lang.String r0 = r4.A02
            X.BNy r3 = r1.A0A(r0)
            r2 = 0
            if (r3 != 0) goto L_0x0062
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = r4.A02
            r1[r2] = r0
            java.lang.String r0 = "TextPath path reference '%s' not found"
            A0k(r0, r1)
            goto L_0x0037
        L_0x0062:
            X.BNM r3 = (X.BNM) r3
            X.CxN r2 = r6.A03
            X.D8X r1 = r3.A00
            X.D8V r0 = new X.D8V
            r0.<init>(r1, r2)
            android.graphics.Path r2 = r0.A02
            android.graphics.Matrix r0 = r3.A00
            if (r0 == 0) goto L_0x0076
            r2.transform(r0)
        L_0x0076:
            android.graphics.RectF r1 = X.AnonymousClass3MW.A08()
            r2.computeBounds(r1, r5)
            android.graphics.RectF r0 = r6.A02
            r0.union(r1)
            goto L_0x0037
        L_0x0083:
            boolean r0 = r13 instanceof X.BO2
            if (r0 == 0) goto L_0x0096
            boolean r0 = r2 instanceof X.C22758BNv
            if (r0 == 0) goto L_0x0096
            java.lang.String r2 = "Using <textPath> elements in a clip path is not supported."
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "SVGAndroidRenderer"
            X.BE7.A1M(r2, r0, r1)
            goto L_0x0037
        L_0x0096:
            boolean r0 = r1 instanceof X.C22758BNv
            if (r0 == 0) goto L_0x00c8
            A0j(r11)
            X.BNv r1 = (X.C22758BNv) r1
            r4 = 0
            boolean r0 = A0o(r1, r11)
            if (r0 == 0) goto L_0x00c3
            boolean r0 = A0p(r11)
            if (r0 == 0) goto L_0x00c3
            X.Cw7 r2 = r1.A01
            java.lang.String r0 = r1.A02
            X.BNy r3 = r2.A0A(r0)
            if (r3 != 0) goto L_0x0171
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            java.lang.String r0 = r1.A02
            r2[r4] = r0
            java.lang.String r0 = "TextPath reference '%s' not found"
        L_0x00c0:
            A0k(r0, r2)
        L_0x00c3:
            A0i(r11)
            goto L_0x0037
        L_0x00c8:
            boolean r0 = r1 instanceof X.C22760BNx
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x01c8
            A0j(r11)
            X.BNx r1 = (X.C22760BNx) r1
            boolean r0 = A0o(r1, r11)
            if (r0 == 0) goto L_0x00c3
            java.util.List r0 = r1.A02
            if (r0 == 0) goto L_0x016e
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x016e
        L_0x00e3:
            boolean r3 = r13 instanceof X.BO1
            r6 = 0
            if (r3 == 0) goto L_0x016a
            if (r5 != 0) goto L_0x015d
            r0 = r13
            X.BO1 r0 = (X.BO1) r0
            float r6 = r0.A00
        L_0x00ef:
            java.util.List r0 = r1.A03
            if (r0 == 0) goto L_0x0157
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0157
            java.util.List r0 = r1.A03
            java.lang.Object r0 = r0.get(r4)
            X.DS0 r0 = (X.DS0) r0
            float r7 = r0.A03(r11)
        L_0x0105:
            java.util.List r0 = r1.A00
            if (r0 == 0) goto L_0x0155
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0155
            java.util.List r0 = r1.A00
            java.lang.Object r0 = r0.get(r4)
            X.DS0 r0 = (X.DS0) r0
            float r9 = r0.A02(r11)
        L_0x011b:
            float r8 = A02(r1, r11)
        L_0x011f:
            if (r5 == 0) goto L_0x013b
            java.lang.Integer r4 = r11.A0E()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r4 == r0) goto L_0x013b
            X.BO0 r0 = new X.BO0
            r0.<init>(r11)
            r11.A0f(r1, r0)
            float r2 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r4 != r0) goto L_0x013a
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
        L_0x013a:
            float r6 = r6 - r2
        L_0x013b:
            X.BNw r0 = r1.A00
            r11.A0X(r0)
            if (r3 == 0) goto L_0x014b
            r0 = r13
            X.BO1 r0 = (X.BO1) r0
            float r6 = r6 + r9
            r0.A00 = r6
            float r7 = r7 + r8
            r0.A01 = r7
        L_0x014b:
            boolean r0 = r11.A0l()
            r11.A0f(r1, r13)
            if (r0 == 0) goto L_0x00c3
            goto L_0x01c1
        L_0x0155:
            r9 = 0
            goto L_0x011b
        L_0x0157:
            r0 = r13
            X.BO1 r0 = (X.BO1) r0
            float r7 = r0.A01
            goto L_0x0105
        L_0x015d:
            java.util.List r0 = r1.A02
            java.lang.Object r0 = r0.get(r4)
            X.DS0 r0 = (X.DS0) r0
            float r6 = r0.A02(r11)
            goto L_0x00ef
        L_0x016a:
            r8 = 0
            r7 = 0
            r9 = 0
            goto L_0x011f
        L_0x016e:
            r5 = 0
            goto L_0x00e3
        L_0x0171:
            X.BNM r3 = (X.BNM) r3
            X.D8X r2 = r3.A00
            X.D8V r0 = new X.D8V
            r0.<init>(r2, r11)
            android.graphics.Path r5 = r0.A02
            android.graphics.Matrix r0 = r3.A00
            if (r0 == 0) goto L_0x0183
            r5.transform(r0)
        L_0x0183:
            android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
            r0.<init>(r5, r4)
            X.DS0 r2 = r1.A00
            if (r2 == 0) goto L_0x01c6
            float r0 = r0.getLength()
            float r4 = r2.A04(r11, r0)
        L_0x0194:
            java.lang.Integer r3 = r11.A0E()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r3 == r0) goto L_0x01ae
            X.BO0 r0 = new X.BO0
            r0.<init>(r11)
            r11.A0f(r1, r0)
            float r2 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r3 != r0) goto L_0x01ad
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
        L_0x01ad:
            float r4 = r4 - r2
        L_0x01ae:
            X.BNw r0 = r1.A01
            r11.A0X(r0)
            boolean r2 = r11.A0l()
            X.BNz r0 = new X.BNz
            r0.<init>(r5, r11, r4)
            r11.A0f(r1, r0)
            if (r2 == 0) goto L_0x00c3
        L_0x01c1:
            r11.A0Y(r1)
            goto L_0x00c3
        L_0x01c6:
            r4 = 0
            goto L_0x0194
        L_0x01c8:
            boolean r0 = r1 instanceof X.C22757BNu
            if (r0 == 0) goto L_0x0037
            A0j(r11)
            r3 = r1
            X.BNu r3 = (X.C22757BNu) r3
            boolean r0 = A0o(r3, r11)
            if (r0 == 0) goto L_0x00c3
            X.BNw r0 = r3.A00
            r11.A0X(r0)
            X.Cw7 r1 = r1.A01
            java.lang.String r0 = r3.A01
            X.BNy r2 = r1.A0A(r0)
            if (r2 == 0) goto L_0x0203
            boolean r0 = r2 instanceof X.BNX
            if (r0 == 0) goto L_0x0203
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.BNX r2 = (X.BNX) r2
            r11.A0h(r2, r1)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00c3
            java.lang.String r0 = r1.toString()
            r13.A00(r0)
            goto L_0x00c3
        L_0x0203:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r0 = r3.A01
            r2[r4] = r0
            java.lang.String r0 = "Tref reference '%s' not found"
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26304CxN.A0f(X.BNX, X.CUx):void");
    }

    public static void A0g(BNX bnx, C26304CxN cxN, float f, float f2) {
        if (bnx.A00 == null) {
            BO3 bo3 = new BO3(cxN, f, f2);
            cxN.A0f(bnx, bo3);
            RectF rectF = bo3.A02;
            bnx.A00 = new C25668Cjy(rectF.left, rectF.top, rectF.width(), rectF.height());
        }
    }

    private void A0h(BNX bnx, StringBuilder sb) {
        Iterator it = bnx.A01.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C24482C5y c5y = (C24482C5y) it.next();
            if (c5y instanceof BNX) {
                A0h((BNX) c5y, sb);
            } else if (c5y instanceof C22745BNi) {
                sb.append(A0F(((C22745BNi) c5y).A00, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public static void A0i(C26304CxN cxN) {
        cxN.A00.restore();
        cxN.A02 = (C25614Ciu) cxN.A05.pop();
    }

    public static void A0j(C26304CxN cxN) {
        cxN.A00.save();
        cxN.A05.push(cxN.A02);
        cxN.A02 = new C25614Ciu(cxN.A02, cxN);
    }

    public static void A0k(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1.A0a != null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0l() {
        /*
            r5 = this;
            X.Ciu r0 = r5.A02
            X.DS2 r1 = r0.A04
            java.lang.Float r0 = r1.A0F
            float r3 = r0.floatValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0015
            java.lang.String r1 = r1.A0a
            r0 = 0
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r4 = 0
            if (r0 != 0) goto L_0x001a
            return r4
        L_0x001a:
            android.graphics.Canvas r2 = r5.A00
            r0 = 1132462080(0x43800000, float:256.0)
            float r3 = r3 * r0
            int r1 = (int) r3
            if (r1 >= 0) goto L_0x0062
            r1 = 0
        L_0x0023:
            r0 = 31
            r3 = 0
            r2.saveLayerAlpha(r3, r1, r0)
            java.util.Stack r1 = r5.A05
            X.Ciu r0 = r5.A02
            r1.push(r0)
            X.Ciu r1 = r5.A02
            X.Ciu r0 = new X.Ciu
            r0.<init>(r1, r5)
            r5.A02 = r0
            X.DS2 r0 = r0.A04
            java.lang.String r1 = r0.A0a
            r2 = 1
            if (r1 == 0) goto L_0x0061
            X.Cw7 r0 = r5.A01
            X.BNy r0 = r0.A0A(r1)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0 instanceof X.C22737BNa
            if (r0 != 0) goto L_0x0061
        L_0x004c:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            X.Ciu r0 = r5.A02
            X.DS2 r0 = r0.A04
            java.lang.String r0 = r0.A0a
            r1[r4] = r0
            java.lang.String r0 = "Mask reference '%s' not found"
            A0k(r0, r1)
            X.Ciu r0 = r5.A02
            X.DS2 r0 = r0.A04
            r0.A0a = r3
        L_0x0061:
            return r2
        L_0x0062:
            r0 = 255(0xff, float:3.57E-43)
            if (r1 <= r0) goto L_0x0023
            r1 = 255(0xff, float:3.57E-43)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26304CxN.A0l():boolean");
    }

    public static boolean A0m(DS2 ds2, long j) {
        return AnonymousClass000.A1O(((j & ds2.A00) > 0 ? 1 : ((j & ds2.A00) == 0 ? 0 : -1)));
    }

    public static boolean A0n(C22741BNe bNe, C26304CxN cxN) {
        cxN.A0N(bNe.A00, bNe);
        return cxN.A0l();
    }

    public static boolean A0o(C22761BNy bNy, C26304CxN cxN) {
        cxN.A0a(bNy, cxN.A02);
        Boolean bool = cxN.A02.A04.A0B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static boolean A0p(C26304CxN cxN) {
        Boolean bool = cxN.A02.A04.A0D;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r8 != 7) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        r4 = r4 - r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Matrix A04(X.CYV r12, X.C25668Cjy r13, X.C25668Cjy r14) {
        /*
            android.graphics.Matrix r5 = X.C108945cZ.A0J()
            X.Bz1 r11 = r12.A00
            if (r11 == 0) goto L_0x002f
            float r10 = r13.A03
            float r9 = r14.A03
            float r8 = r10 / r9
            float r7 = r13.A00
            float r6 = r14.A00
            float r2 = r7 / r6
            float r0 = r14.A01
            float r4 = -r0
            float r0 = r14.A02
            float r3 = -r0
            X.CYV r0 = X.CYV.A03
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0030
            float r1 = r13.A01
            float r0 = r13.A02
            r5.preTranslate(r1, r0)
            r5.preScale(r8, r2)
        L_0x002c:
            r5.preTranslate(r4, r3)
        L_0x002f:
            return r5
        L_0x0030:
            java.lang.Integer r1 = r12.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x0070
            float r2 = java.lang.Math.max(r8, r2)
        L_0x003a:
            float r10 = r10 / r2
            float r7 = r7 / r2
            int r8 = r11.ordinal()
            r1 = 1073741824(0x40000000, float:2.0)
            switch(r8) {
                case 2: goto L_0x006a;
                case 3: goto L_0x006d;
                case 4: goto L_0x0045;
                case 5: goto L_0x006a;
                case 6: goto L_0x006d;
                case 7: goto L_0x0045;
                case 8: goto L_0x006a;
                case 9: goto L_0x006d;
                default: goto L_0x0045;
            }
        L_0x0045:
            r0 = 5
            if (r8 == r0) goto L_0x0064
            r0 = 8
            if (r8 == r0) goto L_0x0067
            r0 = 6
            if (r8 == r0) goto L_0x0064
            r0 = 9
            if (r8 == r0) goto L_0x0067
            r0 = 4
            if (r8 == r0) goto L_0x0064
            r0 = 7
            if (r8 == r0) goto L_0x0067
        L_0x0059:
            float r1 = r13.A01
            float r0 = r13.A02
            r5.preTranslate(r1, r0)
            r5.preScale(r2, r2)
            goto L_0x002c
        L_0x0064:
            float r6 = r6 - r7
            float r6 = r6 / r1
            goto L_0x0068
        L_0x0067:
            float r6 = r6 - r7
        L_0x0068:
            float r3 = r3 - r6
            goto L_0x0059
        L_0x006a:
            float r9 = r9 - r10
            float r9 = r9 / r1
            goto L_0x006e
        L_0x006d:
            float r9 = r9 - r10
        L_0x006e:
            float r4 = r4 - r9
            goto L_0x0045
        L_0x0070:
            float r2 = java.lang.Math.min(r8, r2)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26304CxN.A04(X.CYV, X.Cjy, X.Cjy):android.graphics.Matrix");
    }

    private Path A09(BNW bnw) {
        Path A0L = C108945cZ.A0L();
        float[] fArr = bnw.A00;
        A0L.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = bnw.A00;
            if (i >= fArr2.length) {
                break;
            }
            A0L.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (bnw instanceof BNV) {
            A0L.close();
        }
        if (bnw.A00 == null) {
            bnw.A00 = A0C(A0L);
        }
        return A0L;
    }

    public static C25668Cjy A0C(Path path) {
        RectF A08 = AnonymousClass3MW.A08();
        path.computeBounds(A08, true);
        return new C25668Cjy(A08.left, A08.top, A08.width(), A08.height());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ba, code lost:
        if (r9 != 7) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0R(X.C22750BNn r13, X.C25223CbJ r14) {
        /*
            r12 = this;
            A0j(r12)
            java.lang.Float r0 = r13.A04
            r4 = 0
            if (r0 == 0) goto L_0x0125
            float r3 = r0.floatValue()
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 == 0) goto L_0x002b
            float r1 = r14.A00
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            float r0 = r14.A01
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0125
        L_0x001e:
            float r0 = r14.A01
            double r2 = (double) r0
            double r0 = (double) r1
            double r0 = java.lang.Math.atan2(r2, r0)
            double r0 = java.lang.Math.toDegrees(r0)
            float r3 = (float) r0
        L_0x002b:
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x0119
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0031:
            A0d(r13, r12)
            android.graphics.Matrix r5 = X.C108945cZ.A0J()
            float r1 = r14.A02
            float r0 = r14.A03
            r5.preTranslate(r1, r0)
            r5.preRotate(r3)
            r5.preScale(r2, r2)
            X.DS0 r0 = r13.A02
            float r10 = A01(r0, r12)
            X.DS0 r0 = r13.A03
            float r8 = A00(r0, r12)
            X.DS0 r0 = r13.A01
            r3 = 1077936128(0x40400000, float:3.0)
            if (r0 == 0) goto L_0x0115
            float r2 = r0.A02(r12)
        L_0x005b:
            X.DS0 r0 = r13.A00
            if (r0 == 0) goto L_0x0063
            float r3 = r0.A03(r12)
        L_0x0063:
            X.Cjy r1 = r13.A00
            if (r1 == 0) goto L_0x00fb
            float r0 = r1.A03
            float r7 = r2 / r0
            float r0 = r1.A00
            float r6 = r3 / r0
            X.CYV r9 = r13.A00
            if (r9 != 0) goto L_0x0075
            X.CYV r9 = X.CYV.A02
        L_0x0075:
            X.CYV r0 = X.CYV.A03
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0088
            java.lang.Integer r1 = r9.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x00f6
            float r7 = java.lang.Math.max(r7, r6)
        L_0x0087:
            r6 = r7
        L_0x0088:
            float r1 = -r10
            float r1 = r1 * r7
            float r0 = -r8
            float r0 = r0 * r6
            r5.preTranslate(r1, r0)
            android.graphics.Canvas r1 = r12.A00
            r1.concat(r5)
            X.Cjy r0 = r13.A00
            float r8 = r0.A03
            float r8 = r8 * r7
            float r10 = r0.A00
            float r10 = r10 * r6
            X.Bz1 r0 = r9.A00
            int r9 = r0.ordinal()
            r11 = 1073741824(0x40000000, float:2.0)
            switch(r9) {
                case 2: goto L_0x00ed;
                case 3: goto L_0x00f1;
                case 4: goto L_0x00a7;
                case 5: goto L_0x00ed;
                case 6: goto L_0x00f1;
                case 7: goto L_0x00a7;
                case 8: goto L_0x00ed;
                case 9: goto L_0x00f1;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            r8 = 0
        L_0x00a8:
            r0 = 5
            if (r9 == r0) goto L_0x00e5
            r0 = 8
            if (r9 == r0) goto L_0x00e9
            r0 = 6
            if (r9 == r0) goto L_0x00e5
            r0 = 9
            if (r9 == r0) goto L_0x00e9
            r0 = 4
            if (r9 == r0) goto L_0x00e5
            r0 = 7
            if (r9 == r0) goto L_0x00e9
        L_0x00bc:
            X.Ciu r0 = r12.A02
            X.DS2 r0 = r0.A04
            java.lang.Boolean r0 = r0.A0C
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00cb
            r12.A0H(r8, r4, r2, r3)
        L_0x00cb:
            r5.reset()
            r5.preScale(r7, r6)
            r1.concat(r5)
        L_0x00d4:
            boolean r1 = r12.A0l()
            r0 = 0
            r12.A0W(r13, r0)
            if (r1 == 0) goto L_0x00e1
            r12.A0Y(r13)
        L_0x00e1:
            A0i(r12)
            return
        L_0x00e5:
            float r0 = r3 - r10
            float r0 = r0 / r11
            goto L_0x00eb
        L_0x00e9:
            float r0 = r3 - r10
        L_0x00eb:
            float r4 = r4 - r0
            goto L_0x00bc
        L_0x00ed:
            float r0 = r2 - r8
            float r0 = r0 / r11
            goto L_0x00f3
        L_0x00f1:
            float r0 = r2 - r8
        L_0x00f3:
            float r8 = r4 - r0
            goto L_0x00a8
        L_0x00f6:
            float r7 = java.lang.Math.min(r7, r6)
            goto L_0x0087
        L_0x00fb:
            float r1 = -r10
            float r0 = -r8
            r5.preTranslate(r1, r0)
            android.graphics.Canvas r0 = r12.A00
            r0.concat(r5)
            X.Ciu r0 = r12.A02
            X.DS2 r0 = r0.A04
            java.lang.Boolean r0 = r0.A0C
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00d4
            r12.A0H(r4, r4, r2, r3)
            goto L_0x00d4
        L_0x0115:
            r2 = 1077936128(0x40400000, float:3.0)
            goto L_0x005b
        L_0x0119:
            X.Ciu r0 = r12.A02
            X.DS2 r0 = r0.A04
            X.DS0 r0 = r0.A05
            float r2 = r0.A00()
            goto L_0x0031
        L_0x0125:
            r3 = 0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26304CxN.A0R(X.BNn, X.CbJ):void");
    }

    private void A0c(C24482C5y c5y, C25614Ciu ciu) {
        ArrayList A13 = AnonymousClass000.A13();
        while (true) {
            if (c5y instanceof C22761BNy) {
                A13.add(0, c5y);
            }
            if (c5y.A00 == null) {
                break;
            }
            c5y = (C24482C5y) c5y.A00;
        }
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            A0a((C22761BNy) it.next(), ciu);
        }
        C25614Ciu ciu2 = this.A02;
        ciu.A02 = ciu2.A02;
        ciu.A03 = ciu2.A03;
    }

    public static void A0T(C28589E9d e9d, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        float f8 = f6;
        float f9 = f;
        float f10 = f7;
        if (f != f6 || f2 != f7) {
            C28589E9d e9d2 = e9d;
            if (f3 == 0.0f || f4 == 0.0f) {
                e9d2.BhX(f8, f10);
                return;
            }
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            float f11 = f5;
            double radians = (double) ((float) Math.toRadians(((double) f11) % 360.0d));
            float cos = (float) Math.cos(radians);
            float sin = (float) Math.sin(radians);
            float f12 = (f9 - f6) / 2.0f;
            float f13 = (f2 - f7) / 2.0f;
            float A002 = AnonymousClass000.A00(cos, f12, sin, f13);
            float A003 = AnonymousClass000.A00(-sin, f12, f13, cos);
            float f14 = abs * abs;
            float f15 = abs2 * abs2;
            float f16 = A002 * A002;
            float f17 = A003 * A003;
            float f18 = (f16 / f14) + (f17 / f15);
            if (f18 > 1.0f) {
                float sqrt = (float) Math.sqrt((double) f18);
                abs *= sqrt;
                abs2 *= sqrt;
                f14 = abs * abs;
                f15 = abs2 * abs2;
            }
            float f19 = 1.0f;
            if (z == z2) {
                f19 = -1.0f;
            }
            float f20 = f14 * f15;
            float f21 = f14 * f17;
            float f22 = f15 * f16;
            float f23 = ((f20 - f21) - f22) / (f21 + f22);
            if (f23 < 0.0f) {
                f23 = 0.0f;
            }
            float sqrt2 = (float) (((double) f19) * Math.sqrt((double) f23));
            float f24 = ((abs * A003) / abs2) * sqrt2;
            float f25 = sqrt2 * (-((abs2 * A002) / abs));
            float A012 = ((f9 + f6) / 2.0f) + AnonymousClass000.A01(cos, f24, sin, f25);
            float A004 = ((f2 + f7) / 2.0f) + AnonymousClass000.A00(sin, f24, cos, f25);
            float f26 = (A002 - f24) / abs;
            float f27 = (A003 - f25) / abs2;
            float f28 = ((-A002) - f24) / abs;
            float f29 = ((-A003) - f25) / abs2;
            float f30 = (f26 * f26) + (f27 * f27);
            float sqrt3 = (float) Math.sqrt((double) f30);
            float f31 = 1.0f;
            if (f27 < 0.0f) {
                f31 = -1.0f;
            }
            float degrees = (float) Math.toDegrees(((double) f31) * Math.acos((double) (f26 / sqrt3)));
            float sqrt4 = (float) Math.sqrt((double) (f30 * ((f28 * f28) + (f29 * f29))));
            float A005 = AnonymousClass000.A00(f26, f28, f27, f29);
            float f32 = 1.0f;
            if (AnonymousClass000.A01(f26, f29, f27, f28) < 0.0f) {
                f32 = -1.0f;
            }
            double degrees2 = Math.toDegrees(((double) f32) * Math.acos((double) (A005 / sqrt4)));
            if (z2 || degrees2 <= 0.0d) {
                d = 360.0d;
                if (z2 && degrees2 < 0.0d) {
                    degrees2 += 360.0d;
                }
            } else {
                d = 360.0d;
                degrees2 -= 360.0d;
            }
            double d2 = degrees2 % d;
            int A032 = BE7.A03(Math.abs(d2), 90.0d);
            double radians2 = Math.toRadians((double) (degrees % 360.0f));
            float radians3 = (float) (Math.toRadians(d2) / ((double) A032));
            float f33 = radians3;
            double d3 = (double) radians3;
            double d4 = d3 / 2.0d;
            double sin2 = (Math.sin(d4) * 1.3333333333333333d) / (Math.cos(d4) + 1.0d);
            int i = A032 * 6;
            float[] fArr = new float[i];
            int i2 = 0;
            for (int i3 = 0; i3 < A032; i3++) {
                double d5 = ((double) (((float) i3) * f33)) + radians2;
                double cos2 = Math.cos(d5);
                double sin3 = Math.sin(d5);
                int i4 = i2 + 1;
                fArr[i2] = (float) (cos2 - (sin2 * sin3));
                int i5 = i4 + 1;
                fArr[i4] = (float) (sin3 + (cos2 * sin2));
                double d6 = d5 + d3;
                double cos3 = Math.cos(d6);
                double sin4 = Math.sin(d6);
                int i6 = i5 + 1;
                fArr[i5] = (float) ((sin2 * sin4) + cos3);
                int i7 = i6 + 1;
                fArr[i6] = (float) (sin4 - (sin2 * cos3));
                int i8 = i7 + 1;
                fArr[i7] = (float) cos3;
                i2 = i8 + 1;
                fArr[i8] = (float) sin4;
            }
            Matrix A0J = C108945cZ.A0J();
            A0J.postScale(abs, abs2);
            A0J.postRotate(f11);
            A0J.postTranslate(A012, A004);
            A0J.mapPoints(fArr);
            fArr[i - 2] = f6;
            fArr[i - 1] = f7;
            for (int i9 = 0; i9 < i; i9 += 6) {
                e9d2.BHy(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3], fArr[i9 + 4], fArr[i9 + 5]);
            }
        }
    }
}
