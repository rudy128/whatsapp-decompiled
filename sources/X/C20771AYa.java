package X;

import com.whatsapp.util.Log;

/* renamed from: X.AYa  reason: case insensitive filesystem */
public class C20771AYa implements BBF {
    public final int A00;
    public final Object A01;

    public C20771AYa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C26(A7B a7b) {
        switch (this.A00) {
            case 0:
                Log.e("PAY: BrazilDeviceRegistrationAction/getPaymentProviderPublicKey iq returned null");
                ((C191889nM) this.A01).A00(A7B.A00(), (AZ2) null);
                return;
            case 1:
                Log.e("PAY: BrazilVerifyCardOTPSendAction getProviderEncryptionKeyAsync iq returned null");
                ((C195729to) this.A01).A02(A7B.A00(), (AZ2) null);
                return;
            default:
                Log.e("PAY: BrazilVerifyCardOTPSendAction/provider key iq returned null");
                C175598yy r1 = (C175598yy) this.A01;
                C175598yy.A00(r1, r1.A06);
                return;
        }
    }

    public void C27(AZ2 az2) {
        switch (this.A00) {
            case 0:
                ((C191889nM) this.A01).A00((A7B) null, az2);
                return;
            case 1:
                ((C195729to) this.A01).A02((A7B) null, az2);
                return;
            default:
                C175598yy r3 = (C175598yy) this.A01;
                C175598yy.A00(r3, r3.A02.A03((AZ0) az2.A00, r3.A06));
                return;
        }
    }
}
