package X;

import android.content.DialogInterface;
import com.whatsapp.jid.Jid;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;

/* renamed from: X.4VP  reason: invalid class name */
public final class AnonymousClass4VP {
    public C87244Uv A00;
    public final AnonymousClass1FY A01;
    public final C37551pj A02;
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;
    public final RequestPhoneNumberViewModel A05;
    public final AnonymousClass00H A06;

    public final void A01(AnonymousClass1E2 r6) {
        C18070vi.A0d(r6, 0);
        RequestPhoneNumberViewModel requestPhoneNumberViewModel = this.A05;
        AnonymousClass1DT r3 = requestPhoneNumberViewModel.A01;
        requestPhoneNumberViewModel.A05.CGF(new C21433Ak0(requestPhoneNumberViewModel, r6, 18));
        C91634g0.A00(this.A01, r3, new C100955Aj(this, 7), 5);
    }

    public final void A02(AnonymousClass1E2 r12, int i) {
        C18070vi.A0d(r12, 0);
        C1411874q r2 = new C1411874q(30);
        AnonymousClass3MY.A1H(AnonymousClass4FY.A00(new C88864ax(r12, i, 3, this), r2, (CharSequence) null, new Object[0], new Object[0], -1, 2131895284, 2131895283, 2131895282, 2131895285), this.A01, (String) null);
        ((C25065CVx) this.A05.A06.get()).A00(r12, 2, i, true);
    }

    public final void A00(int i) {
        C87244Uv r2 = (C87244Uv) this.A05.A01.A06();
        if (r2 == null) {
            return;
        }
        if (!r2.A02) {
            AnonymousClass3MW.A0c(this.A06).A01(C202611l.class);
            AnonymousClass1E2 r1 = r2.A01;
            C18070vi.A0d(r1, 0);
            this.A01.CMk(AnonymousClass4G6.A00(r1, i), "SharePhoneNumberBottomSheet");
        } else if (r2.A04) {
            AnonymousClass3MY.A1H(AnonymousClass4FY.A00((DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null, (CharSequence) null, new Object[0], new Object[0], -1, 2131887922, 0, 0, 2131887923), this.A01, (String) null);
        } else {
            A02(r2.A01, i);
        }
    }

    public final boolean A03(Jid jid) {
        C87244Uv r1;
        if (!(jid instanceof AnonymousClass1E2) || (r1 = this.A00) == null || (r1.A03 && r1.A02)) {
            return true;
        }
        return false;
    }

    public AnonymousClass4VP(AnonymousClass1FY r2, C37551pj r3, AnonymousClass1M9 r4, C24921Me r5, RequestPhoneNumberViewModel requestPhoneNumberViewModel, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r4, r5, r3, r7);
        C18070vi.A0d(requestPhoneNumberViewModel, 6);
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = requestPhoneNumberViewModel;
    }
}
