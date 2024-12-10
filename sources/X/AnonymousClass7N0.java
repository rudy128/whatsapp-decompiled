package X;

import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

/* renamed from: X.7N0  reason: invalid class name */
public class AnonymousClass7N0 implements AnonymousClass89S {
    public final int A00;
    public final Object A01;

    public AnonymousClass7N0(BanAppealViewModel banAppealViewModel, int i) {
        this.A00 = i;
        this.A01 = banAppealViewModel;
    }

    public void Btp(Integer num) {
        AnonymousClass1DT r0;
        if (this.A00 != 0) {
            BanAppealViewModel banAppealViewModel = (BanAppealViewModel) this.A01;
            AnonymousClass3MX.A1K(banAppealViewModel.A02, 3);
            r0 = banAppealViewModel.A01;
        } else {
            int intValue = num.intValue();
            if (intValue == 4 || intValue == 3) {
                r0 = ((BanAppealViewModel) this.A01).A01;
            } else {
                return;
            }
        }
        r0.A0E(num);
    }

    public void C7O(C128776gf r5) {
        C41731wy r1;
        Integer valueOf;
        if (this.A00 != 0) {
            BanAppealViewModel banAppealViewModel = (BanAppealViewModel) this.A01;
            int A002 = BanAppealViewModel.A00(banAppealViewModel, r5.A00, true);
            AnonymousClass3MX.A1K(banAppealViewModel.A02, 2);
            r1 = banAppealViewModel.A0A;
            valueOf = Integer.valueOf(A002);
        } else {
            BanAppealViewModel banAppealViewModel2 = (BanAppealViewModel) this.A01;
            int A003 = BanAppealViewModel.A00(banAppealViewModel2, r5.A00, false);
            r1 = banAppealViewModel2.A0A;
            valueOf = Integer.valueOf(A003);
        }
        r1.A0E(valueOf);
    }
}
