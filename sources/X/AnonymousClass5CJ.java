package X;

import com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel;

/* renamed from: X.5CJ  reason: invalid class name */
public final class AnonymousClass5CJ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CallConfirmationSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5CJ(CallConfirmationSheetViewModel callConfirmationSheetViewModel) {
        super(0);
        this.this$0 = callConfirmationSheetViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CallConfirmationSheetViewModel callConfirmationSheetViewModel = this.this$0;
        AnonymousClass4XV r2 = callConfirmationSheetViewModel.A04;
        int i = callConfirmationSheetViewModel.A01;
        AnonymousClass4Cl r3 = callConfirmationSheetViewModel.A03;
        C89444cT r0 = callConfirmationSheetViewModel.A0A;
        AnonymousClass1EC r8 = callConfirmationSheetViewModel.A09;
        C178119Bw A00 = AnonymousClass4XV.A00(r2, r0, i);
        if (A00 == null) {
            AnonymousClass4KY r1 = r2.A03;
            if (r3 == null) {
                throw AnonymousClass000.A0k("Required value was null.");
            } else if (r8 != null) {
                boolean A01 = r2.A01(i);
                C37391pS r02 = r1.A00;
                AnonymousClass10E r12 = r02.A00;
                AnonymousClass1M9 A4z = AnonymousClass10E.A4z(r12);
                C86104Qe A0k = C37381pR.A0k(r02.A01);
                C18030ve A8r = AnonymousClass10E.A8r(r12);
                return new C75953mC((AnonymousClass1VE) r12.ABT.get(), r3, A0k, A4z, AnonymousClass3MZ.A0p(r12), A8r, r8, i, A01);
            } else {
                throw AnonymousClass000.A0k("Required value was null.");
            }
        } else if (A00.A0C != null) {
            C37391pS r03 = r2.A04.A00;
            AnonymousClass10E r13 = r03.A00;
            return new C75933mA(C37381pR.A0k(r03.A01), AnonymousClass10E.A4z(r13), AnonymousClass10E.A6Q(r13), AnonymousClass3MZ.A0p(r13), A00);
        } else {
            C37391pS r04 = r2.A05.A00;
            AnonymousClass10E r14 = r04.A00;
            AnonymousClass1M9 A4z2 = AnonymousClass10E.A4z(r14);
            return new C75943mB(AnonymousClass10E.A17(r14), C37381pR.A0k(r04.A01), A4z2, AnonymousClass10E.A6Q(r14), A00);
        }
    }
}
