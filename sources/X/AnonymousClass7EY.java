package X;

import com.whatsapp.CircularProgressBar;
import com.whatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.7EY  reason: invalid class name */
public class AnonymousClass7EY implements C160838Ad {
    public final /* synthetic */ AnonymousClass1FU A00;
    public final /* synthetic */ AnonymousClass73R A01;
    public final /* synthetic */ C145777Mo A02;
    public final /* synthetic */ C441822l A03;

    public void BsS(boolean z) {
    }

    public AnonymousClass7EY(AnonymousClass1FU r1, AnonymousClass73R r2, C145777Mo r3, C441822l r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    public void C0A(int i) {
        AnonymousClass73R.A01(this.A00, this.A01, false);
    }

    public void C20(int i) {
        AnonymousClass73R r0 = this.A01;
        CircularProgressBar circularProgressBar = r0.A0A;
        circularProgressBar.setProgress(i);
        AudioPickerActivity audioPickerActivity = r0.A0C;
        circularProgressBar.setContentDescription(C72473Md.A0j(audioPickerActivity, C64052u8.A07(audioPickerActivity.A00, (long) i), 2131898071));
    }

    public void C3y() {
        AnonymousClass73R.A00(this.A00, this.A01);
    }

    public void C6B(int i) {
        this.A02.A0B(0);
        AnonymousClass73R r1 = this.A01;
        AnonymousClass73R.A00(this.A00, r1);
        r1.A0A.setMax(i);
    }

    public void C70(int i, boolean z) {
        AnonymousClass73R r2 = this.A01;
        AnonymousClass73R.A01(this.A00, r2, true);
        if (z) {
            r2.A0A.setProgress(0);
        }
        r2.A0C.A0B.A08((C145777Mo) null);
    }

    public C441822l BRX() {
        return this.A03;
    }
}
