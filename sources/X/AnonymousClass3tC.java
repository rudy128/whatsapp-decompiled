package X;

import android.view.View;
import android.widget.LinearLayout;

/* renamed from: X.3tC  reason: invalid class name */
public class AnonymousClass3tC extends AnonymousClass3u3 {
    public View A00;
    public LinearLayout A01;
    public AnonymousClass73Z A02;
    public C107275Zb A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public boolean A06;
    public final AnonymousClass3VB A07;

    public boolean A1X() {
        return false;
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        C18070vi.A0d(r2, 0);
        super.A2V(r2, z);
        AnonymousClass3VB r0 = this.A07;
        if (r0 != null) {
            r0.A0V(r2);
        }
    }

    public String getGroupRoleTitle() {
        return null;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = i;
        int i5 = i2;
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            C42491yG.A0A(linearLayout, i4, 0, 0, i5, 0);
            i3 = C42491yG.A00(linearLayout);
        } else {
            i3 = 0;
        }
        setMeasuredDimension(measuredWidth, measuredHeight + i3);
    }

    public final void setBonsaiOnboardingActivityController(AnonymousClass73Z r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setInlineFeedbackViewModelFactory(C107275Zb r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setMetaAiGating(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setWaIntents(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public void A1M() {
        if (!this.A06) {
            this.A06 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r4 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r4, A0O, this);
            AnonymousClass10G r2 = r4.A00;
            AnonymousClass3uQ.A16(r2, this);
            AnonymousClass3uQ.A0w(A0n, r4, r2, this);
            AnonymousClass3uQ.A12(r4, r2, this);
            AnonymousClass3uQ.A0y(A0n, r4, this, BE8.A0d(r4));
            AnonymousClass3uQ.A13(r4, r2, this, r4.ABq);
            AnonymousClass3uQ.A0x(A0n, r4, r2, this, r4.AIy);
            C19890zB r1 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A11(r4, r2, this);
            AnonymousClass3uQ.A15(r4, this);
            AnonymousClass3uQ.A0s(r1, A0n, r4, r2, this);
            AnonymousClass3uQ.A0u(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A0t(r1, A0n, r4, A0O, this);
            AnonymousClass3uQ.A10(r4, r2, this);
            AnonymousClass3uQ.A0z(r4, r2, A0O, this, AnonymousClass3uQ.A0o(r4));
            AnonymousClass3tU.A08(r1, r4, r2, this);
            C78693tN.A05(r1, r4, this);
            this.A02 = (AnonymousClass73Z) A0n.A0E.get();
            this.A03 = (C107275Zb) A0O.A0L.get();
            this.A04 = C000200d.A00(r4.AZn);
            this.A05 = C000200d.A00(r4.ABd);
        }
    }

    public final AnonymousClass73Z getBonsaiOnboardingActivityController() {
        AnonymousClass73Z r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("bonsaiOnboardingActivityController");
        throw null;
    }

    public final C107275Zb getInlineFeedbackViewModelFactory() {
        C107275Zb r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("inlineFeedbackViewModelFactory");
        throw null;
    }

    public final AnonymousClass00H getMetaAiGating() {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("metaAiGating");
        throw null;
    }

    public final AnonymousClass00H getWaIntents() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waIntents");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, r1.A02, 11515) != false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3tC(android.content.Context r8, X.C108875cR r9, X.C438421d r10) {
        /*
            r7 = this;
            X.C18070vi.A0j(r8, r10)
            r7.<init>(r8, r9, r10)
            r7.A1M()
            r5 = 0
            if (r9 == 0) goto L_0x008f
            X.1DS r4 = r9.getLastMessageLiveData()
            X.1DS r3 = r9.getHasOutgoingMessagesLiveData()
            if (r4 == 0) goto L_0x008f
            if (r3 == 0) goto L_0x008f
            X.00H r6 = r7.getMetaAiGating()
            X.00H r2 = r7.A1h
            X.C18070vi.A0W(r2)
            X.205 r0 = r10.A0v
            X.1BI r1 = r0.A00
            java.lang.Object r0 = r2.get()
            X.1Ps r0 = (X.C25811Ps) r0
            boolean r0 = r0.A0D(r1)
            if (r0 != 0) goto L_0x0050
            java.lang.Object r1 = r6.get()
            X.4NR r1 = (X.AnonymousClass4NR) r1
            X.0zA r0 = r1.A00
            X.AnonymousClass4W5.A01(r0)
            X.1UD r0 = r1.A01
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x008f
            X.0ve r2 = r1.A02
            X.0vf r1 = X.C18040vf.A01
            r0 = 11515(0x2cfb, float:1.6136E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x008f
        L_0x0050:
            X.5Zb r0 = r7.getInlineFeedbackViewModelFactory()
            X.3VB r6 = r0.BGV(r4, r3)
            r7.A07 = r6
            X.5cR r5 = r7.A0k
            if (r5 == 0) goto L_0x008b
            X.1Dg r4 = r6.A02
            X.1F9 r2 = r5.getLifecycleOwner()
            r1 = 37
            X.5Am r0 = new X.5Am
            r0.<init>(r7, r1)
            r3 = 1
            X.C26623D6r.A00(r2, r4, r0, r3)
            X.1DS r2 = r6.A00
            X.1F9 r1 = r5.getLifecycleOwner()
            X.5Rt r0 = new X.5Rt
            r0.<init>(r7)
            X.C26623D6r.A00(r1, r2, r0, r3)
            X.1DS r2 = r6.A01
            X.1F9 r1 = r5.getLifecycleOwner()
            X.5Ru r0 = new X.5Ru
            r0.<init>(r7)
            X.C26623D6r.A00(r1, r2, r0, r3)
        L_0x008b:
            r6.A0V(r10)
            return
        L_0x008f:
            r7.A07 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3tC.<init>(android.content.Context, X.5cR, X.21d):void");
    }

    public C108675c7 getRowCustomizer() {
        C108875cR r0;
        if (!C42701yb.A01(getFMessage().A0v.A00) && (r0 = this.A0k) != null && r0.getContainerType() == 0) {
            return this.A0B.A04;
        }
        C108675c7 rowCustomizer = super.getRowCustomizer();
        C18070vi.A0X(rowCustomizer);
        return rowCustomizer;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int right;
        super.onLayout(z, i, i2, i3, i4);
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            boolean A1b = AnonymousClass3MY.A1b(this.A0D);
            int height = getHeight();
            int measuredWidth = linearLayout.getMeasuredWidth();
            int measuredHeight = linearLayout.getMeasuredHeight();
            View view = this.A0j;
            if (A1b) {
                right = view.getLeft();
            } else {
                right = measuredWidth - view.getRight();
            }
            linearLayout.layout(0, height - measuredHeight, measuredWidth, height);
            View view2 = this.A00;
            if (view2 != null) {
                view2.setPadding(right, 0, right, 0);
            }
        }
    }
}
