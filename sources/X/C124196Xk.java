package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.whatsapp.TextData;

/* renamed from: X.6Xk  reason: invalid class name and case insensitive filesystem */
public abstract class C124196Xk {
    /* JADX WARNING: type inference failed for: r1v3, types: [X.6Ia, X.5dW] */
    public static final C121176Ia A00(Context context, Typeface typeface, Drawable drawable, TextData textData, AnonymousClass11C r14, AnonymousClass1KW r15, C18010vc r16, String str) {
        AnonymousClass11C r5 = r14;
        AnonymousClass1KW r6 = r15;
        C18010vc r7 = r16;
        C18070vi.A0p(r15, r14, r7);
        String str2 = str;
        C18070vi.A0d(str2, 5);
        Integer num = AnonymousClass00R.A00;
        C109485dW r1 = null;
        TextData textData2 = textData;
        if (drawable instanceof C109485dW) {
            C109485dW r12 = (C109485dW) drawable;
            if (r12.A07 == num && C42171xk.A00(r12.A06, str2) && C42171xk.A00(r12.A05, textData)) {
                r1 = r12;
            }
        }
        C121176Ia r13 = (C121176Ia) r1;
        if (r13 == null) {
            return new C109485dW(context, typeface, textData2, r5, r6, r7, num, str2);
        }
        return r13;
    }
}
