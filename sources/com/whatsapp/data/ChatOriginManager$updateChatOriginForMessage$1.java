package com.whatsapp.data;

import X.AnonymousClass000;
import X.AnonymousClass1E2;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C29691ci;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C49502Qs;
import X.C55282fW;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.ChatOriginManager$updateChatOriginForMessage$1", f = "ChatOriginManager.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
public final class ChatOriginManager$updateChatOriginForMessage$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C49502Qs $chatOrigin;
    public final /* synthetic */ AnonymousClass1E2 $jid;
    public int label;
    public final /* synthetic */ C55282fW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatOriginManager$updateChatOriginForMessage$1(C49502Qs r2, C55282fW r3, AnonymousClass1E2 r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = r3;
        this.$jid = r4;
        this.$chatOrigin = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ChatOriginManager$updateChatOriginForMessage$1(this.$chatOrigin, this.this$0, this.$jid, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C55282fW r5 = this.this$0;
            AnonymousClass1E2 r1 = this.$jid;
            C49502Qs r4 = this.$chatOrigin;
            this.label = 1;
            C29691ci A0A = r5.A01.A0A(r1);
            if (A0A != null && C30451dy.A00(this, r5.A03, new ChatOriginManager$updateChatOrigin$2(A0A, r4, r5, (C30391dr) null)) == r6) {
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
        return ((ChatOriginManager$updateChatOriginForMessage$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
