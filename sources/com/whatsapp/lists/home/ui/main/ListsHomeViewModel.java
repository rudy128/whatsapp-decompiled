package com.whatsapp.lists.home.ui.main;

import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.AnonymousClass1DT;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass5TF;
import X.AnonymousClass5TG;
import X.C106185Uw;
import X.C106455Vx;
import X.C18070vi;
import X.C18460wS;
import X.C18600wl;
import X.C200510q;
import X.C29351c6;
import X.C41761x1;
import X.C88024Ya;
import X.C96764oN;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ListsHomeViewModel extends AnonymousClass1J2 {
    public AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public C41761x1 A01;
    public AnonymousClass00H A02;
    public boolean A03 = true;
    public boolean A04;
    public final AnonymousClass1DT A05 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A06;
    public final AnonymousClass1DT A07 = AnonymousClass3MW.A0L();
    public final AnonymousClass118 A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final Map A0C;
    public final C18600wl A0D;
    public final C18600wl A0E;
    public final AnonymousClass1G4 A0F;
    public final AnonymousClass1G1 A0G;

    public ListsHomeViewModel(AnonymousClass118 r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, C18600wl r15, C18600wl r16) {
        C18070vi.A0d(r10, 1);
        C18070vi.A0p(r11, r12, r13);
        C18070vi.A0d(r14, 5);
        C18600wl r0 = r16;
        C18070vi.A0l(r15, r0);
        this.A08 = r10;
        this.A02 = r11;
        this.A09 = r12;
        this.A0A = r13;
        this.A0B = r14;
        this.A0D = r15;
        this.A0E = r0;
        C18460wS r4 = C18460wS.A00;
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(new C88024Ya(r4, r4, r4, r4, false));
        this.A0F = A18;
        this.A0G = A18;
        this.A0C = C200510q.A02(new ConcurrentHashMap(), C106455Vx.A00);
        this.A06 = AnonymousClass3MW.A0L();
    }

    public static C88024Ya A00(ListsHomeViewModel listsHomeViewModel) {
        return (C88024Ya) listsHomeViewModel.A0F.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A04(com.whatsapp.lists.home.ui.main.ListsHomeViewModel r15, java.lang.Integer r16, java.util.List r17, java.util.List r18, int r19, boolean r20) {
        /*
            r13 = r18
            r14 = r20
            r10 = r17
            r0 = r19 & 1
            if (r0 == 0) goto L_0x0010
            X.4Ya r0 = A00(r15)
            java.util.List r10 = r0.A01
        L_0x0010:
            r0 = r19 & 2
            if (r0 == 0) goto L_0x001a
            X.4Ya r0 = A00(r15)
            boolean r14 = r0.A04
        L_0x001a:
            r0 = r19 & 4
            if (r0 == 0) goto L_0x0024
            X.4Ya r0 = A00(r15)
            java.util.List r13 = r0.A02
        L_0x0024:
            boolean r0 = r10 instanceof java.util.Collection
            r9 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00ab
        L_0x0030:
            r7 = 0
        L_0x0031:
            if (r14 == 0) goto L_0x00a2
            r5 = 2131891845(0x7f121685, float:1.9418422E38)
        L_0x0036:
            X.1G4 r3 = r15.A0F
            r3.getValue()
            r0 = r16
            java.util.List r11 = A03(r15, r0, r10, r14)
            r0 = 5
            X.5Y4[] r4 = new X.AnonymousClass5Y4[r0]
            boolean r1 = r15.A04
            X.4oM r0 = new X.4oM
            r0.<init>(r5, r14, r7, r1)
            r4[r2] = r0
            r8 = 4
            r5 = 0
            r1 = 2131898600(0x7f1230e8, float:1.9432122E38)
            X.4oL r0 = new X.4oL
            r0.<init>(r5, r1, r2)
            r6 = 0
            if (r14 != 0) goto L_0x005b
            r0 = r5
        L_0x005b:
            r4[r9] = r0
            X.5O6 r0 = new X.5O6
            r0.<init>(r15, r10)
            X.4oI r1 = new X.4oI
            r1.<init>(r0)
            if (r14 != 0) goto L_0x00a0
            if (r7 != 0) goto L_0x00a0
        L_0x006b:
            r0 = 2
            r4[r0] = r1
            X.5O6 r0 = new X.5O6
            r0.<init>(r15, r10)
            X.4oJ r1 = new X.4oJ
            r1.<init>(r0)
            if (r14 != 0) goto L_0x009e
            if (r7 == 0) goto L_0x009e
        L_0x007c:
            r0 = 3
            r4[r0] = r1
            r0 = 2131898600(0x7f1230e8, float:1.9432122E38)
            X.4oL r1 = new X.4oL
            r1.<init>(r5, r0, r2)
            r0 = r14 ^ 1
            if (r0 == 0) goto L_0x008c
            r6 = r1
        L_0x008c:
            r4[r8] = r6
            java.util.List r12 = X.C200410p.A0P(r4)
            X.C18070vi.A0p(r11, r12, r13)
            X.4Ya r9 = new X.4Ya
            r9.<init>(r10, r11, r12, r13, r14)
            r3.setValue(r9)
            return
        L_0x009e:
            r1 = r5
            goto L_0x007c
        L_0x00a0:
            r1 = r5
            goto L_0x006b
        L_0x00a2:
            r5 = 2131891739(0x7f12161b, float:1.9418207E38)
            if (r7 == 0) goto L_0x0036
            r5 = 2131891744(0x7f121620, float:1.9418217E38)
            goto L_0x0036
        L_0x00ab:
            java.util.Iterator r1 = r10.iterator()
        L_0x00af:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r1.next()
            X.1x1 r0 = (X.C41761x1) r0
            int r0 = r0.A02
            if (r0 != 0) goto L_0x00af
            r7 = 1
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.home.ui.main.ListsHomeViewModel.A04(com.whatsapp.lists.home.ui.main.ListsHomeViewModel, java.lang.Integer, java.util.List, java.util.List, int, boolean):void");
    }

    public static final List A03(ListsHomeViewModel listsHomeViewModel, Integer num, List list, boolean z) {
        boolean z2;
        ArrayList A0D2 = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C41761x1 r4 = (C41761x1) it.next();
            if (!listsHomeViewModel.A03) {
                z2 = true;
                if (z) {
                    A0D2.add(new C96764oN(r4, new AnonymousClass5TF(listsHomeViewModel), new AnonymousClass5TG(listsHomeViewModel), new C106185Uw(listsHomeViewModel, num), z2));
                }
            }
            z2 = false;
            A0D2.add(new C96764oN(r4, new AnonymousClass5TF(listsHomeViewModel), new AnonymousClass5TG(listsHomeViewModel), new C106185Uw(listsHomeViewModel, num), z2));
        }
        return A0D2;
    }
}
