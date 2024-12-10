package X;

import java.io.Serializable;

/* renamed from: X.23v  reason: invalid class name and case insensitive filesystem */
public class C445423v implements AnonymousClass11F, Serializable {
    public final int arity;
    public final int flags;
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public final String signature;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C445423v)) {
            return false;
        }
        C445423v r4 = (C445423v) obj;
        return this.isTopLevel == r4.isTopLevel && this.arity == r4.arity && this.flags == r4.flags && C18070vi.A18(this.receiver, r4.receiver) && C18070vi.A18(this.owner, r4.owner) && this.name.equals(r4.name) && this.signature.equals(r4.signature);
    }

    public C445423v(Class cls, String str, int i, int i2) {
        this(i, AnonymousClass1JG.NO_RECEIVER, cls, "<init>", str, i2);
    }

    public int hashCode() {
        int i;
        Object obj = this.receiver;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Class cls = this.owner;
        if (cls != null) {
            i2 = cls.hashCode();
        }
        int hashCode = (((((i3 + i2) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31;
        int i4 = 1237;
        if (this.isTopLevel) {
            i4 = 1231;
        }
        return ((((hashCode + i4) * 31) + this.arity) * 31) + this.flags;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        return C60672oQ.A00(this);
    }

    public C445423v(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) != 1 ? false : true;
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
