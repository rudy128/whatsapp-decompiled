package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.jid.Jid;
import com.whatsapp.mentions.MentionableEntry;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Vc  reason: invalid class name and case insensitive filesystem */
public abstract class C123606Vc {
    public static Intent A00(Activity activity, C58432kg r6, MentionableEntry mentionableEntry, AnonymousClass206 r8, File file, List list) {
        Uri fromFile = Uri.fromFile(C108945cZ.A17(file.getAbsolutePath()));
        ArrayList A0s = C108965cb.A0s(fromFile);
        String stringText = mentionableEntry.getStringText();
        AnonymousClass72S r2 = new AnonymousClass72S(fromFile);
        r2.A0P(stringText);
        r6.A01(r2.A0H(), mentionableEntry.getMentions());
        r2.A0S(r2.A0H());
        AnonymousClass73D r3 = new AnonymousClass73D(r2);
        C139416yo r22 = new C139416yo(activity);
        r22.A0I = A0s;
        r22.A01 = 9;
        r22.A0P = true;
        C139416yo.A00(r3, r22);
        if (list.size() == 1) {
            r22.A0D = C22971Dz.A06((Jid) C108955ca.A0p(list));
        } else {
            r22.A0H = C22971Dz.A0B(list);
        }
        if (r8 != null) {
            r22.A05 = r8.A0x;
            r22.A0E = C22971Dz.A06(AnonymousClass25A.A07(r8));
        }
        r22.A02 = 19;
        return r22.A01();
    }
}
