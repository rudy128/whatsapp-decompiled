package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.2jh  reason: invalid class name and case insensitive filesystem */
public class C57822jh {
    public int A00 = 0;
    public final C18030ve A01;
    public final C24421Kg A02;
    public final AnonymousClass00H A03;
    public final List A04;

    public String A00() {
        int size;
        StringBuilder A10;
        String A0w;
        C88074Yf A022;
        if (this.A00 != -1) {
            AnonymousClass00H r1 = this.A03;
            if (!((C31311fM) r1.get()).A04() || (A022 = ((C31311fM) r1.get()).A02()) == null) {
                List list = this.A04;
                if (list == null) {
                    size = 0;
                } else {
                    size = list.size();
                    int i = this.A00;
                    if (i < size) {
                        A10 = AnonymousClass000.A10();
                        A10.append(C197569wu.A0S);
                        this.A00 = i + 1;
                        A0w = C17880vN.A0w(list, i);
                        A10.append(A0w);
                    }
                }
                int i2 = this.A00;
                if (i2 == size) {
                    this.A00 = i2 + 1;
                    A10 = AnonymousClass000.A10();
                    A10.append(C197569wu.A0S);
                    A0w = C197569wu.A0W;
                    A10.append(A0w);
                }
            } else {
                this.A00 = -1;
                A10 = AnonymousClass000.A10();
                A10.append(C197569wu.A0S);
                A10.append(A022.A03);
                A10.append(":");
                A10.append(A022.A01);
            }
            return AnonymousClass000.A0y(C197569wu.A0X, A10);
        }
        return null;
    }

    public C57822jh(C18030ve r5, C24421Kg r6, AnonymousClass00H r7) {
        ArrayList arrayList;
        this.A03 = r7;
        this.A02 = r6;
        this.A01 = r5;
        if (C18020vd.A05(C18040vf.A02, r5, 4020)) {
            C24421Kg.A06(r6);
            C59912n5 A0B = r6.A0B();
            if (A0B != null) {
                List<C58142kD> list = A0B.A0C;
                if (!list.isEmpty()) {
                    arrayList = AnonymousClass000.A13();
                    for (C58142kD r1 : list) {
                        Set set = r1.A0B;
                        if (set == null || !set.isEmpty()) {
                            String str = r1.A05;
                            if (str != null) {
                                arrayList.add(str);
                            }
                            String str2 = r1.A01;
                            if (str2 != null) {
                                arrayList.add(str2);
                            }
                        }
                    }
                    this.A04 = arrayList;
                }
            }
        }
        arrayList = null;
        this.A04 = arrayList;
    }
}
