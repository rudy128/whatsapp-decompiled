package X;

import android.os.Bundle;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.InterceptingEditText;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.expressionstray.search.ExpressionsSearchView;
import com.whatsapp.group.GroupProfileEmojiEditor;

/* renamed from: X.4nB  reason: invalid class name and case insensitive filesystem */
public class C96024nB implements C1605588y {
    public final /* synthetic */ BottomSheetBehavior A00;
    public final /* synthetic */ EmojiSearchKeyboardContainer A01;
    public final /* synthetic */ GroupProfileEmojiEditor A02;
    public final /* synthetic */ C95924n1 A03;
    public final /* synthetic */ AnonymousClass88B A04;

    public C96024nB(BottomSheetBehavior bottomSheetBehavior, EmojiSearchKeyboardContainer emojiSearchKeyboardContainer, GroupProfileEmojiEditor groupProfileEmojiEditor, C95924n1 r4, AnonymousClass88B r5) {
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = groupProfileEmojiEditor;
        this.A01 = emojiSearchKeyboardContainer;
        this.A00 = bottomSheetBehavior;
    }

    public void CAy(String str) {
        ExpressionsSearchView A002 = this.A03.A0D.A00((String) null, 2);
        A002.A0N = this.A04;
        this.A02.CMk(A002, (String) null);
    }

    public void CNn() {
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A01;
        BottomSheetBehavior bottomSheetBehavior = this.A00;
        bottomSheetBehavior.A0d(true);
        bottomSheetBehavior.A0W(5);
        emojiSearchKeyboardContainer.A04(this.A02, this.A03.A0B, new C95904mz(bottomSheetBehavior, emojiSearchKeyboardContainer), new C95934n2(this, 2));
        InterceptingEditText interceptingEditText = emojiSearchKeyboardContainer.A04;
        if (interceptingEditText != null) {
            interceptingEditText.performAccessibilityAction(64, (Bundle) null);
        }
    }
}
