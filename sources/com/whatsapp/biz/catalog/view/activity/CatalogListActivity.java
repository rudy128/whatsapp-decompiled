package com.whatsapp.biz.catalog.view.activity;

import X.AFU;
import X.AGB;
import X.AH2;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1E7;
import X.AnonymousClass1K1;
import X.AnonymousClass1M6;
import X.AnonymousClass1M9;
import X.AnonymousClass1Y5;
import X.AnonymousClass2SS;
import X.AnonymousClass2UJ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8F7;
import X.AnonymousClass8F8;
import X.B7A;
import X.B7J;
import X.B7M;
import X.B7P;
import X.BAO;
import X.C000200d;
import X.C108945cZ;
import X.C108975cc;
import X.C137116uw;
import X.C167938i1;
import X.C168578j9;
import X.C17880vN;
import X.C17900vP;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C182479Un;
import X.C182489Uo;
import X.C182499Up;
import X.C182999Wn;
import X.C190429kv;
import X.C190439kw;
import X.C191899nN;
import X.C19880zA;
import X.C19890zB;
import X.C19988A2a;
import X.C20098A7b;
import X.C20114A7x;
import X.C20151A9n;
import X.C20153A9p;
import X.C202011f;
import X.C20339AGv;
import X.C20479AMq;
import X.C20504ANp;
import X.C21450AkH;
import X.C22114Axs;
import X.C22115Axt;
import X.C22116Axu;
import X.C22117Axv;
import X.C22118Axw;
import X.C22119Axx;
import X.C22120Axy;
import X.C22121Axz;
import X.C22122Ay0;
import X.C22123Ay1;
import X.C22417B6z;
import X.C24921Me;
import X.C30391dr;
import X.C32951i1;
import X.C37511pf;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import X.C72463Mc;
import X.C73203Rj;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel;
import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public final class CatalogListActivity extends C168578j9 implements B7J, BAO, B7M, B7P {
    public C19880zA A00;
    public C19880zA A01;
    public C182489Uo A02;
    public C182499Up A03;
    public WaTextView A04;
    public WaTextView A05;
    public PostcodeViewModel A06;
    public PostcodeChangeBottomSheet A07;
    public C190439kw A08;
    public AnonymousClass1M9 A09;
    public C24921Me A0A;
    public C32951i1 A0B;
    public AnonymousClass2UJ A0C;
    public WDSButton A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public boolean A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass1M6 A0M;

    public void C1E() {
        this.A07 = null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            C190439kw r0 = this.A08;
            if (r0 != null) {
                r0.A00();
            }
            this.A08 = null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820549, menu);
        MenuItem findItem = menu.findItem(2131432499);
        MenuItem findItem2 = menu.findItem(2131432516);
        findItem2.setActionView(2131626016);
        View actionView = findItem2.getActionView();
        if (actionView != null) {
            AnonymousClass3MY.A0w(this, actionView, 2131898776);
        }
        findItem2.setVisible(this.A0Q);
        View actionView2 = findItem2.getActionView();
        if (actionView2 != null) {
            AnonymousClass1Y5.A07(actionView2, "Button");
        }
        View actionView3 = findItem2.getActionView();
        if (actionView3 != null) {
            AnonymousClass3Ma.A1C(actionView3, this, 25);
        }
        findItem.setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }

    public void setPostcodeAndLocationViews(View view) {
        C18070vi.A0d(view, 0);
        this.A05 = AnonymousClass3MW.A0T(view, 2131434010);
        this.A04 = AnonymousClass3MW.A0T(view, 2131434009);
    }

    public static final void A0Q(CatalogListActivity catalogListActivity) {
        String str;
        AnonymousClass00H r0 = catalogListActivity.A0I;
        if (r0 != null) {
            if (((C20114A7x) r0.get()).A0O(catalogListActivity.A4f())) {
                AnonymousClass00H r02 = catalogListActivity.A0I;
                if (r02 != null) {
                    ((C20114A7x) r02.get()).A0J(catalogListActivity.A4f());
                }
            }
            AnonymousClass00H r03 = catalogListActivity.A0H;
            if (r03 != null) {
                ((C19988A2a) r03.get()).A03(catalogListActivity.A4f());
                A03(catalogListActivity);
                return;
            }
            str = "categoryCacheManager";
            C18070vi.A11(str);
            throw null;
        }
        str = "catalogCacheManager";
        C18070vi.A11(str);
        throw null;
    }

    public static final void A0d(CatalogListActivity catalogListActivity, boolean z) {
        PostcodeChangeBottomSheet postcodeChangeBottomSheet = new PostcodeChangeBottomSheet(catalogListActivity, z);
        catalogListActivity.A07 = postcodeChangeBottomSheet;
        PostcodeViewModel postcodeViewModel = catalogListActivity.A06;
        if (postcodeViewModel != null) {
            String A1F = C108945cZ.A1F(postcodeViewModel.A04);
            PostcodeViewModel postcodeViewModel2 = catalogListActivity.A06;
            if (postcodeViewModel2 != null) {
                PostcodeViewModel.A00(postcodeViewModel2, postcodeChangeBottomSheet, A1F);
                PostcodeChangeBottomSheet postcodeChangeBottomSheet2 = catalogListActivity.A07;
                if (postcodeChangeBottomSheet2 != null) {
                    postcodeChangeBottomSheet2.A0B = catalogListActivity.A4f();
                    C20098A7b.A00(postcodeChangeBottomSheet2, catalogListActivity);
                    return;
                }
                return;
            }
        }
        C18070vi.A11("postcodeViewModel");
        throw null;
    }

    public void A2y() {
        if (!this.A0K) {
            this.A0K = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r1 = A002.AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r3 = r1.A00;
            C63932tv.A01(r1, r3, this);
            C63662tU.A00(r1, r3, this, r3.A5A);
            this.A0E = AnonymousClass8BT.A0W(r1);
            this.A03 = AnonymousClass8BT.A0D(r1);
            this.A0F = C000200d.A00(r1.A1K);
            this.A0G = C000200d.A00(r1.A1o);
            this.A04 = (B7A) A002.A2T.get();
            this.A0H = C000200d.A00(r1.AGs);
            this.A07 = AnonymousClass8BU.A0D(r1);
            this.A0I = C000200d.A00(r1.A1q);
            this.A0J = C000200d.A00(r3.A7j);
            this.A02 = (C22417B6z) A002.A2N.get();
            this.A0K = C000200d.A00(r1.A1s);
            this.A0L = C000200d.A00(r1.AGx);
            this.A01 = (C182479Un) A002.A2X.get();
            this.A0B = AnonymousClass3Ma.A0S(r1);
            this.A0C = (C37511pf) r1.AX7.get();
            this.A08 = (C191899nN) r3.A7i.get();
            this.A0M = C000200d.A00(r1.A8o);
            this.A0N = C000200d.A00(r1.A1u);
            this.A0O = AnonymousClass3MW.A0s(r1);
            this.A0E = C000200d.A00(r1.A0x);
            this.A0F = C000200d.A00(r1.A1H);
            this.A02 = (C182489Uo) A002.A2f.get();
            this.A0G = C000200d.A00(A002.A0Y);
            this.A0H = C000200d.A00(r3.A0s);
            this.A0B = (C32951i1) r1.A28.get();
            this.A09 = AnonymousClass10E.A4z(r1);
            this.A0I = AnonymousClass8BT.A0h(r1);
            this.A0C = (AnonymousClass2UJ) r3.A3d.get();
            this.A03 = (C182499Up) A002.A5U.get();
            this.A00 = AnonymousClass8BV.A0A(r1);
            this.A01 = C19890zB.A00;
            this.A0A = AnonymousClass3MZ.A0g(r1);
            this.A0J = C000200d.A00(r1.ABW);
        }
    }

    public void A3K() {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 6715)) {
            AnonymousClass00H r0 = this.A0I;
            if (r0 != null) {
                AnonymousClass3MX.A0u(r0).A02(A4f(), 59);
            } else {
                C18070vi.A11("navigationTimeSpentManager");
                throw null;
            }
        }
    }

    public Dialog onCreateDialog(int i) {
        Dialog onCreateDialog;
        String str;
        if (i == 106) {
            AnonymousClass1M9 r1 = this.A09;
            if (r1 != null) {
                AnonymousClass1E7 A0H2 = r1.A0H(A4f());
                C73203Rj A002 = AnonymousClass4a6.A00(this);
                Object[] A1a = AnonymousClass3MW.A1a();
                C24921Me r0 = this.A0A;
                if (r0 != null) {
                    A002.A0S(C108975cc.A0b(this, r0.A0I(A0H2), A1a, 2131887927));
                    C20153A9p.A00(A002, A0H2, this, 3, 2131897273);
                    A002.A0X(new C20151A9n(this, 19), 2131898766);
                    onCreateDialog = A002.create();
                } else {
                    str = "waContactNames";
                }
            } else {
                str = "contactManager";
            }
            C18070vi.A11(str);
            throw null;
        }
        onCreateDialog = super.onCreateDialog(i);
        C18070vi.A0X(onCreateDialog);
        return onCreateDialog;
    }

    public void onDestroy() {
        try {
            PostcodeChangeBottomSheet postcodeChangeBottomSheet = this.A07;
            if (postcodeChangeBottomSheet != null) {
                postcodeChangeBottomSheet.A28();
            }
        } catch (IllegalStateException e) {
            Log.w(C17900vP.A0C("IllegalStateException dismiss PostcodeChangeBottomSheet: ", AnonymousClass000.A10(), e));
        }
        AnonymousClass00H r0 = this.A0F;
        if (r0 != null) {
            C17880vN.A0V(r0).unregisterObserver(this.A0M);
            super.onDestroy();
            return;
        }
        C18070vi.A11("businessProfileObservers");
        throw null;
    }

    public CatalogListActivity(int i) {
        this.A0K = false;
        AGB.A00(this, 16);
    }

    public static final void A03(CatalogListActivity catalogListActivity) {
        if (catalogListActivity.A4d().A00.size() > 0) {
            catalogListActivity.A4d().A00.clear();
            catalogListActivity.A4d().notifyDataSetChanged();
            catalogListActivity.A4d().A0Z();
        }
        C167938i1 A4d = catalogListActivity.A4d();
        int i = 0;
        do {
            List list = A4d.A00;
            list.add(new C182999Wn(9));
            A4d.A0H(AnonymousClass3MX.A01(list));
            i++;
        } while (i < 3);
        C168578j9.A0q(catalogListActivity);
        catalogListActivity.A4e().A0E.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r3.A4b().canScrollVertically(1) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0V(com.whatsapp.biz.catalog.view.activity.CatalogListActivity r3) {
        /*
            r0 = 2131435339(0x7f0b1f4b, float:1.8492517E38)
            android.view.View r2 = r3.findViewById(r0)
            X.8i1 r0 = r3.A4d()
            java.util.List r0 = r0.A08
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0021
            androidx.recyclerview.widget.RecyclerView r0 = r3.A4b()
            boolean r1 = r0.canScrollVertically(r1)
            r0 = 0
            if (r1 != 0) goto L_0x0023
        L_0x0021:
            r0 = 8
        L_0x0023:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.view.activity.CatalogListActivity.A0V(com.whatsapp.biz.catalog.view.activity.CatalogListActivity):void");
    }

    public static final void A0c(CatalogListActivity catalogListActivity) {
        if (catalogListActivity.A4d().A08.isEmpty() || !C72463Mc.A1Y(catalogListActivity.A4d().A01)) {
            WDSButton wDSButton = catalogListActivity.A0D;
            if (wDSButton != null) {
                wDSButton.setVisibility(8);
                return;
            }
        } else {
            WDSButton wDSButton2 = catalogListActivity.A0D;
            if (wDSButton2 != null) {
                wDSButton2.setVisibility(0);
                AnonymousClass8F8 A4e = catalogListActivity.A4e();
                C21450AkH.A01(A4e.A0R, A4e, catalogListActivity.A4f(), 16);
                return;
            }
        }
        C18070vi.A11("viewCartButton");
        throw null;
    }

    public void A4g(List list) {
        super.A4g(list);
        A0c(this);
        A0V(this);
    }

    public void Bo1() {
        A4e().A0E.A00();
    }

    public void C1F(String str) {
        CNA(2131894565);
        PostcodeViewModel postcodeViewModel = this.A06;
        if (postcodeViewModel == null) {
            C18070vi.A11("postcodeViewModel");
            throw null;
        } else {
            postcodeViewModel.A0U(str);
        }
    }

    public void C1s() {
        A4e().A0E.A00();
    }

    public void onBackPressed() {
        Fragment A0Q = getSupportFragmentManager().A0Q("CatalogSearchFragmentTag");
        if (A0Q == null || !(A0Q instanceof CatalogSearchFragment) || !((CatalogSearchFragment) A0Q).A27()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        WDSButton wDSButton = (WDSButton) AnonymousClass3MY.A0H(this, 2131436781);
        this.A0D = wDSButton;
        if (wDSButton == null) {
            str = "viewCartButton";
        } else {
            AFU.A00(wDSButton, this, 47);
            C32951i1 r2 = this.A0B;
            if (r2 != null) {
                r2.A0F(A4f(), 0);
                C182499Up r3 = this.A03;
                if (r3 != null) {
                    PostcodeViewModel postcodeViewModel = (PostcodeViewModel) AnonymousClass8BR.A0C(new AH2(r3, A4f(), 0), this).A00(PostcodeViewModel.class);
                    this.A06 = postcodeViewModel;
                    if (postcodeViewModel != null) {
                        C20339AGv.A00(this, postcodeViewModel.A04, new C22116Axu(this), 5);
                        PostcodeViewModel postcodeViewModel2 = this.A06;
                        if (postcodeViewModel2 != null) {
                            C20339AGv.A00(this, postcodeViewModel2.A03, new C22117Axv(this), 5);
                            PostcodeViewModel postcodeViewModel3 = this.A06;
                            if (postcodeViewModel3 != null) {
                                C20339AGv.A00(this, postcodeViewModel3.A02, new C22118Axw(this), 5);
                                C20339AGv.A00(this, A4e().A0Q, new C22119Axx(this), 5);
                                C20339AGv.A00(this, A4e().A08, new C22120Axy(this), 5);
                                C20339AGv.A00(this, A4e().A07, new C22121Axz(this), 5);
                                C20339AGv.A00(this, A4e().A0A, new C22122Ay0(this), 5);
                                C20339AGv.A00(this, A4e().A06, new C22123Ay1(this), 5);
                                C20339AGv.A00(this, A4e().A0C, new C22114Axs(this), 5);
                                AnonymousClass8F7 r0 = this.A05;
                                if (r0 != null) {
                                    C20339AGv.A00(this, r0.A00, new C22115Axt(this), 5);
                                    AnonymousClass00H r02 = this.A0F;
                                    if (r02 != null) {
                                        C17880vN.A0V(r02).registerObserver(this.A0M);
                                        AnonymousClass00H r03 = this.A0G;
                                        if (r03 != null) {
                                            ((C190429kv) r03.get()).A00(new C20504ANp(this, 1), A4f());
                                            return;
                                        }
                                        str = "catalogSearchManager";
                                    } else {
                                        str = "businessProfileObservers";
                                    }
                                } else {
                                    str = "cartMenuViewModel";
                                }
                            }
                        }
                    }
                    C18070vi.A11("postcodeViewModel");
                    throw null;
                }
                str = "postcodeViewModelFactory";
            } else {
                str = "chatMessageCounts";
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A0B2 = C72453Mb.A0B(menuItem);
        if (16908332 == A0B2) {
            onBackPressed();
            return true;
        }
        if (2131432499 == A0B2) {
            C19880zA r1 = this.A00;
            if (r1 == null) {
                C18070vi.A11("smbActivities");
                throw null;
            } else if (r1.A07()) {
                r1.A03();
                A4f();
                throw AnonymousClass000.A0s("getCatalogListActivity");
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        AnonymousClass3MX.A1Q(new CatalogListActivity$onResume$1(this, (C30391dr) null), AnonymousClass2SS.A00(this));
    }

    public CatalogListActivity() {
        this(0);
        this.A0L = new C202011f(49516);
        this.A0M = new C20479AMq(this, 1);
    }
}
