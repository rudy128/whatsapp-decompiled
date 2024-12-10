package X;

import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;

/* renamed from: X.7GC  reason: invalid class name */
public final class AnonymousClass7GC implements C107385Zm {
    public final /* synthetic */ AnonymousClass74J A00;

    public AnonymousClass7GC(AnonymousClass74J r1) {
        this.A00 = r1;
    }

    public void Bm8() {
        AnonymousClass74J r1 = this.A00;
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = r1.A0A;
        if (emojiSearchKeyboardContainer != null && emojiSearchKeyboardContainer.getVisibility() == 0) {
            EmojiSearchKeyboardContainer emojiSearchKeyboardContainer2 = r1.A0A;
            if (emojiSearchKeyboardContainer2 != null) {
                emojiSearchKeyboardContainer2.A03();
            }
            EmojiSearchKeyboardContainer emojiSearchKeyboardContainer3 = r1.A0A;
            if (emojiSearchKeyboardContainer3 != null) {
                emojiSearchKeyboardContainer3.postDelayed(C146747Ql.A00(r1, 10), AnonymousClass74J.A02(r1, 150));
            }
        }
    }
}
