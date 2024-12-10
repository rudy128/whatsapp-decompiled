package X;

import android.content.Context;

/* renamed from: X.98i  reason: invalid class name and case insensitive filesystem */
public final class C1773798i extends C20083A6j {
    public String A0F(Context context) {
        String str = this.A02.A0B;
        if (str != null && str.length() != 0) {
            return str;
        }
        String A0D = A0D();
        if (A0D == null) {
            return "";
        }
        return A0D;
    }

    public String A0G(Context context) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("🛍 ");
        String str = this.A02.A0B;
        if (str == null || str.length() == 0) {
            str = A0D();
        }
        return AnonymousClass000.A0y(str, A10);
    }

    public void A0H(C19998A2m a2m, AnonymousClass206 r10) {
        C23577Bm6 bm6;
        String str;
        AnonymousClass9KB r2;
        C18070vi.A0h(a2m, r10);
        super.A0H(a2m, r10);
        if (r10 instanceof AnonymousClass21K) {
            C20285AEt A0g = AnonymousClass8BR.A0g(r10);
            String str2 = null;
            if (A0g != null && A0g.A08 != null) {
                AnonymousClass8X8 r4 = a2m.A00;
                C166398cp r0 = ((C166418cr) r4.A00).interactiveMessage_;
                if (r0 == null) {
                    r0 = C166398cp.DEFAULT_INSTANCE;
                }
                C23624Bmt A0O = r0.A0O();
                C166398cp r6 = (C166398cp) A0O.A00;
                if (r6.interactiveMessageCase_ == 4) {
                    bm6 = (C23577Bm6) r6.interactiveMessage_;
                } else {
                    bm6 = C164828a8.DEFAULT_INSTANCE;
                }
                C23624Bmt A0O2 = bm6.A0O();
                ADF adf = A0g.A08;
                if (adf == null || (str = adf.A02) == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    if (adf != null) {
                        str2 = adf.A02;
                    }
                    C164828a8 r1 = (C164828a8) C17880vN.A0G(A0O2);
                    int i = C164828a8.ID_FIELD_NUMBER;
                    str2.getClass();
                    r1.bitField0_ |= 1;
                    r1.id_ = str2;
                }
                C18070vi.A0b(adf);
                int i2 = adf.A00;
                if (i2 == 1) {
                    r2 = AnonymousClass9KB.FB;
                } else if (i2 == 2) {
                    r2 = AnonymousClass9KB.IG;
                } else if (i2 != 3) {
                    r2 = AnonymousClass9KB.UNKNOWN_SURFACE;
                } else {
                    r2 = AnonymousClass9KB.WA;
                }
                C164828a8 r12 = (C164828a8) C17880vN.A0G(A0O2);
                int i3 = C164828a8.ID_FIELD_NUMBER;
                r12.surface_ = r2.value;
                r12.bitField0_ |= 2;
                int i4 = adf.A01;
                C164828a8 r13 = (C164828a8) C17880vN.A0G(A0O2);
                r13.bitField0_ |= 4;
                r13.messageVersion_ = i4;
                if (A0g.A00 == 4) {
                    C166398cp r14 = (C166398cp) C17880vN.A0G(A0O);
                    C23577Bm6 A0C = A0O2.A0C();
                    A0C.getClass();
                    r14.interactiveMessage_ = A0C;
                    r14.interactiveMessageCase_ = 4;
                }
                AnonymousClass8X8.A06(A0O, r4);
            }
        }
    }
}
