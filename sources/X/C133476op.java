package X;

import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.6op  reason: invalid class name and case insensitive filesystem */
public final class C133476op {
    public final C18030ve A00;
    public final C18140vp A01;

    public final AnonymousClass7C7 A00(View.OnClickListener onClickListener, C86534Sa r8, A99 a99) {
        C18070vi.A0d(r8, 1);
        if (!A01(r8, a99)) {
            return null;
        }
        Log.i("CallOnHoldUseCase/showing banner");
        AnonymousClass720 r1 = new AnonymousClass720(C122636Rd.A05, AnonymousClass3MX.A0t(2131898264), (AnonymousClass4ZN) null, 0);
        r1.A04 = AnonymousClass3MX.A0t(2131898285);
        r1.A03(onClickListener);
        r1.A07 = true;
        return r1.A02();
    }

    public final boolean A01(C86534Sa r5, A99 a99) {
        C18070vi.A0d(r5, 1);
        C134216qE r0 = r5.A07;
        if (r0 == null || !r0.A0F || r5.A0B != CallState.ACTIVE || a99 == null || !a99.A1G(r5.A0C) || !C72463Mc.A1Z(this.A01)) {
            return false;
        }
        if (!C18020vd.A05(C18040vf.A02, this.A00, 12603)) {
            return true;
        }
        return false;
    }

    public C133476op(C18030ve r1, C18140vp r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
