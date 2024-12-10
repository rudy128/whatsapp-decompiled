package com.meta.common.monad.railway;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass3MX;
import X.C17890vO;
import X.C18070vi;

public final class Result {
    public final Object A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (obj instanceof Result) {
            Result result = (Result) obj;
            if (this.A01 == result.A01) {
                Object obj2 = null;
                Object obj3 = this.A00;
                Object obj4 = result.A00;
                if (obj4 != null) {
                    obj2 = obj4;
                }
                if (!C18070vi.A18(obj3, obj2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass3MX.A03(this.A01) + AnonymousClass001.A0l(this.A00);
    }

    public String toString() {
        String str;
        boolean z = this.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        if (z) {
            str = "Success(";
        } else {
            str = "Failure(";
        }
        A10.append(str);
        A10.append(this.A00);
        return C17890vO.A0c(A10, ')');
    }

    public Result(boolean z, Object obj) {
        this.A01 = z;
        this.A00 = obj;
    }
}
