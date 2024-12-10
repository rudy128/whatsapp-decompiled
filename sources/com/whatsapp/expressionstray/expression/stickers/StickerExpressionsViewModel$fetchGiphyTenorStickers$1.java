package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$fetchGiphyTenorStickers$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {649}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$fetchGiphyTenorStickers$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Set $filteredEmojis;
    public final /* synthetic */ List $localResults;
    public final /* synthetic */ String $searchText;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$fetchGiphyTenorStickers$1$1", f = "StickerExpressionsViewModel.kt", i = {0, 1, 2, 2, 3, 3, 3}, l = {652, 661, 664, 677, 687}, m = "invokeSuspend", n = {"startTime", "startTime", "stickersFromGiphyTenor", "startTime", "stickersFromGiphyTenor", "startTime", "queryCount"}, s = {"J$0", "J$0", "L$0", "J$0", "L$0", "J$0", "I$0"})
    /* renamed from: com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$fetchGiphyTenorStickers$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;

        public final C30391dr create(Object obj, C30391dr r8) {
            return new AnonymousClass1(str, list, set, r8);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00c3 A[Catch:{ CancellationException -> 0x00dd, Exception -> 0x00db }] */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
                r6 = r20
                int r0 = r6.label
                r5 = 5
                r4 = 4
                r3 = 3
                r2 = 2
                r15 = 0
                r9 = 1
                if (r0 == 0) goto L_0x003b
                if (r0 == r9) goto L_0x0038
                if (r0 == r2) goto L_0x0032
                if (r0 == r3) goto L_0x002b
                if (r0 == r4) goto L_0x001e
                if (r0 != r5) goto L_0x0130
                X.C30691eM.A01(r21)
            L_0x001b:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x001e:
                int r9 = r6.I$0
                long r12 = r6.J$0
                java.lang.Object r8 = r6.L$0
                java.util.List r8 = (java.util.List) r8
                X.C30691eM.A01(r21)     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00f0 }
                goto L_0x00d8
            L_0x002b:
                long r12 = r6.J$0
                java.lang.Object r8 = r6.L$0
                java.util.List r8 = (java.util.List) r8
                goto L_0x00aa
            L_0x0032:
                long r12 = r6.J$0
                X.C30691eM.A01(r21)     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00f0 }
                goto L_0x001b
            L_0x0038:
                long r12 = r6.J$0
                goto L_0x005d
            L_0x003b:
                X.C30691eM.A01(r21)
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this
                long r12 = java.lang.System.currentTimeMillis()
                X.6bn r0 = r0.A0C     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                X.0ve r8 = r0.A00     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                r1 = 5423(0x152f, float:7.599E-42)
                X.0vf r0 = X.C18040vf.A02     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                int r0 = X.C18020vd.A00(r0, r8, r1)     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                long r0 = (long) r0     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                r6.J$0 = r12     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                r6.label = r9     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                java.lang.Object r0 = X.C62882s9.A00(r6, r0)     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                if (r0 != r7) goto L_0x0060
                goto L_0x0135
            L_0x005d:
                X.C30691eM.A01(r21)     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
            L_0x0060:
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                X.00H r0 = r0.A0N     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                java.lang.Object r8 = r0.get()     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                X.72k r8 = (X.C1406572k) r8     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                java.lang.String r1 = r5     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                java.util.Set r0 = r7     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                boolean r11 = X.C18070vi.A15(r1, r0)     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                r8.A00 = r15     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                r8.A01 = r11     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                java.util.List r8 = X.C1406572k.A02(r8, r1, r15, r0)     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r9 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                if (r8 == 0) goto L_0x008d
                r14 = 1
                int r0 = r8.size()     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                long r0 = (long) r0     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                java.lang.Long r10 = new java.lang.Long     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                r10.<init>(r0)     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
            L_0x0089:
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.A0C(r9, r10, r11, r12, r14)     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                goto L_0x0090
            L_0x008d:
                r14 = 0
                r10 = r15
                goto L_0x0089
            L_0x0090:
                if (r8 == 0) goto L_0x00df
                boolean r0 = r8.isEmpty()     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                if (r0 != 0) goto L_0x00df
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r1 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                java.util.List r0 = r6     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                r6.L$0 = r8     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                r6.J$0 = r12     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                r6.label = r3     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                java.lang.Object r0 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.A08(r1, r0, r15, r8, r6)     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                if (r0 != r7) goto L_0x00ad
                goto L_0x0136
            L_0x00aa:
                X.C30691eM.A01(r21)     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00f0 }
            L_0x00ad:
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00f0 }
                r0.A02 = r8     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00f0 }
                r9 = 0
            L_0x00b2:
                int r1 = r8.size()     // Catch:{ CancellationException -> 0x00dd, Exception -> 0x00db }
                r0 = 40
                if (r1 >= r0) goto L_0x001b
                r0 = 6
                if (r9 >= r0) goto L_0x001b
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r3 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x00dd, Exception -> 0x00db }
                java.util.List r2 = r3.A02     // Catch:{ CancellationException -> 0x00dd, Exception -> 0x00db }
                if (r2 == 0) goto L_0x00d8
                java.util.List r1 = r6     // Catch:{ CancellationException -> 0x00dd, Exception -> 0x00db }
                java.lang.String r0 = r5     // Catch:{ CancellationException -> 0x00dd, Exception -> 0x00db }
                r6.L$0 = r8     // Catch:{ CancellationException -> 0x00dd, Exception -> 0x00db }
                r6.L$1 = r2     // Catch:{ CancellationException -> 0x00dd, Exception -> 0x00db }
                r6.J$0 = r12     // Catch:{ CancellationException -> 0x00dd, Exception -> 0x00db }
                r6.I$0 = r9     // Catch:{ CancellationException -> 0x00dd, Exception -> 0x00db }
                r6.label = r4     // Catch:{ CancellationException -> 0x00dd, Exception -> 0x00db }
                java.lang.Object r0 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.A06(r3, r0, r1, r2, r6)     // Catch:{ CancellationException -> 0x00dd, Exception -> 0x00db }
                if (r0 != r7) goto L_0x00d8
                goto L_0x0137
            L_0x00d8:
                int r9 = r9 + 1
                goto L_0x00b2
            L_0x00db:
                r2 = move-exception
                goto L_0x00f1
            L_0x00dd:
                r2 = move-exception
                goto L_0x0108
            L_0x00df:
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r3 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                java.util.List r1 = r6     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                X.0wS r0 = X.C18460wS.A00     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                r6.J$0 = r12     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                r6.label = r2     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                java.lang.Object r0 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.A08(r3, r1, r15, r0, r6)     // Catch:{ CancellationException -> 0x0107, Exception -> 0x00ee }
                goto L_0x012d
            L_0x00ee:
                r2 = move-exception
                goto L_0x00f1
            L_0x00f0:
                r2 = move-exception
            L_0x00f1:
                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                java.lang.String r0 = "StickerExpressionsViewModel/fetchGiphyTenorStickers/error = "
                X.C17900vP.A0X(r2, r0, r1)
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r14 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this
                r16 = 0
                r17 = r12
                r19 = r16
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.A0C(r14, r15, r16, r17, r19)
                goto L_0x001b
            L_0x0107:
                r2 = move-exception
            L_0x0108:
                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                java.lang.String r0 = "StickerExpressionsViewModel/fetchGiphyTenorStickers/cancel = "
                X.C17900vP.A0X(r2, r0, r1)
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this
                X.1G4 r0 = r0.A0l
                java.lang.Object r0 = r0.getValue()
                boolean r0 = r0 instanceof X.AnonymousClass609
                if (r0 == 0) goto L_0x001b
                com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel r2 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.this
                java.util.List r1 = r6
                X.0wS r0 = X.C18460wS.A00
                r6.L$0 = r15
                r6.L$1 = r15
                r6.label = r5
                java.lang.Object r0 = com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel.A08(r2, r1, r15, r0, r6)
            L_0x012d:
                if (r0 != r7) goto L_0x001b
                return r7
            L_0x0130:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            L_0x0135:
                return r7
            L_0x0136:
                return r7
            L_0x0137:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$fetchGiphyTenorStickers$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$fetchGiphyTenorStickers$1(StickerExpressionsViewModel stickerExpressionsViewModel, String str, List list, Set set, C30391dr r6) {
        super(2, r6);
        this.this$0 = stickerExpressionsViewModel;
        this.$searchText = str;
        this.$filteredEmojis = set;
        this.$localResults = list;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new StickerExpressionsViewModel$fetchGiphyTenorStickers$1(this.this$0, this.$searchText, this.$localResults, this.$filteredEmojis, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            C18600wl r0 = stickerExpressionsViewModel.A0g;
            final String str = this.$searchText;
            final Set set = this.$filteredEmojis;
            final List list = this.$localResults;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$fetchGiphyTenorStickers$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
