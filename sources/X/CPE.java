package X;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

public abstract class CPE {
    public final D48 A00;
    public final List A01;
    public final C25200Car A02;

    public CPE(D48 d48, CPF cpf, List list) {
        C25200Car car;
        int i;
        String[] strArr;
        Locale locale;
        String str;
        Object[] objArr;
        long j;
        CPF cpf2 = cpf;
        this.A00 = d48;
        this.A01 = Collections.unmodifiableList(list);
        boolean z = cpf2 instanceof BP4;
        BP4 bp4 = cpf2;
        if (z) {
            BP4 bp42 = (BP4) cpf2;
            CR9 cr9 = bp42.A01;
            bp4 = bp42;
            if (cr9 != null) {
                D48 d482 = this.A00;
                String str2 = d482.A0Q;
                int i2 = d482.A04;
                StringBuilder A10 = AnonymousClass000.A10();
                int i3 = 0;
                while (true) {
                    i = cr9.A00;
                    strArr = cr9.A03;
                    if (i3 >= i) {
                        break;
                    }
                    A10.append(strArr[i3]);
                    int i4 = cr9.A01[i3];
                    if (i4 == 1) {
                        A10.append(str2);
                    } else {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                locale = Locale.US;
                                str = cr9.A02[i3];
                                objArr = new Object[1];
                                j = Integer.valueOf(i2);
                                objArr[0] = j;
                                A10.append(String.format(locale, str, objArr));
                            } else if (i4 != 4) {
                            }
                        }
                        locale = Locale.US;
                        str = cr9.A02[i3];
                        objArr = new Object[1];
                        j = 0L;
                        objArr[0] = j;
                        A10.append(String.format(locale, str, objArr));
                    }
                    i3++;
                }
                car = new C25200Car(0, AnonymousClass000.A0y(strArr[i], A10), -1);
                this.A02 = car;
            }
        }
        car = bp4.A02;
        this.A02 = car;
    }
}
