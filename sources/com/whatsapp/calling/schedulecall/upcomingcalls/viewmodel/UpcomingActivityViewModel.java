package com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.C146427Pb;
import X.C17880vN;
import X.C18000vb;
import X.C20555APp;
import X.C20556APq;
import X.C21051Adh;
import X.C22497BAe;
import X.C25191Ng;
import X.C25221Nj;
import X.C27081Uq;
import X.C40951vZ;
import X.C40981vc;
import X.C41111vp;
import X.C59822mw;
import X.C96314ne;
import java.util.ArrayList;
import java.util.Collection;

public class UpcomingActivityViewModel extends AnonymousClass1J2 {
    public final AnonymousClass11S A00;
    public final C18000vb A01;
    public final AnonymousClass1MZ A02;
    public final C41111vp A03 = new C41111vp(AnonymousClass000.A13());
    public final AnonymousClass10I A04;
    public final AnonymousClass1M9 A05;
    public final AnonymousClass11P A06;
    public final C27081Uq A07;
    public final C25221Nj A08;
    public final C25191Ng A09;
    public final C40981vc A0A;
    public final C40951vZ A0B;

    public static void A00(UpcomingActivityViewModel upcomingActivityViewModel, AnonymousClass1BI r12, String str, int i, long j) {
        if (i != 0) {
            C41111vp r7 = upcomingActivityViewModel.A03;
            ArrayList A10 = C17880vN.A10((Collection) r7.A06());
            ArrayList A13 = AnonymousClass000.A13();
            int i2 = 0;
            for (int i3 = 0; i3 < A10.size(); i3++) {
                C22497BAe bAe = (C22497BAe) A10.get(i3);
                if (bAe instanceof C20555APp) {
                    i2 = i3;
                } else {
                    C20556APq aPq = (C20556APq) bAe;
                    if (aPq.A01.A02 != j) {
                        C59822mw r1 = aPq.A01;
                        if (r1.A04.equals(r12)) {
                            if (!r1.A07.equals(str)) {
                            }
                        }
                    }
                    A13.add(bAe);
                    if (i3 - 1 == i2 && (i3 == A10.size() - 1 || (A10.get(i3 + 1) instanceof C20555APp))) {
                        A13.add(A10.get(i2));
                    }
                }
            }
            A10.removeAll(A13);
            r7.A0F(A10);
            return;
        }
        upcomingActivityViewModel.A04.CGN(new C146427Pb(upcomingActivityViewModel, 25));
    }

    public void A0S() {
        this.A0B.unregisterObserver(this.A0A);
        this.A09.unregisterObserver(this.A08);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0080, code lost:
        if (r0.A0K(r7) != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0089, code lost:
        if (r2 < java.lang.System.currentTimeMillis()) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008b, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008c, code lost:
        r0 = 2131231762;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0092, code lost:
        if (r4.A00 != 2) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0094, code lost:
        r0 = 2131232406;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0097, code lost:
        r1 = new X.C192409oL();
        r1.A01 = r10;
        r1.A00 = r0;
        r1.A02 = r3;
        r6.add(new X.C20556APq(r1, r4, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        if (X.A87.A04(r5.getTimeInMillis(), r2) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T() {
        /*
            r12 = this;
            X.1Uq r0 = r12.A07
            java.util.ArrayList r0 = r0.A04()
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r11 = r0.iterator()
            r5 = 0
        L_0x000f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r4 = r11.next()
            X.2mw r4 = (X.C59822mw) r4
            long r2 = r4.A03
            if (r5 == 0) goto L_0x00ac
            long r0 = r5.getTimeInMillis()
            boolean r0 = X.A87.A04(r0, r2)
            if (r0 != 0) goto L_0x005b
        L_0x0029:
            r5.setTimeInMillis(r2)
            X.0vb r9 = r12.A01
            java.util.Locale r7 = r9.A0N()
            java.lang.String r1 = "EEEE"
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r1, r7)
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            java.lang.String r7 = r0.format(r8)
            java.util.Locale r1 = r9.A0N()
            r0 = 2
            java.text.DateFormat r0 = java.text.DateFormat.getDateInstance(r0, r1)
            java.lang.String r0 = r0.format(r8)
            X.9qX r1 = new X.9qX
            r1.<init>(r7, r0)
            X.APp r0 = new X.APp
            r0.<init>(r1)
            r6.add(r0)
        L_0x005b:
            X.1M9 r0 = r12.A05
            X.1BI r1 = r4.A04
            X.1E7 r9 = r0.A0H(r1)
            X.0vb r0 = r12.A01
            java.lang.String r10 = X.A8I.A00(r0, r2)
            X.1EC r7 = X.AnonymousClass3MW.A0i(r1)
            X.11S r1 = r12.A00
            com.whatsapp.jid.UserJid r0 = r4.A05
            boolean r0 = r1.A0O(r0)
            if (r0 != 0) goto L_0x0082
            X.1MZ r0 = r12.A02
            X.C17960vV.A07(r7)
            boolean r0 = r0.A0K(r7)
            if (r0 == 0) goto L_0x008b
        L_0x0082:
            long r7 = java.lang.System.currentTimeMillis()
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r3 = 1
            if (r0 >= 0) goto L_0x008c
        L_0x008b:
            r3 = 0
        L_0x008c:
            int r2 = r4.A00
            r1 = 2
            r0 = 2131231762(0x7f080412, float:1.8079614E38)
            if (r2 != r1) goto L_0x0097
            r0 = 2131232406(0x7f080696, float:1.808092E38)
        L_0x0097:
            X.9oL r1 = new X.9oL
            r1.<init>()
            r1.A01 = r10
            r1.A00 = r0
            r1.A02 = r3
            X.APq r0 = new X.APq
            r0.<init>(r1, r4, r9)
            r6.add(r0)
            goto L_0x000f
        L_0x00ac:
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            goto L_0x0029
        L_0x00b2:
            X.1vp r0 = r12.A03
            r0.A0E(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel.A0T():void");
    }

    public UpcomingActivityViewModel(AnonymousClass11S r5, AnonymousClass1M9 r6, AnonymousClass11P r7, C18000vb r8, AnonymousClass1MZ r9, C27081Uq r10, C25191Ng r11, C40951vZ r12, AnonymousClass10I r13) {
        C21051Adh adh = new C21051Adh(this, 0);
        this.A0A = adh;
        C96314ne r2 = new C96314ne(this, 3);
        this.A08 = r2;
        this.A06 = r7;
        this.A00 = r5;
        this.A04 = r13;
        this.A05 = r6;
        this.A01 = r8;
        this.A07 = r10;
        this.A0B = r12;
        this.A02 = r9;
        this.A09 = r11;
        r12.registerObserver(adh);
        r11.registerObserver(r2);
    }
}
