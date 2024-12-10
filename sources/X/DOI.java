package X;

import java.util.Iterator;
import java.util.List;

public abstract class DOI implements E6L {
    public void A00(Number number) {
        if (this instanceof C23762Bp7) {
            C23762Bp7 bp7 = (C23762Bp7) this;
            bp7.A00 = Double.valueOf(bp7.A00.doubleValue() + number.doubleValue());
        } else if (this instanceof C23764Bp9) {
            C23764Bp9 bp9 = (C23764Bp9) this;
            bp9.A01 = Double.valueOf(bp9.A01.doubleValue() + number.doubleValue());
            bp9.A02 = Double.valueOf(bp9.A02.doubleValue() + (number.doubleValue() * number.doubleValue()));
            bp9.A00 = Double.valueOf(bp9.A00.doubleValue() + 1.0d);
        } else if (this instanceof C23761Bp6) {
            C23761Bp6 bp6 = (C23761Bp6) this;
            if (bp6.A00.doubleValue() > number.doubleValue()) {
                bp6.A00 = Double.valueOf(number.doubleValue());
            }
        } else if (this instanceof C23760Bp5) {
            C23760Bp5 bp5 = (C23760Bp5) this;
            if (bp5.A00.doubleValue() < number.doubleValue()) {
                bp5.A00 = Double.valueOf(number.doubleValue());
            }
        } else {
            C23763Bp8 bp8 = (C23763Bp8) this;
            bp8.A00 = Double.valueOf(bp8.A00.doubleValue() + 1.0d);
            bp8.A01 = Double.valueOf(bp8.A01.doubleValue() + number.doubleValue());
        }
    }

    public Object Bdr(C25812CmP cmP, Object obj, List list) {
        EBZ ebz = cmP.A01.A00;
        int i = 0;
        if (obj instanceof List) {
            for (Object next : ebz.CPI(obj)) {
                if (next instanceof Number) {
                    i++;
                    A00((Number) next);
                }
            }
        }
        if (list != null) {
            Iterator it = C25584CiO.A00(cmP, Number.class, list).iterator();
            while (it.hasNext()) {
                i++;
                A00((Number) it.next());
            }
        }
        if (i != 0) {
            if (this instanceof C23762Bp7) {
                return ((C23762Bp7) this).A00;
            }
            if (this instanceof C23764Bp9) {
                C23764Bp9 bp9 = (C23764Bp9) this;
                double doubleValue = bp9.A02.doubleValue();
                double doubleValue2 = bp9.A00.doubleValue();
                double doubleValue3 = bp9.A01.doubleValue();
                return Double.valueOf(Math.sqrt((doubleValue / doubleValue2) - (((doubleValue3 * doubleValue3) / doubleValue2) / doubleValue2)));
            } else if (this instanceof C23761Bp6) {
                return ((C23761Bp6) this).A00;
            } else {
                if (this instanceof C23760Bp5) {
                    return ((C23760Bp5) this).A00;
                }
                C23763Bp8 bp8 = (C23763Bp8) this;
                double doubleValue4 = bp8.A00.doubleValue();
                if (doubleValue4 != 0.0d) {
                    return Double.valueOf(bp8.A01.doubleValue() / doubleValue4);
                }
                return Double.valueOf(0.0d);
            }
        } else {
            throw new C27232DaC("Aggregation function attempted to calculate value using empty array");
        }
    }
}
