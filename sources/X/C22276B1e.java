package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.B1e  reason: case insensitive filesystem */
public final class C22276B1e extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass6RX $entryPointType;
    public final /* synthetic */ UserJid $jid;
    public final /* synthetic */ Integer $source;
    public final /* synthetic */ C20035A4e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22276B1e(C20035A4e a4e, AnonymousClass6RX r3, UserJid userJid, Integer num) {
        super(1);
        this.this$0 = a4e;
        this.$jid = userJid;
        this.$entryPointType = r3;
        this.$source = num;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1193567u A0S = C108955ca.A0S(obj);
        C20035A4e a4e = this.this$0;
        UserJid userJid = this.$jid;
        AnonymousClass6RX r2 = this.$entryPointType;
        Integer num = this.$source;
        A0S.A00 = new C22274B1c(a4e, r2, userJid, num);
        A0S.A01 = new C22275B1d(a4e, r2, userJid, num);
        return C27621Wu.A00;
    }
}
