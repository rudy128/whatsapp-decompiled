package X;

import java.io.InputStream;

/* renamed from: X.6qS  reason: invalid class name and case insensitive filesystem */
public final class C134356qS {
    public final InputStream A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134356qS) && C18070vi.A18(this.A00, ((C134356qS) obj).A00));
    }

    public C134356qS(InputStream inputStream) {
        this.A00 = inputStream;
    }

    public int hashCode() {
        return (AnonymousClass000.A0N(this.A00, -1376501241) * 31) + 32282088;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FileParam(paramName=");
        A10.append("events");
        A10.append(", content=");
        A10.append(this.A00);
        A10.append(", contentType=");
        A10.append(0);
        A10.append(", fileName=");
        return C17900vP.A0B("events.gz", A10);
    }
}
