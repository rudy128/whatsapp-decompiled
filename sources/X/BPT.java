package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public final class BPT extends DA3 {
    public static final Matrix A0X = C108945cZ.A0J();
    public static final Paint A0Y = AnonymousClass3MZ.A0A();
    public static final Path A0Z = C108945cZ.A0L();
    public static final C199339zp A0a = new Object();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public int A0B;
    public int A0C;
    public DAE A0D;
    public C20269AEc A0E;
    public Object A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public float A0K;
    public float A0L;
    public float A0M;
    public View A0N;
    public C25478CgX A0O;
    public String A0P;
    public boolean A0Q;
    public final float A0R;
    public final float A0S;
    public final float[] A0T = new float[2];
    public final int A0U;
    public final float[] A0V;
    public final float[] A0W;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ce, code lost:
        if (r1 != null) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.BPT r11) {
        /*
            r1 = 0
            r11.A0N = r1
            X.DAE r6 = r11.A07
            X.E43 r0 = r6.A08
            r5 = 0
            r10 = 1
            if (r0 == 0) goto L_0x0013
            android.view.View r1 = r0.BSt(r11)
            r11.A0N = r1
            r11.A0Q = r5
        L_0x0013:
            r2 = -2
            if (r1 == 0) goto L_0x0059
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 != 0) goto L_0x0026
            android.view.View r1 = r11.A0N
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r2, r2)
            r1.setLayoutParams(r0)
        L_0x0026:
            android.view.View r4 = r11.A0N
            X.BIS r3 = r6.A0Q
            int r0 = r3.getWidth()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r3.getHeight()
            X.AnonymousClass3MY.A1C(r4, r0, r2, r1)
            android.view.View r0 = r11.A0N
            int r0 = r0.getMeasuredWidth()
            r11.A0C = r0
            android.view.View r0 = r11.A0N
            int r2 = r0.getMeasuredHeight()
            r11.A0B = r2
            android.view.View r1 = r11.A0N
            int r0 = r11.A0C
            r1.layout(r5, r5, r0, r2)
            r11.A00()
            r11.A03()
            return
        L_0x0059:
            r11.A0Q = r10
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r2, r2)
            android.content.Context r9 = r11.A06
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r9)
            r3.setLayoutParams(r4)
            r3.setOrientation(r10)
            java.lang.String r1 = r11.A0G
            r2 = 3
            if (r1 == 0) goto L_0x00cb
            java.lang.String r0 = r11.A0P
            if (r0 == 0) goto L_0x00cb
            int r8 = r11.A0U
            int r7 = r8 / r2
        L_0x007a:
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r9)
            r1.setPadding(r8, r8, r8, r7)
            java.lang.String r0 = r11.A0G
            r1.setText(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r0)
            r1.setMaxLines(r10)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r1.setTypeface(r0)
            r0 = 17
            r1.setGravity(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setTextColor(r0)
            r0 = -1
            r4.width = r0
            r3.addView(r1, r4)
        L_0x00a4:
            java.lang.String r0 = r11.A0P
            if (r0 == 0) goto L_0x00c7
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r9)
            r1.setPadding(r8, r7, r8, r8)
            r1.setText(r0)
            r0 = 5
            r1.setMaxLines(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r0)
            r0 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r1.setTextColor(r0)
            r4.gravity = r2
            r3.addView(r1, r4)
        L_0x00c7:
            r11.A0N = r3
            goto L_0x0026
        L_0x00cb:
            int r7 = r11.A0U
            r8 = r7
            if (r1 == 0) goto L_0x00a4
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BPT.A01(X.BPT):void");
    }

    private void A00() {
        Bitmap bitmap = this.A0O.A00;
        float width = (float) bitmap.getWidth();
        float[] fArr = this.A0V;
        float f = fArr[0] * width;
        this.A03 = f;
        this.A04 = width - f;
        float height = (float) bitmap.getHeight();
        float f2 = fArr[1] * height;
        this.A06 = f2;
        this.A00 = height - f2;
        float[] fArr2 = this.A0W;
        this.A01 = fArr2[0] * width;
        this.A07 = fArr2[1] * height;
        float f3 = this.A0S;
        if (width < f3) {
            this.A02 = (f3 - width) / 2.0f;
        } else {
            this.A02 = 0.0f;
        }
        if (height < f3) {
            this.A08 = (f3 - height) / 2.0f;
        } else {
            this.A08 = 0.0f;
        }
        Matrix matrix = A0X;
        matrix.setRotate(0.0f);
        float[] fArr3 = this.A0A;
        fArr3[0] = this.A03 - this.A01;
        fArr3[1] = this.A06 - this.A07;
        matrix.mapPoints(fArr3);
        this.A0M = ((float) this.A0B) + this.A0R + fArr3[1];
        float f4 = (float) (this.A0C / 2);
        float f5 = fArr3[0];
        this.A0K = f4 + f5;
        this.A0L = f4 - f5;
    }

    public static boolean A02(BPT bpt) {
        boolean z;
        BPT bpt2 = bpt;
        if (!bpt2.A0J || (bpt2.A0G == null && bpt2.A0P == null)) {
            z = false;
        } else {
            z = true;
        }
        bpt2.A05 = 0.0f + 0.0f;
        C199339zp r10 = A0a;
        double d = bpt2.A00;
        C26152CtJ ctJ = bpt2.A08;
        double A032 = d - ctJ.A03(bpt2.A03);
        r10.A01 = A032;
        double A033 = d + ctJ.A03(bpt2.A04);
        r10.A02 = A033;
        double d2 = bpt2.A01;
        double A034 = d2 - ctJ.A03(bpt2.A06);
        r10.A03 = A034;
        r10.A00 = d2 + ctJ.A03(bpt2.A00);
        if (z) {
            double A035 = d2 - ctJ.A03(bpt2.A0M);
            if (A035 < A034) {
                r10.A03 = A035;
            }
            double A036 = d - ctJ.A03(bpt2.A0K);
            if (A036 < A032) {
                r10.A01 = A036;
            }
            double A037 = d + ctJ.A03(bpt2.A0L);
            if (A033 < A037) {
                r10.A02 = A037;
            }
        }
        float[] fArr = bpt2.A0A;
        C199339zp r4 = bpt2.A09;
        ctJ.A07(r4);
        if (r10.A00 >= r4.A03 && r10.A03 <= r4.A00) {
            fArr[0] = (float) ((int) Math.ceil(r4.A01 - r10.A02));
            float floor = (float) ((int) Math.floor(r4.A02 - r10.A01));
            fArr[1] = floor;
            float f = fArr[0];
            if (f <= floor) {
                ctJ.A08(fArr, d + ((double) f), d2);
                bpt2.A09 = fArr[0];
                bpt2.A0A = fArr[1];
                return true;
            }
        }
        return false;
    }

    public void A09() {
        if (this.A0J && this.A03 != 1) {
            this.A03 = 1;
            DAE dae = this.A0D;
            if (dae != null) {
                dae.A0C(this);
                dae.A0B(this);
            }
        }
        this.A0J = false;
    }

    public void A0B(C20269AEc aEc) {
        this.A0E = aEc;
        this.A00 = C26152CtJ.A01(aEc.A01);
        this.A01 = C26152CtJ.A00(aEc.A00);
        A03();
    }

    public void A0C(C25478CgX cgX) {
        if (cgX == null) {
            cgX = C25930Cou.A00();
        }
        this.A0O = cgX;
        A00();
        A03();
    }

    public BPT(DAE dae, C25612Cis cis) {
        super(dae);
        float[] fArr = new float[2];
        this.A0W = fArr;
        float[] fArr2 = new float[2];
        this.A0V = fArr2;
        C20269AEc aEc = cis.A00;
        this.A0E = aEc;
        this.A00 = C26152CtJ.A01(aEc.A01);
        this.A01 = C26152CtJ.A00(aEc.A00);
        C25478CgX cgX = cis.A01;
        this.A0O = cgX == null ? C25930Cou.A00() : cgX;
        this.A0G = cis.A03;
        this.A0P = cis.A02;
        this.A04 = true;
        this.A02 = 0.0f;
        float[] fArr3 = cis.A06;
        fArr2[0] = fArr3[0];
        fArr2[1] = fArr3[1];
        float[] fArr4 = cis.A07;
        fArr[0] = fArr4[0];
        fArr[1] = fArr4[1];
        float f = this.A0B;
        this.A0S = 48.0f * f;
        this.A0U = (int) (8.0f * f);
        this.A0R = f * 5.0f;
        A00();
    }

    public void A08(Canvas canvas) {
        boolean z;
        long nanoTime = System.nanoTime();
        try {
            Bitmap bitmap = this.A0O.A00;
            if (!this.A0J || (this.A0G == null && this.A0P == null)) {
                z = false;
            } else {
                z = true;
            }
            if (A02(this)) {
                Paint paint = A0Y;
                paint.setAlpha((int) (1.0f * 255.0f));
                Matrix matrix = A0X;
                matrix.setTranslate(this.A09 - this.A03, this.A0A - this.A06);
                matrix.postRotate(this.A05, this.A09, this.A0A);
                Canvas canvas2 = canvas;
                canvas2.drawBitmap(bitmap, matrix, paint);
                paint.setAlpha(255);
                if (z) {
                    float[] fArr = this.A0T;
                    fArr[0] = this.A01;
                    fArr[1] = this.A07;
                    matrix.mapPoints(fArr);
                    long nanoTime2 = System.nanoTime();
                    int i = this.A0C / 2;
                    if (this.A0Q) {
                        Path path = A0Z;
                        path.reset();
                        float f = (float) i;
                        float f2 = fArr[1] - ((float) this.A0B);
                        float f3 = this.A0R;
                        float f4 = f3 * 1.0f;
                        path.moveTo(fArr[0] - f, f2 - f4);
                        path.lineTo(fArr[0] + f, (fArr[1] - ((float) this.A0B)) - f4);
                        path.lineTo(fArr[0] + f, fArr[1] - f4);
                        path.lineTo(fArr[0] + f3, fArr[1] - f4);
                        path.lineTo(fArr[0], fArr[1]);
                        path.lineTo(fArr[0] - f3, fArr[1] - f4);
                        path.lineTo(fArr[0] - f, fArr[1] - f4);
                        path.close();
                        paint.setColor(-16777216);
                        paint.setShadowLayer(12.0f, 0.0f, 0.0f, -16777216);
                        canvas2.drawPath(path, paint);
                        int i2 = -1;
                        if (this.A0I) {
                            i2 = -2236963;
                        }
                        paint.setColor(i2);
                        canvas2.drawPath(path, paint);
                    }
                    matrix.setTranslate(fArr[0] - ((float) i), (fArr[1] - ((float) this.A0B)) - this.A0R);
                    this.A0N.setDrawingCacheEnabled(true);
                    canvas2.drawBitmap(this.A0N.getDrawingCache(), matrix, paint);
                    BE8.A0z(C26138Ct1.A0D, nanoTime2);
                }
            }
        } finally {
            BE8.A0z(C26138Ct1.A0G, nanoTime);
        }
    }

    public void A0A() {
        A01(this);
        if (this.A03 != 4) {
            this.A03 = 4;
            DAE dae = this.A0D;
            if (dae != null) {
                dae.A0C(this);
                dae.A0B(this);
            }
        }
        this.A0J = true;
    }
}
