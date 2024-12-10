package X;

import androidx.fragment.app.Fragment;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ayo  reason: case insensitive filesystem */
public final class C22172Ayo extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22172Ayo(CatalogSearchFragment catalogSearchFragment) {
        super(1);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CatalogSearchProductListFragment catalogSearchProductListFragment;
        C167928i0 r1;
        boolean z;
        C184309ak r12;
        C18100vl r0;
        AnonymousClass9XE r7 = (AnonymousClass9XE) obj;
        Fragment A0Q = this.this$0.A1E().A0Q("SEARCH_RESULT_LIST_FRAGMENT");
        if (A0Q instanceof CatalogSearchProductListFragment) {
            catalogSearchProductListFragment = (CatalogSearchProductListFragment) A0Q;
        } else {
            catalogSearchProductListFragment = null;
        }
        if ((r7 instanceof AnonymousClass8m8) || (r7 instanceof AnonymousClass8m7)) {
            if (catalogSearchProductListFragment != null) {
                r1 = catalogSearchProductListFragment.A26();
                z = true;
            }
            return C27621Wu.A00;
        }
        if (r7 instanceof AnonymousClass8mA) {
            if (catalogSearchProductListFragment != null) {
                catalogSearchProductListFragment.A29();
            }
        } else if (!(r7 instanceof AnonymousClass8m9)) {
            if (!(r7 instanceof AnonymousClass8mB)) {
                if (r7 instanceof AnonymousClass8m5) {
                    CatalogSearchFragment catalogSearchFragment = this.this$0;
                    AnonymousClass9MB r13 = ((AnonymousClass8m5) r7).A00;
                    if (r13 instanceof AnonymousClass8m3) {
                        r0 = catalogSearchFragment.A0N;
                    } else if (r13 instanceof AnonymousClass8m4) {
                        r0 = catalogSearchFragment.A0O;
                    }
                    C26155CtN ctN = (C26155CtN) r0.getValue();
                    if (!ctN.A0D()) {
                        ctN.A08();
                    }
                } else if (r7 instanceof AnonymousClass8m6) {
                    CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) this.this$0.A0P.getValue();
                    AnonymousClass9MB r14 = ((AnonymousClass8m6) r7).A00;
                    if (r14 instanceof AnonymousClass8m3) {
                        r12 = AnonymousClass8mE.A00;
                    } else if (r14 instanceof AnonymousClass8m4) {
                        r12 = AnonymousClass8mF.A00;
                    }
                    CatalogSearchViewModel.A00(catalogSearchViewModel, new AnonymousClass8mI(r12));
                } else {
                    if (r7 instanceof AnonymousClass8mC) {
                        CatalogSearchViewModel.A00((CatalogSearchViewModel) this.this$0.A0P.getValue(), new AnonymousClass8mI(AnonymousClass8mG.A00));
                    }
                    return C27621Wu.A00;
                }
            }
            if (catalogSearchProductListFragment != null) {
                r1 = catalogSearchProductListFragment.A26();
                z = false;
            }
            return C27621Wu.A00;
        }
        C18070vi.A0b(r7);
        List list = r7.A00;
        ArrayList<C169598lz> A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (next instanceof C169598lz) {
                A13.add(next);
            }
        }
        ArrayList A0D = C29351c6.A0D(A13);
        for (C169598lz r02 : A13) {
            A0D.add(r02.A00);
        }
        if (catalogSearchProductListFragment != null) {
            catalogSearchProductListFragment.A26().A0c(false);
            C26911Ty r4 = catalogSearchProductListFragment.A01;
            if (r4 != null) {
                r4.A0D(new C20471AMi(catalogSearchProductListFragment, A0D, 9), catalogSearchProductListFragment.A27());
            } else {
                C18070vi.A11("businessProfileManager");
                throw null;
            }
        }
        return C27621Wu.A00;
        r1.A0c(z);
        return C27621Wu.A00;
    }
}
