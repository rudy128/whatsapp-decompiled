package X;

import com.google.android.gms.tasks.OnSuccessListener;
import com.whatsapp.util.Log;

/* renamed from: X.2wT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C65442wT implements OnSuccessListener {
    public final /* synthetic */ C57342iv A00;
    public final /* synthetic */ Boolean A01;

    public final void onSuccess(Object obj) {
        C57342iv r5 = this.A00;
        Boolean bool = this.A01;
        Log.i("BackupTokenUtils/setBlockStoreBytes/bytes stored");
        if (r5 != null) {
            boolean booleanValue = bool.booleanValue();
            Log.i("BackupTokenProtocolHelper/encryptAndSaveToken/onSuccess");
            r5.A01.A04.CGF(new C146837Qu(r5, r5.A00, 6, booleanValue));
        }
    }

    public /* synthetic */ C65442wT(C57342iv r1, Boolean bool) {
        this.A00 = r1;
        this.A01 = bool;
    }
}
