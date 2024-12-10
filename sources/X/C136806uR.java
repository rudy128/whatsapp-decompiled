package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.whatsapp.bridge.wfal.WfalManager;
import java.util.List;

/* renamed from: X.6uR  reason: invalid class name and case insensitive filesystem */
public final class C136806uR {
    public final WfalManager A00;
    public final C24641Lc A01;
    public final C35511mM A02;
    public final C30141dS A03;
    public final AnonymousClass00H A04;

    public final boolean A03(AnonymousClass6RU r4) {
        C18070vi.A0d(r4, 0);
        if (r4 == AnonymousClass6RU.CONTACT_PICKER_NON_CROSSPOST_ELIGIBLE_USAGE) {
            return false;
        }
        if (WfalManager.A00(this.A00, false) || (this.A03.A00() && this.A02.A06(AnonymousClass00R.A0R))) {
            return true;
        }
        return false;
    }

    public final AnonymousClass77K A00(Bundle bundle) {
        AnonymousClass77K A002 = AnonymousClass727.A00(bundle, this.A04);
        C17960vV.A07(A002);
        C18070vi.A0X(A002);
        if (A002.A00 != 0) {
            return A002;
        }
        C18030ve r2 = this.A01.A01;
        C18040vf r1 = C18040vf.A01;
        if (!C18020vd.A05(r1, r2, 7436) || C18020vd.A05(r1, r2, 10229)) {
            return A002;
        }
        return new AnonymousClass77K(A002.A01, AnonymousClass000.A13(), 2, A002.A05, A002.A06, false, false);
    }

    public final String A01(Context context, List list) {
        String string;
        if (C18020vd.A05(C18040vf.A01, this.A01.A01, 10229)) {
            Resources resources = context.getResources();
            int size = list.size();
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a, list.size());
            String quantityString = resources.getQuantityString(2131755407, size, A1a);
            C18070vi.A0X(quantityString);
            return quantityString;
        }
        boolean isEmpty = list.isEmpty();
        Resources resources2 = context.getResources();
        if (isEmpty) {
            string = resources2.getString(2131896320);
        } else {
            Object[] A1a2 = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a2, list.size());
            string = resources2.getString(2131896321, A1a2);
        }
        C18070vi.A0b(string);
        return string;
    }

    public final String A02(Context context, List list) {
        String string;
        if (C18020vd.A05(C18040vf.A01, this.A01.A01, 10229)) {
            Resources resources = context.getResources();
            int size = list.size();
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a, list.size());
            String quantityString = resources.getQuantityString(2131755408, size, A1a);
            C18070vi.A0X(quantityString);
            return quantityString;
        }
        boolean isEmpty = list.isEmpty();
        Resources resources2 = context.getResources();
        if (isEmpty) {
            string = resources2.getString(2131896316);
        } else {
            Object[] A1a2 = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a2, list.size());
            string = resources2.getString(2131896317, A1a2);
        }
        C18070vi.A0b(string);
        return string;
    }

    public C136806uR(WfalManager wfalManager, C24641Lc r2, C35511mM r3, C30141dS r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, wfalManager, r4, r3, r5);
        this.A01 = r2;
        this.A00 = wfalManager;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
    }
}
