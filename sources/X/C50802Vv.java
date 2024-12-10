package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.whatsapp.util.Log;

/* renamed from: X.2Vv  reason: invalid class name and case insensitive filesystem */
public abstract class C50802Vv {
    public static Typeface A00;

    public static Typeface A00(Context context) {
        try {
            return AnonymousClass1YH.A03(context, 2131296259);
        } catch (Resources.NotFoundException e) {
            Log.e(AnonymousClass001.A1I("PAY: PaymentsTypeface/loadFontFromResource could not load font:", AnonymousClass000.A10(), 2131296259), e);
            return null;
        }
    }
}
