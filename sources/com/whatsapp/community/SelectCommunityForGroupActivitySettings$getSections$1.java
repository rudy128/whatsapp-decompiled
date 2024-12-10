package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass1D7;
import X.AnonymousClass1OS;
import X.AnonymousClass3rL;
import X.C18070vi;
import X.C24640CDa;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C77073pJ;
import X.C99454sq;
import X.C99474ss;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.SelectCommunityForGroupActivitySettings$getSections$1", f = "SelectCommunityForGroupActivitySettings.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
public final class SelectCommunityForGroupActivitySettings$getSections$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C77073pJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectCommunityForGroupActivitySettings$getSections$1(C77073pJ r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        SelectCommunityForGroupActivitySettings$getSections$1 selectCommunityForGroupActivitySettings$getSections$1 = new SelectCommunityForGroupActivitySettings$getSections$1(this.this$0, r4);
        selectCommunityForGroupActivitySettings$getSections$1.L$0 = obj;
        return selectCommunityForGroupActivitySettings$getSections$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            List list = this.this$0.A0T;
            C18070vi.A0X(list);
            C99474ss r1 = new C99474ss(obj2, new C99454sq(list, 12), this.this$0, 2);
            this.label = 1;
            obj = C24640CDa.A00(AnonymousClass000.A13(), this, r1);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        Map A0D = AnonymousClass1D7.A0D((Iterable) obj);
        List list2 = this.this$0.A0T;
        C18070vi.A0X(list2);
        return C18070vi.A0M(new AnonymousClass3rL(list2, A0D));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SelectCommunityForGroupActivitySettings$getSections$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
