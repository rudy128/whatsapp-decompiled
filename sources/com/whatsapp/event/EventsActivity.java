package com.whatsapp.event;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass5HR;
import X.AnonymousClass5HS;
import X.AnonymousClass5NV;
import X.C18070vi;
import X.C18100vl;
import X.C203411t;
import X.C28931bI;
import X.C34511kb;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C73643Wt;
import X.C82984Cx;
import X.C83694Gh;
import X.C84334Jc;
import X.C91014f0;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.GroupJid;

public final class EventsActivity extends AnonymousClass1FY {
    public RecyclerView A00;
    public C84334Jc A01;
    public C34511kb A02;
    public C203411t A03;
    public AnonymousClass1CJ A04;
    public C73643Wt A05;
    public C28931bI A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public View A09;
    public boolean A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;

    public EventsActivity() {
        this(0);
        this.A0B = AnonymousClass1DF.A00(AnonymousClass00R.A01, new AnonymousClass5NV(this));
        this.A0E = C83694Gh.A00(this, "source", 0);
        this.A0D = AnonymousClass1DF.A01(new AnonymousClass5HS(this));
        this.A0C = AnonymousClass1DF.A01(new AnonymousClass5HR(this));
    }

    public void A2y() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A04 = AnonymousClass3Ma.A0d(r2);
            this.A02 = AnonymousClass3MZ.A0b(r2);
            this.A03 = AnonymousClass10E.A48(r2);
            this.A01 = (C84334Jc) A0K.A2n.get();
            this.A07 = AnonymousClass3MX.A11(r2);
            this.A08 = AnonymousClass3MW.A0s(r2);
        }
    }

    public void A3K() {
        AnonymousClass00H r0 = this.A07;
        if (r0 != null) {
            AnonymousClass3MX.A0u(r0).A02(AnonymousClass3MX.A0m(this.A0B), 57);
        } else {
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public void onBackPressed() {
        String str;
        if (this.A0D.getValue() == C82984Cx.COMMUNITY_ANNOUNCEMENT_GROUP_INFO) {
            C203411t r2 = this.A03;
            if (r2 != null) {
                AnonymousClass1BI A0m = AnonymousClass3MX.A0m(this.A0B);
                C18070vi.A0z(A0m, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                GroupJid groupJid = (GroupJid) A0m;
                View view = this.A09;
                if (view == null) {
                    str = "rootView";
                } else {
                    r2.CAr(this, view, groupJid);
                }
            } else {
                str = "communityNavigatorBridge";
            }
            C18070vi.A11(str);
            throw null;
        }
        super.onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r2 != 3) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r0 = 2131624520(0x7f0e0248, float:1.8876222E38)
            r5.setContentView((int) r0)
            X.0vl r3 = r5.A0B
            X.1BI r1 = X.AnonymousClass3MX.A0m(r3)
            boolean r0 = r1 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x0029
            X.1CJ r0 = r5.A04
            if (r0 == 0) goto L_0x00dc
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            int r2 = r0.A06(r1)
            r0 = 1
            r1 = 2131890157(0x7f120fed, float:1.9414998E38)
            if (r2 == r0) goto L_0x002c
            r0 = 3
            r1 = 2131890156(0x7f120fec, float:1.9414996E38)
            if (r2 == r0) goto L_0x002c
        L_0x0029:
            r1 = 2131890155(0x7f120feb, float:1.9414994E38)
        L_0x002c:
            r5.setTitle(r1)
            X.C72473Md.A18(r5)
            X.1pm r1 = X.AnonymousClass3MZ.A0H(r5)
            r4 = 0
            com.whatsapp.event.EventsActivity$onCreate$1 r0 = new com.whatsapp.event.EventsActivity$onCreate$1
            r0.<init>(r5, r4)
            X.AnonymousClass3MX.A1Q(r0, r1)
            r0 = 2131429041(0x7f0b06b1, float:1.8479744E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r5, r0)
            r5.A09 = r0
            r0 = 2131430640(0x7f0b0cf0, float:1.8482987E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r5, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r5.A00 = r0
            r0 = 2131435058(0x7f0b1e32, float:1.8491947E38)
            X.1bI r0 = X.AnonymousClass3Ma.A0x(r5, r0)
            r5.A06 = r0
            X.0vl r0 = r5.A0D
            java.lang.Object r1 = r0.getValue()
            X.4Cx r1 = (X.C82984Cx) r1
            X.3Wt r0 = new X.3Wt
            r0.<init>(r1)
            r5.A05 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r5.A00
            if (r1 != 0) goto L_0x0075
            java.lang.String r0 = "eventsRecyclerView"
        L_0x0071:
            X.C18070vi.A11(r0)
            throw r4
        L_0x0075:
            android.content.Context r0 = r1.getContext()
            X.AnonymousClass3Ma.A15(r0, r1)
            X.3Wt r0 = r5.A05
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "eventsAdapter"
            goto L_0x0071
        L_0x0083:
            r1.setAdapter(r0)
            X.1CJ r1 = r5.A04
            if (r1 == 0) goto L_0x00d3
            X.1BI r0 = X.AnonymousClass3MX.A0m(r3)
            boolean r0 = r1.A0R(r0)
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r3.getValue()
            boolean r0 = r0 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x00ce
            X.1kb r2 = r5.A02
            if (r2 == 0) goto L_0x00d6
            X.1BI r1 = X.AnonymousClass3MX.A0m(r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.C18070vi.A0z(r1, r0)
            X.1EC r1 = (X.AnonymousClass1EC) r1
            X.1EC r3 = r2.A05(r1)
            if (r3 == 0) goto L_0x00ce
            X.1bI r2 = r5.A06
            java.lang.String r1 = "seeAllCommunityEventsViewStubHolder"
            if (r2 == 0) goto L_0x00cf
            r0 = 0
            r2.A04(r0)
            X.1bI r0 = r5.A06
            if (r0 == 0) goto L_0x00cf
            android.view.View r1 = r0.A02()
            r0 = 2131435060(0x7f0b1e34, float:1.8491952E38)
            android.view.View r1 = X.C18070vi.A05(r1, r0)
            r0 = 1
            X.AnonymousClass3MY.A1E(r1, r3, r5, r0)
        L_0x00ce:
            return
        L_0x00cf:
            X.C18070vi.A11(r1)
            throw r4
        L_0x00d3:
            java.lang.String r0 = "chatsCache"
            goto L_0x00d8
        L_0x00d6:
            java.lang.String r0 = "communityChatManager"
        L_0x00d8:
            X.C18070vi.A11(r0)
            throw r4
        L_0x00dc:
            X.AnonymousClass3MW.A1I()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.event.EventsActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (C72453Mb.A0B(menuItem) == 16908332 && this.A0D.getValue() == C82984Cx.COMMUNITY_ANNOUNCEMENT_GROUP_INFO) {
            C203411t r2 = this.A03;
            if (r2 != null) {
                AnonymousClass1BI A0m = AnonymousClass3MX.A0m(this.A0B);
                C18070vi.A0z(A0m, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                GroupJid groupJid = (GroupJid) A0m;
                View view = this.A09;
                if (view == null) {
                    str = "rootView";
                } else {
                    r2.CAr(this, view, groupJid);
                }
            } else {
                str = "communityNavigatorBridge";
            }
            C18070vi.A11(str);
            throw null;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public EventsActivity(int i) {
        this.A0A = false;
        C91014f0.A00(this, 4);
    }
}
