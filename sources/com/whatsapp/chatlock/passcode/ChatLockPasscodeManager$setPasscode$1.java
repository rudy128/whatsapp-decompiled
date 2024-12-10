package com.whatsapp.chatlock.passcode;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$1", f = "ChatLockPasscodeManager.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$setPasscode$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $callback;
    public final /* synthetic */ String $firstPasscode;
    public int label;
    public final /* synthetic */ ChatLockPasscodeManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$setPasscode$1(ChatLockPasscodeManager chatLockPasscodeManager, String str, C30391dr r4, C22821Di r5) {
        super(2, r4);
        this.this$0 = chatLockPasscodeManager;
        this.$firstPasscode = str;
        this.$callback = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ChatLockPasscodeManager$setPasscode$1(this.this$0, this.$firstPasscode, r6, this.$callback);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ChatLockPasscodeManager chatLockPasscodeManager = this.this$0;
            String str = this.$firstPasscode;
            this.label = 1;
            obj = C30451dy.A00(this, chatLockPasscodeManager.A05, new ChatLockPasscodeManager$setPasscode$3(chatLockPasscodeManager, str, (C30391dr) null, true));
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.$callback.invoke(obj);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatLockPasscodeManager$setPasscode$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
