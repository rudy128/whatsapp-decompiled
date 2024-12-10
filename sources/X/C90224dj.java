package X;

import android.view.View;

/* renamed from: X.4dj  reason: invalid class name and case insensitive filesystem */
public class C90224dj implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;

    public C90224dj(AnonymousClass4aY r1, int i) {
        this.A00 = i;
        if (4 - i != 0) {
            this.A01 = r1;
        } else {
            this.A01 = r1;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: android.view.View} */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02e6, code lost:
        if (X.AnonymousClass3MW.A02(r11, r1) <= X.AnonymousClass3MW.A02(r6.A2B, r7[1])) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0342, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b9, code lost:
        X.AnonymousClass1ZU.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        r2.A0W(r0);
        r2.A0h = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011f, code lost:
        if (r1 == null) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0122, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014c, code lost:
        if (r1 != null) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014e, code lost:
        r1.width = r3;
        r1.weight = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0152, code lost:
        r2.setLayoutParams(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0155, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayoutChange(android.view.View r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0320;
                case 1: goto L_0x0315;
                case 2: goto L_0x02a4;
                case 3: goto L_0x027f;
                case 4: goto L_0x025c;
                case 5: goto L_0x02c0;
                case 6: goto L_0x0210;
                case 7: goto L_0x0096;
                case 8: goto L_0x003b;
                case 9: goto L_0x0026;
                default: goto L_0x0005;
            }
        L_0x0005:
            r11.removeOnLayoutChangeListener(r10)
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.A02(r0)
            android.view.View r0 = X.C72463Mc.A0L(r0)
            int r0 = r0.getHeight()
            int r1 = r0 / 2
            r0 = 0
            r2.A0Y(r1, r0)
            r0 = 4
        L_0x001f:
            r2.A0W(r0)
            r0 = 1
            r2.A0h = r0
        L_0x0025:
            return
        L_0x0026:
            r11.removeOnLayoutChangeListener(r10)
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.A02(r0)
            int r1 = r0.getHeight()
            r0 = 0
            r2.A0Y(r1, r0)
            r0 = 3
            goto L_0x001f
        L_0x003b:
            java.lang.Object r4 = r10.A01
            com.whatsapp.wds.components.actiontile.WDSActionTileGroup r4 = (com.whatsapp.wds.components.actiontile.WDSActionTileGroup) r4
            int r14 = r14 - r12
            int r6 = r4.A00
            r5 = 1
            java.util.Iterator r3 = X.C99434so.A00(r4, r5)
            r2 = 0
        L_0x0048:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005f
            android.view.View r0 = X.AnonymousClass3MX.A0E(r3)
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0048
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x0048
            goto L_0x00b9
        L_0x005f:
            if (r6 == r2) goto L_0x0025
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = X.C99434so.A00(r4, r5)
            r7 = 1
            r3 = 1
        L_0x006b:
            boolean r0 = r8.hasNext()
            r2 = 0
            r6 = 0
            if (r0 == 0) goto L_0x0124
            android.view.View r2 = X.AnonymousClass3MX.A0E(r8)
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x006b
            r9.add(r2)
            boolean r0 = r2 instanceof com.whatsapp.wds.components.actiontile.WDSActionTile
            if (r0 == 0) goto L_0x006b
            com.whatsapp.wds.components.actiontile.WDSActionTile r2 = (com.whatsapp.wds.components.actiontile.WDSActionTile) r2
            if (r2 == 0) goto L_0x006b
            com.whatsapp.WaTextView r0 = r2.A03
            if (r0 == 0) goto L_0x006b
            int r0 = r0.getLineCount()
            if (r3 >= r0) goto L_0x006b
            r3 = r0
            goto L_0x006b
        L_0x0096:
            java.lang.Object r4 = r10.A01
            com.whatsapp.insights.InsightsTileViewGroup r4 = (com.whatsapp.insights.InsightsTileViewGroup) r4
            int r14 = r14 - r12
            int r6 = r4.A00
            r5 = 1
            java.util.Iterator r3 = X.C99434so.A00(r4, r5)
            r2 = 0
        L_0x00a3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00be
            android.view.View r0 = X.AnonymousClass3MX.A0E(r3)
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00a3
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x00a3
        L_0x00b9:
            X.AnonymousClass1ZU.A0A()
            goto L_0x0341
        L_0x00be:
            if (r6 == r2) goto L_0x0025
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = X.C99434so.A00(r4, r5)
            r7 = 1
            r3 = 1
        L_0x00ca:
            boolean r0 = r8.hasNext()
            r2 = 0
            r6 = 0
            if (r0 == 0) goto L_0x00f7
            android.view.View r2 = X.AnonymousClass3MX.A0E(r8)
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00ca
            r9.add(r2)
            boolean r0 = r2 instanceof com.whatsapp.insights.InsightsTileView
            if (r0 == 0) goto L_0x00ca
            com.whatsapp.insights.InsightsTileView r2 = (com.whatsapp.insights.InsightsTileView) r2
            if (r2 == 0) goto L_0x00ca
            com.whatsapp.WaTextView r0 = r2.getTitleView()
            if (r0 == 0) goto L_0x00ca
            int r0 = r0.getLineCount()
            if (r3 >= r0) goto L_0x00ca
            r3 = r0
            goto L_0x00ca
        L_0x00f7:
            int r0 = r9.size()
            r4.A00 = r0
            if (r0 == 0) goto L_0x0025
            r8 = 0
            if (r0 != r5) goto L_0x01b2
            java.lang.Object r1 = r9.get(r6)
            boolean r0 = r1 instanceof com.whatsapp.insights.InsightsTileView
            if (r0 == 0) goto L_0x010d
            r2 = r1
            android.view.View r2 = (android.view.View) r2
        L_0x010d:
            r0 = 120(0x78, float:1.68E-43)
            int r3 = X.C43531zx.A00(r4, r0)
            if (r2 == 0) goto L_0x0025
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x0122
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            if (r1 != 0) goto L_0x014e
            goto L_0x0152
        L_0x0122:
            r1 = 0
            goto L_0x0152
        L_0x0124:
            int r0 = r9.size()
            r4.A00 = r0
            if (r0 == 0) goto L_0x0025
            r8 = 0
            if (r0 != r5) goto L_0x0156
            java.lang.Object r1 = r9.get(r6)
            boolean r0 = r1 instanceof com.whatsapp.wds.components.actiontile.WDSActionTile
            if (r0 == 0) goto L_0x013a
            r2 = r1
            android.view.View r2 = (android.view.View) r2
        L_0x013a:
            r0 = 120(0x78, float:1.68E-43)
            int r3 = X.C43531zx.A00(r4, r0)
            if (r2 == 0) goto L_0x0025
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x0122
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            if (r1 == 0) goto L_0x0152
        L_0x014e:
            r1.width = r3
            r1.weight = r8
        L_0x0152:
            r2.setLayoutParams(r1)
            return
        L_0x0156:
            android.content.res.Resources r0 = X.AnonymousClass3MX.A05(r4)
            float r2 = (float) r14
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            float r1 = (float) r0
            r0 = 1126170624(0x43200000, float:160.0)
            float r1 = r1 / r0
            float r2 = r2 / r1
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0025
            r0 = 1134559232(0x43a00000, float:320.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ac
            r4.setOrientation(r5)
        L_0x0173:
            java.util.Iterator r5 = X.C99434so.A00(r4, r5)
        L_0x0177:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0025
            android.view.View r4 = X.AnonymousClass3MX.A0E(r5)
            boolean r0 = r4 instanceof com.whatsapp.wds.components.actiontile.WDSActionTile
            if (r0 == 0) goto L_0x0177
            com.whatsapp.wds.components.actiontile.WDSActionTile r4 = (com.whatsapp.wds.components.actiontile.WDSActionTile) r4
            if (r4 == 0) goto L_0x0177
            r4.setOrientation(r6)
            com.whatsapp.WaTextView r0 = r4.A03
            if (r0 == 0) goto L_0x0193
            r0.setLines(r7)
        L_0x0193:
            r3 = -1
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x01aa
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            if (r1 == 0) goto L_0x01a6
            r1.width = r3
            r1.weight = r2
        L_0x01a6:
            r4.setLayoutParams(r1)
            goto L_0x0177
        L_0x01aa:
            r1 = 0
            goto L_0x01a6
        L_0x01ac:
            r4.setOrientation(r6)
            r6 = 1
            r7 = r3
            goto L_0x0173
        L_0x01b2:
            android.content.res.Resources r0 = X.AnonymousClass3MX.A05(r4)
            float r2 = (float) r14
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            float r1 = (float) r0
            r0 = 1126170624(0x43200000, float:160.0)
            float r1 = r1 / r0
            float r2 = r2 / r1
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0025
            r0 = 1134559232(0x43a00000, float:320.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x020a
            r4.setOrientation(r5)
        L_0x01cf:
            java.util.Iterator r5 = X.C99434so.A00(r4, r5)
        L_0x01d3:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0025
            android.view.View r4 = X.AnonymousClass3MX.A0E(r5)
            boolean r0 = r4 instanceof com.whatsapp.insights.InsightsTileView
            if (r0 == 0) goto L_0x01d3
            com.whatsapp.insights.InsightsTileView r4 = (com.whatsapp.insights.InsightsTileView) r4
            if (r4 == 0) goto L_0x01d3
            r4.setOrientation(r6)
            com.whatsapp.WaTextView r0 = r4.getTitleView()
            if (r0 == 0) goto L_0x01f1
            r0.setLines(r7)
        L_0x01f1:
            r3 = -1
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x0208
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            if (r1 == 0) goto L_0x0204
            r1.width = r3
            r1.weight = r2
        L_0x0204:
            r4.setLayoutParams(r1)
            goto L_0x01d3
        L_0x0208:
            r1 = 0
            goto L_0x0204
        L_0x020a:
            r4.setOrientation(r6)
            r6 = 1
            r7 = r3
            goto L_0x01cf
        L_0x0210:
            java.lang.Object r4 = r10.A01
            X.4aY r4 = (X.AnonymousClass4aY) r4
            android.widget.LinearLayout r0 = r4.A0Z
            if (r0 == 0) goto L_0x0025
            r0.removeOnLayoutChangeListener(r10)
            java.util.HashSet r1 = X.C17880vN.A12()
            X.00H r0 = r4.A7m
            java.lang.Object r0 = r0.get()
            r1.add(r0)
            X.5cQ r0 = r4.A2Q
            X.4SX r0 = r0.getConversationRowCustomizers()
            X.5c7 r0 = r0.A04
            r1.add(r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x0237:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r2 = r3.next()
            X.5c7 r2 = (X.C108675c7) r2
            X.1FY r1 = X.AnonymousClass3MW.A0Q(r4)
            android.widget.LinearLayout r0 = r4.A0Z
            int r0 = r0.getWidth()
            r2.CQj(r1, r0)
            boolean r0 = r2.CM7()
            if (r0 == 0) goto L_0x0237
            com.whatsapp.conversation.ConversationListView r0 = r4.A2B
            r0.A05()
            goto L_0x0237
        L_0x025c:
            java.lang.Object r1 = r10.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            int r2 = r19 - r17
            int r0 = r11.getHeight()
            if (r0 >= r2) goto L_0x0275
            X.3RG r0 = r1.A1h
            r1 = 1
        L_0x026b:
            X.3Uy r0 = r0.getViewModel()
            r0.A04 = r1
            X.C73343Uy.A00(r0)
            return
        L_0x0275:
            int r0 = r11.getHeight()
            if (r0 <= r2) goto L_0x0025
            X.3RG r0 = r1.A1h
            r1 = 0
            goto L_0x026b
        L_0x027f:
            java.lang.Object r1 = r10.A01
            com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView r1 = (com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            int r15 = r15 - r13
            int r2 = r19 - r17
            if (r15 == r2) goto L_0x0025
            com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder r2 = r1.getStateHolder()
            float r1 = (float) r15
            float r0 = r2.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0025
            r2.A02 = r1
            java.lang.Integer r1 = r2.A08
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            if (r1 != r0) goto L_0x0025
            r0 = 0
            com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder.A00(r2, r0)
            return
        L_0x02a4:
            java.lang.Object r1 = r10.A01
            com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView r1 = (com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            int r2 = r19 - r17
            int r15 = r15 - r13
            if (r2 == r15) goto L_0x0025
            com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder r1 = r1.getStateHolder()
            int r0 = r1.A06
            if (r0 == r15) goto L_0x0025
            r1.A06 = r15
            r0 = 0
            com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder.A00(r1, r0)
            return
        L_0x02c0:
            java.lang.Object r6 = r10.A01
            X.4aY r6 = (X.AnonymousClass4aY) r6
            r4 = 200(0xc8, float:2.8E-43)
            r0 = 2
            int[] r7 = new int[r0]
            int[] r3 = new int[r0]
            r11.getLocationOnScreen(r3)
            com.whatsapp.conversation.ConversationListView r0 = r6.A2B
            r0.getLocationOnScreen(r7)
            r5 = 1
            r1 = r3[r5]
            r0 = r7[r5]
            if (r1 < r0) goto L_0x02ec
            int r2 = X.AnonymousClass3MW.A02(r11, r1)
            r1 = r7[r5]
            com.whatsapp.conversation.ConversationListView r0 = r6.A2B
            int r0 = X.AnonymousClass3MW.A02(r0, r1)
            if (r2 > r0) goto L_0x02ec
        L_0x02e8:
            r11.removeOnLayoutChangeListener(r10)
            return
        L_0x02ec:
            int r0 = r6.A04
            if (r0 == r5) goto L_0x02f5
            com.whatsapp.conversation.ConversationListView r1 = r6.A2B
            r0 = 0
            r1.A01 = r0
        L_0x02f5:
            r2 = r3[r5]
            r1 = r7[r5]
            if (r2 >= r1) goto L_0x0302
            com.whatsapp.conversation.ConversationListView r0 = r6.A2B
            int r2 = r2 - r1
            r0.smoothScrollBy(r2, r4)
            goto L_0x02e8
        L_0x0302:
            com.whatsapp.conversation.ConversationListView r3 = r6.A2B
            int r2 = X.AnonymousClass3MW.A02(r11, r2)
            r1 = r7[r5]
            com.whatsapp.conversation.ConversationListView r0 = r6.A2B
            int r0 = X.AnonymousClass3MW.A02(r0, r1)
            int r2 = r2 - r0
            r3.smoothScrollBy(r2, r4)
            goto L_0x02e8
        L_0x0315:
            r11.removeOnLayoutChangeListener(r10)
            java.lang.Object r0 = r10.A01
            com.whatsapp.calling.vcoverscroll.view.PulsingJoinButton r0 = (com.whatsapp.calling.vcoverscroll.view.PulsingJoinButton) r0
            r0.A00()
            return
        L_0x0320:
            r11.removeOnLayoutChangeListener(r10)
            java.lang.Object r4 = r10.A01
            com.whatsapp.calling.callhistory.calllog.CallLogActivityV2 r4 = (com.whatsapp.calling.callhistory.calllog.CallLogActivityV2) r4
            androidx.recyclerview.widget.RecyclerView r0 = r4.A01
            java.lang.String r3 = "recyclerView"
            if (r0 == 0) goto L_0x0371
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            X.C18070vi.A0X(r2)
            int r1 = r11.getMeasuredHeight()
            android.view.View r0 = r4.A00
            if (r0 != 0) goto L_0x0343
            java.lang.String r0 = "headerView"
        L_0x033e:
            X.C18070vi.A11(r0)
        L_0x0341:
            r0 = 0
            throw r0
        L_0x0343:
            int r0 = r0.getHeight()
            int r1 = r1 - r0
            com.whatsapp.contact.photos.MultiContactThumbnail r0 = r4.A0M
            if (r0 != 0) goto L_0x034f
            java.lang.String r0 = "contactImage"
            goto L_0x033e
        L_0x034f:
            int r0 = r0.getHeight()
            int r0 = r0 / 2
            int r1 = r1 + r0
            com.whatsapp.TextEmojiLabel r0 = r4.A08
            if (r0 != 0) goto L_0x035d
            java.lang.String r0 = "contactSubtitle"
            goto L_0x033e
        L_0x035d:
            int r0 = X.AnonymousClass3MW.A02(r0, r1)
            r2.height = r0
            int r0 = r11.getMeasuredWidth()
            r2.width = r0
            androidx.recyclerview.widget.RecyclerView r0 = r4.A01
            if (r0 == 0) goto L_0x0371
            r0.setLayoutParams(r2)
            return
        L_0x0371:
            X.C18070vi.A11(r3)
            goto L_0x0341
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90224dj.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }

    public C90224dj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
