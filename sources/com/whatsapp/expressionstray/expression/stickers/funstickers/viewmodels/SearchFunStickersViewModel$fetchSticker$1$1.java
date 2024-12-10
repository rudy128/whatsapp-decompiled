package com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass60H;
import X.AnonymousClass60L;
import X.AnonymousClass6TG;
import X.AnonymousClass77V;
import X.C121646Ky;
import X.C1418377d;
import X.C17880vN;
import X.C18070vi;
import X.C18600wl;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C41681wt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$fetchSticker$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $batchId;
    public final /* synthetic */ AnonymousClass77V $model;
    public final /* synthetic */ String $url;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1$1", f = "SearchFunStickersViewModel.kt", i = {1, 2}, l = {302, 310, 313}, m = "invokeSuspend", n = {"sticker", "sticker"}, s = {"L$0", "L$0"})
    /* renamed from: com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(str2, r6, i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
            if (r1 < r3) goto L_0x0066;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x007f, code lost:
            if (r0 != r6) goto L_0x0066;
         */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00b0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r10.label
                r4 = 3
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L_0x0018
                if (r0 == r2) goto L_0x0014
                if (r0 == r3) goto L_0x0095
                if (r0 == r4) goto L_0x0095
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            L_0x0014:
                X.C30691eM.A01(r11)     // Catch:{ CancellationException -> 0x0028 }
                goto L_0x0030
            L_0x0018:
                X.C30691eM.A01(r11)
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r1 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this     // Catch:{ CancellationException -> 0x0028 }
                java.lang.String r0 = r3     // Catch:{ CancellationException -> 0x0028 }
                r10.label = r2     // Catch:{ CancellationException -> 0x0028 }
                java.lang.Object r11 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A05(r1, r0, r10)     // Catch:{ CancellationException -> 0x0028 }
                if (r11 != r6) goto L_0x0030
                return r6
            L_0x0028:
                r1 = move-exception
                java.lang.String r0 = "SearchFunStickersViewModel/getSticker/e"
                com.whatsapp.util.Log.e(r0, r1)
                r5 = 0
                goto L_0x0031
            L_0x0030:
                r5 = r11
            L_0x0031:
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this
                boolean r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A0C(r0)
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r2 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this
                if (r0 == 0) goto L_0x0090
                int r1 = r2.A00
                int r0 = r2
                if (r1 != r0) goto L_0x009a
                r10.L$0 = r5
                r10.label = r3
            L_0x0045:
                X.00H r0 = r2.A0O
                if (r5 == 0) goto L_0x0082
                java.lang.Object r9 = r0.get()
                X.71o r9 = (X.C1404771o) r9
                java.lang.Long r0 = r9.A04
                if (r0 == 0) goto L_0x0066
                long r3 = r9.A01
                long r1 = r9.A00
                r7 = 1
                long r1 = r1 + r7
                r9.A00 = r1
                r7 = 2
                int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r0 > 0) goto L_0x0073
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r0 >= 0) goto L_0x0073
            L_0x0066:
                X.1Wu r0 = X.C27621Wu.A00
            L_0x0068:
                if (r0 == r6) goto L_0x006c
                X.1Wu r0 = X.C27621Wu.A00
            L_0x006c:
                if (r0 == r6) goto L_0x0070
                X.1Wu r0 = X.C27621Wu.A00
            L_0x0070:
                if (r0 != r6) goto L_0x009a
                return r6
            L_0x0073:
                X.0wl r2 = r9.A0C
                r1 = 0
                com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMediaDownloaded$2 r0 = new com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMediaDownloaded$2
                r0.<init>(r9, r1)
                java.lang.Object r0 = X.C30451dy.A00(r10, r2, r0)
                if (r0 != r6) goto L_0x0066
                goto L_0x0068
            L_0x0082:
                java.lang.Object r2 = X.C18070vi.A0E(r0)
                X.71o r2 = (X.C1404771o) r2
                r1 = 0
                r0 = 10
                java.lang.Object r0 = r2.A02(r1, r10, r0)
                goto L_0x0068
            L_0x0090:
                r10.L$0 = r5
                r10.label = r4
                goto L_0x0045
            L_0x0095:
                java.lang.Object r5 = r10.L$0
                X.C30691eM.A01(r11)
            L_0x009a:
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this
                X.00H r0 = r0.A0O
                java.lang.Object r0 = r0.get()
                X.71o r0 = (X.C1404771o) r0
                X.0ve r2 = r0.A0A
                r1 = 7186(0x1c12, float:1.007E-41)
                X.0vf r0 = X.C18040vf.A02
                boolean r0 = X.C18020vd.A05(r0, r2, r1)
                if (r0 != 0) goto L_0x00bd
                com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel.this
                X.00H r0 = r0.A0O
                java.lang.Object r0 = r0.get()
                X.71o r0 = (X.C1404771o) r0
                X.C1404771o.A01(r0)
            L_0x00bd:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$fetchSticker$1$1(SearchFunStickersViewModel searchFunStickersViewModel, AnonymousClass77V r3, String str, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = searchFunStickersViewModel;
        this.$url = str;
        this.$batchId = i;
        this.$model = r3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new SearchFunStickersViewModel$fetchSticker$1$1(this.this$0, this.$model, this.$url, r8, this.$batchId);
    }

    public final Object invokeSuspend(Object obj) {
        List<Object> list;
        Object obj2;
        String str;
        Set set;
        Object obj3 = obj;
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final SearchFunStickersViewModel searchFunStickersViewModel = this.this$0;
            C18600wl r4 = searchFunStickersViewModel.A0S;
            final String str2 = this.$url;
            final int i2 = this.$batchId;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            obj3 = C30451dy.A00(this, r4, r0);
            if (obj3 == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass77V r02 = this.$model;
        SearchFunStickersViewModel searchFunStickersViewModel2 = this.this$0;
        C1418377d r8 = (C1418377d) obj3;
        String str3 = r02.A05;
        if (!(r8 == null || str3 == null)) {
            AnonymousClass6TG r2 = (AnonymousClass6TG) searchFunStickersViewModel2.A0A.A06();
            if (r2 instanceof AnonymousClass60L) {
                if (SearchFunStickersViewModel.A0C(searchFunStickersViewModel2)) {
                    list = C29431cG.A0t(searchFunStickersViewModel2.A05);
                } else {
                    list = ((AnonymousClass60L) r2).A01;
                }
                ArrayList A0D = C29351c6.A0D(list);
                for (Object obj4 : list) {
                    if (obj4 instanceof AnonymousClass60H) {
                        AnonymousClass60H r22 = (AnonymousClass60H) obj4;
                        AnonymousClass77V r72 = r22.A01;
                        if (str3.equals(r72.A05)) {
                            obj4 = new AnonymousClass60H(r72, r8, r22.A03, r22.A00, r22.A04);
                        }
                    }
                    A0D.add(obj4);
                }
                ArrayList A13 = AnonymousClass000.A13();
                for (Object next : A0D) {
                    if (next instanceof AnonymousClass60H) {
                        A13.add(next);
                    }
                }
                Iterator it = A13.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (C18070vi.A18(((AnonymousClass60H) obj2).A01.A05, str3)) {
                        break;
                    }
                }
                AnonymousClass60H r23 = (AnonymousClass60H) obj2;
                if (!(r23 == null || (str = searchFunStickersViewModel2.A03) == null)) {
                    C121646Ky r1 = searchFunStickersViewModel2.A0H;
                    String str4 = r23.A01.A06;
                    if (str4 != null) {
                        r1.A01.put(str4, r23);
                        Map map = r1.A00;
                        Object obj5 = map.get(str);
                        if (!C41681wt.A08(obj5) || (set = (Set) obj5) == null) {
                            set = C17880vN.A14();
                        }
                        set.add(str4);
                        map.put(str, set);
                    }
                }
                SearchFunStickersViewModel.A0B(searchFunStickersViewModel2, A0D);
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$fetchSticker$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
