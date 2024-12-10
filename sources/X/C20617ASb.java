package X;

import android.text.TextUtils;

/* renamed from: X.ASb  reason: case insensitive filesystem */
public class C20617ASb implements B83, B85, C436820m {
    public final A79 A00;

    public void BDb(C19998A2m a2m, AnonymousClass206 r8) {
        if (r8 instanceof C442222p) {
            C442222p r82 = (C442222p) r8;
            String str = r82.A00;
            String A17 = r82.A17();
            AnonymousClass8X8 r4 = a2m.A00;
            C164738Zz r0 = ((C166418cr) r4.A00).contactMessage_;
            if (r0 == null) {
                r0 = C164738Zz.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r0.A0O();
            if (!TextUtils.isEmpty(str)) {
                C164738Zz r1 = (C164738Zz) C17880vN.A0G(A0O);
                int i = C164738Zz.CONTEXT_INFO_FIELD_NUMBER;
                str.getClass();
                r1.bitField0_ |= 1;
                r1.displayName_ = str;
            }
            if (!TextUtils.isEmpty(A17)) {
                C164738Zz r12 = (C164738Zz) C17880vN.A0G(A0O);
                int i2 = C164738Zz.CONTEXT_INFO_FIELD_NUMBER;
                A17.getClass();
                r12.bitField0_ |= 2;
                r12.vcard_ = A17;
            }
            if (C19998A2m.A00(a2m, r82)) {
                C166278cd A01 = A79.A01(A0O, this.A00, a2m, r82);
                C164738Zz r13 = (C164738Zz) A0O.A00;
                int i3 = C164738Zz.CONTEXT_INFO_FIELD_NUMBER;
                A01.getClass();
                r13.contextInfo_ = A01;
                r13.bitField0_ |= 4;
            }
            C166418cr A0M = AnonymousClass8BS.A0M(r4);
            C164738Zz r02 = (C164738Zz) A0O.A0C();
            r02.getClass();
            A0M.contactMessage_ = r02;
            A0M.bitField0_ |= 8;
            return;
        }
        throw AnonymousClass000.A0k("FMessageContactSerializer/not supported message");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.22p, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr r1 = a6d.A08;
        if ((r1.bitField0_ & 8) == 0) {
            return null;
        }
        AnonymousClass205 r5 = a6d.A0A;
        long j = a6d.A03;
        C164738Zz r2 = r1.contactMessage_;
        if (r2 == null) {
            r2 = C164738Zz.DEFAULT_INSTANCE;
        }
        C17960vV.A07(r2);
        ? r12 = new AnonymousClass206(r5, 4, j);
        r12.A02 = 0;
        if ((r2.bitField0_ & 2) != 0) {
            r12.A18(r2.vcard_);
        }
        if ((r2.bitField0_ & 1) != 0) {
            r12.A00 = r2.displayName_;
        }
        return r12;
    }

    public C20617ASb(A79 a79) {
        this.A00 = a79;
    }
}
