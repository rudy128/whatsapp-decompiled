package com.whatsapp.conversation.conversationrow.message;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1GP;
import X.AnonymousClass1K1;
import X.AnonymousClass1WR;
import X.AnonymousClass386;
import X.AnonymousClass3MZ;
import X.AnonymousClass48j;
import X.AnonymousClass4QD;
import X.C000200d;
import X.C108675c7;
import X.C108775cH;
import X.C18070vi;
import X.C32491hH;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C79333vF;
import X.C79343vG;
import X.C87474Vs;
import X.C91004ez;
import X.C94604kt;
import X.C95504mL;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import com.whatsapp.WaTextView;
import com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog;

public class KeptMessagesActivity extends C79333vF {
    public ProgressBar A00;
    public ScrollView A01;
    public WaTextView A02;
    public AnonymousClass386 A03;
    public C32491hH A04;
    public AnonymousClass4QD A05;
    public boolean A06;
    public final AnonymousClass1WR A07;

    public KeptMessagesActivity() {
        this(0);
        this.A07 = new C95504mL(this, 7);
    }

    public /* bridge */ /* synthetic */ C108775cH A4c() {
        AnonymousClass48j r11 = new AnonymousClass48j(this, this.A0D, this.A01, 19);
        AnonymousClass11S r4 = this.A02;
        C94604kt r0 = this.A00;
        return new C79343vG(this, r4, r0.A09, r0.A0C, this.A06, this.A00.A0I, this, getFMessageDatabase(), r11);
    }

    public void A2y() {
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A00 = C000200d.A00(A0K.A63);
            this.A03 = AnonymousClass3MZ.A0R(r2);
            C74803cp.A0u(A0K, r2, r1, this, r2.ABd);
            this.A04 = AnonymousClass10E.A8K(r2);
            this.A03 = AnonymousClass1K1.A14(A0K);
            this.A05 = (AnonymousClass4QD) r1.A42.get();
        }
    }

    public C108675c7 getConversationRowCustomizer() {
        return this.A00.A0M.A07;
    }

    public void onDestroy() {
        this.A00.A0W.unregisterObserver(this.A07);
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        super.onDestroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00f9, code lost:
        if (r0 == false) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            r0 = 2131891545(0x7f121559, float:1.9417813E38)
            r10.setTitle(r0)
            X.4kt r0 = r10.A00
            X.1Lg r1 = r0.A0W
            X.1WR r0 = r10.A07
            r1.registerObserver(r0)
            X.1hH r6 = r10.A04
            X.1BI r7 = r10.A0E
            X.C17960vV.A07(r7)
            android.content.Intent r3 = r10.getIntent()
            java.lang.String r2 = "keptMessageCount"
            r0 = 0
            long r8 = r3.getLongExtra(r2, r0)
            r2 = 0
            X.C18070vi.A0d(r7, r2)
            X.2HB r4 = new X.2HB
            r4.<init>()
            java.lang.Integer r0 = X.C17880vN.A0j()
            r4.A04 = r0
            r5 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4.A06 = r0
            X.1CJ r1 = r6.A03
            X.1M9 r0 = r6.A02
            int r0 = X.C43391zj.A00(r0, r1, r7)
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r4.A08 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r4.A0C = r0
            boolean r0 = X.C22971Dz.A0e(r7)
            r3 = 0
            if (r0 == 0) goto L_0x00ff
            X.1MZ r2 = r6.A04
            r0 = r7
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r1 = r2.A0J(r0)
            boolean r0 = r2.A0K(r0)
            if (r1 == 0) goto L_0x0068
            if (r0 == 0) goto L_0x0068
            r3 = 1
        L_0x0068:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r4.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
        L_0x0072:
            r4.A01 = r0
            X.1Nl r0 = r6.A06
            java.lang.String r0 = X.AnonymousClass3Ma.A14(r0, r7)
            r4.A0E = r0
            X.18K r0 = r6.A05
            r0.CC7(r4)
            r0 = 2131625771(0x7f0e072b, float:1.887876E38)
            r10.setContentView((int) r0)
            android.widget.ListView r4 = r10.getListView()
            r2 = 0
            r4.setFastScrollEnabled(r2)
            r4.setScrollbarFadingEnabled(r5)
            android.widget.AbsListView$OnScrollListener r0 = r10.A0M
            r4.setOnScrollListener(r0)
            android.view.LayoutInflater r1 = r10.getLayoutInflater()
            r0 = 2131624854(0x7f0e0396, float:1.88769E38)
            android.view.View r3 = r1.inflate(r0, r4, r2)
            r0 = 2131429598(0x7f0b08de, float:1.8480873E38)
            android.widget.TextView r2 = X.C17880vN.A0E(r3, r0)
            if (r2 == 0) goto L_0x00c5
            X.1BI r1 = r10.A0E
            if (r1 == 0) goto L_0x00c5
            X.4kt r0 = r10.A00
            X.1M9 r0 = r0.A09
            X.1E7 r1 = r0.A0E(r1)
            X.1BI r0 = r10.A0E
            boolean r0 = X.C22971Dz.A0e(r0)
            if (r0 != 0) goto L_0x00f2
            r1 = 2131891553(0x7f121561, float:1.941783E38)
        L_0x00c2:
            r2.setText(r1)
        L_0x00c5:
            r4.addHeaderView(r3)
            X.5cH r0 = r10.A04
            r10.A4b(r0)
            r0 = 2131430398(0x7f0b0bfe, float:1.8482496E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r10.A01 = r0
            r0 = 2131434939(0x7f0b1dbb, float:1.8491706E38)
            android.view.View r0 = r10.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r10.A02 = r0
            r0 = 2131434180(0x7f0b1ac4, float:1.8490167E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r10.A00 = r0
            r10.A4f()
            return
        L_0x00f2:
            if (r1 == 0) goto L_0x00fb
            boolean r0 = r1.A13
            r1 = 2131891552(0x7f121560, float:1.9417827E38)
            if (r0 != 0) goto L_0x00c2
        L_0x00fb:
            r1 = 2131891551(0x7f12155f, float:1.9417825E38)
            goto L_0x00c2
        L_0x00ff:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.message.KeptMessagesActivity.onCreate(android.os.Bundle):void");
    }

    public void onResume() {
        super.onResume();
        AnonymousClass4QD r5 = this.A05;
        AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
        AnonymousClass1BI r3 = this.A0E;
        C18070vi.A0d(supportFragmentManager, 0);
        if (C87474Vs.A00(supportFragmentManager, r5.A00)) {
            C72483Me.A0l(r3, supportFragmentManager, 4);
            EphemeralDmKicBottomSheetDialog.A0N = null;
        }
    }

    public KeptMessagesActivity(int i) {
        this.A06 = false;
        C91004ez.A00(this, 29);
    }
}
