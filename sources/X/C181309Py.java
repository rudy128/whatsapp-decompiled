package X;

/* renamed from: X.9Py  reason: invalid class name and case insensitive filesystem */
public abstract class C181309Py {
    public static final AnonymousClass9KE A00(AnonymousClass201 r2) {
        int A04 = C108955ca.A04(r2, 0);
        if (A04 == 0) {
            return AnonymousClass9KE.DEFAULT_ALL_MESSAGES;
        }
        if (A04 == 1) {
            return AnonymousClass9KE.ALL_MESSAGES;
        }
        if (A04 == 2) {
            return AnonymousClass9KE.HIGHLIGHTS;
        }
        if (A04 == 3) {
            return AnonymousClass9KE.DEFAULT_HIGHLIGHTS;
        }
        throw AnonymousClass8BX.A0V(r2, "NotificationActivityLevelMutationHandler/toSyncDNotificationSettingType/Missing SyncD mapping for NotificationActivityLevel = ", AnonymousClass000.A10());
    }
}
