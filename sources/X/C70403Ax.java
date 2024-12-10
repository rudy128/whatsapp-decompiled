package X;

/* renamed from: X.3Ax  reason: invalid class name and case insensitive filesystem */
public final class C70403Ax implements C22484B9q {
    public String A00 = null;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C70403Ax) && C18070vi.A18(this.A00, ((C70403Ax) obj).A00));
    }

    public void BmW(AnonymousClass5YR r5) {
        String str;
        String A0s;
        Long A04;
        C21319Ai4 ai4 = (C21319Ai4) r5;
        AnonymousClass9ZF r0 = ai4.A06;
        if (r0 == null || (A0s = C17880vN.A0s("wa_instance_id", r0.A00)) == null || (A04 = AnonymousClass1YD.A04(A0s)) == null) {
            str = null;
        } else {
            long longValue = A04.longValue();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(ai4.A0F);
            A10.append('_');
            str = C17880vN.A0u(A10, longValue);
        }
        this.A00 = str;
    }

    public int hashCode() {
        return C17900vP.A00(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WAQuickPromotionUserFilterContext(entityId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
