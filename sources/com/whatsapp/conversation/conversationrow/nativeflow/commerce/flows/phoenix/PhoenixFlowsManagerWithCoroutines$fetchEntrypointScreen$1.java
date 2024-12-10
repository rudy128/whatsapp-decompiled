package com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1D6;
import X.AnonymousClass1OS;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.C172038sg;
import X.C17890vO;
import X.C18070vi;
import X.C192239o2;
import X.C193199ph;
import X.C20130A8q;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.flows.phoenix.PhoenixFlowsManagerWithCoroutines$fetchEntrypointScreen$1", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixFlowsManagerWithCoroutines$fetchEntrypointScreen$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $flowId;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ C193199ph $phoenixSessionConfig;
    public final /* synthetic */ UserJid $senderJid;
    public final /* synthetic */ boolean $startQplLoggingForPslPerfTracker;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixFlowsManagerWithCoroutines$fetchEntrypointScreen$1(PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, UserJid userJid, C193199ph r4, String str, String str2, C30391dr r7, boolean z) {
        super(2, r7);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
        this.$phoenixSessionConfig = r4;
        this.$flowId = str;
        this.$startQplLoggingForPslPerfTracker = z;
        this.$messageId = str2;
        this.$senderJid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.this$0;
        C193199ph r3 = this.$phoenixSessionConfig;
        String str = this.$flowId;
        boolean z = this.$startQplLoggingForPslPerfTracker;
        return new PhoenixFlowsManagerWithCoroutines$fetchEntrypointScreen$1(phoenixFlowsManagerWithCoroutines, this.$senderJid, r3, str, this.$messageId, r10, z);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines;
        String str2;
        Object obj2 = obj;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj2);
            PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines2 = this.this$0;
            phoenixFlowsManagerWithCoroutines2.A01 = phoenixFlowsManagerWithCoroutines2.A02.A00(this.$phoenixSessionConfig);
            str = this.$flowId;
            if (str != null) {
                boolean z = this.$startQplLoggingForPslPerfTracker;
                phoenixFlowsManagerWithCoroutines = this.this$0;
                String str3 = this.$messageId;
                C193199ph r1 = this.$phoenixSessionConfig;
                UserJid userJid = this.$senderJid;
                if (z) {
                    C172038sg r8 = (C172038sg) phoenixFlowsManagerWithCoroutines.A0K.get();
                    int hashCode = str.hashCode();
                    Integer num = AnonymousClass00R.A01;
                    if (r1 != null) {
                        str2 = r1.A00;
                    } else {
                        str2 = null;
                    }
                    r8.A0F(userJid, false, num, str, str3, str2, hashCode);
                }
                int hashCode2 = str.hashCode();
                this.L$0 = phoenixFlowsManagerWithCoroutines;
                this.L$1 = str;
                this.label = 1;
                obj2 = ((C192239o2) phoenixFlowsManagerWithCoroutines.A0F.get()).A01(str, this, hashCode2);
                if (obj2 == r5) {
                    return r5;
                }
            }
            return C27621Wu.A00;
        } else if (i == 1) {
            str = (String) this.L$1;
            phoenixFlowsManagerWithCoroutines = (PhoenixFlowsManagerWithCoroutines) this.L$0;
            C30691eM.A01(obj2);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass1D6 r12 = (AnonymousClass1D6) obj2;
        boolean A1Y = AnonymousClass000.A1Y(r12.first);
        String str4 = (String) r12.second;
        AnonymousClass8BR.A0V(phoenixFlowsManagerWithCoroutines.A0K).A08(str.hashCode(), (short) AnonymousClass8BU.A01(A1Y ? 1 : 0));
        if (A1Y) {
            C20130A8q a8q = phoenixFlowsManagerWithCoroutines.A01;
            if (a8q == null) {
                C18070vi.A11("fdsManager");
                throw null;
            } else if (str4 != null) {
                a8q.A0E(str, str4);
            } else {
                throw C17890vO.A0K();
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhoenixFlowsManagerWithCoroutines$fetchEntrypointScreen$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
