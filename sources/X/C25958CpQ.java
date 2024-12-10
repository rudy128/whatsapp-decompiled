package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.CpQ  reason: case insensitive filesystem */
public class C25958CpQ {
    public int A00;
    public int A01;
    public String A02 = "";
    public String A03;
    public String[] A04;
    public String[] A05;
    public final Locale A06;
    public final Locale A07;

    private void A00() {
        ArrayList arrayList;
        Locale locale = this.A06;
        String A012 = AnonymousClass1X0.A01(locale);
        Locale locale2 = this.A07;
        String A013 = AnonymousClass1X0.A01(locale2);
        boolean equals = A012.equals(A013);
        try {
            String[] strArr = (String[]) C25465CgK.A03.A01(this.A03);
            if (strArr == null) {
                arrayList = Collections.emptyList();
            } else {
                ArrayList A0z = C17880vN.A0z(r2);
                for (String A002 : strArr) {
                    A0z.add(C25351CeA.A00(A002));
                }
                arrayList = A0z;
            }
        } catch (IllegalArgumentException unused) {
            arrayList = Collections.emptyList();
        }
        if (!arrayList.isEmpty() || !equals) {
            int size = arrayList.size() + 2;
            ArrayList A0z2 = C17880vN.A0z(size);
            ArrayList A0z3 = C17880vN.A0z(size);
            A0z2.add(C25351CeA.A01(locale2));
            A0z3.add(locale2.toLanguageTag());
            int i = -1;
            if (equals) {
                i = 0;
            }
            this.A00 = i;
            StringBuffer A0s = BE6.A0s();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                Locale forLanguageTag = Locale.forLanguageTag(A0v);
                String A014 = AnonymousClass1X0.A01(forLanguageTag);
                if (!A014.equals(A013)) {
                    C25950CpI cpI = C25950CpI.A03;
                    if (!C25950CpI.A00(C25950CpI.A04, AnonymousClass1X0.A01(forLanguageTag))) {
                        C17900vP.A0f("whatsapplocaledata/getlanguagepreferencesdata/non-renderable language: ", A0v, AnonymousClass000.A10());
                        A0s.append(A0v);
                        A0s.append(",");
                    } else {
                        A0z2.add(C25351CeA.A01(forLanguageTag));
                        A0z3.add(forLanguageTag.toLanguageTag());
                        if (this.A00 == -1 && A014.equals(A012)) {
                            this.A00 = AnonymousClass000.A0Q(A0z2);
                        }
                    }
                }
            }
            if (this.A00 == -1) {
                A0z2.add(C25351CeA.A01(locale));
                A0z3.add(locale.toLanguageTag());
                this.A00 = AnonymousClass000.A0Q(A0z2);
            }
            if (A0s.length() > 0) {
                A0s.setLength(A0s.length() - 1);
                this.A02 = A0s.toString();
            }
            int size2 = A0z2.size();
            this.A01 = size2;
            if (size2 >= 2) {
                this.A04 = C17890vO.A1b(A0z2, 0);
                this.A05 = C17890vO.A1b(A0z3, 0);
                return;
            }
        }
        this.A01 = 0;
    }

    public C25958CpQ(String str, Locale locale, Locale locale2) {
        this.A03 = str;
        this.A07 = locale;
        this.A06 = locale2;
        A00();
    }

    public C25958CpQ(String str, String str2, Locale locale, Locale locale2) {
        String A012;
        if (!"1".equals(str) || str2.length() != 10 || !"55501".equals(str2.substring(3, 8))) {
            A012 = AnonymousClass1K3.A01(str, str2);
        } else {
            A012 = "QQ";
        }
        this.A03 = A012;
        this.A07 = locale;
        this.A06 = locale2;
        A00();
    }
}
