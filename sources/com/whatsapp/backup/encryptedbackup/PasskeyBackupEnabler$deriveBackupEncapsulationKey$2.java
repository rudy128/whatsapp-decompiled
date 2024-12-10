package com.whatsapp.backup.encryptedbackup;

import X.AX0;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C193159pd;
import X.C197529wq;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler$deriveBackupEncapsulationKey$2", f = "PasskeyBackupEnabler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PasskeyBackupEnabler$deriveBackupEncapsulationKey$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AX0 $prfOutput;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasskeyBackupEnabler$deriveBackupEncapsulationKey$2(AX0 ax0, C30391dr r3) {
        super(2, r3);
        this.$prfOutput = ax0;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new PasskeyBackupEnabler$deriveBackupEncapsulationKey$2(this.$prfOutput, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new PasskeyBackupEnabler$deriveBackupEncapsulationKey$2(this.$prfOutput, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return new C193159pd(C197529wq.A00(this.$prfOutput));
        }
        throw AnonymousClass000.A0l();
    }
}
