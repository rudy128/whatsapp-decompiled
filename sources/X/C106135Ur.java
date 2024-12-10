package X;

import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;

/* renamed from: X.5Ur  reason: invalid class name and case insensitive filesystem */
public final class C106135Ur extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C106745Xa $assistedFactory;
    public final /* synthetic */ AnonymousClass1EC $groupJid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106135Ur(C106745Xa r2, AnonymousClass1EC r3) {
        super(1);
        this.$assistedFactory = r2;
        this.$groupJid = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C106745Xa r0 = this.$assistedFactory;
        AnonymousClass1EC r4 = this.$groupJid;
        AnonymousClass1K2 r1 = ((C94954lS) r0).A00;
        AnonymousClass1K1 r2 = r1.A00;
        AnonymousClass10E r12 = r1.A01;
        AnonymousClass00H A00 = C000200d.A00(r12.ABe);
        C27301Vn r3 = (C27301Vn) r12.A9A.get();
        return new AnonymousClass3Uj((AnonymousClass4JE) r2.A2Q.get(), r3, r4, (RtaXmppClient) r2.A5k.get(), A00);
    }
}
