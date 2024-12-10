package com.whatsapp.interopui.compose;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass28K;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4SJ;
import X.AnonymousClass4VZ;
import X.C000200d;
import X.C18070vi;
import X.C18100vl;
import X.C28931bI;
import X.C30391dr;
import X.C41561wd;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73503Wf;
import X.C84984Lq;
import X.C91014f0;
import X.C91184fH;
import X.C91644g1;
import X.C99154sM;
import X.C99244sV;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

public final class InteropComposeSelectIntegratorActivity extends AnonymousClass1FY {
    public C73503Wf A00;
    public AnonymousClass4VZ A01;
    public C28931bI A02;
    public AnonymousClass00H A03;
    public RecyclerView A04;
    public boolean A05;
    public final C18100vl A06;

    public InteropComposeSelectIntegratorActivity() {
        this(0);
        this.A06 = C99154sM.A01(this, 28);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131624062);
        this.A04 = (RecyclerView) findViewById(2131433299);
        this.A02 = AnonymousClass3Ma.A0x(this, 2131430359);
        Toolbar A0T = C72463Mc.A0T(this);
        C72473Md.A16(AnonymousClass3MY.A0K(this, A0T));
        this.A01 = new AnonymousClass4VZ(this, findViewById(2131431774), new C91184fH(this, 8), A0T, this.A00);
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            C73503Wf r2 = new C73503Wf((AnonymousClass4SJ) C18070vi.A0E(r0), new C84984Lq(this));
            this.A00 = r2;
            r2.CDq(new AnonymousClass28K(this, 7));
            RecyclerView recyclerView = this.A04;
            if (recyclerView == null) {
                str = "recyclerView";
            } else {
                C72483Me.A0f(this, recyclerView);
                C73503Wf r02 = this.A00;
                if (r02 == null) {
                    str = "integratorsAdapter";
                } else {
                    recyclerView.setAdapter(r02);
                    C18100vl r3 = this.A06;
                    C91644g1.A00(this, ((InteropComposeSelectIntegratorViewModel) r3.getValue()).A01, C99244sV.A00(this, 34), 40);
                    InteropComposeSelectIntegratorViewModel interopComposeSelectIntegratorViewModel = (InteropComposeSelectIntegratorViewModel) r3.getValue();
                    AnonymousClass3MW.A1X(interopComposeSelectIntegratorViewModel.A05, new InteropComposeSelectIntegratorViewModel$loadOptedInIntegrators$1(interopComposeSelectIntegratorViewModel, (C30391dr) null), C41561wd.A00(interopComposeSelectIntegratorViewModel));
                    return;
                }
            }
        } else {
            str = "imageLoader";
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820555, menu);
        MenuItem findItem = menu.findItem(2131434909);
        C73503Wf r0 = this.A00;
        if (r0 == null) {
            C18070vi.A11("integratorsAdapter");
            throw null;
        }
        findItem.setVisible(AnonymousClass000.A1O(r0.A00.size()));
        return super.onCreateOptionsMenu(menu);
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A03 = C000200d.A00(r1.A2q);
        }
    }

    public boolean onSearchRequested() {
        AnonymousClass4VZ r1 = this.A01;
        if (r1 == null) {
            C18070vi.A11("searchToolbarHelper");
            throw null;
        }
        r1.A06(false);
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 2131434909) {
            return super.onOptionsItemSelected(menuItem);
        }
        onSearchRequested();
        return true;
    }

    public InteropComposeSelectIntegratorActivity(int i) {
        this.A05 = false;
        C91014f0.A00(this, 30);
    }
}
