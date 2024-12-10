package com.whatsapp.expressionstray.search;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6E6;
import X.C117245zS;
import X.C117255zT;
import X.C123126Tf;
import X.C127246e2;
import X.C132766nY;
import X.C18070vi;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.expressionstray.ExpressionsTrayTabHandler$createTabsListByOpener$2;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$handleAvatarEvent$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {511}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$handleAvatarEvent$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C123126Tf $event;
    public Object L$0;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$handleAvatarEvent$1(ExpressionsSearchViewModel expressionsSearchViewModel, C123126Tf r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = expressionsSearchViewModel;
        this.$event = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ExpressionsSearchViewModel$handleAvatarEvent$1(this.this$0, this.$event, r5);
    }

    public final Object invokeSuspend(Object obj) {
        ExpressionsSearchViewModel expressionsSearchViewModel;
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            expressionsSearchViewModel = this.this$0;
            boolean A1T = AnonymousClass000.A1T(expressionsSearchViewModel.A00, 7);
            C132766nY r4 = (C132766nY) expressionsSearchViewModel.A0H.get();
            int i2 = this.this$0.A00;
            this.L$0 = expressionsSearchViewModel;
            this.label = 1;
            obj = C30451dy.A00(this, r4.A04, new ExpressionsTrayTabHandler$createTabsListByOpener$2(r4, (C30391dr) null, i2, A1T));
            if (obj == r7) {
                return r7;
            }
        } else if (i == 1) {
            expressionsSearchViewModel = (ExpressionsSearchViewModel) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        expressionsSearchViewModel.A04 = (List) obj;
        if (this.$event instanceof AnonymousClass6E6) {
            C127246e2 r0 = this.this$0.A03;
            Object obj2 = C117245zS.A00;
            boolean A18 = C18070vi.A18(r0, obj2);
            List list = this.this$0.A04;
            if (!A18) {
                obj2 = C117255zT.A00;
            }
            int indexOf = list.indexOf(obj2);
            ExpressionsSearchViewModel expressionsSearchViewModel2 = this.this$0;
            expressionsSearchViewModel2.A02 = null;
            C127246e2 r02 = (C127246e2) C29431cG.A0f(expressionsSearchViewModel2.A04, indexOf);
            if (r02 != null) {
                expressionsSearchViewModel2.A0T(r02);
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsSearchViewModel$handleAvatarEvent$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
