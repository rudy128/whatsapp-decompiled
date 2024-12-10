package X;

import com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel;

/* renamed from: X.4jY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C93794jY implements C34241kA {
    public final /* synthetic */ AnonymousClass1FY A00;
    public final /* synthetic */ CallLogActivityViewModel A01;
    public final /* synthetic */ C31191fA A02;
    public final /* synthetic */ AnonymousClass1E7 A03;
    public final /* synthetic */ AnonymousClass1BI A04;

    public final void C3e(AnonymousClass4YL r9) {
        C31191fA r7 = this.A02;
        CallLogActivityViewModel callLogActivityViewModel = this.A01;
        AnonymousClass1FY r4 = this.A00;
        AnonymousClass1BI r3 = this.A04;
        AnonymousClass1E7 r6 = this.A03;
        C18070vi.A0d(r9, 5);
        Integer num = r9.A02;
        if (num == AnonymousClass00R.A00) {
            r7.A03 = true;
            AnonymousClass3MX.A0a(callLogActivityViewModel.A0K).A01(4, 0);
            CallLogActivityViewModel.A08(r4, callLogActivityViewModel, r3);
        } else if (num == AnonymousClass00R.A0C) {
            r7.A06();
            r7.A0D(r4, r9, new C93824jb(r4, callLogActivityViewModel, r3), r6.A0J);
        }
    }

    public /* synthetic */ C93794jY(AnonymousClass1FY r1, CallLogActivityViewModel callLogActivityViewModel, C31191fA r3, AnonymousClass1E7 r4, AnonymousClass1BI r5) {
        this.A02 = r3;
        this.A01 = callLogActivityViewModel;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
    }
}
