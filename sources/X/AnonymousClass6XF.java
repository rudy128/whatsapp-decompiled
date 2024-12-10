package X;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.6XF  reason: invalid class name */
public abstract class AnonymousClass6XF {
    public static final Notification A00(Context context) {
        IconCompat A02;
        String str;
        int i;
        Icon createWithResource = Icon.createWithResource(context, 2131231578);
        C28111Yx.A02(createWithResource);
        int A01 = C1408373g.A01(createWithResource);
        if (A01 != 2) {
            if (A01 == 4) {
                Uri A04 = C1408373g.A04(createWithResource);
                if (A04 != null) {
                    str = A04.toString();
                    if (str != null) {
                        i = 4;
                    } else {
                        throw new NullPointerException();
                    }
                } else {
                    throw new NullPointerException();
                }
            } else if (A01 != 6) {
                A02 = new IconCompat(-1);
                A02.A06 = createWithResource;
            } else {
                Uri A042 = C1408373g.A04(createWithResource);
                if (A042 != null) {
                    str = A042.toString();
                    if (str != null) {
                        i = 6;
                    } else {
                        throw new NullPointerException();
                    }
                } else {
                    throw new NullPointerException();
                }
            }
            A02 = new IconCompat(i);
            A02.A06 = str;
        } else {
            String A05 = C1408373g.A05(createWithResource);
            try {
                A02 = IconCompat.A02(IconCompat.A00(context, A05), A05, C1408373g.A00(createWithResource));
            } catch (Resources.NotFoundException unused) {
                throw AnonymousClass000.A0k("Icon resource cannot be found");
            }
        }
        C1409673t r0 = new C1409673t(context, "other_notifications@1");
        r0.A0C(A02);
        return r0.A05();
    }
}
