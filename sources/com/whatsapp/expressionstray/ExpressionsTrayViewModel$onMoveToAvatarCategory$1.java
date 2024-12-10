package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.C117225zQ;
import X.C117285zW;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsTrayViewModel$onMoveToAvatarCategory$1", f = "ExpressionsTrayViewModel.kt", i = {}, l = {463}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsTrayViewModel$onMoveToAvatarCategory$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $avatarCategory;
    public int label;
    public final /* synthetic */ ExpressionsTrayViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayViewModel$onMoveToAvatarCategory$1(ExpressionsTrayViewModel expressionsTrayViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = expressionsTrayViewModel;
        this.$avatarCategory = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ExpressionsTrayViewModel$onMoveToAvatarCategory$1(this.this$0, this.$avatarCategory, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.this$0.A0U(C117225zQ.A00);
            AnonymousClass1G3 r2 = this.this$0.A0F;
            C117285zW r0 = new C117285zW(this.$avatarCategory);
            this.label = 1;
            if (r2.BJt(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsTrayViewModel$onMoveToAvatarCategory$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
