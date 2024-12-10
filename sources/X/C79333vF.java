package X;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.conversationrow.message.KeptMessagesActivity;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity;
import java.util.ArrayList;

/* renamed from: X.3vF  reason: invalid class name and case insensitive filesystem */
public abstract class C79333vF extends C78823th implements C108875cR, E8R {
    public MenuItem A00;
    public C19880zA A01;
    public C56472hW A02;
    public C34531kd A03;
    public C108775cH A04;
    public C24671Lf A05;
    public C37451pZ A06;
    public MessageSelectionViewModel A07;
    public AnonymousClass1Q9 A08;
    public AnonymousClass1WP A09;
    public AnonymousClass1QB A0A;
    public AnonymousClass1Cd A0B;
    public AnonymousClass18K A0C;
    public AnonymousClass1LU A0D;
    public AnonymousClass1BI A0E;
    public C34141jz A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public String A0K;
    public ArrayList A0L;
    public final AbsListView.OnScrollListener A0M = new C90764eb(this);
    public final C106765Xc A0N = new C95154lm(this, 1);
    public final C23581Gv A0O = new C94164k9(this, 17);
    public final C28741ap A0P = new C95414mC(this, 11);
    public final C25221Nj A0Q = new C96314ne(this, 16);

    public C108775cH A4c() {
        AnonymousClass48j r10 = new AnonymousClass48j(this, this.A0D, this.A01, 19);
        return new AnonymousClass3SW(this, this.A02, this.A00.A09, this.A06, this.A00.A0I, this, getFMessageDatabase(), r10);
    }

    public AnonymousClass1F9 getLifecycleOwner() {
        return this;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C692236j r6;
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            ArrayList A062 = this.A00.A06();
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("jids");
            if (intent.getBooleanExtra("ad_creation_tapped", false)) {
                C19880zA r1 = this.A01;
                if (r1.A07()) {
                    r1.A03();
                    throw AnonymousClass000.A0s("handleAdvertiseForwardClick");
                }
            } else if (A062.isEmpty() || stringArrayListExtra == null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(A4d());
                C17890vO.A1B(A10, "/forward/failed");
                this.A05.A08(2131892058, 0);
            } else {
                ArrayList A0A2 = C22971Dz.A0A(AnonymousClass1BI.class, stringArrayListExtra);
                boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                String stringExtra = intent.getStringExtra("appended_message");
                if (C22971Dz.A01(A0A2) != null) {
                    C17960vV.A07(intent);
                    Bundle extras = intent.getExtras();
                    r6 = new C692236j();
                    C72473Md.A0v(extras, r6, this.A0J);
                } else {
                    r6 = null;
                }
                this.A00.A06.A0N(this.A03, r6, stringExtra, C25161Nd.A00(A062), A0A2, booleanExtra);
                if (A0A2.size() != 1 || C22971Dz.A0a((Jid) A0A2.get(0))) {
                    CPW(A0A2, 1);
                } else {
                    C72473Md.A0q(this, this.A01, this.A0D, A0A2);
                }
            }
            BLL();
        }
    }

    public String A4d() {
        if (this instanceof EnforcedMessagesActivity) {
            return "EnforcedNewsletterMessage";
        }
        if (this instanceof StarredMessagesActivity) {
            return "starred";
        }
        return "kept";
    }

    public void A4e() {
        Bundle bundle;
        if (!TextUtils.isEmpty(this.A0K)) {
            bundle = C17880vN.A0D();
            bundle.putString("query", this.A0K);
        } else {
            bundle = null;
        }
        C26144Ct7.A00(this).A02(bundle, this);
    }

    public void A4f() {
        if (this instanceof EnforcedMessagesActivity) {
            EnforcedMessagesActivity enforcedMessagesActivity = (EnforcedMessagesActivity) this;
            AnonymousClass3MX.A0v(enforcedMessagesActivity.A04).A04(C72453Mb.A07(enforcedMessagesActivity.A04.isEmpty() ? 1 : 0));
        } else if (this instanceof StarredMessagesActivity) {
            int i = 0;
            if (this.A04.BQ4() == null) {
                AnonymousClass3MX.A1H(this, 2131430398, 8);
                AnonymousClass3MX.A1H(this, 2131434939, 8);
                AnonymousClass3MX.A1H(this, 2131434180, 0);
                return;
            }
            ArrayList arrayList = this.A0L;
            if (arrayList == null || arrayList.isEmpty()) {
                AnonymousClass3MX.A1H(this, 2131430398, 0);
                ImageView A0I2 = AnonymousClass3MX.A0I(this, 2131435575);
                if (C22891Dp.A02) {
                    A0I2.setBackground((Drawable) null);
                    A0I2.setImageTintList((ColorStateList) null);
                    A0I2.setImageResource(2131232466);
                } else {
                    A0I2.setBackgroundResource(2131231378);
                    A0I2.setImageTintList(C19740yt.A03(this, AnonymousClass1YL.A00(this, 2130970097, 2131103410)));
                    A0I2.setImageResource(2131232318);
                    i = getResources().getDimensionPixelSize(2131168069);
                }
                A0I2.setPadding(i, i, i, i);
                AnonymousClass3MX.A1H(this, 2131434939, 8);
            } else {
                AnonymousClass3MX.A1H(this, 2131430398, 8);
                TextView A0L2 = AnonymousClass3MX.A0L(this, 2131434939);
                A0L2.setVisibility(0);
                Object[] A1a = AnonymousClass3MW.A1a();
                A1a[0] = this.A0K;
                AnonymousClass3MY.A0y(this, A0L2, A1a, 2131895497);
            }
            AnonymousClass3MX.A1H(this, 2131434180, 8);
        } else {
            KeptMessagesActivity keptMessagesActivity = (KeptMessagesActivity) this;
            ScrollView scrollView = keptMessagesActivity.A01;
            if (scrollView != null && keptMessagesActivity.A02 != null && keptMessagesActivity.A00 != null) {
                if (keptMessagesActivity.A04.BQ4() == null) {
                    scrollView.setVisibility(8);
                    keptMessagesActivity.A02.setVisibility(8);
                    keptMessagesActivity.A00.setVisibility(0);
                    return;
                }
                ArrayList arrayList2 = keptMessagesActivity.A0L;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    scrollView.setVisibility(0);
                    keptMessagesActivity.A02.setVisibility(8);
                } else {
                    scrollView.setVisibility(8);
                    keptMessagesActivity.A02.setVisibility(0);
                    WaTextView waTextView = keptMessagesActivity.A02;
                    Object[] A1a2 = AnonymousClass3MW.A1a();
                    A1a2[0] = keptMessagesActivity.A0K;
                    AnonymousClass3MY.A0y(keptMessagesActivity, waTextView, A1a2, 2131895497);
                }
                keptMessagesActivity.A00.setVisibility(8);
            }
        }
    }

    public C24494C6m BqU(Bundle bundle) {
        String string;
        C1602787v r2;
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("query");
        }
        if (this.A0F == null) {
            this.A0F = new C34141jz(this.A00);
            if (C18020vd.A05(C18040vf.A02, this.A0E, 11471)) {
                C98834rn.A01(this.A05, this, 16);
            }
        }
        if (string != null) {
            this.A0F.A05(string);
        }
        AnonymousClass18K r3 = this.A0C;
        if (this instanceof EnforcedMessagesActivity) {
            AnonymousClass00H r0 = ((EnforcedMessagesActivity) this).A01;
            if (r0 != null) {
                r2 = (C1602787v) C18070vi.A0E(r0);
            } else {
                C18070vi.A11("enforcedMessageCursorProvider");
                throw null;
            }
        } else if (this instanceof StarredMessagesActivity) {
            r2 = ((StarredMessagesActivity) this).A03;
        } else {
            r2 = ((KeptMessagesActivity) this).A03;
        }
        C34141jz r1 = this.A0F;
        r1.A03 = this.A0E;
        return new C111335jY(this, r3, r1, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bx0(java.lang.Object r4) {
        /*
            r3 = this;
            android.database.Cursor r4 = (android.database.Cursor) r4
            X.5cH r0 = r3.A04
            r0.COs(r4)
            r3.A4f()
            java.lang.String r0 = r3.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x003d
            X.5cH r0 = r3.A04
            boolean r1 = r0.isEmpty()
            android.view.MenuItem r0 = r3.A00
            if (r1 == 0) goto L_0x003e
            r2 = 0
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.isActionViewExpanded()
            if (r0 == 0) goto L_0x002a
            android.view.MenuItem r0 = r3.A00
            r0.collapseActionView()
        L_0x002a:
            android.view.MenuItem r0 = r3.A00
        L_0x002c:
            r0.setVisible(r2)
        L_0x002f:
            r1 = r3
            boolean r0 = r3 instanceof com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity
            if (r0 == 0) goto L_0x003d
            com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity r1 = (com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity) r1
            android.view.MenuItem r0 = r1.A00
            if (r0 == 0) goto L_0x003d
            r0.setVisible(r2)
        L_0x003d:
            return
        L_0x003e:
            r2 = 1
            if (r0 == 0) goto L_0x002f
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79333vF.Bx0(java.lang.Object):void");
    }

    public void Bx8() {
        this.A04.COs((Cursor) null);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ListAdapter listAdapter;
        if (this.A0A.A0O() && !(this instanceof EnforcedMessagesActivity)) {
            SearchView searchView = new SearchView(this);
            searchView.setMaxWidth(Integer.MAX_VALUE);
            C17880vN.A0E(searchView, 2131434969).setTextColor(getResources().getColor(AnonymousClass1YL.A00(this, 2130971978, 2131103153)));
            searchView.setQueryHint(getString(2131895489));
            C91184fH.A00(searchView, this, 3);
            MenuItem icon = AnonymousClass3MX.A07(menu, 2131432620, 2131899369).setIcon(2131232271);
            this.A00 = icon;
            AnonymousClass4SD r1 = (AnonymousClass4SD) this.A00.get();
            synchronized (r1) {
                listAdapter = r1.A00;
            }
            icon.setVisible(!listAdapter.isEmpty());
            this.A00.setActionView(searchView);
            this.A00.setShowAsAction(10);
            this.A00.setOnActionExpandListener(new C89634cm(this, 0));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass1Q9 r1 = this.A08;
        C18070vi.A0d(bundle, 0);
        bundle.putLong("ephemeral_session_start", r1.A00);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        MenuItem menuItem = this.A00;
        if (menuItem == null) {
            return false;
        }
        menuItem.expandActionView();
        return false;
    }

    public void C4z() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(A4d());
        C17890vO.A1A(A10, "/selectionrequested");
        this.A07.A0U(1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A3f();
        C72473Md.A17(this);
        this.A05.registerObserver(this.A0O);
        C17880vN.A0V(this.A0G).registerObserver(this.A0P);
        C17880vN.A0V(this.A0H).registerObserver(this.A0Q);
        C27201Vd r3 = this.A00.A0E;
        StringBuilder A10 = AnonymousClass000.A10();
        String A4d = A4d();
        A10.append(A4d);
        this.A06 = r3.A06(this, AnonymousClass000.A0y("-messages-activity", A10));
        AnonymousClass11S r0 = this.A02;
        r0.A0I();
        if (r0.A00 != null) {
            AnonymousClass1Cd r02 = this.A0B;
            r02.A06();
            if (r02.A08 && this.A07.A04()) {
                this.A0E = AnonymousClass3MX.A0l(C72453Mb.A0u(this));
                AnonymousClass1Q9 r32 = this.A08;
                if (bundle != null) {
                    r32.A00 = bundle.getLong("ephemeral_session_start", -1);
                }
                this.A09.A02(this.A0E, C17890vO.A0U(this));
                this.A04 = A4c();
                C26144Ct7.A00(this).A03(this);
                MessageSelectionViewModel messageSelectionViewModel = (MessageSelectionViewModel) AnonymousClass3MW.A0N(this).A00(MessageSelectionViewModel.class);
                this.A07 = messageSelectionViewModel;
                C91624fz.A00(this, messageSelectionViewModel.A01, 44);
                return;
            }
        }
        C17890vO.A1A(AnonymousClass000.A11(A4d), "/create/no-me-or-msgstore-db");
        startActivity(AnonymousClass1LU.A0A(this));
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.A02();
        this.A05.unregisterObserver(this.A0O);
        C17880vN.A0V(this.A0G).unregisterObserver(this.A0P);
        C17880vN.A0V(this.A0H).unregisterObserver(this.A0Q);
        this.A00.A0O.A06();
        if (isFinishing()) {
            this.A09.A03(this.A0E, C17890vO.A0U(this));
        }
    }

    public void onPause() {
        super.onPause();
        if (this.A00.A0O.A0B()) {
            this.A00.A0O.A03();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A00.A0O.A0B()) {
            this.A00.A0O.A05();
        }
        this.A04.notifyDataSetChanged();
    }
}
