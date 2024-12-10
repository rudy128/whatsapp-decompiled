package X;

import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8nf  reason: invalid class name and case insensitive filesystem */
public final class C169848nf extends AnonymousClass4FG {
    public AnonymousClass8f0 A00;
    public final C21085AeF A01 = new C21085AeF(this, 1);
    public final C32021gV A02;

    public C169848nf(C32021gV r3) {
        C18070vi.A0d(r3, 1);
        this.A02 = r3;
    }

    public void A01(FrameLayout frameLayout, AnonymousClass3uP r8, AnonymousClass206 r9, C20285AEt aEt) {
        String str;
        C18070vi.A0o(r9, aEt, r8);
        frameLayout.removeAllViews();
        String str2 = null;
        AnonymousClass8f0 r3 = new AnonymousClass8f0(AnonymousClass3MY.A04(frameLayout));
        frameLayout.addView(r3);
        AEE aee = aEt.A05;
        if (aee != null) {
            str = aee.A02;
        } else {
            str = null;
        }
        TextEmojiLabel textEmojiLabel = r3.A01;
        if (str == null || str.length() == 0) {
            textEmojiLabel.setVisibility(8);
        } else {
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.setText(r8.A1p(str));
        }
        if (aee != null) {
            str2 = aee.A01;
        }
        TextEmojiLabel textEmojiLabel2 = r3.A00;
        if (str2 == null || str2.length() == 0) {
            textEmojiLabel2.setVisibility(8);
        } else {
            textEmojiLabel2.setVisibility(0);
            textEmojiLabel2.setText(r8.A1p(str2));
        }
        if (C50332Ua.A00(r9).A03) {
            this.A02.A0D(r3.A02, r9, this.A01);
        } else {
            r3.A02.setVisibility(8);
        }
        this.A00 = r3;
        frameLayout.invalidate();
    }
}
