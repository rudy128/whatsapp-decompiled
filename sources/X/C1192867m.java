package X;

/* renamed from: X.67m  reason: invalid class name and case insensitive filesystem */
public class C1192867m extends C139596z7 {
    public final C19830z4 A00;

    public C1192867m(AnonymousClass11E r11, AnonymousClass11P r12, C19830z4 r13, C18000vb r14, AnonymousClass7IO r15, AnonymousClass7IQ r16, AnonymousClass7IU r17, AnonymousClass18K r18, C19960A0r a0r, AnonymousClass10I r20) {
        super(r11, r12, r14, r18, r15, r16, r17, a0r, r20);
        this.A00 = r13;
    }

    public C138516xD A01() {
        if (C17890vO.A00(C17890vO.A0B(this.A00), "emoji_search_algorithm_version") == 2) {
            return super.A01();
        }
        return new C138516xD();
    }

    public boolean A02(C138516xD r5) {
        boolean A02 = super.A02(r5);
        if (A02) {
            C17880vN.A1C(C19830z4.A00(this.A00), "emoji_search_algorithm_version", 2);
        }
        return A02;
    }
}
