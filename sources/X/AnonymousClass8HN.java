package X;

import android.os.Vibrator;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.polls.creator.PollCreatorActivity;
import com.whatsapp.polls.creator.PollCreatorViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8HN  reason: invalid class name */
public final class AnonymousClass8HN extends C25848Cn6 {
    public final /* synthetic */ PollCreatorActivity A00;

    public int A01(C42011xT r6, RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        if (!(r6 instanceof C1769296h)) {
            return 0;
        }
        int A05 = r6.A05() - 2;
        PollCreatorViewModel A0d = AnonymousClass8BR.A0d(this.A00.A0E);
        if (A05 >= 0) {
            List list = A0d.A0D;
            if (A05 < list.size() && ((C1769596k) list.get(A05)).A00.length() == 0) {
                return 0;
            }
        }
        return (3 << 16) | (0 << 8) | (3 << 0);
    }

    public boolean A07(C42011xT r3, C42011xT r4, RecyclerView recyclerView) {
        C18070vi.A0d(r4, 2);
        if ((r4 instanceof C1769196g) || (r4 instanceof C1769096f)) {
            return false;
        }
        return true;
    }

    public AnonymousClass8HN(PollCreatorActivity pollCreatorActivity) {
        this.A00 = pollCreatorActivity;
    }

    public void A03(C42011xT r4, int i) {
        if (i == 0) {
            AnonymousClass8BR.A0d(this.A00.A0E).A0T(true);
        } else if (i == 2 && r4 != null) {
            ((InputMethodManager) this.A00.A08.getValue()).hideSoftInputFromWindow(r4.A0H.getWindowToken(), 0);
        }
    }

    public boolean A08(C42011xT r9, C42011xT r10, RecyclerView recyclerView) {
        int A05 = r9.A05() - 2;
        int A052 = r10.A05() - 2;
        PollCreatorActivity pollCreatorActivity = this.A00;
        PollCreatorViewModel A0d = AnonymousClass8BR.A0d(pollCreatorActivity.A0E);
        if (A05 != A052 && A05 >= 0) {
            List list = A0d.A0D;
            if (A05 < list.size() && A052 >= 0 && A052 < list.size() && !(list.size() > 0 && ((C1769596k) list.get(list.size() - 1)).A00.length() == 0 && (A05 == AnonymousClass3MX.A02(list, 1) || A052 == AnonymousClass3MX.A02(list, 1)))) {
                ArrayList A10 = C17880vN.A10(list);
                Collections.swap(A10, A05, A052);
                list.clear();
                list.addAll(A10);
                PollCreatorViewModel.A03(A0d);
                ((AnonymousClass8HU) pollCreatorActivity.A0C.getValue()).A02 = true;
                ((Vibrator) pollCreatorActivity.A0G.getValue()).vibrate(3);
                return true;
            }
        }
        return false;
    }
}
