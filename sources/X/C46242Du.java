package X;

import java.util.List;

/* renamed from: X.2Du  reason: invalid class name and case insensitive filesystem */
public class C46242Du extends C20126A8l {
    public final List A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46242Du(X.C19999A2n r10, java.lang.String r11, java.util.List r12, long r13) {
        /*
            r9 = this;
            X.2rJ r1 = X.C62382rJ.A03
            java.lang.String r4 = "regular"
            r5 = 7
            r8 = 0
            X.C18070vi.A0l(r1, r4)
            r0 = r9
            r2 = r10
            r3 = r11
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r9.A00 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46242Du.<init>(X.A2n, java.lang.String, java.util.List, long):void");
    }

    public C163398Uv A08() {
        C163398Uv A08 = super.A08();
        C17960vV.A07(A08);
        C23624Bmt A0N = AnonymousClass8XN.DEFAULT_INSTANCE.A0N();
        List list = this.A00;
        AnonymousClass8XN r2 = (AnonymousClass8XN) C17880vN.A0G(A0N);
        EE9 ee9 = r2.flags_;
        if (!((C27296DbR) ee9).A00) {
            ee9 = C23577Bm6.A09(ee9);
            r2.flags_ = ee9;
        }
        DND.A09(list, ee9);
        C166378cn r22 = (C166378cn) C17880vN.A0G(A08);
        AnonymousClass8XN r1 = (AnonymousClass8XN) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r1.getClass();
        r22.primaryFeature_ = r1;
        r22.bitField0_ |= 524288;
        return A08;
    }

    public String A0B() {
        return "primary_feature";
    }

    public String[] A0F() {
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "primary_feature";
        return A1Y;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrimaryFeatureMutation{");
        A10.append("featureFlags=");
        A10.append(this.A00);
        A10.append(", rowId='");
        A10.append(this.A07);
        A10.append(", timestamp=");
        A10.append(this.A04);
        A10.append(", operation=");
        A10.append(this.A05);
        A10.append(", collectionName='");
        A10.append(this.A06);
        A10.append(", version=");
        A10.append(this.A03);
        A10.append(", keyId=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
