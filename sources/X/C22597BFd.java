package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: X.BFd  reason: case insensitive filesystem */
public abstract class C22597BFd extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C23087Bb2 bb2;
        if (i <= 16777215) {
            BE7.A16(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof C23330BfI) {
            C23330BfI bfI = (C23330BfI) this;
            if (i == 1) {
                C23228Bde bde = new C23228Bde(((C23218BdU) bfI).A01());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(bde.asBinder());
                return true;
            } else if (i != 2) {
                return false;
            } else {
                int i3 = ((C23218BdU) bfI).A00;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            }
        } else if (!(this instanceof C23329BfH)) {
            return false;
        } else {
            C23329BfH bfH = (C23329BfH) this;
            if (i == 1) {
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                Bundle bundle = (Bundle) BEA.A0M(parcel, Bundle.CREATOR);
                int dataAvail = parcel.dataAvail();
                if (dataAvail <= 0) {
                    C18210vx.A02(bfH.A00, "onPostInitComplete can be called only once per call to getRemoteService");
                    bfH.A00.A08(bundle, readStrongBinder, readInt, bfH.A01);
                } else {
                    throw BEB.A0K(dataAvail);
                }
            } else if (i == 2) {
                parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    creator.createFromParcel(parcel);
                }
                int dataAvail2 = parcel.dataAvail();
                if (dataAvail2 <= 0) {
                    Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
                    parcel2.writeNoException();
                    return true;
                }
                throw BEB.A0K(dataAvail2);
            } else if (i != 3) {
                return false;
            } else {
                int readInt2 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                C23082Bax bax = (C23082Bax) BEA.A0M(parcel, C23082Bax.CREATOR);
                int dataAvail3 = parcel.dataAvail();
                if (dataAvail3 <= 0) {
                    C26157CtR ctR = bfH.A00;
                    C18210vx.A02(ctR, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                    C18210vx.A00(bax);
                    ctR.A0Q = bax;
                    if (ctR.A0A()) {
                        C23090Bb5 bb5 = bax.A02;
                        C25942Cp8 A00 = C25942Cp8.A00();
                        if (bb5 == null) {
                            bb2 = null;
                        } else {
                            bb2 = bb5.A01;
                        }
                        synchronized (A00) {
                            if (bb2 == null) {
                                bb2 = C25942Cp8.A02;
                            } else {
                                C23087Bb2 bb22 = A00.A00;
                                if (bb22 != null) {
                                    if (bb22.A00 < bb2.A00) {
                                    }
                                }
                            }
                            A00.A00 = bb2;
                        }
                    }
                    Bundle bundle2 = bax.A01;
                    C18210vx.A02(bfH.A00, "onPostInitComplete can be called only once per call to getRemoteService");
                    bfH.A00.A08(bundle2, readStrongBinder2, readInt2, bfH.A01);
                } else {
                    throw BEB.A0K(dataAvail3);
                }
            }
            bfH.A00 = null;
            parcel2.writeNoException();
            return true;
        }
    }
}
