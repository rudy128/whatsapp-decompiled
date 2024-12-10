package com.whatsapp.product.newsletterenforcements.suspension;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1W6;
import X.AnonymousClass1WR;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3X8;
import X.AnonymousClass445;
import X.AnonymousClass4SX;
import X.AnonymousClass5KG;
import X.AnonymousClass5KI;
import X.AnonymousClass5KJ;
import X.AnonymousClass5KK;
import X.AnonymousClass5KL;
import X.AnonymousClass5ZI;
import X.C104505Ok;
import X.C104515Ol;
import X.C105895Tt;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C18100vl;
import X.C200510q;
import X.C24681Lg;
import X.C27201Vd;
import X.C29431cG;
import X.C29681ch;
import X.C30391dr;
import X.C36401np;
import X.C38391rD;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C86984Tv;
import X.C87314Vc;
import X.C87524Vx;
import X.C89494cY;
import X.C91024f1;
import X.C91634g0;
import X.C95504mL;
import X.C99274sY;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class NewsletterCopyrightSuspensionInfoActivity extends AnonymousClass1FY {
    public C27201Vd A00;
    public AnonymousClass5ZI A01;
    public AnonymousClass4SX A02;
    public C24681Lg A03;
    public AnonymousClass1LU A04;
    public AnonymousClass1W6 A05;
    public C36401np A06;
    public AnonymousClass00H A07;
    public boolean A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final AnonymousClass1WR A0E;

    public NewsletterCopyrightSuspensionInfoActivity() {
        this(0);
        this.A0D = C99274sY.A00(new AnonymousClass5KL(this), new AnonymousClass5KK(this), new C104515Ol(this), AnonymousClass3MW.A15(NewsletterCopyrightSuspensionInfoViewModel.class));
        this.A0A = AnonymousClass1DF.A00(AnonymousClass00R.A01, new C104505Ok(this));
        this.A09 = AnonymousClass1DF.A01(new AnonymousClass5KG(this));
        this.A0B = AnonymousClass1DF.A01(new AnonymousClass5KI(this));
        this.A0C = AnonymousClass1DF.A01(new AnonymousClass5KJ(this));
        this.A0E = new C95504mL(this, 16);
    }

    public void onNewIntent(Intent intent) {
        C18070vi.A0d(intent, 0);
        super.onNewIntent(intent);
        setResult(-1);
        Class<AnonymousClass445> cls = AnonymousClass445.class;
        ArrayList A012 = C87314Vc.A01(intent, cls, "arg_enforcements");
        C17960vV.A07(A012);
        C18070vi.A0X(A012);
        C89494cY r1 = (C89494cY) C87314Vc.A00(intent, cls, "arg_selected_enforcement");
        if (r1 != null) {
            if (this.A04 != null) {
                C72473Md.A0r(this, r1, this.A0A);
            } else {
                AnonymousClass3MW.A1F();
                throw null;
            }
        }
        AnonymousClass3X8 r6 = (AnonymousClass3X8) this.A0B.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(A012));
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((AnonymousClass445) next).A07, next);
        }
        List<C86984Tv> list = r6.A01;
        ArrayList A13 = AnonymousClass000.A13();
        for (C86984Tv r0 : list) {
            AnonymousClass206 r2 = r0.A01;
            AnonymousClass445 r12 = (AnonymousClass445) linkedHashMap.get(String.valueOf(r2.A0y));
            if (r12 != null) {
                A13.add(new C86984Tv(r12, r2));
            }
        }
        r6.A01 = A13;
        r6.notifyDataSetChanged();
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A00 = AnonymousClass3MZ.A0i(r2);
            this.A07 = AnonymousClass3MX.A10(r2);
            this.A02 = AnonymousClass3Ma.A0W(A0K);
            this.A01 = (AnonymousClass5ZI) A0K.A2I.get();
            this.A05 = AnonymousClass3Ma.A0s(r2);
            this.A06 = AnonymousClass3MY.A0e(r1);
            this.A03 = AnonymousClass3MZ.A0o(r2);
            this.A04 = AnonymousClass3MY.A0Z(r2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131888099);
        A3f();
        C72473Md.A18(this);
        setContentView(2131624088);
        C24681Lg r1 = this.A03;
        if (r1 != null) {
            r1.registerObserver(this.A0E);
            C18100vl r2 = this.A0D;
            C91634g0.A00(this, ((NewsletterCopyrightSuspensionInfoViewModel) r2.getValue()).A00, new C105895Tt(this), 14);
            ArrayList arrayList = (ArrayList) this.A09.getValue();
            C18070vi.A0X(arrayList);
            C17880vN.A0E(this.A00, 2131431388).setText(2131892819);
            AnonymousClass3MX.A0I(this, 2131433007).setImageResource(2131233653);
            findViewById(2131435017).setVisibility(4);
            C87524Vx.A01(AnonymousClass3Ma.A0H(this), (C89494cY) C29431cG.A0b(arrayList));
            RecyclerView recyclerView = (RecyclerView) C72463Mc.A0O(this.A0C);
            recyclerView.setAdapter((C38391rD) this.A0B.getValue());
            AnonymousClass3Ma.A15(this, recyclerView);
            NewsletterCopyrightSuspensionInfoViewModel newsletterCopyrightSuspensionInfoViewModel = (NewsletterCopyrightSuspensionInfoViewModel) r2.getValue();
            C29681ch A0o = AnonymousClass3MX.A0o(this.A0A);
            AnonymousClass3MW.A1X(newsletterCopyrightSuspensionInfoViewModel.A03, new NewsletterCopyrightSuspensionInfoViewModel$fetchViolatingMessages$1(A0o, newsletterCopyrightSuspensionInfoViewModel, arrayList, (C30391dr) null), C72453Mb.A12(newsletterCopyrightSuspensionInfoViewModel, A0o));
            return;
        }
        C18070vi.A11("messageObservers");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C24681Lg r1 = this.A03;
        if (r1 != null) {
            r1.unregisterObserver(this.A0E);
        } else {
            C18070vi.A11("messageObservers");
            throw null;
        }
    }

    public NewsletterCopyrightSuspensionInfoActivity(int i) {
        this.A08 = false;
        C91024f1.A00(this, 28);
    }
}
