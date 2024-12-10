package X;

import android.widget.TextView;

/* renamed from: X.79Y  reason: invalid class name */
public class AnonymousClass79Y implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass79Y(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        if (r0 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b8, code lost:
        if (X.C18070vi.A18(r0, r2) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ba, code lost:
        com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet.A0A(r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d3, code lost:
        if ((r1 instanceof X.AnonymousClass60M) != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d8, code lost:
        com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet.A02(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onEditorAction(android.widget.TextView r6, int r7, android.view.KeyEvent r8) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x0059;
                case 2: goto L_0x0048;
                case 3: goto L_0x002b;
                case 4: goto L_0x0020;
                case 5: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r5.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r1 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r1
            r0 = 4
            if (r7 != r0) goto L_0x00dd
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0D(r1)
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment.A0C(r1)
        L_0x0012:
            r4 = 1
        L_0x0013:
            return r4
        L_0x0014:
            java.lang.Object r2 = r5.A01
            com.whatsapp.status.playback.MessageReplyActivity r2 = (com.whatsapp.status.playback.MessageReplyActivity) r2
            r1 = 4
            r0 = 0
            if (r7 != r1) goto L_0x00dd
            com.whatsapp.status.playback.MessageReplyActivity.A13(r2, r0)
            goto L_0x0012
        L_0x0020:
            java.lang.Object r1 = r5.A01
            com.whatsapp.notification.PopupNotification r1 = (com.whatsapp.notification.PopupNotification) r1
            r0 = 4
            if (r7 != r0) goto L_0x00dd
            com.whatsapp.notification.PopupNotification.A0q(r1)
            goto L_0x0012
        L_0x002b:
            java.lang.Object r2 = r5.A01
            X.8BD r2 = (X.AnonymousClass8BD) r2
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            r0 = 6
            if (r7 != r0) goto L_0x00dd
            java.lang.String r1 = X.AnonymousClass3Ma.A13(r6)
            X.7JH r2 = (X.AnonymousClass7JH) r2
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.6jM r0 = r2.A04
            r0.A04 = r1
            r2.dismiss()
            goto L_0x0012
        L_0x0048:
            java.lang.Object r2 = r5.A01
            X.6jr r2 = (X.C130696jr) r2
            if (r8 == 0) goto L_0x00dd
            int r1 = r8.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x00dd
            com.whatsapp.mentions.MentionableEntry r0 = r2.A07
            goto L_0x0064
        L_0x0059:
            java.lang.Object r1 = r5.A01
            com.whatsapp.gifsearch.GifSearchContainer r1 = (com.whatsapp.gifsearch.GifSearchContainer) r1
            r0 = 3
            if (r7 != r0) goto L_0x00dd
            com.whatsapp.WaEditText r0 = r1.A06
            if (r0 == 0) goto L_0x0012
        L_0x0064:
            r0.A0H()
            goto L_0x0012
        L_0x0068:
            java.lang.Object r3 = r5.A01
            com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet r3 = (com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet) r3
            com.whatsapp.WaEditText r0 = r3.A0A
            r1 = 0
            if (r0 == 0) goto L_0x007b
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x007b
            java.lang.String r1 = r0.toString()
        L_0x007b:
            r0 = 2
            r4 = 0
            if (r7 != r0) goto L_0x0013
            boolean r0 = com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet.A0C(r1)
            if (r0 == 0) goto L_0x0013
            com.whatsapp.WaEditText r0 = r3.A0A
            if (r0 == 0) goto L_0x008c
            r0.A0H()
        L_0x008c:
            com.whatsapp.WaEditText r0 = r3.A0A
            if (r0 == 0) goto L_0x00d6
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x00d6
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x00d6
            java.lang.String r2 = X.AnonymousClass1YF.A0I(r0)
        L_0x00a0:
            com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = X.C108955ca.A0Q(r3)
            X.1DT r0 = r0.A0A
            java.lang.Object r1 = r0.A06()
            X.6TG r1 = (X.AnonymousClass6TG) r1
            boolean r0 = r1 instanceof X.AnonymousClass60J
            if (r0 == 0) goto L_0x00bf
            X.60J r1 = (X.AnonymousClass60J) r1
            java.lang.String r0 = r1.A00
        L_0x00b4:
            boolean r0 = X.C18070vi.A18(r0, r2)
            if (r0 != 0) goto L_0x00d8
        L_0x00ba:
            com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet.A0A(r3, r4)
            goto L_0x0012
        L_0x00bf:
            boolean r0 = r1 instanceof X.AnonymousClass60K
            if (r0 == 0) goto L_0x00c8
            X.60K r1 = (X.AnonymousClass60K) r1
            java.lang.String r0 = r1.A01
            goto L_0x00b4
        L_0x00c8:
            boolean r0 = r1 instanceof X.AnonymousClass60L
            if (r0 == 0) goto L_0x00d1
            X.60L r1 = (X.AnonymousClass60L) r1
            java.lang.String r0 = r1.A00
            goto L_0x00b4
        L_0x00d1:
            boolean r0 = r1 instanceof X.AnonymousClass60M
            if (r0 == 0) goto L_0x00d8
            goto L_0x00ba
        L_0x00d6:
            r2 = 0
            goto L_0x00a0
        L_0x00d8:
            com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet.A02(r3)
            goto L_0x0012
        L_0x00dd:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass79Y.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
    }
}
