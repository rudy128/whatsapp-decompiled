package X;

public enum C12 implements E68 {
    UnknownUserEvent(0),
    Don(1),
    Doff(2),
    CloseArms(3),
    OpenArms(4),
    DoubleCapturePress(5),
    LongCapturePress(6),
    ShortCapturePress(7),
    DoubleTapCaptouch(8),
    SingleTapCaptouch(9),
    TapHoldCaptouch(10),
    EndStreamButtonClick(11),
    PauseStreamBackGesture(12),
    ResumeStreamButtonClick(13),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw BE7.A0X();
    }

    /* access modifiers changed from: public */
    C12(int i) {
        this.value = i;
    }
}
