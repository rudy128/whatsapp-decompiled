package X;

import android.graphics.Bitmap;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4rW  reason: invalid class name and case insensitive filesystem */
public class C98664rW implements Runnable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C98664rW(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A04 = obj2;
        this.A01 = i;
        this.A02 = i2;
        this.A08 = z;
        this.A09 = z2;
        this.A05 = obj3;
        this.A06 = obj4;
        this.A07 = obj5;
        this.A0A = z3;
    }

    public final void run() {
        Bitmap bitmap;
        if (this.A00 != 0) {
            ThumbnailButton thumbnailButton = (ThumbnailButton) this.A04;
            int i = this.A01;
            int i2 = this.A02;
            boolean z = this.A08;
            boolean z2 = this.A09;
            WebPagePreviewView.A04((Bitmap) this.A05, thumbnailButton, (WebPagePreviewView) this.A03, (AtomicBoolean) this.A06, (AtomicBoolean) this.A07, i, i2, z, z2, this.A0A);
            return;
        }
        WebPagePreviewView webPagePreviewView = (WebPagePreviewView) this.A03;
        byte[] bArr = (byte[]) this.A04;
        Object obj = this.A05;
        int i3 = this.A01;
        int i4 = this.A02;
        boolean z3 = this.A08;
        boolean z4 = this.A09;
        Object obj2 = this.A06;
        Object obj3 = this.A07;
        boolean z5 = this.A0A;
        if (bArr != null) {
            bitmap = AnonymousClass204.A0C(new AnonymousClass25O(webPagePreviewView.A0d, webPagePreviewView.A0c), bArr).A02;
        } else {
            bitmap = null;
        }
        webPagePreviewView.A0C.A0J(new C98664rW(webPagePreviewView, obj, bitmap, obj2, obj3, i3, i4, 1, z3, z4, z5));
    }
}
