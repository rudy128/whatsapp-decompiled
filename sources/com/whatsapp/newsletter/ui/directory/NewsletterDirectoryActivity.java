package com.whatsapp.newsletter.ui.directory;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6BJ;
import X.AnonymousClass6ZT;
import X.AnonymousClass6ZU;
import X.AnonymousClass74D;
import X.C108355bZ;
import X.C108955ca;
import X.C108985cd;
import X.C109005cf;
import X.C112105kw;
import X.C112415lR;
import X.C122746Rt;
import X.C133836pa;
import X.C1423279a;
import X.C152677oI;
import X.C1595685a;
import X.C179619Ir;
import X.C18070vi;
import X.C18100vl;
import X.C19880zA;
import X.C19890zB;
import X.C30361do;
import X.C37911qO;
import X.C38391rD;
import X.C39711tW;
import X.C72453Mb;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

public final class NewsletterDirectoryActivity extends AnonymousClass6BJ implements C1595685a {
    public RecyclerView A00;
    public RecyclerView A01;
    public C19880zA A02;
    public AnonymousClass6ZT A03;
    public AnonymousClass6ZU A04;
    public C108355bZ A05;
    public C112415lR A06;
    public C112105kw A07;
    public C122746Rt A08;
    public List A09;
    public boolean A0A;
    public final C18100vl A0B;

    public void A2y() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0d(A0A2, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            AnonymousClass6BJ.A0t(A0K, A0A2, r1, AnonymousClass3Ma.A0S(A0A2), this);
            C19890zB r12 = C19890zB.A00;
            this.A04 = r12;
            this.A05 = r12;
            this.A05 = AnonymousClass3MZ.A0V(A0K);
            this.A02 = r12;
            this.A03 = (AnonymousClass6ZT) A0K.A35.get();
            this.A04 = (AnonymousClass6ZU) A0K.A50.get();
        }
    }

    public void A3K() {
        AnonymousClass00H r0 = this.A0E;
        if (r0 != null) {
            C18100vl r02 = C30361do.A0C;
            ((C30361do) C18070vi.A0E(r0)).A02((AnonymousClass1BI) null, 27);
            return;
        }
        C18070vi.A11("navigationTimeSpentManager");
        throw null;
    }

    public final void A4s() {
        if (this.A02 == null) {
            C18070vi.A11("discoveryOptional");
            throw null;
        }
    }

    public NewsletterDirectoryActivity(int i) {
        this.A0A = false;
        C1423279a.A00(this, 17);
    }

    public void onCreate(Bundle bundle) {
        Object obj;
        int intExtra = getIntent().getIntExtra("selected_category", -1);
        Iterator it = C179619Ir.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C179619Ir) obj).ordinal() == intExtra) {
                break;
            }
        }
        this.A09 = (C179619Ir) obj;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("selected_category_title");
        if (C108985cd.A1b(A4d())) {
            if (this.A09 == null && C18070vi.A18(stringExtra, "EXPLORE")) {
                this.A09 = C179619Ir.EXPLORE;
            }
            AnonymousClass00H r0 = this.A0G;
            if (r0 != null) {
                List A11 = AnonymousClass3MW.A11(((C133836pa) r0.get()).A01);
                C179619Ir r1 = this.A09;
                C18070vi.A0d(A11, 0);
                this.A00 = (long) A11.indexOf(r1);
            } else {
                C18070vi.A11("newsletterDirectoryUtil");
                throw null;
            }
        }
        if (stringExtra != null) {
            AnonymousClass3Ma.A0G(this).setTitle((CharSequence) stringExtra);
        }
        A4s();
    }

    public void onDestroy() {
        super.onDestroy();
        A4s();
        C39711tW r1 = this.A02;
        if (r1 != null) {
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.A0u(r1);
            }
            C18070vi.A11("directoryRecyclerView");
            throw null;
        }
        C112415lR r0 = this.A06;
        if (r0 == null) {
            C18070vi.A11("newsletterDirectoryAdapter");
            throw null;
        }
        C37911qO r12 = this.A01;
        if (r12 != null) {
            r0.A01.unregisterObserver(r12);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((C38391rD) null);
            if (!C72453Mb.A1a(this.A0P)) {
                AnonymousClass74D r2 = (AnonymousClass74D) A4e().get();
                r2.A00 = 0;
                r2.A01 = 0;
                return;
            }
            return;
        }
        C18070vi.A11("directoryRecyclerView");
        throw null;
    }

    public NewsletterDirectoryActivity() {
        this(0);
        this.A08 = C122746Rt.EXPLORE;
        this.A09 = AnonymousClass000.A13();
        this.A0B = AnonymousClass1DF.A01(new C152677oI(this));
    }
}
