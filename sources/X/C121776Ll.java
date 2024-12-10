package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.ViewGroup;
import com.whatsapp.mediaview.PhotoView;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.6Ll  reason: invalid class name and case insensitive filesystem */
public final class C121776Ll extends A34 {
    public final C62272r8 A00;
    public final File A01;
    public final String A02;
    public final WeakReference A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121776Ll(AnonymousClass1F9 r2, AnonymousClass851 r3, C62272r8 r4, File file, String str) {
        super(r2, true);
        C18070vi.A0d(r4, 5);
        this.A01 = file;
        this.A02 = str;
        this.A00 = r4;
        this.A03 = AnonymousClass3MW.A0z(r3);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Resources A05;
        int i;
        C62272r8 r4 = this.A00;
        String str = this.A02;
        File file = this.A01;
        if (AnonymousClass747.A05(str) || C26521Sl.A0f(str)) {
            A05 = AnonymousClass3MW.A05(r4.A00);
            i = 2131166548;
        } else {
            A05 = AnonymousClass3MW.A05(r4.A00);
            i = 2131166552;
        }
        byte[] A012 = r4.A01(file, str, A05.getDimension(i), 0);
        if (A012 == null || C108945cZ.A1T(this)) {
            return null;
        }
        return C50572Uy.A00(new BitmapFactory.Options(), A012, 2000);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        AnonymousClass851 r5 = (AnonymousClass851) this.A03.get();
        if (r5 != null) {
            File file = this.A01;
            String str = this.A02;
            C114645rS r52 = (C114645rS) r5;
            r52.A02.setVisibility(8);
            r52.A04.setVisibility(8);
            if (bitmap == null) {
                r52.A05.CGF(new C21467AkY(r52, file, str, 29));
                return;
            }
            r52.getLayoutInflater().inflate(2131625138, r52.A03, true);
            PhotoView photoView = (PhotoView) AnonymousClass1HF.A06(r52.A03, 2131430115);
            photoView.A0A(bitmap);
            int dimensionPixelOffset = photoView.getResources().getDimensionPixelOffset(2131168009);
            ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(photoView);
            A0B.bottomMargin = dimensionPixelOffset;
            photoView.setLayoutParams(A0B);
        }
    }
}
