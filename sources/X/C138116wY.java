package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6wY  reason: invalid class name and case insensitive filesystem */
public final class C138116wY {
    public static final List A02;
    public static final List A03;
    public static final Map A04;
    public final C200710s A00;
    public final C126846dO A01;

    static {
        String[] strArr = new String[5];
        strArr[0] = "facebook";
        strArr[1] = "fb";
        strArr[2] = "fblite";
        strArr[3] = "fb-messenger";
        A03 = C18070vi.A0O("instagram", strArr, 4);
        String[] strArr2 = new String[5];
        strArr2[0] = "com.facebook.wakizashi";
        strArr2[1] = "com.facebook.katana";
        strArr2[2] = "com.facebook.lite";
        strArr2[3] = "com.facebook.orca";
        A02 = C18070vi.A0O("com.instagram.android", strArr2, 4);
        AnonymousClass1D6[] r3 = new AnonymousClass1D6[10];
        AnonymousClass6R2 r0 = AnonymousClass6R2.FACEBOOK;
        AnonymousClass1D6.A03("facebook", r0, r3, 0);
        AnonymousClass1D6.A03("fb", r0, r3, 1);
        AnonymousClass1D6.A03("com.facebook.wakizashi", r0, r3, 2);
        AnonymousClass1D6.A03("com.facebook.katana", r0, r3, 3);
        AnonymousClass6R2 r2 = AnonymousClass6R2.FBLITE;
        r3[4] = AnonymousClass1D6.A01("fblite", r2);
        r3[5] = AnonymousClass1D6.A01("com.facebook.lite", r2);
        AnonymousClass6R2 r22 = AnonymousClass6R2.MESSENGER;
        r3[6] = AnonymousClass1D6.A01("fb-messenger", r22);
        r3[7] = AnonymousClass1D6.A01("com.facebook.orca", r22);
        AnonymousClass6R2 r23 = AnonymousClass6R2.INSTAGRAM;
        r3[8] = AnonymousClass1D6.A01("instagram", r23);
        r3[9] = AnonymousClass1D6.A01("com.instagram.android", r23);
        A04 = AnonymousClass1D7.A0B(r3);
    }

    public C138116wY(AnonymousClass10I r2, C126846dO r3) {
        C18070vi.A0j(r2, r3);
        this.A01 = r3;
        this.A00 = C200710s.A00(r2);
    }
}
