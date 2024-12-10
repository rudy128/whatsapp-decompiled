package X;

/* renamed from: X.Bzv  reason: case insensitive filesystem */
public enum C24360Bzv {
    FACEBOOK("com.facebook.katana", 0),
    FACEBOOK_DEBUG("com.facebook.wakizashi", 1),
    FACEBOOK_LITE("com.facebook.lite", 2),
    INSTAGRAM("com.instagram.android", 3),
    INSTAGRAM_WITH_V2_PROVIDER("com.instagram.android", 4),
    MLITE("com.facebook.mlite", 5),
    MESSENGER("com.facebook.orca", 6),
    MESSENGER_WITH_LITE_PROVIDER("com.facebook.orca", 7),
    OCULUS("com.oculus.twilight", 8),
    NO_SOURCE("", 9),
    MWA("com.facebook.stella", 10),
    MWA_DEBUG("com.facebook.stella_debug", 11);
    
    public final String accountManagerType;
    public final String packageName;

    /* access modifiers changed from: public */
    C24360Bzv(String str, int i) {
        this.accountManagerType = r2;
        this.packageName = str;
    }
}
