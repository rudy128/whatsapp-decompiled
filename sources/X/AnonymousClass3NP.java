package X;

import android.os.CountDownTimer;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel;
import com.whatsapp.spamwarning.SpamWarningActivity;

/* renamed from: X.3NP  reason: invalid class name */
public class AnonymousClass3NP extends CountDownTimer {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3NP(ParticipantsListViewModel participantsListViewModel, AnonymousClass1BI r6) {
        super(4500, 2000);
        this.A01 = participantsListViewModel;
        this.A02 = r6;
    }

    public void onFinish() {
        if (this.A00 != 0) {
            AnonymousClass3MW.A1U(this.A01);
            return;
        }
        ParticipantsListViewModel participantsListViewModel = (ParticipantsListViewModel) this.A01;
        participantsListViewModel.A02.A0F(ParticipantsListViewModel.A04(participantsListViewModel, (AnonymousClass1BI) this.A02, 2));
    }

    public void onTick(long j) {
        if (this.A00 != 0) {
            int i = (int) j;
            CircularProgressBar circularProgressBar = (CircularProgressBar) this.A02;
            circularProgressBar.setCenterText(C64052u8.A0D(((AnonymousClass1FP) this.A01).A00, (String) null, (long) (i / 1000)));
            circularProgressBar.setProgress(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3NP(CircularProgressBar circularProgressBar, SpamWarningActivity spamWarningActivity, long j) {
        super(j, 10);
        this.A01 = spamWarningActivity;
        this.A02 = circularProgressBar;
    }
}
