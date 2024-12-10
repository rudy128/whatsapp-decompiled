package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;

/* renamed from: X.8KV  reason: invalid class name */
public class AnonymousClass8KV extends DA3 implements Comparable {
    public int A00 = 3;
    public Bitmap A01;
    public AF1 A02;
    public BF2 A03;
    public boolean A04 = true;
    public final int A05;
    public final Context A06;
    public final Bitmap A07;
    public final Bitmap A08;
    public final Rect A09 = AnonymousClass3MW.A07();
    public final RectF A0A = new RectF();
    public final AnonymousClass8CJ A0B;
    public final C189379iz A0C;
    public final C129976ig A0D;

    public static void A00(AnonymousClass8KV r7) {
        C129976ig r6 = r7.A0D;
        String str = r7.A02.A0B.A09.A03;
        int A012 = C62762rw.A01(r7.A06, 24.0f);
        r6.A00.A03(new C20468AMf(new APD(r7, 1), str, A012, A012), false);
    }

    public static void A01(AnonymousClass8KV r7) {
        String str;
        AF0 af0 = r7.A02.A0B.A03;
        if (af0 != null && (str = af0.A0G) != null) {
            C129976ig r5 = r7.A0D;
            int A012 = C62762rw.A01(r7.A06, 30.0f);
            r5.A00.A03(new C20468AMf(new APD(r7, 0), str, A012, A012), false);
        }
    }

    public int A06(float f, float f2) {
        if (this.A0C == null || !this.A0A.contains(f, f2)) {
            return 0;
        }
        return 1;
    }

    public boolean A07(float f, float f2) {
        C189379iz r1 = this.A0C;
        if (r1 == null || !this.A0A.contains(f, f2)) {
            return false;
        }
        r1.A00(this.A02, this);
        return true;
    }

    public void A08(Canvas canvas) {
        Rect rect;
        int round;
        int round2;
        int round3;
        float f;
        C26152CtJ ctJ = this.A08;
        double d = this.A00;
        double d2 = this.A01;
        float[] fArr = this.A0A;
        ctJ.A09(fArr, d, d2);
        float f2 = fArr[0];
        float f3 = fArr[1];
        if (this.A02.A09) {
            BF2 bf2 = this.A03;
            float f4 = bf2.A02;
            float f5 = bf2.A03;
            rect = this.A09;
            float f6 = f5 / 2.0f;
            round = Math.round(f2 - f6);
            float f7 = f3 - f4;
            float f8 = f4 * 0.151767f;
            round2 = Math.round(f7 + f8);
            round3 = Math.round(f2 + f6);
            f = f3 + f8;
        } else {
            AnonymousClass8CJ r6 = this.A0B;
            float A002 = r6.A00();
            float max = Math.max(r6.A07, r6.A03);
            float f9 = r6.A05 / 2.0f;
            float f10 = f9 + f2;
            if (this.A00 == 1 && r6.A0I) {
                f10 += max;
            }
            rect = this.A09;
            round = Math.round(f2 - f9);
            float f11 = A002 / 2.0f;
            round2 = Math.round(f3 - f11);
            round3 = Math.round(f10);
            f = f3 + f11;
        }
        rect.set(round, round2, round3, Math.round(f));
        ctJ.A09(fArr, this.A00, this.A01);
        float f12 = (float) rect.left;
        float f13 = (float) rect.top;
        float width = (float) rect.width();
        float height = (float) rect.height();
        if (this.A02.A09) {
            float f14 = 0.146396f * width;
            this.A0A.set(f12 + f14, (0.12474f * height) + f13, (f12 + width) - f14, (f13 + height) - (0.151767f * height));
        } else {
            AnonymousClass8CJ r2 = this.A0B;
            if (r2.A09 == 2) {
                float A012 = AnonymousClass8BR.A01(this.A06, 20.0f);
                float A003 = r2.A00();
                float f15 = r2.A05;
                float f16 = (A012 / 2.0f) - (f15 / 2.0f);
                float f17 = 0.0f;
                if (f15 == A003) {
                    f17 = f16;
                }
                float f18 = f12 - f16;
                this.A0A.set(f18, f13 - f17, f18 + A012, f17 + f13 + height);
            } else if (r2.A0A == 2) {
                RectF rectF = this.A0A;
                float f19 = (float) this.A05;
                rectF.set(f12 - f19, f13 - f19, f12 + width + f19, f13 + height + f19);
            } else {
                float f20 = r2.A05;
                RectF rectF2 = this.A0A;
                float f21 = f12 + f20;
                float f22 = (float) this.A05;
                rectF2.set((f21 - width) - f22, f13 - f22, f21 + f22, f13 + height + f22);
            }
        }
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.translate(f12, f13);
        if (this.A02.A09) {
            BF2 bf22 = this.A03;
            bf22.draw(canvas2);
            if (this.A04) {
                bf22.A04 = 200;
                Context context = bf22.A0A;
                bf22.A01 = AnonymousClass8BR.A01(context, 22.0f);
                bf22.A00 = AnonymousClass8BR.A01(context, 120.0f);
                bf22.A05 = System.currentTimeMillis();
                bf22.A01();
                this.A04 = false;
            }
        } else {
            this.A0B.draw(canvas2);
        }
        canvas2.restore();
    }

    public void A09() {
        AF0 af0 = this.A02.A0B.A03;
        if (af0 != null) {
            AnonymousClass8CJ r3 = this.A0B;
            String str = af0.A0I;
            r3.A0G = str;
            Rect A072 = AnonymousClass3MW.A07();
            r3.A0R.getTextBounds(str, 0, str.length(), A072);
            float f = r3.A0M;
            float height = (float) A072.height();
            float f2 = new float[]{Math.min((float) A072.width(), f), height}[0];
            r3.A03 = f2;
            r3.A02 = height;
            if (f2 >= f) {
                r3.A0G = TextUtils.ellipsize(str, r3.A0W, f, TextUtils.TruncateAt.END).toString();
                r3.A03 = f;
            }
            String str2 = this.A02.A0B.A09.A01;
            r3.A0H = str2;
            Rect A073 = AnonymousClass3MW.A07();
            r3.A0V.getTextBounds(str2, 0, str2.length(), A073);
            float height2 = (float) A073.height();
            float f3 = new float[]{Math.min((float) A073.width(), f), height2}[0];
            r3.A07 = f3;
            r3.A06 = height2;
            if (f3 >= f) {
                r3.A0H = TextUtils.ellipsize(str2, r3.A0X, f, TextUtils.TruncateAt.END).toString();
                r3.A07 = f;
            }
        }
    }

    public void A0A() {
        int i = 0;
        this.A02.A09 = false;
        this.A03.A00();
        if (this.A00 != 2) {
            i = 1;
        }
        float f = (float) i;
        if (this.A02.A09) {
            f = 2.0f;
        }
        DAE dae = this.A07;
        dae.A0C(this);
        this.A02 = f;
        dae.A0B(this);
        A03();
    }

    public void A0B(int i) {
        Context context;
        float f;
        this.A00 = i;
        AnonymousClass8CJ r6 = this.A0B;
        if (r6.A09 == 2 && i == 1) {
            r6.A0D = 200;
            Context context2 = r6.A0Q;
            r6.A01 = AnonymousClass8BR.A01(context2, 6.0f);
            r6.A00 = AnonymousClass8BR.A01(context2, 20.0f);
            float f2 = r6.A01;
            r6.A05 = f2;
            r6.A04 = f2;
            r6.A0B = System.currentTimeMillis();
            r6.A0C = -1;
            r6.A01();
        }
        if (r6.A09 == 1 && i == 2) {
            r6.A0D = 200;
            Context context3 = r6.A0Q;
            r6.A01 = AnonymousClass8BR.A01(context3, 20.0f);
            r6.A00 = AnonymousClass8BR.A01(context3, 6.0f);
            float f3 = r6.A01;
            r6.A05 = f3;
            r6.A04 = f3;
            r6.A0C = System.currentTimeMillis();
            r6.A0B = -1;
            r6.A01();
        }
        r6.A09 = i;
        if (r6.A0B == -1 && r6.A0C == -1) {
            if (i == 2) {
                context = r6.A0Q;
                f = 6.0f;
            } else if (i == 1) {
                context = r6.A0Q;
                f = 20.0f;
            }
            float A012 = AnonymousClass8BR.A01(context, f);
            r6.A05 = A012;
            r6.A04 = A012;
            r6.A01();
        }
        int i2 = 1;
        if (this.A00 == 2) {
            i2 = 0;
        }
        float f4 = (float) i2;
        if (this.A02.A09) {
            f4 = 2.0f;
        }
        DAE dae = this.A07;
        dae.A0C(this);
        this.A02 = f4;
        dae.A0B(this);
        A03();
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A02.A0B.A0A.compareTo(((AnonymousClass8KV) obj).A02.A0B.A0A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A02.equals(((AnonymousClass8KV) obj).A02);
    }

    public AnonymousClass8KV(Bitmap bitmap, Bitmap bitmap2, DAE dae, C189379iz r8, C129976ig r9, AF1 af1, BF2 bf2) {
        super(dae);
        int i;
        Context context = dae.A0O;
        this.A06 = context;
        this.A02 = af1;
        this.A0C = r8;
        this.A07 = bitmap2;
        this.A0D = r9;
        this.A08 = bitmap;
        this.A03 = bf2;
        this.A05 = C62762rw.A01(context, 2.0f);
        C20291AEz aEz = this.A02.A0B;
        this.A00 = C26152CtJ.A01(aEz.A07);
        this.A01 = C26152CtJ.A00(aEz.A06);
        AnonymousClass8CJ r1 = new AnonymousClass8CJ(context);
        this.A0B = r1;
        A09();
        A00(this);
        String str = af1.A0B.A09.A02;
        if (str != null) {
            i = Color.parseColor(str);
        } else {
            i = -7829368;
        }
        r1.A08 = i;
    }

    public int hashCode() {
        return AnonymousClass000.A0P(this.A02, AnonymousClass3MW.A1a(), 0);
    }
}
