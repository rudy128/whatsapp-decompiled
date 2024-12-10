package com.whatsapp.updates.ui.statusmuting;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6XU;
import X.AnonymousClass7AS;
import X.AnonymousClass7AZ;
import X.C108955ca;
import X.C108995ce;
import X.C109005cf;
import X.C111245jI;
import X.C111255jJ;
import X.C112435lT;
import X.C124666Zf;
import X.C124676Zg;
import X.C131406l2;
import X.C131426l5;
import X.C1423379b;
import X.C1585781f;
import X.C18070vi;
import X.C23381Fv;
import X.C24071It;
import X.C27201Vd;
import X.C34541kf;
import X.C34621kn;
import X.C34771l3;
import X.C37961qT;
import X.C38391rD;
import X.C72473Md;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;

public final class MutedStatusesActivity extends AnonymousClass1FY implements C34541kf, C34621kn {
    public int A00;
    public RecyclerView A01;
    public C124666Zf A02;
    public C124676Zg A03;
    public WaTextView A04;
    public C34771l3 A05;
    public C112435lT A06;
    public C111245jI A07;
    public boolean A08;

    public void BrY(boolean z) {
    }

    public void C6a(UserJid userJid) {
        startActivity(AnonymousClass1LU.A0j(this, userJid, false, false, false));
        C111245jI r0 = this.A07;
        if (r0 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        } else {
            r0.A05.A0W(userJid, (Integer) null, (Integer) null, false);
        }
    }

    public void onCreate(Bundle bundle) {
        int intExtra;
        String str;
        getWindow().addFlags(Integer.MIN_VALUE);
        super.onCreate(bundle);
        setTitle(2131899251);
        A3f();
        C72473Md.A18(this);
        setContentView(2131624076);
        this.A04 = (WaTextView) AnonymousClass3MY.A0H(this, 2131433168);
        if (bundle != null) {
            intExtra = bundle.getInt("tiles_style", 0);
        } else {
            intExtra = getIntent().getIntExtra("tiles_style", 0);
        }
        this.A00 = intExtra;
        C34771l3 r0 = this.A05;
        if (r0 != null) {
            C111255jJ A0S = C108995ce.A0S(this, r0);
            C124676Zg r2 = this.A03;
            if (r2 != null) {
                boolean A1O = AnonymousClass000.A1O(this.A00);
                C18070vi.A0d(A0S, 1);
                this.A07 = (C111245jI) new C24071It(new AnonymousClass7AZ(r2, A0S, A1O), this).A00(C111245jI.class);
                getLifecycle().A05(A0S);
                C23381Fv lifecycle = getLifecycle();
                C111245jI r02 = this.A07;
                if (r02 == null) {
                    str = "viewModel";
                } else {
                    lifecycle.A05(r02);
                    C124666Zf r03 = this.A02;
                    if (r03 != null) {
                        int i = this.A00;
                        AnonymousClass10E r04 = r03.A00.A01;
                        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r04);
                        C27201Vd A0i = AnonymousClass3MZ.A0i(r04);
                        AnonymousClass118 A0l = AnonymousClass3MZ.A0l(r04);
                        AnonymousClass10G r1 = r04.A00;
                        this.A06 = new C112435lT((C131406l2) r1.A11.get(), (C131426l5) r1.A1y.get(), A0i, A0l, this, AL1, i);
                        C23381Fv lifecycle2 = getLifecycle();
                        C112435lT r05 = this.A06;
                        if (r05 != null) {
                            lifecycle2.A05(r05);
                            View findViewById = findViewById(2131432888);
                            RecyclerView recyclerView = (RecyclerView) findViewById;
                            C112435lT r06 = this.A06;
                            if (r06 != null) {
                                recyclerView.setAdapter(r06);
                                AnonymousClass3Ma.A15(this, recyclerView);
                                recyclerView.setItemAnimator((C37961qT) null);
                                C18070vi.A0X(findViewById);
                                this.A01 = recyclerView;
                                C111245jI r07 = this.A07;
                                if (r07 == null) {
                                    AnonymousClass3MW.A1H();
                                    throw null;
                                } else {
                                    AnonymousClass7AS.A00(this, r07.A00, new C1585781f(this), 28);
                                    return;
                                }
                            }
                        }
                        C18070vi.A11("adapter");
                        throw null;
                    }
                    str = "adapterFactory";
                }
            } else {
                str = "mutedStatusesViewModelFactory";
            }
        } else {
            str = "statusesViewModelFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putInt("tiles_style", this.A00);
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A02 = (C124666Zf) A0K.A4w.get();
            this.A03 = (C124676Zg) A0K.A04.get();
            this.A05 = (C34771l3) r1.A0E.get();
        }
    }

    public void C6g(UserJid userJid, boolean z) {
        C111245jI r0 = this.A07;
        if (r0 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        CMl(AnonymousClass6XU.A00(userJid, (Long) null, (String) null, (String) null, C111255jJ.A00(r0.A05), true));
    }

    public MutedStatusesActivity(int i) {
        this.A08 = false;
        C1423379b.A00(this, 9);
    }

    public void onDestroy() {
        super.onDestroy();
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            C18070vi.A11("recylerView");
            throw null;
        } else {
            recyclerView.setAdapter((C38391rD) null);
        }
    }

    public MutedStatusesActivity() {
        this(0);
    }
}
