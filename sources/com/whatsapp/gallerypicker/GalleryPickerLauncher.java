package com.whatsapp.gallerypicker;

import X.AGB;
import X.AnonymousClass009;
import X.AnonymousClass00R;
import X.AnonymousClass040;
import X.AnonymousClass1FL;
import X.AnonymousClass74O;
import X.AnonymousClass8BT;
import X.AnonymousClass8BW;
import X.C006002q;
import X.C006302u;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C219217x;
import X.C24051Ir;
import X.C27071Up;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public final class GalleryPickerLauncher extends AnonymousClass1FL implements AnonymousClass009 {
    public C219217x A00;
    public C18030ve A01;
    public C27071Up A02;
    public C006302u A03;
    public boolean A04;
    public final Object A05;
    public volatile C006002q A06;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r0.A05() != X.AnonymousClass00R.A01) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == r3) goto L_0x002d
            r0 = 151(0x97, float:2.12E-43)
            if (r5 == r0) goto L_0x000b
            super.onActivityResult(r5, r6, r7)
            return
        L_0x000b:
            r0 = -1
            if (r6 == r0) goto L_0x0022
            boolean r0 = X.AnonymousClass112.A0A()
            if (r0 == 0) goto L_0x004b
            if (r6 != 0) goto L_0x004b
            X.17x r0 = r4.A00
            if (r0 == 0) goto L_0x0026
            java.lang.Integer r1 = r0.A05()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x004b
        L_0x0022:
            r4.A00()
            return
        L_0x0026:
            java.lang.String r0 = "waPermissionsHelper"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x002d:
            android.content.Intent r1 = r4.getIntent()
            r2 = 0
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = "should_return_photo_source"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 != r3) goto L_0x004f
            if (r7 != 0) goto L_0x0042
            android.content.Intent r7 = X.C17880vN.A0A()
        L_0x0042:
            java.lang.String r1 = "photo_source"
            r0 = 2
            r7.putExtra(r1, r0)
            r4.setResult(r6, r7)
        L_0x004b:
            r4.finish()
            return
        L_0x004f:
            r4.setResult(r6, r7)
            if (r7 == 0) goto L_0x004b
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "chat_jid"
            X.AnonymousClass8BS.A13(r1, r7, r0)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "is_using_global_wallpaper"
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r7.putExtra(r1, r0)
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.GalleryPickerLauncher.onActivityResult(int, int, android.content.Intent):void");
    }

    private final void A00() {
        String str;
        Integer num;
        String str2;
        C219217x r0 = this.A00;
        if (r0 == null) {
            str = "waPermissionsHelper";
        } else if (r0.A05() != AnonymousClass00R.A01) {
            int intExtra = getIntent().getIntExtra("max_items", 1);
            boolean booleanExtra = getIntent().getBooleanExtra("skip_max_items_new_limit", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("is_in_multi_select_mode_only", false);
            int intExtra2 = getIntent().getIntExtra("media_sharing_user_journey_origin", -1);
            int intExtra3 = getIntent().getIntExtra("media_sharing_user_journey_chat_type", -1);
            Intent intent = getIntent();
            if (intent != null) {
                num = Integer.valueOf(intent.getIntExtra("photo_update_surface_type", -1));
            } else {
                num = null;
            }
            C27071Up r02 = this.A02;
            if (r02 != null) {
                Uri fromFile = Uri.fromFile(r02.A01.A0a("tmpi"));
                C18030ve r2 = this.A01;
                if (r2 != null) {
                    boolean A052 = C18020vd.A05(C18040vf.A02, r2, 7951);
                    Integer valueOf = Integer.valueOf(intExtra3);
                    Intent A0A = C17880vN.A0A();
                    String packageName = getPackageName();
                    if (A052) {
                        str2 = "com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity";
                    } else {
                        str2 = "com.whatsapp.gallerypicker.GalleryPicker";
                    }
                    A0A.setClassName(packageName, str2);
                    A0A.putExtra("include_media", 1);
                    A0A.putExtra("max_items", intExtra);
                    A0A.putExtra("skip_max_items_new_limit", booleanExtra);
                    A0A.putExtra("is_in_multi_select_mode_only", booleanExtra2);
                    A0A.putExtra("preview", false);
                    A0A.putExtra("output", fromFile);
                    A0A.putExtra("media_sharing_user_journey_origin", intExtra2);
                    A0A.putExtra("photo_update_surface_type", num);
                    if (valueOf != null) {
                        A0A.putExtra("media_sharing_user_journey_start_target", valueOf);
                    }
                    startActivityForResult(A0A, 1);
                    return;
                }
                str = "abProps";
            } else {
                str = "profilePhotoUpdater";
            }
        } else {
            AnonymousClass74O.A07(this, 151);
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public final C006002q A2m() {
        if (this.A06 == null) {
            synchronized (this.A05) {
                if (this.A06 == null) {
                    this.A06 = new C006002q(this);
                }
            }
        }
        return this.A06;
    }

    public GalleryPickerLauncher(int i) {
        this.A05 = C17880vN.A0p();
        this.A04 = false;
        AGB.A00(this, 41);
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
            this.A03 = A002;
            AnonymousClass8BW.A14(this, A002);
        }
        setTitle(2131890611);
        if (bundle == null) {
            A00();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass8BT.A1L(this.A03);
    }

    public GalleryPickerLauncher() {
        this(0);
    }
}
