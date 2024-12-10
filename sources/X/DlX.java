package X;

import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;

public final class DlX extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ E4O $aleProvider;
    public final /* synthetic */ BRE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DlX(E4O e4o, BRE bre) {
        super(0);
        this.this$0 = bre;
        this.$aleProvider = e4o;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C26027Cql cql = this.this$0.A06;
        EAU eau = ((DBR) this.$aleProvider).A00;
        if (eau == null) {
            C18070vi.A11("aleBridge");
            throw null;
        }
        LiveEditingRawMemoryPointerHolder BMj = eau.BMj();
        C18070vi.A0d(BMj, 0);
        ((C24765CJf) cql.A0A.getValue()).A00.setAle(BMj);
        return C27621Wu.A00;
    }
}
