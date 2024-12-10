package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.view.View;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.78c  reason: invalid class name and case insensitive filesystem */
public final class C1420878c implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass6GW A02;
    public final /* synthetic */ WebPagePreviewView A03;
    public final /* synthetic */ boolean A04;

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        Bitmap bitmap;
        int i11;
        C18070vi.A0d(view, 0);
        view.removeOnLayoutChangeListener(this);
        WebPagePreviewView webPagePreviewView = this.A03;
        int height = webPagePreviewView.A08.getHeight();
        AnonymousClass6GW r8 = this.A02;
        AnonymousClass210 r2 = r8.A0E;
        String A17 = r2.A17();
        if (A17 != null && (!(C60502o8.A00(r2) == null && r2.A1A() == null) && AnonymousClass74F.A02(r8.A0D, A17) < 250)) {
            DisplayMetrics displayMetrics = r8.A00;
            if (displayMetrics != null) {
                if (((float) displayMetrics.heightPixels) / displayMetrics.density >= 640.0f && (r8.A06.getHeight() - r8.A08.getHeight()) - height >= AnonymousClass70K.A0B(r8).getResources().getDimensionPixelSize(2131168865)) {
                    C693536w A002 = C60502o8.A00(r2);
                    if (A002 != null && (i11 = A002.A01) > 0 && A002.A00 > 0) {
                        float f = (float) r8.A05;
                        DisplayMetrics displayMetrics2 = r8.A00;
                        if (displayMetrics2 != null) {
                            if (i11 >= ((int) (f / displayMetrics2.density))) {
                                View view2 = this.A00;
                                View view3 = this.A01;
                                boolean z = this.A04;
                                C60502o8.A00(r2);
                                C693536w A003 = C60502o8.A00(r2);
                                if (A003 != null) {
                                    r8.A0H.A0D(webPagePreviewView, r2, new AnonymousClass7ND(view2, view3, A003, r8, webPagePreviewView, height, z));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    byte[] A1A = r2.A1A();
                    bitmap = null;
                    if (A1A != null) {
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inDither = true;
                            options.inPreferredConfig = Bitmap.Config.RGB_565;
                            bitmap = BitmapFactory.decodeByteArray(r2.A1A(), 0, A1A.length, options);
                        } catch (OutOfMemoryError unused) {
                        }
                        if (bitmap != null) {
                            i10 = bitmap.getWidth();
                            i9 = bitmap.getHeight();
                            AnonymousClass6GW.A00(bitmap, this.A00, this.A01, r8, webPagePreviewView, i10, i9, height, this.A04);
                        }
                    }
                    i10 = 0;
                    i9 = 0;
                    AnonymousClass6GW.A00(bitmap, this.A00, this.A01, r8, webPagePreviewView, i10, i9, height, this.A04);
                }
            }
            C18070vi.A11("displayMetrics");
            throw null;
        }
        bitmap = null;
        i10 = 0;
        i9 = 0;
        AnonymousClass6GW.A00(bitmap, this.A00, this.A01, r8, webPagePreviewView, i10, i9, height, this.A04);
    }

    public C1420878c(View view, View view2, AnonymousClass6GW r3, WebPagePreviewView webPagePreviewView, boolean z) {
        this.A03 = webPagePreviewView;
        this.A02 = r3;
        this.A00 = view;
        this.A01 = view2;
        this.A04 = z;
    }
}
