package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.4kQ  reason: invalid class name and case insensitive filesystem */
public final class C94314kQ implements C72093Kp {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ Intent A03;
    public final /* synthetic */ C37721q1 A04;

    public C94314kQ(Activity activity, Intent intent, C37721q1 r3, int i, int i2) {
        this.A02 = activity;
        this.A03 = intent;
        this.A00 = i;
        this.A04 = r3;
        this.A01 = i2;
    }

    public void CC1() {
        this.A02.startActivityForResult(this.A03, this.A00);
        this.A04.A06(true, this.A01);
    }
}
