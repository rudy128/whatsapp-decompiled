package X;

import com.whatsapp.notification.OtpOneTapNotificationHandlerActivity;

public class AGC implements AnonymousClass01Q {
    public final int A00;
    public final Object A01;

    public AGC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass01C r1, int i) {
        r1.A2L(new AGC(r1, i));
    }

    public void Bq7() {
        if (7 - this.A00 != 0) {
            ((AnonymousClass1FN) this.A01).A2y();
            return;
        }
        OtpOneTapNotificationHandlerActivity otpOneTapNotificationHandlerActivity = (OtpOneTapNotificationHandlerActivity) this.A01;
        if (!otpOneTapNotificationHandlerActivity.A06) {
            otpOneTapNotificationHandlerActivity.A06 = true;
            AnonymousClass10E r1 = ((AnonymousClass1K1) ((C006602x) otpOneTapNotificationHandlerActivity.A2x().generatedComponent())).AAQ;
            otpOneTapNotificationHandlerActivity.A01 = (C32791hl) r1.A2t.get();
            otpOneTapNotificationHandlerActivity.A03 = C000200d.A00(r1.A3w);
            otpOneTapNotificationHandlerActivity.A00 = AnonymousClass10E.A12(r1);
            otpOneTapNotificationHandlerActivity.A04 = C000200d.A00(r1.A7q);
            otpOneTapNotificationHandlerActivity.A02 = AnonymousClass10E.AL1(r1);
        }
    }
}
