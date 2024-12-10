package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.4qf  reason: invalid class name and case insensitive filesystem */
public final class C98154qf implements AnonymousClass3M2 {
    public final int A00;
    public final Context A01;
    public final WebPagePreviewView A02;
    public final boolean A03;
    public final Bitmap[] A04;

    public C98154qf(Context context, WebPagePreviewView webPagePreviewView, Bitmap[] bitmapArr, int i, boolean z) {
        C18070vi.A0d(context, 1);
        this.A01 = context;
        this.A02 = webPagePreviewView;
        this.A00 = i;
        this.A04 = bitmapArr;
        this.A03 = z;
    }

    public /* synthetic */ void BuW() {
    }

    public int BZK() {
        return this.A00;
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r7) {
        if (bitmap != null) {
            this.A02.setVideoLargeThumbWithBitmap(bitmap);
            this.A04[0] = bitmap;
            return;
        }
        boolean z = this.A03;
        WebPagePreviewView webPagePreviewView = this.A02;
        if (z) {
            webPagePreviewView.A07.setAlpha(0.3f);
            webPagePreviewView.setVideoLargeThumbWithBackground(-7829368);
            return;
        }
        webPagePreviewView.setVideoLargeThumbWithBackground(AnonymousClass3Ma.A00(this.A01, 2130970830, 2131102245));
    }

    public void CN4(View view) {
        this.A02.setVideoLargeThumbWithBackground(-7829368);
    }
}
