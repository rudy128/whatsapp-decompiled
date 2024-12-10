package com.whatsapp.search.chatlock;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6FF;
import X.C18070vi;
import X.C24887COf;
import X.C25021CTx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C34141jz;
import X.C76923oo;
import X.C98494rF;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$validatePasscode$3;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.search.chatlock.ChatLockSearchManager$tryUnlockLockedChats$1", f = "ChatLockSearchManager.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockSearchManager$tryUnlockLockedChats$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C24887COf $cancellableInput;
    public final /* synthetic */ C34141jz $query;
    public final /* synthetic */ C98494rF $result;
    public int label;
    public final /* synthetic */ C25021CTx this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockSearchManager$tryUnlockLockedChats$1(C34141jz r2, C25021CTx cTx, C24887COf cOf, C30391dr r5, C98494rF r6) {
        super(2, r5);
        this.this$0 = cTx;
        this.$query = r2;
        this.$cancellableInput = cOf;
        this.$result = r6;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new ChatLockSearchManager$tryUnlockLockedChats$1(this.$query, this.this$0, this.$cancellableInput, r8, this.$result);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ChatLockPasscodeManager chatLockPasscodeManager = (ChatLockPasscodeManager) this.this$0.A04.get();
            String A02 = this.$query.A02();
            C18070vi.A0X(A02);
            this.label = 1;
            obj = C30451dy.A00(this, chatLockPasscodeManager.A05, new ChatLockPasscodeManager$validatePasscode$3(chatLockPasscodeManager, A02, (C30391dr) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (C18070vi.A18(obj, C76923oo.A00)) {
            this.$cancellableInput.A00.A02();
            this.$result.element = new AnonymousClass6FF(this.this$0.A05);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatLockSearchManager$tryUnlockLockedChats$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
