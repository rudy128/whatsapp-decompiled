package X;

import com.whatsapp.bot.home.AIHomeActivity;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.music.ui.MusicBrowseFragment;
import com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet;

/* renamed from: X.7PB  reason: invalid class name */
public class AnonymousClass7PB implements C107795ab {
    public final int A00;
    public final Object A01;

    public AnonymousClass7PB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C2O(String str) {
        switch (this.A00) {
            case 0:
                C137196v4.A01(C108945cZ.A0b(((AIHomeActivity) this.A01).A07).A05, str);
                return;
            case 1:
                ((ContactPickerFragment) this.A01).A2c(str);
                return;
            case 2:
                MusicBrowseFragment musicBrowseFragment = (MusicBrowseFragment) this.A01;
                AnonymousClass00H r0 = musicBrowseFragment.A05;
                if (r0 != null) {
                    AnonymousClass73N.A02((AnonymousClass73N) r0.get(), 26);
                    ((C111155iT) musicBrowseFragment.A0D.getValue()).A0T(str, (String) null);
                    return;
                }
                C18070vi.A11("musicPlayer");
                throw null;
            default:
                C111865kY r02 = ((CountrySelectorBottomSheet) this.A01).A04;
                if (r02 != null) {
                    r02.getFilter().filter(str);
                    return;
                }
                return;
        }
    }
}
