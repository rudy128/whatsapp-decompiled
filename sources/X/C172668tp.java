package X;

import android.util.Base64;
import java.io.File;

/* renamed from: X.8tp  reason: invalid class name and case insensitive filesystem */
public class C172668tp extends AUK {
    public final AnonymousClass190 A00;
    public final AnonymousClass1L7 A01;

    public void BDZ(C195629te r5, AnonymousClass8X1 r6, AnonymousClass206 r7) {
        AnonymousClass21V r72;
        File file;
        C18070vi.A0d(r7, 0);
        C18070vi.A0j(r6, r5);
        if (!(r7 instanceof AnonymousClass21V) || (r72 = (AnonymousClass21V) r7) == null) {
            throw AnonymousClass8BW.A0S(0);
        }
        String str = r72.A08;
        if (str != null) {
            try {
                Base64.decode(str, 0);
            } catch (IllegalArgumentException unused) {
                this.A00.A0G("webquery/invalid hash", (String) null, false);
                r72.A08 = null;
            }
        }
        super.BDZ(r5, r6, r72);
        C62572rc r0 = r72.A02;
        if (r0 != null && (file = r0.A0G) != null) {
            String A09 = this.A01.A09(file);
            C18070vi.A0X(A09);
            C23624Bmt A08 = AnonymousClass8BS.A08(AnonymousClass8YV.DEFAULT_INSTANCE);
            AnonymousClass8YV r1 = (AnonymousClass8YV) A08.A00;
            r1.bitField0_ |= 1;
            r1.localPath_ = A09;
            C166388co A0P = AnonymousClass8BS.A0P(r6);
            AnonymousClass8YV r12 = (AnonymousClass8YV) A08.A0C();
            int i = C166388co.AGENT_ID_FIELD_NUMBER;
            r12.getClass();
            A0P.mediaData_ = r12;
            A0P.bitField0_ |= 67108864;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C172668tp(AnonymousClass190 r1, AnonymousClass1L7 r2, AnonymousClass00H r3) {
        super(r3);
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void CBB(C193069pU r4, C166388co r5, AnonymousClass206 r6) {
        AnonymousClass21V r0;
        boolean A15 = C18070vi.A15(r6, r5);
        if (!(r6 instanceof AnonymousClass21V) || (r0 = (AnonymousClass21V) r6) == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass206.A07(r6, "Unexpected message type: ", A10);
            throw AnonymousClass8BR.A0p(A10.toString(), A15 ? 1 : 0);
        }
        C62572rc r2 = r0.A02;
        if (r2 != null && (r5.bitField0_ & 67108864) != 0) {
            AnonymousClass8YV r02 = r5.mediaData_;
            AnonymousClass8YV r1 = r02;
            if (r02 == null) {
                r02 = AnonymousClass8YV.DEFAULT_INSTANCE;
            }
            if ((r02.bitField0_ & 1) != 0) {
                if (r1 == null) {
                    r1 = AnonymousClass8YV.DEFAULT_INSTANCE;
                }
                r2.A0G = C108945cZ.A17(r1.localPath_);
            }
        }
    }
}
