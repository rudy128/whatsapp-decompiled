package X;

import android.content.SharedPreferences;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1UW  reason: invalid class name */
public final class AnonymousClass1UW {
    public final C19830z4 A00;

    public AnonymousClass1UW(C19830z4 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final C166438ct A00() {
        byte[] decode = Base64.decode(((SharedPreferences) this.A00.A00.get()).getString("native_contacts_encryption_secret_key", ""), 2);
        C18070vi.A0b(decode);
        if (decode.length == 0) {
            return null;
        }
        return (C166438ct) C23577Bm6.A07(C166438ct.DEFAULT_INSTANCE, decode);
    }

    public final AnonymousClass8XJ A01() {
        byte[] decode = Base64.decode(((SharedPreferences) this.A00.A00.get()).getString("native_contacts_encryption_secret_key_list", ""), 2);
        C18070vi.A0b(decode);
        if (decode.length == 0) {
            return null;
        }
        return (AnonymousClass8XJ) C23577Bm6.A07(AnonymousClass8XJ.DEFAULT_INSTANCE, decode);
    }

    public final void A02() {
        Log.i("ClientContactMetadataEncryptionKeyStorageclearing out any previous secret");
        C19830z4 r3 = this.A00;
        String encodeToString = Base64.encodeToString(new byte[0], 2);
        AnonymousClass00H r32 = r3.A00;
        ((SharedPreferences) r32.get()).edit().putString("native_contacts_encryption_secret_key", encodeToString).apply();
        ((SharedPreferences) r32.get()).edit().putString("native_contacts_encryption_secret_key_list", Base64.encodeToString(new byte[0], 2)).apply();
    }

    public final void A03(AnonymousClass8XJ r9) {
        EE9<C166438ct> ee9 = r9.clientSecretKey_;
        C18070vi.A0X(ee9);
        ArrayList arrayList = new ArrayList(C29351c6.A0C(ee9, 10));
        for (C166438ct r0 : ee9) {
            long j = r0.keyId_;
            DSQ dsq = r0.clientSecretKeyData_;
            C18070vi.A0X(dsq);
            arrayList.add(new C58972lY(dsq, j));
        }
        List<C58972lY> A0y = C29431cG.A0y(arrayList, new C147027Rn(7));
        if (!A0y.isEmpty()) {
            AnonymousClass8XA r2 = (AnonymousClass8XA) C166438ct.DEFAULT_INSTANCE.A0N();
            r2.A0G(((C58972lY) C29431cG.A0b(A0y)).A00);
            r2.A0H(((C58972lY) C29431cG.A0b(A0y)).A01);
            C23577Bm6 A0C = r2.A0C();
            C18070vi.A0b(A0C);
            C19830z4 r3 = this.A00;
            String encodeToString = Base64.encodeToString(A0C.A0M(), 2);
            AnonymousClass00H r32 = r3.A00;
            ((SharedPreferences) r32.get()).edit().putString("native_contacts_encryption_secret_key", encodeToString).apply();
            C23624Bmt A0N = AnonymousClass8XJ.DEFAULT_INSTANCE.A0N();
            ArrayList arrayList2 = new ArrayList(C29351c6.A0C(A0y, 10));
            for (C58972lY r4 : A0y) {
                AnonymousClass8XA r22 = (AnonymousClass8XA) C166438ct.DEFAULT_INSTANCE.A0N();
                r22.A0G(r4.A00);
                r22.A0H(r4.A01);
                arrayList2.add(r22.A0C());
            }
            A0N.A0E();
            AnonymousClass8XJ r23 = (AnonymousClass8XJ) A0N.A00;
            EE9 ee92 = r23.clientSecretKey_;
            if (!((C27296DbR) ee92).A00) {
                ee92 = C23577Bm6.A09(ee92);
                r23.clientSecretKey_ = ee92;
            }
            DND.A09(arrayList2, ee92);
            ((SharedPreferences) r32.get()).edit().putString("native_contacts_encryption_secret_key_list", Base64.encodeToString(A0N.A0C().A0M(), 2)).apply();
            return;
        }
        A02();
    }
}
