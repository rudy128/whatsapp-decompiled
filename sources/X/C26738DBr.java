package X;

import android.content.res.Resources;
import java.util.Map;

/* renamed from: X.DBr  reason: case insensitive filesystem */
public final class C26738DBr implements EBY {
    public final Resources A00;
    public final C22825BRd A01;
    public final E13 A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C26738DBr dBr = (C26738DBr) obj;
            if (this.A00 != dBr.A00 || !C24545C8q.A00(this.A02, dBr.A02) || !C24545C8q.A00(this.A01, dBr.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A00)));
    }

    public C26738DBr(Resources resources, C22825BRd bRd, E13 e13, Map map) {
        this.A00 = resources;
        this.A02 = e13;
        this.A01 = bRd;
        this.A03 = map;
    }

    public Object BRU(String str) {
        throw AnonymousClass04E.createAndThrow();
    }

    public Map BRV() {
        throw AnonymousClass04E.createAndThrow();
    }

    public void CD2(String str, Object obj) {
        throw AnonymousClass04E.createAndThrow();
    }

    public void CD3(Map map) {
        throw AnonymousClass04E.createAndThrow();
    }
}
