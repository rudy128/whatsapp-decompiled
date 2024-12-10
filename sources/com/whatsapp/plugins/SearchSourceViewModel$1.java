package com.whatsapp.plugins;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass210;
import X.AnonymousClass3TZ;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.plugins.SearchSourceViewModel$1", f = "SearchSourceViewModel.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
public final class SearchSourceViewModel$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Collection $messageKeys;
    public int label;
    public final /* synthetic */ AnonymousClass3TZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchSourceViewModel$1(AnonymousClass3TZ r2, Collection collection, C30391dr r4) {
        super(2, r4);
        this.$messageKeys = collection;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new SearchSourceViewModel$1(this.this$0, this.$messageKeys, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ArrayList A13 = AnonymousClass000.A13();
            Collection<AnonymousClass205> collection = this.$messageKeys;
            AnonymousClass3TZ r3 = this.this$0;
            for (AnonymousClass205 A05 : collection) {
                AnonymousClass206 A052 = r3.A00.A01.A05(A05);
                if (A052 instanceof AnonymousClass210) {
                    A13.add(A052);
                }
            }
            AnonymousClass1G4 r0 = this.this$0.A01;
            this.label = 1;
            if (r0.BJt(A13, this) == r6) {
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
        return ((SearchSourceViewModel$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
