package com.whatsapp.biz.product.view.activity;

import X.A1M;
import X.A78;
import X.A8Q;
import X.AEW;
import X.AGB;
import X.AOD;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass1E7;
import X.AnonymousClass1EG;
import X.AnonymousClass1K1;
import X.AnonymousClass1M6;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass1YL;
import X.AnonymousClass2UJ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8GC;
import X.AnonymousClass9M1;
import X.AnonymousClass9QG;
import X.B7A;
import X.B7C;
import X.C000200d;
import X.C137116uw;
import X.C166598dA;
import X.C168128iM;
import X.C168648jP;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C182499Up;
import X.C18460wS;
import X.C187599g4;
import X.C187669gB;
import X.C190289kg;
import X.C191899nN;
import X.C192559ob;
import X.C192789oz;
import X.C194359rb;
import X.C195469tO;
import X.C195529tU;
import X.C196149uX;
import X.C19830z4;
import X.C20005A2v;
import X.C20259ADr;
import X.C20287AEv;
import X.C20339AGv;
import X.C20479AMq;
import X.C21450AkH;
import X.C21528Alb;
import X.C21535Ali;
import X.C22368B4w;
import X.C22417B6z;
import X.C22891Dp;
import X.C26302CxJ;
import X.C27201Vd;
import X.C28281Zt;
import X.C28931bI;
import X.C32951i1;
import X.C37451pZ;
import X.C37511pf;
import X.C42741yf;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import X.C72473Md;
import X.C91254fO;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class ProductDetailActivity extends C168648jP implements B7C, C22368B4w {
    public C182499Up A00;
    public PostcodeChangeBottomSheet A01;
    public C27201Vd A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public boolean A07;
    public boolean A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final AnonymousClass1M6 A0D;
    public final AnonymousClass9M1 A0E;

    private final void A0Q(AEW aew) {
        String str;
        String string;
        Spannable[] spannableArr;
        TextEmojiLabel textEmojiLabel;
        String str2 = null;
        C19830z4 r1 = this.A0A;
        UserJid userJid = aew.A09;
        if (userJid == null || (str = userJid.getRawString()) == null) {
            str = A4e().getRawString();
        }
        String A0q = r1.A0q(str);
        if (A0q == null || A0q.length() == 0) {
            C20259ADr aDr = aew.A03;
            if (aDr != null) {
                str2 = aDr.A00;
            }
        } else {
            str2 = A0q;
        }
        if (str2 != null) {
            string = getString(2131892988);
            String A0F = C18070vi.A0F(this, 2131888083);
            SpannableStringBuilder A092 = AnonymousClass3MW.A09(A0F);
            A092.setSpan(new C166598dA(this), 0, A0F.length(), 33);
            spannableArr = new Spannable[]{AnonymousClass3MW.A09(str2), A092};
        } else {
            string = getString(2131892987);
            String A0F2 = C18070vi.A0F(this, 2131888083);
            SpannableStringBuilder A093 = AnonymousClass3MW.A09(A0F2);
            A093.setSpan(new C166598dA(this), 0, A0F2.length(), 33);
            spannableArr = new Spannable[]{A093};
        }
        SpannableStringBuilder A042 = C26302CxJ.A04(string, spannableArr);
        C28931bI r0 = this.A0g;
        if (!(r0 == null || (textEmojiLabel = (TextEmojiLabel) r0.A02()) == null)) {
            AnonymousClass3Ma.A1L(textEmojiLabel.getAbProps(), textEmojiLabel);
            C72473Md.A1C(textEmojiLabel);
            textEmojiLabel.setLinksClickable(true);
            textEmojiLabel.setFocusable(true);
            AnonymousClass8BW.A0z(this, textEmojiLabel.getResources(), textEmojiLabel, 2130971113, 2131102439);
            textEmojiLabel.setText(A042);
            textEmojiLabel.setGravity(8388611);
        }
        AnonymousClass8BX.A0y(this, findViewById(2131434107));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.A7D, java.lang.Object] */
    public void C1u(C187669gB r7, boolean z) {
        String str;
        C20287AEv aEv = this.A0K;
        String str2 = null;
        if (aEv != null) {
            str = aEv.A0H;
        } else {
            str = null;
        }
        if (C18070vi.A18(str, r7.A03)) {
            CEx();
            A8Q A4c = A4c();
            ? obj = new Object();
            obj.A0B = r7.A05;
            obj.A05 = Integer.valueOf(r7.A00);
            A8Q.A06(obj, this);
            obj.A09 = Long.valueOf(r7.A01);
            C20287AEv aEv2 = this.A0K;
            if (z) {
                if (aEv2 != null) {
                    str2 = aEv2.A0H;
                }
                obj.A0H = str2;
                obj.A00 = A4e();
                A4c.A09(obj);
                BhU(new Object[0], 2131887991, 2131887989);
                return;
            }
            if (aEv2 != null) {
                str2 = aEv2.A0H;
            }
            obj.A0H = str2;
            obj.A00 = A4e();
            A4c.A09(obj);
            BhQ(2131887990);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        List list;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 55) {
            A1M a1m = this.A0I;
            if (a1m != null) {
                C20005A2v a2v = this.A0M;
                UserJid A4e = A4e();
                C20287AEv aEv = this.A0K;
                if (aEv != null) {
                    list = C18070vi.A0M(aEv);
                } else {
                    list = C18460wS.A00;
                }
                a1m.A02(this, a2v, A4e(), A4e, list, 2, 0, 0);
                return;
            }
            C18070vi.A11("catalogUtils");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r2 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            android.view.MenuInflater r1 = r3.getMenuInflater()
            r0 = 2131820586(0x7f11002a, float:1.9273891E38)
            r1.inflate(r0, r4)
            boolean r2 = X.AnonymousClass8GC.A00(r3)
            r0 = 2131432515(0x7f0b1443, float:1.848679E38)
            android.view.MenuItem r1 = r4.findItem(r0)
            boolean r0 = r3.A15
            if (r0 != 0) goto L_0x0020
            r0 = 1
            if (r2 != 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r1.setVisible(r0)
            boolean r0 = super.onCreateOptionsMenu(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.view.activity.ProductDetailActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r3 = r2.A00;
            C63932tv.A01(r2, r3, this);
            C63662tU.A00(r2, r3, this, r3.A5A);
            this.A0b = AnonymousClass8BT.A0W(r2);
            this.A0T = (A78) A002.A0C.get();
            this.A0D = (C196149uX) r2.A1I.get();
            this.A0E = AnonymousClass8BT.A0D(r2);
            this.A0j = C000200d.A00(r2.A1o);
            this.A0k = C000200d.A00(A002.A0V);
            this.A0l = C000200d.A00(A002.A0W);
            this.A0G = (B7A) A002.A2T.get();
            this.A0m = C000200d.A00(r2.AGs);
            this.A0L = AnonymousClass8BU.A0D(r2);
            this.A0n = C000200d.A00(r2.A1q);
            this.A0o = C000200d.A00(r2.A1r);
            this.A0p = C000200d.A00(r3.A7j);
            this.A0C = (C22417B6z) A002.A2N.get();
            this.A0q = C000200d.A00(r2.A1s);
            this.A0N = (C191899nN) r3.A7i.get();
            this.A0F = (C195529tU) r2.A1t.get();
            this.A0I = (A1M) r3.A7k.get();
            this.A0r = C000200d.A00(A002.A0Z);
            this.A0s = C000200d.A00(r2.A1y);
            this.A0Y = (C32951i1) r2.A28.get();
            this.A0U = AnonymousClass10E.A4z(r2);
            this.A0t = C000200d.A00(r3.A0n);
            this.A0V = (C37511pf) r2.AX7.get();
            this.A0u = C000200d.A00(A002.AAP.A01);
            this.A0a = (AnonymousClass2UJ) r3.A3d.get();
            AnonymousClass00H A003 = C000200d.A00(r2.A1s);
            AnonymousClass00H A004 = C000200d.A00(r2.A1q);
            this.A0R = new C187599g4((C192789oz) r2.A8n.get(), (AnonymousClass118) r2.ABY.get(), AnonymousClass10E.AL0(r2), A003, A004);
            this.A0v = C000200d.A00(r2.A8o);
            this.A0B = AnonymousClass3MZ.A0U(r2);
            this.A0W = AnonymousClass3MZ.A0f(r2);
            this.A0X = AnonymousClass3MZ.A0g(r2);
            this.A0w = AnonymousClass3MW.A0s(r2);
            this.A0x = C000200d.A00(r2.ABW);
            this.A03 = C000200d.A00(r2.A1H);
            this.A04 = C000200d.A00(r2.A1K);
            this.A05 = C000200d.A00(r2.A1u);
            this.A02 = AnonymousClass3MZ.A0i(r2);
            this.A06 = AnonymousClass8BT.A0h(r2);
            this.A00 = (C182499Up) A002.A5U.get();
        }
    }

    public void A3K() {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 6715)) {
            AnonymousClass00H r0 = this.A06;
            if (r0 != null) {
                AnonymousClass3MX.A0u(r0).A02(A4e(), 61);
            } else {
                C18070vi.A11("navigationTimeSpentManager");
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:180:0x022a, code lost:
        if (r0.size() > 0) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0106, code lost:
        if (r0 == null) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4g() {
        /*
            r16 = this;
            r10 = r16
            r10.invalidateOptionsMenu()
            X.AEv r0 = r10.A0K
            r3 = 1
            r2 = 8
            r1 = 0
            if (r0 != 0) goto L_0x011f
            int r4 = r10.A01
            com.whatsapp.TextEmojiLabel r0 = r10.A0A
            if (r4 != r3) goto L_0x010a
            if (r0 == 0) goto L_0x0018
            r0.setVisibility(r2)
        L_0x0018:
            android.widget.TextView r0 = r10.A07
            if (r0 == 0) goto L_0x001f
            r0.setVisibility(r2)
        L_0x001f:
            X.1bI r0 = r10.A0f
            if (r0 == 0) goto L_0x0026
            r0.A04(r1)
        L_0x0026:
            r10.A4d()
            int r4 = r10.A01
            X.AEv r5 = r10.A0K
            r6 = 0
            if (r5 == 0) goto L_0x004c
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x004c
            if (r4 == 0) goto L_0x0039
            r0 = 4
            if (r4 != r0) goto L_0x004c
        L_0x0039:
            boolean r0 = r5.A02()
            if (r0 != 0) goto L_0x004c
            X.AEJ r0 = r5.A03
            if (r0 == 0) goto L_0x004c
            int r0 = r0.A00
            if (r0 != 0) goto L_0x004c
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x004c
            r6 = 1
        L_0x004c:
            r3 = 8
            r2 = 2
            if (r6 == 0) goto L_0x0089
            X.8GC r0 = r10.A4d()
            X.1DT r0 = r0.A04
            java.lang.Object r4 = r0.A06()
            X.AEW r4 = (X.AEW) r4
            X.AEv r0 = r10.A0K
            if (r0 == 0) goto L_0x0104
            int r0 = r0.A00
            if (r0 != r2) goto L_0x0104
            if (r4 == 0) goto L_0x0104
            X.00H r0 = r10.A0o
            if (r0 == 0) goto L_0x0386
            java.lang.Object r2 = r0.get()
            X.A1i r2 = (X.C19973A1i) r2
            r1 = 1
            java.lang.String r0 = "postcode"
            boolean r0 = X.C19973A1i.A00(r2, r4, r0, r1)
            if (r0 == 0) goto L_0x0104
            r10.A0Q(r4)
            X.1bI r0 = r10.A0g
            if (r0 == 0) goto L_0x0085
            r3 = 0
        L_0x0082:
            r0.A04(r3)
        L_0x0085:
            super.A4g()
            return
        L_0x0089:
            if (r4 == r2) goto L_0x009e
            if (r5 == 0) goto L_0x0095
            X.AEJ r0 = r5.A03
            if (r0 == 0) goto L_0x0095
            int r0 = r0.A00
            if (r0 != 0) goto L_0x009e
        L_0x0095:
            r2 = 1
            if (r5 == 0) goto L_0x00e8
            boolean r0 = r5.A02()
            if (r0 != r2) goto L_0x00e8
        L_0x009e:
            r5 = 2131895155(0x7f122373, float:1.9425135E38)
        L_0x00a1:
            X.8GC r0 = r10.A4d()
            X.1DT r0 = r0.A04
            java.lang.Object r4 = r0.A06()
            X.AEW r4 = (X.AEW) r4
            if (r4 == 0) goto L_0x00cd
            X.00H r0 = r10.A0o
            if (r0 == 0) goto L_0x0386
            java.lang.Object r3 = r0.get()
            X.A1i r3 = (X.C19973A1i) r3
            r2 = 1
            java.lang.String r0 = "postcode"
            boolean r0 = X.C19973A1i.A00(r3, r4, r0, r2)
            if (r0 == 0) goto L_0x00cd
            r10.A0Q(r4)
        L_0x00c5:
            X.1bI r0 = r10.A0g
            if (r0 == 0) goto L_0x0085
            r0.A04(r1)
            goto L_0x0085
        L_0x00cd:
            X.1bI r0 = r10.A0g
            if (r0 == 0) goto L_0x00c5
            android.widget.TextView r4 = X.AnonymousClass3MX.A0M(r0)
            if (r4 == 0) goto L_0x00c5
            android.content.res.Resources r3 = r10.getResources()
            r2 = 2130968974(0x7f04018e, float:1.7546617E38)
            r0 = 2131100033(0x7f060181, float:1.7812436E38)
            X.AnonymousClass8BW.A0z(r10, r3, r4, r2, r0)
            r4.setText(r5)
            goto L_0x00c5
        L_0x00e8:
            r0 = 3
            if (r4 != r0) goto L_0x00ef
            r5 = 2131888017(0x7f120791, float:1.9410657E38)
            goto L_0x00a1
        L_0x00ef:
            if (r5 == 0) goto L_0x0101
            boolean r0 = r5.A0K
            if (r0 != 0) goto L_0x0101
        L_0x00f5:
            X.11E r0 = r10.A07
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0104
            r5 = 2131888272(0x7f120890, float:1.9411175E38)
            goto L_0x00a1
        L_0x0101:
            if (r4 != r2) goto L_0x0104
            goto L_0x00f5
        L_0x0104:
            X.1bI r0 = r10.A0g
            if (r0 == 0) goto L_0x0085
            goto L_0x0082
        L_0x010a:
            if (r0 == 0) goto L_0x010f
            r0.setVisibility(r1)
        L_0x010f:
            android.widget.TextView r0 = r10.A07
            if (r0 == 0) goto L_0x0116
            r0.setVisibility(r1)
        L_0x0116:
            X.1bI r0 = r10.A0f
            if (r0 == 0) goto L_0x0026
            r0.A04(r2)
            goto L_0x0026
        L_0x011f:
            X.8GC r0 = r10.A4d()
            X.1DT r0 = r0.A04
            java.lang.Object r0 = r0.A06()
            X.AEW r0 = (X.AEW) r0
            X.C168648jP.A0d(r10, r0)
            X.1bI r0 = r10.A0f
            if (r0 == 0) goto L_0x0135
            r0.A04(r2)
        L_0x0135:
            X.AEv r0 = r10.A0K
            r7 = 0
            if (r0 == 0) goto L_0x0362
            java.lang.String r6 = r0.A08
            if (r6 == 0) goto L_0x0362
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0362
            com.whatsapp.TextEmojiLabel r4 = r10.A0A
            if (r4 == 0) goto L_0x014f
            r8 = 450(0x1c2, float:6.3E-43)
            r5 = r7
            r9 = r1
            r4.A0Q(r5, r6, r7, r8, r9)
        L_0x014f:
            com.whatsapp.TextEmojiLabel r0 = r10.A0A
            if (r0 == 0) goto L_0x0156
            r0.setVisibility(r1)
        L_0x0156:
            X.AEv r4 = r10.A0K
            if (r4 == 0) goto L_0x0359
            java.math.BigDecimal r0 = r4.A09
            if (r0 == 0) goto L_0x0359
            X.A6S r0 = r4.A07
            if (r0 == 0) goto L_0x0359
            android.widget.TextView r0 = r10.A07
            if (r0 == 0) goto L_0x0169
            r0.setVisibility(r1)
        L_0x0169:
            android.widget.TextView r4 = r10.A07
            if (r4 == 0) goto L_0x0185
            X.AEv r0 = r10.A0K
            if (r0 == 0) goto L_0x0354
            java.math.BigDecimal r14 = r0.A09
            X.A6S r12 = r0.A07
            X.AE5 r11 = r0.A04
        L_0x0177:
            X.0vb r13 = r10.A00
            java.util.Date r15 = new java.util.Date
            r15.<init>()
            android.text.SpannableString r0 = X.A78.A01(r10, r11, r12, r13, r14, r15)
            r4.setText(r0)
        L_0x0185:
            X.AEv r0 = r10.A0K
            if (r0 == 0) goto L_0x0351
            java.lang.String r0 = r0.A0E
        L_0x018b:
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r5 = r10.A0P
            if (r0 == 0) goto L_0x0337
            if (r5 == 0) goto L_0x0198
            r5.setVisibility(r2)
        L_0x0198:
            X.AEv r0 = r10.A0K
            if (r0 == 0) goto L_0x0334
            java.lang.String r0 = r0.A0G
        L_0x019e:
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            android.widget.TextView r5 = r10.A06
            if (r0 == 0) goto L_0x030f
            if (r5 == 0) goto L_0x01ab
            r5.setVisibility(r2)
        L_0x01ab:
            X.AEv r0 = r10.A0K
            if (r0 == 0) goto L_0x030c
            java.lang.String r0 = r0.A0J
        L_0x01b1:
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            if (r0 != 0) goto L_0x0303
            X.1PM r4 = r10.A0W
            if (r4 == 0) goto L_0x038d
            com.whatsapp.jid.UserJid r0 = r10.A4e()
            boolean r0 = r4.A04(r0)
            if (r0 != 0) goto L_0x0303
            android.widget.TextView r4 = r10.A08
            if (r4 == 0) goto L_0x01d8
            X.AEv r0 = r10.A0K
            if (r0 == 0) goto L_0x01cf
            java.lang.String r7 = r0.A0J
        L_0x01cf:
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r0 = X.AnonymousClass1EG.A0E(r7, r0)
            r4.setText(r0)
        L_0x01d8:
            android.widget.TextView r0 = r10.A08
            if (r0 == 0) goto L_0x01df
            r0.setVisibility(r1)
        L_0x01df:
            X.C168648jP.A0c(r10)
            X.AEv r0 = r10.A0K
            if (r0 == 0) goto L_0x02fa
            int r0 = r0.A00
            if (r0 != r3) goto L_0x02fa
            X.1bI r0 = r10.A0d
            if (r0 == 0) goto L_0x01fa
            android.widget.TextView r2 = X.AnonymousClass3MX.A0M(r0)
            if (r2 == 0) goto L_0x01fa
            r0 = 2131894790(0x7f122206, float:1.9424395E38)
            r2.setText(r0)
        L_0x01fa:
            X.1bI r0 = r10.A0d
            if (r0 == 0) goto L_0x0201
            r0.A04(r1)
        L_0x0201:
            X.1bI r0 = r10.A0h
            if (r0 == 0) goto L_0x0252
            android.view.View r0 = r0.A02()
            androidx.fragment.app.FragmentContainerView r0 = (androidx.fragment.app.FragmentContainerView) r0
            if (r0 == 0) goto L_0x0252
            androidx.fragment.app.Fragment r4 = r0.getFragment()
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselBaseFragment r4 = (com.whatsapp.biz.catalog.view.variants.VariantsCarouselBaseFragment) r4
            if (r4 == 0) goto L_0x0252
            X.AEv r0 = r10.A0K
            if (r0 == 0) goto L_0x022c
            X.AE6 r0 = r0.A05
            if (r0 == 0) goto L_0x022c
            X.ADW r0 = r0.A00
            if (r0 == 0) goto L_0x022c
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x022c
            int r0 = r0.size()
            r2 = 1
            if (r0 > 0) goto L_0x022d
        L_0x022c:
            r2 = 0
        L_0x022d:
            boolean r0 = r10.A16
            if (r0 == 0) goto L_0x0252
            X.AEv r0 = r10.A0K
            r10.A0J = r0
            if (r2 != 0) goto L_0x0248
            if (r0 == 0) goto L_0x0248
            X.AE6 r0 = r0.A05
            if (r0 == 0) goto L_0x0248
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x0248
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0248
            r3 = 0
        L_0x0248:
            X.AEv r2 = r10.A0K
            r0 = 1
            X.Ali r0 = X.C21535Ali.A00(r10, r0)
            r4.A25(r2, r0, r3)
        L_0x0252:
            java.util.List r0 = r10.A13
            if (r0 == 0) goto L_0x0259
            X.C168648jP.A0r(r10, r0)
        L_0x0259:
            X.AEv r9 = r10.A0K
            X.A2v r7 = r10.A0M
            if (r9 == 0) goto L_0x0026
            if (r7 == 0) goto L_0x0026
            com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView r6 = r10.A0O
            if (r6 == 0) goto L_0x0026
            com.whatsapp.jid.UserJid r5 = r10.A4e()
            r10.A4d()
            int r4 = r10.A01
            X.AEv r3 = r10.A0K
            r2 = 0
            if (r3 == 0) goto L_0x0283
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x0283
            if (r4 == 0) goto L_0x027c
            r0 = 4
            if (r4 != r0) goto L_0x0283
        L_0x027c:
            boolean r0 = r3.A02()
            if (r0 != 0) goto L_0x0283
            r2 = 1
        L_0x0283:
            r3 = 1
            r6.A03 = r7
            r6.A08 = r5
            r6.A0D = r2
            X.AEv r0 = r6.A01
            boolean r0 = r9.equals(r0)
            r8 = r0 ^ 1
            r6.A01 = r9
            boolean r0 = r6.A0E
            if (r0 != 0) goto L_0x0374
            r6.A0E = r3
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0D(r6)
            r0 = 2131626621(0x7f0e0a7d, float:1.8880483E38)
            android.view.View r7 = r2.inflate(r0, r6, r3)
            r0 = 2131434110(0x7f0b1a7e, float:1.8490025E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.C108945cZ.A0U(r7, r0)
            r6.A00 = r0
            android.content.Context r0 = r6.getContext()
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r2.<init>(r0, r1, r1)
            androidx.recyclerview.widget.RecyclerView r0 = r6.A00
            java.lang.String r5 = "imageList"
            if (r0 == 0) goto L_0x0382
            r0.setLayoutManager(r2)
            X.8Hf r2 = new X.8Hf
            r2.<init>(r6)
            r6.A05 = r2
            androidx.recyclerview.widget.RecyclerView r0 = r6.A00
            if (r0 == 0) goto L_0x0382
            r0.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r4 = r6.A00
            if (r4 == 0) goto L_0x0382
            android.content.res.Resources r2 = r6.getResources()
            r0 = 2131168334(0x7f070c4e, float:1.7950967E38)
            int r3 = r2.getDimensionPixelSize(r0)
            X.0vb r2 = r6.getWaLocale()
            X.3XT r0 = new X.3XT
            r0.<init>(r2, r3)
            r4.A0r(r0)
            r0 = 2131434840(0x7f0b1d58, float:1.8491505E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r7, r0)
            com.whatsapp.biz.catalog.view.CarouselScrollbarView r2 = (com.whatsapp.biz.catalog.view.CarouselScrollbarView) r2
            r6.A04 = r2
            if (r2 != 0) goto L_0x036b
            java.lang.String r0 = "scrollBar"
            goto L_0x0388
        L_0x02fa:
            X.1bI r0 = r10.A0d
            if (r0 == 0) goto L_0x0201
            r0.A04(r2)
            goto L_0x0201
        L_0x0303:
            android.widget.TextView r0 = r10.A08
            if (r0 == 0) goto L_0x01df
            r0.setVisibility(r2)
            goto L_0x01df
        L_0x030c:
            r0 = r7
            goto L_0x01b1
        L_0x030f:
            if (r5 == 0) goto L_0x0320
            X.AEv r0 = r10.A0K
            if (r0 == 0) goto L_0x0332
            java.lang.String r4 = r0.A0G
        L_0x0317:
            r0 = 420(0x1a4, float:5.89E-43)
            java.lang.String r0 = X.AnonymousClass1EG.A0E(r4, r0)
            r5.setText(r0)
        L_0x0320:
            android.widget.TextView r4 = r10.A06
            if (r4 == 0) goto L_0x0329
            r0 = 38
            X.AnonymousClass3Ma.A1C(r4, r10, r0)
        L_0x0329:
            android.widget.TextView r0 = r10.A06
            if (r0 == 0) goto L_0x01ab
            r0.setVisibility(r1)
            goto L_0x01ab
        L_0x0332:
            r4 = r7
            goto L_0x0317
        L_0x0334:
            r0 = r7
            goto L_0x019e
        L_0x0337:
            if (r5 == 0) goto L_0x0346
            r5.A02 = r3
            X.AEv r0 = r10.A0K
            if (r0 == 0) goto L_0x034f
            java.lang.String r4 = r0.A0E
        L_0x0341:
            r0 = 180(0xb4, float:2.52E-43)
            r5.A0S(r4, r7, r0, r3)
        L_0x0346:
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r10.A0P
            if (r0 == 0) goto L_0x0198
            r0.setVisibility(r1)
            goto L_0x0198
        L_0x034f:
            r4 = r7
            goto L_0x0341
        L_0x0351:
            r0 = r7
            goto L_0x018b
        L_0x0354:
            r14 = r7
            r12 = r7
            r11 = r7
            goto L_0x0177
        L_0x0359:
            android.widget.TextView r0 = r10.A07
            if (r0 == 0) goto L_0x0185
            r0.setVisibility(r2)
            goto L_0x0185
        L_0x0362:
            com.whatsapp.TextEmojiLabel r0 = r10.A0A
            if (r0 == 0) goto L_0x0156
            r0.setVisibility(r2)
            goto L_0x0156
        L_0x036b:
            androidx.recyclerview.widget.RecyclerView r0 = r6.A00
            if (r0 == 0) goto L_0x0382
            r2.A00 = r0
            X.AnonymousClass8ID.A00(r0, r2, r1)
        L_0x0374:
            if (r8 == 0) goto L_0x0026
            X.8Hf r0 = r6.A05
            if (r0 != 0) goto L_0x037d
            java.lang.String r0 = "adapter"
            goto L_0x0388
        L_0x037d:
            r0.notifyDataSetChanged()
            goto L_0x0026
        L_0x0382:
            X.C18070vi.A11(r5)
            goto L_0x038b
        L_0x0386:
            java.lang.String r0 = "catalogFeaturesEnableManager"
        L_0x0388:
            X.C18070vi.A11(r0)
        L_0x038b:
            r0 = 0
            throw r0
        L_0x038d:
            java.lang.String r0 = "verifiedNameManager"
            X.C18070vi.A11(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.view.activity.ProductDetailActivity.A4g():void");
    }

    public ProductDetailActivity(int i) {
        this.A08 = false;
        AGB.A00(this, 22);
    }

    public static final void A03(ProductDetailActivity productDetailActivity, AEW aew) {
        int A012 = AnonymousClass3MW.A01(productDetailActivity.getResources(), 2131167707);
        AnonymousClass00H r0 = productDetailActivity.A0s;
        if (r0 != null) {
            C194359rb A002 = ((C192559ob) r0.get()).A00(aew, AnonymousClass9QG.A00());
            String str = productDetailActivity.A11;
            if (str != null) {
                AnonymousClass8BW.A0F(productDetailActivity).A0G(new C195469tO(A002, productDetailActivity.A4e(), Integer.valueOf(productDetailActivity.getIntent().getIntExtra("thumb_width", A012)), Integer.valueOf(productDetailActivity.getIntent().getIntExtra("thumb_height", A012)), str, productDetailActivity.A4c().A03, false));
                return;
            }
            return;
        }
        C18070vi.A11("catalogVariantsRequestDataProvider");
        throw null;
    }

    public void onBackPressed() {
        String str;
        A4e();
        if (AnonymousClass3MY.A1a(getIntent(), "go_back_to_catalog_from_deeplink")) {
            AnonymousClass00H r0 = this.A05;
            if (r0 != null) {
                ((C190289kg) r0.get()).A00();
                C195529tU r3 = this.A0F;
                if (r3 != null) {
                    r3.A00(this, A4e(), 1, 13);
                } else {
                    str = "catalogModuleHelper";
                }
            } else {
                str = "catalogHomepageQplLogger";
            }
            C18070vi.A11(str);
            throw null;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            C17880vN.A0V(r0).registerObserver(this.A0D);
            this.A07 = AnonymousClass000.A1W(bundle);
            C20339AGv.A00(this, A4d().A06, C21535Ali.A00(this, 9), 14);
            C20339AGv.A00(this, A4d().A08, C21535Ali.A00(this, 11), 14);
            C20339AGv.A00(this, A4d().A03, C21535Ali.A00(this, 12), 14);
            AnonymousClass00H r02 = this.A0v;
            if (r02 != null) {
                C17880vN.A0V(r02).registerObserver(this.A0E);
                AnonymousClass8BW.A0F(this).A09.add(this);
                if (!this.A02.A0O(A4e())) {
                    AnonymousClass3Ma.A0x(this, 2131430081).A04(0);
                    AnonymousClass3Ma.A0x(this, 2131434101).A04(0);
                    View findViewById = findViewById(2131429413);
                    TextView A0L = AnonymousClass3MX.A0L(this, 2131429428);
                    ImageView A0I = AnonymousClass3MX.A0I(this, 2131429433);
                    AnonymousClass1PM r1 = this.A0W;
                    if (r1 != null) {
                        C42741yf A022 = r1.A02(A4e());
                        AnonymousClass1M9 r12 = this.A0U;
                        if (r12 != null) {
                            AnonymousClass1E7 A0H = r12.A0H(A4e());
                            if (A0L != null) {
                                if (A022 != null) {
                                    str2 = A022.A08;
                                } else {
                                    str2 = null;
                                }
                                if (!AnonymousClass1EG.A0H(str2)) {
                                    A0L.setText(str2);
                                } else {
                                    C20339AGv.A00(this, A4d().A05, C21535Ali.A00(A0L, 13), 14);
                                    AnonymousClass8GC A4d = A4d();
                                    C21450AkH.A01(A4d.A0M, A4d, A0H, 37);
                                }
                            }
                            ((C37451pZ) AnonymousClass3MX.A14(this.A0A)).A07(A0I, A0H);
                            AnonymousClass3Ma.A1C(findViewById, this, 44);
                        } else {
                            str = "contactManager";
                        }
                    } else {
                        str = "verifiedNameManager";
                    }
                }
                A4b().A0V();
                C32951i1 r3 = this.A0Y;
                if (r3 != null) {
                    C32951i1.A03(new C91254fO(4), r3, A4e());
                    C32951i1 r13 = this.A0Y;
                    if (r13 != null) {
                        r13.A0F(A4e(), 0);
                        if (C22891Dp.A06) {
                            C28281Zt.A06(this, AnonymousClass1YL.A00(this, 2130971617, 2131102224));
                            return;
                        }
                        return;
                    }
                }
                str = "chatMessageCounts";
            } else {
                str = "productObservers";
            }
        } else {
            str = "businessProfileObservers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDestroy() {
        String str;
        AnonymousClass8BW.A0F(this).A09.remove(this);
        AnonymousClass00H r0 = this.A0v;
        if (r0 != null) {
            C17880vN.A0V(r0).unregisterObserver(this.A0E);
            AnonymousClass00H r02 = this.A04;
            if (r02 != null) {
                C17880vN.A0V(r02).unregisterObserver(this.A0D);
                super.onDestroy();
                ((C37451pZ) AnonymousClass3MX.A14(this.A0A)).A02();
                return;
            }
            str = "businessProfileObservers";
        } else {
            str = "productObservers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A0B2 = C72453Mb.A0B(menuItem);
        if (2131432515 == A0B2) {
            ReportProductDialogFragment reportProductDialogFragment = new ReportProductDialogFragment();
            reportProductDialogFragment.A00 = new AOD(this);
            CMk(reportProductDialogFragment, (String) null);
            return true;
        } else if (16908332 != A0B2) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A4d().A0T(this);
            return true;
        }
    }

    public void onStart() {
        super.onStart();
        if (AnonymousClass3MY.A1a(getIntent(), "partial_loaded")) {
            AnonymousClass8GC A4d = A4d();
            AnonymousClass3MY.A1L(A4d.A08, A4d.A0J.A09());
        }
    }

    public ProductDetailActivity() {
        this(0);
        this.A09 = C21528Alb.A00(this, 4);
        this.A0A = C21528Alb.A00(this, 5);
        this.A0B = C21528Alb.A00(this, 6);
        this.A0C = C21528Alb.A00(this, 7);
        this.A0E = new C168128iM(this, 1);
        this.A0D = new C20479AMq(this, 3);
    }
}
