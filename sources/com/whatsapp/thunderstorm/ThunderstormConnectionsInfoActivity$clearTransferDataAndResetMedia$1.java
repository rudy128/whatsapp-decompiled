package com.whatsapp.thunderstorm;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108965cb;
import X.C18070vi;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity$clearTransferDataAndResetMedia$1", f = "ThunderstormConnectionsInfoActivity.kt", i = {}, l = {672}, m = "invokeSuspend", n = {}, s = {})
public final class ThunderstormConnectionsInfoActivity$clearTransferDataAndResetMedia$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ThunderstormConnectionsInfoActivity this$0;

    @DebugMetadata(c = "com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity$clearTransferDataAndResetMedia$1$1", f = "ThunderstormConnectionsInfoActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity$clearTransferDataAndResetMedia$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                C108965cb.A0d(ThunderstormConnectionsInfoActivity.this).A08(ThunderstormConnectionsInfoActivity.this.A0A);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThunderstormConnectionsInfoActivity$clearTransferDataAndResetMedia$1(ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = thunderstormConnectionsInfoActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ThunderstormConnectionsInfoActivity$clearTransferDataAndResetMedia$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ThunderstormConnectionsInfoActivity$clearTransferDataAndResetMedia$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity = this.this$0;
            C18600wl r2 = thunderstormConnectionsInfoActivity.A0B;
            if (r2 != null) {
                AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, r2, r0) == r5) {
                    return r5;
                }
            } else {
                C18070vi.A11("ioDispatcher");
                throw null;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
