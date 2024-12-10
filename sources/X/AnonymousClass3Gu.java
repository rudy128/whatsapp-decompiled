package X;

import android.content.Intent;
import android.net.Uri;
import com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.3Gu  reason: invalid class name */
public class AnonymousClass3Gu extends AnonymousClass1JJ implements C22821Di {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3Gu(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            if (r9 == 0) goto L_0x0012
            java.lang.Class<com.whatsapp.updates.ui.UpdatesFragment> r3 = com.whatsapp.updates.ui.UpdatesFragment.class
            java.lang.String r5 = "onStatusSharingInfoChanged(Lcom/whatsapp/status/crossposting/data/StatusSharingInfo;)V"
            java.lang.String r4 = "onStatusSharingInfoChanged"
        L_0x000b:
            r1 = 1
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0012:
            java.lang.Class<X.20O> r3 = X.AnonymousClass20O.class
            java.lang.String r5 = "fromJson(Lorg/json/JSONObject;)Ljava/lang/Object;"
            java.lang.String r4 = "fromJson"
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Gu.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        int i2;
        Integer num;
        if (this.A00 != 0) {
            C128696gX r7 = (C128696gX) obj;
            UpdatesFragment updatesFragment = (UpdatesFragment) this.receiver;
            Log.i("UpdatesFragment/onStatusSharingInfoChanged");
            if (r7 == null) {
                i = 0;
            } else if (r7.A01 != null) {
                List<Uri> list = updatesFragment.A1M;
                for (Uri uri : list) {
                    AnonymousClass118 r0 = updatesFragment.A0D;
                    if (r0 != null) {
                        r0.A00.revokeUriPermission(uri, 1);
                    } else {
                        C18070vi.A11("waContext");
                        throw null;
                    }
                }
                list.clear();
                List list2 = r7.A02;
                if (list2 != null) {
                    list.addAll(list2);
                }
                if (updatesFragment.A1A) {
                    num = AnonymousClass00R.A01;
                } else {
                    num = AnonymousClass00R.A0C;
                }
                CrossPostingUpdatesViewModel crossPostingUpdatesViewModel = updatesFragment.A0K;
                if (crossPostingUpdatesViewModel != null) {
                    int i3 = 2;
                    if (num.intValue() != 1) {
                        i3 = 3;
                    }
                    C56092gt r02 = crossPostingUpdatesViewModel.A02.A00;
                    if (r02 != null) {
                        r02.A00 = i3;
                    }
                }
                Intent intent = r7.A01;
                if (intent != null) {
                    updatesFragment.startActivityForResult(intent, 35);
                }
                return C27621Wu.A00;
            } else {
                i = r7.A00;
            }
            AnonymousClass1KB r1 = (AnonymousClass1KB) updatesFragment.A27().get();
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
        return ((AnonymousClass20O) this.receiver).BLi((JSONObject) obj);
    }
}
