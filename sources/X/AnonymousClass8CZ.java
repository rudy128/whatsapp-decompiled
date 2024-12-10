package X;

import android.os.CountDownTimer;
import com.whatsapp.registration.flashcall.FlashCallViewModel;

/* renamed from: X.8CZ  reason: invalid class name */
public final class AnonymousClass8CZ extends CountDownTimer {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ FlashCallViewModel A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8CZ(FlashCallViewModel flashCallViewModel, long j, long j2) {
        super(j, 1000);
        this.A01 = j;
        this.A02 = flashCallViewModel;
        this.A00 = j2;
    }

    public void onFinish() {
        FlashCallViewModel flashCallViewModel = this.A02;
        flashCallViewModel.A00 = null;
        flashCallViewModel.A03.A0E("complete");
        if (C18020vd.A05(C18040vf.A02, flashCallViewModel.A04, 8940)) {
            AnonymousClass3MX.A1J(flashCallViewModel.A02, 100);
        }
    }

    public void onTick(long j) {
        FlashCallViewModel flashCallViewModel = this.A02;
        if (C18020vd.A05(C18040vf.A02, flashCallViewModel.A04, 8940)) {
            long j2 = this.A01;
            AnonymousClass1DT r0 = flashCallViewModel.A02;
            AnonymousClass3MX.A1J(r0, (int) ((((j2 - j) / 1000) * 100) / (j2 / 1000)));
        }
        AnonymousClass1DT r3 = flashCallViewModel.A01;
        Boolean bool = (Boolean) r3.A06();
        if (bool == null) {
            bool = AnonymousClass000.A0h();
        }
        if (!bool.booleanValue() && j - this.A00 <= 500) {
            AnonymousClass3MY.A1L(r3, true);
        }
    }
}
