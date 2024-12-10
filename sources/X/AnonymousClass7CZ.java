package X;

/* renamed from: X.7CZ  reason: invalid class name */
public class AnonymousClass7CZ implements AnonymousClass86T, C22841Dk {
    public final int A00;
    public final Object A01;

    public AnonymousClass7CZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final C18080vj BS6() {
        Class cls;
        String str;
        int i;
        int i2;
        String str2;
        int i3 = this.A00;
        Object obj = this.A01;
        switch (i3) {
            case 0:
                cls = C111055i3.class;
                str = "setSelectedVariant(ILcom/whatsapp/biz/catalog/view/variants/VariantsDisplayData;Lcom/whatsapp/biz/catalog/data/variants/ProductVariantProperty;)V";
                i = 0;
                i2 = 3;
                str2 = "setSelectedVariant";
                break;
            case 3:
                cls = AnonymousClass7CW.class;
                break;
            default:
                cls = AnonymousClass7CX.class;
                break;
        }
        str = "onSelected(ILcom/whatsapp/biz/catalog/view/variants/VariantsDisplayData;Lcom/whatsapp/biz/catalog/data/variants/ProductVariantProperty;)V";
        i = 0;
        i2 = 3;
        str2 = "onSelected";
        return new AnonymousClass1JJ(i2, obj, cls, str2, str, i);
    }

    public final void Bds(C20245ADd aDd, AnonymousClass77B r8, int i) {
        C41731wy r1;
        boolean A0h;
        AnonymousClass86T r0;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(r8, 1);
                C111055i3 r2 = (C111055i3) this.A01;
                C20245ADd A012 = C196499vA.A01(r8, i);
                if (C196499vA.A00(A012, aDd, r8.A02) == null && r8.A03.get(A012) == null) {
                    r1 = r2.A02;
                    A0h = true;
                } else {
                    AnonymousClass3MX.A1K(r2.A01, i);
                    r1 = r2.A02;
                    A0h = AnonymousClass000.A0h();
                }
                r1.A0E(A0h);
                return;
            case 3:
                C18070vi.A0d(r8, 1);
                r0 = ((AnonymousClass7CW) this.A01).A06;
                break;
            default:
                C18070vi.A0d(r8, 1);
                AnonymousClass7CX r4 = (AnonymousClass7CX) this.A01;
                C20245ADd A013 = C196499vA.A01(r8, i);
                C132596n6 r3 = r4.A01;
                if (r3 != null) {
                    String str = A013.A01;
                    C20256ADo A002 = C196499vA.A00(A013, aDd, r8.A02);
                    boolean z = false;
                    if (A002 != null && A002.A02) {
                        z = true;
                    }
                    r3.A00(str, z);
                    r0 = r4.A00;
                    break;
                } else {
                    C18070vi.A11("titleController");
                    throw null;
                }
        }
        r0.Bds(aDd, r8, i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass86T) || !(obj instanceof C22841Dk)) {
            return false;
        }
        return C108975cc.A1L(obj, BS6());
    }

    public final int hashCode() {
        return BS6().hashCode();
    }
}
