package com.whatsapp.profile;

import X.AGE;
import X.AnonymousClass009;
import X.AnonymousClass040;
import X.AnonymousClass1CM;
import X.AnonymousClass1FL;
import X.AnonymousClass1KB;
import X.AnonymousClass8BT;
import X.AnonymousClass8BW;
import X.C006002q;
import X.C006302u;
import X.C17880vN;
import X.C18030ve;
import X.C219217x;
import X.C24051Ir;
import android.content.Intent;
import android.os.Bundle;

public class CapturePhoto extends AnonymousClass1FL implements AnonymousClass009 {
    public AnonymousClass1KB A00;
    public C219217x A01;
    public C18030ve A02;
    public AnonymousClass1CM A03;
    public C006302u A04;
    public boolean A05;
    public final Object A06;
    public volatile C006002q A07;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (getIntent() != null && getIntent().getBooleanExtra("should_return_photo_source", false)) {
                if (intent == null) {
                    intent = C17880vN.A0A();
                }
                intent.putExtra("photo_source", 1);
            }
            setResult(i2, intent);
        } else if (i != 30) {
            super.onActivityResult(i, i2, intent);
            return;
        } else if (i2 == -1) {
            A00();
            return;
        }
        finish();
    }

    public final C006002q A2m() {
        if (this.A07 == null) {
            synchronized (this.A06) {
                if (this.A07 == null) {
                    this.A07 = new C006002q(this);
                }
            }
        }
        return this.A07;
    }

    public CapturePhoto(int i) {
        this.A06 = C17880vN.A0p();
        this.A05 = false;
        AGE.A00(this, 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r9.A01.A0G() != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r9 = this;
            boolean r0 = X.AnonymousClass112.A07()
            r2 = 0
            r4 = 1
            if (r0 != 0) goto L_0x0011
            X.17x r0 = r9.A01
            boolean r0 = r0.A0G()
            r5 = 1
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r5 = 0
        L_0x0012:
            X.17x r1 = r9.A01
            java.lang.String[] r0 = X.AnonymousClass73I.A01()
            int r0 = r1.A04(r0)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r1 = r0 ^ 1
            r3 = 30
            java.util.Map r0 = X.AnonymousClass74O.A00
            java.lang.Object r6 = X.AnonymousClass000.A0w(r0, r3)
            int[] r6 = (int[]) r6
            if (r6 != 0) goto L_0x0042
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RequestPermissionActivity/buildCameraProfileIntent/camera/storage/permissions/unexpected request code "
            X.C17900vP.A0i(r0, r1, r3)
        L_0x0037:
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "target_file_uri"
            android.os.Parcelable r3 = r1.getParcelableExtra(r0)
            goto L_0x00aa
        L_0x0042:
            r8 = 2
            r7 = 3
            if (r1 == 0) goto L_0x0079
            if (r5 == 0) goto L_0x0079
            X.6q5 r5 = new X.6q5
            r5.<init>(r9)
            int[] r1 = new int[r7]
            r0 = 2131231920(0x7f0804b0, float:1.8079935E38)
            r1[r2] = r0
            r0 = 2131231658(0x7f0803aa, float:1.8079403E38)
            r1[r4] = r0
            r0 = 2131232198(0x7f0805c6, float:1.8080498E38)
            r1[r8] = r0
            r5.A09 = r1
            java.lang.String[] r0 = X.AnonymousClass73I.A00()
            r5.A01(r0)
            r0 = r6[r2]
            r5.A02 = r0
            r0 = r6[r4]
            r5.A03 = r0
        L_0x006f:
            r5.A06 = r2
            android.content.Intent r0 = r5.A00()
        L_0x0075:
            r9.startActivityForResult(r0, r3)
            return
        L_0x0079:
            boolean r0 = X.AnonymousClass112.A07()
            if (r0 != 0) goto L_0x008a
            if (r5 == 0) goto L_0x008a
            r1 = r6[r8]
            r0 = r6[r7]
            android.content.Intent r0 = X.AnonymousClass74O.A03(r9, r1, r0, r2)
            goto L_0x0075
        L_0x008a:
            if (r1 == 0) goto L_0x0037
            X.6q5 r5 = new X.6q5
            r5.<init>(r9)
            r0 = 2131232198(0x7f0805c6, float:1.8080498E38)
            r5.A01 = r0
            r0 = 4
            r0 = r6[r0]
            r5.A02 = r0
            r0 = 5
            r0 = r6[r0]
            r5.A03 = r0
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.String r0 = "android.permission.CAMERA"
            r1[r2] = r0
            r5.A01(r1)
            goto L_0x006f
        L_0x00aa:
            java.lang.String r0 = "android.media.action.IMAGE_CAPTURE"
            android.content.Intent r1 = X.C108945cZ.A0G(r0)     // Catch:{ ActivityNotFoundException -> 0x00bf }
            java.lang.String r0 = "output"
            android.content.Intent r1 = r1.putExtra(r0, r3)     // Catch:{ ActivityNotFoundException -> 0x00bf }
            r0 = 2
            android.content.Intent r0 = r1.setFlags(r0)     // Catch:{ ActivityNotFoundException -> 0x00bf }
            r9.startActivityForResult(r0, r4)     // Catch:{ ActivityNotFoundException -> 0x00bf }
            return
        L_0x00bf:
            r1 = move-exception
            java.lang.String r0 = "capturephoto/start-activity "
            com.whatsapp.util.Log.e(r0, r1)
            X.1KB r1 = r9.A00
            r0 = 2131886448(0x7f120170, float:1.9407475E38)
            r1.A08(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.CapturePhoto.A00():void");
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A00(this, super.BQR());
    }

    public final Object generatedComponent() {
        return A2m().generatedComponent();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof AnonymousClass009) {
            C006302u A002 = A2m().A00();
            this.A04 = A002;
            AnonymousClass8BW.A14(this, A002);
        }
        setTitle(2131887939);
        if (getCallingPackage() == null || !getCallingPackage().equals(getPackageName())) {
            finish();
        } else if (bundle == null) {
            A00();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass8BT.A1L(this.A04);
    }

    public CapturePhoto() {
        this(0);
    }
}
