package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.7R3  reason: invalid class name */
public class AnonymousClass7R3 implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public AnonymousClass7R3(Object obj, Object obj2, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A04 = str;
        this.A01 = i;
        this.A05 = str2;
        this.A03 = obj2;
    }

    public final void run() {
        switch (this.A00) {
            case 0:
                C27291Vm r6 = (C27291Vm) this.A02;
                String str = this.A04;
                int i = this.A01;
                String str2 = this.A05;
                Integer num = (Integer) this.A03;
                C1183763f r2 = new C1183763f();
                r2.A05 = C17970vW.A05(str);
                r2.A04 = Long.valueOf(AnonymousClass11P.A01(r6.A00));
                r2.A00 = C17880vN.A0h();
                r2.A01 = Integer.valueOf(i);
                r2.A02 = C17880vN.A0i();
                if (str2 != null) {
                    r2.A06 = r6.A02.A05(str2);
                }
                r2.A03 = num;
                r6.A01.CC7(r2);
                return;
            case 1:
                int i2 = this.A01;
                String str3 = this.A04;
                String str4 = this.A05;
                AnonymousClass63H r1 = new AnonymousClass63H();
                r1.A03 = "agm";
                r1.A02 = str3;
                r1.A01 = (Long) this.A03;
                r1.A00 = Integer.valueOf(i2);
                r1.A04 = str4;
                ((C138156wc) this.A02).A00.CC7(r1);
                return;
            case 2:
                AnonymousClass6Fx r4 = (AnonymousClass6Fx) this.A02;
                String str5 = this.A04;
                int i3 = this.A01;
                ArrayList arrayList = (ArrayList) this.A03;
                String str6 = this.A05;
                if (str5 != null) {
                    r4.A06(AnonymousClass74L.A03(r4, str5, str6, arrayList), (Integer) null, i3, 242478024);
                    return;
                }
                return;
            default:
                String str7 = this.A04;
                int i4 = this.A01;
                String str8 = this.A05;
                ((AnonymousClass749) this.A03).A0C.get();
                C109005cf.A0P((Context) this.A02, str7, str8, i4);
                return;
        }
    }

    public AnonymousClass7R3(AnonymousClass1FU r2, AnonymousClass749 r3, String str, String str2, int i) {
        this.A00 = 3;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = str;
        this.A01 = i;
        this.A05 = str2;
    }
}
