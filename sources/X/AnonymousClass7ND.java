package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.7ND  reason: invalid class name */
public final class AnonymousClass7ND implements AnonymousClass3M2 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C693536w A03;
    public final /* synthetic */ AnonymousClass6GW A04;
    public final /* synthetic */ WebPagePreviewView A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ void BuW() {
    }

    public /* synthetic */ void CN4(View view) {
    }

    public AnonymousClass7ND(View view, View view2, C693536w r3, AnonymousClass6GW r4, WebPagePreviewView webPagePreviewView, int i, boolean z) {
        this.A04 = r4;
        this.A05 = webPagePreviewView;
        this.A01 = view;
        this.A02 = view2;
        this.A03 = r3;
        this.A00 = i;
        this.A06 = z;
    }

    public int BZK() {
        return this.A04.A05;
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r12) {
        AnonymousClass6GW r3 = this.A04;
        WebPagePreviewView webPagePreviewView = this.A05;
        View view2 = this.A01;
        View view3 = this.A02;
        C693536w r0 = this.A03;
        AnonymousClass6GW.A00(bitmap, view2, view3, r3, webPagePreviewView, r0.A01, r0.A00, this.A00, this.A06);
    }
}
