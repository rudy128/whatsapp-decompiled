package com.whatsapp.expressionstray.expression.emoji.data;

import X.AnonymousClass1OS;
import X.C130796k1;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.emoji.data.EmojiExpressionsDataSource$getEmojiItems$2", f = "EmojiExpressionsDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsDataSource$getEmojiItems$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isMediaComposer;
    public final /* synthetic */ Integer $qplInstanceKey;
    public int label;
    public final /* synthetic */ C130796k1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsDataSource$getEmojiItems$2(C130796k1 r2, Integer num, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = r2;
        this.$isMediaComposer = z;
        this.$qplInstanceKey = num;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new EmojiExpressionsDataSource$getEmojiItems$2(this.this$0, this.$qplInstanceKey, r6, this.$isMediaComposer);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02b5, code lost:
        if (r1 != 2131430347) goto L_0x02b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0225  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r9 = r22
            int r0 = r9.label
            if (r0 != 0) goto L_0x02de
            X.C30691eM.A01(r23)
            X.6k1 r0 = r9.this$0
            X.00H r0 = r0.A07
            int r4 = X.C139496yw.A00(r0)
            X.6k1 r0 = r9.this$0
            X.00H r0 = r0.A07
            X.6yw r1 = X.C108975cc.A0H(r0)
            r12 = 0
            java.lang.String r0 = "emoji_fetching_start"
            r1.A02(r4, r0, r12)
            X.6k1 r5 = r9.this$0
            boolean r0 = r9.$isMediaComposer
            if (r0 == 0) goto L_0x0052
            X.67s r1 = r5.A04
            r0 = 0
            java.util.ArrayList r0 = r1.A0D(r0)
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0034:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r1 = r2.next()
            X.8B0 r1 = (X.AnonymousClass8B0) r1
            boolean r0 = r1 instanceof X.AnonymousClass7JD
            if (r0 == 0) goto L_0x0034
            X.7JD r1 = (X.AnonymousClass7JD) r1
            if (r1 == 0) goto L_0x0034
            X.737 r0 = r1.A00
            if (r0 == 0) goto L_0x0034
            int[] r0 = r0.A00
            r10.add(r0)
            goto L_0x0034
        L_0x0052:
            X.00H r0 = r5.A08
            java.lang.Object r0 = r0.get()
            X.160 r0 = (X.AnonymousClass160) r0
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x0112
            X.67r r0 = r5.A01
            java.util.ArrayList r10 = r0.A05()
            X.C18070vi.A0b(r10)
        L_0x0069:
            boolean r0 = r10.isEmpty()
            r14 = 1
            r15 = r0 ^ 1
            X.6k1 r0 = r9.this$0
            X.00H r0 = r0.A07
            X.6yw r1 = X.C108975cc.A0H(r0)
            java.lang.String r0 = "load_emoji_pages_start"
            r1.A02(r4, r0, r12)
            X.6k1 r0 = r9.this$0
            X.0ve r0 = r0.A03
            X.C137786w1.A00(r0)
            r11 = 8
            int r11 = r11 + r15
            X.6k1 r0 = r9.this$0
            X.00H r0 = r0.A07
            X.6yw r1 = X.C108975cc.A0H(r0)
            java.lang.String r0 = "load_emoji_pages_end"
            r1.A02(r4, r0, r12)
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            if (r15 == 0) goto L_0x01ad
            X.6k1 r0 = r9.this$0
            X.00H r0 = r0.A07
            X.6yw r1 = X.C108975cc.A0H(r0)
            java.lang.String r0 = "load_recent_emojis_start"
            r1.A02(r4, r0, r12)
            X.6k1 r0 = r9.this$0
            X.00H r0 = r0.A08
            java.lang.Object r0 = r0.get()
            X.160 r0 = (X.AnonymousClass160) r0
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            boolean r13 = X.AnonymousClass000.A1Z(r1, r0)
            java.lang.String r6 = "recents"
            java.lang.String r3 = "frequents"
            r2 = r3
            if (r13 == 0) goto L_0x00c5
            r2 = r6
        L_0x00c5:
            r1 = 2131232258(0x7f080602, float:1.808062E38)
            r0 = 2131889719(0x7f120e37, float:1.941411E38)
            if (r13 == 0) goto L_0x00d0
            r0 = 2131889728(0x7f120e40, float:1.9414128E38)
        L_0x00d0:
            X.6sg r5 = new X.6sg
            r5.<init>(r1, r0, r2, r14)
            r8.add(r5)
            r1 = 2131889728(0x7f120e40, float:1.9414128E38)
            if (r13 != 0) goto L_0x00e1
            r6 = r3
            r1 = 2131889719(0x7f120e37, float:1.941411E38)
        L_0x00e1:
            X.5zv r0 = new X.5zv
            r0.<init>(r5, r6, r1)
            r7.add(r0)
            java.util.Iterator r3 = r10.iterator()
        L_0x00ed:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0196
            java.lang.Object r2 = r3.next()
            int[] r2 = (int[]) r2
            X.6k1 r0 = r9.this$0
            X.1KW r1 = r0.A02
            X.5zw r0 = new X.5zw
            r21 = r2
            r18 = r5
            r19 = r12
            r20 = r2
            r16 = r0
            r17 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            r7.add(r0)
            goto L_0x00ed
        L_0x0112:
            X.67q r0 = r5.A00
            java.util.List r0 = r0.A00()
            java.util.ArrayList r3 = X.C29351c6.A0E(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0120:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0138
            java.lang.Object r1 = r2.next()
            int[] r1 = (int[]) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            java.lang.String r0 = X.C137176v2.A01(r1)
            r3.add(r0)
            goto L_0x0120
        L_0x0138:
            java.util.ArrayList r6 = X.C29431cG.A0m(r3)
            X.67r r0 = r5.A01
            java.util.ArrayList r0 = r0.A05()
            java.util.Iterator r3 = r0.iterator()
        L_0x0146:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0173
            java.lang.Object r2 = r3.next()
            int[] r2 = (int[]) r2
            int r1 = r6.size()
            r0 = 36
            if (r1 >= r0) goto L_0x0173
            X.C72453Mb.A1S(r2)
            java.lang.String r1 = X.C137176v2.A01(r2)
            boolean r0 = X.AnonymousClass74I.A01(r2)
            if (r0 == 0) goto L_0x016f
            int[] r0 = X.AnonymousClass74I.A06(r2)
            java.lang.String r1 = X.C137176v2.A01(r0)
        L_0x016f:
            X.C108985cd.A1I(r1, r6)
            goto L_0x0146
        L_0x0173:
            java.util.ArrayList r10 = X.C29351c6.A0E(r6)
            java.util.Iterator r3 = r6.iterator()
        L_0x017b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.String r2 = X.C17880vN.A0v(r3)
            X.0vc r1 = r5.A05
            X.737 r0 = new X.737
            r0.<init>((java.lang.String) r2)
            X.737 r0 = X.C1409873v.A00(r0, r1)
            int[] r0 = r0.A00
            r10.add(r0)
            goto L_0x017b
        L_0x0196:
            X.6k1 r0 = r9.this$0
            X.00H r0 = r0.A07
            java.lang.Object r2 = r0.get()
            X.6yw r2 = (X.C139496yw) r2
            int r0 = r7.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "load_recent_emojis_end"
            r2.A02(r4, r0, r1)
        L_0x01ad:
            r10 = r15
        L_0x01ae:
            if (r10 >= r11) goto L_0x02bc
            X.6k1 r0 = r9.this$0
            X.00H r0 = r0.A07
            X.6yw r2 = X.C108975cc.A0H(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r6 = "load_emoji_section_"
            r1.append(r6)
            r1.append(r10)
            java.lang.String r0 = "_start"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r5 = 0
            r2.A02(r4, r0, r12)
            X.6k1 r0 = r9.this$0
            X.0ve r0 = r0.A03
            X.6h5[] r1 = X.C137786w1.A00(r0)
            int r0 = r10 - r15
            r12 = r1[r0]
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r3 = "page_"
            java.lang.String r2 = X.AnonymousClass001.A1I(r3, r0, r10)
            int r1 = r12.A00
            r0 = 2131430326(0x7f0b0bb6, float:1.848235E38)
            if (r1 == r0) goto L_0x02b7
            r0 = 2131430308(0x7f0b0ba4, float:1.8482313E38)
            if (r1 != r0) goto L_0x027d
            r14 = 2131232316(0x7f08063c, float:1.8080738E38)
        L_0x01f3:
            int r13 = r12.A02
            r0 = 0
            X.6sg r1 = new X.6sg
            r1.<init>(r14, r13, r2, r0)
            r8.add(r1)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r2 = X.AnonymousClass001.A1I(r3, r0, r10)
            X.5zv r0 = new X.5zv
            r0.<init>(r1, r2, r13)
            r7.add(r0)
            X.0vq r0 = r12.A03
            java.lang.Object r0 = r0.get()
            java.util.List r0 = (java.util.List) r0
            X.C18070vi.A0X(r0)
            X.6k1 r12 = r9.this$0
            java.util.Iterator r13 = r0.iterator()
        L_0x021f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0260
            java.lang.Object r0 = r13.next()
            X.737 r0 = (X.AnonymousClass737) r0
            int[] r3 = r0.A00
            r21 = r3
            boolean r0 = X.AnonymousClass74I.A02(r3)
            if (r0 == 0) goto L_0x0253
            X.0vc r0 = r12.A05
            int[] r21 = X.C1409873v.A05(r0, r3)
        L_0x023b:
            X.C18070vi.A0X(r21)
        L_0x023e:
            X.1KW r2 = r12.A02
            X.5zw r0 = new X.5zw
            r18 = r1
            r19 = r5
            r20 = r3
            r16 = r0
            r17 = r2
            r16.<init>(r17, r18, r19, r20, r21)
            r7.add(r0)
            goto L_0x021f
        L_0x0253:
            boolean r0 = X.AnonymousClass74I.A03(r3)
            if (r0 == 0) goto L_0x023e
            X.0vc r0 = r12.A05
            int[] r21 = X.C1409873v.A06(r0, r3)
            goto L_0x023b
        L_0x0260:
            X.6k1 r0 = r9.this$0
            X.00H r0 = r0.A07
            X.6yw r2 = X.C108975cc.A0H(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r6)
            r1.append(r10)
            java.lang.String r0 = "_end"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r12 = r5
            r2.A02(r4, r0, r5)
            int r10 = r10 + 1
            goto L_0x01ae
        L_0x027d:
            r0 = 2131430315(0x7f0b0bab, float:1.8482327E38)
            if (r1 != r0) goto L_0x0287
            r14 = 2131231879(0x7f080487, float:1.8079851E38)
            goto L_0x01f3
        L_0x0287:
            r0 = 2131430317(0x7f0b0bad, float:1.8482332E38)
            if (r1 != r0) goto L_0x0291
            r14 = 2131231880(0x7f080488, float:1.8079854E38)
            goto L_0x01f3
        L_0x0291:
            r0 = 2131430321(0x7f0b0bb1, float:1.848234E38)
            if (r1 != r0) goto L_0x029b
            r14 = 2131231881(0x7f080489, float:1.8079856E38)
            goto L_0x01f3
        L_0x029b:
            r0 = 2131430324(0x7f0b0bb4, float:1.8482346E38)
            if (r1 != r0) goto L_0x02a5
            r14 = 2131231882(0x7f08048a, float:1.8079858E38)
            goto L_0x01f3
        L_0x02a5:
            r0 = 2131430341(0x7f0b0bc5, float:1.848238E38)
            if (r1 != r0) goto L_0x02af
            r14 = 2131231883(0x7f08048b, float:1.807986E38)
            goto L_0x01f3
        L_0x02af:
            r0 = 2131430347(0x7f0b0bcb, float:1.8482392E38)
            r14 = 2131231859(0x7f080473, float:1.807981E38)
            if (r1 == r0) goto L_0x01f3
        L_0x02b7:
            r14 = 2131232115(0x7f080573, float:1.808033E38)
            goto L_0x01f3
        L_0x02bc:
            java.lang.Integer r0 = r9.$qplInstanceKey
            X.5zq r3 = new X.5zq
            r3.<init>(r0, r8, r7)
            X.6k1 r2 = r9.this$0
            X.00H r0 = r2.A07
            X.6yw r1 = X.C108975cc.A0H(r0)
            java.lang.String r0 = "emoji_fetching_end"
            r1.A02(r4, r0, r12)
            X.00H r0 = r2.A07
            java.lang.Object r1 = r0.get()
            X.6yw r1 = (X.C139496yw) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r1.A01(r4, r0)
            return r3
        L_0x02de:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.emoji.data.EmojiExpressionsDataSource$getEmojiItems$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiExpressionsDataSource$getEmojiItems$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
