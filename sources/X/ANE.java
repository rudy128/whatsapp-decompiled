package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.biz.product.viewmodel.ComplianceInfoViewModel;

public final class ANE implements BAK {
    public final /* synthetic */ ComplianceInfoViewModel A00;
    public final /* synthetic */ String A01;

    public ANE(ComplianceInfoViewModel complianceInfoViewModel, String str) {
        this.A01 = str;
        this.A00 = complianceInfoViewModel;
    }

    public void BuO(String str, int i) {
        AnonymousClass1DT r1;
        int i2;
        boolean A18 = C18070vi.A18(this.A01, str);
        ComplianceInfoViewModel complianceInfoViewModel = this.A00;
        if (A18) {
            ((CatalogManager) complianceInfoViewModel.A05.get()).A08.remove(this);
            r1 = complianceInfoViewModel.A01;
            i2 = 3;
        } else {
            r1 = complianceInfoViewModel.A01;
            i2 = 2;
        }
        AnonymousClass3MX.A1J(r1, i2);
    }

    public void BuP(String str) {
        AnonymousClass1DT r1;
        int i;
        String str2 = this.A01;
        if (C18070vi.A18(str2, str)) {
            ComplianceInfoViewModel complianceInfoViewModel = this.A00;
            ((CatalogManager) complianceInfoViewModel.A05.get()).A08.remove(this);
            C20287AEv A0I = AnonymousClass8BX.A0I(complianceInfoViewModel.A04, str2);
            if (A0I != null) {
                complianceInfoViewModel.A00.A0F(A0I.A0D);
                r1 = complianceInfoViewModel.A01;
                i = 1;
                AnonymousClass3MX.A1J(r1, i);
            }
        }
        r1 = this.A00.A01;
        i = 2;
        AnonymousClass3MX.A1J(r1, i);
    }
}
