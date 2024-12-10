package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.Bcv  reason: case insensitive filesystem */
public final class C23201Bcv extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public C28639EBt A00;
    public C28641EBx A01;
    public String A02;
    public byte[] A03;
    public C28638EBs A04;
    public C28640EBu A05;
    public C23171BcR A06;
    public C23202Bcw A07;
    public C23166BcM A08;
    public String A09;
    public String A0A;
    public byte[] A0B;
    public byte[] A0C;
    public final int A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23201Bcv) {
                C23201Bcv bcv = (C23201Bcv) obj;
                if (C25332Cdd.A01(this.A01, bcv.A01) && C25332Cdd.A01(this.A04, bcv.A04) && C25332Cdd.A01(this.A05, bcv.A05) && C25332Cdd.A01(this.A09, bcv.A09) && C25332Cdd.A01(this.A02, bcv.A02) && Arrays.equals(this.A0B, bcv.A0B) && C25332Cdd.A01(this.A00, bcv.A00) && Arrays.equals(this.A03, bcv.A03) && C25332Cdd.A01(this.A07, bcv.A07)) {
                    if (!DJ0.A0H(bcv.A0D, Integer.valueOf(this.A0D)) || !C25332Cdd.A01(this.A06, bcv.A06) || !C25332Cdd.A01(this.A08, bcv.A08) || !Arrays.equals(this.A0C, bcv.A0C) || !C25332Cdd.A01(this.A0A, bcv.A0A)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[14];
        objArr[0] = this.A01;
        objArr[1] = this.A04;
        objArr[2] = this.A05;
        objArr[3] = this.A09;
        objArr[4] = this.A02;
        AnonymousClass3Ma.A1U(objArr, Arrays.hashCode(this.A0B));
        objArr[6] = this.A00;
        C17890vO.A1I(objArr, Arrays.hashCode(this.A03));
        objArr[8] = this.A07;
        objArr[9] = Integer.valueOf(this.A0D);
        objArr[10] = this.A06;
        objArr[11] = this.A08;
        BE8.A1L(objArr, Arrays.hashCode(this.A0C));
        return AnonymousClass000.A0P(this.A0A, objArr, 13);
    }

    public /* synthetic */ C23201Bcv(C24436C3m c3m) {
        this.A0D = 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        IBinder asBinder3;
        int A002 = C26293Cx2.A00(parcel);
        C28641EBx eBx = this.A01;
        IBinder iBinder = null;
        if (eBx == null) {
            asBinder = null;
        } else {
            asBinder = eBx.asBinder();
        }
        C26293Cx2.A04(asBinder, parcel, 1);
        C28638EBs eBs = this.A04;
        if (eBs == null) {
            asBinder2 = null;
        } else {
            asBinder2 = eBs.asBinder();
        }
        C26293Cx2.A04(asBinder2, parcel, 2);
        C28640EBu eBu = this.A05;
        if (eBu == null) {
            asBinder3 = null;
        } else {
            asBinder3 = eBu.asBinder();
        }
        C26293Cx2.A04(asBinder3, parcel, 3);
        C26293Cx2.A0A(parcel, this.A09, 4, false);
        C26293Cx2.A0A(parcel, this.A02, 5, false);
        C26293Cx2.A0D(parcel, this.A0B, 6, false);
        C28639EBt eBt = this.A00;
        if (eBt != null) {
            iBinder = eBt.asBinder();
        }
        C26293Cx2.A04(iBinder, parcel, 7);
        C26293Cx2.A0D(parcel, this.A03, 8, false);
        C26293Cx2.A09(parcel, this.A07, 9, i, false);
        C26293Cx2.A06(parcel, 10, this.A0D);
        C26293Cx2.A09(parcel, this.A06, 11, i, false);
        C26293Cx2.A0D(parcel, this.A0C, 12, false);
        C26293Cx2.A0A(parcel, this.A0A, 13, false);
        C26293Cx2.A09(parcel, this.A08, 14, i, false);
        C26293Cx2.A05(parcel, A002);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.EBs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.EBu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.EBu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.EBs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.EBs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.EBu} */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.Cyy] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23201Bcv(android.os.IBinder r7, android.os.IBinder r8, android.os.IBinder r9, android.os.IBinder r10, X.C23171BcR r11, X.C23202Bcw r12, X.C23166BcM r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, byte[] r17, byte[] r18, byte[] r19, int r20) {
        /*
            r6 = this;
            r3 = 0
            if (r7 != 0) goto L_0x006e
            r4 = r3
        L_0x0004:
            if (r8 != 0) goto L_0x005b
            r1 = r3
        L_0x0007:
            if (r9 != 0) goto L_0x0048
            r2 = r3
        L_0x000a:
            if (r10 == 0) goto L_0x0018
            java.lang.String r5 = "com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener"
            android.os.IInterface r3 = r10.queryLocalInterface(r5)
            boolean r0 = r3 instanceof X.C28639EBt
            if (r0 == 0) goto L_0x0042
            X.EBt r3 = (X.C28639EBt) r3
        L_0x0018:
            r6.<init>()
            r6.A01 = r4
            r6.A04 = r1
            r6.A05 = r2
            r6.A09 = r14
            r6.A02 = r15
            r0 = r17
            r6.A0B = r0
            r6.A00 = r3
            r0 = r18
            r6.A03 = r0
            r6.A07 = r12
            r0 = r20
            r6.A0D = r0
            r6.A06 = r11
            r6.A08 = r13
            r0 = r19
            r6.A0C = r0
            r0 = r16
            r6.A0A = r0
            return
        L_0x0042:
            X.BgY r3 = new X.BgY
            r3.<init>(r10, r5)
            goto L_0x0018
        L_0x0048:
            java.lang.String r5 = "com.google.android.gms.nearby.internal.connection.IConnectionResponseListener"
            android.os.IInterface r2 = r9.queryLocalInterface(r5)
            boolean r0 = r2 instanceof X.C28640EBu
            if (r0 == 0) goto L_0x0055
            X.EBu r2 = (X.C28640EBu) r2
            goto L_0x000a
        L_0x0055:
            X.BgZ r2 = new X.BgZ
            r2.<init>(r9, r5)
            goto L_0x000a
        L_0x005b:
            java.lang.String r2 = "com.google.android.gms.nearby.internal.connection.IConnectionEventListener"
            android.os.IInterface r1 = r8.queryLocalInterface(r2)
            boolean r0 = r1 instanceof X.C28638EBs
            if (r0 == 0) goto L_0x0068
            X.EBs r1 = (X.C28638EBs) r1
            goto L_0x0007
        L_0x0068:
            X.BgX r1 = new X.BgX
            r1.<init>(r8, r2)
            goto L_0x0007
        L_0x006e:
            X.EBx r4 = X.BEA.A0U(r7)
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23201Bcv.<init>(android.os.IBinder, android.os.IBinder, android.os.IBinder, android.os.IBinder, X.BcR, X.Bcw, X.BcM, java.lang.String, java.lang.String, java.lang.String, byte[], byte[], byte[], int):void");
    }

    public C23201Bcv() {
        this.A0D = 0;
    }
}
