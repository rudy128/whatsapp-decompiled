package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C133886pf;
import X.C146747Ql;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18040vf;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C41561wd;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$downloadInitialStickerPacksIfNecessary$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {325}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$downloadInitialStickerPacksIfNecessary$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$downloadInitialStickerPacksIfNecessary$1$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$downloadInitialStickerPacksIfNecessary$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                StickerExpressionsViewModel stickerExpressionsViewModel = StickerExpressionsViewModel.this;
                if (!C17880vN.A1W(C17890vO.A0B(stickerExpressionsViewModel.A0A), "sticker_picker_initial_download")) {
                    ((C133886pf) stickerExpressionsViewModel.A0P.get()).A01(C146747Ql.A00(stickerExpressionsViewModel, 13), "whatsappcuppy");
                }
                AnonymousClass3MW.A1X(stickerExpressionsViewModel.A0g, new StickerExpressionsViewModel$downloadFeaturedPackIfNecessary$1(stickerExpressionsViewModel, (C30391dr) null), C41561wd.A00(stickerExpressionsViewModel));
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$downloadInitialStickerPacksIfNecessary$1(StickerExpressionsViewModel stickerExpressionsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new StickerExpressionsViewModel$downloadInitialStickerPacksIfNecessary$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StickerExpressionsViewModel$downloadInitialStickerPacksIfNecessary$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            boolean A05 = C18020vd.A05(C18040vf.A02, this.this$0.A0E, 9621);
            final StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            if (A05) {
                C18600wl r2 = stickerExpressionsViewModel.A0g;
                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, r2, r0) == r5) {
                    return r5;
                }
            } else {
                if (!C17880vN.A1W(C17890vO.A0B(stickerExpressionsViewModel.A0A), "sticker_picker_initial_download")) {
                    ((C133886pf) this.this$0.A0P.get()).A00(C146747Ql.A00(this.this$0, 15));
                }
                StickerExpressionsViewModel stickerExpressionsViewModel2 = this.this$0;
                AnonymousClass3MW.A1X(stickerExpressionsViewModel2.A0g, new StickerExpressionsViewModel$downloadFeaturedPackIfNecessary$1(stickerExpressionsViewModel2, (C30391dr) null), C41561wd.A00(stickerExpressionsViewModel2));
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
