package X;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: X.BFg  reason: case insensitive filesystem */
public abstract class C22600BFg extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        CWD cwd;
        E5B die;
        if (i <= 16777215) {
            BE7.A16(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof C23377Bg4) {
            C23377Bg4 bg4 = (C23377Bg4) this;
            if (i != 1) {
                return false;
            }
            bg4.A00.CKS(BEA.A0M(parcel, C23209Bd4.CREATOR));
            bg4.A00 = null;
            return true;
        } else if (this instanceof C23380Bg7) {
            C23380Bg7 bg7 = (C23380Bg7) this;
            if (i != 1) {
                return false;
            }
            Location location = (Location) BEA.A0M(parcel, Location.CREATOR);
            synchronized (bg7) {
                bg7.A00.A00(new DIG(location));
            }
            return true;
        } else if (this instanceof C23379Bg6) {
            C23379Bg6 bg6 = (C23379Bg6) this;
            if (i == 1) {
                cwd = bg6.A00;
                die = new DIE((LocationResult) BEA.A0M(parcel, LocationResult.CREATOR));
            } else if (i != 2) {
                return false;
            } else {
                cwd = bg6.A00;
                die = new DIF((LocationAvailability) BEA.A0M(parcel, LocationAvailability.CREATOR));
            }
            cwd.A00(die);
            return true;
        } else {
            C23378Bg5 bg5 = (C23378Bg5) this;
            if (i == 1) {
                bg5.CTJ((C23208Bd3) BEA.A0M(parcel, C23208Bd3.CREATOR));
                return true;
            } else if (i != 2) {
                return false;
            } else {
                bg5.zzc();
                return true;
            }
        }
    }
}
