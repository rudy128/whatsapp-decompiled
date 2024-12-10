package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.filter.FilterUtils;
import java.util.HashSet;

/* renamed from: X.7E6  reason: invalid class name */
public class AnonymousClass7E6 implements C42971z2 {
    public boolean A00;
    public AnonymousClass1VX A01 = AnonymousClass1VW.A06;
    public final C25131Mz A02;
    public final HashSet A03;
    public final AnonymousClass1VW A04;

    public /* synthetic */ void CBg() {
    }

    private void A00(Bitmap bitmap, ImageView imageView, String str) {
        Bitmap bitmap2;
        if (C108965cb.A1Z(this.A03, imageView.hashCode())) {
            if (str == null || this.A00) {
                bitmap2 = null;
            } else {
                bitmap2 = (Bitmap) this.A02.A0A(str);
            }
            this.A00 = false;
            if (bitmap2 != null) {
                imageView.setImageBitmap(bitmap2);
                return;
            }
            try {
                Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                if (copy != null) {
                    FilterUtils.A02(30, copy);
                    if (str != null) {
                        this.A02.A0F(str, copy);
                    }
                    imageView.setImageBitmap(copy);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void CMZ(Bitmap bitmap, ImageView imageView, boolean z) {
        String str;
        if (bitmap != null) {
            if (imageView.getTag() instanceof String) {
                str = (String) imageView.getTag();
            } else {
                str = null;
            }
            A00(bitmap, imageView, str);
            return;
        }
        CN5(imageView);
    }

    public void CN5(ImageView imageView) {
        Bitmap A05;
        AnonymousClass1VW r3 = this.A04;
        boolean A0D = r3.A0D();
        Context context = imageView.getContext();
        if (A0D) {
            A05 = r3.A05(context, this.A01, 2131233521);
        } else {
            C18070vi.A0d(context, 0);
            A05 = r3.A05(context, (AnonymousClass1VX) null, 2131231051);
        }
        A00(A05, imageView, "default_avatar");
    }

    public AnonymousClass7E6(C25131Mz r2, AnonymousClass1VW r3) {
        this.A04 = r3;
        this.A03 = C17880vN.A12();
        this.A02 = r2;
    }

    public void CIg(AnonymousClass1BI r2) {
        this.A01 = AnonymousClass1VW.A01(r2);
    }
}
