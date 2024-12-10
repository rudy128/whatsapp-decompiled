package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FU;
import X.AnonymousClass1OS;
import X.AnonymousClass3Ma;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C87384Vj;
import com.whatsapp.jid.Jid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$launchNewLGCCallConfirmationSheet$2", f = "CallLogActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogActivityViewModel$launchNewLGCCallConfirmationSheet$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1FU $activity;
    public final /* synthetic */ int $callFromUi;
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public final /* synthetic */ boolean $isVideo;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogActivityViewModel$launchNewLGCCallConfirmationSheet$2(AnonymousClass1FU r2, AnonymousClass1E7 r3, C30391dr r4, int i, boolean z) {
        super(2, r4);
        this.$activity = r2;
        this.$isVideo = z;
        this.$contact = r3;
        this.$callFromUi = i;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new CallLogActivityViewModel$launchNewLGCCallConfirmationSheet$2(this.$activity, this.$contact, r8, this.$callFromUi, this.$isVideo);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1FU r3 = this.$activity;
            boolean z = this.$isVideo;
            Jid A0m = AnonymousClass3Ma.A0m(this.$contact);
            C18070vi.A0X(A0m);
            r3.CMk(C87384Vj.A01((AnonymousClass1EC) A0m, this.$callFromUi, z), "CallConfirmationSheet");
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogActivityViewModel$launchNewLGCCallConfirmationSheet$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
