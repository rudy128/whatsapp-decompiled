package X;

import com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment;

/* renamed from: X.5Qa  reason: invalid class name and case insensitive filesystem */
public final class C104925Qa extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ EncryptionKeyInputFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104925Qa(EncryptionKeyInputFragment encryptionKeyInputFragment) {
        super(1);
        this.this$0 = encryptionKeyInputFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        EncryptionKeyInputFragment encryptionKeyInputFragment = this.this$0;
        boolean z = false;
        if (str != null && str.length() == 64) {
            z = true;
        }
        EncryptionKeyInputFragment.A00(encryptionKeyInputFragment, z);
        return C27621Wu.A00;
    }
}
