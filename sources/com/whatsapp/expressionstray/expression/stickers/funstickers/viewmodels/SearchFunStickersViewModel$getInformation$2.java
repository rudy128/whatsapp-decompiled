package com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$getInformation$2", f = "SearchFunStickersViewModel.kt", i = {3, 4, 4, 5}, l = {475, 482, 483, 485, 492, 506}, m = "invokeSuspend", n = {"result", "response", "funStickerModel", "response"}, s = {"L$0", "L$0", "L$3", "L$0"})
public final class SearchFunStickersViewModel$getInformation$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $prompt;
    public final /* synthetic */ boolean $shouldTriggerWithDelay;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$getInformation$2(SearchFunStickersViewModel searchFunStickersViewModel, String str, C30391dr r4, boolean z) {
        super(2, r4);
        this.$shouldTriggerWithDelay = z;
        this.this$0 = searchFunStickersViewModel;
        this.$prompt = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new SearchFunStickersViewModel$getInformation$2(this.this$0, this.$prompt, r6, this.$shouldTriggerWithDelay);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        r15.this$0.A0A.A0E(new X.AnonymousClass60J(r15.$prompt));
        r0 = r15.this$0;
        r15.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A06(r0, r15) != r1) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        r7 = (X.C127286e6) r15.this$0.A0P.get();
        r6 = r15.$prompt;
        r15.label = 3;
        r7 = X.AnonymousClass7I7.A01(X.C131206ki.A00(X.AnonymousClass6YY.A00, r7.A01, new X.C144577Hv(r7, r6)), X.C108975cc.A0k(r15), 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        if (r7 != r1) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0075, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
        r4 = (java.util.List) r7;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007f, code lost:
        if ((r4 instanceof java.util.Collection) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (r4.isEmpty() == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        r6 = r15.this$0;
        r3 = r4.size();
        r15.L$0 = r4;
        r15.label = 4;
        r9 = (X.C1404771o) r6.A0O.get();
        r11 = (long) r3;
        r13 = (long) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        if (r9.A04 == null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ab, code lost:
        if (X.C30451dy.A00(r15, r9.A0C, new com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMetadataReturned$2(r9, (X.C30391dr) null, r11, r13)) != r1) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ad, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        r6 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b6, code lost:
        if (r6.hasNext() == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b8, code lost:
        r3 = new java.net.URL(((X.AnonymousClass77V) r6.next()).A06).getPath();
        X.C18070vi.A0X(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d2, code lost:
        if (r3.endsWith(".webp") == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d4, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d6, code lost:
        if (r5 >= 0) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
        X.AnonymousClass1ZU.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00db, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e3, code lost:
        r1 = X.AnonymousClass000.A13();
        r0 = r15.this$0;
        r0.A00++;
        r3 = r4.iterator();
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f7, code lost:
        if (r3.hasNext() == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f9, code lost:
        r9 = (X.AnonymousClass77V) r3.next();
        r8 = (X.C1404771o) r0.A0O.get();
        r7 = r9.A00;
        r6 = r9.A01;
        r15.L$0 = r1;
        r15.L$1 = r0;
        r15.L$2 = r3;
        r15.L$3 = r9;
        r15.label = 5;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0121, code lost:
        if (X.C30451dy.A00(r15, r8.A0C, new com.whatsapp.funstickers.logging.FunStickersFetchLogger$assignServerDurations$2(r8, r7, r6, (X.C30391dr) null)) != r2) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0123, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0137, code lost:
        r1.add(new X.AnonymousClass60H(r9, (X.C1418377d) null, r9.A03, r0.A00, false));
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0145, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0159, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, ((X.C1404771o) r15.this$0.A0O.get()).A0A, 7186) != false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x015b, code lost:
        r0 = r1.isEmpty();
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015f, code lost:
        if (r0 == false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0161, code lost:
        r3 = r15.this$0;
        r15.L$0 = r1;
        r15.L$1 = null;
        r15.L$2 = null;
        r15.L$3 = null;
        r15.label = 6;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x017c, code lost:
        if (((X.C1404771o) X.C18070vi.A0E(r3.A0O)).A02((java.lang.Integer) null, r15, 10) != r2) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x017e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0184, code lost:
        X.C1404771o.A01((X.C1404771o) r15.this$0.A0O.get());
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0191, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r7 = r16
            X.1g4 r1 = X.C31751g4.COROUTINE_SUSPENDED
            r2 = r1
            int r0 = r15.label
            r5 = 2
            r6 = 1
            r10 = 0
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x002f;
                case 2: goto L_0x004b;
                case 3: goto L_0x0076;
                case 4: goto L_0x00dc;
                case 5: goto L_0x0124;
                case 6: goto L_0x017f;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0012:
            X.C30691eM.A01(r7)
            boolean r0 = r15.$shouldTriggerWithDelay
            if (r0 == 0) goto L_0x0032
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r15.this$0
            X.0ve r4 = r0.A0I
            r3 = 4614(0x1206, float:6.466E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r4, r3)
            long r3 = (long) r0
            r15.label = r6
            java.lang.Object r0 = X.C62882s9.A00(r15, r3)
            if (r0 != r1) goto L_0x0032
            return r1
        L_0x002f:
            X.C30691eM.A01(r7)
        L_0x0032:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r15.this$0
            X.1DT r4 = r0.A0A
            java.lang.String r3 = r15.$prompt
            X.60J r0 = new X.60J
            r0.<init>(r3)
            r4.A0E(r0)
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r15.this$0
            r15.label = r5
            java.lang.Object r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A06(r0, r15)
            if (r0 != r1) goto L_0x004e
            return r1
        L_0x004b:
            X.C30691eM.A01(r7)
        L_0x004e:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r15.this$0
            X.00H r0 = r0.A0P
            java.lang.Object r7 = r0.get()
            X.6e6 r7 = (X.C127286e6) r7
            java.lang.String r6 = r15.$prompt
            r0 = 3
            r15.label = r0
            X.3Dp r5 = X.C108975cc.A0k(r15)
            X.6ki r4 = r7.A01
            X.1lW r3 = X.AnonymousClass6YY.A00
            X.7Hv r0 = new X.7Hv
            r0.<init>(r7, r6)
            X.7IB r3 = X.C131206ki.A00(r3, r4, r0)
            r0 = 6
            java.lang.Object r7 = X.AnonymousClass7I7.A01(r3, r5, r0)
            if (r7 != r1) goto L_0x0079
            return r1
        L_0x0076:
            X.C30691eM.A01(r7)
        L_0x0079:
            r4 = r7
            java.util.List r4 = (java.util.List) r4
            boolean r0 = r4 instanceof java.util.Collection
            r5 = 0
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00ae
        L_0x0087:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r6 = r15.this$0
            int r3 = r4.size()
            r15.L$0 = r4
            r0 = 4
            r15.label = r0
            X.00H r0 = r6.A0O
            java.lang.Object r9 = r0.get()
            X.71o r9 = (X.C1404771o) r9
            long r11 = (long) r3
            long r13 = (long) r5
            java.lang.Long r0 = r9.A04
            if (r0 == 0) goto L_0x00e3
            X.0wl r0 = r9.A0C
            com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMetadataReturned$2 r8 = new com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMetadataReturned$2
            r8.<init>(r9, r10, r11, r13)
            java.lang.Object r0 = X.C30451dy.A00(r15, r0, r8)
            if (r0 != r1) goto L_0x00e3
            return r1
        L_0x00ae:
            java.util.Iterator r6 = r4.iterator()
        L_0x00b2:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r6.next()
            X.77V r0 = (X.AnonymousClass77V) r0
            java.lang.String r3 = r0.A06
            java.net.URL r0 = new java.net.URL
            r0.<init>(r3)
            java.lang.String r3 = r0.getPath()
            X.C18070vi.A0X(r3)
            java.lang.String r0 = ".webp"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L_0x00b2
            int r5 = r5 + 1
            if (r5 >= 0) goto L_0x00b2
            X.AnonymousClass1ZU.A0A()
            throw r10
        L_0x00dc:
            java.lang.Object r4 = r15.L$0
            java.util.List r4 = (java.util.List) r4
            X.C30691eM.A01(r7)
        L_0x00e3:
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r15.this$0
            int r3 = r0.A00
            int r3 = r3 + 1
            r0.A00 = r3
            java.util.Iterator r3 = r4.iterator()
        L_0x00f3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0145
            java.lang.Object r9 = r3.next()
            X.77V r9 = (X.AnonymousClass77V) r9
            X.00H r4 = r0.A0O
            java.lang.Object r8 = r4.get()
            X.71o r8 = (X.C1404771o) r8
            java.lang.Long r7 = r9.A00
            java.lang.Long r6 = r9.A01
            r15.L$0 = r1
            r15.L$1 = r0
            r15.L$2 = r3
            r15.L$3 = r9
            r4 = 5
            r15.label = r4
            X.0wl r5 = r8.A0C
            com.whatsapp.funstickers.logging.FunStickersFetchLogger$assignServerDurations$2 r4 = new com.whatsapp.funstickers.logging.FunStickersFetchLogger$assignServerDurations$2
            r4.<init>(r8, r7, r6, r10)
            java.lang.Object r4 = X.C30451dy.A00(r15, r5, r4)
            if (r4 != r2) goto L_0x0137
            return r2
        L_0x0124:
            java.lang.Object r9 = r15.L$3
            X.77V r9 = (X.AnonymousClass77V) r9
            java.lang.Object r3 = r15.L$2
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r0 = r15.L$1
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = (com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel) r0
            java.lang.Object r1 = r15.L$0
            java.util.List r1 = (java.util.List) r1
            X.C30691eM.A01(r7)
        L_0x0137:
            java.lang.String r11 = r9.A03
            int r12 = r0.A00
            r13 = 0
            X.60H r8 = new X.60H
            r8.<init>(r9, r10, r11, r12, r13)
            r1.add(r8)
            goto L_0x00f3
        L_0x0145:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r15.this$0
            X.00H r0 = r0.A0O
            java.lang.Object r0 = r0.get()
            X.71o r0 = (X.C1404771o) r0
            X.0ve r4 = r0.A0A
            r3 = 7186(0x1c12, float:1.007E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r3)
            if (r0 != 0) goto L_0x0191
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0191
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r3 = r15.this$0
            r15.L$0 = r1
            r15.L$1 = r10
            r15.L$2 = r10
            r15.L$3 = r10
            r0 = 6
            r15.label = r0
            X.00H r0 = r3.A0O
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.71o r3 = (X.C1404771o) r3
            r0 = 10
            java.lang.Object r0 = r3.A02(r10, r15, r0)
            if (r0 != r2) goto L_0x0184
            return r2
        L_0x017f:
            java.lang.Object r1 = r15.L$0
            X.C30691eM.A01(r7)
        L_0x0184:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = r15.this$0
            X.00H r0 = r0.A0O
            java.lang.Object r0 = r0.get()
            X.71o r0 = (X.C1404771o) r0
            X.C1404771o.A01(r0)
        L_0x0191:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$getInformation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$getInformation$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
