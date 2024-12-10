package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.23Y  reason: invalid class name */
public final class AnonymousClass23Y {
    public final C24811Lt A00;

    public AnonymousClass23Y(C24811Lt r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final C446324e A00(Cursor cursor, UserJid userJid, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        String str;
        String string;
        String string2;
        String string3;
        String string4;
        boolean A01;
        String string5;
        String string6;
        String string7;
        Long valueOf;
        Long valueOf2;
        Boolean bool;
        long j;
        Cursor cursor2 = cursor;
        int i20 = cursor2.getInt(i);
        String string8 = cursor2.getString(i2);
        C18070vi.A0X(string8);
        boolean A012 = AnonymousClass24X.A01(cursor2, i3);
        String string9 = cursor2.getString(i4);
        C18070vi.A0X(string9);
        int i21 = i5;
        String str2 = null;
        if (cursor2.isNull(i21) || (str = cursor2.getString(i21)) == null) {
            str = "";
        }
        String string10 = cursor2.getString(i6);
        C18070vi.A0X(string10);
        int i22 = i7;
        if (cursor2.isNull(i22)) {
            string = null;
        } else {
            string = cursor2.getString(i22);
        }
        int i23 = i8;
        if (cursor2.isNull(i23)) {
            string2 = null;
        } else {
            string2 = cursor2.getString(i23);
        }
        int i24 = i9;
        if (cursor2.isNull(i24)) {
            string3 = null;
        } else {
            string3 = cursor2.getString(i24);
        }
        int i25 = i10;
        if (cursor2.isNull(i25)) {
            string4 = null;
        } else {
            string4 = cursor2.getString(i25);
        }
        int i26 = i12;
        boolean z = true;
        if (cursor2.isNull(i26)) {
            A01 = true;
        } else {
            A01 = AnonymousClass24X.A01(cursor2, i26);
        }
        int i27 = i13;
        if (cursor2.isNull(i27)) {
            string5 = null;
        } else {
            string5 = cursor2.getString(i27);
        }
        int i28 = i14;
        if (cursor2.isNull(i28)) {
            string6 = null;
        } else {
            string6 = cursor2.getString(i28);
        }
        int i29 = i15;
        if (cursor2.isNull(i29)) {
            string7 = null;
        } else {
            string7 = cursor2.getString(i29);
        }
        int i30 = cursor2.getInt(i16);
        int i31 = i17;
        if (cursor2.isNull(i31)) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(cursor2.getLong(i31));
        }
        int i32 = i18;
        if (cursor2.isNull(i32)) {
            valueOf2 = null;
        } else {
            valueOf2 = Long.valueOf(cursor2.getLong(i32));
        }
        Integer A002 = AnonymousClass24X.A00(cursor2, i19);
        if (A002 != null) {
            if (A002.intValue() != 1) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        int i33 = i11;
        if (!cursor2.isNull(i33)) {
            str2 = cursor2.getString(i33);
        }
        ArrayList A013 = AnonymousClass24Y.A01(string);
        ArrayList A014 = C446024b.A01(string4);
        long j2 = 0;
        if (valueOf != null) {
            j = valueOf.longValue();
        } else {
            j = 0;
        }
        if (valueOf2 != null) {
            j2 = valueOf2.longValue();
        }
        return new C446324e(userJid, bool, string8, string9, str, string10, str2, string2, string3, string5, string6, string7, A013, A014, i20, i30, j, j2, A012, A01);
    }
}
