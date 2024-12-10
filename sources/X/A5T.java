package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public abstract class A5T {
    public SharedPreferences A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass16B A02;
    public final C18010vc A03;
    public final String A04;

    private synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A03.A05(this.A04);
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public String A03(Object obj) {
        Jid jid;
        if (this instanceof C48132Lh) {
            C194919sV r2 = (C194919sV) obj;
            C18070vi.A0d(r2, 0);
            jid = r2.A01;
        } else if (this instanceof C1770196v) {
            C194329rY r22 = (C194329rY) obj;
            C18070vi.A0d(r22, 0);
            jid = r22.A01;
        } else if (this instanceof C1770096u) {
            C19977A1n a1n = (C19977A1n) obj;
            C18070vi.A0d(a1n, 0);
            return a1n.A02;
        } else if (this instanceof C1769996t) {
            C193589qL r23 = (C193589qL) obj;
            C18070vi.A0d(r23, 0);
            jid = r23.A01;
        } else if (this instanceof C1769896s) {
            C195179sv r24 = (C195179sv) obj;
            C18070vi.A0d(r24, 0);
            jid = r24.A02;
        } else {
            C193559qI r25 = (C193559qI) obj;
            C18070vi.A0d(r25, 0);
            jid = r25.A01;
        }
        return jid.getRawString();
    }

    public A5T(AnonymousClass190 r1, AnonymousClass16B r2, C18010vc r3, String str) {
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = str;
        this.A02 = r2;
    }

    public static String A01(C1770196v r0, UserJid userJid) {
        C194329rY A08 = r0.A08(userJid);
        if (A08 != null) {
            return A08.A02;
        }
        return null;
    }

    public Object A02(UserJid userJid) {
        String string = A00().getString(AnonymousClass8BW.A0d(userJid), (String) null);
        if (string != null) {
            try {
                return this.A02.BLh(string);
            } catch (AnonymousClass2RU e) {
                A06(e, "getObject");
                A05(userJid);
            }
        }
        return null;
    }

    public ArrayList A04() {
        ArrayList A13 = AnonymousClass000.A13();
        Map<String, ?> all = A00().getAll();
        Iterator A15 = AnonymousClass000.A15(all);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String A0x = C17880vN.A0x(A16);
            Object obj = all.get(A0x);
            if (obj != null) {
                try {
                    A13.add(this.A02.BLh(obj.toString()));
                } catch (AnonymousClass2RU e) {
                    A06(e, "getAllObjects");
                    C17880vN.A1B(A00().edit(), A0x);
                }
            } else {
                C17900vP.A0X(A16, "JidKeyedSharedPreferencesStore/getAllEntryPoints/ null pref value for key=", AnonymousClass000.A10());
            }
        }
        return A13;
    }

    public void A05(UserJid userJid) {
        C17880vN.A1B(A00().edit(), AnonymousClass8BW.A0d(userJid));
    }

    public void A06(AnonymousClass2RU r5, String str) {
        String A0C = C17900vP.A0C("/", AnonymousClass000.A11(str), r5);
        this.A01.A0G("JidKeyedSharedPreferencesStoreTransformationException", A0C, true);
        C17900vP.A0h("JidKeyedSharedPreferencesStore/", A0C, AnonymousClass000.A10(), r5);
    }

    public void A07(Object obj) {
        try {
            C17880vN.A1E(A00().edit(), A03(obj), this.A02.CPD(obj));
        } catch (AnonymousClass2RU e) {
            A06(e, "saveObject");
        }
    }
}
