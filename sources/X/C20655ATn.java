package X;

import com.whatsapp.biz.catalog.network.graphql.service.impl.CoroutineGetSingleCollectionGraphQLService;

/* renamed from: X.ATn  reason: case insensitive filesystem */
public class C20655ATn implements AnonymousClass87E {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20655ATn(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final AnonymousClass8AB BGW(String str) {
        String str2 = str;
        switch (this.A00) {
            case 0:
                return ((CoroutineGetSingleCollectionGraphQLService) this.A01).A01.A04((C195689tk) this.A02, str, true);
            case 1:
                boolean A1X = AnonymousClass8BU.A1X(str);
                return ((C168518j1) this.A01).A03.A00((C195539tV) this.A02, str, A1X);
            case 2:
                boolean A1X2 = AnonymousClass8BU.A1X(str);
                return ((C168528j2) this.A01).A04.A01((C188519hY) this.A02, str, "facebook.com", A1X2);
            case 3:
                C18070vi.A0d(str, 2);
                return ((C168538j3) this.A01).A03.A02((C195469tO) this.A02, str2, "facebook.com", 9426523704041647L);
            case 4:
                boolean A1X3 = AnonymousClass8BU.A1X(str);
                return ((C168548j4) this.A01).A03.A03((A20) this.A02, str, A1X3);
            case 5:
                boolean A1X4 = AnonymousClass8BU.A1X(str);
                return ((C168508j0) this.A01).A01.A04((C195689tk) this.A02, str, A1X4);
            default:
                C197859xN r4 = (C197859xN) this.A02;
                C18070vi.A0j(r4, str);
                AnonymousClass10E r0 = ((C184499b3) this.A01).A00.A00.A00;
                C18030ve A8r = AnonymousClass10E.A8r(r0);
                return new C172568td(C108965cb.A0H(r0), AnonymousClass3Ma.A0c(r0), A8r, r4, C108955ca.A0X(r0), C108945cZ.A14(r0), str2);
        }
    }
}
