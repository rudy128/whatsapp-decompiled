package com.whatsapp.expressionstray.expression.emoji.data;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass160;
import X.AnonymousClass1IU;
import X.AnonymousClass1OS;
import X.AnonymousClass737;
import X.AnonymousClass74I;
import X.C108955ca;
import X.C117455zp;
import X.C117475zr;
import X.C117525zw;
import X.C122596Qz;
import X.C130796k1;
import X.C133686pK;
import X.C135736sg;
import X.C1409873v;
import X.C18070vi;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.emoji.data.EmojiExpressionsDataSource$getEmojiSearchItems$2", f = "EmojiExpressionsDataSource.kt", i = {0, 0}, l = {198}, m = "invokeSuspend", n = {"searchSection", "emojiGridItems"}, s = {"L$0", "L$1"})
public final class EmojiExpressionsDataSource$getEmojiSearchItems$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $searchQuery;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C130796k1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsDataSource$getEmojiSearchItems$2(C130796k1 r2, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$searchQuery = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new EmojiExpressionsDataSource$getEmojiSearchItems$2(this.this$0, this.$searchQuery, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C135736sg r8;
        List A13;
        Object A02;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            if (!((C133686pK) this.this$0.A06.get()).A02) {
                return C117475zr.A00;
            }
            int i2 = 2131889719;
            if (((AnonymousClass160) this.this$0.A08.get()).A00 == AnonymousClass00R.A01) {
                i2 = 2131889728;
            }
            r8 = new C135736sg(2131232258, i2, "search", true);
            A13 = AnonymousClass000.A13();
            String str = this.$searchQuery;
            C122596Qz r0 = C122596Qz.EMOJI;
            this.L$0 = r8;
            this.L$1 = A13;
            this.label = 1;
            A02 = ((EmojiSearchProvider) this.this$0.A06.get()).A02(r0, str, this);
            if (A02 == r4) {
                return r4;
            }
        } else if (i == 1) {
            A13 = (List) this.L$1;
            r8 = (C135736sg) this.L$0;
            A02 = C108955ca.A0n(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (A02 instanceof AnonymousClass1IU) {
            A02 = null;
        }
        Iterable iterable = (Iterable) A02;
        if (iterable != null) {
            List<AnonymousClass737> A0q = C29431cG.A0q(iterable);
            C130796k1 r2 = this.this$0;
            for (AnonymousClass737 r02 : A0q) {
                int[] iArr = r02.A00;
                int[] iArr2 = iArr;
                if (AnonymousClass74I.A02(iArr)) {
                    iArr2 = C1409873v.A05(r2.A05, iArr);
                } else if (AnonymousClass74I.A03(iArr)) {
                    iArr2 = C1409873v.A06(r2.A05, iArr);
                } else {
                    A13.add(new C117525zw(r2.A02, r8, (Integer) null, iArr, iArr2));
                }
                C18070vi.A0X(iArr2);
                A13.add(new C117525zw(r2.A02, r8, (Integer) null, iArr, iArr2));
            }
        }
        return new C117455zp(A13);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiExpressionsDataSource$getEmojiSearchItems$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
