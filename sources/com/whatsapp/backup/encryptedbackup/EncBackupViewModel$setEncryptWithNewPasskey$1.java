package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass9MT;
import X.C175338yY;
import X.C175348yZ;
import X.C179379Hs;
import X.C193399q2;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import android.app.Activity;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.backup.encryptedbackup.EncBackupViewModel$setEncryptWithNewPasskey$1", f = "EncBackupViewModel.kt", i = {}, l = {214}, m = "invokeSuspend", n = {}, s = {})
public final class EncBackupViewModel$setEncryptWithNewPasskey$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Activity $activity;
    public int label;
    public final /* synthetic */ EncBackupViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EncBackupViewModel$setEncryptWithNewPasskey$1(Activity activity, EncBackupViewModel encBackupViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = encBackupViewModel;
        this.$activity = activity;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new EncBackupViewModel$setEncryptWithNewPasskey$1(this.$activity, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            PasskeyBackupEnabler passkeyBackupEnabler = this.this$0.A0G;
            Activity activity = this.$activity;
            this.label = 1;
            obj = passkeyBackupEnabler.A02(activity, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass9MT r5 = (AnonymousClass9MT) obj;
        EncBackupViewModel encBackupViewModel = this.this$0;
        if (r5 instanceof C175348yZ) {
            encBackupViewModel.A02.A0F(C179379Hs.PASSKEY);
            encBackupViewModel.A00 = (C193399q2) ((C175348yZ) r5).A00;
            this.this$0.A0a(500);
            Log.i("encb/EncBackupViewModel//setEncryptWithNewPasskey: Passkey-encrypted backups enabled");
            AnonymousClass1DT r2 = this.this$0.A0C;
            C27621Wu r1 = C27621Wu.A00;
            r2.A0E(new C175348yZ(r1));
            return r1;
        } else if (r5 instanceof C175338yY) {
            encBackupViewModel.A0C.A0E(new C175338yY(((C175338yY) r5).A00));
            return C27621Wu.A00;
        } else {
            throw AnonymousClass3MW.A14();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EncBackupViewModel$setEncryptWithNewPasskey$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
