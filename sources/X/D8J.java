package X;

import java.util.ArrayList;

public final class D8J implements E9O {
    public final C24948CQy A00;
    public final E9O A01;
    public final C18100vl A02 = AnonymousClass1DF.A01(new C27481DgA(this));

    public String BUC() {
        String str;
        CP0 cp0 = (CP0) this.A02.getValue();
        if (cp0 != null && (str = cp0.A00) != null) {
            return str;
        }
        E9O BW9 = this.A01.BW9();
        if (BW9 != null) {
            return BW9.BUC();
        }
        return null;
    }

    public E9O BW9() {
        return this.A01.BW9();
    }

    public String Bao() {
        return this.A01.Bao();
    }

    public E9O Bie(E9O e9o) {
        return new D8J(this.A00, this.A01.Bie(e9o));
    }

    public D8J(C24948CQy cQy, E9O e9o) {
        this.A01 = e9o;
        this.A00 = cQy;
    }

    public C25152Ca3 BNX() {
        ArrayList A13 = AnonymousClass000.A13();
        E9O e9o = this.A01;
        String Bao = e9o.Bao();
        C18100vl r3 = this.A02;
        CP0 cp0 = (CP0) r3.getValue();
        String str = null;
        if (cp0 != null) {
            A13.addAll(cp0.A02);
        }
        if (!(Bao == null || Bao.length() == 0)) {
            A13.add(Bao);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        CP0 cp02 = (CP0) r3.getValue();
        if (cp02 != null) {
            str = cp02.A01;
        }
        A10.append(str);
        A10.append('|');
        return new C25152Ca3(e9o.BW9(), AnonymousClass000.A0y(C108995ce.A0X(":", A13), A10));
    }
}
