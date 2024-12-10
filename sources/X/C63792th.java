package X;

import android.database.Cursor;
import com.whatsapp.jid.Jid;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2th  reason: invalid class name and case insensitive filesystem */
public abstract class C63792th {
    public static final List A00;

    static {
        Integer[] numArr = new Integer[5];
        AnonymousClass000.A1L(numArr, 56);
        AnonymousClass000.A1M(numArr, 68);
        numArr[2] = 67;
        C17890vO.A1G(numArr, 93);
        A00 = C18070vi.A0O(74, numArr, 4);
    }

    public static final HashMap A01(Cursor cursor, int i) {
        String[] strArr;
        C18070vi.A0d(cursor, 0);
        HashMap A11 = C17880vN.A11();
        AnonymousClass1Eu.A04(cursor, A11, C213615r.A00);
        if (i != 11) {
            if (i == 56) {
                strArr = C213315o.A00;
            } else if (i != 74) {
                if (i == 79) {
                    strArr = C213015l.A00;
                } else if (i == 86) {
                    strArr = C213515q.A00;
                } else if (i == 93) {
                    strArr = C50712Vm.A00;
                } else if (i == 67) {
                    strArr = C213215n.A00;
                } else if (i == 68) {
                    strArr = C212915k.A00;
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("MessageAddOnUtils/getColIndexesForMessageAddOnStatements messageAddOnType: ");
                    A10.append(i);
                    throw AnonymousClass001.A12(" not supported", A10);
                }
            }
            AnonymousClass1Eu.A04(cursor, A11, strArr);
        }
        return A11;
    }

    public static final boolean A02(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 8 || i == 9;
    }

    public static final boolean A04(AnonymousClass212 r2) {
        int i;
        if (r2 instanceof AnonymousClass227) {
            String str = ((AnonymousClass227) r2).A01;
            if (str != null) {
                i = str.length();
            }
            return true;
        } else if (r2 instanceof AnonymousClass22A) {
            i = ((AnonymousClass22A) r2).A01;
        } else if (r2 instanceof AnonymousClass22E) {
            return ((AnonymousClass22E) r2).A06.isEmpty();
        } else {
            return false;
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    public static final AnonymousClass206 A00(AnonymousClass212 r2, AnonymousClass1W6 r3) {
        C18070vi.A0h(r2, r3);
        AnonymousClass205 A18 = r2.A18();
        if (A18 != null) {
            return r3.A01.A05(A18);
        }
        return r3.A01.A03(r2.A02);
    }

    public static final boolean A03(Jid jid, int i) {
        if (!C22971Dz.A0a(jid)) {
            return false;
        }
        if (i == 56 || i == 67 || i == 68 || i == 79 || i == 86 || i == 93) {
            return true;
        }
        return false;
    }
}
