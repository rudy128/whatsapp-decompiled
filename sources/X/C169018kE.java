package X;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.businesscollection.view.activity.CollectionProductListActivity;
import com.whatsapp.businesscollection.viewmodel.CollectionProductListViewModel$fetchProductsFromStart$1;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.8kE  reason: invalid class name and case insensitive filesystem */
public abstract class C169018kE extends C166788dy {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public C22417B6z A03;
    public C26911Ty A04;
    public B7A A05;
    public AnonymousClass8F7 A06;
    public A8Q A07;
    public C20005A2v A08;
    public AnonymousClass8F1 A09;
    public C167928i0 A0A;
    public AnonymousClass1M9 A0B;
    public AnonymousClass1PM A0C;
    public C24921Me A0D;
    public UserJid A0E;
    public AnonymousClass2UJ A0F;
    public C20004A2u A0G;
    public WDSButton A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public C18600wl A0U;
    public final C180579Nc A0V = new C167948i2(this, 4);
    public final C168128iM A0W = new C168128iM(this, 2);

    public boolean onCreateOptionsMenu(Menu menu) {
        TextView textView;
        C18070vi.A0d(menu, 0);
        MenuItem findItem = menu.findItem(2131432496);
        findItem.setVisible(false);
        AnonymousClass8BY.A0i(findItem);
        View actionView = findItem.getActionView();
        if (actionView != null) {
            AnonymousClass3Ma.A1C(actionView, this, 48);
        }
        View actionView2 = findItem.getActionView();
        if (actionView2 != null) {
            textView = C17880vN.A0E(actionView2, 2131428886);
        } else {
            textView = null;
        }
        String str = this.A0Q;
        if (!(str == null || textView == null)) {
            textView.setText(str);
        }
        AnonymousClass8F7 r0 = this.A06;
        if (r0 == null) {
            C18070vi.A11("cartMenuViewModel");
            throw null;
        }
        C20339AGv.A00(this, r0.A00, new B0Z(findItem, this), 19);
        AnonymousClass8F7 r02 = this.A06;
        if (r02 == null) {
            C18070vi.A11("cartMenuViewModel");
            throw null;
        }
        r02.A0V();
        return super.onCreateOptionsMenu(menu);
    }

    public final AnonymousClass8F1 A4b() {
        AnonymousClass8F1 r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("collectionProductListViewModel");
        throw null;
    }

    public final UserJid A4c() {
        UserJid userJid = this.A0E;
        if (userJid != null) {
            return userJid;
        }
        C18070vi.A11("userJid");
        throw null;
    }

    public final String A4d() {
        String str = this.A0R;
        if (str != null) {
            return str;
        }
        C18070vi.A11("collectionId");
        throw null;
    }

    public void onDestroy() {
        String str;
        AnonymousClass00H r0 = this.A0L;
        if (r0 != null) {
            C17880vN.A0V(r0).unregisterObserver(this.A0V);
            AnonymousClass00H r02 = this.A0P;
            if (r02 != null) {
                C17880vN.A0V(r02).unregisterObserver(this.A0W);
                C20005A2v a2v = this.A08;
                if (a2v != null) {
                    a2v.A02();
                    AnonymousClass00H r03 = this.A0N;
                    if (r03 != null) {
                        AnonymousClass3MY.A1L(((CatalogManager) r03.get()).A05, false);
                        C20004A2u a2u = this.A0G;
                        if (a2u != null) {
                            a2u.A06("view_collection_details_tag", false);
                            super.onDestroy();
                            return;
                        }
                        str = "bizQPLManager";
                    } else {
                        str = "catalogManager";
                    }
                } else {
                    str = "loadSession";
                }
            } else {
                str = "productObservers";
            }
        } else {
            str = "cartObservers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A03(C169018kE r4) {
        RecyclerView recyclerView;
        View findViewById = r4.findViewById(2131435339);
        C18070vi.A0b(findViewById);
        C167928i0 r0 = r4.A0A;
        int i = 0;
        if (r0 == null || r0.A08.isEmpty() || (recyclerView = r4.A02) == null || !recyclerView.canScrollVertically(1)) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    public static final void A0Q(C169018kE r4) {
        C167928i0 r0;
        AnonymousClass8F1 A4b = r4.A4b();
        C21451AkI.A01(A4b.A06, A4b, r4.A4c(), 41);
        WDSButton wDSButton = r4.A0H;
        if (wDSButton != null) {
            C167928i0 r02 = r4.A0A;
            int i = 0;
            if (r02 == null || r02.A08.isEmpty() || (r0 = r4.A0A) == null || !C72463Mc.A1Y(r0.A01)) {
                i = 8;
            }
            wDSButton.setVisibility(i);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        C37971qU r3;
        super.onCreate(bundle);
        Intent A052 = AnonymousClass8BS.A05(this, 2131624554);
        UserJid A042 = UserJid.Companion.A04(A052.getStringExtra("cache_jid"));
        if (A042 != null) {
            this.A0E = A042;
            String stringExtra = A052.getStringExtra("collection_id");
            if (stringExtra != null) {
                this.A0R = stringExtra;
                String stringExtra2 = A052.getStringExtra("collection_name");
                if (stringExtra2 != null) {
                    this.A0T = stringExtra2;
                    this.A0S = A052.getStringExtra("collection_index");
                    this.A00 = A052.getIntExtra("category_browsing_entry_point", -1);
                    this.A01 = A052.getIntExtra("category_level", -1);
                    if (!C18070vi.A18(A4d(), "catalog_products_all_items_collection_id")) {
                        C20004A2u a2u = this.A0G;
                        if (a2u != null) {
                            a2u.A01(774780089, "view_collection_details_tag", "CollectionProductListBaseActivity");
                            C20004A2u a2u2 = this.A0G;
                            if (a2u2 != null) {
                                boolean z = true;
                                a2u2.A05("view_collection_details_tag", "IsConsumer", !this.A02.A0O(A4c()));
                                C20004A2u a2u3 = this.A0G;
                                if (a2u3 != null) {
                                    String A4d = A4d();
                                    AnonymousClass00H r0 = this.A0M;
                                    if (r0 != null) {
                                        if (((C20114A7x) r0.get()).A08(A4c(), A4d) == null) {
                                            z = false;
                                        }
                                        a2u3.A05("view_collection_details_tag", "Cached", z);
                                    } else {
                                        str = "catalogCacheManager";
                                        C18070vi.A11(str);
                                        throw null;
                                    }
                                }
                            }
                        }
                        str = "bizQPLManager";
                        C18070vi.A11(str);
                        throw null;
                    }
                    WDSButton wDSButton = (WDSButton) findViewById(2131436781);
                    this.A0H = wDSButton;
                    if (wDSButton != null) {
                        AFN.A00(wDSButton, this, 6);
                    }
                    String str2 = this.A0T;
                    if (str2 != null) {
                        AnonymousClass8BX.A11(this, str2);
                        this.A02 = (RecyclerView) findViewById(2131434118);
                        CollectionProductListActivity collectionProductListActivity = (CollectionProductListActivity) this;
                        AOB aob = new AOB(collectionProductListActivity, 0);
                        AOC aoc = new AOC(collectionProductListActivity, 2);
                        C56482hX r6 = collectionProductListActivity.A00;
                        if (r6 != null) {
                            UserJid A4c = collectionProductListActivity.A4c();
                            String A4d2 = collectionProductListActivity.A4d();
                            String str3 = collectionProductListActivity.A0S;
                            int i = 897451937;
                            if (collectionProductListActivity.A00 != -1) {
                                i = 897451370;
                            }
                            collectionProductListActivity.A0A = r6.A00(new C182919Wf(i), aob, aoc, A4c, A4d2, str3);
                            RecyclerView recyclerView = this.A02;
                            if (recyclerView != null) {
                                recyclerView.setAdapter(this.A0A);
                            }
                            RecyclerView recyclerView2 = this.A02;
                            if (recyclerView2 != null) {
                                recyclerView2.A0H = new AHN(2);
                                AnonymousClass3Ma.A15(this, recyclerView2);
                            }
                            RecyclerView recyclerView3 = this.A02;
                            C37961qT r32 = null;
                            if (recyclerView3 != null) {
                                r32 = recyclerView3.A0C;
                            }
                            if ((r32 instanceof C37971qU) && (r3 = (C37971qU) r32) != null) {
                                r3.A00 = false;
                            }
                            AnonymousClass00H r2 = this.A0P;
                            if (r2 != null) {
                                C17880vN.A0V(r2).registerObserver(this.A0W);
                                UserJid A4c2 = A4c();
                                B7A b7a = this.A05;
                                if (b7a != null) {
                                    this.A06 = (AnonymousClass8F7) AHF.A00(this, b7a, A4c2);
                                    UserJid A4c3 = A4c();
                                    Application application = getApplication();
                                    C18070vi.A0X(application);
                                    AnonymousClass00H r22 = this.A0N;
                                    if (r22 != null) {
                                        CatalogManager catalogManager = (CatalogManager) C18070vi.A0E(r22);
                                        C22417B6z b6z = this.A03;
                                        if (b6z != null) {
                                            C192829p3 BGF = b6z.BGF(A4c());
                                            AnonymousClass2UJ r10 = this.A0F;
                                            if (r10 != null) {
                                                AnonymousClass00H r23 = this.A0J;
                                                if (r23 != null) {
                                                    C196469v7 r62 = (C196469v7) C18070vi.A0E(r23);
                                                    AnonymousClass10I r11 = this.A05;
                                                    C18070vi.A0W(r11);
                                                    C18600wl r12 = this.A0U;
                                                    if (r12 != null) {
                                                        AnonymousClass00H r24 = this.A0K;
                                                        if (r24 != null) {
                                                            AnonymousClass8F1 r25 = (AnonymousClass8F1) AnonymousClass8BR.A0C(new AHA(application, BGF, r62, (C185479ce) C18070vi.A0E(r24), catalogManager, A4c3, r10, r11, r12), this).A00(AnonymousClass8F1.class);
                                                            C18070vi.A0d(r25, 0);
                                                            this.A09 = r25;
                                                            AnonymousClass00H r02 = this.A0L;
                                                            if (r02 != null) {
                                                                C17880vN.A0V(r02).registerObserver(this.A0V);
                                                                C20339AGv.A00(this, A4b().A02.A03, new C21728Are(this, 16), 19);
                                                                C20339AGv.A00(this, A4b().A04.A03, new C21728Are(this, 17), 19);
                                                                C20339AGv.A00(this, A4b().A04.A05, new C22137AyF(this), 19);
                                                                C20339AGv.A00(this, A4b().A01, new C21728Are(this, 18), 19);
                                                                Log.i("CollectionProductListBaseActivity fetchProductsFromStart");
                                                                AnonymousClass8F1 A4b = A4b();
                                                                UserJid A4c4 = A4c();
                                                                String A4d3 = A4d();
                                                                boolean A1S = AnonymousClass000.A1S(this.A00, -1);
                                                                AnonymousClass3MW.A1X(A4b.A07, new CollectionProductListViewModel$fetchProductsFromStart$1(A4b, A4c4, A4d3, (C30391dr) null, A1S), C41561wd.A00(A4b));
                                                                RecyclerView recyclerView4 = this.A02;
                                                                if (recyclerView4 != null) {
                                                                    AnonymousClass8ID.A00(recyclerView4, this, 5);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            str = "cartObservers";
                                                        } else {
                                                            str = "cartManager";
                                                        }
                                                    } else {
                                                        str = "ioDispatcher";
                                                    }
                                                } else {
                                                    str = "cartItemsHasVariantsUsecase";
                                                }
                                            } else {
                                                str = "orderFragments";
                                            }
                                        } else {
                                            str = "catalogListRepositoryFactory";
                                        }
                                    } else {
                                        str = "catalogManager";
                                    }
                                } else {
                                    str = "cartMenuViewModelFactory";
                                }
                            } else {
                                str = "productObservers";
                            }
                        } else {
                            str = "collectionProductListAdapterFactory";
                        }
                    } else {
                        str = "collectionName";
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                throw AnonymousClass000.A0n("Required value was null.");
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public void onResume() {
        A4b().A02.A00();
        super.onResume();
    }
}
