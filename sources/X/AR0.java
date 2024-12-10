package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

public final class AR0 implements BCT {
    public SharedPreferences A00;
    public final AnonymousClass16B A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    private final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = ((C18010vc) this.A04.get()).A05("ctwa_ads_private_stats_conversion_info");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public final void A04(AnonymousClass2RU r5, String str) {
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append('/');
        String A0y = AnonymousClass000.A0y(r5.getMessage(), A11);
        ((AnonymousClass190) this.A03.get()).A0G("JidKeyedLidAwareSharedPreferencesStoreTransformationException", A0y, true);
        C17900vP.A0h("JidKeyedLidAwareSharedPreferencesStore/", A0y, AnonymousClass000.A10(), r5);
    }

    public final Object A02(UserJid userJid) {
        String str;
        Jid A0C;
        if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(this.A02), 11170)) {
            C18070vi.A0d(userJid, 0);
            String rawString = userJid.getRawString();
            SharedPreferences A002 = A00();
            if (A002 == null || (str = A002.getString(rawString, (String) null)) == null) {
                if (userJid instanceof AnonymousClass1E2) {
                    A0C = ((C24751Ln) this.A05.get()).A0D((AnonymousClass1E1) userJid);
                } else {
                    if (userJid instanceof PhoneUserJid) {
                        A0C = ((C24751Ln) this.A05.get()).A0C((PhoneUserJid) userJid);
                    }
                    str = null;
                }
                if (A0C != null) {
                    Jid jid = A0C;
                    C18070vi.A0d(jid, 0);
                    String rawString2 = jid.getRawString();
                    SharedPreferences A003 = A00();
                    str = null;
                    if (A003 != null) {
                        str = A003.getString(rawString2, (String) null);
                    }
                }
                str = null;
            }
        } else {
            String A0d = AnonymousClass8BW.A0d(userJid);
            SharedPreferences A004 = A00();
            if (A004 != null) {
                str = A004.getString(A0d, (String) null);
            } else {
                str = null;
            }
        }
        if (str != null) {
            try {
                return this.A01.BLh(str);
            } catch (AnonymousClass2RU e) {
                A04(e, "getObject");
                A03(userJid);
            }
        }
        return null;
    }

    public final void A03(UserJid userJid) {
        String A0d;
        Jid A0C;
        if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(this.A02), 11170)) {
            C18070vi.A0d(userJid, 0);
            String rawString = userJid.getRawString();
            SharedPreferences A002 = A00();
            if (A002 != null && A002.contains(rawString)) {
                A01(userJid.getRawString());
            }
            if (userJid instanceof AnonymousClass1E2) {
                A0C = ((C24751Ln) this.A05.get()).A0D((AnonymousClass1E1) userJid);
            } else if (userJid instanceof PhoneUserJid) {
                A0C = ((C24751Ln) this.A05.get()).A0C((PhoneUserJid) userJid);
            } else {
                return;
            }
            if (A0C != null) {
                Jid jid = A0C;
                C18070vi.A0d(jid, 0);
                A0d = jid.getRawString();
            } else {
                return;
            }
        } else {
            A0d = AnonymousClass8BW.A0d(userJid);
        }
        A01(A0d);
    }

    public /* bridge */ /* synthetic */ void CGg(AnonymousClass8oS r4) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        C170058of r42 = (C170058of) r4;
        try {
            String rawString = r42.A01.A00.getRawString();
            String CPD = this.A01.CPD(r42);
            C18070vi.A0X(CPD);
            SharedPreferences A002 = A00();
            if (A002 != null && (edit = A002.edit()) != null && (putString = edit.putString(rawString, CPD)) != null) {
                putString.apply();
            }
        } catch (AnonymousClass2RU e) {
            A04(e, "saveObject");
        }
    }

    public AR0(AnonymousClass16B r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r3, r4, r5, r1);
        this.A02 = r2;
        this.A05 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r1;
    }

    private final void A01(String str) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor remove;
        SharedPreferences A002 = A00();
        if (A002 != null && (edit = A002.edit()) != null && (remove = edit.remove(str)) != null) {
            remove.apply();
        }
    }

    public void BIF(UserJid userJid) {
        A03(userJid);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List BMq() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.A00()
            if (r0 == 0) goto L_0x004e
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Map r5 = r0.getAll()
            java.util.Iterator r4 = X.AnonymousClass000.A15(r5)
        L_0x0012:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0050
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r4)
            java.lang.String r2 = X.C17880vN.A0x(r3)
            java.lang.Object r0 = r5.get(r2)
            if (r0 == 0) goto L_0x0044
            X.16B r1 = r7.A01     // Catch:{ 2RU -> 0x0037 }
            java.lang.String r0 = r0.toString()     // Catch:{ 2RU -> 0x0037 }
            java.lang.Object r0 = r1.BLh(r0)     // Catch:{ 2RU -> 0x0037 }
            X.C18070vi.A0X(r0)     // Catch:{ 2RU -> 0x0037 }
            r6.add(r0)     // Catch:{ 2RU -> 0x0037 }
            goto L_0x0012
        L_0x0037:
            r1 = move-exception
            java.lang.String r0 = "getAllObjects"
            r7.A04(r1, r0)
            X.C18070vi.A0b(r2)
            r7.A01(r2)
            goto L_0x0012
        L_0x0044:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "JidKeyedLidAwareSharedPreferencesStore/getAllEntryPoints/ null pref value for key="
            X.C17900vP.A0X(r3, r0, r1)
            goto L_0x0012
        L_0x004e:
            X.0wS r6 = X.C18460wS.A00
        L_0x0050:
            java.util.List r0 = X.C29431cG.A0q(r6)
            java.util.List r0 = X.C29431cG.A0t(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AR0.BMq():java.util.List");
    }

    public /* bridge */ /* synthetic */ AnonymousClass8oS BPQ(UserJid userJid) {
        return (AnonymousClass8oS) A02(userJid);
    }
}
