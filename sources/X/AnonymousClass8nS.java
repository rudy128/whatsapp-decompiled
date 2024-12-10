package X;

import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8nS  reason: invalid class name */
public final class AnonymousClass8nS extends AnonymousClass3uP {
    public C62282r9 A00;
    public boolean A01;

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public final void setStatusMentionsPreviewHelper(C62282r9 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public void A1M() {
        if (!this.A01) {
            this.A01 = true;
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
            this.A00 = (C62282r9) r3.AAE.get();
        }
    }

    public final C62282r9 getStatusMentionsPreviewHelper() {
        C62282r9 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("statusMentionsPreviewHelper");
        throw null;
    }

    private final void setMentionedDescription(TextEmojiLabel textEmojiLabel, AnonymousClass206 r6) {
        String A012 = getStatusMentionsPreviewHelper().A01(r6);
        if (A012 == null) {
            A012 = "";
        }
        textEmojiLabel.setMaxLines(3);
        AnonymousClass3uQ.A0q(AnonymousClass4aX.A02(getContext(), 2131233361, 2131101888), textEmojiLabel, A012);
    }

    private final void setMentionedTitle(TextEmojiLabel textEmojiLabel, AnonymousClass206 r3) {
        C29261bv.A08(textEmojiLabel, 2132084414);
        C43421zm.A04(textEmojiLabel);
        String A02 = getStatusMentionsPreviewHelper().A02(r3);
        if (A02 == null) {
            A02 = "";
        }
        textEmojiLabel.setText(A02);
    }

    public void A2D(FrameLayout frameLayout, AnonymousClass724 r5, AnonymousClass206 r6, C135486sH r7, C139546z1 r8) {
        C72473Md.A1I(frameLayout, r5);
        C18070vi.A0d(r8, 4);
        C136606u5 A002 = AnonymousClass6WB.A00(frameLayout);
        A002.A00.setVisibility(8);
        A002.A05.setVisibility(8);
        A002.A07.setVisibility(8);
        setMentionedTitle(A002.A0A, r6);
        setMentionedDescription(A002.A09, r6);
        AnonymousClass206 A0K = r6.A0K();
        if (A0K != null && !AnonymousClass25A.A0p(A0K)) {
            C437220r r1 = (C437220r) ((AnonymousClass20Z) r8.A01.getValue()).A00(A0K.A0u);
            if (!r1.BgB(A0K)) {
                C139546z1.A00(A0K, r8);
            } else {
                r1.CFF(frameLayout, r5, A0K);
            }
        }
    }

    public int getCenteredLayoutId() {
        return 2131624945;
    }

    public int getIncomingLayoutId() {
        return 2131624946;
    }

    public int getOutgoingLayoutId() {
        return 2131624948;
    }
}
