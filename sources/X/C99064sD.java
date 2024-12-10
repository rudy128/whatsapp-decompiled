package X;

import android.graphics.Paint;
import android.view.View;
import java.util.Calendar;

/* renamed from: X.4sD  reason: invalid class name and case insensitive filesystem */
public class C99064sD implements C18080vj, C18090vk {
    public final int A00;

    public C99064sD(int i) {
        this.A00 = i;
    }

    public final Object invoke() {
        Object obj;
        switch (this.A00) {
            case 0:
                return AnonymousClass4Y3.A01;
            case 1:
                AnonymousClass4UR[] r5 = new AnonymousClass4UR[2];
                r5[0] = new AnonymousClass4UR(AnonymousClass4DE.LOW_LIGHT, AnonymousClass4IM.A00, 2131886704, 2131886702);
                return new C86554Sc(C18070vi.A0O(new AnonymousClass4UR(AnonymousClass4DE.TOUCH_UP, AnonymousClass4IM.A01, 2131886717, 2131886715), r5, 1));
            case 3:
                return C34071js.A00(C18460wS.A00);
            case 4:
                obj = AnonymousClass000.A0h();
                break;
            case 5:
                obj = AnonymousClass4IV.A01;
                break;
            case 6:
                return new AnonymousClass4YG((View) null, AnonymousClass000.A13());
            case 7:
                return new AnonymousClass4Y3(100L);
            case 9:
                return C27621Wu.A00;
            case 13:
                return C17890vO.A0D();
            case 14:
            case 15:
                Calendar instance = Calendar.getInstance();
                instance.add(6, 1);
                if (instance.get(12) >= 30) {
                    instance.add(11, 1);
                }
                instance.set(12, 0);
                instance.set(13, 0);
                return instance;
            case 16:
                return C17890vO.A0Q();
            case 17:
                return AnonymousClass3MW.A0L();
            case 18:
                Paint A0A = AnonymousClass3MZ.A0A();
                AnonymousClass3MW.A1P(A0A);
                return A0A;
            case 19:
                Paint paint = new Paint(1);
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.FILL);
                paint.setDither(true);
                return paint;
            default:
                return null;
        }
        return AnonymousClass3MW.A18(obj);
    }
}
