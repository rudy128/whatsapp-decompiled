package X;

import android.net.Uri;
import android.os.Parcelable;
import com.whatsapp.community.NewCommunityActivity;
import com.whatsapp.jid.GroupJid;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4ng  reason: invalid class name and case insensitive filesystem */
public final class C96334ng implements BC1 {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ AnonymousClass4X4 A01;
    public final /* synthetic */ Set A02;
    public final /* synthetic */ Set A03;

    public void C7e(AnonymousClass4OX r29, AnonymousClass1EC r30) {
        AnonymousClass1EB r15;
        String path;
        AnonymousClass1EC r14 = r30;
        C18070vi.A0d(r14, 0);
        AnonymousClass4X4 r1 = this.A01;
        r1.A02 = r14;
        Uri uri = this.A00;
        if (!(uri == null || (path = uri.getPath()) == null)) {
            File file = new File(path);
            if (file.exists()) {
                C27071Up.A01(r1.A05.A0H(r14), r1.A0G, file, (byte[]) null, false);
            }
        }
        AnonymousClass4L1 r7 = r1.A01;
        if (r7 != null) {
            NewCommunityActivity newCommunityActivity = r7.A00;
            newCommunityActivity.A0T.set(r14);
            C40371ub A0c = AnonymousClass3MZ.A0c(newCommunityActivity);
            String str = r14.user;
            C18070vi.A0d(str, 0);
            AnonymousClass00H r2 = A0c.A05;
            A0c.A0D(AnonymousClass3MY.A0j(r2), (Long) null, C72463Mc.A0o(r2), str, 10, 4);
            if (newCommunityActivity.A06.A0P(r14)) {
                C98804rk.A00(newCommunityActivity.A05, r7, r14, 24);
            } else {
                newCommunityActivity.A05.A0K(new C98764rg((Object) r7, 6), 10000);
            }
        }
        Set set = this.A03;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 A0O = C17880vN.A0O(it);
            C36321nh r22 = GroupJid.Companion;
            GroupJid A002 = C36321nh.A00(A0O.A0J);
            if (A002 != null) {
                A13.add(A002);
            }
        }
        List A0t = C29431cG.A0t(A13);
        boolean A1a = AnonymousClass000.A1a(A0t);
        Set set2 = this.A02;
        int size = set2.size() + (A1a ? 1 : 0);
        if (size == 0) {
            AnonymousClass4X4.A00(r1, 0);
            return;
        }
        r1.A0I.set(size);
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            AnonymousClass1E7 A0O2 = C17880vN.A0O(it2);
            Parcelable.Creator creator = AnonymousClass1EB.CREATOR;
            AnonymousClass1BI r152 = A0O2.A0J;
            if (r152 instanceof AnonymousClass1EB) {
                r15 = (AnonymousClass1EB) r152;
            } else {
                r15 = null;
            }
            C17960vV.A07(r15);
            C18070vi.A0X(r15);
            C188679ho r13 = new C188679ho(r14, r15, A0O2.A0K(), (String) null, AnonymousClass000.A13(), A0O2.A04, false, false, true, false, true, false, true, false);
            Map map = r1.A0H;
            C18070vi.A0W(map);
            map.put(r15, A0O2.A0K());
            AnonymousClass11P r11 = r1.A08;
            C18030ve r10 = r1.A0A;
            AnonymousClass190 r9 = r1.A03;
            AnonymousClass11S r72 = r1.A04;
            AnonymousClass1OZ r6 = r1.A0F;
            AnonymousClass126 r4 = r1.A0C;
            new C20988Acg(r9, r72, r1.A06, r11, r1.A09, r10, r4, new C96324nf(r1, A0O2, r15), r13, r6).A00();
        }
        if (!A0t.isEmpty()) {
            Iterator it3 = A0t.iterator();
            while (it3.hasNext()) {
                AnonymousClass1BI A0Q = C17880vN.A0Q(it3);
                AnonymousClass1E7 A0H = r1.A05.A0H(A0Q);
                Map map2 = r1.A0H;
                C18070vi.A0W(map2);
                map2.put(A0Q, A0H.A0K());
            }
            r1.A0E.A00(new C96444nr(r1, 1), r14, A0t, C25511Om.A00);
        }
    }

    public C96334ng(Uri uri, AnonymousClass4X4 r2, Set set, Set set2) {
        this.A01 = r2;
        this.A00 = uri;
        this.A03 = set;
        this.A02 = set2;
    }

    public void C8g() {
        AnonymousClass4L1 r0 = this.A01.A01;
        if (r0 != null) {
            NewCommunityActivity newCommunityActivity = r0.A00;
            AnonymousClass3MZ.A0c(newCommunityActivity).A07();
            newCommunityActivity.CEx();
            NewCommunityActivity.A0c(newCommunityActivity);
        }
    }

    public void onError(int i) {
        AnonymousClass4L1 r0 = this.A01.A01;
        if (r0 != null) {
            NewCommunityActivity newCommunityActivity = r0.A00;
            AnonymousClass3MZ.A0c(newCommunityActivity).A07();
            newCommunityActivity.CEx();
            NewCommunityActivity.A0c(newCommunityActivity);
        }
    }
}
