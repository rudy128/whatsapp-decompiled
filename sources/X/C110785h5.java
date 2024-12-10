package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5h5  reason: invalid class name and case insensitive filesystem */
public abstract class C110785h5 extends AppCompatImageView implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public static Rect A00(Paint paint, Object obj, Map map, int i, int i2) {
        Rect rect = new Rect();
        paint.getTextBounds(AnonymousClass65B.A05(i), i2, i, rect);
        map.put(obj, rect);
        return rect;
    }

    public static Map A01(AnonymousClass65B r1, Object obj) {
        Map map = r1.A0L;
        Map map2 = (Map) map.get(obj);
        if (map2 != null) {
            return map2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        map.put(obj, linkedHashMap);
        return linkedHashMap;
    }

    public void A06() {
        if (this instanceof AnonymousClass65K) {
            AnonymousClass65K r1 = (AnonymousClass65K) this;
            if (!r1.A00) {
                r1.A00 = true;
                r1.A07 = C72473Md.A0S((AnonymousClass033) r1.generatedComponent());
            }
        } else if (this instanceof AnonymousClass65J) {
            AnonymousClass65J r2 = (AnonymousClass65J) this;
            if (r2 instanceof AnonymousClass656) {
                AnonymousClass656 r22 = (AnonymousClass656) r2;
                if (!r22.A00) {
                    r22.A00 = true;
                    AnonymousClass10E A0X = C72463Mc.A0X(r22);
                    r22.A07 = AnonymousClass10E.A6Q(A0X);
                    r22.A06 = (C88104Yi) A0X.A00.AFS.get();
                    r22.A05 = AnonymousClass10E.A6Q(A0X);
                }
            } else if (!r2.A00) {
                r2.A00 = true;
                AnonymousClass657 r23 = (AnonymousClass657) r2;
                AnonymousClass10E r12 = ((C27691Xc) ((AnonymousClass033) r2.generatedComponent())).A10;
                r23.A07 = AnonymousClass10E.A6Q(r12);
                r23.A06 = (C88104Yi) r12.A00.AFS.get();
                r23.A05 = AnonymousClass10E.A6Q(r12);
            }
        } else if (!this.A01) {
            this.A01 = true;
            ((AnonymousClass65B) this).A07 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public static void A02(Drawable drawable, View view, int i) {
        drawable.setBounds(i, (view.getHeight() - drawable.getIntrinsicHeight()) - i, drawable.getIntrinsicWidth() + i, view.getHeight() - i);
    }
}
