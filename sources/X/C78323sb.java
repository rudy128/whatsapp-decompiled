package X;

import android.content.Context;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3sb  reason: invalid class name and case insensitive filesystem */
public final class C78323sb extends AnonymousClass3uP {
    public final TextEmojiLabel A00 = AnonymousClass3MX.A0W(this, 2131432683);

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [boolean] */
    private final void A00() {
        TextEmojiLabel textEmojiLabel = this.A00;
        ? A1A = C72483Me.A1A(textEmojiLabel, this.A0F);
        textEmojiLabel.setLongClickable(A1A);
        AnonymousClass3Ma.A1K(textEmojiLabel, this.A0C);
        Context context = getContext();
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[A1A] = getFMessage().A0v.A01;
        A1b[1] = getFMessage().A00;
        AnonymousClass3MY.A0y(context, textEmojiLabel, A1b, 2131898926);
    }

    public C445123s getFMessage() {
        AnonymousClass206 r1 = this.A0I;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageDropPlaceholderInternal");
        return (C445123s) r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78323sb(Context context, C108875cR r3, C445123s r4) {
        super(context, r3, r4);
        C18070vi.A0j(context, r4);
        A00();
    }

    public void A1u() {
        A00();
        AnonymousClass3uP.A0h(this, false);
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean z2 = !C18070vi.A18(r2, getFMessage());
        super.A2V(r2, z);
        if (z || z2) {
            A00();
        }
    }

    public int getCenteredLayoutId() {
        return 2131624871;
    }

    public int getIncomingLayoutId() {
        return 2131624871;
    }

    public int getOutgoingLayoutId() {
        return 2131624872;
    }
}
