package X;

import com.whatsapp.inappbugreporting.InAppBugReportingViewModel;

/* renamed from: X.4qr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98274qr implements AnonymousClass1TI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InAppBugReportingViewModel A01;

    public final void accept(Object obj) {
        C83204Ef r0;
        InAppBugReportingViewModel inAppBugReportingViewModel = this.A01;
        int i = this.A00;
        C87224Ut r6 = (C87224Ut) obj;
        C18070vi.A0d(r6, 2);
        int i2 = r6.A00;
        if (i2 == 0) {
            InAppBugReportingViewModel.A00(AnonymousClass41T.A00, inAppBugReportingViewModel, i);
            inAppBugReportingViewModel.A04[i] = r6;
            return;
        }
        if (i2 == 1) {
            r0 = AnonymousClass41S.A00;
        } else {
            r0 = AnonymousClass41R.A00;
        }
        InAppBugReportingViewModel.A00(r0, inAppBugReportingViewModel, i);
        inAppBugReportingViewModel.A04[i] = null;
    }

    public /* synthetic */ C98274qr(InAppBugReportingViewModel inAppBugReportingViewModel, int i) {
        this.A01 = inAppBugReportingViewModel;
        this.A00 = i;
    }
}
