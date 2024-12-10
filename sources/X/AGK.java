package X;

import android.text.TextUtils;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;
import com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import java.util.LinkedHashMap;

public class AGK implements C16560sd {
    public final int A00;
    public final Object A01;

    public AGK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.9B7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.9Ax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.9B7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.9B7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C2P(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0020;
                case 1: goto L_0x00a9;
                case 2: goto L_0x0093;
                case 3: goto L_0x005a;
                case 4: goto L_0x002e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r5.A01
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r1 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r1
            X.0vb r0 = r1.A04
            java.util.ArrayList r0 = X.C20103A7h.A03(r0, r6)
            r1.A0M = r0
            r1.A0L = r6
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001c
            r0 = 0
            r1.A0M = r0
        L_0x001c:
            r1.A4b()
        L_0x001f:
            return
        L_0x0020:
            java.lang.Object r0 = r5.A01
            com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity r0 = (com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity) r0
            com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment r0 = r0.A02
            if (r0 == 0) goto L_0x001f
            X.8F9 r0 = r0.A03
            r0.A0T(r6)
            return
        L_0x002e:
            java.lang.Object r2 = r5.A01
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity r2 = (com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity) r2
            X.0vb r0 = r2.A00
            java.util.ArrayList r0 = X.C20103A7h.A03(r0, r6)
            r2.A0I = r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0043
            r0 = 0
            r2.A0I = r0
        L_0x0043:
            X.9Ax r1 = r2.A0D
            if (r1 == 0) goto L_0x004e
            r0 = 1
            r1.A0B(r0)
            r0 = 0
            r2.A0D = r0
        L_0x004e:
            java.util.ArrayList r0 = r2.A0I
            X.9Ax r1 = new X.9Ax
            r1.<init>(r2, r0)
            r2.A0D = r1
            X.10I r0 = r2.A05
            goto L_0x008f
        L_0x005a:
            java.lang.Object r4 = r5.A01
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r4 = (com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity) r4
            r4.A0H = r6
            X.0vb r0 = r4.A00
            java.util.ArrayList r0 = X.C20103A7h.A03(r0, r6)
            r4.A0I = r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0071
            r0 = 0
            r4.A0I = r0
        L_0x0071:
            X.9B7 r1 = r4.A0C
            if (r1 == 0) goto L_0x007c
            r0 = 1
            r1.A0B(r0)
            r0 = 0
            r4.A0C = r0
        L_0x007c:
            java.util.ArrayList r3 = r4.A0I
            java.lang.String r2 = r4.A0H
            X.9lw r0 = X.A7U.A00(r4)
            java.util.ArrayList r0 = r0.A03
            X.9B7 r1 = new X.9B7
            r1.<init>(r4, r2, r3, r0)
            r4.A0C = r1
            X.10I r0 = r4.A05
        L_0x008f:
            X.C17890vO.A0u(r1, r0)
            return
        L_0x0093:
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            java.lang.Object r2 = r5.A01
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r2 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r2
            X.0vl r0 = r2.A0P
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r1 = (com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r1
            X.AEW r0 = r2.A09
            r1.A0U(r0, r6)
            return
        L_0x00a9:
            java.lang.Object r0 = r5.A01
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity) r0
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity.A0c(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AGK.C2P(java.lang.String):void");
    }

    public boolean C2Q(String str) {
        switch (this.A00) {
            case 0:
                BusinessApiHomeFragment businessApiHomeFragment = ((BusinessApiSearchActivity) this.A01).A02;
                if (businessApiHomeFragment == null) {
                    return false;
                }
                businessApiHomeFragment.A03.A0T(str);
                return false;
            case 1:
                BusinessDirectoryActivity businessDirectoryActivity = (BusinessDirectoryActivity) this.A01;
                BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment = businessDirectoryActivity.A03;
                if (businessDirectoryContextualSearchFragment != null) {
                    BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = businessDirectoryContextualSearchFragment.A07;
                    String trim = str.trim();
                    if (!TextUtils.isEmpty(trim)) {
                        if (trim.length() >= C18020vd.A00(C18040vf.A02, businessDirectoryContextualSearchViewModel.A0V.A03, 4556)) {
                            AM7 A03 = BusinessDirectoryContextualSearchViewModel.A03(businessDirectoryContextualSearchViewModel);
                            Integer A002 = A5L.A00(businessDirectoryContextualSearchViewModel);
                            LinkedHashMap A13 = C17880vN.A13();
                            A03.A08(A002, C108975cc.A0S("from_keyboard", true, A13), A13, 1, 15, 1);
                            BusinessDirectoryContextualSearchViewModel.A0H(businessDirectoryContextualSearchViewModel, trim, BusinessDirectoryContextualSearchViewModel.A00(businessDirectoryContextualSearchViewModel, str));
                        }
                    }
                }
                SearchView searchView = businessDirectoryActivity.A02.A00;
                if (searchView == null) {
                    return false;
                }
                searchView.clearFocus();
                return false;
            case 2:
                C18070vi.A0d(str, 0);
                CatalogSearchFragment.A03((CatalogSearchFragment) this.A01, str);
                return true;
            default:
                return false;
        }
    }
}
