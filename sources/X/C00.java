package X;

public enum C00 {
    FACEBOOK("com.facebook.auth.login", "com.facebook.katana", 0),
    FACEBOOK_DEBUG("com.facebook.auth.login", "com.facebook.wakizashi", 1),
    FACEBOOK_LITE("com.facebook.lite", "com.facebook.lite", 2),
    INSTAGRAM("www.instagram.com", "com.instagram.android", 3),
    INSTAGRAM_WITH_V2_PROVIDER("www.instagram.com", "com.instagram.android", 4),
    MLITE("com.facebook.mlite", "com.facebook.mlite", 5),
    MESSENGER("com.facebook.messenger", "com.facebook.orca", 6),
    MESSENGER_WITH_LITE_PROVIDER("com.facebook.messenger", "com.facebook.orca", 7),
    OCULUS("com.oculus.twilight", "com.oculus.twilight", 8),
    MWA("com.facebook.stella", "com.facebook.stella", 9),
    MWA_DEBUG("com.facebook.stella_debug", "com.facebook.stella_debug", 10),
    UNKNOWN("unknown", "unknown", 11);
    
    public final String mAccountManagerType;
    public final String mPackageName;
    public final String mPrefPrefix;

    /* access modifiers changed from: public */
    C00(String str, String str2, int i) {
        this.mPrefPrefix = r2;
        this.mAccountManagerType = str;
        this.mPackageName = str2;
    }
}
