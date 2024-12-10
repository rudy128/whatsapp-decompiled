package X;

import java.util.ArrayList;

/* renamed from: X.7pA  reason: invalid class name and case insensitive filesystem */
public final class C153217pA extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass7LG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153217pA(AnonymousClass7LG r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        byte[] bArr = this.this$0.A08;
        if (bArr == null) {
            return null;
        }
        ArrayList A0z = C17880vN.A0z(r4);
        for (byte b : bArr) {
            A0z.add(Float.valueOf(((float) b) / 100.0f));
        }
        return A0z;
    }
}
