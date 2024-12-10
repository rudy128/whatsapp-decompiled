package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;

/* renamed from: X.4mz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C95904mz implements C107385Zm {
    public final /* synthetic */ BottomSheetBehavior A00;
    public final /* synthetic */ EmojiSearchKeyboardContainer A01;

    public final void Bm8() {
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A01;
        BottomSheetBehavior bottomSheetBehavior = this.A00;
        if (emojiSearchKeyboardContainer.getVisibility() == 0) {
            emojiSearchKeyboardContainer.A03();
            emojiSearchKeyboardContainer.postDelayed(new C21355Aik(bottomSheetBehavior, 29), 150);
            bottomSheetBehavior.A0d(false);
        }
    }

    public /* synthetic */ C95904mz(BottomSheetBehavior bottomSheetBehavior, EmojiSearchKeyboardContainer emojiSearchKeyboardContainer) {
        this.A01 = emojiSearchKeyboardContainer;
        this.A00 = bottomSheetBehavior;
    }
}
