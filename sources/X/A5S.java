package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class A5S {
    public SharedPreferences A00;
    public final AnonymousClass16B A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final String A04;

    public A5S(AnonymousClass16B r2, AnonymousClass00H r3, AnonymousClass00H r4, String str) {
        C18070vi.A0d(r2, 4);
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = str;
        this.A01 = r2;
    }

    private final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = ((C18010vc) this.A03.get()).A05(this.A04);
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public final void A06(UserJid userJid) {
        String string;
        C18070vi.A0d(userJid, 0);
        String rawString = userJid.getRawString();
        SharedPreferences A012 = A01();
        if (A012 != null && (string = A012.getString(rawString, (String) null)) != null) {
            Object BLh = this.A01.BLh(string);
            C18070vi.A0X(BLh);
            C194049r5 A032 = A03(BLh);
            UserJid userJid2 = A032.A01;
            C18070vi.A0d(userJid2, 0);
            A02(userJid2.getRawString());
            AnonymousClass1E2 r0 = A032.A00;
            if (r0 != null) {
                A02(r0.getRawString());
            }
        }
    }

    public final void A07(AnonymousClass2RU r5, String str) {
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append('/');
        String A0y = AnonymousClass000.A0y(r5.getMessage(), A11);
        ((AnonymousClass190) this.A02.get()).A0G("JidKeyedDoubleWriteSharedPreferencesStoreTransformationException", A0y, true);
        C17900vP.A0h("JidKeyedDoubleWriteSharedPreferencesStore/", A0y, AnonymousClass000.A10(), r5);
    }

    public C194049r5 A03(Object obj) {
        UserJid userJid;
        AnonymousClass1E2 r1;
        if (this instanceof C48122Lg) {
            C194349ra r4 = (C194349ra) obj;
            C18070vi.A0d(r4, 0);
            userJid = r4.A01;
            r1 = r4.A00;
        } else if (this instanceof C48112Lf) {
            A1A a1a = (A1A) obj;
            C18070vi.A0d(a1a, 0);
            userJid = a1a.A03;
            r1 = a1a.A02;
        } else if (this instanceof C48102Le) {
            AnonymousClass8oQ r42 = (AnonymousClass8oQ) obj;
            C18070vi.A0d(r42, 0);
            userJid = r42.A00;
            r1 = r42.A01;
        } else {
            AnonymousClass8oR r43 = (AnonymousClass8oR) obj;
            C18070vi.A0d(r43, 0);
            userJid = r43.A00;
            r1 = r43.A03;
        }
        return new C194049r5(r1, userJid);
    }

    private final void A02(String str) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor remove;
        SharedPreferences A012 = A01();
        if (A012 != null && (edit = A012.edit()) != null && (remove = edit.remove(str)) != null) {
            remove.apply();
        }
    }

    public final Object A04(UserJid userJid) {
        String A0d = AnonymousClass8BW.A0d(userJid);
        SharedPreferences A012 = A01();
        String str = null;
        if (A012 != null) {
            str = A012.getString(A0d, (String) null);
        }
        if (str == null) {
            return null;
        }
        try {
            return this.A01.BLh(str);
        } catch (AnonymousClass2RU e) {
            A07(e, "getObject");
            A06(userJid);
            return null;
        }
    }

    public final List A05() {
        SharedPreferences A012 = A01();
        if (A012 == null) {
            return C18460wS.A00;
        }
        ArrayList A13 = AnonymousClass000.A13();
        Map<String, ?> all = A012.getAll();
        Iterator A15 = AnonymousClass000.A15(all);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String A0x = C17880vN.A0x(A16);
            Object obj = all.get(A0x);
            if (obj != null) {
                try {
                    Object BLh = this.A01.BLh(obj.toString());
                    C18070vi.A0X(BLh);
                    A13.add(BLh);
                } catch (AnonymousClass2RU e) {
                    A07(e, "getAllObjects");
                    C18070vi.A0b(A0x);
                    A02(A0x);
                }
            } else {
                C17900vP.A0X(A16, "JidKeyedDoubleWriteSharedPreferencesStore/allObjects/ null pref value for key=", AnonymousClass000.A10());
            }
        }
        return A13;
    }

    public final void A08(Object obj) {
        SharedPreferences A012;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        SharedPreferences.Editor edit2;
        SharedPreferences.Editor putString2;
        try {
            C194049r5 A032 = A03(obj);
            String CPD = this.A01.CPD(obj);
            C18070vi.A0X(CPD);
            SharedPreferences A013 = A01();
            if (!(A013 == null || (edit2 = A013.edit()) == null || (putString2 = edit2.putString(AnonymousClass8BW.A0d(A032.A01), CPD)) == null)) {
                putString2.apply();
            }
            AnonymousClass1E2 r2 = A032.A00;
            if (r2 != null && (A012 = A01()) != null && (edit = A012.edit()) != null && (putString = edit.putString(r2.getRawString(), CPD)) != null) {
                putString.apply();
            }
        } catch (AnonymousClass2RU e) {
            A07(e, "saveObject");
        }
    }
}
