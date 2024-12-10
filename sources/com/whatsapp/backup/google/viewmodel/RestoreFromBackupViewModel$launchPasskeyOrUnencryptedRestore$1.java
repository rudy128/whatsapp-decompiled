package com.whatsapp.backup.google.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C179389Ht;
import X.C19986A1x;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import android.app.Activity;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel$launchPasskeyOrUnencryptedRestore$1", f = "RestoreFromBackupViewModel.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
public final class RestoreFromBackupViewModel$launchPasskeyOrUnencryptedRestore$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C19986A1x $passkeyEncryptionMetadata;
    public final /* synthetic */ C179389Ht $restoreTrigger;
    public int label;
    public final /* synthetic */ RestoreFromBackupViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RestoreFromBackupViewModel$launchPasskeyOrUnencryptedRestore$1(Activity activity, C19986A1x a1x, RestoreFromBackupViewModel restoreFromBackupViewModel, C179389Ht r5, C30391dr r6) {
        super(2, r6);
        this.this$0 = restoreFromBackupViewModel;
        this.$activity = activity;
        this.$passkeyEncryptionMetadata = a1x;
        this.$restoreTrigger = r5;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new RestoreFromBackupViewModel$launchPasskeyOrUnencryptedRestore$1(this.$activity, this.$passkeyEncryptionMetadata, this.this$0, this.$restoreTrigger, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            RestoreFromBackupViewModel restoreFromBackupViewModel = this.this$0;
            Activity activity = this.$activity;
            C19986A1x a1x = this.$passkeyEncryptionMetadata;
            C179389Ht r0 = this.$restoreTrigger;
            this.label = 1;
            if (RestoreFromBackupViewModel.A00(activity, a1x, restoreFromBackupViewModel, r0, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RestoreFromBackupViewModel$launchPasskeyOrUnencryptedRestore$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
