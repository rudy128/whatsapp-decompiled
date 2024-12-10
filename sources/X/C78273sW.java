package X;

import android.content.Context;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3sW  reason: invalid class name and case insensitive filesystem */
public final class C78273sW extends AnonymousClass3uP {
    public boolean A00;
    public final TextEmojiLabel A01 = ((TextEmojiLabel) findViewById(2131432683));
    public final String A02;

    public int A1k(int i) {
        return 0;
    }

    public int A1l(int i) {
        return 0;
    }

    public int getBubbleAlpha() {
        return 191;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
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

    public boolean A1X() {
        return C79103uS.A1K(this, getFMessage(), this.A1h);
    }

    public void A2i() {
        TextEmojiLabel textEmojiLabel = this.A01;
        textEmojiLabel.setText(this.A02);
        AnonymousClass3MX.A1C(getContext(), textEmojiLabel, AnonymousClass1YL.A00(getContext(), 2130971613, 2131102720));
        textEmojiLabel.setTypeface(textEmojiLabel.getTypeface(), 2);
        BEA.A17(textEmojiLabel);
    }

    public C78273sW(Context context, C108875cR r5, C439821r r6) {
        super(context, r5, r6);
        A1M();
        StringBuilder A10 = AnonymousClass000.A10();
        String str = C19620yd.A08;
        A10.append(str);
        this.A02 = AnonymousClass001.A1H(context.getString(2131899348), str, A10);
        A2i();
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A2i();
        }
    }

    public int getCenteredLayoutId() {
        return 2131624946;
    }

    public int getIncomingLayoutId() {
        return 2131624946;
    }

    public int getOutgoingLayoutId() {
        return 2131624948;
    }
}
