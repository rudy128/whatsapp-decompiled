package com.whatsapp.expressionstray.expression.emoji;

import X.AnonymousClass000;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.AnonymousClass4I5;
import X.AnonymousClass4Z6;
import X.AnonymousClass5WL;
import X.C108995ce;
import X.C127256e3;
import X.C147277Sn;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C34081jt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment$observeState$1", f = "EmojiExpressionsFragment.kt", i = {}, l = {529}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsFragment$observeState$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $batch;
    public int label;
    public final /* synthetic */ EmojiExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsFragment$observeState$1(EmojiExpressionsFragment emojiExpressionsFragment, C30391dr r3, int i) {
        super(2, r3);
        this.this$0 = emojiExpressionsFragment;
        this.$batch = i;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new EmojiExpressionsFragment$observeState$1(this.this$0, r5, this.$batch);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            EmojiExpressionsViewModel emojiExpressionsViewModel = (EmojiExpressionsViewModel) this.this$0.A0Q.getValue();
            int i2 = this.$batch;
            AnonymousClass5WL A0e = C108995ce.A0e(this.this$0, AnonymousClass4I5.A00(emojiExpressionsViewModel.A0G, AnonymousClass4Z6.A00(new EmojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1(emojiExpressionsViewModel, (C30391dr) null, i2), new C34081jt((AnonymousClass1OB) null, ((C127256e3) emojiExpressionsViewModel.A0D.get()).A01))));
            C147277Sn r0 = new C147277Sn(this.this$0, 20);
            this.label = 1;
            if (A0e.BFC(this, r0) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiExpressionsFragment$observeState$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
