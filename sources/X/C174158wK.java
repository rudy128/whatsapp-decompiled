package X;

import java.util.List;

/* renamed from: X.8wK  reason: invalid class name and case insensitive filesystem */
public final class C174158wK extends C174358we {
    public final C20272AEf A00;
    public final C20079A6f A01;
    public final List A02;
    public final C18090vk A03;
    public final C36001nB A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj)) && super.equals(obj)) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.businessdirectory.view.viewdata.SERPMapEntryPointViewItem");
                C174158wK r5 = (C174158wK) obj;
                if (!C42171xk.A00(this.A00, r5.A00) || !C42171xk.A00(this.A01, r5.A01) || !C42171xk.A00(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174158wK(C20272AEf aEf, C20079A6f a6f, List list, C18090vk r5, C36001nB r6) {
        super(73);
        C18070vi.A0s(r5, aEf, a6f, list);
        this.A03 = r5;
        this.A00 = aEf;
        this.A01 = a6f;
        this.A02 = list;
        this.A04 = r6;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = this.A00;
        A1a[1] = this.A02;
        return AnonymousClass000.A0P(this.A01, A1a, 2);
    }
}
