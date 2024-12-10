package X;

import java.util.Set;

/* renamed from: X.8IA  reason: invalid class name */
public abstract class AnonymousClass8IA extends C39711tW {
    public int A00;
    public final Set A01 = C17880vN.A14();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        r6 = (X.C174858xS) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(androidx.recyclerview.widget.RecyclerView r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = 0
            r1 = r18
            X.C18070vi.A0d(r1, r0)
            X.1qy r2 = r1.getLayoutManager()
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x00b9
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            int r4 = r2.A1N()
            int r3 = r2.A1P()
            r2 = r17
            if (r4 > r3) goto L_0x0082
        L_0x001c:
            java.util.Set r0 = r2.A01
            boolean r5 = X.C108965cb.A1b(r0, r4)
            if (r5 != 0) goto L_0x0070
            X.1xT r6 = r1.A0O(r4)
            X.8xj r6 = (X.C175028xj) r6
            if (r6 == 0) goto L_0x0070
            boolean r5 = r6 instanceof X.C174928xZ
            if (r5 == 0) goto L_0x0075
            X.8xZ r6 = (X.C174928xZ) r6
            X.8km r5 = r6.A00
            if (r5 == 0) goto L_0x0069
            X.A7p r6 = r6.A07
        L_0x0038:
            X.BD3 r5 = r5.A0A
            if (r5 == 0) goto L_0x0069
            X.1og r6 = r6.A0O
            int r15 = r5.CDG()
            java.lang.Double r7 = r5.CC2()
            java.lang.String r9 = r5.CD9()
            java.lang.String r10 = r5.CH5()
            java.lang.String r11 = r5.CH7()
            java.lang.String r12 = r5.CDH()
            java.lang.String r13 = r5.CCV()
            java.lang.String r14 = r5.BkK()
            java.lang.Integer r8 = X.AnonymousClass8BS.A0U()
            int r16 = r5.BKI()
            r6.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0069:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r0.add(r5)
        L_0x0070:
            if (r4 == r3) goto L_0x0082
            int r4 = r4 + 1
            goto L_0x001c
        L_0x0075:
            boolean r5 = r6 instanceof X.C174858xS
            if (r5 == 0) goto L_0x0069
            X.8xS r6 = (X.C174858xS) r6
            X.8wY r5 = r6.A00
            if (r5 == 0) goto L_0x0069
            X.A7p r6 = r6.A01
            goto L_0x0038
        L_0x0082:
            boolean r5 = r2 instanceof X.C173788vj
            if (r5 == 0) goto L_0x00cb
            r0 = r2
            X.8vj r0 = (X.C173788vj) r0
            int r4 = r0.A00
            java.lang.Object r0 = r0.A01
            if (r4 == 0) goto L_0x00ba
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r0 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment) r0
            X.8FD r6 = r0.A0A
            int r4 = r6.A02
            r0 = 1
            if (r4 == r0) goto L_0x00a1
            r0 = 4
            if (r4 == r0) goto L_0x00a1
            boolean r0 = X.AnonymousClass8FD.A0P(r6)
            if (r0 == 0) goto L_0x00b9
        L_0x00a1:
            X.AOq r6 = r6.A0N
            X.8FJ r0 = r6.A00
            X.A6f r0 = r0.A01
            if (r0 == 0) goto L_0x00b9
            java.lang.String r4 = r0.A08
            java.lang.String r0 = "country_default"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00b9
            boolean r0 = r6.A09()
            if (r0 != 0) goto L_0x00cb
        L_0x00b9:
            return
        L_0x00ba:
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r0 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment) r0
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r6 = r0.A07
            int r4 = r6.A01
            r0 = 1
            if (r4 != r0) goto L_0x00b9
            X.AOq r0 = r6.A0T
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x00b9
        L_0x00cb:
            int r0 = r2.A00
            int r6 = r3 - r0
            r0 = r2
            if (r5 == 0) goto L_0x0151
            X.8vj r0 = (X.C173788vj) r0
            int r4 = r0.A00
            java.lang.Object r0 = r0.A01
            if (r4 == 0) goto L_0x014a
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r0 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment) r0
            X.8FD r0 = r0.A0A
            X.AP5 r0 = r0.A0J
        L_0x00e0:
            int r4 = r0.A05
            r0 = 5
            if (r4 != 0) goto L_0x00e7
            r0 = 14
        L_0x00e7:
            if (r6 >= r0) goto L_0x0107
            X.1qy r4 = r1.getLayoutManager()
            boolean r0 = r4 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x00b9
            X.1rD r0 = r1.A0B
            if (r0 == 0) goto L_0x00b9
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            int r4 = r4.A1Q()
            X.1rD r0 = r1.A0B
            if (r0 == 0) goto L_0x0148
            int r1 = r0.A0Q()
        L_0x0103:
            r0 = 1
            int r1 = r1 - r0
            if (r4 != r1) goto L_0x00b9
        L_0x0107:
            if (r5 == 0) goto L_0x0124
            r0 = r2
            X.8vj r0 = (X.C173788vj) r0
            int r1 = r0.A00
            java.lang.Object r0 = r0.A01
            if (r1 == 0) goto L_0x011c
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r0 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment) r0
            X.8FD r0 = r0.A0A
            r0.A0V()
        L_0x0119:
            r2.A00 = r3
            return
        L_0x011c:
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r0 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment) r0
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r0 = r0.A07
            r0.A0T()
            goto L_0x0119
        L_0x0124:
            X.8FA r0 = com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment.A08
            java.lang.String r4 = "viewModel"
            if (r0 == 0) goto L_0x0153
            X.AOo r0 = r0.A03
            X.1DT r0 = r0.A00
            java.lang.Object r0 = r0.A06()
            X.9y6 r0 = (X.C198289y6) r0
            if (r0 == 0) goto L_0x0119
            X.9qq r0 = r0.A03
            if (r0 == 0) goto L_0x0119
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0119
            X.8FA r1 = com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment.A08
            if (r1 == 0) goto L_0x0153
            X.AEQ r0 = com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment.A09
            r1.A0T(r0)
            goto L_0x0119
        L_0x0148:
            r1 = 0
            goto L_0x0103
        L_0x014a:
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r0 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment) r0
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r0 = r0.A07
            X.AP5 r0 = r0.A0P
            goto L_0x00e0
        L_0x0151:
            r0 = 5
            goto L_0x00e7
        L_0x0153:
            X.C18070vi.A11(r4)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8IA.A04(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
