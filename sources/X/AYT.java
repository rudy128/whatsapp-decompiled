package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

public class AYT implements C22455B8n {
    public final int A00;
    public final Object A01;

    public AYT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bss(A7B a7b) {
        if (this.A00 != 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("init/getPaymentConfig : failed. Error code = ");
            AnonymousClass8BS.A1F("PaymentCheckoutOrderViewModel", C17880vN.A0t(A10, a7b.A00));
            AnonymousClass8Gd r0 = (AnonymousClass8Gd) this.A01;
            r0.A04.A0E(r0.A09.A00((AW0) null, (UserJid) null, new C20281AEp(AnonymousClass00R.A0C, 2131889995, 2131896261), (AnonymousClass9I2) null, (AnonymousClass21K) null, (Boolean) null, (String) null, (List) null, 0));
            return;
        }
        C21426Ajt.A00(((AnonymousClass1FU) this.A01).A05, this, 21);
    }
}
