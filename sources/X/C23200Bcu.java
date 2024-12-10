package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bcu  reason: case insensitive filesystem */
public final class C23200Bcu extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public EBw A00;
    public C28641EBx A01;
    public String A02;
    public C28638EBs A03;
    public C23171BcR A04;
    public C23166BcM A05;
    public byte[] A06;
    public final int A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23200Bcu) {
                C23200Bcu bcu = (C23200Bcu) obj;
                if (C25332Cdd.A01(this.A01, bcu.A01) && C25332Cdd.A01(this.A03, bcu.A03) && C25332Cdd.A01(this.A02, bcu.A02) && Arrays.equals(this.A06, bcu.A06) && C25332Cdd.A01(this.A00, bcu.A00)) {
                    if (!DJ0.A0H(bcu.A07, Integer.valueOf(this.A07)) || !C25332Cdd.A01(this.A04, bcu.A04) || !C25332Cdd.A01(this.A05, bcu.A05)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = this.A01;
        objArr[1] = this.A03;
        objArr[2] = this.A02;
        C17890vO.A1G(objArr, Arrays.hashCode(this.A06));
        objArr[4] = this.A00;
        AnonymousClass3Ma.A1U(objArr, this.A07);
        objArr[6] = this.A04;
        return AnonymousClass000.A0P(this.A05, objArr, 7);
    }

    public /* synthetic */ C23200Bcu(C24433C3j c3j) {
        this.A07 = 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int A002 = C26293Cx2.A00(parcel);
        C28641EBx eBx = this.A01;
        IBinder iBinder = null;
        if (eBx == null) {
            asBinder = null;
        } else {
            asBinder = eBx.asBinder();
        }
        C26293Cx2.A04(asBinder, parcel, 1);
        C28638EBs eBs = this.A03;
        if (eBs == null) {
            asBinder2 = null;
        } else {
            asBinder2 = eBs.asBinder();
        }
        C26293Cx2.A04(asBinder2, parcel, 2);
        C26293Cx2.A0A(parcel, this.A02, 3, false);
        C26293Cx2.A0D(parcel, this.A06, 4, false);
        EBw eBw = this.A00;
        if (eBw != null) {
            iBinder = eBw.asBinder();
        }
        C26293Cx2.A04(iBinder, parcel, 5);
        C26293Cx2.A06(parcel, 6, this.A07);
        C26293Cx2.A09(parcel, this.A04, 7, i, false);
        C26293Cx2.A09(parcel, this.A05, 8, i, false);
        C26293Cx2.A05(parcel, A002);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.EBs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.EBs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.EBs} */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.Cyy] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23200Bcu(android.os.IBinder r6, android.os.IBinder r7, android.os.IBinder r8, X.C23171BcR r9, X.C23166BcM r10, java.lang.String r11, byte[] r12, int r13) {
        /*
            r5 = this;
            r3 = 0
            if (r6 != 0) goto L_0x0042
            r4 = r3
        L_0x0004:
            if (r7 != 0) goto L_0x002f
            r1 = r3
        L_0x0007:
            if (r8 == 0) goto L_0x0015
            java.lang.String r2 = "com.google.android.gms.nearby.internal.connection.IPayloadListener"
            android.os.IInterface r3 = r8.queryLocalInterface(r2)
            boolean r0 = r3 instanceof X.EBw
            if (r0 == 0) goto L_0x0029
            X.EBw r3 = (X.EBw) r3
        L_0x0015:
            r5.<init>()
            r5.A01 = r4
            r5.A03 = r1
            r5.A02 = r11
            r5.A06 = r12
            r5.A00 = r3
            r5.A07 = r13
            r5.A04 = r9
            r5.A05 = r10
            return
        L_0x0029:
            X.Bgb r3 = new X.Bgb
            r3.<init>(r8, r2)
            goto L_0x0015
        L_0x002f:
            java.lang.String r2 = "com.google.android.gms.nearby.internal.connection.IConnectionEventListener"
            android.os.IInterface r1 = r7.queryLocalInterface(r2)
            boolean r0 = r1 instanceof X.C28638EBs
            if (r0 == 0) goto L_0x003c
            X.EBs r1 = (X.C28638EBs) r1
            goto L_0x0007
        L_0x003c:
            X.BgX r1 = new X.BgX
            r1.<init>(r7, r2)
            goto L_0x0007
        L_0x0042:
            X.EBx r4 = X.BEA.A0U(r6)
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23200Bcu.<init>(android.os.IBinder, android.os.IBinder, android.os.IBinder, X.BcR, X.BcM, java.lang.String, byte[], int):void");
    }

    public C23200Bcu() {
        this.A07 = 0;
    }
}
