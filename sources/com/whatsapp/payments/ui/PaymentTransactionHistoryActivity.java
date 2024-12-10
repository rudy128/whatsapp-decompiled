package com.whatsapp.payments.ui;

import X.AFQ;
import X.AGK;
import X.AQF;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass122;
import X.AnonymousClass18O;
import X.AnonymousClass1BI;
import X.AnonymousClass1HF;
import X.AnonymousClass1QB;
import X.AnonymousClass1QE;
import X.AnonymousClass1QO;
import X.AnonymousClass1QS;
import X.AnonymousClass1R2;
import X.AnonymousClass1Xr;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4VZ;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8BY;
import X.AnonymousClass9BA;
import X.B5S;
import X.B8b;
import X.BD1;
import X.BD4;
import X.C003401n;
import X.C108965cb;
import X.C161828Hx;
import X.C166928eK;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18040vf;
import X.C188079gq;
import X.C193179pf;
import X.C20155A9r;
import X.C20249ADh;
import X.C20759AXo;
import X.C20858Aaa;
import X.C21427Aju;
import X.C22374B5d;
import X.C22459B8r;
import X.C27831Xu;
import X.C30361do;
import X.C33301ib;
import X.C49132Ph;
import X.C58842lL;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.payments.ui.widget.MultiExclusionChip;
import com.whatsapp.payments.ui.widget.MultiExclusionChipGroup;
import java.util.ArrayList;

public class PaymentTransactionHistoryActivity extends C166928eK implements B8b, C22459B8r, C22374B5d {
    public int A00;
    public View A01;
    public ProgressBar A02;
    public TextView A03;
    public C18000vb A04;
    public AnonymousClass122 A05;
    public AnonymousClass1QB A06;
    public AnonymousClass1BI A07;
    public C33301ib A08;
    public AnonymousClass1QO A09;
    public AnonymousClass1QS A0A;
    public AQF A0B;
    public C161828Hx A0C;
    public C193179pf A0D;
    public MultiExclusionChipGroup A0E;
    public AnonymousClass1R2 A0F;
    public AnonymousClass4VZ A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public String A0K;
    public String A0L;
    public ArrayList A0M;
    public boolean A0N = false;
    public boolean A0O = false;
    public boolean A0P = false;
    public boolean A0Q = false;
    public boolean A0R = false;
    public AnonymousClass9BA A0S;
    public C49132Ph A0T;
    public boolean A0U = false;
    public boolean A0V = false;
    public final AnonymousClass1QE A0W = AnonymousClass1QE.A00("PaymentTransactionHistoryActivity", "payment-settings", "COMMON");
    public final C188079gq A0X = new C188079gq();
    public final ArrayList A0Y = AnonymousClass000.A13();
    public final B5S A0Z = new C20759AXo(this, 3);

    public boolean onSearchRequested() {
        this.A0G.A06(false);
        AnonymousClass4VZ r2 = this.A0G;
        String string = getString(2131895489);
        SearchView searchView = r2.A00;
        if (searchView != null) {
            searchView.setQueryHint(string);
        }
        View findViewById = findViewById(2131434851);
        if (this.A06.A09(AnonymousClass18O.A0a) && !this.A0Q && (this.A0N || this.A0R)) {
            AnonymousClass3MX.A1H(this, 2131427809, 0);
            if (this.A0E == null) {
                MultiExclusionChipGroup multiExclusionChipGroup = (MultiExclusionChipGroup) AnonymousClass1HF.A06(findViewById(2131433541), 2131433540);
                this.A0E = multiExclusionChipGroup;
                String string2 = getString(2131893717);
                String string3 = getString(2131893719);
                String string4 = getString(2131894106);
                String string5 = getString(2131893718);
                MultiExclusionChip A0Q2 = A0Q(string2);
                MultiExclusionChip A0Q3 = A0Q(string3);
                MultiExclusionChip A0Q4 = A0Q(string4);
                MultiExclusionChip A0Q5 = A0Q(string5);
                if (this.A0R) {
                    ArrayList A0s = C108965cb.A0s(A0Q2);
                    A0s.add(A0Q3);
                    multiExclusionChipGroup.A01(A0s);
                }
                if (this.A0N) {
                    ArrayList A0s2 = C108965cb.A0s(A0Q4);
                    A0s2.add(A0Q5);
                    multiExclusionChipGroup.A01(A0s2);
                }
                multiExclusionChipGroup.A00 = new C20858Aaa(this, A0Q2, A0Q3, A0Q4, A0Q5);
            }
            this.A0E.setVisibility(0);
        }
        AFQ.A00(findViewById, this, 23);
        return false;
    }

    private void A0V() {
        BD1 A062;
        if (TextUtils.isEmpty(this.A0K) || (A062 = this.A0A.A05(this.A0K)) == null) {
            A062 = this.A0A.A06();
        }
        BD4 BRb = A062.BRb();
        if (BRb != null) {
            BRb.BiL(1, "payment_transaction_history", (String) null, 1);
        }
    }

    public void A3K() {
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A0E, 7019);
        C30361do A0u = AnonymousClass3MX.A0u(this.A0H);
        if (A052) {
            A0u.A02((AnonymousClass1BI) null, 76);
        } else {
            A0u.A01();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.9BA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.2Ph} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.9BA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.9BA} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4b() {
        /*
            r14 = this;
            X.9BA r0 = r14.A0S
            r1 = 1
            if (r0 == 0) goto L_0x0008
            r0.A0B(r1)
        L_0x0008:
            X.2Ph r0 = r14.A0T
            if (r0 == 0) goto L_0x000f
            r0.A0B(r1)
        L_0x000f:
            boolean r0 = r14.A0V
            r3 = 0
            android.view.View r1 = r14.A01
            if (r0 == 0) goto L_0x001a
            r1.setVisibility(r3)
            return
        L_0x001a:
            r0 = 8
            r1.setVisibility(r0)
            X.18O r1 = r14.A06
            X.18R r0 = X.AnonymousClass18O.A0a
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r14.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0057
            X.1BI r0 = r14.A07
            if (r0 != 0) goto L_0x0057
            X.1R2 r11 = r14.A0F
            X.0vb r5 = r14.A04
            X.1QB r6 = r14.A06
            X.1QS r7 = r14.A0A
            X.9pf r10 = r14.A0D
            java.lang.String r12 = r14.A0L
            boolean r13 = r14.A0Q
            X.9gq r8 = r14.A0X
            X.9jY r9 = new X.9jY
            r9.<init>(r14)
            X.2Ph r4 = new X.2Ph
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A0T = r4
        L_0x0051:
            X.10I r0 = r14.A05
            X.AnonymousClass3MW.A1T(r4, r0, r3)
            return
        L_0x0057:
            java.util.ArrayList r2 = r14.A0M
            X.9jY r1 = new X.9jY
            r1.<init>(r14)
            X.9pf r0 = r14.A0D
            X.9BA r4 = new X.9BA
            r4.<init>(r1, r14, r0, r2)
            r14.A0S = r4
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionHistoryActivity.A4b():void");
    }

    public void Bqm() {
        this.A0C.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        C161828Hx r4;
        String stringExtra;
        AnonymousClass8BW.A0y(this);
        this.A0K = getIntent().getStringExtra("extra_payment_service_name");
        super.onCreate(bundle);
        if (this.A09.A04(0) || this.A09.A02()) {
            z = true;
        } else {
            this.A09.A04.A02();
            z = false;
        }
        C17960vV.A0D(z);
        this.A00 = AnonymousClass8BS.A05(this, 2131626422).getIntExtra("extra_payment_flow_entry_point", 3);
        AnonymousClass10I r42 = this.A05;
        C33301ib r3 = this.A08;
        r3.getClass();
        C21427Aju.A00(r42, r3, 22);
        C17880vN.A0V(this.A0J).registerObserver(this.A0Z);
        boolean z2 = this instanceof IndiaPaymentTransactionHistoryActivity;
        AnonymousClass1R2 r13 = this.A0F;
        C18000vb r6 = this.A04;
        AnonymousClass1QE r10 = this.A0W;
        AnonymousClass122 r7 = this.A05;
        C58842lL A0N2 = AnonymousClass8BR.A0N(this.A0I);
        ArrayList A13 = AnonymousClass000.A13();
        C193179pf r12 = this.A0D;
        int i = this.A00;
        if (z2) {
            r4 = new C161828Hx(this, r6, r7, A0N2, this, r10, this, r12, r13, A13, i);
        } else {
            r4 = new C161828Hx(this, r6, r7, A0N2, this, r10, this, r12, r13, A13, i);
        }
        this.A0C = r4;
        RecyclerView recyclerView = (RecyclerView) findViewById(2131436363);
        recyclerView.setAdapter(this.A0C);
        AnonymousClass1Xr.A05(recyclerView, true);
        AnonymousClass1Xr.A05(findViewById(16908292), true);
        ProgressBar progressBar = (ProgressBar) findViewById(2131434181);
        this.A02 = progressBar;
        progressBar.setVisibility(0);
        this.A01 = findViewById(2131430381);
        this.A03 = AnonymousClass3MX.A0L(this, 2131430375);
        Toolbar A0G2 = AnonymousClass3Ma.A0G(this);
        setSupportActionBar(A0G2);
        this.A0V = getIntent().getBooleanExtra("extra_show_empty_list_screen", false);
        this.A0G = new AnonymousClass4VZ(this, findViewById(2131434898), new AGK(this, 5), A0G2, this.A04);
        this.A0P = getIntent().getBooleanExtra("extra_for_mandates", false);
        this.A0O = getIntent().getBooleanExtra("extra_show_mandate_pending_requests", false);
        this.A0Q = getIntent().getBooleanExtra("extra_show_requests", false);
        this.A0U = getIntent().getBooleanExtra("extra_disable_search", false);
        C20249ADh aDh = (C20249ADh) getIntent().getParcelableExtra("extra_predefined_search_filter");
        if (aDh != null) {
            this.A0X.A01 = aDh;
        }
        this.A07 = AnonymousClass3MX.A0l(getIntent().getStringExtra("extra_jid"));
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            if (this.A0Q) {
                stringExtra = getResources().getQuantityString(2131755327, 2);
            } else {
                stringExtra = getIntent().getStringExtra("extra_list_screen_configurable_title");
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = getString(2131894046);
                }
            }
            supportActionBar.A0S(stringExtra);
            supportActionBar.A0W(true);
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i != 100) {
            return super.onCreateDialog(i);
        }
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0D(2131893997);
        A002.A0T(false);
        C20155A9r.A01(A002, this, 24, 2131899286);
        A002.A0E(2131893993);
        return A002.create();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.A0U && !this.A0V) {
            AnonymousClass8BY.A0C(this, menu, 2131432620).setShowAsAction(10);
        }
        return super.onCreateOptionsMenu(menu);
    }

    private MultiExclusionChip A0Q(String str) {
        MultiExclusionChip multiExclusionChip = (MultiExclusionChip) AnonymousClass3MY.A0D(getLayoutInflater(), 2131626360);
        C27831Xu.A0C(multiExclusionChip.getCheckedIcon(), AnonymousClass3Ma.A01(multiExclusionChip.getContext(), getResources(), 2130971084, 2131102415));
        multiExclusionChip.setText(str);
        return multiExclusionChip;
    }

    private boolean A0c() {
        BD1 A062;
        if (!isTaskRoot()) {
            return false;
        }
        if (TextUtils.isEmpty(this.A0K) || (A062 = this.A0A.A05(this.A0K)) == null) {
            A062 = this.A0A.A06();
        }
        Class BWu = A062.BWu();
        AnonymousClass8BX.A1D(this.A0W, BWu, "PaymentTransactionHistoryActivity maybeOpenPaymentSettings ", AnonymousClass000.A10());
        Intent A072 = AnonymousClass8BR.A07(this, BWu);
        finishAndRemoveTask();
        startActivity(A072);
        return true;
    }

    public void C0N() {
        A4b();
    }

    public void onBackPressed() {
        A0V();
        if (this.A0G.A0C()) {
            this.A0G.A05(true);
            MultiExclusionChipGroup multiExclusionChipGroup = this.A0E;
            if (multiExclusionChipGroup != null) {
                for (int i = 0; i < multiExclusionChipGroup.getChildCount(); i++) {
                    ((CompoundButton) multiExclusionChipGroup.getChildAt(i)).setChecked(false);
                }
                this.A0E.setVisibility(8);
            }
            A4b();
        } else if (!A0c()) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass9BA r0 = this.A0S;
        if (r0 != null) {
            r0.A0B(true);
        }
        C49132Ph r02 = this.A0T;
        if (r02 != null) {
            r02.A0B(true);
        }
        C17880vN.A0V(this.A0J).unregisterObserver(this.A0Z);
        this.A0S = null;
        this.A0T = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131432620) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A0V();
            finish();
            A0c();
            return true;
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0Q = bundle.getBoolean("extra_show_requests");
        this.A07 = AnonymousClass3MX.A0l(bundle.getString("extra_jid"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_show_requests", this.A0Q);
        AnonymousClass1BI r1 = this.A07;
        if (r1 != null) {
            AnonymousClass3MY.A15(bundle, r1, "extra_jid");
        }
    }

    public void onStart() {
        super.onStart();
        A4b();
        AQF aqf = this.A0B;
        aqf.A00.clear();
        aqf.A02.add(AnonymousClass3MW.A0z(this));
    }

    public void onStop() {
        super.onStop();
        AnonymousClass9BA r0 = this.A0S;
        if (r0 != null) {
            r0.A0B(true);
        }
        C49132Ph r02 = this.A0T;
        if (r02 != null) {
            r02.A0B(true);
        }
        this.A0S = null;
        this.A0T = null;
        this.A0B.A03(this);
    }
}
