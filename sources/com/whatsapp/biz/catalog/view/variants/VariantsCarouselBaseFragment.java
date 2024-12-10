package com.whatsapp.biz.catalog.view.variants;

import X.AnonymousClass3MW;
import X.AnonymousClass77B;
import X.BCR;
import X.C131466l9;
import X.C18070vi;
import X.C20245ADd;
import X.C20339AGv;
import X.C21728Are;
import X.C22365B4t;
import X.C22941Dw;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.whatsapp.jid.UserJid;

public abstract class VariantsCarouselBaseFragment extends Fragment {
    public C131466l9 A00;
    public C22365B4t A01;
    public VariantsCarouselFragmentViewModel A02;
    public UserJid A03;
    public boolean A04 = true;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        VariantsCarouselFragmentViewModel variantsCarouselFragmentViewModel = this.A02;
        if (variantsCarouselFragmentViewModel != null) {
            C20339AGv.A00(A1G(), variantsCarouselFragmentViewModel.A07, new C21728Are(this, 8), 9);
            return;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }

    public static final void A00(C20245ADd aDd, BCR bcr, VariantsCarouselBaseFragment variantsCarouselBaseFragment, AnonymousClass77B r5, Integer num, int i) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                C18070vi.A0z(r5, "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.variants.VariantsDisplayData<com.whatsapp.biz.catalog.data.variants.ProductVariantTypeOption.ThumbnailOption>");
                bcr.C8d(aDd, r5, i);
                return;
            } else if (intValue == 2) {
                C18070vi.A0z(r5, "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.variants.VariantsDisplayData<com.whatsapp.biz.catalog.data.variants.ProductVariantTypeOption.TextOption>");
                VariantsCarouselFragmentViewModel variantsCarouselFragmentViewModel = variantsCarouselBaseFragment.A02;
                if (variantsCarouselFragmentViewModel != null) {
                    bcr.C8V(aDd, r5, i, variantsCarouselFragmentViewModel.A06);
                    return;
                } else {
                    AnonymousClass3MW.A1H();
                    throw null;
                }
            }
        }
        bcr.Bcv();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ad, code lost:
        if (r13 > r0.intValue()) goto L_0x01af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x00c2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x00c2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A25(X.C20287AEv r22, X.C22821Di r23, boolean r24) {
        /*
            r21 = this;
            r4 = r21
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel r6 = r4.A02
            if (r6 == 0) goto L_0x0327
            com.whatsapp.jid.UserJid r0 = r4.A03
            if (r0 == 0) goto L_0x031c
            r1 = r22
            r6.A00 = r1
            r6.A01 = r0
            r0 = r24
            r6.A05 = r0
            X.1DT r0 = r6.A08
            r20 = r0
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            if (r22 == 0) goto L_0x027a
            X.AE6 r2 = r1.A05
            if (r2 == 0) goto L_0x027a
            X.00H r0 = r6.A0C
            java.lang.Object r11 = r0.get()
            X.9Wh r11 = (X.C182939Wh) r11
            r19 = 0
            X.ADW r0 = r2.A00
            r1 = 1
            r18 = 0
            if (r0 == 0) goto L_0x0083
            java.util.List r12 = r0.A00
            if (r12 == 0) goto L_0x0083
            boolean r0 = X.AnonymousClass000.A1a(r12)
            if (r0 == 0) goto L_0x0083
        L_0x003d:
            java.util.List r0 = r2.A03
            if (r0 == 0) goto L_0x027a
            java.lang.Object r8 = X.C29431cG.A0c(r0)
            X.ADA r8 = (X.ADA) r8
            if (r8 == 0) goto L_0x027a
            java.lang.Object r2 = X.C29431cG.A0f(r0, r1)
            X.ADA r2 = (X.ADA) r2
            java.util.HashMap r7 = X.C17880vN.A11()
            if (r2 == 0) goto L_0x00b4
            java.util.List r0 = r8.A01()
            java.util.Iterator r10 = r0.iterator()
            r1 = 0
        L_0x005e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r10.next()
            int r9 = r1 + 1
            if (r1 < 0) goto L_0x0322
            X.AD8 r0 = (X.AD8) r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = r8.A00()
            java.lang.String r0 = r0.A00()
            X.1D6 r0 = X.AnonymousClass1D6.A01(r1, r0)
            r7.put(r0, r3)
            r1 = r9
            goto L_0x005e
        L_0x0083:
            r12 = r18
            goto L_0x003d
        L_0x0086:
            java.util.List r0 = r2.A01()
            java.util.Iterator r10 = r0.iterator()
            r1 = 0
        L_0x008f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r0 = r10.next()
            int r9 = r1 + 1
            if (r1 < 0) goto L_0x0322
            X.AD8 r0 = (X.AD8) r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = r2.A00()
            java.lang.String r0 = r0.A00()
            X.1D6 r0 = X.AnonymousClass1D6.A01(r1, r0)
            r7.put(r0, r3)
            r1 = r9
            goto L_0x008f
        L_0x00b4:
            if (r12 == 0) goto L_0x027a
            java.util.LinkedHashMap r10 = X.C17880vN.A13()
            java.util.HashMap r9 = X.C17880vN.A11()
            java.util.Iterator r17 = r12.iterator()
        L_0x00c2:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r14 = r17.next()
            X.ADo r14 = (X.C20256ADo) r14
            java.util.List r12 = r14.A01
            if (r12 != 0) goto L_0x00d4
            X.0wS r12 = X.C18460wS.A00
        L_0x00d4:
            X.0ve r3 = r11.A00
            r1 = 8798(0x225e, float:1.2329E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 != 0) goto L_0x0126
            int r1 = r12.size()
            r0 = 2
            if (r1 <= r0) goto L_0x0126
            java.lang.String r0 = "areOptionsValid: found unexpected number of options. Maximum 2 is supported"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00ec:
            java.lang.String r7 = r8.A00()
            java.util.List r0 = r8.A01()
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r11 = r0.iterator()
        L_0x00fc:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r3 = r11.next()
            r0 = r3
            X.AD8 r0 = (X.AD8) r0
            java.lang.String r0 = r0.A00()
            X.ADd r1 = new X.ADd
            r1.<init>(r7, r0)
            java.lang.Object r0 = r9.get(r1)
            if (r0 != 0) goto L_0x0122
            if (r2 != 0) goto L_0x00fc
            r0 = r18
            X.ADo r0 = X.C196499vA.A00(r1, r0, r10)
            if (r0 == 0) goto L_0x00fc
        L_0x0122:
            r8.add(r3)
            goto L_0x00fc
        L_0x0126:
            java.util.Iterator r13 = r12.iterator()
        L_0x012a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0272
            java.lang.Object r3 = r13.next()
            X.ADd r3 = (X.C20245ADd) r3
            java.lang.String r1 = r3.A00
            java.lang.String r0 = r8.A00()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x012a
            if (r2 == 0) goto L_0x022d
            java.util.Iterator r15 = r12.iterator()
        L_0x0148:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0229
            java.lang.Object r12 = r15.next()
            r0 = r12
            X.ADd r0 = (X.C20245ADd) r0
            java.lang.String r13 = r0.A00
            java.lang.String r0 = r2.A00()
            boolean r0 = X.C18070vi.A18(r13, r0)
            if (r0 == 0) goto L_0x0148
        L_0x0161:
            X.ADd r12 = (X.C20245ADd) r12
        L_0x0163:
            X.1D6 r0 = X.AnonymousClass1D6.A01(r3, r12)
            r10.put(r0, r14)
            if (r12 == 0) goto L_0x00c2
            java.lang.Object r15 = r9.get(r12)
            X.1D6 r15 = (X.AnonymousClass1D6) r15
            r16 = 2147483647(0x7fffffff, float:NaN)
            if (r15 == 0) goto L_0x01af
            java.lang.Object r0 = r15.first
            X.ADd r0 = (X.C20245ADd) r0
            X.ADo r0 = X.C196499vA.A00(r0, r12, r10)
            if (r0 == 0) goto L_0x0224
            boolean r13 = r14.A02
            boolean r0 = r0.A02
            if (r13 != r0) goto L_0x0224
        L_0x0187:
            java.lang.Object r0 = r15.first
            X.ADd r0 = (X.C20245ADd) r0
            X.ADo r0 = X.C196499vA.A00(r0, r12, r10)
            if (r0 == 0) goto L_0x01c2
            boolean r0 = r0.A02
            if (r13 != r0) goto L_0x01c2
            int r13 = X.C108955ca.A09(r15)
            java.lang.String r0 = r3.A01
            X.1D6 r0 = X.AnonymousClass1D6.A01(r1, r0)
            java.lang.Number r0 = X.C108945cZ.A1D(r0, r7)
            if (r0 != 0) goto L_0x01a9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
        L_0x01a9:
            int r0 = r0.intValue()
            if (r13 <= r0) goto L_0x01c2
        L_0x01af:
            java.lang.String r0 = r3.A01
            X.1D6 r0 = X.AnonymousClass1D6.A01(r1, r0)
            java.lang.Object r0 = r7.get(r0)
            if (r0 == 0) goto L_0x01c2
            X.1D6 r0 = X.AnonymousClass1D6.A01(r3, r0)
            r9.put(r12, r0)
        L_0x01c2:
            java.lang.Object r13 = r9.get(r3)
            X.1D6 r13 = (X.AnonymousClass1D6) r13
            if (r13 == 0) goto L_0x020d
            java.lang.Object r0 = r13.first
            X.ADd r0 = (X.C20245ADd) r0
            X.ADo r0 = X.C196499vA.A00(r0, r3, r10)
            if (r0 == 0) goto L_0x0209
            boolean r1 = r14.A02
            boolean r0 = r0.A02
            if (r1 != r0) goto L_0x0209
        L_0x01da:
            java.lang.Object r0 = r13.first
            X.ADd r0 = (X.C20245ADd) r0
            X.ADo r0 = X.C196499vA.A00(r0, r3, r10)
            if (r0 == 0) goto L_0x01ea
            boolean r0 = r0.A02
            if (r1 != r0) goto L_0x01ea
            goto L_0x00c2
        L_0x01ea:
            if (r1 == 0) goto L_0x00c2
            int r1 = X.C108955ca.A09(r13)
            java.lang.String r13 = r12.A00
            java.lang.String r0 = r12.A01
            X.1D6 r0 = X.AnonymousClass1D6.A01(r13, r0)
            java.lang.Number r0 = X.C108945cZ.A1D(r0, r7)
            if (r0 != 0) goto L_0x0202
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
        L_0x0202:
            int r0 = r0.intValue()
            if (r1 <= r0) goto L_0x00c2
            goto L_0x020d
        L_0x0209:
            boolean r1 = r14.A02
            if (r1 == 0) goto L_0x01da
        L_0x020d:
            java.lang.String r1 = r12.A00
            java.lang.String r0 = r12.A01
            X.1D6 r0 = X.AnonymousClass1D6.A01(r1, r0)
            java.lang.Object r0 = r7.get(r0)
            if (r0 == 0) goto L_0x00c2
            X.1D6 r0 = X.AnonymousClass1D6.A01(r12, r0)
            r9.put(r3, r0)
            goto L_0x00c2
        L_0x0224:
            boolean r13 = r14.A02
            if (r13 == 0) goto L_0x0187
            goto L_0x01af
        L_0x0229:
            r12 = r18
            goto L_0x0161
        L_0x022d:
            r12 = r18
            goto L_0x0163
        L_0x0231:
            X.77B r1 = new X.77B
            r1.<init>(r7, r8, r10, r9)
            if (r2 == 0) goto L_0x026d
            r0 = 2
            X.77B[] r8 = new X.AnonymousClass77B[r0]
            r8[r19] = r1
            java.lang.String r11 = r2.A00()
            java.util.List r0 = r2.A01()
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x024d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x027d
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.AD8 r0 = (X.AD8) r0
            java.lang.String r1 = r0.A00()
            X.ADd r0 = new X.ADd
            r0.<init>(r11, r1)
            java.lang.Object r0 = r9.get(r0)
            if (r0 == 0) goto L_0x024d
            r7.add(r2)
            goto L_0x024d
        L_0x026d:
            java.util.List r7 = java.util.Collections.singletonList(r1)
            goto L_0x0287
        L_0x0272:
            java.lang.String r1 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x027a:
            X.0wS r7 = X.C18460wS.A00
            goto L_0x028a
        L_0x027d:
            X.77B r1 = new X.77B
            r1.<init>(r11, r7, r10, r9)
            r0 = 1
            java.util.List r7 = X.AnonymousClass8BR.A15(r1, r8, r0)
        L_0x0287:
            X.C18070vi.A0X(r7)
        L_0x028a:
            X.AEv r0 = r6.A00
            r2 = 0
            if (r0 == 0) goto L_0x02f8
            X.AE6 r0 = r0.A05
        L_0x0291:
            r3 = 0
            X.9st r0 = com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel.A00(r0, r6, r7, r3)
            r5.add(r0)
            X.AEv r0 = r6.A00
            if (r0 == 0) goto L_0x02f6
            X.AE6 r0 = r0.A05
        L_0x029f:
            r1 = 1
            X.9st r0 = com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel.A00(r0, r6, r7, r1)
            r5.add(r0)
            X.AEv r0 = r6.A00
            if (r0 == 0) goto L_0x02f4
            X.AE6 r0 = r0.A05
            if (r0 == 0) goto L_0x02f4
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x02f4
            java.lang.Object r0 = X.C29431cG.A0f(r0, r3)
        L_0x02b7:
            boolean r0 = r0 instanceof X.C168158iP
            if (r0 != 0) goto L_0x02d2
            X.AEv r0 = r6.A00
            if (r0 == 0) goto L_0x02cb
            X.AE6 r0 = r0.A05
            if (r0 == 0) goto L_0x02cb
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x02cb
            java.lang.Object r2 = X.C29431cG.A0f(r0, r1)
        L_0x02cb:
            boolean r0 = r2 instanceof X.C168158iP
            if (r0 == 0) goto L_0x02d2
            java.util.Collections.reverse(r5)
        L_0x02d2:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r5.iterator()
        L_0x02da:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02fa
            java.lang.Object r0 = r2.next()
            X.9st r0 = (X.C195159st) r0
            X.77B r0 = r0.A02
            java.lang.String r1 = r0.A00
            int r0 = r1.length()
            if (r0 == 0) goto L_0x02da
            r3.add(r1)
            goto L_0x02da
        L_0x02f4:
            r0 = r2
            goto L_0x02b7
        L_0x02f6:
            r0 = r2
            goto L_0x029f
        L_0x02f8:
            r0 = r2
            goto L_0x0291
        L_0x02fa:
            r6.A03 = r3
            X.AEv r0 = r6.A00
            java.util.List r0 = X.C196509vB.A00(r0, r3)
            r6.A02 = r0
            X.9pP r1 = new X.9pP
            r1.<init>(r5)
            r0 = r20
            r0.A0E(r1)
            com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel r0 = r4.A02
            if (r0 == 0) goto L_0x0317
            r1 = r23
            r0.A04 = r1
            return
        L_0x0317:
            X.AnonymousClass3MW.A1H()
            r0 = 0
            throw r0
        L_0x031c:
            java.lang.String r0 = "bizJid"
            X.C18070vi.A11(r0)
            goto L_0x0325
        L_0x0322:
            X.AnonymousClass1ZU.A0B()
        L_0x0325:
            r0 = 0
            throw r0
        L_0x0327:
            X.AnonymousClass3MW.A1H()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.view.variants.VariantsCarouselBaseFragment.A25(X.AEv, X.1Di, boolean):void");
    }

    public void A1z(Bundle bundle) {
        String str;
        super.A1z(bundle);
        VariantsCarouselFragmentViewModel variantsCarouselFragmentViewModel = (VariantsCarouselFragmentViewModel) AnonymousClass3MW.A0N(this).A00(VariantsCarouselFragmentViewModel.class);
        C18070vi.A0d(variantsCarouselFragmentViewModel, 0);
        this.A02 = variantsCarouselFragmentViewModel;
        C22941Dw r0 = UserJid.Companion;
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            str = bundle2.getString("extra_product_owner_jid");
        } else {
            str = null;
        }
        this.A03 = C22941Dw.A03(str);
    }
}
