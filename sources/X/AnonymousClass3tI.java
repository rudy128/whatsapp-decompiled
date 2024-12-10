package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.whatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout;
import java.util.List;

/* renamed from: X.3tI  reason: invalid class name */
public class AnonymousClass3tI extends AnonymousClass3uE {
    public C108355bZ A00;
    public int A01;
    public boolean A02;
    public final DynamicButtonsLayout A03 = ((DynamicButtonsLayout) findViewById(2131430208));
    public final DynamicButtonsRowContentLayout A04 = ((DynamicButtonsRowContentLayout) findViewById(2131430210));

    private void A01() {
        List A13;
        int i;
        this.A04.A00(this);
        AnonymousClass21B fMessage = getFMessage();
        if (fMessage.A0L().A00 == null || C88404Zo.A01(getContext()) == null) {
            A13 = AnonymousClass000.A13();
        } else {
            A13 = fMessage.A0L().A00.A02;
        }
        int size = A13.size();
        DynamicButtonsLayout dynamicButtonsLayout = this.A03;
        if (size > 0) {
            dynamicButtonsLayout.A05(this.A2u, A13);
            i = 0;
        } else {
            i = 8;
        }
        dynamicButtonsLayout.setVisibility(i);
    }

    public void A1M() {
        if (!this.A02) {
            this.A02 = true;
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
            C78233sS.A00(r1, A0n, r2, this);
            this.A00 = (C108355bZ) A0n.A5a.get();
        }
    }

    public AnonymousClass3tI(Context context, C108875cR r7, AnonymousClass21B r8) {
        super(context, r7, r8);
        A1M();
        findViewById(2131431007).setBackground(this.A00.BS0(AnonymousClass00R.A01, C72453Mb.A05(r8.A0v.A02 ? 1 : 0), false));
        A01();
    }

    public void A1u() {
        A01();
        super.A1u();
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A01();
        }
    }

    public int getMainChildMaxWidth() {
        return getResources().getDimensionPixelSize(2131166243);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        DynamicButtonsLayout dynamicButtonsLayout = this.A03;
        View view = this.A0j;
        AnonymousClass3uQ.A0r(view, dynamicButtonsLayout, view.getLeft(), view.getBottom() + this.A01);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int A0l = AnonymousClass3uQ.A0l(this, this.A03, getMeasuredHeight());
        this.A01 = A1P(i, i2, A0l);
        setMeasuredDimension(getMeasuredWidth(), A0l);
    }

    public int getCenteredLayoutId() {
        return 2131624788;
    }

    public int getIncomingLayoutId() {
        return 2131624788;
    }

    public int getOutgoingLayoutId() {
        return 2131624789;
    }
}
