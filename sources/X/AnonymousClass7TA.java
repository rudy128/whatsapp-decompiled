package X;

import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.util.TimerTask;

/* renamed from: X.7TA  reason: invalid class name */
public final class AnonymousClass7TA extends TimerTask {
    public final /* synthetic */ UpdatesViewModel A00;

    public AnonymousClass7TA(UpdatesViewModel updatesViewModel) {
        this.A00 = updatesViewModel;
    }

    public void run() {
        UpdatesViewModel updatesViewModel = this.A00;
        if (UpdatesViewModel.A05(updatesViewModel).isEmpty()) {
            UpdatesViewModel.A0G(updatesViewModel);
        } else {
            UpdatesViewModel.A0E(updatesViewModel);
        }
    }
}
