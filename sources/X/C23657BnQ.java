package X;

/* renamed from: X.BnQ  reason: case insensitive filesystem */
public final class C23657BnQ extends C23577Bm6 implements C22356B4k {
    public static final C23657BnQ DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int USER_EVENT_ACTION_FIELD_NUMBER = 2;
    public static final int USER_EVENT_FIELD_NUMBER = 1;
    public int userEventAction_;
    public int userEvent_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.BnQ, X.Bm6] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C23657BnQ.class);
    }

    public C12 A0R() {
        switch (this.userEvent_) {
            case 0:
                return C12.UnknownUserEvent;
            case 1:
                return C12.Don;
            case 2:
                return C12.Doff;
            case 3:
                return C12.CloseArms;
            case 4:
                return C12.OpenArms;
            case 5:
                return C12.DoubleCapturePress;
            case 6:
                return C12.LongCapturePress;
            case 7:
                return C12.ShortCapturePress;
            case 8:
                return C12.DoubleTapCaptouch;
            case 9:
                return C12.SingleTapCaptouch;
            case 10:
                return C12.TapHoldCaptouch;
            case 11:
                return C12.EndStreamButtonClick;
            case 12:
                return C12.PauseStreamBackGesture;
            case 13:
                return C12.ResumeStreamButtonClick;
            default:
                return C12.UNRECOGNIZED;
        }
    }
}
