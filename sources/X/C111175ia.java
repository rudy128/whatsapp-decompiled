package X;

import android.content.Intent;
import com.whatsapp.shops.ShopsBkLayoutViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.GenericBkLayoutViewModel;
import com.whatsapp.wabloks.base.GenericBkLayoutViewModelWithReload;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkFlowsLayoutViewModel;

/* renamed from: X.5ia  reason: invalid class name and case insensitive filesystem */
public abstract class C111175ia extends AnonymousClass1J2 {
    public AnonymousClass1DS A00;
    public AnonymousClass1DT A01;
    public boolean A02;
    public final AnonymousClass00H A03;

    public final void A0T() {
        if (!this.A02) {
            throw AnonymousClass000.A0n("BkLayoutViewModel must be initialized");
        }
    }

    public void A0U(CXY cxy, ADL adl, String str, String str2, String str3) {
        if (!this.A02) {
            this.A02 = true;
            C22801Dg A0R = C108945cZ.A0R();
            AnonymousClass1DT A0S = C108945cZ.A0S();
            this.A01 = A0S;
            A0R.A0H(A0S, new AnonymousClass7AH(A0R, this, 19));
            this.A00 = A0R;
            ((C19995A2i) this.A03.get()).A03(adl, new AnonymousClass7OR(this.A01, cxy), (Boolean) null, str, str2, str3);
        }
    }

    public boolean A0V(C187029f9 r8) {
        String str;
        String str2;
        if (this instanceof WaBkFlowsLayoutViewModel) {
            WaBkFlowsLayoutViewModel waBkFlowsLayoutViewModel = (WaBkFlowsLayoutViewModel) this;
            int i = r8.A00;
            if (i == 1) {
                str = "extensions-layout-request-error";
            } else if (i == 3) {
                str = "extensions-layout-null-error";
            } else if (i == 4) {
                waBkFlowsLayoutViewModel.A01.A0N(3228);
                str = "extensions-layout-unexpected-error";
            } else if (i == 6) {
                str = "extensions-layout-bloks-internal-error";
            } else if (i != 7) {
                str = "extensions-layout-undefined-error";
            } else {
                str = "extensions-layout-network-error";
            }
            int i2 = r8.A00;
            if (i2 == 1 || i2 == 3 || i2 == 4 || i2 == 6 || i2 == 7) {
                Exception exc = r8.A02;
                if (exc == null) {
                    str2 = null;
                } else if (exc instanceof C122816Sa) {
                    str2 = ((C122816Sa) exc).error.toString();
                } else {
                    str2 = exc.toString();
                }
                waBkFlowsLayoutViewModel.A03.get();
                C24521Kq r0 = C24521Kq.$redex_init_class;
                C41731wy r2 = waBkFlowsLayoutViewModel.A02;
                int i3 = 2131890447;
                if (waBkFlowsLayoutViewModel.A00.A09()) {
                    i3 = 2131890448;
                }
                r2.A0F(new C135556sO(i3, str, str2));
                return false;
            }
            C17960vV.A0F(false, "BkLayoutViewModel: invalid error status");
            return false;
        } else if (this instanceof GenericBkLayoutViewModelWithReload) {
            ((GenericBkLayoutViewModelWithReload) this).A00.A0E(new AnonymousClass6NI(r8.A00));
            return false;
        } else if (this instanceof GenericBkLayoutViewModel) {
            GenericBkLayoutViewModel genericBkLayoutViewModel = (GenericBkLayoutViewModel) this;
            int i4 = r8.A00;
            if (i4 == 1 || i4 == 3 || i4 == 4 || i4 == 6 || i4 == 7) {
                int i5 = 2131892931;
                if (genericBkLayoutViewModel.A00.A09()) {
                    i5 = 2131889977;
                }
                Log.e("BkLayoutViewModel: layout fetch error");
                AnonymousClass3MX.A1J(genericBkLayoutViewModel.A01, i5);
                return false;
            }
            C17960vV.A0F(false, "BkLayoutViewModel: invalid error status");
            return false;
        } else {
            ShopsBkLayoutViewModel shopsBkLayoutViewModel = (ShopsBkLayoutViewModel) this;
            int i6 = r8.A00;
            if (i6 != 1) {
                if (i6 == 2) {
                    Intent A0A = C17880vN.A0A();
                    A0A.putExtra("error_code", 475);
                    shopsBkLayoutViewModel.A01.A0F(A0A);
                    return false;
                } else if (!(i6 == 3 || i6 == 4 || i6 == 6 || i6 == 7)) {
                    C17960vV.A0F(false, "BkLayoutViewModel: invalid error status");
                    return false;
                }
            }
            Log.e("BkLayoutViewModel: layout fetch error");
            int i7 = 2131892931;
            if (shopsBkLayoutViewModel.A00.A09()) {
                i7 = 2131889977;
            }
            Log.e("BkLayoutViewModel: layout fetch error");
            AnonymousClass3MX.A1J(shopsBkLayoutViewModel.A02, i7);
            return false;
        }
    }

    public C111175ia(AnonymousClass00H r1) {
        this.A03 = r1;
    }
}
