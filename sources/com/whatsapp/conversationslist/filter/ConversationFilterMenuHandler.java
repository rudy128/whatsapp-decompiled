package com.whatsapp.conversationslist.filter;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass12Q;
import X.AnonymousClass17N;
import X.AnonymousClass1F9;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1NA;
import X.AnonymousClass2SS;
import X.AnonymousClass7RP;
import X.C18070vi;
import X.C18600wl;
import X.C19740yt;
import X.C37571pl;
import X.C41531wa;
import X.C41541wb;
import X.C41551wc;
import X.C70633Bw;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;

public final class ConversationFilterMenuHandler {
    public final Context A00;
    public final Fragment A01;
    public final C37571pl A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass1NA A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final C18600wl A0D;
    public final C18600wl A0E;
    public final AnonymousClass17N A0F = ((AnonymousClass17N) AnonymousClass12Q.A01(16447));
    public final AnonymousClass1LU A0G;
    public final AnonymousClass10I A0H;

    public ConversationFilterMenuHandler(Context context, Fragment fragment, AnonymousClass1KB r17, AnonymousClass1NA r18, AnonymousClass1LU r19, AnonymousClass10I r20, AnonymousClass00H r21, AnonymousClass00H r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, C18600wl r29, C18600wl r30) {
        C18600wl r1 = r29;
        C18600wl r0 = r30;
        AnonymousClass1LU r11 = r19;
        AnonymousClass1KB r13 = r17;
        C18070vi.A0w(context, r1, r0, r13, r11);
        AnonymousClass00H r7 = r23;
        AnonymousClass00H r8 = r22;
        AnonymousClass00H r9 = r21;
        AnonymousClass10I r10 = r20;
        AnonymousClass1NA r12 = r18;
        C18070vi.A0x(r10, r9, r8, r12, r7);
        AnonymousClass00H r2 = r28;
        AnonymousClass00H r3 = r27;
        AnonymousClass00H r4 = r26;
        AnonymousClass00H r5 = r25;
        AnonymousClass00H r6 = r24;
        C18070vi.A0y(r6, r5, r4, r3, r2);
        this.A00 = context;
        this.A0D = r1;
        this.A0E = r0;
        this.A03 = r13;
        this.A0G = r11;
        this.A0H = r10;
        this.A0C = r9;
        this.A0A = r8;
        this.A04 = r12;
        this.A09 = r7;
        this.A0B = r6;
        this.A08 = r5;
        this.A07 = r4;
        this.A06 = r3;
        this.A05 = r2;
        this.A01 = fragment;
        this.A02 = AnonymousClass2SS.A00((AnonymousClass1F9) context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.view.View r14, X.C41531wa r15, com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler r16, X.C30391dr r17, int r18) {
        /*
            r5 = r17
            r6 = r15
            r3 = r16
            r4 = r14
            boolean r0 = r5 instanceof X.C100804v6
            if (r0 == 0) goto L_0x016d
            r9 = r5
            X.4v6 r9 = (X.C100804v6) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x016d
            int r2 = r2 - r1
            r9.label = r2
        L_0x0018:
            java.lang.Object r5 = r9.result
            X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r2 = 1
            if (r0 == 0) goto L_0x0053
            if (r0 != r2) goto L_0x0174
            java.lang.Object r1 = r9.L$2
            X.0Iy r1 = (X.C03610Iy) r1
            java.lang.Object r4 = r9.L$1
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r9.L$0
            com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler r3 = (com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler) r3
            X.C30691eM.A01(r5)
        L_0x0032:
            X.01m r5 = r1.A03
            X.C18070vi.A0X(r5)
            int r0 = r5.size()
            if (r0 == 0) goto L_0x0050
            android.content.Context r0 = r3.A00
            X.C84044Hq.A00(r0, r5)
            r4.setActivated(r2)
            r2 = 3
            X.4fC r0 = new X.4fC
            r0.<init>(r4, r2)
            r1.A00 = r0
            r1.A00()
        L_0x0050:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0053:
            X.C30691eM.A01(r5)
            r0 = 8388613(0x800005, float:1.175495E-38)
            r1 = r18
            if (r1 > r2) goto L_0x0060
            r0 = 8388611(0x800003, float:1.1754948E-38)
        L_0x0060:
            android.content.Context r7 = r3.A00
            r14 = r0 | 80
            r10 = 0
            r16 = 2132083294(0x7f15025e, float:1.9806726E38)
            X.0Iy r1 = new X.0Iy
            r13 = r4
            r15 = r10
            r11 = r1
            r12 = r7
            r11.<init>(r12, r13, r14, r15, r16)
            X.00H r5 = r3.A0C
            boolean r0 = X.C72453Mb.A1W(r5)
            if (r0 == 0) goto L_0x013f
            boolean r0 = X.C72453Mb.A1W(r5)
            if (r0 == 0) goto L_0x013f
            boolean r0 = r6 instanceof X.C41541wb
            if (r0 == 0) goto L_0x0101
            r0 = r6
            X.1wb r0 = (X.C41541wb) r0
            java.lang.String r5 = r0.A02
            java.lang.String r0 = "ALL_FILTER"
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 == 0) goto L_0x00a4
            r0 = 2131820573(0x7f11001d, float:1.9273865E38)
            r1.A01(r0)
            X.01m r0 = r1.A03
            r0.setGroupDividerEnabled(r2)
            r0 = 3
            X.4fD r5 = new X.4fD
            r5.<init>(r3, r0)
        L_0x00a1:
            r1.A01 = r5
            goto L_0x0032
        L_0x00a4:
            java.lang.String r0 = "FAVORITES_FILTER"
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 == 0) goto L_0x011f
            r0 = 2131820575(0x7f11001f, float:1.9273869E38)
            r1.A01(r0)
            X.01m r6 = r1.A03
            r6.setGroupDividerEnabled(r2)
            X.00H r0 = r3.A08
            java.lang.Object r5 = r0.get()
            com.whatsapp.favorite.FavoriteManager r5 = (com.whatsapp.favorite.FavoriteManager) r5
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A06
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x00fc
            X.0vl r0 = r5.A07
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            boolean r0 = X.C17880vN.A1X(r0)
            if (r0 == 0) goto L_0x00fc
            android.view.MenuItem r0 = r6.getItem(r10)
        L_0x00d9:
            r0.setVisible(r10)
            android.content.Context r5 = r7.getApplicationContext()
            r0 = 2131895845(0x7f122625, float:1.9426535E38)
            java.lang.String r8 = X.C18070vi.A0F(r5, r0)
            r9 = 4
            r12 = 0
            r16 = 1
            r11 = -1
            X.1x1 r7 = new X.1x1
            r14 = r12
            r18 = r2
            r7.<init>(r8, r9, r10, r11, r12, r14, r16, r18)
            r0 = 3
            X.4fF r5 = new X.4fF
            r5.<init>((java.lang.Object) r7, (java.lang.Object) r3, (int) r0)
            goto L_0x00a1
        L_0x00fc:
            android.view.MenuItem r0 = r6.getItem(r2)
            goto L_0x00d9
        L_0x0101:
            boolean r0 = r6 instanceof X.C41551wc
            if (r0 == 0) goto L_0x0032
            r0 = 2131820576(0x7f110020, float:1.927387E38)
            r1.A01(r0)
            X.01m r5 = r1.A03
            r5.setGroupDividerEnabled(r2)
            r0 = 2131429639(0x7f0b0907, float:1.8480956E38)
            android.view.MenuItem r0 = r5.findItem(r0)
            X.C18070vi.A0X(r0)
            r3.A02(r0)
            r0 = 5
            goto L_0x0138
        L_0x011f:
            r0 = 2131820577(0x7f110021, float:1.9273873E38)
            r1.A01(r0)
            X.01m r5 = r1.A03
            r5.setGroupDividerEnabled(r2)
            r0 = 2131429639(0x7f0b0907, float:1.8480956E38)
            android.view.MenuItem r0 = r5.findItem(r0)
            X.C18070vi.A0X(r0)
            r3.A02(r0)
            r0 = 4
        L_0x0138:
            X.4fF r5 = new X.4fF
            r5.<init>((X.C41531wa) r6, (com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler) r3, (int) r0)
            goto L_0x00a1
        L_0x013f:
            r9.L$0 = r3
            r9.L$1 = r4
            r9.L$2 = r1
            r9.label = r2
            boolean r0 = r6 instanceof X.C41541wb
            if (r0 == 0) goto L_0x0032
            X.1wb r6 = (X.C41541wb) r6
            java.lang.String r5 = r6.A02
            java.lang.String r0 = "FAVORITES_FILTER"
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 == 0) goto L_0x015e
            java.lang.Object r0 = A01(r1, r3, r9)
            if (r0 != r8) goto L_0x0032
            return r8
        L_0x015e:
            r0 = 2131820574(0x7f11001e, float:1.9273867E38)
            r1.A01(r0)
            X.4fE r0 = new X.4fE
            r0.<init>(r3, r5)
            r1.A01 = r0
            goto L_0x0032
        L_0x016d:
            X.4v6 r9 = new X.4v6
            r9.<init>(r3, r5)
            goto L_0x0018
        L_0x0174:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler.A00(android.view.View, X.1wa, com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler, X.1dr, int):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if ((!((java.util.AbstractCollection) r1.A07.getValue()).isEmpty()) != false) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C03610Iy r7, com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler r8, X.C30391dr r9) {
        /*
            boolean r0 = r9 instanceof X.C100664us
            if (r0 == 0) goto L_0x00a3
            r6 = r9
            X.4us r6 = (X.C100664us) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a3
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x0075
            if (r0 != r4) goto L_0x00aa
            java.lang.Object r7 = r6.L$1
            X.0Iy r7 = (X.C03610Iy) r7
            java.lang.Object r8 = r6.L$0
            com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler r8 = (com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler) r8
            X.C30691eM.A01(r1)
        L_0x0028:
            X.00H r0 = r8.A08
            java.lang.Object r1 = r0.get()
            com.whatsapp.favorite.FavoriteManager r1 = (com.whatsapp.favorite.FavoriteManager) r1
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A06
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0073
            X.0vl r0 = r1.A07
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            boolean r0 = r0.isEmpty()
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0073
        L_0x0049:
            r2 = 0
            X.01m r1 = r7.A03
            if (r3 == 0) goto L_0x006b
            X.C18070vi.A0X(r1)
            android.view.MenuItem r0 = r1.getItem(r2)
        L_0x0055:
            r0.setVisible(r2)
            r0 = 2
            android.view.MenuItem r0 = r1.getItem(r0)
            r0.setVisible(r2)
            r1 = 2
            X.4fD r0 = new X.4fD
            r0.<init>(r8, r1)
            r7.A01 = r0
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x006b:
            X.C18070vi.A0X(r1)
            android.view.MenuItem r0 = r1.getItem(r4)
            goto L_0x0055
        L_0x0073:
            r3 = 0
            goto L_0x0049
        L_0x0075:
            X.C30691eM.A01(r1)
            r0 = 2131820575(0x7f11001f, float:1.9273869E38)
            r7.A01(r0)
            X.00H r0 = r8.A08
            java.lang.Object r3 = r0.get()
            com.whatsapp.favorite.FavoriteManager r3 = (com.whatsapp.favorite.FavoriteManager) r3
            r6.L$0 = r8
            r6.L$1 = r7
            r6.label = r4
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A06
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0028
            X.0wl r2 = r3.A08
            r1 = 0
            com.whatsapp.favorite.FavoriteManager$initializeIfNeeded$2 r0 = new com.whatsapp.favorite.FavoriteManager$initializeIfNeeded$2
            r0.<init>(r3, r1)
            java.lang.Object r0 = X.C30451dy.A00(r6, r2, r0)
            if (r0 != r5) goto L_0x0028
            return r5
        L_0x00a3:
            X.4us r6 = new X.4us
            r6.<init>(r8, r9)
            goto L_0x0012
        L_0x00aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler.A01(X.0Iy, com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler, X.1dr):java.lang.Object");
    }

    public static final void A03(C41531wa r4, ConversationFilterMenuHandler conversationFilterMenuHandler) {
        int i;
        AnonymousClass10I r3;
        Runnable r2;
        if (r4 instanceof C41551wc) {
            r3 = conversationFilterMenuHandler.A0H;
            r2 = new C70633Bw(conversationFilterMenuHandler, r4, 23);
        } else if (r4 instanceof C41541wb) {
            String str = ((C41541wb) r4).A02;
            int hashCode = str.hashCode();
            if (hashCode != -1730152220) {
                if (hashCode != 72525144) {
                    if (hashCode == 1827283464 && str.equals("UNREAD_FILTER")) {
                        i = 1;
                    } else {
                        return;
                    }
                } else if (str.equals("GROUP_FILTER")) {
                    i = 3;
                } else {
                    return;
                }
            } else if (str.equals("CONTACTS_FILTER")) {
                i = 2;
            } else {
                return;
            }
            int intValue = Integer.valueOf(i).intValue();
            r3 = conversationFilterMenuHandler.A0H;
            r2 = new AnonymousClass7RP(conversationFilterMenuHandler, intValue, 49);
        } else {
            return;
        }
        r3.CGF(r2);
    }

    private final void A02(MenuItem menuItem) {
        int A002 = C19740yt.A00(this.A00, 2131101043);
        SpannableString spannableString = new SpannableString(menuItem.getTitle());
        spannableString.setSpan(new ForegroundColorSpan(A002), 0, spannableString.length(), 0);
        menuItem.setTitle(spannableString);
        Drawable icon = menuItem.getIcon();
        if (icon != null) {
            icon.mutate();
            icon.setColorFilter(A002, PorterDuff.Mode.SRC_IN);
        }
        menuItem.setIcon(icon);
    }
}
