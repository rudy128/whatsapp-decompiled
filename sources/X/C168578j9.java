package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8j9  reason: invalid class name and case insensitive filesystem */
public abstract class C168578j9 extends C166758dv {
    public RecyclerView A00;
    public C182479Un A01;
    public C22417B6z A02;
    public C26911Ty A03;
    public B7A A04;
    public AnonymousClass8F7 A05;
    public C185549cl A06;
    public A8Q A07;
    public C191899nN A08;
    public C167938i1 A09;
    public AnonymousClass8F8 A0A;
    public C24671Lf A0B;
    public C37511pf A0C;
    public UserJid A0D;
    public C20004A2u A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public String A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public C23581Gv A0T = new AQ9(this, 1);
    public C20005A2v A0U;
    public final AnonymousClass1M6 A0V = new C20479AMq(this, 2);
    public final C180579Nc A0W = new C167948i2(this, 0);
    public final BAG A0X = new AN2(this);
    public final AnonymousClass9M1 A0Y = new C168128iM(this, 0);

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            C167938i1 A4d = A4d();
            List list = A4d.A00;
            if (list.size() > 0 && (list.get(0) instanceof C168668jU)) {
                list.remove(0);
                A4d.A0I(0);
                return;
            }
            return;
        }
        A4d().A0Z();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        TextView textView;
        C18070vi.A0d(menu, 0);
        MenuItem findItem = menu.findItem(2131432496);
        findItem.setVisible(false);
        AnonymousClass8BY.A0i(findItem);
        View actionView = findItem.getActionView();
        if (actionView != null) {
            AnonymousClass3Ma.A1C(actionView, this, 26);
        }
        View actionView2 = findItem.getActionView();
        if (actionView2 != null) {
            textView = C17880vN.A0E(actionView2, 2131428886);
        } else {
            textView = null;
        }
        String str = this.A0P;
        if (!(str == null || textView == null)) {
            textView.setText(str);
        }
        AnonymousClass8F7 r0 = this.A05;
        if (r0 != null) {
            C20339AGv.A00(this, r0.A00, new B0T(findItem, this), 6);
            AnonymousClass8F7 r02 = this.A05;
            if (r02 != null) {
                r02.A0V();
                return super.onCreateOptionsMenu(menu);
            }
        }
        C18070vi.A11("cartMenuViewModel");
        throw null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("catalog_loaded", this.A0Q);
    }

    public final RecyclerView A4b() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            return recyclerView;
        }
        C18070vi.A11("catalogList");
        throw null;
    }

    public final A8Q A4c() {
        A8Q a8q = this.A07;
        if (a8q != null) {
            return a8q;
        }
        C18070vi.A11("catalogAnalyticManager");
        throw null;
    }

    public final C167938i1 A4d() {
        C167938i1 r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("catalogAdapter");
        throw null;
    }

    public final AnonymousClass8F8 A4e() {
        AnonymousClass8F8 r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("catalogViewModel");
        throw null;
    }

    public final UserJid A4f() {
        UserJid userJid = this.A0D;
        if (userJid != null) {
            return userJid;
        }
        C18070vi.A11("jid");
        throw null;
    }

    public void A4g(List list) {
        String str;
        AnonymousClass8F7 r1 = this.A05;
        if (r1 != null) {
            this.A0P = r1.A0T(this.A00, list);
            AnonymousClass8F7 r12 = this.A05;
            if (r12 != null) {
                HashSet A0U2 = r12.A0U(A4d().A08, list);
                List list2 = A4d().A08;
                list2.clear();
                list2.addAll(list);
                Iterator it = A0U2.iterator();
                while (it.hasNext()) {
                    String A0v = C17880vN.A0v(it);
                    AnonymousClass00H r0 = this.A0M;
                    if (r0 != null) {
                        C20738AWt.A00(C17880vN.A0V(r0), A0v, AnonymousClass8BU.A1W(A0v) ? 1 : 0);
                    } else {
                        str = "productObservers";
                        C18070vi.A11(str);
                        throw null;
                    }
                }
                invalidateOptionsMenu();
                return;
            }
        }
        str = "cartMenuViewModel";
        C18070vi.A11(str);
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 3000) {
            super.onActivityResult(i, i2, intent);
        } else if (intent != null && intent.getIntExtra("get_collection_error_code", -1) == 404) {
            A4e().A0T(A4f());
        }
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [X.9iO, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v9, types: [X.A7D, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0135, code lost:
        if (r2 != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x034b, code lost:
        r7.A04("catalog_collections_view_tag", "EntryPoint", r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r31) {
        /*
            r30 = this;
            r0 = r30
            r6 = r31
            super.onCreate(r6)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "is_prefetched_catalog"
            r1 = 0
            boolean r2 = r3.getBooleanExtra(r2, r1)
            if (r2 != 0) goto L_0x0022
            X.A2u r5 = r0.A0E
            if (r5 == 0) goto L_0x037c
            java.lang.String r4 = "catalog_collections_view_tag"
            java.lang.String r3 = "CatalogListBaseActivity"
            r2 = 774781666(0x2e2e3ae2, float:3.9615318E-11)
            r5.A01(r2, r4, r3)
        L_0x0022:
            X.00H r2 = r0.A0H
            if (r2 == 0) goto L_0x0379
            X.10T r3 = X.C17880vN.A0V(r2)
            X.9Nc r2 = r0.A0W
            r3.registerObserver(r2)
            X.9nN r3 = r0.A08
            if (r3 == 0) goto L_0x0376
            X.00H r2 = r0.A0J
            if (r2 == 0) goto L_0x0373
            X.A2v r2 = X.C20005A2v.A00(r3, r2)
            r0.A0U = r2
            r2 = 2131624375(0x7f0e01b7, float:1.8875928E38)
            r0.setContentView((int) r2)
            r2 = 2131435851(0x7f0b214b, float:1.8493556E38)
            X.AnonymousClass8BU.A18(r0, r2)
            androidx.appcompat.widget.Toolbar r2 = X.AnonymousClass3Ma.A0G(r0)
            r0.setSupportActionBar(r2)
            r2 = 2131428499(0x7f0b0493, float:1.8478644E38)
            android.view.View r2 = X.AnonymousClass3MY.A0H(r0, r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            X.C18070vi.A0d(r2, r1)
            r0.A00 = r2
            androidx.recyclerview.widget.RecyclerView r3 = r0.A4b()
            X.AHN r2 = new X.AHN
            r2.<init>(r1)
            r3.A0H = r2
            X.01n r3 = r0.getSupportActionBar()
            if (r3 == 0) goto L_0x0079
            r2 = 1
            r3.A0W(r2)
            r2 = 2131887571(0x7f1205d3, float:1.9409753E38)
            r3.A0M(r2)
        L_0x0079:
            X.1Dw r4 = com.whatsapp.jid.UserJid.Companion
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "cache_jid"
            java.lang.String r2 = r3.getStringExtra(r2)
            com.whatsapp.jid.UserJid r2 = r4.A04(r2)
            if (r2 == 0) goto L_0x036e
            r0.A0D = r2
            X.00H r2 = r0.A0M
            if (r2 == 0) goto L_0x036b
            X.10T r3 = X.C17880vN.A0V(r2)
            X.9M1 r2 = r0.A0Y
            r3.registerObserver(r2)
            X.00H r2 = r0.A0L
            if (r2 == 0) goto L_0x0368
            X.10T r3 = X.C17880vN.A0V(r2)
            X.BAG r2 = r0.A0X
            r3.registerObserver(r2)
            com.whatsapp.jid.UserJid r3 = r0.A4f()
            X.B7A r2 = r0.A04
            if (r2 == 0) goto L_0x0365
            X.1J2 r2 = X.AHF.A00(r0, r2, r3)
            X.8F7 r2 = (X.AnonymousClass8F7) r2
            X.C18070vi.A0d(r2, r1)
            r0.A05 = r2
            com.whatsapp.jid.UserJid r5 = r0.A4f()
            X.B6z r3 = r0.A02
            if (r3 == 0) goto L_0x0362
            com.whatsapp.jid.UserJid r2 = r0.A4f()
            X.9p3 r4 = r3.BGF(r2)
            X.9Un r3 = r0.A01
            if (r3 == 0) goto L_0x035f
            X.AH4 r2 = new X.AH4
            r2.<init>(r3, r4, r5)
            X.1It r3 = X.AnonymousClass8BR.A0C(r2, r0)
            java.lang.Class<X.8F8> r2 = X.AnonymousClass8F8.class
            X.1J2 r2 = r3.A00(r2)
            X.8F8 r2 = (X.AnonymousClass8F8) r2
            X.C18070vi.A0d(r2, r1)
            r0.A0A = r2
            X.8F8 r2 = r0.A4e()
            com.whatsapp.biz.catalog.manager.CatalogManager r2 = r2.A0L
            X.1DT r3 = r2.A04
            X.Ay2 r2 = new X.Ay2
            r2.<init>(r0)
            r5 = 6
            X.C20339AGv.A00(r0, r3, r2, r5)
            X.8F8 r11 = r0.A4e()
            com.whatsapp.jid.UserJid r10 = r0.A4f()
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "entry_point"
            int r9 = r3.getIntExtra(r2, r1)
            X.A2u r7 = r11.A0P
            X.11S r2 = r11.A0D
            boolean r2 = r2.A0O(r10)
            r8 = 1
            r3 = r2 ^ 1
            java.lang.String r4 = "catalog_collections_view_tag"
            java.lang.String r2 = "IsConsumer"
            r7.A05(r4, r2, r3)
            X.A7x r3 = r11.A0I
            boolean r2 = r3.A0P(r10)
            if (r2 != 0) goto L_0x0137
            monitor-enter(r3)
            X.9yf r2 = X.A76.A00(r3, r10)     // Catch:{ all -> 0x0131 }
            if (r2 != 0) goto L_0x012a
            goto L_0x0352
        L_0x012a:
            java.util.List r2 = r2.A05     // Catch:{ all -> 0x0131 }
            boolean r2 = X.AnonymousClass000.A1a(r2)     // Catch:{ all -> 0x0131 }
            goto L_0x0134
        L_0x0131:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0134:
            monitor-exit(r3)
            if (r2 == 0) goto L_0x0353
        L_0x0137:
            java.lang.String r2 = "Cached"
            r7.A05(r4, r2, r8)
            switch(r9) {
                case 1: goto L_0x0322;
                case 2: goto L_0x0325;
                case 3: goto L_0x0328;
                case 4: goto L_0x032b;
                case 5: goto L_0x032e;
                case 6: goto L_0x0331;
                case 7: goto L_0x0334;
                case 8: goto L_0x0337;
                case 9: goto L_0x033a;
                case 10: goto L_0x033d;
                case 11: goto L_0x0340;
                case 12: goto L_0x0343;
                case 13: goto L_0x0346;
                case 14: goto L_0x0349;
                default: goto L_0x013f;
            }
        L_0x013f:
            r9 = r0
            com.whatsapp.biz.catalog.view.activity.CatalogListActivity r9 = (com.whatsapp.biz.catalog.view.activity.CatalogListActivity) r9
            X.9Uo r2 = r9.A02
            if (r2 == 0) goto L_0x035c
            com.whatsapp.jid.UserJid r28 = r9.A4f()
            X.8F8 r18 = r9.A4e()
            X.AOC r7 = new X.AOC
            r7.<init>(r9, r1)
            X.1K2 r3 = r2.A00
            X.10E r2 = r3.A01
            X.0ve r25 = X.AnonymousClass10E.A8r(r2)
            X.11S r12 = X.AnonymousClass10E.A17(r2)
            X.10G r4 = r2.A00
            X.6mP r13 = X.AnonymousClass8BT.A0A(r4)
            X.1np r29 = X.AnonymousClass3MY.A0e(r4)
            X.1L9 r10 = X.AnonymousClass3MZ.A0N(r2)
            X.00S r4 = r2.A1s
            java.lang.Object r15 = r4.get()
            com.whatsapp.biz.catalog.manager.CatalogManager r15 = (com.whatsapp.biz.catalog.manager.CatalogManager) r15
            X.11C r23 = X.AnonymousClass3Ma.A0a(r2)
            X.1K1 r3 = r3.A00
            X.00S r4 = r3.A0X
            java.lang.Object r4 = r4.get()
            X.A2v r4 = (X.C20005A2v) r4
            X.1MB r27 = X.AnonymousClass3Ma.A0k(r2)
            X.A7x r14 = X.AnonymousClass8BU.A0C(r2)
            X.18K r26 = X.AnonymousClass3Ma.A0g(r2)
            X.1M9 r20 = X.AnonymousClass10E.A4z(r2)
            X.1Me r22 = X.AnonymousClass3MZ.A0g(r2)
            X.9iO r17 = new X.9iO
            r17.<init>()
            X.1PM r21 = X.AnonymousClass3MZ.A0f(r2)
            X.0z4 r24 = X.AnonymousClass3Ma.A0c(r2)
            X.00S r2 = r3.A2b
            java.lang.Object r11 = r2.get()
            X.2hQ r11 = (X.C56412hQ) r11
            X.8i1 r8 = new X.8i1
            r19 = r7
            r16 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r9.A09 = r8
            X.8i1 r8 = r9.A4d()
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.adapter.CatalogAdapter"
            X.C18070vi.A0z(r8, r2)
            X.8F8 r2 = r9.A4e()
            X.1DT r4 = r2.A0B
            r2 = 1
            X.C18070vi.A0d(r4, r2)
            X.0ve r3 = r8.A06
            r2 = 1514(0x5ea, float:2.122E-42)
            X.0vf r7 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r7, r3, r2)
            if (r2 == 0) goto L_0x01e0
            X.Ay7 r3 = new X.Ay7
            r3.<init>(r8)
            r2 = 8
            X.C20339AGv.A00(r9, r4, r3, r2)
        L_0x01e0:
            if (r31 != 0) goto L_0x0318
            X.11S r3 = r0.A02
            com.whatsapp.jid.UserJid r2 = r0.A4f()
            boolean r2 = r3.A0O(r2)
            if (r2 == 0) goto L_0x0313
            java.lang.String r2 = "CatalogListBaseActivity fetchCatalogFromStart"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.8F8 r6 = r0.A4e()
            com.whatsapp.jid.UserJid r4 = r0.A4f()
            java.lang.String r2 = "CatalogViewModel fetchCatalogCollectionsFromStart , fetchCatalogProductsFromStart"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r6.A0T(r4)
            com.whatsapp.biz.catalog.manager.CatalogManager r3 = r6.A0L
            int r2 = r6.A05
            r3.A0D(r4, r2)
        L_0x020a:
            X.8i1 r2 = r0.A4d()
            r2.A0a()
        L_0x0211:
            androidx.recyclerview.widget.RecyclerView r3 = r0.A4b()
            X.8i1 r2 = r0.A4d()
            r3.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r2 = r0.A4b()
            X.AnonymousClass3Ma.A15(r0, r2)
            androidx.recyclerview.widget.RecyclerView r2 = r0.A4b()
            X.1qT r3 = r2.A0C
            boolean r2 = r3 instanceof X.C37971qU
            if (r2 == 0) goto L_0x0233
            X.1qU r3 = (X.C37971qU) r3
            if (r3 == 0) goto L_0x0233
            r3.A00 = r1
        L_0x0233:
            androidx.recyclerview.widget.RecyclerView r3 = r0.A4b()
            r2 = 2
            X.AnonymousClass8ID.A00(r3, r0, r2)
            X.1Lf r3 = r0.A0B
            if (r3 == 0) goto L_0x0359
            X.1Gv r2 = r0.A0T
            r3.registerObserver(r2)
            X.00H r2 = r0.A0F
            if (r2 == 0) goto L_0x0356
            X.10T r3 = X.C17880vN.A0V(r2)
            X.1M6 r2 = r0.A0V
            r3.registerObserver(r2)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "source"
            java.io.Serializable r2 = r3.getSerializableExtra(r2)
            if (r2 == 0) goto L_0x0264
            X.10I r3 = r0.A05
            r2 = 44
            X.C21424Ajr.A00(r3, r0, r2)
        L_0x0264:
            X.8F8 r2 = r0.A4e()
            X.9p3 r2 = r2.A0E
            X.1DS r3 = r2.A03
            X.Ay3 r2 = new X.Ay3
            r2.<init>(r0)
            X.C20339AGv.A00(r0, r3, r2, r5)
            X.00H r2 = r0.A0N
            if (r2 == 0) goto L_0x037f
            java.lang.Object r3 = r2.get()
            X.9kg r3 = (X.C190289kg) r3
            com.whatsapp.jid.UserJid r9 = r0.A4f()
            java.util.concurrent.atomic.AtomicInteger r8 = r3.A00
            int r2 = r8.get()
            r6 = -1
            if (r2 == r6) goto L_0x02a3
            X.00H r2 = r3.A01
            java.lang.Object r5 = r2.get()
            X.2sl r5 = (X.C63252sl) r5
            int r4 = r8.get()
            r3 = 0
            X.2f9 r2 = new X.2f9
            r2.<init>(r9, r3, r1, r1)
            r1 = 897464270(0x357e37ce, float:9.470358E-7)
            r5.A04(r2, r1, r4)
        L_0x02a3:
            r8.set(r6)
            X.0ve r2 = r0.A0E
            r1 = 10626(0x2982, float:1.489E-41)
            boolean r1 = X.C18020vd.A05(r7, r2, r1)
            if (r1 == 0) goto L_0x0308
            boolean r1 = r0.A0S
            if (r1 != 0) goto L_0x0308
            r1 = 1
            r0.A0S = r1
            X.A8Q r5 = r0.A4c()
            X.A7D r4 = new X.A7D
            r4.<init>()
            X.A8Q r1 = r0.A4c()
            java.lang.String r1 = r1.A03
            r4.A0B = r1
            X.A8Q r1 = r0.A4c()
            X.A8Q.A04(r4, r1)
            X.A8Q r1 = r0.A4c()
            java.lang.String r1 = r1.A01
            r4.A0E = r1
            X.A8Q r1 = r0.A4c()
            java.lang.String r1 = r1.A02
            r4.A0F = r1
            X.A8Q r1 = r0.A4c()
            X.A8Q.A03(r4, r1)
            r1 = 53
            X.A7D.A01(r4, r1)
            com.whatsapp.jid.UserJid r1 = r0.A4f()
            r4.A00 = r1
            X.8F8 r3 = r0.A4e()
            X.00H r1 = r3.A0S
            java.lang.Object r2 = r1.get()
            X.96v r2 = (X.C1770196v) r2
            com.whatsapp.jid.UserJid r1 = r3.A0O
            java.lang.String r1 = X.A5T.A01(r2, r1)
            r4.A0A = r1
            r5.A09(r4)
        L_0x0308:
            X.A8Q r1 = r0.A4c()
            X.9cl r1 = r1.A07()
            r0.A06 = r1
            return
        L_0x0313:
            A0q(r0)
            goto L_0x020a
        L_0x0318:
            java.lang.String r2 = "catalog_loaded"
            boolean r2 = r6.getBoolean(r2, r1)
            r0.A0Q = r2
            goto L_0x0211
        L_0x0322:
            java.lang.String r3 = "Onboarding"
            goto L_0x034b
        L_0x0325:
            java.lang.String r3 = "CatalogShare"
            goto L_0x034b
        L_0x0328:
            java.lang.String r3 = "BusinessHome"
            goto L_0x034b
        L_0x032b:
            java.lang.String r3 = "ToolsMenu"
            goto L_0x034b
        L_0x032e:
            java.lang.String r3 = "ContentChooser"
            goto L_0x034b
        L_0x0331:
            java.lang.String r3 = "ConversationHomeBanner"
            goto L_0x034b
        L_0x0334:
            java.lang.String r3 = "CatalogHomeEdit"
            goto L_0x034b
        L_0x0337:
            java.lang.String r3 = "Profile"
            goto L_0x034b
        L_0x033a:
            java.lang.String r3 = "ContactInfo"
            goto L_0x034b
        L_0x033d:
            java.lang.String r3 = "Attachment"
            goto L_0x034b
        L_0x0340:
            java.lang.String r3 = "Deeplink"
            goto L_0x034b
        L_0x0343:
            java.lang.String r3 = "ChatHeader"
            goto L_0x034b
        L_0x0346:
            java.lang.String r3 = "Product"
            goto L_0x034b
        L_0x0349:
            java.lang.String r3 = "Cart"
        L_0x034b:
            java.lang.String r2 = "EntryPoint"
            r7.A04(r4, r2, r3)
            goto L_0x013f
        L_0x0352:
            monitor-exit(r3)
        L_0x0353:
            r8 = 0
            goto L_0x0137
        L_0x0356:
            java.lang.String r0 = "businessProfileObservers"
            goto L_0x0381
        L_0x0359:
            java.lang.String r0 = "contactObservers"
            goto L_0x0381
        L_0x035c:
            java.lang.String r0 = "catalogAdapterFactory"
            goto L_0x0381
        L_0x035f:
            java.lang.String r0 = "catalogViewModelFactory"
            goto L_0x0381
        L_0x0362:
            java.lang.String r0 = "catalogListRepositoryFactory"
            goto L_0x0381
        L_0x0365:
            java.lang.String r0 = "cartMenuViewModelFactory"
            goto L_0x0381
        L_0x0368:
            java.lang.String r0 = "catalogObservers"
            goto L_0x0381
        L_0x036b:
            java.lang.String r0 = "productObservers"
            goto L_0x0381
        L_0x036e:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x0373:
            java.lang.String r0 = "catalogImageLoadQplLogger"
            goto L_0x0381
        L_0x0376:
            java.lang.String r0 = "mediaManager"
            goto L_0x0381
        L_0x0379:
            java.lang.String r0 = "cartObservers"
            goto L_0x0381
        L_0x037c:
            java.lang.String r0 = "bizQPLManager"
            goto L_0x0381
        L_0x037f:
            java.lang.String r0 = "qplLogger"
        L_0x0381:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168578j9.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        String str;
        AnonymousClass00H r0 = this.A0H;
        if (r0 != null) {
            C17880vN.A0V(r0).unregisterObserver(this.A0W);
            AnonymousClass00H r02 = this.A0L;
            if (r02 != null) {
                C17880vN.A0V(r02).unregisterObserver(this.A0X);
                AnonymousClass00H r03 = this.A0M;
                if (r03 != null) {
                    C17880vN.A0V(r03).unregisterObserver(this.A0Y);
                    C24671Lf r1 = this.A0B;
                    if (r1 != null) {
                        r1.unregisterObserver(this.A0T);
                        AnonymousClass00H r04 = this.A0F;
                        if (r04 != null) {
                            C17880vN.A0V(r04).unregisterObserver(this.A0V);
                            C20005A2v a2v = this.A0U;
                            if (a2v != null) {
                                a2v.A02();
                            }
                            C20004A2u a2u = this.A0E;
                            if (a2u != null) {
                                a2u.A06("catalog_collections_view_tag", false);
                                super.onDestroy();
                                return;
                            }
                            str = "bizQPLManager";
                        } else {
                            str = "businessProfileObservers";
                        }
                    } else {
                        str = "contactObservers";
                    }
                } else {
                    str = "productObservers";
                }
            } else {
                str = "catalogObservers";
            }
        } else {
            str = "cartObservers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static void A0q(C168578j9 r4) {
        AnonymousClass8F8 A4e = r4.A4e();
        UserJid A4f = r4.A4f();
        C26911Ty r1 = A4e.A0F;
        if ((((C192179nw) r1.A03.getValue()).A00() & 128) > 0) {
            r1.A0C(A4e, A4f);
        } else {
            A4e.BzH((AEW) null);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.A7D, java.lang.Object] */
    public static final void A0r(C168578j9 r3) {
        A8Q A4c = r3.A4c();
        ? obj = new Object();
        obj.A0B = r3.A4c().A03;
        A8Q.A04(obj, r3.A4c());
        obj.A0E = r3.A4c().A01;
        obj.A0F = r3.A4c().A02;
        A8Q.A03(obj, r3.A4c());
        A7D.A01(obj, 32);
        A7D.A02(obj, 50);
        A7D.A00(r3.A4e().A0E.A03, obj);
        obj.A00 = r3.A4f();
        A4c.A09(obj);
        r3.CMl(AnonymousClass9PJ.A00(r3.A4e().A0O, (String) null, 0));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A0B2 = C72453Mb.A0B(menuItem);
        if (16908332 == A0B2) {
            onBackPressed();
            return true;
        } else if (2131432516 == A0B2) {
            AnonymousClass00H r0 = this.A0O;
            if (r0 != null) {
                r0.get();
                UserJid A4f = A4f();
                Intent A0A2 = C17880vN.A0A();
                A0A2.setClassName(getPackageName(), "com.whatsapp.ShareCatalogLinkActivity");
                A0A2.setAction("android.intent.action.VIEW");
                AnonymousClass3MY.A12(A0A2, A4f, "jid");
                startActivity(A0A2);
                return true;
            }
            AnonymousClass3MW.A1F();
            throw null;
        } else if (2131432496 != A0B2) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A0r(this);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        A4d().A0a();
        A4e().A0E.A00();
    }

    public void onStop() {
        super.onStop();
    }
}
