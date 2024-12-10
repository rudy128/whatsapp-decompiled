package X;

import java.util.List;

/* renamed from: X.6y3  reason: invalid class name and case insensitive filesystem */
public final class C139006y3 {
    public final AnonymousClass6pB A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public static final Integer A00(List list) {
        if (list.size() == 1) {
            int ordinal = ((C122646Re) list.get(0)).ordinal();
            if (ordinal == 0) {
                return AnonymousClass00R.A00;
            }
            if (ordinal == 1) {
                return AnonymousClass00R.A01;
            }
            throw AnonymousClass3MW.A14();
        } else if (list.size() > 1) {
            return AnonymousClass00R.A0C;
        } else {
            throw AnonymousClass000.A0k("Invalid destination list or it is empty");
        }
    }

    public C139006y3(AnonymousClass6pB r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r12, X.C147347Su r13, java.lang.Integer r14, java.lang.String r15, java.lang.String r16, java.util.List r17, java.util.List r18, int r19) {
        /*
            r11 = this;
            X.C18070vi.A0i(r12, r14)
            r0 = 4
            X.C18070vi.A0d(r15, r0)
            boolean r1 = r13 instanceof X.AnonymousClass6ON
            if (r1 == 0) goto L_0x003c
            java.lang.String r8 = "eligibility_purpose_encryption_validation_error"
        L_0x000d:
            X.00H r0 = r11.A01
            java.lang.Object r6 = r0.get()
            X.6y4 r6 = (X.C139016y4) r6
            r10 = 3
            java.util.Iterator r3 = r17.iterator()
        L_0x001a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r4 = r3.next()
            X.6Re r4 = (X.C122646Re) r4
            java.util.Iterator r2 = r18.iterator()
        L_0x002a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001a
            X.206 r5 = X.C17880vN.A0Y(r2)
            r7 = r16
            r9 = r19
            X.C139016y4.A00(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x002a
        L_0x003c:
            boolean r0 = r13 instanceof X.AnonymousClass6OO
            if (r0 == 0) goto L_0x0043
            java.lang.String r8 = "eligibility_session_data_validation_error"
            goto L_0x000d
        L_0x0043:
            boolean r0 = r13 instanceof X.AnonymousClass6OJ
            if (r0 == 0) goto L_0x004a
            java.lang.String r8 = "crosspost_generic_error"
            goto L_0x000d
        L_0x004a:
            boolean r0 = r13 instanceof X.AnonymousClass6OK
            if (r0 == 0) goto L_0x0051
            java.lang.String r8 = "eligibility_generic_error"
            goto L_0x000d
        L_0x0051:
            boolean r0 = r13 instanceof X.AnonymousClass6OI
            if (r0 == 0) goto L_0x0058
            java.lang.String r8 = "crosspost_error_account_not_linked"
            goto L_0x000d
        L_0x0058:
            boolean r0 = r13 instanceof X.AnonymousClass6OL
            if (r0 == 0) goto L_0x005f
            java.lang.String r8 = "eligibility_check_error_account_not_linked"
            goto L_0x000d
        L_0x005f:
            X.6OM r0 = X.AnonymousClass6OM.A00
            boolean r0 = X.C18070vi.A18(r13, r0)
            if (r0 == 0) goto L_0x008e
            X.00H r0 = r11.A02
            java.lang.Object r3 = r0.get()
            X.6yG r3 = (X.C139126yG) r3
            java.lang.Integer r0 = A00(r17)
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0086;
                case 1: goto L_0x008a;
                default: goto L_0x007e;
            }
        L_0x007e:
            r1 = 2131898350(0x7f122fee, float:1.9431615E38)
        L_0x0081:
            r0 = 0
            X.C139126yG.A00(r0, r3, r15, r1, r2)
        L_0x0085:
            return
        L_0x0086:
            r1 = 2131898361(0x7f122ff9, float:1.9431638E38)
            goto L_0x0081
        L_0x008a:
            r1 = 2131898376(0x7f123008, float:1.9431668E38)
            goto L_0x0081
        L_0x008e:
            X.6OG r0 = X.AnonymousClass6OG.A00
            boolean r0 = X.C18070vi.A18(r13, r0)
            if (r0 == 0) goto L_0x00b9
            X.00H r0 = r11.A02
            java.lang.Object r3 = r0.get()
            X.6yG r3 = (X.C139126yG) r3
            java.lang.Integer r0 = A00(r17)
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00b1;
                case 1: goto L_0x00b5;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            r1 = 2131898346(0x7f122fea, float:1.9431607E38)
            goto L_0x0081
        L_0x00b1:
            r1 = 2131898354(0x7f122ff2, float:1.9431623E38)
            goto L_0x0081
        L_0x00b5:
            r1 = 2131898372(0x7f123004, float:1.943166E38)
            goto L_0x0081
        L_0x00b9:
            X.6OH r0 = X.AnonymousClass6OH.A00
            boolean r0 = X.C18070vi.A18(r13, r0)
            if (r0 == 0) goto L_0x00e4
            X.00H r0 = r11.A02
            java.lang.Object r3 = r0.get()
            X.6yG r3 = (X.C139126yG) r3
            java.lang.Integer r0 = A00(r17)
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00dc;
                case 1: goto L_0x00e0;
                default: goto L_0x00d8;
            }
        L_0x00d8:
            r1 = 2131898347(0x7f122feb, float:1.943161E38)
            goto L_0x0081
        L_0x00dc:
            r1 = 2131898355(0x7f122ff3, float:1.9431625E38)
            goto L_0x0081
        L_0x00e0:
            r1 = 2131898373(0x7f123005, float:1.9431662E38)
            goto L_0x0081
        L_0x00e4:
            if (r1 != 0) goto L_0x012a
            boolean r0 = r13 instanceof X.AnonymousClass6OO
            if (r0 != 0) goto L_0x012a
            boolean r0 = r13 instanceof X.AnonymousClass6OJ
            if (r0 != 0) goto L_0x012a
            boolean r0 = r13 instanceof X.AnonymousClass6OK
            if (r0 != 0) goto L_0x012a
            boolean r0 = r13 instanceof X.AnonymousClass6OI
            if (r0 != 0) goto L_0x00fa
            boolean r0 = r13 instanceof X.AnonymousClass6OL
            if (r0 == 0) goto L_0x0085
        L_0x00fa:
            X.00H r0 = r11.A02
            java.lang.Object r3 = r0.get()
            X.6yG r3 = (X.C139126yG) r3
            java.lang.Integer r1 = A00(r17)
            r0 = 36
            X.6LF r2 = new X.6LF
            r2.<init>(r12, r11, r0)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            int r0 = r1.intValue()
            switch(r0) {
                case 0: goto L_0x0122;
                case 1: goto L_0x0126;
                default: goto L_0x0118;
            }
        L_0x0118:
            r1 = 2131898345(0x7f122fe9, float:1.9431605E38)
        L_0x011b:
            r0 = 2131898370(0x7f123002, float:1.9431656E38)
            X.C139126yG.A00(r2, r3, r15, r1, r0)
            return
        L_0x0122:
            r1 = 2131898369(0x7f123001, float:1.9431654E38)
            goto L_0x011b
        L_0x0126:
            r1 = 2131898371(0x7f123003, float:1.9431658E38)
            goto L_0x011b
        L_0x012a:
            X.00H r0 = r11.A02
            java.lang.Object r3 = r0.get()
            X.6yG r3 = (X.C139126yG) r3
            java.lang.Integer r0 = A00(r17)
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0146;
                case 1: goto L_0x014b;
                default: goto L_0x0141;
            }
        L_0x0141:
            r1 = 2131898349(0x7f122fed, float:1.9431613E38)
            goto L_0x0081
        L_0x0146:
            r1 = 2131898360(0x7f122ff8, float:1.9431636E38)
            goto L_0x0081
        L_0x014b:
            r1 = 2131898375(0x7f123007, float:1.9431666E38)
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139006y3.A01(android.content.Context, X.7Su, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, java.util.List, int):void");
    }
}
