package com.whatsapp.conversation.conversationrow.nativeflow;

import X.AE0;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass8BR;
import X.C169888nj;
import X.C188329hF;
import X.C194939sX;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.flows.network.metadata.FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.CheckoutOrderFlowAction$fetchFlowsMetadataAssets$1$1", f = "CheckoutOrderFlowAction.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
public final class CheckoutOrderFlowAction$fetchFlowsMetadataAssets$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ int $instanceKey;
    public final /* synthetic */ AE0 $it;
    public int label;
    public final /* synthetic */ C169888nj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutOrderFlowAction$fetchFlowsMetadataAssets$1$1(C169888nj r2, UserJid userJid, AE0 ae0, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = r2;
        this.$instanceKey = i;
        this.$bizJid = userJid;
        this.$it = ae0;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new CheckoutOrderFlowAction$fetchFlowsMetadataAssets$1$1(this.this$0, this.$bizJid, this.$it, r8, this.$instanceKey);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C188329hF r4 = (C188329hF) this.this$0.A09.get();
            Integer A0v = AnonymousClass3MW.A0v(this.$instanceKey);
            UserJid userJid = this.$bizJid;
            String str = this.$it.A00;
            this.label = 1;
            obj = C30451dy.A00(this, r4.A07, new FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2(r4, userJid, A0v, str, (C30391dr) null, false));
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass8BR.A0U(this.this$0.A0A).A0G(AnonymousClass3MW.A0v(this.$instanceKey), ((C194939sX) obj).A00);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CheckoutOrderFlowAction$fetchFlowsMetadataAssets$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
