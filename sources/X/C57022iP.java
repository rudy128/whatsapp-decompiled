package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.2iP  reason: invalid class name and case insensitive filesystem */
public final class C57022iP {
    public Set A00;

    public final void A00() {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        Set set = this.A00;
        if (set != null) {
            AnonymousClass000.A1L(objArr, set.size());
            String format = String.format(locale, "WaffleDataDeletionManager/purgeWaffleData: purging waffle data. Running %d deleters", Arrays.copyOf(objArr, 1));
            C18070vi.A0X(format);
            Log.i(format);
            Set<AnonymousClass3LP> set2 = this.A00;
            if (set2 != null) {
                for (AnonymousClass3LP CCx : set2) {
                    CCx.CCx();
                }
                return;
            }
        }
        C18070vi.A11("waffleDataDeleters");
        throw null;
    }
}
