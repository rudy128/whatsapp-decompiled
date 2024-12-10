package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;

/* renamed from: X.ASx  reason: case insensitive filesystem */
public final class C20639ASx implements B83, B85, C436820m {
    public final C193209pi A00;
    public final AnonymousClass190 A01;
    public final A79 A02;

    public C20639ASx(AnonymousClass190 r2, A79 a79, C193209pi r4) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
        this.A02 = a79;
        this.A00 = r4;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r10) {
        boolean A15 = C18070vi.A15(r10, a2m);
        if (r10 instanceof AnonymousClass22S) {
            AnonymousClass8X8 r2 = a2m.A00;
            C165688bb r0 = ((C166418cr) r2.A00).productMessage_;
            if (r0 == null) {
                r0 = C165688bb.DEFAULT_INSTANCE;
            }
            C162968Te r3 = (C162968Te) r0.A0O();
            C165688bb r02 = ((C166418cr) r2.A00).productMessage_;
            if (r02 == null) {
                r02 = C165688bb.DEFAULT_INSTANCE;
            }
            C164908aG r03 = r02.catalog_;
            if (r03 == null) {
                r03 = C164908aG.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r03.A0O();
            C193209pi r5 = this.A00;
            C438321c r1 = (C438321c) r10;
            C166268cc r04 = ((C164908aG) A0O.A00).catalogImage_;
            if (r04 == null) {
                r04 = C166268cc.DEFAULT_INSTANCE;
            }
            C163748We A002 = r5.A00(a2m, (C163748We) r04.A0O(), r1);
            AnonymousClass22S r52 = (AnonymousClass22S) r10;
            UserJid userJid = r52.A00;
            if (A002 == null || userJid == null) {
                StringBuilder A10 = AnonymousClass000.A10();
                AnonymousClass8BT.A1H(r10, "FMessageCatalog/buildE2eMessage/unable to send encrypted media message due to missing mediaKey or businessOwnerJid; message.key=", A10);
                AnonymousClass206.A07(r10, "; media_wa_type=", A10);
                A10.append("; business_owner_jid=");
                AnonymousClass8BW.A1N(r52.A00, A10);
                if (r52.A00 == null && a2m.A04) {
                    throw AnonymousClass8BW.A0S(A15 ? 1 : 0);
                }
                return;
            }
            String A0d = AnonymousClass8BS.A0d(r3, userJid);
            C165688bb r12 = (C165688bb) r3.A00;
            A0d.getClass();
            r12.bitField0_ |= 2;
            r12.businessOwnerJid_ = A0d;
            String str = r52.A01;
            if (!(str == null || str.length() == 0)) {
                C164908aG r13 = (C164908aG) C17880vN.A0G(A0O);
                r13.bitField0_ |= 4;
                r13.description_ = str;
            }
            String str2 = r52.A02;
            if (!(str2 == null || str2.length() == 0)) {
                C164908aG r14 = (C164908aG) C17880vN.A0G(A0O);
                r14.bitField0_ |= 2;
                r14.title_ = str2;
            }
            C164908aG r15 = (C164908aG) C17880vN.A0G(A0O);
            C166268cc r05 = (C166268cc) A002.A0C();
            r05.getClass();
            r15.catalogImage_ = r05;
            r15.bitField0_ |= 1;
            C165688bb r16 = (C165688bb) C17880vN.A0G(r3);
            C164908aG r06 = (C164908aG) A0O.A0C();
            r06.getClass();
            r16.catalog_ = r06;
            r16.bitField0_ |= 4;
            if (C19998A2m.A00(a2m, r10)) {
                C166278cd A012 = A79.A01(r3, this.A02, a2m, r10);
                C165688bb r17 = (C165688bb) r3.A00;
                A012.getClass();
                r17.contextInfo_ = A012;
                r17.bitField0_ |= 32;
            }
            C166418cr A0M = AnonymousClass8BS.A0M(r2);
            C165688bb r07 = (C165688bb) r3.A0C();
            r07.getClass();
            A0M.productMessage_ = r07;
            A0M.bitField0_ |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
            return;
        }
        throw AnonymousClass000.A0k("FMessageCatalogProtobuf/not supported message");
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [X.22S, X.21d, X.21c, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr A012 = C20077A6d.A01(a6d);
        if ((A012.bitField0_ & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 0) {
            return null;
        }
        C165688bb r0 = A012.productMessage_;
        if (r0 == null) {
            r0 = C165688bb.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 4) == 0) {
            return null;
        }
        this.A01.A0G("fmessage-protobuf-catalog-deprecation", "", false);
        C165688bb r4 = A012.productMessage_;
        if (r4 == null) {
            r4 = C165688bb.DEFAULT_INSTANCE;
        }
        C17960vV.A07(r4);
        ? r6 = new C438421d(a6d.A0A, 37, a6d.A03);
        try {
            C22941Dw r02 = UserJid.Companion;
            r6.A00 = C22941Dw.A03(r4.businessOwnerJid_);
        } catch (AnonymousClass11T unused) {
        }
        if (r6.A00 != null) {
            C164908aG r1 = r4.catalog_;
            if (r1 == null) {
                r1 = C164908aG.DEFAULT_INSTANCE;
            }
            r6.A02 = r1.title_;
            r6.A01 = r1.description_;
            C166268cc r5 = r1.catalogImage_;
            if (r5 == null) {
                r5 = C166268cc.DEFAULT_INSTANCE;
            }
            this.A00.A02(r5, r6, a6d.A00, a6d.A05(), a6d.A0L);
            return r6;
        }
        throw AnonymousClass8BR.A0o(0);
    }
}
