package X;

import java.util.List;

public final class D8I implements E9O {
    public final E9O A00;
    public final List A01;

    public C25152Ca3 BNX() {
        C25152Ca3 BNX;
        String str;
        E9O e9o = this.A00;
        if (e9o == null || (BNX = e9o.BNX()) == null) {
            return null;
        }
        String Bao = Bao();
        if (Bao == null || Bao.length() == 0) {
            str = BNX.A01;
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(BNX.A01);
            str = C17890vO.A0Z(Bao, A10, ':');
        }
        return new C25152Ca3(BNX.A00, str);
    }

    public String BUC() {
        E9O e9o = this.A00;
        if (e9o != null) {
            return e9o.BUC();
        }
        return null;
    }

    public E9O BW9() {
        return this.A00;
    }

    public String Bao() {
        List list = this.A01;
        if (list != null) {
            return C108995ce.A0X(":", list);
        }
        return null;
    }

    public E9O Bie(E9O e9o) {
        return new D8I(e9o, this.A01);
    }

    public D8I(E9O e9o, List list) {
        this.A00 = e9o;
        this.A01 = list;
    }
}
