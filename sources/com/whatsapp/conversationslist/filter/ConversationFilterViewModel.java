package com.whatsapp.conversationslist.filter;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10T;
import X.AnonymousClass118;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass1OR;
import X.AnonymousClass1OX;
import X.C18070vi;
import X.C18090vk;
import X.C18460wS;
import X.C18600wl;
import X.C19880zA;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30451dy;
import X.C34071js;
import X.C38501rO;
import X.C41531wa;
import X.C41561wd;
import X.C41691wu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ConversationFilterViewModel extends AnonymousClass1J2 {
    public C41531wa A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final C18600wl A07;
    public final AnonymousClass1G4 A08;
    public final AnonymousClass1G1 A09;
    public final C19880zA A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    public ConversationFilterViewModel(C19880zA r2, AnonymousClass118 r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, C18600wl r11) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r2, 6);
        C18070vi.A0d(r8, 7);
        C18070vi.A0d(r9, 8);
        C18070vi.A0d(r11, 9);
        C18070vi.A0d(r10, 10);
        this.A01 = r3;
        this.A06 = r4;
        this.A05 = r5;
        this.A0C = r6;
        this.A04 = r7;
        this.A0A = r2;
        this.A02 = r8;
        this.A0B = r9;
        this.A07 = r11;
        this.A03 = r10;
        AnonymousClass1G7 A002 = C34071js.A00(C18460wS.A00);
        this.A08 = A002;
        this.A09 = A002;
        ((AnonymousClass10T) r9.get()).registerObserver(this);
    }

    public static final String A03(int i) {
        if (i == 1) {
            return "UNREAD_FILTER";
        }
        if (i == 2) {
            return "CONTACTS_FILTER";
        }
        if (i == 3) {
            return "GROUP_FILTER";
        }
        if (i == 4) {
            return "FAVORITES_FILTER";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't create static filter for ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public static final ArrayList A04(ConversationFilterViewModel conversationFilterViewModel) {
        List singletonList = Collections.singletonList(A00(conversationFilterViewModel, "ALL_FILTER"));
        C18070vi.A0X(singletonList);
        List<Number> A012 = ((C41691wu) conversationFilterViewModel.A0C.get()).A01();
        ArrayList arrayList = new ArrayList(C29351c6.A0C(A012, 10));
        for (Number intValue : A012) {
            arrayList.add(A00(conversationFilterViewModel, A03(intValue.intValue())));
        }
        return C29431cG.A0k(arrayList, singletonList);
    }

    public void A0S() {
        ((AnonymousClass10T) this.A0B.get()).unregisterObserver(this);
    }

    public final void A0T() {
        if (((C38501rO) this.A06.get()).A07()) {
            AnonymousClass1OX A002 = C41561wd.A00(this);
            ConversationFilterViewModel$createListsConversationFilters$1 conversationFilterViewModel$createListsConversationFilters$1 = new ConversationFilterViewModel$createListsConversationFilters$1(this, (C30391dr) null);
            C30451dy.A02(AnonymousClass00R.A00, AnonymousClass1OR.A00, conversationFilterViewModel$createListsConversationFilters$1, A002);
        }
    }

    public final void A0V(C18090vk r5) {
        if (((C38501rO) this.A06.get()).A08()) {
            AnonymousClass1OX A002 = C41561wd.A00(this);
            ConversationFilterViewModel$updateUnreadCountForListsFilters$1 conversationFilterViewModel$updateUnreadCountForListsFilters$1 = new ConversationFilterViewModel$updateUnreadCountForListsFilters$1(this, (C30391dr) null, r5);
            C30451dy.A02(AnonymousClass00R.A00, AnonymousClass1OR.A00, conversationFilterViewModel$updateUnreadCountForListsFilters$1, A002);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        r2 = r1.A01(r0);
        X.C18070vi.A0X(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        return new X.C41541wb(r3, r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Unexpected option: ");
        r1.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C41541wb A00(com.whatsapp.conversationslist.filter.ConversationFilterViewModel r2, java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            switch(r0) {
                case -1730152220: goto L_0x001e;
                case -817912192: goto L_0x002c;
                case -19153930: goto L_0x003a;
                case 72525144: goto L_0x0048;
                case 1827283464: goto L_0x0056;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unexpected option: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x001e:
            java.lang.String r0 = "CONTACTS_FILTER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.118 r1 = r2.A01
            r0 = 2131890393(0x7f1210d9, float:1.9415477E38)
            goto L_0x0063
        L_0x002c:
            java.lang.String r0 = "FAVORITES_FILTER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.118 r1 = r2.A01
            r0 = 2131890396(0x7f1210dc, float:1.9415483E38)
            goto L_0x0063
        L_0x003a:
            java.lang.String r0 = "ALL_FILTER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.118 r1 = r2.A01
            r0 = 2131890391(0x7f1210d7, float:1.9415472E38)
            goto L_0x0063
        L_0x0048:
            java.lang.String r0 = "GROUP_FILTER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.118 r1 = r2.A01
            r0 = 2131890397(0x7f1210dd, float:1.9415485E38)
            goto L_0x0063
        L_0x0056:
            java.lang.String r0 = "UNREAD_FILTER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.118 r1 = r2.A01
            r0 = 2131890409(0x7f1210e9, float:1.941551E38)
        L_0x0063:
            java.lang.String r2 = r1.A01(r0)
            X.C18070vi.A0X(r2)
            r1 = 0
            X.1wb r0 = new X.1wb
            r0.<init>(r3, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.filter.ConversationFilterViewModel.A00(com.whatsapp.conversationslist.filter.ConversationFilterViewModel, java.lang.String):X.1wb");
    }

    public final void A0U(List list) {
        Object A0c = C29431cG.A0c(C29431cG.A0q(list));
        C19880zA r1 = this.A0A;
        if (r1.A07() && A0c != null) {
            r1.A03();
            throw new NullPointerException("getPredefinedIdByName");
        }
    }
}
