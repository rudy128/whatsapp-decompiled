package com.whatsapp.companiondevice.hosteddevicepairing;

import X.AnonymousClass1IX;
import X.AnonymousClass1OS;
import X.BCS;
import X.C179319Hm;
import X.C198589ya;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companiondevice.hosteddevicepairing.HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1", f = "HostedDeviceAccountEncryptionTypeTransitionController.kt", i = {0, 0}, l = {67}, m = "invokeSuspend", n = {"task", "hasTaskFailure"}, s = {"L$1", "I$0"})
public final class HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $accountTransitionCallback;
    public final /* synthetic */ BCS $deviceRegistrationLogger;
    public final /* synthetic */ C198589ya $deviceUnpairingLogger;
    public final /* synthetic */ C179319Hm $encryptionTypeTransition;
    public final /* synthetic */ AnonymousClass1IX $tasks;
    public final /* synthetic */ String $transitionReason;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1(AnonymousClass1IX r2, C198589ya r3, C179319Hm r4, BCS bcs, String str, C30391dr r7, AnonymousClass1OS r8) {
        super(2, r7);
        this.$tasks = r2;
        this.$encryptionTypeTransition = r4;
        this.$transitionReason = str;
        this.$deviceRegistrationLogger = bcs;
        this.$deviceUnpairingLogger = r3;
        this.$accountTransitionCallback = r8;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        AnonymousClass1IX r1 = this.$tasks;
        C179319Hm r3 = this.$encryptionTypeTransition;
        String str = this.$transitionReason;
        return new HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1(r1, this.$deviceUnpairingLogger, r3, this.$deviceRegistrationLogger, str, r10, this.$accountTransitionCallback);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            java.lang.String r2 = " for "
            r3 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 != r3) goto L_0x009e
            int r4 = r11.I$0
            java.lang.Object r1 = r11.L$0
            X.1IZ r1 = (X.AnonymousClass1IZ) r1
            X.C30691eM.A01(r12)
        L_0x0014:
            X.9ar r12 = (X.C184379ar) r12
            boolean r0 = r12.A01
            if (r0 != 0) goto L_0x0058
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r0 = "HostedDeviceAccountEncryptionTransitionController/error: "
            r4.append(r0)
            X.9I9 r3 = r12.A00
            r4.append(r3)
            java.lang.String r1 = ": "
            r4.append(r1)
            java.lang.String r0 = ""
            r4.append(r0)
            r4.append(r1)
            X.9Hm r0 = r11.$encryptionTypeTransition
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r11.$transitionReason
            X.C17890vO.A1A(r4, r0)
            X.1OS r1 = r11.$accountTransitionCallback
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            r1.invoke(r0, r3)
        L_0x004b:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x004e:
            X.C30691eM.A01(r12)
            X.1IX r0 = r11.$tasks
            X.1IZ r1 = r0.iterator()
            r4 = 0
        L_0x0058:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007b
            java.lang.Object r6 = r1.next()
            X.B7u r6 = (X.C22438B7u) r6
            X.9Hm r8 = r11.$encryptionTypeTransition
            java.lang.String r10 = r11.$transitionReason
            X.BCS r9 = r11.$deviceRegistrationLogger
            X.9ya r7 = r11.$deviceUnpairingLogger
            r11.L$0 = r1
            r11.L$1 = r6
            r11.I$0 = r4
            r11.label = r3
            java.lang.Object r12 = r6.CGG(r7, r8, r9, r10, r11)
            if (r12 != r5) goto L_0x0014
            return r5
        L_0x007b:
            if (r4 != 0) goto L_0x004b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "HostedDeviceAccountEncryptionTransitionController/transition successful to "
            r1.append(r0)
            X.9Hm r0 = r11.$encryptionTypeTransition
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r11.$transitionReason
            X.C17890vO.A1A(r1, r0)
            X.1OS r2 = r11.$accountTransitionCallback
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0 = 0
            r2.invoke(r1, r0)
            goto L_0x004b
        L_0x009e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.hosteddevicepairing.HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
