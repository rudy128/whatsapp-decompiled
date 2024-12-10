package X;

import android.view.View;

/* renamed from: X.3wS  reason: invalid class name and case insensitive filesystem */
public class C80043wS extends C88164Yo {
    public static final AnonymousClass4QT A02 = new AnonymousClass4QT(72, 4.0f, 1.0f);
    public static final AnonymousClass4QT A03 = new AnonymousClass4QT(72, 1.0f, 1.0f);
    public static final AnonymousClass4QT A04 = new AnonymousClass4QT(65, 5.0f, 7.0f);
    public final AnonymousClass4QT A00;
    public final AnonymousClass4QT A01;

    public C80043wS(AnonymousClass4QT r1, AnonymousClass4QT r2, int i) {
        super(i);
        this.A01 = r1;
        this.A00 = r2;
    }

    public static Float A00(float f, int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            f = Math.min(f, (float) View.MeasureSpec.getSize(i));
        } else if (mode != 0) {
            if (mode != 1073741824) {
                C17900vP.A0k("ConversationRowSingleImagePreviewCalculator/getSizeToSpec: Unhandled View.MeasureSpec ", AnonymousClass000.A10(), mode);
            } else {
                f = (float) View.MeasureSpec.getSize(i);
            }
        }
        return Float.valueOf(f);
    }
}
