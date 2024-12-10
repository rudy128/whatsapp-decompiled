package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass000;
import X.AnonymousClass02B;
import X.AnonymousClass1FY;
import X.AnonymousClass1OS;
import X.AnonymousClass3MY;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C91104f9;
import android.view.View;
import android.widget.ImageView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityV2$initObservables$1$1$1$3", f = "CallLogActivityV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogActivityV2$initObservables$1$1$1$3 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ CallLogActivityV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogActivityV2$initObservables$1$1$1$3(CallLogActivityV2 callLogActivityV2, C30391dr r3) {
        super(2, r3);
        this.this$0 = callLogActivityV2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        CallLogActivityV2$initObservables$1$1$1$3 callLogActivityV2$initObservables$1$1$1$3 = new CallLogActivityV2$initObservables$1$1$1$3(this.this$0, r4);
        callLogActivityV2$initObservables$1$1$1$3.Z$0 = AnonymousClass000.A1Y(obj);
        return callLogActivityV2$initObservables$1$1$1$3;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            boolean z = this.Z$0;
            C91104f9 r3 = this.this$0.A0F;
            if (r3 == null) {
                C18070vi.A11("callLogActivityActionMode");
                throw null;
            }
            if (z) {
                AnonymousClass1FY r1 = r3.A01;
                AnonymousClass02B COJ = r1.COJ(r3);
                View A0H = AnonymousClass3MY.A0H(r1, 2131427512);
                if (A0H instanceof ImageView) {
                    ((ImageView) A0H).setImageResource(2131230921);
                }
                r3.A00 = COJ;
            } else {
                AnonymousClass02B r0 = r3.A00;
                if (r0 != null) {
                    r0.A05();
                }
                r3.A00 = null;
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogActivityV2$initObservables$1$1$1$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
