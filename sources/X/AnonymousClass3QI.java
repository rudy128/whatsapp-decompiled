package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;

/* renamed from: X.3QI  reason: invalid class name */
public final class AnonymousClass3QI extends LinearLayout {
    public AnonymousClass4DK A00;
    public final ImageView A01 = ((ImageView) AnonymousClass3MX.A0C(this, 2131427483));
    public final ImageView A02 = ((ImageView) AnonymousClass3MX.A0C(this, 2131434315));
    public final Space A03 = ((Space) AnonymousClass3MX.A0C(this, 2131435521));
    public final C18030ve A04;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001c, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0151, code lost:
        X.C18070vi.A0X(r2);
        r1 = 2131167747;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01bd, code lost:
        r5 = r12.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01dd, code lost:
        X.C18070vi.A0X(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01e0, code lost:
        r1 = 2131166855;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01e3, code lost:
        X.AnonymousClass3MY.A0w(getContext(), r3, r5);
        r3.setImageDrawable(r2);
        X.AnonymousClass3MY.A14(X.AnonymousClass000.A0Y(r7), r3, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setupActionButton(X.AnonymousClass4DK r8, android.view.View.OnClickListener r9, android.view.View.OnLongClickListener r10, boolean r11, java.lang.Integer r12) {
        /*
            r7 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.C18070vi.A0j(r9, r10)
            r7.A00 = r8
            android.widget.ImageView r3 = r7.A01
            r3.setVisibility(r0)
            r3.setOnClickListener(r9)
            r3.setOnLongClickListener(r10)
            int r0 = r8.ordinal()
            r5 = -1
            switch(r0) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x0020;
                case 2: goto L_0x0092;
                case 3: goto L_0x00ca;
                case 4: goto L_0x0100;
                case 5: goto L_0x0064;
                case 6: goto L_0x0140;
                case 7: goto L_0x015d;
                case 8: goto L_0x0194;
                case 9: goto L_0x01c2;
                default: goto L_0x001c;
            }
        L_0x001c:
            r7.A00()
            return
        L_0x0020:
            X.0ve r2 = r7.A04
            r1 = 8171(0x1feb, float:1.145E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0046
            r0 = 0
            r3.setBackground(r0)
            r5 = 2131886437(0x7f120165, float:1.9407453E38)
            android.content.Context r1 = r7.getContext()
            r0 = 2131233427(0x7f080a93, float:1.8082991E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass3MX.A06(r1, r0)
            X.C18070vi.A0X(r2)
            r1 = 2131168533(0x7f070d15, float:1.795137E38)
            goto L_0x01e3
        L_0x0046:
            r5 = 2131886437(0x7f120165, float:1.9407453E38)
            android.content.Context r2 = r7.getContext()
            int r1 = X.C72473Md.A06(r7)
            r0 = 2131232269(0x7f08060d, float:1.8080642E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MX.A06(r2, r0)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass4aX.A05(r2, r0, r1)
            X.C18070vi.A0X(r2)
            r1 = 2131168532(0x7f070d14, float:1.7951368E38)
            goto L_0x01e3
        L_0x0064:
            r0 = 2131232091(0x7f08055b, float:1.8080281E38)
            if (r11 == 0) goto L_0x006c
            r0 = 2131231774(0x7f08041e, float:1.8079639E38)
        L_0x006c:
            android.content.Context r2 = r7.getContext()
            int r1 = X.C72473Md.A06(r7)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MX.A06(r2, r0)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass4aX.A05(r2, r0, r1)
            X.C18070vi.A0X(r2)
            java.lang.String r0 = "Marketing Opt Out"
            r1 = 2131166855(0x7f070687, float:1.7947967E38)
            r3.setContentDescription(r0)
            r3.setImageDrawable(r2)
            android.content.res.Resources r0 = X.AnonymousClass000.A0Y(r7)
            X.AnonymousClass3MY.A14(r0, r3, r1)
            goto L_0x001c
        L_0x0092:
            if (r12 == 0) goto L_0x00a5
            int r5 = r12.intValue()
        L_0x0098:
            android.content.Context r1 = r7.getContext()
            r0 = 2131231930(0x7f0804ba, float:1.8079955E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass3MX.A06(r1, r0)
            goto L_0x01dd
        L_0x00a5:
            r5 = 2131890524(0x7f12115c, float:1.9415742E38)
            goto L_0x0098
        L_0x00a9:
            if (r12 == 0) goto L_0x00c6
            int r5 = r12.intValue()
        L_0x00af:
            android.content.Context r6 = r7.getContext()
            r4 = 2131232012(0x7f08050c, float:1.8080121E38)
            android.content.Context r2 = r7.getContext()
            r1 = 2130970885(0x7f040905, float:1.7550493E38)
            r0 = 2131102317(0x7f060a6d, float:1.7817069E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass4aX.A04(r2, r6, r1, r0, r4)
            goto L_0x0151
        L_0x00c6:
            r5 = 2131886214(0x7f120086, float:1.9407E38)
            goto L_0x00af
        L_0x00ca:
            X.0ve r2 = r7.A04
            X.0vf r1 = X.C18040vf.A01
            r0 = 9398(0x24b6, float:1.317E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r6 = 2131231624(0x7f080388, float:1.8079334E38)
            if (r0 == 0) goto L_0x00dc
            r6 = 2131231625(0x7f080389, float:1.8079336E38)
        L_0x00dc:
            if (r12 == 0) goto L_0x00fc
            int r5 = r12.intValue()
        L_0x00e2:
            android.content.Context r4 = r7.getContext()
            android.content.Context r2 = r7.getContext()
            r1 = 2130970885(0x7f040905, float:1.7550493E38)
            r0 = 2131102317(0x7f060a6d, float:1.7817069E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass4aX.A04(r2, r4, r1, r0, r6)
            X.C18070vi.A0X(r2)
            r1 = 2131165412(0x7f0700e4, float:1.794504E38)
            goto L_0x01e3
        L_0x00fc:
            r5 = 2131886216(0x7f120088, float:1.9407005E38)
            goto L_0x00e2
        L_0x0100:
            android.content.res.Resources r2 = X.AnonymousClass000.A0Y(r7)
            android.content.Context r1 = r7.getContext()
            r0 = 2131232384(0x7f080680, float:1.8080876E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3MX.A06(r1, r0)
            X.C18070vi.A0X(r1)
            if (r12 == 0) goto L_0x013c
            int r4 = r12.intValue()
        L_0x0118:
            r0 = 2131165307(0x7f07007b, float:1.7944827E38)
            int r0 = r2.getDimensionPixelSize(r0)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass4aX.A07(r2, r1, r0)
            X.C18070vi.A0X(r2)
            r1 = 2131166855(0x7f070687, float:1.7947967E38)
            android.content.Context r0 = r7.getContext()
            X.AnonymousClass3MY.A0w(r0, r3, r4)
            r3.setImageDrawable(r2)
            android.content.res.Resources r0 = X.AnonymousClass000.A0Y(r7)
            X.AnonymousClass3MY.A14(r0, r3, r1)
            goto L_0x001c
        L_0x013c:
            r4 = 2131886217(0x7f120089, float:1.9407007E38)
            goto L_0x0118
        L_0x0140:
            if (r12 == 0) goto L_0x0159
            int r5 = r12.intValue()
        L_0x0146:
            android.content.Context r1 = r7.getContext()
            r0 = 2131231989(0x7f0804f5, float:1.8080075E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass3MX.A06(r1, r0)
        L_0x0151:
            X.C18070vi.A0X(r2)
            r1 = 2131167747(0x7f070a03, float:1.7949776E38)
            goto L_0x01e3
        L_0x0159:
            r5 = 2131886215(0x7f120087, float:1.9407003E38)
            goto L_0x0146
        L_0x015d:
            android.content.res.Resources r4 = X.AnonymousClass000.A0Y(r7)
            X.0ve r2 = r7.A04
            r1 = 9217(0x2401, float:1.2916E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 2131232195(0x7f0805c3, float:1.8080492E38)
            if (r1 == 0) goto L_0x0173
            r0 = 2131231772(0x7f08041c, float:1.8079634E38)
        L_0x0173:
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3MZ.A0B(r7, r0)
            X.C17960vV.A07(r1)
            X.C18070vi.A0X(r1)
            r0 = 2131165307(0x7f07007b, float:1.7944827E38)
            int r0 = r4.getDimensionPixelSize(r0)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass4aX.A07(r4, r1, r0)
            X.C18070vi.A0X(r2)
            X.C27831Xu.A0C(r2, r5)
            if (r12 != 0) goto L_0x01bd
            r5 = 2131886219(0x7f12008b, float:1.940701E38)
            goto L_0x01e0
        L_0x0194:
            android.content.res.Resources r2 = X.AnonymousClass000.A0Y(r7)
            android.content.Context r1 = r7.getContext()
            r0 = 2131232099(0x7f080563, float:1.8080298E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3MX.A06(r1, r0)
            X.C18070vi.A0X(r1)
            r0 = 2131165307(0x7f07007b, float:1.7944827E38)
            int r0 = r2.getDimensionPixelSize(r0)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass4aX.A07(r2, r1, r0)
            X.C18070vi.A0X(r2)
            X.C27831Xu.A0C(r2, r5)
            if (r12 != 0) goto L_0x01bd
            r5 = 2131886218(0x7f12008a, float:1.9407009E38)
            goto L_0x01e0
        L_0x01bd:
            int r5 = r12.intValue()
            goto L_0x01e0
        L_0x01c2:
            if (r12 == 0) goto L_0x01f6
            int r5 = r12.intValue()
        L_0x01c8:
            android.content.Context r6 = r7.getContext()
            r4 = 2131232012(0x7f08050c, float:1.8080121E38)
            android.content.Context r2 = r7.getContext()
            r1 = 2130970885(0x7f040905, float:1.7550493E38)
            r0 = 2131102317(0x7f060a6d, float:1.7817069E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass4aX.A04(r2, r6, r1, r0, r4)
        L_0x01dd:
            X.C18070vi.A0X(r2)
        L_0x01e0:
            r1 = 2131166855(0x7f070687, float:1.7947967E38)
        L_0x01e3:
            android.content.Context r0 = r7.getContext()
            X.AnonymousClass3MY.A0w(r0, r3, r5)
            r3.setImageDrawable(r2)
            android.content.res.Resources r0 = X.AnonymousClass000.A0Y(r7)
            X.AnonymousClass3MY.A14(r0, r3, r1)
            goto L_0x001c
        L_0x01f6:
            r5 = 2131886220(0x7f12008c, float:1.9407013E38)
            goto L_0x01c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QI.setupActionButton(X.4DK, android.view.View$OnClickListener, android.view.View$OnLongClickListener, boolean, java.lang.Integer):void");
    }

    private final void A00() {
        Space space;
        int i;
        if (this.A02.getVisibility() == 0 && this.A01.getVisibility() == 0) {
            space = this.A03;
            i = 0;
        } else {
            space = this.A03;
            i = 8;
        }
        space.setVisibility(i);
    }

    public static /* synthetic */ void setupActionButton$default(AnonymousClass3QI r1, AnonymousClass4DK r2, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, boolean z, Integer num, int i, Object obj) {
        if ((i & 16) != 0) {
            num = null;
        }
        r1.setupActionButton(r2, onClickListener, onLongClickListener, z, num);
    }

    public final void A01() {
        this.A02.setVisibility(8);
        this.A01.setVisibility(8);
        this.A03.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3QI(Context context, C18030ve r4) {
        super(context, (AttributeSet) null, 0);
        C18070vi.A0j(r4, context);
        this.A04 = r4;
        View.inflate(context, 2131623987, this);
    }

    public final void setupRateButton(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        boolean A15 = C18070vi.A15(onClickListener, onLongClickListener);
        ImageView imageView = this.A02;
        imageView.setOnClickListener(onClickListener);
        imageView.setOnLongClickListener(onLongClickListener);
        imageView.setVisibility(A15 ? 1 : 0);
        A00();
    }
}
