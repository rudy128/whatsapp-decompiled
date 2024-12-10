package X;

import com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import java.util.concurrent.atomic.AtomicInteger;

public final class A8Q {
    public AnonymousClass1Be A00;
    public String A01;
    public String A02;
    public String A03 = "";
    public boolean A04;
    public C18180vt A05 = AnonymousClass184.DEFAULT_SAMPLING_RATE;
    public final AnonymousClass11S A06;
    public final AnonymousClass1PM A07;
    public final C18030ve A08;
    public final AnonymousClass18K A09;
    public final C189399jB A0A;
    public final AnonymousClass10I A0B;
    public final AnonymousClass00H A0C;
    public final AtomicInteger A0D = new AtomicInteger();
    public final AtomicInteger A0E = new AtomicInteger();
    public final C32951i1 A0F;
    public final C37711q0 A0G;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.A7D, java.lang.Object] */
    public static A7D A00(A8Q a8q) {
        ? obj = new Object();
        obj.A0B = a8q.A03;
        return obj;
    }

    public static void A02(A7D a7d, A8Q a8q) {
        a7d.A0E = a8q.A01;
        a7d.A0F = a8q.A02;
    }

    public static void A03(A7D a7d, A8Q a8q) {
        a7d.A09 = Long.valueOf((long) a8q.A0E.getAndIncrement());
    }

    public static void A04(A7D a7d, A8Q a8q) {
        a7d.A05 = Integer.valueOf(a8q.A0D.get());
    }

    public final C185549cl A07() {
        String str = this.A03;
        C18070vi.A0b(str);
        return new C185549cl(str, this.A0D.get(), (long) this.A0E.getAndIncrement());
    }

    public final void A09(A7D a7d) {
        C21450AkH.A01(this.A0B, this, a7d, 5);
    }

    public A8Q(AnonymousClass11S r2, AnonymousClass1PM r3, C32951i1 r4, C18030ve r5, C37711q0 r6, AnonymousClass18K r7, C189399jB r8, AnonymousClass10I r9, AnonymousClass00H r10) {
        C18070vi.A0w(r5, r2, r9, r7, r8);
        C18070vi.A0q(r3, r10, r6);
        C18070vi.A0d(r4, 9);
        this.A08 = r5;
        this.A06 = r2;
        this.A0B = r9;
        this.A09 = r7;
        this.A0A = r8;
        this.A07 = r3;
        this.A0C = r10;
        this.A0G = r6;
        this.A0F = r4;
    }

    public static A8Q A01(A7D a7d, CatalogCarouselDetailImageView catalogCarouselDetailImageView) {
        a7d.A0E = catalogCarouselDetailImageView.getCatalogAnalyticManager().A01;
        a7d.A0F = catalogCarouselDetailImageView.getCatalogAnalyticManager().A02;
        return catalogCarouselDetailImageView.getCatalogAnalyticManager();
    }

    public static void A05(A7D a7d, ProductListActivity productListActivity) {
        a7d.A0E = productListActivity.A4b().A01;
        a7d.A0F = productListActivity.A4b().A02;
    }

    public static void A06(A7D a7d, C168648jP r2) {
        a7d.A0E = r2.A4c().A01;
        a7d.A0F = r2.A4c().A02;
    }

    public final void A08(int i, String str, String str2) {
        this.A03 = C108985cd.A0f();
        this.A00 = this.A09.BDn(new C171558ru(), this.A05);
        if (C18020vd.A05(C18040vf.A02, this.A08, 4494)) {
            ((C63092sU) this.A0C.get()).A00 = System.currentTimeMillis();
        }
        this.A0E.set(1);
        this.A0D.set(i);
        this.A02 = str;
        this.A01 = str2;
        this.A04 = true;
    }
}
