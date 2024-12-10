package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass3MW;
import X.AnonymousClass8AZ;
import X.C108995ce;
import X.C111635k2;
import X.C112265lC;
import X.C112445lU;
import X.C1602587t;
import X.C18000vb;
import X.C18030ve;
import X.C25291Nq;
import X.C38391rD;
import X.C42011xT;
import X.CIZ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class StickyHeadersRecyclerView extends RecyclerView implements AnonymousClass009, C1602587t {
    public int A00;
    public int A01;
    public int A02;
    public CIZ A03;
    public C42011xT A04;
    public C18000vb A05;
    public C18030ve A06;
    public AnonymousClass031 A07;
    public int A08;
    public int A09;
    public long A0A;
    public long A0B;
    public boolean A0C;
    public final Rect A0D;
    public final boolean A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A06, 9196) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            r4 = 0
            if (r8 == 0) goto L_0x0027
            int[] r0 = X.C84144If.A0Q
            android.content.res.TypedArray r5 = r7.obtainStyledAttributes(r8, r0)
            r1 = 1
            r0 = -1
            int r3 = r5.getDimensionPixelSize(r1, r0)
            if (r3 <= r0) goto L_0x004f
            X.0ve r2 = r6.A06
            r1 = 9196(0x23ec, float:1.2886E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x004f
        L_0x001d:
            r6.A09 = r3
            r0 = 2
            int r4 = r5.getDimensionPixelSize(r0, r4)
            r5.recycle()
        L_0x0027:
            int r0 = r6.A09
            if (r0 <= 0) goto L_0x0035
            X.0vb r1 = r6.A05
            X.28M r0 = new X.28M
            r0.<init>(r1, r4)
            r6.A0r(r0)
        L_0x0035:
            r0 = 1
            r6.A0R = r0
            r2 = 0
            X.5dy r0 = new X.5dy
            r0.<init>(r6, r2)
            X.CIZ r0 = X.C108965cb.A0C(r7, r0)
            r6.A03 = r0
            X.7Ag r1 = new X.7Ag
            r1.<init>(r6, r2)
            java.util.ArrayList r0 = r6.A12
            r0.add(r1)
            return
        L_0x004f:
            int r0 = r6.A09
            int r3 = r5.getDimensionPixelSize(r4, r0)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.StickyHeadersRecyclerView.A04(android.content.Context, android.util.AttributeSet):void");
    }

    private C112265lC getStickyHeadersAdapter() {
        return (C112265lC) this.A0B;
    }

    public void A14() {
        if (!this.A0C) {
            this.A0C = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A05 = AnonymousClass10E.A6Q(A0O);
            this.A06 = AnonymousClass10E.A8r(A0O);
        }
    }

    public int BQE(int i) {
        while (true) {
            long A002 = C112265lC.A00((C112265lC) this.A0B, i) & 4294967295L;
            if (!AnonymousClass000.A1P((A002 > 4294967295L ? 1 : (A002 == 4294967295L ? 0 : -1)))) {
                return (int) A002;
            }
            if (i >= this.A0B.A0Q() - 1) {
                return this.A0B.A0Q() - ((AnonymousClass8AZ) ((C112265lC) this.A0B).A00).BSM();
            }
            i++;
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A07;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public void setAdapter(C38391rD r5) {
        GridLayoutManager gridLayoutManager;
        super.setAdapter(new C112265lC(r5, this.A0E));
        this.A0B.CDq(new C112445lU(this));
        int i = this.A09;
        Context context = getContext();
        if (i > 0) {
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(context, getAppropriateColumnCount());
            gridLayoutManager2.A01 = new C111635k2(this, gridLayoutManager2, 0);
            gridLayoutManager = gridLayoutManager2;
        } else {
            gridLayoutManager = new LinearLayoutManager(context, 1, false);
        }
        setLayoutManager(gridLayoutManager);
        this.A04 = this.A0B.BqY(this, -1000);
    }

    public StickyHeadersRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A14();
        this.A01 = -1;
        this.A00 = -1;
        this.A0D = AnonymousClass3MW.A07();
        this.A0E = C25291Nq.A04(this.A06, 12627);
        A04(context, attributeSet);
    }

    private int getAppropriateColumnCount() {
        int measuredWidth = getMeasuredWidth();
        int i = this.A09;
        return Math.max(1, (measuredWidth + (i / 2)) / i);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        C112265lC r8 = (C112265lC) this.A0B;
        int A1O = linearLayoutManager.A1O();
        if (A1O != -1) {
            if (A1O != this.A00) {
                this.A00 = A1O;
                long A002 = C112265lC.A00(r8, A1O);
                this.A0A = A002;
                int i = (int) (A002 >> 32);
                if (this.A01 != i) {
                    this.A01 = i;
                    ((AnonymousClass8AZ) r8.A00).Bma(this.A04, i);
                    C108995ce.A0v(this.A04.A0H, View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
            }
            this.A02 = 0;
            if (!AnonymousClass000.A1P(((this.A0A & 4294967295L) > 4294967295L ? 1 : ((this.A0A & 4294967295L) == 4294967295L ? 0 : -1)))) {
                int A1N = linearLayoutManager.A1N();
                if (this.A08 != A1N) {
                    this.A08 = A1N;
                    this.A0B = C112265lC.A00(r8, A1N);
                }
                if (AnonymousClass000.A1P(((this.A0B & 4294967295L) > 4294967295L ? 1 : ((this.A0B & 4294967295L) == 4294967295L ? 0 : -1)))) {
                    View A0j = linearLayoutManager.A0j(A1N);
                    this.A02 = A0j.getTop() - this.A04.A0H.getMeasuredHeight();
                    Rect rect = this.A0D;
                    linearLayoutManager.A0X(A0j, rect);
                    int i2 = this.A02 - rect.top;
                    this.A02 = i2;
                    if (i2 > 0) {
                        this.A02 = 0;
                    }
                }
            }
            canvas.save();
            canvas.clipRect(0, this.A02, this.A04.A0H.getMeasuredWidth(), this.A02 + this.A04.A0H.getMeasuredHeight());
            canvas.translate(0.0f, (float) this.A02);
            this.A04.A0H.draw(canvas);
            canvas.restore();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A09 > 0) {
            ((GridLayoutManager) getLayoutManager()).A1g(getAppropriateColumnCount());
        }
        C42011xT r0 = this.A04;
        if (r0 != null) {
            C108995ce.A0v(r0.A0H, View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public StickyHeadersRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A14();
    }

    public StickyHeadersRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A14();
        this.A01 = -1;
        this.A00 = -1;
        this.A0D = AnonymousClass3MW.A07();
        this.A0E = C25291Nq.A04(this.A06, 12627);
        A04(context, attributeSet);
    }

    public StickyHeadersRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        A14();
        this.A01 = -1;
        this.A00 = -1;
        this.A0D = AnonymousClass3MW.A07();
        this.A0E = C25291Nq.A04(this.A06, 12627);
        A04(context, (AttributeSet) null);
    }
}
