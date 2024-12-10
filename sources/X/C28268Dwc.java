package X;

/* renamed from: X.Dwc  reason: case insensitive filesystem */
public class C28268Dwc extends C28367DyD {
    public int A0D() {
        int length = this.A01.length;
        return C26084Cs1.A00(length + 1) + 1 + length + 1;
    }

    public boolean A0H() {
        return false;
    }

    public void A0G(C26039Cr0 cr0, boolean z) {
        byte b = (byte) this.A00;
        byte[] bArr = this.A01;
        if (z) {
            C26039Cr0.A01(cr0, 3);
        }
        int length = bArr.length;
        cr0.A03(length + 1);
        C26039Cr0.A01(cr0, b);
        C26039Cr0.A02(cr0, bArr, length);
    }
}
