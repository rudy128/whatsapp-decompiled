package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.payments.ui.widget.PaymentView;
import java.util.ArrayList;

public class A9Y implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public A9Y(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                C1418377d r2 = (C1418377d) this.A02;
                Integer num = (Integer) this.A03;
                AQ4 aq4 = ((PaymentView) this.A01).A0m;
                if (aq4 != null) {
                    aq4.A00(r2, num);
                    return;
                }
                return;
            case 1:
                Intent A07 = AnonymousClass3MY.A07((Uri) this.A03);
                ((C197979xa) this.A01).A00.A08((Context) this.A02, A07);
                return;
            default:
                AnonymousClass86X r3 = (AnonymousClass86X) this.A01;
                Object obj = this.A02;
                AnonymousClass86V r0 = (AnonymousClass86V) this.A03;
                if (r3 != null) {
                    ArrayList A0s = C108965cb.A0s(obj);
                    C23736Boh boh = (C23736Boh) ((C20517AOc) r0).A01;
                    A0s.add(boh.A00);
                    E8A BM3 = r3.BM3();
                    C20046A4p a4p = new C20046A4p();
                    for (int i2 = 0; i2 < A0s.size(); i2++) {
                        a4p.A03(A0s.get(i2), i2);
                    }
                    new C25974Cph(boh).A02(new C199029zJ(a4p.A00), BM3);
                }
                dialogInterface.dismiss();
                return;
        }
    }
}
