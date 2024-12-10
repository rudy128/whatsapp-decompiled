package com.whatsapp.companiondevice.crscv2;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C164298Yh;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C36021nD;
import X.C45922Ce;
import X.C45932Cf;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager$receiveEncryptedPairingRequestNotification$1", f = "CompanionRegOverSideChannelV2Manager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CompanionRegOverSideChannelV2Manager$receiveEncryptedPairingRequestNotification$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C164298Yh $encryptedPairingRequest;
    public int label;
    public final /* synthetic */ CompanionRegOverSideChannelV2Manager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompanionRegOverSideChannelV2Manager$receiveEncryptedPairingRequestNotification$1(CompanionRegOverSideChannelV2Manager companionRegOverSideChannelV2Manager, C164298Yh r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = companionRegOverSideChannelV2Manager;
        this.$encryptedPairingRequest = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CompanionRegOverSideChannelV2Manager$receiveEncryptedPairingRequestNotification$1(this.this$0, this.$encryptedPairingRequest, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            CompanionRegOverSideChannelV2Manager companionRegOverSideChannelV2Manager = this.this$0;
            C36021nD r1 = companionRegOverSideChannelV2Manager.A00;
            if (r1 instanceof C45932Cf) {
                C45932Cf r12 = (C45932Cf) r1;
                if (r12.A02) {
                    CompanionRegOverSideChannelV2Manager.A03(companionRegOverSideChannelV2Manager, r12.A00, this.$encryptedPairingRequest);
                } else {
                    companionRegOverSideChannelV2Manager.A00 = new C45922Ce(r12.A00, this.$encryptedPairingRequest, r12.A01);
                }
            } else {
                Log.w("CompanionRegOverSideChannelV2Manager/receiveEncryptedPairingRequestNotification unexpected state");
                CompanionRegOverSideChannelV2Manager.A02(this.this$0);
                CompanionRegOverSideChannelV2Manager.A01(this.this$0);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CompanionRegOverSideChannelV2Manager$receiveEncryptedPairingRequestNotification$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
