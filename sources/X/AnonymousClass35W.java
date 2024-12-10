package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.35W  reason: invalid class name */
public class AnonymousClass35W implements C23691Hg {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public AnonymousClass35W(Collection collection, int i, boolean z) {
        this.A00 = i;
        if (2 - i != 0) {
            this.A01 = collection;
            this.A02 = z;
            return;
        }
        this.A02 = z;
        this.A01 = collection;
    }

    public final void CGE(Object obj) {
        switch (this.A00) {
            case 0:
                ((BDF) obj).BnO((Bitmap) this.A01, this.A02);
                return;
            case 1:
                UserJid userJid = (UserJid) this.A01;
                boolean z = this.A02;
                AnonymousClass4LR r7 = (AnonymousClass4LR) obj;
                C18070vi.A0d(r7, 2);
                AnonymousClass4aY r3 = r7.A00;
                if (C18020vd.A05(C18040vf.A02, r3.A3F, 5868)) {
                    AnonymousClass4aY.A1X(r3, userJid, true, z);
                    return;
                }
                return;
            case 2:
                AnonymousClass1M7 r72 = (AnonymousClass1M7) obj;
                r72.Bq5((Collection) this.A01, this.A02);
                return;
            case 3:
                boolean z2 = this.A02;
                C28741ap r73 = (C28741ap) obj;
                C18070vi.A0d(r73, 2);
                r73.BoG((AnonymousClass1BI) this.A01, z2);
                return;
            case 4:
                ((C25231Nk) obj).BqH((AnonymousClass1BI) this.A01, this.A02);
                return;
            case 5:
                ((AnonymousClass1WR) obj).BzA((C29681ch) this.A01, this.A02);
                return;
            case 6:
                Collection collection = (Collection) this.A01;
                boolean z3 = this.A02;
                C26841Tr r74 = (C26841Tr) obj;
                C18070vi.A0i(collection, r74);
                C26811To r1 = r74.A00;
                r1.A0R(r1.A0F(collection, z3));
                return;
            case 7:
                ((C26701Td) obj).BqZ((C59312m6) this.A01, this.A02);
                return;
            case 8:
                boolean z4 = this.A02;
                C134226qF r75 = (C134226qF) obj;
                C18070vi.A0d(r75, 2);
                r75.A02((Collection) this.A01, z4);
                return;
            default:
                boolean z5 = this.A02;
                C134226qF r76 = (C134226qF) obj;
                C18070vi.A0d(r76, 2);
                r76.A03((Collection) this.A01, z5);
                return;
        }
    }

    public AnonymousClass35W(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }
}
