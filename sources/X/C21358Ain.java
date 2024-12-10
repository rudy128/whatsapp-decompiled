package X;

import android.media.AudioAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: X.Ain  reason: case insensitive filesystem */
public final /* synthetic */ class C21358Ain implements Runnable {
    public final /* synthetic */ AudioAttributes A00;
    public final /* synthetic */ VibrationEffect A01;
    public final /* synthetic */ Vibrator A02;

    public final void run() {
        Vibrator vibrator = this.A02;
        A7v.A02(this.A00, this.A01, vibrator);
    }

    public /* synthetic */ C21358Ain(AudioAttributes audioAttributes, VibrationEffect vibrationEffect, Vibrator vibrator) {
        this.A02 = vibrator;
        this.A01 = vibrationEffect;
        this.A00 = audioAttributes;
    }
}
