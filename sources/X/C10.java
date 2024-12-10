package X;

public enum C10 implements E68 {
    USER_EVENT_ACTION_NONE(0),
    USER_EVENT_ACTION_REQUEST_SG_CAMERA_ON(1),
    USER_EVENT_ACTION_SG_MEDIA_STREAM_PAUSED(2),
    USER_EVENT_ACTION_TOGGLE_CAMERA_BACKGROUND(3),
    USER_EVENT_ACTION_REQUEST_PHOTO_CAPTURE(4),
    USER_EVENT_ACTION_REQUEST_TOGGLE_VIDEO_CAPTURE(5),
    USER_EVENT_ACTION_REQUEST_MODEL_RESPONSE(6),
    USER_EVENT_ACTION_REQUEST_END_CAPTURE(7),
    USER_EVENT_ACTION_REQUEST_END_STREAM_AND_SAVE(8),
    USER_EVENT_ACTION_REQUEST_END_STREAM_AND_DISCARD(9),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw BE7.A0X();
    }

    /* access modifiers changed from: public */
    C10(int i) {
        this.value = i;
    }
}
