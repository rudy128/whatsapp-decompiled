package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;
import java.util.Set;

/* renamed from: X.3tT  reason: invalid class name */
public final class AnonymousClass3tT extends C79043uG {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public boolean A03;
    public final int A04 = (getResources().getDimensionPixelSize(2131165762) + (getResources().getDimensionPixelSize(2131166347) * 2));
    public final AnonymousClass1GP A05;
    public final InteractiveMessageButton A06 = ((InteractiveMessageButton) C18070vi.A05(this, 2131428578));
    public final InteractiveMessageView A07;

    public static final void A03(AnonymousClass3tT r3, C445323u r4) {
        C18070vi.A0d(r4, 1);
        C98814rl.A00(r3.A1X, r3, r4, 25);
        super.A2A(r3.A05, r4, false);
    }

    private final int getBodyActionIndex() {
        String[] strArr = new String[3];
        strArr[0] = "view_product";
        strArr[1] = "cta_url";
        return A00(BE6.A15("galaxy_message", strArr, 2));
    }

    public final void setFMessageForwardingSubsystem(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setInteractiveMessageCallToAction(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setViewMessageEventLogger(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    private final int A00(Set set) {
        C445323u r1;
        C20285AEt aEt;
        C20277AEk aEk;
        AnonymousClass22Q r12 = (AnonymousClass22Q) ((AnonymousClass21V) this.A0I);
        if (r12 instanceof C445323u) {
            r1 = (C445323u) r12;
        } else {
            r1 = null;
        }
        if (!(r1 == null || (aEt = r1.A00) == null || (aEk = aEt.A06) == null)) {
            int i = 0;
            for (C20253ADl aDl : aEk.A03) {
                if (set.contains(aDl.A01.A02)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    private final void A01() {
        AnonymousClass21V r3 = (AnonymousClass21V) this.A0I;
        C18070vi.A0z(r3, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageProductInteractive");
        InteractiveMessageView interactiveMessageView = this.A07;
        interactiveMessageView.A04(this, r3, 0);
        InteractiveMessageButton interactiveMessageButton = this.A06;
        interactiveMessageButton.A01(this.A05, this, this.A0k, r3);
        C18030ve r1 = this.A0F;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r1, 8661)) {
            C90074dU.A01(this.A05, this, r3, 28);
            C90074dU.A01(interactiveMessageView, this, r3, 29);
        }
        if (C18020vd.A05(r2, this.A0F, 8939) && A00(C18070vi.A0P("view_product")) == 0) {
            C90074dU.A01(interactiveMessageButton.findViewById(2131428589), this, r3, 30);
        }
    }

    public static final void A02(View view, AnonymousClass3tT r5, AnonymousClass22Q r6, Integer num, boolean z) {
        int bodyActionIndex;
        C20285AEt aEt;
        C20277AEk aEk;
        C20253ADl aDl;
        C18030ve r1 = r5.A0F;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r1, 8939) && r5.A00(C18070vi.A0P("view_product")) == 0) {
            C98814rl.A00(r5.A1X, r5, r6, 24);
        }
        boolean A0l = AnonymousClass25A.A0l(r6);
        if (A0l && (r6 instanceof C445323u) && (aEt = ((C445323u) r6).A00) != null && (aEk = aEt.A06) != null && (aDl = (C20253ADl) C29431cG.A0c(aEk.A03)) != null && aDl.A00) {
            return;
        }
        if ((C18020vd.A05(r2, r5.A0F, 8661) || A0l) && (bodyActionIndex = r5.getBodyActionIndex()) >= 0) {
            Context A042 = AnonymousClass3MY.A04(r5);
            AnonymousClass21V r0 = (AnonymousClass21V) r5.A0I;
            C18070vi.A0X(r0);
            ((C86314Rd) r5.getInteractiveMessageCallToAction().get()).A01(A042, AnonymousClass4GK.A00(r0, num), r6, bodyActionIndex);
            return;
        }
        super.A2A(view, r6, z);
    }

    public void A1M() {
        if (!this.A03) {
            this.A03 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r5 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r5, A0O, this);
            AnonymousClass10G r3 = r5.A00;
            AnonymousClass3uQ.A16(r3, this);
            AnonymousClass3uQ.A0w(A0n, r5, r3, this);
            AnonymousClass3uQ.A12(r5, r3, this);
            AnonymousClass3uQ.A0y(A0n, r5, this, BE8.A0d(r5));
            AnonymousClass3uQ.A13(r5, r3, this, r5.ABq);
            AnonymousClass3uQ.A0x(A0n, r5, r3, this, r5.AIy);
            C19890zB r1 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r1, r5, r3, A0O, this);
            AnonymousClass3uQ.A11(r5, r3, this);
            AnonymousClass3uQ.A15(r5, this);
            AnonymousClass3uQ.A0s(r1, A0n, r5, r3, this);
            AnonymousClass3uQ.A0u(r1, r5, r3, A0O, this);
            AnonymousClass3uQ.A0t(r1, A0n, r5, A0O, this);
            AnonymousClass3uQ.A10(r5, r3, this);
            AnonymousClass3uQ.A0z(r5, r3, A0O, this, AnonymousClass3uQ.A0o(r5));
            AnonymousClass3tU.A08(r1, r5, r3, this);
            this.A01 = (A1M) r3.A7k.get();
            this.A02 = C000200d.A00(A0O.A00);
            this.A00 = (AnonymousClass2ZN) A0O.A0M.get();
            this.A00 = C000200d.A00(r5.AN9);
            this.A01 = C000200d.A00(A0O.A0Q);
            this.A02 = C000200d.A00(A0O.A0l);
        }
    }

    public boolean A1V() {
        AnonymousClass21V r0 = (AnonymousClass21V) this.A0I;
        C18070vi.A0X(r0);
        if (!((C32911hx) this.A00.get()).A01(r0) || !this.A0l.CMI()) {
            return false;
        }
        return true;
    }

    public final int getCardWidth() {
        return this.A04;
    }

    public int getCenteredLayoutId() {
        if (C20120A8f.A06((AnonymousClass21V) this.A0I)) {
            return 2131624904;
        }
        return 2131624905;
    }

    public final AnonymousClass00H getFMessageForwardingSubsystem() {
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("fMessageForwardingSubsystem");
        throw null;
    }

    public int getIncomingLayoutId() {
        if (C20120A8f.A06((AnonymousClass21V) this.A0I)) {
            return 2131624904;
        }
        return 2131624905;
    }

    public final AnonymousClass00H getInteractiveMessageCallToAction() {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("interactiveMessageCallToAction");
        throw null;
    }

    public int getOutgoingLayoutId() {
        if (C20120A8f.A06((AnonymousClass21V) this.A0I)) {
            return 2131624904;
        }
        return 2131624906;
    }

    public final AnonymousClass00H getViewMessageEventLogger() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("viewMessageEventLogger");
        throw null;
    }

    public void onMeasure(int i, int i2) {
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A05;
        boolean A062 = C20120A8f.A06((AnonymousClass21V) this.A0I);
        conversationRowImage$RowImageView.A0G = A062;
        if (A062) {
            i = BE7.A06(this.A04);
            conversationRowImage$RowImageView.A01 = getResources().getDimensionPixelSize(2131165762);
            conversationRowImage$RowImageView.A00 = getResources().getDimensionPixelSize(2131165761);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3tT(Context context, AnonymousClass1GP r5, C108875cR r6, C445323u r7, int i) {
        super(context, r6, r7, i);
        C18070vi.A0o(context, r5, r7);
        A1M();
        this.A05 = r5;
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C18070vi.A05(this, 2131431755);
        this.A07 = interactiveMessageView;
        interactiveMessageView.setLayoutView(r7.A0v.A02 ^ true ? 1 : 0);
        interactiveMessageView.A03(this.A2t, (AnonymousClass1GP) null, (C88484Zw) null);
        A01();
    }

    public void A1u() {
        super.A1u();
        A01();
    }

    public void A2A(View view, AnonymousClass22Q r3, boolean z) {
        C18070vi.A0h(r3, view);
        A02(view, this, r3, (Integer) null, z);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        AnonymousClass3tU.A09(this, getViewMessageEventLogger(), i);
    }
}
