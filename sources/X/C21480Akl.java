package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.Akl  reason: case insensitive filesystem */
public class C21480Akl implements Comparator {
    public final int A00;
    public final String A01;

    public C21480Akl(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public final int compare(Object obj, Object obj2) {
        String str;
        String str2;
        int i;
        String str3;
        int i2;
        switch (this.A00) {
            case 0:
                str = this.A01;
                str2 = "$1";
                i = Integer.parseInt(((File) obj).getName().replaceAll(str, str2));
                str3 = ((File) obj2).getName();
                break;
            case 1:
                str = this.A01;
                str2 = "$1";
                i = Integer.parseInt(((File) obj2).getName().replaceAll(str, str2));
                str3 = ((File) obj).getName();
                break;
            default:
                String str4 = this.A01;
                Integer A012 = C196679vS.A01(str4, (String) obj);
                Integer A013 = C196679vS.A01(str4, (String) obj2);
                int i3 = 1;
                if (A012 != null) {
                    i2 = A012.intValue();
                } else {
                    i2 = 1;
                }
                Integer valueOf = Integer.valueOf(i2);
                if (A013 != null) {
                    i3 = A013.intValue();
                }
                Integer valueOf2 = Integer.valueOf(i3);
                if (i2 <= i3) {
                    valueOf = valueOf2;
                }
                return valueOf.intValue();
        }
        return AnonymousClass1XO.A00(i, Integer.parseInt(str3.replaceAll(str, str2)));
    }
}
