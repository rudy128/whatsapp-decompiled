package com.whatsapp.expressionstray.expression.emoji;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.AnonymousClass6TA;
import X.C117415zk;
import X.C117435zm;
import X.C117445zn;
import X.C117455zp;
import X.C130796k1;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.expressionstray.expression.emoji.data.EmojiExpressionsDataSource$getEmojiSearchItems$2;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel$observeEmojis$1$1", f = "EmojiExpressionsViewModel.kt", i = {0}, l = {100, 104, 107, 111}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
public final class EmojiExpressionsViewModel$observeEmojis$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $batch;
    public final /* synthetic */ String $searchQuery;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ EmojiExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsViewModel$observeEmojis$1$1(EmojiExpressionsViewModel emojiExpressionsViewModel, String str, C30391dr r4, int i) {
        super(2, r4);
        this.this$0 = emojiExpressionsViewModel;
        this.$searchQuery = str;
        this.$batch = i;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        EmojiExpressionsViewModel$observeEmojis$1$1 emojiExpressionsViewModel$observeEmojis$1$1 = new EmojiExpressionsViewModel$observeEmojis$1$1(this.this$0, this.$searchQuery, r6, this.$batch);
        emojiExpressionsViewModel$observeEmojis$1$1.L$0 = obj;
        return emojiExpressionsViewModel$observeEmojis$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1G2 r4;
        Object obj2;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r4 = (AnonymousClass1G2) this.L$0;
            C130796k1 r7 = (C130796k1) this.this$0.A09.get();
            String str = this.$searchQuery;
            this.L$0 = r4;
            this.label = 1;
            obj = C30451dy.A00(this, r7.A09, new EmojiExpressionsDataSource$getEmojiSearchItems$2(r7, str, (C30391dr) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            r4 = (AnonymousClass1G2) this.L$0;
            C30691eM.A01(obj);
        } else if (i == 2 || i == 3 || i == 4) {
            C30691eM.A01(obj);
            return C27621Wu.A00;
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass6TA r11 = (AnonymousClass6TA) obj;
        if (r11 instanceof C117455zp) {
            List list = ((C117455zp) r11).A00;
            if (list.isEmpty()) {
                obj2 = C117435zm.A00;
                this.L$0 = null;
                this.label = 2;
            } else {
                EmojiExpressionsViewModel emojiExpressionsViewModel = this.this$0;
                int i2 = this.$batch;
                if (i2 != 0) {
                    list = EmojiExpressionsViewModel.A00(emojiExpressionsViewModel, (Integer) null, list, i2);
                }
                obj2 = new C117415zk(list);
                this.L$0 = null;
                this.label = 3;
            }
        } else {
            obj2 = C117445zn.A00;
            this.L$0 = null;
            this.label = 4;
        }
        if (r4.BJt(obj2, this) == r5) {
            return r5;
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiExpressionsViewModel$observeEmojis$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
