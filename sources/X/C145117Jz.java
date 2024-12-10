package X;

import java.io.File;

/* renamed from: X.7Jz  reason: invalid class name and case insensitive filesystem */
public final class C145117Jz implements AnonymousClass89D {
    public String Ba8() {
        return "NoneDecompressor";
    }

    public Object CCc(AnonymousClass708 r3, File file, String str, C30391dr r6) {
        if (file.renameTo(C108945cZ.A17(str))) {
            return new C162178Jk();
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r3.A06);
        throw new AnonymousClass6SI(AnonymousClass000.A0y(" failed to rename file", A10));
    }
}
