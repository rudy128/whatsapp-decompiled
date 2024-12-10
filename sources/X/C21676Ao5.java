package X;

import android.app.Activity;
import com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler", f = "PasskeyBackupEnabler.kt", i = {0, 0, 1}, l = {208, 218}, m = "deriveForRestoreWithExistingPasskey", n = {"this", "credentialId", "credentialId"}, s = {"L$0", "L$1", "L$0"})
/* renamed from: X.Ao5  reason: case insensitive filesystem */
public final class C21676Ao5 extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyBackupEnabler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21676Ao5(PasskeyBackupEnabler passkeyBackupEnabler, C30391dr r2) {
        super(r2);
        this.this$0 = passkeyBackupEnabler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((Activity) null, (C193139pb) null, this);
    }
}
