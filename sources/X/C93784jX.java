package X;

import android.view.View;

/* renamed from: X.4jX  reason: invalid class name and case insensitive filesystem */
public final class C93784jX implements C34241kA {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1FY A01;
    public final /* synthetic */ C93834jc A02;

    public void C3e(AnonymousClass4YL r7) {
        C18070vi.A0d(r7, 0);
        int intValue = r7.A02.intValue();
        if (intValue == 0 || intValue == 2) {
            C93834jc r1 = this.A02;
            r1.A01.A07();
            AnonymousClass3MX.A0a(r1.A02).A04((AnonymousClass1BI) null, Integer.valueOf(this.A00), 1, 8);
            AnonymousClass1FY r0 = this.A01;
            View view = r0.A00;
            C31191fA.A01(C72463Mc.A0H(r0, view), view, true);
            return;
        }
        AnonymousClass1FY r02 = this.A01;
        View view2 = r02.A00;
        C31191fA.A01(C72463Mc.A0H(r02, view2), view2, false);
    }

    public C93784jX(AnonymousClass1FY r1, C93834jc r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }
}
