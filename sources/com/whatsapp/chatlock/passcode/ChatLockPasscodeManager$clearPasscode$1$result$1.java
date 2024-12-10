package com.whatsapp.chatlock.passcode;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C17900vP;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$clearPasscode$1$result$1", f = "ChatLockPasscodeManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$clearPasscode$1$result$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ChatLockPasscodeManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$clearPasscode$1$result$1(ChatLockPasscodeManager chatLockPasscodeManager, C30391dr r3) {
        super(2, r3);
        this.this$0 = chatLockPasscodeManager;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ChatLockPasscodeManager$clearPasscode$1$result$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ChatLockPasscodeManager$clearPasscode$1$result$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            try {
                boolean A02 = this.this$0.A03.A02();
                this.this$0.A04.A00();
                return Boolean.valueOf(A02);
            } catch (Exception e) {
                Log.e(C17900vP.A0C("ChatLockPasscodeManager/clearPasscode: ", AnonymousClass000.A10(), e), e.getCause());
                return AnonymousClass000.A0h();
            }
        } else {
            throw AnonymousClass000.A0l();
        }
    }
}
