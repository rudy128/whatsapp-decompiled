package com.whatsapp.chatlock.passcode;

import X.A66;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C165328ax;
import X.C17900vP;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C76903om;
import X.C76913on;
import X.C76923oo;
import X.C83084Dt;
import X.C83104Dv;
import X.EE9;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$validatePasscode$3", f = "ChatLockPasscodeManager.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$validatePasscode$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $attempt;
    public int label;
    public final /* synthetic */ ChatLockPasscodeManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$validatePasscode$3(ChatLockPasscodeManager chatLockPasscodeManager, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = chatLockPasscodeManager;
        this.$attempt = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ChatLockPasscodeManager$validatePasscode$3(this.this$0, this.$attempt, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C83084Dt r7;
        C83104Dv r8;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            try {
                C165328ax A00 = this.this$0.A03.A00();
                if (A00 == null) {
                    return new C76903om(4);
                }
                String str = this.$attempt;
                ChatLockPasscodeManager chatLockPasscodeManager = this.this$0;
                A66 a66 = A66.A00;
                int i2 = A00.encoding_;
                if (i2 == 0) {
                    r7 = C83084Dt.UTF8;
                } else if (i2 != 1) {
                    r7 = C83084Dt.UTF8;
                } else {
                    r7 = C83084Dt.UTF8_BROKEN;
                }
                int i3 = A00.transformer_;
                if (i3 == 0) {
                    r8 = C83104Dv.NONE;
                } else if (i3 == 1) {
                    r8 = C83104Dv.PBKDF2_HMAC_SHA512;
                } else if (i3 != 2) {
                    r8 = C83104Dv.NONE;
                } else {
                    r8 = C83104Dv.PBKDF2_HMAC_SHA384;
                }
                int A02 = A00.transformedData_.A02();
                EE9 ee9 = A00.transformerArg_;
                C18070vi.A0X(ee9);
                if (!C18070vi.A18(a66.A02(r7, r8, str, ee9, A02).transformedData_, A00.transformedData_)) {
                    return C76913on.A00;
                }
                this.label = 1;
                if (ChatLockPasscodeManager.A00(chatLockPasscodeManager, A00, str, this) == r4) {
                    return r4;
                }
            } catch (Exception e) {
                Log.e(C17900vP.A0C("ChatLockPasscodeManager/validatePasscode: ", AnonymousClass000.A10(), e), e.getCause());
                return new C76903om(0);
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C76923oo.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatLockPasscodeManager$validatePasscode$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
