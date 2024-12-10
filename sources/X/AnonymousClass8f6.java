package X;

import com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet;

/* renamed from: X.8f6  reason: invalid class name */
public final class AnonymousClass8f6 extends C29501cO {
    public final /* synthetic */ AnonymousClass8D8 A00;
    public final /* synthetic */ AccountSwitchingBottomSheet A01;

    public AnonymousClass8f6(AnonymousClass8D8 r1, AccountSwitchingBottomSheet accountSwitchingBottomSheet) {
        this.A01 = accountSwitchingBottomSheet;
        this.A00 = r1;
    }

    public void A00() {
        AccountSwitchingBottomSheet accountSwitchingBottomSheet = this.A01;
        AnonymousClass10I r3 = accountSwitchingBottomSheet.A0B;
        if (r3 != null) {
            r3.CGF(new AnonymousClass3C0(accountSwitchingBottomSheet, this.A00, 43));
        } else {
            C18070vi.A11("waWorkers");
            throw null;
        }
    }
}
