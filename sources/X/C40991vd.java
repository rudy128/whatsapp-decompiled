package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;

/* renamed from: X.1vd  reason: invalid class name and case insensitive filesystem */
public class C40991vd implements C40981vc {
    public final /* synthetic */ C40971vb A00;

    public void BAE(long j, int i) {
        C40971vb r1 = this.A00;
        if (r1.A07 != null) {
            r1.A0R.CGF(new AnonymousClass3C2(this, i, 1, j));
        }
    }

    public void BAF(AnonymousClass1BI r8, String str) {
        C40971vb r1 = this.A00;
        if (r1.A07 != null) {
            r1.A0R.CGF(new C70783Cm(this, r8, str, 1, 2));
        }
    }

    public C40991vd(C40971vb r1) {
        this.A00 = r1;
    }

    public void C4R(C59822mw r7) {
        C41031vh r0 = this.A00.A07;
        if (r0 != null) {
            CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r0.A00;
            C66522yJ r02 = callsHistoryFragmentViewModel.A06;
            if (r02 == null) {
                CallsHistoryFragmentViewModel.A07(callsHistoryFragmentViewModel, r7);
                callsHistoryFragmentViewModel.A01 = 1;
                CallsHistoryFragmentViewModel.A06(callsHistoryFragmentViewModel);
            } else if (r02.A00 > r7.A03) {
                callsHistoryFragmentViewModel.A0R.A02();
            }
        }
    }
}
