package X;

import com.whatsapp.newsletter.viewmodel.GetDirectoryCategoriesPreviewUseCase$onError$1$1;
import com.whatsapp.newsletter.viewmodel.GetDirectoryCategoriesPreviewUseCase$receivedDirectoryCategories$1$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7KE  reason: invalid class name */
public final class AnonymousClass7KE implements BB0 {
    public C107095Yj A00;
    public String A01;
    public C1595885c A02;
    public AnonymousClass1OX A03;
    public final AnonymousClass1c4 A04;
    public final C133836pa A05;
    public final C35681md A06;
    public final C18600wl A07;

    public void Bsq(C21598Amm amm) {
        C1595885c r4 = this.A02;
        AnonymousClass3MW.A1X(this.A07, new GetDirectoryCategoriesPreviewUseCase$onError$1$1(amm, r4, (C30391dr) null), this.A03);
    }

    public void CDY(List list, boolean z) {
        C1595885c r6 = this.A02;
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C135346s3 r0 = (C135346s3) it.next();
            C179619Ir r8 = r0.A00;
            String str = r0.A01;
            List A002 = C147027Rn.A00(r0.A02, 25);
            int size = A002.size();
            int A003 = C18020vd.A00(C18040vf.A02, this.A04.A02, 9312);
            if (size > A003) {
                size = A003;
            }
            A0D.add(new C135346s3(r8, str, C29431cG.A0v(A002, size)));
        }
        AnonymousClass3MW.A1X(this.A07, new GetDirectoryCategoriesPreviewUseCase$receivedDirectoryCategories$1$1(r6, A0D, (C30391dr) null), this.A03);
    }

    public AnonymousClass7KE(AnonymousClass1c4 r2, C133836pa r3, C35681md r4, C1595885c r5, C18600wl r6, AnonymousClass1OX r7) {
        C18070vi.A0s(r4, r2, r3, r6);
        C18070vi.A0d(r7, 6);
        this.A06 = r4;
        this.A04 = r2;
        this.A05 = r3;
        this.A07 = r6;
        this.A02 = r5;
        this.A03 = r7;
    }
}
