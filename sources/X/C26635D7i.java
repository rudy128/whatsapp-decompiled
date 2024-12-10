package X;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: X.D7i  reason: case insensitive filesystem */
public class C26635D7i implements C28645ECd, E3k, C28647ECf {
    public boolean A00;
    public final Path A01 = C108945cZ.A0L();
    public final C38631rd A02;
    public final C26049CrJ A03;
    public final C26049CrJ A04;
    public final C26049CrJ A05;
    public final C26049CrJ A06;
    public final C26049CrJ A07;
    public final C26049CrJ A08;
    public final C26049CrJ A09;
    public final boolean A0A;
    public final C25042CUw A0B = new C25042CUw();
    public final Integer A0C;
    public final String A0D;
    public final boolean A0E;

    public static double A00(float f, float f2) {
        return (double) ((float) (Math.atan2((double) f, (double) f2) - 1.5707963267948966d));
    }

    public void C9s() {
        this.A00 = false;
        this.A02.invalidateSelf();
    }

    public void CIY(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            E7G e7g = (E7G) list.get(i);
            if ((e7g instanceof D7c) && ((D7c) e7g).A03 == AnonymousClass00R.A00) {
                D7c d7c = (D7c) e7g;
                this.A0B.A00.add(d7c);
                d7c.A04.add(this);
            }
        }
    }

    public void BBs(C25723Ckt ckt, Object obj) {
        C26049CrJ crJ;
        if (obj == EBL.A0K) {
            crJ = this.A07;
        } else if (obj == EBL.A0L) {
            crJ = this.A09;
        } else if (obj == EBL.A03) {
            crJ = this.A08;
        } else if (obj != EBL.A0G || (crJ = this.A03) == null) {
            if (obj == EBL.A0I) {
                crJ = this.A05;
            } else if (obj != EBL.A0H || (crJ = this.A04) == null) {
                if (obj == EBL.A0J) {
                    crJ = this.A06;
                } else {
                    return;
                }
            }
        }
        crJ.A0B(ckt);
    }

    public Path BWP() {
        float f;
        float cos;
        float sin;
        double d;
        float f2;
        float f3;
        boolean z = this.A00;
        Path path = this.A01;
        if (!z) {
            path.reset();
            if (!this.A0E) {
                int intValue = this.A0C.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        int floor = (int) Math.floor((double) C26049CrJ.A01(this.A07));
                        double radians = Math.toRadians(((double) C26049CrJ.A01(this.A09)) - 90.0d);
                        double d2 = (double) floor;
                        float A012 = C26049CrJ.A01(this.A06) / 100.0f;
                        float A013 = C26049CrJ.A01(this.A05);
                        double d3 = (double) A013;
                        float cos2 = (float) (d3 * Math.cos(radians));
                        float sin2 = (float) (d3 * Math.sin(radians));
                        path.moveTo(cos2, sin2);
                        double d4 = (double) ((float) (6.283185307179586d / d2));
                        double d5 = radians + d4;
                        double ceil = Math.ceil(d2);
                        int i = 0;
                        while (((double) i) < ceil) {
                            float cos3 = (float) (d3 * Math.cos(d5));
                            float sin3 = (float) (d3 * Math.sin(d5));
                            if (A012 != 0.0f) {
                                double A002 = A00(sin2, cos2);
                                float cos4 = (float) Math.cos(A002);
                                float sin4 = (float) Math.sin(A002);
                                double A003 = A00(sin3, cos3);
                                float f4 = A013 * A012 * 0.25f;
                                Path path2 = path;
                                float f5 = cos2 - (f4 * cos4);
                                float f6 = sin2 - (f4 * sin4);
                                path2.cubicTo(f5, f6, cos3 + (f4 * ((float) Math.cos(A003))), sin3 + (f4 * ((float) Math.sin(A003))), cos3, sin3);
                            } else {
                                path.lineTo(cos3, sin3);
                            }
                            d5 += d4;
                            i++;
                            cos2 = cos3;
                            sin2 = sin3;
                        }
                    }
                    path.close();
                    this.A0B.A00(path);
                } else {
                    float A014 = C26049CrJ.A01(this.A07);
                    double radians2 = Math.toRadians(((double) C26049CrJ.A01(this.A09)) - 90.0d);
                    double d6 = (double) A014;
                    float f7 = (float) (6.283185307179586d / d6);
                    if (this.A0A) {
                        f7 *= -1.0f;
                    }
                    float f8 = f7 / 2.0f;
                    float f9 = A014 - ((float) ((int) A014));
                    if (f9 != 0.0f) {
                        radians2 += (double) ((1.0f - f9) * f8);
                    }
                    float A015 = C26049CrJ.A01(this.A05);
                    float A016 = C26049CrJ.A01(this.A03);
                    C26049CrJ crJ = this.A04;
                    if (crJ != null) {
                        f = C26049CrJ.A01(crJ) / 100.0f;
                    } else {
                        f = 0.0f;
                    }
                    float A017 = C26049CrJ.A01(this.A06) / 100.0f;
                    if (f9 != 0.0f) {
                        f2 = ((A015 - A016) * f9) + A016;
                        double d7 = (double) f2;
                        cos = (float) (d7 * Math.cos(radians2));
                        sin = (float) (d7 * Math.sin(radians2));
                        path.moveTo(cos, sin);
                        d = radians2 + ((double) ((f7 * f9) / 2.0f));
                    } else {
                        double d8 = (double) A015;
                        cos = (float) (d8 * Math.cos(radians2));
                        sin = (float) (d8 * Math.sin(radians2));
                        path.moveTo(cos, sin);
                        d = radians2 + ((double) f8);
                        f2 = 0.0f;
                    }
                    double ceil2 = Math.ceil(d6) * 2.0d;
                    int i2 = 0;
                    boolean z2 = false;
                    while (((double) i2) < ceil2) {
                        float f10 = A016;
                        if (z2) {
                            f10 = A015;
                        }
                        if (f2 == 0.0f || ((double) i2) != ceil2 - 2.0d) {
                            f3 = f8;
                        } else {
                            f3 = (f7 * f9) / 2.0f;
                        }
                        if (f2 != 0.0f && ((double) i2) == ceil2 - 1.0d) {
                            f10 = f2;
                        }
                        double d9 = (double) f10;
                        float cos5 = (float) (d9 * Math.cos(d));
                        float sin5 = (float) (d9 * Math.sin(d));
                        if (f == 0.0f && A017 == 0.0f) {
                            path.lineTo(cos5, sin5);
                        } else {
                            double A004 = A00(sin, cos);
                            float cos6 = (float) Math.cos(A004);
                            float sin6 = (float) Math.sin(A004);
                            double A005 = A00(sin5, cos5);
                            float cos7 = (float) Math.cos(A005);
                            float sin7 = (float) Math.sin(A005);
                            float f11 = A017;
                            float f12 = f;
                            float f13 = A015;
                            float f14 = A016;
                            if (z2) {
                                f11 = f12;
                                f12 = A017;
                                f13 = A016;
                                f14 = A015;
                            }
                            float f15 = f13 * f11 * 0.47829f;
                            float f16 = f15 * cos6;
                            float f17 = f15 * sin6;
                            float f18 = f14 * f12 * 0.47829f;
                            float f19 = f18 * cos7;
                            float f20 = f18 * sin7;
                            if (f9 != 0.0f) {
                                if (i2 == 0) {
                                    f16 *= f9;
                                    f17 *= f9;
                                } else if (((double) i2) == ceil2 - 1.0d) {
                                    f19 *= f9;
                                    f20 *= f9;
                                }
                            }
                            path.cubicTo(cos - f16, sin - f17, cos5 + f19, sin5 + f20, cos5, sin5);
                        }
                        d += (double) f3;
                        z2 = !z2;
                        i2++;
                        cos = cos5;
                        sin = sin5;
                    }
                }
                PointF A022 = C26049CrJ.A02(this.A08);
                path.offset(A022.x, A022.y);
                path.close();
                path.close();
                this.A0B.A00(path);
            }
            this.A00 = true;
        }
        return path;
    }

    public String getName() {
        return this.A0D;
    }

    public C26635D7i(C38631rd r9, D7w d7w, C26642D7p d7p) {
        C26049CrJ crJ;
        this.A02 = r9;
        this.A0D = d7w.A08;
        Integer num = d7w.A07;
        this.A0C = num;
        this.A0E = d7w.A09;
        this.A0A = d7w.A0A;
        C26049CrJ BHA = d7w.A04.BHA();
        this.A07 = BHA;
        C26049CrJ BHA2 = d7w.A06.BHA();
        this.A08 = BHA2;
        C26049CrJ BHA3 = d7w.A05.BHA();
        this.A09 = BHA3;
        C26049CrJ BHA4 = d7w.A02.BHA();
        this.A05 = BHA4;
        C26049CrJ BHA5 = d7w.A03.BHA();
        this.A06 = BHA5;
        Integer num2 = AnonymousClass00R.A00;
        if (num == num2) {
            this.A03 = d7w.A00.BHA();
            crJ = d7w.A01.BHA();
        } else {
            crJ = null;
            this.A03 = null;
        }
        this.A04 = crJ;
        d7p.A0C(BHA);
        d7p.A0C(BHA2);
        d7p.A0C(BHA3);
        d7p.A0C(BHA4);
        d7p.A0C(BHA5);
        if (num == num2) {
            d7p.A0C(this.A03);
            d7p.A0C(this.A04);
        }
        BHA.A0A(this);
        BHA2.A0A(this);
        BHA3.A0A(this);
        BHA4.A0A(this);
        BHA5.A0A(this);
        if (num == num2) {
            this.A03.A0A(this);
            this.A04.A0A(this);
        }
    }

    public void CFv(C26046CrD crD, C26046CrD crD2, List list, int i) {
        C40761vE.A01(this, crD, crD2, list, i);
    }
}
