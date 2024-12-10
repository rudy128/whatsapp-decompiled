package X;

import com.whatsapp.accountswitching.AccountSwitchingContentProvider;
import com.whatsapp.util.Log;

/* renamed from: X.3Hx  reason: invalid class name and case insensitive filesystem */
public final class C71673Hx extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C98494rF $makeActiveLid;
    public final /* synthetic */ C98494rF $removeAccountLid;
    public final /* synthetic */ AccountSwitchingContentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71673Hx(AccountSwitchingContentProvider accountSwitchingContentProvider, C98494rF r3, C98494rF r4) {
        super(0);
        this.this$0 = accountSwitchingContentProvider;
        this.$makeActiveLid = r3;
        this.$removeAccountLid = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean A0O = AnonymousClass11G.A0J(this.this$0).A0O((String) this.$makeActiveLid.element);
        C17900vP.A0n("AccountSwitchingContentProvider/call/remove account action/dataRepoOps/success: ", AnonymousClass000.A10(), A0O);
        if (!A0O) {
            Log.i("AccountSwitchingContentProvider/call/remove account action/dataRepoOps/autocorrecting accounts file");
            C62562rb A0B = AnonymousClass11G.A0J(this.this$0).A0B();
            if (A0B != null) {
                String str = A0B.A07;
                AnonymousClass11G.A0J(this.this$0).A0O(str);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("AccountSwitchingContentProvider/call/remove account action/dataRepoOps/removing account ");
                C17890vO.A1A(A10, C60322np.A01(str));
            }
        }
        if (C18070vi.A18(this.$removeAccountLid.element, C64012u4.A01(AnonymousClass11G.A0J(this.this$0)).A01)) {
            Log.i("AccountSwitchingContentProvider/call/remove account action/removing paymentsOnboardedLid");
            AnonymousClass11G.A0J(this.this$0).A0I((String) null);
        }
        return C27621Wu.A00;
    }
}
