package X;

import android.app.Application;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkViewModel;

public class AYS implements C22453B8l {
    public final int A00;
    public final Object A01;

    public AYS(IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel, int i) {
        this.A00 = i;
        this.A01 = indiaUpiMapperLinkViewModel;
    }

    public final void C2n(AEC aec, A7B a7b) {
        C41731wy r3;
        Object obj;
        C41731wy r1;
        Object obj2;
        C1763593t r2;
        int i = this.A00;
        IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel = (IndiaUpiMapperLinkViewModel) this.A01;
        if (i != 0) {
            if (a7b != null) {
                int i2 = a7b.A00;
                if (i2 == 21176) {
                    r1 = indiaUpiMapperLinkViewModel.A05;
                    obj2 = AnonymousClass93u.A00;
                } else {
                    C41731wy r32 = indiaUpiMapperLinkViewModel.A05;
                    if (i2 == 21138) {
                        Application application = indiaUpiMapperLinkViewModel.A02;
                        r2 = new C1763593t(i2, application.getString(2131891861), application.getString(2131891860));
                    } else {
                        r2 = new C1763593t(i2, "", indiaUpiMapperLinkViewModel.A02.getString(2131894220));
                    }
                    r32.A0E(r2);
                    return;
                }
            } else {
                C20008A2y a2y = indiaUpiMapperLinkViewModel.A04;
                C18070vi.A0b(aec);
                a2y.A04(aec);
                String str = aec.A02;
                if (str.equalsIgnoreCase("active_pending")) {
                    r1 = indiaUpiMapperLinkViewModel.A05;
                    obj2 = C1763793w.A00;
                } else if (str.equalsIgnoreCase("active")) {
                    r1 = indiaUpiMapperLinkViewModel.A05;
                    obj2 = C1763693v.A00;
                } else {
                    return;
                }
            }
            r1.A0E(obj2);
            return;
        }
        if (a7b != null) {
            r3 = indiaUpiMapperLinkViewModel.A05;
            obj = new C1763593t(a7b.A00, "", "");
        } else {
            C20008A2y a2y2 = indiaUpiMapperLinkViewModel.A04;
            C18070vi.A0b(aec);
            a2y2.A04(aec);
            String str2 = aec.A02;
            if (str2.equalsIgnoreCase("active_pending")) {
                r3 = indiaUpiMapperLinkViewModel.A05;
                obj = C1763793w.A00;
            } else if (str2.equalsIgnoreCase("active")) {
                r3 = indiaUpiMapperLinkViewModel.A05;
                obj = C1763693v.A00;
            } else {
                return;
            }
        }
        r3.A0E(obj);
    }
}
