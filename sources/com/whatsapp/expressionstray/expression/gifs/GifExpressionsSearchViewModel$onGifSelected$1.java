package com.whatsapp.expressionstray.expression.gifs;

import X.A59;
import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass620;
import X.AnonymousClass77J;
import X.C108945cZ;
import X.C117205zO;
import X.C123876We;
import X.C137836w6;
import X.C18030ve;
import X.C18070vi;
import X.C25291Nq;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.gifs.GifExpressionsSearchViewModel$onGifSelected$1", f = "GifExpressionsSearchViewModel.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
public final class GifExpressionsSearchViewModel$onGifSelected$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass77J $result;
    public final /* synthetic */ boolean $sendWithoutPreview;
    public int label;
    public final /* synthetic */ GifExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifExpressionsSearchViewModel$onGifSelected$1(GifExpressionsSearchViewModel gifExpressionsSearchViewModel, AnonymousClass77J r3, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = gifExpressionsSearchViewModel;
        this.$result = r3;
        this.$sendWithoutPreview = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new GifExpressionsSearchViewModel$onGifSelected$1(this.this$0, this.$result, r6, this.$sendWithoutPreview);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = false;
        int i2 = 1;
        if (i == 0) {
            C30691eM.A01(obj);
            GifExpressionsSearchViewModel gifExpressionsSearchViewModel = this.this$0;
            AnonymousClass1G3 r4 = gifExpressionsSearchViewModel.A0C;
            C117205zO r0 = new C117205zO(this.$result, C137836w6.A00(gifExpressionsSearchViewModel.A08), false, this.$sendWithoutPreview);
            this.label = 1;
            if (r4.BJt(r0, this) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C18030ve r02 = this.this$0.A04;
        C18070vi.A0d(r02, 0);
        if (C25291Nq.A04(r02, 9452) && !this.$sendWithoutPreview) {
            z = true;
        }
        A59 A0e = C108945cZ.A0e(this.this$0.A09);
        if (z) {
            i2 = 4;
        }
        A0e.A03(AnonymousClass3MW.A0v(22), i2, 6);
        C18030ve r03 = this.this$0.A04;
        C18070vi.A0d(r03, 0);
        if (C25291Nq.A04(r03, 9452) && this.$result.A00 != 0) {
            AnonymousClass620 r1 = new AnonymousClass620();
            r1.A00 = AnonymousClass3MW.A0v(C123876We.A00(this.$result.A00));
            this.this$0.A05.CC7(r1);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GifExpressionsSearchViewModel$onGifSelected$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
