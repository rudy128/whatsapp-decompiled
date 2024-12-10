package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: X.Ck0  reason: case insensitive filesystem */
public class C25670Ck0 {
    public final EBZ A00;
    public final C25975Cpl A01;
    public final Collection A02;
    public final Set A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25670Ck0 ck0 = (C25670Ck0) obj;
            if (!(this.A00.getClass() == ck0.A00.getClass() && this.A01.getClass() == ck0.A01.getClass() && AnonymousClass026.A00(this.A03, ck0.A03))) {
                return false;
            }
        }
        return true;
    }

    public static C25670Ck0 A00() {
        C25508Ch6 ch6 = C25508Ch6.A01;
        Class<C24287Byk> cls = C24287Byk.class;
        EnumSet<E> noneOf = EnumSet.noneOf(cls);
        ArrayList A13 = AnonymousClass000.A13();
        DOV dov = new DOV();
        noneOf.addAll(EnumSet.noneOf(cls));
        return new C25670Ck0(dov, ch6.A00, A13, noneOf);
    }

    public C25670Ck0(EBZ ebz, C25975Cpl cpl, Collection collection, EnumSet enumSet) {
        if (collection != null) {
            this.A00 = ebz;
            this.A01 = cpl;
            this.A03 = Collections.unmodifiableSet(enumSet);
            this.A02 = Collections.unmodifiableCollection(collection);
            return;
        }
        throw AnonymousClass000.A0k("evaluationListeners can not be null");
    }
}
