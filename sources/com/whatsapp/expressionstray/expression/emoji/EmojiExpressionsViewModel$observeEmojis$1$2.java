package com.whatsapp.expressionstray.expression.emoji;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.AnonymousClass6TA;
import X.C108975cc;
import X.C117425zl;
import X.C117445zn;
import X.C117465zq;
import X.C117515zv;
import X.C117525zw;
import X.C117535zx;
import X.C131546lH;
import X.C135736sg;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel$observeEmojis$1$2", f = "EmojiExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsViewModel$observeEmojis$1$2 extends C30431dv implements C36001nB {
    public final /* synthetic */ int $batch;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ EmojiExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsViewModel$observeEmojis$1$2(EmojiExpressionsViewModel emojiExpressionsViewModel, C30391dr r3, int i) {
        super(3, r3);
        this.this$0 = emojiExpressionsViewModel;
        this.$batch = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        EmojiExpressionsViewModel$observeEmojis$1$2 emojiExpressionsViewModel$observeEmojis$1$2 = new EmojiExpressionsViewModel$observeEmojis$1$2(this.this$0, (C30391dr) obj3, this.$batch);
        emojiExpressionsViewModel$observeEmojis$1$2.L$0 = obj;
        emojiExpressionsViewModel$observeEmojis$1$2.L$1 = obj2;
        return emojiExpressionsViewModel$observeEmojis$1$2.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass6TA r6 = (AnonymousClass6TA) this.L$0;
            C135736sg r5 = (C135736sg) this.L$1;
            if (!(r6 instanceof C117465zq)) {
                return C117445zn.A00;
            }
            EmojiExpressionsViewModel emojiExpressionsViewModel = this.this$0;
            C117465zq r62 = (C117465zq) r6;
            int i = this.$batch;
            Integer num = r62.A00;
            if (i == 0) {
                List A03 = EmojiExpressionsViewModel.A03(r5, r62.A02);
                List<C131546lH> list = r62.A01;
                if (num != null) {
                    ArrayList A0D = C29351c6.A0D(list);
                    boolean z = true;
                    for (C131546lH r52 : list) {
                        if (z) {
                            if (r52 instanceof C117525zw) {
                                C117525zw r53 = (C117525zw) r52;
                                r52 = new C117525zw(r53.A00, r53.A01, num, r53.A03, r53.A04);
                            } else if (r52 instanceof C117535zx) {
                                C117535zx r54 = (C117535zx) r52;
                                r52 = new C117535zx(r54.A00, r54.A01, num, r54.A03, r54.A04);
                            } else if (!(r52 instanceof C117515zv)) {
                                throw AnonymousClass3MW.A14();
                            }
                            z = false;
                        }
                        A0D.add(r52);
                    }
                    list = A0D;
                }
                return new C117425zl(num, A03, list);
            }
            if (num != null) {
                C108975cc.A0H(emojiExpressionsViewModel.A0B).A02(num.intValue(), "emoji_data_batching_start", (String) null);
            }
            ArrayList A00 = EmojiExpressionsViewModel.A00(emojiExpressionsViewModel, num, r62.A01, i);
            if (num != null) {
                C108975cc.A0H(emojiExpressionsViewModel.A0B).A02(num.intValue(), "emoji_data_batching_end", (String) null);
            }
            return new C117425zl(num, EmojiExpressionsViewModel.A03(r5, r62.A02), A00);
        }
        throw AnonymousClass000.A0l();
    }
}
