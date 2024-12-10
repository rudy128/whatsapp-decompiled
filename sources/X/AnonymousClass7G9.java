package X;

import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel;
import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel$onMultiSkinToneSelected$1;
import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel$onSkinToneSelected$1;

/* renamed from: X.7G9  reason: invalid class name */
public class AnonymousClass7G9 implements C107375Zl {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7G9(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void C5m(int[] iArr) {
        int i = this.A00;
        EmojiExpressionsFragment emojiExpressionsFragment = (EmojiExpressionsFragment) this.A01;
        Object obj = this.A02;
        if (i != 0) {
            C117385zh r1 = (C117385zh) obj;
            if (iArr != null) {
                EmojiExpressionsViewModel emojiExpressionsViewModel = (EmojiExpressionsViewModel) emojiExpressionsFragment.A0Q.getValue();
                int i2 = r1.A00;
                C1409873v.A04(emojiExpressionsViewModel.A07, iArr);
                emojiExpressionsViewModel.A0T(iArr, i2);
                AnonymousClass3MX.A1Q(new EmojiExpressionsViewModel$onSkinToneSelected$1(emojiExpressionsViewModel, (C30391dr) null, iArr, i2), C41561wd.A00(emojiExpressionsViewModel));
                return;
            }
            return;
        }
        C117375zg r12 = (C117375zg) obj;
        if (iArr != null) {
            EmojiExpressionsViewModel emojiExpressionsViewModel2 = (EmojiExpressionsViewModel) emojiExpressionsFragment.A0Q.getValue();
            int i3 = r12.A00;
            C1409873v.A03(emojiExpressionsViewModel2.A07, iArr);
            emojiExpressionsViewModel2.A0T(iArr, i3);
            AnonymousClass3MX.A1Q(new EmojiExpressionsViewModel$onMultiSkinToneSelected$1(emojiExpressionsViewModel2, (C30391dr) null, iArr, i3), C41561wd.A00(emojiExpressionsViewModel2));
        }
    }
}
