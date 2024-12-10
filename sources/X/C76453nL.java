package X;

/* renamed from: X.3nL  reason: invalid class name and case insensitive filesystem */
public final class C76453nL extends AnonymousClass4ME {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76453nL) {
                C76453nL r5 = (C76453nL) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        if (r2 == false) goto L_0x0005;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C76453nL(boolean r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0005
            r0 = 1
            if (r2 != 0) goto L_0x0006
        L_0x0005:
            r0 = 0
        L_0x0006:
            r1.<init>(r0, r4)
            r1.A01 = r2
            r1.A02 = r3
            r1.A03 = r4
            r0 = 2131898167(0x7f122f37, float:1.9431244E38)
            if (r4 == 0) goto L_0x0017
            r0 = 2131898166(0x7f122f36, float:1.9431242E38)
        L_0x0017:
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76453nL.<init>(boolean, boolean, boolean):void");
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A01), this.A02), this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BluetoothToggle(isCallActive=");
        A10.append(this.A01);
        A10.append(", isBluetoothAvailable=");
        A10.append(this.A02);
        A10.append(", isBluetoothSelected=");
        return C17900vP.A0F(A10, this.A03);
    }
}
