package androidx.car.app.messaging.model;

import X.AnonymousClass000;
import X.C133316oY;
import android.os.Bundle;
import androidx.car.app.model.CarText;

public class CarMessage {
    public final CarText mBody;
    public final boolean mIsRead = false;
    public final long mReceivedTimeEpochMillis = 0;
    public final Bundle mSender;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, androidx.car.app.model.CarText$Builder] */
    public CarMessage() {
        C133316oY r0 = new C133316oY();
        r0.A01();
        this.mSender = r0.A00().A01();
        ? obj = new Object();
        obj.mTextVariants = AnonymousClass000.A13();
        obj.mText = "";
        this.mBody = new CarText((CarText.Builder) obj);
    }
}
