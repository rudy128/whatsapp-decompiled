package X;

import java.text.Collator;
import java.util.Locale;

/* renamed from: X.3Ed  reason: invalid class name */
public class AnonymousClass3Ed extends ThreadLocal {
    public final /* synthetic */ Locale A00;

    public AnonymousClass3Ed(Locale locale) {
        this.A00 = locale;
    }

    public /* bridge */ /* synthetic */ Object initialValue() {
        Collator instance = Collator.getInstance(this.A00);
        instance.setDecomposition(1);
        instance.setStrength(0);
        return instance;
    }
}
