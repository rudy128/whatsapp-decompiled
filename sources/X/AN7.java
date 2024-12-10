package X;

import java.util.Arrays;
import java.util.List;

public final class AN7 implements B7B {
    public ADX A00;
    public final List A01;

    public AN7(List list) {
        this.A01 = list;
    }

    public void CIx(ADX adx) {
        this.A00 = adx;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        for (Object next : this.A01) {
            A10.append(System.getProperty("line.separator"));
            AnonymousClass8BS.A1D(next, A10);
        }
        String format = String.format("GetCategoriesResponse{categoryResponses=%s}", Arrays.copyOf(AnonymousClass8BV.A1b(A10), 1));
        C18070vi.A0X(format);
        return format;
    }
}
