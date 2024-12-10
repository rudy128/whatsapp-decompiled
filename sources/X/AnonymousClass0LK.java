package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.0LK  reason: invalid class name */
public abstract class AnonymousClass0LK {
    public static final void A01(C17040te r36, List list) {
        Path.FillType fillType;
        Object obj;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        C17040te r20 = r36;
        Path path = ((AnonymousClass0WS) r20).A03;
        boolean A1Z = AnonymousClass000.A1Z(path.getFillType(), Path.FillType.EVEN_ODD);
        path.rewind();
        if (A1Z) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
        if (list.isEmpty()) {
            obj = AnonymousClass0A7.A00;
        } else {
            obj = list.get(0);
        }
        AnonymousClass0HR r1 = (AnonymousClass0HR) obj;
        int size = list.size();
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        int i = 0;
        while (i < size) {
            AnonymousClass0HR r4 = (AnonymousClass0HR) list.get(i);
            if (r4 instanceof AnonymousClass0A7) {
                path.close();
                f14 = f16;
                float f18 = f17;
                path.moveTo(f14, f18);
                f12 = f14;
                f13 = f18;
                f15 = f18;
            } else {
                if (r4 instanceof C017909x) {
                    C017909x r0 = (C017909x) r4;
                    float f19 = r0.A00;
                    f14 += f19;
                    float f20 = r0.A01;
                    f15 += f20;
                    path.rMoveTo(f19, f20);
                } else if (r4 instanceof C017609u) {
                    C017609u r02 = (C017609u) r4;
                    f14 = r02.A00;
                    f15 = r02.A01;
                    path.moveTo(f14, f15);
                } else {
                    if (r4 instanceof C017809w) {
                        C017809w r12 = (C017809w) r4;
                        float f21 = r12.A00;
                        f11 = r12.A01;
                        path.rLineTo(f21, f11);
                        f14 += f21;
                    } else {
                        if (r4 instanceof C017509t) {
                            C017509t r03 = (C017509t) r4;
                            f14 = r03.A00;
                            f15 = r03.A01;
                        } else if (r4 instanceof C017209q) {
                            float f22 = ((C017209q) r4).A00;
                            path.rLineTo(f22, 0.0f);
                            f14 += f22;
                        } else if (r4 instanceof C017109p) {
                            f14 = ((C017109p) r4).A00;
                        } else if (r4 instanceof C017309r) {
                            f11 = ((C017309r) r4).A00;
                            path.rLineTo(0.0f, f11);
                        } else if (r4 instanceof C017409s) {
                            f15 = ((C017409s) r4).A00;
                        } else {
                            if (r4 instanceof AnonymousClass0A4) {
                                AnonymousClass0A4 r04 = (AnonymousClass0A4) r4;
                                float f23 = r04.A00;
                                float f24 = r04.A03;
                                f = r04.A01;
                                f2 = r04.A04;
                                f3 = r04.A02;
                                f4 = r04.A05;
                                path.rCubicTo(f23, f24, f, f2, f3, f4);
                            } else {
                                if (r4 instanceof AnonymousClass0A3) {
                                    AnonymousClass0A3 r05 = (AnonymousClass0A3) r4;
                                    f5 = r05.A00;
                                    f6 = r05.A03;
                                    f12 = r05.A01;
                                    f13 = r05.A04;
                                    f7 = r05.A02;
                                    f8 = r05.A05;
                                } else if (r4 instanceof AnonymousClass0A2) {
                                    if (r1.A00) {
                                        f9 = f14 - f12;
                                        f10 = f15 - f13;
                                    } else {
                                        f9 = 0.0f;
                                        f10 = 0.0f;
                                    }
                                    AnonymousClass0A2 r06 = (AnonymousClass0A2) r4;
                                    f = r06.A00;
                                    f2 = r06.A02;
                                    f3 = r06.A01;
                                    f4 = r06.A03;
                                    path.rCubicTo(f9, f10, f, f2, f3, f4);
                                } else if (r4 instanceof AnonymousClass0A0) {
                                    if (r1.A00) {
                                        f5 = (2.0f * f14) - f12;
                                        f6 = (2.0f * f15) - f13;
                                    } else {
                                        f5 = f14;
                                        f6 = f15;
                                    }
                                    AnonymousClass0A0 r07 = (AnonymousClass0A0) r4;
                                    f12 = r07.A00;
                                    f13 = r07.A02;
                                    f7 = r07.A01;
                                    f8 = r07.A03;
                                } else {
                                    if (r4 instanceof AnonymousClass0A1) {
                                        AnonymousClass0A1 r08 = (AnonymousClass0A1) r4;
                                        f = r08.A00;
                                        f2 = r08.A02;
                                        f3 = r08.A01;
                                        f4 = r08.A03;
                                    } else if (r4 instanceof C018109z) {
                                        C018109z r09 = (C018109z) r4;
                                        f12 = r09.A00;
                                        f13 = r09.A02;
                                        f14 = r09.A01;
                                        f15 = r09.A03;
                                        path.quadTo(f12, f13, f14, f15);
                                    } else if (r4 instanceof C018009y) {
                                        if (r1.A01) {
                                            f = f14 - f12;
                                            f2 = f15 - f13;
                                        } else {
                                            f = 0.0f;
                                            f2 = 0.0f;
                                        }
                                        C018009y r010 = (C018009y) r4;
                                        f3 = r010.A00;
                                        f4 = r010.A01;
                                    } else if (r4 instanceof C017709v) {
                                        if (r1.A01) {
                                            f14 = (2.0f * f14) - f12;
                                            f15 = (2.0f * f15) - f13;
                                        }
                                        C017709v r011 = (C017709v) r4;
                                        float f25 = r011.A00;
                                        float f26 = r011.A01;
                                        path.quadTo(f14, f15, f25, f26);
                                        f13 = f15;
                                        f15 = f26;
                                        f12 = f14;
                                        f14 = f25;
                                    } else if (r4 instanceof AnonymousClass0A6) {
                                        AnonymousClass0A6 r9 = (AnonymousClass0A6) r4;
                                        f12 = r9.A00 + f14;
                                        f13 = r9.A01 + f15;
                                        double d = (double) f15;
                                        double d2 = (double) f14;
                                        double d3 = d;
                                        double d4 = (double) f12;
                                        double d5 = (double) f13;
                                        A00(r20, d2, d3, d4, d5, (double) r9.A02, (double) r9.A04, (double) r9.A03, r9.A05, r9.A06);
                                        f15 = f13;
                                        f14 = f12;
                                    } else if (r4 instanceof AnonymousClass0A5) {
                                        double d6 = (double) f15;
                                        AnonymousClass0A5 r14 = (AnonymousClass0A5) r4;
                                        f12 = r14.A00;
                                        f13 = r14.A01;
                                        double d7 = (double) f14;
                                        double d8 = d6;
                                        double d9 = (double) f12;
                                        double d10 = (double) f13;
                                        A00(r20, d7, d8, d9, d10, (double) r14.A02, (double) r14.A04, (double) r14.A03, r14.A05, r14.A06);
                                        f14 = f12;
                                        f15 = f13;
                                    }
                                    path.rQuadTo(f, f2, f3, f4);
                                }
                                path.cubicTo(f5, f6, f12, f13, f14, f15);
                            }
                            f12 = f + f14;
                            f13 = f2 + f15;
                            f14 += f3;
                            f15 += f4;
                        }
                        path.lineTo(f14, f15);
                    }
                    f15 += f11;
                }
                f16 = f14;
                f17 = f15;
            }
            i++;
            r1 = r4;
        }
    }

    public static final void A00(C17040te r48, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d2;
        double d11 = d;
        double d12 = d5;
        double d13 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d13);
        double sin = Math.sin(d13);
        double d14 = ((d * cos) + (d2 * sin)) / d5;
        double d15 = (((-d11) * sin) + (d2 * cos)) / d6;
        double d16 = ((d3 * cos) + (d4 * sin)) / d5;
        double d17 = (((-d3) * sin) + (d4 * cos)) / d6;
        double d18 = d14 - d16;
        double d19 = d15 - d17;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d15 + d17) / 2.0d;
        double d22 = (d18 * d18) + (d19 * d19);
        if (d22 != 0.0d) {
            double d23 = (1.0d / d22) - 0.25d;
            boolean z3 = z;
            boolean z4 = z2;
            if (d23 < 0.0d) {
                double sqrt = (double) ((float) (Math.sqrt(d22) / 1.99999d));
                A00(r48, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d23);
            double d24 = d18 * sqrt2;
            double d25 = sqrt2 * d19;
            boolean z5 = z4;
            if (z3 == z5) {
                d8 = d20 - d25;
                d9 = d21 + d24;
            } else {
                d8 = d20 + d25;
                d9 = d21 - d24;
            }
            double atan2 = Math.atan2(d15 - d9, d14 - d8);
            double atan22 = Math.atan2(d17 - d9, d16 - d8) - atan2;
            if (z5 != AnonymousClass000.A1Q((atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1)))) {
                if (atan22 > 0.0d) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d26 = d8 * d5;
            double d27 = d9 * d6;
            double d28 = (d26 * cos) - (d27 * sin);
            double d29 = (d26 * sin) + (d27 * cos);
            int ceil = (int) Math.ceil(Math.abs((4.0d * atan22) / 3.141592653589793d));
            double cos2 = Math.cos(atan2);
            double sin2 = Math.sin(atan2);
            double d30 = -d12;
            double d31 = d30 * cos;
            double d32 = d6 * sin;
            double d33 = (d31 * sin2) - (d32 * cos2);
            double d34 = d30 * sin;
            double d35 = d6 * cos;
            double d36 = (d34 * sin2) + (d35 * cos2);
            double d37 = atan22 / ((double) ceil);
            int i = 0;
            while (i < ceil) {
                double d38 = atan2 + d37;
                double sin3 = Math.sin(d38);
                double cos3 = Math.cos(d38);
                double d39 = (d28 + ((d5 * cos) * cos3)) - (d32 * sin3);
                double d40 = d29 + (d5 * sin * cos3) + (d35 * sin3);
                double d41 = (d31 * sin3) - (d32 * cos3);
                double d42 = (d34 * sin3) + (d35 * cos3);
                double d43 = d38 - atan2;
                double tan = Math.tan(d43 / 2.0d);
                double sin4 = (Math.sin(d43) * (Math.sqrt(4.0d + ((3.0d * tan) * tan)) - 1.0d)) / 3.0d;
                ((AnonymousClass0WS) r48).A03.cubicTo((float) (d11 + (d33 * sin4)), (float) (d10 + (d36 * sin4)), (float) (d39 - (sin4 * d41)), (float) (d40 - (sin4 * d42)), (float) d39, (float) d40);
                i++;
                d33 = d41;
                d10 = d40;
                d11 = d39;
                d36 = d42;
                atan2 = d38;
            }
        }
    }
}
