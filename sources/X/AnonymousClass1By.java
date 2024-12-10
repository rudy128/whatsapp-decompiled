package X;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: X.1By  reason: invalid class name */
public abstract class AnonymousClass1By implements AnonymousClass1Bx {
    public byte[] A0C(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        A0A(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }

    public AnonymousClass1Bz CP9() {
        return (AnonymousClass1Bz) this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass1Bx)) {
            return false;
        }
        return CP9().A0J(((AnonymousClass1Bx) obj).CP9());
    }

    public int hashCode() {
        return CP9().hashCode();
    }

    public static AnonymousClass1C0 A00(String str, AnonymousClass1C0 r2) {
        return new AnonymousClass1C0(str, r2);
    }

    public void A0A(OutputStream outputStream, String str) {
        if (this instanceof AnonymousClass1Bz) {
            C26039Cr0.A00(outputStream, str).A05((AnonymousClass1Bz) this, true);
            return;
        }
        C26039Cr0.A00(outputStream, str).A05(CP9(), true);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.Cr0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.Cr0, java.lang.Object] */
    public byte[] A0B() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this instanceof AnonymousClass1Bz) {
            ? obj = new Object();
            obj.A00 = byteArrayOutputStream;
            obj.A05((AnonymousClass1Bz) this, true);
        } else {
            ? obj2 = new Object();
            obj2.A00 = byteArrayOutputStream;
            obj2.A05(CP9(), true);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
