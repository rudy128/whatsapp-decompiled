package com.whatsapp.biz.product.view.fragment;

import X.AFB;
import X.AGL;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1FL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.B7P;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C199419zy;
import X.C20339AGv;
import X.C20511ANw;
import X.C20512ANx;
import X.C20514ANz;
import X.C21528Alb;
import X.C21728Are;
import X.C22941Dw;
import X.C34001jj;
import X.C72453Mb;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentContainerView;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.catalog.view.variants.Hilt_VariantsCarouselFragment;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselBaseFragment;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel;
import com.whatsapp.biz.catalog.view.variants.v2.Hilt_VariantsCarouselFragmentV2;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public final class ProductBottomSheet extends Hilt_ProductBottomSheet {
    public View A00;
    public Toolbar A01;
    public WaTextView A02;
    public WaTextView A03;
    public VariantsCarouselBaseFragment A04;
    public QuantitySelector A05;
    public ProductBottomSheetViewModel A06;
    public C18000vb A07;
    public UserJid A08;
    public AnonymousClass10I A09;
    public WDSButton A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public String A0I;
    public View A0J;
    public final C18100vl A0K = C21528Alb.A00(this, 8);
    public final C18100vl A0L = C21528Alb.A00(this, 9);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        C18100vl r4 = this.A0L;
        int i = 2131626616;
        if (C72453Mb.A1a(r4)) {
            i = 2131626618;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.A03 = (WaTextView) inflate.findViewById(2131436208);
        this.A02 = (WaTextView) inflate.findViewById(2131434054);
        this.A00 = inflate.findViewById(2131428860);
        this.A0A = AnonymousClass3MW.A0r(inflate, 2131427483);
        this.A05 = (QuantitySelector) inflate.findViewById(2131434274);
        this.A0J = inflate.findViewById(2131432160);
        QuantitySelector quantitySelector = this.A05;
        if (quantitySelector != null) {
            quantitySelector.A03 = new C20512ANx(this, 1);
            quantitySelector.A04 = new C20514ANz(this, 1);
        }
        if (!C72453Mb.A1a(r4)) {
            Toolbar toolbar = (Toolbar) inflate.findViewById(2131436270);
            this.A01 = toolbar;
            if (toolbar != null) {
                toolbar.setNavigationIcon(2131231814);
                toolbar.setNavigationOnClickListener(new AFB(this, 18));
                toolbar.A0N(2131820587);
                toolbar.A0C = new AGL(this);
            }
        }
        View findViewById = inflate.findViewById(2131433293);
        if (this.A06 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        if (C72453Mb.A1a(r4)) {
            AnonymousClass3MZ.A1I(findViewById, this, 20);
        }
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        VariantsCarouselBaseFragment hilt_VariantsCarouselFragment;
        Bundle A0D2;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        if (bundle == null) {
            boolean A1a = C72453Mb.A1a(this.A0L);
            UserJid userJid = this.A08;
            if (A1a) {
                if (userJid != null) {
                    hilt_VariantsCarouselFragment = new Hilt_VariantsCarouselFragmentV2();
                    A0D2 = C17880vN.A0D();
                    AnonymousClass3MY.A15(A0D2, userJid, "extra_product_owner_jid");
                    A0D2.putInt("extra_entry_point", 0);
                }
                C18070vi.A11("productOwnerJid");
                throw null;
            }
            if (userJid != null) {
                hilt_VariantsCarouselFragment = new Hilt_VariantsCarouselFragment();
                A0D2 = C17880vN.A0D();
                AnonymousClass3MY.A15(A0D2, userJid, "extra_product_owner_jid");
            }
            C18070vi.A11("productOwnerJid");
            throw null;
            hilt_VariantsCarouselFragment.A1R(A0D2);
            hilt_VariantsCarouselFragment.A01 = new C20511ANw(this, 1);
            C34001jj A0Y = C72453Mb.A0Y(this);
            A0Y.A0G = true;
            A0Y.A0C(hilt_VariantsCarouselFragment, (String) null, 2131436668);
            A0Y.A03();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        if (this.A06 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.whatsapp.biz.product.view.fragment.ProductBottomSheet r2, boolean r3) {
        /*
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r0 = r2.A05
            X.C72453Mb.A1B(r0)
            com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel r0 = r2.A06
            if (r0 != 0) goto L_0x000e
            X.AnonymousClass3MW.A1H()
            r0 = 0
            throw r0
        L_0x000e:
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A0A
            if (r3 == 0) goto L_0x0024
            if (r1 == 0) goto L_0x001a
            r0 = 2131887984(0x7f120770, float:1.941059E38)
        L_0x0017:
            r1.setText(r0)
        L_0x001a:
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A0A
            if (r1 == 0) goto L_0x0023
            r0 = 21
            X.AnonymousClass3MZ.A1I(r1, r2, r0)
        L_0x0023:
            return
        L_0x0024:
            if (r1 == 0) goto L_0x001a
            r0 = 2131887983(0x7f12076f, float:1.9410588E38)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.view.fragment.ProductBottomSheet.A00(com.whatsapp.biz.product.view.fragment.ProductBottomSheet, boolean):void");
    }

    public static final void A01(ProductBottomSheet productBottomSheet, boolean z) {
        View view = productBottomSheet.A0J;
        int i = 0;
        if (view != null) {
            view.setVisibility(C72453Mb.A01(z ^ true ? 1 : 0));
        }
        WaTextView waTextView = productBottomSheet.A03;
        if (waTextView != null) {
            int i2 = 0;
            if (z) {
                i2 = 4;
            }
            waTextView.setVisibility(i2);
        }
        WaTextView waTextView2 = productBottomSheet.A02;
        if (waTextView2 != null) {
            if (z) {
                i = 4;
            }
            waTextView2.setVisibility(i);
        }
    }

    public void A1r() {
        B7P b7p;
        super.A1r();
        AnonymousClass1FL A1B = A1B();
        if ((A1B instanceof B7P) && (b7p = (B7P) A1B) != null) {
            b7p.C1s();
        }
    }

    public void A1v() {
        VariantsCarouselBaseFragment variantsCarouselBaseFragment;
        FragmentContainerView fragmentContainerView;
        super.A1v();
        if (this.A04 == null) {
            View view = this.A0B;
            if (view == null || (fragmentContainerView = (FragmentContainerView) view.findViewById(2131436668)) == null) {
                variantsCarouselBaseFragment = null;
            } else {
                variantsCarouselBaseFragment = (VariantsCarouselBaseFragment) fragmentContainerView.getFragment();
            }
            this.A04 = variantsCarouselBaseFragment;
            if (variantsCarouselBaseFragment != null) {
                VariantsCarouselFragmentViewModel variantsCarouselFragmentViewModel = variantsCarouselBaseFragment.A02;
                if (variantsCarouselFragmentViewModel != null) {
                    variantsCarouselFragmentViewModel.A06 = true;
                } else {
                    AnonymousClass3MW.A1H();
                    throw null;
                }
            }
            ProductBottomSheetViewModel productBottomSheetViewModel = this.A06;
            if (productBottomSheetViewModel == null) {
                C18070vi.A11("viewModel");
                throw null;
            }
            C20339AGv.A00(this, productBottomSheetViewModel.A0E, new C21728Are(this, 9), 15);
            ProductBottomSheetViewModel productBottomSheetViewModel2 = this.A06;
            if (productBottomSheetViewModel2 == null) {
                C18070vi.A11("viewModel");
                throw null;
            }
            C20339AGv.A00(this, productBottomSheetViewModel2.A0D, new C21728Are(this, 10), 15);
            ProductBottomSheetViewModel productBottomSheetViewModel3 = this.A06;
            if (productBottomSheetViewModel3 == null) {
                C18070vi.A11("viewModel");
                throw null;
            }
            UserJid userJid = this.A08;
            if (userJid == null) {
                C18070vi.A11("productOwnerJid");
                throw null;
            }
            String str = this.A0I;
            if (str == null) {
                C18070vi.A11("productId");
                throw null;
            } else {
                productBottomSheetViewModel3.A0T(userJid, str);
            }
        }
    }

    public void A1z(Bundle bundle) {
        String str;
        String string;
        super.A1z(bundle);
        C22941Dw r2 = UserJid.Companion;
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            str = bundle2.getString("extra_product_owner_jid");
        } else {
            str = null;
        }
        UserJid A042 = r2.A04(str);
        if (A042 != null) {
            this.A08 = A042;
            Bundle bundle3 = this.A06;
            if (bundle3 == null || (string = bundle3.getString("extra_product_id")) == null) {
                throw AnonymousClass000.A0n("ProductBottomSheet requires a product id");
            }
            this.A0I = string;
            ProductBottomSheetViewModel productBottomSheetViewModel = (ProductBottomSheetViewModel) AnonymousClass3MW.A0N(this).A00(ProductBottomSheetViewModel.class);
            this.A06 = productBottomSheetViewModel;
            if (productBottomSheetViewModel == null) {
                C18070vi.A11("viewModel");
                throw null;
            }
            UserJid userJid = this.A08;
            if (userJid == null) {
                C18070vi.A11("productOwnerJid");
                throw null;
            }
            productBottomSheetViewModel.A03 = userJid;
            AnonymousClass00H r0 = this.A0F;
            if (r0 != null) {
                C199419zy r1 = (C199419zy) r0.get();
                UserJid userJid2 = this.A08;
                if (userJid2 == null) {
                    C18070vi.A11("productOwnerJid");
                    throw null;
                } else {
                    r1.A01(userJid2);
                }
            } else {
                C18070vi.A11("openVariantsPageLogger");
                throw null;
            }
        } else {
            throw AnonymousClass000.A0n("ProductBottomSheet requires a product owner id");
        }
    }
}
