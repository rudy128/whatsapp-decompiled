package com.whatsapp.companiondevice.crscv2;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C35911n2;
import X.C36021nD;
import X.C45922Ce;
import X.C45932Cf;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager$acceptVerificationCode$1", f = "CompanionRegOverSideChannelV2Manager.kt", i = {0}, l = {335}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
public final class CompanionRegOverSideChannelV2Manager$acceptVerificationCode$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ CompanionRegOverSideChannelV2Manager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompanionRegOverSideChannelV2Manager$acceptVerificationCode$1(CompanionRegOverSideChannelV2Manager companionRegOverSideChannelV2Manager, C30391dr r3) {
        super(2, r3);
        this.this$0 = companionRegOverSideChannelV2Manager;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CompanionRegOverSideChannelV2Manager$acceptVerificationCode$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CompanionRegOverSideChannelV2Manager$acceptVerificationCode$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        CompanionRegOverSideChannelV2Manager companionRegOverSideChannelV2Manager;
        C35911n2 r4;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            companionRegOverSideChannelV2Manager = this.this$0;
            r4 = companionRegOverSideChannelV2Manager.A07;
            this.L$0 = r4;
            this.L$1 = companionRegOverSideChannelV2Manager;
            this.label = 1;
            if (r4.Bhx(this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            companionRegOverSideChannelV2Manager = (CompanionRegOverSideChannelV2Manager) this.L$1;
            r4 = (C35911n2) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        try {
            C36021nD r22 = companionRegOverSideChannelV2Manager.A00;
            if (r22 instanceof C45932Cf) {
                C45932Cf r23 = (C45932Cf) r22;
                companionRegOverSideChannelV2Manager.A00 = new C45932Cf(r23.A00, r23.A01, true);
            } else if (r22 instanceof C45922Ce) {
                C45922Ce r24 = (C45922Ce) r22;
                CompanionRegOverSideChannelV2Manager.A03(companionRegOverSideChannelV2Manager, r24.A00, r24.A01);
            } else {
                Log.e("CompanionRegOverSideChannelV2Manager/acceptVerificationCode/unexpected state");
            }
            return C27621Wu.A00;
        } finally {
            r4.CQ9((Object) null);
        }
    }
}
