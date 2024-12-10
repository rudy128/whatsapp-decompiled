package X;

import android.os.Bundle;
import android.view.View;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.chatinfo.Hilt_ChatMediaVisibilityDialog;
import com.whatsapp.chatinfo.Hilt_ChatMediaVisibilityOffDialog;

/* renamed from: X.4SE  reason: invalid class name */
public final class AnonymousClass4SE {
    public final C31191fA A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass1CJ A02;
    public final AnonymousClass1BI A03;
    public final View A04;
    public final AnonymousClass1FY A05;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.chatinfo.ChatMediaVisibilityDialog, androidx.fragment.app.Fragment, com.whatsapp.chatinfo.Hilt_ChatMediaVisibilityDialog] */
    public final void A00() {
        int i;
        Hilt_ChatMediaVisibilityOffDialog hilt_ChatMediaVisibilityOffDialog;
        C29691ci A0A;
        if (!this.A00.A0L() || (A0A = this.A02.A0A(this.A03)) == null || !A0A.A0m) {
            AnonymousClass1BI r3 = this.A03;
            if (C43391zj.A00(this.A01, this.A02, r3) > 0) {
                i = 0;
            } else {
                C84784Kv r0 = new C84784Kv(this);
                C17960vV.A07(r3);
                ? hilt_ChatMediaVisibilityDialog = new Hilt_ChatMediaVisibilityDialog();
                hilt_ChatMediaVisibilityDialog.A02 = r0;
                C72463Mc.A11(C17880vN.A0D(), hilt_ChatMediaVisibilityDialog, r3, "chatJid");
                hilt_ChatMediaVisibilityOffDialog = hilt_ChatMediaVisibilityDialog;
                this.A05.CMl(hilt_ChatMediaVisibilityOffDialog);
            }
        } else {
            i = 1;
        }
        Hilt_ChatMediaVisibilityOffDialog hilt_ChatMediaVisibilityOffDialog2 = new Hilt_ChatMediaVisibilityOffDialog();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("reason", i);
        hilt_ChatMediaVisibilityOffDialog2.A1R(A0D);
        hilt_ChatMediaVisibilityOffDialog = hilt_ChatMediaVisibilityOffDialog2;
        this.A05.CMl(hilt_ChatMediaVisibilityOffDialog);
    }

    public AnonymousClass4SE(View view, AnonymousClass1FY r3, C31191fA r4, AnonymousClass1M9 r5, AnonymousClass1CJ r6, AnonymousClass1BI r7) {
        C18070vi.A0w(r4, r6, r5, r7, view);
        C18070vi.A0d(r3, 6);
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = r5;
        this.A03 = r7;
        this.A04 = view;
        this.A05 = r3;
    }

    public final void A01(int i) {
        boolean z;
        C29691ci A0A;
        int i2 = 2131891946;
        AnonymousClass1BI r2 = this.A03;
        AnonymousClass1CJ r1 = this.A02;
        if (AnonymousClass000.A1R(C43391zj.A00(this.A01, r1, r2)) || (this.A00.A0L() && (A0A = r1.A0A(r2)) != null && A0A.A0m)) {
            z = false;
        } else {
            z = true;
            if (i != 0) {
                z = false;
                if (2 == i) {
                    i2 = 2131891948;
                }
            }
        }
        View view = this.A04;
        if (view instanceof ListItemWithLeftIcon) {
            ListItemWithLeftIcon listItemWithLeftIcon = (ListItemWithLeftIcon) view;
            if (z) {
                listItemWithLeftIcon.setDescriptionVisibility(8);
                return;
            }
            C74793cj.A02(this.A05, listItemWithLeftIcon, i2);
            listItemWithLeftIcon.setDescriptionVisibility(0);
        }
    }
}
