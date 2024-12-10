package X;

import com.whatsapp.spamwarning.SpamWarningActivity;

/* renamed from: X.4gy  reason: invalid class name and case insensitive filesystem */
public class C92234gy implements C26181Rd {
    public boolean A00;
    public final /* synthetic */ SpamWarningActivity A01;

    public /* synthetic */ void BvR() {
    }

    public /* synthetic */ void BvT() {
    }

    public /* synthetic */ void BvU() {
    }

    public /* synthetic */ void BvV() {
    }

    public C92234gy(SpamWarningActivity spamWarningActivity) {
        this.A01 = spamWarningActivity;
    }

    public void BvS() {
        if (!this.A00) {
            SpamWarningActivity spamWarningActivity = this.A01;
            spamWarningActivity.startActivity(AnonymousClass1LU.A02(spamWarningActivity));
            spamWarningActivity.finish();
        }
        this.A00 = true;
    }
}
