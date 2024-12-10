package com.whatsapp.product.newsletterenforcements.enforcedmessages;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1W6;
import X.AnonymousClass1WR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass446;
import X.AnonymousClass48j;
import X.AnonymousClass5OW;
import X.AnonymousClass5WC;
import X.C000200d;
import X.C103225Jm;
import X.C103235Jn;
import X.C108675c7;
import X.C108775cH;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C18100vl;
import X.C200510q;
import X.C29431cG;
import X.C29681ch;
import X.C34001jj;
import X.C37451pZ;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C79333vF;
import X.C79353vH;
import X.C87314Vc;
import X.C87524Vx;
import X.C88524a2;
import X.C89494cY;
import X.C91024f1;
import X.C95504mL;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class EnforcedMessagesActivity extends C79333vF {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public boolean A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final AnonymousClass1WR A07;

    public EnforcedMessagesActivity() {
        this(0);
        this.A06 = AnonymousClass1DF.A00(AnonymousClass00R.A01, new AnonymousClass5OW(this));
        this.A05 = AnonymousClass1DF.A01(new C103235Jn(this));
        this.A07 = new C95504mL(this, 15);
        this.A04 = AnonymousClass1DF.A01(new C103225Jm(this));
    }

    public /* bridge */ /* synthetic */ C108775cH A4c() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            AnonymousClass48j r12 = new AnonymousClass48j(this, r0.get(), this.A01, 19);
            AnonymousClass11S r4 = this.A02;
            C18070vi.A0W(r4);
            AnonymousClass1M9 r5 = this.A00.A09;
            C18070vi.A0X(r5);
            AnonymousClass1W6 fMessageDatabase = getFMessageDatabase();
            C18070vi.A0X(fMessageDatabase);
            C37451pZ r6 = this.A06;
            C18070vi.A0W(r6);
            C88524a2 r7 = this.A00.A0I;
            C18070vi.A0X(r7);
            AnonymousClass00H r02 = this.A02;
            if (r02 != null) {
                return new C79353vH(this, r4, r5, r6, r7, this, (AnonymousClass1LU) C18070vi.A0E(r02), AnonymousClass3MX.A0o(this.A06), fMessageDatabase, r12, new AnonymousClass5WC(this));
            }
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public void onNewIntent(Intent intent) {
        C18070vi.A0d(intent, 0);
        super.onNewIntent(intent);
        setResult(-1);
        Class<AnonymousClass446> cls = AnonymousClass446.class;
        ArrayList A012 = C87314Vc.A01(intent, cls, "arg_enforcement");
        C17960vV.A07(A012);
        C18070vi.A0X(A012);
        C89494cY r2 = (C89494cY) C87314Vc.A00(intent, cls, "arg_selected_enforcement");
        if (r2 != null) {
            AnonymousClass00H r0 = this.A02;
            if (r0 != null) {
                r0.get();
                AnonymousClass1BI r1 = this.A0E;
                C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
                startActivity(AnonymousClass1LU.A17(this, (C29681ch) r1, r2));
            } else {
                AnonymousClass3MW.A1F();
                throw null;
            }
        }
        A0y(A012);
    }

    private final void A0y(List list) {
        C108775cH r4 = this.A04;
        C18070vi.A0z(r4, "null cannot be cast to non-null type com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesAdapter");
        C79353vH r42 = (C79353vH) r4;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(list));
        for (Object next : list) {
            linkedHashMap.put(((AnonymousClass446) next).A07, next);
        }
        r42.A00 = linkedHashMap;
        r42.notifyDataSetChanged();
        A4b(this.A04);
        A4e();
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A00 = C000200d.A00(A0K.A63);
            this.A03 = AnonymousClass3MZ.A0R(r2);
            C74803cp.A0u(A0K, r2, r1, this, r2.ABd);
            this.A00 = AnonymousClass3MX.A10(r2);
            this.A01 = C000200d.A00(A0K.A43);
            this.A02 = AnonymousClass3MW.A0s(r2);
        }
    }

    public C108675c7 getConversationRowCustomizer() {
        return this.A00.A0M.A05;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131892596);
        setContentView(2131626180);
        ListView listView = getListView();
        C18070vi.A0X(listView);
        listView.setDivider((Drawable) null);
        listView.setFastScrollEnabled(false);
        listView.setScrollbarFadingEnabled(true);
        listView.setOnScrollListener(this.A0M);
        View inflate = getLayoutInflater().inflate(2131624088, listView, false);
        AnonymousClass3MW.A0H(inflate, 2131433007).setImageResource(2131233658);
        inflate.findViewById(2131435017).setVisibility(4);
        listView.addHeaderView(inflate);
        C17880vN.A0E(inflate, 2131431388).setText(2131892595);
        C18100vl r2 = this.A05;
        AbstractCollection abstractCollection = (AbstractCollection) r2.getValue();
        C18070vi.A0X(abstractCollection);
        if (C17880vN.A1X(abstractCollection)) {
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            ArrayList arrayList = (ArrayList) r2.getValue();
            C18070vi.A0X(arrayList);
            Object A0b = C29431cG.A0b(arrayList);
            C18070vi.A0X(A0b);
            C87524Vx.A01(A0H, (C89494cY) A0b);
        }
        this.A00.A0W.registerObserver(this.A07);
        ArrayList arrayList2 = (ArrayList) r2.getValue();
        C18070vi.A0X(arrayList2);
        A0y(arrayList2);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A00.A0W.unregisterObserver(this.A07);
    }

    public EnforcedMessagesActivity(int i) {
        this.A03 = false;
        C91024f1.A00(this, 22);
    }
}
