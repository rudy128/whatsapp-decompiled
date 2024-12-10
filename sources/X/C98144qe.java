package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.4qe  reason: invalid class name and case insensitive filesystem */
public final class C98144qe implements AnonymousClass3M2 {
    public final int A00;
    public final Context A01;
    public final WebPagePreviewView A02;
    public final boolean A03;
    public final Bitmap[] A04;

    public C98144qe(Context context, WebPagePreviewView webPagePreviewView, Bitmap[] bitmapArr, int i, boolean z) {
        C18070vi.A0d(context, 1);
        this.A01 = context;
        this.A02 = webPagePreviewView;
        this.A00 = i;
        this.A03 = z;
        this.A04 = bitmapArr;
    }

    public /* synthetic */ void BuW() {
    }

    public int BZK() {
        return this.A00;
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r8) {
        WebPagePreviewView webPagePreviewView = this.A02;
        if (bitmap != null) {
            boolean z = this.A03;
            webPagePreviewView.A0N(bitmap, z);
            if (z) {
                this.A04[0] = bitmap;
                return;
            }
            return;
        }
        boolean z2 = this.A03;
        int A002 = AnonymousClass3Ma.A00(this.A01, 2130970830, 2131102245);
        if (z2) {
            webPagePreviewView.setVideoLargeThumbWithBackground(A002);
        } else {
            webPagePreviewView.setImageLargeThumbWithBackground(A002);
        }
    }

    public void CN4(View view) {
        WebPagePreviewView webPagePreviewView = this.A02;
        if (this.A03) {
            webPagePreviewView.setVideoLargeThumbWithBackground(-7829368);
        } else {
            webPagePreviewView.setImageLargeThumbWithBackground(-7829368);
        }
    }
}
