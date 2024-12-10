package X;

import android.content.Context;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.3t5  reason: invalid class name */
public final class AnonymousClass3t5 extends AnonymousClass3tw {
    public AnonymousClass00H A00;
    public boolean A01;
    public final AnonymousClass1GP A02;
    public final InteractiveMessageButton A03 = ((InteractiveMessageButton) C18070vi.A05(this, 2131428578));
    public final InteractiveMessageView A04;

    public final void setViewMessageEventLogger(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    private final void A00() {
        AnonymousClass21V r3 = (AnonymousClass21V) this.A0I;
        C18070vi.A0z(r3, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageDocumentInteractive");
        this.A04.A04(this, r3, 0);
        this.A03.A01(this.A02, this, this.A0k, r3);
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
            this.A00 = C000200d.A00(A0O.A0l);
        }
    }

    public final AnonymousClass00H getViewMessageEventLogger() {
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("viewMessageEventLogger");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3t5(Context context, AnonymousClass1GP r5, C108875cR r6, C439021j r7) {
        super(context, r6, r7);
        C18070vi.A0o(context, r5, r7);
        A1M();
        this.A02 = r5;
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C18070vi.A05(this, 2131431755);
        this.A04 = interactiveMessageView;
        interactiveMessageView.setLayoutView(r7.A0v.A02 ^ true ? 1 : 0);
        interactiveMessageView.A03(this.A2t, (AnonymousClass1GP) null, (C88484Zw) null);
        A00();
    }

    public void A1u() {
        super.A1u();
        A00();
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        AnonymousClass3tU.A09(this, getViewMessageEventLogger(), i);
    }

    public int getCenteredLayoutId() {
        return 2131624812;
    }

    public int getIncomingLayoutId() {
        return 2131624812;
    }

    public int getOutgoingLayoutId() {
        return 2131624813;
    }
}
