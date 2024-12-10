package X;

import com.whatsapp.accountswitching.AccountSwitchingContentProvider;
import com.whatsapp.util.Log;

/* renamed from: X.3Hv  reason: invalid class name and case insensitive filesystem */
public final class C71653Hv extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C62562rb $currentAccount;
    public final /* synthetic */ C62562rb $updatedDirIdAccount;
    public final /* synthetic */ AccountSwitchingContentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71653Hv(AccountSwitchingContentProvider accountSwitchingContentProvider, C62562rb r3, C62562rb r4) {
        super(0);
        this.this$0 = accountSwitchingContentProvider;
        this.$currentAccount = r3;
        this.$updatedDirIdAccount = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Log.i("AccountSwitchingContentProvider/call/switch account action/migrating accountSwitchingDataRepo");
        C64012u4 A0J = AnonymousClass11G.A0J(this.this$0);
        C62562rb[] r2 = new C62562rb[2];
        r2[0] = this.$currentAccount;
        A0J.A0J(C18070vi.A0O(this.$updatedDirIdAccount, r2, 1));
        Log.i("AccountSwitchingContentProvider/call/switch account action/migrated accountSwitchingDataRepo");
        return C27621Wu.A00;
    }
}
