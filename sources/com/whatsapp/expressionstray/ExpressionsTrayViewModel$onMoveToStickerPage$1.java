package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.C117255zT;
import X.C1176060e;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsTrayViewModel$onMoveToStickerPage$1", f = "ExpressionsTrayViewModel.kt", i = {}, l = {473}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsTrayViewModel$onMoveToStickerPage$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isSelectedByUser;
    public final /* synthetic */ String $stickerPage;
    public int label;
    public final /* synthetic */ ExpressionsTrayViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayViewModel$onMoveToStickerPage$1(ExpressionsTrayViewModel expressionsTrayViewModel, String str, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = expressionsTrayViewModel;
        this.$stickerPage = str;
        this.$isSelectedByUser = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ExpressionsTrayViewModel$onMoveToStickerPage$1(this.this$0, this.$stickerPage, r6, this.$isSelectedByUser);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.this$0.A0U(C117255zT.A00);
            AnonymousClass1G3 r3 = this.this$0.A0H;
            C1176060e r0 = new C1176060e(this.$stickerPage, this.$isSelectedByUser);
            this.label = 1;
            if (r3.BJt(r0, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsTrayViewModel$onMoveToStickerPage$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
