package com.whatsapp.pininchat.expirationDialog;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C108945cZ;
import X.C111195io;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogViewModel$queryFMessageFromDatabase$1", f = "PinInChatExpirationDialogViewModel.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
public final class PinInChatExpirationDialogViewModel$queryFMessageFromDatabase$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C111195io this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PinInChatExpirationDialogViewModel$queryFMessageFromDatabase$1(C111195io r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new PinInChatExpirationDialogViewModel$queryFMessageFromDatabase$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new PinInChatExpirationDialogViewModel$queryFMessageFromDatabase$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C111195io r0 = this.this$0;
            AnonymousClass1G4 r2 = r0.A09;
            AnonymousClass206 A0s = C108945cZ.A0s(r0.A06, r0.A07);
            this.label = 1;
            if (r2.BJt(A0s, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
