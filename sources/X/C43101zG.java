package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: X.1zG  reason: invalid class name and case insensitive filesystem */
public final class C43101zG implements C43091zF {
    public C39181se A00 = C39181se.NONE;
    public C39201sg A01;
    public C39191sf A02;
    public AnonymousClass26o A03;
    public AnonymousClass26o A04;
    public C43151zL A05;
    public C39241sk A06;
    public final Context A07;
    public final C18100vl A08 = new C18110vm(new AnonymousClass3Di(11));
    public final C18100vl A09 = new C18110vm(new AnonymousClass3Di(10));
    public final C18100vl A0A = new C18110vm(new C71013Dl(this, 23));
    public final C18100vl A0B = new C18110vm(new AnonymousClass3Di(12));
    public final RectF A0C = new RectF();
    public final C18000vb A0D;
    public final C39141sY A0E;

    public void A01(RectF rectF) {
        float f;
        float f2;
        C18070vi.A0d(rectF, 0);
        C43151zL r0 = this.A05;
        Context context = this.A07;
        float dimension = context.getResources().getDimension(r0.A00);
        PointF A002 = C43111zH.A00(context, this.A01, this.A02);
        RectF rectF2 = this.A0C;
        float f3 = rectF.bottom - (dimension - A002.y);
        rectF2.top = f3;
        rectF2.bottom = f3 + dimension;
        if (C18000vb.A00(this.A0D).A06) {
            f = rectF.left;
            f2 = A002.x;
        } else {
            f = rectF.right;
            f2 = dimension - A002.x;
        }
        float f4 = f - f2;
        rectF2.left = f4;
        float f5 = f4 + dimension;
        rectF2.right = f5;
        float A003 = this.A05.A00();
        rectF2.left = f4 - A003;
        rectF2.top -= A003;
        rectF2.right = f5 + A003;
        rectF2.bottom += A003;
        A00();
    }

    private final void A00() {
        float f = (float) ((C43191zP) this.A0A.getValue()).A07.A00;
        AnonymousClass26o r4 = this.A03;
        if (r4 != null) {
            C18100vl r8 = this.A0B;
            ((RectF) r8.getValue()).set(this.A0C);
            ((RectF) r8.getValue()).inset((((RectF) r8.getValue()).width() / 2.0f) * f, (((RectF) r8.getValue()).height() / 2.0f) * f);
            r4.setBounds((int) ((RectF) r8.getValue()).left, (int) ((RectF) r8.getValue()).top, (int) ((RectF) r8.getValue()).right, (int) ((RectF) r8.getValue()).bottom);
            r4.setAlpha((int) (255.0d * (1.0d - ((double) f))));
        }
        AnonymousClass26o r42 = this.A04;
        if (r42 != null) {
            float f2 = (float) (1.0d - ((double) f));
            C18100vl r6 = this.A0B;
            ((RectF) r6.getValue()).set(this.A0C);
            ((RectF) r6.getValue()).inset((((RectF) r6.getValue()).width() / 2.0f) * f2, (((RectF) r6.getValue()).height() / 2.0f) * f2);
            r42.setBounds((int) ((RectF) r6.getValue()).left, (int) ((RectF) r6.getValue()).top, (int) ((RectF) r6.getValue()).right, (int) ((RectF) r6.getValue()).bottom);
            r42.setAlpha((int) (255.0f * f));
        }
        C39241sk r0 = this.A06;
        if (r0 != null && r0.A00) {
            C18100vl r2 = this.A08;
            ((Path) r2.getValue()).reset();
            AnonymousClass26o r02 = this.A03;
            if (r02 != null) {
                ((Path) r2.getValue()).addPath(r02.A09);
            }
            AnonymousClass26o r03 = this.A04;
            if (r03 != null) {
                ((Path) r2.getValue()).addPath(r03.A09);
            }
        }
    }

    public void C64(C43191zP r6) {
        C39181se r0;
        double d = r6.A07.A00;
        if (d == 0.0d) {
            r0 = C39181se.NONE;
        } else if (d == 1.0d) {
            r0 = C39181se.CHECKED;
        } else {
            return;
        }
        this.A00 = r0;
    }

    public C43101zG(Context context, C18000vb r4, C39141sY r5, C39201sg r6, C39191sf r7, C39241sk r8) {
        AnonymousClass26o r0;
        this.A07 = context;
        this.A0D = r4;
        this.A0E = r5;
        this.A01 = r6;
        C43151zL A012 = C43111zH.A01(context, r7);
        this.A05 = A012;
        if (r8 != null) {
            r0 = new AnonymousClass26o(context, A012, r8);
        } else {
            r0 = null;
        }
        this.A03 = r0;
        this.A02 = r7;
        this.A06 = r8;
    }

    public void C65(C43191zP r2) {
        A00();
        this.A0E.invalidate();
    }
}
