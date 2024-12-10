package X;

import android.content.Context;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1PW  reason: invalid class name */
public final class AnonymousClass1PW {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass118 A05;
    public final AnonymousClass1MS A06;
    public final C18030ve A07;
    public final AnonymousClass1PV A08;
    public final AnonymousClass00H A09;

    public AnonymousClass1PW(AnonymousClass118 r2, AnonymousClass1MS r3, C18030ve r4, AnonymousClass1PV r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r7, 4);
        C18070vi.A0d(r8, 5);
        C18070vi.A0d(r9, 6);
        C18070vi.A0d(r10, 7);
        C18070vi.A0d(r5, 8);
        C18070vi.A0d(r11, 9);
        C18070vi.A0d(r3, 10);
        this.A05 = r2;
        this.A07 = r4;
        this.A01 = r6;
        this.A04 = r7;
        this.A09 = r8;
        this.A00 = r9;
        this.A03 = r10;
        this.A08 = r5;
        this.A02 = r11;
        this.A06 = r3;
    }

    public C446324e A02(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        return ((C25741Pl) this.A02.get()).A00(userJid);
    }

    public UserJid A03(List list) {
        Object obj;
        AnonymousClass1BI r3 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C42701yb.A01(((C70503Bi) obj).A00)) {
                    break;
                }
            }
            C70503Bi r1 = (C70503Bi) obj;
            if (r1 != null) {
                r3 = r1.A00;
            }
        }
        return (UserJid) r3;
    }

    public Integer A04(AnonymousClass206 r5) {
        AnonymousClass1BI r1;
        int i;
        if (!((AnonymousClass1UD) this.A01.get()).A06() || (r1 = r5.A0v.A00) == null) {
            return null;
        }
        if (C42701yb.A01(r1)) {
            return 0;
        }
        if (A03(r5.A0h) != null) {
            i = 1;
        } else if (!A00(this, r1)) {
            return null;
        } else {
            i = 2;
        }
        return Integer.valueOf(i);
    }

    public Integer A05(C63362sw r6) {
        if (!((AnonymousClass1UD) this.A01.get()).A06()) {
            return null;
        }
        AnonymousClass350 r0 = (AnonymousClass350) ((B5K) r6.A0i.get(new AnonymousClass20F(AnonymousClass350.class)));
        if (r0 == null) {
            return null;
        }
        AnonymousClass1BI A002 = C22971Dz.A00(r0.A00);
        if (A002 == null) {
            A002 = r6.A0B.A00;
        }
        UserJid A052 = r6.A05();
        if (A052 == null || !C42701yb.A01(A052)) {
            return null;
        }
        if (A002 == null || A002.equals(A052)) {
            return 0;
        }
        return 1;
    }

    public boolean A0C(AnonymousClass206 r3) {
        C692136i A002;
        C18070vi.A0d(r3, 0);
        if (!(r3 instanceof AnonymousClass210) || !C87494Vu.A00(r3) || AnonymousClass2UX.A00(r3) == null || AnonymousClass2UW.A00(r3) == null || (A002 = AnonymousClass2UX.A00(r3)) == null || A002.A00 == null) {
            return false;
        }
        return true;
    }

    public static final boolean A00(AnonymousClass1PW r1, AnonymousClass1BI r2) {
        C63872tp A0A;
        C199410f<C63312sr> A0B;
        if (!(r2 instanceof AnonymousClass1E9) || (A0A = r1.A06.A0A((AnonymousClass1E9) r2)) == null || (A0B = A0A.A0B()) == null) {
            return false;
        }
        if ((A0B instanceof Collection) && A0B.isEmpty()) {
            return false;
        }
        for (C63312sr r0 : A0B) {
            if (C42701yb.A01(r0.A04)) {
                return true;
            }
        }
        return false;
    }

    public int A01(AnonymousClass1BI r4) {
        UserJid userJid;
        C446324e A002;
        if (r4 == null) {
            return 0;
        }
        AnonymousClass00H r1 = this.A09;
        if (((C60122nQ) r1.get()).A03(r4)) {
            return 2;
        }
        if (((C60122nQ) r1.get()).A04(r4)) {
            return 3;
        }
        if (!C42701yb.A01(r4)) {
            return 0;
        }
        AnonymousClass00H r12 = this.A01;
        if (!((AnonymousClass1UD) r12.get()).A06()) {
            return 0;
        }
        if (!((AnonymousClass1UD) r12.get()).A00()) {
            return 1;
        }
        if (!(r4 instanceof UserJid) || (userJid = (UserJid) r4) == null || (A002 = ((C25741Pl) this.A02.get()).A00(userJid)) == null) {
            return 0;
        }
        if (!A002.A0J) {
            return 4;
        }
        if (!A002.A0I) {
            return 5;
        }
        return 1;
    }

    public String A06(UserJid userJid) {
        C446324e A002 = ((C25741Pl) this.A02.get()).A00(userJid);
        if (A002 != null) {
            return A002.A0E;
        }
        Context context = this.A05.A00;
        C18070vi.A0X(context);
        String string = context.getString(2131898736);
        C18070vi.A0X(string);
        return string;
    }

    public ArrayList A07() {
        ArrayList arrayList = new ArrayList();
        String A012 = C18020vd.A01(C18040vf.A02, this.A07, 9601);
        C18070vi.A0X(A012);
        for (String str : AnonymousClass1YF.A0R(A012, new char[]{','})) {
            try {
                arrayList.add(Integer.valueOf(Integer.parseInt(str)));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("MetaAiTypeaheadRequest/getAIExperimentConfig invalid config: ");
                sb.append(str);
                Log.e(sb.toString());
            }
        }
        return arrayList;
    }

    public boolean A08() {
        return ((AnonymousClass1UD) this.A01.get()).A06();
    }

    public boolean A09(AnonymousClass1BI r2, UserJid userJid, AnonymousClass206 r4) {
        if (!(r4 instanceof AnonymousClass23N) || !C42701yb.A01(userJid) || C42701yb.A01(r2)) {
            return false;
        }
        if (C22971Dz.A0d(r2) || C22971Dz.A0e(r2)) {
            return true;
        }
        return false;
    }

    public boolean A0A(Jid jid, int i) {
        if (i != 88) {
            return false;
        }
        C22931Dv r0 = AnonymousClass1BI.A00;
        if (C42701yb.A01(C22931Dv.A00(jid))) {
            return false;
        }
        if (C22971Dz.A0d(jid) || C22971Dz.A0e(jid)) {
            return true;
        }
        return false;
    }

    public boolean A0B(AnonymousClass206 r3) {
        if (C42701yb.A01(r3.A0v.A00) || ((!r3.A0q() && A03(r3.A0h) == null) || r3.A06 != 0)) {
            return false;
        }
        return true;
    }

    public boolean A0D(AnonymousClass206 r5) {
        AnonymousClass1BI r3 = r5.A0v.A00;
        if (C22971Dz.A0d(r3)) {
            if (C18020vd.A05(C18040vf.A02, this.A07, 3142) || C42701yb.A01(r3)) {
                return true;
            }
        }
        if (C22971Dz.A0d(r5.A0H()) && C42701yb.A01(r5.A0I())) {
            return true;
        }
        if ((r5.A0q() || A03(r5.A0h) != null) && r5.A06 == 0) {
            return true;
        }
        return false;
    }
}
