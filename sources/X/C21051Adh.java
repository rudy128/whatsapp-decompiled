package X;

import com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel;
import com.whatsapp.quickcontact.QuickContactActivity;

/* renamed from: X.Adh  reason: case insensitive filesystem */
public class C21051Adh implements C40981vc {
    public final int A00;
    public final Object A01;

    public C21051Adh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BAE(long j, int i) {
        long j2 = j;
        int i2 = i;
        switch (this.A00) {
            case 0:
                UpcomingActivityViewModel.A00((UpcomingActivityViewModel) this.A01, (AnonymousClass1BI) null, (String) null, i2, j2);
                return;
            case 1:
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A01;
                C59822mw r0 = quickContactActivity.A0R;
                if (r0 != null && r0.A02 == j && i != 0) {
                    quickContactActivity.A0R = null;
                    A5G.A01(quickContactActivity);
                    return;
                }
                return;
        }
    }

    public void BAF(AnonymousClass1BI r8, String str) {
        AnonymousClass1BI r2 = r8;
        String str2 = str;
        switch (this.A00) {
            case 0:
                UpcomingActivityViewModel.A00((UpcomingActivityViewModel) this.A01, r2, str2, 1, -1);
                return;
            case 1:
                return;
            default:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A01;
                if (quickContactActivity.A0R != null && r8.equals(quickContactActivity.A0a) && str.equals(quickContactActivity.A0R.A07)) {
                    quickContactActivity.A0R = null;
                    A5G.A01(quickContactActivity);
                    return;
                }
                return;
        }
    }

    public void C4R(C59822mw r7) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                AnonymousClass8nW r5 = (AnonymousClass8nW) this.A01;
                if (r5.A0I.A0x == r7.A02) {
                    r5.setupJoinCallViewContent(r7.A03);
                    return;
                }
                return;
            default:
                AnonymousClass1BI r2 = r7.A04;
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A01;
                if (r2.equals(quickContactActivity.A0a)) {
                    quickContactActivity.A0R = r7;
                    A5G.A01(quickContactActivity);
                    return;
                }
                return;
        }
    }
}
