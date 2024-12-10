package X;

import com.whatsapp.updates.ui.UpdatesFragment;

/* renamed from: X.7vc  reason: invalid class name and case insensitive filesystem */
public final class C156987vc extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass88H $statusAdapterFactory;
    public final /* synthetic */ C112365lM this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156987vc(C112365lM r2, AnonymousClass88H r3) {
        super(0);
        this.this$0 = r2;
        this.$statusAdapterFactory = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C140066zt r0;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UpdatesAdapter/creating status adapter hasNewsletters = ");
        C17900vP.A0r(A10, C112365lM.A0D(this.this$0));
        AnonymousClass88H r3 = this.$statusAdapterFactory;
        C37451pZ A03 = C112365lM.A03(this.this$0);
        C112365lM r02 = this.this$0;
        UpdatesFragment updatesFragment = r02.A0Z;
        if (C112365lM.A0E(r02)) {
            r0 = C112365lM.A04(this.this$0);
        } else {
            r0 = null;
        }
        return r3.BH5(A03, r0, updatesFragment);
    }
}
