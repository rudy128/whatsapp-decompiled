package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1VP;
import X.AnonymousClass3MW;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.content.Context;
import com.whatsapp.jid.GroupJid;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModelKt$mayStartOutgoingCallOnDispatcher$2", f = "CallLogActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogActivityViewModelKt$mayStartOutgoingCallOnDispatcher$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $callFromUi;
    public final /* synthetic */ List $contacts;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ GroupJid $groupJid;
    public final /* synthetic */ boolean $isVideoCall;
    public final /* synthetic */ AnonymousClass1VP $this_mayStartOutgoingCallOnDispatcher;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogActivityViewModelKt$mayStartOutgoingCallOnDispatcher$2(Context context, AnonymousClass1VP r3, GroupJid groupJid, List list, C30391dr r6, int i, boolean z) {
        super(2, r6);
        this.$this_mayStartOutgoingCallOnDispatcher = r3;
        this.$contacts = list;
        this.$context = context;
        this.$callFromUi = i;
        this.$isVideoCall = z;
        this.$groupJid = groupJid;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        AnonymousClass1VP r2 = this.$this_mayStartOutgoingCallOnDispatcher;
        List list = this.$contacts;
        return new CallLogActivityViewModelKt$mayStartOutgoingCallOnDispatcher$2(this.$context, r2, this.$groupJid, list, r10, this.$callFromUi, this.$isVideoCall);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1VP r0 = this.$this_mayStartOutgoingCallOnDispatcher;
            List list = this.$contacts;
            return AnonymousClass3MW.A0v(r0.CNy(this.$context, this.$groupJid, list, this.$callFromUi, this.$isVideoCall));
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogActivityViewModelKt$mayStartOutgoingCallOnDispatcher$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
