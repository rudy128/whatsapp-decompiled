package X;

import android.content.Context;
import com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.8yg  reason: invalid class name and case insensitive filesystem */
public class C175418yg extends C20992Ack {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175418yg(Context context, C33711jG r2, AnonymousClass119 r3, Object obj, Object obj2, int i) {
        super(context, r2, r3);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void A04(A7B a7b) {
        if (this.A00 != 0) {
            C17900vP.A0Y(a7b, "PAY: BrazilSaveIncomeInformationAction/saveIncomeSlab onRequestError: ", C18070vi.A0K(a7b));
            ((BBZ) this.A01).Bsl();
            return;
        }
        C17900vP.A0Y(a7b, "PAY: BrazilRemoveMerchantAccount onRequestError: ", AnonymousClass000.A10());
        ((C33661jB) this.A02).C3L(a7b);
    }

    public void A05(A7B a7b) {
        if (this.A00 != 0) {
            C17900vP.A0Y(a7b, "PAY: BrazilSaveIncomeInformationAction/saveIncomeSlab onResponseError: ", C18070vi.A0K(a7b));
            ((BBZ) this.A01).Bsl();
            return;
        }
        C17900vP.A0X(a7b, "PAY: BrazilRemoveMerchantAccount onResponseError=", AnonymousClass000.A10());
        ((C33661jB) this.A02).C3X(a7b);
    }

    public void A06(C29621ca r5) {
        if (this.A00 != 0) {
            ((BrazilIncomeCollectionViewModel) this.A02).A02.A0N("collected");
            ((BBZ) this.A01).Bvq();
            return;
        }
        Log.i("Pay: BrazilRemoveMerchantAccount successfully removed merchant account");
        ((C191749n7) this.A01).A02.CGF(new C70653Bz(this, this.A02, 34));
    }
}
