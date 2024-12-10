package X;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: X.73I  reason: invalid class name */
public abstract class AnonymousClass73I {
    public static final String[] A00() {
        LinkedHashSet A14 = C17880vN.A14();
        C29401cD.A0L(A14, A01());
        C29401cD.A0L(A14, A02());
        return (String[]) A14.toArray(new String[0]);
    }

    public static final String[] A01() {
        ArrayList A13 = AnonymousClass000.A13();
        if (!AnonymousClass112.A09() && !AnonymousClass112.A07()) {
            A13.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        A13.add("android.permission.CAMERA");
        if (!AnonymousClass112.A07()) {
            A13.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return C17890vO.A1b(A13, 0);
    }

    public static final String[] A02() {
        String str;
        ArrayList A13 = AnonymousClass000.A13();
        if (AnonymousClass112.A09()) {
            A13.add("android.permission.READ_MEDIA_IMAGES");
            str = "android.permission.READ_MEDIA_VIDEO";
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        A13.add(str);
        if (AnonymousClass112.A0A()) {
            A13.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        }
        if (!AnonymousClass112.A07()) {
            A13.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return C17890vO.A1b(A13, 0);
    }

    public static final String[] A03() {
        String str;
        ArrayList A13 = AnonymousClass000.A13();
        if (AnonymousClass112.A09()) {
            str = "android.permission.READ_MEDIA_AUDIO";
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        A13.add(str);
        if (!AnonymousClass112.A07()) {
            A13.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return C17890vO.A1b(A13, 0);
    }

    public static final String[] A04() {
        LinkedHashSet A14 = C17880vN.A14();
        C29401cD.A0L(A14, A02());
        C29401cD.A0L(A14, A03());
        return (String[]) A14.toArray(new String[0]);
    }
}
