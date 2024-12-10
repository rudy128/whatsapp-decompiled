package X;

import android.view.View;

/* renamed from: X.4qb  reason: invalid class name and case insensitive filesystem */
public class C98114qb implements AnonymousClass3M2 {
    public final int A00;
    public final Object A01;

    public C98114qb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public int BZK() {
        switch (this.A00) {
            case 0:
                return C88264Yz.A01(((C87804Xb) this.A01).A04, 36);
            case 2:
                return ((C78943ty) this.A01).A0M.A02().getWidth();
            case 3:
                return C88264Yz.A01(((View) this.A01).getContext(), 72);
            case 6:
                C79093uR r2 = (C79093uR) this.A01;
                int i = 72;
                if (r2.A0V) {
                    i = 100;
                }
                return C88264Yz.A01(r2.getContext(), i);
            case 7:
                return C88164Yo.A01(((AnonymousClass3uK) this.A01).A0L.A08);
            case 8:
                return C62762rw.A01(((C88644aH) this.A01).A0K.getContext(), 32.0f);
            case 9:
                C74253Zc r22 = (C74253Zc) this.A01;
                return r22.A0A.A0A.A0A(r22.A08.A0K.getContext());
            default:
                return ((View) this.A01).getResources().getDimensionPixelSize(2131166268);
        }
    }

    public /* synthetic */ void BuW() {
        switch (this.A00) {
            case 1:
            case 3:
            case 6:
            case 7:
                ((AnonymousClass3uL) this.A01).A2p();
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ee, code lost:
        if (r3.A0P != false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fa, code lost:
        if (r1 != null) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0132, code lost:
        if (r8 == null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0134, code lost:
        r1.setImageBitmap(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0137, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0138, code lost:
        r1.setImageResource(2131232615);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r0.setImageBitmap(r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CMa(android.graphics.Bitmap r8, android.view.View r9, X.AnonymousClass206 r10) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x01be;
                case 1: goto L_0x0189;
                case 2: goto L_0x0053;
                case 3: goto L_0x013f;
                case 4: goto L_0x012c;
                case 5: goto L_0x0123;
                case 6: goto L_0x002c;
                case 7: goto L_0x00c7;
                case 8: goto L_0x00a6;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r7.A01
            X.3Zc r2 = (X.C74253Zc) r2
            java.util.List r0 = X.C42011xT.A0I
            com.whatsapp.webpagepreview.WebPagePreviewView r6 = r2.A08
            com.whatsapp.components.button.ThumbnailButton r1 = r6.A0K
            r0 = 0
            r1.setVisibility(r0)
            if (r8 == 0) goto L_0x006a
            int r0 = r8.getHeight()
            if (r0 == 0) goto L_0x006a
            int r0 = r8.getWidth()
            if (r0 == 0) goto L_0x006a
            com.whatsapp.components.button.ThumbnailButton r0 = r6.A0K
            X.AnonymousClass3MW.A1R(r0)
            com.whatsapp.components.button.ThumbnailButton r0 = r6.A0K
        L_0x0028:
            r0.setImageBitmap(r8)
        L_0x002b:
            return
        L_0x002c:
            if (r8 == 0) goto L_0x01f9
            boolean r0 = r10 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x01f9
            X.21V r10 = (X.AnonymousClass21V) r10
            X.2rc r0 = X.AnonymousClass206.A00(r10)
            int r2 = r0.A08
            if (r2 == 0) goto L_0x004c
            int r1 = r0.A06
            if (r1 == 0) goto L_0x004c
            java.lang.Object r0 = r7.A01
            X.3uG r0 = (X.C79043uG) r0
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r0 = r0.A05
            r0.A04(r2, r1)
            X.AnonymousClass3MW.A1R(r0)
        L_0x004c:
            java.lang.Object r0 = r7.A01
            X.3uG r0 = (X.C79043uG) r0
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r0 = r0.A05
            goto L_0x0028
        L_0x0053:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            com.whatsapp.events.EventCoverImageView r9 = (com.whatsapp.events.EventCoverImageView) r9
            r9.setCoverImage(r8)
            if (r8 != 0) goto L_0x002b
            java.lang.Object r0 = r7.A01
            X.3ty r0 = (X.C78943ty) r0
            X.1bI r1 = r0.A0M
            r0 = 8
            r1.A04(r0)
            return
        L_0x006a:
            com.whatsapp.components.button.ThumbnailButton r5 = r6.A0K
            android.content.Context r4 = r5.getContext()
            r3 = 2131232044(0x7f08052c, float:1.8080186E38)
            com.whatsapp.gallery.LinksGalleryFragment r0 = r2.A0A
            android.content.Context r2 = r0.A1n()
            r1 = 2130972035(0x7f040d83, float:1.7552825E38)
            r0 = 2131103448(0x7f060ed8, float:1.7819362E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            X.AnonymousClass4aX.A0B(r4, r5, r3, r0)
            com.whatsapp.components.button.ThumbnailButton r1 = r6.A0K
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r1.setScaleType(r0)
            com.whatsapp.components.button.ThumbnailButton r0 = r6.A0K
            r1 = 1069547520(0x3fc00000, float:1.5)
            r0.setScaleY(r1)
            com.whatsapp.components.button.ThumbnailButton r0 = r6.A0K
            r0.setScaleX(r1)
            com.whatsapp.components.button.ThumbnailButton r2 = r6.A0K
            android.content.Context r1 = r2.getContext()
            r0 = 2131101845(0x7f060895, float:1.7816111E38)
            X.AnonymousClass3MX.A1A(r1, r2, r0)
            return
        L_0x00a6:
            java.lang.Object r0 = r7.A01
            X.4aH r0 = (X.C88644aH) r0
            if (r8 == 0) goto L_0x00be
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r0.A0K
            com.whatsapp.WaImageView r0 = r1.getFaviconThumbView()
            r0.setImageBitmap(r8)
            com.whatsapp.WaImageView r1 = r1.getFaviconThumbView()
            r0 = 0
        L_0x00ba:
            r1.setVisibility(r0)
            return
        L_0x00be:
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0K
            com.whatsapp.WaImageView r1 = r0.getFaviconThumbView()
            r0 = 8
            goto L_0x00ba
        L_0x00c7:
            r5 = 0
            if (r8 == 0) goto L_0x0102
            java.lang.Object r3 = r7.A01
            X.3uK r3 = (X.AnonymousClass3uK) r3
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r3)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r8)
            r3.setThumbnail(r0)
            X.21V r10 = (X.AnonymousClass21V) r10
            X.2rc r1 = r10.A02
            if (r1 == 0) goto L_0x00f6
            int r2 = r1.A08
            if (r2 <= 0) goto L_0x00f6
            boolean r0 = r3.A0P
            if (r0 == 0) goto L_0x00f6
        L_0x00e8:
            int r1 = r1.A06
            if (r1 <= 0) goto L_0x00fd
            boolean r0 = r3.A0P
            if (r0 == 0) goto L_0x00fd
        L_0x00f0:
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r0 = r3.A0L
            r0.A03(r2, r1, r5)
            return
        L_0x00f6:
            int r2 = r8.getWidth()
            if (r1 == 0) goto L_0x00fd
            goto L_0x00e8
        L_0x00fd:
            int r1 = r8.getHeight()
            goto L_0x00f0
        L_0x0102:
            java.lang.Object r4 = r7.A01
            X.3uK r4 = (X.AnonymousClass3uK) r4
            r4.A0D = r5
            android.content.Context r3 = r4.getContext()
            android.content.Context r2 = r4.getContext()
            r1 = 2130969324(0x7f0402ec, float:1.7547327E38)
            r0 = 2131100309(0x7f060295, float:1.7812996E38)
            int r1 = X.AnonymousClass3MZ.A02(r2, r3, r1, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r4.setThumbnail(r0)
            return
        L_0x0123:
            java.lang.Object r0 = r7.A01
            X.3uE r0 = (X.AnonymousClass3uE) r0
            android.widget.ImageView r1 = r0.getThumbView()
            goto L_0x0132
        L_0x012c:
            java.lang.Object r0 = r7.A01
            X.3uD r0 = (X.AnonymousClass3uD) r0
            android.widget.ImageView r1 = r0.A02
        L_0x0132:
            if (r8 == 0) goto L_0x0138
            r1.setImageBitmap(r8)
            return
        L_0x0138:
            r0 = 2131232615(0x7f080767, float:1.8081344E38)
            r1.setImageResource(r0)
            return
        L_0x013f:
            java.lang.Object r5 = r7.A01
            X.3u2 r5 = (X.C78983u2) r5
            if (r8 == 0) goto L_0x016c
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r3 = r5.A0E
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r5)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r8)
            r3.setImageDrawable(r0)
            int r2 = r8.getWidth()
            int r1 = r8.getHeight()
            int r0 = r5.A00
            if (r0 <= 0) goto L_0x0163
            int r0 = r5.A01
            if (r0 > 0) goto L_0x0167
        L_0x0163:
            r5.A00 = r1
            r5.A01 = r2
        L_0x0167:
            r0 = 0
            r3.A03(r2, r1, r0)
            return
        L_0x016c:
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r4 = r5.A0E
            android.content.Context r3 = r5.getContext()
            android.content.Context r2 = r5.getContext()
            r1 = 2130969324(0x7f0402ec, float:1.7547327E38)
            r0 = 2131100309(0x7f060295, float:1.7812996E38)
            int r1 = X.AnonymousClass3MZ.A02(r2, r3, r1, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r4.setImageDrawable(r0)
            return
        L_0x0189:
            if (r8 == 0) goto L_0x01b7
            boolean r0 = r9 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x01b7
            r1 = r9
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            X.21V r10 = (X.AnonymousClass21V) r10
            java.lang.String r0 = r10.A06
            if (r0 == 0) goto L_0x01b4
            boolean r0 = X.C26521Sl.A0e(r0)
            if (r0 == 0) goto L_0x01b4
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
        L_0x01a0:
            r1.setScaleType(r0)
            r1.setImageBitmap(r8)
            r1 = 0
            r9.setVisibility(r1)
            java.lang.Object r0 = r7.A01
            X.3tw r0 = (X.AnonymousClass3tw) r0
            android.view.View r9 = r0.A02
        L_0x01b0:
            r9.setVisibility(r1)
            return
        L_0x01b4:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            goto L_0x01a0
        L_0x01b7:
            r0 = 0
            r9.setTag(r0)
            r1 = 8
            goto L_0x01b0
        L_0x01be:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r8 == 0) goto L_0x01cd
            X.AnonymousClass3MW.A1R(r9)
            r9.setImageBitmap(r8)
            return
        L_0x01cd:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            r9.setScaleType(r0)
            java.lang.Object r0 = r7.A01
            X.4Xb r0 = (X.C87804Xb) r0
            android.content.Context r3 = r0.A04
            android.content.res.Resources r2 = r3.getResources()
            r1 = 2130970113(0x7f040601, float:1.7548927E38)
            r0 = 2131101227(0x7f06062b, float:1.7814858E38)
            X.C72463Mc.A0x(r3, r2, r9, r1, r0)
            r2 = 2131232196(0x7f0805c4, float:1.8080494E38)
            r1 = 2130970114(0x7f040602, float:1.7548929E38)
            r0 = 2131101228(0x7f06062c, float:1.781486E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A03(r3, r1, r0, r2)
            X.C18070vi.A0X(r0)
            r9.setImageDrawable(r0)
            return
        L_0x01f9:
            java.lang.Object r6 = r7.A01
            X.3uG r6 = (X.C79043uG) r6
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r5 = r6.A05
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            r5.setScaleType(r0)
            android.content.res.Resources r3 = r6.getResources()
            android.content.Context r2 = r6.getContext()
            r1 = 2130970113(0x7f040601, float:1.7548927E38)
            r0 = 2131101227(0x7f06062b, float:1.7814858E38)
            X.C72463Mc.A0x(r2, r3, r5, r1, r0)
            android.content.Context r4 = r6.getContext()
            r3 = 2131232196(0x7f0805c4, float:1.8080494E38)
            android.content.Context r2 = r6.getContext()
            r1 = 2130970114(0x7f040602, float:1.7548929E38)
            r0 = 2131101228(0x7f06062c, float:1.781486E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            X.AnonymousClass4aX.A0B(r4, r5, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98114qb.CMa(android.graphics.Bitmap, android.view.View, X.206):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        r1.setImageDrawable((android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0078, code lost:
        r1.setBackgroundColor(-7829368);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        r2.setImageDrawable(new android.graphics.drawable.ColorDrawable(-7829368));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CN4(android.view.View r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x0027;
                case 2: goto L_0x001f;
                case 3: goto L_0x0020;
                case 4: goto L_0x006e;
                case 5: goto L_0x0065;
                case 6: goto L_0x005e;
                case 7: goto L_0x004b;
                case 8: goto L_0x0046;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r3.A01
            X.3Zc r1 = (X.C74253Zc) r1
            java.util.List r0 = X.C42011xT.A0I
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r1.A08
            com.whatsapp.components.button.ThumbnailButton r0 = r1.A0K
            X.AnonymousClass3MW.A1R(r0)
            com.whatsapp.components.button.ThumbnailButton r2 = r1.A0K
        L_0x0014:
            r1 = -7829368(0xffffffffff888888, float:NaN)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r2.setImageDrawable(r0)
        L_0x001f:
            return
        L_0x0020:
            java.lang.Object r0 = r3.A01
            X.3u2 r0 = (X.C78983u2) r0
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r2 = r0.A0E
            goto L_0x0014
        L_0x0027:
            boolean r0 = r4 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x001f
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1 = -7829368(0xffffffffff888888, float:NaN)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r4.setImageDrawable(r0)
            r1 = 0
            r4.setVisibility(r1)
            java.lang.Object r0 = r3.A01
            X.3tw r0 = (X.AnonymousClass3tw) r0
            android.view.View r0 = r0.A02
            r0.setVisibility(r1)
            return
        L_0x0046:
            r0 = 4
            r4.setVisibility(r0)
            return
        L_0x004b:
            java.lang.Object r2 = r3.A01
            X.3uK r2 = (X.AnonymousClass3uK) r2
            r0 = 0
            r2.A0D = r0
            r1 = -7829368(0xffffffffff888888, float:NaN)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r2.setThumbnail(r0)
            return
        L_0x005e:
            java.lang.Object r0 = r3.A01
            X.3uG r0 = (X.C79043uG) r0
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r1 = r0.A05
            goto L_0x0078
        L_0x0065:
            java.lang.Object r0 = r3.A01
            X.3uE r0 = (X.AnonymousClass3uE) r0
            android.widget.ImageView r1 = r0.getThumbView()
            goto L_0x0074
        L_0x006e:
            java.lang.Object r0 = r3.A01
            X.3uD r0 = (X.AnonymousClass3uD) r0
            android.widget.ImageView r1 = r0.A02
        L_0x0074:
            r0 = 0
            r1.setImageDrawable(r0)
        L_0x0078:
            r0 = -7829368(0xffffffffff888888, float:NaN)
            r1.setBackgroundColor(r0)
            return
        L_0x007f:
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 0
            r4.setImageDrawable(r0)
            r0 = -7829368(0xffffffffff888888, float:NaN)
            r4.setBackgroundColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98114qb.CN4(android.view.View):void");
    }
}
