package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.DOp  reason: case insensitive filesystem */
public final class C26993DOp implements C106685Wu {
    public final Context A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C27646Diq(this));
    public final C18100vl A02 = AnonymousClass1DF.A01(new C27647Dir(this));
    public final C18100vl A03 = AnonymousClass1DF.A01(new C27648Dis(this));
    public final C18100vl A04 = AnonymousClass1DF.A01(new C27649Dit(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new C27650Diu(this));
    public final C18100vl A06 = AnonymousClass1DF.A01(new C27651Div(this));
    public final C18100vl A07 = AnonymousClass1DF.A01(new C27652Diw(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(new C27653Dix(this));
    public final C18100vl A09 = AnonymousClass1DF.A01(new C27654Diy(this));
    public final C18100vl A0A = AnonymousClass1DF.A01(new C27655Diz(this));
    public final C18100vl A0B = AnonymousClass1DF.A01(new C27656Dj0(this));
    public final C18100vl A0C = AnonymousClass1DF.A01(new C27657Dj1(this));
    public final C18100vl A0D = AnonymousClass1DF.A01(new C27658Dj2(this));
    public final C18100vl A0E = AnonymousClass1DF.A01(new C27659Dj3(this));
    public final C18100vl A0F = AnonymousClass1DF.A01(new C27660Dj4(this));
    public final C18100vl A0G = AnonymousClass1DF.A01(new C27661Dj5(this));
    public final C18100vl A0H = AnonymousClass1DF.A01(new C27662Dj6(this));
    public final C18100vl A0I = AnonymousClass1DF.A01(new C27663Dj7(this));
    public final C18100vl A0J = AnonymousClass1DF.A01(new C27664Dj8(this));
    public final C18100vl A0K = AnonymousClass1DF.A01(new C27665Dj9(this));
    public final C18100vl A0L = AnonymousClass1DF.A01(new C27666DjA(this));
    public final C18100vl A0M = AnonymousClass1DF.A01(new C27667DjB(this));
    public final C18100vl A0N = AnonymousClass1DF.A01(new C27668DjC(this));
    public final C18100vl A0O = AnonymousClass1DF.A01(new C27669DjD(this));
    public final C18100vl A0P = AnonymousClass1DF.A01(new C27670DjE(this));
    public final C18100vl A0Q = AnonymousClass1DF.A01(new C27671DjF(this));
    public final C18100vl A0R = AnonymousClass1DF.A01(new C27672DjG(this));
    public final C18100vl A0S = AnonymousClass1DF.A01(new C27673DjH(this));
    public final C18100vl A0T = AnonymousClass1DF.A01(new C27674DjI(this));
    public final C18100vl A0U = AnonymousClass1DF.A01(new C27675DjJ(this));
    public final C18100vl A0V = AnonymousClass1DF.A01(new C27676DjK(this));
    public final C18100vl A0W = AnonymousClass1DF.A01(new C27677DjL(this));
    public final C18100vl A0X = AnonymousClass1DF.A01(new C27678DjM(this));
    public final C18100vl A0Y = AnonymousClass1DF.A01(new C27679DjN(this));
    public final C18100vl A0Z = AnonymousClass1DF.A01(new C27680DjO(this));
    public final C18100vl A0a = AnonymousClass1DF.A01(new C27681DjP(this));
    public final C18100vl A0b = AnonymousClass1DF.A01(C27907Dni.A00);
    public final C18100vl A0c = AnonymousClass1DF.A01(new C27682DjQ(this));
    public final C18100vl A0d = AnonymousClass1DF.A01(new C27683DjR(this));
    public final C18100vl A0e = AnonymousClass1DF.A01(new C27684DjS(this));
    public final C18100vl A0f = AnonymousClass1DF.A01(new C27685DjT(this));
    public final C18100vl A0g = AnonymousClass1DF.A01(new C27686DjU(this));
    public final C18100vl A0h = AnonymousClass1DF.A01(new C27687DjV(this));
    public final C18100vl A0i = AnonymousClass1DF.A01(new C27688DjW(this));
    public final C18100vl A0j = AnonymousClass1DF.A01(new C27689DjX(this));
    public final C18100vl A0k = AnonymousClass1DF.A01(new C27690DjY(this));
    public final C18100vl A0l = AnonymousClass1DF.A01(new C27691DjZ(this));
    public final C18100vl A0m = AnonymousClass1DF.A01(new C27692Dja(this));
    public final C18100vl A0n = AnonymousClass1DF.A01(new C27693Djb(this));
    public final C18100vl A0o = AnonymousClass1DF.A01(new C27694Djc(this));
    public final C18100vl A0p = AnonymousClass1DF.A01(new C27695Djd(this));

    public static final NinePatchDrawable A09(Paint paint, C26993DOp dOp, int i) {
        float f;
        byte[] bArr;
        C18100vl r0;
        boolean A1T = AnonymousClass000.A1T(i, 3);
        C18100vl r5 = dOp.A0h;
        float f2 = BE6.A0f(r5).A01 + BE6.A0f(r5).A05;
        C23807Bpz A0f2 = BE6.A0f(r5);
        if (A1T) {
            f = A0f2.A05;
        } else {
            f = A0f2.A0B;
        }
        float f3 = f2 + f;
        float A002 = A00(r5);
        Bitmap A0J2 = BE8.A0J((int) f3, (int) A002);
        Canvas canvas = new Canvas();
        canvas.setBitmap(A0J2);
        if (A1T) {
            canvas.scale(-1.0f, 1.0f, f3 / 2.0f, A002 / 2.0f);
            canvas.translate(-BE6.A0f(r5).A0E, 0.0f);
        }
        canvas.drawPath((Path) dOp.A0S.getValue(), BE6.A0P(dOp.A0n));
        canvas.drawPath((Path) dOp.A0R.getValue(), paint);
        boolean A1T2 = AnonymousClass000.A1T(i, 3);
        Resources resources = dOp.A00.getResources();
        if (A1T2) {
            bArr = (byte[]) dOp.A0X.getValue();
            r0 = dOp.A0i;
        } else {
            bArr = (byte[]) dOp.A0W.getValue();
            r0 = dOp.A0e;
        }
        return new NinePatchDrawable(resources, A0J2, bArr, (Rect) r0.getValue(), (String) null);
    }

    private final Bitmap A03(Paint paint) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        C18100vl r8 = this.A0Z;
        C25621Cj1 A0e2 = BE6.A0e(r8);
        if (A0e2 instanceof C23807Bpz) {
            f = ((C23807Bpz) A0e2).A01;
        } else {
            f = A0e2.A01;
        }
        float A012 = f + (2.0f * A01(r8));
        C25621Cj1 A0e3 = BE6.A0e(r8);
        if (A0e3 instanceof C23807Bpz) {
            f2 = ((C23807Bpz) A0e3).A0E;
        } else {
            f2 = A0e3.A0A;
        }
        C25621Cj1 A0e4 = BE6.A0e(r8);
        if (A0e4 instanceof C23807Bpz) {
            f3 = ((C23807Bpz) A0e4).A00;
        } else {
            f3 = A0e4.A00;
        }
        Bitmap A0J2 = BE8.A0J((int) A012, (int) (f3 + f2 + (2.0f * A02(r8))));
        Canvas canvas = new Canvas();
        canvas.setBitmap(A0J2);
        float A013 = A01(r8);
        float A022 = A02(r8);
        C25621Cj1 A0e5 = BE6.A0e(r8);
        if (A0e5 instanceof C23807Bpz) {
            f4 = ((C23807Bpz) A0e5).A01;
        } else {
            f4 = A0e5.A01;
        }
        float A014 = f4 + A01(r8);
        C25621Cj1 A0e6 = BE6.A0e(r8);
        if (A0e6 instanceof C23807Bpz) {
            f5 = ((C23807Bpz) A0e6).A00;
        } else {
            f5 = A0e6.A00;
        }
        RectF rectF = new RectF(A013, A022, A014, f5 + A02(r8));
        RectF rectF2 = new RectF(rectF.left, rectF.top + f2, rectF.right, rectF.bottom + f2);
        C25621Cj1 A0e7 = BE6.A0e(r8);
        if (A0e7 instanceof C23807Bpz) {
            f6 = ((C23807Bpz) A0e7).A02;
        } else {
            f6 = A0e7.A02;
        }
        canvas.drawRoundRect(rectF2, f6, f6, BE6.A0P(this.A0n));
        canvas.drawRoundRect(rectF, f6, f6, paint);
        return A0J2;
    }

    public static final Paint A04(C26993DOp dOp, int i, int i2) {
        Context context = dOp.A00;
        int A002 = C19740yt.A00(context, AnonymousClass1YL.A01(context, i, i2, false));
        Paint A0K2 = C108945cZ.A0K(1);
        A0K2.setColor(A002);
        A0K2.setDither(true);
        C108945cZ.A1L(A0K2);
        return A0K2;
    }

    public static final Paint A05(C26993DOp dOp, int i, int i2) {
        Context context = dOp.A00;
        int A002 = C19740yt.A00(context, AnonymousClass1YL.A01(context, i, i2, false));
        int A003 = C19740yt.A00(context, AnonymousClass1YL.A01(context, 2130972004, 2131103214, false));
        Paint A0K2 = C108945cZ.A0K(1);
        int alpha = Color.alpha(A003);
        int alpha2 = Color.alpha(A002);
        int i3 = alpha2 + alpha;
        A0K2.setColor(Color.argb(Math.min(255, i3), ((Color.red(A002) * alpha2) + (Color.red(A003) * alpha)) / i3, ((Color.green(A002) * alpha2) + (Color.green(A003) * alpha)) / i3, ((Color.blue(A002) * alpha2) + (Color.blue(A003) * alpha)) / i3));
        A0K2.setDither(true);
        C108945cZ.A1L(A0K2);
        return A0K2;
    }

    public static final NinePatchDrawable A06(Paint paint, C4G c4g, C26993DOp dOp, int i) {
        Bitmap bitmap;
        Canvas canvas;
        RectF rectF;
        RectF rectF2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        C18100vl r0;
        C18100vl r02;
        byte[] bArr;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        C23808Bq0 bq0 = C23808Bq0.A00;
        if (!C18070vi.A18(c4g, bq0) || i != 1) {
            if (!C18070vi.A18(c4g, bq0)) {
                C18100vl r8 = dOp.A0o;
                C25621Cj1 A0e2 = BE6.A0e(r8);
                if (A0e2 instanceof C23807Bpz) {
                    f2 = ((C23807Bpz) A0e2).A01;
                } else {
                    f2 = A0e2.A01;
                }
                float A012 = f2 + (2.0f * A01(r8));
                C25621Cj1 A0e3 = BE6.A0e(r8);
                if (A0e3 instanceof C23807Bpz) {
                    f3 = ((C23807Bpz) A0e3).A0E;
                } else {
                    f3 = A0e3.A0A;
                }
                C25621Cj1 A0e4 = BE6.A0e(r8);
                if (A0e4 instanceof C23807Bpz) {
                    f4 = ((C23807Bpz) A0e4).A00;
                } else {
                    f4 = A0e4.A00;
                }
                bitmap = BE8.A0J((int) A012, (int) (f4 + f3 + (2.0f * A02(r8))));
                canvas = new Canvas();
                canvas.setBitmap(bitmap);
                float A013 = A01(r8);
                float A022 = A02(r8);
                float A014 = A01(r8);
                C25621Cj1 A0e5 = BE6.A0e(r8);
                if (A0e5 instanceof C23807Bpz) {
                    f5 = ((C23807Bpz) A0e5).A01;
                } else {
                    f5 = A0e5.A01;
                }
                float f13 = A014 + f5;
                float A023 = A02(r8);
                C25621Cj1 A0e6 = BE6.A0e(r8);
                if (A0e6 instanceof C23807Bpz) {
                    f6 = ((C23807Bpz) A0e6).A00;
                } else {
                    f6 = A0e6.A00;
                }
                rectF = new RectF(A013, A022, f13, A023 + f6);
                rectF2 = new RectF(rectF.left, rectF.top + f3, rectF.right, rectF.bottom + f3);
                C25621Cj1 A0e7 = BE6.A0e(r8);
                if (A0e7 instanceof C23807Bpz) {
                    f = ((C23807Bpz) A0e7).A02;
                } else {
                    f = A0e7.A02;
                }
                canvas.drawRoundRect(rectF2, f, f, BE6.A0P(dOp.A0n));
                canvas.drawRoundRect(rectF, f, f, paint);
            } else if (i == 1) {
                bitmap = dOp.A03(paint);
            } else {
                C18100vl r2 = dOp.A0h;
                float f14 = BE6.A0f(r2).A01 + BE6.A0f(r2).A0B;
                float f15 = BE6.A0f(r2).A0E;
                bitmap = BE8.A0J((int) f14, (int) (BE6.A0f(r2).A00 + f15 + BE6.A0f(r2).A0B));
                canvas = new Canvas();
                canvas.setBitmap(bitmap);
                if (C18070vi.A18(bq0, C23809Bq1.A00)) {
                    C18100vl r4 = dOp.A0o;
                    f7 = A01(r4);
                    f8 = A02(r4);
                    float A015 = A01(r4);
                    C25621Cj1 A0e8 = BE6.A0e(r4);
                    if (A0e8 instanceof C23807Bpz) {
                        f12 = ((C23807Bpz) A0e8).A01;
                    } else {
                        f12 = A0e8.A01;
                    }
                    f9 = A015 + f12;
                    f10 = A02(r4);
                    C25621Cj1 A0e9 = BE6.A0e(r4);
                    if (A0e9 instanceof C23807Bpz) {
                        f11 = ((C23807Bpz) A0e9).A00;
                    } else {
                        f11 = A0e9.A00;
                    }
                } else {
                    C23807Bpz A0f2 = BE6.A0f(r2);
                    if (i == 3) {
                        f7 = A0f2.A0B;
                        f8 = BE6.A0f(r2).A0F;
                        f9 = (BE6.A0f(r2).A01 + BE6.A0f(r2).A08) - BE6.A0f(r2).A05;
                    } else {
                        f7 = A0f2.A08 + BE6.A0f(r2).A05;
                        f8 = BE6.A0f(r2).A0F;
                        f9 = BE6.A0f(r2).A01 + BE6.A0f(r2).A08;
                    }
                    f10 = BE6.A0f(r2).A00;
                    f11 = BE6.A0f(r2).A0F;
                }
                rectF = new RectF(f7, f8, f9, f10 + f11);
                rectF2 = new RectF(rectF.left, rectF.top + f15, rectF.right, rectF.bottom + f15);
                f = BE6.A0f(r2).A02;
                canvas.drawRoundRect(rectF2, f, f, BE6.A0P(dOp.A0n));
                canvas.drawRoundRect(rectF, f, f, paint);
            }
            C23809Bq1 bq1 = C23809Bq1.A00;
            if (C18070vi.A18(c4g, bq1)) {
                r0 = dOp.A0p;
            } else if (i == 1) {
                r0 = dOp.A0a;
            } else if (i != 3) {
                r0 = dOp.A0e;
            } else {
                r0 = dOp.A0i;
            }
            Rect rect = (Rect) r0.getValue();
            if (C18070vi.A18(c4g, bq1)) {
                bArr = ((ByteBuffer) dOp.A0Y.getValue()).array();
            } else {
                if (i == 1) {
                    r02 = dOp.A0V;
                } else {
                    r02 = dOp.A0X;
                }
                bArr = (byte[]) r02.getValue();
            }
            return new NinePatchDrawable(dOp.A00.getResources(), bitmap, bArr, rect, (String) null);
        }
        return new NinePatchDrawable(dOp.A00.getResources(), dOp.A03(paint), (byte[]) dOp.A0V.getValue(), (Rect) dOp.A0a.getValue(), (String) null);
    }

    public static final NinePatchDrawable A07(Paint paint, C26993DOp dOp) {
        C18100vl r6 = dOp.A0h;
        float f = BE6.A0f(r6).A01 + BE6.A0f(r6).A0B;
        float A002 = A00(r6);
        Bitmap A0J2 = BE8.A0J((int) f, (int) A002);
        Canvas canvas = new Canvas();
        canvas.setBitmap(A0J2);
        canvas.drawPaint(paint);
        RectF A042 = C108965cb.A04(f, A002);
        float f2 = (float) (((double) BE6.A0f(r6).A02) / 1.5d);
        canvas.drawRoundRect(A042, f2, f2, BE6.A0P(dOp.A0b));
        return new NinePatchDrawable(dOp.A00.getResources(), A0J2, (byte[]) dOp.A0X.getValue(), (Rect) dOp.A0e.getValue(), (String) null);
    }

    public static final NinePatchDrawable A08(Paint paint, C26993DOp dOp) {
        C18100vl r8 = dOp.A0h;
        float f = BE6.A0f(r8).A01 + (2.0f * BE6.A0f(r8).A0B);
        float A002 = A00(r8);
        Bitmap A0J2 = BE8.A0J((int) f, (int) A002);
        Canvas canvas = new Canvas();
        canvas.setBitmap(A0J2);
        canvas.drawPaint(paint);
        Path A0L2 = C108945cZ.A0L();
        RectF rectF = new RectF(0.0f, 0.0f, f, A002);
        float f2 = (float) (((double) BE6.A0f(r8).A02) / 1.5d);
        float[] fArr = new float[8];
        fArr[0] = f2;
        fArr[1] = f2;
        fArr[2] = f2;
        BE9.A1N(fArr, f2, 0.0f);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        A0L2.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(A0L2, BE6.A0P(dOp.A0b));
        return new NinePatchDrawable(dOp.A00.getResources(), A0J2, (byte[]) dOp.A0X.getValue(), (Rect) dOp.A0e.getValue(), (String) null);
    }

    public static final AnonymousClass061 A0A(Drawable drawable, Drawable drawable2) {
        AnonymousClass061 r3 = new AnonymousClass061();
        int[] A1X = BE6.A1X();
        A1X[0] = 16842919;
        r3.A0B(A1X, drawable2);
        int[] A1W = C108945cZ.A1W();
        // fill-array-data instruction
        A1W[0] = 16842910;
        A1W[1] = 16842908;
        r3.A0B(A1W, drawable2);
        r3.A0B(new int[0], drawable);
        return r3;
    }

    public static C23807Bpz A0B(C26993DOp dOp) {
        return (C23807Bpz) dOp.A0h.getValue();
    }

    public static final ByteBuffer A0C(int i, int i2, int i3, int i4) {
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i);
        order.putInt(i2);
        order.putInt(i3);
        order.putInt(i4);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        return order;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
            return false;
        }
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.bubble.DynamicBubbleProvider");
        return C18070vi.A18(this.A00, ((C26993DOp) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C26993DOp(Context context, AnonymousClass10I r4) {
        C18070vi.A0j(context, r4);
        this.A00 = context;
        r4.CGN(new C21446AkD(this, 9));
        r4.CGN(new C21446AkD(this, 10));
    }

    public static float A00(C18100vl r2) {
        return ((C23807Bpz) r2.getValue()).A00 + ((C23807Bpz) r2.getValue()).A0E + ((C23807Bpz) r2.getValue()).A0B;
    }

    public static float A01(C18100vl r1) {
        C25621Cj1 cj1 = (C25621Cj1) r1.getValue();
        if (cj1 instanceof C23807Bpz) {
            return ((C23807Bpz) cj1).A08;
        }
        return cj1.A05;
    }

    public static float A02(C18100vl r1) {
        C25621Cj1 cj1 = (C25621Cj1) r1.getValue();
        if (cj1 instanceof C23807Bpz) {
            return ((C23807Bpz) cj1).A0F;
        }
        return cj1.A0B;
    }
}
