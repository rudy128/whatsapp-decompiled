package X;

import java.net.InetAddress;

/* renamed from: X.2q6  reason: invalid class name and case insensitive filesystem */
public class C61692q6 {
    public int A00;
    public int A01;
    public boolean A02;
    public final C53412cU A03;
    public final boolean A04;
    public final InetAddress[] A05;

    public C61692q6(C53412cU r3, InetAddress inetAddress, int i, boolean z) {
        this.A03 = r3;
        this.A05 = new InetAddress[]{inetAddress};
        this.A01 = i;
        this.A04 = z;
        this.A00 = 30000;
    }

    public C61692q6(C53412cU r3, InetAddress[] inetAddressArr, boolean z) {
        this.A03 = r3;
        this.A05 = inetAddressArr;
        this.A01 = -1;
        this.A04 = z;
        this.A00 = 30000;
    }
}
