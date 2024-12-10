package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Dbv  reason: case insensitive filesystem */
public class C27324Dbv extends HashMap<String, Object> implements EEG, EEH {
    public static final long serialVersionUID = -503443796854799292L;

    public String CPK() {
        C25672Ck3 ck3 = C25453Cg5.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        try {
            C25722Cks.A06.CSS(A10, this, ck3);
        } catch (IOException unused) {
        }
        return A10.toString();
    }

    public void CSQ(Appendable appendable) {
        C25722Cks.A06.CSS(appendable, this, C25453Cg5.A00);
    }

    public void CSR(Appendable appendable, C25672Ck3 ck3) {
        C25722Cks.A06.CSS(appendable, this, ck3);
    }

    public String toString() {
        C25672Ck3 ck3 = C25453Cg5.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        try {
            C25722Cks.A06.CSS(A10, this, ck3);
        } catch (IOException unused) {
        }
        return A10.toString();
    }

    public String CPL(C25672Ck3 ck3) {
        StringBuilder A10 = AnonymousClass000.A10();
        try {
            C25722Cks.A06.CSS(A10, this, ck3);
        } catch (IOException unused) {
        }
        return A10.toString();
    }
}
