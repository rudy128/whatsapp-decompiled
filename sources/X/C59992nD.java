package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2nD  reason: invalid class name and case insensitive filesystem */
public final class C59992nD {
    public C165328ax A00;
    public final AnonymousClass1TK A01;
    public final AnonymousClass118 A02;

    public boolean A02() {
        Boolean bool;
        try {
            boolean A0Q = C64062u9.A0Q(A01());
            if (A0Q) {
                this.A00 = null;
                this.A01.A03(false);
            }
            bool = Boolean.valueOf(A0Q);
        } catch (Throwable th) {
            bool = new AnonymousClass1IU(th);
        }
        Throwable A002 = C30671eK.A00(bool);
        if (A002 != null) {
            Log.e(C17900vP.A0C("ChatLockUserPasscodeStorage/unsetStoredPasscode: ", AnonymousClass000.A10(), A002), A002.getCause());
        }
        if (bool instanceof AnonymousClass1IU) {
            bool = false;
        }
        return AnonymousClass000.A1Y(bool);
    }

    public boolean A03(C165328ax r6) {
        boolean z;
        C18070vi.A0d(r6, 0);
        try {
            C64062u9.A0C(r6, A01());
            this.A00 = r6;
            this.A01.A03(true);
            z = true;
        } catch (Throwable th) {
            z = new AnonymousClass1IU(th);
        }
        Throwable A002 = C30671eK.A00(z);
        if (A002 != null) {
            Log.e(C17900vP.A0C("ChatLockUserPasscodeStorage/setStoredPasscode: ", AnonymousClass000.A10(), A002), A002.getCause());
        }
        if (z instanceof AnonymousClass1IU) {
            z = false;
        }
        return AnonymousClass000.A1Y(z);
    }

    public C165328ax A00() {
        C165328ax r3;
        try {
            C165328ax r32 = this.A00;
            r3 = r32;
            if (r32 == null) {
                byte[] A0X = C64062u9.A0X(A01());
                C18070vi.A0X(A0X);
                C165328ax r33 = (C165328ax) C23577Bm6.A07(C165328ax.DEFAULT_INSTANCE, A0X);
                this.A00 = r33;
                r3 = r33;
            }
        } catch (Throwable th) {
            r3 = new AnonymousClass1IU(th);
        }
        Throwable A002 = C30671eK.A00(r3);
        if (A002 != null) {
            Log.e(C17900vP.A0C("ChatLockUserPasscodeStorage/getStoredPasscode: ", AnonymousClass000.A10(), A002), A002.getCause());
        }
        boolean z = r3 instanceof AnonymousClass1IU;
        C165328ax r34 = r3;
        if (z) {
            r34 = null;
        }
        return r34;
    }

    public File A01() {
        return C17880vN.A0e(this.A02.A00.getFilesDir(), "secret_code.key");
    }

    public C59992nD(AnonymousClass1TK r1, AnonymousClass118 r2) {
        C18070vi.A0j(r2, r1);
        this.A02 = r2;
        this.A01 = r1;
    }
}
