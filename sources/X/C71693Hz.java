package X;

import com.whatsapp.accountswitching.AccountSwitchingContentProvider;
import com.whatsapp.util.Log;

/* renamed from: X.3Hz  reason: invalid class name and case insensitive filesystem */
public final class C71693Hz extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C62562rb $migrateAccount;
    public final /* synthetic */ String $newDirId;
    public final /* synthetic */ AccountSwitchingContentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71693Hz(AccountSwitchingContentProvider accountSwitchingContentProvider, C62562rb r3, String str) {
        super(0);
        this.this$0 = accountSwitchingContentProvider;
        this.$migrateAccount = r3;
        this.$newDirId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Log.i("AccountSwitchingContentProvider/call/remove account action/migrating accountSwitchingDataRepo");
        AnonymousClass11G.A0J(this.this$0).A0J(C18070vi.A0M(C62562rb.A00(this.$migrateAccount, this.$newDirId, (String) null, (String) null, (String) null, 0, 0, 2046, 0, 0, false)));
        Log.i("AccountSwitchingContentProvider/call/remove account action/migrated accountSwitchingDataRepo");
        return C27621Wu.A00;
    }
}
