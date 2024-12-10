package X;

import com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet;
import com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel;
import com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$onUserClicked$1;
import java.util.Set;

/* renamed from: X.5Ql  reason: invalid class name and case insensitive filesystem */
public final class C105035Ql extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CallConfirmationSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105035Ql(CallConfirmationSheet callConfirmationSheet) {
        super(1);
        this.this$0 = callConfirmationSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        C18070vi.A0d(obj, 0);
        CallConfirmationSheetViewModel A0P = AnonymousClass3Ma.A0P(this.this$0);
        C18100vl r1 = CallConfirmationSheetViewModel.A00(A0P).A02;
        if (!((Set) r1.getValue()).add(obj)) {
            ((Set) r1.getValue()).remove(obj);
            z = false;
        } else {
            z = true;
        }
        if (C83614Fz.A00(A0P.A01)) {
            AnonymousClass1VP r3 = A0P.A05;
            Integer A0h = AnonymousClass3MY.A0h();
            int i = 23;
            if (z) {
                i = 22;
            }
            r3.BiX(A0h, CallConfirmationSheetViewModel.A03(A0P), i, false);
        }
        AnonymousClass3MW.A1X(A0P.A0F, new CallConfirmationSheetViewModel$onUserClicked$1(A0P, (C30391dr) null), C41561wd.A00(A0P));
        return C27621Wu.A00;
    }
}
