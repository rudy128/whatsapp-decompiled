package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.File;
import java.util.Set;

public final class AMX implements C22535BBs {
    public final AnonymousClass1L7 A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C21841AtT(this));
    public final C18100vl A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final AnonymousClass1NP A07;
    public final C18030ve A08;
    public final C18100vl A09;

    public boolean Bf0(String str) {
        return str != null && AnonymousClass8BX.A1V(str, this.A09);
    }

    public boolean CLj(File file, String str) {
        boolean z = false;
        if ((str != null && AnonymousClass8BX.A1V(str, this.A05)) || (!this.A07.A0P() && str != null && (AnonymousClass8BX.A1V(str, this.A06) || AnonymousClass8BX.A1V(str, this.A04)))) {
            return false;
        }
        C18030ve r3 = this.A08;
        long A052 = AnonymousClass8BR.A05(r3, 1239) * SearchActionVerificationClientService.MS_TO_NS;
        long A053 = AnonymousClass8BR.A05(r3, 1240) * SearchActionVerificationClientService.MS_TO_NS;
        if (str != null && AnonymousClass8BX.A1V(str, this.A02)) {
            z = true;
        }
        long length = file.length();
        if (z) {
            A052 = A053;
        }
        if (length > A052) {
            StringBuilder A10 = AnonymousClass000.A10();
            C17900vP.A0N(file, "gdrive-util/should-backup/too-large ", A10);
            AnonymousClass8BV.A1I(file, " size:", A10);
            AnonymousClass8BT.A1M(A10);
            return false;
        }
        String name = file.getName();
        C18070vi.A0b(name);
        C18070vi.A0d(name, 0);
        int length2 = name.length();
        int A0E = AnonymousClass1YF.A0E(name, ".", length2 - 1);
        if (A0E != -1 && A0E != length2 - 1) {
            return true;
        }
        file.getAbsolutePath();
        return false;
    }

    public Set BUb() {
        Integer[] numArr = new Integer[9];
        boolean A1b = C72453Mb.A1b(numArr, 2);
        boolean A1b2 = AnonymousClass8BU.A1b(numArr, 9);
        C17880vN.A1T(numArr, 26, 2);
        numArr[3] = 20;
        AnonymousClass3Ma.A1T(numArr, 13);
        AnonymousClass3Ma.A1U(numArr, 29);
        C17880vN.A1T(numArr, A1b2 ? 1 : 0, 6);
        C17890vO.A1I(numArr, 25);
        numArr[8] = 105;
        Set A032 = AnonymousClass1AP.A03(numArr);
        if (this.A07.A0P()) {
            Integer[] numArr2 = new Integer[3];
            C17880vN.A1T(numArr2, 3, A1b ? 1 : 0);
            C17880vN.A1T(numArr2, 28, A1b2);
            A032.addAll(C18070vi.A0O(81, numArr2, 2));
        }
        return A032;
    }

    public AMX(C218617r r2, AnonymousClass1NP r3, AnonymousClass1L7 r4, C18030ve r5) {
        C18070vi.A0s(r5, r2, r4, r3);
        this.A08 = r5;
        this.A00 = r4;
        this.A07 = r3;
        this.A02 = AnonymousClass1DF.A01(new C21842AtU(r2));
        this.A05 = AnonymousClass1DF.A01(new C21846AtY(r2));
        this.A03 = AnonymousClass1DF.A01(new C21843AtV(r2));
        this.A09 = AnonymousClass1DF.A01(new C21844AtW(r2));
        this.A06 = AnonymousClass1DF.A01(new C21847AtZ(r2));
        this.A04 = AnonymousClass1DF.A01(new C21845AtX(r2));
    }
}
