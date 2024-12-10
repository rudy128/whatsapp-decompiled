package X;

import com.whatsapp.payments.PaymentConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9BT  reason: invalid class name */
public abstract class AnonymousClass9BT extends A34 {
    public final C22442B7y A00;
    public final AnonymousClass1KH A01;
    public final PaymentConfiguration A02;
    public final AnonymousClass10I A03;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C184439ax r3 = (C184439ax) obj;
        C22442B7y b7y = this.A00;
        if (b7y != null && r3.A01) {
            b7y.BlH(r3.A00);
        }
    }

    public AnonymousClass9BT(C22442B7y b7y, AnonymousClass1KH r2, PaymentConfiguration paymentConfiguration, AnonymousClass10I r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = paymentConfiguration;
        this.A00 = b7y;
    }

    public C184439ax A0J(String str, List list) {
        BD1 A002;
        ArrayList A14 = AnonymousClass000.A14(list);
        HashMap A11 = C17880vN.A11();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C20284AEs A0P = AnonymousClass8BR.A0P(it);
            C22499BAg bAg = null;
            C57312is A003 = this.A02.A00(A0P.A07.A03);
            if (!(A003 == null || (A002 = A003.A00((String) null)) == null || (bAg = A002.BPZ()) == null)) {
                bAg.BCx(A0P);
            }
            A14.add(A0P);
            if (bAg != null && !A11.containsKey(A0P.A07.A03)) {
                A11.put(A0P.A07.A03, bAg);
            }
        }
        AnonymousClass1KH r4 = this.A01;
        boolean A0M = r4.A0M(A14);
        ArrayList A0g = C108975cc.A0g(A14);
        if (A0M && A14.size() > 0) {
            Iterator A0j = C17890vO.A0j(A11);
            while (A0j.hasNext()) {
                ((C22499BAg) A0j.next()).BBx(str, A14);
            }
            Iterator it2 = A14.iterator();
            while (it2.hasNext()) {
                C20284AEs A0P2 = AnonymousClass8BR.A0P(it2);
                C20284AEs A08 = r4.A08(A0P2.A0A);
                if (A08 != null) {
                    A0g.add(A08);
                    byte[] bArr = A08.A0D;
                    if (bArr == null || bArr.length <= 0) {
                        this.A03.CGF(new C70833Cr((Object) this, (Object) A11, (Object) A0P2, (Object) A08, 28));
                    }
                }
            }
        }
        return new C184439ax(A0g, A0M);
    }
}
