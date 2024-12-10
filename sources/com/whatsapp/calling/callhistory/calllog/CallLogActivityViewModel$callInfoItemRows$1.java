package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass000;
import X.C18070vi;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import X.C93384it;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$callInfoItemRows$1", f = "CallLogActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogActivityViewModel$callInfoItemRows$1 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ CallLogActivityViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogActivityViewModel$callInfoItemRows$1(CallLogActivityViewModel callLogActivityViewModel, C30391dr r3) {
        super(3, r3);
        this.this$0 = callLogActivityViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        CallLogActivityViewModel$callInfoItemRows$1 callLogActivityViewModel$callInfoItemRows$1 = new CallLogActivityViewModel$callInfoItemRows$1(this.this$0, (C30391dr) obj3);
        callLogActivityViewModel$callInfoItemRows$1.L$0 = obj;
        callLogActivityViewModel$callInfoItemRows$1.L$1 = obj2;
        return callLogActivityViewModel$callInfoItemRows$1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            Collection collection = (Collection) this.L$0;
            Iterable iterable = (Iterable) this.L$1;
            if (this.this$0.A0b) {
                collection = C29431cG.A0k(collection, C18070vi.A0M(new C93384it((Integer) null, 2131165661, 2130969366)));
            }
            return C29431cG.A0k(iterable, collection);
        }
        throw AnonymousClass000.A0l();
    }
}
