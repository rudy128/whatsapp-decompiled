package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass1OB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass5Y3;
import X.C18070vi;
import X.C18460wS;
import X.C18600wl;
import X.C200410p;
import X.C30391dr;
import X.C34081jt;
import X.C41561wd;
import X.C41761x1;
import X.C88334Zg;
import X.C96654oC;
import X.C96664oD;
import X.C96684oF;
import X.C96694oG;
import X.C96704oH;
import java.util.Collections;
import java.util.List;

public final class ListsManagerViewModel extends AnonymousClass1J2 {
    public C41761x1 A00;
    public AnonymousClass00H A01;
    public String A02 = "";
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final List A08 = Collections.synchronizedList(AnonymousClass000.A13());
    public final List A09 = Collections.synchronizedList(AnonymousClass000.A13());
    public final C18600wl A0A;
    public final AnonymousClass1G4 A0B;
    public final AnonymousClass1G1 A0C;

    public static final void A05(ListsManagerViewModel listsManagerViewModel, String str, List list, List list2, boolean z, boolean z2) {
        AnonymousClass3MX.A1Q(new ListsManagerViewModel$updateViewState$1(listsManagerViewModel, str, list2, list, (C30391dr) null, z, z2), C41561wd.A00(listsManagerViewModel));
    }

    public final void A0W(String str) {
        AnonymousClass1G4 r1 = this.A0B;
        String str2 = str;
        A05(this, str2, ((C88334Zg) r1.getValue()).A01, ((C88334Zg) r1.getValue()).A02, ((C88334Zg) r1.getValue()).A03, ((C88334Zg) r1.getValue()).A04);
    }

    public final void A0X(boolean z, boolean z2) {
        this.A05 = !z;
        AnonymousClass1G4 r0 = this.A0B;
        A05(this, C88334Zg.A00(r0), ((C88334Zg) r0.getValue()).A01, (List) null, z, z2);
    }

    public static ListsRepository A00(ListsManagerViewModel listsManagerViewModel) {
        return (ListsRepository) listsManagerViewModel.A07.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.C41761x1 r7, com.whatsapp.lists.ListsManagerViewModel r8, X.C30391dr r9) {
        /*
            boolean r0 = r9 instanceof X.C100014tp
            if (r0 == 0) goto L_0x004f
            r6 = r9
            X.4tp r6 = (X.C100014tp) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004f
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r2 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r6.label
            r0 = 1
            if (r1 == 0) goto L_0x0028
            if (r1 != r0) goto L_0x0055
            X.C30691eM.A01(r2)
        L_0x0020:
            java.lang.Number r2 = (java.lang.Number) r2
            r2.intValue()
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0028:
            X.C30691eM.A01(r2)
            com.whatsapp.lists.ListsRepository r4 = A00(r8)
            java.util.List r3 = r8.A09
            X.C18070vi.A0W(r3)
            r6.label = r0
            int r0 = r7.A02
            if (r0 == 0) goto L_0x0042
            r0 = -3
            java.lang.Integer r2 = X.AnonymousClass3MW.A0v(r0)
        L_0x003f:
            if (r2 != r5) goto L_0x0020
            return r5
        L_0x0042:
            X.0wl r2 = r4.A0B
            r1 = 0
            com.whatsapp.lists.ListsRepository$updateListChatJids$2 r0 = new com.whatsapp.lists.ListsRepository$updateListChatJids$2
            r0.<init>(r7, r4, r3, r1)
            java.lang.Object r2 = X.C30451dy.A00(r6, r2, r0)
            goto L_0x003f
        L_0x004f:
            X.4tp r6 = new X.4tp
            r6.<init>(r8, r9)
            goto L_0x0012
        L_0x0055:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsManagerViewModel.A03(X.1x1, com.whatsapp.lists.ListsManagerViewModel, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(X.C41761x1 r6, com.whatsapp.lists.ListsManagerViewModel r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.C100434uV
            if (r0 == 0) goto L_0x0054
            r5 = r8
            X.4uV r5 = (X.C100434uV) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0054
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r3) goto L_0x005a
            java.lang.Object r7 = r5.L$0
            com.whatsapp.lists.ListsManagerViewModel r7 = (com.whatsapp.lists.ListsManagerViewModel) r7
            X.C30691eM.A01(r1)
        L_0x0024:
            int r1 = X.AnonymousClass000.A0M(r1)
            r0 = -1
            if (r1 == r0) goto L_0x0030
            java.util.List r0 = r7.A08
            r0.clear()
        L_0x0030:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0033:
            X.C30691eM.A01(r1)
            java.util.List r2 = r7.A08
            X.C18070vi.A0W(r2)
            boolean r0 = X.AnonymousClass000.A1a(r2)
            if (r0 == 0) goto L_0x0030
            com.whatsapp.lists.ListsRepository r1 = A00(r7)
            java.util.List r0 = X.C29431cG.A0t(r2)
            r5.L$0 = r7
            r5.label = r3
            java.lang.Object r1 = r1.A02(r6, r0, r5)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0054:
            X.4uV r5 = new X.4uV
            r5.<init>(r7, r8)
            goto L_0x0012
        L_0x005a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsManagerViewModel.A04(X.1x1, com.whatsapp.lists.ListsManagerViewModel, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        r0 = X.AnonymousClass000.A1T(r10.A02, 4);
        r1 = A00(r8);
        r3.L$0 = r8;
        r3.L$1 = r10;
        r3.L$2 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        if (r0 == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        r3.label = 2;
        r6 = r1.A04(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
        if (r6 != r2) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a9, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        r6 = (java.util.List) r6;
        r3.L$0 = r8;
        r3.L$1 = r10;
        r3.L$2 = r12;
        r3.L$3 = r6;
        r3.label = 3;
        r8.A08.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d7, code lost:
        if (X.C30451dy.A00(r3, r8.A0A, new com.whatsapp.lists.ListsManagerViewModel$insertOrDeleteFavoriteConversations$2(r10, r8, (X.C30391dr) null)) == r2) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d9, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00db, code lost:
        r3.label = 4;
        r6 = r1.A04(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e1, code lost:
        if (r6 != r2) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e3, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f3, code lost:
        r6 = (java.util.List) r6;
        r3.L$0 = r8;
        r3.L$1 = r10;
        r3.L$2 = r12;
        r3.L$3 = r6;
        r3.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0104, code lost:
        if (A04(r10, r8, r3) == r2) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0106, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0121, code lost:
        if (r8.A08.isEmpty() == false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0123, code lost:
        r3.L$0 = r8;
        r3.L$1 = r10;
        r3.L$2 = r12;
        r3.L$3 = r5;
        r3.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0132, code lost:
        if (A03(r10, r8, r3) != r2) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0134, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0148, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014c, code lost:
        if ((r5 instanceof java.util.Collection) == false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0152, code lost:
        if (r5.isEmpty() == false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0154, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0155, code lost:
        r2 = (long) r2;
        r4 = r8.A09;
        X.C18070vi.A0W(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015d, code lost:
        if ((r4 instanceof java.util.Collection) == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0163, code lost:
        if (r4.isEmpty() == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0165, code lost:
        r6 = (long) r6;
        r0 = ((long) r5.size()) - r2;
        r4 = ((long) r4.size()) - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0174, code lost:
        if (r2 != r6) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0178, code lost:
        if (r0 == r4) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017a, code lost:
        ((X.C85964Pp) r8.A01.get()).A00(r10, X.C17880vN.A0l(), r12, java.lang.Long.valueOf(r2), java.lang.Long.valueOf(r6), java.lang.Long.valueOf(r0), java.lang.Long.valueOf(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x019e, code lost:
        return new X.AnonymousClass42Y(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x019f, code lost:
        r1 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a7, code lost:
        if (r1.hasNext() == false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b1, code lost:
        if (X.C17880vN.A0S(r1).getType() != 1) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b3, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b5, code lost:
        if (r6 >= 0) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b8, code lost:
        r1 = r5.iterator();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c1, code lost:
        if (r1.hasNext() == false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01cb, code lost:
        if (X.C17880vN.A0S(r1).getType() != 1) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01cd, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01cf, code lost:
        if (r2 >= 0) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d1, code lost:
        X.AnonymousClass1ZU.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d5, code lost:
        throw null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0T(X.C41761x1 r18, java.lang.Integer r19, X.C30391dr r20) {
        /*
            r17 = this;
            r4 = r20
            r10 = r18
            r12 = r19
            boolean r0 = r4 instanceof X.C100854vB
            r8 = r17
            if (r0 == 0) goto L_0x0028
            r3 = r4
            X.4vB r3 = (X.C100854vB) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r3.label = r2
        L_0x001a:
            java.lang.Object r6 = r3.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            switch(r0) {
                case 0: goto L_0x002e;
                case 1: goto L_0x005c;
                case 2: goto L_0x00aa;
                case 3: goto L_0x0135;
                case 4: goto L_0x00e4;
                case 5: goto L_0x0108;
                case 6: goto L_0x0135;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0028:
            X.4vB r3 = new X.4vB
            r3.<init>(r8, r4)
            goto L_0x001a
        L_0x002e:
            X.C30691eM.A01(r6)
            java.lang.String r1 = r8.A02
            X.1G4 r4 = r8.A0B
            java.lang.String r0 = X.C88334Zg.A00(r4)
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x008d
            int r1 = r10.A02
            r0 = 4
            if (r1 == r0) goto L_0x008d
            r3.L$0 = r8
            r3.L$1 = r10
            r3.L$2 = r12
            r0 = 1
            r3.label = r0
            com.whatsapp.lists.ListsRepository r1 = A00(r8)
            java.lang.String r0 = X.C88334Zg.A00(r4)
            java.lang.Object r6 = r1.A01(r10, r0, r3)
            if (r6 != r2) goto L_0x006b
            return r2
        L_0x005c:
            java.lang.Object r12 = r3.L$2
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r10 = r3.L$1
            X.1x1 r10 = (X.C41761x1) r10
            java.lang.Object r8 = r3.L$0
            com.whatsapp.lists.ListsManagerViewModel r8 = (com.whatsapp.lists.ListsManagerViewModel) r8
            X.C30691eM.A01(r6)
        L_0x006b:
            boolean r0 = r6 instanceof X.AnonymousClass42Y
            if (r0 != 0) goto L_0x0070
            return r6
        L_0x0070:
            X.00H r0 = r8.A01
            java.lang.Object r9 = X.C18070vi.A0E(r0)
            X.4Pp r9 = (X.C85964Pp) r9
            r0 = 4
            java.lang.Integer r11 = X.AnonymousClass3MW.A0v(r0)
            r13 = 0
            r15 = r13
            r16 = r13
            r14 = r13
            r9.A00(r10, r11, r12, r13, r14, r15, r16)
            X.1G4 r0 = r8.A0B
            java.lang.String r0 = X.C88334Zg.A00(r0)
            r8.A02 = r0
        L_0x008d:
            int r0 = r10.A02
            r4 = 4
            boolean r0 = X.AnonymousClass000.A1T(r0, r4)
            com.whatsapp.lists.ListsRepository r1 = A00(r8)
            r3.L$0 = r8
            r3.L$1 = r10
            r3.L$2 = r12
            if (r0 == 0) goto L_0x00db
            r0 = 2
            r3.label = r0
            java.lang.Object r6 = r1.A04(r10, r3)
            if (r6 != r2) goto L_0x00b9
            return r2
        L_0x00aa:
            java.lang.Object r12 = r3.L$2
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r10 = r3.L$1
            X.1x1 r10 = (X.C41761x1) r10
            java.lang.Object r8 = r3.L$0
            com.whatsapp.lists.ListsManagerViewModel r8 = (com.whatsapp.lists.ListsManagerViewModel) r8
            X.C30691eM.A01(r6)
        L_0x00b9:
            java.util.List r6 = (java.util.List) r6
            r3.L$0 = r8
            r3.L$1 = r10
            r3.L$2 = r12
            r3.L$3 = r6
            r0 = 3
            r3.label = r0
            java.util.List r0 = r8.A08
            r0.clear()
            X.0wl r4 = r8.A0A
            r1 = 0
            com.whatsapp.lists.ListsManagerViewModel$insertOrDeleteFavoriteConversations$2 r0 = new com.whatsapp.lists.ListsManagerViewModel$insertOrDeleteFavoriteConversations$2
            r0.<init>(r10, r8, r1)
            java.lang.Object r0 = X.C30451dy.A00(r3, r4, r0)
            if (r0 == r2) goto L_0x0134
            r5 = r6
            goto L_0x0148
        L_0x00db:
            r3.label = r4
            java.lang.Object r6 = r1.A04(r10, r3)
            if (r6 != r2) goto L_0x00f3
            return r2
        L_0x00e4:
            java.lang.Object r12 = r3.L$2
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r10 = r3.L$1
            X.1x1 r10 = (X.C41761x1) r10
            java.lang.Object r8 = r3.L$0
            com.whatsapp.lists.ListsManagerViewModel r8 = (com.whatsapp.lists.ListsManagerViewModel) r8
            X.C30691eM.A01(r6)
        L_0x00f3:
            java.util.List r6 = (java.util.List) r6
            r3.L$0 = r8
            r3.L$1 = r10
            r3.L$2 = r12
            r3.L$3 = r6
            r0 = 5
            r3.label = r0
            java.lang.Object r0 = A04(r10, r8, r3)
            if (r0 == r2) goto L_0x0134
            r5 = r6
            goto L_0x011b
        L_0x0108:
            java.lang.Object r5 = r3.L$3
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r12 = r3.L$2
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r10 = r3.L$1
            X.1x1 r10 = (X.C41761x1) r10
            java.lang.Object r8 = r3.L$0
            com.whatsapp.lists.ListsManagerViewModel r8 = (com.whatsapp.lists.ListsManagerViewModel) r8
            X.C30691eM.A01(r6)
        L_0x011b:
            java.util.List r0 = r8.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0199
            r3.L$0 = r8
            r3.L$1 = r10
            r3.L$2 = r12
            r3.L$3 = r5
            r0 = 6
            r3.label = r0
            java.lang.Object r0 = A03(r10, r8, r3)
            if (r0 != r2) goto L_0x0148
        L_0x0134:
            return r2
        L_0x0135:
            java.lang.Object r5 = r3.L$3
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r12 = r3.L$2
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r10 = r3.L$1
            X.1x1 r10 = (X.C41761x1) r10
            java.lang.Object r8 = r3.L$0
            com.whatsapp.lists.ListsManagerViewModel r8 = (com.whatsapp.lists.ListsManagerViewModel) r8
            X.C30691eM.A01(r6)
        L_0x0148:
            boolean r0 = r5 instanceof java.util.Collection
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x01b8
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x01b8
            r2 = 0
        L_0x0155:
            long r2 = (long) r2
            java.util.List r4 = r8.A09
            X.C18070vi.A0W(r4)
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x019f
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x019f
        L_0x0165:
            long r6 = (long) r6
            int r0 = r5.size()
            long r0 = (long) r0
            long r0 = r0 - r2
            int r4 = r4.size()
            long r4 = (long) r4
            long r4 = r4 - r6
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x017a
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0199
        L_0x017a:
            X.00H r8 = r8.A01
            java.lang.Object r9 = r8.get()
            X.4Pp r9 = (X.C85964Pp) r9
            java.lang.Integer r11 = X.C17880vN.A0l()
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.lang.Long r14 = java.lang.Long.valueOf(r6)
            java.lang.Long r15 = java.lang.Long.valueOf(r0)
            java.lang.Long r16 = java.lang.Long.valueOf(r4)
            r9.A00(r10, r11, r12, r13, r14, r15, r16)
        L_0x0199:
            X.42Y r0 = new X.42Y
            r0.<init>(r10)
            return r0
        L_0x019f:
            java.util.Iterator r1 = r4.iterator()
        L_0x01a3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0165
            com.whatsapp.jid.Jid r0 = X.C17880vN.A0S(r1)
            int r0 = r0.getType()
            if (r0 != r7) goto L_0x01a3
            int r6 = r6 + 1
            if (r6 >= 0) goto L_0x01a3
            goto L_0x01d1
        L_0x01b8:
            java.util.Iterator r1 = r5.iterator()
            r2 = 0
        L_0x01bd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0155
            com.whatsapp.jid.Jid r0 = X.C17880vN.A0S(r1)
            int r0 = r0.getType()
            if (r0 != r7) goto L_0x01bd
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x01bd
        L_0x01d1:
            X.AnonymousClass1ZU.A0A()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsManagerViewModel.A0T(X.1x1, java.lang.Integer, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0U(java.lang.Integer r18, java.lang.String r19, X.C30391dr r20) {
        /*
            r17 = this;
            r3 = r20
            r12 = r18
            boolean r0 = r3 instanceof X.C100694uv
            r4 = r17
            if (r0 == 0) goto L_0x010a
            r9 = r3
            X.4uv r9 = (X.C100694uv) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010a
            int r2 = r2 - r1
            r9.label = r2
        L_0x0018:
            java.lang.Object r7 = r9.result
            X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r5 = 1
            if (r0 == 0) goto L_0x00e7
            if (r0 != r5) goto L_0x0111
            java.lang.Object r12 = r9.L$1
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r4 = r9.L$0
            com.whatsapp.lists.ListsManagerViewModel r4 = (com.whatsapp.lists.ListsManagerViewModel) r4
            X.C30691eM.A01(r7)
        L_0x002e:
            X.4Em r7 = (X.C83274Em) r7
            boolean r6 = r7 instanceof X.AnonymousClass42Y
            if (r6 == 0) goto L_0x006a
            java.util.List r8 = r4.A09
            X.C18070vi.A0W(r8)
            boolean r0 = r8 instanceof java.util.Collection
            r2 = 0
            if (r0 == 0) goto L_0x00ca
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00ca
        L_0x0044:
            long r2 = (long) r2
            int r0 = r8.size()
            long r0 = (long) r0
            long r0 = r0 - r2
            X.00H r8 = r4.A01
            java.lang.Object r9 = r8.get()
            X.4Pp r9 = (X.C85964Pp) r9
            r8 = r7
            X.42Y r8 = (X.AnonymousClass42Y) r8
            X.1x1 r10 = r8.A00
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.lang.Long r15 = java.lang.Long.valueOf(r0)
            r14 = r13
            r16 = r15
            r9.A00(r10, r11, r12, r13, r14, r15, r16)
        L_0x006a:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            if (r6 == 0) goto L_0x00c3
            X.00H r0 = r4.A01
            java.lang.Object r8 = r0.get()
            X.4Pp r8 = (X.C85964Pp) r8
            r0 = r7
            X.42Y r0 = (X.AnonymousClass42Y) r0
            X.1x1 r4 = r0.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            int r11 = r4.A02
            long r1 = r4.A04
            r9 = 0
            r3 = 4
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x009b
            if (r11 == 0) goto L_0x00c8
            if (r11 == r5) goto L_0x00c6
            r0 = 2
            if (r11 == r0) goto L_0x00c8
            r0 = 3
            if (r11 == r0) goto L_0x00c4
            r0 = 4
            r3 = 3
            if (r11 == r0) goto L_0x009b
            r3 = 0
        L_0x009b:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            long r3 = r4.A03
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
            java.lang.Integer r3 = X.C17880vN.A0i()
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            X.18K r1 = r8.A00
            X.3zV r0 = new X.3zV
            r0.<init>()
            r0.A00 = r6
            r0.A01 = r5
            r0.A04 = r4
            r0.A02 = r3
            r0.A05 = r2
            r0.A03 = r12
            r1.CC7(r0)
        L_0x00c3:
            return r7
        L_0x00c4:
            r3 = 2
            goto L_0x009b
        L_0x00c6:
            r3 = 1
            goto L_0x009b
        L_0x00c8:
            r3 = 5
            goto L_0x009b
        L_0x00ca:
            java.util.Iterator r1 = r8.iterator()
        L_0x00ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0044
            com.whatsapp.jid.Jid r0 = X.C17880vN.A0S(r1)
            int r0 = r0.getType()
            if (r0 != r5) goto L_0x00ce
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x00ce
            X.AnonymousClass1ZU.A0A()
            r0 = 0
            throw r0
        L_0x00e7:
            X.C30691eM.A01(r7)
            com.whatsapp.lists.ListsRepository r6 = A00(r4)
            java.util.List r3 = r4.A09
            X.C18070vi.A0W(r3)
            r9.L$0 = r4
            r9.L$1 = r12
            r9.label = r5
            X.0wl r2 = r6.A0B
            r1 = 0
            com.whatsapp.lists.ListsRepository$createList$2 r0 = new com.whatsapp.lists.ListsRepository$createList$2
            r7 = r19
            r0.<init>(r6, r7, r3, r1)
            java.lang.Object r7 = X.C30451dy.A00(r9, r2, r0)
            if (r7 != r8) goto L_0x002e
            return r8
        L_0x010a:
            X.4uv r9 = new X.4uv
            r9.<init>(r4, r3)
            goto L_0x0018
        L_0x0111:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsManagerViewModel.A0U(java.lang.Integer, java.lang.String, X.1dr):java.lang.Object");
    }

    public final List A0V() {
        C41761x1 r4 = this.A00;
        if (r4 == null) {
            return C18460wS.A00;
        }
        Object[] objArr = new AnonymousClass5Y3[4];
        int i = 2131891736;
        if (r4.A02 == 3) {
            i = 2131891735;
        }
        objArr[0] = new C96654oC(i);
        objArr[1] = new Object();
        objArr[2] = new C96664oD(r4);
        objArr[3] = C96694oG.A00;
        return C200410p.A0P(objArr);
    }

    public ListsManagerViewModel(AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, C18600wl r14) {
        C18070vi.A0s(r11, r12, r13, r14);
        this.A01 = r11;
        this.A06 = r12;
        this.A07 = r13;
        this.A0A = r14;
        Object[] objArr = new AnonymousClass5Y3[3];
        objArr[0] = new C96704oH(false);
        objArr[1] = new Object();
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(new C88334Zg("", C18070vi.A0O(C96684oF.A00, objArr, 2), C18460wS.A00, false, false));
        this.A0B = A18;
        this.A0C = new C34081jt((AnonymousClass1OB) null, A18);
    }
}
