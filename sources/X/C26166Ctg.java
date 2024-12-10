package X;

import android.content.Context;
import android.content.res.Resources;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.Ctg  reason: case insensitive filesystem */
public abstract class C26166Ctg {
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A02(X.AnonymousClass11S r4, X.AnonymousClass11C r5, X.C18000vb r6, X.AnonymousClass1DC r7) {
        /*
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.C18070vi.A0o(r5, r7, r6)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = X.C25351CeA.A01(r1)
            X.C18070vi.A0X(r2)
            java.util.HashSet r0 = X.AnonymousClass1X0.A00
            java.lang.String r1 = r1.toLanguageTag()
            X.C18070vi.A0X(r1)
            X.4To r0 = new X.4To
            r0.<init>(r2, r1)
            r3.add(r0)
            java.util.Locale r1 = A03()
            boolean r0 = A04()
            if (r0 != 0) goto L_0x0047
            java.lang.String r2 = X.C25351CeA.A01(r1)
            X.C18070vi.A0X(r2)
            java.lang.String r1 = r1.toLanguageTag()
            X.C18070vi.A0X(r1)
            X.4To r0 = new X.4To
            r0.<init>(r2, r1)
            r3.add(r0)
        L_0x0047:
            r4.A0I()
            com.whatsapp.Me r0 = r4.A00
            if (r0 == 0) goto L_0x009d
            java.lang.String r5 = r0.cc
            java.lang.String r2 = r0.number
            java.util.Locale r1 = r6.A05
            java.util.Locale r0 = r6.A04
            X.CpQ r4 = new X.CpQ
            r4.<init>(r5, r2, r1, r0)
        L_0x005b:
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x00cb
            r5 = 0
        L_0x0060:
            int r0 = r4.A01
            if (r5 >= r0) goto L_0x00d0
            java.lang.String[] r0 = r4.A04
            r2 = r0[r5]
            X.C18070vi.A0U(r2)
            java.util.Iterator r1 = r3.iterator()
        L_0x006f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r1.next()
            X.4To r0 = (X.C86914To) r0
            java.lang.String r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r0, r2)
            if (r0 == 0) goto L_0x006f
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x0060
        L_0x0086:
            java.lang.String[] r0 = r4.A04
            r2 = r0[r5]
            X.C18070vi.A0U(r2)
            java.lang.String[] r0 = r4.A05
            r1 = r0[r5]
            X.C18070vi.A0U(r1)
            X.4To r0 = new X.4To
            r0.<init>(r2, r1)
            r3.add(r0)
            goto L_0x0083
        L_0x009d:
            android.telephony.TelephonyManager r0 = r5.A0K()
            if (r0 == 0) goto L_0x00cb
            java.lang.String r1 = r0.getSimCountryIso()
            if (r1 == 0) goto L_0x00cb
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00cb
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.C18070vi.A0X(r0)
            java.lang.String r2 = r1.toUpperCase(r0)
            X.C18070vi.A0X(r2)
            java.util.Locale r1 = A03()
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.CpQ r4 = new X.CpQ
            r4.<init>(r2, r1, r0)
            goto L_0x005b
        L_0x00cb:
            java.lang.String r0 = "LanguageSelectorUtils/error getting locale data"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00d0:
            java.util.Set r0 = X.C25465CgK.A05
            X.C18070vi.A0Z(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x00d9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0110
            java.lang.String r4 = X.C17880vN.A0v(r5)
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r4)
            java.lang.String r2 = X.C25351CeA.A01(r0)
            X.C18070vi.A0X(r2)
            java.util.Iterator r1 = r3.iterator()
        L_0x00f2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0107
            java.lang.Object r0 = r1.next()
            X.4To r0 = (X.C86914To) r0
            java.lang.String r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r0, r2)
            if (r0 == 0) goto L_0x00f2
            goto L_0x00d9
        L_0x0107:
            X.4To r0 = new X.4To
            r0.<init>(r2, r4)
            r3.add(r0)
            goto L_0x00d9
        L_0x0110:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26166Ctg.A02(X.11S, X.11C, X.0vb, X.1DC):java.util.ArrayList");
    }

    public static final String A01(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        String upperCase = C108955ca.A0q(0, 1, str).toUpperCase(Locale.ROOT);
        C18070vi.A0X(upperCase);
        A10.append(upperCase);
        String substring = str.substring(1);
        C18070vi.A0X(substring);
        return AnonymousClass000.A0y(substring, A10);
    }

    public static final String A00(Context context, String str, Locale locale, Locale locale2) {
        String str2;
        int i;
        C18070vi.A0k(locale2, context);
        String language = locale.getLanguage();
        if (language != null) {
            int hashCode = language.hashCode();
            if (hashCode != 3116) {
                if (hashCode != 3588) {
                    if (hashCode == 3886 && language.equals("zh")) {
                        HashSet hashSet = AnonymousClass1X0.A00;
                        if ("HK".equals(locale.getCountry())) {
                            i = 2131891589;
                        } else {
                            i = 2131891590;
                            if ("Hans".equals(AnonymousClass1X0.A02(locale))) {
                                i = 2131891588;
                            }
                        }
                    }
                } else if (language.equals("pt")) {
                    HashSet hashSet2 = AnonymousClass1X0.A00;
                    i = 2131891586;
                    if (AnonymousClass1XF.A00.contains(locale.getCountry())) {
                        i = 2131891587;
                    }
                }
                String string = context.getString(i);
                C18070vi.A0b(string);
                return string;
            } else if (language.equals("am") && C18070vi.A18(locale2.getLanguage(), "om")) {
                str2 = context.getString(2131898696);
                C18070vi.A0X(str2);
                return str2;
            }
        }
        HashSet hashSet3 = AnonymousClass1X0.A00;
        str2 = Locale.forLanguageTag(str).getDisplayLanguage(locale2);
        C18070vi.A0X(str2);
        return str2;
    }

    public static final Locale A03() {
        Locale locale = Resources.getSystem().getConfiguration().locale;
        C18070vi.A0W(locale);
        return locale;
    }

    public static final boolean A04() {
        return C18070vi.A18(Locale.getDefault().getLanguage(), A03().getLanguage());
    }
}
