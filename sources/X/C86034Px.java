package X;

import java.util.List;

/* renamed from: X.4Px  reason: invalid class name and case insensitive filesystem */
public class C86034Px {
    public final AnonymousClass4ZL A00;

    public void A00() {
        AnonymousClass4ZL r4 = this.A00;
        C17960vV.A02();
        List<AnonymousClass4OI> list = r4.A0D;
        list.size();
        List<AnonymousClass4OI> list2 = r4.A0C;
        list2.size();
        for (AnonymousClass4OI r1 : list2) {
            AnonymousClass4LI r0 = r1.A01;
            if (r0 != null) {
                C827349n.A00(r0.A00);
            }
            r1.A03.A0F();
        }
        list2.clear();
        for (AnonymousClass4OI r12 : list) {
            AnonymousClass4LI r02 = r12.A01;
            if (r02 != null) {
                C827349n.A00(r02.A00);
            }
            r12.A03.A0F();
        }
        list.clear();
        r4.A01 = 0;
    }

    public C86034Px(AnonymousClass190 r11, AnonymousClass1KB r12, C48012Kv r13, AnonymousClass11C r14, AnonymousClass118 r15, C18030ve r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19) {
        this.A00 = new AnonymousClass4ZL(r11, r12, r13, r14, r15, r16, r17, r18, r19);
    }
}
