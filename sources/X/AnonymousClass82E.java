package X;

import com.whatsapp.infra.graphql.generated.invite.CreateInviteCodeResponseImpl;

/* renamed from: X.82E  reason: invalid class name */
public final class AnonymousClass82E extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C135686sb $data;
    public final /* synthetic */ AnonymousClass1OS $handleResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82E(C135686sb r2, AnonymousClass1OS r3) {
        super(1);
        this.$data = r2;
        this.$handleResult = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        C135686sb r3 = this.$data;
        if (r3 != null) {
            r3.A01 = Integer.valueOf(C108985cd.A0I((C20125A8k) obj, CreateInviteCodeResponseImpl.Xwa2GrowthCreateInviteCode.class, "xwa2_growth_create_invite_code").A00.optInt("expiration_ts"));
        }
        this.$handleResult.invoke(C72453Mb.A0z(C108985cd.A0I((C20125A8k) obj, CreateInviteCodeResponseImpl.Xwa2GrowthCreateInviteCode.class, "xwa2_growth_create_invite_code"), "code"), this.$data);
        return C27621Wu.A00;
    }
}
