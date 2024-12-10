package X;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1Ld  reason: invalid class name and case insensitive filesystem */
public final class C24651Ld {
    public final AnonymousClass18K A00;
    public final C18010vc A01;
    public final C24641Lc A02;
    public final C18100vl A03 = new C18110vm(new C71013Dl(this, 11));

    public C24651Ld(AnonymousClass18K r3, C18010vc r4, C24641Lc r5) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r5, 3);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
    }

    public final int A00(String str) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.A03.getValue();
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, 0);
        }
        return 0;
    }

    public void A02(Set set, Set set2, Set set3, Set set4, int i, int i2, int i3, int i4) {
        SharedPreferences.Editor edit;
        Set set5 = set;
        C18070vi.A0d(set5, 1);
        Set set6 = set2;
        C18070vi.A0d(set6, 3);
        Set set7 = set3;
        C18070vi.A0d(set7, 5);
        Set set8 = set4;
        C18070vi.A0d(set8, 7);
        int A002 = A00("num_statuses_received_key");
        Set A012 = A01("contacts_with_statuses_key");
        A012.addAll(set5);
        int A003 = A00("num_statuses_viewed_key");
        Set A013 = A01("contacts_with_statuses_viewed_key");
        A013.addAll(set6);
        int A004 = A00("num_statuses_with_mentions_received_key");
        Set A014 = A01("contacts_with_statuses_with_mentions_key");
        A014.addAll(set7);
        int A005 = A00("num_statuses_viewed_with_mentions_key");
        Set A015 = A01("contacts_with_statuses_with_mentions_viewed_key");
        A015.addAll(set8);
        SharedPreferences sharedPreferences = (SharedPreferences) this.A03.getValue();
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
            edit.putInt("num_statuses_received_key", A002 + i);
            edit.putStringSet("contacts_with_statuses_key", A012);
            edit.putInt("num_statuses_viewed_key", A003 + i2);
            edit.putStringSet("contacts_with_statuses_viewed_key", A013);
            edit.putInt("num_statuses_with_mentions_received_key", A004 + i3);
            edit.putStringSet("contacts_with_statuses_with_mentions_key", A014);
            edit.putInt("num_statuses_viewed_with_mentions_key", A005 + i4);
            edit.putStringSet("contacts_with_statuses_with_mentions_viewed_key", A015);
            edit.apply();
        }
    }

    public final Set A01(String str) {
        Set<String> stringSet;
        SharedPreferences sharedPreferences = (SharedPreferences) this.A03.getValue();
        if (sharedPreferences == null || (stringSet = sharedPreferences.getStringSet(str, new HashSet())) == null) {
            return new HashSet();
        }
        return C29431cG.A11(stringSet);
    }
}
