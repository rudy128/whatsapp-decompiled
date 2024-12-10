package X;

/* renamed from: X.9Nr  reason: invalid class name and case insensitive filesystem */
public abstract class C180729Nr {
    public String A00() {
        switch (((AnonymousClass8QV) this).A00) {
            case 0:
                return "com.facebook.katana";
            case 1:
                return "com.facebook.lite";
            case 2:
                return "com.facebook.mlite";
            case 3:
                return "com.facebook.orca";
            case 4:
                return "com.instagram.android";
            case 5:
                return "com.instagram.lite";
            case 6:
                return "com.instagram.barcelona";
            default:
                return "com.whatsapp";
        }
    }

    public String toString() {
        switch (((AnonymousClass8QV) this).A00) {
            case 0:
                return "Facebook";
            case 1:
                return "Facebook Lite";
            case 2:
                return "Messenger Lite";
            case 3:
                return "Messenger";
            case 4:
                return "Instagram";
            case 5:
                return "Instagram Lite";
            case 6:
                return "Threads";
            default:
                return "WhatsApp";
        }
    }
}
