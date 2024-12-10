package X;

import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.List;
import java.util.Map;

/* renamed from: X.79L  reason: invalid class name */
public abstract class AnonymousClass79L implements AdapterView.OnItemClickListener {
    public long A00;
    public final AnonymousClass11P A01;

    public AnonymousClass79L(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public void A00(View view, int i) {
        Map map;
        List list;
        List list2;
        List list3;
        String str;
        Integer num;
        Integer num2;
        UserJid userJid;
        C32741hg r1;
        String str2;
        AnonymousClass6L7 r2 = (AnonymousClass6L7) this;
        if (r2.A00 != 0) {
            MyStatusesActivity myStatusesActivity = (MyStatusesActivity) r2.A01;
            if (myStatusesActivity.A12.isEmpty()) {
                C110235f9 r0 = myStatusesActivity.A0W;
                if (r0 == null) {
                    str2 = "myStatusesAdapter";
                } else {
                    AnonymousClass206 A0k = AnonymousClass3MW.A0k(r0.A00, i);
                    C18070vi.A0d(A0k, 0);
                    AnonymousClass02B r02 = myStatusesActivity.A00;
                    if (r02 != null) {
                        r02.A05();
                    }
                    if (myStatusesActivity.A0M != null) {
                        Intent A0j = AnonymousClass1LU.A0j(myStatusesActivity, A0k.A0I(), false, false, false);
                        AnonymousClass4aU.A00(A0j, A0k.A0v);
                        myStatusesActivity.A01.A0A(myStatusesActivity, A0j);
                        C24661Le r03 = myStatusesActivity.A0J;
                        if (r03 == null) {
                            str2 = "statusStore";
                        } else if (r03.A07() != null) {
                            r1 = myStatusesActivity.A4c();
                            userJid = AnonymousClass1E5.A00;
                            list3 = C18460wS.A00;
                            map = AnonymousClass1D7.A0I();
                            num2 = C17880vN.A0k();
                            num = Integer.valueOf(i);
                            str = null;
                            list2 = list3;
                            list = list3;
                        } else {
                            return;
                        }
                    } else {
                        str2 = "waIntents";
                    }
                }
                C18070vi.A11(str2);
                throw null;
            }
            return;
        }
        C113485nA r4 = (C113485nA) view.getTag();
        if (r4 == null) {
            return;
        }
        if (r4.A04 == AnonymousClass1E5.A00 && r4.A01 == 0) {
            StatusesFragment.A08((StatusesFragment) r2.A01);
            return;
        }
        StatusesFragment statusesFragment = (StatusesFragment) r2.A01;
        statusesFragment.A1k(AnonymousClass1LU.A0j(statusesFragment.A1n(), r4.A04, false, false, false));
        r1 = statusesFragment.A0l;
        userJid = r4.A04;
        C139186yN r04 = statusesFragment.A0k;
        list3 = r04.A02;
        list2 = r04.A03;
        list = r04.A01;
        map = r04.A05;
        str = StatusesFragment.A01(statusesFragment);
        C18070vi.A0d(userJid, 0);
        C18070vi.A0o(list3, list2, list);
        num2 = null;
        num = null;
        r1.A0A(userJid, num2, num, str, list3, list2, list, map);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C18070vi.A0h(adapterView, view);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A00 > 1000) {
            this.A00 = elapsedRealtime;
            A00(view, i);
        }
    }
}
