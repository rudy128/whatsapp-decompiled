package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C17900vP;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {706}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $lastResult;
    public final /* synthetic */ List $localResults;
    public final /* synthetic */ String $searchText;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {708, 709}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r8) {
            return new AnonymousClass1(str, list, list2, r8);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                C18030ve r2 = StickerExpressionsViewModel.this.A0C.A00;
                this.label = 1;
                if (C62882s9.A00(this, (long) C18020vd.A00(C18040vf.A02, r2, 5423)) == r4) {
                    return r4;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else if (i == 2) {
                try {
                    C30691eM.A01(obj);
                } catch (Exception e) {
                    C17900vP.A0X(e, "StickerExpressionsViewModel/fetchMoreGiphyTenorStickers/error = ", AnonymousClass000.A10());
                }
                return C27621Wu.A00;
            } else {
                throw AnonymousClass000.A0l();
            }
            StickerExpressionsViewModel stickerExpressionsViewModel = StickerExpressionsViewModel.this;
            List list = list;
            String str = str;
            List list2 = list2;
            this.label = 2;
            if (StickerExpressionsViewModel.A06(stickerExpressionsViewModel, str, list, list2, this) == r4) {
                return r4;
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1(StickerExpressionsViewModel stickerExpressionsViewModel, String str, List list, List list2, C30391dr r6) {
        super(2, r6);
        this.this$0 = stickerExpressionsViewModel;
        this.$localResults = list;
        this.$searchText = str;
        this.$lastResult = list2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1(this.this$0, this.$searchText, this.$localResults, this.$lastResult, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            C18600wl r0 = stickerExpressionsViewModel.A0g;
            final List list = this.$localResults;
            final String str = this.$searchText;
            final List list2 = this.$lastResult;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
