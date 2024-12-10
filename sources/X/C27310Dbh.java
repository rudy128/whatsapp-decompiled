package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Dbh  reason: case insensitive filesystem */
public class C27310Dbh extends ArrayList<Object> implements List<Object>, EEG, EEH {
    public static final long serialVersionUID = 9106884089231309568L;

    public String CPK() {
        C25672Ck3 ck3 = C25453Cg5.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        try {
            C25722Cks.A03.CSS(A10, this, ck3);
        } catch (IOException unused) {
        }
        return A10.toString();
    }

    public void CSQ(Appendable appendable) {
        C25722Cks.A03.CSS(appendable, this, C25453Cg5.A00);
    }

    public void CSR(Appendable appendable, C25672Ck3 ck3) {
        C25722Cks.A03.CSS(appendable, this, ck3);
    }

    public String CPL(C25672Ck3 ck3) {
        StringBuilder A10 = AnonymousClass000.A10();
        try {
            C25722Cks.A03.CSS(A10, this, ck3);
        } catch (IOException unused) {
        }
        return A10.toString();
    }

    public String toString() {
        return CPK();
    }
}
