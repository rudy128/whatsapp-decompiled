package X;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.zzw;

public final /* synthetic */ class AJL implements OnSuccessListener {
    public final /* synthetic */ C22351B4e A00;
    public final /* synthetic */ C183779Zo A01;
    public final /* synthetic */ C57342iv A02;
    public final /* synthetic */ byte[] A03;

    public final void onSuccess(Object obj) {
        C183779Zo r3 = this.A01;
        byte[] bArr = this.A03;
        C22351B4e b4e = this.A00;
        C57342iv r5 = this.A02;
        Boolean bool = (Boolean) obj;
        r3.A00 = bool.booleanValue();
        C17900vP.A0Y(bool, "BackupTokenUtils/setBlockStoreBytes/isE2EEAvailable ", AnonymousClass000.A10());
        r3.A01 = bArr;
        C23038BaF baF = new C23038BaF(bArr, r3.A00);
        BZ6 bz6 = (BZ6) b4e;
        C25069CWc A002 = C25558Chw.A00();
        A002.A03 = new C23191Bcl[]{AnonymousClass9UG.A03, AnonymousClass9UG.A05};
        A002.A01 = new DIV(baF, bz6);
        A002.A00 = 1645;
        A002.A02 = false;
        zzw A022 = C26126Cso.A02(bz6, A002.A00(), 1);
        A022.addOnSuccessListener(new C65442wT(r5, bool));
        A022.addOnFailureListener(new AJF(r5, bool, 0));
    }

    public /* synthetic */ AJL(C22351B4e b4e, C183779Zo r2, C57342iv r3, byte[] bArr) {
        this.A01 = r2;
        this.A03 = bArr;
        this.A00 = b4e;
        this.A02 = r3;
    }
}
