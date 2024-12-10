package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.0Zl  reason: invalid class name and case insensitive filesystem */
public final class C06730Zl implements Iterator, Map.Entry {
    public int A00;
    public int A01 = -1;
    public boolean A02;
    public final /* synthetic */ AnonymousClass00P A03;

    public C06730Zl(AnonymousClass00P r2) {
        this.A03 = r2;
        this.A00 = r2.size() - 1;
    }

    public boolean equals(Object obj) {
        if (!this.A02) {
            throw AnonymousClass000.A0n("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            AnonymousClass00P r2 = this.A03;
            if (!AnonymousClass00Q.A02(key, r2.A04(this.A01)) || !AnonymousClass00Q.A02(entry.getValue(), r2.A06(this.A01))) {
                return false;
            }
            return true;
        }
    }

    public Object getKey() {
        if (this.A02) {
            return this.A03.A04(this.A01);
        }
        throw AnonymousClass000.A0n("This container does not support retaining Map.Entry objects");
    }

    public Object getValue() {
        if (this.A02) {
            return this.A03.A06(this.A01);
        }
        throw AnonymousClass000.A0n("This container does not support retaining Map.Entry objects");
    }

    public boolean hasNext() {
        return AnonymousClass000.A1U(this.A01, this.A00);
    }

    public int hashCode() {
        if (this.A02) {
            AnonymousClass00P r2 = this.A03;
            int i = this.A01;
            Object A04 = r2.A04(i);
            Object A06 = r2.A06(i);
            int i2 = 0;
            int A0k = AnonymousClass001.A0k(A04);
            if (A06 != null) {
                i2 = A06.hashCode();
            }
            return A0k ^ i2;
        }
        throw AnonymousClass000.A0n("This container does not support retaining Map.Entry objects");
    }

    public void remove() {
        if (this.A02) {
            this.A03.A05(this.A01);
            this.A01--;
            this.A00--;
            this.A02 = false;
            return;
        }
        throw new IllegalStateException();
    }

    public Object setValue(Object obj) {
        if (this.A02) {
            return this.A03.A07(this.A01, obj);
        }
        throw AnonymousClass000.A0n("This container does not support retaining Map.Entry objects");
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            this.A01++;
            this.A02 = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(getKey());
        A10.append("=");
        A10.append(getValue());
        return A10.toString();
    }
}
