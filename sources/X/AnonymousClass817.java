package X;

import com.whatsapp.infra.graphql.generated.nativecontacts.ContactsBackupMutationResponseImpl;

/* renamed from: X.817  reason: invalid class name */
public final class AnonymousClass817 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass817(C22821Di r2) {
        super(1);
        this.$callback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C22821Di r1;
        boolean z;
        C18070vi.A0d(obj, 0);
        C20125A8k A09 = ((C20125A8k) obj).A09(ContactsBackupMutationResponseImpl.Xwa2ContactsBackupOptionUpdate.class, "xwa2_contacts_backup_option_update");
        if (A09 == null || !A09.A0G("success")) {
            r1 = this.$callback;
            z = false;
        } else {
            r1 = this.$callback;
            z = true;
        }
        r1.invoke(z);
        return C27621Wu.A00;
    }
}
