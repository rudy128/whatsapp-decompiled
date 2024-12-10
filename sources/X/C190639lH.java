package X;

import java.io.File;

/* renamed from: X.9lH  reason: invalid class name and case insensitive filesystem */
public final class C190639lH {
    public final AnonymousClass118 A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public File A00(C0L c0l) {
        String str;
        String A0c;
        C186059da A002 = ((CYT) this.A02.get()).A00(c0l);
        C179279Hi r0 = A002.A01;
        C18070vi.A0W(r0);
        C183299Xs A003 = ((C190149kS) this.A01.get()).A00(r0);
        AnonymousClass8BY.A1G(A003, "InternalDirStorageManager only supports InternalDirStorageConfig, received + ", AnonymousClass000.A10(), A003 instanceof C183299Xs);
        String str2 = A002.A00.fileName;
        if (A003.A00.intValue() != 0) {
            str = "stringpacks";
        } else {
            str = "";
        }
        if (str.length() == 0) {
            A0c = "";
        } else {
            A0c = C17890vO.A0c(AnonymousClass000.A11(str), '/');
        }
        return C17880vN.A0e(C17880vN.A0e(AnonymousClass8BR.A0t(this.A00), "NetworkResource"), C17900vP.A0A(A0c, str2));
    }

    public C190639lH(AnonymousClass118 r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }
}
