package X;

import com.whatsapp.phonematching.CountryPicker;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7Ri  reason: invalid class name and case insensitive filesystem */
public class C146977Ri implements Comparator {
    public final Collator A00;
    public final List A01;
    public final /* synthetic */ CountryPicker A02;

    public C146977Ri(CountryPicker countryPicker, Locale locale) {
        this.A02 = countryPicker;
        this.A00 = Collator.getInstance(locale);
        List list = (List) C25424CfW.A00.get(AnonymousClass1X0.A04(locale));
        this.A01 = list == null ? Collections.emptyList() : list;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C132826ne r6 = (C132826ne) obj;
        C132826ne r7 = (C132826ne) obj2;
        List list = this.A01;
        int indexOf = list.indexOf(r6.A03);
        int indexOf2 = list.indexOf(r7.A03);
        if (indexOf == -1) {
            if (indexOf2 != -1) {
                return 1;
            }
            Collator collator = this.A00;
            String str = r6.A01;
            if (str.startsWith("ال")) {
                str = str.substring(2);
            }
            String str2 = r7.A01;
            if (str2.startsWith("ال")) {
                str2 = str2.substring(2);
            }
            return collator.compare(str, str2);
        } else if (indexOf2 != -1) {
            return indexOf - indexOf2;
        } else {
            return -1;
        }
    }
}
