package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ABY implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        C170328pg r1 = (C170328pg) C170328pg.CREATOR.createFromParcel(parcel);
        C170388pm r7 = (C170388pm) C170388pm.CREATOR.createFromParcel(parcel);
        C170348pi r3 = (C170348pi) C170348pi.CREATOR.createFromParcel(parcel);
        C170408po r9 = (C170408po) C170408po.CREATOR.createFromParcel(parcel);
        C170378pl r6 = (C170378pl) C170378pl.CREATOR.createFromParcel(parcel);
        C170358pj r4 = (C170358pj) C170358pj.CREATOR.createFromParcel(parcel);
        C170368pk r5 = (C170368pk) C170368pk.CREATOR.createFromParcel(parcel);
        return new AEV(r1, (C170338ph) C170338ph.CREATOR.createFromParcel(parcel), r3, r4, r5, r6, r7, (C170398pn) C170398pn.CREATOR.createFromParcel(parcel), r9, (C170418pp) C170418pp.CREATOR.createFromParcel(parcel), (C170428pq) C170428pq.CREATOR.createFromParcel(parcel), C72473Md.A1R(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEV[i];
    }
}
