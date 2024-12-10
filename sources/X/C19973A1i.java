package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.A1i  reason: case insensitive filesystem */
public final class C19973A1i {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass11S A02;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.ADD, java.lang.Object] */
    public static final boolean A00(C19973A1i a1i, AEW aew, String str, boolean z) {
        if (!z) {
            return false;
        }
        AnonymousClass00H r1 = a1i.A01;
        if ((((C192179nw) r1.get()).A00() & 128) <= 0 || aew == null || !aew.A0Y) {
            return false;
        }
        if ((((C192179nw) r1.get()).A00() & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) <= 0) {
            return true;
        }
        List list = aew.A0S;
        ? obj = new Object();
        obj.A00 = str;
        return list.contains(obj);
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.ADD, java.lang.Object] */
    public final boolean A03(AEW aew, UserJid userJid) {
        if (!this.A02.A0O(userJid)) {
            AnonymousClass00H r1 = this.A01;
            if ((((C192179nw) r1.get()).A00() & 128) > 0 && aew != null && aew.A0Y && (((C192179nw) r1.get()).A00() & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) > 0) {
                List list = aew.A0S;
                ? obj = new Object();
                obj.A00 = "collections";
                if (!list.contains(obj)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean A01(C179409Hv r5, AEW aew) {
        C18030ve r3 = this.A00;
        C18040vf r2 = C18040vf.A02;
        if (A00(this, aew, "variants", C18020vd.A05(r2, r3, 3837))) {
            return true;
        }
        if (!C18020vd.A05(r2, r3, 8798)) {
            return false;
        }
        if ((aew == null || !"smb_meta_catalog".equals(aew.A0E)) && r5 != C179409Hv.SMB_META_CATALOG) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r0 == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.AEW r4) {
        /*
            r3 = this;
            X.0ve r2 = r3.A00
            r0 = 1678(0x68e, float:2.351E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0015
            r0 = 1096(0x448, float:1.536E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            java.lang.String r0 = "search"
            boolean r0 = A00(r3, r4, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19973A1i.A02(X.AEW):boolean");
    }

    public C19973A1i(AnonymousClass11S r1, C18030ve r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
