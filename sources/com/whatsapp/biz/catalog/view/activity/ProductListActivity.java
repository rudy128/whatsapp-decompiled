package com.whatsapp.biz.catalog.view.activity;

import X.A5T;
import X.A7D;
import X.A8Q;
import X.AER;
import X.AFU;
import X.AGB;
import X.AH8;
import X.AHF;
import X.AHN;
import X.AOC;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1K2;
import X.AnonymousClass2UJ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BX;
import X.AnonymousClass8BY;
import X.AnonymousClass8F5;
import X.AnonymousClass8F7;
import X.AnonymousClass8I0;
import X.AnonymousClass8ID;
import X.B0U;
import X.B7A;
import X.C000200d;
import X.C010105w;
import X.C137116uw;
import X.C167948i2;
import X.C1770196v;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C180579Nc;
import X.C18070vi;
import X.C182509Uq;
import X.C182519Ur;
import X.C185549cl;
import X.C192829p3;
import X.C20004A2u;
import X.C20005A2v;
import X.C20151A9n;
import X.C20292AFa;
import X.C20339AGv;
import X.C22126Ay4;
import X.C22127Ay5;
import X.C22128Ay6;
import X.C22417B6z;
import X.C23520Bik;
import X.C26911Ty;
import X.C30361do;
import X.C32951i1;
import X.C37971qU;
import X.C56412hQ;
import X.C63662tU;
import X.C63932tv;
import X.C73203Rj;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public final class ProductListActivity extends AnonymousClass1FY {
    public View A00;
    public C010105w A01;
    public C010105w A02;
    public RecyclerView A03;
    public C23520Bik A04;
    public C182509Uq A05;
    public C182519Ur A06;
    public C22417B6z A07;
    public C26911Ty A08;
    public B7A A09;
    public AnonymousClass8F7 A0A;
    public C185549cl A0B;
    public A8Q A0C;
    public C20005A2v A0D;
    public AnonymousClass8I0 A0E;
    public AnonymousClass8F5 A0F;
    public C32951i1 A0G;
    public UserJid A0H;
    public AnonymousClass2UJ A0I;
    public C20004A2u A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public String A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public WDSButton A0S;
    public boolean A0T;
    public final C180579Nc A0U;

    public boolean onCreateOptionsMenu(Menu menu) {
        TextView textView;
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820546, menu);
        MenuItem findItem = menu.findItem(2131432499);
        menu.findItem(2131432516).setVisible(false);
        findItem.setVisible(false);
        MenuItem findItem2 = menu.findItem(2131432496);
        findItem2.setVisible(false);
        AnonymousClass8BY.A0i(findItem2);
        View actionView = findItem2.getActionView();
        if (actionView != null) {
            AnonymousClass3Ma.A1C(actionView, this, 27);
        }
        View actionView2 = findItem2.getActionView();
        if (actionView2 != null) {
            textView = C17880vN.A0E(actionView2, 2131428886);
        } else {
            textView = null;
        }
        String str = this.A0N;
        if (!(str == null || textView == null)) {
            textView.setText(str);
        }
        AnonymousClass8F7 r0 = this.A0A;
        if (r0 == null) {
            C18070vi.A11("cartMenuViewModel");
            throw null;
        }
        C20339AGv.A00(this, r0.A00, new B0U(findItem2, this), 7);
        AnonymousClass8F7 r02 = this.A0A;
        if (r02 == null) {
            C18070vi.A11("cartMenuViewModel");
            throw null;
        }
        r02.A0V();
        return super.onCreateOptionsMenu(menu);
    }

    public static final void A03(ProductListActivity productListActivity) {
        View findViewById;
        int i;
        if (productListActivity.A0O) {
            findViewById = productListActivity.findViewById(2131435339);
            i = 8;
        } else {
            RecyclerView recyclerView = productListActivity.A03;
            if (recyclerView == null) {
                C18070vi.A11("productListRecyclerView");
                throw null;
            }
            boolean canScrollVertically = recyclerView.canScrollVertically(1);
            findViewById = productListActivity.findViewById(2131435339);
            i = 4;
            if (canScrollVertically) {
                i = 0;
            }
        }
        findViewById.setVisibility(i);
    }

    public static final void A0Q(ProductListActivity productListActivity) {
        WDSButton wDSButton = productListActivity.A0S;
        if (wDSButton != null) {
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = productListActivity.A0N;
            AnonymousClass3MY.A0y(productListActivity, wDSButton, A1a, 2131894787);
            if (!productListActivity.A0O) {
                AnonymousClass8I0 r0 = productListActivity.A0E;
                if (r0 == null) {
                    C18070vi.A11("productSectionsListAdapter");
                    throw null;
                } else if (r0.A02) {
                    WDSButton wDSButton2 = productListActivity.A0S;
                    if (wDSButton2 != null) {
                        wDSButton2.setVisibility(0);
                        return;
                    }
                }
            }
            WDSButton wDSButton3 = productListActivity.A0S;
            if (wDSButton3 != null) {
                wDSButton3.setVisibility(8);
                return;
            }
        }
        C18070vi.A11("viewCartButton");
        throw null;
    }

    public void A2y() {
        if (!this.A0T) {
            this.A0T = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r3 = A002.AAQ;
            C63932tv.A02(r3, this);
            AnonymousClass10G r2 = r3.A00;
            C63932tv.A01(r3, r2, this);
            C63662tU.A00(r3, r2, this, r2.A5A);
            this.A05 = (C182509Uq) A002.A2j.get();
            this.A0J = AnonymousClass8BT.A0W(r3);
            this.A08 = AnonymousClass8BT.A0D(r3);
            this.A09 = (B7A) A002.A2T.get();
            this.A0K = C000200d.A00(r3.AGs);
            this.A0C = AnonymousClass8BU.A0D(r3);
            this.A0L = C000200d.A00(r3.A1r);
            this.A07 = (C22417B6z) A002.A2N.get();
            this.A0D = (C20005A2v) A002.A0X.get();
            this.A0G = (C32951i1) r3.A28.get();
            this.A0M = AnonymousClass8BT.A0h(r3);
            this.A0I = (AnonymousClass2UJ) r2.A3d.get();
            this.A06 = (C182519Ur) A002.A2l.get();
        }
    }

    public void A3K() {
        String str;
        if (C18020vd.A05(C18040vf.A02, this.A0E, 6715)) {
            AnonymousClass00H r0 = this.A0M;
            if (r0 != null) {
                C30361do A0u = AnonymousClass3MX.A0u(r0);
                UserJid userJid = this.A0H;
                if (userJid == null) {
                    str = "businessId";
                } else {
                    A0u.A02(userJid, 60);
                    return;
                }
            } else {
                str = "navigationTimeSpentManager";
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public final A8Q A4b() {
        A8Q a8q = this.A0C;
        if (a8q != null) {
            return a8q;
        }
        C18070vi.A11("catalogAnalyticManager");
        throw null;
    }

    public void onResume() {
        AnonymousClass8F5 r0 = this.A0F;
        if (r0 != null) {
            r0.A0T();
            AnonymousClass8F5 r02 = this.A0F;
            if (r02 != null) {
                r02.A04.A00();
                super.onResume();
                return;
            }
        }
        C18070vi.A11("productListViewModel");
        throw null;
    }

    public ProductListActivity(int i) {
        this.A0T = false;
        AGB.A00(this, 18);
    }

    /* JADX WARNING: type inference failed for: r0v35, types: [java.lang.Object, X.1uz] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.A7D, java.lang.Object] */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C20004A2u a2u = this.A0J;
        if (a2u != null) {
            a2u.A01(774777097, "plm_details_view_tag", "ProductListActivity");
            AnonymousClass8BX.A11(this, AnonymousClass8BS.A05(this, 2131624096).getStringExtra("message_title"));
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A0T(false);
            A002.A0D(2131896261);
            C20151A9n.A00(A002, this, 20, 2131899286);
            this.A01 = AnonymousClass3MY.A0L(A002);
            C73203Rj A003 = AnonymousClass4a6.A00(this);
            A003.A0T(false);
            A003.A0D(2131891510);
            C20151A9n.A00(A003, this, 21, 2131899286);
            this.A02 = AnonymousClass3MY.A0L(A003);
            AnonymousClass00H r0 = this.A0K;
            if (r0 != null) {
                C17880vN.A0V(r0).registerObserver(this.A0U);
                AER aer = (AER) getIntent().getParcelableExtra("message_content");
                if (aer != null) {
                    UserJid userJid = aer.A00;
                    this.A0H = userJid;
                    str = "businessId";
                    C22417B6z b6z = this.A07;
                    if (b6z != null) {
                        C192829p3 BGF = b6z.BGF(userJid);
                        AnonymousClass2UJ r12 = this.A0I;
                        if (r12 != null) {
                            C182519Ur r9 = this.A06;
                            if (r9 != null) {
                                AnonymousClass8F5 r02 = (AnonymousClass8F5) AnonymousClass8BR.A0C(new AH8(r9, BGF, userJid, r12, aer), this).A00(AnonymousClass8F5.class);
                                this.A0F = r02;
                                if (r02 != null) {
                                    C20339AGv.A00(this, r02.A04.A03, new C22126Ay4(this), 7);
                                    UserJid userJid2 = this.A0H;
                                    if (userJid2 != null) {
                                        B7A b7a = this.A09;
                                        if (b7a != null) {
                                            this.A0A = (AnonymousClass8F7) AHF.A00(this, b7a, userJid2);
                                            this.A00 = AnonymousClass3MY.A0H(this, 2131433147);
                                            int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131168336);
                                            int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131168337);
                                            View view = this.A00;
                                            if (view == null) {
                                                str = "noInternetConnectionView";
                                            } else {
                                                view.setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, 0);
                                                AFU.A00(findViewById(2131433148), this, 48);
                                                WDSButton wDSButton = (WDSButton) AnonymousClass3MY.A0H(this, 2131436781);
                                                this.A0S = wDSButton;
                                                if (wDSButton == null) {
                                                    str = "viewCartButton";
                                                } else {
                                                    AFU.A00(wDSButton, this, 49);
                                                    RecyclerView recyclerView = (RecyclerView) AnonymousClass3MY.A0H(this, 2131434118);
                                                    this.A03 = recyclerView;
                                                    if (recyclerView != null) {
                                                        C37971qU r03 = (C37971qU) recyclerView.A0C;
                                                        if (r03 != null) {
                                                            r03.A00 = false;
                                                        }
                                                        recyclerView.A0r(new Object());
                                                        C182509Uq r04 = this.A05;
                                                        if (r04 != null) {
                                                            AOC aoc = new AOC(this, 1);
                                                            UserJid userJid3 = this.A0H;
                                                            if (userJid3 != null) {
                                                                AnonymousClass1K2 r1 = r04.A00;
                                                                AnonymousClass10E r05 = r1.A01;
                                                                C18030ve A8r = AnonymousClass10E.A8r(r05);
                                                                AnonymousClass8I0 r8 = new AnonymousClass8I0((C56412hQ) r1.A00.A2b.get(), AnonymousClass10E.A17(r05), aoc, A8r, userJid3);
                                                                this.A0E = r8;
                                                                RecyclerView recyclerView2 = this.A03;
                                                                if (recyclerView2 != null) {
                                                                    recyclerView2.setAdapter(r8);
                                                                    RecyclerView recyclerView3 = this.A03;
                                                                    if (recyclerView3 != null) {
                                                                        recyclerView3.A0H = new AHN(1);
                                                                        AnonymousClass8F5 r06 = this.A0F;
                                                                        if (r06 != null) {
                                                                            C20339AGv.A00(this, r06.A00, new C22127Ay5(this), 7);
                                                                            AnonymousClass8F5 r07 = this.A0F;
                                                                            if (r07 != null) {
                                                                                C20339AGv.A00(this, r07.A01, new C22128Ay6(this), 7);
                                                                                RecyclerView recyclerView4 = this.A03;
                                                                                if (recyclerView4 != null) {
                                                                                    AnonymousClass8ID.A00(recyclerView4, this, 3);
                                                                                    RecyclerView recyclerView5 = this.A03;
                                                                                    if (recyclerView5 != null) {
                                                                                        recyclerView5.setOnTouchListener(new C20292AFa(this, 0));
                                                                                        this.A0P = false;
                                                                                        C32951i1 r13 = this.A0G;
                                                                                        if (r13 != null) {
                                                                                            UserJid userJid4 = this.A0H;
                                                                                            if (userJid4 != null) {
                                                                                                r13.A0F(userJid4, 0);
                                                                                                if (C18020vd.A05(C18040vf.A02, this.A0E, 10626) && !this.A0R) {
                                                                                                    this.A0R = true;
                                                                                                    A8Q A4b = A4b();
                                                                                                    ? obj = new Object();
                                                                                                    obj.A0B = A4b().A03;
                                                                                                    A8Q.A04(obj, A4b());
                                                                                                    A8Q.A05(obj, this);
                                                                                                    A8Q.A03(obj, A4b());
                                                                                                    A7D.A01(obj, 53);
                                                                                                    UserJid userJid5 = this.A0H;
                                                                                                    if (userJid5 != null) {
                                                                                                        obj.A00 = userJid5;
                                                                                                        AnonymousClass8F5 r2 = this.A0F;
                                                                                                        if (r2 != null) {
                                                                                                            obj.A0A = A5T.A01((C1770196v) r2.A0B.get(), r2.A09);
                                                                                                            A4b.A09(obj);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                this.A0B = A4b().A07();
                                                                                                return;
                                                                                            }
                                                                                        } else {
                                                                                            str = "chatMessageCounts";
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        C18070vi.A11("productListViewModel");
                                                                        throw null;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            str = "adapterFactory";
                                                        }
                                                    }
                                                    C18070vi.A11("productListRecyclerView");
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            str = "cartMenuViewModelFactory";
                                        }
                                    }
                                }
                                str = "productListViewModel";
                            } else {
                                str = "productListViewModelFactory";
                            }
                        } else {
                            str = "orderFragments";
                        }
                    } else {
                        str = "catalogListRepositoryFactory";
                    }
                } else {
                    return;
                }
            } else {
                str = "cartObservers";
            }
        } else {
            str = "bizQPLManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDestroy() {
        String str;
        super.onDestroy();
        AnonymousClass00H r0 = this.A0K;
        if (r0 != null) {
            C17880vN.A0V(r0).unregisterObserver(this.A0U);
            C20004A2u a2u = this.A0J;
            if (a2u != null) {
                a2u.A06("plm_details_view_tag", false);
                return;
            }
            str = "bizQPLManager";
        } else {
            str = "cartObservers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onStop() {
        super.onStop();
        this.A0P = false;
    }

    public ProductListActivity() {
        this(0);
        this.A0O = true;
        this.A0U = new C167948i2(this, 1);
    }
}
