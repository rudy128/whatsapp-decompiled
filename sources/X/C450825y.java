package X;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.SyncResult;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.concurrent.ExecutionException;

/* renamed from: X.25y  reason: invalid class name and case insensitive filesystem */
public final class C450825y extends AbstractThreadedSyncAdapter {
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C450825y(AnonymousClass190 r3, AnonymousClass11S r4, AnonymousClass118 r5, C18030ve r6, AnonymousClass00H r7) {
        super(r5.A00, true);
        C18070vi.A0d(r5, 1);
        C18070vi.A0p(r3, r4, r7);
        C18070vi.A0d(r6, 5);
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = r7;
        this.A02 = r6;
    }

    public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        if (!this.A01.A0N()) {
            C63212sh r3 = new C63212sh(AnonymousClass2R1.A02, AnonymousClass00R.A00);
            r3.A04 = true;
            r3.A05 = true;
            r3.A00 = C62132qq.A0C;
            if (C18020vd.A05(C18040vf.A02, this.A02, 5868)) {
                r3.A03 = true;
            }
            C62592re A022 = r3.A02();
            AnonymousClass2P4 r4 = new AnonymousClass2P4(true);
            A022.A02(r4);
            AnonymousClass1US r32 = (AnonymousClass1US) this.A03.get();
            r32.A0P.execute(new C146497Pi(r32, A022, 21));
            try {
                r4.get();
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                C17960vV.A0B(e);
                Log.e("ContactsSyncAdapter/onPerformSync", e);
                this.A00.A0G("ContactsSyncAdapter/onPerformSync", e.getMessage(), true);
            }
        }
    }
}
