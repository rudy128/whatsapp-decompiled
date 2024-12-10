package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public abstract class BZL extends BasePendingResult implements C28565E7v {
    public final C24599CAv A00;
    public final C24924CPx A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BZL(C24924CPx cPx, C25260Cbz cbz) {
        super(cbz);
        C18210vx.A02(cbz, "GoogleApiClient must not be null");
        C18210vx.A02(cPx, "Api must not be null");
        this.A00 = cPx.A01;
        this.A01 = cPx;
    }

    /* JADX WARNING: type inference failed for: r1v23, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r1v25 */
    /* JADX WARNING: type inference failed for: r1v26, types: [X.BiG, X.Bi2, android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r1v28, types: [X.BiG, X.Bi2, android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C28442E1i r21) {
        /*
            r20 = this;
            r6 = r21
            r2 = r20
            boolean r0 = r2 instanceof X.C23509BiJ     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            if (r0 == 0) goto L_0x0026
            X.CtR r6 = (X.C26157CtR) r6     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.IInterface r7 = r6.A04()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.Cyp r7 = (X.C26389Cyp) r7     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.BiE r1 = new X.BiE     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r1.<init>()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r1.A00 = r2     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            java.lang.String r0 = r7.A01     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r6.writeInterfaceToken(r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r6.writeStrongBinder(r1)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r1 = 15
            goto L_0x0059
        L_0x0026:
            boolean r0 = r2 instanceof X.C23510BiK     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            if (r0 == 0) goto L_0x0064
            r0 = r2
            X.BiK r0 = (X.C23510BiK) r0     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.CtR r6 = (X.C26157CtR) r6     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            java.lang.String r5 = r0.A00     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            java.lang.String r4 = "/altLinkingPrefillResponse"
            byte[] r3 = r0.A01     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.IInterface r7 = r6.A04()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.Cyp r7 = (X.C26389Cyp) r7     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.BiF r1 = new X.BiF     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r1.<init>()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r1.A00 = r0     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            java.lang.String r0 = r7.A01     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r6.writeInterfaceToken(r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r6.writeStrongBinder(r1)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r6.writeString(r5)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r6.writeString(r4)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r6.writeByteArray(r3)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r1 = 12
        L_0x0059:
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.IBinder r0 = r7.A00     // Catch:{ all -> 0x01be }
            X.AnonymousClass000.A18(r0, r6, r4, r1)     // Catch:{ all -> 0x01be }
            goto L_0x01b2
        L_0x0064:
            boolean r0 = r2 instanceof X.C23437Bh2     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            if (r0 == 0) goto L_0x0090
            r0 = r2
            X.Bh2 r0 = (X.C23437Bh2) r0     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.CtR r6 = (X.C26157CtR) r6     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.EBz r1 = r0.A00     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.IInterface r3 = r6.A04()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.Cyo r3 = (X.C26388Cyo) r3     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            java.lang.String r0 = "com.google.android.gms.safetynet.internal.ISafetyNetService"
            r6.writeInterfaceToken(r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            if (r1 != 0) goto L_0x0081
            r1 = 0
        L_0x0081:
            r6.writeStrongBinder(r1)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r1 = 5
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.IBinder r0 = r3.A00     // Catch:{ all -> 0x01be }
            X.AnonymousClass000.A18(r0, r6, r4, r1)     // Catch:{ all -> 0x01be }
            goto L_0x01b2
        L_0x0090:
            boolean r0 = r2 instanceof X.C23381Bg8     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            if (r0 == 0) goto L_0x00e5
            r3 = r2
            X.Bg8 r3 = (X.C23381Bg8) r3     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.BZu r6 = (X.C23018BZu) r6     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.E2E r1 = r3.A00     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            java.lang.String r0 = "LocationListener"
            X.CYG r4 = X.C25934Coz.A00(r1, r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.Bg1 r7 = new X.Bg1     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r7.<init>(r3)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.CSa r1 = r6.A00     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.E25 r0 = r1.A00     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.DJs r0 = (X.C26937DJs) r0     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.BZu r3 = r0.A00     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r3.A06()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            java.lang.String r0 = "Invalid null listener key"
            X.C18210vx.A02(r4, r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            java.util.Map r1 = r1.A01     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            monitor-enter(r1)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            java.lang.Object r5 = r1.remove(r4)     // Catch:{ all -> 0x00e1 }
            X.Bg7 r5 = (X.C23380Bg7) r5     // Catch:{ all -> 0x00e1 }
            if (r5 == 0) goto L_0x00df
            monitor-enter(r5)     // Catch:{ all -> 0x00e1 }
            X.CWD r0 = r5.A00     // Catch:{ all -> 0x00ca }
            r4 = 0
            r0.A02 = r4     // Catch:{ all -> 0x00ca }
            r0.A01 = r4     // Catch:{ all -> 0x00ca }
            goto L_0x00cd
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00e1 }
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x00cd:
            monitor-exit(r5)     // Catch:{ all -> 0x00e1 }
            android.os.IInterface r0 = r3.A04()     // Catch:{ all -> 0x00e1 }
            X.ECI r0 = (X.ECI) r0     // Catch:{ all -> 0x00e1 }
            r9 = 2
            X.Bb6 r3 = new X.Bb6     // Catch:{ all -> 0x00e1 }
            r8 = r4
            r6 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00e1 }
            r0.CTj(r3)     // Catch:{ all -> 0x00e1 }
        L_0x00df:
            monitor-exit(r1)     // Catch:{ all -> 0x00e1 }
            return
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e1 }
            goto L_0x01c5
        L_0x00e5:
            boolean r0 = r2 instanceof X.C23382Bg9     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            if (r0 == 0) goto L_0x0166
            r0 = r2
            X.Bg9 r0 = (X.C23382Bg9) r0     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.BZu r6 = (X.C23018BZu) r6     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.Bg1 r5 = new X.Bg1     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r5.<init>(r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            com.google.android.gms.location.LocationRequest r8 = r0.A01     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.E2E r3 = r0.A00     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            boolean r1 = X.AnonymousClass000.A1W(r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            java.lang.String r0 = "Can't create handler inside thread that has not called Looper.prepare()"
            X.C18210vx.A08(r1, r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            java.lang.String r0 = "LocationListener"
            X.CWD r7 = X.C25934Coz.A01(r1, r3, r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.CSa r4 = r6.A00     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            monitor-enter(r4)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.E25 r0 = r4.A00     // Catch:{ all -> 0x0163 }
            X.DJs r0 = (X.C26937DJs) r0     // Catch:{ all -> 0x0163 }
            X.BZu r6 = r0.A00     // Catch:{ all -> 0x0163 }
            r6.A06()     // Catch:{ all -> 0x0163 }
            X.CYG r0 = r7.A01     // Catch:{ all -> 0x0163 }
            r9 = 0
            if (r0 == 0) goto L_0x0161
            java.util.Map r1 = r4.A01     // Catch:{ all -> 0x0163 }
            monitor-enter(r1)     // Catch:{ all -> 0x0163 }
            java.lang.Object r3 = r1.get(r0)     // Catch:{ all -> 0x0134 }
            X.Bg7 r3 = (X.C23380Bg7) r3     // Catch:{ all -> 0x0134 }
            if (r3 != 0) goto L_0x012f
            X.Bg7 r3 = new X.Bg7     // Catch:{ all -> 0x0134 }
            r3.<init>(r7)     // Catch:{ all -> 0x0134 }
        L_0x012f:
            r1.put(r0, r3)     // Catch:{ all -> 0x0134 }
            monitor-exit(r1)     // Catch:{ all -> 0x0134 }
            goto L_0x0137
        L_0x0134:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0134 }
            throw r0     // Catch:{ all -> 0x0163 }
        L_0x0137:
            android.os.IInterface r1 = r6.A04()     // Catch:{ all -> 0x0163 }
            X.ECI r1 = (X.ECI) r1     // Catch:{ all -> 0x0163 }
            java.util.List r12 = X.C23168BcO.A0B     // Catch:{ all -> 0x0163 }
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = 0
            X.BcO r7 = new X.BcO     // Catch:{ all -> 0x0163 }
            r11 = r9
            r17 = r15
            r18 = r15
            r19 = r15
            r10 = r9
            r16 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0163 }
            r14 = 1
            X.Bb6 r0 = new X.Bb6     // Catch:{ all -> 0x0163 }
            r8 = r0
            r10 = r3
            r12 = r5
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0163 }
            r1.CTj(r0)     // Catch:{ all -> 0x0163 }
        L_0x0161:
            monitor-exit(r4)     // Catch:{ all -> 0x0163 }
            return
        L_0x0163:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0163 }
            goto L_0x01c5
        L_0x0166:
            boolean r0 = r2 instanceof X.BZI     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            if (r0 == 0) goto L_0x01f5
            r4 = r2
            X.BZI r4 = (X.BZI) r4     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.CtR r6 = (X.C26157CtR) r6     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.BfC r8 = new X.BfC     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r8.<init>(r4)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.Bcm r7 = r4.A00     // Catch:{ RuntimeException -> 0x01e0 }
            X.BfA r5 = r7.A08     // Catch:{ RuntimeException -> 0x01e0 }
            int r3 = r5.A04()     // Catch:{ RuntimeException -> 0x01e0 }
            r5.A00 = r3     // Catch:{ RuntimeException -> 0x01e0 }
            byte[] r1 = new byte[r3]     // Catch:{ RuntimeException -> 0x01e0 }
            X.Csw r0 = new X.Csw     // Catch:{ IOException -> 0x01d8 }
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x01d8 }
            r5.A03(r0)     // Catch:{ IOException -> 0x01d8 }
            java.nio.ByteBuffer r3 = r0.A02     // Catch:{ IOException -> 0x01d8 }
            int r0 = r3.remaining()     // Catch:{ IOException -> 0x01d8 }
            if (r0 != 0) goto L_0x01c6
            r7.A01 = r1     // Catch:{ RuntimeException -> 0x01e0 }
            android.os.IInterface r1 = r6.A04()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.EBn r1 = (X.C28633EBn) r1     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.Cz1 r1 = (X.C26401Cz1) r1     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            java.lang.String r0 = "com.google.android.gms.clearcut.internal.IClearcutLoggerService"
            X.BE9.A15(r8, r4, r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r0 = 0
            r3 = 1
            r4.writeInt(r3)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r7.writeToParcel(r4, r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.IBinder r1 = r1.A00     // Catch:{ all -> 0x01b9 }
            r0 = 0
            r1.transact(r3, r4, r0, r3)     // Catch:{ all -> 0x01b9 }
            goto L_0x01b5
        L_0x01b2:
            r6.recycle()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
        L_0x01b5:
            r4.recycle()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            return
        L_0x01b9:
            r0 = move-exception
            r4.recycle()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            goto L_0x01c5
        L_0x01be:
            r0 = move-exception
            r6.recycle()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r4.recycle()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
        L_0x01c5:
            throw r0     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
        L_0x01c6:
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()     // Catch:{ IOException -> 0x01d8 }
            int r0 = r3.remaining()     // Catch:{ IOException -> 0x01d8 }
            X.AnonymousClass000.A1L(r1, r0)     // Catch:{ IOException -> 0x01d8 }
            java.lang.String r0 = "Did not write as much data as expected, %s bytes remaining."
            java.lang.IllegalStateException r0 = X.BE8.A0Y(r0, r1)     // Catch:{ IOException -> 0x01d8 }
            throw r0     // Catch:{ IOException -> 0x01d8 }
        L_0x01d8:
            r1 = move-exception
            java.lang.String r0 = "Serializing to a byte array threw an IOException (should never happen)."
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r1)     // Catch:{ RuntimeException -> 0x01e0 }
            throw r0     // Catch:{ RuntimeException -> 0x01e0 }
        L_0x01e0:
            r3 = move-exception
            java.lang.String r1 = "ClearcutLoggerApiImpl"
            java.lang.String r0 = "derived ClearcutLogger.MessageProducer "
            android.util.Log.e(r1, r0, r3)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r3 = 10
            java.lang.String r1 = "MessageProducer"
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r0.<init>(r3, r1)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r4.CIq(r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            return
        L_0x01f5:
            boolean r0 = r2 instanceof X.BYO     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            if (r0 == 0) goto L_0x021a
            r0 = r2
            X.BYO r0 = (X.BYO) r0     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.BZt r6 = (X.C23017BZt) r6     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.IInterface r5 = r6.A04()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.Cyr r5 = (X.C26391Cyr) r5     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.BYM r3 = new X.BYM     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r3.<init>(r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = r6.A00     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            java.lang.String r0 = r5.A00     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.BE9.A15(r3, r4, r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.C26079Cru.A01(r4, r1)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x023a
        L_0x021a:
            r0 = r2
            X.BYN r0 = (X.BYN) r0     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.BZt r6 = (X.C23017BZt) r6     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.IInterface r5 = r6.A04()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.Cyr r5 = (X.C26391Cyr) r5     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.BYL r3 = new X.BYL     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r3.<init>(r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = r6.A00     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            java.lang.String r0 = r5.A00     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.BE9.A15(r3, r4, r0)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            X.C26079Cru.A01(r4, r1)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            r0 = 102(0x66, float:1.43E-43)
        L_0x023a:
            r5.A00(r0, r4)     // Catch:{ DeadObjectException -> 0x024f, RemoteException -> 0x023e }
            return
        L_0x023e:
            r0 = move-exception
            java.lang.String r4 = r0.getLocalizedMessage()
            r3 = 0
            r1 = 8
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r3, r3, r4, r1)
            r2.CIq(r0)
            return
        L_0x024f:
            r5 = move-exception
            java.lang.String r4 = r5.getLocalizedMessage()
            r3 = 0
            r1 = 8
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r3, r3, r4, r1)
            r2.CIq(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BZL.A08(X.E1i):void");
    }

    public final void CIq(Status status) {
        C18210vx.A07(!C108975cc.A1A(status.A00), "Failed result must not be success");
        A06(A03(status));
    }

    public /* bridge */ /* synthetic */ void CKS(Object obj) {
        A06((E5A) obj);
    }
}
