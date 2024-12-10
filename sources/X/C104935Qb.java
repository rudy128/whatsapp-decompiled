package X;

import com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment;

/* renamed from: X.5Qb  reason: invalid class name and case insensitive filesystem */
public final class C104935Qb extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ EncryptionKeyInputFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104935Qb(EncryptionKeyInputFragment encryptionKeyInputFragment) {
        super(1);
        this.this$0 = encryptionKeyInputFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        EncryptionKeyInputFragment encryptionKeyInputFragment = this.this$0;
        int A03 = AnonymousClass3MY.A03((Number) obj);
        if (A03 == 2) {
            EncryptionKeyInputFragment.A00(encryptionKeyInputFragment, false);
        } else if (A03 == 5) {
            String A0n = AnonymousClass3MY.A0n(encryptionKeyInputFragment, 2131889831);
            AnonymousClass1FL A1D = encryptionKeyInputFragment.A1D();
            C73203Rj A00 = AnonymousClass4a6.A00(A1D);
            A00.A0S(A0n);
            A00.A0g(A1D, (C22851Dl) null, 2131899286);
            AnonymousClass3MY.A0L(A00).show();
            AnonymousClass11C r0 = encryptionKeyInputFragment.A08;
            if (r0 != null) {
                AnonymousClass4a5.A03(r0);
                C17900vP.A0f("encb/EncryptionKeyInputFragment/Error modal shown with message: ", A0n, AnonymousClass000.A10());
                EncryptionKeyInputFragment.A00(encryptionKeyInputFragment, false);
                AnonymousClass11C r02 = encryptionKeyInputFragment.A08;
                if (r02 != null) {
                    AnonymousClass4a5.A03(r02);
                } else {
                    AnonymousClass3MW.A1N();
                    throw null;
                }
            } else {
                AnonymousClass3MW.A1N();
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
