package com.whatsapp.businessproductlist.view.fragment;

import X.A8Q;
import X.AOA;
import X.AOB;
import X.AOC;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass2UJ;
import X.AnonymousClass3MZ;
import X.AnonymousClass48l;
import X.AnonymousClass8F7;
import X.AnonymousClass8FU;
import X.AnonymousClass8ID;
import X.AnonymousClass8l7;
import X.AnonymousClass9M1;
import X.AnonymousClass9VR;
import X.B7A;
import X.B7Q;
import X.C167928i0;
import X.C167948i2;
import X.C168128iM;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C180579Nc;
import X.C18070vi;
import X.C18100vl;
import X.C182919Wf;
import X.C20005A2v;
import X.C20339AGv;
import X.C21528Alb;
import X.C21535Ali;
import X.C22369B4x;
import X.C22417B6z;
import X.C22437B7t;
import X.C24921Me;
import X.C36251na;
import X.C37961qT;
import X.C56412hQ;
import X.C56482hX;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class BusinessProductListBaseFragment extends Hilt_BusinessProductListBaseFragment {
    public RecyclerView A00;
    public C22417B6z A01;
    public B7A A02;
    public A8Q A03;
    public C20005A2v A04;
    public C167928i0 A05;
    public C22437B7t A06;
    public C18000vb A07;
    public UserJid A08;
    public AnonymousClass2UJ A09;
    public AnonymousClass10I A0A;
    public WDSButton A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public Integer A0G = AnonymousClass00R.A00;
    public final C180579Nc A0H = new C167948i2(this, 5);
    public final B7Q A0I = new AOA();
    public final C22369B4x A0J = new AOC(this, 3);
    public final C18100vl A0K = C21528Alb.A00(this, 26);
    public final C18100vl A0L = C21528Alb.A00(this, 24);
    public final C18100vl A0M = C21528Alb.A00(this, 25);
    public final AnonymousClass9M1 A0N = new C168128iM(this, 3);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625351, viewGroup, false);
        View findViewById = inflate.findViewById(2131434118);
        C18070vi.A0z(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        this.A00 = (RecyclerView) findViewById;
        View findViewById2 = inflate.findViewById(2131436782);
        C18070vi.A0z(findViewById2, "null cannot be cast to non-null type com.whatsapp.wds.components.button.WDSButton");
        this.A0B = (WDSButton) findViewById2;
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1x(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            super.A1x(r4)
            boolean r0 = r4 instanceof X.C22437B7t
            r2 = 0
            if (r0 == 0) goto L_0x0030
            r0 = r4
            X.B7t r0 = (X.C22437B7t) r0
        L_0x000f:
            r3.A06 = r0
            if (r0 != 0) goto L_0x0032
            androidx.fragment.app.Fragment r1 = r3.A0E
            boolean r0 = r1 instanceof X.C22437B7t
            if (r0 == 0) goto L_0x001c
            r2 = r1
            X.B7t r2 = (X.C22437B7t) r2
        L_0x001c:
            r3.A06 = r2
            if (r2 != 0) goto L_0x0032
            java.lang.StringBuilder r1 = X.C17890vO.A0f(r4)
            java.lang.String r0 = " must implement BusinessProductListBaseFragment.BusinessProductListHost"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            throw r0
        L_0x0030:
            r0 = r2
            goto L_0x000f
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment.A1x(android.content.Context):void");
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C167928i0 A002;
        C18070vi.A0d(view, 0);
        if (this instanceof CatalogSearchProductListFragment) {
            CatalogSearchProductListFragment catalogSearchProductListFragment = (CatalogSearchProductListFragment) this;
            AnonymousClass9VR r2 = catalogSearchProductListFragment.A00;
            if (r2 != null) {
                UserJid A27 = catalogSearchProductListFragment.A27();
                C22369B4x b4x = catalogSearchProductListFragment.A0J;
                AOB aob = new AOB(catalogSearchProductListFragment, 1);
                C36251na r3 = r2.A00;
                AnonymousClass10E r22 = r3.A02;
                AnonymousClass1KB A12 = AnonymousClass10E.A12(r22);
                AnonymousClass11S A17 = AnonymousClass10E.A17(r22);
                AnonymousClass1M9 A4z = AnonymousClass10E.A4z(r22);
                C24921Me A0g = AnonymousClass3MZ.A0g(r22);
                C18000vb A6Q = AnonymousClass10E.A6Q(r22);
                AnonymousClass1PM A0f = AnonymousClass3MZ.A0f(r22);
                AnonymousClass1K1 r1 = r3.A00;
                C18030ve A8r = AnonymousClass10E.A8r(r22);
                A002 = new AnonymousClass8l7(catalogSearchProductListFragment, AnonymousClass3MZ.A0N(r22), (C56412hQ) r1.A2b.get(), A12, A17, (CatalogManager) r22.A1s.get(), (C20005A2v) r1.A0X.get(), aob, b4x, A4z, A0f, A0g, A6Q, A8r, A27);
            } else {
                str = "adapterFactory";
                C18070vi.A11(str);
                throw null;
            }
        } else {
            CollectionProductListFragment collectionProductListFragment = (CollectionProductListFragment) this;
            C56482hX r5 = collectionProductListFragment.A02;
            if (r5 != null) {
                UserJid A272 = collectionProductListFragment.A27();
                String str2 = collectionProductListFragment.A0F;
                if (str2 != null) {
                    String str3 = collectionProductListFragment.A0G;
                    int i = 897451937;
                    if (collectionProductListFragment.A00 != -1) {
                        i = 897451370;
                    }
                    A002 = r5.A00(new C182919Wf(i), collectionProductListFragment.A0I, collectionProductListFragment.A0J, A272, str2, str3);
                } else {
                    str = "collectionId";
                }
            } else {
                str = "collectionProductListAdapterFactory";
            }
            C18070vi.A11(str);
            throw null;
        }
        this.A05 = A002;
        RecyclerView recyclerView = this.A00;
        C18070vi.A0b(recyclerView);
        recyclerView.setAdapter(A26());
        RecyclerView recyclerView2 = this.A00;
        C18070vi.A0b(recyclerView2);
        AnonymousClass8ID.A00(recyclerView2, this, 7);
        RecyclerView recyclerView3 = this.A00;
        C18070vi.A0b(recyclerView3);
        recyclerView3.setItemAnimator((C37961qT) null);
        C18100vl r4 = this.A0K;
        C20339AGv.A00(A1G(), ((AnonymousClass8FU) r4.getValue()).A01, C21535Ali.A00(this, 20), 23);
        WDSButton wDSButton = this.A0B;
        C18070vi.A0b(wDSButton);
        wDSButton.setOnClickListener(new AnonymousClass48l(this, 8));
        AnonymousClass00H r12 = this.A0D;
        if (r12 != null) {
            C17880vN.A0V(r12).registerObserver(this.A0H);
            C20339AGv.A00(A1G(), ((AnonymousClass8FU) r4.getValue()).A00, C21535Ali.A00(this, 18), 23);
            C18100vl r42 = this.A0L;
            C20339AGv.A00(A1G(), ((AnonymousClass8F7) r42.getValue()).A00, C21535Ali.A00(this, 19), 23);
            ((AnonymousClass8F7) r42.getValue()).A0V();
            return;
        }
        str = "cartObservers";
        C18070vi.A11(str);
        throw null;
    }

    public static final void A01(BusinessProductListBaseFragment businessProductListBaseFragment, boolean z) {
        WDSButton wDSButton;
        int i;
        if (!z || businessProductListBaseFragment.A26().A08.isEmpty()) {
            wDSButton = businessProductListBaseFragment.A0B;
            C18070vi.A0b(wDSButton);
            i = 8;
        } else {
            wDSButton = businessProductListBaseFragment.A0B;
            C18070vi.A0b(wDSButton);
            i = 0;
        }
        wDSButton.setVisibility(i);
    }

    public void A1r() {
        String str;
        C20005A2v a2v = this.A04;
        if (a2v != null) {
            a2v.A02();
            AnonymousClass00H r0 = this.A0D;
            if (r0 != null) {
                C17880vN.A0V(r0).unregisterObserver(this.A0H);
                AnonymousClass00H r02 = this.A0F;
                if (r02 != null) {
                    C17880vN.A0V(r02).unregisterObserver(this.A0N);
                    super.A1r();
                    return;
                }
                str = "productObservers";
            } else {
                str = "cartObservers";
            }
        } else {
            str = "loadSession";
        }
        C18070vi.A11(str);
        throw null;
    }

    public final C167928i0 A26() {
        C167928i0 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("adapter");
        throw null;
    }

    public final UserJid A27() {
        UserJid userJid = this.A08;
        if (userJid != null) {
            return userJid;
        }
        C18070vi.A11("bizJid");
        throw null;
    }

    public void A1K() {
        super.A1K();
        this.A06 = null;
    }

    public void A1u() {
        super.A1u();
        ((AnonymousClass8FU) this.A0K.getValue()).A02.A00();
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A1Z(true);
        Bundle A15 = A15();
        Parcelable parcelable = A15.getParcelable("category_biz_id");
        C18070vi.A0b(parcelable);
        UserJid userJid = (UserJid) parcelable;
        C18070vi.A0d(userJid, 0);
        this.A08 = userJid;
        this.A0G = AnonymousClass00R.A00(4)[A15.getInt("business_product_list_entry_point")];
        AnonymousClass00H r0 = this.A0F;
        if (r0 != null) {
            C17880vN.A0V(r0).registerObserver(this.A0N);
        } else {
            C18070vi.A11("productObservers");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r1.canScrollVertically(1) == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A28() {
        /*
            r3 = this;
            android.view.View r1 = r3.A17()
            r0 = 2131435339(0x7f0b1f4b, float:1.8492517E38)
            android.view.View r2 = X.AnonymousClass3MX.A0C(r1, r0)
            X.8i0 r0 = r3.A26()
            java.util.List r0 = r0.A08
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0024
            androidx.recyclerview.widget.RecyclerView r1 = r3.A00
            X.C18070vi.A0b(r1)
            r0 = 1
            boolean r1 = r1.canScrollVertically(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0026
        L_0x0024:
            r0 = 8
        L_0x0026:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment.A28():void");
    }
}
