package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class BFY extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [X.E1k, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v23, types: [X.BYy, X.Cso] */
    /* JADX WARNING: type inference failed for: r0v27, types: [java.lang.Object, X.E5G] */
    /* JADX WARNING: type inference failed for: r0v33, types: [java.lang.Object, X.E5G] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Status status;
        BasePendingResult basePendingResult;
        BasePendingResult A03;
        BasePendingResult A032;
        Status status2;
        Parcelable A0M;
        TaskCompletionSource taskCompletionSource;
        if (i <= 16777215) {
            BE7.A16(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof C23244Bdu) {
            C23244Bdu bdu = (C23244Bdu) this;
            if (i != 1) {
                return false;
            }
            status2 = (Status) BEA.A0M(parcel, Status.CREATOR);
            A0M = BEA.A0M(parcel, PendingIntent.CREATOR);
            C26079Cru.A00(parcel);
            taskCompletionSource = bdu.A00;
        } else if (this instanceof C23243Bdt) {
            C23243Bdt bdt = (C23243Bdt) this;
            if (i != 1) {
                return false;
            }
            status2 = (Status) BEA.A0M(parcel, Status.CREATOR);
            A0M = BEA.A0M(parcel, PendingIntent.CREATOR);
            C26079Cru.A00(parcel);
            taskCompletionSource = bdt.A00;
        } else if (this instanceof C23242Bds) {
            C23242Bds bds = (C23242Bds) this;
            if (i != 1) {
                return false;
            }
            status2 = (Status) BEA.A0M(parcel, Status.CREATOR);
            A0M = BEA.A0M(parcel, C23028Ba4.CREATOR);
            C26079Cru.A00(parcel);
            taskCompletionSource = bds.A00;
        } else if (this instanceof C23241Bdr) {
            C23241Bdr bdr = (C23241Bdr) this;
            if (i != 1) {
                return false;
            }
            status2 = (Status) BEA.A0M(parcel, Status.CREATOR);
            A0M = BEA.A0M(parcel, C23113BbS.CREATOR);
            C26079Cru.A00(parcel);
            taskCompletionSource = bdr.A00;
        } else if (this instanceof C23245Bdv) {
            C23245Bdv bdv = (C23245Bdv) this;
            if (i == 1) {
                C23245Bdv.A00(bdv);
                Context context = bdv.A00;
                C26033Cqt A00 = C26033Cqt.A00(context);
                GoogleSignInAccount A01 = A00.A01();
                GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.A0C;
                if (A01 != null) {
                    googleSignInOptions = A00.A02();
                }
                C18210vx.A00(googleSignInOptions);
                C24924CPx cPx = CIH.A03;
                ? cso = new C26126Cso(context, googleSignInOptions, cPx, new C25540Chd(Looper.getMainLooper(), new Object()));
                C25260Cbz cbz = cso.A05;
                Context context2 = cso.A01;
                boolean A1T = AnonymousClass000.A1T(C22998BYy.A00(cso), 3);
                C25122CYv cYv = C25398Cez.A00;
                if (A01 != null) {
                    cYv.A00("Revoking access");
                    String A033 = C26033Cqt.A00(context2).A03("refreshToken");
                    C25398Cez.A00(context2);
                    if (A1T) {
                        C25122CYv cYv2 = DTX.A02;
                        if (A033 == null) {
                            Status status3 = new Status(4, (String) null);
                            C18210vx.A07(!C108975cc.A1A(status3.A00), "Status code must not be SUCCESS");
                            A032 = new BZK(status3);
                            A032.A06(status3);
                        } else {
                            DTX dtx = new DTX(A033);
                            new Thread(dtx).start();
                            A032 = dtx.A00;
                        }
                    } else {
                        A032 = cbz.A03(new BZL(cPx, cbz));
                    }
                    C25399Cf0.A00(A032, new Object());
                    return true;
                }
                cYv.A00("Signing out");
                C25398Cez.A00(context2);
                if (A1T) {
                    Status status4 = Status.A08;
                    C18210vx.A02(status4, "Result must not be null");
                    A03 = new BasePendingResult(cbz);
                    A03.A06(status4);
                } else {
                    A03 = cbz.A03(new BZL(cPx, cbz));
                }
                C25399Cf0.A00(A03, new Object());
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C23245Bdv.A00(bdv);
                C25666Cjw.A00(bdv.A00).A01();
                return true;
            }
        } else {
            C23240Bdq bdq = (C23240Bdq) this;
            switch (i) {
                case 101:
                    BEA.A0M(parcel, GoogleSignInAccount.CREATOR);
                    BEA.A0M(parcel, Status.CREATOR);
                    C26079Cru.A00(parcel);
                    throw C17880vN.A0y();
                case 102:
                    status = (Status) BEA.A0M(parcel, Status.CREATOR);
                    C26079Cru.A00(parcel);
                    if (bdq instanceof BYL) {
                        basePendingResult = ((BYL) bdq).A00;
                        break;
                    } else {
                        throw C17880vN.A0y();
                    }
                case 103:
                    status = (Status) BEA.A0M(parcel, Status.CREATOR);
                    C26079Cru.A00(parcel);
                    if (bdq instanceof BYM) {
                        basePendingResult = ((BYM) bdq).A00;
                        break;
                    } else {
                        throw C17880vN.A0y();
                    }
                default:
                    return false;
            }
            basePendingResult.A06(status);
            parcel2.writeNoException();
            return true;
        }
        C24601CAx.A00(status2, taskCompletionSource, A0M);
        return true;
    }
}
