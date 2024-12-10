package com.whatsapp.event;

import X.AnonymousClass00H;
import X.AnonymousClass1BI;
import X.AnonymousClass24H;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Vp;
import X.AnonymousClass3WS;
import X.C18000vb;
import X.C18070vi;
import X.C27641Ww;
import X.C29351c6;
import X.C445823z;
import X.C49552Qx;
import X.C72473Md;
import X.C72483Me;
import X.C80793y6;
import X.C82944Ct;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.InfoCard;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ChatInfoEventsCard extends InfoCard {
    public C18000vb A00;
    public AnonymousClass00H A01;
    public boolean A02;
    public LinearLayout A03;
    public RecyclerView A04;
    public WaTextView A05;
    public AnonymousClass3WS A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChatInfoEventsCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void setEventMessageManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setTitleRowClickListener(AnonymousClass1BI r3) {
        C18070vi.A0d(r3, 0);
        AnonymousClass3MY.A1E(this.A03, r3, this, 0);
    }

    public final void setUpcomingEvents(List list) {
        C49552Qx r1;
        C18070vi.A0d(list, 0);
        AnonymousClass3WS r6 = this.A06;
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C445823z r3 = (C445823z) it.next();
            C82944Ct r2 = C82944Ct.UPCOMING;
            AnonymousClass24H A012 = AnonymousClass3MW.A0d(getEventMessageManager()).A01(r3);
            if (A012 != null) {
                r1 = A012.A02;
            } else {
                r1 = null;
            }
            A0D.add(new C80793y6(r2, r3, r1));
        }
        List list2 = r6.A00;
        C72473Md.A1B(new AnonymousClass3Vp(list2, A0D), r6, A0D, list2);
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass00H getEventMessageManager() {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("eventMessageManager");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setInfoText(int i) {
        this.A05.setText(C72483Me.A0W(getResources(), i, 2131755135));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatInfoEventsCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A01();
        this.A06 = new AnonymousClass3WS();
        LayoutInflater.from(context).inflate(2131627256, this, true);
        this.A05 = AnonymousClass3Ma.A0N(this, 2131436526);
        this.A03 = (LinearLayout) C18070vi.A05(this, 2131436529);
        C27641Ww.A0B(this.A05, getWhatsAppLocale(), 2131233242);
        RecyclerView recyclerView = (RecyclerView) C18070vi.A05(this, 2131436527);
        this.A04 = recyclerView;
        recyclerView.setLayoutDirection(AnonymousClass3MW.A1Z(getWhatsAppLocale()) ? 1 : 0);
        this.A04.setLayoutManager(new LinearLayoutManager(context, 0, false));
        this.A04.setAdapter(this.A06);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChatInfoEventsCard(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
