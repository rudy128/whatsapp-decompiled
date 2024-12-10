package X;

/* renamed from: X.Bzs  reason: case insensitive filesystem */
public enum C24357Bzs {
    UNKNOWN(-1, "UNKNOWN"),
    DASH_VIDEO(2, "DASH_VIDEO"),
    DASH_AUDIO(1, "DASH_AUDIO"),
    DASH_TEXT(3, "DASH_TEXT"),
    DASH_UNKNOWN(0, "DASH_UNKNOWN"),
    PROGRESSIVE(10, "PROGRESSIVE"),
    LIVE_VIDEO(11, "LIVE_VIDEO"),
    LIVE_AUDIO(12, "LIVE_AUDIO"),
    LIVE_MANIFEST(13, "LIVE_MANIFEST");
    
    public final String name;
    public final int value;

    /* access modifiers changed from: public */
    C24357Bzs(int i, String str) {
        this.value = i;
        this.name = str;
    }
}
