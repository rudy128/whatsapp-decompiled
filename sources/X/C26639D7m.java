package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.D7m  reason: case insensitive filesystem */
public abstract class C26639D7m implements E3k, C28646ECe, C28647ECf {
    public float A00;
    public C26049CrJ A01;
    public C26049CrJ A02;
    public C26638D7l A03;
    public final Paint A04;
    public final Path A05 = C108945cZ.A0L();
    public final Path A06 = C108945cZ.A0L();
    public final PathMeasure A07 = new PathMeasure();
    public final C26049CrJ A08;
    public final List A09;
    public final float[] A0A;
    public final RectF A0B = AnonymousClass3MW.A08();
    public final C38631rd A0C;
    public final C26049CrJ A0D;
    public final C26049CrJ A0E;
    public final List A0F = AnonymousClass000.A13();
    public final C26642D7p A0G;

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
            crJ2 = this.A0D;
        } else if (obj == EBL.A0O) {
            crJ2 = this.A0E;
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
            } else if (obj == EBL.A0A) {
                crJ2 = this.A01;
                if (crJ2 == null) {
                    C22732BMv bMv2 = new C22732BMv(ckt, (Object) null);
                    this.A01 = bMv2;
                    bMv2.A0A(this);
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
        float f;
        float f2;
        float f3;
        BlurMaskFilter blurMaskFilter;
        float A012;
        float[] fArr = (float[]) C40171uH.A00.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        Matrix matrix2 = matrix;
        matrix2.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            AnonymousClass29K r2 = (AnonymousClass29K) this.A0D;
            int A013 = (int) (BE7.A01(((float) i) / 255.0f, (float) r2.A0C(r2.A06.BPw(), r2.A03())) * 255.0f);
            Paint paint = this.A04;
            int i2 = 0;
            PointF pointF = C40761vE.A00;
            paint.setAlpha(BE8.A07(255, A013, 0));
            paint.setStrokeWidth(((C22735BMy) this.A0E).A0C() * C40171uH.A01(matrix2));
            if (paint.getStrokeWidth() > 0.0f) {
                List list = this.A09;
                if (!list.isEmpty()) {
                    float A014 = C40171uH.A01(matrix2);
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        float[] fArr2 = this.A0A;
                        float A015 = C26049CrJ.A01((C26049CrJ) list.get(i3));
                        fArr2[i3] = A015;
                        float f4 = 0.1f;
                        if (i3 % 2 == 0) {
                            f4 = 1.0f;
                        }
                        if (A015 < f4) {
                            fArr2[i3] = f4;
                        }
                        fArr2[i3] = fArr2[i3] * A014;
                    }
                    C26049CrJ crJ = this.A08;
                    if (crJ == null) {
                        A012 = 0.0f;
                    } else {
                        A012 = A014 * C26049CrJ.A01(crJ);
                    }
                    paint.setPathEffect(new DashPathEffect(this.A0A, A012));
                }
                BEA.A13(paint, this.A02);
                C26049CrJ crJ2 = this.A01;
                if (crJ2 != null) {
                    float A016 = C26049CrJ.A01(crJ2);
                    if (A016 == 0.0f) {
                        blurMaskFilter = null;
                    } else {
                        if (A016 != this.A00) {
                            C26642D7p d7p = this.A0G;
                            if (d7p.A00 == A016) {
                                blurMaskFilter = d7p.A01;
                            } else {
                                blurMaskFilter = new BlurMaskFilter(A016 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                                d7p.A01 = blurMaskFilter;
                                d7p.A00 = A016;
                            }
                        }
                        this.A00 = A016;
                    }
                    paint.setMaskFilter(blurMaskFilter);
                    this.A00 = A016;
                }
                C26638D7l d7l = this.A03;
                if (d7l != null) {
                    d7l.A00(paint);
                }
                while (true) {
                    List list2 = this.A0F;
                    if (i2 < list2.size()) {
                        CMS cms = (CMS) list2.get(i2);
                        Canvas canvas2 = canvas;
                        if (cms.A00 != null) {
                            D7c d7c = cms.A00;
                            if (d7c != null) {
                                Path path = this.A05;
                                path.reset();
                                List list3 = cms.A01;
                                int size = list3.size();
                                while (true) {
                                    size--;
                                    if (size < 0) {
                                        break;
                                    }
                                    BEA.A11(matrix2, path, list3, size);
                                }
                                float A017 = C26049CrJ.A01(d7c.A02) / 100.0f;
                                float A018 = C26049CrJ.A01(d7c.A00) / 100.0f;
                                float A019 = C26049CrJ.A01(d7c.A01) / 360.0f;
                                if (A017 >= 0.01f || A018 <= 0.99f) {
                                    PathMeasure pathMeasure = this.A07;
                                    pathMeasure.setPath(path, false);
                                    float length = pathMeasure.getLength();
                                    while (pathMeasure.nextContour()) {
                                        length += pathMeasure.getLength();
                                    }
                                    float f5 = A019 * length;
                                    float f6 = (A017 * length) + f5;
                                    float min = Math.min((A018 * length) + f5, (f6 + length) - 1.0f);
                                    float f7 = 0.0f;
                                    for (int A0110 = AnonymousClass3MX.A01(list3); A0110 >= 0; A0110--) {
                                        Path path2 = this.A06;
                                        path2.set(((C28645ECd) list3.get(A0110)).BWP());
                                        path2.transform(matrix2);
                                        pathMeasure.setPath(path2, false);
                                        float length2 = pathMeasure.getLength();
                                        if (min > length) {
                                            float f8 = min - length;
                                            if (f8 < f7 + length2 && f7 < f8) {
                                                if (f6 > length) {
                                                    f2 = (f6 - length) / length2;
                                                } else {
                                                    f2 = 0.0f;
                                                }
                                                f3 = Math.min(f8 / length2, 1.0f);
                                                C40171uH.A03(path2, f2, f3, 0.0f);
                                                canvas2.drawPath(path2, paint);
                                                f7 += length2;
                                            }
                                        }
                                        if (f7 + length2 >= f6 && f7 <= min) {
                                            if (f7 + length2 > min || f6 >= f7) {
                                                if (f6 < f7) {
                                                    f = 0.0f;
                                                } else {
                                                    f = (f6 - f7) / length2;
                                                }
                                                if (min > f7 + length2) {
                                                    f3 = 1.0f;
                                                } else {
                                                    f3 = (min - f7) / length2;
                                                }
                                                C40171uH.A03(path2, f2, f3, 0.0f);
                                            }
                                            canvas2.drawPath(path2, paint);
                                        }
                                        f7 += length2;
                                    }
                                } else {
                                    canvas2.drawPath(path, paint);
                                }
                            }
                        } else {
                            Path path3 = this.A05;
                            path3.reset();
                            int size2 = cms.A01.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    break;
                                }
                                BEA.A11(matrix2, path3, cms.A01, size2);
                            }
                            canvas2.drawPath(path3, paint);
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void BNg(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A05;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.A0F;
            if (i < list.size()) {
                CMS cms = (CMS) list.get(i);
                for (int i2 = 0; i2 < cms.A01.size(); i2++) {
                    BEA.A11(matrix, path, cms.A01, i2);
                }
                i++;
            } else {
                RectF rectF2 = this.A0B;
                path.computeBounds(rectF2, false);
                BEA.A14(rectF2, rectF2.left, ((C22735BMy) this.A0E).A0C() / 2.0f);
                rectF.set(rectF2);
                BEA.A14(rectF, rectF.left, 1.0f);
                return;
            }
        }
    }

    public void C9s() {
        this.A0C.invalidateSelf();
    }

    public C26639D7m(Paint.Cap cap, Paint.Join join, C38631rd r7, C40561uu r8, C40561uu r9, C40541us r10, C26642D7p d7p, List list, float f) {
        C26049CrJ BHA;
        Paint paint = new Paint(1);
        this.A04 = paint;
        this.A00 = 0.0f;
        this.A0C = r7;
        this.A0G = d7p;
        AnonymousClass3MW.A1P(paint);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f);
        this.A0D = r10.BHA();
        this.A0E = r8.BHA();
        if (r9 == null) {
            BHA = null;
        } else {
            BHA = r9.BHA();
        }
        this.A08 = BHA;
        this.A09 = AnonymousClass000.A14(list);
        this.A0A = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.A09.add(((C40561uu) list.get(i)).BHA());
        }
        d7p.A0C(this.A0D);
        d7p.A0C(this.A0E);
        for (int i2 = 0; i2 < this.A09.size(); i2++) {
            d7p.A0C((C26049CrJ) this.A09.get(i2));
        }
        C26049CrJ crJ = this.A08;
        if (crJ != null) {
            d7p.A0C(crJ);
        }
        this.A0D.A0A(this);
        this.A0E.A0A(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C26049CrJ) this.A09.get(i3)).A0A(this);
        }
        C26049CrJ crJ2 = this.A08;
        if (crJ2 != null) {
            crJ2.A0A(this);
        }
        C24747CIj A082 = d7p.A08();
        if (A082 != null) {
            C26049CrJ BHA2 = A082.A00.BHA();
            this.A01 = BHA2;
            BHA2.A0A(this);
            d7p.A0C(this.A01);
        }
        CS8 A092 = d7p.A09();
        if (A092 != null) {
            this.A03 = new C26638D7l(this, d7p, A092);
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [X.E7G] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CIY(java.util.List r7, java.util.List r8) {
        /*
            r6 = this;
            int r3 = X.AnonymousClass3MX.A01(r7)
            r4 = 0
            r5 = r4
        L_0x0006:
            if (r3 < 0) goto L_0x0021
            java.lang.Object r2 = r7.get(r3)
            X.E7G r2 = (X.E7G) r2
            boolean r0 = r2 instanceof X.D7c
            if (r0 == 0) goto L_0x001e
            r0 = r2
            X.D7c r0 = (X.D7c) r0
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x001e
            r5 = r2
            X.D7c r5 = (X.D7c) r5
        L_0x001e:
            int r3 = r3 + -1
            goto L_0x0006
        L_0x0021:
            if (r5 == 0) goto L_0x0028
            java.util.List r0 = r5.A04
            r0.add(r6)
        L_0x0028:
            int r3 = X.AnonymousClass3MX.A01(r8)
        L_0x002c:
            if (r3 < 0) goto L_0x0068
            java.lang.Object r2 = r8.get(r3)
            X.E7G r2 = (X.E7G) r2
            boolean r0 = r2 instanceof X.D7c
            if (r0 == 0) goto L_0x0057
            r0 = r2
            X.D7c r0 = (X.D7c) r0
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x0057
            if (r4 == 0) goto L_0x0048
            java.util.List r0 = r6.A0F
            r0.add(r4)
        L_0x0048:
            X.D7c r2 = (X.D7c) r2
            X.CMS r4 = new X.CMS
            r4.<init>(r2)
            java.util.List r0 = r2.A04
            r0.add(r6)
        L_0x0054:
            int r3 = r3 + -1
            goto L_0x002c
        L_0x0057:
            boolean r0 = r2 instanceof X.C28645ECd
            if (r0 == 0) goto L_0x0054
            if (r4 != 0) goto L_0x0062
            X.CMS r4 = new X.CMS
            r4.<init>(r5)
        L_0x0062:
            java.util.List r0 = r4.A01
            r0.add(r2)
            goto L_0x0054
        L_0x0068:
            if (r4 == 0) goto L_0x006f
            java.util.List r0 = r6.A0F
            r0.add(r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26639D7m.CIY(java.util.List, java.util.List):void");
    }

    public void CFv(C26046CrD crD, C26046CrD crD2, List list, int i) {
        C40761vE.A01(this, crD, crD2, list, i);
    }
}
