package X;

import com.whatsapp.accountswitching.AccountSwitchingContentProvider;
import com.whatsapp.util.Log;

/* renamed from: X.3Hu  reason: invalid class name and case insensitive filesystem */
public final class C71643Hu extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C62562rb $currentAccount;
    public final /* synthetic */ String $newDirId;
    public final /* synthetic */ AccountSwitchingContentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71643Hu(AccountSwitchingContentProvider accountSwitchingContentProvider, C62562rb r3, String str) {
        super(0);
        this.this$0 = accountSwitchingContentProvider;
        this.$newDirId = str;
        this.$currentAccount = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        if (AnonymousClass11G.A0J(this.this$0).A0K()) {
            Log.i("AccountSwitchingContentProvider/call/add new account action/using migrated storage");
            AnonymousClass11G.A0J(this.this$0).A0G(new C62562rb(this.$newDirId, "", "", "", 0, 0, 0, 0, 0, true, true));
        } else {
            Log.i("AccountSwitchingContentProvider/call/add new account action/starting migration process");
            C64012u4 A0J = AnonymousClass11G.A0J(this.this$0);
            C62562rb[] r2 = new C62562rb[2];
            r2[0] = this.$currentAccount;
            A0J.A0J(C18070vi.A0O(new C62562rb(this.$newDirId, "", "", "", 0, 0, 0, 0, 0, true, true), r2, 1));
        }
        AnonymousClass11G.A0J(this.this$0).A0H(this.$newDirId);
        return C27621Wu.A00;
    }
}
