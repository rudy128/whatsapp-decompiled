package com.whatsapp.data;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C29691ci;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C49502Qs;
import X.C55282fW;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.ChatOriginManager$updateChatOrigin$2", f = "ChatOriginManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatOriginManager$updateChatOrigin$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C29691ci $chatInfo;
    public final /* synthetic */ C49502Qs $chatOrigin;
    public int label;
    public final /* synthetic */ C55282fW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatOriginManager$updateChatOrigin$2(C29691ci r2, C49502Qs r3, C55282fW r4, C30391dr r5) {
        super(2, r5);
        this.$chatInfo = r2;
        this.$chatOrigin = r3;
        this.this$0 = r4;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ChatOriginManager$updateChatOrigin$2(this.$chatInfo, this.$chatOrigin, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C29691ci r2 = this.$chatInfo;
            C49502Qs r1 = this.$chatOrigin;
            if (r2.A0b == null) {
                r2.A0b = r1;
            }
            return new Integer(this.this$0.A00.A06(r2));
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatOriginManager$updateChatOrigin$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
