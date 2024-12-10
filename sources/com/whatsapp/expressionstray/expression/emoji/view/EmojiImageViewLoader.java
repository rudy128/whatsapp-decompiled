package com.whatsapp.expressionstray.expression.emoji.view;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass1KW;
import X.AnonymousClass1OB;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C108975cc;
import X.C134316qO;
import X.C135956t2;
import X.C150157kE;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C30391dr;
import X.C43271zX;
import X.C52162aT;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.concurrent.CancellationException;

public final class EmojiImageViewLoader {
    public final AnonymousClass1KW A00;
    public final C52162aT A01;
    public final AnonymousClass00H A02;
    public final HashMap A03 = C17880vN.A11();
    public final C18100vl A04 = AnonymousClass1DF.A01(new C150157kE(this));
    public final C18600wl A05;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C134666qx r14, com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader r15, X.C30391dr r16) {
        /*
            r3 = r16
            boolean r0 = r3 instanceof X.C147907Uy
            if (r0 == 0) goto L_0x011e
            r7 = r3
            X.7Uy r7 = (X.C147907Uy) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x011e
            int r2 = r2 - r1
            r7.label = r2
        L_0x0014:
            java.lang.Object r1 = r7.result
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r13 = 0
            r5 = 1
            if (r0 == 0) goto L_0x006b
            if (r0 != r5) goto L_0x0125
            int r4 = r7.I$0
            java.lang.Object r3 = r7.L$2
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r14 = r7.L$1
            X.6qx r14 = (X.C134666qx) r14
            java.lang.Object r15 = r7.L$0
            com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader r15 = (com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader) r15
            X.C30691eM.A01(r1)
        L_0x0031:
            int r1 = r3.size()
            java.util.List r0 = r14.A01
            int r0 = r0.size()
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r4 == 0) goto L_0x0044
            if (r0 == 0) goto L_0x0044
            r13 = 1
        L_0x0044:
            java.lang.Integer r0 = r14.A00
            if (r0 == 0) goto L_0x0065
            X.00H r4 = r15.A02
            X.6yw r3 = X.C108975cc.A0H(r4)
            int r2 = r0.intValue()
            r1 = 0
            java.lang.String r0 = "emoji_image_loader_load_batch_end"
            r3.A02(r2, r0, r1)
            if (r13 == 0) goto L_0x0068
            java.lang.Integer r1 = X.AnonymousClass00R.A00
        L_0x005c:
            java.lang.Object r0 = r4.get()
            X.6yw r0 = (X.C139496yw) r0
            r0.A01(r2, r1)
        L_0x0065:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0068:
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            goto L_0x005c
        L_0x006b:
            X.C30691eM.A01(r1)
            java.lang.Integer r1 = r14.A00
            if (r1 == 0) goto L_0x0082
            X.00H r0 = r15.A02
            X.6yw r3 = X.C108975cc.A0H(r0)
            int r2 = r1.intValue()
            r1 = 0
            java.lang.String r0 = "emoji_image_loader_load_batch_start"
            r3.A02(r2, r0, r1)
        L_0x0082:
            java.util.List r8 = r14.A01
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r8.iterator()
        L_0x008c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.6tJ r0 = (X.C136126tJ) r0
            X.6qO r1 = r0.A03
            java.lang.ref.WeakReference r0 = r0.A04
            android.view.View r0 = X.C108945cZ.A0O(r0)
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r0 = r0.getTag()
        L_0x00a7:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x008c
            r2.add(r3)
            goto L_0x008c
        L_0x00b1:
            r0 = 0
            goto L_0x00a7
        L_0x00b3:
            int r1 = r8.size()
            int r0 = r2.size()
            boolean r4 = X.AnonymousClass000.A1T(r1, r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r12 = r2.iterator()
        L_0x00c7:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r8 = r12.next()
            X.6tJ r8 = (X.C136126tJ) r8
            java.lang.ref.WeakReference r11 = r8.A04
            android.view.View r0 = X.C108945cZ.A0O(r11)
            if (r0 == 0) goto L_0x00c7
            X.1KW r10 = r15.A00
            android.content.res.Resources r9 = X.AnonymousClass3MX.A05(r0)
            long r0 = r8.A01
            X.1zX r2 = r8.A02
            android.graphics.drawable.BitmapDrawable r2 = r10.A07(r9, r2, r0)
            if (r2 == 0) goto L_0x00c7
            X.6qO r1 = r8.A03
            android.view.View r0 = X.C108945cZ.A0O(r11)
            if (r0 == 0) goto L_0x0103
            java.lang.Object r0 = r0.getTag()
        L_0x00f7:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00c7
            r8.A00 = r2
            r3.add(r8)
            goto L_0x00c7
        L_0x0103:
            r0 = 0
            goto L_0x00f7
        L_0x0105:
            X.0wl r2 = r15.A05
            r1 = 0
            com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader$loadEmojiIntoView$3 r0 = new com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader$loadEmojiIntoView$3
            r0.<init>(r3, r1)
            r7.L$0 = r15
            r7.L$1 = r14
            r7.L$2 = r3
            r7.I$0 = r4
            r7.label = r5
            java.lang.Object r0 = X.C30451dy.A00(r7, r2, r0)
            if (r0 != r6) goto L_0x0031
            return r6
        L_0x011e:
            X.7Uy r7 = new X.7Uy
            r7.<init>(r15, r3)
            goto L_0x0014
        L_0x0125:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader.A00(X.6qx, com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader, X.1dr):java.lang.Object");
    }

    public EmojiImageViewLoader(AnonymousClass1KW r2, C52162aT r3, AnonymousClass00H r4, C18600wl r5) {
        C18070vi.A0s(r2, r5, r4, r3);
        this.A00 = r2;
        this.A05 = r5;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final void A01(C43271zX r13, EmojiImageView emojiImageView, Integer num, long j) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("emoji_");
        long j2 = j;
        A10.append(j2);
        A10.append('/');
        C43271zX r6 = r13;
        C134316qO r7 = new C134316qO(C17890vO.A0V(r13, A10));
        if (!C18070vi.A18(emojiImageView.getTag(), r7)) {
            emojiImageView.A00((int[]) null, (Drawable) null);
        }
        emojiImageView.setTag(r7);
        HashMap hashMap = this.A03;
        AnonymousClass1OB r0 = (AnonymousClass1OB) hashMap.remove(r7);
        if (r0 != null) {
            r0.BEM((CancellationException) null);
        }
        C135956t2 r5 = new C135956t2(r6, r7, num, AnonymousClass3MW.A0z(emojiImageView), j2);
        if (num != null) {
            C108975cc.A0H(this.A02).A02(num.intValue(), "emoji_image_loader_launch", (String) null);
        }
        hashMap.put(r7, AnonymousClass3MY.A0s(new EmojiImageViewLoader$loadEmoji$job$1(r5, this, (C30391dr) null), (AnonymousClass1OX) this.A04.getValue()));
    }
}
