package X;

import java.util.Locale;

/* renamed from: X.719  reason: invalid class name */
public final class AnonymousClass719 {
    public final C19830z4 A00;
    public final C18030ve A01;
    public final C40011u0 A02;

    public AnonymousClass719(C19830z4 r7, C18030ve r8, C40011u0 r9) {
        C18070vi.A0d(r7, 1);
        C18070vi.A0k(r8, r9);
        this.A00 = r7;
        this.A01 = r8;
        this.A02 = r9;
        AnonymousClass00H r5 = r7.A00;
        if (C17880vN.A0B(r5).getBoolean("nux_status_banner_ackd_in_updates", false) || C17880vN.A0B(r5).getBoolean("nux_updates_banner_ack", false)) {
            C19830z4 r3 = this.A00;
            C122536Qt r2 = C122536Qt.UPDATES;
            C17900vP.A0M(r3, A01(r2), 3);
            C17880vN.A1F(C19830z4.A00(r3), A00(r2), true);
        }
        r9.A00.get();
        if (C17880vN.A1W(C17880vN.A0B(r5), "pref_advertise_banner_status_main_shown")) {
            C19830z4 r32 = this.A00;
            C122536Qt r22 = C122536Qt.ADVERTISE;
            C17900vP.A0M(r32, A01(r22), 3);
            C17880vN.A1F(C19830z4.A00(r32), A00(r22), true);
        }
    }

    public static final String A00(C122536Qt r3) {
        StringBuilder A10 = AnonymousClass000.A10();
        String name = r3.name();
        Locale locale = Locale.getDefault();
        C18070vi.A0X(locale);
        String lowerCase = name.toLowerCase(locale);
        C18070vi.A0X(lowerCase);
        A10.append(lowerCase);
        return AnonymousClass000.A0y("_status_banner_ackd", A10);
    }

    public static final String A01(C122536Qt r3) {
        StringBuilder A10 = AnonymousClass000.A10();
        String name = r3.name();
        Locale locale = Locale.getDefault();
        C18070vi.A0X(locale);
        String lowerCase = name.toLowerCase(locale);
        C18070vi.A0X(lowerCase);
        A10.append(lowerCase);
        return AnonymousClass000.A0y("_status_banner_seen_count", A10);
    }
}
