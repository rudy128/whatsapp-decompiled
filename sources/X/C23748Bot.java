package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Bot  reason: case insensitive filesystem */
public class C23748Bot extends C26973DNv {
    public List A00;
    public final Integer A01;

    public C23748Bot(C26973DNv dNv, Integer num) {
        ArrayList A13 = AnonymousClass000.A13();
        this.A00 = A13;
        A13.add(dNv);
        A13.add((Object) null);
        this.A01 = num;
    }

    public boolean BCK(C24957CRh cRh) {
        Integer num = this.A01;
        if (num == AnonymousClass00R.A0C) {
            for (C26973DNv BCK : this.A00) {
                if (BCK.BCK(cRh)) {
                }
            }
            return false;
        }
        Integer num2 = AnonymousClass00R.A00;
        List<C26973DNv> list = this.A00;
        if (num != num2) {
            return !((C26973DNv) list.get(0)).BCK(cRh);
        }
        for (C26973DNv BCK2 : list) {
            if (!BCK2.BCK(cRh)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        StringBuilder A0y = AnonymousClass8BT.A0y("(", A10);
        A0y.append(" ");
        switch (this.A01.intValue()) {
            case 0:
                str = "&&";
                break;
            case 1:
                str = "!";
                break;
            default:
                str = "||";
                break;
        }
        A10.append(C25888Cnz.A00(this.A00, AnonymousClass001.A1H(str, " ", A0y), ""));
        return AnonymousClass8BU.A0q(A10);
    }

    public C23748Bot(Integer num, Collection collection) {
        ArrayList A13 = AnonymousClass000.A13();
        this.A00 = A13;
        A13.addAll(collection);
        this.A01 = num;
    }
}
