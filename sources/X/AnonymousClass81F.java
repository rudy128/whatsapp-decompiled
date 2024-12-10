package X;

import android.content.Intent;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.81F  reason: invalid class name */
public final class AnonymousClass81F extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ MyStatusesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81F(MyStatusesActivity myStatusesActivity) {
        super(1);
        this.this$0 = myStatusesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        int i2;
        Integer num;
        C128696gX r6 = (C128696gX) obj;
        MyStatusesActivity myStatusesActivity = this.this$0;
        Log.i("myStatuessActivity/onStatusSharingInfoChanged");
        if (r6 == null) {
            i = 0;
        } else if (r6.A01 != null) {
            List list = myStatusesActivity.A11;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                myStatusesActivity.revokeUriPermission(C108945cZ.A0M(it), 1);
            }
            list.clear();
            Collection collection = r6.A02;
            if (collection == null) {
                collection = C18460wS.A00;
            }
            list.addAll(collection);
            if (myStatusesActivity.A0s) {
                num = AnonymousClass00R.A01;
            } else {
                num = AnonymousClass00R.A0C;
            }
            C139586z5 r0 = myStatusesActivity.A0T;
            if (r0 == null) {
                C18070vi.A11("crossPostingViewModel");
                throw null;
            }
            r0.A02(num);
            Intent intent = r6.A01;
            if (intent != null) {
                myStatusesActivity.startActivityForResult(intent, 35);
            }
            return C27621Wu.A00;
        } else {
            i = r6.A00;
        }
        int i3 = 5;
        if (i != 0) {
            i3 = 3;
            if (i != 1) {
                i3 = 2;
            }
        }
        C56092gt r02 = myStatusesActivity.A4c().A00;
        if (r02 != null) {
            r02.A01 = i3;
        }
        AnonymousClass1KB r1 = myStatusesActivity.A05;
        if (i != 0) {
            if (i != 1) {
                i2 = 2131896129;
            } else {
                i2 = 2131896128;
            }
            r1.A06(i2, 1);
        } else {
            r1.A08(2131896127, 1);
        }
        return C27621Wu.A00;
    }
}
