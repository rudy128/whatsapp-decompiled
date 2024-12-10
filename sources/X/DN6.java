package X;

import com.google.firebase.encoders.proto.Protobuf;

public final class DN6 implements Protobuf {
    public final int A00;
    public final C24244By2 A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Protobuf)) {
            return false;
        }
        DN6 dn6 = (DN6) ((Protobuf) obj);
        return this.A00 == dn6.A00 && this.A01.equals(dn6.A01);
    }

    public Class annotationType() {
        return Protobuf.class;
    }

    public String toString() {
        StringBuilder A0u = BE6.A0u("@com.google.firebase.encoders.proto.Protobuf");
        A0u.append('(');
        A0u.append("tag=");
        A0u.append(this.A00);
        A0u.append("intEncoding=");
        return AnonymousClass001.A1F(this.A01, A0u);
    }

    public DN6(C24244By2 by2, int i) {
        this.A00 = i;
        this.A01 = by2;
    }

    public int hashCode() {
        return (14552422 ^ this.A00) + (this.A01.hashCode() ^ 2041407134);
    }
}
