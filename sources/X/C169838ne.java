package X;

import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8ne  reason: invalid class name and case insensitive filesystem */
public final class C169838ne extends AnonymousClass4FG {
    public AnonymousClass8ez A00;
    public final C21085AeF A01 = new C21085AeF(this, 0);
    public final C32021gV A02;

    public C169838ne(C32021gV r3) {
        C18070vi.A0d(r3, 1);
        this.A02 = r3;
    }

    public void A01(FrameLayout frameLayout, AnonymousClass3uP r7, AnonymousClass206 r8, C20285AEt aEt) {
        C18070vi.A0o(r8, aEt, r7);
        frameLayout.removeAllViews();
        AEE aee = aEt.A05;
        View.OnClickListener onClickListener = aEt.A01;
        AnonymousClass8ez r3 = new AnonymousClass8ez(AnonymousClass3MY.A04(frameLayout));
        frameLayout.addView(r3);
        if (aee != null) {
            r3.setOnClickListener(onClickListener);
            String str = aee.A02;
            C17960vV.A07(str);
            TextEmojiLabel textEmojiLabel = r3.A01;
            r7.A2G(textEmojiLabel, r8, str, false);
            textEmojiLabel.setVisibility(0);
            TextEmojiLabel textEmojiLabel2 = r3.A00;
            textEmojiLabel2.setText(aee.A01);
            textEmojiLabel2.setVisibility(0);
            this.A02.A0D(r3.A02, r8, this.A01);
        }
        this.A00 = r3;
        frameLayout.invalidate();
    }
}
