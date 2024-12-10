package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.status.playback.fragment.OpenLinkDialogFragment;
import com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;

/* renamed from: X.74u  reason: invalid class name and case insensitive filesystem */
public class C1412274u implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C1412274u(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent A002;
        C1597885w r1;
        switch (this.A00) {
            case 0:
                OpenLinkDialogFragment openLinkDialogFragment = (OpenLinkDialogFragment) this.A01;
                String str = this.A02;
                AnonymousClass89L r0 = openLinkDialogFragment.A04;
                if (r0 != null) {
                    r0.Boy();
                }
                C36361nl r12 = openLinkDialogFragment.A01;
                if (r12 != null) {
                    C72453Mb.A18(openLinkDialogFragment.A14(), r12, str);
                    return;
                }
                break;
            case 1:
                DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this.A01;
                String str2 = this.A02;
                if (C24211Jh.A02(deepLinkActivity, "com.whatsapp.w4b") != null) {
                    A002 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                } else {
                    A002 = deepLinkActivity.A0k.A00("smb_linking_back2wa");
                }
                deepLinkActivity.A01.A08(deepLinkActivity, A002);
                C108965cb.A0y(deepLinkActivity);
                return;
            case 2:
                OpenLinkDialogFragment openLinkDialogFragment2 = (OpenLinkDialogFragment) this.A01;
                String str3 = this.A02;
                AnonymousClass89L r02 = openLinkDialogFragment2.A04;
                if (r02 != null) {
                    r02.Boy();
                }
                Context A1n = openLinkDialogFragment2.A1n();
                if (A1n != null) {
                    C36361nl r3 = openLinkDialogFragment2.A01;
                    if (r3 != null) {
                        r3.CGW(A1n, Uri.parse(str3), (AnonymousClass206) null, 0, 1);
                    }
                }
                openLinkDialogFragment2.A29();
                return;
            default:
                ConfirmPackDeleteDialogFragment confirmPackDeleteDialogFragment = (ConfirmPackDeleteDialogFragment) this.A01;
                String str4 = this.A02;
                if (i == -1) {
                    C108945cZ.A0e(confirmPackDeleteDialogFragment.A01).A03(AnonymousClass3MY.A0g(), 1, 7);
                    try {
                        r1 = (C1597885w) confirmPackDeleteDialogFragment.A1B();
                        if (r1 != null) {
                            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r1;
                            stickerStorePackPreviewActivity.A0W = true;
                            StickerStorePackPreviewActivity.A0V(stickerStorePackPreviewActivity);
                        }
                    } catch (ClassCastException unused) {
                        r1 = null;
                    }
                    confirmPackDeleteDialogFragment.A00.A0H(new AnonymousClass7MV(AnonymousClass3MW.A0z(r1)), str4);
                    confirmPackDeleteDialogFragment.A28();
                    return;
                }
                return;
        }
        C18070vi.A11("linkLauncher");
        throw null;
    }
}
