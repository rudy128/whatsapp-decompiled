package X;

import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet;
import java.util.ArrayList;

/* renamed from: X.AaX  reason: case insensitive filesystem */
public class C20855AaX implements BBZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20855AaX(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void Bsl() {
        switch (this.A00) {
            case 0:
                AnonymousClass1FU r1 = (AnonymousClass1FU) this.A01;
                r1.A05.A0M(r1.getString(2131893930), r1.getString(2131893867), 1);
                return;
            case 1:
                ((WaButtonWithLoader) this.A01).A01();
                break;
        }
        BrazilPaymentIncomeCollectionBottomSheet brazilPaymentIncomeCollectionBottomSheet = (BrazilPaymentIncomeCollectionBottomSheet) this.A02;
        ArrayList arrayList = BrazilPaymentIncomeCollectionBottomSheet.A05;
        BBZ bbz = brazilPaymentIncomeCollectionBottomSheet.A01;
        if (bbz == null) {
            C18070vi.A11("incomeCollectionCallback");
            throw null;
        }
        bbz.Bsl();
        brazilPaymentIncomeCollectionBottomSheet.A28();
    }

    public void Bvq() {
        switch (this.A00) {
            case 0:
                ((AnonymousClass91U) this.A01).A4g((AnonymousClass1KN) this.A02);
                return;
            case 1:
                ((WaButtonWithLoader) this.A01).A01();
                break;
        }
        BrazilPaymentIncomeCollectionBottomSheet brazilPaymentIncomeCollectionBottomSheet = (BrazilPaymentIncomeCollectionBottomSheet) this.A02;
        ArrayList arrayList = BrazilPaymentIncomeCollectionBottomSheet.A05;
        BBZ bbz = brazilPaymentIncomeCollectionBottomSheet.A01;
        if (bbz == null) {
            C18070vi.A11("incomeCollectionCallback");
            throw null;
        }
        bbz.Bvq();
        brazilPaymentIncomeCollectionBottomSheet.A28();
    }
}
