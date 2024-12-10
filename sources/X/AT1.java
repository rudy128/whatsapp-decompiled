package X;

import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AT1 implements B83, B85, C436820m {
    public final C18030ve A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass118 A03;
    public final C18000vb A04;
    public final A79 A05;

    public void BDb(C19998A2m a2m, AnonymousClass206 r12) {
        C442022n r5 = (C442022n) r12;
        AnonymousClass8X8 r3 = a2m.A00;
        C164748a0 r0 = ((C166418cr) r3.A00).contactsArrayMessage_;
        if (r0 == null) {
            r0 = C164748a0.DEFAULT_INSTANCE;
        }
        C23624Bmt A0O = r0.A0O();
        if (!TextUtils.isEmpty(r5.A00)) {
            String str = r5.A00;
            C164748a0 r1 = (C164748a0) C17880vN.A0G(A0O);
            int i = C164748a0.CONTACTS_FIELD_NUMBER;
            str.getClass();
            r1.bitField0_ |= 1;
            r1.displayName_ = str;
        }
        List A17 = r5.A17();
        int i2 = 0;
        while (i2 < A17.size() && i2 < 257) {
            String A0w = C17880vN.A0w(A17, i2);
            C23624Bmt A0N = C164738Zz.DEFAULT_INSTANCE.A0N();
            String A002 = AnonymousClass73Y.A00(this.A01, this.A02, this.A03, this.A04, A0w);
            if (A002 != null) {
                C164738Zz r13 = (C164738Zz) C17880vN.A0G(A0N);
                r13.bitField0_ |= 1;
                r13.displayName_ = A002;
            }
            C164738Zz r14 = (C164738Zz) C17880vN.A0G(A0N);
            A0w.getClass();
            r14.bitField0_ |= 2;
            r14.vcard_ = A0w;
            C23577Bm6 A09 = AnonymousClass8BS.A09(A0N, A0O);
            C164748a0 r4 = (C164748a0) A0O.A00;
            int i3 = C164748a0.CONTACTS_FIELD_NUMBER;
            A09.getClass();
            EE9 ee9 = r4.contacts_;
            if (!((C27296DbR) ee9).A00) {
                ee9 = C23577Bm6.A09(ee9);
                r4.contacts_ = ee9;
            }
            ee9.add(A09);
            i2++;
        }
        if (!Collections.unmodifiableList(((C164748a0) A0O.A00).contacts_).isEmpty() || !a2m.A04) {
            if (C19998A2m.A00(a2m, r12)) {
                C166278cd A012 = A79.A01(A0O, this.A05, a2m, r12);
                C164748a0 r15 = (C164748a0) A0O.A00;
                A012.getClass();
                r15.contextInfo_ = A012;
                r15.bitField0_ |= 2;
            }
            C166418cr A0M = AnonymousClass8BS.A0M(r3);
            C164748a0 r02 = (C164748a0) A0O.A0C();
            r02.getClass();
            A0M.contactsArrayMessage_ = r02;
            A0M.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            return;
        }
        Log.w("FMessageContactArrayProtobuf/buildProtobufMessage/empty contact list");
        throw AnonymousClass8BW.A0S(11);
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr r1 = a6d.A08;
        if ((r1.bitField0_ & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0) {
            return null;
        }
        C164748a0 r3 = r1.contactsArrayMessage_;
        if (r3 == null) {
            r3 = C164748a0.DEFAULT_INSTANCE;
        }
        C442022n r5 = new C442022n(a6d.A0A, a6d.A03);
        if ((r3.bitField0_ & 1) != 0) {
            r5.A00 = r3.displayName_;
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (C164738Zz r2 : r3.contacts_) {
            if ((r2.bitField0_ & 2) != 0) {
                if (A13.size() >= 257) {
                    break;
                }
                A13.add(r2.vcard_);
            }
        }
        if (A13.isEmpty()) {
            if (C18020vd.A05(C18040vf.A02, this.A00, 4466)) {
                throw AnonymousClass8BR.A0p("Not valid contacts", 11);
            }
        }
        r5.A18(A13);
        return r5;
    }

    public AT1(AnonymousClass1M9 r1, AnonymousClass11C r2, AnonymousClass118 r3, C18000vb r4, C18030ve r5, A79 a79) {
        this.A03 = r3;
        this.A00 = r5;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = a79;
    }
}
