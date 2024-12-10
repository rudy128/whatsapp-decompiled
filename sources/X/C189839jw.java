package X;

import android.content.Context;
import java.util.Arrays;

/* renamed from: X.9jw  reason: invalid class name and case insensitive filesystem */
public class C189839jw {
    public final BA8 A00;
    public final C22410B6p A01;

    public void A00(Context context, A5J a5j, String str) {
        int i = a5j.A00;
        String[] A04 = C20084A6l.A04(context, i);
        int length = A04.length;
        int i2 = 0;
        if (length == 1) {
            this.A01.BCd(context, A04[0], str);
            return;
        }
        while (i2 < length) {
            try {
                this.A01.BCd(context, A04[i2], str);
                return;
            } catch (C21585AmZ unused) {
                i2++;
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FBPermission '");
        A10.append(str);
        A10.append("' was not granted to UID '");
        A10.append(i);
        A10.append("' (packages: '");
        A10.append(Arrays.toString(A04));
        throw new C21585AmZ(AnonymousClass000.A0y("')", A10));
    }

    public C189839jw(BA8 ba8, C22410B6p b6p) {
        this.A01 = b6p;
        this.A00 = ba8;
    }
}
