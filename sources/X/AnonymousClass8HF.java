package X;

import java.util.List;

/* renamed from: X.8HF  reason: invalid class name */
public final class AnonymousClass8HF extends C24490C6i {
    public final List A00;
    public final List A01;

    public AnonymousClass8HF(List list, List list2) {
        C18070vi.A0d(list, 1);
        this.A01 = list;
        this.A00 = list2;
    }

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        Object obj;
        Object obj2;
        B7D b7d = (B7D) this.A01.get(i);
        B7D b7d2 = (B7D) this.A00.get(i2);
        int type = b7d.getType();
        if (type != b7d2.getType()) {
            return false;
        }
        if (type == 0) {
            obj = ((ANM) b7d).A00;
            obj2 = ((ANM) b7d2).A00;
        } else if (type != 1) {
            return true;
        } else {
            obj = ((ANL) b7d).A00;
            obj2 = ((ANL) b7d2).A00;
        }
        return C18070vi.A18(obj, obj2);
    }

    public boolean A04(int i, int i2) {
        String str;
        String str2;
        B7D b7d = (B7D) this.A01.get(i);
        B7D b7d2 = (B7D) this.A00.get(i2);
        int type = b7d.getType();
        if (type != b7d2.getType()) {
            return false;
        }
        if (type == 0) {
            str = ((ANM) b7d).A00.A0H;
            str2 = ((ANM) b7d2).A00.A0H;
        } else if (type != 1) {
            return true;
        } else {
            str = ((ANL) b7d).A00;
            str2 = ((ANL) b7d2).A00;
        }
        return C18070vi.A18(str, str2);
    }
}
