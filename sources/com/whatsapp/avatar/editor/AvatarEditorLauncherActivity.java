package com.whatsapp.avatar.editor;

import X.AnonymousClass00H;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass73V;
import X.AnonymousClass7A4;
import X.C108955ca;
import X.C114825s3;
import X.C132586n5;
import X.C18070vi;
import X.C24089BvH;
import X.C24997CSx;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.avatar.prefetch.AvatarPrefetchController;

public final class AvatarEditorLauncherActivity extends C114825s3 {
    public C24997CSx A00;
    public AvatarPrefetchController A01;
    public C132586n5 A02;
    public AnonymousClass00H A03;

    public void Bjo(String str) {
        C18070vi.A0d(str, 0);
        if (str.equals("launcher_error_dialog_tag")) {
            A03(this);
        }
    }

    public static final void A03(AvatarEditorLauncherActivity avatarEditorLauncherActivity) {
        avatarEditorLauncherActivity.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            avatarEditorLauncherActivity.overrideActivityTransition(0, 0, 0);
        } else {
            avatarEditorLauncherActivity.overridePendingTransition(0, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        getWindow().setStatusBarColor(C108955ca.A01(this));
        Bundle A09 = AnonymousClass3MY.A09(this);
        String str3 = null;
        if (A09 != null) {
            str = A09.getString("origin");
        } else {
            str = null;
        }
        Bundle A092 = AnonymousClass3MY.A09(this);
        if (A092 != null) {
            str3 = A092.getString("deeplink");
        }
        if (str == null) {
            A03(this);
            return;
        }
        getSupportFragmentManager().A0Z.add(new AnonymousClass7A4(this, 0));
        C132586n5 r0 = this.A02;
        if (r0 != null) {
            r0.A00(this);
            AnonymousClass00H r02 = this.A03;
            if (r02 != null) {
                ((AnonymousClass73V) C18070vi.A0E(r02)).A05(str, str3, AnonymousClass3MW.A0z(this));
                return;
            }
            str2 = "avatarEditorLauncher";
        } else {
            str2 = "avatarPrefetchInvoker";
        }
        C18070vi.A11(str2);
        throw null;
    }

    public void onDestroy() {
        String str;
        super.onDestroy();
        C24997CSx cSx = this.A00;
        if (cSx != null) {
            cSx.A00 = C24089BvH.A00;
            AvatarPrefetchController avatarPrefetchController = this.A01;
            if (avatarPrefetchController != null) {
                avatarPrefetchController.A02();
                return;
            }
            str = "avatarPrefetchController";
        } else {
            str = "avatarUserFlowStateReducer";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void CBt(String str) {
        A03(this);
    }
}
