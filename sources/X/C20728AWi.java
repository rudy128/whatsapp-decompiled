package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.AWi  reason: case insensitive filesystem */
public class C20728AWi implements C23691Hg {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20728AWi(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void CGE(Object obj) {
        A7P a7p;
        String str;
        switch (this.A00) {
            case 0:
                ((BDF) obj).C07((UserJid[]) this.A01, (int[]) this.A02);
                return;
            case 1:
                ((BDF) obj).Byq((UserJid) this.A01, ((CallInfo) this.A02).videoEnabled);
                return;
            case 2:
                ((BDF) obj).C9p((UserJid) this.A01, ((C86534Sa) this.A02).A0Q);
                return;
            case 3:
                ((BDF) obj).Byr((UserJid) this.A01, ((CallInfo) this.A02).videoEnabled);
                return;
            case 4:
                Number number = (Number) this.A01;
                Integer num = (Integer) this.A02;
                BDJ bdj = (BDJ) obj;
                int A0G = C72453Mb.A0G(number, bdj, 0);
                AW8 aw8 = (AW8) bdj;
                int intValue = number.intValue();
                if (intValue == 1) {
                    a7p = aw8.A00.A0H;
                    a7p.A04(16);
                    str = "searching_for_peer";
                } else if (intValue == A0G) {
                    ChatTransferViewModel chatTransferViewModel = aw8.A00;
                    chatTransferViewModel.A0d(4);
                    a7p = chatTransferViewModel.A0H;
                    a7p.A0B.CGF(new C70863Cu(a7p, num));
                    str = "connecting_to_peer";
                } else {
                    return;
                }
                a7p.A06(str);
                return;
            case 5:
                C20284AEs aEs = (C20284AEs) this.A02;
                C20755AXk aXk = (C20755AXk) ((B5R) obj);
                int i = aXk.A00;
                Object obj2 = aXk.A01;
                if (i != 0) {
                    PaymentMerchantAccountViewModel paymentMerchantAccountViewModel = (PaymentMerchantAccountViewModel) obj2;
                    C18070vi.A0d(paymentMerchantAccountViewModel, 0);
                    paymentMerchantAccountViewModel.A04.CGN(new C70813Cp(27, (Object) paymentMerchantAccountViewModel, false));
                    return;
                }
                AnonymousClass91y r4 = (AnonymousClass91y) obj2;
                AnonymousClass1QE r3 = r4.A0M;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("paymentMethodNotificationObserver is called ");
                boolean z = true;
                AnonymousClass8BW.A1D(r3, A10, AnonymousClass000.A1W(aEs));
                if (r4.A04 != null) {
                    z = false;
                }
                r4.A4c(aEs, z);
                return;
            default:
                C22462B8u b8u = (C22462B8u) obj;
                C18070vi.A0d(b8u, 2);
                b8u.Bof();
                ((AnonymousClass10T) this.A02).unregisterObserver(b8u);
                return;
        }
    }
}
