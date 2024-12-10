package X;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: X.Ami  reason: case insensitive filesystem */
public class C21594Ami extends ThreadLocal {
    public final /* synthetic */ String A00;

    public C21594Ami(String str) {
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ Object initialValue() {
        return new DecimalFormat(this.A00, DecimalFormatSymbols.getInstance(Locale.US));
    }
}
