package com.whatsapp.expressionstray.expression.emoji;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass1OB;
import X.AnonymousClass4I5;
import X.AnonymousClass4Z8;
import X.C23421Fz;
import X.C27621Wu;
import X.C28243Du4;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C34081jt;
import X.C36001nB;
import X.C88604aC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1", f = "EmojiExpressionsViewModel.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1 extends C30431dv implements C36001nB {
    public final /* synthetic */ int $batch$inlined;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ EmojiExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1(EmojiExpressionsViewModel emojiExpressionsViewModel, C30391dr r3, int i) {
        super(3, r3);
        this.this$0 = emojiExpressionsViewModel;
        this.$batch$inlined = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        EmojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1 emojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1 = new EmojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1(this.this$0, (C30391dr) obj3, this.$batch$inlined);
        emojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1.L$0 = obj;
        emojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1.L$1 = obj2;
        return emojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C23421Fz A00;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r5 = (AnonymousClass1G2) this.L$0;
            String str = (String) this.L$1;
            if (str == null || str.length() <= 0) {
                EmojiExpressionsViewModel emojiExpressionsViewModel = this.this$0;
                C23421Fz A002 = AnonymousClass4I5.A00(emojiExpressionsViewModel.A0G, new C28243Du4(new EmojiExpressionsViewModel$observeEmojiGrid$1(emojiExpressionsViewModel, (C30391dr) null)));
                EmojiExpressionsViewModel emojiExpressionsViewModel2 = this.this$0;
                A00 = AnonymousClass4Z8.A00(new EmojiExpressionsViewModel$observeEmojis$1$2(emojiExpressionsViewModel2, (C30391dr) null, this.$batch$inlined), A002, new C34081jt((AnonymousClass1OB) null, emojiExpressionsViewModel2.A0H));
            } else {
                A00 = new C28243Du4(new EmojiExpressionsViewModel$observeEmojis$1$1(this.this$0, str, (C30391dr) null, this.$batch$inlined));
            }
            this.label = 1;
            if (C88604aC.A02(this, A00, r5) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
