package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.97G  reason: invalid class name */
public abstract class AnonymousClass97G extends C166838e7 {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public C24771Lp A03;
    public AnonymousClass1M9 A04;
    public C24921Me A05;
    public C24791Lr A06;
    public AnonymousClass1NM A07;
    public C219217x A08;
    public AnonymousClass1E7 A09;
    public AnonymousClass12L A0A;
    public PhotoView A0B;
    public AnonymousClass00H A0C;
    public boolean A0D;
    public boolean A0E;

    public void onRestoreInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onRestoreInstanceState(bundle);
        this.A0E = bundle.getBoolean("photo_change_requested_externally");
        this.A0D = bundle.getBoolean("photo_change_requested_by_phone");
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("photo_change_requested_externally", this.A0E);
        bundle.putBoolean("photo_change_requested_by_phone", this.A0D);
    }

    public final void setProgressView(View view) {
        C18070vi.A0d(view, 0);
        this.A00 = view;
    }

    public final AnonymousClass1E7 A4b() {
        AnonymousClass1E7 r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contact");
        throw null;
    }

    public final void A4c(Bitmap bitmap) {
        String str;
        PhotoView photoView = this.A0B;
        if (photoView != null) {
            photoView.A0P = true;
            photoView.A08 = 1.0f;
            photoView.A0A(bitmap);
            ImageView imageView = this.A01;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
                return;
            }
            str = "animationView";
        } else {
            str = "pictureView";
        }
        C18070vi.A11(str);
        throw null;
    }

    public final void A4d(boolean z, String str) {
        String str2;
        if (z) {
            PhotoView photoView = this.A0B;
            if (photoView != null) {
                photoView.setVisibility(4);
                ImageView imageView = this.A01;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    ImageView imageView2 = this.A01;
                    if (imageView2 != null) {
                        AnonymousClass1Xr.A04(imageView2, str);
                        return;
                    }
                }
            } else {
                str2 = "pictureView";
                C18070vi.A11(str2);
                throw null;
            }
        } else {
            ImageView imageView3 = this.A01;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
                return;
            }
        }
        str2 = "animationView";
        C18070vi.A11(str2);
        throw null;
    }

    public C18180vt BYS() {
        return C19620yd.A02;
    }
}
