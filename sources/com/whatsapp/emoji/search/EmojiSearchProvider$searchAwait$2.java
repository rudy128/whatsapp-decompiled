package com.whatsapp.emoji.search;

import X.A34;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7IK;
import X.AnonymousClass7IL;
import X.C121906Ly;
import X.C122596Qz;
import X.C131976ly;
import X.C139596z7;
import X.C157997yz;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C72473Md;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.emoji.search.EmojiSearchProvider$searchAwait$2", f = "EmojiSearchProvider.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiSearchProvider$searchAwait$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $query;
    public final /* synthetic */ C122596Qz $searchType;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ EmojiSearchProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiSearchProvider$searchAwait$2(EmojiSearchProvider emojiSearchProvider, C122596Qz r3, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = emojiSearchProvider;
        this.$query = str;
        this.$searchType = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new EmojiSearchProvider$searchAwait$2(this.this$0, this.$searchType, this.$query, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            EmojiSearchProvider emojiSearchProvider = this.this$0;
            String str = this.$query;
            C122596Qz r9 = this.$searchType;
            this.L$0 = emojiSearchProvider;
            this.L$1 = str;
            this.L$2 = r9;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            C18070vi.A0f(str, 0, r9);
            C131976ly r2 = new C131976ly();
            if (emojiSearchProvider.A02) {
                C139596z7 r8 = emojiSearchProvider.A03;
                AnonymousClass7IL r10 = new AnonymousClass7IL(r2, 2);
                List<A34> list = (List) r8.A09.get(r9);
                if (list != null) {
                    for (A34 A0B : list) {
                        A0B.A0B(true);
                    }
                }
                C121906Ly r7 = new C121906Ly(r8, r9, r10, r8.A06, true);
                r8.A08.CGD(r7, str);
                C139596z7.A00(r7, r8, r9);
            }
            r2.A00(new AnonymousClass7IK(A0m, 0));
            A0m.Bdu(new C157997yz(A0m));
            obj = A0m.A0C();
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiSearchProvider$searchAwait$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
