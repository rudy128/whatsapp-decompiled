package X;

import com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel;

/* renamed from: X.5CL  reason: invalid class name */
public final class AnonymousClass5CL extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CallConfirmationSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5CL(CallConfirmationSheetViewModel callConfirmationSheetViewModel) {
        super(0);
        this.this$0 = callConfirmationSheetViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CallConfirmationSheetViewModel callConfirmationSheetViewModel = this.this$0;
        AnonymousClass4XV r1 = callConfirmationSheetViewModel.A04;
        int i = callConfirmationSheetViewModel.A01;
        C89444cT r2 = callConfirmationSheetViewModel.A0A;
        AnonymousClass1EC r9 = callConfirmationSheetViewModel.A09;
        C178119Bw A00 = AnonymousClass4XV.A00(r1, r2, i);
        if (A00 == null) {
            AnonymousClass4KV r0 = r1.A00;
            if (r9 == null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("expected non null group jid: callFromUi: ");
                A10.append(i);
                A10.append(" callLogKeyExists: ");
                throw AnonymousClass000.A0k(AnonymousClass3MY.A0r(A10, AnonymousClass000.A1W(r2)));
            }
            AnonymousClass10E r02 = r0.A00.A00;
            C24921Me A0g = AnonymousClass3MZ.A0g(r02);
            return new C75973mE(AnonymousClass10E.A17(r02), AnonymousClass10E.A4z(r02), A0g, AnonymousClass3MZ.A0p(r02), r9);
        } else if (A00.A0C != null) {
            AnonymousClass10E r03 = r1.A01.A00.A00;
            C24921Me A0g2 = AnonymousClass3MZ.A0g(r03);
            return new C75983mF(AnonymousClass10E.A17(r03), AnonymousClass10E.A4z(r03), A0g2, AnonymousClass3MZ.A0p(r03), A00);
        } else {
            AnonymousClass10E r04 = r1.A02.A00.A00;
            C24921Me A0g3 = AnonymousClass3MZ.A0g(r04);
            return new C75963mD(AnonymousClass10E.A17(r04), AnonymousClass10E.A4z(r04), A0g3, A00);
        }
    }
}
