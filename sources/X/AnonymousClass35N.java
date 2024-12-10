package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.whatsapp.jid.GroupJid;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.35N  reason: invalid class name */
public class AnonymousClass35N implements C23691Hg {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass35N(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void CGE(Object obj) {
        switch (this.A00) {
            case 0:
                C28741ap r4 = (C28741ap) obj;
                C18070vi.A0d(r4, 2);
                r4.BoX((AnonymousClass1BI) this.A01, (Integer) this.A02);
                return;
            case 1:
                C28741ap r42 = (C28741ap) obj;
                C18070vi.A0d(r42, 2);
                r42.BoY((AnonymousClass1BI) this.A01, (C32961i2) this.A02);
                return;
            case 2:
                C28741ap r43 = (C28741ap) obj;
                C18070vi.A0d(r43, 2);
                r43.BoO((AnonymousClass1BI) this.A01, (C32961i2) this.A02);
                return;
            case 3:
                C28741ap r44 = (C28741ap) obj;
                C18070vi.A0d(r44, 2);
                r44.BoF((AnonymousClass1BI) this.A01, (Integer) this.A02);
                return;
            case 4:
                C28741ap r45 = (C28741ap) obj;
                C18070vi.A0d(r45, 2);
                r45.BoP((AnonymousClass1BI) this.A01, (AnonymousClass201) this.A02);
                return;
            case 5:
                C28741ap r46 = (C28741ap) obj;
                C18070vi.A0d(r46, 2);
                r46.BoS((AnonymousClass1BI) this.A01, (Collection) this.A02);
                return;
            case 6:
                ((AnonymousClass1WR) obj).C0d((AnonymousClass206) this.A01, (AnonymousClass206) this.A02);
                return;
            case 7:
                ((AnonymousClass1WR) obj).C0h((AnonymousClass206) this.A01, (AnonymousClass206) this.A02);
                return;
            case 8:
                ((AnonymousClass1WR) obj).ByQ((AnonymousClass206) this.A01, (AnonymousClass206) this.A02);
                return;
            case 9:
                ((AnonymousClass1WR) obj).Bya((Collection) this.A01, (Map) this.A02);
                return;
            case 10:
                C25221Nj r47 = (C25221Nj) obj;
                C18070vi.A0d(r47, 2);
                r47.BvN((AnonymousClass1E9) this.A01);
                return;
            case 11:
                C34201k6 r48 = (C34201k6) obj;
                C18070vi.A0d(r48, 2);
                r48.A09((GroupJid) this.A01, (List) this.A02);
                return;
            case 12:
                C34201k6 r49 = (C34201k6) obj;
                C18070vi.A0d(r49, 2);
                r49.A07((GroupJid) this.A01, (List) this.A02);
                return;
            case 13:
                C34201k6 r410 = (C34201k6) obj;
                C18070vi.A0d(r410, 2);
                r410.A05((GroupJid) this.A01, (GroupJid) this.A02);
                return;
            case 14:
                C34201k6 r411 = (C34201k6) obj;
                C18070vi.A0d(r411, 2);
                r411.A08((GroupJid) this.A01, (List) this.A02);
                return;
            case 15:
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) obj;
                C18070vi.A0d(activityLifecycleCallbacks, 2);
                activityLifecycleCallbacks.onActivitySaveInstanceState((Activity) this.A01, (Bundle) this.A02);
                return;
            case 16:
                ((C32941i0) obj).BoM((AnonymousClass1BI) this.A01, (AnonymousClass205) this.A02);
                return;
            case 17:
                ((C32941i0) obj).BoL((AnonymousClass1BI) this.A01, (AnonymousClass205) this.A02);
                return;
            case 18:
                C32941i0 r412 = (C32941i0) obj;
                r412.BoN((AnonymousClass205) this.A02, (List) this.A01);
                return;
            default:
                C34561kh r413 = (C34561kh) obj;
                C18070vi.A0d(r413, 2);
                r413.C8R((AnonymousClass1FU) this.A01, (C136516tw) this.A02);
                return;
        }
    }
}
