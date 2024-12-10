package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass000;
import X.AnonymousClass1FU;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C87384Vj;
import X.C89444cT;
import com.whatsapp.jid.GroupJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$launchNewAdhocCallConfirmationSheet$2", f = "CallLogActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogActivityViewModel$launchNewAdhocCallConfirmationSheet$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1FU $activity;
    public final /* synthetic */ int $callFromUi;
    public final /* synthetic */ C89444cT $callLogKey;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogActivityViewModel$launchNewAdhocCallConfirmationSheet$2(AnonymousClass1FU r2, C89444cT r3, C30391dr r4, int i) {
        super(2, r4);
        this.$activity = r2;
        this.$callFromUi = i;
        this.$callLogKey = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new CallLogActivityViewModel$launchNewAdhocCallConfirmationSheet$2(this.$activity, this.$callLogKey, r6, this.$callFromUi);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$activity.CMk(C87384Vj.A00((GroupJid) null, this.$callLogKey, this.$callFromUi), "CallConfirmationSheet");
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogActivityViewModel$launchNewAdhocCallConfirmationSheet$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
