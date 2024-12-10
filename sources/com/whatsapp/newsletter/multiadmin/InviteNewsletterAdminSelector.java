package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3gf;
import X.AnonymousClass4CC;
import X.AnonymousClass4NS;
import X.AnonymousClass5JE;
import X.AnonymousClass5JF;
import X.AnonymousClass5JG;
import X.AnonymousClass9IF;
import X.B8S;
import X.C000200d;
import X.C108115b9;
import X.C18070vi;
import X.C18100vl;
import X.C21356Ail;
import X.C24751Ln;
import X.C29681ch;
import X.C30391dr;
import X.C36401np;
import X.C37581pm;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C91024f1;
import android.os.Bundle;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.Iterator;
import java.util.List;

public final class InviteNewsletterAdminSelector extends AnonymousClass3gf implements C108115b9, B8S {
    public C24751Ln A00;
    public C36401np A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public List A06;
    public boolean A07;
    public final C18100vl A08;
    public final C18100vl A09;
    public final C18100vl A0A;

    public InviteNewsletterAdminSelector() {
        this(0);
        this.A09 = AnonymousClass1DF.A01(new AnonymousClass5JF(this));
        this.A0A = AnonymousClass1DF.A01(new AnonymousClass5JG(this));
        this.A08 = AnonymousClass1DF.A01(new AnonymousClass5JE(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r1 != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A5D(java.util.List r9) {
        /*
            r8 = this;
            r7 = 0
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r5 = r9.iterator()
        L_0x0009:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r4 = r5.next()
            X.9tY r4 = (X.C195569tY) r4
            X.1E2 r2 = r4.A03
            if (r2 == 0) goto L_0x0046
            X.1Ln r0 = r8.A00
            if (r0 == 0) goto L_0x0048
            com.whatsapp.jid.PhoneUserJid r1 = r0.A0D(r2)
            if (r1 == 0) goto L_0x0046
        L_0x0023:
            X.1BI r1 = (X.AnonymousClass1BI) r1
            if (r1 == 0) goto L_0x0009
            X.1M9 r0 = r8.A06
            X.1E7 r3 = r0.A0H(r1)
            r3.A0y = r7
            X.9Ig r2 = r4.A01
            X.0vl r0 = r8.A08
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r0)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.contains(r1)
            X.4NS r0 = new X.4NS
            r0.<init>(r2, r3, r1)
            r6.add(r0)
            goto L_0x0009
        L_0x0046:
            r1 = r2
            goto L_0x0023
        L_0x0048:
            java.lang.String r0 = "waJidMapRepository"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x004f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector.A5D(java.util.List):java.util.List");
    }

    public void BEb(AnonymousClass1E7 r4) {
        Object obj;
        C18070vi.A0d(r4, 0);
        super.BEb(r4);
        List list = this.A06;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (AnonymousClass3MZ.A1Y(r4, ((AnonymousClass4NS) obj).A00.A0J)) {
                    break;
                }
            }
            AnonymousClass4NS r1 = (AnonymousClass4NS) obj;
            if (r1 != null) {
                r1.A00.A0y = r4.A0y;
                this.A01.notifyDataSetChanged();
            }
        }
    }

    public void C53(C29681ch r8, String str, List list) {
        C18070vi.A0h(r8, list);
        C37581pm A0H = AnonymousClass3MZ.A0H(this);
        AnonymousClass3MX.A1Q(new InviteNewsletterAdminSelector$onSend$1(r8, this, str, list, (C30391dr) null), A0H);
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            C74803cp.A0t(A0K, r2, r1, this, A0K.A63);
            C74803cp.A0s(A0K, r2, r1, this);
            this.A02 = AnonymousClass3MX.A10(r2);
            this.A01 = AnonymousClass3MY.A0e(r1);
            this.A03 = C000200d.A00(r1.ADt);
            this.A04 = C000200d.A00(r1.ADu);
            this.A05 = C000200d.A00(r2.A7F);
            this.A00 = AnonymousClass3MZ.A0q(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r6 == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        if (r6 == false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4y(X.AnonymousClass4SL r9, X.AnonymousClass1E7 r10) {
        /*
            r8 = this;
            boolean r3 = X.C18070vi.A15(r9, r10)
            super.A4y(r9, r10)
            java.util.List r0 = r8.A06
            r5 = -1
            if (r0 == 0) goto L_0x002a
            java.util.Iterator r1 = r0.iterator()
            r7 = 0
        L_0x0011:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r1.next()
            X.4NS r0 = (X.AnonymousClass4NS) r0
            X.1E7 r0 = r0.A00
            X.1BI r0 = r0.A0J
            boolean r0 = X.AnonymousClass3MZ.A1Y(r10, r0)
            if (r0 != 0) goto L_0x002b
            int r7 = r7 + 1
            goto L_0x0011
        L_0x002a:
            r7 = -1
        L_0x002b:
            r4 = 0
            if (r7 == r5) goto L_0x0072
            java.util.List r0 = r8.A06
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r0.get(r7)
            X.4NS r0 = (X.AnonymousClass4NS) r0
            if (r0 == 0) goto L_0x00bc
            boolean r6 = r0.A01
            r2 = 2131891452(0x7f1214fc, float:1.9417624E38)
            if (r6 != 0) goto L_0x0044
        L_0x0041:
            r2 = 2131891451(0x7f1214fb, float:1.9417622E38)
        L_0x0044:
            java.util.List r0 = r8.A06
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r0.get(r7)
            X.4NS r0 = (X.AnonymousClass4NS) r0
            if (r0 == 0) goto L_0x00ba
            X.9Ig r1 = r0.A02
        L_0x0052:
            X.9Ig r0 = X.C179509Ig.ADMIN
            if (r1 == r0) goto L_0x006a
            java.util.List r0 = r8.A06
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = r0.get(r7)
            X.4NS r0 = (X.AnonymousClass4NS) r0
            if (r0 == 0) goto L_0x00b8
            X.9Ig r1 = r0.A02
        L_0x0064:
            X.9Ig r0 = X.C179509Ig.OWNER
            if (r1 == r0) goto L_0x006a
            if (r6 == 0) goto L_0x0072
        L_0x006a:
            java.lang.String r1 = r8.getString(r2)
            r0 = 1
            r9.A00(r1, r3, r0)
        L_0x0072:
            java.util.List r0 = r8.A0T
            if (r0 == 0) goto L_0x00b4
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        L_0x007b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b4
            X.1BI r0 = X.C72453Mb.A0l(r1)
            boolean r0 = X.AnonymousClass3MZ.A1Y(r10, r0)
            if (r0 == 0) goto L_0x00b5
            if (r2 == r5) goto L_0x00b4
            X.0vl r0 = r8.A08
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r0 = r8.A0T
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r0 = r0.get(r2)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            if (r0 == 0) goto L_0x00a3
            X.1BI r4 = r0.A0J
        L_0x00a3:
            boolean r0 = X.C29431cG.A18(r1, r4)
            if (r0 == 0) goto L_0x00b4
            r0 = 2131891452(0x7f1214fc, float:1.9417624E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 1
            r9.A00(r1, r3, r0)
        L_0x00b4:
            return
        L_0x00b5:
            int r2 = r2 + 1
            goto L_0x007b
        L_0x00b8:
            r1 = r4
            goto L_0x0064
        L_0x00ba:
            r1 = r4
            goto L_0x0052
        L_0x00bc:
            r6 = 0
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector.A4y(X.4SL, X.1E7):void");
    }

    public void Bpy(AnonymousClass1E7 r1) {
        BEb(r1);
    }

    public void C9M(AnonymousClass9IF r2, String str, List list) {
        C29681ch A0o;
        C18070vi.A0h(list, r2);
        if (r2 == AnonymousClass9IF.INVITE && (A0o = AnonymousClass3MX.A0o(this.A09)) != null && str != null) {
            C53(A0o, str, list);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CRZ();
        this.A05.CGN(new C21356Ail(this, 31));
        WDSSearchBar wDSSearchBar = this.A0H;
        if (wDSSearchBar != null) {
            wDSSearchBar.A08.setTrailingButtonIcon(AnonymousClass4CC.A00);
            wDSSearchBar.A08.setHint(2131895490);
        }
    }

    public InviteNewsletterAdminSelector(int i) {
        this.A07 = false;
        C91024f1.A00(this, 0);
    }
}
