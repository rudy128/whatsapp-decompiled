package X;

/* renamed from: X.ATh  reason: case insensitive filesystem */
public class C20649ATh implements C22508BAp {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20649ATh(C19989A2b a2b, C22821Di r2, int i) {
        this.A00 = i;
        this.A02 = r2;
        this.A01 = a2b;
    }

    public void BtA(C190599lD r4, int i) {
        String str;
        int i2 = this.A00;
        ((C22821Di) this.A02).invoke(new C169218kY(i));
        C19989A2b a2b = (C19989A2b) this.A01;
        if (i2 != 0) {
            if (a2b != null) {
                str = "text_search_category_request_end";
            } else {
                return;
            }
        } else if (a2b != null) {
            str = "text_search_api_business_request_end";
        } else {
            return;
        }
        a2b.A03(str);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int i = this.A00;
        C188619hi r4 = (C188619hi) obj;
        C18070vi.A0d(r4, 0);
        ((C22821Di) this.A02).invoke(new C169228kZ(r4));
        C19989A2b a2b = (C19989A2b) this.A01;
        if (i != 0) {
            if (a2b != null) {
                str = "text_search_category_request_end";
            } else {
                return;
            }
        } else if (a2b != null) {
            str = "text_search_api_business_request_end";
        } else {
            return;
        }
        a2b.A03(str);
    }
}
