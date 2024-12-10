package X;

import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.home.ui.HomePlaceholderActivity;

/* renamed from: X.4FJ  reason: invalid class name */
public abstract class AnonymousClass4FJ {
    public void A00(int i, boolean z) {
        AnonymousClass41K r1 = (AnonymousClass41K) this;
        if (2 - r1.A00 == 0) {
            HomePlaceholderActivity.HomePlaceholderView homePlaceholderView = (HomePlaceholderActivity.HomePlaceholderView) r1.A01;
            HomePlaceholderActivity.HomePlaceholderView.A02(homePlaceholderView, i, z);
            homePlaceholderView.A00 = i;
        }
    }

    public void A01(int i, boolean z) {
        AnonymousClass41K r1 = (AnonymousClass41K) this;
        if (2 - r1.A00 == 0) {
            HomePlaceholderActivity.HomePlaceholderView homePlaceholderView = (HomePlaceholderActivity.HomePlaceholderView) r1.A01;
            if (homePlaceholderView.A00 == i) {
                ImageView imageView = homePlaceholderView.A03;
                int i2 = 8;
                if (imageView != null) {
                    imageView.setVisibility(C72453Mb.A01(z ? 1 : 0));
                }
                TextView textView = homePlaceholderView.A04;
                if (textView != null) {
                    if (!z) {
                        i2 = 0;
                    }
                    textView.setVisibility(i2);
                }
            }
        }
    }
}
