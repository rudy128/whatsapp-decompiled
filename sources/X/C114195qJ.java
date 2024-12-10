package X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.5qJ  reason: invalid class name and case insensitive filesystem */
public class C114195qJ extends AnonymousClass6US {
    public final String[] A00;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.BA8] */
    public static C133646pF A00(Uri uri, ArrayList arrayList, Collection collection) {
        arrayList.add(new C114185qI(collection));
        arrayList.add(new C114195qJ(new String[]{uri.getHost()}));
        AnonymousClass6US A002 = AnonymousClass6VX.A00(arrayList);
        C18070vi.A0X(A002);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(A002);
        return new C133646pF(new Object(), new AnonymousClass6VW(), arrayList2, arrayList3);
    }

    public C114195qJ(String[] strArr) {
        this.A00 = strArr;
    }
}
