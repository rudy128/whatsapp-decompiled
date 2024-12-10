package X;

import java.util.Map;

public final class DVK implements Map.Entry, AnonymousClass3MS {
    public final int A00;
    public final DVM A01;

    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!C18070vi.A18(entry.getKey(), getKey()) || !C18070vi.A18(entry.getValue(), getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Object getKey() {
        DVM dvm = this.A01;
        DVM dvm2 = DVM.A00;
        return dvm.keysArray[this.A00];
    }

    public Object getValue() {
        DVM dvm = this.A01;
        DVM dvm2 = DVM.A00;
        Object[] objArr = dvm.valuesArray;
        C18070vi.A0b(objArr);
        return objArr[this.A00];
    }

    public Object setValue(Object obj) {
        DVM dvm = this.A01;
        dvm.A05();
        Object[] objArr = dvm.valuesArray;
        if (objArr == null) {
            objArr = new Object[dvm.keysArray.length];
            dvm.valuesArray = objArr;
        }
        int i = this.A00;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public DVK(DVM dvm, int i) {
        this.A01 = dvm;
        this.A00 = i;
    }

    public int hashCode() {
        int i = 0;
        int A0l = AnonymousClass001.A0l(getKey());
        Object value = getValue();
        if (value != null) {
            i = value.hashCode();
        }
        return A0l ^ i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(getKey());
        A10.append('=');
        return C17890vO.A0V(getValue(), A10);
    }
}
