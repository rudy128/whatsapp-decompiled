package com.whatsapp.chatlock.passcode;

import X.A66;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C17900vP;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C76903om;
import X.C76923oo;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$3", f = "ChatLockPasscodeManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$setPasscode$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $allowSync;
    public final /* synthetic */ String $passcode;
    public int label;
    public final /* synthetic */ ChatLockPasscodeManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$setPasscode$3(ChatLockPasscodeManager chatLockPasscodeManager, String str, C30391dr r4, boolean z) {
        super(2, r4);
        this.$passcode = str;
        this.this$0 = chatLockPasscodeManager;
        this.$allowSync = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ChatLockPasscodeManager$setPasscode$3(this.this$0, this.$passcode, r6, this.$allowSync);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            try {
                A66 a66 = A66.A00;
                String str = this.$passcode;
                ChatLockPasscodeManager chatLockPasscodeManager = this.this$0;
                if (!this.this$0.A03.A03(a66.A02(chatLockPasscodeManager.A00, chatLockPasscodeManager.A01, str, AnonymousClass000.A13(), 64))) {
                    return new C76903om(2);
                }
                this.this$0.A02.A01();
                if (this.$allowSync) {
                    this.this$0.A04.A00();
                }
                return C76923oo.A00;
            } catch (Exception e) {
                Log.e(C17900vP.A0C("ChatLockPasscodeManager/setPasscode ", AnonymousClass000.A10(), e), e.getCause());
                return new C76903om(2);
            }
        } else {
            throw AnonymousClass000.A0l();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatLockPasscodeManager$setPasscode$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
