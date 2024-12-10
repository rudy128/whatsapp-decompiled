package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.whatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout;
import com.whatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout;

/* renamed from: X.3sd  reason: invalid class name and case insensitive filesystem */
public class C78333sd extends AnonymousClass3uP {
    public boolean A00;
    public final TextEmojiLabel A01 = ((TextEmojiLabel) findViewById(2131436244));
    public final C108875cR A02;
    public final DynamicButtonsLayout A03 = ((DynamicButtonsLayout) findViewById(2131430208));
    public final DynamicButtonsRowContentLayout A04 = ((DynamicButtonsRowContentLayout) findViewById(2131430210));
    public final NativeFlowButtonsRowContentLayout A05 = ((NativeFlowButtonsRowContentLayout) findViewById(2131432916));

    private void A00() {
        this.A04.A00(this);
        AnonymousClass206 fMessage = getFMessage();
        if (!TextUtils.isEmpty(fMessage.A0P())) {
            String A0P = fMessage.A0P();
            TextEmojiLabel textEmojiLabel = this.A01;
            A2G(textEmojiLabel, getFMessage(), A0P, false);
            textEmojiLabel.setVisibility(0);
        } else {
            this.A01.setVisibility(8);
        }
        DynamicButtonsLayout dynamicButtonsLayout = this.A03;
        NativeFlowButtonsRowContentLayout nativeFlowButtonsRowContentLayout = this.A05;
        C194599rz r10 = fMessage.A0L().A00;
        AnonymousClass9Q4.A00(this, this.A02, dynamicButtonsLayout, nativeFlowButtonsRowContentLayout, this.A0D, r10);
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public void A1M() {
        if (!this.A00) {
            this.A00 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r3 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r3, A0O, this);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass3uQ.A16(r1, this);
            AnonymousClass3uQ.A0w(A0n, r3, r1, this);
            AnonymousClass3uQ.A12(r3, r1, this);
            AnonymousClass3uQ.A0y(A0n, r3, this, BE8.A0d(r3));
            AnonymousClass3uQ.A13(r3, r1, this, r3.ABq);
            AnonymousClass3uQ.A0x(A0n, r3, r1, this, r3.AIy);
            C19890zB r0 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A11(r3, r1, this);
            AnonymousClass3uQ.A15(r3, this);
            AnonymousClass3uQ.A0s(r0, A0n, r3, r1, this);
            AnonymousClass3uQ.A0u(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A0t(r0, A0n, r3, A0O, this);
            AnonymousClass3uQ.A10(r3, r1, this);
            AnonymousClass3uQ.A0z(r3, r1, A0O, this, AnonymousClass3uQ.A0o(r3));
        }
    }

    public C78333sd(Context context, C108875cR r4, AnonymousClass210 r5) {
        super(context, r4, r5);
        A1M();
        this.A02 = r4;
        TextEmojiLabel textEmojiLabel = this.A01;
        AnonymousClass3Ma.A1L(this.A0F, textEmojiLabel);
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
        A00();
    }

    public void A1u() {
        A00();
        AnonymousClass3uP.A0h(this, false);
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A00();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        DynamicButtonsLayout dynamicButtonsLayout = this.A03;
        View view = this.A0j;
        AnonymousClass3uQ.A0r(view, dynamicButtonsLayout, view.getLeft(), view.getBottom());
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), AnonymousClass3uQ.A0l(this, this.A03, getMeasuredHeight()));
    }

    public int getCenteredLayoutId() {
        return 2131624780;
    }

    public int getIncomingLayoutId() {
        return 2131624780;
    }

    public int getOutgoingLayoutId() {
        return 2131624781;
    }
}
