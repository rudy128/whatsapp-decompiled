package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6E6;
import X.C123126Tf;
import X.C132766nY;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsTrayViewModel$handleAvatarEvent$1", f = "ExpressionsTrayViewModel.kt", i = {}, l = {506}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsTrayViewModel$handleAvatarEvent$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C123126Tf $event;
    public Object L$0;
    public int label;
    public final /* synthetic */ ExpressionsTrayViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsTrayViewModel$handleAvatarEvent$1(ExpressionsTrayViewModel expressionsTrayViewModel, C123126Tf r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = expressionsTrayViewModel;
        this.$event = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ExpressionsTrayViewModel$handleAvatarEvent$1(this.this$0, this.$event, r5);
    }

    public final Object invokeSuspend(Object obj) {
        ExpressionsTrayViewModel expressionsTrayViewModel;
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            expressionsTrayViewModel = this.this$0;
            C132766nY r4 = expressionsTrayViewModel.A08;
            int i2 = expressionsTrayViewModel.A00;
            this.L$0 = expressionsTrayViewModel;
            this.label = 1;
            obj = C30451dy.A00(this, r4.A04, new ExpressionsTrayTabHandler$createTabsListByOpener$2(r4, (C30391dr) null, i2, true));
            if (obj == r7) {
                return r7;
            }
        } else if (i == 1) {
            expressionsTrayViewModel = (ExpressionsTrayViewModel) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        expressionsTrayViewModel.A04 = (List) obj;
        if (this.$event instanceof AnonymousClass6E6) {
            this.this$0.A01 = null;
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsTrayViewModel$handleAvatarEvent$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
