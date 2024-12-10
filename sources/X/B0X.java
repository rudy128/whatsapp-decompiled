package X;

import com.whatsapp.jid.UserJid;

public final class B0X extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ boolean $cached;
    public final /* synthetic */ C199419zy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0X(C199419zy r2, boolean z) {
        super(1);
        this.this$0 = r2;
        this.$cached = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UserJid userJid = (UserJid) obj;
        C18070vi.A0d(userJid, 0);
        C63252sl r4 = (C63252sl) this.this$0.A04.get();
        C63252sl.A01(r4, new C70823Cq(new C55062f9(userJid, (String) null, this.$cached, true), r4, 897463359, this.this$0.A00, 14));
        return C27621Wu.A00;
    }
}
