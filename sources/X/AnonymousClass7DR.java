package X;

import com.whatsapp.calling.answercall.VoipCallAnswerCallView;

/* renamed from: X.7DR  reason: invalid class name */
public class AnonymousClass7DR implements C1598986h {
    public final int A00;
    public final Object A01;

    public AnonymousClass7DR(VoipCallAnswerCallView voipCallAnswerCallView, int i) {
        this.A00 = i;
        this.A01 = voipCallAnswerCallView;
    }

    public final void BnI() {
        int i = this.A00;
        VoipCallAnswerCallView voipCallAnswerCallView = (VoipCallAnswerCallView) this.A01;
        switch (i) {
            case 0:
                VoipCallAnswerCallView.setupCallResponseLayout$lambda$8(voipCallAnswerCallView);
                return;
            case 1:
                VoipCallAnswerCallView.setupCallResponseLayout$lambda$9(voipCallAnswerCallView);
                return;
            case 2:
                VoipCallAnswerCallView.setupCallResponseLayout$lambda$10(voipCallAnswerCallView);
                return;
            case 3:
                VoipCallAnswerCallView.setupCallResponseLayout$lambda$5(voipCallAnswerCallView);
                return;
            default:
                VoipCallAnswerCallView.setupCallResponseLayout$lambda$6(voipCallAnswerCallView);
                return;
        }
    }
}
