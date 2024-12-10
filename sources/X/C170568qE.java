package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8qE  reason: invalid class name and case insensitive filesystem */
public final class C170568qE extends C20126A8l {
    public final AnonymousClass1E2 A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final String[] A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        if (X.C18070vi.A18(r1[0], r3) != false) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C170568qE(X.C62382rJ r15, X.C19999A2n r16, X.AnonymousClass1E2 r17, com.whatsapp.jid.UserJid r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, long r22, boolean r24) {
        /*
            r14 = this;
            r3 = r20
            r1 = r21
            r0 = 4
            r6 = r15
            r2 = r18
            X.C108965cb.A1P(r2, r0, r15)
            r10 = 2
            r13 = 0
            java.lang.String r9 = "critical_unblock_low"
            r5 = r14
            r7 = r16
            r8 = r19
            r11 = r22
            r5.<init>(r6, r7, r8, r9, r10, r11, r13)
            r14.A01 = r2
            r0 = r17
            r14.A00 = r0
            r0 = r24
            r14.A04 = r0
            if (r21 == 0) goto L_0x002b
            int r0 = r1.length()
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            java.lang.String r1 = ""
        L_0x002d:
            r14.A02 = r1
            if (r20 == 0) goto L_0x0072
            java.lang.String r0 = " "
            java.util.List r4 = X.C108965cb.A0v(r1, r0, r13)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x006f
            java.util.ListIterator r1 = X.C108955ca.A18(r4)
        L_0x0041:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x006f
            int r0 = X.C108985cd.A08(r1)
            if (r0 == 0) goto L_0x0041
            java.util.List r0 = X.C108985cd.A0t(r4, r1)
        L_0x0051:
            java.lang.String[] r1 = X.C108955ca.A1b(r0)
            int r0 = r1.length
            if (r0 == 0) goto L_0x0060
            r0 = r1[r13]
            boolean r0 = X.C18070vi.A18(r0, r3)
            if (r0 != 0) goto L_0x0072
        L_0x0060:
            r14.A03 = r3
            java.lang.String r0 = "contact"
            java.lang.String[] r1 = new java.lang.String[r10]
            r1[r13] = r0
            r0 = 1
            X.C17880vN.A1J(r2, r1, r0)
            r14.A05 = r1
            return
        L_0x006f:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x0051
        L_0x0072:
            java.lang.String r3 = ""
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170568qE.<init>(X.2rJ, X.A2n, X.1E2, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, java.lang.String, long, boolean):void");
    }

    public C163398Uv A08() {
        if (C18070vi.A18(this.A05, C62382rJ.A02)) {
            return super.A08();
        }
        C23624Bmt A0N = C165318aw.DEFAULT_INSTANCE.A0N();
        String str = this.A02;
        C165318aw r1 = (C165318aw) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.fullName_ = str;
        boolean z = this.A04;
        C165318aw r12 = (C165318aw) C17880vN.A0G(A0N);
        r12.bitField0_ |= 8;
        r12.saveOnPrimaryAddressbook_ = z;
        String str2 = this.A03;
        if (str2.length() > 0) {
            C165318aw r13 = (C165318aw) C17880vN.A0G(A0N);
            r13.bitField0_ |= 2;
            r13.firstName_ = str2;
        }
        AnonymousClass1E2 r0 = this.A00;
        if (r0 != null) {
            String rawString = r0.getRawString();
            C165318aw r14 = (C165318aw) C17880vN.A0G(A0N);
            rawString.getClass();
            r14.bitField0_ |= 4;
            r14.lidJid_ = rawString;
        }
        C163398Uv A08 = super.A08();
        C166378cn r2 = (C166378cn) C17880vN.A0G(A08);
        C165318aw r15 = (C165318aw) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r15.getClass();
        r2.contactAction_ = r15;
        r2.bitField0_ |= 4;
        return A08;
    }

    public String A0B() {
        return "contact";
    }

    public String[] A0F() {
        return this.A05;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ContactMutation{\n        rowId=");
        A10.append(this.A07);
        A10.append(",\n        contactJid=");
        A10.append(this.A01);
        A10.append(",\n        lidJid=");
        A10.append(this.A00);
        A10.append(",\n        givenName=");
        A10.append(this.A03);
        A10.append(",\n        displayName=");
        A10.append(this.A02);
        A10.append(",\n        timestamp=");
        A10.append(this.A04);
        A10.append(",\n        areDependenciesMissing=");
        A10.append(A0D());
        A10.append(",\n        operation=");
        A10.append(this.A05);
        A10.append(",\n        collectionName=");
        A10.append(this.A06);
        A10.append(",\n        keyId=");
        A10.append(this.A00);
        return AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n    }", A10));
    }
}
