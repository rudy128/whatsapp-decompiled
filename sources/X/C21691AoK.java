package X;

import android.app.Activity;
import com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel", f = "RestoreFromBackupViewModel.kt", i = {0, 0, 0}, l = {155}, m = "launchPasskeyInput", n = {"this", "passkeyEncryptionMetadata", "restoreTrigger"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.AoK  reason: case insensitive filesystem */
public final class C21691AoK extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RestoreFromBackupViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21691AoK(RestoreFromBackupViewModel restoreFromBackupViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = restoreFromBackupViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RestoreFromBackupViewModel.A00((Activity) null, (C19986A1x) null, this.this$0, (C179389Ht) null, this);
    }
}
