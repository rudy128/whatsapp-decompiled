package X;

import android.graphics.BitmapFactory;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: X.2WU  reason: invalid class name */
public abstract class AnonymousClass2WU {
    public static final BitmapFactory.Options A00;
    public static final DecimalFormat A01 = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.US));

    static {
        Boolean bool = C17960vV.A01;
        BitmapFactory.Options options = new BitmapFactory.Options();
        A00 = options;
        options.inDither = true;
    }
}
