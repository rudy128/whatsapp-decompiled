package X;

import com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler", f = "PasskeyBackupEnabler.kt", i = {}, l = {242}, m = "deriveBackupEncapsulationKey-a7jYm9w", n = {}, s = {})
/* renamed from: X.An7  reason: case insensitive filesystem */
public final class C21616An7 extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyBackupEnabler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21616An7(PasskeyBackupEnabler passkeyBackupEnabler, C30391dr r2) {
        super(r2);
        this.this$0 = passkeyBackupEnabler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A00 = PasskeyBackupEnabler.A00(this.this$0, (AX0) null, this);
        if (A00 != C31751g4.COROUTINE_SUSPENDED) {
            return new C193159pd((C193129pa) A00);
        }
        return A00;
    }
}
