package X;

import java.io.Serializable;
import java.lang.Enum;

/* renamed from: X.0z3  reason: invalid class name and case insensitive filesystem */
public final class C19820z3<T extends Enum<T>> extends C19800z1<T> implements C19810z2<T>, Serializable {
    public final Enum[] entries;

    private final Object writeReplace() {
        return new C70453Bc(this.entries);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            Enum enumR = (Enum) obj;
            C18070vi.A0d(enumR, 0);
            Enum[] enumArr = this.entries;
            int ordinal = enumR.ordinal();
            C18070vi.A0d(enumArr, 0);
            if (ordinal < 0 || ordinal >= enumArr.length || enumArr[ordinal] != enumR) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C19820z3(Enum[] enumArr) {
        this.entries = enumArr;
    }
}
