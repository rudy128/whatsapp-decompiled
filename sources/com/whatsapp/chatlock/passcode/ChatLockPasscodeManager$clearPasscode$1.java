package com.whatsapp.chatlock.passcode;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18600wl;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$clearPasscode$1", f = "ChatLockPasscodeManager.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$clearPasscode$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $isSuccessCallback;
    public int label;
    public final /* synthetic */ ChatLockPasscodeManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$clearPasscode$1(ChatLockPasscodeManager chatLockPasscodeManager, C30391dr r3, C22821Di r4) {
        super(2, r3);
        this.this$0 = chatLockPasscodeManager;
        this.$isSuccessCallback = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ChatLockPasscodeManager$clearPasscode$1(this.this$0, r5, this.$isSuccessCallback);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ChatLockPasscodeManager chatLockPasscodeManager = this.this$0;
            C18600wl r2 = chatLockPasscodeManager.A05;
            ChatLockPasscodeManager$clearPasscode$1$result$1 chatLockPasscodeManager$clearPasscode$1$result$1 = new ChatLockPasscodeManager$clearPasscode$1$result$1(chatLockPasscodeManager, (C30391dr) null);
            this.label = 1;
            obj = C30451dy.A00(this, r2, chatLockPasscodeManager$clearPasscode$1$result$1);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.$isSuccessCallback.invoke(obj);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatLockPasscodeManager$clearPasscode$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
