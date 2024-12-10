package X;

import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel;
import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel$onEmojiLongTapped$1;
import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel$onEmojiLongTapped$2;

/* renamed from: X.843  reason: invalid class name */
public final class AnonymousClass843 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ EmojiExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass843(EmojiExpressionsFragment emojiExpressionsFragment) {
        super(2);
        this.this$0 = emojiExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass1OX A00;
        AnonymousClass1OS emojiExpressionsViewModel$onEmojiLongTapped$2;
        int A0M = AnonymousClass000.A0M(obj);
        int[] iArr = (int[]) obj2;
        C18070vi.A0d(iArr, 1);
        EmojiExpressionsViewModel emojiExpressionsViewModel = (EmojiExpressionsViewModel) this.this$0.A0Q.getValue();
        if (AnonymousClass74I.A02(iArr)) {
            emojiExpressionsViewModel.A03.A1J(1);
            A00 = C41561wd.A00(emojiExpressionsViewModel);
            emojiExpressionsViewModel$onEmojiLongTapped$2 = new EmojiExpressionsViewModel$onEmojiLongTapped$1(emojiExpressionsViewModel, (C30391dr) null, iArr, A0M);
        } else {
            if (AnonymousClass74I.A03(iArr)) {
                emojiExpressionsViewModel.A03.A1J(1);
                A00 = C41561wd.A00(emojiExpressionsViewModel);
                emojiExpressionsViewModel$onEmojiLongTapped$2 = new EmojiExpressionsViewModel$onEmojiLongTapped$2(emojiExpressionsViewModel, (C30391dr) null, iArr, A0M);
            }
            return C27621Wu.A00;
        }
        AnonymousClass3MX.A1Q(emojiExpressionsViewModel$onEmojiLongTapped$2, A00);
        return C27621Wu.A00;
    }
}
