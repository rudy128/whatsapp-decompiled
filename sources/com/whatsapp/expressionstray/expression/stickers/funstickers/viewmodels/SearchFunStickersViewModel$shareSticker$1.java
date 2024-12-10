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

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$shareSticker$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {738}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$shareSticker$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $position;
    public final /* synthetic */ C1418377d $sticker;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$shareSticker$1$1", f = "SearchFunStickersViewModel.kt", i = {1}, l = {740, 743}, m = "invokeSuspend", n = {"stickerToSend"}, s = {"L$0"})
    /* renamed from: com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$shareSticker$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(r3, r6, i2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x008d A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r7.label
                r5 = 2
                r6 = 1
                if (r0 == 0) goto L_0x003c
                if (r0 == r6) goto L_0x004e
                if (r0 != r5) goto L_0x008e
                java.lang.Object r3 = r7.L$0
                X.77d r3 = (X.C1418377d) r3
                X.C30691eM.A01(r8)
            L_0x0013:
                X.1Dv r0 = X.AnonymousClass1BI.A00
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this
                java.lang.String r0 = r0.A03
                X.1BI r5 = X.C22931Dv.A01(r0)
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this
                X.00H r0 = r0.A0L
                java.lang.Object r0 = r0.get()
                X.1Nf r0 = (X.C25181Nf) r0
                X.1E7 r4 = r0.A01(r5)
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this
                X.1wy r2 = r0.A0K
                int r1 = r2
                X.6sh r0 = new X.6sh
                r0.<init>(r4, r5, r3, r1)
                r2.A0E(r0)
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x003c:
                X.C30691eM.A01(r8)
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this
                X.77d r3 = r3
                r7.L$0 = r3
                r7.label = r6
                java.lang.Object r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A03(r0, r3, r7)
                if (r0 != r4) goto L_0x0055
                return r4
            L_0x004e:
                java.lang.Object r3 = r7.L$0
                X.77d r3 = (X.C1418377d) r3
                X.C30691eM.A01(r8)
            L_0x0055:
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this
                X.00H r0 = r0.A0Q
                java.lang.Object r0 = r0.get()
                X.72H r0 = (X.AnonymousClass72H) r0
                r0.A05(r3)
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this
                X.0z4 r2 = r0.A0G
                android.content.SharedPreferences r0 = X.C17890vO.A0B(r2)
                java.lang.String r1 = "sticker_maker_upsell_dismissed"
                boolean r0 = X.C17880vN.A1W(r0, r1)
                if (r0 != 0) goto L_0x0079
                android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r2)
                X.C17880vN.A1F(r0, r1, r6)
            L_0x0079:
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this
                X.00H r0 = r0.A0N
                java.lang.Object r0 = r0.get()
                X.6pv r0 = (X.C134046pv) r0
                r7.L$0 = r3
                r7.label = r5
                java.lang.Object r0 = r0.A00(r3, r7)
                if (r0 != r4) goto L_0x0013
                return r4
            L_0x008e:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$shareSticker$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$shareSticker$1(SearchFunStickersViewModel searchFunStickersViewModel, C1418377d r3, C30391dr r4, int i) {
        super(2, r4);
        this.this$0 = searchFunStickersViewModel;
        this.$sticker = r3;
        this.$position = i;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new SearchFunStickersViewModel$shareSticker$1(this.this$0, this.$sticker, r6, this.$position);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final SearchFunStickersViewModel searchFunStickersViewModel = this.this$0;
            C18600wl r4 = searchFunStickersViewModel.A0S;
            final C1418377d r3 = this.$sticker;
            final int i2 = this.$position;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r4, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$shareSticker$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
