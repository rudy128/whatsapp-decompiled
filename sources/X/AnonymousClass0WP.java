package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.0WP  reason: invalid class name */
public final class AnonymousClass0WP implements C17760vB {
    public float A00 = 1.0f;
    public float A01;
    public float A02 = 1.0f;
    public float A03 = 1.0f;
    public float A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public C16370s9 A09;
    public C28644ECa A0A;
    public boolean A0B;

    public /* synthetic */ int CG9(float f) {
        return C26252Cvs.A04(this, f);
    }

    public /* synthetic */ float CPE(long j) {
        return C25292Ccu.A00(this, j);
    }

    public /* synthetic */ float CPF(float f) {
        return C26252Cvs.A00(this, f);
    }

    public /* synthetic */ float CPG(int i) {
        return C26252Cvs.A02(this, i);
    }

    public /* synthetic */ long CPH(long j) {
        return C26252Cvs.A06(this, j);
    }

    public /* synthetic */ float CPP(long j) {
        return C26252Cvs.A03(this, j);
    }

    public /* synthetic */ float CPQ(float f) {
        return C26252Cvs.A01(this, f);
    }

    public /* synthetic */ long CPT(long j) {
        return C26252Cvs.A07(this, j);
    }

    public /* synthetic */ long CPU(float f) {
        return C25292Ccu.A01(this, f);
    }

    public /* synthetic */ long CPV(float f) {
        return C26252Cvs.A05(this, f);
    }

    public final void A06() {
        CKX(1.0f);
        CKY(1.0f);
        CHo(1.0f);
        CKi(0.0f);
        long j = AnonymousClass0GB.A00;
        CHs(j);
        CKq(j);
        CID(8.0f);
        CLD(AnonymousClass0NB.A01);
        CKj(AnonymousClass0GC.A00);
        CIJ(false);
        long j2 = AnonymousClass0QG.A02;
        this.A05 = 0;
    }

    public float BQU() {
        return this.A0A.BQU();
    }

    public float BRu() {
        return this.A0A.BRu();
    }

    public void CHo(float f) {
        if (this.A00 != f) {
            this.A05 |= 4;
            this.A00 = f;
        }
    }

    public void CHs(long j) {
        long j2 = this.A06;
        C02540Ek r0 = C05100Qk.A06;
        if (j2 != j) {
            this.A05 |= 64;
            this.A06 = j;
        }
    }

    public void CID(float f) {
        if (this.A01 != f) {
            this.A05 |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            this.A01 = f;
        }
    }

    public void CIJ(boolean z) {
        if (this.A0B != z) {
            this.A05 |= 16384;
            this.A0B = z;
        }
    }

    public void CKX(float f) {
        if (this.A02 != f) {
            this.A05 |= 1;
            this.A02 = f;
        }
    }

    public void CKY(float f) {
        if (this.A03 != f) {
            this.A05 |= 2;
            this.A03 = f;
        }
    }

    public void CKi(float f) {
        if (this.A04 != f) {
            this.A05 |= 32;
            this.A04 = f;
        }
    }

    public void CKj(C16370s9 r2) {
        if (!C18070vi.A18(this.A09, r2)) {
            this.A05 |= DefaultCrypto.BUFFER_SIZE;
            this.A09 = r2;
        }
    }

    public void CKq(long j) {
        long j2 = this.A07;
        C02540Ek r0 = C05100Qk.A06;
        if (j2 != j) {
            this.A05 |= 128;
            this.A07 = j;
        }
    }

    public void CLD(long j) {
        long j2 = this.A08;
        long j3 = AnonymousClass0NB.A01;
        if (j2 != j) {
            this.A05 |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            this.A08 = j;
        }
    }

    public AnonymousClass0WP() {
        long j = AnonymousClass0GB.A00;
        this.A06 = j;
        this.A07 = j;
        this.A01 = 8.0f;
        this.A08 = AnonymousClass0NB.A01;
        this.A09 = AnonymousClass0GC.A00;
        long j2 = AnonymousClass0QG.A02;
        this.A0A = C25290Ccs.A00();
    }

    public float A00() {
        return this.A00;
    }

    public float A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public long A03() {
        return this.A06;
    }

    public long A04() {
        return this.A07;
    }

    public C16370s9 A05() {
        return this.A09;
    }

    public boolean A08() {
        return this.A0B;
    }

    public float BO8() {
        return this.A01;
    }

    public float BYZ() {
        return this.A02;
    }

    public float BYa() {
        return this.A03;
    }

    public long Bal() {
        return this.A08;
    }

    public final void A07(C28644ECa eCa) {
        this.A0A = eCa;
    }
}
