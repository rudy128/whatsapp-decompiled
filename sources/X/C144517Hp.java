package X;

import android.net.Uri;
import android.view.View;
import com.whatsapp.status.widget.StatusEditText;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;
import com.whatsapp.util.Log;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.io.File;
import java.util.ArrayList;

/* renamed from: X.7Hp  reason: invalid class name and case insensitive filesystem */
public final class C144517Hp implements AnonymousClass892 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TextStatusComposerFragment A01;

    public void onFailure(Exception exc) {
    }

    public C144517Hp(View view, TextStatusComposerFragment textStatusComposerFragment) {
        this.A01 = textStatusComposerFragment;
        this.A00 = view;
    }

    public void BuY(File file, String str, byte[] bArr) {
        TextStatusComposerFragment textStatusComposerFragment = this.A01;
        WebPagePreviewView webPagePreviewView = textStatusComposerFragment.A0w;
        if (webPagePreviewView != null) {
            webPagePreviewView.setImageProgressBarVisibility(false);
        }
        View view = this.A00;
        if (view != null) {
            view.setVisibility(0);
        }
        if (file == null) {
            Log.e("textstatus/gif-preview/file is null");
            return;
        }
        Uri fromFile = Uri.fromFile(C108945cZ.A17(file.getAbsolutePath()));
        ArrayList A0s = C108965cb.A0s(fromFile);
        StatusEditText statusEditText = textStatusComposerFragment.A0l;
        if (statusEditText == null) {
            C18070vi.A11("entry");
            throw null;
        }
        String stringText = statusEditText.getStringText();
        C18070vi.A0X(stringText);
        C18070vi.A0b(fromFile);
        AnonymousClass72S r2 = new AnonymousClass72S(fromFile);
        r2.A0P(stringText);
        r2.A0O(C108955ca.A0i());
        AnonymousClass73D r1 = new AnonymousClass73D(r2);
        C139416yo r3 = new C139416yo(textStatusComposerFragment.A14());
        r3.A0I = A0s;
        r3.A0D = C29671cg.A00.getRawString();
        r3.A01 = 9;
        r3.A0P = true;
        r3.A02 = 33;
        C139416yo.A00(r1, r3);
        C108985cd.A0M(textStatusComposerFragment).CNh(r3.A01(), 1);
    }
}
