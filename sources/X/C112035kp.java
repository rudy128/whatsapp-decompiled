package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5kp  reason: invalid class name and case insensitive filesystem */
public final class C112035kp extends C38391rD {
    public final ArrayList A00 = AnonymousClass000.A13();
    public final /* synthetic */ GalleryPickerFragment A01;

    public long A0M(int i) {
        return (long) i;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        List list = C42011xT.A0I;
        GalleryPickerFragment galleryPickerFragment = this.A01;
        return new C113635nP(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), (ViewGroup) null, galleryPickerFragment.A0W, false), galleryPickerFragment);
    }

    public C112035kp(GalleryPickerFragment galleryPickerFragment) {
        this.A01 = galleryPickerFragment;
        A0K(true);
    }

    public int A0Q() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r11, int i) {
        String str;
        int i2;
        C113635nP r112 = (C113635nP) r11;
        C18070vi.A0d(r112, 0);
        Object obj = this.A00.get(i);
        C18070vi.A0X(obj);
        C139226yS r5 = (C139226yS) obj;
        C18070vi.A0d(r5, 0);
        r112.A00 = r5;
        TextView textView = r112.A03;
        GalleryPickerFragment galleryPickerFragment = r112.A09;
        C18000vb r0 = galleryPickerFragment.A0F;
        if (r0 != null) {
            textView.setText(r0.A0L().format((long) r5.A00));
            r112.A04.A0S(r5.A05, (List) null, 0, false);
            if (!GalleryPickerFragment.A04(galleryPickerFragment)) {
                C18100vl r2 = r112.A05;
                ImageView imageView = (ImageView) AnonymousClass3MX.A14(r2);
                switch (r5.A02) {
                    case 0:
                    case 4:
                    case 7:
                        i2 = 2131231516;
                        break;
                    case 1:
                    case 5:
                        i2 = 2131231518;
                        break;
                    case 9:
                        i2 = 2131231519;
                        break;
                    default:
                        i2 = 2131231517;
                        break;
                }
                imageView.setImageResource(i2);
                Context A1n = galleryPickerFragment.A1n();
                if (A1n != null) {
                    int dimensionPixelSize = A1n.getResources().getDimensionPixelSize(2131169535);
                    C72453Mb.A0T(r2).setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                }
            }
            if (GalleryPickerFragment.A04(galleryPickerFragment) && r5.A02 == 9) {
                AnonymousClass10I r22 = galleryPickerFragment.A0K;
                if (r22 != null) {
                    r22.CGF(new AnonymousClass3C4(galleryPickerFragment, r5, r112, 40));
                } else {
                    str = "workers";
                }
            }
            C136166tN r6 = galleryPickerFragment.A0I;
            AnonymousClass6WT.A00(galleryPickerFragment.A03, r112.A02, galleryPickerFragment, r5, r6, galleryPickerFragment.A02, galleryPickerFragment.A01, false);
            return;
        }
        str = "whatsAppLocale";
        C18070vi.A11(str);
        throw null;
    }
}
