package X;

import android.content.DialogInterface;

/* renamed from: X.4an  reason: invalid class name and case insensitive filesystem */
public class C88794an implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;

    public C88794an(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        r1.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        X.AnonymousClass4Yv.A00(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCancel(android.content.DialogInterface r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x00a6;
                case 1: goto L_0x0099;
                case 2: goto L_0x0091;
                case 3: goto L_0x007d;
                case 4: goto L_0x006c;
                case 5: goto L_0x003b;
                case 6: goto L_0x0033;
                case 7: goto L_0x002a;
                case 8: goto L_0x005d;
                case 9: goto L_0x0054;
                case 10: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 13
        L_0x000b:
            X.AnonymousClass4Yv.A00(r1, r0)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r3 = r4.A01
            X.49h r3 = (X.C826749h) r3
            android.app.ProgressDialog r0 = r3.A00
            if (r0 == 0) goto L_0x001a
            r0.dismiss()
        L_0x001a:
            r2 = 0
            r3.A00 = r2
            r0 = 1
            r3.A0B(r0)
            com.whatsapp.profile.WebImagePicker r1 = r3.A02
            X.49h r0 = r1.A0C
            if (r0 != r3) goto L_0x000e
            r1.A0C = r2
            return
        L_0x002a:
            java.lang.Object r0 = r4.A01
            X.3cR r0 = (X.C74763cR) r0
            android.app.Activity r1 = r0.A00
            int r0 = r0.A08
            goto L_0x000b
        L_0x0033:
            java.lang.Object r0 = r4.A01
            X.DOe r0 = (X.C26982DOe) r0
            android.app.Activity r1 = r0.A02
            r0 = 1
            goto L_0x000b
        L_0x003b:
            java.lang.Object r2 = r4.A01
            X.4Zt r2 = (X.C88454Zt) r2
            X.C88454Zt.A02(r2)
            X.4lo r0 = r2.A01
            if (r0 == 0) goto L_0x004c
            X.9BS r1 = r0.A02
            r0 = 1
            r1.A0B(r0)
        L_0x004c:
            X.4lo r1 = r2.A01
            if (r1 == 0) goto L_0x000e
            r0 = 0
            r1.A00 = r0
            return
        L_0x0054:
            java.lang.Object r1 = r4.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            goto L_0x0068
        L_0x005d:
            java.lang.Object r1 = r4.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r5.dismiss()
        L_0x0068:
            r1.finish()
            return
        L_0x006c:
            java.lang.Object r0 = r4.A01
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoErrorDialog r0 = (com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoErrorDialog) r0
            X.0vl r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel r0 = (com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel) r0
            X.1wy r1 = r0.A04
            X.6Qo r0 = X.C122486Qo.CLOSE_SCREEN
            goto L_0x008d
        L_0x007d:
            java.lang.Object r0 = r4.A01
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoErrorDialog r0 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoErrorDialog) r0
            X.0vl r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r0 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r0
            X.1wy r1 = r0.A04
            X.6Qe r0 = X.C122416Qe.CLOSE_SCREEN
        L_0x008d:
            r1.A0F(r0)
            return
        L_0x0091:
            java.lang.Object r0 = r4.A01
            X.5Ya r0 = (X.C107005Ya) r0
            r0.C31()
            return
        L_0x0099:
            java.lang.Object r0 = r4.A01
            X.AnonymousClass3MW.A1U(r0)
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return
        L_0x00a6:
            java.lang.Object r0 = r4.A01
            X.5ag r0 = (X.C107825ag) r0
            r0.C31()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88794an.onCancel(android.content.DialogInterface):void");
    }
}
