package com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C1418377d;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onToggleFavoriteSticker$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {583}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$onToggleFavoriteSticker$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C1418377d $sticker;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onToggleFavoriteSticker$1$1", f = "SearchFunStickersViewModel.kt", i = {0, 1, 1}, l = {586, 592}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "stickerToFavorite", "stickerToastString"}, s = {"L$1", "L$0", "L$1"})
    /* renamed from: com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onToggleFavoriteSticker$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public Object L$0;
        public Object L$1;
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(searchFunStickersViewModel, r2, r5);
        }

        /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.4rD] */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x008b, code lost:
            if (r0 == r4) goto L_0x008d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x008e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r6.label
                r5 = 2
                r2 = 1
                if (r0 == 0) goto L_0x002f
                if (r0 == r2) goto L_0x0044
                if (r0 != r5) goto L_0x009d
                java.lang.Object r2 = r6.L$1
                java.lang.Object r3 = r6.L$0
                X.C30691eM.A01(r7)
            L_0x0013:
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r4
                X.1SB r4 = r0.A0J
                java.util.Set r1 = X.C18070vi.A0P(r3)
                r0 = 1
                r4.A0K(r1, r0)
            L_0x001f:
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r4 = r4
                X.1KB r3 = r4.A0E
                r1 = 0
                X.7Qq r0 = new X.7Qq
                r0.<init>(r4, r2, r1)
                r3.A0J(r0)
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x002f:
                X.C30691eM.A01(r7)
                X.77d r1 = r2
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r4
                r6.L$0 = r1
                r6.L$1 = r1
                r6.label = r2
                java.lang.Object r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A03(r0, r1, r6)
                if (r0 == r4) goto L_0x008d
                r3 = r1
                goto L_0x004f
            L_0x0044:
                java.lang.Object r1 = r6.L$1
                X.77d r1 = (X.C1418377d) r1
                java.lang.Object r3 = r6.L$0
                X.77d r3 = (X.C1418377d) r3
                X.C30691eM.A01(r7)
            L_0x004f:
                r0 = 6
                java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
                r1.A05 = r0
                X.4rD r2 = new X.4rD
                r2.<init>()
                r0 = 2131890372(0x7f1210c4, float:1.9415434E38)
                r2.element = r0
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r4
                X.1SB r0 = r0.A0J
                boolean r1 = r0.A0L(r3)
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r4
                if (r1 != 0) goto L_0x008e
                X.00H r0 = r0.A0Q
                java.lang.Object r0 = r0.get()
                X.72H r0 = (X.AnonymousClass72H) r0
                r0.A05(r3)
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r4
                X.00H r0 = r0.A0N
                java.lang.Object r0 = r0.get()
                X.6pv r0 = (X.C134046pv) r0
                r6.L$0 = r3
                r6.L$1 = r2
                r6.label = r5
                java.lang.Object r0 = r0.A00(r3, r6)
                if (r0 != r4) goto L_0x0013
            L_0x008d:
                return r4
            L_0x008e:
                X.1SB r1 = r0.A0J
                java.util.Set r0 = X.C18070vi.A0P(r3)
                r1.A0J(r0)
                r0 = 2131890373(0x7f1210c5, float:1.9415436E38)
                r2.element = r0
                goto L_0x001f
            L_0x009d:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onToggleFavoriteSticker$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$onToggleFavoriteSticker$1(SearchFunStickersViewModel searchFunStickersViewModel, C1418377d r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = searchFunStickersViewModel;
        this.$sticker = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new SearchFunStickersViewModel$onToggleFavoriteSticker$1(this.this$0, this.$sticker, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final SearchFunStickersViewModel searchFunStickersViewModel = this.this$0;
            C18600wl r3 = searchFunStickersViewModel.A0S;
            final C1418377d r2 = this.$sticker;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r3, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$onToggleFavoriteSticker$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
