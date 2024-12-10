package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.C108945cZ;
import X.C108955ca;
import X.C117175zL;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$sendStickerPackLink$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {1178}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$sendStickerPackLink$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ String $stickerPackId;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$sendStickerPackLink$1(StickerExpressionsViewModel stickerExpressionsViewModel, AnonymousClass1BI r3, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = stickerExpressionsViewModel;
        this.$stickerPackId = str;
        this.$chatJid = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new StickerExpressionsViewModel$sendStickerPackLink$1(this.this$0, this.$chatJid, this.$stickerPackId, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G3 r4 = this.this$0.A0j;
            C117175zL r0 = new C117175zL(this.$chatJid, C108955ca.A12(Locale.US, "https://wa.me/stickerpack/%s", C108945cZ.A1b(this.$stickerPackId, new Object[1], 0, 1)));
            this.label = 1;
            if (r4.BJt(r0, this) == r6) {
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
        return ((StickerExpressionsViewModel$sendStickerPackLink$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
