package X;

import java.util.UUID;

/* renamed from: X.DhG  reason: case insensitive filesystem */
public final class C27549DhG extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BXI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27549DhG(BXI bxi) {
        super(0);
        this.this$0 = bxi;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        int i2;
        C27549DhG.super.A07();
        C26153CtL ctL = BQm.A0Q;
        if (ctL.A04().isEmpty()) {
            C24712CGy.A01.A06("sup:WiFiDirectStateDelegate", "No devices ready to connect!", (Throwable) null);
            this.this$0.A00.A0C(new C22951BWx("DEVICE_ERROR"), (Throwable) null, false);
        } else {
            C25845Cn1 cn1 = C24712CGy.A01;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Establishing WiFi Direct connection ");
            cn1.A02("sup:WiFiDirectStateDelegate", C17880vN.A0t(A10, ctL.A04().size()));
            CXV cxv = (CXV) C29431cG.A0b(ctL.A04());
            UUID fromString = UUID.fromString(cxv.A00());
            BXI bxi = this.this$0;
            CZ7 cz7 = bxi.A00.A00.A05;
            if (cz7 != null) {
                C27972Dp8 dp8 = new C27972Dp8(bxi);
                Cw1 cw1 = cz7.A04;
                cw1.A04 = dp8;
                cw1.A03 = new C27973Dp9(bxi);
            }
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Validating peak power state before connecting: ");
            Integer num = cxv.A04;
            if (num != null) {
                i = num.intValue();
            } else {
                i = cxv.A02;
            }
            cn1.A02("sup:WiFiDirectStateDelegate", C17880vN.A0t(A102, i));
            Integer num2 = cxv.A04;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = cxv.A02;
            }
            if (i2 == 10) {
                cn1.A02("sup:WiFiDirectStateDelegate", AnonymousClass001.A1E(fromString, "Calling switchLink for ", AnonymousClass000.A10()));
                C25838Cms cms = this.this$0.A00.A0J;
                if (cms != null) {
                    cms.A03("socket_connection_request");
                }
                CZ7 cz72 = this.this$0.A00.A00.A05;
                if (cz72 != null) {
                    C18070vi.A0b(fromString);
                    cz72.A01(C24337BzY.WIFI_DIRECT, fromString, new C27974DpA(this.this$0));
                }
            } else {
                this.this$0.A00.A0K.invoke(Integer.valueOf(i2));
            }
        }
        return C27621Wu.A00;
    }
}
