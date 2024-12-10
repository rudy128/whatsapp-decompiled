package X;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.6oA  reason: invalid class name and case insensitive filesystem */
public final class C133096oA {
    public final AnonymousClass2ZZ A00;
    public final C25545Chi A01;
    public final C65812x9 A02;
    public final C19995A2i A03;
    public final CXN A04;
    public final C24970CRu A05;
    public final CMC A06;
    public final C185219cE A07;

    public final void A00(C1603488c r18, ADL adl, String str, String str2, String str3, WeakReference weakReference, boolean z) {
        String str4 = str2;
        C18070vi.A0d(str4, 4);
        WeakReference weakReference2 = weakReference;
        AnonymousClass01E r7 = (AnonymousClass01E) weakReference2.get();
        C1603488c r4 = r18;
        if (r7 == null) {
            r4.BpJ(AnonymousClass6N7.A00);
            return;
        }
        AnonymousClass1GP supportFragmentManager = r7.getSupportFragmentManager();
        C185219cE r13 = this.A07;
        CXY cxy = new CXY(r7, supportFragmentManager, this.A00, this.A01, this.A05, this.A06, r13, str4, (Map) null, z);
        this.A04.A00(r7.getApplicationContext(), this.A02, cxy);
        this.A03.A03(adl, new AnonymousClass7OS(cxy, r4, weakReference2), (Boolean) null, str, str3, (String) null);
    }

    public C133096oA(AnonymousClass2ZZ r2, C25545Chi chi, C65812x9 r4, C19995A2i a2i, CXN cxn, C24970CRu cRu, CMC cmc, C185219cE r9) {
        C18070vi.A0p(a2i, r4, chi);
        C18070vi.A0d(cRu, 8);
        this.A04 = cxn;
        this.A03 = a2i;
        this.A02 = r4;
        this.A01 = chi;
        this.A07 = r9;
        this.A06 = cmc;
        this.A00 = r2;
        this.A05 = cRu;
    }
}
