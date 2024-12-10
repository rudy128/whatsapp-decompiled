package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4Ye  reason: invalid class name and case insensitive filesystem */
public final class C88064Ye {
    public View A00;
    public TextEmojiLabel A01;
    public WDSButton A02;
    public final C18030ve A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass11C A06;

    public final void A03(CharSequence charSequence) {
        C18070vi.A0d(charSequence, 0);
        TextEmojiLabel textEmojiLabel = this.A01;
        if (textEmojiLabel != null) {
            textEmojiLabel.setText(charSequence);
        }
    }

    public static final void A00(C88064Ye r5, String str, C18090vk r7) {
        TextEmojiLabel textEmojiLabel = r5.A01;
        if (textEmojiLabel != null) {
            r5.A03(AnonymousClass3MY.A0A(textEmojiLabel.getContext(), (C36401np) r5.A05.get(), new C98794rj((Object) r7, 47), str, "learn-more"));
            TextEmojiLabel textEmojiLabel2 = r5.A01;
            if (textEmojiLabel2 != null) {
                AnonymousClass3Ma.A1I(textEmojiLabel2, r5.A03);
            }
        }
    }

    public final void A01(int i) {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public final void A02(int i) {
        TextEmojiLabel textEmojiLabel = this.A01;
        if (textEmojiLabel != null) {
            textEmojiLabel.setVisibility(i);
        }
    }

    public C88064Ye(AnonymousClass11C r1, C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r1, r3, r4);
        this.A03 = r2;
        this.A06 = r1;
        this.A05 = r3;
        this.A04 = r4;
    }
}
