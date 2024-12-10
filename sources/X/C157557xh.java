package X;

import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity;

/* renamed from: X.7xh  reason: invalid class name and case insensitive filesystem */
public final class C157557xh extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AvatarProfilePhotoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157557xh(AvatarProfilePhotoActivity avatarProfilePhotoActivity) {
        super(1);
        this.this$0 = avatarProfilePhotoActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r7.A04 != false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            X.6zp r7 = (X.C140026zp) r7
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = r6.this$0
            X.5kQ r1 = r0.A0B
            java.util.List r0 = r7.A02
            r1.A0W(r0)
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = r6.this$0
            X.5kQ r1 = r0.A0C
            java.util.List r0 = r7.A03
            r1.A0W(r0)
            X.5u4 r2 = r7.A00
            if (r2 == 0) goto L_0x0023
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = r6.this$0
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoImageView r1 = r0.A07
            if (r1 == 0) goto L_0x0023
            int r0 = r2.A00
            r1.setAvatarPoseBackgroundColor(r0)
        L_0x0023:
            X.5u1 r5 = r7.A01
            r4 = 0
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = r6.this$0
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoImageView r1 = r0.A07
            if (r5 == 0) goto L_0x00df
            if (r1 == 0) goto L_0x0033
            android.graphics.Bitmap r0 = r5.A01
            r1.setImageBitmap(r0)
        L_0x0033:
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = r6.this$0
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoImageView r3 = r0.A07
            if (r3 == 0) goto L_0x005e
            android.content.Context r2 = r3.getContext()
            if (r2 == 0) goto L_0x005b
            java.lang.String r1 = r5.A02
            if (r1 == 0) goto L_0x00d5
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00d5
            r4 = r1
        L_0x004a:
            r0 = 2131886862(0x7f12030e, float:1.9408315E38)
            java.lang.String r0 = X.C18070vi.A0F(r2, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = " - "
            java.lang.String r4 = X.AnonymousClass001.A1H(r0, r4, r1)
        L_0x005b:
            r3.setContentDescription(r4)
        L_0x005e:
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = r6.this$0
            android.view.MenuItem r2 = r0.A00
            r3 = 0
            if (r2 == 0) goto L_0x0072
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x006e
            boolean r1 = r7.A04
            r0 = 1
            if (r1 == 0) goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            r2.setEnabled(r0)
        L_0x0072:
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r2 = r6.this$0
            android.view.MenuItem r1 = r2.A00
            if (r1 == 0) goto L_0x0087
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x00d2
            X.0vl r0 = r2.A0E
        L_0x007e:
            java.lang.Object r0 = r0.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r1.setIcon(r0)
        L_0x0087:
            boolean r2 = r7.A06
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = r6.this$0
            X.1KB r1 = r0.A05
            if (r2 == 0) goto L_0x00ce
            r0 = 2131886866(0x7f120312, float:1.9408323E38)
            r1.A07(r3, r0)
        L_0x0095:
            boolean r1 = r7.A05
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = r6.this$0
            android.widget.ProgressBar r0 = r0.A04
            if (r1 == 0) goto L_0x00c1
            if (r0 == 0) goto L_0x00a2
            r0.setVisibility(r3)
        L_0x00a2:
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = r6.this$0
            com.facebook.shimmer.ShimmerFrameLayout r0 = r0.A06
            if (r0 == 0) goto L_0x00ab
            r0.A03()
        L_0x00ab:
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x00be
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = r6.this$0
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoErrorDialog r2 = new com.whatsapp.avatar.profilephoto.AvatarProfilePhotoErrorDialog
            r2.<init>()
            X.1GP r1 = r0.getSupportFragmentManager()
            r0 = 0
            X.C20098A7b.A03(r2, r1, r0)
        L_0x00be:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00c1:
            X.C72453Mb.A1D(r0)
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = r6.this$0
            com.facebook.shimmer.ShimmerFrameLayout r0 = r0.A06
            if (r0 == 0) goto L_0x00ab
            r0.A01()
            goto L_0x00ab
        L_0x00ce:
            r1.A04()
            goto L_0x0095
        L_0x00d2:
            X.0vl r0 = r2.A0D
            goto L_0x007e
        L_0x00d5:
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x004a
            java.lang.String r4 = X.AnonymousClass73J.A01(r2, r0)
            goto L_0x004a
        L_0x00df:
            if (r1 == 0) goto L_0x005e
            r1.setImageBitmap(r4)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157557xh.invoke(java.lang.Object):java.lang.Object");
    }
}
