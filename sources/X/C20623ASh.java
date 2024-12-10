package X;

import android.text.TextUtils;

/* renamed from: X.ASh  reason: case insensitive filesystem */
public class C20623ASh implements B83, B85, C436820m {
    public final A79 A00;

    public void BDb(C19998A2m a2m, AnonymousClass206 r9) {
        if (r9 instanceof AnonymousClass219) {
            AnonymousClass219 r92 = (AnonymousClass219) r9;
            C693336u A0O = r92.A0O();
            AnonymousClass8X8 r5 = a2m.A00;
            C165968c8 r0 = ((C166418cr) r5.A00).liveLocationMessage_;
            if (r0 == null) {
                r0 = C165968c8.DEFAULT_INSTANCE;
            }
            AnonymousClass8TE r4 = (AnonymousClass8TE) r0.A0O();
            double d = r92.A00;
            C165968c8 r3 = (C165968c8) C17880vN.A0G(r4);
            int i = C165968c8.ACCURACY_IN_METERS_FIELD_NUMBER;
            r3.bitField0_ |= 1;
            r3.degreesLatitude_ = d;
            double d2 = r92.A01;
            C165968c8 r32 = (C165968c8) C17880vN.A0G(r4);
            r32.bitField0_ |= 2;
            r32.degreesLongitude_ = d2;
            if (!a2m.A05 && A0O.A01() != null) {
                C23581BmB A03 = C17900vP.A03(r4, A0O.A01());
                C165968c8 r1 = (C165968c8) r4.A00;
                r1.bitField0_ |= 256;
                r1.jpegThumbnail_ = A03;
            }
            if (C19998A2m.A00(a2m, r92)) {
                C166278cd A01 = A79.A01(r4, this.A00, a2m, r92);
                C165968c8 r12 = (C165968c8) r4.A00;
                A01.getClass();
                r12.contextInfo_ = A01;
                r12.bitField0_ |= 512;
            }
            if (!TextUtils.isEmpty(r92.A03)) {
                String str = r92.A03;
                C165968c8 r13 = (C165968c8) C17880vN.A0G(r4);
                str.getClass();
                r13.bitField0_ |= 32;
                r13.caption_ = str;
            }
            long j = r92.A01;
            C165968c8 r14 = (C165968c8) C17880vN.A0G(r4);
            r14.bitField0_ |= 64;
            r14.sequenceNumber_ = j;
            r5.A0M(r4);
            return;
        }
        throw AnonymousClass000.A0k("FMessageLiveLocationSerializer/not supported message");
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr r2 = a6d.A08;
        if (!AnonymousClass000.A1O(r2.bitField0_ & 65536)) {
            return null;
        }
        C165968c8 r3 = r2.liveLocationMessage_;
        if (r3 == null) {
            r3 = C165968c8.DEFAULT_INSTANCE;
        }
        C17960vV.A07(r3);
        AnonymousClass219 r22 = new AnonymousClass219(a6d.A0A, a6d.A03);
        r22.A02 = 1;
        r22.A00 = r3.degreesLatitude_;
        r22.A01 = r3.degreesLongitude_;
        if ((r3.bitField0_ & 256) != 0) {
            r22.A15(r3.jpegThumbnail_.A06(), a6d.A0L);
        }
        if ((r3.bitField0_ & 32) != 0) {
            r22.A03 = r3.caption_;
        }
        r22.A01 = r3.sequenceNumber_;
        return r22;
    }

    public C20623ASh(A79 a79) {
        this.A00 = a79;
    }
}
