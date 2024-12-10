package X;

import android.text.Editable;
import android.util.Range;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.3V2  reason: invalid class name */
public final class AnonymousClass3V2 extends AnonymousClass1J2 {
    public boolean A00 = true;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0M((Object) null);
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final C446324e A03;
    public final AnonymousClass4JV A04;
    public final AnonymousClass4T1 A05 = new Object();
    public final AnonymousClass1BI A06;
    public final Set A07;
    public final C18100vl A08 = AnonymousClass1DF.A01(new C101235Bv(this));
    public final C18600wl A09;
    public final C19880zA A0A;
    public final C1408073d A0B;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4T1, java.lang.Object] */
    public AnonymousClass3V2(C19880zA r3, C446324e r4, AnonymousClass4JV r5, C1408073d r6, AnonymousClass1BI r7, Set set, C18600wl r9) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0p(r3, r5, r9);
        C18070vi.A0d(set, 6);
        this.A0B = r6;
        this.A0A = r3;
        this.A04 = r5;
        this.A09 = r9;
        this.A06 = r7;
        this.A07 = set;
        this.A03 = r4;
    }

    public static C41111vp A00(AnonymousClass3V2 r0) {
        return ((C93064iN) ((AnonymousClass4RB) r0.A08.getValue()).A03.getValue()).A04;
    }

    public final C108725cC A0T() {
        AnonymousClass4YH r1 = (AnonymousClass4YH) this.A01.A06();
        if (r1 != null) {
            return ((AnonymousClass4RB) this.A08.getValue()).A00(r1);
        }
        return null;
    }

    public final void A0U(Editable editable, UserJid userJid) {
        C446324e r0;
        Object next;
        AnonymousClass4YH r9;
        Object obj;
        String str;
        if (!A0V()) {
            C108725cC A0T = A0T();
            if (A0T != null) {
                A0T.Bqz();
                return;
            }
            return;
        }
        Editable editable2 = editable;
        if (editable == null || editable2.length() == 0 || (((r0 = this.A03) == null || !r0.A0I) && userJid == null)) {
            C108725cC A0T2 = A0T();
            if (A0T2 != null) {
                A0T2.Bqz();
            }
            this.A01.A0F((Object) null);
            C137196v4.A01(this.A02, (Object) null);
            this.A05.A01();
        } else {
            CharSequence charSequence = editable2;
            if (userJid != null) {
                int i = 0;
                C72783Nm[] r8 = (C72783Nm[]) editable2.getSpans(0, editable2.length(), C72783Nm.class);
                C18070vi.A0b(r8);
                int length = r8.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C72783Nm r3 = r8[i];
                    C22951Dx r2 = PhoneUserJid.Companion;
                    String str2 = r3.A01;
                    C18070vi.A0W(str2);
                    String substring = str2.substring(1);
                    C18070vi.A0X(substring);
                    if (C42701yb.A01(r2.A03(substring)) && editable2.getSpanStart(r3.A00) == 0) {
                        charSequence = editable2.subSequence(editable2.getSpanEnd(r3), editable2.length());
                        break;
                    }
                    i++;
                }
            }
            String obj2 = charSequence.toString();
            LinkedHashSet A14 = C17880vN.A14();
            List A0R = AnonymousClass1YF.A0R(AnonymousClass1YF.A0I(obj2), new char[]{' '});
            for (AnonymousClass4YH r11 : this.A07) {
                Iterator it = r11.A01.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String A0v = C17880vN.A0v(it);
                        List A0R2 = AnonymousClass1YF.A0R(A0v, new char[]{' '});
                        if (A0R.size() >= A0R2.size()) {
                            Iterator it2 = A0R.iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Object next2 = it2.next();
                                int i3 = i2 + 1;
                                if (i2 >= 0) {
                                    String str3 = (String) next2;
                                    if (A0R2.size() >= i2 + 1) {
                                        if (!AnonymousClass1YE.A09(C17880vN.A0w(A0R2, i2), str3, true)) {
                                            break;
                                        }
                                        i2 = i3;
                                    } else {
                                        break;
                                    }
                                } else {
                                    AnonymousClass1ZU.A0B();
                                    throw null;
                                }
                            }
                            AnonymousClass1D6.A02(r11, A0v, A14);
                        }
                    }
                }
            }
            Iterator it3 = A14.iterator();
            if (!it3.hasNext()) {
                next = null;
            } else {
                next = it3.next();
                if (it3.hasNext()) {
                    int i4 = ((AnonymousClass4YH) ((AnonymousClass1D6) next).first).A00;
                    do {
                        Object next3 = it3.next();
                        if (i4 < ((AnonymousClass4YH) ((AnonymousClass1D6) next3).first).A00) {
                            next = next3;
                            i4 = 1;
                        }
                    } while (it3.hasNext());
                }
            }
            AnonymousClass1D6 r6 = (AnonymousClass1D6) next;
            if (r6 != null) {
                r9 = (AnonymousClass4YH) r6.first;
                if (r9 != null && !C18070vi.A18(this.A01.A06(), r9)) {
                    ((AnonymousClass4RB) this.A08.getValue()).A00(r9).Bkw(this);
                }
            } else {
                r9 = null;
            }
            AnonymousClass1DT r22 = this.A01;
            AnonymousClass4YH r1 = (AnonymousClass4YH) r22.A06();
            if (r1 != null && !r1.equals(r9)) {
                ((AnonymousClass4RB) this.A08.getValue()).A00(r1).Bqz();
            }
            if (r6 != null) {
                obj = r6.first;
            } else {
                obj = null;
            }
            r22.A0F(obj);
            if (r6 == null || (str = (String) r6.second) == null) {
                this.A02.A0F((Object) null);
            } else {
                int A0F = AnonymousClass1YF.A0F(editable2.toString(), str, 0, true);
                this.A02.A0F(new Range(Integer.valueOf(A0F), Integer.valueOf(A0F + str.length())));
            }
        }
        C108725cC A0T3 = A0T();
        if (A0T3 != null) {
            A0T3.Bsj(editable2);
        }
    }

    public final boolean A0V() {
        AnonymousClass4W5.A01(this.A0A);
        if (!this.A0B.A09() || !this.A00) {
            return false;
        }
        return true;
    }

    public void A0S() {
        C108725cC A0T = A0T();
        if (A0T != null) {
            A0T.Bqz();
        }
    }
}
