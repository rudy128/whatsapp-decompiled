package com.whatsapp.chatlock.passcode;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C165328ax;
import X.C23624Bmt;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C59992nD;
import X.C83084Dt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$markPasscodeWithBrokenEncoding$1", f = "ChatLockPasscodeManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$markPasscodeWithBrokenEncoding$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ChatLockPasscodeManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$markPasscodeWithBrokenEncoding$1(ChatLockPasscodeManager chatLockPasscodeManager, C30391dr r3) {
        super(2, r3);
        this.this$0 = chatLockPasscodeManager;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ChatLockPasscodeManager$markPasscodeWithBrokenEncoding$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ChatLockPasscodeManager$markPasscodeWithBrokenEncoding$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C165328ax A00 = this.this$0.A03.A00();
            if (A00 != null) {
                ChatLockPasscodeManager chatLockPasscodeManager = this.this$0;
                C59992nD r4 = chatLockPasscodeManager.A03;
                C23624Bmt A0O = A00.A0O();
                C83084Dt r2 = C83084Dt.UTF8_BROKEN;
                A0O.A0E();
                C165328ax r1 = (C165328ax) A0O.A00;
                int i = C165328ax.ENCODING_FIELD_NUMBER;
                r1.encoding_ = r2.value;
                r1.bitField0_ |= 1;
                r4.A03((C165328ax) A0O.A0C());
                chatLockPasscodeManager.A04.A00();
                chatLockPasscodeManager.A02.A01();
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
