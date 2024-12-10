package X;

import java.io.IOException;

/* renamed from: X.1gE  reason: invalid class name and case insensitive filesystem */
public final class C31851gE extends IOException {
    public final int excessPayloadByteSize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31851gE(String str, int i) {
        super(str);
        C18070vi.A0d(str, 1);
        this.excessPayloadByteSize = i;
    }
}
