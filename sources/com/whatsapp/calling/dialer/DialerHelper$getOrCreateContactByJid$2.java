package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerHelper$getOrCreateContactByJid$2", f = "DialerHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DialerHelper$getOrCreateContactByJid$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $jid;
    public int label;
    public final /* synthetic */ DialerHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialerHelper$getOrCreateContactByJid$2(DialerHelper dialerHelper, UserJid userJid, C30391dr r4) {
        super(2, r4);
        this.this$0 = dialerHelper;
        this.$jid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new DialerHelper$getOrCreateContactByJid$2(this.this$0, this.$jid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return this.this$0.A03.A0H(this.$jid);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DialerHelper$getOrCreateContactByJid$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
