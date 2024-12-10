package X;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.text.MatchNamedGroupCollection;

/* renamed from: X.7TC  reason: invalid class name */
public final class AnonymousClass7TC extends C19790z0<C135126rh> implements MatchNamedGroupCollection, C18450wR {
    public final /* synthetic */ C133636pE A00;

    public boolean isEmpty() {
        return false;
    }

    public Iterator iterator() {
        return new AnonymousClass1b4(AnonymousClass1b2.A0C(new C1587681y(this), new C99434so(new C25411Oc(0, size() - 1), 4)));
    }

    public AnonymousClass7TC(C133636pE r1) {
        this.A00 = r1;
    }

    public int A0B() {
        return this.A00.A00.groupCount() + 1;
    }

    public C135126rh A0C(int i) {
        Matcher matcher = this.A00.A00;
        C25411Oc A08 = C28851b7.A08(matcher.start(i), matcher.end(i));
        if (A08.A00 < 0) {
            return null;
        }
        String group = matcher.group(i);
        C18070vi.A0X(group);
        return new C135126rh(group, A08);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof C135126rh)) {
            return super.contains(obj);
        }
        return false;
    }
}
