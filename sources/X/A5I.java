package X;

import com.whatsapp.payments.PaymentConfiguration;
import java.util.ArrayList;
import java.util.List;

public class A5I {
    public final AnonymousClass1QR A00;
    public final AnonymousClass1KH A01;
    public final PaymentConfiguration A02;
    public final AnonymousClass10I A03;

    public static void A01(A5I a5i, C20284AEs aEs, Object obj, int i) {
        a5i.A03(new ARG(aEs, obj, i), aEs);
    }

    public C21132Af0 A02(String str) {
        C21132Af0 af0 = new C21132Af0();
        C21467AkY.A00(this.A03, this, af0, str, 27);
        return af0;
    }

    public void A05(C22442B7y b7y, List list) {
        AnonymousClass10I r4 = this.A03;
        C17890vO.A0u(new C170238ox(b7y, this.A01, this.A02, r4, list), r4);
    }

    public A5I(AnonymousClass1QR r1, AnonymousClass1KH r2, PaymentConfiguration paymentConfiguration, AnonymousClass10I r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = paymentConfiguration;
        this.A00 = r1;
    }

    public static C21132Af0 A00(AnonymousClass1QS r4) {
        A5I A012 = r4.A01();
        C21132Af0 af0 = new C21132Af0();
        A012.A03.CGF(new AnonymousClass3Bx(A012, af0, 46));
        return af0;
    }

    public void A03(C22442B7y b7y, C20284AEs aEs) {
        ArrayList A0z = AnonymousClass8BT.A0z();
        A0z.add(aEs);
        AnonymousClass10I r4 = this.A03;
        C17890vO.A0u(new C170248oy(b7y, this.A01, this.A02, r4, "p2p_context", A0z), r4);
    }

    public void A04(C22442B7y b7y, C20284AEs aEs, String str) {
        ArrayList A0z = AnonymousClass8BT.A0z();
        A0z.add(aEs);
        AnonymousClass10I r4 = this.A03;
        C17890vO.A0u(new C170248oy(b7y, this.A01, this.A02, r4, str, A0z), r4);
    }
}
