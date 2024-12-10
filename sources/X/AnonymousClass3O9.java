package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.3O9  reason: invalid class name */
public class AnonymousClass3O9 extends View implements AnonymousClass009 {
    public long A00;
    public Drawable A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public int[] A04;
    public int A05;
    public Path A06;
    public boolean A07;
    public final /* synthetic */ AnonymousClass4aN A08;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (X.AnonymousClass74I.A02(r11) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setEmoji(int[] r11) {
        /*
            r10 = this;
            r4 = 0
            r3 = 0
            r5 = r10
            if (r11 != 0) goto L_0x0013
            r10.A04 = r4
            r0 = -1
            r10.A00 = r0
            r10.A01 = r4
            r10.A07 = r3
            r10.setContentDescription(r4)
        L_0x0012:
            return
        L_0x0013:
            X.5z5 r0 = new X.5z5
            r0.<init>(r11)
            long r8 = X.C43291zZ.A00(r0, r3)
            long r1 = r10.A00
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            r10.A04 = r11
            r10.A00 = r8
            boolean r0 = X.AnonymousClass74I.A03(r11)
            if (r0 != 0) goto L_0x0033
            boolean r1 = X.AnonymousClass74I.A02(r11)
            r0 = 0
            if (r1 == 0) goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            r10.A07 = r0
            r10.A01 = r4
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005b
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aN.A00(r8)
            r10.A01 = r0
            if (r0 != 0) goto L_0x0063
            X.4aN r6 = r10.A08
            X.5z5 r7 = new X.5z5
            r7.<init>(r11)
            X.4Nf r4 = new X.4Nf
            r4.<init>(r5, r6, r7, r8)
            X.3NS r0 = X.AnonymousClass4aN.A0W
            android.os.Message r0 = android.os.Message.obtain(r0, r3, r3, r3, r4)
            r0.sendToTarget()
        L_0x005b:
            java.lang.String r0 = X.C137176v2.A01(r11)
            r10.setContentDescription(r0)
            return
        L_0x0063:
            r10.invalidate()
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3O9.setEmoji(int[]):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3O9(Context context, AnonymousClass4aN r4) {
        super(context);
        this.A08 = r4;
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = -1;
        this.A05 = C19740yt.A00(context, 2131100421);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A07) {
            if (this.A06 == null) {
                this.A06 = new Path();
            }
            AnonymousClass4aN r1 = this.A08;
            int i = AnonymousClass4aN.A0X;
            Paint paint = r1.A0A;
            paint.setColor(this.A05);
            this.A06.reset();
            this.A06.moveTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 9) / 10));
            this.A06.lineTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 3) / 4));
            this.A06.lineTo((float) ((getWidth() * 3) / 4), (float) ((getHeight() * 9) / 10));
            this.A06.lineTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 9) / 10));
            this.A06.setFillType(Path.FillType.WINDING);
            canvas.drawPath(this.A06, paint);
        }
        if (this.A01 != null) {
            AnonymousClass4aN r12 = this.A08;
            int i2 = AnonymousClass4aN.A0X;
            int i3 = r12.A07;
            int width = (getWidth() - i3) / 2;
            int height = (getHeight() - i3) / 2;
            Drawable drawable = this.A01;
            if (drawable instanceof AnonymousClass26m) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
            } else {
                drawable.setBounds(width, height, i3 + width, i3 + height);
            }
            this.A01.draw(canvas);
        }
    }
}
