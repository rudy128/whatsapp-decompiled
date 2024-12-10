package X;

import android.content.SharedPreferences;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1jg  reason: invalid class name and case insensitive filesystem */
public final class C33971jg implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final C18010vc A00;
    public final List A01;
    public final C18100vl A02;
    public final AnonymousClass1G1 A03;
    public final C18100vl A04 = new C18110vm(new C71023Dm(this, 43));

    public C33971jg(C18010vc r4) {
        C18070vi.A0d(r4, 1);
        this.A00 = r4;
        C18110vm r0 = new C18110vm(new C71023Dm(this, 44));
        this.A02 = r0;
        this.A03 = new C34081jt((AnonymousClass1OB) null, (AnonymousClass1G1) r0.getValue());
        this.A01 = new ArrayList();
    }

    public final String A01(AnonymousClass1ED r4) {
        C18070vi.A0d(r4, 0);
        int i = r4.A00;
        if (i > 0) {
            return A00(this).getString(String.valueOf(i), (String) null);
        }
        return null;
    }

    public final void A03(List list) {
        C18070vi.A0d(list, 0);
        SharedPreferences.Editor edit = A00(this).edit();
        C18070vi.A0X(edit);
        int[] A1B = C29431cG.A1B(list);
        ByteBuffer allocate = ByteBuffer.allocate(A1B.length * 4);
        allocate.asIntBuffer().put(A1B);
        AnonymousClass2UR.A00(edit, "interop_reach_enabled", allocate.array());
        edit.apply();
    }

    public static final SharedPreferences A00(C33971jg r0) {
        Object value = r0.A04.getValue();
        C18070vi.A0X(value);
        return (SharedPreferences) value;
    }

    public final void A02(List list) {
        if (list != null) {
            SharedPreferences.Editor edit = A00(this).edit();
            ArrayList arrayList = new ArrayList(C29351c6.A0C(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C89514ca r1 = (C89514ca) it.next();
                arrayList.add(new AnonymousClass1D6(String.valueOf(r1.A00), r1.A03));
            }
            Map A0D = AnonymousClass1D7.A0D(arrayList);
            edit.putStringSet("optedInIntegratorNames", C29431cG.A12(A0D.values()));
            for (Map.Entry entry : A0D.entrySet()) {
                edit.putString((String) entry.getKey(), (String) entry.getValue());
            }
            edit.apply();
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (C18070vi.A18(str, "unified_inbox_option")) {
            ((AnonymousClass1G4) this.A02.getValue()).setValue(Integer.valueOf(A00(this).getInt("unified_inbox_option", 0)));
        }
    }
}
