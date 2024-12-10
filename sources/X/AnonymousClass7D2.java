package X;

import com.whatsapp.bot.home.AiHomeFragment;
import com.whatsapp.bot.home.AiHomeSearchFragment;
import com.whatsapp.bot.home.AiHomeSearchViewModel;
import com.whatsapp.bot.home.AiHomeViewAllFragment;
import com.whatsapp.bot.home.AiHomeViewAllViewModel;
import com.whatsapp.bot.home.BotListFragment;

/* renamed from: X.7D2  reason: invalid class name */
public class AnonymousClass7D2 implements C1598486c {
    public final int A00;
    public final Object A01;

    public AnonymousClass7D2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C41() {
        if (this.A00 != 0) {
            BotListFragment botListFragment = (BotListFragment) this.A01;
            if (botListFragment instanceof AiHomeViewAllFragment) {
                ((AiHomeViewAllViewModel) ((AiHomeViewAllFragment) botListFragment).A00.getValue()).A0T(false);
                return;
            }
            AiHomeSearchFragment aiHomeSearchFragment = (AiHomeSearchFragment) botListFragment;
            ((AiHomeSearchViewModel) aiHomeSearchFragment.A00.getValue()).A0T(C108945cZ.A1F(C108945cZ.A0b(aiHomeSearchFragment.A04).A05));
            return;
        }
        C108945cZ.A0b(((AiHomeFragment) this.A01).A04).A0F.CPw(C27621Wu.A00);
    }
}
