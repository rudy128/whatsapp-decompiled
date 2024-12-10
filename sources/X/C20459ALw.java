package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Iterator;

/* renamed from: X.ALw  reason: case insensitive filesystem */
public final class C20459ALw implements C22534BBr {
    public final /* synthetic */ A8T A00;
    public final /* synthetic */ C22534BBr A01;
    public final /* synthetic */ String A02;

    public C20459ALw(A8T a8t, C22534BBr bBr, String str) {
        this.A01 = bBr;
        this.A00 = a8t;
        this.A02 = str;
    }

    public void BEm(RandomAccessFile randomAccessFile) {
        Log.i("AccountSwitchingFileManager/removeAndSwitchAccount/checkpointOps");
        this.A01.BEm(randomAccessFile);
    }

    public void CBz() {
        Log.i("AccountSwitchingFileManager/removeAndSwitchAccount/postCheckpointOps");
        this.A01.CBz();
        A8T a8t = this.A00;
        String str = this.A02;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccountSwitchingFileManager/deleteAccount/");
        C17890vO.A1A(A10, C60322np.A01(str));
        C18100vl r1 = a8t.A0A;
        if (AnonymousClass8BW.A1V(r1)) {
            File A0U = AnonymousClass8BX.A0U(str, r1);
            if (A0U.exists()) {
                Iterator A0s = AnonymousClass8BW.A0s(a8t.A09);
                while (A0s.hasNext()) {
                    String A0v = C17880vN.A0v(A0s);
                    String absolutePath = A0U.getAbsolutePath();
                    C18070vi.A0X(absolutePath);
                    boolean A06 = A8T.A06(absolutePath, A0v);
                    StringBuilder A102 = AnonymousClass000.A10();
                    C17900vP.A0N(A0U, "AccountSwitchingFileManager/deleteAccount/delete ", A102);
                    A102.append('/');
                    A102.append(A0v);
                    C17900vP.A0n(" directory: ", A102, A06);
                }
                A0U.delete();
                return;
            }
            AnonymousClass8BX.A16(a8t, "AccountSwitchingFileManager/deleteAccount/stagingDirLogString/", AnonymousClass000.A10());
            throw AnonymousClass8BY.A0R(str);
        }
        throw AnonymousClass000.A0n("Staging Directory don't exist");
    }

    public void CC9() {
        Log.i("AccountSwitchingFileManager/removeAndSwitchAccount/preCheckpointOps");
        this.A01.CC9();
    }
}
