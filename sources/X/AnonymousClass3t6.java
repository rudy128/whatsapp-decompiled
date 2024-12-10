package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.whatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout;
import com.whatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout;

/* renamed from: X.3t6  reason: invalid class name */
public class AnonymousClass3t6 extends AnonymousClass3tw {
    public int A00;
    public boolean A01;
    public final C108875cR A02;
    public final DynamicButtonsLayout A03 = ((DynamicButtonsLayout) findViewById(2131430208));
    public final DynamicButtonsRowContentLayout A04 = ((DynamicButtonsRowContentLayout) findViewById(2131430210));
    public final NativeFlowButtonsRowContentLayout A05 = ((NativeFlowButtonsRowContentLayout) findViewById(2131432916));

    private void A00() {
        this.A04.A00(this);
        DynamicButtonsLayout dynamicButtonsLayout = this.A03;
        NativeFlowButtonsRowContentLayout nativeFlowButtonsRowContentLayout = this.A05;
        C194599rz r6 = ((AnonymousClass21V) this.A0I).A0L().A00;
        AnonymousClass9Q4.A00(this, this.A02, dynamicButtonsLayout, nativeFlowButtonsRowContentLayout, this.A0D, r6);
    }

    public void A1M() {
        if (!this.A01) {
            this.A01 = true;
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
            C78683tL.A01(r4, A0O, this);
        }
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, (AnonymousClass21V) this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A00();
        }
    }

    public AnonymousClass3t6(Context context, C108875cR r3, C438921i r4) {
        super(context, r3, r4);
        A1M();
        this.A02 = r3;
        A00();
    }

    public void A1u() {
        A00();
        super.A1u();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        DynamicButtonsLayout dynamicButtonsLayout = this.A03;
        View view = this.A0j;
        AnonymousClass3uQ.A0r(view, dynamicButtonsLayout, view.getLeft(), view.getBottom() + this.A00);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int A0l = AnonymousClass3uQ.A0l(this, this.A03, getMeasuredHeight());
        this.A00 = A1P(i, i2, A0l);
        setMeasuredDimension(getMeasuredWidth(), A0l);
    }

    public int getCenteredLayoutId() {
        return 2131624784;
    }

    public int getIncomingLayoutId() {
        return 2131624784;
    }

    public int getOutgoingLayoutId() {
        return 2131624785;
    }
}
