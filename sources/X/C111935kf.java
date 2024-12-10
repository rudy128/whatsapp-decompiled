package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.CatalogImageListActivity;
import java.util.List;

/* renamed from: X.5kf  reason: invalid class name and case insensitive filesystem */
public final class C111935kf extends C38391rD {
    public final AnonymousClass4ZR A00;
    public final /* synthetic */ CatalogImageListActivity A01;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        CatalogImageListActivity catalogImageListActivity = this.A01;
        View inflate = catalogImageListActivity.getLayoutInflater().inflate(2131624374, viewGroup, false);
        List list = C42011xT.A0I;
        AnonymousClass4ZR r1 = this.A00;
        C18070vi.A0b(inflate);
        return new C113315mt(inflate, catalogImageListActivity, r1);
    }

    public C111935kf(CatalogImageListActivity catalogImageListActivity, AnonymousClass4ZR r2) {
        this.A01 = catalogImageListActivity;
        this.A00 = r2;
    }

    public int A0Q() {
        CatalogImageListActivity catalogImageListActivity = this.A01;
        boolean A05 = C18020vd.A05(C18040vf.A02, catalogImageListActivity.A0E, 10691);
        C20287AEv aEv = catalogImageListActivity.A02;
        if (A05) {
            if (aEv != null) {
                int A08 = C108945cZ.A08(aEv);
                C20287AEv aEv2 = catalogImageListActivity.A02;
                if (aEv2 != null) {
                    return C108945cZ.A0A(aEv2.A0B, A08);
                }
            }
        } else if (aEv != null) {
            return C108945cZ.A08(aEv);
        }
        C18070vi.A11("product");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r12, int r13) {
        /*
            r11 = this;
            X.5mt r12 = (X.C113315mt) r12
            r3 = 0
            X.C18070vi.A0d(r12, r3)
            com.whatsapp.CatalogImageListActivity r0 = r11.A01
            int r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1T(r13, r0)
            r12.A00 = r0
            com.whatsapp.CatalogImageListActivity r1 = r12.A04
            X.AEv r0 = r1.A02
            java.lang.String r4 = "product"
            if (r0 == 0) goto L_0x00cb
            int r0 = X.C108945cZ.A08(r0)
            if (r13 < r0) goto L_0x009a
            X.AEv r0 = r1.A02
            if (r0 == 0) goto L_0x00cb
            int r2 = X.C108945cZ.A08(r0)
            X.AEv r0 = r1.A02
            if (r0 == 0) goto L_0x00cb
            java.util.List r0 = r0.A0B
            int r0 = X.C108945cZ.A0A(r0, r2)
            if (r13 >= r0) goto L_0x009a
            r0 = 1
            android.widget.ImageView r2 = r12.A02
            r2.setVisibility(r3)
            X.AEv r2 = r1.A02
            if (r2 == 0) goto L_0x00cb
            int r2 = X.C108945cZ.A08(r2)
            int r3 = r13 - r2
            if (r3 < 0) goto L_0x0091
            X.AEv r2 = r1.A02
            if (r2 == 0) goto L_0x00cb
            java.util.List r2 = r2.A0B
            int r2 = r2.size()
            if (r3 >= r2) goto L_0x0091
            X.AEv r2 = r1.A02
            if (r2 == 0) goto L_0x00cb
            java.util.List r2 = r2.A0B
            java.lang.Object r7 = r2.get(r3)
            X.773 r7 = (X.AnonymousClass773) r7
            X.A2v r5 = r1.A04
            if (r5 == 0) goto L_0x00c5
            r2 = 0
            X.7CU r10 = new X.7CU
            r10.<init>(r12, r2)
            X.7CT r8 = new X.7CT
            r8.<init>(r12, r2)
            android.widget.ImageView r6 = r12.A01
            r9 = 0
            r5.A05(r6, r7, r8, r9, r10)
        L_0x0071:
            X.6L8 r2 = new X.6L8
            r2.<init>(r12, r1, r13, r0)
            r6.setOnClickListener(r2)
            X.AEv r0 = r1.A02
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = r0.A0H
            java.lang.String r2 = X.A1M.A00(r0, r13)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "thumb-transition-"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            X.AnonymousClass1Xr.A04(r6, r0)
        L_0x0090:
            return
        L_0x0091:
            android.widget.ImageView r6 = r12.A01
            r2 = 2131101278(0x7f06065e, float:1.7814961E38)
            r6.setImageResource(r2)
            goto L_0x0071
        L_0x009a:
            r0 = 0
            android.widget.ImageView r3 = r12.A02
            r2 = 8
            r3.setVisibility(r2)
            X.A2v r5 = r1.A04
            if (r5 == 0) goto L_0x00c5
            X.AEv r2 = r1.A02
            if (r2 == 0) goto L_0x00cb
            java.util.List r2 = r2.A0A
            java.lang.Object r7 = r2.get(r13)
            X.AEI r7 = (X.AEI) r7
            if (r7 == 0) goto L_0x0090
            r10 = 1
            X.7CU r9 = new X.7CU
            r9.<init>(r12, r10)
            X.7CT r8 = new X.7CT
            r8.<init>(r12, r10)
            android.widget.ImageView r6 = r12.A01
            r5.A04(r6, r7, r8, r9, r10)
            goto L_0x0071
        L_0x00c5:
            java.lang.String r0 = "loadSession"
            X.C18070vi.A11(r0)
            goto L_0x00ce
        L_0x00cb:
            X.C18070vi.A11(r4)
        L_0x00ce:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111935kf.Bmc(X.1xT, int):void");
    }
}
