package X;

import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

/* renamed from: X.4nM  reason: invalid class name and case insensitive filesystem */
public class C96134nM implements AnonymousClass892 {
    public final int A00;
    public final Object A01;

    public C96134nM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BuY(File file, String str, byte[] bArr) {
        String str2;
        File file2 = file;
        if (this.A00 != 0) {
            C85704Ok r3 = (C85704Ok) this.A01;
            WebPagePreviewView webPagePreviewView = r3.A04;
            webPagePreviewView.setImageProgressBarVisibility(false);
            webPagePreviewView.A0R(true, r3.A05);
            if (file == null) {
                str2 = "ConversationShellWebPagePreviewController/onFileReceived/gif is null";
            } else {
                C94614ku r1 = (C94614ku) r3.A01;
                if (r1.A00 != 0) {
                    AnonymousClass4aY r12 = (AnonymousClass4aY) r1.A01;
                    r12.A2Q.CNh(C123606Vc.A00(AnonymousClass3MW.A0P(r12), (C58432kg) r12.A5c.get(), r12.A3Z, r12.A2b.A0G, file2, Collections.singletonList(r12.A3R)), 27);
                    return;
                }
                return;
            }
        } else {
            SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) ((AnonymousClass48m) this.A01).A01;
            sharedTextPreviewDialogFragment.A09.setImageProgressBarVisibility(false);
            sharedTextPreviewDialogFragment.A09.A0R(true, false);
            if (file == null) {
                str2 = "sharedtextpreviewdialogfragment/gif-preview/file is null";
            } else {
                sharedTextPreviewDialogFragment.startActivityForResult(C123606Vc.A00(sharedTextPreviewDialogFragment.A1B(), (C58432kg) sharedTextPreviewDialogFragment.A0M.get(), sharedTextPreviewDialogFragment.A0D, (AnonymousClass206) null, file, sharedTextPreviewDialogFragment.A0A), 27);
                return;
            }
        }
        Log.e(str2);
    }

    public void onFailure(Exception exc) {
        if (this.A00 != 0) {
            C85704Ok r4 = (C85704Ok) this.A01;
            WebPagePreviewView webPagePreviewView = r4.A04;
            webPagePreviewView.setImageProgressBarVisibility(false);
            webPagePreviewView.A0R(true, r4.A05);
            C94614ku r1 = (C94614ku) r4.A01;
            if (r1.A00 != 0 && (exc instanceof IOException)) {
                AnonymousClass3MX.A0U((AnonymousClass4aY) r1.A01).A09(2131890756, 0);
            }
        }
    }
}
