package X;

import java.util.Comparator;

/* renamed from: X.Blg  reason: case insensitive filesystem */
public final class C23553Blg extends AnonymousClass1F8 {
    public final Comparator comparator;

    public C23556Blj build() {
        C23556Blj construct = C23556Blj.construct(this.comparator, this.size, this.contents);
        this.size = construct.size();
        this.forceCopy = true;
        return construct;
    }

    public C23553Blg(Comparator comparator2) {
        C199610h.A04(comparator2);
        this.comparator = comparator2;
    }

    public C23553Blg add(Object obj) {
        super.add(obj);
        return this;
    }

    public C23553Blg add(Object... objArr) {
        super.add(objArr);
        return this;
    }
}
