package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.26o  reason: invalid class name */
public final class AnonymousClass26o extends Drawable {
    public float A00;
    public Drawable A01;
    public C43151zL A02;
    public boolean A03;
    public int A04;
    public int A05;
    public int A06;
    public C39241sk A07;
    public final Path A08;
    public final Path A09;
    public final RectF A0A;
    public final C18100vl A0B;
    public final Context A0C;

    public void draw(Canvas canvas) {
        int i;
        C18070vi.A0d(canvas, 0);
        Drawable drawable = this.A01;
        if (drawable != null) {
            boolean z = this.A03;
            C18100vl r4 = this.A0B;
            Paint paint = (Paint) r4.getValue();
            if (z) {
                Context context = this.A0C;
                i = C19740yt.A00(context, AnonymousClass4Z9.A00(context, 2130970064));
            } else {
                i = this.A06;
            }
            paint.setColor(i);
            canvas.drawPath(this.A09, (Paint) r4.getValue());
        }
        C18100vl r2 = this.A0B;
        ((Paint) r2.getValue()).setColor(this.A04);
        C39261sm r1 = this.A07.A02;
        if ((r1 instanceof C39311sr) || (r1 instanceof C39271sn)) {
            canvas.drawPath(this.A08, (Paint) r2.getValue());
        } else if (!(r1 instanceof C39341su)) {
            throw new AnonymousClass3EW();
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        C18070vi.A0d(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A0A;
        rectF.set(rect);
        Path path = this.A09;
        path.reset();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, direction);
        float A002 = this.A02.A00();
        rectF.inset(A002, A002);
        Path path2 = this.A08;
        path2.reset();
        path2.addCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, direction);
        Drawable drawable = this.A01;
        if (drawable != null) {
            float centerX = rectF.centerX();
            float f = this.A00;
            RectF rectF2 = new RectF(centerX - f, rectF.centerY() - f, rectF.centerX() + f, rectF.centerY() + f);
            Rect rect2 = new Rect();
            rectF2.roundOut(rect2);
            drawable.setBounds(rect2);
        }
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setAlpha(int i) {
        ((Paint) this.A0B.getValue()).setAlpha(i);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass26o(android.content.Context r4, X.C43151zL r5, X.C39241sk r6) {
        /*
            r3 = this;
            r3.<init>()
            r3.A0C = r4
            boolean r1 = r6.A00
            r0 = 2131103368(0x7f060e88, float:1.78192E38)
            if (r1 != 0) goto L_0x0016
            r1 = 2130971948(0x7f040d2c, float:1.7552649E38)
            r0 = 2131103048(0x7f060d48, float:1.7818551E38)
            int r0 = X.AnonymousClass1YL.A00(r4, r1, r0)
        L_0x0016:
            int r0 = X.C19740yt.A00(r4, r0)
            r3.A06 = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r3.A08 = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r3.A09 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r3.A0A = r0
            boolean r0 = r6 instanceof X.C39251sl
            if (r0 == 0) goto L_0x00ca
            r0 = 2131231657(0x7f0803a9, float:1.8079401E38)
        L_0x0038:
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r4, r0)
        L_0x003c:
            if (r0 == 0) goto L_0x00c8
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r0 == 0) goto L_0x00c8
            android.graphics.drawable.Drawable r2 = X.C27831Xu.A02(r0)
            X.C18070vi.A0X(r2)
            boolean r0 = r6 instanceof X.AnonymousClass2QG
            if (r0 != 0) goto L_0x0062
            X.1sm r0 = r6.A02
            int r1 = r0.A01
            int r0 = r0.A03
            if (r1 == 0) goto L_0x005b
            int r0 = X.AnonymousClass1YL.A00(r4, r1, r0)
        L_0x005b:
            int r0 = X.C19740yt.A00(r4, r0)
            X.C27831Xu.A0D(r2, r0)
        L_0x0062:
            r3.A01 = r2
            android.content.res.Resources r2 = r4.getResources()
            X.1so r1 = r6.A01
            boolean r0 = r5 instanceof X.AnonymousClass2QB
            if (r0 == 0) goto L_0x00b3
            int r0 = r1.A00
        L_0x0070:
            float r1 = r2.getDimension(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r3.A00 = r1
            X.1sm r0 = r6.A02
            int r1 = r0.A00
            int r0 = r0.A02
            if (r1 == 0) goto L_0x0085
            int r0 = X.AnonymousClass1YL.A00(r4, r1, r0)
        L_0x0085:
            int r0 = X.C19740yt.A00(r4, r0)
            r3.A04 = r0
            android.content.res.Resources r1 = r4.getResources()
            int r0 = r5.A00
            float r2 = r1.getDimension(r0)
            float r1 = r5.A00()
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r0
            float r2 = r2 + r1
            int r0 = (int) r2
            r3.A05 = r0
            r0 = 19
            X.4sD r1 = new X.4sD
            r1.<init>(r0)
            X.0vm r0 = new X.0vm
            r0.<init>(r1)
            r3.A0B = r0
            r3.A02 = r5
            r3.A07 = r6
            return
        L_0x00b3:
            boolean r0 = r5 instanceof X.C43161zM
            if (r0 == 0) goto L_0x00ba
            int r0 = r1.A03
            goto L_0x0070
        L_0x00ba:
            boolean r0 = r5 instanceof X.AnonymousClass2QD
            if (r0 == 0) goto L_0x00c1
            int r0 = r1.A02
            goto L_0x0070
        L_0x00c1:
            boolean r0 = r5 instanceof X.AnonymousClass2QC
            if (r0 == 0) goto L_0x0123
            int r0 = r1.A01
            goto L_0x0070
        L_0x00c8:
            r2 = 0
            goto L_0x0062
        L_0x00ca:
            boolean r0 = r6 instanceof X.C39291sp
            if (r0 == 0) goto L_0x00d3
            r0 = 2131232194(0x7f0805c2, float:1.808049E38)
            goto L_0x0038
        L_0x00d3:
            boolean r0 = r6 instanceof X.C39301sq
            if (r0 == 0) goto L_0x00f2
            r0 = r6
            X.1sq r0 = (X.C39301sq) r0
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00e8;
                case 1: goto L_0x00ed;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            r0 = 2131233309(0x7f080a1d, float:1.8082752E38)
            goto L_0x0038
        L_0x00e8:
            r0 = 2131232406(0x7f080696, float:1.808092E38)
            goto L_0x0038
        L_0x00ed:
            r0 = 2131231762(0x7f080412, float:1.8079614E38)
            goto L_0x0038
        L_0x00f2:
            boolean r0 = r6 instanceof X.C39331st
            if (r0 == 0) goto L_0x00fb
            r0 = 2131231954(0x7f0804d2, float:1.8080004E38)
            goto L_0x0038
        L_0x00fb:
            boolean r0 = r6 instanceof X.C42111xd
            if (r0 == 0) goto L_0x0104
            r0 = 2131233483(0x7f080acb, float:1.8083105E38)
            goto L_0x0038
        L_0x0104:
            boolean r0 = r6 instanceof X.AnonymousClass2QE
            if (r0 == 0) goto L_0x010d
            r0 = 2131231807(0x7f08043f, float:1.8079705E38)
            goto L_0x0038
        L_0x010d:
            boolean r0 = r6 instanceof X.AnonymousClass2QF
            if (r0 == 0) goto L_0x0118
            r0 = r6
            X.2QF r0 = (X.AnonymousClass2QF) r0
            int r0 = r0.A00
            goto L_0x0038
        L_0x0118:
            boolean r0 = r6 instanceof X.AnonymousClass2QG
            if (r0 == 0) goto L_0x0129
            r0 = r6
            X.2QG r0 = (X.AnonymousClass2QG) r0
            android.graphics.drawable.Drawable r0 = r0.A00
            goto L_0x003c
        L_0x0123:
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        L_0x0129:
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26o.<init>(android.content.Context, X.1zL, X.1sk):void");
    }

    public int getIntrinsicHeight() {
        return this.A05;
    }

    public int getIntrinsicWidth() {
        return this.A05;
    }
}
