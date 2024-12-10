package com.whatsapp.newsletter.ui.directory;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass1DT;
import X.AnonymousClass3MW;
import X.AnonymousClass6B2;
import X.AnonymousClass6BH;
import X.AnonymousClass6F4;
import X.AnonymousClass6ZW;
import X.AnonymousClass74D;
import X.AnonymousClass8BE;
import X.C111285jR;
import X.C112405lQ;
import X.C135386s7;
import X.C137196v4;
import X.C1589882u;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C28931bI;
import X.C29681ch;
import X.C30361do;
import X.C30391dr;
import X.C36341nj;
import X.C37911qO;
import X.C38391rD;
import X.C39711tW;
import X.C41561wd;
import X.C46162Dk;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.newsletter.ui.directory.viewmodels.NewsletterDirectoryViewModel$refreshRecommendedNewsletters$1;
import java.util.Iterator;
import java.util.List;

public final class NewsletterDirectoryCategoriesActivity extends AnonymousClass6BH implements AnonymousClass8BE {
    public RecyclerView A00;
    public AnonymousClass6ZW A01;
    public AnonymousClass6F4 A02;
    public C112405lQ A03;
    public C28931bI A04;

    public void A3K() {
        AnonymousClass00H r0 = this.A0E;
        if (r0 != null) {
            C18100vl r02 = C30361do.A0C;
            ((C30361do) C18070vi.A0E(r0)).A02((AnonymousClass1BI) null, 99);
            return;
        }
        C18070vi.A11("navigationTimeSpentManager");
        throw null;
    }

    public void Bz7(C46162Dk r13) {
        String str = r13.A0S;
        if (str != null) {
            C36341nj r2 = this.A08;
            if (r2 != null) {
                r2.A02(this, Uri.parse(AnonymousClass001.A1H("whatsapp://channel/", str, AnonymousClass000.A10())), (C29681ch) null, AnonymousClass00R.A0N, (Long) null, str, 0, -1);
                return;
            }
            C18070vi.A11("newsletterLinkLauncher");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0094, code lost:
        if (r0.isEmpty() == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r0.isEmpty() == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r6.A4b().A0B.A06() != null) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity r6, boolean r7) {
        /*
            X.4VZ r0 = r6.A4c()
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x0097
            X.5jR r1 = r6.A4b()
            X.1DT r0 = r1.A0D
            java.lang.Object r0 = r0.A06()
            X.6B2 r0 = (X.AnonymousClass6B2) r0
            if (r0 == 0) goto L_0x0088
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0088
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0088
        L_0x0022:
            X.5jR r0 = r6.A4b()
            X.1DT r0 = r0.A0B
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x0097
        L_0x002e:
            X.5jR r5 = r6.A4b()
            X.1DT r1 = r5.A0C
            X.0wS r0 = X.C18460wS.A00
            r1.A0F(r0)
            X.1OX r2 = X.C41561wd.A00(r5)
            X.0wl r4 = r5.A0L
            r1 = 0
            com.whatsapp.newsletter.ui.directory.viewmodels.NewsletterDirectoryViewModel$refreshRecommendedNewsletters$1 r0 = new com.whatsapp.newsletter.ui.directory.viewmodels.NewsletterDirectoryViewModel$refreshRecommendedNewsletters$1
            r0.<init>(r5, r1)
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            X.C30451dy.A02(r3, r4, r0, r2)
            X.00H r0 = r5.A0H
            X.1c4 r0 = X.C108955ca.A0W(r0)
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x006d
            X.7KE r1 = r5.A02
            X.1DS r0 = r5.A07
            java.lang.String r0 = X.C108945cZ.A1F(r0)
            r1.A01 = r0
            X.1OX r2 = X.C41561wd.A00(r5)
            r1 = 0
            com.whatsapp.newsletter.ui.directory.viewmodels.NewsletterDirectoryViewModel$refreshDirectoryCategories$1 r0 = new com.whatsapp.newsletter.ui.directory.viewmodels.NewsletterDirectoryViewModel$refreshDirectoryCategories$1
            r0.<init>(r5, r1)
            X.C30451dy.A02(r3, r4, r0, r2)
        L_0x006d:
            X.1c4 r0 = X.C108985cd.A0V(r6)
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0087
            r4 = 0
            X.5jR r3 = r6.A4b()
            X.6RR r2 = X.AnonymousClass6RR.FEATURED
            X.9Ir r1 = r6.A09
            java.lang.String r0 = X.C111285jR.A00(r6)
            r3.A0U(r1, r2, r0, r4)
        L_0x0087:
            return
        L_0x0088:
            X.1DT r0 = r1.A0C
            java.util.List r0 = X.AnonymousClass3MW.A10(r0)
            if (r0 == 0) goto L_0x002e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002e
            goto L_0x0022
        L_0x0097:
            r2 = 0
            if (r7 != 0) goto L_0x002e
            boolean r0 = A0Q(r6)
            r6.A4o(r0)
            X.5lQ r1 = r6.A03
            if (r1 != 0) goto L_0x00ab
            java.lang.String r0 = "newsletterDirectoryCategoriesAdapter"
            X.C18070vi.A11(r0)
            throw r2
        L_0x00ab:
            X.5jR r0 = r6.A4b()
            X.1Dg r0 = r0.A09
            java.lang.Object r0 = r0.A06()
            X.6s5 r0 = (X.C135366s5) r0
            r1.A0X(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity.A03(com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity, boolean):void");
    }

    public static final boolean A0Q(NewsletterDirectoryCategoriesActivity newsletterDirectoryCategoriesActivity) {
        String str;
        if (!newsletterDirectoryCategoriesActivity.A4c().A0C() || (str = newsletterDirectoryCategoriesActivity.A0M) == null || str.length() != 0 || newsletterDirectoryCategoriesActivity.A09 != null) {
            return false;
        }
        return true;
    }

    public void Bw8(C46162Dk r9, C18090vk r10) {
        List list;
        Object obj;
        C111285jR A4b = A4b();
        Integer num = AnonymousClass00R.A02;
        AnonymousClass1BI A08 = r9.A08();
        C18070vi.A0X(A08);
        AnonymousClass1DT r6 = A4b.A0D;
        AnonymousClass6B2 r0 = (AnonymousClass6B2) r6.A06();
        if (!(r0 == null || (list = r0.A00) == null)) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C18070vi.A18(((C135386s7) obj).A02.A08(), A08)) {
                    break;
                }
            }
            C135386s7 r3 = (C135386s7) obj;
            if (r3 != null) {
                r3.A01 = true;
                C137196v4.A00(r6);
                A4b.A0G.A00(r9, num, (Long) null, new C1589882u(A4b, r3, r10));
                return;
            }
        }
        AnonymousClass3MW.A1X(A4b.A0L, new NewsletterDirectoryViewModel$refreshRecommendedNewsletters$1(A4b, (C30391dr) null), C41561wd.A00(A4b));
    }

    public void onBackPressed() {
        if (A4c().A0C()) {
            A4g();
        }
        super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        C112405lQ r0 = this.A03;
        if (r0 == null) {
            C18070vi.A11("newsletterDirectoryCategoriesAdapter");
            throw null;
        }
        C37911qO r1 = this.A01;
        if (r1 != null) {
            r0.A01.unregisterObserver(r1);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            C18070vi.A11("recyclerView");
            throw null;
        }
        recyclerView.setAdapter((C38391rD) null);
        AnonymousClass74D r2 = (AnonymousClass74D) A4e().get();
        r2.A00 = 0;
        r2.A01 = 0;
        C39711tW r12 = this.A02;
        if (r12 != null) {
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 == null) {
                C18070vi.A11("recyclerView");
                throw null;
            } else {
                recyclerView2.A0u(r12);
            }
        }
    }
}
