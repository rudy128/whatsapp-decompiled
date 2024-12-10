package X;

import android.app.Activity;
import android.text.Editable;
import com.whatsapp.WaEditText;

/* renamed from: X.6n8  reason: invalid class name and case insensitive filesystem */
public final class C132606n8 {
    public final Activity A00;
    public final AnonymousClass70L A01;
    public final C1404471l A02;
    public final C116505xr A03;

    public final boolean A00() {
        if (this.A02.A02().length() == 0) {
            WaEditText waEditText = this.A03.A04;
            if (waEditText == null) {
                C18070vi.A11("phoneField");
                throw null;
            }
            Editable text = waEditText.getText();
            if (text == null || text.length() == 0) {
                return false;
            }
        }
        Activity activity = this.A00;
        AnonymousClass757 A002 = AnonymousClass757.A00(this, 27);
        AnonymousClass757 A003 = AnonymousClass757.A00(this, 28);
        C73203Rj A004 = AnonymousClass4a6.A00(activity);
        C108955ca.A1D(activity, A004, 2131888759);
        C108975cc.A0n(activity, A002, A004, 2131896819);
        C109005cf.A0J(activity, A003, A004, 2131895378);
        return true;
    }

    public C132606n8(Activity activity, C1404471l r2, C116505xr r3, AnonymousClass70L r4) {
        this.A00 = activity;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }
}
