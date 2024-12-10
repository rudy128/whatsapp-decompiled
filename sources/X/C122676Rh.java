package X;

/* renamed from: X.6Rh  reason: invalid class name and case insensitive filesystem */
public enum C122676Rh {
    TEXT(0, 1, 0),
    PHOTO(1, 2, 1),
    VIDEO(2, 3, 3),
    AUDIO(3, 4, 2),
    PTT(4, 5, 2),
    LOCATION(5, 6, 5),
    CONTACT(6, 7, 4),
    DOCUMENT(7, 8, 9),
    URL(8, 9, 0),
    GIF(9, 10, 13),
    CONTACT_ARRAY(10, 11, 14),
    REACTION(11, 12, 56),
    POLL_CREATE(12, 13, 66),
    POLL_VOTE(13, 14, 67),
    STICKER(14, 15, 20),
    POLL_RESULT_SNAPSHOT(15, 16, 106),
    STICKER_PACK(16, 17, 105);
    
    public final int androidWaType;
    public final String stringType;
    public final int type;

    /* access modifiers changed from: public */
    static {
        C122676Rh[] r1;
        A00 = C19780yz.A00(r1);
    }

    /* access modifiers changed from: public */
    C122676Rh(int i, int i2, int i3) {
        this.stringType = r2;
        this.type = i2;
        this.androidWaType = i3;
    }
}
