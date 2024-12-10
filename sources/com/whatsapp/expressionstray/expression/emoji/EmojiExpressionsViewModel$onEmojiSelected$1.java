package com.whatsapp.expressionstray.expression.emoji;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel$onEmojiSelected$1", f = "EmojiExpressionsViewModel.kt", i = {}, l = {359, 373, 384, 409}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsViewModel$onEmojiSelected$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int[] $emoji;
    public final /* synthetic */ int $position;
    public int label;
    public final /* synthetic */ EmojiExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsViewModel$onEmojiSelected$1(EmojiExpressionsViewModel emojiExpressionsViewModel, C30391dr r3, int[] iArr, int i) {
        super(2, r3);
        this.$emoji = iArr;
        this.this$0 = emojiExpressionsViewModel;
        this.$position = i;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new EmojiExpressionsViewModel$onEmojiSelected$1(this.this$0, r6, this.$emoji, this.$position);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0137 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r7 = 3
            r3 = 2
            r5 = 4
            r4 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 == r4) goto L_0x002f
            if (r0 == r3) goto L_0x002f
            if (r0 == r7) goto L_0x002f
            if (r0 != r5) goto L_0x0140
            X.C30691eM.A01(r9)
        L_0x0015:
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r1 = r8.this$0
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x001d
            r5 = 11
        L_0x001d:
            X.00H r0 = r1.A0A
            X.A59 r1 = X.C108945cZ.A0e(r0)
            r0 = 17
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            r1.A03(r0, r4, r5)
        L_0x002c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002f:
            X.C30691eM.A01(r9)
            goto L_0x002c
        L_0x0033:
            X.C30691eM.A01(r9)
            int[] r0 = r8.$emoji
            boolean r0 = X.AnonymousClass74I.A02(r0)
            if (r0 == 0) goto L_0x006a
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.0vc r1 = r0.A07
            int[] r2 = r8.$emoji
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r1.A05(r0)
            java.lang.String r0 = X.C1409873v.A01(r2)
            boolean r1 = r1.contains(r0)
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            if (r1 != 0) goto L_0x00cb
            X.5bm r5 = r0.A00
            int[] r1 = r8.$emoji
            int r0 = r8.$position
            X.5zg r2 = new X.5zg
            r2.<init>(r1, r0)
            r8.label = r4
        L_0x0063:
            java.lang.Object r0 = r5.CHH(r2, r8)
        L_0x0067:
            if (r0 != r6) goto L_0x002c
            return r6
        L_0x006a:
            int[] r0 = r8.$emoji
            boolean r0 = X.AnonymousClass74I.A03(r0)
            if (r0 == 0) goto L_0x00d2
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.0z4 r0 = r0.A03
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "skin_emoji_tip"
            int r2 = X.C17890vO.A00(r1, r0)
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            if (r2 >= r4) goto L_0x009b
            X.0z4 r1 = r0.A03
            int r0 = r2 + 1
            r1.A1J(r0)
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.5bm r5 = r0.A00
            int[] r1 = r8.$emoji
            int r0 = r8.$position
            X.5zi r2 = new X.5zi
            r2.<init>(r1, r0)
            r8.label = r3
            goto L_0x0063
        L_0x009b:
            X.0vc r1 = r0.A07
            int[] r2 = r8.$emoji
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r1.A05(r0)
            java.lang.String r0 = X.C1409873v.A02(r2)
            boolean r1 = r1.contains(r0)
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            if (r1 != 0) goto L_0x00c3
            X.5bm r3 = r0.A00
            int[] r2 = r8.$emoji
            int r1 = r8.$position
            X.5zh r0 = new X.5zh
            r0.<init>(r2, r1)
            r8.label = r7
            java.lang.Object r0 = r3.CHH(r0, r8)
            goto L_0x0067
        L_0x00c3:
            X.0vc r1 = r0.A07
            int[] r0 = r8.$emoji
            X.C1409873v.A04(r1, r0)
            goto L_0x00d2
        L_0x00cb:
            X.0vc r1 = r0.A07
            int[] r0 = r8.$emoji
            X.C1409873v.A03(r1, r0)
        L_0x00d2:
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r1 = r8.this$0
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0114
            X.00H r0 = r1.A0C
            java.lang.Object r0 = r0.get()
            X.160 r0 = (X.AnonymousClass160) r0
            java.lang.Integer r2 = r0.A00
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            if (r2 != r1) goto L_0x0138
            X.0ve r2 = r0.A06
            r1 = 11728(0x2dd0, float:1.6434E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x010b
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.00H r0 = r0.A0C
            java.lang.Object r0 = r0.get()
            X.160 r0 = (X.AnonymousClass160) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x010b
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.67q r1 = r0.A04
            int[] r0 = r8.$emoji
            r1.A01(r0)
        L_0x010b:
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.67r r1 = r0.A05
            int[] r0 = r8.$emoji
            r1.A0A(r0)
        L_0x0114:
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.00H r0 = r0.A0E
            java.lang.Object r0 = r0.get()
            X.6bq r0 = (X.C125886bq) r0
            X.1G3 r3 = r0.A00
            int[] r2 = r8.$emoji
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r8.this$0
            X.00H r0 = r0.A08
            X.1BI r1 = X.C137836w6.A00(r0)
            X.5zJ r0 = new X.5zJ
            r0.<init>(r1, r2)
            r8.label = r5
            java.lang.Object r0 = r3.BJt(r0, r8)
            if (r0 != r6) goto L_0x0015
            return r6
        L_0x0138:
            X.67q r1 = r0.A04
            int[] r0 = r8.$emoji
            r1.A01(r0)
            goto L_0x0114
        L_0x0140:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel$onEmojiSelected$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiExpressionsViewModel$onEmojiSelected$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
